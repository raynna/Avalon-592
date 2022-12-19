/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.*;
import java.util.Hashtable;

public class OpenGL {
    long peer;
    private static Hashtable a = new Hashtable();
    private Thread b;
    private Hashtable c;

    public static final native void glColor4f(float f, float f_0_, float f_1_, float f_2_);

    public static final native void glBegin(int i);

    public static final native void glMultiTexCoord3i(int i, int i_3_, int i_4_, int i_5_);

    public static final native void glGenRenderbuffersEXT(int i, int[] is, int i_6_);

    public static final native void glTexImage3Dub(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, byte[] is, int i_15_);

    public static final native void glDepthMask(boolean bool);

    public static final native void glGenTextures(int i, int[] is, int i_16_);

    public static final native void glGenerateMipmapEXT(int i);

    public static final native void glBufferSubDataARBa(int i, int i_17_, int i_18_, long l);

    public static final native void glLoadMatrixf(float[] fs, int i);

    public static final native void glUniform1fARB(int i, float f);

    public static final native void glRenderbufferStorageEXT(int i, int i_19_, int i_20_, int i_21_);

    public final native void setSwapInterval(int i);

    public static final native void glUniform1iARB(int i, int i_22_);

    public static final native void glPopAttrib();

    public static final native void glPixelStorei(int i, int i_23_);

    public static final native void glClientActiveTexture(int i);

    public static final native void glColor3f(float f, float f_24_, float f_25_);

    public static final native void glClear(int i);

    static final native boolean glUnmapBufferARB(int i);

    public static final native void glDeleteLists(int i, int i_26_);

    public static final native void glDrawBuffersARB(int i, int[] is, int i_27_);

    public static final native void glGenBuffersARB(int i, int[] is, int i_28_);

    public static final native void glBufferDataARBub(int i, int i_29_, byte[] is, int i_30_, int i_31_);

    public static final native void glCopyPixels(int i, int i_32_, int i_33_, int i_34_, int i_35_);

    public static final native void glColorMask(boolean bool, boolean bool_36_, boolean bool_37_, boolean bool_38_);

    public static final native void glCopyTexSubImage3D(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_);

    public static final native void glBlitFramebufferEXT(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_);

    public static final native void glVertexPointer(int i, int i_56_, int i_57_, long l);

    public static final native void glTexImage2Dub(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, byte[] is, int i_65_);

    public static final native void glPushAttrib(int i);

    public static final native void glDeleteBuffersARB(int i, int[] is, int i_66_);

    public static final native long glCreateShaderObjectARB(int i);

    public static final native void glTexCoord2f(float f, float f_67_);

    public static final native void glBufferSubDataARBub(int i, int i_68_, int i_69_, byte[] is, int i_70_);

    public static final native void glTexEnvf(int i, int i_71_, float f);

    public static final native void glDrawPixelsub(int i, int i_72_, int i_73_, int i_74_, byte[] is, int i_75_);

    public static final native void glFrustum(double d, double d_76_, double d_77_, double d_78_, double d_79_, double d_80_);

    public static final native void glTexSubImage2Dub(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, byte[] is, int i_88_);

    public static final native void glClearColor(float f, float f_89_, float f_90_, float f_91_);

    public static final native void glVertex3f(float f, float f_92_, float f_93_);

    public static final native void glFramebufferRenderbufferEXT(int i, int i_94_, int i_95_, int i_96_);

    public static final native void glDeleteProgramARB(int i);

    public static final native void glTexCoord2i(int i, int i_97_);

    public static final native void glTexImage2Di(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int[] is, int i_105_);

    public static final native void glScalef(float f, float f_106_, float f_107_);

    public final native void swapBuffers();

    public static final native void glLightModelfv(int i, float[] fs, int i_108_);

    public static final native void glGetIntegerv(int i, int[] is, int i_109_);

    public static final native void glBindRenderbufferEXT(int i, int i_110_);

    public static final native void glTexImage1Dub(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, byte[] is, int i_117_);

    public static final native void glBindTexture(int i, int i_118_);

    private final native void detachPeer();

    public static final native void glTranslatef(float f, float f_119_, float f_120_);

    public static final native int glGetError();

    public static final native void glDrawBuffer(int i);

    public static final native void glFinish();

    public static final native void glBufferDataARBa(int i, int i_121_, long l, int i_122_);

