/* Native reconstruction for dev/krypton/5A.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5A_6_0 | RVA 0x16d110 | dev/krypton/5A.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5A_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x55);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,100);
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
  if (receiver != (void *)0x0) {
    lVar7 = FUN_7ffc3eb76c30(env,2);
    if (lVar7 == 0) {
      return;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
    if (lVar8 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1328 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x55);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2f7,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba82f1,0x7ffc3eba7f73,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1328 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1328;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    uVar11 = uVar6 ^ 0x7a4937a69774;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c49c81eedf10c19);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1330 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x55);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2f7,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6478,0x7ffc3eba743f,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1330 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1330;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c418df7a2228723);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1338 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x55);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2f7,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba82ab,0x7ffc3eba647c,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1338 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1338;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x3b34);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar6 ^ 0x17ea4a79e81b56d0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    uVar2 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
    if (_DAT_7ffc3ebc1340 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x55);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2f7,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebae306,0x7ffc3eba72ac,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1340 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1340;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c73095a04290380);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar7 == 0) {
      return;
    }
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x113b2523c86d);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar4 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (0 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
        if (_DAT_7ffc3ebc1348 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x55);
          lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae2f7,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba6478,0x7ffc3eba626f,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1348 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1348;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c766f4d631d3021);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93dac7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e93dbb1;
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e93dbb1:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93dbc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_5A_1_1 | RVA 0x16dbd0 | dev/krypton/5A.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5A_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x55);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,100);
    if (pvVar3 != (void *)0x0) {
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar4 = *(ulonglong *)
                 (*(longlong *)((ulonglong)pvVar2 & 0xfffffffffffffffc) +
                 (longlong)*(int *)((longlong)pvVar3 + 0x10));
      }
      else {
        uVar4 = (*(*env)->GetStaticLongField)(env,pvVar2,pvVar3);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93e04a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar5 = FUN_7ffc3eb76c30(env,2);
        if (lVar5 != 0) {
          lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61);
          if (lVar6 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1318 == (void *)0x0) {
                uVar8 = FUN_7ffc3eb76c30(env,0x55);
                lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2f7,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba82f1,0x7ffc3eba7f73,0,0);
                if (lVar5 != 0) {
                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                  if (pvVar2 != (void *)0x0) {
                    _DAT_7ffc3ebc1318 = (*(*env)->NewGlobalRef)(env,pvVar2);
                  }
                }
              }
              pvVar2 = _DAT_7ffc3ebc1318;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc88ad27b1dddd8da);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar4 ^ 0x602cc78a43b7);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar7);
                pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc1320 == (void *)0x0) {
                    uVar8 = FUN_7ffc3eb76c30(env,0x55);
                    lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebae2f7,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba6478,0x7ffc3eba743f,0,0);
                    if (lVar5 != 0) {
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                      if (pvVar3 != (void *)0x0) {
                        _DAT_7ffc3ebc1320 = (*(*env)->NewGlobalRef)(env,pvVar3);
                      }
                    }
                  }
                  pvVar3 = _DAT_7ffc3ebc1320;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar2);
                    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8829792520e53e0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar2);
                    pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar4 ^ 0x602cc78a43b7);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar2);
                    FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93dead. Too many branches */
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

