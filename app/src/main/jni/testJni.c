//
// Created by 12985 on 2016/12/30.
//
#include <jni.h>

JNIEXPORT jstring JNICALL Java_jni_Jni_getStringFromNative(JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "ndk 中文测试");
}

JNIEXPORT jstring Java_jni_Jni_getStringFromC(JNIEnv *env) {
    return (*(*env)).NewStringUTF(env, "NDK test2");
}

