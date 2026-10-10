/* Native reconstruction for dev/krypton/5I.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5I_6_0 | RVA 0x16f440 | dev/krypton/5I.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5I_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  undefined1 uVar3;
  int iVar4;
  int iVar5;
  undefined4 uVar6;
  void *pvVar7;
  void *pvVar8;
  longlong lVar9;
  longlong lVar10;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar14;
  ulonglong uVar15;
  char *pcVar16;
  ulonglong uVar17;
  double dVar18;
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x1e);
  if (pvVar7 == (void *)0x0) {
    return;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xe);
  if (pvVar8 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar17 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar8 + 0x10));
  }
  else {
    uVar17 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar8);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c30(env,0x1f);
  if (lVar9 == 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x5e);
  if (lVar10 == 0) {
    return;
  }
  iVar4 = FUN_7ffc3e7db1e0(env,lVar9,lVar10);
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
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1388 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x1e);
      lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba7190,0x7ffc3eba7192,0,0);
      if ((lVar9 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
      {
        _DAT_7ffc3ebc1388 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc1388;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    uVar15 = uVar17 ^ 0x4658a8e6c6b1;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c7366e136d2ae53);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar9 == 0) {
      return;
    }
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar17 ^ 0x1e3b66a4fa86);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar8 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      if (iVar5 < 1) {
LAB_7ffc3e942329:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar16 = (char *)0x7ffc3eba6019;
        pvVar7 = pvRam00007ffc3ebc0a98;
        goto LAB_7ffc3e942345;
      }
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
      if (_DAT_7ffc3ebc1390 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x1e);
        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba71b9,0x7ffc3eba630c,0,0);
        if ((lVar9 != 0) &&
           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
           pvVar11 != (void *)0x0)) {
          _DAT_7ffc3ebc1390 = (*(*env)->NewGlobalRef)(env,pvVar11);
        }
      }
      pvVar11 = _DAT_7ffc3ebc1390;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c4f510ba487eeb5);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1398 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x1e);
        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba71b9,0x7ffc3eba6128,0,0);
        if ((lVar9 != 0) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1398 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
      }
      pvVar8 = _DAT_7ffc3ebc1398;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c4b45c6994dacbf);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (iVar4 == 0) {
        return;
      }
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc13a0 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x1e);
        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba71b9,0x7ffc3eba6204,0,0);
        if ((lVar9 != 0) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0
           )) {
          _DAT_7ffc3ebc13a0 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
      }
      pvVar8 = _DAT_7ffc3ebc13a0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7e705b788ea8d4);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
        uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e94235b;
        cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
        if (cVar2 != '\0') {
LAB_7ffc3e9401b5:
          if (_DAT_7ffc3ebc13f8 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba606a,0x7ffc3eba647c,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc13f8 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc13f8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x20f4);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar17 ^ 0x4a447bde03569c2c);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar6 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc1400 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba7291,0x7ffc3eba7293,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1400 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1400;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x1c4b8a3f4fde00c6);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1408 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba606a,0x7ffc3eba647c,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1408 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1408;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar17 = uVar17 ^ 0x239fe843b4d6c85f;
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x74aa);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc1410 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba7291,0x7ffc3eba72ac,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1410 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1410;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x1c75bd4c231b9ffe);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1418 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba606a,0x7ffc3eba647c,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1418 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1418;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x74aa);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc1420 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba7291,0x7ffc3eba72ac,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1420 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1420;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x1c7032e37891bf35);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1428 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba606a,0x7ffc3eba647c,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1428 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1428;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x74aa);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc1430 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba7291,0x7ffc3eba72ac,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1430 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1430;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x1c7d30ccd0178f70);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1438 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba606a,0x7ffc3eba647c,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1438 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1438;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x74aa);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar6 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc1440 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba7291,0x7ffc3eba7293,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1440 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1440;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x1c7e32ffb244fe4a);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
LAB_7ffc3e940ca6:
          FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e940cc1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        pvVar8 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba64b2);
        if (_DAT_7ffc3ebc13a8 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x1e);
          lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba71b9,0x7ffc3eba6245,0,0);
          if ((lVar9 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc13a8 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc13a8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
LAB_7ffc3e94242c:
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xc);
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
          if (bVar1 != 0) goto LAB_7ffc3e94245c;
          goto LAB_7ffc3e9424d4;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c4e0eb6371bc532);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar8);
        uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e94242c;
        cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
        if (cVar2 != '\0') goto LAB_7ffc3e9401b5;
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 != 0)) {
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar17 ^ 0x4668fd583c4d)
          ;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3e9425dc;
          if (pvVar8 == (void *)0x0) {
            pJVar14 = *env;
            pcVar16 = &DAT_7ffc3eba6000;
            pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9425d6:
            (*pJVar14->ThrowNew)(env,pvVar7,pcVar16);
            goto LAB_7ffc3e9425dc;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar4 < 2) {
LAB_7ffc3e942572:
            pJVar14 = *env;
            pcVar16 = (char *)0x7ffc3eba6019;
            pvVar7 = pvRam00007ffc3ebc0a98;
            goto LAB_7ffc3e9425d6;
          }
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar4 < 1) goto LAB_7ffc3e942572;
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar7);
          if (_DAT_7ffc3ebc13b0 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba629b,0x7ffc3eba71bb,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc13b0 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc13b0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3e9425dc;
          pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c7b5d8925c3651e);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar8);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3e9425dc;
          dVar18 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
          if (0.0 < dVar18) goto LAB_7ffc3e9401b5;
          if (_DAT_7ffc3ebc13b8 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba7190,0x7ffc3eba71d3,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc13b8 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc13b8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1c4cbb1c4874dce0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc13c0 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba7190,0x7ffc3eba7203,0,0);
                if ((lVar9 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc13c0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc13c0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c797399115a1689);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar15);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                lVar9 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (lVar9 == 0) {
LAB_7ffc3e941a70:
                    pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
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
                    if (pvVar11 == (void *)0x0) goto LAB_7ffc3e94230f;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                    }
                    if (1 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                      lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                      if (lVar9 == 0) {
                        return;
                      }
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                        uVar17 ^ 0x601420321813);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                      }
                      if (0 < iVar4) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                        if (_DAT_7ffc3ebc13f0 == (void *)0x0) {
                          uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                          lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,
                                                   0x7ffc3eba606c,0x7ffc3eba71b9,0x7ffc3eba626f,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar7 != (void *)0x0)) {
                            _DAT_7ffc3ebc13f0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                          }
                        }
                        pvVar7 = _DAT_7ffc3ebc13f0;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x1c787637baa6a4b6);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar15);
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
                        goto LAB_7ffc3e940ca6;
                      }
                    }
                    goto LAB_7ffc3e942329;
                  }
                  if (_DAT_7ffc3ebc13c8 == (void *)0x0) {
                    uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3eba71d3,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar7 != (void *)0x0)) {
                      _DAT_7ffc3ebc13c8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                    }
                  }
                  pvVar7 = _DAT_7ffc3ebc13c8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,0x1c4cbb1c4874dce0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,uVar15);
                    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
                    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc13d0 == (void *)0x0) {
                        uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba7190,0x7ffc3eba7203,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar8 != (void *)0x0)) {
                          _DAT_7ffc3ebc13d0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                        }
                      }
                      pvVar8 = _DAT_7ffc3ebc13d0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x1c797399115a1689);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar15);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc13d8 == (void *)0x0) {
                            uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba6299,
                                                     0x7ffc3eba606c,0x7ffc3eba7233,0x7ffc3eba629d,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar8 != (void *)0x0)) {
                              _DAT_7ffc3ebc13d8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                            }
                          }
                          pvVar8 = _DAT_7ffc3ebc13d8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar11 = (*(*env)->NewObjectArray)
                                                (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                               uRam00007ffc3ebc0998,0x63dd);
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               uVar17 ^ 0x7afe2d8e733bdf99);
                            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                              pvVar11);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc13e0 == (void *)0x0) {
                                uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,0x7ffc3eba718e,
                                                         0x7ffc3eba606c,0x7ffc3eba629b,
                                                         0x7ffc3eba7235,0,0);
                                if ((lVar9 != 0) &&
                                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                       uRam00007ffc3ebc0a00),
                                   pvVar11 != (void *)0x0)) {
                                  _DAT_7ffc3ebc13e0 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                }
                              }
                              pvVar11 = _DAT_7ffc3ebc13e0;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar12 = (*(*env)->NewObjectArray)
                                                    (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
                                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0x1c78fae2c0e5a5d2);
                                (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,uVar15);
                                (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
                                pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,
                                                                  pvVar12);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc13e8 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0x1e);
                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba717f,
                                                             0x7ffc3eba718e,0x7ffc3eba606c,
                                                             0x7ffc3eba71b9,0x7ffc3eba7266,0,0);
                                    if ((lVar9 != 0) &&
                                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar11 != (void *)0x0)) {
                                      _DAT_7ffc3ebc13e8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                    }
                                  }
                                  pvVar11 = _DAT_7ffc3ebc13e8;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar12 = (*(*env)->NewObjectArray)
                                                        (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,
                                                                      uRam00007ffc3ebc0990,0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x1c70eefd9910326f);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar15);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar7);
                                    FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) goto LAB_7ffc3e941a70;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  goto LAB_7ffc3e9425dc;
                }
              }
            }
          }
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xc);
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
          if (bVar1 == 0) goto LAB_7ffc3e9425e8;
          goto LAB_7ffc3e9424fc;
        }
      }
      else {
LAB_7ffc3e94235b:
        pvVar8 = (*(*env)->ExceptionOccurred)(env);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xc);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
        if (bVar1 != 0) {
          (*(*env)->ExceptionClear)(env);
          lVar9 = FUN_7ffc3eb76c30(env,0x1e);
          if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x60), lVar10 != 0)) {
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              pvVar8 = (*(*env)->ExceptionOccurred)(env);
              goto LAB_7ffc3e942403;
            }
            (*(*env)->Throw)(env,pvVar7);
          }
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
        }
LAB_7ffc3e942403:
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xc);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
        if (bVar1 == 0) {
          return;
        }
LAB_7ffc3e94245c:
        (*(*env)->ExceptionClear)(env);
        lVar9 = FUN_7ffc3eb76c30(env,0x1e);
        if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x60), lVar10 == 0)) {
LAB_7ffc3e9424c8:
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
        }
        else {
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            (*(*env)->Throw)(env,pvVar7);
            goto LAB_7ffc3e9424c8;
          }
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
        }
LAB_7ffc3e9424d4:
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xc);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
        if (bVar1 == 0) {
          return;
        }
LAB_7ffc3e9424fc:
        (*(*env)->ExceptionClear)(env);
        lVar9 = FUN_7ffc3eb76c30(env,0x1e);
        if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x60), lVar10 != 0)) {
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            pvVar8 = (*(*env)->ExceptionOccurred)(env);
            goto LAB_7ffc3e9425e8;
          }
          (*(*env)->Throw)(env,pvVar7);
        }
      }
LAB_7ffc3e9425dc:
      pvVar8 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e9425e8:
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
      if (bVar1 != 0) {
        (*(*env)->ExceptionClear)(env);
        lVar9 = FUN_7ffc3eb76c30(env,0x1e);
        if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x60), lVar10 != 0)) {
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e942694. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->Throw)(env,pvVar7);
            return;
          }
        }
      }
      return;
    }
  }
LAB_7ffc3e94230f:
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  pcVar16 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e942345:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e942358. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar7,pcVar16);
  return;
}

