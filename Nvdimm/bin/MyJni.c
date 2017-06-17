#include "com_yh_SHello.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_yh_SHello_sayHello
  (JNIEnv * env, jobject obj){

  printf("hello jni");
  return;
}
