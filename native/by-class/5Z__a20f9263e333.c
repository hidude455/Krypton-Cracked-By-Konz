/* Native reconstruction for dev/krypton/5Z.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5Z_6_0 | RVA 0x198990 | dev/krypton/5Z.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5Z_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  longlong lVar8;
  longlong lVar9;
  void *pvVar10;
  undefined8 uVar11;
  void *pvVar12;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  ulonglong uVar13;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x95);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xc5);
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
  if (_DAT_7ffc3ebc17b0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebade6f,0x7ffc3eba7f9a,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc17b0 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc17b0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar13 = uVar6 ^ 0x353df0f05f2e;
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c73f2f4dbec92d8
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc17b8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc17b8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc17b8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7934e938c24087
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c30(env,0x1f);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x5e);
  if (lVar9 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc17c0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebade6f,0x7ffc3eba7f9a,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc17c0 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc17c0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c66d341464dea83
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc17c8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc17c8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc17c8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7934e938c24087
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc17d0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebade6f,0x7ffc3eba7f9a,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc17d0 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc17d0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c779ba9f685e22f
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc17d8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc17d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc17d8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7934e938c24087
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc17e0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x95);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3ebade6f,0x7ffc3ebb298f,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc17e0 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc17e0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7ef0843efffb7f);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96ab66;
    if (_DAT_7ffc3ebc17e8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x95);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc17e8 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc17e8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96ab66;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7f0309fcbb625d);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96ab66;
    if (iVar3 == 0) {
LAB_7ffc3e96a99a:
      if (receiver != (void *)0x0) {
        lVar8 = FUN_7ffc3eb76c30(env,2);
        if (lVar8 == 0) {
          return;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x5f);
        if (lVar9 == 0) {
          return;
        }
        FUN_7ffc3e7dbbc0(env,receiver,lVar8,lVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96aa05. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
LAB_7ffc3e96ad95:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = &DAT_7ffc3eba6000;
      pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e96ade9:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96adff. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
      return;
    }
    if (_DAT_7ffc3ebc17f0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x95);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebade6f,0x7ffc3eba71d3,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc17f0 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc17f0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e96ab9b:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (bVar1 != 0) goto LAB_7ffc3e96abcb;
      goto LAB_7ffc3e96ac43;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c76ccb113c5c86d);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96ab9b;
    if (_DAT_7ffc3ebc17f8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x95);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebade6f,0x7ffc3ebab583,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc17f8 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc17f8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96ab9b;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7849b565bc420a);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
    lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96ab9b;
    if (lVar8 == 0) goto LAB_7ffc3e96a99a;
    if (_DAT_7ffc3ebc1800 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x95);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebade6f,0x7ffc3eba71d3,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1800 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1800;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c76ccb113c5c86d);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1808 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x95);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3ebade6f,0x7ffc3eba7203,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1808 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1808;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c7b8b27e2894f7c);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
          lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar8 == 0) goto LAB_7ffc3e96a99a;
            pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar8 == 0) {
              return;
            }
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x5f67c207b8);
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
LAB_7ffc3e96adcd:
                UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                arg2 = (char *)0x7ffc3eba6019;
                pvVar4 = pvRam00007ffc3ebc0a98;
              }
              else {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
                if (_DAT_7ffc3ebc1810 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x95);
                  lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3ebb275e,0x7ffc3eba7f73,0,0);
                  if ((lVar8 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc1810 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc1810;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c65ba964d1710e0);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc1818 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x95);
                  lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3ebabc72,0x7ffc3eba61d9,0,0);
                  if ((lVar8 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc1818 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc1818;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c70b16522fbe690);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                while( true ) {
                  do {
                    if (_DAT_7ffc3ebc1820 == (void *)0x0) {
                      uVar11 = FUN_7ffc3eb76c30(env,0x95);
                      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3ebabc72,0x7ffc3eba6204,0,0);
                      if ((lVar8 != 0) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc1820 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                    }
                    pvVar5 = _DAT_7ffc3ebc1820;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,0x1c71e91a98c25bca);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar10);
                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar10);
                    uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
                    if (cVar2 == '\0') goto LAB_7ffc3e96a99a;
                    if (_DAT_7ffc3ebc1828 == (void *)0x0) {
                      uVar11 = FUN_7ffc3eb76c30(env,0x95);
                      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3ebabc72,0x7ffc3eba621c,0,0);
                      if ((lVar8 != 0) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc1828 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                    }
                    pvVar5 = _DAT_7ffc3ebc1828;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,0x1c6410b517cdf007);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar10);
                    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar10);
                    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x41);
                    if (pvVar7 == (void *)0x0) {
                      return;
                    }
                  } while (pvVar5 == (void *)0x0);
                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar7);
                  if (bVar1 == 0) break;
                  if (_DAT_7ffc3ebc1830 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x95);
                    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3ebabc72,0x7ffc3eba6204,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc1830 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc1830;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3e96acd7;
                  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x1c6650e8edfe25fa);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar12);
                  uVar11 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3e96acd7;
                  cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
                  if (cVar2 == '\0') {
                    pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (pvVar7 == (void *)0x0) goto LAB_7ffc3e96ad95;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
                    }
                    if (iVar3 < 2) goto LAB_7ffc3e96adcd;
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar5);
                    lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                    if (lVar8 == 0) {
                      return;
                    }
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,
                                                      uVar6 ^ 0x997c998a32a);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
                    }
                    if (iVar3 < 1) goto LAB_7ffc3e96adcd;
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar5);
                    if (_DAT_7ffc3ebc1838 == (void *)0x0) {
                      uVar11 = FUN_7ffc3eb76c30(env,0x95);
                      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3ebabc72,0x7ffc3eba626f,0,0);
                      if ((lVar8 != 0) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc1838 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                    }
                    pvVar5 = _DAT_7ffc3ebc1838;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c64be1eaf5505e8);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar7);
                    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                  }
                }
                UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                arg2 = (char *)0x7ffc3eba6033;
                pvVar4 = pvRam00007ffc3ebc0a58;
              }
              goto LAB_7ffc3e96ade9;
            }
            goto LAB_7ffc3e96ad95;
          }
        }
      }
    }
  }
  else {
LAB_7ffc3e96ab66:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e96abcb:
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x95);
    if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1d9), lVar9 == 0)) {
LAB_7ffc3e96ac37:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e96ac37;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e96ac43:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x95);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1d9), lVar9 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e96ace0;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
LAB_7ffc3e96acd7:
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e96ace0:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x95);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1d9), lVar9 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96ad92. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_5Z_1_1 | RVA 0x19ae20 | dev/krypton/5Z.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5Z_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x95);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0xc5);
    if (pvVar3 != (void *)0x0) {
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar8 = *(ulonglong *)
                 (*(longlong *)((ulonglong)pvVar2 & 0xfffffffffffffffc) +
                 (longlong)*(int *)((longlong)pvVar3 + 0x10));
      }
      else {
        uVar8 = (*(*env)->GetStaticLongField)(env,pvVar2,pvVar3);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1770 == (void *)0x0) {
          uVar7 = FUN_7ffc3eb76c30(env,0x95);
          lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3ebade6f,0x7ffc3eba7f9a,0,0);
          if (lVar5 != 0) {
            pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
            if (pvVar2 != (void *)0x0) {
              _DAT_7ffc3ebc1770 = (*(*env)->NewGlobalRef)(env,pvVar2);
            }
          }
        }
        pvVar2 = _DAT_7ffc3ebc1770;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar8 = uVar8 ^ 0x2f5800dc8bed;
          pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b0e8912bc0461b);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc1778 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x95);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
              if (lVar5 != 0) {
                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                if (pvVar3 != (void *)0x0) {
                  _DAT_7ffc3ebc1778 = (*(*env)->NewGlobalRef)(env,pvVar3);
                }
              }
            }
            pvVar3 = _DAT_7ffc3ebc1778;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc8ba2e8cc8ee9444);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
              FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc1780 == (void *)0x0) {
                  uVar7 = FUN_7ffc3eb76c30(env,0x95);
                  lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e,0x7ffc3eba606c,
                                           0x7ffc3ebade6f,0x7ffc3eba7f9a,0,0);
                  if (lVar5 != 0) {
                    pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                    if (pvVar2 != (void *)0x0) {
                      _DAT_7ffc3ebc1780 = (*(*env)->NewGlobalRef)(env,pvVar2);
                    }
                  }
                }
                pvVar2 = _DAT_7ffc3ebc1780;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xc8a5c924b6613e40);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar8);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (_DAT_7ffc3ebc1788 == (void *)0x0) {
                      uVar7 = FUN_7ffc3eb76c30(env,0x95);
                      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
                      if (lVar5 != 0) {
                        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                        if (pvVar3 != (void *)0x0) {
                          _DAT_7ffc3ebc1788 = (*(*env)->NewGlobalRef)(env,pvVar3);
                        }
                      }
                    }
                    pvVar3 = _DAT_7ffc3ebc1788;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
                      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xc8ba2e8cc8ee9444);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
                      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar8);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
                      FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (_DAT_7ffc3ebc1790 == (void *)0x0) {
                          uVar7 = FUN_7ffc3eb76c30(env,0x95);
                          lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                                   0x7ffc3eba606c,0x7ffc3ebade6f,0x7ffc3eba7f9a,0,0)
                          ;
                          if (lVar5 != 0) {
                            pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                            if (pvVar2 != (void *)0x0) {
                              _DAT_7ffc3ebc1790 = (*(*env)->NewGlobalRef)(env,pvVar2);
                            }
                          }
                        }
                        pvVar2 = _DAT_7ffc3ebc1790;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar3 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0xc8b481cc06a936ec)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar8);
                          (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (_DAT_7ffc3ebc1798 == (void *)0x0) {
                              uVar7 = FUN_7ffc3eb76c30(env,0x95);
                              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e,
                                                       0x7ffc3eba606c,0x7ffc3ebabc72,0x7ffc3eba743f,
                                                       0,0);
                              if (lVar5 != 0) {
                                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                                if (pvVar3 != (void *)0x0) {
                                  _DAT_7ffc3ebc1798 = (*(*env)->NewGlobalRef)(env,pvVar3);
                                }
                              }
                            }
                            pvVar3 = _DAT_7ffc3ebc1798;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar4 = (*(*env)->NewObjectArray)
                                                 (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
                              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0xc8ba2e8cc8ee9444);
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
                              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar8);
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
                              FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                if (_DAT_7ffc3ebc17a0 == (void *)0x0) {
                                  uVar7 = FUN_7ffc3eb76c30(env,0x95);
                                  lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,0x7ffc3eba718e
                                                           ,0x7ffc3eba606c,0x7ffc3ebade6f,
                                                           0x7ffc3ebb298f,0,0);
                                  if (lVar5 != 0) {
                                    pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00
                                                                     );
                                    if (pvVar2 != (void *)0x0) {
                                      _DAT_7ffc3ebc17a0 = (*(*env)->NewGlobalRef)(env,pvVar2);
                                    }
                                  }
                                }
                                pvVar2 = _DAT_7ffc3ebc17a0;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar3 = (*(*env)->NewObjectArray)
                                                     (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,
                                                                    0xc8bdeae1ced32fbc);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,uVar8);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,
                                                                    pvVar3);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    if (_DAT_7ffc3ebc17a8 == (void *)0x0) {
                                      uVar7 = FUN_7ffc3eb76c30(env,0x95);
                                      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2980,
                                                               0x7ffc3eba718e,0x7ffc3eba606c,
                                                               0x7ffc3ebabc72,0x7ffc3eba743f,0,0);
                                      if (lVar5 != 0) {
                                        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,
                                                                          uRam00007ffc3ebc0a00);
                                        if (pvVar3 != (void *)0x0) {
                                          _DAT_7ffc3ebc17a8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                                        }
                                      }
                                    }
                                    pvVar3 = _DAT_7ffc3ebc17a8;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      pvVar4 = (*(*env)->NewObjectArray)
                                                         (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
                                      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,
                                                                        0xc8bc196c0c97b69e);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
                                      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,uVar8);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
                                      FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96bc39. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,
                                                              &DAT_7ffc3eba6000);
                                          return;
                                        }
                                        lVar5 = FUN_7ffc3eb76c30(env,2);
                                        if (lVar5 != 0) {
                                          lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61);
                                          if (lVar6 != 0) {
                                            FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96b68e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                            (*(*env)->ExceptionCheck)(env);
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
  return;
}

