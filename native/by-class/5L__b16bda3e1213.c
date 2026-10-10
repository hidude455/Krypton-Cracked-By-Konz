/* Native reconstruction for dev/krypton/5L.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5L_1_0 | RVA 0x172f70 | dev/krypton/5L.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5L_1_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  ulonglong uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x22);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x11);
  if (pvVar4 == (void *)0x0) {
    return;
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
    return;
  }
  lVar5 = FUN_7ffc3eb76c30(env,0x23);
  if (lVar5 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x62);
  if (lVar6 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,lVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e944efd:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) {
      return;
    }
  }
  else {
    lVar5 = FUN_7ffc3eb76c30(env,2);
    if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61), lVar6 == 0))
    goto LAB_7ffc3e944efd;
    FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e944efd;
    if (_DAT_7ffc3ebc1460 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x22);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7466,0x7ffc3eba71d3,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1460 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1460;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e944efd;
    uVar9 = uVar9 ^ 0x1507ca256b0e;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8ac9e09978e6573);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e944efd;
    if (iVar2 != 0) {
LAB_7ffc3e94408a:
      if (_DAT_7ffc3ebc14d8 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x22);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7466,0x7ffc3eba7469,0,0);
        if ((lVar5 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc14d8 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc14d8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8affa578624ee88);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc14e0 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x22);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba7466,0x7ffc3eba7499,0,0);
        if ((lVar5 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc14e0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc14e0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8ad67314d526805);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc14e8 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x22);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba74c9,0x7ffc3eba72ac,0,0);
        if ((lVar5 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc14e8 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc14e8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8af90b318995b6e);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e944392. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
    if (_DAT_7ffc3ebc1468 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x22);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7466,0x7ffc3eba7203,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1468 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1468;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8ad973a9092b180);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      lVar5 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (lVar5 == 0) {
          return;
        }
        if (_DAT_7ffc3ebc1470 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba71d3,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc1470 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc1470;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8ac9e09978e6573);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1478 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba7469,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1478 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1478;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8affa578624ee88);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1480 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba7499,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1480 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1480;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8acfa2c2d92f598);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1488 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba74c9,0x7ffc3eba72ac,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1488 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1488;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8af90b318995b6e);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar3);
        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1490 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba71d3,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc1490 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc1490;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8ac9e09978e6573);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1498 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba7469,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1498 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1498;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8affa578624ee88);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14a0 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba7499,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc14a0 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc14a0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8ad2b20c63a7471);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14a8 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba74c9,0x7ffc3eba72ac,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc14a8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc14a8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8af90b318995b6e);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar3);
        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14b0 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba71d3,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc14b0 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc14b0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8ac9e09978e6573);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14b8 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba7469,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc14b8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc14b8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8affa578624ee88);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14c0 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba7499,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc14c0 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc14c0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8af59f03d825d08);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14c8 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba74c9,0x7ffc3eba72ac,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc14c8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc14c8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8af90b318995b6e);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar3);
        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc14d0 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x22);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7457,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3eba71d3,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc14d0 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc14d0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8ac9e09978e6573);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        goto LAB_7ffc3e94408a;
      }
    }
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) goto LAB_7ffc3e944fa9;
  }
  (*(*env)->ExceptionClear)(env);
  lVar5 = FUN_7ffc3eb76c30(env,0x22);
  if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,99), lVar6 != 0)) {
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3e944fa9;
    }
    (*(*env)->Throw)(env,pvVar3);
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e944fa9:
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x22);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,99), lVar6 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e945045. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

