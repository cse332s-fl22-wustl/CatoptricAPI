package JNI;

public class JNI {
    static {
        System.loadLibrary("catoptric_cpp"); // Load native library libcatoptric_cpp.so (Unixes)
                                     // This library contains a native method called test()
     }
    private native void test();
    public void testing() {
        this.test();
    }
}