    public static final native void glTexGenfv(int i, int i_123_, float[] fs, int i_124_);

    public static final native void glMatrixMode(int i);

    public static final native void glReadBuffer(int i);

    public static final native void glPushMatrix();

    public static final native void glPointSize(float f);

    public static final native void glFogfv(int i, float[] fs, int i_125_);

    public static final native void glCompileShaderARB(long l);

    public static final native void glColor4ub(byte i, byte i_126_, byte i_127_, byte i_128_);

    public static final native void glBindBufferARB(int i, int i_129_);

    public static final native void glFogi(int i, int i_130_);

    public final native boolean arePbuffersAvailable();

    public static final native void glNormalPointer(int i, int i_131_, long l);

    public final native void releasePbuffer(long l);

    public static final native void glPixelZoom(float f, float f_132_);

    public static final native String glGetString(int i);

    public static final native void glHint(int i, int i_133_);

    public static final native void glColorMaterial(int i, int i_134_);

    public static final native void glPolygonMode(int i, int i_135_);

    public static final native void glDeleteObjectARB(long l);

    public final native long createPbuffer(int i, int i_136_);

    public static final native void glUniform2fARB(int i, float f, float f_137_);

    public static final native void glTexSubImage2Di(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int[] is, int i_145_);

    public final native void release();

    public static final native void glFogf(int i, float f);

    public static final native void glRasterPos2i(int i, int i_146_);

    public static final native void glAttachObjectARB(long l, long l_147_);

    public static final native void glColor3ub(byte i, byte i_148_, byte i_149_);

    public static final native void glAlphaFunc(int i, float f);

    public final native void surfaceResized(long l);

    public static final native void glDrawArrays(int i, int i_150_, int i_151_);

    public static final native void glGetObjectParameterivARB(long l, int i, int[] is, int i_152_);

    public static final native void glMultMatrixf(float[] fs, int i);

    public static final native void glCullFace(int i);

    public static final native void glDeleteFramebuffersEXT(int i, int[] is, int i_153_);

    public static final native int glGetUniformLocationARB(long l, String string);

    public static final native void glGenFramebuffersEXT(int i, int[] is, int i_154_);

    public static final native void glRotatef(float f, float f_155_, float f_156_, float f_157_);

    public static final native void glDeleteTextures(int i, int[] is, int i_158_);

    public static final native void glProgramLocalParameter4fARB(int i, int i_159_, float f, float f_160_, float f_161_, float f_162_);

    public final native boolean setSurface(long l);

    public static final native void glEnableClientState(int i);

    public static final native void glNewList(int i, int i_163_);

    public static final native void glShaderSourceARB(long l, String string);

    public static final native void glEndList();

    public final synchronized boolean a() {
        Thread thread = Thread.currentThread();
        if (attachPeer()) {
            OpenGL opengl_164_ = (OpenGL) a.put(thread, this);
            if (opengl_164_ != null)
                opengl_164_.b = null;
            b = thread;
            return true;
        }
        return false;
    }

    public static final native void glDrawPixelsi(int i, int i_165_, int i_166_, int i_167_, int[] is, int i_168_);

    public static final native void glDepthFunc(int i);

    public static final native void glLineWidth(float f);

    public static final native void glProgramRawARB(int i, int i_169_, byte[] is);

    public final native long init(Canvas canvas, int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_);

    public final native void setPbuffer(long l);

    public final native void releaseSurface(Canvas canvas, long l);

    public static final native void glVertex2f(float f, float f_175_);

    public static final native void glBlendFunc(int i, int i_176_);

    public static final native void glTexImage2Df(int i, int i_177_, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, float[] fs, int i_184_);

    public static final native void glProgramLocalParameter4fvARB(int i, int i_185_, float[] fs, int i_186_);

    public static final native void glPixelTransferf(int i, float f);

    public static final native void glMaterialfv(int i, int i_187_, float[] fs, int i_188_);

    public static final native void glScissor(int i, int i_189_, int i_190_, int i_191_);

    public static final native void glTexSubImage2Df(int i, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, float[] fs, int i_199_);

    public static final native void glGetInfoLogARB(long l, int i, int[] is, int i_200_, byte[] is_201_, int i_202_);

