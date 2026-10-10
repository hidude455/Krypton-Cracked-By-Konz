/* Native reconstruction for dev/krypton/02.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_02_4_0 | RVA 0x1000 | dev/krypton/02.4([Ljava/lang/Object;)Ljava/util/List; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_4_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  void *arg1;
  ulonglong uVar11;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
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
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7d108b;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x2f);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar11 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar7 + 0x10));
        }
        else {
          uVar11 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a38 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7a38 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7a38;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar11 = uVar11 ^ uVar6;
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x4ccd35f97a3e4976);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a40 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba8376,0,0);
          if ((lVar5 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc7a40 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc7a40;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x4ccb0c1983e84a95);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a48 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba83a6,uVar9);
          uVar9 = FUN_7ffc3eb76c30(env,2);
          uVar10 = FUN_7ffc3eb76c30(env,2);
          uStack_50 = FUN_7ffc3eb770c0(env,uVar9,5,uVar10,0x7ffc3ebaac15,0x7ffc3ebaac17);
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaac1b,uVar9);
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                   0x7ffc3eba83e7,0x7ffc3ebaac2f,&uStack_58,3);
          if ((lVar5 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc7a48 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc7a48;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,0,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a50 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba840e,0,0);
          if ((lVar5 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7a50 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7a50;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
        (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar7);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x4cc63c1bbcd48de5);
        (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a58 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba7f73,0,0);
          if ((lVar5 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc7a58 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc7a58;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x4cc8e3afb5b304a1);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar3;
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7d108b;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7d108b:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_8_1 | RVA 0x1ab0 | dev/krypton/02.8([Ljava/lang/Object;)Ldev/krypton/6x; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_8_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  void *arg3;
  ulonglong uVar12;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) {
    pJVar5 = *env;
LAB_7ffc3e7d1ba9:
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3e7d1bb0;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3e7d2758:
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    if ((pvVar3 == (void *)0x0) ||
       (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09e8), bVar1 != 0)) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3e7d2758;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e7d1ba9;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x2f);
        if (pvVar8 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar12 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar8 + 0x10));
        }
        else {
          uVar12 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a98 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7a98 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc7a98;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar12 = uVar12 ^ uVar7;
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x24175f64fd3f21ac);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7aa0 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba8376,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7aa0 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7aa0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x2411668404e9224f);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7aa8 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba83a6,uVar10);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uVar11 = FUN_7ffc3eb76c30(env,0x37);
          uStack_50 = FUN_7ffc3eb770c0(env,uVar10,6,uVar11,0x7ffc3eba8477,0x7ffc3ebaac50);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaac1b,uVar10);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                   0x7ffc3eba83e7,0x7ffc3ebaac77,&uStack_58,3);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7aa8 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7aa8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        arg3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        uVar12 ^ 0x18f688f8321d);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,arg3);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7ab0 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba840e,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7ab0 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7ab0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x241c56863bd5e53f);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7ab8 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba84d9,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7ab8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc7ab8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x2413f8743fcf2461);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7ac0 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba8504,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7ac0 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc7ac0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,(void *)0x0);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x241cc91fe8bf8b89);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar3 == (void *)0x0 || pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
        if (bVar1 != 0) {
          return pvVar3;
        }
      }
    }
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3e7d1bb0:
  (*pJVar5->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_0_2 | RVA 0x27b0 | dev/krypton/02.0([Ljava/lang/Object;)Ljava/util/List; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_0_2(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
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
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7d2838;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x2f);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar7 + 0x10));
        }
        else {
          uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc79e8 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc79e8 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc79e8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x3b0041d1f7be3ebb);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar8 ^ uVar6);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar3;
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7d2838;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7d2838:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_1_3 | RVA 0x2b20 | dev/krypton/02.1([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_1_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  void *pvVar11;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
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
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7d2baf;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 != 0) {
          uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (((bVar1 == 0) && (pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37), pvVar3 != (void *)0x0))
             && (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x2f), pvVar7 != (void *)0x0)) {
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar8 = *(ulonglong *)
                       (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                       (longlong)*(int *)((longlong)pvVar7 + 0x10));
            }
            else {
              uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
            }
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc3348 == (void *)0x0) {
                uVar9 = FUN_7ffc3eb76c30(env,0x37);
                uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar9);
                uVar9 = FUN_7ffc3eb76c30(env,0x37);
                uVar10 = FUN_7ffc3eb76c30(env,0x37);
                uStack_50 = FUN_7ffc3eb770c0(env,uVar9,5,uVar10,0x7ffc3eba8477,0x7ffc3ebaacab);
                uVar9 = FUN_7ffc3eb76c30(env,0x37);
                uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar9);
                uVar9 = FUN_7ffc3eb76c30(env,0x37);
                lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                         0x7ffc3eba7735,0x7ffc3ebaacb0,&uStack_58,3);
                if ((lVar5 != 0) &&
                   (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                   pvVar3 != (void *)0x0)) {
                  _DAT_7ffc3ebc3348 = (*(*env)->NewGlobalRef)(env,pvVar3);
                }
              }
              pvVar3 = _DAT_7ffc3ebc3348;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar8 ^ uVar6 ^ 0x4fe864f80228);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc3350 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x37);
                    lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3ebaacdb,0,0);
                    if ((lVar5 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc3350 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc3350;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar3);
                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0x8e65b31ccc610dc3);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar3);
                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar8 ^ uVar6);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar3);
                    FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                    (*(*env)->ExceptionCheck)(env);
                  }
                }
              }
            }
          }
        }
        return;
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7d2baf;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar4->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7d2baf:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7d2bc2. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_02_3_4 | RVA 0x30a0 | dev/krypton/02.3([Ljava/lang/Object;)Ljava/util/List; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_3_4(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) {
    pJVar5 = *env;
LAB_7ffc3e7d31ae:
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3e7d31b5;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3e7d3f6f:
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x38);
    if (pvVar4 == (void *)0x0) {
      return (void *)0x0;
    }
    if ((pvVar3 == (void *)0x0) || (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 != 0))
    {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3e7d3f6f;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e7d31ae;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x2f);
        if (pvVar8 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar12 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar8 + 0x10));
        }
        else {
          uVar12 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a00 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7a00 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc7a00;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar12 = uVar12 ^ uVar7;
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x6db96344da0f6802);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a08 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba8376,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7a08 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7a08;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x6dbf5aa423d96be1);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a10 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba83a6,uVar10);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uVar11 = FUN_7ffc3eb76c30(env,0x37);
          uStack_50 = FUN_7ffc3eb770c0(env,uVar10,6,uVar11,0x7ffc3eba83bc,0x7ffc3ebaad1a);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaac1b,uVar10);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                   0x7ffc3eba83e7,0x7ffc3ebaad3f,&uStack_58,3);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7a10 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7a10;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar12 ^ 0x6078ad68ec28);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a18 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba840e,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7a18 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7a18;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x6db26aa61ce5ac91);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a20 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba83a6,uVar10);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uVar11 = FUN_7ffc3eb76c30(env,0x37);
          uStack_50 = FUN_7ffc3eb770c0(env,uVar10,6,uVar11,0x7ffc3eba83bc,0x7ffc3ebaad71);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaac1b,uVar10);
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                   0x7ffc3eba83e7,0x7ffc3ebaad87,&uStack_58,3);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7a20 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc7a20;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          (uVar12 ^ 0x1ed9161a4175) >> 0x10);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09b0,uRam00007ffc3ebc0930,
                                          (int)(short)(uVar12 ^ 0x1ed9161a4175));
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a28 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba840e,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc7a28 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc7a28;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x6db26aa61ce5ac91);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7a30 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7a30 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc7a30;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x6dbcb512158225d5);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar3;
      }
    }
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3e7d31b5:
  (*pJVar5->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_5_5 | RVA 0x3fc0 | dev/krypton/02.5([Ljava/lang/Object;)Ldev/krypton/6x; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_5_5(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
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
LAB_7ffc3e7d4db0:
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7d404d;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 2) goto LAB_7ffc3e7d4db0;
        pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        if ((pvVar3 == (void *)0x0) ||
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09a0), bVar1 != 0)) {
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x37);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x2f);
          if (pvVar8 == (void *)0x0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar12 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar8 + 0x10));
          }
          else {
            uVar12 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar8);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a60 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
            if ((lVar5 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc7a60 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc7a60;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar12 = uVar12 ^ uVar6;
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff037d8cab80fab8);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a68 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3ebaac13,0x7ffc3eba8376,0,0);
            if ((lVar5 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc7a68 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc7a68;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar7);
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff05446c5256f95b);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar7);
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar7);
          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a70 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3ebaacd8,0x7ffc3eba621c,0,0);
            if ((lVar5 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc7a70 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc7a70;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xff05b3cab9efb3b2);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a78 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba83a6,uVar11);
            uStack_50 = FUN_7ffc3eb770c0(env,pvRam00007ffc3ebc09a0,5,pvRam00007ffc3ebc09a0,
                                         0x7ffc3ebaadaa,0x7ffc3eba83a6);
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaac1b,uVar11);
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                     0x7ffc3eba83e7,0x7ffc3ebaadb5,&uStack_58,3);
            if ((lVar5 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc7a78 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc7a78;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a80 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3ebaac13,0x7ffc3eba840e,0,0);
            if ((lVar5 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc7a80 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc7a80;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar7);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff08746e6d6a3e2b);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a88 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3ebaac13,0x7ffc3eba84d9,0,0);
            if ((lVar5 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc7a88 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc7a88;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff07da9c6970ff75);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc7a90 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x37);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3ebaac13,0x7ffc3eba8504,0,0);
            if ((lVar5 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc7a90 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc7a90;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,(void *)0x0);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xff08ebf7be00509d);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
          if (pvVar3 == (void *)0x0 || pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar7);
          if (bVar1 != 0) {
            return pvVar3;
          }
        }
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7d404d;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7d404d:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_4_6 | RVA 0x4e00 | dev/krypton/02.4([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_4_6(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  ulonglong uVar9;
  void *pvVar10;
  undefined8 uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar5 = *env;
LAB_7ffc3e7d4f09:
    UNRECOVERED_JUMPTABLE = pJVar5->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3e7d4f14;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3e7d5379:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
    if (pvVar4 == (void *)0x0) {
      return;
    }
    if ((pvVar3 == (void *)0x0) || (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 != 0))
    {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3e7d5379;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e7d4f09;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar4 == (void *)0x0) {
          return;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x2f);
        if (pvVar8 == (void *)0x0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar9 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar8 + 0x10));
        }
        else {
          uVar9 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc3358 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc3358 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc3358;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x944d3ecb5aa491f6);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           uVar9 ^ uVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar10);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc3360 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba6245,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc3360 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc3360;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x944909d42323f387);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar9 ^ uVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
        return;
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3e7d4f14:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7d4f27. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_02_7_7 | RVA 0x5400 | dev/krypton/02.7(Ldev/krypton/6u;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_7_7(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  void *pvVar10;
  ulonglong uVar11;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar2 == (void *)0x0) {
    return;
  }
  pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0x2f);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar4 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar2 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar3 + 0x10));
  }
  else {
    uVar4 = (*(*env)->GetStaticLongField)(env,pvVar2,pvVar3);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c30(env,0x38);
  if (lVar5 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x98);
  if (lVar6 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2df0 == (void *)0x0) {
    uVar8 = FUN_7ffc3eb76c30(env,0x37);
    lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,0x7ffc3ebaade7
                             ,0x7ffc3eba7e1f,0,0);
    if ((lVar6 != 0) &&
       (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0)) {
      _DAT_7ffc3ebc2df0 = (*(*env)->NewGlobalRef)(env,pvVar2);
    }
  }
  pvVar2 = _DAT_7ffc3ebc2df0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar4 ^ 0x558198511c48;
    pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc495ab5f9d5a787);
    (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
    pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d67f8;
    if (lVar5 != 0) {
LAB_7ffc3e7d5a7f:
      if (_DAT_7ffc3ebc2e18 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba7e1c,0x7ffc3eba7e3d,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2e18 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2e18;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc4f8a5e17c255d3);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x3a);
      if (pvVar3 == (void *)0x0) {
        return;
      }
      if (pvVar2 == (void *)0x0) {
        if (lVar5 != 0) goto LAB_7ffc3e7d5e7b;
LAB_7ffc3e7d5c7d:
        if (_DAT_7ffc3ebc2e20 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaade7,0x7ffc3eba7e1f,0,0);
          if ((lVar5 != 0) &&
             (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar2 != (void *)0x0)) {
            _DAT_7ffc3ebc2e20 = (*(*env)->NewGlobalRef)(env,pvVar2);
          }
        }
        pvVar2 = _DAT_7ffc3ebc2e20;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc495ab5f9d5a787);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc2e28 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7e3d,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc2e28 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc2e28;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
        pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc4f8a5e17c255d3);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
        pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x3b);
        if (pvVar3 == (void *)0x0) {
          return;
        }
        if (pvVar2 == (void *)0x0) goto LAB_7ffc3e7d5e7b;
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3);
      }
      else {
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3);
        if (lVar5 == 0) {
          if (bVar1 != 0) {
            return;
          }
          goto LAB_7ffc3e7d5c7d;
        }
      }
      if (bVar1 != 0) {
        return;
      }
LAB_7ffc3e7d5e7b:
      if (_DAT_7ffc3ebc2e30 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
        if ((lVar5 != 0) &&
           (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2e30 = (*(*env)->NewGlobalRef)(env,pvVar2);
        }
      }
      pvVar2 = _DAT_7ffc3ebc2e30;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc48338982d109f3);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar7);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2e38 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaadea,uVar8);
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        uVar9 = FUN_7ffc3eb76c30(env,0x37);
        uStack_50 = FUN_7ffc3eb770c0(env,uVar8,6,uVar9,0x7ffc3eba853f,0x7ffc3ebaae00);
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaae25,uVar8);
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                 0x7ffc3ebaae39,0x7ffc3ebaae40,&uStack_58,3);
        if ((lVar5 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2e38 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2e38;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         uVar4 ^ 0x32a2213a8c5d);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,arg0);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2e40 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3ebaac13,0x7ffc3eba626f,0,0);
        if ((lVar5 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2e40 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2e40;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar2);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc4d1dadc2dd2e91);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar2);
      FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      (*(*env)->ExceptionCheck)(env);
      return;
    }
    if (_DAT_7ffc3ebc2df8 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x37);
      lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3eba7e1c,0x7ffc3eba7203,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2df8 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2df8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e7d6866:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
      if (bVar1 != 0) goto LAB_7ffc3e7d6896;
      goto LAB_7ffc3e7d690e;
    }
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc4f06f89ccdf9f6);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d6866;
    if (lVar6 == 0) {
LAB_7ffc3e7d59ad:
      if (_DAT_7ffc3ebc2e10 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3ebaade7,0x7ffc3eba7e1f,0,0);
        if ((lVar6 != 0) &&
           (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2e10 = (*(*env)->NewGlobalRef)(env,pvVar2);
        }
      }
      pvVar2 = _DAT_7ffc3ebc2e10;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc495ab5f9d5a787);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      goto LAB_7ffc3e7d5a7f;
    }
    if (_DAT_7ffc3ebc2e00 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x37);
      lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3ebaade7,0x7ffc3eba7e1f,0,0);
      if ((lVar6 != 0) &&
         (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0))
      {
        _DAT_7ffc3ebc2e00 = (*(*env)->NewGlobalRef)(env,pvVar2);
      }
    }
    pvVar2 = _DAT_7ffc3ebc2e00;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc495ab5f9d5a787);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc2e08 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7e3d,0,0);
          if ((lVar6 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc2e08 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc2e08;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
          pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc4f8a5e17c255d3);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
          pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if ((bVar1 == 0) && (pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x39), pvVar3 != (void *)0x0))
          {
            if ((pvVar2 != (void *)0x0) &&
               (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3), bVar1 != 0)) {
              return;
            }
            goto LAB_7ffc3e7d59ad;
          }
        }
      }
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
    if (bVar1 == 0) goto LAB_7ffc3e7d69ae;
  }
  else {
LAB_7ffc3e7d67f8:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e7d6896:
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 == 0)) {
LAB_7ffc3e7d6902:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar2);
        goto LAB_7ffc3e7d6902;
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e7d690e:
    pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
    if (bVar1 == 0) {
      return;
    }
  }
  (*(*env)->ExceptionClear)(env);
  lVar5 = FUN_7ffc3eb76c30(env,0x37);
  if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 != 0)) {
    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3e7d69ae;
    }
    (*(*env)->Throw)(env,pvVar2);
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e7d69ae:
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 != 0)) {
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7d6a5d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar2);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_02_4_8 | RVA 0x6a80 | dev/krypton/02.4(Ldev/krypton/6P;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_4_8(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  void *pvVar10;
  ulonglong uVar11;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar2 == (void *)0x0) {
    return;
  }
  pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0x2f);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar4 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar2 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar3 + 0x10));
  }
  else {
    uVar4 = (*(*env)->GetStaticLongField)(env,pvVar2,pvVar3);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c30(env,0x38);
  if (lVar5 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x98);
  if (lVar6 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2d98 == (void *)0x0) {
    uVar8 = FUN_7ffc3eb76c30(env,0x37);
    lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,0x7ffc3ebaade7
                             ,0x7ffc3eba7e1f,0,0);
    if ((lVar6 != 0) &&
       (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0)) {
      _DAT_7ffc3ebc2d98 = (*(*env)->NewGlobalRef)(env,pvVar2);
    }
  }
  pvVar2 = _DAT_7ffc3ebc2d98;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar4 ^ 0x6bbb4d7dd012;
    pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc013648f2cf96bdd);
    (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
    pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d7e78;
    if (lVar5 != 0) {
LAB_7ffc3e7d70ff:
      if (_DAT_7ffc3ebc2dc0 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba7e1c,0x7ffc3eba7e3d,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2dc0 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2dc0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc015b464c2ee9989);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x3a);
      if (pvVar3 == (void *)0x0) {
        return;
      }
      if (pvVar2 == (void *)0x0) {
        if (lVar5 != 0) goto LAB_7ffc3e7d74fb;
LAB_7ffc3e7d72fd:
        if (_DAT_7ffc3ebc2dc8 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3ebaade7,0x7ffc3eba7e1f,0,0);
          if ((lVar5 != 0) &&
             (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar2 != (void *)0x0)) {
            _DAT_7ffc3ebc2dc8 = (*(*env)->NewGlobalRef)(env,pvVar2);
          }
        }
        pvVar2 = _DAT_7ffc3ebc2dc8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc013648f2cf96bdd);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc2dd0 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x37);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7e3d,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc2dd0 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc2dd0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
        pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc015b464c2ee9989);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
        pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x3b);
        if (pvVar3 == (void *)0x0) {
          return;
        }
        if (pvVar2 == (void *)0x0) goto LAB_7ffc3e7d74fb;
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3);
      }
      else {
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3);
        if (lVar5 == 0) {
          if (bVar1 != 0) {
            return;
          }
          goto LAB_7ffc3e7d72fd;
        }
      }
      if (bVar1 != 0) {
        return;
      }
LAB_7ffc3e7d74fb:
      if (_DAT_7ffc3ebc2dd8 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
        if ((lVar5 != 0) &&
           (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2dd8 = (*(*env)->NewGlobalRef)(env,pvVar2);
        }
      }
      pvVar2 = _DAT_7ffc3ebc2dd8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc0120db357fdc5a9);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar7);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2de0 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaadea,uVar8);
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        uVar9 = FUN_7ffc3eb76c30(env,0x37);
        uStack_50 = FUN_7ffc3eb770c0(env,uVar8,6,uVar9,0x7ffc3eba64b2,0x7ffc3ebaae71);
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaae25,uVar8);
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                 0x7ffc3ebaae39,0x7ffc3ebaae96,&uStack_58,3);
        if ((lVar5 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2de0 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2de0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         uVar4 ^ 0x1a9dce10c6d2);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,arg0);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2de8 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3ebaac13,0x7ffc3eba626f,0,0);
        if ((lVar5 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2de8 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc2de8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar2);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc017239717f1e2cb);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar2);
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar2);
      FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
      (*(*env)->ExceptionCheck)(env);
      return;
    }
    if (_DAT_7ffc3ebc2da0 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x37);
      lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3eba7e1c,0x7ffc3eba7203,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2da0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2da0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e7d7ee6:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
      if (bVar1 != 0) goto LAB_7ffc3e7d7f16;
      goto LAB_7ffc3e7d7f8e;
    }
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc01538c249e135ac);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d7ee6;
    if (lVar6 == 0) {
LAB_7ffc3e7d702d:
      if (_DAT_7ffc3ebc2db8 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x37);
        lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3ebaade7,0x7ffc3eba7e1f,0,0);
        if ((lVar6 != 0) &&
           (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2db8 = (*(*env)->NewGlobalRef)(env,pvVar2);
        }
      }
      pvVar2 = _DAT_7ffc3ebc2db8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc013648f2cf96bdd);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      goto LAB_7ffc3e7d70ff;
    }
    if (_DAT_7ffc3ebc2da8 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x37);
      lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3ebaade7,0x7ffc3eba7e1f,0,0);
      if ((lVar6 != 0) &&
         (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0))
      {
        _DAT_7ffc3ebc2da8 = (*(*env)->NewGlobalRef)(env,pvVar2);
      }
    }
    pvVar2 = _DAT_7ffc3ebc2da8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc013648f2cf96bdd);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
      pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc2db0 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x37);
          lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7e3d,0,0);
          if ((lVar6 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc2db0 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc2db0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
          pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc015b464c2ee9989);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
          pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if ((bVar1 == 0) && (pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x39), pvVar3 != (void *)0x0))
          {
            if ((pvVar2 != (void *)0x0) &&
               (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3), bVar1 != 0)) {
              return;
            }
            goto LAB_7ffc3e7d702d;
          }
        }
      }
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
    if (bVar1 == 0) goto LAB_7ffc3e7d802e;
  }
  else {
LAB_7ffc3e7d7e78:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e7d7f16:
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 == 0)) {
LAB_7ffc3e7d7f82:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar2);
        goto LAB_7ffc3e7d7f82;
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e7d7f8e:
    pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
    if (bVar1 == 0) {
      return;
    }
  }
  (*(*env)->ExceptionClear)(env);
  lVar5 = FUN_7ffc3eb76c30(env,0x37);
  if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 != 0)) {
    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3e7d802e;
    }
    (*(*env)->Throw)(env,pvVar2);
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e7d802e:
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar2);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 != 0)) {
      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7d80dd. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar2);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_02_0_9 | RVA 0x8100 | dev/krypton/02.0(JLdev/krypton/6P;Ldev/krypton/6x;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_0_9
               (JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  JNINativeInterface_ *pJVar10;
  ulonglong uVar11;
  char *pcVar12;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x2f);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c30(env,0x38);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x98);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar7 != 0)) {
    uVar11 = uVar11 ^ arg0;
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar11 ^ 0x7f5b8b9fb697);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d8a36;
    if (pvVar4 == (void *)0x0) {
LAB_7ffc3e7d8a02:
      pJVar10 = *env;
      pcVar12 = &DAT_7ffc3eba6000;
      pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7d8a30:
      (*pJVar10->ThrowNew)(env,pvVar4,pcVar12);
      goto LAB_7ffc3e7d8a36;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 1) {
      pJVar10 = *env;
      pcVar12 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7d8a30;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
    if (((_DAT_7ffc3ebc77f0 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3ebaac13,0x7ffc3eba6347,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc77f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc77f0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d8a36;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,arg2);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc6da349bc61fac9e);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d8a36;
    iVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
    lVar7 = FUN_7ffc3eb76c30(env,0x3c);
    if ((lVar7 == 0) || (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,lVar7,0x30), pvVar4 == (void *)0x0))
    goto LAB_7ffc3e7d8a36;
    if (arg1 == (void *)0x0) goto LAB_7ffc3e7d8a02;
    pvVar4 = (*(*env)->GetObjectField)(env,arg1,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d8a36;
    if (((_DAT_7ffc3ebc77f8 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3ebaac13,0x7ffc3eba64b4,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc77f8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc77f8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d8a36;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc6d58e1398ddc4d7);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d8a36;
    iVar3 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
    if (lVar6 == 0) {
      if (iVar2 != iVar3) {
        return;
      }
      lVar6 = FUN_7ffc3eb76c30(env,0x3c);
      if ((lVar6 != 0) && (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,lVar6,0x31), pvVar4 != (void *)0x0)
         ) {
        if (cRam00007ffc3ebc08f4 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg1 & 0xfffffffffffffffc) +
                          ((ulonglong)pvVar4 >> 2));
        }
        else {
          iVar2 = (*(*env)->GetIntField)(env,arg1,pvVar4);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        iVar3 = 1;
        if (bVar1 == 0) goto LAB_7ffc3e7d8767;
      }
    }
    else {
LAB_7ffc3e7d8767:
      if (iVar3 != iVar2) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)) {
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x59af80f3fee1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar4 == (void *)0x0) {
            pJVar10 = *env;
            pcVar12 = &DAT_7ffc3eba6000;
            pvVar4 = pvRam00007ffc3ebc0a70;
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
              if (((_DAT_7ffc3ebc7800 == (void *)0x0) &&
                  (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                            0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba626f,0,0),
                  lVar6 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc7800 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc7800;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,arg2);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc6d801cb9942eefd);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar11);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
                FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  return;
                }
              }
              goto LAB_7ffc3e7d8ad6;
            }
            pJVar10 = *env;
            pcVar12 = (char *)0x7ffc3eba6019;
            pvVar4 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar10->ThrowNew)(env,pvVar4,pcVar12);
        }
      }
    }
  }
  else {
LAB_7ffc3e7d8a36:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x99), lVar7 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e7d8adf;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
LAB_7ffc3e7d8ad6:
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e7d8adf:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x99), lVar7 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7d8b8e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_02_7_10 | RVA 0x8c10 | dev/krypton/02.7(JLdev/krypton/6u;Ldev/krypton/6x;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_7_10
               (JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  JNINativeInterface_ *pJVar10;
  ulonglong uVar11;
  char *pcVar12;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x2f);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c30(env,0x38);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x98);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar7 != 0)) {
    uVar11 = uVar11 ^ arg0;
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar11 ^ 0x576464b5fc18);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d9546;
    if (pvVar4 == (void *)0x0) {
LAB_7ffc3e7d9512:
      pJVar10 = *env;
      pcVar12 = &DAT_7ffc3eba6000;
      pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7d9540:
      (*pJVar10->ThrowNew)(env,pvVar4,pcVar12);
      goto LAB_7ffc3e7d9546;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 1) {
      pJVar10 = *env;
      pcVar12 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7d9540;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
    if (((_DAT_7ffc3ebc7810 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3ebaac13,0x7ffc3eba6347,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc7810 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc7810;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d9546;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,arg2);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x8c551ca42935e611);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d9546;
    iVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
    lVar7 = FUN_7ffc3eb76c30(env,0x3d);
    if ((lVar7 == 0) || (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,lVar7,0x32), pvVar4 == (void *)0x0))
    goto LAB_7ffc3e7d9546;
    if (arg1 == (void *)0x0) goto LAB_7ffc3e7d9512;
    pvVar4 = (*(*env)->GetObjectField)(env,arg1,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d9546;
    if (((_DAT_7ffc3ebc7818 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3ebaac13,0x7ffc3eba64b4,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc7818 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc7818;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d9546;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x8c51cfa5b66aa7d7);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7d9546;
    iVar3 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
    if (lVar6 == 0) {
      if (iVar2 != iVar3) {
        return;
      }
      lVar6 = FUN_7ffc3eb76c30(env,0x3d);
      if ((lVar6 != 0) && (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,lVar6,0x33), pvVar4 != (void *)0x0)
         ) {
        if (cRam00007ffc3ebc08f4 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg1 & 0xfffffffffffffffc) +
                          ((ulonglong)pvVar4 >> 2));
        }
        else {
          iVar2 = (*(*env)->GetIntField)(env,arg1,pvVar4);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        iVar3 = 1;
        if (bVar1 == 0) goto LAB_7ffc3e7d9277;
      }
    }
    else {
LAB_7ffc3e7d9277:
      if (iVar3 != iVar2) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)) {
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x71906fd9b46e);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar4 == (void *)0x0) {
            pJVar10 = *env;
            pcVar12 = &DAT_7ffc3eba6000;
            pvVar4 = pvRam00007ffc3ebc0a70;
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
              if (((_DAT_7ffc3ebc7820 == (void *)0x0) &&
                  (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                            0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba626f,0,0),
                  lVar6 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc7820 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc7820;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,arg2);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x8c5729f47668a472);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar11);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
                FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  return;
                }
              }
              goto LAB_7ffc3e7d95e6;
            }
            pJVar10 = *env;
            pcVar12 = (char *)0x7ffc3eba6019;
            pvVar4 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar10->ThrowNew)(env,pvVar4,pcVar12);
        }
      }
    }
  }
  else {
LAB_7ffc3e7d9546:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x99), lVar7 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e7d95ef;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
LAB_7ffc3e7d95e6:
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e7d95ef:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x99), lVar7 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7d969e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_02_1_11 | RVA 0x96f0 | dev/krypton/02.1(JSLdev/krypton/6x;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_02_1_11
               (JNINativeInterface_ **env,void *receiver,longlong arg0,short arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  void *arg1_00;
  undefined8 uVar7;
  JNINativeInterface_ *pJVar8;
  ulonglong uVar9;
  char *arg2_00;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar3 == (void *)0x0) {
    return 0;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x2f);
  if (pvVar4 == (void *)0x0) {
    return 0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76c30(env,0x38);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x98);
  if (lVar6 == 0) {
    return 0;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)) {
    uVar9 = uVar9 ^ ((ulonglong)(ushort)arg1 | arg0 << 0x10);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar9 ^ 0x4b1f6628b6a9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar3 == (void *)0x0) {
        pJVar8 = *env;
        arg2_00 = &DAT_7ffc3eba6000;
        pvVar3 = pvRam00007ffc3ebc0a70;
      }
      else {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
          if (((_DAT_7ffc3ebc2ed8 == (void *)0x0) &&
              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                        0x7ffc3ebaac13,0x7ffc3eba6245,0,0), lVar6 != 0)) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc2ed8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
          pvVar4 = _DAT_7ffc3ebc2ed8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,0,arg2);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x3cc0ad5b85d910c1);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
            uVar7 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,arg1_00);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              bVar1 = FUN_7ffc3e7d53d0(env,uVar7,uRam00007ffc3ebc0a38);
              if (lVar5 != 0) {
                return bVar1;
              }
              return bVar1 == 0;
            }
          }
          goto LAB_7ffc3e7d9ae8;
        }
        pJVar8 = *env;
        arg2_00 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
      (*pJVar8->ThrowNew)(env,pvVar3,arg2_00);
    }
  }
LAB_7ffc3e7d9ae8:
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x99), lVar6 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar3);
      }
    }
  }
  return 0;
}

/* JNI_dev_krypton_02_1_12 | RVA 0x9b90 | dev/krypton/02.1(Ldev/krypton/4r;JLdev/krypton/6x;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_02_1_12
               (JNINativeInterface_ **env,void *receiver,void *arg0,longlong arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  void *arg1_00;
  JNINativeInterface_ *pJVar7;
  longlong lVar8;
  char *arg2_00;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar3 == (void *)0x0) {
    return 0;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x2f);
  if (pvVar4 == (void *)0x0) {
    return 0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar5 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar5 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)) {
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ arg1 ^ 0x55bfb1c4fe72);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar3 == (void *)0x0) {
        pJVar7 = *env;
        arg2_00 = &DAT_7ffc3eba6000;
        pvVar3 = pvRam00007ffc3ebc0a70;
      }
      else {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
          if (((_DAT_7ffc3ebc7808 == (void *)0x0) &&
              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                        0x7ffc3ebaac13,0x7ffc3ebaaec7,0,0), lVar6 != 0)) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc7808 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
          pvVar4 = _DAT_7ffc3ebc7808;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,0,arg2);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x919c0aebf6fe3c02);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar5 ^ arg1);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,arg1_00);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              bVar1 = (*(*env)->IsSameObject)(env,pvVar3,arg0);
              return bVar1 != 0;
            }
            pvVar3 = (*(*env)->ExceptionOccurred)(env);
            goto LAB_7ffc3e7d9f21;
          }
          goto LAB_7ffc3e7d9f18;
        }
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
      (*pJVar7->ThrowNew)(env,pvVar3,arg2_00);
    }
  }
LAB_7ffc3e7d9f18:
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e7d9f21:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar6 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar6,0x99), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar3);
      }
    }
  }
  return 0;
}

/* JNI_dev_krypton_02_3_13 | RVA 0x9fd0 | dev/krypton/02.3(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_3_13(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  void *arg1;
  undefined8 *puVar11;
  ulonglong uVar12;
  char *pcStack_70;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if ((pvVar4 != (void *)0x0) &&
     (pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x2f), pvVar5 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar12 = *(ulonglong *)
                (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                (longlong)*(int *)((longlong)pvVar5 + 0x10));
    }
    else {
      uVar12 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c30(env,0x38), lVar6 != 0)) &&
       (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x98), lVar7 != 0)) {
      lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc23d8 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x37);
          lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
          if ((lVar7 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc23d8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc23d8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar12 = uVar12 ^ arg0;
          pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x9c453287843099fe);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar8);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc23e0 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x37);
              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,0x7ffc3eba606c,
                                       0x7ffc3ebaac13,0x7ffc3eba61d9,0,0);
              if ((lVar7 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc23e0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc23e0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x9c4243d3b94f5105);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pcStack_70 = (char *)0x7ffc3eba6019;
                while( true ) {
                  if (_DAT_7ffc3ebc23e8 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x37);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba6204,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc23e8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc23e8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) break;
                  pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x9c4577b73f40e1d1);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                  uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
                  if (cVar2 == '\0') {
                    return;
                  }
                  if (_DAT_7ffc3ebc23f0 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x37);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba621c,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc23f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc23f0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x9c407fa10b4e2a85);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar8 = (void *)FUN_7ffc3eb76c30(env,2);
                  if (pvVar8 == (void *)0x0) {
                    return;
                  }
                  if ((pvVar5 != (void *)0x0) &&
                     (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8), bVar1 == 0)) {
                    pcStack_70 = (char *)0x7ffc3eba6033;
                    puVar11 = (undefined8 *)0x7ffc3ebc0a58;
LAB_7ffc3e7dab10:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7dab30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (*(*env)->ThrowNew)(env,(void *)*puVar11,pcStack_70);
                    return;
                  }
                  pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                  if (lVar7 == 0) {
                    return;
                  }
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                    uVar12 ^ 0x6c76f49f04ad);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar8 == (void *)0x0) {
                    puVar11 = (undefined8 *)0x7ffc3ebc0a70;
                    pcStack_70 = &DAT_7ffc3eba6000;
                    goto LAB_7ffc3e7dab10;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar8);
                  }
                  if (iVar3 < 1) {
                    puVar11 = (undefined8 *)0x7ffc3ebc0a98;
                    goto LAB_7ffc3e7dab10;
                  }
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
                  if (_DAT_7ffc3ebc23f8 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x37);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba626f,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar9 != (void *)0x0)) {
                      _DAT_7ffc3ebc23f8 = (*(*env)->NewGlobalRef)(env,pvVar9);
                    }
                  }
                  pvVar9 = _DAT_7ffc3ebc23f8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar5);
                  (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar8);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x9c4097596cf6a27d);
                  (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar5);
                  FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (lVar6 != 0) {
                    return;
                  }
                  if (bVar1 != 0) {
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
  return;
}

/* JNI_dev_krypton_02_3_14 | RVA 0xab40 | dev/krypton/02.3(JLjava/lang/String;Ldev/krypton/6x;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_02_3_14
               (JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  undefined8 uVar7;
  JNINativeInterface_ *pJVar8;
  ulonglong uVar9;
  char *arg2_00;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if ((pvVar3 != (void *)0x0) &&
     (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x2f), pvVar4 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar9 = *(ulonglong *)
               (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
               (longlong)*(int *)((longlong)pvVar4 + 0x10));
    }
    else {
      uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar5 != 0)) {
        uVar9 = uVar9 ^ arg0;
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x36faf6e39372);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar3 == (void *)0x0) {
            pJVar8 = *env;
            arg2_00 = &DAT_7ffc3eba6000;
            pvVar3 = pvRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
            }
            if (0 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
              if (((_DAT_7ffc3ebc79f0 == (void *)0x0) &&
                  (lVar5 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                            0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba630c,0,0),
                  lVar5 != 0)) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc79f0 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
              pvVar4 = _DAT_7ffc3ebc79f0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,arg2);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x601a11c2bba159d);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar3);
              pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              if (((_DAT_7ffc3ebc79f8 == (void *)0x0) &&
                  (lVar5 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebaac04,0x7ffc3eba6299,
                                            0x7ffc3eba606c,0x7ffc3ebaac13,0x7ffc3eba6245,0,0),
                  lVar5 != 0)) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc79f8 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
              pvVar4 = _DAT_7ffc3ebc79f8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,arg1);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x600f57e63f402f7);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar3);
              uVar7 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              bVar1 = FUN_7ffc3e7d53d0(env,uVar7,uRam00007ffc3ebc0a38);
              return bVar1;
            }
            pJVar8 = *env;
            arg2_00 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar8->ThrowNew)(env,pvVar3,arg2_00);
        }
      }
    }
  }
  return 0;
}

/* JNI_dev_krypton_02_9_15 | RVA 0xb080 | dev/krypton/02.9(Z)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_9_15(JNINativeInterface_ **env,void *receiver,byte arg0)

{
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (arg1 != (void *)0x0) {
    arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0x34);
    if (arg2 != (void *)0x0) {
      (*(*env)->SetStaticBooleanField)(env,arg1,arg2,arg0);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7db0d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  return;
}

/* JNI_dev_krypton_02_2_16 | RVA 0xb0f0 | dev/krypton/02.2()Z | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_02_2_16(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  byte bVar2;
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if ((arg1 != (void *)0x0) && (arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0x34), arg2 != (void *)0x0)
     ) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      bVar1 = *(byte *)(*(longlong *)((ulonglong)arg1 & 0xfffffffffffffffc) +
                       (longlong)*(int *)((longlong)arg2 + 0x10));
    }
    else {
      bVar1 = (*(*env)->GetStaticBooleanField)(env,arg1,arg2);
    }
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 == 0) {
      return bVar1;
    }
  }
  return 0;
}

/* JNI_dev_krypton_02_6_17 | RVA 0xb170 | dev/krypton/02.6()Z | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_02_6_17(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x37);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x9a), lVar4 != 0)) {
    iVar2 = FUN_7ffc3e7db1e0(env,lVar3,lVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      return iVar2 == 0;
    }
  }
  return 0;
}

/* JNI_dev_krypton_02_a_18 | RVA 0xb210 | dev/krypton/02.a(Ljava/lang/MatchException;)Ljava/lang/MatchException; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_a_18(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_02_a_19 | RVA 0xb220 | dev/krypton/02.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_02_a_19(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x35);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3e7dbb74:
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
LAB_7ffc3e7db334:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x37);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x36);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7dbb74;
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
          iVar5 = *(int *)(&DAT_7ffc3eb99000 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7dbb1e;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3e7dbb04;
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
LAB_7ffc3e7db99e:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x37);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x35), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7dbb74;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3e7dbb3f;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3e7db334;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3e7db74d;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3e7db74d:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3e7dbb04;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3e7db99e;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3e7dbb04;
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
                    goto LAB_7ffc3e7dbb35;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3e7dbb04;
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
LAB_7ffc3e7dbb1e:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3e7dbb35;
        }
        goto LAB_7ffc3e7db334;
      }
    }
LAB_7ffc3e7dbb3f:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3e7dbb04:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e7dbb35:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_02_a_20 | RVA 0xbbf0 | dev/krypton/02.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_02_a_20(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x36);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf00);
  if (pvVar4 == (void *)0x0) goto LAB_7ffc3e7dd596;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
  }
  if (0 < iVar2) {
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf0f);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (1 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf1e);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (2 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
        pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf36);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (3 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar5);
          pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf54);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (4 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar5);
            pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf63);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (5 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar5);
              pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a08,0xd);
              if (pvVar5 == (void *)0x0) {
                return;
              }
              pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a08,pvVar5);
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
              if (6 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar5);
                pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x35);
                if (pvVar5 == (void *)0x0) {
                  return;
                }
                pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
                if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7dd596;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                }
                if (6 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,6,pvVar7);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf77);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (7 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf8b);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (8 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaaf9a);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                      }
                      if (9 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,9,pvVar6);
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
                        if (10 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
                          if (pvVar6 == (void *)0x0) {
LAB_7ffc3e7dd596:
                            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                            arg2 = &DAT_7ffc3eba6000;
                            pvVar3 = pvRam00007ffc3ebc0a70;
                            goto LAB_7ffc3e7dd570;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (10 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,10,pvVar7);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaafb4);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (0xb < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,0xb,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaafc8);
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
                                pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0960,0xc);
                                if (pvVar6 == (void *)0x0) {
                                  return;
                                }
                                pvVar6 = (*(*env)->GetStaticObjectField)
                                                   (env,pvRam00007ffc3ebc0960,pvVar6);
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
                                if (0xd < iVar2) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0xd,pvVar6);
                                  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65aa);
                                  if (pvVar3 == (void *)0x0) goto LAB_7ffc3e7dd596;
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar2 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                                  }
                                  if (0xd < iVar2) {
                                    (*(*env)->SetObjectArrayElement)(env,pvVar3,0xd,pvVar5);
                                    pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaafdc);
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
                                      pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab003);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                      }
                                      if (0xf < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0xf,pvVar3);
                                        pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab016)
                                        ;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                        }
                                        if (0x10 < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0x10,pvVar3);
                                          pvVar3 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3ebab02a);
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
                                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0x11,pvVar3)
                                            ;
                                            pvVar3 = (*(*env)->NewStringUTF)
                                                               (env,(char *)0x7ffc3ebab03b);
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
                                                                 (env,(char *)0x7ffc3ebab04d);
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
                                                                   (env,(char *)0x7ffc3ebab065);
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar4 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                }
                                                if (0x14 < iVar2) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0x14,pvVar3);
                                                  pvVar3 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3ebab07d);
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
                                                  if (0x15 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x15,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab095);
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
                                                    if (0x16 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x16,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab0b2
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
                                                      if (0x17 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x17,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab0c0);
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
                                                  if (0x18 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x18,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab0d4);
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
                                                    if (0x19 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x19,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab0e5
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
                                                      if (0x1a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1a,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab0f8);
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
                                                  if (0x1b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1b,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab10c);
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
                                                    if (0x1c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1c,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab126
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
                                                      if (0x1d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1d,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab14f);
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
                                                  if (0x1e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1e,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab174);
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
                                                    if (0x1f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1f,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab19d
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
                                                      if (0x20 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x20,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab1c1);
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
                                                  if (0x21 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x21,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab1e7);
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
                                                    if (0x22 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x22,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab213
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
                                                      if (0x23 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x23,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab236);
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
                                                  if (0x24 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x24,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab252);
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
                                                    if (0x25 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x25,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab27c
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
                                                      if (0x26 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x26,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab29a);
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
                                                  if (0x27 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x27,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab2bf);
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
                                                    if (0x28 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x28,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab2e4
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
                                                      if (0x29 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x29,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab302);
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
                                                  if (0x2a < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2a,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab333);
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
                                                    if (0x2b < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2b,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab35c
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
                                                      if (0x2c < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2c,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab37d);
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
                                                  if (0x2d < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2d,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab39e);
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
                                                    if (0x2e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2e,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab3c2
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
                                                      if (0x2f < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2f,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab3e3);
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
                                                  if (0x30 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x30,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab403);
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
                                                    if (0x31 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x31,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab41a
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
                                                      if (0x32 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x32,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab43e);
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
                                                  if (0x33 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x33,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab45f);
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
                                                    if (0x34 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x34,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab478
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
                                                      if (0x35 < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7dd551. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x35,pvVar3);
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
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = (char *)0x7ffc3eba6019;
  pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e7dd570:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7dd582. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_02_b_21 | RVA 0xd5b0 | dev/krypton/02.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_b_21(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0x9b);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x36);
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
      goto LAB_7ffc3e7dda56;
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
      goto LAB_7ffc3e7dda56;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x37);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3e7dd91a:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x35);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3e7dd900:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x36);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7dd8fa;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e7dd900;
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
                    goto LAB_7ffc3e7dd8e0;
                  }
                }
              }
              goto LAB_7ffc3e7dd91a;
            }
LAB_7ffc3e7dd8e0:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3e7dd91a;
      }
LAB_7ffc3e7dd8fa:
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
LAB_7ffc3e7dda56:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_a_22 | RVA 0xda70 | dev/krypton/02.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_a_22
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
LAB_7ffc3e7ddcd1:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e7ddced;
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
        if (lVar6 == 0) goto LAB_7ffc3e7ddcd1;
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
LAB_7ffc3e7ddced:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_b_23 | RVA 0xdd20 | dev/krypton/02.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_b_23
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x37);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x9c), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x37);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x9d);
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

/* JNI_dev_krypton_02_c_24 | RVA 0xdf50 | dev/krypton/02.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_c_24(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x9b);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x36);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7dec80;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3e7dec66;
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
    goto LAB_7ffc3e7dec94;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x35);
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
LAB_7ffc3e7dec66:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7dec94;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x9e);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x9c);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3e7dec80;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3e7dec66;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x37);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0x9d);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x36);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3e7dec80;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3e7dec66;
              pJVar14 = *env;
              goto LAB_7ffc3e7de847;
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
        if (lVar9 == 0) goto LAB_7ffc3e7dec80;
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
          goto LAB_7ffc3e7dec80;
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
          lVar8 = FUN_7ffc3eb76c30(env,0x37);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x9e);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x47cfdf2edf003,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x36);
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
LAB_7ffc3e7de847:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3e7dec66;
      }
    }
  }
LAB_7ffc3e7dec80:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7dec94:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_a_25 | RVA 0xecd0 | dev/krypton/02.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_a_25
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,int arg3
                 ,void *arg4)

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
LAB_7ffc3e7df0fa:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e7df108;
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
        if (lVar7 == 0) goto LAB_7ffc3e7df0fa;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3e7df0fa;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3e7df0ec;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3e7df0fa;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e7df0ec;
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
LAB_7ffc3e7df0ec:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e7df108:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_b_26 | RVA 0xf130 | dev/krypton/02.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_b_26
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,int arg3
                 ,void *arg4)

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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x37);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x9f), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x37);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xa0);
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

/* JNI_dev_krypton_02_d_27 | RVA 0xf3a0 | dev/krypton/02.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_d_27(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x37);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x9b);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x36);
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
LAB_7ffc3e7e05e7:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7e05ff;
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
      goto LAB_7ffc3e7e05ff;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x35);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3e7e05e7;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x9e);
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
            lVar6 = FUN_7ffc3eb76c30(env,0x37);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x9e);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3e7e05d1;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3e7e05e7;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3e7dfa50:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x37);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x9f);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x36);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3e7dffd1:
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
              goto LAB_7ffc3e7e05e7;
            }
            goto LAB_7ffc3e7e05d1;
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
              if (iVar4 == 0) goto code_r0x7ffc3e7dfb8e;
              goto joined_r0x7ffc3e7dfc51;
            }
          }
          goto LAB_7ffc3e7e05d1;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3e7e05ff;
      }
    }
  }
  goto LAB_7ffc3e7e05d1;
code_r0x7ffc3e7dfb8e:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3e7dfbdc;
  goto LAB_7ffc3e7dfa50;
code_r0x7ffc3e7dfbdc:
  lVar6 = FUN_7ffc3eb76c30(env,0x37);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0x9e);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x47cfdf2edf003,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3e7dfc51:
  do {
    if (lVar10 == 0) goto LAB_7ffc3e7e05d1;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3e7e05e7;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x37);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0xa0);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x36);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3e7dffd1;
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
    if (lVar6 == 0) goto LAB_7ffc3e7e05d1;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3e7e05d1;
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
      if (lVar10 == 0) goto LAB_7ffc3e7e05d1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e7e05d1;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3e7e05d1;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e7e05d1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e7e05d1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e7e05d1;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3e7e05d1;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3e7e0328;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e7e05d1;
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
      lVar6 = FUN_7ffc3eb76c30(env,0x37);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x9e);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x47cfdf2edf003,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3e7e05d1;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3e7e05e7;
  }
LAB_7ffc3e7e0328:
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
LAB_7ffc3e7e05d1:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7e05ff:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_a_28 | RVA 0x10630 | dev/krypton/02.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_a_28
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
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
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3e7e1448;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (((iVar2 - 200U < 0x2d) && ((0x100000000801U >> ((ulonglong)(iVar2 - 200U) & 0x3f) & 1) != 0))
     || (iVar2 == 0x73)) {
    lVar4 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xa1), lVar5 == 0))
    goto LAB_7ffc3e7e0de9;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e7e0de9;
    if (lVar4 == 0) goto LAB_7ffc3e7e0e43;
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
            if (iVar2 == 200) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3e7e0e43;
              uVar15 = 0x50;
            }
            else if (iVar2 == 0xd3) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3e7e0e43;
              uVar15 = 0x51;
            }
            else if (iVar2 == 0xf4) {
              if (arg0 == (void *)0x0) {
LAB_7ffc3e7e0e43:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3e7e0e5d;
              }
              uVar15 = 0x4f;
            }
            else {
              if (arg0 == (void *)0x0) goto LAB_7ffc3e7e0e43;
              uVar15 = 0x52;
            }
            lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
            if (lVar5 == 0) goto LAB_7ffc3e7e0e5d;
            uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar7,uVar8,uVar9);
            uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3e7e0e5d;
            lVar5 = 0;
LAB_7ffc3e7e0b28:
            if (arg3 == (void *)0x0) {
              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e7e0ef2:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            else {
              lVar6 = FUN_7ffc3eb76c30(env,0x19);
              if ((lVar6 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x24), lVar6 == 0))
              goto LAB_7ffc3e7e0ef2;
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
                          if (iVar3 < 2) goto LAB_7ffc3e7e0e26;
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
                        goto LAB_7ffc3e7e0f3d;
                      }
LAB_7ffc3e7e0e26:
                      pJVar13 = *env;
                      arg2_00 = (char *)0x7ffc3eba6019;
                      pvVar10 = pvRam00007ffc3ebc0a98;
                    }
                    (*pJVar13->ThrowNew)(env,pvVar10,arg2_00);
                  }
                }
              }
LAB_7ffc3e7e0f3d:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            goto joined_r0x7ffc3e7e0ec8;
          }
        }
      }
    }
LAB_7ffc3e7e0e5d:
    pvVar10 = (*(*env)->ExceptionOccurred)(env);
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
    lVar5 = 0;
    if (bVar1 == 0) {
      return (void *)0x0;
    }
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(env,0x37);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xa2), lVar5 == 0)) {
LAB_7ffc3e7e0de9:
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
      if (bVar1 != 0) goto LAB_7ffc3e7e0de9;
      if (lVar5 == 0) {
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e7e0f97:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
joined_r0x7ffc3e7e0ec8:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3e7e0fcd;
      }
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x54), lVar6 == 0))
      goto LAB_7ffc3e7e0f97;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x47), lVar6 == 0))
      goto LAB_7ffc3e7e0f97;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x48), lVar6 == 0))
      goto LAB_7ffc3e7e0f97;
      uVar9 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x49), lVar4 == 0)) {
LAB_7ffc3e7e0e98:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
        goto joined_r0x7ffc3e7e0ec8;
      }
      uVar15 = FUN_7ffc3e7d1a50(env,lVar5,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) ||
         ((lVar4 = FUN_7ffc3eb76c30(env,0x19), lVar4 == 0 ||
          (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x55), lVar6 == 0)))) goto LAB_7ffc3e7e0e98;
      uVar9 = FUN_7ffc3e7d1a80(env,lVar4,lVar6,uVar9,uVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e7e0e98;
      if (iVar2 == 0xf9) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e7e1464;
        uVar15 = 0x57;
LAB_7ffc3e7e0d72:
        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
joined_r0x7ffc3e7e0da5:
        if (lVar4 != 0) {
          uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar7,uVar8,uVar9);
          uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            lVar4 = 0;
            goto LAB_7ffc3e7e0b28;
          }
        }
      }
      else {
        if (iVar2 == 0x43) {
          if (arg0 != (void *)0x0) {
            uVar15 = 0x56;
            goto LAB_7ffc3e7e0d72;
          }
        }
        else if (arg0 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
          goto joined_r0x7ffc3e7e0da5;
        }
LAB_7ffc3e7e1464:
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
LAB_7ffc3e7e0fcd:
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
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3e7e1448;
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x28);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar12,pvVar11,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3e7e1448;
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,pvVar10,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto LAB_7ffc3e7e1448;
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
  if (lVar14 == 0) goto LAB_7ffc3e7e1448;
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
      goto joined_r0x7ffc3e7e11fc;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar14 = FUN_7ffc3eb76c90(env,lVar5,0x5a);
joined_r0x7ffc3e7e11fc:
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
LAB_7ffc3e7e1448:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_a_29 | RVA 0x114c0 | dev/krypton/02.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_a_29
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3e7e1906;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3e7e1541:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3e7e1541;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3e7e18e9:
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
LAB_7ffc3e7e1918:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e7e1655;
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
      if (iVar2 < iVar3) goto LAB_7ffc3e7e18e9;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3e7e1918;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x37);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xa3);
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
            goto LAB_7ffc3e7e164e;
          }
        }
LAB_7ffc3e7e1906:
        pJVar7 = *env;
      }
    }
LAB_7ffc3e7e164e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e7e1655:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_02_a_30 | RVA 0x11970 | dev/krypton/02.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_02_a_30
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7e22ae;
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
  if (_DAT_7ffc3ebc0b58 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x37);
    uVar11 = FUN_7ffc3eb76c30(env,0x37);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b58 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b58;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e7e1f30:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7e1f44:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e7e1f30;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e7e1f30;
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
                        goto LAB_7ffc3e7e1f4a;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e7e1f44;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7e1f4a:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebaac04);
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
LAB_7ffc3e7e22ae:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

