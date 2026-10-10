/* Native reconstruction for dev/krypton/51.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_51_6_0 | RVA 0x139ca0 | dev/krypton/51.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_51_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x75);
  if (pvVar3 != (void *)0x0) {
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x9d);
    if (pvVar4 != (void *)0x0) {
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar5 = *(ulonglong *)
                 (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                 (longlong)*(int *)((longlong)pvVar4 + 0x10));
      }
      else {
        uVar5 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90a323. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar6 = FUN_7ffc3eb76c30(env,2);
        if (lVar6 != 0) {
          lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x5f);
          if (lVar7 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc0da8 == (void *)0x0) {
                uVar9 = FUN_7ffc3eb76c30(env,0x75);
                lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb06e5,0x7ffc3eba72ee,0x7ffc3eba606c,
                                         0x7ffc3eba7e6d,0x7ffc3ebb06f4,0,0);
                if (lVar6 != 0) {
                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                  if (pvVar3 != (void *)0x0) {
                    _DAT_7ffc3ebc0da8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                  }
                }
              }
              pvVar3 = _DAT_7ffc3ebc0da8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,1,(void *)0x0);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c796d6e8c04f37d);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar5 ^ 0x30018b1e14ff);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc0db0 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x75);
                    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb06e5,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3eba6478,0x7ffc3eba647c,0,0);
                    if (lVar6 != 0) {
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                      if (pvVar3 != (void *)0x0) {
                        _DAT_7ffc3ebc0db0 = (*(*env)->NewGlobalRef)(env,pvVar3);
                      }
                    }
                  }
                  pvVar3 = _DAT_7ffc3ebc0db0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                      0x699e);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar5 ^ 0x52573705bbaaa1a2);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                    uVar9 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      uVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
                      if (_DAT_7ffc3ebc0db8 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x75);
                        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb06e5,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba7e6d,0x7ffc3eba72ac,0,0);
                        if (lVar6 != 0) {
                          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                          if (pvVar3 != (void *)0x0) {
                            _DAT_7ffc3ebc0db8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                          }
                        }
                      }
                      pvVar3 = _DAT_7ffc3ebc0db8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                          uRam00007ffc3ebc0990,uVar2);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c79e36c8b08f0f4);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar5 ^ 0x30018b1e14ff);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                        FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90a0dc. Too many branches */
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
  return;
}

/* JNI_dev_krypton_51_1_1 | RVA 0x13a330 | dev/krypton/51.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_51_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x75);
  if (pvVar3 != (void *)0x0) {
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x9d);
    if (pvVar4 != (void *)0x0) {
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar5 = *(ulonglong *)
                 (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                 (longlong)*(int *)((longlong)pvVar4 + 0x10));
      }
      else {
        uVar5 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90a9b3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar6 = FUN_7ffc3eb76c30(env,2);
        if (lVar6 != 0) {
          lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x61);
          if (lVar7 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc0d90 == (void *)0x0) {
                uVar9 = FUN_7ffc3eb76c30(env,0x75);
                lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb06e5,0x7ffc3eba72ee,0x7ffc3eba606c,
                                         0x7ffc3eba7e6d,0x7ffc3ebb06f4,0,0);
                if (lVar6 != 0) {
                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                  if (pvVar3 != (void *)0x0) {
                    _DAT_7ffc3ebc0d90 = (*(*env)->NewGlobalRef)(env,pvVar3);
                  }
                }
              }
              pvVar3 = _DAT_7ffc3ebc0d90;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,1,(void *)0x0);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc8ba770b7c2827be);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar5 ^ 0x2a647b32c03c);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc0d98 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x75);
                    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb06e5,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3eba6478,0x7ffc3eba647c,0,0);
                    if (lVar6 != 0) {
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                      if (pvVar3 != (void *)0x0) {
                        _DAT_7ffc3ebc0d98 = (*(*env)->NewGlobalRef)(env,pvVar3);
                      }
                    }
                  }
                  pvVar3 = _DAT_7ffc3ebc0d98;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                      0x64c7);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar5 ^ 0x5218ff7c68c82cf5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                    uVar9 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      uVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
                      if (_DAT_7ffc3ebc0da0 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x75);
                        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb06e5,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba7e6d,0x7ffc3eba72ac,0,0);
                        if (lVar6 != 0) {
                          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                          if (pvVar3 != (void *)0x0) {
                            _DAT_7ffc3ebc0da0 = (*(*env)->NewGlobalRef)(env,pvVar3);
                          }
                        }
                      }
                      pvVar3 = _DAT_7ffc3ebc0da0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                          uRam00007ffc3ebc0990,uVar2);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0xc8baf9097b242437);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar5 ^ 0x2a647b32c03c);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                        FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90a76c. Too many branches */
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
  return;
}

