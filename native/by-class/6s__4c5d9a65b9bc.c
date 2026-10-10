/* Native reconstruction for dev/krypton/6s.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6s_6_0 | RVA 0x1be800 | dev/krypton/6s.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6s_6_0(JNINativeInterface_ **env,void *receiver)

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
  void *pvVar10;
  undefined8 uVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  ulonglong uVar12;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x6d);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x83);
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
  if (receiver == (void *)0x0) {
LAB_7ffc3e9915da:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e991610:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e991626. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
    return;
  }
  lVar7 = FUN_7ffc3eb76c30(env,2);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
  if (lVar8 == 0) {
    return;
  }
  FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xb6);
  if (lVar8 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3e7d1a80(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2238 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x6d);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc2238 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc2238;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar12 = uVar6 ^ 0x74525ad7f157;
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c41b4aba99dfdb3
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2240 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x6d);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc2240 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc2240;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7d2bf411e0ed54
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2248 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x6d);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc2248 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc2248;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7b7c73f7f33afc);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2250 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2250 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2250;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7d2bf411e0ed54);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2258 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3eba7f9a,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc2258 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc2258;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c48fae21f45123e);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2260 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2260 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2260;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c4215f2480633b8);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2268 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3eba7f9a,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc2268 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc2268;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c4f66763f10cf85);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2270 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2270 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2270;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c4215f2480633b8);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2278 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc2278 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc2278;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c43e9b7609f0fed);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2280 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2280 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2280;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7d2bf411e0ed54);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2288 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc2288 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc2288;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c440ada3d12f516);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2290 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2290 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2290;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7d2bf411e0ed54);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc2298 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc2298 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc2298;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c40e673866e5a65);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc22a0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc22a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc22a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7d2bf411e0ed54);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc22a8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaf8c4,0x7ffc3ebab4ef,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc22a8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc22a8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c71f4e133793e0d);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc22b0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba72ee,0x7ffc3ebab51c,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc22b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc22b0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c4f9fc005a59db2);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (_DAT_7ffc3ebc22b8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3eba71d3,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc22b8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc22b8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c459f58fe8bab81);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99145e;
    if (lVar7 == 0) {
      if (_DAT_7ffc3ebc22c0 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x6d);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3eba7203,0,0);
        if ((lVar8 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc22c0 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc22c0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7f5f9d6b3bc3de);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar8 == 0) {
            return;
          }
          if (_DAT_7ffc3ebc22c8 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x6d);
            lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7291,0x7ffc3eba71d3,0,0);
            if ((lVar8 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc22c8 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc22c8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c459f58fe8bab81);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) goto LAB_7ffc3e98fb10;
          }
          goto LAB_7ffc3e9914fe;
        }
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
      if (bVar1 == 0) goto LAB_7ffc3e99150a;
      goto LAB_7ffc3e991492;
    }
LAB_7ffc3e98fb10:
    if (_DAT_7ffc3ebc22d0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x6d);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebab583,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc22d0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc22d0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c4d5aa4ca66abde);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
      lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (lVar8 == 0) {
          return;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar8 == 0) {
          return;
        }
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x4130cde5a9c1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar4 != (void *)0x0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (iVar3 < 1) {
LAB_7ffc3e9915bc:
            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
            arg2 = (char *)0x7ffc3eba6019;
            pvVar4 = pvRam00007ffc3ebc0a98;
          }
          else {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
            if (_DAT_7ffc3ebc22d8 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x6d);
              lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaf8c4,0x7ffc3eba7f73,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc22d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc22d8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c4ec3ec13866839);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc22e0 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x6d);
              lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaec12,0x7ffc3eba61d9,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc22e0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc22e0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c7538067546d7e9);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            while( true ) {
              if (_DAT_7ffc3ebc22e8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x6d);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaec12,0x7ffc3eba6204,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc22e8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc22e8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c4557e10fd99cec);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
              if (cVar2 == '\0') {
                return;
              }
              if (_DAT_7ffc3ebc22f0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x6d);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaec12,0x7ffc3eba621c,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc22f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc22f0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c4e38dfbd358aac);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x41);
              if (pvVar9 == (void *)0x0) {
                return;
              }
              if ((pvVar5 != (void *)0x0) &&
                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar9), bVar1 == 0)) break;
              pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
              if (lVar8 == 0) {
                return;
              }
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,
                                                 uVar6 ^ 0x3cca97854937);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9915da;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
              }
              if (iVar3 < 2) goto LAB_7ffc3e9915bc;
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
              }
              if (iVar3 < 1) goto LAB_7ffc3e9915bc;
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
              if (_DAT_7ffc3ebc22f8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x6d);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaec12,0x7ffc3eba626f,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc22f8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc22f8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c79419637eccf0d);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar9);
              FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (lVar7 != 0) {
                return;
              }
              if (bVar1 != 0) {
                return;
              }
            }
            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
            arg2 = (char *)0x7ffc3eba6033;
            pvVar4 = pvRam00007ffc3ebc0a58;
          }
          goto LAB_7ffc3e991610;
        }
        goto LAB_7ffc3e9915da;
      }
    }
  }
  else {
LAB_7ffc3e99145e:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e991492:
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x6d);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x120), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar5 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e99150a;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
LAB_7ffc3e9914fe:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e99150a:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x6d);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x120), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9915b9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_6s_1_1 | RVA 0x1c1670 | dev/krypton/6s.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6s_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x6d);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x83);
  if (pvVar4 == (void *)0x0) {
    return;
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
    return;
  }
  lVar6 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb6);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e9935cb:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e9935ff:
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x6d);
    if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x120), lVar7 == 0)) {
LAB_7ffc3e99366b:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar3);
        goto LAB_7ffc3e99366b;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e993677:
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x6d);
    if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x120), lVar7 == 0)) {
LAB_7ffc3e99370b:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar3);
        goto LAB_7ffc3e99370b;
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e993770:
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x6d);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x120), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e9937e8;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  else {
    lVar7 = FUN_7ffc3eb76c30(env,2);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x61), lVar8 == 0))
    goto LAB_7ffc3e9935cb;
    FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9935cb;
    uVar5 = uVar5 ^ 0x6e37aafb2594;
    if (lVar6 != 0) goto LAB_7ffc3e992731;
    if (_DAT_7ffc3ebc21a0 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x6d);
      lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebab616,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc21a0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc21a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e993899:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
      if (bVar1 != 0) goto LAB_7ffc3e9935ff;
      goto LAB_7ffc3e993677;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc88c85a5f5894971);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e993899;
    if (lVar6 == 0) goto LAB_7ffc3e991c7d;
    if (_DAT_7ffc3ebc21a8 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x6d);
      lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebab616,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc21a8 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc21a8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e993740:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) goto LAB_7ffc3e9937e8;
      goto LAB_7ffc3e993770;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc88c85a5f5894971);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e993740;
    if (_DAT_7ffc3ebc21b0 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x6d);
      lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba6204,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc21b0 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc21b0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e993740;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8bf619a17fa45f3);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
    uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e993740;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
    if (cVar2 != '\0') {
LAB_7ffc3e991c7d:
      if (_DAT_7ffc3ebc21c8 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21c8 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc21c8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc882aece59b12970);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc21d0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21d0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc21d0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8be3191e1cc3997);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc21d8 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21d8 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc21d8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8b8661607dfee3f);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc21e0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21e0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc21e0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8be3191e1cc3997);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc21e8 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3eba7f9a,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21e8 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc21e8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc88be087ef69c6fd);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc21f0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21f0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc21f0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8810f97b82ae77b);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc21f8 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3eba7f9a,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc21f8 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc21f8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc88c7c13cf3c1b46);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2200 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2200 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc2200;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8810f97b82ae77b);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2208 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2208 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2208;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc880f3d290b3db2e);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2210 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2210 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc2210;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8be3191e1cc3997);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2218 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2218 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2218;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc88710bfcd3e21d5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2220 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2220 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc2220;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8be3191e1cc3997);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
LAB_7ffc3e992731:
      if (_DAT_7ffc3ebc2228 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7291,0x7ffc3ebaf885,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2228 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2228;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc883fc1676428ea6);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2230 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x6d);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaec12,0x7ffc3eba743f,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2230 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc2230;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8be3191e1cc3997);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99290c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
    if (_DAT_7ffc3ebc21b8 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x6d);
      lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7291,0x7ffc3ebab616,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc21b8 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc21b8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc88c85a5f5894971);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar9);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc21c0 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x6d);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf876,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaec12,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc21c0 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc21c0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b1817e645538aa);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar5);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) goto LAB_7ffc3e991c7d;
        }
      }
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e9937e8:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x6d);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x120), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e993884. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

