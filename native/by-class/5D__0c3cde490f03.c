/* Native reconstruction for dev/krypton/5D.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5D_1_0 | RVA 0x16e810 | dev/krypton/5D.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5D_1_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined4 uVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x82);
  if (pvVar3 != (void *)0x0) {
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xc6);
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93f056. Too many branches */
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
              if (_DAT_7ffc3ebc1360 == (void *)0x0) {
                uVar9 = FUN_7ffc3eb76c30(env,0x82);
                lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb29b7,0x7ffc3eba6299,0x7ffc3eba606c,
                                         0x7ffc3eba74db,0x7ffc3eba647c,0,0);
                if (lVar6 != 0) {
                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                  if (pvVar3 != (void *)0x0) {
                    _DAT_7ffc3ebc1360 = (*(*env)->NewGlobalRef)(env,pvVar3);
                  }
                }
              }
              pvVar3 = _DAT_7ffc3ebc1360;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                  0x85c);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar5 ^ 0x7ed0a2f0cd3e8ac4);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                uVar9 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  uVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
                  if (_DAT_7ffc3ebc1368 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x82);
                    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb29b7,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae3e3,0x7ffc3eba7293,0,0);
                    if (lVar6 != 0) {
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                      if (pvVar3 != (void *)0x0) {
                        _DAT_7ffc3ebc1368 = (*(*env)->NewGlobalRef)(env,pvVar3);
                      }
                    }
                  }
                  pvVar3 = _DAT_7ffc3ebc1368;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                      uVar2);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8b91d814509b950);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar5 ^ 0x460972dcfb4f);
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                    FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc1370 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x82);
                        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb29b7,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba647c,0,0);
                        if (lVar6 != 0) {
                          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                          if (pvVar3 != (void *)0x0) {
                            _DAT_7ffc3ebc1370 = (*(*env)->NewGlobalRef)(env,pvVar3);
                          }
                        }
                      }
                      pvVar3 = _DAT_7ffc3ebc1370;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                          uRam00007ffc3ebc0998,0x85c);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar5 ^ 0x7ed0a2f0cd3e8ac4);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                        uVar9 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          uVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc1378 == (void *)0x0) {
                            uVar9 = FUN_7ffc3eb76c30(env,0x82);
                            lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb29b7,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3ebae3e3,0x7ffc3eba7293,0,
                                                     0);
                            if (lVar6 != 0) {
                              pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00);
                              if (pvVar3 != (void *)0x0) {
                                _DAT_7ffc3ebc1378 = (*(*env)->NewGlobalRef)(env,pvVar3);
                              }
                            }
                          }
                          pvVar3 = _DAT_7ffc3ebc1378;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar4 = (*(*env)->NewObjectArray)
                                               (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                              uRam00007ffc3ebc0998,uVar2);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0xc8a7387cef92a265);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              uVar5 ^ 0x460972dcfb4f);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93ed65. Too many branches */
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

