/* Native reconstruction for dev/krypton/6E.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6E_1_0 | RVA 0x19d580 | dev/krypton/6E.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6E_1_0(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x45);
  if (pvVar4 != (void *)0x0) {
    pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x40);
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96ddd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar7 = FUN_7ffc3eb76c30(env,2);
        if (lVar7 != 0) {
          lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x61);
          if (lVar8 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1df8 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,0x45);
                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebabc51,0x7ffc3eba6299,0x7ffc3eba606c,
                                         0x7ffc3eba72e6,0x7ffc3eba647c,0,0);
                if (lVar7 != 0) {
                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                  if (pvVar4 != (void *)0x0) {
                    _DAT_7ffc3ebc1df8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
              }
              pvVar4 = _DAT_7ffc3ebc1df8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                  0x76a1);
                (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar6 ^ 0x3646377370110ebf);
                (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  uVar2 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                  if (_DAT_7ffc3ebc1e00 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x45);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebabc51,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebabc60,0x7ffc3eba72ac,0,0);
                    if (lVar7 != 0) {
                      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                      if (pvVar4 != (void *)0x0) {
                        _DAT_7ffc3ebc1e00 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc1e00;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                      uVar2);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8a10b9f7d28503d);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar6 ^ 0x1d06f67f29e6);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
                    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc1e08 == (void *)0x0) {
                        uVar10 = FUN_7ffc3eb76c30(env,0x45);
                        lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebabc51,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3eba72e6,0x7ffc3eba647c,0,0);
                        if (lVar7 != 0) {
                          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                          if (pvVar4 != (void *)0x0) {
                            _DAT_7ffc3ebc1e08 = (*(*env)->NewGlobalRef)(env,pvVar4);
                          }
                        }
                      }
                      pvVar4 = _DAT_7ffc3ebc1e08;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                          uRam00007ffc3ebc0998,0x2775);
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
                        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar6 ^ 0x7217109fd8785f69);
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                        uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          uVar3 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc1e10 == (void *)0x0) {
                            uVar10 = FUN_7ffc3eb76c30(env,0x45);
                            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebabc51,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3ebabc60,0x7ffc3eba7293,0,
                                                     0);
                            if (lVar7 != 0) {
                              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                              if (pvVar4 != (void *)0x0) {
                                _DAT_7ffc3ebc1e10 = (*(*env)->NewGlobalRef)(env,pvVar4);
                              }
                            }
                          }
                          pvVar4 = _DAT_7ffc3ebc1e10;
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
                                                              0xc8a05a854e924e31);
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              uVar6 ^ 0x1d06f67f29e6);
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
                            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96dae3. Too many branches */
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
  return;
}

