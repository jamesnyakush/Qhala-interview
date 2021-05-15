#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_qhala_util_Keys_apiKey(JNIEnv *env, jobject object) {
    std::string api_key = "f086a471b3fa14335856006291f083b3";
    return env->NewStringUTF(api_key.c_str());
}