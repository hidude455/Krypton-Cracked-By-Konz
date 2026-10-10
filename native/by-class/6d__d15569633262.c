/* Native reconstruction for dev/krypton/6d.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6d_6_0 | RVA 0x1b8a50 | dev/krypton/6d.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6d_6_0(JNINativeInterface_ **env,void *receiver)

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
  void *pvVar12;
  undefined8 uVar13;
  void *pvVar14;
  JNINativeInterface_ *pJVar15;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar16;
  char *pcVar17;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x9b);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xd4);
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
  if (_DAT_7ffc3ebc2078 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x9b);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebab4ac,0x7ffc3eba71d3,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc2078 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc2078;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar16 = uVar6 ^ 0xa2cf076e0f1;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c445f33ad1ba462);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e98ab4d;
    if (lVar7 == 0) {
      if (_DAT_7ffc3ebc2080 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x9b);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebab4ac,0x7ffc3eba7203,0,0);
        if ((lVar8 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2080 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc2080;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7c61b94607837a);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar8 == 0) {
            return;
          }
          if (_DAT_7ffc3ebc2088 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x9b);
            lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebab4ac,0x7ffc3eba71d3,0,0);
            if ((lVar8 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc2088 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc2088;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c445f33ad1ba462);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) goto LAB_7ffc3e988e45;
          }
          goto LAB_7ffc3e98ace1;
        }
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (bVar1 != 0) goto LAB_7ffc3e98abd5;
      goto LAB_7ffc3e98ac4d;
    }
LAB_7ffc3e988e45:
    if (_DAT_7ffc3ebc2090 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x9b);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebab4ac,0x7ffc3ebab583,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2090 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2090;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c4d3eacc6803a82);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
      lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (lVar8 == 0) {
          return;
        }
        if (_DAT_7ffc3ebc2098 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x9b);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab4ac,0x7ffc3ebab55d,0,0);
          if ((lVar8 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc2098 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc2098;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c737ffe0900a709);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc20a0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x9b);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadb04,0x7ffc3eba743f,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc20a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc20a0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c4f249e2c97413c);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc20a8 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x9b);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab4ac,0x7ffc3eba7f9a,0,0);
          if ((lVar8 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc20a8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc20a8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c4be4b0360b7e4b);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc20b0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x9b);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadb04,0x7ffc3eba743f,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc20b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc20b0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c4db91112018fd2);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc20b8 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x9b);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab4ac,0x7ffc3eba7f9a,0,0);
          if ((lVar8 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc20b8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc20b8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7923d5d6b41f9e);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc20c0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x9b);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadb04,0x7ffc3eba743f,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc20c0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc20c0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c4db91112018fd2);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
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
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x3f4e6744b867);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar4 == (void *)0x0) {
          UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
          pcVar17 = &DAT_7ffc3eba6000;
          pvVar4 = pvRam00007ffc3ebc0a70;
        }
        else {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (0 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
            if (_DAT_7ffc3ebc20c8 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x9b);
              lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebab51a,0x7ffc3eba7f73,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc20c8 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc20c8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c4e61ee27fbcb13);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc20d0 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x9b);
              lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebadb04,0x7ffc3eba61d9,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc20d0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc20d0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c74c8118a040f0b);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            do {
              if (_DAT_7ffc3ebc20d8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebadb04,0x7ffc3eba6204,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc20d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc20d8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c47c77b43b4467e);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar16);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
              if (cVar2 == '\0') {
                if (receiver != (void *)0x0) {
                  lVar7 = FUN_7ffc3eb76c30(env,2);
                  if (lVar7 == 0) {
                    return;
                  }
                  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
                  if (lVar8 == 0) {
                    return;
                  }
                  FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
                  (*(*env)->ExceptionCheck)(env);
                  return;
                }
                pJVar15 = *env;
                pcVar17 = &DAT_7ffc3eba6000;
                pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e98ab9a:
                (*pJVar15->ThrowNew)(env,pvVar4,pcVar17);
                return;
              }
              if (_DAT_7ffc3ebc20e0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebadb04,0x7ffc3eba621c,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc20e0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc20e0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c49ad9f5f907720);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar16);
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
                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar9), bVar1 == 0)) {
                pJVar15 = *env;
                pcVar17 = (char *)0x7ffc3eba6033;
                pvVar4 = pvRam00007ffc3ebc0a58;
                goto LAB_7ffc3e98ab9a;
              }
              if (_DAT_7ffc3ebc20e8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebab4ac,0x7ffc3ebab616,0,0);
                if ((lVar8 != 0) &&
                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar9 != (void *)0x0)) {
                  _DAT_7ffc3ebc20e8 = (*(*env)->NewGlobalRef)(env,pvVar9);
                }
              }
              pvVar9 = _DAT_7ffc3ebc20e8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
LAB_7ffc3e98aaa1:
                pvVar4 = (*(*env)->ExceptionOccurred)(env);
                pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
                if (bVar1 == 0) {
                  return;
                }
                (*(*env)->ExceptionClear)(env);
                lVar7 = FUN_7ffc3eb76c30(env,0x9b);
                if (lVar7 == 0) {
                  return;
                }
                lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1ed);
                if (lVar8 == 0) {
                  return;
                }
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                (*(*env)->Throw)(env,pvVar4);
                return;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c460008674a8170);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar16);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar12);
              pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e98aaa1;
              if (_DAT_7ffc3ebc20f0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar11);
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                uVar13 = FUN_7ffc3eb76c30(env,0x9b);
                uStack_50 = FUN_7ffc3eb770c0(env,uVar11,5,uVar13,0x7ffc3ebae451,0x7ffc3ebb3aa4);
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar11);
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                         0x7ffc3eba7735,0x7ffc3ebb3ac5,&uStack_58,3);
                if ((lVar8 != 0) &&
                   (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar10 != (void *)0x0)) {
                  _DAT_7ffc3ebc20f0 = (*(*env)->NewGlobalRef)(env,pvVar10);
                }
              }
              pvVar10 = _DAT_7ffc3ebc20f0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e98aaa1;
              pvVar12 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0950,uRam00007ffc3ebc0900,
                                                 (longlong)uVar6 >> 0x38);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 (uVar6 ^ 0x6a532b78e8df) >> 0x18);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 (uint)(uVar6 ^ 0x6a532b78e8df) & 0xffffff);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar14);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e98aaa1;
              if (_DAT_7ffc3ebc20f8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x9b);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebadb04,0x7ffc3ebb0ae9,0,0);
                if ((lVar8 != 0) &&
                   (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar10 != (void *)0x0)) {
                  _DAT_7ffc3ebc20f8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                }
              }
              pvVar10 = _DAT_7ffc3ebc20f8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e98aaa1;
              pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar9);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c70f657d6df04df);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
              FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e98aaa1;
              if (lVar7 != 0) {
                return;
              }
            } while( true );
          }
          UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar4 = pvRam00007ffc3ebc0a98;
        }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98adeb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)(env,pvVar4,pcVar17);
        return;
      }
    }
  }
  else {
LAB_7ffc3e98ab4d:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e98abd5:
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x9b);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1ed), lVar8 == 0)) {
LAB_7ffc3e98ac41:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e98ac41;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e98ac4d:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x9b);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1ed), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e98acea;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
LAB_7ffc3e98ace1:
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e98acea:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x9b);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1ed), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98ad9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_6d_1_1 | RVA 0x1bae20 | dev/krypton/6d.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6d_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x9b);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0xd4);
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
        if (_DAT_7ffc3ebc2048 == (void *)0x0) {
          uVar7 = FUN_7ffc3eb76c30(env,0x9b);
          lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab4ac,0x7ffc3ebab55d,0,0);
          if (lVar5 != 0) {
            pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
            if (pvVar2 != (void *)0x0) {
              _DAT_7ffc3ebc2048 = (*(*env)->NewGlobalRef)(env,pvVar2);
            }
          }
        }
        pvVar2 = _DAT_7ffc3ebc2048;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar8 = uVar8 ^ 0x1049005a3432;
          pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b0659bf92c73ca);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc2050 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x9b);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebadb04,0x7ffc3eba743f,0,0);
              if (lVar5 != 0) {
                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                if (pvVar3 != (void *)0x0) {
                  _DAT_7ffc3ebc2050 = (*(*env)->NewGlobalRef)(env,pvVar3);
                }
              }
            }
            pvVar3 = _DAT_7ffc3ebc2050;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc88c3efbdcbb95ff);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
              FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc2058 == (void *)0x0) {
                  uVar7 = FUN_7ffc3eb76c30(env,0x9b);
                  lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb3a95,0x7ffc3eba606a,0x7ffc3eba606c,
                                           0x7ffc3ebab4ac,0x7ffc3eba7f9a,0,0);
                  if (lVar5 != 0) {
                    pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                    if (pvVar2 != (void *)0x0) {
                      _DAT_7ffc3ebc2058 = (*(*env)->NewGlobalRef)(env,pvVar2);
                    }
                  }
                }
                pvVar2 = _DAT_7ffc3ebc2058;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xc888fed5c627aa88);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar8);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (_DAT_7ffc3ebc2060 == (void *)0x0) {
                      uVar7 = FUN_7ffc3eb76c30(env,0x9b);
                      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb3a95,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3eba743f,0,0);
                      if (lVar5 != 0) {
                        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                        if (pvVar3 != (void *)0x0) {
                          _DAT_7ffc3ebc2060 = (*(*env)->NewGlobalRef)(env,pvVar3);
                        }
                      }
                    }
                    pvVar3 = _DAT_7ffc3ebc2060;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
                      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xc88ea374e22d5b11);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
                      pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar8);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
                      FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (_DAT_7ffc3ebc2068 == (void *)0x0) {
                          uVar7 = FUN_7ffc3eb76c30(env,0x9b);
                          lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb3a95,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebab4ac,0x7ffc3eba7f9a,0,0)
                          ;
                          if (lVar5 != 0) {
                            pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                            if (pvVar2 != (void *)0x0) {
                              _DAT_7ffc3ebc2068 = (*(*env)->NewGlobalRef)(env,pvVar2);
                            }
                          }
                        }
                        pvVar2 = _DAT_7ffc3ebc2068;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar3 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0xc8ba39b02698cb5d)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar8);
                          (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (_DAT_7ffc3ebc2070 == (void *)0x0) {
                              uVar7 = FUN_7ffc3eb76c30(env,0x9b);
                              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb3a95,0x7ffc3eba606a,
                                                       0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3eba743f,
                                                       0,0);
                              if (lVar5 != 0) {
                                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                                if (pvVar3 != (void *)0x0) {
                                  _DAT_7ffc3ebc2070 = (*(*env)->NewGlobalRef)(env,pvVar3);
                                }
                              }
                            }
                            pvVar3 = _DAT_7ffc3ebc2070;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar4 = (*(*env)->NewObjectArray)
                                                 (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
                              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0xc88ea374e22d5b11);
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
                              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar8);
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
                              FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98b8f5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                                  return;
                                }
                                lVar5 = FUN_7ffc3eb76c30(env,2);
                                if (lVar5 != 0) {
                                  lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61);
                                  if (lVar6 != 0) {
                                    FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98b4b6. Too many branches */
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
  return;
}

