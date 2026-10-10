/* Native reconstruction for dev/krypton/6i.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6i_6_0 | RVA 0x1bb900 | dev/krypton/6i.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6i_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  undefined8 uVar8;
  longlong lVar9;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x25);
  if ((pvVar4 != (void *)0x0) &&
     (pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x12), pvVar5 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar6 = *(ulonglong *)
               (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
               (longlong)*(int *)((longlong)pvVar5 + 0x10));
    }
    else {
      uVar6 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (_DAT_7ffc3ebc2118 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x25);
        lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba74cc,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba6299,0x7ffc3eba647c,0,0);
        if ((lVar9 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2118 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc2118;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x14de);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar6 ^ 0x4b83c07c9932e699);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
        uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar2 = FUN_7ffc3e7d8be0(env,uVar8,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc2120 == (void *)0x0) {
            uVar8 = FUN_7ffc3eb76c30(env,0x25);
            lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba74cc,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba74db,0x7ffc3eba72ac,0,0);
            if ((lVar9 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc2120 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc2120;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c671603dd4c567a);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar6 ^ 0x55211195fa26);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar7);
            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 != 0)
                 ) {
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                  uVar6 ^ 0x2688bba2d17f);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (pvVar4 == (void *)0x0) {
                    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                    arg2 = &DAT_7ffc3eba6000;
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
                      if (_DAT_7ffc3ebc2128 == (void *)0x0) {
                        uVar8 = FUN_7ffc3eb76c30(env,0x25);
                        lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba74cc,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba74dd,0x7ffc3eba626f,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar5 != (void *)0x0)) {
                          _DAT_7ffc3ebc2128 = (*(*env)->NewGlobalRef)(env,pvVar5);
                        }
                      }
                      pvVar5 = _DAT_7ffc3ebc2128;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c6780de10ec364a);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar6 ^ 0x55211195fa26)
                      ;
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar4);
                      FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98bf14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                      (*(*env)->ExceptionCheck)(env);
                      return;
                    }
                    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                    arg2 = (char *)0x7ffc3eba6019;
                    pvVar4 = pvRam00007ffc3ebc0a98;
                  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98c011. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
                  return;
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

/* JNI_dev_krypton_6i_1_1 | RVA 0x1bc020 | dev/krypton/6i.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6i_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  undefined8 uVar8;
  longlong lVar9;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x25);
  if ((pvVar4 != (void *)0x0) &&
     (pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x12), pvVar5 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar6 = *(ulonglong *)
               (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
               (longlong)*(int *)((longlong)pvVar5 + 0x10));
    }
    else {
      uVar6 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (_DAT_7ffc3ebc2100 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x25);
        lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba74cc,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba6299,0x7ffc3eba647c,0,0);
        if ((lVar9 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2100 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc2100;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x269);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar6 ^ 0x1ed8401f41dcf028);
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
        uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar2 = FUN_7ffc3e7d8be0(env,uVar8,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc2108 == (void *)0x0) {
            uVar8 = FUN_7ffc3eb76c30(env,0x25);
            lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba74cc,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba74db,0x7ffc3eba72ac,0,0);
            if ((lVar9 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc2108 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc2108;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xc8a40c662d6082b9);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar6 ^ 0x4f44e1b92ee5);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar7);
            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 != 0)
                 ) {
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                  uVar6 ^ 0x788bbd3af6b2);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (pvVar4 == (void *)0x0) {
                    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                    arg2 = &DAT_7ffc3eba6000;
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
                      if (_DAT_7ffc3ebc2110 == (void *)0x0) {
                        uVar8 = FUN_7ffc3eb76c30(env,0x25);
                        lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba74cc,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba74dd,0x7ffc3eba626f,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar5 != (void *)0x0)) {
                          _DAT_7ffc3ebc2110 = (*(*env)->NewGlobalRef)(env,pvVar5);
                        }
                      }
                      pvVar5 = _DAT_7ffc3ebc2110;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xc8a5d80c68e8e47d);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar6 ^ 0x4f44e1b92ee5)
                      ;
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar4);
                      FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98c634. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                      (*(*env)->ExceptionCheck)(env);
                      return;
                    }
                    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                    arg2 = (char *)0x7ffc3eba6019;
                    pvVar4 = pvRam00007ffc3ebc0a98;
                  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98c731. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
                  return;
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

