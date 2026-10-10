/* Native reconstruction for dev/krypton/6r.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6r_6_0 | RVA 0x1bdc70 | dev/krypton/6r.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6r_6_0(JNINativeInterface_ **env,void *receiver)

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
  void *arg1;
  undefined8 uVar10;
  JNINativeInterface_ *pJVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar12;
  char *pcVar13;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xa7);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xc1);
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
  uVar12 = uVar6 ^ 0x2be4e67167c4;
  if (iVar3 == 0) {
LAB_7ffc3e98e177:
    pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar7 == 0) {
      return;
    }
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x7b63e90f439d);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar4 == (void *)0x0) {
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar13 = &DAT_7ffc3eba6000;
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
        if (_DAT_7ffc3ebc2198 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0xa7);
          lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb2941,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7311,0x7ffc3eba626f,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc2198 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc2198;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c6c971690c08a2b);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98e567. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar13 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
    }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98e7ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar4,pcVar13);
    return;
  }
  if (_DAT_7ffc3ebc2180 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,0xa7);
    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb2941,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebb2950,0x7ffc3eba7192,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc2180 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc2180;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c6c00a4c997a92d);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar7 != 0)) {
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x738728335bf3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
            pJVar11 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar4 = pvRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
            }
            if (0 < iVar3) {
              (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
              if (_DAT_7ffc3ebc2188 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,0xa7);
                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb2941,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba7311,0x7ffc3eba630c,0,0);
                if ((lVar7 != 0) &&
                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                   pvVar9 != (void *)0x0)) {
                  _DAT_7ffc3ebc2188 = (*(*env)->NewGlobalRef)(env,pvVar9);
                }
              }
              pvVar9 = _DAT_7ffc3ebc2188;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar4);
                (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar5);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c6fdeca7c4bbeae);
                (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar12);
                (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,arg1);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc2190 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0xa7);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb2941,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3eba7311,0x7ffc3eba6204,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc2190 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc2190;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c6db35ae4e502d7);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                    uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
                      if (cVar2 == '\0') {
                        return;
                      }
                      goto LAB_7ffc3e98e177;
                    }
                  }
                }
              }
              goto LAB_7ffc3e98e64c;
            }
            pJVar11 = *env;
            pcVar13 = (char *)0x7ffc3eba6019;
            pvVar4 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar11->ThrowNew)(env,pvVar4,pcVar13);
        }
      }
    }
  }
LAB_7ffc3e98e64c:
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0xa7);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1d8), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e98e6f4;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
  }
LAB_7ffc3e98e6f4:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0xa7);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1d8), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98e7a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

