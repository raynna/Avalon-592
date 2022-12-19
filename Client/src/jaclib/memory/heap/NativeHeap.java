/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
    long peer;
    private boolean a;
    private int b;

    final synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

    public final NativeHeapBuffer a(int i, boolean bool) {
        if (!a)
            throw new IllegalStateException();
        return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }

    final synchronized native long getBufferAddress(int i);

    final synchronized native void deallocateBuffer(int i);

    final synchronized native int allocateBuffer(int i, boolean bool);

    final synchronized boolean a() {
        return a;
    }

    private final native void deallocateHeap();

    public final synchronized void b() {
        if (a)
            deallocateHeap();
        a = false;
    }

    final synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

    public NativeHeap(int i) {
        b = i;
        allocateHeap(b);
        a = true;
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        b();
    }

    private final native void allocateHeap(int i);
}
