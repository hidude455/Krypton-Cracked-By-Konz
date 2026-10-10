/* Native reconstruction for dev/krypton/5Y.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5Y_6_0 | RVA 0x197db0 | dev/krypton/5Y.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5Y_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  undefined4 uVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x53);
  if (pvVar4 != (void *)0x0) {
    pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x62);
    if (pvVar5 != (void *)0x0) {
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
        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96897e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar7 = FUN_7ffc3eb76c30(env,2);
        if (lVar7 != 0) {
          lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
          if (lVar8 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1740 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,0x53);
                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2d4,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba6478,0x7ffc3eba647c,0,0);
                if (lVar7 != 0) {
                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                  if (pvVar4 != (void *)0x0) {
                    _DAT_7ffc3ebc1740 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
              }
              pvVar4 = _DAT_7ffc3ebc1740;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                  0x872);
                (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar6 ^ 0x49aadbb22c63284);
                (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  uVar3 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                  if (_DAT_7ffc3ebc1748 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x53);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2d4,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3ebae2e3,0x7ffc3eba7293,0,0);
                    if (lVar7 != 0) {
                      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                      if (pvVar4 != (void *)0x0) {
                        _DAT_7ffc3ebc1748 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc1748;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    uVar11 = uVar6 ^ 0x7d6bc99b8cfd;
                    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                      uVar3);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c6510b05d095e18);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar11);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
                    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc1750 == (void *)0x0) {
                        uVar10 = FUN_7ffc3eb76c30(env,0x53);
                        lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2d4,0x7ffc3eba606a,
                                                 0x7ffc3eba606c,0x7ffc3eba6478,0x7ffc3eba647c,0,0);
                        if (lVar7 != 0) {
                          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                          if (pvVar4 != (void *)0x0) {
                            _DAT_7ffc3ebc1750 = (*(*env)->NewGlobalRef)(env,pvVar4);
                          }
                        }
                      }
                      pvVar4 = _DAT_7ffc3ebc1750;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                          uRam00007ffc3ebc0998,0x1772);
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
                        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar6 ^ 0xd1d18865a762d8b);
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                        uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          uVar2 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc1758 == (void *)0x0) {
                            uVar10 = FUN_7ffc3eb76c30(env,0x53);
                            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2d4,0x7ffc3eba718e,
                                                     0x7ffc3eba606c,0x7ffc3ebae2e3,0x7ffc3eba72ac,0,
                                                     0);
                            if (lVar7 != 0) {
                              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                              if (pvVar4 != (void *)0x0) {
                                _DAT_7ffc3ebc1758 = (*(*env)->NewGlobalRef)(env,pvVar4);
                              }
                            }
                          }
                          pvVar4 = _DAT_7ffc3ebc1758;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar5 = (*(*env)->NewObjectArray)
                                               (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                              uRam00007ffc3ebc0990,uVar2);
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1c64fc40787538e4);
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar11);
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
                            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc1760 == (void *)0x0) {
                                uVar10 = FUN_7ffc3eb76c30(env,0x53);
                                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2d4,0x7ffc3eba606a,
                                                         0x7ffc3eba606c,0x7ffc3eba6478,
                                                         0x7ffc3eba647c,0,0);
                                if (lVar7 != 0) {
                                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                                  if (pvVar4 != (void *)0x0) {
                                    _DAT_7ffc3ebc1760 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                  }
                                }
                              }
                              pvVar4 = _DAT_7ffc3ebc1760;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar5 = (*(*env)->NewObjectArray)
                                                   (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                  uRam00007ffc3ebc0998,0x1772);
                                (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
                                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  uVar6 ^ 0xd1d18865a762d8b);
                                (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                                uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  uVar3 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                                  if (_DAT_7ffc3ebc1768 == (void *)0x0) {
                                    uVar10 = FUN_7ffc3eb76c30(env,0x53);
                                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2d4,
                                                             0x7ffc3eba718e,0x7ffc3eba606c,
                                                             0x7ffc3ebae2e3,0x7ffc3eba7293,0,0);
                                    if (lVar7 != 0) {
                                      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                        uRam00007ffc3ebc0a00);
                                      if (pvVar4 != (void *)0x0) {
                                        _DAT_7ffc3ebc1768 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                      }
                                    }
                                  }
                                  pvVar4 = _DAT_7ffc3ebc1768;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar5 = (*(*env)->NewObjectArray)
                                                       (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                      uRam00007ffc3ebc0998,uVar3);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x1c7f034eb043d100);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar11);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
                                    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e968536. Too many branches */
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

