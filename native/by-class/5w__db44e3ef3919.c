/* Native reconstruction for dev/krypton/5w.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5w_1_0 | RVA 0x1b78a0 | dev/krypton/5w.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5w_1_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar10;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x86);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xd5);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x23);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x62);
  if (lVar7 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar10 = uVar5 ^ 0x5f70325b38d;
  if (iVar2 == 0) {
    if (_DAT_7ffc3ebc1c38 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x86);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb3b09,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba71b9,0x7ffc3eba71d3,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1c38 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1c38;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8a028056ae4d527);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1c40 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x86);
          lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb3b09,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba71b9,0x7ffc3eba7203,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1c40 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1c40;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8ae39ffde188618);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar6 == 0) {
              return;
            }
            goto LAB_7ffc3e987b8f;
          }
        }
      }
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x86);
      if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x1ee), lVar7 != 0)) {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar3 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e988184;
        }
        (*(*env)->Throw)(env,pvVar3);
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e988184:
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x86);
      if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x1ee), lVar7 != 0)) {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e988230. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->Throw)(env,pvVar3);
          return;
        }
      }
    }
    return;
  }
LAB_7ffc3e987b8f:
  if (receiver != (void *)0x0) {
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if (lVar6 == 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x61);
    if (lVar7 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
    if (lVar6 == 0) {
      return;
    }
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,0);
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
      if (2 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar7 == 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar5 ^ 0x743ab3752bf3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
            if (_DAT_7ffc3ebc1c48 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x86);
              lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb3b09,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaade7,0x7ffc3eba743f,0,0);
              if ((lVar6 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc1c48 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc1c48;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8a082954c6ec777);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e987ed7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e988269;
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e988269:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98827c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

