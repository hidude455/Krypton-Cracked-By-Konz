/* Native reconstruction for dev/krypton/5r.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5r_6_0 | RVA 0x1ab190 | dev/krypton/5r.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5r_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  void *arg1;
  undefined8 uVar10;
  JNINativeInterface_ *pJVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar12;
  char *pcVar13;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x6c);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x82);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xa6);
  if (lVar7 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar12 = uVar5 ^ 0x1b06ad4e342a;
  if (iVar2 != 0) {
LAB_7ffc3e97b291:
    pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
    if (lVar6 == 0) {
      return;
    }
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3e97cb98:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar13 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3e97cd81;
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
      lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar6 == 0) {
        return;
      }
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x3d4a259aea88);
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
        if (_DAT_7ffc3ebc1a60 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x6c);
          lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae31a,0x7ffc3eba626f,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1a60 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1a60;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c72d9d29d5efe77);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
LAB_7ffc3e97ba95:
        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
LAB_7ffc3e97ba9a:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97bab0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
    }
LAB_7ffc3e97cd65:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e97cd81:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97cd94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar3,pcVar13);
    return;
  }
  if (_DAT_7ffc3ebc1a40 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x6c);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebae317
                             ,0x7ffc3eba71d3,0,0);
    if ((lVar6 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc1a40 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc1a40;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c5f6f7f40c2c9ec);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97c70d;
    if (_DAT_7ffc3ebc1a48 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x6c);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae317,0x7ffc3eba7203,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1a48 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1a48;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97c70d;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c736f46bde039b8);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97c70d;
    if (lVar6 == 0) goto LAB_7ffc3e97b291;
    if (_DAT_7ffc3ebc1a50 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x6c);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1a50 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1a50;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c5f6f7f40c2c9ec);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1a58 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x6c);
          lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebab583,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1a58 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1a58;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c4146b9826fdb9f);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar6 == 0) goto LAB_7ffc3e97b291;
            if (_DAT_7ffc3ebc1a68 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x6c);
              lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae317,0x7ffc3eba7192,0,0);
              if ((lVar6 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc1a68 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc1a68;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c59e78b86f5e7c4);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
              pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e97ca45;
              pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)
                 ) {
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                  uVar5 ^ 0x4365630c081d);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e97caae;
                if (pvVar4 == (void *)0x0) {
                  pJVar11 = *env;
                  pcVar13 = &DAT_7ffc3eba6000;
                  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e97caa8:
                  (*pJVar11->ThrowNew)(env,pvVar3,pcVar13);
                  goto LAB_7ffc3e97caae;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (iVar2 < 1) {
                  pJVar11 = *env;
                  pcVar13 = (char *)0x7ffc3eba6019;
                  pvVar3 = pvRam00007ffc3ebc0a98;
                  goto LAB_7ffc3e97caa8;
                }
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                if (_DAT_7ffc3ebc1a70 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x6c);
                  lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                           0x7ffc3ebae31a,0x7ffc3eba630c,0,0);
                  if ((lVar6 != 0) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc1a70 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                }
                pvVar8 = _DAT_7ffc3ebc1a70;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
                  (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c5e0707e2bd4e6e);
                  (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,arg1);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (_DAT_7ffc3ebc1a78 == (void *)0x0) {
                      uVar9 = FUN_7ffc3eb76c30(env,0x6c);
                      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebab4ac,0x7ffc3eba64fe,0,0);
                      if ((lVar6 != 0) &&
                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                         pvVar4 != (void *)0x0)) {
                        _DAT_7ffc3ebc1a78 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                    pvVar4 = _DAT_7ffc3ebc1a78;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c4ce16d6c624e30);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar12);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                      uVar9 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        uVar9 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
                        if (_DAT_7ffc3ebc1a80 == (void *)0x0) {
                          uVar10 = FUN_7ffc3eb76c30(env,0x6c);
                          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebaf840,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebaec67,0x7ffc3eba80d2,0,0)
                          ;
                          if ((lVar6 != 0) &&
                             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                             pvVar3 != (void *)0x0)) {
                            _DAT_7ffc3ebc1a80 = (*(*env)->NewGlobalRef)(env,pvVar3);
                          }
                        }
                        pvVar3 = _DAT_7ffc3ebc1a80;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar4 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar9);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x1c4b4709b79b9d2e)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
                          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar12);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar8);
                          FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar3 = (*(*env)->NewObjectArray)
                                               (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                            if (lVar6 == 0) {
                              return;
                            }
                            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                              uVar5 ^ 0x4f4d8a6d87a4);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (pvVar3 != (void *)0x0) {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                              }
                              if (iVar2 < 1) goto LAB_7ffc3e97cd65;
                              (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
                              if (_DAT_7ffc3ebc1a90 == (void *)0x0) {
                                uVar9 = FUN_7ffc3eb76c30(env,0x6c);
                                lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,
                                                         0x7ffc3eba606c,0x7ffc3ebae31a,
                                                         0x7ffc3eba626f,0,0);
                                if ((lVar6 != 0) &&
                                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00
                                                                     ), pvVar4 != (void *)0x0)) {
                                  _DAT_7ffc3ebc1a90 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                }
                              }
                              pvVar4 = _DAT_7ffc3ebc1a90;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return;
                              }
                              pvVar8 = (*(*env)->NewObjectArray)
                                                 (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0x1c597162cec667a9);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar12);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                              FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return;
                              }
                              if (receiver != (void *)0x0) {
                                lVar6 = FUN_7ffc3eb76c30(env,2);
                                if (lVar6 == 0) {
                                  return;
                                }
                                lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x5f);
                                if (lVar7 == 0) {
                                  return;
                                }
                                FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
                                goto LAB_7ffc3e97ba9a;
                              }
                            }
                            goto LAB_7ffc3e97cb98;
                          }
                          goto LAB_7ffc3e97ca0b;
                        }
                      }
                    }
                    goto LAB_7ffc3e97caae;
                  }
                }
LAB_7ffc3e97ca0b:
                pvVar3 = (*(*env)->ExceptionOccurred)(env);
                pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
              }
              else {
LAB_7ffc3e97caae:
                pvVar3 = (*(*env)->ExceptionOccurred)(env);
                pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
              }
            }
            else {
LAB_7ffc3e97ca45:
              pvVar3 = (*(*env)->ExceptionOccurred)(env);
              pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
            }
            if (bVar1 == 0) {
              return;
            }
            (*(*env)->ExceptionClear)(env);
            pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
            if (lVar6 == 0) {
              return;
            }
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar3 == (void *)0x0) goto LAB_7ffc3e97cb98;
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
              if (lVar6 == 0) {
                return;
              }
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                uVar5 ^ 0x3d4a259aea88);
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
                if (_DAT_7ffc3ebc1a88 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x6c);
                  lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                           0x7ffc3ebae31a,0x7ffc3eba626f,0,0);
                  if ((lVar6 != 0) &&
                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar4 != (void *)0x0)) {
                    _DAT_7ffc3ebc1a88 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
                pvVar4 = _DAT_7ffc3ebc1a88;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c72d9d29d5efe77);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar12);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                goto LAB_7ffc3e97ba95;
              }
            }
            goto LAB_7ffc3e97cd65;
          }
        }
      }
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 != 0) goto LAB_7ffc3e97c8b7;
  }
  else {
LAB_7ffc3e97c70d:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) {
        return;
      }
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x6c);
      if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x11f), lVar7 == 0)) {
LAB_7ffc3e97c9d2:
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          (*(*env)->Throw)(env,pvVar3);
          goto LAB_7ffc3e97c9d2;
        }
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) {
        return;
      }
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x6c);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x11f), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e97c7ef;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
  }
LAB_7ffc3e97c7ef:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 == 0) {
    return;
  }
  (*(*env)->ExceptionClear)(env);
  lVar6 = FUN_7ffc3eb76c30(env,0x6c);
  if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x11f), lVar7 == 0)) {
LAB_7ffc3e97c883:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
  }
  else {
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      (*(*env)->Throw)(env,pvVar3);
      goto LAB_7ffc3e97c883;
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
  }
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 == 0) {
    return;
  }
LAB_7ffc3e97c8b7:
  (*(*env)->ExceptionClear)(env);
  lVar6 = FUN_7ffc3eb76c30(env,0x6c);
  if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x11f), lVar7 != 0)) {
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97c93b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->Throw)(env,pvVar3);
      return;
    }
  }
  return;
}

/* JNI_dev_krypton_5r_1_1 | RVA 0x1ace60 | dev/krypton/5r.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5r_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x6c);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0x82);
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
        if (_DAT_7ffc3ebc1a28 == (void *)0x0) {
          uVar7 = FUN_7ffc3eb76c30(env,0x6c);
          lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebab55d,0,0);
          if (lVar5 != 0) {
            pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
            if (pvVar2 != (void *)0x0) {
              _DAT_7ffc3ebc1a28 = (*(*env)->NewGlobalRef)(env,pvVar2);
            }
          }
        }
        pvVar2 = _DAT_7ffc3ebc1a28;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar8 = uVar8 ^ 0x1635d62e0e9;
          pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b02f5601bb2d79);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
          pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc1a30 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x6c);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae31a,0x7ffc3eba743f,0,0);
              if (lVar5 != 0) {
                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                if (pvVar3 != (void *)0x0) {
                  _DAT_7ffc3ebc1a30 = (*(*env)->NewGlobalRef)(env,pvVar3);
                }
              }
            }
            pvVar3 = _DAT_7ffc3ebc1a30;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar2);
              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc88110e74808ca4c);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar2);
              pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar2);
              FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc1a38 == (void *)0x0) {
                  uVar7 = FUN_7ffc3eb76c30(env,0x6c);
                  lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebaf840,0x7ffc3eba606a,0x7ffc3eba606c,
                                           0x7ffc3ebaec67,0x7ffc3ebaf84f,0,0);
                  if (lVar5 != 0) {
                    pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                    if (pvVar2 != (void *)0x0) {
                      _DAT_7ffc3ebc1a38 = (*(*env)->NewGlobalRef)(env,pvVar2);
                    }
                  }
                }
                pvVar2 = _DAT_7ffc3ebc1a38;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar3 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,1,(void *)0x0);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xc88e1f8524a7df50);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar8);
                  (*(*env)->SetObjectArrayElement)(env,pvVar3,3,pvVar4);
                  FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97d489. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      return;
                    }
                    lVar5 = FUN_7ffc3eb76c30(env,2);
                    if (lVar5 != 0) {
                      lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61);
                      if (lVar6 != 0) {
                        FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97d248. Too many branches */
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

