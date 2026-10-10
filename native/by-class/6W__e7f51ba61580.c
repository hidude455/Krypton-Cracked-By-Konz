/* Native reconstruction for dev/krypton/6W.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6W_6_0 | RVA 0x1b2150 | dev/krypton/6W.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6W_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  ulonglong uVar9;
  void *pvVar10;
  void *arg1;
  undefined8 uVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar12;
  char *pcVar13;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x47);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x42);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb6);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e983c57:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e983c8b:
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x47);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb7), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e983d03;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  else {
    lVar7 = FUN_7ffc3eb76c30(env,2);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f), lVar8 == 0))
    goto LAB_7ffc3e983c57;
    FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e983c57;
    uVar9 = uVar5 ^ 0x349b6d7511ee;
    if (lVar6 != 0) {
LAB_7ffc3e9822b1:
      if (_DAT_7ffc3ebc2028 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x47);
        lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3ebabccf,0x7ffc3ebabd34,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2028 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc2028;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x1c5682d532784e94);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar10);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar6 == 0) {
        return;
      }
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x39119463db67);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 != (void *)0x0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar10);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar3);
            if (_DAT_7ffc3ebc2030 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x47);
              lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3ebabcd1,0x7ffc3eba626f,0,0);
              if ((lVar7 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc2030 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc2030;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c4d65be38f90060);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
            FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2038 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x47);
              lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba7233,0x7ffc3ebabd5b,0,0);
              if ((lVar7 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc2038 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc2038;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1c5f8172e84dedd3);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar10);
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x7e4ce9450c3b
                                              );
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar4 == (void *)0x0) goto LAB_7ffc3e983dd0;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (0 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar10);
              if (_DAT_7ffc3ebc2040 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x47);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3ebabcd1,0x7ffc3eba626f,0,0);
                if ((lVar6 != 0) &&
                   (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar10 != (void *)0x0)) {
                  _DAT_7ffc3ebc2040 = (*(*env)->NewGlobalRef)(env,pvVar10);
                }
              }
              pvVar10 = _DAT_7ffc3ebc2040;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
              (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c2fb1b1da1af0d2);
              (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9)
              ;
              (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
              FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9831ee. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(*env)->ExceptionCheck)(env);
              return;
            }
          }
        }
        goto LAB_7ffc3e983db2;
      }
      goto LAB_7ffc3e983dd0;
    }
    if (_DAT_7ffc3ebc1ff0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x47);
      lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebabccf,0x7ffc3eba71d3,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ff0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1ff0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e983c08:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) goto LAB_7ffc3e983d03;
      goto LAB_7ffc3e983c8b;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c2ba1e7c7edf585);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar10);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e983c08;
    if (_DAT_7ffc3ebc1ff8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x47);
      lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebabccf,0x7ffc3eba7203,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ff8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1ff8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e983c08;
    pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c40c453bb45f425);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e983c08;
    if (lVar6 != 0) {
      pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar6 == 0) {
        return;
      }
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x188e3da68d07);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar3 == (void *)0x0) {
LAB_7ffc3e983dd0:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar13 = &DAT_7ffc3eba6000;
        pvVar3 = pvRam00007ffc3ebc0a70;
      }
      else {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
          if (_DAT_7ffc3ebc2008 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x47);
            lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3ebabcd1,0x7ffc3eba626f,0,0);
            if ((lVar7 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc2008 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc2008;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c53f1ba97c68181);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x78f754cad6cd);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar3 == (void *)0x0) goto LAB_7ffc3e983dd0;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
            if (_DAT_7ffc3ebc2010 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x47);
              lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3ebabcd1,0x7ffc3ebabcd3,0,0);
              if ((lVar6 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc2010 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc2010;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c30200bb6c32a5a);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2018 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x47);
              lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba7311,0x7ffc3ebabd0c,0,0);
              if ((lVar6 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc2018 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc2018;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c5682d532784e94);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
            if (lVar6 == 0) {
              return;
            }
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,
                                              (uVar5 ^ 0x1cf0172aa63) & 0xffffffff);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar3 == (void *)0x0) goto LAB_7ffc3e983dd0;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
            }
            if (1 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,
                                                (uVar5 ^ 0x1cf0172aa63) >> 0x20);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
              }
              if (0 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
                if (_DAT_7ffc3ebc2020 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x47);
                  lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3ebabcd1,0x7ffc3eba626f,0,0);
                  if ((lVar6 != 0) &&
                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar4 != (void *)0x0)) {
                    _DAT_7ffc3ebc2020 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
                pvVar4 = _DAT_7ffc3ebc2020;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c31958cce0c4e63);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar9);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
                FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                goto LAB_7ffc3e9822b1;
              }
            }
          }
        }
LAB_7ffc3e983db2:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar13 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e983dfb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,pcVar13);
      return;
    }
    pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar6 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (pvVar3 == (void *)0x0) {
          pJVar12 = *env;
          pcVar13 = &DAT_7ffc3eba6000;
          pvVar3 = pvRam00007ffc3ebc0a70;
        }
        else {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
          }
          if (1 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar6 != 0) {
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                uVar5 ^ 0x12d7e5a1cf4c);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                }
                if (iVar2 < 1) goto LAB_7ffc3e983dfe;
                (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
                if (_DAT_7ffc3ebc2000 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x47);
                  lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3ebabcd1,0x7ffc3eba626f,0,0);
                  if ((lVar6 != 0) &&
                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar4 != (void *)0x0)) {
                    _DAT_7ffc3ebc2000 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
                pvVar4 = _DAT_7ffc3ebc2000;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c2328fadf442dba);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar9);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    return;
                  }
                }
              }
            }
            goto LAB_7ffc3e983cf7;
          }
LAB_7ffc3e983dfe:
          pJVar12 = *env;
          pcVar13 = (char *)0x7ffc3eba6019;
          pvVar3 = pvRam00007ffc3ebc0a98;
        }
        (*pJVar12->ThrowNew)(env,pvVar3,pcVar13);
      }
    }
  }
LAB_7ffc3e983cf7:
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e983d03:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x47);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb7), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e983daf. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_6W_1_1 | RVA 0x1b3e40 | dev/krypton/6W.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6W_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  void *arg1;
  undefined8 uVar9;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar10;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x47);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x42);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb6);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1fb0 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x47);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3ebabccf
                             ,0x7ffc3eba71d3,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc1fb0 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc1fb0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar10 = uVar5 ^ 0x2efe9d59c52d;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8e8bb8237c12146);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e984df9;
    if (lVar6 != 0) {
LAB_7ffc3e984376:
      if (_DAT_7ffc3ebc1fc8 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x47);
        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3ebabccf,0x7ffc3eba7469,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1fc8 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1fc8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8f7fede692f7a9a);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1fd0 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x47);
        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3ebabccf,0x7ffc3eba7499,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1fd0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1fd0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8ee1f716845846f);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1fd8 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x47);
        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3ebabcd1,0x7ffc3eba72ac,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1fd8 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1fd8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc881fe6c5e757d3d);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1fe0 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x47);
        lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba7233,0x7ffc3ebabd5b,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1fe0 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1fe0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc89c9b1718613910);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar6 == 0) {
        return;
      }
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0xf955d6bdbe5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 != (void *)0x0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
          if (_DAT_7ffc3ebc1fe8 == (void *)0x0) {
            uVar9 = FUN_7ffc3eb76c30(env,0x47);
            lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3ebabcd1,0x7ffc3eba626f,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc1fe8 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc1fe8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc884a227af137a2f);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e984beb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
        goto LAB_7ffc3e984fbb;
      }
LAB_7ffc3e984f85:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e984fbb:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e984fce. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (_DAT_7ffc3ebc1fb8 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x47);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebabccf,0x7ffc3eba7203,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1fb8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1fb8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc883de364b6920e6);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (lVar6 == 0) {
          return;
        }
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
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1fc0 == (void *)0x0) {
            uVar9 = FUN_7ffc3eb76c30(env,0x47);
            lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebabcc0,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3ebabccf,0x7ffc3eba71d3,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc1fc0 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc1fc0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8e8bb8237c12146);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          goto LAB_7ffc3e984376;
        }
        goto LAB_7ffc3e984f85;
      }
    }
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) goto LAB_7ffc3e984ed6;
  }
  else {
LAB_7ffc3e984df9:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) {
      return;
    }
  }
  (*(*env)->ExceptionClear)(env);
  lVar6 = FUN_7ffc3eb76c30(env,0x47);
  if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb7), lVar7 != 0)) {
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3e984ed6;
    }
    (*(*env)->Throw)(env,pvVar3);
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e984ed6:
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x47);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb7), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e984f82. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

