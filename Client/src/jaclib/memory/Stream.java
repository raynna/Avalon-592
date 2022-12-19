/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
    private int a;
    private Buffer b;
    private byte[] c;
    private int d;
    private int e;

    public final void a(int i, int i_0_, int i_1_, int i_2_) {
        if (d + 3 >= c.length)
            c();
        c[d++] = (byte) i_1_;
        c[d++] = (byte) i_0_;
        c[d++] = (byte) i;
        c[d++] = (byte) i_2_;
    }

    public static final boolean a() {
        if ((getLSB(-65536) ^ 0xffffffff) != 0)
            return false;
        return true;
    }

    public final void a(float f) {
        if (c.length <= 3 + d)
            c();
        int i = floatToRawIntBits(f);
        c[d++] = (byte) i;
        c[d++] = (byte) (i >> 8);
        c[d++] = (byte) (i >> 16);
        c[d++] = (byte) (i >> 24);
    }

    public final void a(Buffer buffer) {
        a(buffer, 0, buffer.getSize());
    }

    public final int b() {
        return d + e;
    }

    public final void c() {
        if (d > 0) {
            if (e - -d > a)
                throw new RuntimeException();
            b.a(c, 0, e, d);
            e += d;
            d = 0;
        }
    }

    public final void a(int i) {
        if (c.length <= d - -3)
            c();
        c[d++] = (byte) (i >> 16);
        c[d++] = (byte) (i >> 8);
        c[d++] = (byte) i;
        c[d++] = (byte) (i >> 24);
    }

    public final void b(int i) {
        if (c.length <= d + 1)
            c();
        c[d++] = (byte) i;
        c[d++] = (byte) (i >> 8);
    }

    public final void c(int i) {
        if (c.length <= d)
            c();
        c[d++] = (byte) i;
    }

    public final void d(int i) {
        if (c.length <= d + 3)
            c();
        c[d++] = (byte) i;
        c[d++] = (byte) (i >> 8);
        c[d++] = (byte) (i >> 16);
        c[d++] = (byte) (i >> 24);
    }

    public final void b(int i, int i_3_, int i_4_, int i_5_) {
        if (c.length <= d + 3)
            c();
        c[d++] = (byte) i;
        c[d++] = (byte) i_3_;
        c[d++] = (byte) i_4_;
        c[d++] = (byte) i_5_;
    }

    public Stream() {
        this(4096);
    }

    public static final native int floatToRawIntBits(float f);

    private static final native byte getLSB(int i);

    public final void e(int i) {
        c();
        e = i;
    }

    public final void b(float f) {
        if (c.length <= 3 + d)
            c();
        int i = floatToRawIntBits(f);
        c[d++] = (byte) (i >> 24);
        c[d++] = (byte) (i >> 16);
        c[d++] = (byte) (i >> 8);
        c[d++] = (byte) i;
    }

    private Stream(int i) {
        c = new byte[i];
    }

    public Stream(Buffer buffer) {
        this(buffer, 0, buffer.getSize());
    }

    public final void f(int i) {
        if (d - -1 >= c.length)
            c();
        c[d++] = (byte) (i >> 8);
        c[d++] = (byte) i;
    }

    public Stream(Buffer buffer, int i, int i_6_) {
        this(buffer.getSize() < 4096 ? buffer.getSize() : 4096);
        a(buffer, i, i_6_);
    }

    private final void a(Buffer buffer, int i, int i_7_) {
        c();
        a = i_7_ + i;
        b = buffer;
        e = i;
        if (a > buffer.getSize())
            throw new RuntimeException();
    }
}
