/* Native reconstruction for dev/krypton/61.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_61_1_0 | RVA 0x175e40 | dev/krypton/61.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_61_1_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  longlong lVar4;
  longlong lVar5;
  void *pvVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x99);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0xc2);
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
        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e946c71. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar4 = FUN_7ffc3eb76c30(env,2);
        if (lVar4 != 0) {
          lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x61);
          if (lVar5 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar4,lVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1c68 == (void *)0x0) {
                uVar7 = FUN_7ffc3eb76c30(env,0x99);
                lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,0x7ffc3eba72ee,0x7ffc3eba606c,
                                         0x7ffc3ebae407,0x7ffc3ebaf885,0,0);
                if (lVar4 != 0) {
                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00);
                  if (pvVar2 != (void *)0x0) {
                    _DAT_7ffc3ebc1c68 = (*(*env)->NewGlobalRef)(env,pvVar2);
                  }
                }
              }
              pvVar2 = _DAT_7ffc3ebc1c68;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                uVar8 = uVar8 ^ 0x414cccac4ad4;
                pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc8a7e3507b6d834d);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar8);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar6);
                pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc1c70 == (void *)0x0) {
                    uVar7 = FUN_7ffc3eb76c30(env,0x99);
                    lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,0x7ffc3eba72ee,
                                             0x7ffc3eba606c,0x7ffc3ebab4ac,0x7ffc3eba743f,0,0);
                    if (lVar4 != 0) {
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00);
                      if (pvVar3 != (void *)0x0) {
                        _DAT_7ffc3ebc1c70 = (*(*env)->NewGlobalRef)(env,pvVar3);
                      }
                    }
                  }
                  pvVar3 = _DAT_7ffc3ebc1c70;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar2);
                    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8b86b00bf929f83);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar2);
                    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar8);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar2);
                    FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar6);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc1c78 == (void *)0x0) {
                        uVar7 = FUN_7ffc3eb76c30(env,0x99);
                        lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3ebaf885,0,0);
                        if (lVar4 != 0) {
                          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00);
                          if (pvVar2 != (void *)0x0) {
                            _DAT_7ffc3ebc1c78 = (*(*env)->NewGlobalRef)(env,pvVar2);
                          }
                        }
                      }
                      pvVar2 = _DAT_7ffc3ebc1c78;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0xc8bb8fe5438342dc);
                        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar8);
                        (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar6);
                        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc1c80 == (void *)0x0) {
                            uVar7 = FUN_7ffc3eb76c30(env,0x99);
                            lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,0x7ffc3eba72ee,
                                                     0x7ffc3eba606c,0x7ffc3ebab4ac,0x7ffc3eba743f,0,
                                                     0);
                            if (lVar4 != 0) {
                              pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00);
                              if (pvVar3 != (void *)0x0) {
                                _DAT_7ffc3ebc1c80 = (*(*env)->NewGlobalRef)(env,pvVar3);
                              }
                            }
                          }
                          pvVar3 = _DAT_7ffc3ebc1c80;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar6 = (*(*env)->NewObjectArray)
                                               (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar2);
                            pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0xc8b86b00bf929f83);
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar2);
                            pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar8);
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar2);
                            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar6);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc1c88 == (void *)0x0) {
                                uVar7 = FUN_7ffc3eb76c30(env,0x99);
                                lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,0x7ffc3eba72ee,
                                                         0x7ffc3eba606c,0x7ffc3ebae407,
                                                         0x7ffc3eba7f9a,0,0);
                                if (lVar4 != 0) {
                                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar4,uRam00007ffc3ebc0a00);
                                  if (pvVar2 != (void *)0x0) {
                                    _DAT_7ffc3ebc1c88 = (*(*env)->NewGlobalRef)(env,pvVar2);
                                  }
                                }
                              }
                              pvVar2 = _DAT_7ffc3ebc1c88;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar3 = (*(*env)->NewObjectArray)
                                                   (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0xc8ba17078777af39);
                                (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar6);
                                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,uVar8);
                                (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar6);
                                pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,
                                                                  pvVar3);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc1c90 == (void *)0x0) {
                                    uVar7 = FUN_7ffc3eb76c30(env,0x99);
                                    lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,
                                                             0x7ffc3eba72ee,0x7ffc3eba606c,
                                                             0x7ffc3ebab4ac,0x7ffc3eba743f,0,0);
                                    if (lVar4 != 0) {
                                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar4,
                                                                        uRam00007ffc3ebc0a00);
                                      if (pvVar3 != (void *)0x0) {
                                        _DAT_7ffc3ebc1c90 = (*(*env)->NewGlobalRef)(env,pvVar3);
                                      }
                                    }
                                  }
                                  pvVar3 = _DAT_7ffc3ebc1c90;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar6 = (*(*env)->NewObjectArray)
                                                       (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar2);
                                    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0xc8a6ef2369c9dd4c);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar2);
                                    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar8);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar2);
                                    FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar6);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (_DAT_7ffc3ebc1c98 == (void *)0x0) {
                                        uVar7 = FUN_7ffc3eb76c30(env,0x99);
                                        lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,
                                                                 0x7ffc3eba72ee,0x7ffc3eba606c,
                                                                 0x7ffc3ebae407,0x7ffc3eba7f9a,0,0);
                                        if (lVar4 != 0) {
                                          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar4,
                                                                            uRam00007ffc3ebc0a00);
                                          if (pvVar2 != (void *)0x0) {
                                            _DAT_7ffc3ebc1c98 = (*(*env)->NewGlobalRef)(env,pvVar2);
                                          }
                                        }
                                      }
                                      pvVar2 = _DAT_7ffc3ebc1c98;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar3 = (*(*env)->NewObjectArray)
                                                           (env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                                        ;
                                        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          0xc8b9b3f173499538);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar6);
                                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,uVar8
                                                                         );
                                        (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar6);
                                        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,
                                                                          uRam00007ffc3ebc0a40,
                                                                          pvVar3);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          if (_DAT_7ffc3ebc1ca0 == (void *)0x0) {
                                            uVar7 = FUN_7ffc3eb76c30(env,0x99);
                                            lVar4 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb2953,
                                                                     0x7ffc3eba72ee,0x7ffc3eba606c,
                                                                     0x7ffc3ebab4ac,0x7ffc3eba743f,0
                                                                     ,0);
                                            if (lVar4 != 0) {
                                              pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar4,
                                                                                uRam00007ffc3ebc0a00
                                                                               );
                                              if (pvVar3 != (void *)0x0) {
                                                _DAT_7ffc3ebc1ca0 =
                                                     (*(*env)->NewGlobalRef)(env,pvVar3);
                                              }
                                            }
                                          }
                                          pvVar3 = _DAT_7ffc3ebc1ca0;
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            pvVar6 = (*(*env)->NewObjectArray)
                                                               (env,3,pvRam00007ffc3ebc09e0,
                                                                (void *)0x0);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar2);
                                            pvVar2 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc8a6ef2369c9dd4c);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar2);
                                            pvVar2 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar2);
                                            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar6)
                                            ;
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9466c6. Too many branches */
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

