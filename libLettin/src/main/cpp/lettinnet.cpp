#include <jni.h>
#include <string>
#include "lettinnet.h"



extern "C"
{
JNIEXPORT jstring JNICALL
Java_cn_lettin_liblettin_LettinNetwork_stringFromJNI(JNIEnv *env, jobject instance) {
    std::string hello = "This is Lettin Network Libs Hello from C++ Native";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jint JNICALL
Java_cn_lettin_liblettin_LettinNetwork_getGwVersion(JNIEnv *env, jobject instance) {
    // TODO
    LOGI("Java_cn_lettin_lettinlibs_LettinNetwork_getGwVersion");
    return getLeboVersion();
}


}