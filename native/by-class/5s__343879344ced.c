/* Native reconstruction for dev/krypton/5s.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5s_6_0 | RVA 0x1ad490 | dev/krypton/5s.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5s_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  char cVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  ulonglong uVar8;
  longlong lVar9;
  longlong lVar10;
  void *pvVar11;
  undefined8 uVar12;
  void *pvVar13;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  ulonglong uVar14;
  
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x9c);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xd1);
  if (pvVar7 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar8 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar7 + 0x10));
  }
  else {
    uVar8 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar7);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
LAB_7ffc3e97fe9a:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e98002d:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e980043. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar6,arg2);
    return;
  }
  lVar9 = FUN_7ffc3eb76c30(env,2);
  if (lVar9 == 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x5f);
  if (lVar10 == 0) {
    return;
  }
  FUN_7ffc3e7dbbc0(env,receiver,lVar9,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1b00 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3eba7f9a,0,0);
    if ((lVar9 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1b00 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1b00;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar14 = uVar8 ^ 0x20c23b576635;
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x1c427de0ab284e2f);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1b08 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebadae6,0x7ffc3eba743f,0,0);
    if ((lVar9 != 0) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
      _DAT_7ffc3ebc1b08 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
  }
  pvVar7 = _DAT_7ffc3ebc1b08;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c408e47562e0829
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar9 == 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xa4);
  if (lVar10 == 0) {
    return;
  }
  iVar4 = FUN_7ffc3e7db1e0(env,lVar9,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1b10 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3ebb298f,0,0);
    if ((lVar9 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1b10 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1b10;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x1c5a1dad759b1e77);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1b18 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebadae6,0x7ffc3eba743f,0,0);
    if ((lVar9 != 0) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
      _DAT_7ffc3ebc1b18 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
  }
  pvVar7 = _DAT_7ffc3ebc1b18;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c4607f4baef510a
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1b20 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3ebab55d,0,0);
    if ((lVar9 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1b20 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1b20;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c76444292434489);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    if (_DAT_7ffc3ebc1b28 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x9c);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba743f,0,0);
      if ((lVar9 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
      {
        _DAT_7ffc3ebc1b28 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc1b28;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c4209e30b8ab2ff);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
    FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    if (_DAT_7ffc3ebc1b30 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x9c);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba74dd,0x7ffc3eba647c,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1b30 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1b30;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x55ad);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       uVar8 ^ 0x730a8b9cf31d3600);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    uVar2 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
    if (_DAT_7ffc3ebc1b38 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x9c);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebaf8ff,0x7ffc3eba72ac,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1b38 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1b38;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c71f97daf4d7d85);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar11);
    FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97fd04;
    if (iVar4 != 0) {
      if (_DAT_7ffc3ebc1b40 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x9c);
        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                 0x7ffc3ebae34f,0x7ffc3ebab616,0,0);
        if ((lVar9 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1b40 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1b40;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
LAB_7ffc3e980046:
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
        pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar6);
        if (bVar1 != 0) goto LAB_7ffc3e97fd38;
        goto LAB_7ffc3e97fdb0;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x1c75d95a19f51faa);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
      lVar9 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e980046;
      if (lVar9 == 0) goto LAB_7ffc3e97e2ab;
      if (_DAT_7ffc3ebc1b48 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x9c);
        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                 0x7ffc3ebae34f,0x7ffc3ebab616,0,0);
        if ((lVar9 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1b48 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1b48;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c75d95a19f51faa);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc1b50 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x9c);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1b50 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1b50;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c7052f6453b47e9);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
            uVar12 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              cVar3 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
              if (cVar3 != '\0') {
LAB_7ffc3e97e2ab:
                if (_DAT_7ffc3ebc1b68 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c
                                           ,0x7ffc3ebabc60,0x7ffc3ebab4ef,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar6 != (void *)0x0)) {
                    _DAT_7ffc3ebc1b68 = (*(*env)->NewGlobalRef)(env,pvVar6);
                  }
                }
                pvVar6 = _DAT_7ffc3ebc1b68;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x1c750d1957b094b9);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc1b70 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c
                                           ,0x7ffc3ebaf8ff,0x7ffc3ebab51c,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc1b70 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc1b70;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c75d95a19f51faa);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
                FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                goto LAB_7ffc3e97e485;
              }
              if (_DAT_7ffc3ebc1b58 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                         0x7ffc3ebae34f,0x7ffc3ebab616,0,0);
                if ((lVar9 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc1b58 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc1b58;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x1c75d95a19f51faa);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
                pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc1b60 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,
                                             0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba7f73,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc1b60 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc1b60;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c768efd6a39e1de);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar14);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                    FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) goto LAB_7ffc3e97e2ab;
                  }
                }
              }
              goto LAB_7ffc3e97ff53;
            }
          }
        }
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
      if (bVar1 == 0) goto LAB_7ffc3e97ff5f;
      goto LAB_7ffc3e97fee7;
    }
LAB_7ffc3e97e485:
    if (_DAT_7ffc3ebc1b78 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x9c);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebae34f,0x7ffc3eba71d3,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1b78 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1b78;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x1c581dfc8430b4b0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1b80 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x9c);
          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebab583,0,0);
          if ((lVar9 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc1b80 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc1b80;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c40388bdc087298);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
          lVar9 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar9 == 0) {
              return;
            }
            pvVar6 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar9 == 0) {
              return;
            }
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar8 ^ 0x15a0ac653ea3)
            ;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar6 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (iVar5 < 1) {
LAB_7ffc3e97fe79:
                UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                arg2 = (char *)0x7ffc3eba6019;
                pvVar6 = pvRam00007ffc3ebc0a98;
              }
              else {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                if (_DAT_7ffc3ebc1b88 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c
                                           ,0x7ffc3ebabc60,0x7ffc3eba7f73,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc1b88 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc1b88;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c4d46d94fece1fb);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc1b90 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c
                                           ,0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc1b90 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc1b90;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c4bc65a370bc074);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                while( true ) {
                  if (_DAT_7ffc3ebc1b98 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,
                                             0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc1b98 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc1b98;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x1c5b5f19f2c82eb5);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar14);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
                  uVar12 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  cVar3 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
                  if (cVar3 == '\0') {
                    return;
                  }
                  if (_DAT_7ffc3ebc1ba0 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,
                                             0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc1ba0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc1ba0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x1c4c7ec9974b15d4);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar14);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
                  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x41);
                  if (pvVar11 == (void *)0x0) {
                    return;
                  }
                  if ((pvVar7 != (void *)0x0) &&
                     (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar11), bVar1 == 0)) break;
                  pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e97fe9a;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar11);
                  }
                  if (iVar5 < 2) goto LAB_7ffc3e97fe79;
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                  lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                  if (lVar9 == 0) {
                    return;
                  }
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                    uVar8 ^ 0x540c1b426432);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar11);
                  }
                  if (iVar5 < 1) goto LAB_7ffc3e97fe79;
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                  if (_DAT_7ffc3ebc1ba8 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x9c);
                    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,
                                             0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc1ba8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc1ba8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,receiver);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x1c490673fdda4148);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar14);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar11);
                  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (iVar4 == 0) {
                    return;
                  }
                  if (bVar1 != 0) {
                    return;
                  }
                }
                UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                arg2 = (char *)0x7ffc3eba6033;
                pvVar6 = pvRam00007ffc3ebc0a58;
              }
              goto LAB_7ffc3e98002d;
            }
            goto LAB_7ffc3e97fe9a;
          }
        }
      }
    }
  }
  else {
LAB_7ffc3e97fd04:
    pvVar7 = (*(*env)->ExceptionOccurred)(env);
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar6);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e97fd38:
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x9c);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x1ec), lVar10 == 0)) {
LAB_7ffc3e97fda4:
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar6);
        goto LAB_7ffc3e97fda4;
      }
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e97fdb0:
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar6);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x9c);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x1ec), lVar10 == 0)) {
LAB_7ffc3e97fe44:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar6);
        goto LAB_7ffc3e97fe44;
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e97fee7:
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x9c);
    if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x1ec), lVar10 != 0)) {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e97ff5f;
      }
      (*(*env)->Throw)(env,pvVar6);
    }
  }
LAB_7ffc3e97ff53:
  pvVar6 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e97ff5f:
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x9c);
    if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x1ec), lVar10 != 0)) {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98000e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar6);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_5s_1_1 | RVA 0x1b00a0 | dev/krypton/5s.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5s_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  char cVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  void *pvVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x9c);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xd1);
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
  if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e981822. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
    return;
  }
  lVar8 = FUN_7ffc3eb76c30(env,2);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x61);
  if (lVar9 == 0) {
    return;
  }
  FUN_7ffc3e7dbbc0(env,receiver,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1a98 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3eba7f9a,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1a98 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1a98;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar12 = uVar7 ^ 0x3aa7cb7bb2f6;
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xc88167855b049aec);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1aa0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebadae6,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1aa0 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1aa0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8839422a602dcea
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1aa8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3ebb298f,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1aa8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1aa8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xc89907c885b7cab4);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1ab0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebadae6,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1ab0 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1ab0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8851d914ac385c9
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1ab8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3ebab55d,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1ab8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1ab8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xc8b55e27626f904a);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1ac0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebadae6,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1ac0 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1ac0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8811386fba6663c
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa4);
  if (lVar9 == 0) {
    return;
  }
  iVar4 = FUN_7ffc3e7db1e0(env,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1ac8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba74dd,0x7ffc3eba647c,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1ac8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1ac8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x6a46);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     uVar7 ^ 0x425bf494432109ff);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar2 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
  if (_DAT_7ffc3ebc1ad0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebaf8ff,0x7ffc3eba72ac,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1ad0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1ad0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xc8b2e3185f61a946);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1ad8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9c);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3ebab616,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1ad8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1ad8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0xc8b6c33fe9d9cb69);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9817c2;
    if (iVar4 == 0) {
LAB_7ffc3e981570:
      if (_DAT_7ffc3ebc1af8 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x9c);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                 0x7ffc3ebadae6,0x7ffc3eba7f73,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1af8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1af8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8b594989a15351d);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
      FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e981661. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
    if (pvVar5 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc1ae0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x9c);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebae34f,0x7ffc3ebab616,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ae0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1ae0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0xc8b6c33fe9d9cb69);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9818c1;
      if (_DAT_7ffc3ebc1ae8 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x9c);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                 0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1ae8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1ae8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8b34893b517932a);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          cVar3 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
          if (cVar3 != '\0') {
            return;
          }
          if (_DAT_7ffc3ebc1af0 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x9c);
            lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a68,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3ebae34f,0x7ffc3ebab616,0,0);
            if ((lVar8 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc1af0 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc1af0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0xc8b6c33fe9d9cb69);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) goto LAB_7ffc3e981570;
          }
          goto LAB_7ffc3e9818c1;
        }
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
      if (bVar1 == 0) goto LAB_7ffc3e9818cd;
      goto LAB_7ffc3e981855;
    }
  }
  else {
LAB_7ffc3e9817c2:
    pvVar6 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e981855:
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x9c);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1ec), lVar9 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e9818cd;
      }
      (*(*env)->Throw)(env,pvVar5);
    }
  }
LAB_7ffc3e9818c1:
  pvVar6 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e9818cd:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x9c);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1ec), lVar9 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e981979. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar5);
        return;
      }
    }
  }
  return;
}

