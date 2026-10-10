/* Native reconstruction for dev/krypton/5R.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5R_6_0 | RVA 0x177150 | dev/krypton/5R.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5R_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  undefined1 uVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  ulonglong uVar8;
  longlong lVar9;
  longlong lVar10;
  void *pvVar11;
  undefined8 uVar12;
  void *pvVar13;
  undefined8 uVar14;
  JNINativeInterface_ *pJVar15;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar16;
  char *pcVar17;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x46);
  if (pvVar6 == (void *)0x0) {
    return;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x41);
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
  lVar9 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar9 == 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xa4);
  if (lVar10 == 0) {
    return;
  }
  iVar4 = FUN_7ffc3e7db1e0(env,lVar9,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (receiver == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3e948744:
    pvVar6 = (*(*env)->ExceptionOccurred)(env);
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e9487dd:
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x46);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xb5), lVar10 == 0)) {
LAB_7ffc3e948849:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar6);
        goto LAB_7ffc3e948849;
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e948855:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x46);
    if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xb5), lVar10 != 0)) {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e9488f2;
      }
      (*(*env)->Throw)(env,pvVar6);
    }
  }
  else {
    lVar9 = FUN_7ffc3eb76c30(env,2);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0x5f), lVar10 == 0))
    goto LAB_7ffc3e948744;
    FUN_7ffc3e7dbbc0(env,receiver,lVar9,lVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e948744;
    if (_DAT_7ffc3ebc1518 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x46);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3eba7e6d,0x7ffc3eba6204,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1518 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1518;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e948744;
    uVar16 = uVar8 ^ 0x7840e0a3fa9b;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c5f8c53f7d617cb);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
    uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e948744;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
    if (cVar2 != '\0') {
      return;
    }
    if (_DAT_7ffc3ebc1520 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x46);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebabc72,0x7ffc3eba6153,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1520 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1520;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e9487ad:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
      if (bVar1 != 0) goto LAB_7ffc3e9487dd;
      goto LAB_7ffc3e948855;
    }
    pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c5164229069e8de);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9487ad;
    pvVar7 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 == 0))
    goto LAB_7ffc3e9487ad;
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar8 ^ 0x4714c2c2474e);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9487ad;
    if (pvVar7 == (void *)0x0) {
      pJVar15 = *env;
      pcVar17 = &DAT_7ffc3eba6000;
      pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9487a7:
      (*pJVar15->ThrowNew)(env,pvVar6,pcVar17);
      goto LAB_7ffc3e9487ad;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar5 = (*(*env)->GetArrayLength)(env,pvVar7);
    }
    if (iVar5 < 1) {
      pJVar15 = *env;
      pcVar17 = (char *)0x7ffc3eba6019;
      pvVar6 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9487a7;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
    if (_DAT_7ffc3ebc1528 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x46);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebabc75,0x7ffc3eba6167,0,0);
      if ((lVar9 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc1528 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc1528;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9487ad;
    pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c2c08f1e7d423d9);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9487ad;
    if (iVar4 == 0) {
LAB_7ffc3e947bb0:
      pvVar7 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar9 == 0) {
        return;
      }
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar8 ^ 0x4c2c4c00cdf1);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar7 == (void *)0x0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar17 = &DAT_7ffc3eba6000;
        pvVar6 = pvRam00007ffc3ebc0a70;
      }
      else {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (0 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
          if (_DAT_7ffc3ebc1540 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3ebabc75,0x7ffc3eba61a0,0,0);
            if ((lVar9 != 0) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc1540 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
          }
          pvVar11 = _DAT_7ffc3ebc1540;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c36d6eb5126c689);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1548 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaadea,uVar12);
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            uVar14 = FUN_7ffc3eb76c30(env,0x46);
            uStack_50 = FUN_7ffc3eb770c0(env,uVar12,5,uVar14,0x7ffc3ebabc78,0x7ffc3ebabc7a);
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaae25,uVar12);
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                     0x7ffc3ebaae39,0x7ffc3ebabc8f,&uStack_58,3);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc1548 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc1548;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar8 ^ 0xed0c144e6fb);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1550 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3ebabc75,0x7ffc3eba626f,0,0);
            if ((lVar9 != 0) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc1550 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
          }
          pvVar11 = _DAT_7ffc3ebc1550;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c00189049001c5e);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
          FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc1558 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba6299,0x7ffc3eba647c,0,0);
            if ((lVar9 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc1558 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc1558;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x52cb);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar8 ^ 0x729e0248f155023a);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
          uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc1560 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x46);
            lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                                     0x7ffc3eba74f1,0x7ffc3eba72ac,0,0);
            if ((lVar9 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc1560 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc1560;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x1c5f8c53f7d617cb);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar11);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar17 = (char *)0x7ffc3eba6019;
        pvVar6 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e948a2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar6,pcVar17);
      return;
    }
    if (pvVar6 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc1530 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x46);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c,
                               0x7ffc3ebabc72,0x7ffc3eba6153,0,0);
      if ((lVar9 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1530 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1530;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x1c5164229069e8de);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar11);
      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar7 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 != 0)) {
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,uVar8 ^ 0x4714c2c2474e);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (pvVar7 == (void *)0x0) {
              pJVar15 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar6 = pvRam00007ffc3ebc0a70;
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar7);
              }
              if (0 < iVar4) {
                (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar11);
                if (_DAT_7ffc3ebc1538 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x46);
                  lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebabc63,0x7ffc3eba72ee,0x7ffc3eba606c
                                           ,0x7ffc3ebabc75,0x7ffc3eba6167,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar11 != (void *)0x0)) {
                    _DAT_7ffc3ebc1538 = (*(*env)->NewGlobalRef)(env,pvVar11);
                  }
                }
                pvVar11 = _DAT_7ffc3ebc1538;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar7);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c2c08f1e7d423d9);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar16);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) goto LAB_7ffc3e947bb0;
                }
                goto LAB_7ffc3e9488e9;
              }
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
LAB_7ffc3e9488e9:
  pvVar6 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e9488f2:
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar7);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x46);
    if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xb5), lVar10 != 0)) {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9489a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar6);
        return;
      }
    }
  }
  return;
}