    public final boolean a(String string) {
        if (c == null) {
            c = new Hashtable();
            String string_203_ = glGetString(7939);
            int i = 0;
            for (; ;) {
                int i_204_ = string_203_.indexOf(' ', i);
                if ((i_204_ ^ 0xffffffff) == 0)
                    break;
                String string_205_ = string_203_.substring(i, i_204_).trim();
                i = 1 + i_204_;
                if (string_205_.length() != 0)
                    c.put(string_205_, string_205_);
            }
            String string_206_ = string_203_.substring(i).trim();
            if (string_206_.length() != 0)
                c.put(string_206_, string_206_);
        }
        return c.containsKey(string);
    }

    public static final native void glActiveTexture(int i);

    public static final native void glPopMatrix();

    public static final native void glColorPointer(int i, int i_207_, int i_208_, long l);

    public static final native void glUniform4fARB(int i, float f, float f_209_, float f_210_, float f_211_);

    public static final native void glGetFloatv(int i, float[] fs, int i_212_);

    public final native long prepareSurface(Canvas canvas);

    public static final native long glCreateProgramObjectARB();

    public static final native void glMultiTexCoord2f(int i, float f, float f_213_);

    public static final native void glDisableClientState(int i);

    public static final native int glCheckFramebufferStatusEXT(int i);

    public static final native void glClearDepth(float f);

    public static final native void glLoadIdentity();

    public static final native void glTexCoord3i(int i, int i_214_, int i_215_);

    public static final native void glReadPixelsi(int i, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_, int[] is, int i_221_);

    public static final native void glLinkProgramARB(long l);

    public static final native void glTexParameteri(int i, int i_222_, int i_223_);

    public static final native void glUseProgramObjectARB(long l);

    public static final native void glFramebufferTexture3DEXT(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_);

    public final synchronized boolean b() {
        if (b != Thread.currentThread())
            return false;
        detachPeer();
        a.remove(b);
        b = null;
        return true;
    }

    public static final native void glTexCoord3f(float f, float f_229_, float f_230_);

    public static final native void glVertex2i(int i, int i_231_);

    public static final native void glNormal3f(float f, float f_232_, float f_233_);

    public static final native void glViewport(int i, int i_234_, int i_235_, int i_236_);

    public static final native void glCallList(int i);

    public static final native void glLightfv(int i, int i_237_, float[] fs, int i_238_);

    public static final native void glReadPixelsub(int i, int i_239_, int i_240_, int i_241_, int i_242_, int i_243_, byte[] is, int i_244_);

    public static final native void glDisable(int i);

    public static final native void glUniform3fARB(int i, float f, float f_245_, float f_246_);

    public static final native void glFlush();

    public static final native void glTexGeni(int i, int i_247_, int i_248_);

    public static final native void glEnable(int i);

    public static final native void glCopyTexSubImage2D(int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_);

    public static final native void glTexEnvi(int i, int i_256_, int i_257_);

    static final native long glMapBufferARB(int i, int i_258_);

    public static final native int glGenLists(int i);

    public static final native void glTexCoordPointer(int i, int i_259_, int i_260_, long l);

    public static final native void glBindProgramARB(int i, int i_261_);

    public static final native void glRenderbufferStorageMultisampleEXT(int i, int i_262_, int i_263_, int i_264_, int i_265_);

    public static final native void glDrawElements(int i, int i_266_, int i_267_, long l);

    private final native boolean attachPeer();

    public static final native void glFramebufferTexture2DEXT(int i, int i_268_, int i_269_, int i_270_, int i_271_);

    public static final native int glGenProgramARB();

    public static final native void glShadeModel(int i);

    public static final native void glTexEnvfv(int i, int i_272_, float[] fs, int i_273_);

    public static final native void glLightf(int i, int i_274_, float f);

    public static final native void glEnd();

    public static final native void glProgramStringARB(int i, int i_275_, String string);

    public static final native void glCopyTexImage2D(int i, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_);

    public static final native void glDeleteRenderbuffersEXT(int i, int[] is, int i_283_);

    public static final native void glTexParameterf(int i, int i_284_, float f);

    public static final native void glGetProgramivARB(int i, int i_285_, int[] is, int i_286_);

    public static final native void glBindFramebufferEXT(int i, int i_287_);

    public static final native void glOrtho(double d, double d_288_, double d_289_, double d_290_, double d_291_, double d_292_);

    public static final native void glMultiTexCoord2i(int i, int i_293_, int i_294_);

    public static final native void glDetachObjectARB(long l, long l_295_);
}
