/* Native reconstruction for 9l.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_9l_5_0 | RVA 0x30a870 | 9l.5([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_5_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  ulonglong uVar7;
  JNINativeInterface_ *pJVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar9;
  ulonglong uVar10;
  undefined8 uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar8 = *env;
    goto LAB_7ffc3eadaa22;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3eadaec1:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    if ((pvVar4 == (void *)0x0) ||
       (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc09e8), bVar1 != 0)) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3eadaec1;
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar8 = *env;
      if (pvVar5 == (void *)0x0) {
LAB_7ffc3eadaa22:
        UNRECOVERED_JUMPTABLE = pJVar8->ThrowNew;
        arg2 = &DAT_7ffc3eba6000;
        pvVar4 = pvRam00007ffc3ebc0a70;
        goto LAB_7ffc3eadaa2d;
      }
      bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 3) goto LAB_7ffc3eadaec1;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pJVar8 = *env;
        if (pvVar5 == (void *)0x0) goto LAB_7ffc3eadaa22;
        bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
        if (bVar1 != 0) {
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
          if (lVar6 == 0) {
            return;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2c);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x73);
          if (pvVar9 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar10 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar9 + 0x10));
          }
          else {
            uVar10 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc2950 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2c);
            lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebaec67,0x7ffc3eba8044,0,0);
            if ((lVar6 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc2950 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc2950;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff5d958bd921a14f);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar10 ^ uVar7);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc2958 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2c);
            lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebaec67,0x7ffc3eba7293,0,0);
            if ((lVar6 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc2958 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc2958;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff546bc30cbd358e);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar10 ^ uVar7);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadad4f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar4 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3eadaa2d:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadaa40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_9l_6_1 | RVA 0x30af20 | 9l.6([B)[B | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_6_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_9l_9_2 | RVA 0x30af30 | 9l.9([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_9_2(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  ulonglong uVar9;
  undefined8 uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar4 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
LAB_7ffc3eadb2fd:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eadafbf;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 2) goto LAB_7ffc3eadb2fd;
        pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,100);
        if (pvVar7 == (void *)0x0) {
          return;
        }
        if ((pvVar3 == (void *)0x0) ||
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar7), bVar1 != 0)) {
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
          if (pvVar7 == (void *)0x0) {
            return;
          }
          pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x73);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar9 = *(ulonglong *)
                     (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                     (longlong)*(int *)((longlong)pvVar8 + 0x10));
          }
          else {
            uVar9 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar8);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc2ae0 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x2c);
            lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebaec67,0x7ffc3ebaec6a,0,0);
            if ((lVar5 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc2ae0 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc2ae0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x5d93bc97edb41766);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar9 ^ uVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadb239. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eadafbf;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar4->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eadafbf:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadafd1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_9l_2_3 | RVA 0x30b360 | 9l.2([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_2_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  ulonglong uVar9;
  undefined8 uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar4 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
LAB_7ffc3eadb72d:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eadb3ef;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 2) goto LAB_7ffc3eadb72d;
        pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x65);
        if (pvVar7 == (void *)0x0) {
          return;
        }
        if ((pvVar3 == (void *)0x0) ||
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar7), bVar1 != 0)) {
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
          if (pvVar7 == (void *)0x0) {
            return;
          }
          pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x73);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar9 = *(ulonglong *)
                     (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                     (longlong)*(int *)((longlong)pvVar8 + 0x10));
          }
          else {
            uVar9 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar8);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc2910 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x2c);
            lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebaec67,0x7ffc3ebaec96,0,0);
            if ((lVar5 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc2910 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc2910;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x2d1dddda85c492d);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar9 ^ uVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadb669. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eadb3ef;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar4->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eadb3ef:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadb401. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_9l_7_4 | RVA 0x30b790 | 9l.7([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_7_4(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar4;
  ulonglong uVar5;
  void *pvVar6;
  void *pvVar7;
  void *pvVar8;
  void *pvVar9;
  longlong lVar10;
  undefined8 uVar11;
  JNINativeInterface_ *pJVar12;
  ulonglong uVar13;
  char *arg2;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3eadd164;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) goto LAB_7ffc3eadd143;
  pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar12 = *env;
  if (pvVar3 == (void *)0x0) {
LAB_7ffc3eadb816:
    UNRECOVERED_JUMPTABLE = pJVar12->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3eadb821;
  }
  bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
  if (bVar1 == 0) {
LAB_7ffc3eadd2d1:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
LAB_7ffc3eadb821:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadb834. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
    return;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar4 == 0) {
    return;
  }
  uVar5 = FUN_7ffc3e7d1a20(env,pvVar3,lVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 2) goto LAB_7ffc3eadd143;
  pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x65);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  if ((pvVar3 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar6), bVar1 == 0))
  goto LAB_7ffc3eadd2d1;
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x73);
  if (pvVar7 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar13 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar7 + 0x10));
  }
  else {
    uVar13 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar7);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar6,0x102);
  if (lVar4 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar6,lVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc29a8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2c);
    lVar4 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                             0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
    if ((lVar4 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc29a8 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc29a8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar13 = uVar13 ^ uVar5;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xee01ded0b7a013c5);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eadd176;
    if (iVar2 != 0) {
LAB_7ffc3eadbe46:
      if (_DAT_7ffc3ebc29c0 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x2c);
        lVar4 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
        if ((lVar4 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc29c0 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc29c0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xee02ea6a605d4a14);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar8 == (void *)0x0) goto LAB_7ffc3eadd164;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      if (2 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar7);
          lVar4 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar4 == 0) {
            return;
          }
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar4,uVar13 ^ 0x5c65836f04b5)
          ;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
            if (_DAT_7ffc3ebc29c8 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2c);
              lVar10 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3eba74db,0x7ffc3eba626f,0,0);
              if ((lVar10 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc29c8 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc29c8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar6);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xee057e574436d5d8);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar6);
            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x68);
            if (pvVar3 == (void *)0x0) {
              return;
            }
            pvVar6 = (*(*env)->AllocObject)(env,pvVar3);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar6 != (void *)0x0) {
              lVar10 = FUN_7ffc3eb76c90(env,pvVar3,0x105);
              if (lVar10 == 0) {
                return;
              }
              FUN_7ffc3e7dbbc0(env,pvVar6,pvVar3,lVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar4,
                                                uVar13 ^ 0x2909fe021fc4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (pvVar3 != (void *)0x0) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                }
                if (0 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
                  if (_DAT_7ffc3ebc29d0 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                    lVar10 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                              0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba626f,0,0);
                    if ((lVar10 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc29d0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc29d0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar6);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xee032767b685f39d);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (_DAT_7ffc3ebc29d8 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                    lVar10 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                              0x7ffc3eba606c,0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
                    if ((lVar10 != 0) &&
                       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                       pvVar3 != (void *)0x0)) {
                      _DAT_7ffc3ebc29d8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                    }
                  }
                  pvVar3 = _DAT_7ffc3ebc29d8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xee01ded0b7a013c5);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar7 == (void *)0x0) goto LAB_7ffc3eadd164;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar7);
                  }
                  if (1 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar6);
                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar4,
                                                      uVar13 ^ 0x41b1dacd072e);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar7);
                    }
                    if (0 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar6);
                      if (_DAT_7ffc3ebc29e0 == (void *)0x0) {
                        uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                        lVar10 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                  0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba626f,0,0);
                        if ((lVar10 != 0) &&
                           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                           pvVar6 != (void *)0x0)) {
                          _DAT_7ffc3ebc29e0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                        }
                      }
                      pvVar6 = _DAT_7ffc3ebc29e0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar7);
                      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xee029c9042d6d50e);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar13);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                      FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc29e8 == (void *)0x0) {
                        uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                        lVar10 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                  0x7ffc3eba606c,0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
                        if ((lVar10 != 0) &&
                           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                           pvVar3 != (void *)0x0)) {
                          _DAT_7ffc3ebc29e8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                        }
                      }
                      pvVar3 = _DAT_7ffc3ebc29e8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xee01ded0b7a013c5);
                      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar13);
                      (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar7);
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar6);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x4f);
                      if (pvVar6 == (void *)0x0) {
                        return;
                      }
                      pvVar7 = (*(*env)->AllocObject)(env,pvVar6);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (pvVar7 != (void *)0x0) {
                        lVar10 = FUN_7ffc3eb76c90(env,pvVar6,0x106);
                        if (lVar10 == 0) {
                          return;
                        }
                        FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar10);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (pvVar6 != (void *)0x0) {
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (1 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar4,
                                                              uVar13 ^ 0x41b1dacd072e);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            if (0 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                              if (_DAT_7ffc3ebc29f0 == (void *)0x0) {
                                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                                lVar4 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                         0x7ffc3eba606c,0x7ffc3eba74db,
                                                         0x7ffc3eba626f,0,0);
                                if ((lVar4 != 0) &&
                                   (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00
                                                                     ), pvVar7 != (void *)0x0)) {
                                  _DAT_7ffc3ebc29f0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                }
                              }
                              pvVar7 = _DAT_7ffc3ebc29f0;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return;
                              }
                              pvVar8 = (*(*env)->NewObjectArray)
                                                 (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar6);
                              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0xee029c9042d6d50e);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar13);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                              FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadd08f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                              (*(*env)->ExceptionCheck)(env);
                              return;
                            }
                          }
                          goto LAB_7ffc3eadd143;
                        }
                      }
                      goto LAB_7ffc3eadd164;
                    }
                  }
                }
                goto LAB_7ffc3eadd143;
              }
            }
LAB_7ffc3eadd164:
            pJVar12 = *env;
            goto LAB_7ffc3eadb816;
          }
        }
      }
LAB_7ffc3eadd143:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eadb821;
    }
    if (pvVar6 == (void *)0x0) {
      return;
    }
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x67);
    pJVar12 = *env;
    if (pvVar6 != (void *)0x0) {
      pvVar7 = (*pJVar12->AllocObject)(env,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (pvVar7 == (void *)0x0) {
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
        }
        else {
          lVar4 = FUN_7ffc3eb76c90(env,pvVar6,0x104);
          if (lVar4 != 0) {
            FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar4,uVar13 ^ 0x737bf0b1e2c9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc29b0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar4 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3ebaec67,0x7ffc3ebaece9,0,0);
                if ((lVar4 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc29b0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc29b0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xee01ded0b7a013c5);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar7);
                FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc29b8 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                    lVar4 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
                    if ((lVar4 != 0) &&
                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00),
                       pvVar6 != (void *)0x0)) {
                      _DAT_7ffc3ebc29b8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                    }
                  }
                  pvVar6 = _DAT_7ffc3ebc29b8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0xee01ded0b7a013c5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
                    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) goto LAB_7ffc3eadbe46;
                  }
                }
              }
            }
          }
        }
      }
      goto LAB_7ffc3eadd216;
    }
  }
  else {
LAB_7ffc3eadd176:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x66);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar6);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar4 = FUN_7ffc3eb76c30(env,0x2c);
    if ((lVar4 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar4,0x103), lVar10 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar4,lVar10,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eadd21f;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
LAB_7ffc3eadd216:
    pJVar12 = *env;
  }
  pvVar3 = (*pJVar12->ExceptionOccurred)(env);
LAB_7ffc3eadd21f:
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x66);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar6);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar4 = FUN_7ffc3eb76c30(env,0x2c);
    if ((lVar4 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar4,0x103), lVar10 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar4,lVar10,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadd2ce. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_9l_8_5 | RVA 0x30d320 | 9l.8([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_8_5(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  int iVar6;
  void *pvVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar8;
  ulonglong uVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  void *pvVar13;
  void *pvVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  longlong lVar17;
  JNINativeInterface_ *pJVar18;
  int iVar19;
  char *pcVar21;
  ulonglong uVar22;
  undefined8 in_stack_ffffffffffffff30;
  int iVar20;
  
  uVar5 = (undefined4)((ulonglong)in_stack_ffffffffffffff30 >> 0x20);
  if (arg0 == (void *)0x0) {
LAB_7ffc3eae0c95:
    pJVar18 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar3 < 1) {
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar21 = (char *)0x7ffc3eba6019;
      pvVar7 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eadd3b4;
    }
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar18 = *env;
    if (pvVar7 != (void *)0x0) {
      bVar1 = (*pJVar18->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3eae0ac2:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar21 = (char *)0x7ffc3eba6033;
        pvVar7 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3eadd3b4;
      }
      lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar8 == 0) {
        return;
      }
      uVar9 = FUN_7ffc3e7d1a20(env,pvVar7,lVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
      if (pvVar7 == (void *)0x0) {
        return;
      }
      pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x73);
      if (pvVar10 == (void *)0x0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar22 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar10 + 0x10));
      }
      else {
        uVar22 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar10);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc29f8 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaed3d,0x7ffc3ebaed3f,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc29f8 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc29f8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      uVar22 = uVar22 ^ uVar9;
      pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13ef318c47d994f);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
      pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a00 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaec67,0x7ffc3ebaed60,0,0);
        if ((lVar8 != 0) &&
           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar11 != (void *)0x0)) {
          _DAT_7ffc3ebc2a00 = (*(*env)->NewGlobalRef)(env,pvVar11);
        }
      }
      pvVar11 = _DAT_7ffc3ebc2a00;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13a396c9492f8c5);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar10);
      FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar8 = FUN_7ffc3eb76c90(env,pvVar7,0x107);
      if (lVar8 == 0) {
        return;
      }
      iVar3 = FUN_7ffc3e7db1e0(env,pvVar7,lVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a08 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaed3d,0x7ffc3ebaed94,0,0);
        if ((lVar8 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2a08 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2a08;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13b2d2574aab0a3);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a10 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaec67,0x7ffc3ebaedba,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a10 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a10;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x13f8a90c69ca529);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
      FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a18 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
        if ((lVar8 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2a18 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2a18;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13f8a90c69ca529);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a20 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3ebaedf3,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a20 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a20;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x124073edd732d0b);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
      FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a28 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
        if ((lVar8 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2a28 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2a28;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13f8a90c69ca529);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x69);
      if (pvVar10 == (void *)0x0) {
        return;
      }
      pvVar11 = (*(*env)->AllocObject)(env,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a30 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3eba6128,0,0);
        if ((lVar8 != 0) &&
           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar12 != (void *)0x0)) {
          _DAT_7ffc3ebc2a30 = (*(*env)->NewGlobalRef)(env,pvVar12);
        }
      }
      pvVar12 = _DAT_7ffc3ebc2a30;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,receiver);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13ac6ff82b45f28);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar14);
      uVar15 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a38 == (void *)0x0) {
        uVar16 = FUN_7ffc3eb76c30(env,0x2c);
        uVar5 = 0x7ffc;
        lVar8 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3eba64b4,0,0);
        if ((lVar8 != 0) &&
           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar12 != (void *)0x0)) {
          _DAT_7ffc3ebc2a38 = (*(*env)->NewGlobalRef)(env,pvVar12);
        }
      }
      pvVar12 = _DAT_7ffc3ebc2a38;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,receiver);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13338b75728cbe9);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar14);
      uVar16 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      uVar4 = FUN_7ffc3e7d8be0(env,uVar16,uRam00007ffc3ebc09d0);
      if (pvVar11 == (void *)0x0) goto LAB_7ffc3eae0c95;
      lVar8 = FUN_7ffc3eb76c90(env,pvVar10,0x108);
      if (lVar8 == 0) {
        return;
      }
      FUN_7ffc3e7dbbc0(env,pvVar11,pvVar10,lVar8,uVar15,CONCAT44(uVar5,uVar4));
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a40 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3eba6245,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a40 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a40;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x13357f94a566927);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
      uVar15 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
      if (_DAT_7ffc3ebc2a48 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
        if ((lVar8 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2a48 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2a48;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13f8a90c69ca529);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a50 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaee30,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a50 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a50;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13a396c9492f8c5);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
      pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a58 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba7805,0x7ffc3eba647c,0,0);
        if ((lVar8 != 0) &&
           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar11 != (void *)0x0)) {
          _DAT_7ffc3ebc2a58 = (*(*env)->NewGlobalRef)(env,pvVar11);
        }
      }
      pvVar11 = _DAT_7ffc3ebc2a58;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2910);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         uVar22 ^ 0x3294e34269c20f72);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
      uVar15 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      uVar5 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
      if (_DAT_7ffc3ebc2a60 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3ebaee63,0,0);
        if ((lVar8 != 0) &&
           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar11 != (void *)0x0)) {
          _DAT_7ffc3ebc2a60 = (*(*env)->NewGlobalRef)(env,pvVar11);
        }
      }
      pvVar11 = _DAT_7ffc3ebc2a60;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x13f7a30b6355f3d);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar7);
      FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      iVar20 = (int)((longlong)uVar22 >> 0x3f);
      iVar19 = iVar20 + (uint)(0 < (longlong)uVar22);
LAB_7ffc3eade473:
      if (_DAT_7ffc3ebc2a68 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaee30,0,0);
        if ((lVar8 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2a68 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2a68;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13a396c9492f8c5);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a70 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3eba64b4,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a70 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a70;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x13d39b08ef012d4);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
      uVar15 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
LAB_7ffc3eade66c:
      if (_DAT_7ffc3ebc2a78 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaee30,0,0);
        if ((lVar8 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2a78 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2a78;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x13a396c9492f8c5);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a80 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3eba7f9a,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a80 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a80;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x13c1575e4f78768);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2a88 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3eba61d9,0,0);
        if ((lVar8 != 0) &&
           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar10 != (void *)0x0)) {
          _DAT_7ffc3ebc2a88 = (*(*env)->NewGlobalRef)(env,pvVar10);
        }
      }
      pvVar10 = _DAT_7ffc3ebc2a88;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x13ded268cfcbb2f);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
LAB_7ffc3eade940:
      do {
        if (_DAT_7ffc3ebc2a90 == (void *)0x0) {
          uVar15 = FUN_7ffc3eb76c30(env,0x2c);
          lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba6204,0,0);
          if ((lVar8 != 0) &&
             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar10 != (void *)0x0)) {
            _DAT_7ffc3ebc2a90 = (*(*env)->NewGlobalRef)(env,pvVar10);
          }
        }
        pvVar10 = _DAT_7ffc3ebc2a90;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x139dffd59fab785);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
        uVar15 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        cVar2 = FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
        if (cVar2 == '\0') goto LAB_7ffc3eade473;
        if (_DAT_7ffc3ebc2a98 == (void *)0x0) {
          uVar15 = FUN_7ffc3eb76c30(env,0x2c);
          lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba621c,0,0);
          if ((lVar8 != 0) &&
             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar10 != (void *)0x0)) {
            _DAT_7ffc3ebc2a98 = (*(*env)->NewGlobalRef)(env,pvVar10);
          }
        }
        pvVar10 = _DAT_7ffc3ebc2a98;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x133889d55c5e2d6);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
        pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x6a);
        if (pvVar11 == (void *)0x0) {
          return;
        }
        if ((pvVar10 != (void *)0x0) &&
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11), bVar1 == 0))
        goto LAB_7ffc3eae0ac2;
        if (_DAT_7ffc3ebc2aa0 == (void *)0x0) {
          uVar15 = FUN_7ffc3eb76c30(env,0x2c);
          lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba743f,0,0);
          if ((lVar8 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc2aa0 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc2aa0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x138f9cc04e25079);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
        FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc2aa8 == (void *)0x0) {
          uVar15 = FUN_7ffc3eb76c30(env,0x2c);
          lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba6204,0,0);
          if ((lVar8 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc2aa8 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc2aa8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar10);
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x13ab68b91724f16);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
        uVar15 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        cVar2 = FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
        if (iVar3 == 0 ||
            (iVar19 == 0 || SCARRY4(iVar20,(uint)(0 < (longlong)uVar22)) != iVar19 < 0))
        goto LAB_7ffc3eade66c;
      } while (cVar2 == '\0');
      if (_DAT_7ffc3ebc2ab0 == (void *)0x0) {
        uVar15 = FUN_7ffc3eb76c30(env,0x2c);
        lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3eba6204,0,0);
        if ((lVar8 != 0) &&
           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar11 != (void *)0x0)) {
          _DAT_7ffc3ebc2ab0 = (*(*env)->NewGlobalRef)(env,pvVar11);
        }
      }
      pvVar11 = _DAT_7ffc3ebc2ab0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar10);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x1389a4fb12ae584);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
      uVar15 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      cVar2 = FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
      if (cVar2 == '\0') {
        if (_DAT_7ffc3ebc2ac0 == (void *)0x0) {
          uVar15 = FUN_7ffc3eb76c30(env,0x2c);
          lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba6204,0,0);
          if ((lVar8 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc2ac0 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc2ac0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar10);
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x13eaebacb9d9989);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar22);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
          uVar15 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            cVar2 = FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
            if (cVar2 != '\0') {
              pvVar10 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 == 0) &&
                 (lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar8 != 0)) {
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,
                                                   uVar22 ^ 0x31b60966a0f6);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (pvVar10 == (void *)0x0) goto LAB_7ffc3eae0ae3;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar6 = (*(*env)->GetArrayLength)(env,pvVar10);
                  }
                  if (iVar6 < 1) goto LAB_7ffc3eae0aa8;
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                  if (_DAT_7ffc3ebc2ac8 == (void *)0x0) {
                    uVar15 = FUN_7ffc3eb76c30(env,0x2c);
                    lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba626f,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar11 != (void *)0x0)) {
                      _DAT_7ffc3ebc2ac8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                    }
                  }
                  pvVar11 = _DAT_7ffc3ebc2ac8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x13e022161907cd1);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar10);
                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar22);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar10);
                    FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    goto joined_r0x7ffc3eadfa33;
                  }
                }
              }
              goto LAB_7ffc3eae0afd;
            }
            if (_DAT_7ffc3ebc2ad0 == (void *)0x0) {
              uVar15 = FUN_7ffc3eb76c30(env,0x2c);
              lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3eba74db,0x7ffc3eba6204,0,0);
              if ((lVar8 != 0) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc2ad0 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
            }
            pvVar11 = _DAT_7ffc3ebc2ad0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar10);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x124aa157fa75b81);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
              uVar15 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                cVar2 = FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
                if (cVar2 == '\0') goto LAB_7ffc3eade940;
                pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if ((bVar1 == 0) &&
                   (lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar8 != 0)) {
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,
                                                     uVar22 ^ 0x34bd3bf313ff);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar11 == (void *)0x0) {
                      pJVar18 = *env;
                      pcVar21 = &DAT_7ffc3eba6000;
                      pvVar7 = pvRam00007ffc3ebc0a70;
                    }
                    else {
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar6 = (*(*env)->GetArrayLength)(env,pvVar11);
                      }
                      if (1 < iVar6) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar6 = (*(*env)->GetArrayLength)(env,pvVar11);
                        }
                        if (0 < iVar6) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar10);
                          if (_DAT_7ffc3ebc2ad8 == (void *)0x0) {
                            uVar15 = FUN_7ffc3eb76c30(env,0x2c);
                            lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                     0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba626f,0,
                                                     0);
                            if ((lVar8 != 0) &&
                               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                               pvVar10 != (void *)0x0)) {
                              _DAT_7ffc3ebc2ad8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                            }
                          }
                          pvVar10 = _DAT_7ffc3ebc2ad8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae0b99;
                          pvVar12 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x13d66b7b0d7378e)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar22);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar11);
                          FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) goto LAB_7ffc3eade940;
                          goto LAB_7ffc3eae0b99;
                        }
                      }
                      pJVar18 = *env;
                      pcVar21 = (char *)0x7ffc3eba6019;
                      pvVar7 = pvRam00007ffc3ebc0a98;
                    }
                    (*pJVar18->ThrowNew)(env,pvVar7,pcVar21);
                  }
                }
              }
            }
          }
        }
        goto LAB_7ffc3eae0b99;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar8 != 0)) {
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,uVar22 ^ 0x4432b21e5687);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar11 == (void *)0x0) {
LAB_7ffc3eae0ae3:
            pJVar18 = *env;
            pcVar21 = &DAT_7ffc3eba6000;
            pvVar7 = pvRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar6 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if (1 < iVar6) {
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar6 = (*(*env)->GetArrayLength)(env,pvVar11);
              }
              if (0 < iVar6) {
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar10);
                if (_DAT_7ffc3ebc2ab8 == (void *)0x0) {
                  uVar15 = FUN_7ffc3eb76c30(env,0x2c);
                  lVar8 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c
                                           ,0x7ffc3eba74db,0x7ffc3eba626f,0,0);
                  if ((lVar8 != 0) &&
                     (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar10 != (void *)0x0)) {
                    _DAT_7ffc3ebc2ab8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                  }
                }
                pvVar10 = _DAT_7ffc3ebc2ab8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3eae0afd;
                pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x139211aaa6d3f61);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar22);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar11);
                FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
                bVar1 = (*(*env)->ExceptionCheck)(env);
joined_r0x7ffc3eadfa33:
                if (bVar1 == 0) goto LAB_7ffc3eade940;
                goto LAB_7ffc3eae0afd;
              }
            }
LAB_7ffc3eae0aa8:
            pJVar18 = *env;
            pcVar21 = (char *)0x7ffc3eba6019;
            pvVar7 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar18->ThrowNew)(env,pvVar7,pcVar21);
        }
      }
LAB_7ffc3eae0afd:
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
      pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x66);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar10);
      if (bVar1 == 0) goto LAB_7ffc3eae0ba5;
      (*(*env)->ExceptionClear)(env);
      lVar8 = FUN_7ffc3eb76c30(env,0x2c);
      if ((lVar8 != 0) && (lVar17 = FUN_7ffc3eb76c90(env,lVar8,0x103), lVar17 != 0)) {
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar17,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar7 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3eae0ba5;
        }
        (*(*env)->Throw)(env,pvVar7);
      }
LAB_7ffc3eae0b99:
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eae0ba5:
      pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x66);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar10);
      if (bVar1 == 0) {
        return;
      }
      (*(*env)->ExceptionClear)(env);
      lVar8 = FUN_7ffc3eb76c30(env,0x2c);
      if (lVar8 == 0) {
        return;
      }
      lVar17 = FUN_7ffc3eb76c90(env,lVar8,0x103);
      if (lVar17 == 0) {
        return;
      }
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar17,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae0c44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->Throw)(env,pvVar7);
      return;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar18->ThrowNew;
  pcVar21 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eadd3b4:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eadd3ca. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar7,pcVar21);
  return;
}

/* JNI_9l_0_6 | RVA 0x310ce0 | 9l.0([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_0_6(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  undefined8 uVar9;
  void *pvVar10;
  undefined8 uVar11;
  longlong lVar12;
  JNINativeInterface_ *pJVar13;
  char *pcVar14;
  ulonglong uVar15;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) {
    pJVar13 = *env;
LAB_7ffc3eae0df3:
    UNRECOVERED_JUMPTABLE = pJVar13->ThrowNew;
    pcVar14 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3eae0dfe;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3eae2e81:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar14 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eae0dfe:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae0e14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar3,pcVar14);
    return;
  }
  pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x6a);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if ((pvVar3 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 == 0)) {
LAB_7ffc3eae2ea2:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar14 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3eae0dfe;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 2) goto LAB_7ffc3eae2e81;
  pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pJVar13 = *env;
  if (pvVar4 == (void *)0x0) goto LAB_7ffc3eae0df3;
  bVar1 = (*pJVar13->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
  if (bVar1 == 0) goto LAB_7ffc3eae2ea2;
  lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar5 == 0) {
    return;
  }
  uVar6 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x73);
  if (pvVar7 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar15 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar7 + 0x10));
  }
  else {
    uVar15 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar7);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2868 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x2c);
    lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,0x7ffc3ebaeccb
                             ,0x7ffc3ebaed05,0,0);
    if ((lVar5 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc2868 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc2868;
  uVar15 = uVar15 ^ uVar6;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x27e2dd2dfe2283f4);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eae2f09;
    if (_DAT_7ffc3ebc2870 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba74db,0x7ffc3eba6204,0,0);
      if ((lVar5 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
      {
        _DAT_7ffc3ebc2870 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc2870;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eae2f09;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x27e501e5dff48bbb);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eae2f09;
    FUN_7ffc3e7d53d0(env,uVar9,uRam00007ffc3ebc0a38);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x67);
    pJVar13 = *env;
    if (pvVar4 != (void *)0x0) {
      pvVar7 = (*pJVar13->AllocObject)(env,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (pvVar7 == (void *)0x0) {
          pJVar13 = *env;
          pcVar14 = &DAT_7ffc3eba6000;
          pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eae2f03:
          (*pJVar13->ThrowNew)(env,pvVar3,pcVar14);
        }
        else {
          lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x104);
          if (lVar5 != 0) {
            FUN_7ffc3e7dbbc0(env,pvVar7,pvVar4,lVar5,uVar15 ^ 0x443c6ece2b29);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc2878 == (void *)0x0) {
                uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3ebaec67,0x7ffc3ebaece9,0,0);
                if ((lVar5 != 0) &&
                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                   pvVar4 != (void *)0x0)) {
                  _DAT_7ffc3ebc2878 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
              pvVar4 = _DAT_7ffc3ebc2878;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27e1e99729dfda25);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar15);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar7);
                FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc2880 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                    lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
                    if ((lVar5 != 0) &&
                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                       pvVar4 != (void *)0x0)) {
                      _DAT_7ffc3ebc2880 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc2880;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0x27e1e99729dfda25);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar15);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc2888 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                        lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
                        if ((lVar5 != 0) &&
                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                           pvVar7 != (void *)0x0)) {
                          _DAT_7ffc3ebc2888 = (*(*env)->NewGlobalRef)(env,pvVar7);
                        }
                      }
                      pvVar7 = _DAT_7ffc3ebc2888;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x27e2dd2dfe2283f4);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar15);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar10);
                        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc2890 == (void *)0x0) {
                            uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                            uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaadea,uVar9);
                            uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                            uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                            uStack_50 = FUN_7ffc3eb770c0(env,uVar9,6,uVar11,0x7ffc3ebaddf1,
                                                         0x7ffc3ebaeead);
                            uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                            uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaeeb4,uVar9);
                            uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                            lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                                     0x7ffc3eba75b6,0x7ffc3ebaae39,0x7ffc3ebaeeba,
                                                     &uStack_58,3);
                            if ((lVar5 != 0) &&
                               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                               pvVar8 != (void *)0x0)) {
                              _DAT_7ffc3ebc2890 = (*(*env)->NewGlobalRef)(env,pvVar8);
                            }
                          }
                          pvVar8 = _DAT_7ffc3ebc2890;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2e41;
                          pvVar10 = (*(*env)->NewObjectArray)
                                              (env,0,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10)
                          ;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2e41;
                          pvVar10 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2e41;
                          if (pvVar10 == (void *)0x0) goto LAB_7ffc3eae2e27;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                          }
                          if (iVar2 < 3) {
LAB_7ffc3eae2e0d:
                            pJVar13 = *env;
                            pcVar14 = (char *)0x7ffc3eba6019;
                            pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eae2e3b:
                            (*pJVar13->ThrowNew)(env,pvVar3,pcVar14);
                            goto LAB_7ffc3eae2e41;
                          }
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar8);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                          }
                          if (iVar2 < 2) goto LAB_7ffc3eae2e0d;
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
                          lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                          if (lVar5 == 0) goto LAB_7ffc3eae2f09;
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar5,
                                                            uVar15 ^ 0x6b221d10cd55);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2f09;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                          }
                          if (iVar2 < 1) {
LAB_7ffc3eae2ed5:
                            pJVar13 = *env;
                            pcVar14 = (char *)0x7ffc3eba6019;
                            pvVar3 = pvRam00007ffc3ebc0a98;
                            goto LAB_7ffc3eae2f03;
                          }
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
                          if (_DAT_7ffc3ebc2898 == (void *)0x0) {
                            uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                            lVar12 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                      0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba626f,0
                                                      ,0);
                            if ((lVar12 != 0) &&
                               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                               pvVar7 != (void *)0x0)) {
                              _DAT_7ffc3ebc2898 = (*(*env)->NewGlobalRef)(env,pvVar7);
                            }
                          }
                          pvVar7 = _DAT_7ffc3ebc2898;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2f09;
                          pvVar8 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x27e54910da491c38)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar15);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
                          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2e41;
                          if (_DAT_7ffc3ebc28a0 == (void *)0x0) {
                            uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                            lVar12 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                      0x7ffc3eba606c,0x7ffc3ebaeccb,0x7ffc3ebaecce,0
                                                      ,0);
                            if ((lVar12 != 0) &&
                               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                               pvVar4 != (void *)0x0)) {
                              _DAT_7ffc3ebc28a0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                            }
                          }
                          pvVar4 = _DAT_7ffc3ebc28a0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2f09;
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x27e1e99729dfda25)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
                          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar15);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
                          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) goto LAB_7ffc3eae2e41;
                          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x4f);
                          pJVar13 = *env;
                          if (pvVar7 != (void *)0x0) {
                            pvVar8 = (*pJVar13->AllocObject)(env,pvVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) goto LAB_7ffc3eae2e41;
                            if (pvVar8 != (void *)0x0) {
                              lVar12 = FUN_7ffc3eb76c90(env,pvVar7,0x106);
                              if (lVar12 != 0) {
                                FUN_7ffc3e7dbbc0(env,pvVar8,pvVar7,lVar12);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar7 = (*(*env)->NewObjectArray)
                                                     (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    if (pvVar7 == (void *)0x0) goto LAB_7ffc3eae2e27;
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar2 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar7);
                                    }
                                    if (iVar2 < 2) goto LAB_7ffc3eae2e0d;
                                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
                                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                      lVar5,uVar15 ^ 0x76f644b2cece)
                                    ;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar7);
                                      }
                                      if (iVar2 < 1) goto LAB_7ffc3eae2e0d;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar8);
                                      if (_DAT_7ffc3ebc28a8 == (void *)0x0) {
                                        uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                        lVar12 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,
                                                                  0x7ffc3eba6478,0x7ffc3eba606c,
                                                                  0x7ffc3eba74db,0x7ffc3eba626f,0,0)
                                        ;
                                        if ((lVar12 != 0) &&
                                           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar12,
                                                                              uRam00007ffc3ebc0a00),
                                           pvVar8 != (void *)0x0)) {
                                          _DAT_7ffc3ebc28a8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                        }
                                      }
                                      pvVar8 = _DAT_7ffc3ebc28a8;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar10 = (*(*env)->NewObjectArray)
                                                            (env,4,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
                                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          0x27e2abd7dca91cee);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
                                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          uVar15);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
                                        FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) goto LAB_7ffc3eae2f09;
                                        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x68);
                                        pJVar13 = *env;
                                        if (pvVar4 == (void *)0x0) goto LAB_7ffc3eae2f0f;
                                        pvVar7 = (*pJVar13->AllocObject)(env,pvVar4);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          if (pvVar7 == (void *)0x0) goto LAB_7ffc3eae2e27;
                                          lVar12 = FUN_7ffc3eb76c90(env,pvVar4,0x105);
                                          if (lVar12 != 0) {
                                            FUN_7ffc3e7dbbc0(env,pvVar7,pvVar4,lVar12);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 == 0) {
                                              pvVar4 = (*(*env)->NewObjectArray)
                                                                 (env,1,pvRam00007ffc3ebc09e0,
                                                                  (void *)0x0);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 == 0) {
                                                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar5,
                                                  uVar15 ^ 0x1e4e607dd624);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 == 0) {
                                                  if (pvVar4 == (void *)0x0) goto LAB_7ffc3eae2e27;
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (iVar2 < 1) goto LAB_7ffc3eae2e0d;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0,pvVar8);
                                                  if (_DAT_7ffc3ebc28b0 == (void *)0x0) {
                                                    uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                                    lVar12 = FUN_7ffc3eb77170(env,uVar9,6,
                                                                              0x7ffc3ebaec64,
                                                                              0x7ffc3eba6478,
                                                                              0x7ffc3eba606c,
                                                                              0x7ffc3eba74db,
                                                                              0x7ffc3eba626f,0,0);
                                                    if ((lVar12 != 0) &&
                                                       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar12
                                                                                          ,
                                                  uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc28b0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar8);
                                                  }
                                                  }
                                                  pvVar8 = _DAT_7ffc3ebc28b0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar10 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,0,pvVar7);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,1,pvVar4);
                                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27e3102028fa3a7d);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,2,pvVar4);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,3,pvVar4);
                                                  FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                                   pvVar10);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (_DAT_7ffc3ebc28b8 == (void *)0x0) {
                                                      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                                      lVar12 = FUN_7ffc3eb77170(env,uVar9,6,
                                                                                0x7ffc3ebaec64,
                                                                                0x7ffc3eba6478,
                                                                                0x7ffc3eba606c,
                                                                                0x7ffc3ebaeccb,
                                                                                0x7ffc3ebaecce,0,0);
                                                      if ((lVar12 != 0) &&
                                                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar12,uRam00007ffc3ebc0a00),
                                                  pvVar4 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc28b8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc28b8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar8 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar8,0,receiver);
                                                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27e1e99729dfda25);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar8,1,pvVar10);
                                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar8,2,pvVar10);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar8);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar8 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (pvVar8 == (void *)0x0)
                                                      goto LAB_7ffc3eae2e27;
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar8 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar8);
                                                      }
                                                      if (1 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar8,1,pvVar7);
                                                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar5,
                                                  uVar15 ^ 0x76f644b2cece);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar8 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                    }
                                                    if (iVar2 < 1) goto LAB_7ffc3eae2ed5;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar8,0,pvVar7);
                                                    if (_DAT_7ffc3ebc28c0 == (void *)0x0) {
                                                      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                                      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,
                                                                               0x7ffc3ebaec64,
                                                                               0x7ffc3eba6478,
                                                                               0x7ffc3eba606c,
                                                                               0x7ffc3eba74db,
                                                                               0x7ffc3eba626f,0,0);
                                                      if ((lVar5 != 0) &&
                                                         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar5,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc28c0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar7);
                                                  }
                                                  }
                                                  pvVar7 = _DAT_7ffc3ebc28c0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar10 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,0,pvVar4);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,1,pvVar8);
                                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27e2abd7dca91cee);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,2,pvVar4);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,3,pvVar4);
                                                  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,
                                                                   pvVar10);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (_DAT_7ffc3ebc28c8 == (void *)0x0) {
                                                      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                                      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,
                                                                               0x7ffc3ebaec64,
                                                                               0x7ffc3eba6478,
                                                                               0x7ffc3eba606c,
                                                                               0x7ffc3eba74db,
                                                                               0x7ffc3ebaeeda,0,0);
                                                      if ((lVar5 != 0) &&
                                                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc28c8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc28c8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,4,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar3);
                                                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,1);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar3);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27f9165bc9e84fa7);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar3);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,3,pvVar3);
                                                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,
                                                                   pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (_DAT_7ffc3ebc28d0 == (void *)0x0) {
                                                      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                                      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,
                                                                               0x7ffc3ebaec64,
                                                                               0x7ffc3eba6478,
                                                                               0x7ffc3eba606c,
                                                                               0x7ffc3ebaeccb,
                                                                               0x7ffc3ebaef12,0,0);
                                                      if ((lVar5 != 0) &&
                                                         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc28d0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar3);
                                                  }
                                                  }
                                                  pvVar3 = _DAT_7ffc3ebc28d0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar4 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0,receiver);
                                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27efaf2a4f876d1a);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,1,pvVar7);
                                                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,2,pvVar7);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar4);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (_DAT_7ffc3ebc28d8 == (void *)0x0) {
                                                      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                                                      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,
                                                                               0x7ffc3ebaec64,
                                                                               0x7ffc3eba6478,
                                                                               0x7ffc3eba606c,
                                                                               0x7ffc3eba74db,
                                                                               0x7ffc3eba743f,0,0);
                                                      if ((lVar5 != 0) &&
                                                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc28d8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc28d8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar3);
                                                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x27e6deab8e4a89a3);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar3);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar3);
                                                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,
                                                                   pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    return;
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  goto LAB_7ffc3eae2f09;
                                                  }
                                                  goto LAB_7ffc3eae2e0d;
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              goto LAB_7ffc3eae2e41;
                            }
LAB_7ffc3eae2e27:
                            pJVar13 = *env;
                            pcVar14 = &DAT_7ffc3eba6000;
                            pvVar3 = pvRam00007ffc3ebc0a70;
                            goto LAB_7ffc3eae2e3b;
                          }
                        }
                        else {
LAB_7ffc3eae2e41:
                          pJVar13 = *env;
                        }
                        pvVar3 = (*pJVar13->ExceptionOccurred)(env);
                        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x66);
                        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
                        goto joined_r0x7ffc3eae2f37;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      goto LAB_7ffc3eae2f09;
    }
  }
  else {
LAB_7ffc3eae2f09:
    pJVar13 = *env;
  }
LAB_7ffc3eae2f0f:
  pvVar3 = (*pJVar13->ExceptionOccurred)(env);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x66);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
joined_r0x7ffc3eae2f37:
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    if (_DAT_7ffc3ebc28e0 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x2c);
      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3ebaeccb,0x7ffc3ebaef3d,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc28e0 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc28e0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x27e18658c6576c1d);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc28e8 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x2c);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba626f,0,0);
          if ((lVar5 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc28e8 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc28e8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x27e1057ce7049ad2);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc28f0 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x2c);
              lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
              if ((lVar5 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc28f0 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc28f0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x27e2dd2dfe2283f4);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar15);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
              pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc28f8 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x2c);
                  lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                           0x7ffc3eba74db,0x7ffc3eba743f,0,0);
                  if ((lVar5 != 0) &&
                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                     pvVar4 != (void *)0x0)) {
                    _DAT_7ffc3ebc28f8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
                pvVar4 = _DAT_7ffc3ebc28f8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x27e4d367951486b5);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar15);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    return;
                  }
                }
              }
            }
            pvVar3 = (*(*env)->ExceptionOccurred)(env);
            pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x66);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
            if (bVar1 != 0) {
              (*(*env)->ExceptionClear)(env);
            }
          }
        }
      }
    }
  }
  return;
}

/* JNI_9l_1_7 | RVA 0x313610 | 9l.1([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_1_7(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  void *arg1;
  undefined8 uVar9;
  ulonglong uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3eae3bc5:
    pJVar4 = *env;
LAB_7ffc3eae3694:
    UNRECOVERED_JUMPTABLE = pJVar4->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (0 < iVar2) {
      pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
      pJVar4 = *env;
      if (pvVar3 == (void *)0x0) goto LAB_7ffc3eae3694;
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar3 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3eae369f;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar5 == 0) {
        return;
      }
      uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2c);
      if (pvVar3 == (void *)0x0) {
        return;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x73);
      if (pvVar7 == (void *)0x0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar10 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar7 + 0x10));
      }
      else {
        uVar10 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2900 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x2c);
        lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
        if ((lVar5 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2900 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2900;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      uVar10 = uVar10 ^ uVar6;
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd1909c1392a72c54);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar5,uVar10 ^ 0x152e8e1ccb8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar7 == (void *)0x0) goto LAB_7ffc3eae3bc5;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar7);
      }
      if (0 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar8);
        if (_DAT_7ffc3ebc2908 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x2c);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba626f,0,0);
          if ((lVar5 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc2908 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc2908;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
        (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar7);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xd1933daffe9454c3);
        (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
        (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
        FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae3b11. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3eae369f:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae36b2. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_9l_4_8 | RVA 0x313c20 | 9l.4([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_4_8(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  void *pvVar6;
  void *pvVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar8;
  ulonglong uVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  longlong lVar15;
  ulonglong uVar16;
  char *pcVar17;
  
  if (arg0 == (void *)0x0) {
    pJVar14 = *env;
LAB_7ffc3eae3d27:
    UNRECOVERED_JUMPTABLE = pJVar14->ThrowNew;
    pcVar17 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3eae3d32;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) {
LAB_7ffc3eae4bf7:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x6a);
    if (pvVar7 == (void *)0x0) {
      return;
    }
    if ((pvVar6 == (void *)0x0) || (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7), bVar1 != 0))
    {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar3 < 2) goto LAB_7ffc3eae4bf7;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar14 = *env;
      if (pvVar7 == (void *)0x0) goto LAB_7ffc3eae3d27;
      bVar1 = (*pJVar14->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar8 == 0) {
          return;
        }
        uVar9 = FUN_7ffc3e7d1a20(env,pvVar7,lVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
        if (pvVar7 == (void *)0x0) {
          return;
        }
        pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x73);
        if (pvVar10 == (void *)0x0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar16 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar10 + 0x10));
        }
        else {
          uVar16 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar10);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc2918 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2c);
          lVar8 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
          if ((lVar8 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc2918 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc2918;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
        uVar16 = uVar16 ^ uVar9;
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x62999918a0329f5d);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
        pvVar10 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar8 == 0))
        goto LAB_7ffc3eae4c7f;
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,uVar16 ^ 0xc0895d06774);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
        if (pvVar10 == (void *)0x0) {
LAB_7ffc3eae4c4b:
          pJVar14 = *env;
          pcVar17 = &DAT_7ffc3eba6000;
          pvVar6 = pvRam00007ffc3ebc0a70;
        }
        else {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
          }
          if (0 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
            if (_DAT_7ffc3ebc2920 == (void *)0x0) {
              uVar13 = FUN_7ffc3eb76c30(env,0x2c);
              lVar15 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3eba74db,0x7ffc3eba626f,0,0);
              if ((lVar15 != 0) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar15,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc2920 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
            }
            pvVar11 = _DAT_7ffc3ebc2920;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
            pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x629f67e45aac93df);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
            FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
            if (_DAT_7ffc3ebc2928 == (void *)0x0) {
              uVar13 = FUN_7ffc3eb76c30(env,0x2c);
              lVar15 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
              if ((lVar15 != 0) &&
                 (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar15,uRam00007ffc3ebc0a00),
                 pvVar7 != (void *)0x0)) {
                _DAT_7ffc3ebc2928 = (*(*env)->NewGlobalRef)(env,pvVar7);
              }
            }
            pvVar7 = _DAT_7ffc3ebc2928;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x62999918a0329f5d);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
            pvVar10 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,
                                               uVar16 ^ 0x3546941ba604);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eae4c7f;
            if (pvVar10 == (void *)0x0) goto LAB_7ffc3eae4c4b;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
            }
            if (0 < iVar3) {
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
              if (_DAT_7ffc3ebc2930 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0x2c);
                lVar8 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3eba6245,0,0);
                if ((lVar8 != 0) &&
                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar11 != (void *)0x0)) {
                  _DAT_7ffc3ebc2930 = (*(*env)->NewGlobalRef)(env,pvVar11);
                }
              }
              pvVar11 = _DAT_7ffc3ebc2930;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x629e69c79d73a0f8);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar16);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
                  if (cVar2 != '\0') {
                    return;
                  }
                  if (_DAT_7ffc3ebc2938 == (void *)0x0) {
                    uVar13 = FUN_7ffc3eb76c30(env,0x2c);
                    lVar8 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba64b4,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc2938 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc2938;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x629ecbb5852df95f);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar16);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
                    uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      uVar4 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
                      if (_DAT_7ffc3ebc2940 == (void *)0x0) {
                        uVar13 = FUN_7ffc3eb76c30(env,0x2c);
                        lVar8 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3eba7805,0x7ffc3eba647c,0,0);
                        if ((lVar8 != 0) &&
                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar7 != (void *)0x0)) {
                          _DAT_7ffc3ebc2940 = (*(*env)->NewGlobalRef)(env,pvVar7);
                        }
                      }
                      pvVar7 = _DAT_7ffc3ebc2940;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                           uRam00007ffc3ebc0998,0x278c);
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,
                                                           uVar16 ^ 0xa5f7c253348e24a);
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                        uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          uVar5 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc2948 == (void *)0x0) {
                            uVar13 = FUN_7ffc3eb76c30(env,0x2c);
                            lVar8 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebaec64,0x7ffc3eba6478,
                                                     0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3ebaeeda,0,
                                                     0);
                            if ((lVar8 != 0) &&
                               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                               pvVar7 != (void *)0x0)) {
                              _DAT_7ffc3ebc2948 = (*(*env)->NewGlobalRef)(env,pvVar7);
                            }
                          }
                          pvVar7 = _DAT_7ffc3ebc2948;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                              uRam00007ffc3ebc0998,uVar5 & uVar4);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x628166d440050adf);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar16);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar6);
                            FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              goto LAB_7ffc3eae4c7f;
            }
          }
          pJVar14 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar6 = pvRam00007ffc3ebc0a98;
        }
        (*pJVar14->ThrowNew)(env,pvVar6,pcVar17);
LAB_7ffc3eae4c7f:
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x66);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
        if (bVar1 != 0) {
          (*(*env)->ExceptionClear)(env);
          lVar8 = FUN_7ffc3eb76c30(env,0x2c);
          if ((lVar8 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar8,0x103), lVar15 != 0)) {
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar15,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae4d37. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(*env)->Throw)(env,pvVar6);
              return;
            }
          }
        }
        return;
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar17 = (char *)0x7ffc3eba6033;
    pvVar6 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3eae3d32:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae3d45. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar6,pcVar17);
  return;
}

/* JNI_9l_6_9 | RVA 0x314d40 | 9l.6([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_6_9(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3eae5ff7:
    pJVar5 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) goto LAB_7ffc3eae5fd6;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar5 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3eae6009:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
      }
      else {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (1 < iVar2) {
          pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
          pvVar8 = (void *)FUN_7ffc3eb76c30(env,10);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          if ((pvVar4 != (void *)0x0) &&
             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar8), bVar1 == 0))
          goto LAB_7ffc3eae6009;
          pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x2c);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x73);
          if (pvVar9 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar12 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar9 + 0x10));
          }
          else {
            uVar12 = (*(*env)->GetStaticLongField)(env,pvVar8,pvVar9);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc2960 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2c);
            lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebaeccb,0x7ffc3ebaecce,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc2960 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc2960;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar12 = uVar12 ^ uVar7;
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xa392b31861755e56);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar6 == 0) {
            return;
          }
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar12 ^ 0x33c0de76410b
                                            );
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar9 == (void *)0x0) goto LAB_7ffc3eae5ff7;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar9);
          }
          if (1 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar9);
            }
            if (0 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              if (_DAT_7ffc3ebc2968 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3eba626f,0,0);
                if ((lVar6 != 0) &&
                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar4 != (void *)0x0)) {
                  _DAT_7ffc3ebc2968 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
              pvVar4 = _DAT_7ffc3ebc2968;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar8);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar9);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xa39746c4351e4fd7);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar8);
              FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2970 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3ebaeccb,0x7ffc3ebaed05,0,0);
                if ((lVar6 != 0) &&
                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar4 != (void *)0x0)) {
                  _DAT_7ffc3ebc2970 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
              pvVar4 = _DAT_7ffc3ebc2970;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xa39187a2b6880787);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2978 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3ebaeccb,0x7ffc3ebaee30,0,0);
                if ((lVar6 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc2978 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc2978;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xa394345ee4865a6b);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2980 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3ebaef71,0,0);
                if ((lVar6 != 0) &&
                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar9 != (void *)0x0)) {
                  _DAT_7ffc3ebc2980 = (*(*env)->NewGlobalRef)(env,pvVar9);
                }
              }
              pvVar9 = _DAT_7ffc3ebc2980;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar8);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xa39ded6540d84262);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2988 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3eba64b4,0,0);
                if ((lVar6 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc2988 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc2988;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xa395e1b5446a3854);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              uVar11 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              uVar3 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
              if (_DAT_7ffc3ebc2990 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3ebaeeda,0,0);
                if ((lVar6 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc2990 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc2990;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                uVar3 | 4);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xa38a4cd48142cbd4);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
              FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2998 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3ebaeccb,0x7ffc3ebaee30,0,0);
                if ((lVar6 != 0) &&
                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar4 != (void *)0x0)) {
                  _DAT_7ffc3ebc2998 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
              pvVar4 = _DAT_7ffc3ebc2998;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xa394345ee4865a6b);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc29a0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2c);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec64,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3ebaee30,0,0);
                if ((lVar6 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc29a0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc29a0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xa3938d209f6c6f63);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
              FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae5a67. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(*env)->ExceptionCheck)(env);
              return;
            }
          }
        }
LAB_7ffc3eae5fd6:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar4 = pvRam00007ffc3ebc0a98;
      }
      goto LAB_7ffc3eae4dd2;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar5->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eae4dd2:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae4de5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_9l_8_10 | RVA 0x316030 | 9l.8(Ljava/lang/Throwable;)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_8_10(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return;
}

/* JNI_9l_3_11 | RVA 0x316040 | 9l.3()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_3_11(JNINativeInterface_ **env,void *receiver)

{
  return;
}

/* JNI_9l_4_12 | RVA 0x316050 | 9l.4(I)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_4_12(JNINativeInterface_ **env,void *receiver,int arg0)

{
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (arg1 != (void *)0x0) {
    arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0x74);
    if (arg2 != (void *)0x0) {
      (*(*env)->SetStaticIntField)(env,arg1,arg2,arg0);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eae60a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  return;
}

/* JNI_9l_0_13 | RVA 0x3160c0 | 9l.0()I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_9l_0_13(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if ((arg1 != (void *)0x0) && (arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0x74), arg2 != (void *)0x0)
     ) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg1 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)arg2 + 0x10));
    }
    else {
      iVar2 = (*(*env)->GetStaticIntField)(env,arg1,arg2);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      return iVar2;
    }
  }
  return 0;
}

/* JNI_9l_4_14 | RVA 0x316140 | 9l.4()I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_9l_4_14(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  int iVar5;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x2c);
  iVar5 = 0;
  if (lVar3 != 0) {
    lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x107);
    iVar5 = 0;
    if (lVar4 != 0) {
      iVar2 = FUN_7ffc3e7db1e0(env,lVar3,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        iVar5 = (uint)(iVar2 == 0) << 6;
      }
    }
  }
  return iVar5;
}

/* JNI_9l_a_15 | RVA 0x3161b0 | 9l.a(Ljava/io/IOException;)Ljava/io/IOException; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_a_15(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_9l_a_16 | RVA 0x3161c0 | 9l.a(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_9l_a_16(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  int iVar6;
  void *pvVar7;
  void *pvVar8;
  void *pvVar9;
  longlong lVar10;
  longlong lVar11;
  undefined8 uVar12;
  void *pvVar13;
  void *pvVar14;
  void *pvVar15;
  JNINativeInterface_ *pJVar16;
  uint arg2;
  char *pcVar17;
  byte *pbVar18;
  byte abStack_50 [8];
  undefined8 uStack_48;
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x75);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eae7a62;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x2756, iVar6 <= (int)arg2)) {
LAB_7ffc3eae7a48:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3eae7a76;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3eae7939:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x75);
    if (pvVar8 == (void *)0x0) {
      return 0;
    }
    pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    if (pvVar7 != (void *)0x0) {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
      }
      if (iVar6 <= (int)arg2) goto LAB_7ffc3eae7a48;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,arg2);
      if (pvVar7 != (void *)0x0) {
        lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,8);
        if (lVar10 == 0) {
          return 0;
        }
        iVar6 = FUN_7ffc3e7d8be0(env,pvVar7,lVar10);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
          return 0;
        }
        return iVar6;
      }
    }
    goto LAB_7ffc3eae7a62;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eae7a62;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6382;
LAB_7ffc3eae6348:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6348;
LAB_7ffc3eae6382:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae640e;
LAB_7ffc3eae63d1:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae63d1;
LAB_7ffc3eae640e:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae649a;
LAB_7ffc3eae645d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae645d;
LAB_7ffc3eae649a:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6526;
LAB_7ffc3eae64e9:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae64e9;
LAB_7ffc3eae6526:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae65b1;
LAB_7ffc3eae6574:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6574;
LAB_7ffc3eae65b1:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae663c;
LAB_7ffc3eae65ff:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae65ff;
LAB_7ffc3eae663c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae66c7;
LAB_7ffc3eae668a:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae668a;
LAB_7ffc3eae66c7:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x76);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3eae7a62;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3eae7a48;
  if (bRam00007ffc3ebc08e5 == 1) {
    pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08ec + (ulonglong)arg2 * 8 +
                      *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc));
  }
  else {
    pbVar18 = abStack_50;
    (*(*env)->GetLongArrayRegion)(env,pvVar9,arg2,1,(longlong *)pbVar18);
  }
  lVar10 = *(longlong *)pbVar18;
  pvVar9 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3eae7a62;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae68d7;
LAB_7ffc3eae689d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae689d;
LAB_7ffc3eae68d7:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6963;
LAB_7ffc3eae6926:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6926;
LAB_7ffc3eae6963:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae69ef;
LAB_7ffc3eae69b2:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae69b2;
LAB_7ffc3eae69ef:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6a7b;
LAB_7ffc3eae6a3e:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6a3e;
LAB_7ffc3eae6a7b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6b06;
LAB_7ffc3eae6ac9:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6ac9;
LAB_7ffc3eae6b06:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6b91;
LAB_7ffc3eae6b54:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6b54;
LAB_7ffc3eae6b91:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eae6c1c;
LAB_7ffc3eae6bdf:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eae6bdf;
LAB_7ffc3eae6c1c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3eae7a48;
  abStack_50[0] = (byte)lVar10;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,7,1,abStack_50);
  }
  lVar10 = FUN_7ffc3eb76c30(env,0x10);
  if (lVar10 == 0) {
    return 0;
  }
  lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x11);
  if (lVar11 == 0) {
    return 0;
  }
  lVar11 = FUN_7ffc3e7d1a80(env,lVar10,lVar11);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (lVar11 != 0) {
    lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x12);
    if (lVar10 == 0) {
      return 0;
    }
    uVar12 = FUN_7ffc3e7d1a20(env,lVar11,lVar10);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar10 == 0) {
      return 0;
    }
    uVar12 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar10,uVar12);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x77);
    if (pvVar13 == (void *)0x0) {
      return 0;
    }
    pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar13);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    if (pvVar7 != (void *)0x0) {
      lVar10 = FUN_7ffc3eb76c30(env,0x11);
      if (lVar10 == 0) {
        return 0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x13);
      if (lVar10 == 0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,lVar10,uVar12);
      bVar4 = (*(*env)->ExceptionCheck)(env);
      if (bVar4 != 0) {
        return 0;
      }
      pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x12);
      if (pvVar13 == (void *)0x0) {
        return 0;
      }
      if (pvVar7 == (void *)0x0) {
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
LAB_7ffc3eae7301:
          pJVar16 = *env;
          goto LAB_7ffc3eae7307;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3eae7301;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3eae7301;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3eae72e7;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3eae7a81:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3eae72fb;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3eae7301;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3eae7301;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3eae7a81;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3eae7307;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3eae72e7;
            lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x16);
            if (lVar10 != 0) {
              FUN_7ffc3e7dbbc0(env,pvVar15,pvVar13,lVar10,pvVar14);
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 == 0) {
                if (bRam00007ffc3ebc08e5 == 1) {
                  iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                }
                if (iVar6 < 3) goto LAB_7ffc3eae7a81;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x2c);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0x77);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3eae730a;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3eae72e7;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3eae71f2;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eae7301;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3eae7a76;
        }
LAB_7ffc3eae71f2:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3eae72e7:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eae72fb:
              (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
            }
            else {
              lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x19);
              if (lVar10 != 0) {
                FUN_7ffc3e7dbbc0(env,pvVar15,pvVar13,lVar10,pvVar8);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 == 0) {
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                  }
                  if (iVar6 < 2) goto LAB_7ffc3eae7a81;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3eae72e7;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3eae7a9e;
                    lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x1a);
                    if (lVar10 != 0) {
                      uVar12 = FUN_7ffc3e7d1a50(env,pvVar8,lVar10,pvVar15);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) {
                        if (bRam00007ffc3ebc08e5 == 1) {
                          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                        }
                        if (iVar6 < 1) goto LAB_7ffc3eae7a81;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3eae7a9e:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3eae72fb;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3eae7a81;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3eae7a9e;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3eae72e7;
                            lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x1b);
                            if (lVar10 != 0) {
                              FUN_7ffc3e7e1940(env,pvVar8,lVar10,2,uVar12,pvVar7);
                              bVar4 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar4 == 0) &&
                                 (lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x1d), lVar10 != 0)) {
                                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,lVar10,pvVar9);
                                bVar4 = (*(*env)->ExceptionCheck)(env);
                                if (bVar4 == 0) {
                                  if (pvVar7 != (void *)0x0) {
                                    if (bRam00007ffc3ebc08e5 == 1) {
                                      iVar6 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                    }
                                    if (4 < iVar6) {
                                      if (bRam00007ffc3ebc08e5 == 1) {
                                        pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                           *(longlong *)
                                                            ((ulonglong)pvVar7 & 0xfffffffffffffffc)
                                                          + 4);
                                      }
                                      else {
                                        pbVar18 = abStack_50;
                                        (*(*env)->GetByteArrayRegion)(env,pvVar7,4,1,pbVar18);
                                      }
                                      bVar4 = *pbVar18;
                                      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                        iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                      }
                                      else {
                                        iVar6 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      if (5 < iVar6) {
                                        if (bRam00007ffc3ebc08e5 == 1) {
                                          pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                             *(longlong *)
                                                              ((ulonglong)pvVar7 &
                                                              0xfffffffffffffffc) + 5);
                                        }
                                        else {
                                          pbVar18 = abStack_50;
                                          (*(*env)->GetByteArrayRegion)(env,pvVar7,5,1,pbVar18);
                                        }
                                        bVar1 = *pbVar18;
                                        if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                        }
                                        else {
                                          iVar6 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar7 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        if (6 < iVar6) {
                                          if (bRam00007ffc3ebc08e5 == 1) {
                                            pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                               *(longlong *)
                                                                ((ulonglong)pvVar7 &
                                                                0xfffffffffffffffc) + 6);
                                          }
                                          else {
                                            pbVar18 = abStack_50;
                                            (*(*env)->GetByteArrayRegion)(env,pvVar7,6,1,pbVar18);
                                          }
                                          bVar2 = *pbVar18;
                                          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                          }
                                          else {
                                            iVar6 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar7 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          if (7 < iVar6) {
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                 *(longlong *)
                                                                  ((ulonglong)pvVar7 &
                                                                  0xfffffffffffffffc) + 7);
                                            }
                                            else {
                                              pbVar18 = abStack_50;
                                              (*(*env)->GetByteArrayRegion)(env,pvVar7,7,1,pbVar18);
                                            }
                                            bVar3 = *pbVar18;
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x75);
                                            if (pvVar8 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar7 = (*(*env)->GetStaticObjectField)
                                                               (env,pvVar7,pvVar8);
                                            bVar5 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar5 != 0) {
                                              return 0;
                                            }
                                            lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                                            if (lVar10 == 0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,lVar10,
                                                  (uint)CONCAT11(bVar2,bVar3) |
                                                  (uint)bVar1 << 0x10 | (uint)bVar4 << 0x18);
                                            bVar4 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar4 != 0) {
                                              return 0;
                                            }
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3eae7a62;
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              iVar6 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar7 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                            }
                                            if ((int)arg2 < iVar6) {
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar7,arg2,pvVar8);
                                              goto LAB_7ffc3eae7939;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3eae7a48;
                                  }
                                  goto LAB_7ffc3eae7a62;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eae7301;
        }
LAB_7ffc3eae7307:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3eae730a:
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
      if (bVar4 == 0) {
        return 0;
      }
      (*(*env)->ExceptionClear)(env);
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x16);
      if (pvVar8 == (void *)0x0) {
        return 0;
      }
      pvVar9 = (*(*env)->AllocObject)(env,pvVar8);
      bVar4 = (*(*env)->ExceptionCheck)(env);
      if (bVar4 != 0) {
        return 0;
      }
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaec64);
      if (pvVar9 != (void *)0x0) {
        lVar10 = FUN_7ffc3eb76c90(env,pvVar8,0x18);
        if (lVar10 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(env,pvVar9,pvVar8,lVar10,pvVar13,pvVar7);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
          return 0;
        }
        (*(*env)->Throw)(env,pvVar9);
        return 0;
      }
    }
  }
LAB_7ffc3eae7a62:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eae7a76:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_9l_a_17 | RVA 0x317af0 | 9l.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_9l_a_17(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,void *arg3
               )

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  JNINativeInterface_ *pJVar7;
  undefined8 uVar8;
  longlong lVar9;
  void *pvVar10;
  ulonglong uVar11;
  char *arg2_00;
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3eae800d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3eae7ff0;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3eae801f:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eae7c37;
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
    if (lVar6 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg3);
    }
    if (iVar3 < 2) goto LAB_7ffc3eae7ff0;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3eae7c30;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3eae801f;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x2c);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x109);
    if (lVar9 == 0) {
      return 0;
    }
    iVar3 = FUN_7ffc3e7db1e0(env,lVar6,lVar9,uVar2,uVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
    if (pvVar5 == (void *)0x0) {
      return 0;
    }
    pvVar10 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
    if (lVar6 == 0) {
      return 0;
    }
    uVar11 = FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar6,iVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x20);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,pvVar10,uVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar10 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
      }
      if (0 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6);
        if (pvVar5 == (void *)0x0) {
          return 0;
        }
        pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
        }
        if (1 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
          lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
          if (lVar6 == 0) {
            return 0;
          }
          uVar8 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,uVar8,uVar11 & 0xffffffff00000000,
                                   pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (arg1 != (void *)0x0) {
            lVar6 = FUN_7ffc3eb76c30(env,0x18);
            if (lVar6 == 0) {
              return 0;
            }
            lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x22);
            if (lVar6 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(env,arg1,lVar6,uVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            return iVar3;
          }
          goto LAB_7ffc3eae800d;
        }
      }
LAB_7ffc3eae7ff0:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eae7c37;
    }
LAB_7ffc3eae800d:
    pJVar7 = *env;
  }
LAB_7ffc3eae7c30:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eae7c37:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_9l_a_18 | RVA 0x318040 | 9l.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_a_18(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  undefined8 uVar1;
  byte bVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *arg1_00;
  void *pvVar15;
  void *pvVar16;
  longlong lVar17;
  char *arg2_00;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x18);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eae890b;
  lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0x23);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  pvVar8 = arg2;
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar7,arg2);
  uVar20 = (undefined4)((ulonglong)pvVar8 >> 0x20);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (_DAT_7ffc3ebc0b10 == (void *)0x0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09a0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvRam00007ffc3ebc0a90);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x18);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvRam00007ffc3ebc09e8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    uVar9 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc0928,
                             pvVar5);
    uVar1 = uRam00007ffc3ebc0a88;
    uVar13 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)pvVar5 >> 0x20);
    uVar10 = FUN_7ffc3eb76c30(env,0x2c);
    uVar11 = FUN_7ffc3eb76c30(env,0x2c);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b10 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b10;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eae8573:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eae85a1:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eae8573;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eae8573;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (2 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,arg1);
                      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x26);
                      if (lVar7 != 0) {
                        uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,
                                                  uVar19 & 0xffffffff00000000,pvVar5);
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if ((bVar2 == 0) &&
                           (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27), lVar7 != 0)) {
                          uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,arg2,
                                                    pvVar5);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             ((lVar7 = FUN_7ffc3eb76c30(env,0x18), lVar7 != 0 &&
                              (lVar7 = FUN_7ffc3eb76c90(env,lVar7,0x22), lVar7 != 0)))) {
                            FUN_7ffc3e7e1940(env,pvVar6,lVar7,uVar13);
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if (bVar2 == 0) {
                              return pvVar6;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3eae85a7;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eae85a1;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eae85a7:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar2 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar2 == 0) {
    return (void *)0x0;
  }
  (*(*env)->ExceptionClear)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (*(*env)->AllocObject)(env,pvVar6);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  arg1_00 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (arg1_00 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar15 = (*(*env)->AllocObject)(env,arg1_00);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar15 != (void *)0x0) {
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x28);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar15,arg1_00,lVar7);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaec64);
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x29);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3e7d1a50(env,pvVar15,lVar7,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return (void *)0x0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,arg1);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          if (arg2 != (void *)0x0) {
            lVar17 = FUN_7ffc3eb76c30(env,0x19);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            lVar17 = FUN_7ffc3eb76c90(env,lVar17,0x2a);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            uVar13 = FUN_7ffc3e7d1a50(env,arg2,lVar17);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (lVar12 != 0) {
              lVar7 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,uVar13);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              if (lVar7 != 0) {
                lVar12 = FUN_7ffc3eb76c90(env,arg1_00,0x2b);
                if (lVar12 == 0) {
                  return (void *)0x0;
                }
                uVar13 = FUN_7ffc3e7d1a50(env,lVar7,lVar12);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (pvVar8 != (void *)0x0) {
                  lVar7 = FUN_7ffc3eb76c90(env,pvVar6,0x18);
                  if (lVar7 == 0) {
                    return (void *)0x0;
                  }
                  FUN_7ffc3e7dbbc0(env,pvVar8,pvVar6,lVar7,uVar13,pvVar5);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 != 0) {
                    return (void *)0x0;
                  }
                  (*(*env)->Throw)(env,pvVar8);
                  return (void *)0x0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eae890b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_9l_a_19 | RVA 0x318930 | 9l.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_9l_a_19(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  JNINativeInterface_ **ppJVar1;
  byte bVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  uint *puVar8;
  JNINativeInterface_ *pJVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  longlong lVar12;
  uint arg2;
  char *pcVar13;
  undefined4 uVar14;
  uint uVar15;
  undefined8 uStack_98;
  int iStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_78;
  undefined4 uStack_74;
  longlong lStack_70;
  uint uStack_5c;
  JNINativeInterface_ **ppJStack_58;
  longlong *plStack_50;
  undefined8 uStack_48;
  
  uStack_78 = 0x30;
  uStack_80 = (void *)(arg1 << 0x30 | arg1);
  uVar11 = (ulonglong)uStack_80 ^ arg0;
  uStack_88 = (void *)CONCAT44(uStack_88._4_4_,0x2e);
  uVar15 = (uint)(uVar11 >> 0x20);
  uVar3 = uVar15 >> 0xe;
  uStack_98 = CONCAT44(uStack_98._4_4_,uVar3);
  lStack_70 = arg1;
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x78);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3eae9284:
    pJVar9 = *env;
    pcVar13 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (bRam00007ffc3ebc08e5 == 1) {
      iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
    }
    if ((int)uVar3 < iVar5) {
      pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,uVar3);
      uVar10 = uStack_98;
      if (pvVar6 != (void *)0x0) {
LAB_7ffc3eae8a44:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2c);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x79);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3eae9284;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
      }
      if ((int)uVar3 < iVar5) {
        ppJStack_58 = (*(*env)->GetObjectArrayElement)(env,pvVar6,uVar3);
        if ((ppJStack_58 != (JNINativeInterface_ **)0x0) &&
           (bVar2 = (*(*env)->IsInstanceOf)(env,ppJStack_58,pvRam00007ffc3ebc09e8), bVar2 != 0)) {
          uStack_48 = uStack_98;
          iVar5 = *(int *)(&UNK_7ffc3eb9abb0 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
          pvVar6 = (*(*env)->NewIntArray)(env,6);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return 0;
          }
          plStack_50 = (longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc);
          uVar15 = 0;
          lVar12 = 0x23;
          do {
            uVar3 = ((uint)(uVar11 >> ((byte)lVar12 & 0x3f)) & 0x7f) - iVar5;
            uStack_80 = (void *)0x7f;
            uVar14 = (undefined4)((ulonglong)pvVar6 >> 0x20);
            uStack_88 = (void *)CONCAT44(uVar14,(uVar3 >> 0x18 & 0xffffff80) + uVar3);
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eae922e;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3eae9214;
            if (bRam00007ffc3ebc08e5 == 1) {
              *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar15 * 4) = (int)uStack_88;
            }
            else {
              (*(*env)->SetIntArrayRegion)(env,pvVar6,uVar15,1,(int *)&uStack_88);
            }
            ppJVar1 = ppJStack_58;
            uVar15 = uVar15 + 1;
            lVar12 = lVar12 + -7;
          } while (lVar12 != -7);
          bVar2 = (*(*env)->IsInstanceOf)(env,ppJStack_58,pvRam00007ffc3ebc09e8);
          if (bVar2 == 0) {
            pJVar9 = *env;
            pcVar13 = (char *)0x7ffc3eba6033;
            pvVar6 = pvRam00007ffc3ebc0a58;
          }
          else {
            if (ppJVar1 != (JNINativeInterface_ **)0x0) {
              lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x2d);
              if (lVar12 == 0) {
                return 0;
              }
              pvVar7 = (void *)FUN_7ffc3e7d1a50(env,ppJVar1);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return 0;
              }
              uStack_98._0_4_ = SUB84(pvVar7,0);
              uStack_98._4_4_ = (undefined4)((ulonglong)pvVar7 >> 0x20);
              if (pvVar7 != (void *)0x0) {
                uVar15 = 0;
                ppJStack_58 = env;
                bVar2 = bRam00007ffc3ebc08e5;
                do {
                  if ((bVar2 & 1) == 0) {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar7);
                  }
                  else {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  if (iVar5 <= (int)uVar15) {
LAB_7ffc3eae90ae:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2c);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x78), uVar10 = uStack_48,
                       pvVar7 != (void *)0x0)) {
                      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 == 0) {
                        uStack_88 = (*(*env)->AllocObject)(env,pvRam00007ffc3ebc09e8);
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if (bVar2 == 0) {
                          uStack_80 = uStack_88;
                          uStack_78 = (undefined4)uStack_98;
                          uStack_74 = uStack_98._4_4_;
                          if (uStack_88 != (void *)0x0) {
                            lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x2e);
                            if (lVar12 == 0) {
                              return 0;
                            }
                            FUN_7ffc3e7dbbc0(env,uStack_80,pvRam00007ffc3ebc09e8,lVar12,
                                             CONCAT44(uStack_74,uStack_78));
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if (bVar2 != 0) {
                              return 0;
                            }
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eae9284;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3eae924f;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3eae8a44;
                          }
                          break;
                        }
                      }
                    }
                    return 0;
                  }
                  if (bRam00007ffc3ebc08e5 == 0) {
                    uStack_88 = pvVar6;
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                    uStack_88 = (void *)CONCAT44(uStack_88._4_4_,iVar5);
                    uVar3 = 0;
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3eae8e5d;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3eae8e5d:
                    uVar3 = (int)uVar15 % iVar5;
                  }
                  if (pvVar6 == (void *)0x0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                  }
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3eae9214;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3eae90ae;
                  uStack_80 = (void *)CONCAT44(uStack_98._4_4_,uVar15);
                  uStack_88 = pvVar7;
                  if (pvVar7 == (void *)0x0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                    arg2 = uVar15;
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar7);
                    arg2 = (uint)uStack_80;
                  }
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3eae9214;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)arg2 * 2 +
                                     *(longlong *)((ulonglong)uStack_88 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetCharArrayRegion)(env,uStack_88,arg2,1,(ushort *)puVar8);
                  }
                  env = ppJStack_58;
                  uStack_80 = (void *)CONCAT44(uVar14,uVar3);
                  uStack_88 = (void *)CONCAT44(uStack_88._4_4_,
                                               uVar3 & 0xffff ^ (uint)(ushort)*puVar8);
                  if (pvVar7 == (void *)0x0) {
                    pJVar9 = *ppJStack_58;
                    pcVar13 = &DAT_7ffc3eba6000;
                    pvVar6 = pvRam00007ffc3ebc0a70;
                    goto LAB_7ffc3eae9245;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3eae9214;
                  uStack_5c._0_2_ = (undefined2)uStack_88;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    *(undefined2 *)
                     (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar15 * 2) =
                         (undefined2)uStack_88;
                  }
                  else {
                    (*(*env)->SetCharArrayRegion)(env,pvVar7,uVar15,1,(ushort *)&uStack_5c);
                    bVar2 = bRam00007ffc3ebc08e5;
                  }
                  uVar15 = uVar15 + 1;
                } while (pvVar7 != (void *)0x0);
              }
            }
LAB_7ffc3eae922e:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3eae9245;
        }
        goto LAB_7ffc3eae8a44;
      }
    }
LAB_7ffc3eae924f:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3eae9214:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eae9245:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_9l_a_20 | RVA 0x3192d0 | 9l.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_9l_a_20(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  void *pvVar5;
  void *pvVar6;
  void *pvVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x79);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaefba);
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3eaeb1d8:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (0 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaefbd);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0960,0xc);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0960,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (2 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x78);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65aa);
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaeb1d8;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if (2 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar7);
            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaefd1);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (3 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaefd4);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (4 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaefef);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (5 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf010);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (6 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                    pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
                    if (pvVar6 == (void *)0x0) {
                      return;
                    }
                    pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar6);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (7 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
                      if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaeb1d8;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                      }
                      if (7 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar6,7,pvVar7);
                        pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf02f);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                        }
                        if (8 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                          pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf042);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                          }
                          if (9 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,9,pvVar6);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf05e);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (10 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf072);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                              }
                              if (0xb < iVar2) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar4,0xb,pvVar6);
                                pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a08,0xd);
                                if (pvVar6 == (void *)0x0) {
                                  return;
                                }
                                pvVar6 = (*(*env)->GetStaticObjectField)
                                                   (env,pvRam00007ffc3ebc0a08,pvVar6);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  return;
                                }
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar2 = *(int *)(*(longlong *)
                                                    ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                }
                                if (0xc < iVar2) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0xc,pvVar6);
                                  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
                                  if (pvVar3 == (void *)0x0) goto LAB_7ffc3eaeb1d8;
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar2 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                                  }
                                  if (0xc < iVar2) {
                                    (*(*env)->SetObjectArrayElement)(env,pvVar3,0xc,pvVar5);
                                    pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf086);
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar2 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                    }
                                    if (0xd < iVar2) {
                                      (*(*env)->SetObjectArrayElement)(env,pvVar4,0xd,pvVar3);
                                      pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf097);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                      }
                                      if (0xe < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0xe,pvVar3);
                                        pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaf09a)
                                        ;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                        }
                                        if (0xf < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0xf,pvVar3);
                                          pvVar3 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3ebaf0ae);
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar2 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar4 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                          }
                                          if (0x10 < iVar2) {
                                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0x10,pvVar3)
                                            ;
                                            pvVar3 = (*(*env)->NewStringUTF)
                                                               (env,(char *)0x7ffc3ebaf0c2);
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar2 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar4 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                            }
                                            if (0x11 < iVar2) {
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar4,0x11,pvVar3);
                                              pvVar3 = (*(*env)->NewStringUTF)
                                                                 (env,(char *)0x7ffc3ebaf0d6);
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar4 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                              }
                                              if (0x12 < iVar2) {
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar4,0x12,pvVar3);
                                                pvVar3 = (*(*env)->NewStringUTF)
                                                                   (env,(char *)0x7ffc3ebaf0ea);
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar4 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                }
                                                if (0x13 < iVar2) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0x13,pvVar3);
                                                  pvVar3 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3ebaf0fd);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x14 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x14,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf111);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x15 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x15,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf128
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x16 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x16,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf136);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x17 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x17,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf14a);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x18 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x18,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf15b
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x19 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x19,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf16f);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x1a < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1a,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf193);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x1b < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1b,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf1ab
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x1c < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1c,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf1c3);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x1d < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1d,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf1ed);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x1e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1e,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf209
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x1f < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1f,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf232);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x20 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x20,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf257);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x21 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x21,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf280
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x22 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x22,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf297);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x23 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x23,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf2af);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x24 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x24,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf2cd
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x25 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x25,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf2f1);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x26 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x26,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf30f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x27 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x27,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf32f
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x28 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x28,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf353);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x29 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x29,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf377);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x2a < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2a,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf399
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x2b < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2b,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf3b5);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x2c < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2c,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf3d8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x2d < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2d,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf40e
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x2e < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2e,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf426);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x2f < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2f,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf44b);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x30 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x30,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf46e
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x31 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x31,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf493);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x32 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x32,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf4b8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x33 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x33,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf4d6
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x34 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x34,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf4fa);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x35 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x35,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf51d);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x36 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x36,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf53a
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x37 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x37,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf559);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x38 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x38,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf572);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x39 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x39,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf595
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x3a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x3a,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf5b4);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x3b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x3b,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf5cc);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x3c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x3c,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf5e8
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x3d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x3d,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf60b);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x3e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x3e,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf626);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x3f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x3f,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaf649
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x40 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x40,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaf681);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x41 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x41,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaf6af);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x42 < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eaeb193. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x42,pvVar3);
                                                      return;
                                                    }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eaeb1c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_9l_b_21 | RVA 0x31b200 | 9l.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_b_21(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  byte bVar1;
  int arg2;
  int iVar2;
  void *pvVar3;
  longlong lVar4;
  void *pvVar5;
  void *pvVar6;
  JNINativeInterface_ *pJVar7;
  undefined8 uVar8;
  char *pcVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0x10a);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x79);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar3 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
    }
    if ((arg2 < 0) || (iVar2 <= arg2)) {
      pJVar7 = *env;
      pcVar9 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eaeb6a6;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,arg2);
    if (pvVar3 == (void *)0x0) {
      return (void *)0x0;
    }
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09e8);
    if (bVar1 == 0) {
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09a0);
      if (bVar1 != 0) {
        return pvVar3;
      }
      pJVar7 = *env;
      pcVar9 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eaeb6a6;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2c);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3eaeb56a:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x78);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3eaeb550:
            pJVar7 = *env;
            pcVar9 = &DAT_7ffc3eba6000;
            pvVar3 = pvRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
            }
            if (arg2 < iVar2) {
              pvVar5 = (*(*env)->GetObjectArrayElement)(env,pvVar5,arg2);
              lVar4 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x30);
              if (lVar4 != 0) {
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09a0,lVar4,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x79);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaeb54a;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3eaeb550;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                    }
                    if (arg2 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar3,arg2,pvVar5);
                      return pvVar5;
                    }
                    goto LAB_7ffc3eaeb530;
                  }
                }
              }
              goto LAB_7ffc3eaeb56a;
            }
LAB_7ffc3eaeb530:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3eaeb56a;
      }
LAB_7ffc3eaeb54a:
      pvVar3 = (*pJVar7->ExceptionOccurred)(env);
    }
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar5);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    (*(*env)->ExceptionClear)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x16);
    if (pvVar5 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar3 != (void *)0x0) {
      lVar4 = FUN_7ffc3eb76c30(env,8);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x31);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      uVar8 = FUN_7ffc3e7d1a50(env,pvVar3,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar6 != (void *)0x0) {
        lVar4 = FUN_7ffc3eb76c90(env,pvVar5,0x32);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar4,uVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        (*(*env)->Throw)(env,pvVar6);
        return (void *)0x0;
      }
    }
  }
  pJVar7 = *env;
  pcVar9 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaeb6a6:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_9l_a_22 | RVA 0x31b6c0 | 9l.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_a_22(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  void *arg1_00;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  void *arg1_01;
  int arg2_00;
  undefined8 *puVar8;
  char *pcStack_50;
  
  pcStack_50 = &DAT_7ffc3eba6000;
  puVar8 = (undefined8 *)0x7ffc3ebc0a70;
  if (arg0 != (void *)0x0) {
    lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x33);
    if (lVar4 == 0) {
      return (void *)0x0;
    }
    arg1_00 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (arg1_00 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg1_00);
      }
      if (iVar2 < 1) {
        return (void *)0x0;
      }
      pcStack_50 = (char *)0x7ffc3eba6019;
      arg2_00 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,arg1_00);
        }
        if (iVar3 <= arg2_00) break;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg1_00,arg2_00);
        if (pvVar5 == (void *)0x0) {
LAB_7ffc3eaeb921:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eaeb93d;
        }
        lVar4 = FUN_7ffc3eb76c30(env,0x1b);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x34);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3e7d1a50(env,pvVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (lVar6 == 0) goto LAB_7ffc3eaeb921;
        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x35);
        if (lVar7 == 0) {
          return (void *)0x0;
        }
        iVar3 = FUN_7ffc3e7d8be0(env,lVar6,lVar7,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (iVar3 != 0) {
          lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x36);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          arg1_01 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,lVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          bVar1 = (*(*env)->IsSameObject)(env,arg1_01,arg2);
          if (bVar1 != 0) {
            return pvVar5;
          }
        }
        arg2_00 = arg2_00 + 1;
        if (iVar2 == arg2_00) {
          return (void *)0x0;
        }
      }
      puVar8 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3eaeb93d:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_9l_b_23 | RVA 0x31b970 | 9l.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_b_23(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  void *pvVar5;
  void *pvVar6;
  undefined8 *puVar7;
  int arg2_00;
  char *pcStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x2c);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x10b), lVar4 != 0)) {
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,arg0,arg1,arg2);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar5 != (void *)0x0) {
        return pvVar5;
      }
      if (arg0 == (void *)0x0) {
        pcStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return (void *)0x0;
        }
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (pvVar5 == (void *)0x0) {
          return (void *)0x0;
        }
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pcStack_48 = (char *)0x7ffc3eba6019;
        arg2_00 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) break;
          pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,arg2_00);
          lVar3 = FUN_7ffc3eb76c30(env,0x2c);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x10c);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,pvVar6,arg1,arg2);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          arg2_00 = arg2_00 + 1;
          if (pvVar6 != (void *)0x0) {
            return pvVar6;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (*(*env)->ThrowNew)(env,(void *)*puVar7,pcStack_48);
    }
  }
  return (void *)0x0;
}

/* JNI_9l_c_24 | RVA 0x31bba0 | 9l.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_c_24(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  byte bVar1;
  int arg2;
  int iVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  undefined8 uVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  longlong lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *pvVar15;
  void *arg1_00;
  char *arg2_00;
  undefined4 uVar16;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x10a);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x79);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaec8d0;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3eaec8b6;
  pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,arg2);
  if (pvVar6 == (void *)0x0) {
    FUN_7ffc3eb76c30(env,0x1b);
    return (void *)0x0;
  }
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc09e8);
  if (bVar1 == 0) {
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x1b);
    if (pvVar4 == (void *)0x0) {
      return (void *)0x0;
    }
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar4);
    if (bVar1 != 0) {
      return pvVar6;
    }
    pJVar14 = *env;
    arg2_00 = (char *)0x7ffc3eba6033;
    pvVar4 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3eaec8e4;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x78);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
    }
    if (iVar2 <= arg2) {
LAB_7ffc3eaec8b6:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eaec8e4;
    }
    pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,arg2);
    if (pvVar6 != (void *)0x0) {
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3a);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      iVar2 = FUN_7ffc3e7d8be0(env,pvVar6,lVar5,8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3b);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar13 = CONCAT44(uVar16,iVar2);
      uVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5,0,uVar13);
      uVar16 = (undefined4)((ulonglong)uVar13 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0x3c);
      if (lVar8 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar8,uVar7,CONCAT44(uVar16,0x24));
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x10d);
      if (lVar9 == 0) {
        return (void *)0x0;
      }
      uVar16 = 0;
      lVar10 = FUN_7ffc3e7d1a80(env,pvVar4,lVar9,uVar7,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
      if (lVar11 == 0) {
        return (void *)0x0;
      }
      uVar7 = CONCAT44(uVar16,iVar2 + 1);
      iVar3 = FUN_7ffc3e7d8be0(env,pvVar6,lVar11,8,uVar7);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar13 = CONCAT44(uVar16,iVar3);
      uVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5,iVar2 + 1,uVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3f);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5,iVar3 + 1,uVar13);
      uVar16 = (undefined4)((ulonglong)uVar13 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar13 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar8,uVar12,CONCAT44(uVar16,0x24));
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar5 = FUN_7ffc3e7d1a80(env,pvVar4,lVar9,uVar13,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2c);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x10b);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3eaec8d0;
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x38);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,lVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar4 != (void *)0x0) {
          iVar2 = 0;
          while( true ) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (iVar3 <= iVar2) break;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (iVar3 <= iVar2) goto LAB_7ffc3eaec8b6;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x2c);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0x10c);
            if (lVar9 == 0) {
              return (void *)0x0;
            }
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar15,lVar9,pvVar6,uVar7,lVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            iVar2 = iVar2 + 1;
            if (pvVar6 != (void *)0x0) {
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x79);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3eaec8d0;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3eaec8b6;
              pJVar14 = *env;
              goto LAB_7ffc3eaec497;
            }
          }
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x40);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3e7d1a50(env,lVar8,lVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7131);
        if (lVar9 == 0) goto LAB_7ffc3eaec8d0;
        lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x35);
        if (lVar11 == 0) {
          return (void *)0x0;
        }
        iVar2 = FUN_7ffc3e7d8be0(env,lVar9,lVar11,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (iVar2 != 0) {
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x1c);
          if (pvVar4 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar6 = (*(*env)->AllocObject)(env,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar6 != (void *)0x0) {
            lVar8 = FUN_7ffc3eb76c90(env,pvVar4,0x42);
            if (lVar8 == 0) {
              return (void *)0x0;
            }
            FUN_7ffc3e7dbbc0(env,pvVar6,pvVar4,lVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7142);
            lVar8 = FUN_7ffc3eb76c90(env,pvVar4,0x43);
            if (lVar8 == 0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3e7d1a50(env,pvVar6,lVar8,pvVar15);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (lVar10 != 0) {
              lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x40);
              if (lVar11 == 0) {
                return (void *)0x0;
              }
              uVar13 = FUN_7ffc3e7d1a50(env,lVar10,lVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (lVar9 != 0) {
                lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar8,uVar13);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (lVar9 != 0) {
                  lVar10 = FUN_7ffc3eb76c90(env,pvVar4,0x44);
                  if (lVar10 == 0) {
                    return (void *)0x0;
                  }
                  lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (lVar5 != 0) {
                    uVar13 = FUN_7ffc3e7d1a50(env,lVar5,lVar11);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (lVar9 != 0) {
                      lVar5 = FUN_7ffc3e7d1a50(env,lVar9,lVar8,uVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (lVar5 != 0) {
                        lVar5 = FUN_7ffc3e7d1a50(env,lVar5,lVar10,0x20);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        if (lVar5 != 0) {
                          FUN_7ffc3e7d1a50(env,lVar5,lVar8,uVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x16);
                          if (pvVar15 == (void *)0x0) {
                            return (void *)0x0;
                          }
                          arg1_00 = (*(*env)->AllocObject)(env,pvVar15);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x45);
                          if (lVar5 == 0) {
                            return (void *)0x0;
                          }
                          uVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          if (arg1_00 != (void *)0x0) {
                            lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x32);
                            if (lVar5 == 0) {
                              return (void *)0x0;
                            }
                            FUN_7ffc3e7dbbc0(env,arg1_00,pvVar15,lVar5,uVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            (*(*env)->Throw)(env,arg1_00);
                            return (void *)0x0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eaec8d0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x41);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        lVar8 = FUN_7ffc3e7d1a50(env,lVar8,lVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (lVar8 == 0) {
          lVar8 = FUN_7ffc3eb76c30(env,0x2c);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x10d);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x374db799ceff9,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2c);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x79);
      if (pvVar15 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar4 != (void *)0x0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (arg2 < iVar2) {
          pJVar14 = *env;
LAB_7ffc3eaec497:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3eaec8b6;
      }
    }
  }
LAB_7ffc3eaec8d0:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaec8e4:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_9l_a_25 | RVA 0x31c8f0 | 9l.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_a_25(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  int arg3,void *arg4)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  void *arg1_00;
  void *pvVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  void *arg1_01;
  void *arg2_00;
  undefined8 *puVar10;
  int arg2_01;
  char *pcStack_68;
  
  pcStack_68 = &DAT_7ffc3eba6000;
  puVar10 = (undefined8 *)0x7ffc3ebc0a70;
  if (arg0 != (void *)0x0) {
    lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x46);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    arg1_00 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (arg1_00 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg1_00);
      }
      if (iVar2 < 1) {
        return (void *)0x0;
      }
      pcStack_68 = (char *)0x7ffc3eba6019;
      arg2_01 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,arg1_00);
        }
        if (iVar3 <= arg2_01) break;
        pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg1_00,arg2_01);
        if (pvVar6 == (void *)0x0) {
LAB_7ffc3eaecd1a:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eaecd28;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x1d);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x47);
        if (lVar7 == 0) {
          return (void *)0x0;
        }
        lVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (lVar7 == 0) goto LAB_7ffc3eaecd1a;
        lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x35);
        if (lVar8 == 0) {
          return (void *)0x0;
        }
        iVar3 = FUN_7ffc3e7d8be0(env,lVar7,lVar8,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (iVar3 != 0) {
          lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x48);
          if (lVar7 == 0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,lVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          bVar1 = (*(*env)->IsSameObject)(env,pvVar9,arg2);
          if (bVar1 != 0) {
            lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x49);
            if (lVar5 == 0) {
              return (void *)0x0;
            }
            pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,lVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3eaecd1a;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
            }
            if (iVar3 == arg3) {
              if (arg3 < 1) {
                return pvVar6;
              }
              iVar3 = 0;
              while( true ) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3eaecd0c;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3eaecd1a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3eaecd0c;
                arg2_00 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3);
                bVar1 = (*(*env)->IsSameObject)(env,arg1_01,arg2_00);
                if (bVar1 == 0) break;
                iVar3 = iVar3 + 1;
                if (arg3 == iVar3) {
                  return pvVar6;
                }
              }
            }
          }
        }
        arg2_01 = arg2_01 + 1;
        if (arg2_01 == iVar2) {
          return (void *)0x0;
        }
      }
LAB_7ffc3eaecd0c:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3eaecd28:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_9l_b_26 | RVA 0x31cd50 | 9l.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_b_26(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  int arg3,void *arg4)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  void *pvVar5;
  void *pvVar6;
  undefined8 *puVar7;
  int arg2_00;
  char *pcStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x2c);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x10e), lVar4 != 0)) {
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,arg0,arg1,arg2,arg3,arg4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar5 != (void *)0x0) {
        return pvVar5;
      }
      if (arg0 == (void *)0x0) {
        pcStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return (void *)0x0;
        }
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (pvVar5 == (void *)0x0) {
          return (void *)0x0;
        }
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pcStack_48 = (char *)0x7ffc3eba6019;
        arg2_00 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) break;
          pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,arg2_00);
          lVar3 = FUN_7ffc3eb76c30(env,0x2c);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x10f);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,pvVar6,arg1,arg2,arg3,arg4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          arg2_00 = arg2_00 + 1;
          if (pvVar6 != (void *)0x0) {
            return pvVar6;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (*(*env)->ThrowNew)(env,(void *)*puVar7,pcStack_48);
    }
  }
  return (void *)0x0;
}

/* JNI_9l_d_27 | RVA 0x31cfc0 | 9l.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_d_27(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  void *arg3;
  void *pvVar13;
  longlong lVar14;
  void *pvVar15;
  JNINativeInterface_ *pJVar16;
  uint arg2;
  uint uVar17;
  int iVar18;
  char *arg2_00;
  undefined4 uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2c);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x10a);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x79);
  if (pvVar7 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar5,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar7 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
    }
    if ((iVar2 < 0) || (iVar3 <= iVar2)) {
LAB_7ffc3eaee207:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eaee21f;
    }
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,iVar2);
    if (pvVar7 == (void *)0x0) {
      FUN_7ffc3eb76c30(env,0x1d);
      return (void *)0x0;
    }
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc09e8);
    if (bVar1 == 0) {
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x1d);
      if (pvVar5 == (void *)0x0) {
        return (void *)0x0;
      }
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar5);
      if (bVar1 != 0) {
        return pvVar7;
      }
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eaee21f;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x78);
    if (pvVar7 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar5,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar7 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
      }
      if (iVar3 <= iVar2) goto LAB_7ffc3eaee207;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,iVar2);
      if (pvVar7 != (void *)0x0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3a);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        iVar3 = FUN_7ffc3e7d8be0(env,pvVar7,lVar6,8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3b);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar11 = CONCAT44(uVar19,iVar3);
        uVar8 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6,0,uVar11);
        uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0x3c);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar8 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar9,uVar8,CONCAT44(uVar19,0x24));
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x10d);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar19 = 0;
        lVar9 = FUN_7ffc3e7d1a80(env,pvVar5,lVar9,uVar8,0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        uVar8 = CONCAT44(uVar19,iVar3 + 1);
        iVar4 = FUN_7ffc3e7d8be0(env,pvVar7,lVar10,8,uVar8);
        uVar19 = (undefined4)((ulonglong)uVar8 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar11 = CONCAT44(uVar19,iVar4);
        uVar8 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6,iVar3 + 1,uVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar17 = 0;
        iVar3 = iVar4;
        do {
          uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          uVar11 = CONCAT44(uVar19,iVar3 + 1);
          iVar3 = FUN_7ffc3e7d8be0(env,pvVar7,lVar6,8,uVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar17 = uVar17 - 1;
        } while (-1 < iVar3);
        iVar3 = -2 - uVar17;
        pJVar16 = *env;
        if (-1 < iVar3) {
          pvVar5 = (*pJVar16->NewObjectArray)(env,iVar3,pvRam00007ffc3ebc09a0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          arg2 = 0;
          do {
            uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
            lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            iVar18 = iVar4 + 1;
            uVar11 = CONCAT44(uVar19,iVar18);
            iVar4 = FUN_7ffc3e7d8be0(env,pvVar7,lVar6,8,uVar11);
            uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3b);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            uVar12 = CONCAT44(uVar19,iVar4);
            uVar11 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6,iVar18,uVar12);
            uVar19 = (undefined4)((ulonglong)uVar12 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0x3c);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            uVar12 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar6,uVar11,CONCAT44(uVar19,0x24));
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar6 = FUN_7ffc3eb76c30(env,0x2c);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x10d);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            uVar11 = 0;
            arg3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar10,uVar12,0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if ((int)arg2 < iVar3) {
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaee1f1;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3eaee207;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3eaed670:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x10e);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x79);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3eaedbf1:
            pvVar5 = (*pJVar16->GetStaticObjectField)(env,pvVar7,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar5 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar2 < iVar3) {
                (*(*env)->SetObjectArrayElement)(env,pvVar5,iVar2,pvVar13);
                return pvVar13;
              }
              goto LAB_7ffc3eaee207;
            }
            goto LAB_7ffc3eaee1f1;
          }
          if (lVar6 != 0) {
            lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3e7d1a50(env,lVar6,lVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7131);
            if (lVar10 != 0) {
              lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x35);
              if (lVar14 == 0) {
                return (void *)0x0;
              }
              iVar4 = FUN_7ffc3e7d8be0(env,lVar10,lVar14,pvVar7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              lVar10 = lVar9;
              if (iVar4 == 0) goto code_r0x7ffc3eaed7ae;
              goto joined_r0x7ffc3eaed871;
            }
          }
          goto LAB_7ffc3eaee1f1;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3eaee21f;
      }
    }
  }
  goto LAB_7ffc3eaee1f1;
code_r0x7ffc3eaed7ae:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3eaed7fc;
  goto LAB_7ffc3eaed670;
code_r0x7ffc3eaed7fc:
  lVar6 = FUN_7ffc3eb76c30(env,0x2c);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0x10d);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x374db799ceff9,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3eaed871:
  do {
    if (lVar10 == 0) goto LAB_7ffc3eaee1f1;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x38);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar10,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar15 != (void *)0x0) {
      iVar4 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar18 = (*(*env)->GetArrayLength)(env,pvVar15);
        }
        if (iVar18 <= iVar4) break;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar18 = (*(*env)->GetArrayLength)(env,pvVar15);
        }
        if (iVar18 <= iVar4) goto LAB_7ffc3eaee207;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2c);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x10f);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar6,pvVar13,uVar8,arg3,iVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        iVar4 = iVar4 + 1;
        if (pvVar13 != (void *)0x0) {
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x79);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3eaedbf1;
        }
      }
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3e7d1a50(env,lVar10,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7131);
    if (lVar6 == 0) goto LAB_7ffc3eaee1f1;
    lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x35);
    if (lVar14 == 0) {
      return (void *)0x0;
    }
    iVar4 = FUN_7ffc3e7d8be0(env,lVar6,lVar14,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (iVar4 != 0) {
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x1c);
      if (pvVar7 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar13 = (*(*env)->AllocObject)(env,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3eaee1f1;
      lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x42);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      FUN_7ffc3e7dbbc0(env,pvVar13,pvVar7,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba715b);
      lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x43);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a50(env,pvVar13,lVar6,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
      if (lVar14 == 0) {
        return (void *)0x0;
      }
      uVar11 = FUN_7ffc3e7d1a50(env,lVar9,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar10 == 0) goto LAB_7ffc3eaee1f1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaee1f1;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3eaee1f1;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaee1f1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaee1f1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaee1f1;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3eaee1f1;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3eaedf48;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaee1f1;
      iVar2 = 1;
      if (1 < iVar3) {
        iVar2 = iVar3;
      }
      iVar4 = 0;
      break;
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    lVar10 = FUN_7ffc3e7d1a50(env,lVar10,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (lVar10 == 0) {
      lVar6 = FUN_7ffc3eb76c30(env,0x2c);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x10d);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x374db799ceff9,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3eaee1f1;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    uVar8 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x1c);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x43);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7d1a50(env,pvVar13,lVar6,uVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar4 = iVar4 + 1;
    if (iVar4 < iVar3) {
      pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7175);
      FUN_7ffc3e7d1a50(env,pvVar13,lVar6,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
    if (iVar2 == iVar4) break;
    if (cRam00007ffc3ebc08e5 == '\0') {
      iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
    }
    else {
      iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    if (iVar18 <= iVar4) goto LAB_7ffc3eaee207;
  }
LAB_7ffc3eaedf48:
  lVar6 = FUN_7ffc3eb76c30(env,0x1c);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x44);
  if (lVar9 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a50(env,pvVar13,lVar9,0x29);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar7 = (*(*env)->AllocObject)(env,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x45);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  uVar8 = FUN_7ffc3e7d1a50(env,pvVar13,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar7 != (void *)0x0) {
    lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x32);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar7,pvVar5,lVar6,uVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    (*(*env)->Throw)(env,pvVar7);
    return (void *)0x0;
  }
LAB_7ffc3eaee1f1:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaee21f:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_9l_a_28 | RVA 0x31e250 | 9l.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_a_28(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  void *arg3,longlong arg4,longlong arg5)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  JNINativeInterface_ *pJVar13;
  longlong lVar14;
  undefined8 uVar15;
  char *arg2_00;
  undefined4 uVar16;
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3eaef062;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (((iVar2 - 0xd3U < 0x29) && ((0x10000800001U >> ((ulonglong)(iVar2 - 0xd3U) & 0x3f) & 1) != 0))
     || (iVar2 == 0x6a)) {
    lVar4 = FUN_7ffc3eb76c30(env,0x2c);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x110), lVar5 == 0))
    goto LAB_7ffc3eaeea03;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaeea03;
    if (lVar4 == 0) goto LAB_7ffc3eaeea5d;
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x4e), lVar6 != 0)) {
      uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x34), lVar6 != 0)) {
        uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x36), lVar5 != 0)) {
          uVar9 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (iVar2 == 0x6a) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eaeea5d;
              uVar15 = 0x51;
            }
            else if (iVar2 == 0xea) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eaeea5d;
              uVar15 = 0x50;
            }
            else if (iVar2 == 0xfb) {
              if (arg0 == (void *)0x0) {
LAB_7ffc3eaeea5d:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3eaeea77;
              }
              uVar15 = 0x4f;
            }
            else {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eaeea5d;
              uVar15 = 0x52;
            }
            lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
            if (lVar5 == 0) goto LAB_7ffc3eaeea77;
            uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar7,uVar8,uVar9);
            uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eaeea77;
            lVar5 = 0;
LAB_7ffc3eaee742:
            if (arg3 == (void *)0x0) {
              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eaeeb0c:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            else {
              lVar6 = FUN_7ffc3eb76c30(env,0x19);
              if ((lVar6 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x24), lVar6 == 0))
              goto LAB_7ffc3eaeeb0c;
              iVar2 = FUN_7ffc3e7d8be0(env,arg3,lVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if ((bVar1 == 0) &&
                   (pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6),
                   pvVar11 != (void *)0x0)) {
                  pvVar12 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar11);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar10 == (void *)0x0) {
                      pJVar13 = *env;
                      arg2_00 = &DAT_7ffc3eba6000;
                      pvVar10 = pvRam00007ffc3ebc0a70;
                    }
                    else {
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                      }
                      if (0 < iVar3) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
                        pvVar11 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar11)
                        ;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                          }
                          if (iVar3 < 2) goto LAB_7ffc3eaeea40;
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                          lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
                          if (lVar6 != 0) {
                            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,uVar7,
                                                               CONCAT44(uVar16,iVar2 + -2),pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              return pvVar10;
                            }
                          }
                        }
                        goto LAB_7ffc3eaeeb57;
                      }
LAB_7ffc3eaeea40:
                      pJVar13 = *env;
                      arg2_00 = (char *)0x7ffc3eba6019;
                      pvVar10 = pvRam00007ffc3ebc0a98;
                    }
                    (*pJVar13->ThrowNew)(env,pvVar10,arg2_00);
                  }
                }
              }
LAB_7ffc3eaeeb57:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            goto joined_r0x7ffc3eaeeae2;
          }
        }
      }
    }
LAB_7ffc3eaeea77:
    pvVar10 = (*(*env)->ExceptionOccurred)(env);
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
    lVar5 = 0;
    if (bVar1 == 0) {
      return (void *)0x0;
    }
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(env,0x2c);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x111), lVar5 == 0)) {
LAB_7ffc3eaeea03:
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      lVar5 = 0;
      if (bVar1 == 0) {
        return (void *)0x0;
      }
    }
    else {
      lVar5 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3eaeea03;
      if (lVar5 == 0) {
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eaeebb1:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
joined_r0x7ffc3eaeeae2:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3eaeebe7;
      }
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x54), lVar6 == 0))
      goto LAB_7ffc3eaeebb1;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x47), lVar6 == 0))
      goto LAB_7ffc3eaeebb1;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x48), lVar6 == 0))
      goto LAB_7ffc3eaeebb1;
      uVar9 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x49), lVar4 == 0)) {
LAB_7ffc3eaeeab2:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
        goto joined_r0x7ffc3eaeeae2;
      }
      uVar15 = FUN_7ffc3e7d1a50(env,lVar5,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) ||
         ((lVar4 = FUN_7ffc3eb76c30(env,0x19), lVar4 == 0 ||
          (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x55), lVar6 == 0)))) goto LAB_7ffc3eaeeab2;
      uVar9 = FUN_7ffc3e7d1a80(env,lVar4,lVar6,uVar9,uVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3eaeeab2;
      if (iVar2 == 0x4d) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3eaef07e;
        uVar15 = 0x57;
LAB_7ffc3eaee98c:
        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
joined_r0x7ffc3eaee9bf:
        if (lVar4 != 0) {
          uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar7,uVar8,uVar9);
          uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            lVar4 = 0;
            goto LAB_7ffc3eaee742;
          }
        }
      }
      else {
        if (iVar2 == 0x76) {
          if (arg0 != (void *)0x0) {
            uVar15 = 0x56;
            goto LAB_7ffc3eaee98c;
          }
        }
        else if (arg0 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
          goto joined_r0x7ffc3eaee9bf;
        }
LAB_7ffc3eaef07e:
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      }
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      if (bVar1 == 0) {
        return (void *)0x0;
      }
    }
    lVar4 = 0;
  }
LAB_7ffc3eaeebe7:
  (*(*env)->ExceptionClear)(env);
  pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (pvVar11 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar12 = (*(*env)->AllocObject)(env,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3eaef062;
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x28);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar12,pvVar11,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3eaef062;
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,pvVar10,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto LAB_7ffc3eaef062;
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  uVar7 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x29);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3e7d1a50(env,pvVar12,lVar6,uVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
  if (lVar14 == 0) goto LAB_7ffc3eaef062;
  lVar6 = FUN_7ffc3e7d1a50(env,lVar14,lVar6,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar4 == 0) {
    if (lVar5 != 0) {
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,lVar4,0x5b);
      lVar4 = lVar5;
      goto joined_r0x7ffc3eaeee16;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar14 = FUN_7ffc3eb76c90(env,lVar5,0x5a);
joined_r0x7ffc3eaeee16:
    if (lVar14 == 0) {
      return (void *)0x0;
    }
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar4,lVar14);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
  }
  if (lVar6 != 0) {
    lVar4 = FUN_7ffc3eb76c30(env,0x1a);
    if (lVar4 == 0) {
      return (void *)0x0;
    }
    lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x29);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar5,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar6 != 0) {
      lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar5,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c30(env,8);
      if (lVar14 == 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,lVar14,0x31);
      if (lVar14 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7d1a50(env,pvVar10,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 != 0) {
        FUN_7ffc3e7d1a50(env,lVar6,lVar5,uVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x16);
        if (pvVar10 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar11 = (*(*env)->AllocObject)(env,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x2b);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        uVar7 = FUN_7ffc3e7d1a50(env,pvVar12,lVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar11 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,pvVar10,0x32);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          FUN_7ffc3e7dbbc0(env,pvVar11,pvVar10,lVar4,uVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          (*(*env)->Throw)(env,pvVar11);
          return (void *)0x0;
        }
      }
    }
  }
LAB_7ffc3eaef062:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_9l_a_29 | RVA 0x31f0e0 | 9l.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_a_29(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  void *arg3,void *arg4)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  undefined8 uVar6;
  JNINativeInterface_ *pJVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  char *arg2_00;
  undefined4 uVar11;
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3eaef526;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3eaef161:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3eaef161;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3eaef509:
    pJVar7 = *env;
    arg2_00 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -2);
    pJVar7 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3eaef538:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3eaef275;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar6 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg4);
      }
      if (iVar2 < iVar3) goto LAB_7ffc3eaef509;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3eaef538;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x2c);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0x112);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar4 = arg3;
        lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar9,arg0,arg1,arg2,arg3,uVar6,uVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar9,lVar5,arg3,arg2,pvVar4,uVar6,uVar8);
        uVar11 = (undefined4)((ulonglong)arg3 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (arg1 != (void *)0x0) {
          lVar9 = FUN_7ffc3eb76c30(env,0x18);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar9,0x22);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          FUN_7ffc3e7e1940(env,arg1,lVar9,uVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c30(env,0x12);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,arg4);
          }
          if (lVar5 != 0) {
            lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x5d);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            lVar5 = FUN_7ffc3e7d1a50(env,lVar5,lVar10,lVar9,CONCAT44(uVar11,iVar3));
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pJVar7 = *env;
            if (lVar5 != 0) {
              pvVar4 = (*pJVar7->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              return pvVar4;
            }
            goto LAB_7ffc3eaef26e;
          }
        }
LAB_7ffc3eaef526:
        pJVar7 = *env;
      }
    }
LAB_7ffc3eaef26e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3eaef275:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_9l_b_30 | RVA 0x31f560 | 9l.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_9l_b_30(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  undefined8 uVar1;
  byte bVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *arg1_00;
  void *pvVar15;
  void *pvVar16;
  longlong lVar17;
  char *arg2_00;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x18);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaefe9e;
  lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0x23);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  pvVar8 = arg2;
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar7,arg2);
  uVar20 = (undefined4)((ulonglong)pvVar8 >> 0x20);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (_DAT_7ffc3ebc0b18 == (void *)0x0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09a0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvRam00007ffc3ebc0a90);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x18);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvRam00007ffc3ebc09e8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x19);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,4,pvVar8);
    uVar9 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,pvRam00007ffc3ebc09e0,
                             pvVar5);
    uVar1 = uRam00007ffc3ebc0a88;
    uVar13 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)pvVar5 >> 0x20);
    uVar10 = FUN_7ffc3eb76c30(env,0x2c);
    uVar11 = FUN_7ffc3eb76c30(env,0x2c);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b18 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b18;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eaefb20:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaefb34:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaefb20;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaefb20;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (2 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,arg1);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                      }
                      if (3 < iVar4) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,3,arg2);
                        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x26);
                        if (lVar7 != 0) {
                          uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,
                                                    uVar19 & 0xffffffff00000000,pvVar5);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27), lVar7 != 0))
                          {
                            uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,arg2,
                                                      pvVar5);
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if ((bVar2 == 0) &&
                               ((lVar7 = FUN_7ffc3eb76c30(env,0x18), lVar7 != 0 &&
                                (lVar7 = FUN_7ffc3eb76c90(env,lVar7,0x22), lVar7 != 0)))) {
                              FUN_7ffc3e7e1940(env,pvVar6,lVar7,uVar13);
                              bVar2 = (*(*env)->ExceptionCheck)(env);
                              if (bVar2 == 0) {
                                return pvVar6;
                              }
                            }
                          }
                        }
                        goto LAB_7ffc3eaefb3a;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eaefb34;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eaefb3a:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar2 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar2 == 0) {
    return (void *)0x0;
  }
  (*(*env)->ExceptionClear)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (*(*env)->AllocObject)(env,pvVar6);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  arg1_00 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (arg1_00 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar15 = (*(*env)->AllocObject)(env,arg1_00);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar15 != (void *)0x0) {
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x28);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar15,arg1_00,lVar7);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaec64);
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x29);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3e7d1a50(env,pvVar15,lVar7,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return (void *)0x0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,arg1);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          if (arg2 != (void *)0x0) {
            lVar17 = FUN_7ffc3eb76c30(env,0x19);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            lVar17 = FUN_7ffc3eb76c90(env,lVar17,0x2a);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            uVar13 = FUN_7ffc3e7d1a50(env,arg2,lVar17);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (lVar12 != 0) {
              lVar7 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,uVar13);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              if (lVar7 != 0) {
                lVar12 = FUN_7ffc3eb76c90(env,arg1_00,0x2b);
                if (lVar12 == 0) {
                  return (void *)0x0;
                }
                uVar13 = FUN_7ffc3e7d1a50(env,lVar7,lVar12);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (pvVar8 != (void *)0x0) {
                  lVar7 = FUN_7ffc3eb76c90(env,pvVar6,0x18);
                  if (lVar7 == 0) {
                    return (void *)0x0;
                  }
                  FUN_7ffc3e7dbbc0(env,pvVar8,pvVar6,lVar7,uVar13,pvVar5);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 != 0) {
                    return (void *)0x0;
                  }
                  (*(*env)->Throw)(env,pvVar8);
                  return (void *)0x0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eaefe9e:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

