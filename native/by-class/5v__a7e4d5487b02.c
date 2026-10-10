/* Native reconstruction for dev/krypton/5v.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5v_6_0 | RVA 0x1b4fe0 | dev/krypton/5v.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5v_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  void *pvVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar12;
  ulonglong uVar13;
  char *pcVar14;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x96);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xd6);
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
  lVar7 = FUN_7ffc3eb76c30(env,0x1f);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5e);
  if (lVar8 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e9868fc:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e986a1e:
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x96);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1ef), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar5 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e986a96;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
  else {
    lVar7 = FUN_7ffc3eb76c30(env,2);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f), lVar8 == 0))
    goto LAB_7ffc3e9868fc;
    FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9868fc;
    uVar13 = uVar6 ^ 0x14f9ea038c5f;
    if (iVar3 == 0) {
LAB_7ffc3e9860f5:
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
      if (lVar7 == 0) {
        return;
      }
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
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
        if (1 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
          lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
          if (lVar7 == 0) {
            return;
          }
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x32b562d752fd);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (0 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
            if (_DAT_7ffc3ebc1c30 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x96);
              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3ebabc75,0x7ffc3eba626f,0,0);
              if ((lVar7 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc1c30 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc1c30;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c7656dbb8f612d5);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
            FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e986376. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
LAB_7ffc3e986935:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar14 = (char *)0x7ffc3eba6019;
        pvVar4 = pvRam00007ffc3ebc0a98;
        goto LAB_7ffc3e986985;
      }
LAB_7ffc3e98696d:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar14 = &DAT_7ffc3eba6000;
      pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e986985:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e986998. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar4,pcVar14);
      return;
    }
    if (_DAT_7ffc3ebc1be0 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x96);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebb3b27,0x7ffc3eba71d3,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1be0 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1be0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e9869ee:
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
      if (bVar1 == 0) goto LAB_7ffc3e986a96;
      goto LAB_7ffc3e986a1e;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c541f42559e3280);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9869ee;
    if (_DAT_7ffc3ebc1be8 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x96);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebb3b27,0x7ffc3eba7203,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1be8 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1be8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9869ee;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c744336b0ac3eb5);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    lVar7 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9869ee;
    if (lVar7 != 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar7 == 0) {
        return;
      }
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x38407d8562b5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e98696d;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (iVar3 < 1) goto LAB_7ffc3e986935;
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
      if (_DAT_7ffc3ebc1bf8 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x96);
        lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3ebabc75,0x7ffc3eba626f,0,0);
        if ((lVar7 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1bf8 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc1bf8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c5c9b8acad77dca);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
      FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar7 != 0)) {
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x3e43260950eb);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar4 == (void *)0x0) {
            pJVar12 = *env;
            pcVar14 = &DAT_7ffc3eba6000;
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
              if (_DAT_7ffc3ebc1c00 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,0x96);
                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3ebabc75,0x7ffc3eba6245,0,0);
                if ((lVar7 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc1c00 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc1c00;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c4487181cf20f40);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
                  if (cVar2 != '\0') {
                    return;
                  }
                  if (_DAT_7ffc3ebc1c08 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x96);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3ebb3b27,0x7ffc3eba71d3,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar4 != (void *)0x0)) {
                      _DAT_7ffc3ebc1c08 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc1c08;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c541f42559e3280);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc1c10 == (void *)0x0) {
                        uVar10 = FUN_7ffc3eb76c30(env,0x96);
                        lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3ebb3b27,0x7ffc3eba7203,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar5 != (void *)0x0)) {
                          _DAT_7ffc3ebc1c10 = (*(*env)->NewGlobalRef)(env,pvVar5);
                        }
                      }
                      pvVar5 = _DAT_7ffc3ebc1c10;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c744336b0ac3eb5);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar13);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc1c18 == (void *)0x0) {
                            uVar10 = FUN_7ffc3eb76c30(env,0x96);
                            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba6299,
                                                     0x7ffc3eba606c,0x7ffc3eba606a,0x7ffc3eba629d,0,
                                                     0);
                            if ((lVar7 != 0) &&
                               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                               pvVar5 != (void *)0x0)) {
                              _DAT_7ffc3ebc1c18 = (*(*env)->NewGlobalRef)(env,pvVar5);
                            }
                          }
                          pvVar5 = _DAT_7ffc3ebc1c18;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar9 = (*(*env)->NewObjectArray)
                                               (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                               uRam00007ffc3ebc0998,0x64b2);
                            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               uVar6 ^ 0x194cbd1ed583ca73);
                            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
                            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9
                                                             );
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc1c20 == (void *)0x0) {
                                uVar10 = FUN_7ffc3eb76c30(env,0x96);
                                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,
                                                         0x7ffc3eba606c,0x7ffc3eba7fc0,
                                                         0x7ffc3eba7235,0,0);
                                if ((lVar7 != 0) &&
                                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00
                                                                     ), pvVar9 != (void *)0x0)) {
                                  _DAT_7ffc3ebc1c20 = (*(*env)->NewGlobalRef)(env,pvVar9);
                                }
                              }
                              pvVar9 = _DAT_7ffc3ebc1c20;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar11 = (*(*env)->NewObjectArray)
                                                    (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
                                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0x1c77675edff45a6b);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,uVar13);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
                                pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,
                                                                  pvVar11);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc1c28 == (void *)0x0) {
                                    uVar10 = FUN_7ffc3eb76c30(env,0x96);
                                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,
                                                             0x7ffc3eba718e,0x7ffc3eba606c,
                                                             0x7ffc3ebabc75,0x7ffc3eba7266,0,0);
                                    if ((lVar7 != 0) &&
                                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar9 != (void *)0x0)) {
                                      _DAT_7ffc3ebc1c28 = (*(*env)->NewGlobalRef)(env,pvVar9);
                                    }
                                  }
                                  pvVar9 = _DAT_7ffc3ebc1c28;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar11 = (*(*env)->NewObjectArray)
                                                        (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar4);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                                      uRam00007ffc3ebc0990,1);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x1c467b0e2ef487db);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar13);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,4,pvVar4);
                                    FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar11);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) goto LAB_7ffc3e9860f5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  goto LAB_7ffc3e986a8a;
                }
              }
              goto LAB_7ffc3e9869ee;
            }
            pJVar12 = *env;
            pcVar14 = (char *)0x7ffc3eba6019;
            pvVar4 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar12->ThrowNew)(env,pvVar4,pcVar14);
        }
      }
      goto LAB_7ffc3e9869ee;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar7 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (pvVar4 == (void *)0x0) {
          pJVar12 = *env;
          pcVar14 = &DAT_7ffc3eba6000;
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
          if (1 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
            lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar7 != 0) {
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                uVar6 ^ 0x32b562d752fd);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (iVar3 < 1) goto LAB_7ffc3e986953;
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
                if (_DAT_7ffc3ebc1bf0 == (void *)0x0) {
                  uVar10 = FUN_7ffc3eb76c30(env,0x96);
                  lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3ebabc75,0x7ffc3eba626f,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc1bf0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc1bf0;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c7656dbb8f612d5);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    return;
                  }
                }
              }
            }
            goto LAB_7ffc3e986a8a;
          }
LAB_7ffc3e986953:
          pJVar12 = *env;
          pcVar14 = (char *)0x7ffc3eba6019;
          pvVar4 = pvRam00007ffc3ebc0a98;
        }
        (*pJVar12->ThrowNew)(env,pvVar4,pcVar14);
      }
    }
  }
LAB_7ffc3e986a8a:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e986a96:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x96);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1ef), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e986b42. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_5v_1_1 | RVA 0x1b6b50 | dev/krypton/5v.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5v_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  longlong lVar9;
  undefined8 uVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x96);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xd6);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x1f);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xfc);
  if (lVar7 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e9876e4:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) {
      return;
    }
  }
  else {
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x61), lVar7 == 0))
    goto LAB_7ffc3e9876e4;
    FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9876e4;
    if (iVar2 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1bc0 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x96);
      lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebb3b27,0x7ffc3eba71d3,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1bc0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1bc0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      uVar11 = uVar5 ^ 0xe9c1a2f589c;
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8970527a5b2e643);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1bc8 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x96);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3ebb3b27,0x7ffc3eba7203,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1bc8 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1bc8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b759534080ea76);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar6 == 0) {
              return;
            }
            pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar6 == 0) {
              return;
            }
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x1560f6e4e8cf)
            ;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar3 == (void *)0x0) {
LAB_7ffc3e98785d:
              UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
              arg2 = &DAT_7ffc3eba6000;
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
                lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
                if (lVar7 == 0) {
                  return;
                }
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
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
                  if (_DAT_7ffc3ebc1bd0 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x96);
                    lVar9 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba7fc0,0x7ffc3eba743f,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar4 != (void *)0x0)) {
                      _DAT_7ffc3ebc1bd0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc1bd0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xc88f4cc7f83227c4);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar11);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,1);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar3 == (void *)0x0) goto LAB_7ffc3e98785d;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                  }
                  if (2 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                      uVar5 ^ 0x7f51aa7fc0e2);
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
                    if (1 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
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
                        if (_DAT_7ffc3ebc1bd8 == (void *)0x0) {
                          uVar10 = FUN_7ffc3eb76c30(env,0x96);
                          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb3b18,0x7ffc3eba718e,
                                                   0x7ffc3eba606c,0x7ffc3eba7fc0,0x7ffc3eba743f,0,0)
                          ;
                          if ((lVar6 != 0) &&
                             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                             pvVar4 != (void *)0x0)) {
                            _DAT_7ffc3ebc1bd8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                          }
                        }
                        pvVar4 = _DAT_7ffc3ebc1bd8;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0xc89bf2e1b9ee6f21);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar11);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9875e1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                        (*(*env)->ExceptionCheck)(env);
                        return;
                      }
                    }
                  }
                }
              }
              UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
              arg2 = (char *)0x7ffc3eba6019;
              pvVar3 = pvRam00007ffc3ebc0a98;
            }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e987888. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
            return;
          }
        }
      }
    }
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
    if (bVar1 == 0) goto LAB_7ffc3e987790;
  }
  (*(*env)->ExceptionClear)(env);
  lVar6 = FUN_7ffc3eb76c30(env,0x96);
  if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x1ef), lVar7 != 0)) {
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3e987790;
    }
    (*(*env)->Throw)(env,pvVar3);
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e987790:
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x96);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x1ef), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e98783c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

