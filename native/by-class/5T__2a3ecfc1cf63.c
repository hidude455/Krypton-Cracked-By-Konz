/* Native reconstruction for dev/krypton/5T.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5T_6_0 | RVA 0x181590 | dev/krypton/5T.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_5T_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  undefined1 uVar3;
  int iVar4;
  undefined4 uVar5;
  void *pvVar6;
  void *pvVar7;
  ulonglong uVar8;
  longlong lVar9;
  longlong lVar10;
  void *pvVar11;
  undefined8 uVar12;
  void *pvVar13;
  void *pvVar14;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar15;
  ulonglong uVar16;
  char *pcVar17;
  ulonglong uVar18;
  double dVar19;
  
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x5d);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x6f);
  if (pvVar7 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar8 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar7 + 0x10));
  }
  else {
    uVar8 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar7);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c30(env,0x1f);
  if (lVar9 == 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfc);
  if (lVar10 == 0) {
    return;
  }
  iVar4 = FUN_7ffc3e7db1e0(env,lVar9,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar16 = uVar8 ^ 0x47e5f0401207;
  uVar18 = uVar8 ^ 0x61a97894cca5;
  if (iVar4 != 0) {
LAB_7ffc3e951693:
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
    if (lVar9 == 0) {
      return;
    }
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar9,0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar6 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
      }
      if (1 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar9 == 0) {
          return;
        }
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar18);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if (0 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
          if (_DAT_7ffc3ebc15b8 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3eba7190,0x7ffc3eba626f,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc15b8 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc15b8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c7da8c2f1e22233);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
LAB_7ffc3e952080:
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
LAB_7ffc3e9520bf:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9520d5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      goto LAB_7ffc3e9572b6;
    }
    goto LAB_7ffc3e957569;
  }
  if (_DAT_7ffc3ebc1598 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,0x5d);
    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                             0x7ffc3eba718e,0x7ffc3eba71d3,0,0);
    if ((lVar9 != 0) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc1598 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
  }
  pvVar6 = _DAT_7ffc3ebc1598;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c4c57b2b1f8de17);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9571e1;
    if (_DAT_7ffc3ebc15a0 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x5d);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3eba7203,0,0);
      if ((lVar9 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
      {
        _DAT_7ffc3ebc15a0 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc15a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9571e1;
    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c72ccccfc04f646);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
    lVar9 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9571e1;
    if (lVar9 == 0) goto LAB_7ffc3e951693;
    if (_DAT_7ffc3ebc15a8 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x5d);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3eba71d3,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc15a8 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc15a8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e957384:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
      if (bVar1 != 0) goto LAB_7ffc3e9573b4;
      goto LAB_7ffc3e95742c;
    }
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c4c57b2b1f8de17);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e957384;
    if (_DAT_7ffc3ebc15b0 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x5d);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3ebab583,0,0);
      if ((lVar9 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
      {
        _DAT_7ffc3ebc15b0 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc15b0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e957455:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
      if (bVar1 != 0) goto LAB_7ffc3e957485;
      goto LAB_7ffc3e9574fd;
    }
    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7369018e138bb6);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
    lVar9 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e957455;
    if (lVar9 == 0) goto LAB_7ffc3e951693;
    if (_DAT_7ffc3ebc15c0 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x5d);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3eba71d3,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc15c0 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc15c0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c4c57b2b1f8de17);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc15c8 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x5d);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3eba7203,0,0);
      if ((lVar9 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
      {
        _DAT_7ffc3ebc15c8 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc15c8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c72ccccfc04f646);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9572d7;
      if (_DAT_7ffc3ebc15d0 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                                 0x7ffc3eba7190,0x7ffc3eba71bb,0,0);
        if ((lVar9 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc15d0 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc15d0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9572d7;
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c48a64b5930fbaf);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
      uVar12 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9572d7;
      dVar19 = (double)FUN_7ffc3e853af0(env,uVar12,uRam00007ffc3ebc0a20);
      if (dVar19 < 0.0) {
        pvVar6 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
          if (lVar9 != 0) {
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar8 ^ 0x2e7b9fbff347)
            ;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3e957597;
            if (pvVar6 == (void *)0x0) {
              pJVar15 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar6 = pvRam00007ffc3ebc0a70;
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (0 < iVar4) {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                if (_DAT_7ffc3ebc1608 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c
                                           ,0x7ffc3eba7190,0x7ffc3eba6245,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc1608 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc1608;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c4e1e2c3030e48d);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar16);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
                  uVar12 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    cVar2 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
                    if (cVar2 == '\0') {
                      if (_DAT_7ffc3ebc1688 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3ebab4ef,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar6 != (void *)0x0)) {
                          _DAT_7ffc3ebc1688 = (*(*env)->NewGlobalRef)(env,pvVar6);
                        }
                      }
                      pvVar6 = _DAT_7ffc3ebc1688;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x1c4b1d90f1f4c0d8);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1690 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3ebab51c,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar7 != (void *)0x0)) {
                          _DAT_7ffc3ebc1690 = (*(*env)->NewGlobalRef)(env,pvVar7);
                        }
                      }
                      pvVar7 = _DAT_7ffc3ebc1690;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c4d536ecd4c3c97);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
                      FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x5f);
                      if (pvVar6 == (void *)0x0) {
                        return;
                      }
                      pvVar7 = (*(*env)->AllocObject)(env,pvVar6);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1698 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba72e8,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc1698 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc1698;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0x65c6);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,
                                                         uVar8 ^ 0x3b8cacb80af154ed);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                      uVar12 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      uVar12 = FUN_7ffc3e7d1a20(env,uVar12,uRam00007ffc3ebc0968);
                      if (pvVar7 != (void *)0x0) {
                        lVar9 = FUN_7ffc3eb76c90(env,pvVar6,0xff);
                        if (lVar9 == 0) {
                          return;
                        }
                        FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar9,uVar12);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc16a0 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaeb32,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar6 != (void *)0x0)) {
                            _DAT_7ffc3ebc16a0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                          }
                        }
                        pvVar6 = _DAT_7ffc3ebc16a0;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c4fe7d260df0a1d);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc16a8 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba6299,
                                                   0x7ffc3eba606c,0x7ffc3ebaea32,0x7ffc3eba629d,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar7 != (void *)0x0)) {
                            _DAT_7ffc3ebc16a8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                          }
                        }
                        pvVar7 = _DAT_7ffc3ebc16a8;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                           uRam00007ffc3ebc0998,0x4d7a);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,
                                                           uVar8 ^ 0x1f297cde543f3f0c);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc16b0 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaeb63,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc16b0 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc16b0;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c773c4b7e9759ac);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc16b8 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaeb32,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar7 != (void *)0x0)) {
                            _DAT_7ffc3ebc16b8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                          }
                        }
                        pvVar7 = _DAT_7ffc3ebc16b8;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c79be433f944086);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc16c0 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3ebaeba6,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar7 != (void *)0x0)) {
                            _DAT_7ffc3ebc16c0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                          }
                        }
                        pvVar7 = _DAT_7ffc3ebc16c0;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c7d1c753f6fda74);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
                        FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x60);
                        if (pvVar6 == (void *)0x0) {
                          return;
                        }
                        pvVar7 = (*(*env)->AllocObject)(env,pvVar6);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (pvVar7 != (void *)0x0) {
                          lVar9 = FUN_7ffc3eb76c90(env,pvVar6,0x100);
                          if (lVar9 == 0) {
                            return;
                          }
                          FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar9);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc16c8 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                     0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3ebaebd8,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16c8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16c8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar11 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x1c7d58288482d29f)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar16);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
                          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc16d0 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba647c,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16d0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16d0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x7ff8);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar8 ^ 0x5c044839780c0580);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          uVar5 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc16d8 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                     0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3eba7293,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16d8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16d8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,uVar5);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x1c744cfeb5cf58be
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar16);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar11);
                          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc16e0 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba647c,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16e0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16e0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x5adc);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar8 ^ 0x7604bb2ba91920a0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          uVar5 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc16e8 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                     0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3eba7293,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16e8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16e8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,uVar5);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x1c793d7e851cdb48
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar16);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar11);
                          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc16f0 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba647c,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16f0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16f0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x2a8a);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar8 ^ 0xbb6169e5aea50f7);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          uVar3 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc16f8 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                     0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3eba72ac,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc16f8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc16f8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                             uRam00007ffc3ebc0990,uVar3);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x1c7439cdf9fda3f9
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar16);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar11);
                          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc1700 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba647c,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc1700 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc1700;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x3c4d);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar8 ^ 0x6a9e8d5bf5fdc639);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          uVar3 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc1708 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                     0x7ffc3eba606c,0x7ffc3ebabccf,0x7ffc3eba72ac,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc1708 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc1708;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                             uRam00007ffc3ebc0990,uVar3);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x1c7815a5181cce79
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar16);
                          (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar11);
                          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar6 = (*(*env)->NewObjectArray)
                                             (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                          if (lVar9 == 0) {
                            return;
                          }
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                            uVar8 ^ 0x195923686f31);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (pvVar6 != (void *)0x0) {
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            if (iVar4 < 1) goto LAB_7ffc3e9572b6;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                            if (_DAT_7ffc3ebc1710 == (void *)0x0) {
                              uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                              lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                       0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3eba626f,
                                                       0,0);
                              if ((lVar9 != 0) &&
                                 (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                                 pvVar7 != (void *)0x0)) {
                                _DAT_7ffc3ebc1710 = (*(*env)->NewGlobalRef)(env,pvVar7);
                              }
                            }
                            pvVar7 = _DAT_7ffc3ebc1710;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar11 = (*(*env)->NewObjectArray)
                                                (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1c4a0bfb286a80af);
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar16);
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
                            FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (receiver != (void *)0x0) {
                              lVar9 = FUN_7ffc3eb76c30(env,2);
                              if (lVar9 == 0) {
                                return;
                              }
                              lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x5f);
                              if (lVar10 == 0) {
                                return;
                              }
                              FUN_7ffc3e7dbbc0(env,receiver,lVar9,lVar10);
                              goto LAB_7ffc3e9520bf;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if (_DAT_7ffc3ebc1610 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba718e,0x7ffc3eba71d3,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar6 != (void *)0x0)) {
                          _DAT_7ffc3ebc1610 = (*(*env)->NewGlobalRef)(env,pvVar6);
                        }
                      }
                      pvVar6 = _DAT_7ffc3ebc1610;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x1c4c57b2b1f8de17);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
                      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1618 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba718e,0x7ffc3eba7203,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar7 != (void *)0x0)) {
                          _DAT_7ffc3ebc1618 = (*(*env)->NewGlobalRef)(env,pvVar7);
                        }
                      }
                      pvVar7 = _DAT_7ffc3ebc1618;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c72ccccfc04f646);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1620 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3ebaea32,0x7ffc3eba629d,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar7 != (void *)0x0)) {
                          _DAT_7ffc3ebc1620 = (*(*env)->NewGlobalRef)(env,pvVar7);
                        }
                      }
                      pvVar7 = _DAT_7ffc3ebc1620;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0x6c13);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,
                                                         uVar8 ^ 0x6499445bbc69e64);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1628 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba7235,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc1628 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc1628;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c723fc9937ad890);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1630 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3eba7266,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc1630 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc1630;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                        uRam00007ffc3ebc0990,0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c784db4244f9f19);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar6);
                      FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x5e);
                      if (pvVar6 == (void *)0x0) {
                        return;
                      }
                      pvVar7 = (*(*env)->AllocObject)(env,pvVar6);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc1638 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3ebaea32,0x7ffc3eba629d,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc1638 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc1638;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0x5dd4);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,
                                                         uVar8 ^ 0x1ccaae6312c02fa9);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                      uVar12 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (pvVar7 != (void *)0x0) {
                        lVar9 = FUN_7ffc3eb76c90(env,pvVar6,0xfe);
                        if (lVar9 == 0) {
                          return;
                        }
                        FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar9,uVar8 ^ 0x75081b9c4156,uVar12);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc1640 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3ebaea34,0x7ffc3ebaea36,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar6 != (void *)0x0)) {
                            _DAT_7ffc3ebc1640 = (*(*env)->NewGlobalRef)(env,pvVar6);
                          }
                        }
                        pvVar6 = _DAT_7ffc3ebc1640;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x1c7cb4779156f3c7);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc1648 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaea55,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc1648 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc1648;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar13 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar7);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar8 ^ 0x1a3e03d53605);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c4b9997ddb7e708);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar6);
                        FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc1650 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba6299,
                                                   0x7ffc3eba606c,0x7ffc3ebaea32,0x7ffc3eba629d,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar6 != (void *)0x0)) {
                            _DAT_7ffc3ebc1650 = (*(*env)->NewGlobalRef)(env,pvVar6);
                          }
                        }
                        pvVar6 = _DAT_7ffc3ebc1650;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                           uRam00007ffc3ebc0998,0x4b1c);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,
                                                           uVar8 ^ 0x2d30ac521a1396e);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc1658 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaea8f,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc1658 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc1658;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar13 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar7);
                        pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,
                                                           uVar8 ^ 0x37dd4a47836f);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c705952870753dd);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar6);
                        FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc1660 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba718e,0x7ffc3eba71d3,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar6 != (void *)0x0)) {
                            _DAT_7ffc3ebc1660 = (*(*env)->NewGlobalRef)(env,pvVar6);
                          }
                        }
                        pvVar6 = _DAT_7ffc3ebc1660;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x1c4c57b2b1f8de17);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (_DAT_7ffc3ebc1668 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                   0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaeac9,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc1668 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc1668;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c777a4ad245a9ff);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar11 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                        if (lVar9 == 0) {
                          return;
                        }
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                           uVar8 ^ 0x6bc2be514e13);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (pvVar11 != (void *)0x0) {
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                          }
                          if (0 < iVar4) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
                            if (_DAT_7ffc3ebc1670 == (void *)0x0) {
                              uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                              lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                        0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3ebaeaf9
                                                        ,0,0);
                              if ((lVar10 != 0) &&
                                 (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00
                                                                    ), pvVar13 != (void *)0x0)) {
                                _DAT_7ffc3ebc1670 = (*(*env)->NewGlobalRef)(env,pvVar13);
                              }
                            }
                            pvVar13 = _DAT_7ffc3ebc1670;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar14 = (*(*env)->NewObjectArray)
                                                (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar7);
                            (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1c767b522b7260ec);
                            (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar7);
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar16);
                            (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar7);
                            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,
                                                              pvVar14);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (_DAT_7ffc3ebc1678 == (void *)0x0) {
                              uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                              lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                        0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3eba626f
                                                        ,0,0);
                              if ((lVar10 != 0) &&
                                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00
                                                                    ), pvVar11 != (void *)0x0)) {
                                _DAT_7ffc3ebc1678 = (*(*env)->NewGlobalRef)(env,pvVar11);
                              }
                            }
                            pvVar11 = _DAT_7ffc3ebc1678;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar13 = (*(*env)->NewObjectArray)
                                                (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1c76a379a8670480);
                            (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar16);
                            (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                            FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar6 = (*(*env)->NewObjectArray)
                                               (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
                            if (lVar10 == 0) {
                              return;
                            }
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar10,0);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e957569;
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            if (1 < iVar4) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                                uVar18);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return;
                              }
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar4 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                              }
                              if (0 < iVar4) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                                if (_DAT_7ffc3ebc1680 == (void *)0x0) {
                                  uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,
                                                           0x7ffc3eba72ee,0x7ffc3eba606c,
                                                           0x7ffc3eba7190,0x7ffc3eba626f,0,0);
                                  if ((lVar9 != 0) &&
                                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                        uRam00007ffc3ebc0a00),
                                     pvVar7 != (void *)0x0)) {
                                    _DAT_7ffc3ebc1680 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                  }
                                }
                                pvVar7 = _DAT_7ffc3ebc1680;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  return;
                                }
                                pvVar11 = (*(*env)->NewObjectArray)
                                                    (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0x1c7da8c2f1e22233);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                                goto LAB_7ffc3e952080;
                              }
                            }
                          }
LAB_7ffc3e9572b6:
                          UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                          pcVar17 = (char *)0x7ffc3eba6019;
                          pvVar6 = pvRam00007ffc3ebc0a98;
                          goto LAB_7ffc3e957581;
                        }
                      }
                    }
LAB_7ffc3e957569:
                    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                    pcVar17 = &DAT_7ffc3eba6000;
                    pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e957581:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e957594. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (*UNRECOVERED_JUMPTABLE)(env,pvVar6,pcVar17);
                    return;
                  }
                }
                goto LAB_7ffc3e957597;
              }
              pJVar15 = *env;
              pcVar17 = (char *)0x7ffc3eba6019;
              pvVar6 = pvRam00007ffc3ebc0a98;
            }
            (*pJVar15->ThrowNew)(env,pvVar6,pcVar17);
          }
          pvVar6 = (*(*env)->ExceptionOccurred)(env);
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
        }
        else {
LAB_7ffc3e957597:
          pvVar6 = (*(*env)->ExceptionOccurred)(env);
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
        }
        if (bVar1 == 0) {
          return;
        }
        (*(*env)->ExceptionClear)(env);
        lVar9 = FUN_7ffc3eb76c30(env,0x5d);
        if (lVar9 == 0) {
          return;
        }
        lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd);
        if (lVar10 == 0) {
          return;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        goto LAB_7ffc3e957776;
      }
      if (_DAT_7ffc3ebc15d8 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                                 0x7ffc3eba718e,0x7ffc3eba71d3,0,0);
        if ((lVar9 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc15d8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc15d8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c4c57b2b1f8de17);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc15e0 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x5d);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3eba718e,0x7ffc3eba7203,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc15e0 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc15e0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c72ccccfc04f646);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc15e8 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba6299,0x7ffc3eba606c,
                                         0x7ffc3ebaea32,0x7ffc3eba629d,0,0);
                if ((lVar9 != 0) &&
                   (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar7 != (void *)0x0)) {
                  _DAT_7ffc3ebc15e8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                }
              }
              pvVar7 = _DAT_7ffc3ebc15e8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   0x47c1);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar8 ^ 0xecee7f06181b5ba);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc15f0 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                    lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba7235,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar11 != (void *)0x0)) {
                      _DAT_7ffc3ebc15f0 = (*(*env)->NewGlobalRef)(env,pvVar11);
                    }
                  }
                  pvVar11 = _DAT_7ffc3ebc15f0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x1c723fc9937ad890);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar16);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc15f8 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3eba7266,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc15f8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc15f8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar13 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                          uRam00007ffc3ebc0990,0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c784db4244f9f19);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar16);
                        (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar6);
                        FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar6 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar1 == 0) &&
                             (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar9 != 0)) {
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar9,0);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (pvVar6 == (void *)0x0) {
                                pJVar15 = *env;
                                pcVar17 = &DAT_7ffc3eba6000;
                                pvVar6 = pvRam00007ffc3ebc0a70;
                              }
                              else {
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar4 = *(int *)(*(longlong *)
                                                    ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                }
                                if (1 < iVar4) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
                                  lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                                  if (lVar9 != 0) {
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9
                                                                      ,uVar18);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar4 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                      }
                                      if (iVar4 < 1) goto LAB_7ffc3e9575d0;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                                      if (_DAT_7ffc3ebc1600 == (void *)0x0) {
                                        uVar12 = FUN_7ffc3eb76c30(env,0x5d);
                                        lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebaea23,
                                                                 0x7ffc3eba72ee,0x7ffc3eba606c,
                                                                 0x7ffc3eba7190,0x7ffc3eba626f,0,0);
                                        if ((lVar9 != 0) &&
                                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                              uRam00007ffc3ebc0a00),
                                           pvVar7 != (void *)0x0)) {
                                          _DAT_7ffc3ebc1600 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                        }
                                      }
                                      pvVar7 = _DAT_7ffc3ebc1600;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar11 = (*(*env)->NewObjectArray)
                                                            (env,4,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          0x1c7da8c2f1e22233);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          uVar16);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar6);
                                        FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          return;
                                        }
                                      }
                                    }
                                  }
                                  goto LAB_7ffc3e9576db;
                                }
LAB_7ffc3e9575d0:
                                pJVar15 = *env;
                                pcVar17 = (char *)0x7ffc3eba6019;
                                pvVar6 = pvRam00007ffc3ebc0a98;
                              }
                              (*pJVar15->ThrowNew)(env,pvVar6,pcVar17);
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
LAB_7ffc3e9576db:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
LAB_7ffc3e9572d7:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
      if (bVar1 == 0) {
        return;
      }
      (*(*env)->ExceptionClear)(env);
      lVar9 = FUN_7ffc3eb76c30(env,0x5d);
      if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd), lVar10 == 0))
      goto LAB_7ffc3e9576db;
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar6);
        goto LAB_7ffc3e9576db;
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x5d);
    if (lVar9 == 0) {
      return;
    }
    lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd);
  }
  else {
LAB_7ffc3e9571e1:
    pvVar6 = (*(*env)->ExceptionOccurred)(env);
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar9 = FUN_7ffc3eb76c30(env,0x5d);
      if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd), lVar10 != 0)) {
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar6 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e957289;
        }
        (*(*env)->Throw)(env,pvVar6);
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e957289:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e9573b4:
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x5d);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd), lVar10 == 0)) {
LAB_7ffc3e957420:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar6);
        goto LAB_7ffc3e957420;
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e95742c:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e957485:
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x5d);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd), lVar10 == 0)) {
LAB_7ffc3e9574f1:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar6);
        goto LAB_7ffc3e9574f1;
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e9574fd:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x5d);
    if (lVar9 == 0) {
      return;
    }
    lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xfd);
  }
  if (lVar10 != 0) {
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
LAB_7ffc3e957776:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e957793. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->Throw)(env,pvVar6);
      return;
    }
  }
  return;
}

/* JNI_dev_krypton_5T_1_1 | RVA 0x1877c0 | dev/krypton/5T.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5T_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x5d);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x6f);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x1f);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xfc);
  if (lVar7 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (iVar3 != 0) {
LAB_7ffc3e9578a8:
    if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e958173. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      return;
    }
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if (lVar6 == 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x61);
    if (lVar7 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e95790b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(*env)->ExceptionCheck)(env);
    return;
  }
  if (_DAT_7ffc3ebc1570 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x5d);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,0x7ffc3eba718e
                             ,0x7ffc3ebab616,0,0);
    if ((lVar6 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1570 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1570;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar10 = uVar10 ^ 0x5d80006cc6c4;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc88e490b3d60e854);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar8);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9581af;
    if (lVar6 == 0) goto LAB_7ffc3e9578a8;
    if (_DAT_7ffc3ebc1578 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x5d);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3ebab616,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1578 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1578;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e958176:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (bVar1 == 0) goto LAB_7ffc3e958397;
      goto LAB_7ffc3e95831f;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc88e490b3d60e854);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar8);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e958176;
    if (_DAT_7ffc3ebc1580 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x5d);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba7190,0x7ffc3eba6204,0,0);
      if ((lVar6 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1580 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1580;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e958176;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8b2773ffb7c518b);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e958176;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar9,uRam00007ffc3ebc0a38);
    if (cVar2 != '\0') goto LAB_7ffc3e9578a8;
    if (_DAT_7ffc3ebc1588 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x5d);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3ebab616,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1588 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1588;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc88e490b3d60e854);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar8);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1590 == (void *)0x0) {
          uVar9 = FUN_7ffc3eb76c30(env,0x5d);
          lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaea23,0x7ffc3eba72ee,0x7ffc3eba606c,
                                   0x7ffc3eba7190,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1590 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1590;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8b4f5ea76b84347);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) goto LAB_7ffc3e9578a8;
        }
      }
    }
  }
  else {
LAB_7ffc3e9581af:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x5d);
      if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xfd), lVar7 != 0)) {
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar4 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e958257;
        }
        (*(*env)->Throw)(env,pvVar4);
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e958257:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x5d);
    if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xfd), lVar7 == 0)) {
LAB_7ffc3e9582eb:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e9582eb;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e95831f:
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x5d);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xfd), lVar7 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e958397;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e958397:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x5d);
    if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xfd), lVar7 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e958433. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

