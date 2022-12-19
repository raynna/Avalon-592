package com.rs.cores;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class CoresManager {

	protected static volatile boolean shutdown;
	public static WorldThread worldThread;
	public static Timer fastExecutor;
	public static ScheduledExecutorService slowExecutor;

	public static void init() {
		worldThread = new WorldThread();
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		fastExecutor = new Timer("Fast Executor");
		slowExecutor = availableProcessors >= 6 ? Executors.newScheduledThreadPool(availableProcessors >= 12 ? 4 : 2, new SlowThreadFactory()) : Executors.newSingleThreadScheduledExecutor(new SlowThreadFactory());
		worldThread.start();
	}

	public static void shutdown() {
		fastExecutor.cancel();
		slowExecutor.shutdown();
		shutdown = true;
	}

	private CoresManager() {

	}
}
