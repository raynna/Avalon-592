/* MapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {
    private int c;

    public final boolean a() {
        if (c == 0)
            return false;
        return true;
    }

    public final boolean b() {
        boolean bool = true;
        if (c != 0) {
            bool = OpenGL.glUnmapBufferARB(c);
            this.a(0L, 0);
            c = 0;
        }
        return bool;
    }

    public final void a(byte[] is, int i, int i_0_, int i_1_) {
        if (c == 0)
            throw new RuntimeException();
        super.a(is, i, i_0_, i_1_);
    }

    public final boolean a(int i, int i_2_, int i_3_) {
        if (c != 0)
            return false;
        long l = OpenGL.glMapBufferARB(i, i_3_);
        if (l == 0L)
            return false;
        this.a(l, i_2_);
        c = i;
        return true;
    }
}
