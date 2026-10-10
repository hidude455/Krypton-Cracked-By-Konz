/* Native reconstruction for dev/krypton/6k.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6k_6_0 | RVA 0x1bc740 | dev/krypton/6k.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6k_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  undefined4 uVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong uVar11;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x54);
  if (pvVar4 != (void *)0x0) {
    pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,99);
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
        if (_DAT_7ffc3ebc2140 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x54);
          lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2e5,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7233,0x7ffc3eba647c,0,0);
          if (lVar9 != 0) {
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00);
            if (pvVar4 != (void *)0x0) {
              _DAT_7ffc3ebc2140 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
        }
        pvVar4 = _DAT_7ffc3ebc2140;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x4700);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar7);
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar6 ^ 0x591fd278caf30065);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
          uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            uVar3 = FUN_7ffc3e7d8be0(env,uVar8,uRam00007ffc3ebc09d0);
            if (_DAT_7ffc3ebc2148 == (void *)0x0) {
              uVar8 = FUN_7ffc3eb76c30(env,0x54);
              lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2e5,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae2f4,0x7ffc3eba7293,0,0);
              if (lVar9 != 0) {
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00);
                if (pvVar4 != (void *)0x0) {
                  _DAT_7ffc3ebc2148 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
            }
            pvVar4 = _DAT_7ffc3ebc2148;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              uVar11 = uVar6 ^ 0x13277e0744ca;
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar3)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c634a50770ae461);
              (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar7);
              FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc2150 == (void *)0x0) {
                  uVar8 = FUN_7ffc3eb76c30(env,0x54);
                  lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2e5,0x7ffc3eba6299,0x7ffc3eba606c,
                                           0x7ffc3eba7233,0x7ffc3eba647c,0,0);
                  if (lVar9 != 0) {
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00);
                    if (pvVar4 != (void *)0x0) {
                      _DAT_7ffc3ebc2150 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                }
                pvVar4 = _DAT_7ffc3ebc2150;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                    0x5d0a);
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar7);
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar6 ^ 0x4f2f4ca3f9291a69);
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
                  uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    uVar3 = FUN_7ffc3e7d8be0(env,uVar8,uRam00007ffc3ebc09d0);
                    if (_DAT_7ffc3ebc2158 == (void *)0x0) {
                      uVar8 = FUN_7ffc3eb76c30(env,0x54);
                      lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2e5,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebae2f4,0x7ffc3eba7293,0,0);
                      if (lVar9 != 0) {
                        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00);
                        if (pvVar4 != (void *)0x0) {
                          _DAT_7ffc3ebc2158 = (*(*env)->NewGlobalRef)(env,pvVar4);
                        }
                      }
                    }
                    pvVar4 = _DAT_7ffc3ebc2158;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                        uRam00007ffc3ebc0998,uVar3);
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c61b799aab2b519);
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar11);
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar7);
                      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (_DAT_7ffc3ebc2160 == (void *)0x0) {
                          uVar8 = FUN_7ffc3eb76c30(env,0x54);
                          lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2e5,0x7ffc3eba6299,
                                                   0x7ffc3eba606c,0x7ffc3eba7233,0x7ffc3eba647c,0,0)
                          ;
                          if (lVar9 != 0) {
                            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00);
                            if (pvVar4 != (void *)0x0) {
                              _DAT_7ffc3ebc2160 = (*(*env)->NewGlobalRef)(env,pvVar4);
                            }
                          }
                        }
                        pvVar4 = _DAT_7ffc3ebc2160;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar5 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                            uRam00007ffc3ebc0998,0x12ba);
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,
                                                            uVar6 ^ 0x126fe4e21cfbd5de);
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
                          uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            uVar2 = FUN_7ffc3e7d8be0(env,uVar8,uRam00007ffc3ebc09d0);
                            if (_DAT_7ffc3ebc2168 == (void *)0x0) {
                              uVar8 = FUN_7ffc3eb76c30(env,0x54);
                              lVar9 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2e5,0x7ffc3eba606a,
                                                       0x7ffc3eba606c,0x7ffc3ebae2f4,0x7ffc3eba72ac,
                                                       0,0);
                              if (lVar9 != 0) {
                                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00);
                                if (pvVar4 != (void *)0x0) {
                                  _DAT_7ffc3ebc2168 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                }
                              }
                            }
                            pvVar4 = _DAT_7ffc3ebc2168;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar5 = (*(*env)->NewObjectArray)
                                                 (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                                uRam00007ffc3ebc0990,uVar2);
                              (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0x1c643f561585f33c);
                              (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar11);
                              (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar7);
                              FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98d318. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                                  return;
                                }
                                lVar9 = FUN_7ffc3eb76c30(env,2);
                                if (lVar9 != 0) {
                                  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x5f);
                                  if (lVar10 != 0) {
                                    FUN_7ffc3e7dbbc0(env,receiver,lVar9,lVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98ced0. Too many branches */
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

/* JNI_dev_krypton_6k_1_1 | RVA 0x1bd320 | dev/krypton/6k.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6k_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  void *pvVar6;
  undefined8 uVar7;
  longlong lVar8;
  longlong lVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x54);
  if (pvVar3 != (void *)0x0) {
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,99);
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
        if (_DAT_7ffc3ebc2130 == (void *)0x0) {
          uVar7 = FUN_7ffc3eb76c30(env,0x54);
          lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebae2e5,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba7233,0x7ffc3eba647c,0,0);
          if (lVar8 != 0) {
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00);
            if (pvVar3 != (void *)0x0) {
              _DAT_7ffc3ebc2130 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
        }
        pvVar3 = _DAT_7ffc3ebc2130;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x3531);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar5 ^ 0x44846e0ed225725f);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
          uVar7 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            uVar2 = FUN_7ffc3e7d8be0(env,uVar7,uRam00007ffc3ebc09d0);
            if (_DAT_7ffc3ebc2138 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x54);
              lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebae2e5,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae2f4,0x7ffc3eba72ac,0,0);
              if (lVar8 != 0) {
                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00);
                if (pvVar3 != (void *)0x0) {
                  _DAT_7ffc3ebc2138 = (*(*env)->NewGlobalRef)(env,pvVar3);
                }
              }
            }
            pvVar3 = _DAT_7ffc3ebc2138;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc8a72533e5a927ff);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar5 ^ 0x9428e2b9009);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
              FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98d7ea. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                  return;
                }
                lVar8 = FUN_7ffc3eb76c30(env,2);
                if (lVar8 != 0) {
                  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x61);
                  if (lVar9 != 0) {
                    FUN_7ffc3e7dbbc0(env,receiver,lVar8,lVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98d650. Too many branches */
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
  return;
}

