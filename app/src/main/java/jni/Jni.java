package jni;

import android.content.Context;

import java.io.IOException;

/**
 * Created by 12985 on 2016/12/30.
 */

public class Jni {
    static {
        System.loadLibrary("testJni");
    }
    public native static String getStringFromNative();
    public native static String getStringFromC();

    public native static int patch(String oldApkPath, String newApkPath, String patchPath);
}
