package codes.recursive.JNI;

public class JNI {
    static {
        System.loadLibrary("catoptric_cpp"); // Load native library libcatoptric_cpp.so (Unixes)
                                     // This library contains a native method called test()
     }
    public native void test();
}