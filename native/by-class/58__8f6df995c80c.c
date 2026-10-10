/* Native reconstruction for dev/krypton/58.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_58_6_0 | RVA 0x159700 | dev/krypton/58.6()V | unresolved */
/* No successful pseudocode: consult coverage.tsv and the disassembly. */

/* JNI_dev_krypton_58_1_1 | RVA 0x167810 | dev/krypton/58.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_58_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  float fVar12;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x57);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x9f);
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
  if (iVar2 != 0) {
LAB_7ffc3e9378fd:
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e937965. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
LAB_7ffc3e9397be:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9397d6:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9397ee. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
    return;
  }
  if (_DAT_7ffc3ebc0dc8 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,0x57);
    lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba72e6,0x7ffc3eba71d3,0,0);
    if ((lVar6 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc0dc8 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc0dc8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar5 ^ 0x55524017ee81;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8b2ddc4c8d4461b);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (_DAT_7ffc3ebc0dd0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x57);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba72e6,0x7ffc3eba7203,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc0dd0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc0dd0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8b813fd15eb8b76);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar6 == 0) {
            return;
          }
          if (_DAT_7ffc3ebc0dd8 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x57);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7e9c,0x7ffc3eba72ac,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc0dd8 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc0dd8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8a3d783c0d692f1);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc0de0 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x57);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7e9c,0x7ffc3eba72ac,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc0de0 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc0de0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b5819d4723d484);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc0de8 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x57);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7e9c,0x7ffc3eba72ac,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc0de8 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc0de8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8bf4f00680a6549);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc0df0 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x57);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7e9c,0x7ffc3eba72ac,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc0df0 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc0df0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8a2700caeb9f6ee);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc0df8 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x57);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7e9c,0x7ffc3eba72ac,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc0df8 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc0df8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8a7c1cda9377a49);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc0e00 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x57);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba7e9c,0x7ffc3eba72ac,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc0e00 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc0e00;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8bd4ac63e933701);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
          if (lVar6 == 0) {
            return;
          }
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x744b949cf32f);
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
            if (iVar2 < 1) {
              UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
              arg2 = (char *)0x7ffc3eba6019;
              pvVar3 = pvRam00007ffc3ebc0a98;
              goto LAB_7ffc3e9397d6;
            }
            (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
            if (_DAT_7ffc3ebc0e08 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebb073c,0x7ffc3eba626f,0,0);
              if ((lVar6 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc0e08 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc0e08;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8a406f51e0dba18);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0e10 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72e6,0x7ffc3ebb07ca,0,0);
              if ((lVar6 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc0e10 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc0e10;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8bc5c1530372a30);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0e18 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72e6,0x7ffc3ebb07ca,0,0);
              if ((lVar6 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc0e18 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc0e18;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8bac8a1db16e3c5);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0e20 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebb073c,0x7ffc3ebb0885,0,0);
              if ((lVar6 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc0e20 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc0e20;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8bfd09db8e41164);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0e28 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72e6,0x7ffc3ebae384,0,0);
              if ((lVar6 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc0e28 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc0e28;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8bf00b0ef89a0b0);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
            uVar10 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            fVar12 = (float)FUN_7ffc3e853ac0(env,uVar10,uRam00007ffc3ebc09c8);
            if (_DAT_7ffc3ebc0e30 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba7e9c,0x7ffc3ebae39c,0,0);
              if ((lVar6 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc0e30 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc0e30;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                              (double)fVar12);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8b36b0bd87d5282);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0e38 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72e6,0x7ffc3ebae384,0,0);
              if ((lVar6 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc0e38 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc0e38;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8b124d805e8a302);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
            uVar10 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            fVar12 = (float)FUN_7ffc3e853ac0(env,uVar10,uRam00007ffc3ebc09c8);
            if (_DAT_7ffc3ebc0e40 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x57);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb072d,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba7e9c,0x7ffc3ebae39c,0,0);
              if ((lVar6 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc0e40 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc0e40;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                              (double)fVar12);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8b969c6e38e895f);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            goto LAB_7ffc3e9378fd;
          }
          goto LAB_7ffc3e9397be;
        }
      }
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x57);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x149), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e93970a;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
  }
LAB_7ffc3e93970a:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x57);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x149), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9397bb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

