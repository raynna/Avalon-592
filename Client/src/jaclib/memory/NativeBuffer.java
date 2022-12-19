/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
    private long a;
    private int b = -1;

    private final native void get(long l, byte[] is, int i, int i_0_, int i_1_);

    protected final void a(long l, int i) {
        b = i;
        a = l;
    }

    public final long getAddress() {
        return a;
    }

    public final int getSize() {
        return b;
    }

    private final native void put(long l, byte[] is, int i, int i_2_, int i_3_);

    public void a(byte[] is, int i, int i_4_, int i_5_) {
        if (b < i_5_ + i_4_ | (i_4_ < 0 | (is.length < i + i_5_ | (a == 0L | is == null | i < 0))))
            throw new RuntimeException();
        put(a, is, i, i_4_, i_5_);
    }
}
