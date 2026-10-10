/* Native reconstruction for dev/krypton/65.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_65_6_0 | RVA 0x188470 | dev/krypton/65.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_65_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  longlong lVar10;
  longlong lVar11;
  undefined8 uVar12;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar13;
  char *arg2;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xb1);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar7 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar6 + 0x10));
  }
  else {
    uVar7 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar6);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1d60 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
    if ((lVar10 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d60 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1d60;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar13 = uVar7 ^ 0x781be6f5142c;
  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c6da3b4ed8e1e58
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1d68 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba7fdc,0x7ffc3eba71d3,0,0);
    if ((lVar10 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d68 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1d68;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c627d3b66f0471a
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1d70 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba7fdc,0x7ffc3eba7e3d,0,0);
    if ((lVar10 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d70 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc1d70;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c6cb918a9372511
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1d78 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba7527,0x7ffc3ebb22d1,0,0);
    if ((lVar10 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d78 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc1d78;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c630e4fa364ef14
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c30(env,0xaa);
  if (lVar10 == 0) {
    return;
  }
  lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x1be);
  if (lVar11 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar10,lVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1d80 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
    if ((lVar10 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d80 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1d80;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c6da3b4ed8e1e58
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
  if (lVar10 == 0) {
    return;
  }
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar10,uVar7 ^ 0x474fc494a9f9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3e95a51a:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e95a628:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95a63b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2);
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if (iVar4 < 1) {
LAB_7ffc3e95a60c:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e95a628;
  }
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
  if (_DAT_7ffc3ebc1d88 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar11 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba62b4,0x7ffc3eba6167,0,0);
    if ((lVar11 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d88 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc1d88;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c60d88b90dc2203
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar10,uVar7 ^ 0x586def8c9627);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e95a51a;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if (iVar4 < 1) goto LAB_7ffc3e95a60c;
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
  if (_DAT_7ffc3ebc1d90 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba62b4,0x7ffc3eba626f,0,0);
    if ((lVar10 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d90 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc1d90;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c637579410785d5
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1d98 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,4);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
    if ((lVar10 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
    {
      _DAT_7ffc3ebc1d98 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1d98;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c6da3b4ed8e1e58);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95a537;
    if (_DAT_7ffc3ebc1da0 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,4);
      lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3eba7fdc,0x7ffc3eba7eee,0,0);
      if ((lVar10 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc1da0 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1da0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95a537;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c6f493bf9d160b7);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95a537;
    if (iVar3 == 0) {
      if (pvVar5 == (void *)0x0) {
        if (_DAT_7ffc3ebc1dc8 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,4);
          lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3eba7fdc,0x7ffc3eba71d3,0,0);
          if ((lVar10 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1dc8 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1dc8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c627d3b66f0471a);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc1dd0 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,4);
              lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3eba7fdc,0x7ffc3eba7e3d,0,0);
              if ((lVar10 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc1dd0 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc1dd0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c6cb918a9372511);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) goto LAB_7ffc3e9593b5;
            }
          }
        }
        goto LAB_7ffc3e95a77a;
      }
      if (_DAT_7ffc3ebc1da8 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,4);
        lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3eba7fdc,0x7ffc3eba71d3,0,0);
        if ((lVar10 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar5 != (void *)0x0)) {
          _DAT_7ffc3ebc1da8 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc1da8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c627d3b66f0471a);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc1db0 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,4);
            lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
            if ((lVar10 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc1db0 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc1db0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c6da3b4ed8e1e58);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
            pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1db8 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,4);
                lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3eba7fdc,0x7ffc3eba7eee,0,0);
                if ((lVar10 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc1db8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc1db8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c6f493bf9d160b7);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc1dc0 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,4);
                    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3eba62b4,0x7ffc3eba626f,0,0);
                    if ((lVar10 != 0) &&
                       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                       pvVar8 != (void *)0x0)) {
                      _DAT_7ffc3ebc1dc0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                    }
                  }
                  pvVar8 = _DAT_7ffc3ebc1dc0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c605a4a4d829221);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
                    FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) goto LAB_7ffc3e959cc5;
                  }
                }
              }
            }
          }
        }
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
      if (bVar1 != 0) goto LAB_7ffc3e95a66e;
      goto LAB_7ffc3e95a6e6;
    }
LAB_7ffc3e9593b5:
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xab);
    if (pvVar6 != (void *)0x0) {
      if ((pvVar5 == (void *)0x0) ||
         (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6), bVar1 == 0)) {
LAB_7ffc3e959cc5:
        if (receiver != (void *)0x0) {
          lVar10 = FUN_7ffc3eb76c30(env,2);
          if (lVar10 == 0) {
            return;
          }
          lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x5f);
          if (lVar11 == 0) {
            return;
          }
          FUN_7ffc3e7dbbc0(env,receiver,lVar10,lVar11);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e959d2d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        goto LAB_7ffc3e95a51a;
      }
      if (_DAT_7ffc3ebc1dd8 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,4);
        lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
        if ((lVar10 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar5 != (void *)0x0)) {
          _DAT_7ffc3ebc1dd8 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc1dd8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c6da3b4ed8e1e58);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc1de0 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,4);
            lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba6299,0x7ffc3eba606c,
                                      0x7ffc3eba72e6,0x7ffc3eba647c,0,0);
            if ((lVar10 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc1de0 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc1de0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x52b6);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar7 ^ 0x2a8223ffaad17d26);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
            uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              uVar2 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
              if (_DAT_7ffc3ebc1de8 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,4);
                lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3eba7527,0x7ffc3eba72ac,0,0);
                if ((lVar10 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc1de8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc1de8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                  uVar2);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c62e7e999985460);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar5);
                FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) goto LAB_7ffc3e959cc5;
              }
            }
          }
        }
      }
    }
  }
  else {
LAB_7ffc3e95a537:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar10 = FUN_7ffc3eb76c30(env,4);
    if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x1bf), lVar11 == 0)) {
LAB_7ffc3e95a5d7:
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar5);
        goto LAB_7ffc3e95a5d7;
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e95a66e:
    (*(*env)->ExceptionClear)(env);
    lVar10 = FUN_7ffc3eb76c30(env,4);
    if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x1bf), lVar11 == 0)) {
LAB_7ffc3e95a6da:
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar5);
        goto LAB_7ffc3e95a6da;
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e95a6e6:
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar10 = FUN_7ffc3eb76c30(env,4);
    if ((lVar10 != 0) && (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x1bf), lVar11 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar5 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e95a783;
      }
      (*(*env)->Throw)(env,pvVar5);
    }
  }
LAB_7ffc3e95a77a:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e95a783:
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar10 = FUN_7ffc3eb76c30(env,4);
    if ((lVar10 != 0) && (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x1bf), lVar11 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95a832. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar5);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_65_1_1 | RVA 0x18a850 | dev/krypton/65.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_65_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  JNINativeInterface_ *pJVar12;
  ulonglong uVar13;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb1);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar6 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar6 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0xaa);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1c0);
  if (lVar8 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1cd8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,4);
    lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba7fdc,0x7ffc3eba71d3,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1cd8 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1cd8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar13 = uVar6 ^ 0x627e16d9c0ef;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8a1675e96dc93d9);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95c68b;
    if (_DAT_7ffc3ebc1ce0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,4);
      lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7fdc,0x7ffc3eba7e3d,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ce0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1ce0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95c68b;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8afa37d591bf1d2);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2f), pvVar5 == (void *)0x0))
    goto LAB_7ffc3e95c68b;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (iVar3 == 0) {
LAB_7ffc3e95b7ec:
        if (bVar1 == 0) {
LAB_7ffc3e95bd77:
          if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95c78f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
            return;
          }
          lVar7 = FUN_7ffc3eb76c30(env,2);
          if (lVar7 == 0) {
            return;
          }
          lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x61);
          if (lVar8 == 0) {
            return;
          }
          FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95bddf. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        if (_DAT_7ffc3ebc1d48 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,4);
          lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
          if ((lVar7 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1d48 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1d48;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8aeb9d11da2ca9b);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc1d50 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,4);
              lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba6299,0x7ffc3eba606c,
                                       0x7ffc3eba72e6,0x7ffc3eba647c,0,0);
              if ((lVar7 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc1d50 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc1d50;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x72c3);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar6 ^ 0x227c26bb9386dd4c);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                uVar2 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
                if (_DAT_7ffc3ebc1d58 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,4);
                  lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c
                                           ,0x7ffc3eba7527,0x7ffc3eba72ac,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc1d58 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc1d58;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                    uVar2);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xc8a1fd8c69b480a3);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) goto LAB_7ffc3e95bd77;
                }
              }
            }
          }
        }
        goto LAB_7ffc3e95c902;
      }
      if (bVar1 == 0) goto LAB_7ffc3e95b5e2;
      if (_DAT_7ffc3ebc1ce8 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,4);
        lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
        if ((lVar7 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1ce8 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1ce8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8aeb9d11da2ca9b);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc1cf0 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,4);
            lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7fdc,0x7ffc3eba7eee,0,0);
            if ((lVar7 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc1cf0 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc1cf0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8ac535e09fdb474);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1cf8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,4);
                lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba62b4,0x7ffc3eba743f,0,0);
                if ((lVar7 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc1cf8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc1cf8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc8af68fddeaf4ee0);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc1d00 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,4);
                    lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3eba7fdc,0x7ffc3eba71d3,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar4 != (void *)0x0)) {
                      _DAT_7ffc3ebc1d00 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc1d00;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8a1675e96dc93d9);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc1d08 == (void *)0x0) {
                        uVar11 = FUN_7ffc3eb76c30(env,4);
                        lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,
                                                 0x7ffc3eba606c,0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar5 != (void *)0x0)) {
                          _DAT_7ffc3ebc1d08 = (*(*env)->NewGlobalRef)(env,pvVar5);
                        }
                      }
                      pvVar5 = _DAT_7ffc3ebc1d08;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0xc8aeb9d11da2ca9b);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
                        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar13);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
                        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc1d10 == (void *)0x0) {
                            uVar11 = FUN_7ffc3eb76c30(env,4);
                            lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba7fdc,0x7ffc3eba7e3d,0,
                                                     0);
                            if ((lVar7 != 0) &&
                               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                               pvVar9 != (void *)0x0)) {
                              _DAT_7ffc3ebc1d10 = (*(*env)->NewGlobalRef)(env,pvVar9);
                            }
                          }
                          pvVar9 = _DAT_7ffc3ebc1d10;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0xc8a0142a53483bd7);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar13);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,
                                                              pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc1d18 == (void *)0x0) {
                                uVar11 = FUN_7ffc3eb76c30(env,4);
                                lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,
                                                         0x7ffc3eba606c,0x7ffc3eba62b4,
                                                         0x7ffc3eba626f,0,0);
                                if ((lVar7 != 0) &&
                                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00
                                                                     ), pvVar9 != (void *)0x0)) {
                                  _DAT_7ffc3ebc1d18 = (*(*env)->NewGlobalRef)(env,pvVar9);
                                }
                              }
                              pvVar9 = _DAT_7ffc3ebc1d18;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar10 = (*(*env)->NewObjectArray)
                                                    (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
                                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0xc8a3402fbdae46e2);
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
                                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,uVar13);
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
                                FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc1d20 == (void *)0x0) {
                                    uVar11 = FUN_7ffc3eb76c30(env,4);
                                    lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
                                    if ((lVar7 != 0) &&
                                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar4 != (void *)0x0)) {
                                      _DAT_7ffc3ebc1d20 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                    }
                                  }
                                  pvVar4 = _DAT_7ffc3ebc1d20;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar5 = (*(*env)->NewObjectArray)
                                                       (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0xc8aeb9d11da2ca9b);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar13);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,
                                                                      uRam00007ffc3ebc0a40,pvVar5);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (_DAT_7ffc3ebc1d28 == (void *)0x0) {
                                        uVar11 = FUN_7ffc3eb76c30(env,4);
                                        lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,
                                                                 0x7ffc3eba606a,0x7ffc3eba606c,
                                                                 0x7ffc3eba7fdc,0x7ffc3eba7eee,0,0);
                                        if ((lVar7 != 0) &&
                                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                              uRam00007ffc3ebc0a00),
                                           pvVar5 != (void *)0x0)) {
                                          _DAT_7ffc3ebc1d28 = (*(*env)->NewGlobalRef)(env,pvVar5);
                                        }
                                      }
                                      pvVar5 = _DAT_7ffc3ebc1d28;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar9 = (*(*env)->NewObjectArray)
                                                           (env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                                        ;
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          0xc8ac535e09fdb474);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          uVar13);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                                        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,
                                                                          uRam00007ffc3ebc0a40,
                                                                          pvVar9);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          pvVar5 = (*(*env)->NewObjectArray)
                                                             (env,1,pvRam00007ffc3ebc09e0,
                                                              (void *)0x0);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if ((bVar1 == 0) &&
                                             (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1),
                                             lVar7 != 0)) {
                                            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x33fd383f858e)
                                            ;
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 == 0) {
                                              if (pvVar5 == (void *)0x0) {
                                                pJVar12 = *env;
                                                arg2 = &DAT_7ffc3eba6000;
                                                pvVar4 = pvRam00007ffc3ebc0a70;
                                              }
                                              else {
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar3 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar5 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
                                                }
                                                if (0 < iVar3) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar5,0,pvVar9);
                                                  if (_DAT_7ffc3ebc1d30 == (void *)0x0) {
                                                    uVar11 = FUN_7ffc3eb76c30(env,4);
                                                    lVar7 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                             0x7ffc3ebb22c2,
                                                                             0x7ffc3eba606a,
                                                                             0x7ffc3eba606c,
                                                                             0x7ffc3eba62b4,
                                                                             0x7ffc3eba626f,0,0);
                                                    if ((lVar7 != 0) &&
                                                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                                                                                                                                    
                                                  uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc1d30 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar9);
                                                  }
                                                  }
                                                  pvVar9 = _DAT_7ffc3ebc1d30;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar10 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,0,pvVar4);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,1,pvVar5);
                                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc8acb32916769a3b);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,2,pvVar4);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,3,pvVar4);
                                                  FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,
                                                                   pvVar10);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) goto LAB_7ffc3e95bd77;
                                                  }
                                                  goto LAB_7ffc3e95c7c6;
                                                }
                                                pJVar12 = *env;
                                                arg2 = (char *)0x7ffc3eba6019;
                                                pvVar4 = pvRam00007ffc3ebc0a98;
                                              }
                                              (*pJVar12->ThrowNew)(env,pvVar4,arg2);
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
LAB_7ffc3e95c7c6:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (bVar1 != 0) goto LAB_7ffc3e95c7f6;
      goto LAB_7ffc3e95c86e;
    }
    if (iVar3 == 0) goto LAB_7ffc3e95bd77;
LAB_7ffc3e95b5e2:
    if (_DAT_7ffc3ebc1d38 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,4);
      lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7fdc,0x7ffc3eba71d3,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1d38 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1d38;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8a1675e96dc93d9);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1d40 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,4);
          lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7fdc,0x7ffc3eba7e3d,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1d40 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1d40;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8afa37d591bf1d2);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if ((bVar1 == 0) && (pvVar5 = (void *)FUN_7ffc3eb76c30(env,0xab), pvVar5 != (void *)0x0))
          {
            if (pvVar4 == (void *)0x0) goto LAB_7ffc3e95bd77;
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
            goto LAB_7ffc3e95b7ec;
          }
        }
      }
    }
  }
  else {
LAB_7ffc3e95c68b:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,4);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1bf), lVar8 == 0)) {
LAB_7ffc3e95c72b:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e95c72b;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e95c7f6:
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,4);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1bf), lVar8 == 0)) {
LAB_7ffc3e95c862:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e95c862;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e95c86e:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,4);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1bf), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e95c90b;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
LAB_7ffc3e95c902:
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e95c90b:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,4);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1bf), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95c9aa. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_65_1_2 | RVA 0x18c9e0 | dev/krypton/65.1(Ldev/krypton/6p;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_65_1_2(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb1);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar6 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar6 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0xaa);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1c0);
  if (lVar8 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2e60 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,4);
    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebaf8e8,0x7ffc3eba6153,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc2e60 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc2e60;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar6 ^ 0x4418d83e77c3;
    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x7f829fb7d3457db7);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95d2bd;
    if (_DAT_7ffc3ebc2e68 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,4);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7fdc,0x7ffc3eba6204,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2e68 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2e68;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95d2bd;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x7f8ddbeaa753378f);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e95d2bd;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
    if (iVar3 == 0) {
LAB_7ffc3e95cfa0:
      if (cVar2 == '\0') {
        return;
      }
      if (arg0 == (void *)0x0) {
LAB_7ffc3e95d35f:
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      }
      else {
        lVar7 = FUN_7ffc3eb76c30(env,0xac);
        if ((lVar7 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar7,0x1c1), lVar7 != 0)) {
          FUN_7ffc3e7e1940(env,arg0,lVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            return;
          }
        }
      }
    }
    else {
      if (cVar2 == '\0') {
        return;
      }
      lVar7 = FUN_7ffc3eb76c30(env,0xac);
      if ((lVar7 != 0) && (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,lVar7,0xb2), pvVar4 != (void *)0x0)
         ) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e95d35f;
        pvVar4 = (*(*env)->GetObjectField)(env,arg0,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (pvVar5 = (void *)FUN_7ffc3eb76c30(env,0xad), pvVar5 != (void *)0x0)) {
          if (pvVar4 == (void *)0x0) {
            return;
          }
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
          if (bVar1 == 0) {
            return;
          }
          if (_DAT_7ffc3ebc2e70 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,4);
            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7fdc,0x7ffc3ebabe8b,0,0);
            if ((lVar7 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc2e70 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc2e70;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x7f8d97d7b0bad13f);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc2e78 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,4);
                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb22c2,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba62b4,0x7ffc3ebabeb2,0,0);
                if ((lVar7 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc2e78 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc2e78;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar6 ^ 0x3072de2dc5c9);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x7f8f102294464619);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar11);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
                  goto LAB_7ffc3e95cfa0;
                }
              }
            }
          }
        }
      }
    }
  }
  else {
LAB_7ffc3e95d2bd:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,4);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1bf), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e95d382;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e95d382:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,4);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1bf), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95d431. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_65_a_3 | RVA 0x18d440 | dev/krypton/65.a(Ljava/lang/MatchException;)Ljava/lang/MatchException; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_a_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_65_a_4 | RVA 0x18d450 | dev/krypton/65.a(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_65_a_4(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb3);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e95ecf2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x27c4, iVar6 <= (int)arg2)) {
LAB_7ffc3e95ecd8:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e95ed06;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3e95ebc9:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,4);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb3);
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
      if (iVar6 <= (int)arg2) goto LAB_7ffc3e95ecd8;
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
    goto LAB_7ffc3e95ecf2;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e95ecf2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d612;
LAB_7ffc3e95d5d8:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d5d8;
LAB_7ffc3e95d612:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d69e;
LAB_7ffc3e95d661:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d661;
LAB_7ffc3e95d69e:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d72a;
LAB_7ffc3e95d6ed:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d6ed;
LAB_7ffc3e95d72a:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d7b6;
LAB_7ffc3e95d779:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d779;
LAB_7ffc3e95d7b6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d841;
LAB_7ffc3e95d804:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d804;
LAB_7ffc3e95d841:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d8cc;
LAB_7ffc3e95d88f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d88f;
LAB_7ffc3e95d8cc:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95d957;
LAB_7ffc3e95d91a:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95d91a;
LAB_7ffc3e95d957:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb4);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e95ecf2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3e95ecd8;
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
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e95ecf2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95db67;
LAB_7ffc3e95db2d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95db2d;
LAB_7ffc3e95db67:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95dbf3;
LAB_7ffc3e95dbb6:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95dbb6;
LAB_7ffc3e95dbf3:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95dc7f;
LAB_7ffc3e95dc42:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95dc42;
LAB_7ffc3e95dc7f:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95dd0b;
LAB_7ffc3e95dcce:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95dcce;
LAB_7ffc3e95dd0b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95dd96;
LAB_7ffc3e95dd59:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95dd59;
LAB_7ffc3e95dd96:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95de21;
LAB_7ffc3e95dde4:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95dde4;
LAB_7ffc3e95de21:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e95ecd8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e95deac;
LAB_7ffc3e95de6f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e95de6f;
LAB_7ffc3e95deac:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e95ecd8;
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
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb5);
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
LAB_7ffc3e95e591:
          pJVar16 = *env;
          goto LAB_7ffc3e95e597;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3e95e591;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e95e591;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3e95e577;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3e95ed11:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3e95e58b;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3e95e591;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e95e591;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3e95ed11;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3e95e597;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3e95e577;
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
                if (iVar6 < 3) goto LAB_7ffc3e95ed11;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,4);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0xb5);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3e95e59a;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3e95e577;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3e95e482;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e95e591;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3e95ed06;
        }
LAB_7ffc3e95e482:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3e95e577:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e95e58b:
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
                  if (iVar6 < 2) goto LAB_7ffc3e95ed11;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3e95e577;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3e95ed2e;
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
                        if (iVar6 < 1) goto LAB_7ffc3e95ed11;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3e95ed2e:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e95e58b;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3e95ed11;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3e95ed2e;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3e95e577;
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
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,4);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb3);
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
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3e95ecf2;
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
                                              goto LAB_7ffc3e95ebc9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e95ecd8;
                                  }
                                  goto LAB_7ffc3e95ecf2;
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
          goto LAB_7ffc3e95e591;
        }
LAB_7ffc3e95e597:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3e95e59a:
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
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb22c2);
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
LAB_7ffc3e95ecf2:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e95ed06:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_dev_krypton_65_a_5 | RVA 0x18ed80 | dev/krypton/65.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_65_a_5
              (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,void *arg3)

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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3e95f29d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3e95f280;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3e95f2af:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e95eec7;
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
    if (iVar3 < 2) goto LAB_7ffc3e95f280;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3e95eec0;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3e95f2af;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,4);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x1c2);
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
          goto LAB_7ffc3e95f29d;
        }
      }
LAB_7ffc3e95f280:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e95eec7;
    }
LAB_7ffc3e95f29d:
    pJVar7 = *env;
  }
LAB_7ffc3e95eec0:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e95eec7:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_dev_krypton_65_a_6 | RVA 0x18f2d0 | dev/krypton/65.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_a_6
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e95fb9b;
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
  if (_DAT_7ffc3ebc0bd0 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,4);
    uVar11 = FUN_7ffc3eb76c30(env,4);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bd0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bd0;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e95f803:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e95f831:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e95f803;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e95f803;
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
                      goto LAB_7ffc3e95f837;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e95f831;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e95f837:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb22c2);
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
LAB_7ffc3e95fb9b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_e_7 | RVA 0x18fbc0 | dev/krypton/65.e(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_65_e_7(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xb6);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3e960514:
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
LAB_7ffc3e95fcd4:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,4);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xb7);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3e960514;
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
          iVar5 = *(int *)(&UNK_7ffc3eb99ac0 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9604be;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3e9604a4;
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
LAB_7ffc3e96033e:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,4);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xb6), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e960514;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3e9604df;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3e95fcd4;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3e9600ed;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3e9600ed:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3e9604a4;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3e96033e;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3e9604a4;
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
                    goto LAB_7ffc3e9604d5;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3e9604a4;
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
LAB_7ffc3e9604be:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3e9604d5;
        }
        goto LAB_7ffc3e95fcd4;
      }
    }
LAB_7ffc3e9604df:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3e9604a4:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e9604d5:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_65_b_8 | RVA 0x190560 | dev/krypton/65.b()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_65_b_8(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xb7);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2302);
  if (pvVar4 == (void *)0x0) goto LAB_7ffc3e961b4c;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
  }
  if (0 < iVar2) {
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2310);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (1 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb231f);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (2 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
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
        if (3 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar5);
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xb6);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
          if (pvVar6 == (void *)0x0) {
LAB_7ffc3e961b4c:
            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
            arg2 = &DAT_7ffc3eba6000;
            pvVar3 = pvRam00007ffc3ebc0a70;
            goto LAB_7ffc3e961b26;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if (3 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar7);
            pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6);
            if (pvVar6 == (void *)0x0) {
              return;
            }
            pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar6);
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
            if (4 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
              pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6786);
              if (pvVar6 == (void *)0x0) goto LAB_7ffc3e961b4c;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (4 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,4,pvVar7);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb232e);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (5 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb233d);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (6 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                    pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0960,0xc);
                    if (pvVar6 == (void *)0x0) {
                      return;
                    }
                    pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0960,pvVar6);
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
                      pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65aa);
                      if (pvVar3 == (void *)0x0) goto LAB_7ffc3e961b4c;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                      }
                      if (7 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar3,7,pvVar5);
                        pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2351);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                        }
                        if (8 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar3);
                          pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2369);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                          }
                          if (9 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,9,pvVar3);
                            pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2381);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (10 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar3);
                              pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2390);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                              }
                              if (0xb < iVar2) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar4,0xb,pvVar3);
                                pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb239f);
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar2 = *(int *)(*(longlong *)
                                                    ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                }
                                if (0xc < iVar2) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0xc,pvVar3);
                                  pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb23b3);
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
                                    pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb23c8);
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
                                      pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb23d7);
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
                                        pvVar3 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb23e6)
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
                                                             (env,(char *)0x7ffc3ebb23f5);
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
                                                               (env,(char *)0x7ffc3ebb2405);
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
                                                                 (env,(char *)0x7ffc3ebb2419);
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
                                                                   (env,(char *)0x7ffc3ebb2428);
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
                                                                     (env,(char *)0x7ffc3ebb2439);
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
                                                                       (env,(char *)0x7ffc3ebb2450);
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
                                                                         (env,(char *)0x7ffc3ebb2474
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
                                                  0x7ffc3ebb248c);
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
                                                                       (env,(char *)0x7ffc3ebb24a4);
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
                                                                         (env,(char *)0x7ffc3ebb24c8
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
                                                  0x7ffc3ebb24e9);
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
                                                                       (env,(char *)0x7ffc3ebb2501);
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
                                                                         (env,(char *)0x7ffc3ebb2519
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
                                                  0x7ffc3ebb2531);
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
                                                                       (env,(char *)0x7ffc3ebb2548);
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
                                                                         (env,(char *)0x7ffc3ebb2560
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
                                                  0x7ffc3ebb257d);
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
                                                                       (env,(char *)0x7ffc3ebb2595);
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
                                                                         (env,(char *)0x7ffc3ebb25ad
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
                                                  0x7ffc3ebb25c5);
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
                                                                       (env,(char *)0x7ffc3ebb25dd);
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
                                                                         (env,(char *)0x7ffc3ebb2601
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
                                                  0x7ffc3ebb261e);
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
                                                                       (env,(char *)0x7ffc3ebb2642);
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
                                                                         (env,(char *)0x7ffc3ebb2666
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
                                                  0x7ffc3ebb2697);
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
                                                                       (env,(char *)0x7ffc3ebb26b0);
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
                                                                         (env,(char *)0x7ffc3ebb26d3
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e961b07. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2c,pvVar3);
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
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = (char *)0x7ffc3eba6019;
  pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e961b26:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e961b38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_65_f_9 | RVA 0x191b70 | dev/krypton/65.f(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_f_9(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0x1c3);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xb7);
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
      goto LAB_7ffc3e962016;
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
      goto LAB_7ffc3e962016;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,4);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3e961eda:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xb6);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3e961ec0:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xb7);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e961eba;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e961ec0;
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
                    goto LAB_7ffc3e961ea0;
                  }
                }
              }
              goto LAB_7ffc3e961eda;
            }
LAB_7ffc3e961ea0:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3e961eda;
      }
LAB_7ffc3e961eba:
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
LAB_7ffc3e962016:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_c_10 | RVA 0x192030 | dev/krypton/65.c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_c_10
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
LAB_7ffc3e962291:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e9622ad;
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
        if (lVar6 == 0) goto LAB_7ffc3e962291;
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
LAB_7ffc3e9622ad:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_d_11 | RVA 0x1922e0 | dev/krypton/65.d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_d_11
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
  
  lVar3 = FUN_7ffc3eb76c30(env,4);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1c4), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,4);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1c5);
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

/* JNI_dev_krypton_65_g_12 | RVA 0x192510 | dev/krypton/65.g(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_g_12(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x1c3);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb7);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e963240;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3e963226;
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
    goto LAB_7ffc3e963254;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb6);
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
LAB_7ffc3e963226:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e963254;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x1c6);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,4);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x1c4);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3e963240;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3e963226;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,4);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0x1c5);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0xb7);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3e963240;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3e963226;
              pJVar14 = *env;
              goto LAB_7ffc3e962e07;
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
        if (lVar9 == 0) goto LAB_7ffc3e963240;
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
          goto LAB_7ffc3e963240;
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
          lVar8 = FUN_7ffc3eb76c30(env,4);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1c6);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x52fa78130055d,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,4);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb7);
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
LAB_7ffc3e962e07:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3e963226;
      }
    }
  }
LAB_7ffc3e963240:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e963254:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_c_13 | RVA 0x193260 | dev/krypton/65.c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_c_13
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
LAB_7ffc3e96368a:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e963698;
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
        if (lVar7 == 0) goto LAB_7ffc3e96368a;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3e96368a;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3e96367c;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3e96368a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e96367c;
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
LAB_7ffc3e96367c:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e963698:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_d_14 | RVA 0x1936c0 | dev/krypton/65.d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_d_14
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
  
  lVar3 = FUN_7ffc3eb76c30(env,4);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1c7), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,4);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1c8);
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

/* JNI_dev_krypton_65_h_15 | RVA 0x193930 | dev/krypton/65.h(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_h_15(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,4);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x1c3);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xb7);
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
LAB_7ffc3e964b77:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e964b8f;
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
      goto LAB_7ffc3e964b8f;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xb6);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3e964b77;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x1c6);
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
            lVar6 = FUN_7ffc3eb76c30(env,4);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x1c6);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3e964b61;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3e964b77;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3e963fe0:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,4);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x1c7);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb7);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3e964561:
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
              goto LAB_7ffc3e964b77;
            }
            goto LAB_7ffc3e964b61;
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
              if (iVar4 == 0) goto code_r0x7ffc3e96411e;
              goto joined_r0x7ffc3e9641e1;
            }
          }
          goto LAB_7ffc3e964b61;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3e964b8f;
      }
    }
  }
  goto LAB_7ffc3e964b61;
code_r0x7ffc3e96411e:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3e96416c;
  goto LAB_7ffc3e963fe0;
code_r0x7ffc3e96416c:
  lVar6 = FUN_7ffc3eb76c30(env,4);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0x1c6);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x52fa78130055d,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3e9641e1:
  do {
    if (lVar10 == 0) goto LAB_7ffc3e964b61;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3e964b77;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,4);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x1c8);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xb7);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3e964561;
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
    if (lVar6 == 0) goto LAB_7ffc3e964b61;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3e964b61;
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
      if (lVar10 == 0) goto LAB_7ffc3e964b61;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e964b61;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3e964b61;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e964b61;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e964b61;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e964b61;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3e964b61;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3e9648b8;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e964b61;
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
      lVar6 = FUN_7ffc3eb76c30(env,4);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x1c6);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x52fa78130055d,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3e964b61;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3e964b77;
  }
LAB_7ffc3e9648b8:
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
LAB_7ffc3e964b61:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e964b8f:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_b_16 | RVA 0x194bc0 | dev/krypton/65.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_b_16
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
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3e9659d1;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (((iVar2 - 0x72U < 2) || (iVar2 == 0xd9)) || (iVar2 == 0xb5)) {
    lVar4 = FUN_7ffc3eb76c30(env,4);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x1c9), lVar5 == 0))
    goto LAB_7ffc3e965372;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e965372;
    if (lVar4 == 0) goto LAB_7ffc3e9653cc;
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
            if (iVar2 == 0xd9) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3e9653cc;
              uVar15 = 0x51;
            }
            else if (iVar2 == 0xb5) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3e9653cc;
              uVar15 = 0x50;
            }
            else if (iVar2 == 0x73) {
              if (arg0 == (void *)0x0) {
LAB_7ffc3e9653cc:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3e9653e6;
              }
              uVar15 = 0x4f;
            }
            else {
              if (arg0 == (void *)0x0) goto LAB_7ffc3e9653cc;
              uVar15 = 0x52;
            }
            lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
            if (lVar5 == 0) goto LAB_7ffc3e9653e6;
            uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar7,uVar8,uVar9);
            uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3e9653e6;
            lVar5 = 0;
LAB_7ffc3e9650b1:
            if (arg3 == (void *)0x0) {
              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e96547b:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            else {
              lVar6 = FUN_7ffc3eb76c30(env,0x19);
              if ((lVar6 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x24), lVar6 == 0))
              goto LAB_7ffc3e96547b;
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
                          if (iVar3 < 2) goto LAB_7ffc3e9653af;
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
                        goto LAB_7ffc3e9654c6;
                      }
LAB_7ffc3e9653af:
                      pJVar13 = *env;
                      arg2_00 = (char *)0x7ffc3eba6019;
                      pvVar10 = pvRam00007ffc3ebc0a98;
                    }
                    (*pJVar13->ThrowNew)(env,pvVar10,arg2_00);
                  }
                }
              }
LAB_7ffc3e9654c6:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            goto joined_r0x7ffc3e965451;
          }
        }
      }
    }
LAB_7ffc3e9653e6:
    pvVar10 = (*(*env)->ExceptionOccurred)(env);
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
    lVar5 = 0;
    if (bVar1 == 0) {
      return (void *)0x0;
    }
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(env,4);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x1ca), lVar5 == 0)) {
LAB_7ffc3e965372:
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
      if (bVar1 != 0) goto LAB_7ffc3e965372;
      if (lVar5 == 0) {
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e965520:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
joined_r0x7ffc3e965451:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3e965556;
      }
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x54), lVar6 == 0))
      goto LAB_7ffc3e965520;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x47), lVar6 == 0))
      goto LAB_7ffc3e965520;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x48), lVar6 == 0))
      goto LAB_7ffc3e965520;
      uVar9 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x49), lVar4 == 0)) {
LAB_7ffc3e965421:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
        goto joined_r0x7ffc3e965451;
      }
      uVar15 = FUN_7ffc3e7d1a50(env,lVar5,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) ||
         ((lVar4 = FUN_7ffc3eb76c30(env,0x19), lVar4 == 0 ||
          (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x55), lVar6 == 0)))) goto LAB_7ffc3e965421;
      uVar9 = FUN_7ffc3e7d1a80(env,lVar4,lVar6,uVar9,uVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e965421;
      if (iVar2 == 0xfa) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9659ed;
        uVar15 = 0x57;
LAB_7ffc3e9652fb:
        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
joined_r0x7ffc3e96532e:
        if (lVar4 != 0) {
          uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar7,uVar8,uVar9);
          uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            lVar4 = 0;
            goto LAB_7ffc3e9650b1;
          }
        }
      }
      else {
        if (iVar2 == 0xf3) {
          if (arg0 != (void *)0x0) {
            uVar15 = 0x56;
            goto LAB_7ffc3e9652fb;
          }
        }
        else if (arg0 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
          goto joined_r0x7ffc3e96532e;
        }
LAB_7ffc3e9659ed:
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
LAB_7ffc3e965556:
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
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3e9659d1;
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x28);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar12,pvVar11,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3e9659d1;
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,pvVar10,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto LAB_7ffc3e9659d1;
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
  if (lVar14 == 0) goto LAB_7ffc3e9659d1;
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
      goto joined_r0x7ffc3e965785;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar14 = FUN_7ffc3eb76c90(env,lVar5,0x5a);
joined_r0x7ffc3e965785:
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
LAB_7ffc3e9659d1:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_b_17 | RVA 0x195a50 | dev/krypton/65.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_b_17
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3e965e96;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3e965ad1:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3e965ad1;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3e965e79:
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
LAB_7ffc3e965ea8:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e965be5;
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
      if (iVar2 < iVar3) goto LAB_7ffc3e965e79;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3e965ea8;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,4);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0x1cb);
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
            goto LAB_7ffc3e965bde;
          }
        }
LAB_7ffc3e965e96:
        pJVar7 = *env;
      }
    }
LAB_7ffc3e965bde:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e965be5:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_65_c_18 | RVA 0x195ed0 | dev/krypton/65.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_65_c_18
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e96680e;
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
  if (_DAT_7ffc3ebc0bd8 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,4);
    uVar11 = FUN_7ffc3eb76c30(env,4);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bd8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bd8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e966490:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9664a4:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e966490;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e966490;
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
                        goto LAB_7ffc3e9664aa;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9664a4;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e9664aa:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb22c2);
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
LAB_7ffc3e96680e:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

