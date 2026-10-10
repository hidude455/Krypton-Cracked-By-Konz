/* Native reconstruction for dev/krypton/59.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_59_6_0 | RVA 0x169820 | dev/krypton/59.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_59_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  void *pvVar10;
  void *pvVar11;
  undefined8 uVar12;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  ulonglong uVar13;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x3f);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x38);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar7 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar6 + 0x10));
  }
  else {
    uVar7 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar6);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
LAB_7ffc3e93bb55:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e93bdbd:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93bdd3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2);
    return;
  }
  lVar8 = FUN_7ffc3eb76c30(env,2);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x5f);
  if (lVar9 == 0) {
    return;
  }
  FUN_7ffc3e7dbbc0(env,receiver,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1280 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebaac02,0x7ffc3ebab4ef,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1280 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1280;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar13 = uVar7 ^ 0x605ae7f761b7;
  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x1c70e50a26b8de3a);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1288 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebab51a,0x7ffc3ebab51c,0,0);
    if ((lVar8 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1288 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1288;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7dd5e8453e7e28
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1290 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebab55a,0x7ffc3ebab55d,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1290 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1290;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x1c70b616c78500a2);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1298 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba7233,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1298 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1298;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7b94fd4fc8a565
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa4);
  if (lVar9 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc12a0 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebab55a,0x7ffc3eba7f9a,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc12a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc12a0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x1c737c9bebdfd16a);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc12a8 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba7233,0x7ffc3eba743f,0,0);
    if ((lVar8 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc12a8 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc12a8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7fbc670dd167f3
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc12b0 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x3f);
    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebab55a,0x7ffc3eba71d3,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc12b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc12b0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c4a51e2c892c86e);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e93bb72;
    if (iVar3 != 0) {
      if (_DAT_7ffc3ebc12b8 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x3f);
        lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebab55a,0x7ffc3eba7203,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc12b8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc12b8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c79875b191f6fd3);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        lVar8 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar8 == 0) {
            return;
          }
          if (_DAT_7ffc3ebc12c0 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x3f);
            lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebab55a,0x7ffc3eba71d3,0,0);
            if ((lVar8 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc12c0 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc12c0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1c4a51e2c892c86e);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) goto LAB_7ffc3e93a216;
          }
          goto LAB_7ffc3e93bce3;
        }
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
      if (bVar1 != 0) goto LAB_7ffc3e93bbd7;
      goto LAB_7ffc3e93bc4f;
    }
LAB_7ffc3e93a216:
    if (_DAT_7ffc3ebc12c8 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x3f);
      lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebab55a,0x7ffc3ebab583,0,0);
      if ((lVar8 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc12c8 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc12c8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7e85f632acdc7b);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
      lVar8 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (lVar8 == 0) {
          return;
        }
        if (_DAT_7ffc3ebc12d0 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x3f);
          lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab55a,0x7ffc3eba71d3,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc12d0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc12d0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c4a51e2c892c86e);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc12d8 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x3f);
          lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab55a,0x7ffc3ebab583,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc12d8 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc12d8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7e85f632acdc7b);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc12e0 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x3f);
          lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7233,0x7ffc3ebab5b3,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc12e0 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc12e0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7d21fa13510318);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc12e8 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x3f);
          lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebab51a,0x7ffc3ebab5e4,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc12e8 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc12e8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c4935819ad3877a);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
        FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar5 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar8 == 0) {
          return;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar7 ^ 0x553870c53921);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar5 != (void *)0x0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar4 < 1) {
LAB_7ffc3e93bb34:
            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
            arg2 = (char *)0x7ffc3eba6019;
            pvVar5 = pvRam00007ffc3ebc0a98;
          }
          else {
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar6);
            if (_DAT_7ffc3ebc12f0 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x3f);
              lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaac02,0x7ffc3eba7f73,0,0);
              if ((lVar8 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc12f0 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc12f0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c65df9cd4fa06ab);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc12f8 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x3f);
              lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba7233,0x7ffc3eba61d9,0,0);
              if ((lVar8 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc12f8 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc12f8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c7404d44c7873f4);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            while( true ) {
              if (_DAT_7ffc3ebc1300 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x3f);
                lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba7233,0x7ffc3eba6204,0,0);
                if ((lVar8 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc1300 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc1300;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c75542fa5a7c1f9);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar13);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
              uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              cVar2 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
              if (cVar2 == '\0') {
                return;
              }
              if (_DAT_7ffc3ebc1308 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x3f);
                lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba7233,0x7ffc3eba621c,0,0);
                if ((lVar8 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc1308 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc1308;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c656409db6ffa15);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar13);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
              pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x41);
              if (pvVar10 == (void *)0x0) {
                return;
              }
              if ((pvVar6 != (void *)0x0) &&
                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar10), bVar1 == 0)) break;
              pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
              if (lVar8 == 0) {
                return;
              }
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,
                                                 uVar7 ^ 0x1d320f6ec271);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (pvVar10 == (void *)0x0) goto LAB_7ffc3e93bb55;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
              }
              if (iVar4 < 2) goto LAB_7ffc3e93bb34;
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
              }
              if (iVar4 < 1) goto LAB_7ffc3e93bb34;
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
              if (_DAT_7ffc3ebc1310 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x3f);
                lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba7233,0x7ffc3eba626f,0,0);
                if ((lVar8 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc1310 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc1310;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c7cd356f013ce53);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar13);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar10);
              FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (iVar3 == 0) {
                return;
              }
              if (bVar1 != 0) {
                return;
              }
            }
            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
            arg2 = (char *)0x7ffc3eba6033;
            pvVar5 = pvRam00007ffc3ebc0a58;
          }
          goto LAB_7ffc3e93bdbd;
        }
        goto LAB_7ffc3e93bb55;
      }
    }
  }
  else {
LAB_7ffc3e93bb72:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e93bbd7:
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x3f);
    if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa5), lVar9 == 0)) {
LAB_7ffc3e93bc43:
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar5);
        goto LAB_7ffc3e93bc43;
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e93bc4f:
    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x3f);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa5), lVar9 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar5 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e93bcec;
      }
      (*(*env)->Throw)(env,pvVar5);
    }
  }
LAB_7ffc3e93bce3:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e93bcec:
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x3f);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa5), lVar9 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93bd9e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar5);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_59_1_1 | RVA 0x16bdf0 | dev/krypton/59.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_59_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  longlong lVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x3f);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x38);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar10 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar10 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1238 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x3f);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebab55a
                             ,0x7ffc3ebab55d,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1238 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1238;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar10 = uVar10 ^ 0x7a3f17dbb574;
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8b3ac7337a9d461
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1240 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x3f);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3eba7233
                             ,0x7ffc3eba743f,0,0);
    if ((lVar7 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1240 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1240;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8b88e98bfe471a6
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xa6);
  if (lVar8 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1248 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x3f);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebab55a
                             ,0x7ffc3eba7f9a,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1248 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1248;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8b066fe1bf305a9
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1250 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x3f);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3eba7233
                             ,0x7ffc3eba743f,0,0);
    if ((lVar7 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1250 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1250;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc8bca602fdfdb330
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (iVar3 != 0) {
LAB_7ffc3e93c2ae:
    if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93ce16. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      return;
    }
    lVar7 = FUN_7ffc3eb76c30(env,2);
    if (lVar7 == 0) {
      return;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x61);
    if (lVar8 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93c311. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(*env)->ExceptionCheck)(env);
    return;
  }
  if (_DAT_7ffc3ebc1258 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x3f);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebab55a
                             ,0x7ffc3ebab616,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1258 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1258;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8becf8db512aaeb);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
    lVar7 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e93ce52;
    if (lVar7 == 0) goto LAB_7ffc3e93c2ae;
    if (_DAT_7ffc3ebc1260 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x3f);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebab55a,0x7ffc3ebab616,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1260 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1260;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e93ce19:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (bVar1 == 0) goto LAB_7ffc3e93d03a;
      goto LAB_7ffc3e93cfc2;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8becf8db512aaeb);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e93ce19;
    if (_DAT_7ffc3ebc1268 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x3f);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba7233,0x7ffc3eba6204,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1268 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1268;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e93ce19;
    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8bf00d0570a95f8);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e93ce19;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar9,uRam00007ffc3ebc0a38);
    if (cVar2 != '\0') goto LAB_7ffc3e93c2ae;
    if (_DAT_7ffc3ebc1270 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x3f);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebab55a,0x7ffc3ebab616,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1270 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1270;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8becf8db512aaeb);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1278 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x3f);
          lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebab4e0,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba7233,0x7ffc3eba7f73,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1278 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1278;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8beb955f60c4632);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) goto LAB_7ffc3e93c2ae;
        }
      }
    }
  }
  else {
LAB_7ffc3e93ce52:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar7 = FUN_7ffc3eb76c30(env,0x3f);
      if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xa5), lVar8 != 0)) {
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar4 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e93cefa;
        }
        (*(*env)->Throw)(env,pvVar4);
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e93cefa:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x3f);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xa5), lVar8 == 0)) {
LAB_7ffc3e93cf8e:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e93cf8e;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e93cfc2:
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x3f);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xa5), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e93d03a;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e93d03a:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x3f);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xa5), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e93d0d6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

