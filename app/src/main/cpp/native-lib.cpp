#include <jni.h>
#include <string>




extern "C"
JNIEXPORT jint JNICALL
Java_com_example_inspiron3847desktop_ndksetup2_data_Model_add(JNIEnv *env, jclass type,
                                                              jint number1, jint number2) {

    // TODO
    return number1 + number2;

}extern "C"
JNIEXPORT jint JNICALL
Java_com_example_inspiron3847desktop_ndksetup2_data_Model_minus(JNIEnv *env, jclass type,
                                                                jint number1, jint number2) {

    // TODO
    return number1 - number2;

}extern "C"
JNIEXPORT jint JNICALL
Java_com_example_inspiron3847desktop_ndksetup2_data_Model_multiply(JNIEnv *env, jclass type,
                                                                   jint number1, jint number2) {

    // TODO
    return number1 * number2;

}extern "C"
JNIEXPORT jint JNICALL
Java_com_example_inspiron3847desktop_ndksetup2_data_Model_divide(JNIEnv *env, jclass type,
                                                                 jint number1, jint number2) {

    // TODO
    return number1/number2;

}