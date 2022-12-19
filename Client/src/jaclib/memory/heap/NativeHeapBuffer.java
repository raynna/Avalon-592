/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
    private int a;
    private NativeHeap b;
    private boolean c = true;
    public int d;

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        a();
    }

    private final synchronized void a() {
        if (b())
            b.deallocateBuffer(a);
        c = false;
    }

    public final synchronized void a(byte[] is, int i, int i_0_, int i_1_) {
        if (is == null | !b() | i < 0 | i - -i_1_ > is.length | i_0_ < 0 | d < i_0_ + i_1_)
            throw new RuntimeException();
        b.put(a, is, i, i_0_, i_1_);
    }

    public final int getSize() {
        return d;
    }

    public final long getAddress() {
        return b.getBufferAddress(a);
    }

    private final synchronized boolean b() {
        if (!b.a() || !c)
            return false;
        return true;
    }

    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_2_) {
        b = nativeheap;
        a = i;
        d = i_2_;
    }
}
