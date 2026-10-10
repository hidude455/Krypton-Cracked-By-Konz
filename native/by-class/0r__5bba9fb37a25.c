/* Native reconstruction for dev/krypton/0r.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_0r_8_0 | RVA 0x122d0 | dev/krypton/0r.8(Ljava/lang/String;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_0r_8_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  void *pvVar5;
  void *pvVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  void *pvVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  void *pvVar14;
  void *pvVar15;
  void *arg1;
  void *pvVar16;
  Throw_prototype *UNRECOVERED_JUMPTABLE;
  undefined8 uVar17;
  JNINativeInterface_ *pJVar18;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x26);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x13);
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
  lVar8 = FUN_7ffc3eb76c30(env,0x27);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,100);
  if (lVar9 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar10 = uVar7 ^ 0x490dd42cae73;
  if (lVar8 == 0) {
LAB_7ffc3e7e2601:
    if (_DAT_7ffc3ebc2f08 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x26);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba750c,0x7ffc3eba750f,0,0);
      if ((lVar9 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2f08 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2f08;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,arg0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x5153e8dddf0e9e59);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar11);
      FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc2f10 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x26);
          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba7527,0x7ffc3eba752a,0,0);
          if ((lVar9 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc2f10 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc2f10;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x5151f544f60ca27e);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar8 != 0) {
              if (pvVar5 != (void *)0x0) {
                return;
              }
              if (_DAT_7ffc3ebc2f18 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba755e,uVar12);
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                uVar13 = FUN_7ffc3eb76c30(env,0x26);
                uStack_50 = FUN_7ffc3eb770c0(env,uVar12,6,uVar13,0x7ffc3eba64b2,0x7ffc3eba755e);
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3eba755e,uVar12);
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                         0x7ffc3eba7683,0x7ffc3eba768d,&uStack_58,3);
                if ((lVar9 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f18 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc2f18;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar6 = (*(*env)->NewObjectArray)(env,0,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2f20 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba74f1,0x7ffc3eba76b4,0,0);
                if ((lVar9 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f20 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2f20;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x515011d56b7257ac);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2f28 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba750c,0x7ffc3eba76fa,0,0);
                if ((lVar9 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f28 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2f28;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x5151f544f60ca27e);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
              FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc2f30 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba7527,0x7ffc3eba752a,0,0);
                if ((lVar9 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f30 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc2f30;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x5151f544f60ca27e);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar10);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
            }
            if (_DAT_7ffc3ebc2f38 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar12);
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              uVar13 = FUN_7ffc3eb76c30(env,0x26);
              uStack_50 = FUN_7ffc3eb770c0(env,uVar12,6,uVar13,0x7ffc3eba7733,0x7ffc3eba772f);
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar12);
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                       0x7ffc3eba7735,0x7ffc3eba7739,&uStack_58,3);
              if ((lVar9 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc2f38 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc2f38;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar11 = (*(*env)->NewObjectArray)(env,0,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2f40 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72ee,0x7ffc3eba72e8,0,0);
              if ((lVar9 != 0) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc2f40 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
            }
            pvVar11 = _DAT_7ffc3ebc2f40;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0xa5e);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar15);
            pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar7 ^ 0x24c10bc23bf85f70);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
            uVar12 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar12 = FUN_7ffc3e7d1a20(env,uVar12,uRam00007ffc3ebc0968);
            if (_DAT_7ffc3ebc2f48 == (void *)0x0) {
              uVar13 = FUN_7ffc3eb76c30(env,0x26);
              lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba74df,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72ee,0x7ffc3eba72e8,0,0);
              if ((lVar9 != 0) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc2f48 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
            }
            pvVar11 = _DAT_7ffc3ebc2f48;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x973);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar15);
            pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar7 ^ 0x5cfee915c05cdc5e);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar13 = FUN_7ffc3e7d1a20(env,uVar13,uRam00007ffc3ebc0968);
            if (_DAT_7ffc3ebc2f50 == (void *)0x0) {
              uVar17 = FUN_7ffc3eb76c30(env,0x26);
              lVar9 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba7527,0x7ffc3eba7750,0,0);
              if ((lVar9 != 0) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc2f50 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
            }
            pvVar11 = _DAT_7ffc3ebc2f50;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x5152f826b94dc7b4);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar15);
            pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
            pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2f58 == (void *)0x0) {
              uVar17 = FUN_7ffc3eb76c30(env,0x26);
              lVar9 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba74ee,0x7ffc3eba7774,0,0);
              if ((lVar9 != 0) &&
                 (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                 pvVar14 != (void *)0x0)) {
                _DAT_7ffc3ebc2f58 = (*(*env)->NewGlobalRef)(env,pvVar14);
              }
            }
            pvVar14 = _DAT_7ffc3ebc2f58;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar15 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar5);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar6);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar5);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,4,pvVar11);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x5150c6593d7d9515);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,5,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,6,pvVar5);
            FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (receiver == (void *)0x0) goto LAB_7ffc3e7e686a;
            lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e0,0x59);
            if (lVar9 == 0) {
LAB_7ffc3e7e543f:
              pJVar18 = *env;
LAB_7ffc3e7e5442:
              pvVar5 = (*pJVar18->ExceptionOccurred)(env);
LAB_7ffc3e7e5448:
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
              pJVar18 = *env;
            }
            else {
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,receiver,lVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (_DAT_7ffc3ebc2f60 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba74ee,0x7ffc3eba77d7,0,0);
                if ((lVar9 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f60 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2f60;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x515cc996283e11ed);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (_DAT_7ffc3ebc2f68 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba6299,0x7ffc3eba606c,
                                         0x7ffc3eba7805,0x7ffc3eba629d,0,0);
                if ((lVar9 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f68 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2f68;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x6fc6);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar14);
              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar7 ^ 0x7440397c90933a2f);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar14);
              pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (_DAT_7ffc3ebc2f70 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba74ee,0x7ffc3eba7807,0,0);
                if ((lVar9 != 0) &&
                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar11 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f70 = (*(*env)->NewGlobalRef)(env,pvVar11);
                }
              }
              pvVar11 = _DAT_7ffc3ebc2f70;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar5);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar6);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x515136fff68fc9c9);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar5);
              uVar12 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2a);
              pJVar18 = *env;
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3e7e5442;
              pvVar6 = (*pJVar18->AllocObject)(env,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x2b);
              pJVar18 = *env;
              if (pvVar11 == (void *)0x0) goto LAB_7ffc3e7e5442;
              pvVar14 = (*pJVar18->AllocObject)(env,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (_DAT_7ffc3ebc2f78 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba7527,0x7ffc3eba7845,0,0);
                if ((lVar9 != 0) &&
                   (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar15 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f78 = (*(*env)->NewGlobalRef)(env,pvVar15);
                }
              }
              pvVar15 = _DAT_7ffc3ebc2f78;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              arg1 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x5152776ab2cc61a1);
              (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar16);
              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar10);
              (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar16);
              uVar13 = FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,arg1);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (pvVar14 == (void *)0x0) {
LAB_7ffc3e7e686a:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3e7e543f;
              }
              lVar9 = FUN_7ffc3eb76c90(env,pvVar11,0x67);
              if (lVar9 == 0) goto LAB_7ffc3e7e543f;
              FUN_7ffc3e7dbbc0(env,pvVar14,pvVar11,lVar9,uVar12,uVar13);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7e686a;
              lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x68);
              if (lVar9 == 0) goto LAB_7ffc3e7e543f;
              FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar9,pvVar14,uVar13);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (_DAT_7ffc3ebc2f80 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba74ee,0x7ffc3eba6128,0,0);
                if ((lVar9 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f80 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc2f80;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x51537c1b4317990a);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (_DAT_7ffc3ebc2f88 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba74ee,0x7ffc3eba6128,0,0);
                if ((lVar9 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f88 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2f88;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x51508f77d465d926);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e7e543f;
              if (lVar8 == 0) {
LAB_7ffc3e7e5269:
                pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x28);
                pJVar18 = *env;
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e7e5442;
                pvVar6 = (*pJVar18->AllocObject)(env,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e543f;
                if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7e686a;
                lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0x66);
                if (lVar8 == 0) goto LAB_7ffc3e7e543f;
                FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e543f;
                pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x29);
                pvVar5 = (*(*env)->NewObjectArray)(env,0,pvVar5,(void *)0x0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e543f;
                if (_DAT_7ffc3ebc2fd8 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x26);
                  lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3eba74ee,0x7ffc3eba626f,0,0);
                  if ((lVar8 != 0) &&
                     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar11 != (void *)0x0)) {
                    _DAT_7ffc3ebc2fd8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                  }
                }
                pvVar11 = _DAT_7ffc3ebc2fd8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e543f;
                pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar6);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x515c71fd69d92c34);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar10);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar5);
                FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                pJVar18 = *env;
                if (bVar1 != 0) goto LAB_7ffc3e7e6a47;
LAB_7ffc3e7e543b:
                (*pJVar18->Throw)(env,pvVar6);
                goto LAB_7ffc3e7e543f;
              }
              if (_DAT_7ffc3ebc2f90 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,0x26);
                lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba74ee,0x7ffc3eba64b4,0,0);
                if ((lVar8 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2f90 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2f90;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x5151736af10aa234);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar10);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
                uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e6889;
                iVar2 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                if (_DAT_7ffc3ebc2f98 == (void *)0x0) {
                  uVar12 = FUN_7ffc3eb76c30(env,0x26);
                  lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba6478,0x7ffc3eba606c
                                           ,0x7ffc3eba74db,0x7ffc3eba647c,0,0);
                  if ((lVar8 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc2f98 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc2f98;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e6889;
                pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   0x5e3a);
                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar7 ^ 0x2d2ec0b8a21a29b0);
                (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
                uVar12 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e7e6889;
                iVar3 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                if (iVar2 != iVar3) {
                  if (_DAT_7ffc3ebc2fc8 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x26);
                    lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba74f1,0x7ffc3eba74f4,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc2fc8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc2fc8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,0x5150498f58701abe);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,uVar10);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
                    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc2fd0 == (void *)0x0) {
                        uVar12 = FUN_7ffc3eb76c30(env,0x26);
                        lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba74ee,0x7ffc3eba7293,0,0);
                        if ((lVar8 != 0) &&
                           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar6 != (void *)0x0)) {
                          _DAT_7ffc3ebc2fd0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                        }
                      }
                      pvVar6 = _DAT_7ffc3ebc2fd0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
                        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                          uRam00007ffc3ebc0998,1);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x5153b25b92e5d929);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
                        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar10);
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar5);
                        FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) goto LAB_7ffc3e7e5269;
                      }
                    }
                  }
                  goto LAB_7ffc3e7e543f;
                }
                pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2c);
                pJVar18 = *env;
                if (pvVar5 != (void *)0x0) {
                  pvVar6 = (*pJVar18->AllocObject)(env,pvVar5);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar6 == (void *)0x0) goto LAB_7ffc3e7e6957;
                    lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0x69);
                    if (lVar8 != 0) {
                      FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8,uVar7 ^ 0x3324d4121566);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (_DAT_7ffc3ebc2fa0 == (void *)0x0) {
                          uVar12 = FUN_7ffc3eb76c30(env,0x26);
                          lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,
                                                   0x7ffc3eba606c,0x7ffc3eba750c,0x7ffc3eba7864,0,0)
                          ;
                          if ((lVar8 != 0) &&
                             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                             pvVar5 != (void *)0x0)) {
                            _DAT_7ffc3ebc2fa0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                          }
                        }
                        pvVar5 = _DAT_7ffc3ebc2fa0;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar11 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x5152165f86187d13)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar10);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar6);
                          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar11);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (_DAT_7ffc3ebc2fa8 == (void *)0x0) {
                              uVar12 = FUN_7ffc3eb76c30(env,0x26);
                              lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,
                                                       0x7ffc3eba606c,0x7ffc3eba7527,0x7ffc3eba6456,
                                                       0,0);
                              if ((lVar8 != 0) &&
                                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                                 pvVar5 != (void *)0x0)) {
                                _DAT_7ffc3ebc2fa8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                              }
                            }
                            pvVar5 = _DAT_7ffc3ebc2fa8;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar6 = (*(*env)->NewObjectArray)
                                                 (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 0x5152165f86187d13);
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
                              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,uVar10);
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
                              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,
                                                                pvVar6);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                if (_DAT_7ffc3ebc2fb0 == (void *)0x0) {
                                  uVar12 = FUN_7ffc3eb76c30(env,0x26);
                                  lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,
                                                           0x7ffc3eba6299,0x7ffc3eba606c,
                                                           0x7ffc3eba7805,0x7ffc3eba629d,0,0);
                                  if ((lVar8 != 0) &&
                                     (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                        uRam00007ffc3ebc0a00),
                                     pvVar6 != (void *)0x0)) {
                                    _DAT_7ffc3ebc2fb0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                                  }
                                }
                                pvVar6 = _DAT_7ffc3ebc2fb0;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar11 = (*(*env)->NewObjectArray)
                                                      (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                     uRam00007ffc3ebc0998,0x5eda);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar14);
                                  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     uVar7 ^ 0x141a3b3010c28b32);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar14);
                                  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,
                                                                    pvVar11);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    if (_DAT_7ffc3ebc2fb8 == (void *)0x0) {
                                      uVar12 = FUN_7ffc3eb76c30(env,0x26);
                                      lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,
                                                               0x7ffc3eba6478,0x7ffc3eba606c,
                                                               0x7ffc3eba74db,0x7ffc3eba647c,0,0);
                                      if ((lVar8 != 0) &&
                                         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar11 != (void *)0x0)) {
                                        _DAT_7ffc3ebc2fb8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                      }
                                    }
                                    pvVar11 = _DAT_7ffc3ebc2fb8;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      pvVar14 = (*(*env)->NewObjectArray)
                                                          (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                         uRam00007ffc3ebc0998,0x7715
                                                                        );
                                      (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar15);
                                      pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,
                                                                         uVar7 ^ 0x7a6b113f4f07809c)
                                      ;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
                                      uVar12 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,
                                                                pvVar14);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        uVar4 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
                                        pvVar11 = (*(*env)->NewObjectArray)
                                                            (env,3,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if ((bVar1 == 0) &&
                                           (lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7),
                                           lVar8 != 0)) {
                                          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,lVar8,uVar4);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            if (pvVar11 == (void *)0x0) {
LAB_7ffc3e7e6957:
                                              pJVar18 = *env;
                                              arg2 = &DAT_7ffc3eba6000;
                                              pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e7e6985:
                                              (*pJVar18->ThrowNew)(env,pvVar5,arg2);
                                            }
                                            else {
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar11 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
                                              }
                                              if (iVar2 < 3) goto LAB_7ffc3e7e696d;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar11,2,pvVar14);
                                              lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                                              if (lVar8 != 0) {
                                                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar8,uVar7 ^ 0x18aaab787021)
                                                ;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 == 0) {
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar11 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
                                                  }
                                                  if (1 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar11,1,pvVar14);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar11 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar11)
                                                      ;
                                                    }
                                                    if (0 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar11,0,pvVar6);
                                                      if (_DAT_7ffc3ebc2fc0 == (void *)0x0) {
                                                        uVar12 = FUN_7ffc3eb76c30(env,0x26);
                                                        lVar8 = FUN_7ffc3eb77170(env,uVar12,6,
                                                                                 0x7ffc3eba74df,
                                                                                 0x7ffc3eba718e,
                                                                                 0x7ffc3eba606c,
                                                                                 0x7ffc3eba74ee,
                                                                                 0x7ffc3eba626f,0,0)
                                                        ;
                                                        if ((lVar8 != 0) &&
                                                           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc2fc0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar6);
                                                  }
                                                  }
                                                  pvVar6 = _DAT_7ffc3ebc2fc0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar14 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar14,0,pvVar5);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar14,1,pvVar11);
                                                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x51519c1acae70486);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar14,2,pvVar5);
                                                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar14,3,pvVar5);
                                                  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,
                                                                   pvVar14);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x27);
                                                    pJVar18 = *env;
                                                    if (pvVar5 == (void *)0x0)
                                                    goto LAB_7ffc3e7e6991;
                                                    pvVar6 = (*pJVar18->AllocObject)(env,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (pvVar6 == (void *)0x0)
                                                      goto LAB_7ffc3e7e6957;
                                                      lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0x6a);
                                                      if (lVar8 != 0) {
                                                        FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8,
                                                                         uVar7 ^ 0x6178ca938806);
                                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                                        if (bVar1 == 0) {
                                                          lVar8 = FUN_7ffc3eb76c30(env,0xb);
                                                          if ((lVar8 != 0) &&
                                                             (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xb
                                                                                      ), lVar9 != 0)
                                                             ) {
                                                            lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9
                                                                                    );
                                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                                            if (bVar1 == 0) {
                                                              if (lVar8 != 0) {
                                                                return;
                                                              }
                                                              pvVar5 = (*(*env)->NewObjectArray)
                                                                                 (env,3,
                                                  pvRam00007ffc3ebc09e8,(void *)0x0);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (((bVar1 == 0) &&
                                                      (lVar8 = FUN_7ffc3eb76c30(env,0x27),
                                                      lVar8 != 0)) &&
                                                     (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x6b),
                                                     lVar9 != 0)) {
                                                    FUN_7ffc3e7e6a80(env,lVar8,lVar9,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  }
                                                  }
                                                  pvVar5 = (*(*env)->ExceptionOccurred)(env);
                                                  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
                                                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6)
                                                  ;
                                                  if (bVar1 == 0) {
                                                    return;
                                                  }
                                                  (*(*env)->ExceptionClear)(env);
                                                  lVar8 = FUN_7ffc3eb76c30(env,0x26);
                                                  if (lVar8 == 0) {
                                                    return;
                                                  }
                                                  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x65);
                                                  if (lVar9 == 0) {
                                                    return;
                                                  }
                                                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,
                                                                                    pvVar5);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) {
                                                    return;
                                                  }
                                                  pJVar18 = *env;
                                                  goto LAB_7ffc3e7e586a;
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  goto LAB_7ffc3e7e698b;
                                                  }
                                                  }
LAB_7ffc3e7e696d:
                                                  pJVar18 = *env;
                                                  arg2 = (char *)0x7ffc3eba6019;
                                                  pvVar5 = pvRam00007ffc3ebc0a98;
                                                  goto LAB_7ffc3e7e6985;
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
                      }
                    }
                  }
                  goto LAB_7ffc3e7e698b;
                }
LAB_7ffc3e7e6991:
                pvVar5 = (*pJVar18->ExceptionOccurred)(env);
LAB_7ffc3e7e6994:
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                if (bVar1 == 0) goto LAB_7ffc3e7e6a2c;
LAB_7ffc3e7e69bb:
                (*(*env)->ExceptionClear)(env);
                lVar8 = FUN_7ffc3eb76c30(env,0x26);
                if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x65), lVar9 == 0))
                goto LAB_7ffc3e7e543f;
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                pJVar18 = *env;
                if (bVar1 == 0) goto LAB_7ffc3e7e543b;
LAB_7ffc3e7e6a47:
                pvVar5 = (*pJVar18->ExceptionOccurred)(env);
                goto LAB_7ffc3e7e5448;
              }
LAB_7ffc3e7e6889:
              pvVar5 = (*(*env)->ExceptionOccurred)(env);
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
              if (bVar1 != 0) goto LAB_7ffc3e7e69bb;
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
              if (bVar1 != 0) {
                (*(*env)->ExceptionClear)(env);
                lVar8 = FUN_7ffc3eb76c30(env,0x26);
                if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x65), lVar9 == 0)) {
LAB_7ffc3e7e698b:
                  pJVar18 = *env;
                  goto LAB_7ffc3e7e6991;
                }
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  (*(*env)->Throw)(env,pvVar5);
                  goto LAB_7ffc3e7e698b;
                }
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
                goto LAB_7ffc3e7e6994;
              }
LAB_7ffc3e7e6a2c:
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
              pJVar18 = *env;
            }
            bVar1 = (*pJVar18->IsInstanceOf)(env,pvVar5,pvVar6);
            if (bVar1 == 0) {
              return;
            }
            (*(*env)->ExceptionClear)(env);
            if (_DAT_7ffc3ebc2fe0 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba74f1,0x7ffc3eba74f4,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc2fe0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc2fe0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x5150498f58701abe);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2fe8 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba74ee,0x7ffc3eba7293,0,0);
              if ((lVar8 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc2fe8 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc2fe8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,1);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x5153b25b92e5d929);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar5);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x28);
            if (pvVar5 == (void *)0x0) {
              return;
            }
            pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar6 == (void *)0x0) {
              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
              return;
            }
            lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0x66);
            if (lVar8 == 0) {
              return;
            }
            FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x29);
            pvVar5 = (*(*env)->NewObjectArray)(env,0,pvVar5,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2ff0 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,0x26);
              lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba74ee,0x7ffc3eba626f,0,0);
              if ((lVar8 != 0) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc2ff0 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
            }
            pvVar11 = _DAT_7ffc3ebc2ff0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar6);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x515c71fd69d92c34);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar5);
            FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pJVar18 = *env;
LAB_7ffc3e7e586a:
            (*pJVar18->Throw)(env,pvVar6);
            return;
          }
        }
      }
    }
  }
  else {
    if (arg0 == (void *)0x0) {
LAB_7ffc3e7e40fa:
      if (_DAT_7ffc3ebc2ef0 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x26);
        lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba74f1,0x7ffc3eba74f4,0,0);
        if ((lVar8 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2ef0 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc2ef0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x5150498f58701abe);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2ef8 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x26);
        lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba74ee,0x7ffc3eba7293,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2ef8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc2ef8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,1);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x5153b25b92e5d929);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar5);
      FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x28);
      if (pvVar5 == (void *)0x0) {
        return;
      }
      pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar6 == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7e6867. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
        return;
      }
      lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0x66);
      if (lVar8 == 0) {
        return;
      }
      FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x29);
      pvVar5 = (*(*env)->NewObjectArray)(env,0,pvVar5,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc2f00 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,0x26);
        lVar8 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba74ee,0x7ffc3eba626f,0,0);
        if ((lVar8 != 0) &&
           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
           pvVar11 != (void *)0x0)) {
          _DAT_7ffc3ebc2f00 = (*(*env)->NewGlobalRef)(env,pvVar11);
        }
      }
      pvVar11 = _DAT_7ffc3ebc2f00;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar6);
      (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x515c71fd69d92c34);
      (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar5);
      FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      UNRECOVERED_JUMPTABLE = (*env)->Throw;
      goto LAB_7ffc3e7e4788;
    }
    if (_DAT_7ffc3ebc2ee0 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,0x26);
      lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba74ee,0x7ffc3eba64b4,0,0);
      if ((lVar9 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc2ee0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc2ee0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,arg0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x5151736af10aa234);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar11);
      uVar12 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        iVar2 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
        if (_DAT_7ffc3ebc2ee8 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,0x26);
          lVar9 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3eba74df,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba647c,0,0);
          if ((lVar9 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc2ee8 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc2ee8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2a9e);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar7 ^ 0x542d922e19a65d16);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
          uVar12 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            iVar3 = FUN_7ffc3e7d8be0(env,uVar12,uRam00007ffc3ebc09d0);
            if (iVar2 == iVar3) goto LAB_7ffc3e7e2601;
            goto LAB_7ffc3e7e40fa;
          }
        }
      }
    }
  }
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x26);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x65), lVar9 != 0)) {
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        UNRECOVERED_JUMPTABLE = (*env)->Throw;
LAB_7ffc3e7e4788:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7e479b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)(env,pvVar6);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_0r_4_1 | RVA 0x16ab0 | dev/krypton/0r.4()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_0r_4_1(longlong *param_1,undefined8 param_2)

{
  char cVar1;
  ulonglong uVar2;
  longlong lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  longlong lVar6;
  longlong lVar7;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  
  uVar2 = FUN_7ffc3eb76c30(param_1,0x26);
  if (uVar2 == 0) {
    return;
  }
  lVar3 = FUN_7ffc3eb76ce0(param_1,uVar2,0x13);
  if (lVar3 == 0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar2 = *(ulonglong *)
             (*(longlong *)(uVar2 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar3 + 0x10));
  }
  else {
    uVar2 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar2,lVar3);
  }
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  if (((_DAT_7ffc3ebc0c38 == 0) &&
      (lVar3 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                0x7ffc3eba74f1,0x7ffc3eba730b,0,0), lVar3 != 0)) &&
     (lVar3 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a00), lVar3 != 0)) {
    _DAT_7ffc3ebc0c38 = (**(code **)(*param_1 + 0xa8))(param_1,lVar3);
  }
  lVar3 = _DAT_7ffc3ebc0c38;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar8 = uVar2 ^ 0x3b63ca4a56dc;
  uVar4 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
  uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xa9f3447f42338ac4);
  (**(code **)(*param_1 + 0x570))(param_1,uVar4,0,uVar5);
  uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
  (**(code **)(*param_1 + 0x570))(param_1,uVar4,1,uVar5);
  uVar4 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a40,uVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  lVar3 = FUN_7ffc3e7d1a20(param_1,uVar4,uRam00007ffc3ebc0968);
  lVar6 = FUN_7ffc3eb76c30(param_1,0x27);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(param_1,lVar6,100);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar7);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  if (((_DAT_7ffc3ebc0c40 == 0) &&
      (lVar7 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                0x7ffc3eba7527,0x7ffc3eba786e,0,0), lVar7 != 0)) &&
     (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
    _DAT_7ffc3ebc0c40 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
  }
  lVar7 = _DAT_7ffc3ebc0c40;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar4 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
  uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xa9f3ffd2b004cb3c);
  (**(code **)(*param_1 + 0x570))(param_1,uVar4,0,uVar5);
  uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
  (**(code **)(*param_1 + 0x570))(param_1,uVar4,1,uVar5);
  uVar4 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  if (((_DAT_7ffc3ebc0c48 == 0) &&
      (lVar7 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                0x7ffc3eba74ee,0x7ffc3eba789b,0,0), lVar7 != 0)) &&
     (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
    _DAT_7ffc3ebc0c48 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
  }
  lVar7 = _DAT_7ffc3ebc0c48;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar5 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
  (**(code **)(*param_1 + 0x570))(param_1,uVar5,0,uVar4);
  uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,lVar3);
  (**(code **)(*param_1 + 0x570))(param_1,uVar5,1,uVar4);
  uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xa9fdeafb85dfc623);
  (**(code **)(*param_1 + 0x570))(param_1,uVar5,2,uVar4);
  uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
  (**(code **)(*param_1 + 0x570))(param_1,uVar5,3,uVar4);
  uVar4 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar5);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  lVar7 = FUN_7ffc3e7d1a20(param_1,uVar4,uRam00007ffc3ebc0968);
  if (lVar6 == 0) {
LAB_7ffc3e7e71f3:
    lVar3 = FUN_7ffc3eb76c30(param_1,0x28);
    if (lVar3 == 0) {
      return;
    }
    lVar6 = (**(code **)(*param_1 + 0xd8))(param_1,lVar3);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (lVar6 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7e79c5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(param_1,lVar3,0x66);
    if (lVar7 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar6,lVar3,lVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar4 = FUN_7ffc3eb76c30(param_1,0x29);
    uVar4 = (**(code **)(*param_1 + 0x560))(param_1,0,uVar4,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (((_DAT_7ffc3ebc0c68 == 0) &&
        (lVar3 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                  0x7ffc3eba74ee,0x7ffc3eba626f,0,0), lVar3 != 0)) &&
       (lVar3 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a00), lVar3 != 0)) {
      _DAT_7ffc3ebc0c68 = (**(code **)(*param_1 + 0xa8))(param_1,lVar3);
    }
    lVar3 = _DAT_7ffc3ebc0c68;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar5 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar5,0,lVar6);
    (**(code **)(*param_1 + 0x570))(param_1,uVar5,1,uVar4);
    uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xa9f3039377bfd49b);
    (**(code **)(*param_1 + 0x570))(param_1,uVar5,2,uVar4);
    uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar5,3,uVar4);
    FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a40,uVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x68);
    goto LAB_7ffc3e7e75b9;
  }
  if (((_DAT_7ffc3ebc0c50 == 0) &&
      (lVar6 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3eba72ee,0x7ffc3eba72e8,0,0), lVar6 != 0)) &&
     (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
    _DAT_7ffc3ebc0c50 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
  }
  lVar6 = _DAT_7ffc3ebc0c50;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 == '\0') {
    uVar4 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
    uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x1f9e);
    (**(code **)(*param_1 + 0x570))(param_1,uVar4,0,uVar5);
    uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                             uVar2 ^ 0x4019155b2ec04ab1);
    (**(code **)(*param_1 + 0x570))(param_1,uVar4,1,uVar5);
    uVar4 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3e7e7851;
    lVar6 = FUN_7ffc3e7d1a20(param_1,uVar4,uRam00007ffc3ebc0968);
    if (lVar3 - lVar7 <= lVar6) {
      return;
    }
    if (((_DAT_7ffc3ebc0c58 == 0) &&
        (lVar3 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c,
                                  0x7ffc3eba74f1,0x7ffc3eba74f4,0,0), lVar3 != 0)) &&
       (lVar3 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a00), lVar3 != 0)) {
      _DAT_7ffc3ebc0c58 = (**(code **)(*param_1 + 0xa8))(param_1,lVar3);
    }
    lVar3 = _DAT_7ffc3ebc0c58;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      uVar4 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xa9ff3be14616e211)
      ;
      (**(code **)(*param_1 + 0x570))(param_1,uVar4,0,uVar5);
      uVar5 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
      (**(code **)(*param_1 + 0x570))(param_1,uVar4,1,uVar5);
      uVar4 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a40,uVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
        if (((_DAT_7ffc3ebc0c60 == 0) &&
            (lVar3 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,0x7ffc3eba606c
                                      ,0x7ffc3eba74ee,0x7ffc3eba7293,0,0), lVar3 != 0)) &&
           (lVar3 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a00), lVar3 != 0)) {
          _DAT_7ffc3ebc0c60 = (**(code **)(*param_1 + 0xa8))(param_1,lVar3);
        }
        lVar3 = _DAT_7ffc3ebc0c60;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          uVar5 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar5,0,uVar4);
          uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,1);
          (**(code **)(*param_1 + 0x570))(param_1,uVar5,1,uVar4);
          uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0xa9fcc0358c832186);
          (**(code **)(*param_1 + 0x570))(param_1,uVar5,2,uVar4);
          uVar4 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
          (**(code **)(*param_1 + 0x570))(param_1,uVar5,3,uVar4);
          FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a40,uVar5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') goto LAB_7ffc3e7e71f3;
        }
      }
    }
LAB_7ffc3e7e78ed:
    uVar4 = (**(code **)(*param_1 + 0x78))(param_1);
  }
  else {
LAB_7ffc3e7e7851:
    uVar4 = (**(code **)(*param_1 + 0x78))(param_1);
    uVar5 = FUN_7ffc3eb76c30(param_1,0x24);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar4,uVar5);
    if (cVar1 != '\0') {
      (**(code **)(*param_1 + 0x88))(param_1);
      lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
      if ((lVar3 != 0) && (lVar6 = FUN_7ffc3eb76c90(param_1,lVar3,0x65), lVar6 != 0)) {
        uVar4 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar6,uVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          uVar4 = (**(code **)(*param_1 + 0x78))(param_1);
          goto LAB_7ffc3e7e78f9;
        }
        (**(code **)(*param_1 + 0x68))(param_1,uVar4);
      }
      goto LAB_7ffc3e7e78ed;
    }
  }
LAB_7ffc3e7e78f9:
  uVar5 = FUN_7ffc3eb76c30(param_1,0x24);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar4,uVar5);
  if (cVar1 != '\0') {
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
    if ((lVar3 != 0) && (lVar6 = FUN_7ffc3eb76c90(param_1,lVar3,0x65), lVar6 != 0)) {
      lVar6 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar6,uVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x68);
LAB_7ffc3e7e75b9:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7e75c9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)(param_1,lVar6);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_0r_0_2 | RVA 0x179e0 | dev/krypton/0r.0(Ljava/lang/Runnable;)Ljava/lang/Thread; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_0r_0_2(longlong *param_1,undefined8 param_2,undefined8 param_3)

{
  char cVar1;
  ulonglong uVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  uVar2 = FUN_7ffc3eb76c30(param_1,0x26);
  if ((uVar2 != 0) && (lVar3 = FUN_7ffc3eb76ce0(param_1,uVar2,0x13), lVar3 != 0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar2 = *(ulonglong *)
               (*(longlong *)(uVar2 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar3 + 0x10));
    }
    else {
      uVar2 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar2,lVar3);
    }
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if ((cVar1 == '\0') && (lVar3 = FUN_7ffc3eb76c30(param_1,0x10), lVar3 != 0)) {
      lVar4 = (**(code **)(*param_1 + 0xd8))(param_1,lVar3);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
        if (lVar4 == 0) {
          (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
        }
        else {
          lVar5 = FUN_7ffc3eb76c90(param_1,lVar3,0x6c);
          if (lVar5 != 0) {
            FUN_7ffc3e7dbbc0(param_1,lVar4,lVar3,lVar5,param_3);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              if (((_DAT_7ffc3ebc7b38 == 0) &&
                  (lVar3 = FUN_7ffc3eb77170(param_1,param_2,6,0x7ffc3eba74df,0x7ffc3eba718e,
                                            0x7ffc3eba606c,0x7ffc3eba74ee,0x7ffc3eba72ac,0,0),
                  lVar3 != 0)) &&
                 (lVar3 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a00), lVar3 != 0)) {
                _DAT_7ffc3ebc7b38 = (**(code **)(*param_1 + 0xa8))(param_1,lVar3);
              }
              lVar3 = _DAT_7ffc3ebc7b38;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                uVar6 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                (**(code **)(*param_1 + 0x570))(param_1,uVar6,0,lVar4);
                uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,1);
                (**(code **)(*param_1 + 0x570))(param_1,uVar6,1,uVar7);
                uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x9d3a4257f4a3f601);
                (**(code **)(*param_1 + 0x570))(param_1,uVar6,2,uVar7);
                uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         uVar2 ^ 0x35d440e7621a);
                (**(code **)(*param_1 + 0x570))(param_1,uVar6,3,uVar7);
                FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a40,uVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  return lVar4;
                }
              }
            }
          }
        }
      }
    }
  }
  return 0;
}

/* JNI_dev_krypton_0r_a_3 | RVA 0x17d10 | dev/krypton/0r.a(Ljava/lang/Exception;)Ljava/lang/Exception; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_0r_a_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_0r_a_4 | RVA 0x17d20 | dev/krypton/0r.a([B)Ljava/lang/String; | success */

longlong JNI_dev_krypton_0r_a_4(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  char cVar5;
  int iVar6;
  int iVar7;
  ulonglong uVar8;
  byte *pbVar9;
  longlong lVar10;
  longlong lVar11;
  ushort *puVar12;
  undefined8 uVar13;
  ushort uVar14;
  undefined *puVar15;
  ulonglong uVar16;
  undefined4 uVar17;
  ulonglong uVar18;
  uint uVar19;
  byte bStack_79;
  longlong *plStack_78;
  ushort uStack_6a;
  ushort uStack_68;
  ushort uStack_66;
  byte bStack_63;
  byte bStack_62;
  byte bStack_61;
  longlong *plStack_60;
  int iStack_54;
  ulonglong uStack_50;
  ulonglong uStack_48;
  
  if (param_3 != 0) {
    if (bRam00007ffc3ebc08e5 == 1) {
      uVar19 = *(uint *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      uVar19 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if ((int)uVar19 < 0) {
      lVar10 = *param_1;
      puVar15 = (undefined *)0x7ffc3eba6048;
      uVar13 = uRam00007ffc3ebc0a80;
      goto LAB_7ffc3e7e82b6;
    }
    uVar8 = (**(code **)(*param_1 + 0x588))(param_1,(ulonglong)uVar19);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (uVar19 != 0) {
      plStack_78 = (longlong *)(param_3 & 0xfffffffffffffffc);
      plStack_60 = (longlong *)(uVar8 & 0xfffffffffffffffc);
      uStack_48 = (ulonglong)uVar19;
      iStack_54 = uVar19 - 2;
      uVar16 = 0;
      uVar19 = 0;
      uStack_50 = param_3;
LAB_7ffc3e7e7e0e:
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar6 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if ((int)uVar19 < iVar6) {
        if (bRam00007ffc3ebc08e5 == 1) {
          pbVar9 = (byte *)((ulonglong)uVar19 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
        }
        else {
          pbVar9 = &bStack_61;
          (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar19,1,pbVar9);
        }
        bVar2 = *pbVar9;
        uVar14 = (ushort)bVar2;
        iVar6 = (int)uVar16;
        if (bVar2 < 0xc0) {
          if (uVar8 == 0) goto LAB_7ffc3e7e82c0;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar7 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if ((iVar6 < 0) || (iVar7 <= iVar6)) goto LAB_7ffc3e7e829e;
          uVar18 = (ulonglong)(iVar6 + 1);
          uStack_66 = (ushort)bVar2;
          if (bRam00007ffc3ebc08e5 == 1) {
LAB_7ffc3e7e7de0:
            *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar16 * 2) = uVar14;
            uVar16 = uVar18;
          }
          else {
            lVar10 = *param_1;
            puVar12 = &uStack_66;
LAB_7ffc3e7e8051:
            (**(code **)(lVar10 + 0x688))(param_1,uVar8,uVar16,1,puVar12);
            uVar16 = uVar18;
          }
LAB_7ffc3e7e7dfc:
          uVar19 = uVar19 + 1;
          uVar17 = (undefined4)uVar16;
          if ((uint)uStack_48 <= uVar19) goto LAB_7ffc3e7e820f;
          goto LAB_7ffc3e7e7e0e;
        }
        if (bVar2 < 0xe0) {
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar7 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          uVar19 = uVar19 + 1;
          if ((int)uVar19 < iVar7) {
            if (bRam00007ffc3ebc08e5 == 1) {
              pbVar9 = (byte *)((ulonglong)uVar19 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
            }
            else {
              pbVar9 = &bStack_62;
              (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar19,1,pbVar9);
            }
            if (uVar8 == 0) goto LAB_7ffc3e7e82c0;
            bVar3 = *pbVar9;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar7 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if ((-1 < iVar6) && (iVar6 < iVar7)) {
              uVar14 = bVar3 & 0x3f | (ushort)(((int)(char)bVar2 & 0x1fU) << 6);
              uVar18 = (ulonglong)(iVar6 + 1);
              uStack_68 = uVar14;
              if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7e7de0;
              lVar10 = *param_1;
              puVar12 = &uStack_68;
              goto LAB_7ffc3e7e8051;
            }
          }
        }
        else {
          if (iStack_54 <= (int)uVar19) goto LAB_7ffc3e7e7dfc;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar7 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          uVar1 = uVar19 + 1;
          if (iVar7 <= (int)uVar1) goto LAB_7ffc3e7e829e;
          if (bRam00007ffc3ebc08e5 == 1) {
            pbVar9 = (byte *)((ulonglong)uVar1 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
          }
          else {
            pbVar9 = &bStack_63;
            (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar1,1,pbVar9);
          }
          bVar3 = *pbVar9;
          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          else {
            iVar7 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          uVar19 = uVar19 + 2;
          if ((int)uVar19 < iVar7) {
            if (bRam00007ffc3ebc08e5 == 1) {
              pbVar9 = (byte *)((ulonglong)uVar19 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
            }
            else {
              (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar19,1,&bStack_79);
              pbVar9 = &bStack_79;
            }
            if (uVar8 == 0) goto LAB_7ffc3e7e82c0;
            bVar4 = *pbVar9;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar7 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if ((-1 < iVar6) && (iVar6 < iVar7)) {
              uStack_6a = bVar4 & 0x3f | (bVar3 & 0x3f) << 6 | (ushort)((int)(char)bVar2 << 0xc);
              if (bRam00007ffc3ebc08e5 == 1) {
                *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar16 * 2) = uStack_6a;
                param_3 = uStack_50;
                uVar16 = (ulonglong)(iVar6 + 1);
              }
              else {
                (**(code **)(*param_1 + 0x688))(param_1,uVar8,uVar16,1,&uStack_6a);
                param_3 = uStack_50;
                uVar16 = (ulonglong)(iVar6 + 1);
              }
              goto LAB_7ffc3e7e7dfc;
            }
          }
        }
      }
LAB_7ffc3e7e829e:
      lVar10 = *param_1;
      puVar15 = (undefined *)0x7ffc3eba6019;
      uVar13 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7e82b6;
    }
    uVar17 = 0;
LAB_7ffc3e7e820f:
    lVar10 = (**(code **)(*param_1 + 0xd8))(param_1,uRam00007ffc3ebc09e8);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (lVar10 != 0) {
      lVar11 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x10);
      if (lVar11 == 0) {
        return 0;
      }
      FUN_7ffc3e7dbbc0(param_1,lVar10,uRam00007ffc3ebc09e8,lVar11,uVar8,0,uVar17);
      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar5 != '\0') {
        return 0;
      }
      return lVar10;
    }
  }
LAB_7ffc3e7e82c0:
  lVar10 = *param_1;
  puVar15 = &DAT_7ffc3eba6000;
  uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7e82b6:
  (**(code **)(lVar10 + 0x70))(param_1,uVar13,puVar15);
  return 0;
}

/* JNI_dev_krypton_0r_a_5 | RVA 0x182f0 | dev/krypton/0r.a(IJ)Ljava/lang/String; | success */

undefined8
JNI_dev_krypton_0r_a_5(longlong *param_1,undefined8 param_2,uint param_3,longlong param_4)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  uint uVar11;
  undefined *puVar12;
  byte bVar13;
  undefined1 uStack_5e;
  undefined1 uStack_5d;
  uint uStack_5c;
  ulonglong uStack_58;
  longlong lStack_50;
  longlong lStack_48;
  
  lStack_50 = param_4;
  lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar3 == 0) {
    return 0;
  }
  lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,0x14);
  if (lVar4 == 0) {
    return 0;
  }
  uVar5 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar5 == 0) goto LAB_7ffc3e7e9009;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
  }
  if ((-1 < (int)param_3) &&
     (uVar11 = param_3 ^ (uint)lStack_50 & 0x7fff ^ 0x2ac1, (int)uVar11 < iVar2)) {
    lVar3 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,uVar11);
    if (lVar3 == 0) {
      lVar3 = FUN_7ffc3eb76c30(param_1,0x10);
      if ((lVar3 == 0) || (lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x11), lVar4 == 0)) {
LAB_7ffc3e7e9193:
        lVar4 = *param_1;
LAB_7ffc3e7e9199:
        uVar9 = (**(code **)(lVar4 + 0x78))(param_1);
LAB_7ffc3e7e919c:
        uVar10 = FUN_7ffc3eb76c30(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar9,uVar10);
        if (cVar1 == '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x88))(param_1);
        lVar3 = FUN_7ffc3eb76c30(param_1,0x16);
        if (lVar3 == 0) {
          return 0;
        }
        lVar4 = (**(code **)(*param_1 + 0xd8))(param_1,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar10 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
        if (lVar4 != 0) {
          lVar6 = FUN_7ffc3eb76c90(param_1,lVar3,0x18);
          if (lVar6 == 0) {
            return 0;
          }
          FUN_7ffc3e7dbbc0(param_1,lVar4,lVar3,lVar6,uVar10,uVar9);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          (**(code **)(*param_1 + 0x68))(param_1,lVar4);
          return 0;
        }
      }
      else {
        lVar4 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') goto LAB_7ffc3e7e9193;
        if (lVar4 == 0) goto LAB_7ffc3e7e9142;
        lVar3 = FUN_7ffc3eb76c90(param_1,lVar3,0x12);
        if (lVar3 == 0) goto LAB_7ffc3e7e9193;
        uVar9 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 != '\0') ||
           (lVar3 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar3 == 0))
        goto LAB_7ffc3e7e9193;
        uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar3,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 != '\0') || (lVar3 = FUN_7ffc3eb76c30(param_1,0x26), lVar3 == 0))
        goto LAB_7ffc3e7e9193;
        lVar6 = FUN_7ffc3eb76ce0(param_1,lVar3,0x15);
        lVar4 = *param_1;
        if (lVar6 == 0) goto LAB_7ffc3e7e9199;
        lVar4 = (**(code **)(lVar4 + 0x488))(param_1,lVar3,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') goto LAB_7ffc3e7e9193;
        if (lVar4 == 0) goto LAB_7ffc3e7e9142;
        uVar5 = FUN_7ffc3eb76c30(param_1,0x11);
        if ((uVar5 == 0) || (lVar7 = FUN_7ffc3eb76c90(param_1,uVar5,0x13), lVar7 == 0))
        goto LAB_7ffc3e7e9193;
        uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar7,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 != '\0') || (lVar4 = FUN_7ffc3eb76c30(param_1,0x12), lVar4 == 0))
        goto LAB_7ffc3e7e9193;
        if (uVar8 == 0) {
          uStack_58 = uVar5;
          lStack_48 = lVar6;
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3e7e9193;
          uVar10 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6516);
          lVar4 = FUN_7ffc3eb76c30(param_1,0x13);
          if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x14), lVar6 == 0))
          goto LAB_7ffc3e7e9193;
          uVar10 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar6,uVar10);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3e7e9193;
          if (uVar8 == 0) goto LAB_7ffc3e7e9142;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (iVar2 < 1) {
LAB_7ffc3e7e9175:
            lVar3 = *param_1;
            puVar12 = (undefined *)0x7ffc3eba6019;
            uVar9 = uRam00007ffc3ebc0a98;
            goto LAB_7ffc3e7e918d;
          }
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar10);
          uVar10 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652b);
          lVar4 = FUN_7ffc3eb76c30(param_1,0x14);
          if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x15), lVar6 == 0))
          goto LAB_7ffc3e7e9193;
          uVar10 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar6,uVar10);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3e7e9193;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (iVar2 < 2) goto LAB_7ffc3e7e9175;
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar10);
          lVar6 = FUN_7ffc3eb76c30(param_1,0x15);
          lVar4 = *param_1;
          if (lVar6 == 0) goto LAB_7ffc3e7e9199;
          lVar4 = (**(code **)(lVar4 + 0xd8))(param_1,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            uVar10 = (**(code **)(*param_1 + 0x580))(param_1,8);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              if (lVar4 == 0) {
LAB_7ffc3e7e9142:
                lVar3 = *param_1;
                puVar12 = &DAT_7ffc3eba6000;
                uVar9 = uRam00007ffc3ebc0a70;
                goto LAB_7ffc3e7e918d;
              }
              lVar7 = FUN_7ffc3eb76c90(param_1,lVar6,0x16);
              if (lVar7 != 0) {
                FUN_7ffc3e7dbbc0(param_1,lVar4,lVar6,lVar7,uVar10);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                uVar5 = uStack_58;
                if (cVar1 == '\0') {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                  }
                  if (iVar2 < 3) goto LAB_7ffc3e7e9175;
                  (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,lVar4);
                  lVar3 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lStack_48);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (lVar3 == 0) goto LAB_7ffc3e7e9142;
                    lVar4 = FUN_7ffc3eb76c90(param_1,uVar5,0x17);
                    if (lVar4 != 0) {
                      FUN_7ffc3e7d1a50(param_1,lVar3,lVar4,uVar9,uVar8);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 == '\0') goto LAB_7ffc3e7e89fe;
                    }
                  }
                }
              }
            }
            goto LAB_7ffc3e7e9193;
          }
          uVar9 = (**(code **)(*param_1 + 0x78))(param_1);
          goto LAB_7ffc3e7e919c;
        }
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,lVar4);
        if (cVar1 == '\0') {
          lVar3 = *param_1;
          puVar12 = (undefined *)0x7ffc3eba6033;
          uVar9 = uRam00007ffc3ebc0a58;
LAB_7ffc3e7e918d:
          (**(code **)(lVar3 + 0x70))(param_1,uVar9,puVar12);
          goto LAB_7ffc3e7e9193;
        }
LAB_7ffc3e7e89fe:
        uVar5 = (**(code **)(*param_1 + 0x580))(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (uVar5 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 < 1) goto LAB_7ffc3e7e9125;
          uStack_5d = (undefined1)((ulonglong)lStack_50 >> 0x38);
          uStack_5c = uVar11;
          uStack_58 = uVar8;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(undefined1 *)
             (*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
                 uStack_5d;
          }
          else {
            (**(code **)(*param_1 + 0x680))(param_1,uVar5,0,1,&uStack_5d);
          }
          uVar8 = 1;
          bVar13 = 8;
          do {
            lVar3 = lStack_50 << (bVar13 & 0x3f);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
            }
            if ((longlong)iVar2 <= (longlong)uVar8) goto LAB_7ffc3e7e9125;
            uStack_5e = (undefined1)((ulonglong)lVar3 >> 0x38);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              *(undefined1 *)
               (uVar8 + (ulonglong)uRam00007ffc3ebc08f0 + *(longlong *)(uVar5 & 0xfffffffffffffffc))
                   = uStack_5e;
            }
            else {
              (**(code **)(*param_1 + 0x680))(param_1,uVar5,uVar8 & 0xffffffff,1,&uStack_5e);
            }
            uVar8 = uVar8 + 1;
            bVar13 = bVar13 + 8;
          } while (uVar8 != 8);
          lVar3 = FUN_7ffc3eb76c30(param_1,0x17);
          if (lVar3 == 0) {
            return 0;
          }
          lVar4 = (**(code **)(*param_1 + 0xd8))(param_1,lVar3);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (lVar4 != 0) {
            lVar6 = FUN_7ffc3eb76c90(param_1,lVar3,0x19);
            if (lVar6 == 0) {
              return 0;
            }
            FUN_7ffc3e7dbbc0(param_1,lVar4,lVar3,lVar6,uVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            uVar5 = uStack_58;
            if (cVar1 != '\0') {
              return 0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uStack_58 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uStack_58);
            }
            uVar11 = uStack_5c;
            if (iVar2 < 2) goto LAB_7ffc3e7e9125;
            lVar3 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,1);
            lVar6 = FUN_7ffc3eb76c30(param_1,0x14);
            if (lVar6 == 0) {
              return 0;
            }
            if (lVar3 != 0) {
              cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar3,lVar6);
              if (cVar1 != '\0') {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x1a);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar9 = FUN_7ffc3e7d1a50(param_1,lVar3,lVar6,lVar4);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                }
                if (iVar2 < 1) goto LAB_7ffc3e7e9125;
                lVar3 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,0);
                lVar4 = FUN_7ffc3eb76c30(param_1,0x13);
                if (lVar4 == 0) {
                  return 0;
                }
                if ((lVar3 == 0) ||
                   (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar3,lVar4), cVar1 != '\0')) {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                  }
                  if (iVar2 < 3) goto LAB_7ffc3e7e9125;
                  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,2);
                  lVar7 = FUN_7ffc3eb76c30(param_1,0x15);
                  if (lVar7 == 0) {
                    return 0;
                  }
                  if ((lVar6 == 0) ||
                     (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar7), cVar1 != '\0'))
                  {
                    if (lVar3 != 0) {
                      lVar7 = FUN_7ffc3eb76c90(param_1,lVar4,0x1b);
                      if (lVar7 == 0) {
                        return 0;
                      }
                      FUN_7ffc3e7e1940(param_1,lVar3,lVar7,2,uVar9,lVar6);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return 0;
                      }
                      lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
                      if (lVar3 == 0) {
                        return 0;
                      }
                      lVar6 = FUN_7ffc3eb76ce0(param_1,lVar3,0x16);
                      if (lVar6 == 0) {
                        return 0;
                      }
                      uVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar6);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return 0;
                      }
                      if (uVar8 != 0) {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                        }
                        if (iVar2 <= (int)uVar11) goto LAB_7ffc3e7e9125;
                        lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar8,uVar11);
                        uVar9 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652f);
                        if (lVar6 != 0) {
                          lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x1c);
                          if (lVar7 == 0) {
                            return 0;
                          }
                          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar7,uVar9);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          lVar6 = FUN_7ffc3eb76ce0(param_1,lVar3,0x14);
                          if (lVar6 == 0) {
                            return 0;
                          }
                          uVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar6);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                          }
                          if (iVar2 < 1) goto LAB_7ffc3e7e9125;
                          lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,0);
                          if (lVar6 != 0) {
                            cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar4);
                            if (cVar1 == '\0') goto LAB_7ffc3e7e9158;
                            lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x1d);
                            if (lVar4 == 0) {
                              return 0;
                            }
                            uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar4,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return 0;
                            }
                            lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x6d);
                            if (lVar4 == 0) {
                              return 0;
                            }
                            uVar9 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return 0;
                            }
                            if (uVar8 != 0) {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                              }
                              if ((int)uVar11 < iVar2) {
                                (**(code **)(*param_1 + 0x570))(param_1,uVar8,uVar11,uVar9);
                                goto LAB_7ffc3e7e83df;
                              }
                              goto LAB_7ffc3e7e9125;
                            }
                          }
                        }
                      }
                    }
                    goto LAB_7ffc3e7e9009;
                  }
                }
              }
LAB_7ffc3e7e9158:
              lVar3 = *param_1;
              puVar12 = (undefined *)0x7ffc3eba6033;
              uVar9 = uRam00007ffc3ebc0a58;
              goto LAB_7ffc3e7e901d;
            }
          }
        }
      }
LAB_7ffc3e7e9009:
      lVar3 = *param_1;
      puVar12 = &DAT_7ffc3eba6000;
      uVar9 = uRam00007ffc3ebc0a70;
      goto LAB_7ffc3e7e901d;
    }
LAB_7ffc3e7e83df:
    lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar3 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,0x14);
    if (lVar4 == 0) {
      return 0;
    }
    uVar5 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar5 == 0) goto LAB_7ffc3e7e9009;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
    }
    if ((int)uVar11 < iVar2) {
      uVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,uVar11);
      return uVar9;
    }
  }
LAB_7ffc3e7e9125:
  lVar3 = *param_1;
  puVar12 = (undefined *)0x7ffc3eba6019;
  uVar9 = uRam00007ffc3ebc0a98;
LAB_7ffc3e7e901d:
  (**(code **)(lVar3 + 0x70))(param_1,uVar9,puVar12);
  return 0;
}

/* JNI_dev_krypton_0r_a_6 | RVA 0x192a0 | dev/krypton/0r.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; | success */

ulonglong JNI_dev_krypton_0r_a_6
                    (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
                    undefined8 param_5,ulonglong param_6)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  ulonglong uVar11;
  
  if (param_6 == 0) goto LAB_7ffc3e7e9748;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
  }
  if (iVar3 < 1) goto LAB_7ffc3e7e972b;
  lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,0);
  lVar5 = *param_1;
  if (lVar4 != 0) {
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0a10);
    if (cVar1 == '\0') {
LAB_7ffc3e7e975a:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6033;
      uVar6 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7e93e7;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
    }
    if (iVar3 < 2) goto LAB_7ffc3e7e972b;
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,1);
    lVar5 = *param_1;
    if (lVar4 == 0) goto LAB_7ffc3e7e93e0;
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') goto LAB_7ffc3e7e975a;
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar5 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x6e);
    if (lVar4 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar4,uVar2,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    uVar6 = uRam00007ffc3ebc09e8;
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x20);
    if (lVar5 == 0) {
      return 0;
    }
    uVar11 = uVar7;
    uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,uVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
    if (lVar5 == 0) {
      return 0;
    }
    uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar8 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
      }
      if (0 < iVar3) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
        lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6);
        if (lVar5 == 0) {
          return 0;
        }
        uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (1 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
          if (lVar5 == 0) {
            return 0;
          }
          uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,
                                   uVar11 & 0xffffffff00000000,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_4 != 0) {
            lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
            if (lVar5 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
            if (lVar5 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar6);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            return uVar7;
          }
          goto LAB_7ffc3e7e9748;
        }
      }
LAB_7ffc3e7e972b:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6019;
      uVar6 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7e93e7;
    }
LAB_7ffc3e7e9748:
    lVar5 = *param_1;
  }
LAB_7ffc3e7e93e0:
  puVar10 = &DAT_7ffc3eba6000;
  uVar6 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7e93e7:
  (**(code **)(lVar5 + 0x70))(param_1,uVar6,puVar10);
  return 0;
}

/* JNI_dev_krypton_0r_a_7 | RVA 0x19780 | dev/krypton/0r.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_0r_a_7
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e7ea04b;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b60 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc09e0,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar10 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b60 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b60;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3e7e9cb3:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7e9ce1:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3e7e9cb3;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3e7e9cb3;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                      if (lVar4 != 0) {
                        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                 uVar19 & 0xffffffff00000000,uVar13);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if ((cVar1 == '\0') &&
                           (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27), lVar4 != 0)
                           ) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,param_5,
                                                   uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                              (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                            FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              return lVar5;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3e7e9ce7;
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3e7e9ce1;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7e9ce7:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7ea04b:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_0r_b_8 | RVA 0x1a070 | dev/krypton/0r.b(IJ)I | success */

undefined4
JNI_dev_krypton_0r_b_8(longlong *param_1,undefined8 param_2,uint param_3,undefined8 param_4)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  char cVar5;
  int iVar6;
  undefined4 uVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  undefined8 uVar15;
  longlong lVar16;
  uint uVar17;
  undefined *puVar18;
  byte *pbVar19;
  byte abStack_50 [8];
  undefined8 uStack_48;
  
  lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar8 == 0) {
    return 0;
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x17);
  if (lVar9 == 0) {
    return 0;
  }
  uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar10 == 0) goto LAB_7ffc3e7eb912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  if (((int)param_3 < 0) ||
     (uVar17 = param_3 ^ (uint)param_4 & 0x7fff ^ 0x8a0, iVar6 <= (int)uVar17)) {
LAB_7ffc3e7eb8f8:
    lVar8 = *param_1;
    puVar18 = (undefined *)0x7ffc3eba6019;
    uVar13 = uRam00007ffc3ebc0a98;
    goto LAB_7ffc3e7eb926;
  }
  lVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar17);
  if (lVar9 != 0) {
LAB_7ffc3e7eb7e9:
    lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar8 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x17);
    if (lVar9 == 0) {
      return 0;
    }
    uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (uVar10 != 0) {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
      }
      if (iVar6 <= (int)uVar17) goto LAB_7ffc3e7eb8f8;
      lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar17);
      if (lVar8 != 0) {
        lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
        if (lVar9 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d8be0(param_1,lVar8,lVar9);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') {
          return 0;
        }
        return uVar7;
      }
    }
    goto LAB_7ffc3e7eb912;
  }
  uVar10 = (**(code **)(*param_1 + 0x580))(param_1,8);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar10 == 0) goto LAB_7ffc3e7eb912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  if (iVar6 < 1) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea232;
LAB_7ffc3e7ea1f8:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea1f8;
LAB_7ffc3e7ea232:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea2be;
LAB_7ffc3e7ea281:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea281;
LAB_7ffc3e7ea2be:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea34a;
LAB_7ffc3e7ea30d:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea30d;
LAB_7ffc3e7ea34a:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea3d6;
LAB_7ffc3e7ea399:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea399;
LAB_7ffc3e7ea3d6:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea461;
LAB_7ffc3e7ea424:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea424;
LAB_7ffc3e7ea461:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea4ec;
LAB_7ffc3e7ea4af:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea4af;
LAB_7ffc3e7ea4ec:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea577;
LAB_7ffc3e7ea53a:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea53a;
LAB_7ffc3e7ea577:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)param_4;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,7,1,abStack_50);
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x18);
  if (lVar9 == 0) {
    return 0;
  }
  uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar11 == 0) goto LAB_7ffc3e7eb912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  if (iVar6 <= (int)uVar17) goto LAB_7ffc3e7eb8f8;
  if (bRam00007ffc3ebc08e5 == 1) {
    pbVar19 = (byte *)((ulonglong)uRam00007ffc3ebc08ec + (ulonglong)uVar17 * 8 +
                      *(longlong *)(uVar11 & 0xfffffffffffffffc));
  }
  else {
    pbVar19 = abStack_50;
    (**(code **)(*param_1 + 0x660))(param_1,uVar11,uVar17,1,pbVar19);
  }
  uVar13 = *(undefined8 *)pbVar19;
  uVar11 = (**(code **)(*param_1 + 0x580))(param_1,8);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar11 == 0) goto LAB_7ffc3e7eb912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  if (iVar6 < 1) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea787;
LAB_7ffc3e7ea74d:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea74d;
LAB_7ffc3e7ea787:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea813;
LAB_7ffc3e7ea7d6:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea7d6;
LAB_7ffc3e7ea813:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea89f;
LAB_7ffc3e7ea862:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea862;
LAB_7ffc3e7ea89f:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea92b;
LAB_7ffc3e7ea8ee:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea8ee;
LAB_7ffc3e7ea92b:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ea9b6;
LAB_7ffc3e7ea979:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ea979;
LAB_7ffc3e7ea9b6:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7eaa41;
LAB_7ffc3e7eaa04:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7eaa04;
LAB_7ffc3e7eaa41:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7eaacc;
LAB_7ffc3e7eaa8f:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7eaa8f;
LAB_7ffc3e7eaacc:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e7eb8f8;
  abStack_50[0] = (byte)uVar13;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,7,1,abStack_50);
  }
  lVar9 = FUN_7ffc3eb76c30(param_1,0x10);
  if (lVar9 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x11);
  if (lVar12 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3e7d1a80(param_1,lVar9,lVar12);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x12);
    if (lVar9 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a20(param_1,lVar12,lVar9);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
    if (lVar9 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar9,uVar13);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x19);
    if (lVar9 == 0) {
      return 0;
    }
    lVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (lVar8 != 0) {
      lVar9 = FUN_7ffc3eb76c30(param_1,0x11);
      if (lVar9 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x13);
      if (lVar9 == 0) {
        return 0;
      }
      uVar14 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar13);
      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar5 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0x12);
      if (lVar8 == 0) {
        return 0;
      }
      if (uVar14 == 0) {
        uVar14 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') {
LAB_7ffc3e7eb1b1:
          lVar8 = *param_1;
          goto LAB_7ffc3e7eb1b7;
        }
        uStack_48 = uVar13;
        uVar13 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653e);
        lVar8 = FUN_7ffc3eb76c30(param_1,0x13);
        if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(param_1,lVar8,0x14), lVar9 == 0))
        goto LAB_7ffc3e7eb1b1;
        uVar13 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar9,uVar13);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') goto LAB_7ffc3e7eb1b1;
        if (uVar14 == 0) goto LAB_7ffc3e7eb197;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar6 < 1) {
LAB_7ffc3e7eb931:
          lVar8 = *param_1;
          puVar18 = (undefined *)0x7ffc3eba6019;
          uVar13 = uRam00007ffc3ebc0a98;
          goto LAB_7ffc3e7eb1ab;
        }
        (**(code **)(*param_1 + 0x570))(param_1,uVar14,0,uVar13);
        uVar13 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652b);
        lVar8 = FUN_7ffc3eb76c30(param_1,0x14);
        if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(param_1,lVar8,0x15), lVar9 == 0))
        goto LAB_7ffc3e7eb1b1;
        uVar13 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar9,uVar13);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') goto LAB_7ffc3e7eb1b1;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar6 < 2) goto LAB_7ffc3e7eb931;
        (**(code **)(*param_1 + 0x570))(param_1,uVar14,1,uVar13);
        lVar9 = FUN_7ffc3eb76c30(param_1,0x15);
        lVar8 = *param_1;
        if (lVar9 == 0) goto LAB_7ffc3e7eb1b7;
        lVar8 = (**(code **)(lVar8 + 0xd8))(param_1,lVar9);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 == '\0') {
          uVar13 = (**(code **)(*param_1 + 0x580))(param_1,8);
          cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar5 == '\0') {
            if (lVar8 == 0) goto LAB_7ffc3e7eb197;
            lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x16);
            if (lVar12 != 0) {
              FUN_7ffc3e7dbbc0(param_1,lVar8,lVar9,lVar12,uVar13);
              cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar5 == '\0') {
                if (bRam00007ffc3ebc08e5 == 1) {
                  iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                }
                if (iVar6 < 3) goto LAB_7ffc3e7eb931;
                (**(code **)(*param_1 + 0x570))(param_1,uVar14,2,lVar8);
                lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
                if (lVar8 != 0) {
                  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x19);
                  if (lVar9 == 0) {
                    uVar13 = (**(code **)(*param_1 + 0x78))(param_1);
                    goto LAB_7ffc3e7eb1ba;
                  }
                  lVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
                  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar5 == '\0') {
                    if (lVar8 == 0) goto LAB_7ffc3e7eb197;
                    lVar9 = FUN_7ffc3eb76c30(param_1,0x11);
                    if ((lVar9 != 0) && (lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x17), lVar9 != 0))
                    {
                      FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uStack_48,uVar14);
                      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar5 == '\0') goto LAB_7ffc3e7eb0a2;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e7eb1b1;
        }
        uVar13 = (**(code **)(*param_1 + 0x78))(param_1);
      }
      else {
        cVar5 = (**(code **)(*param_1 + 0x100))(param_1,uVar14,lVar8);
        if (cVar5 == '\0') {
          lVar8 = *param_1;
          puVar18 = (undefined *)0x7ffc3eba6033;
          uVar13 = uRam00007ffc3ebc0a58;
          goto LAB_7ffc3e7eb926;
        }
LAB_7ffc3e7eb0a2:
        lVar9 = FUN_7ffc3eb76c30(param_1,0x17);
        lVar8 = *param_1;
        if (lVar9 != 0) {
          lVar8 = (**(code **)(lVar8 + 0xd8))(param_1,lVar9);
          cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar5 == '\0') {
            if (lVar8 == 0) {
LAB_7ffc3e7eb197:
              lVar8 = *param_1;
              puVar18 = &DAT_7ffc3eba6000;
              uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7eb1ab:
              (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar18);
            }
            else {
              lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x19);
              if (lVar12 != 0) {
                FUN_7ffc3e7dbbc0(param_1,lVar8,lVar9,lVar12,uVar10);
                cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar5 == '\0') {
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                  }
                  if (iVar6 < 2) goto LAB_7ffc3e7eb931;
                  lVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,1);
                  lVar12 = FUN_7ffc3eb76c30(param_1,0x14);
                  if (lVar12 != 0) {
                    if (lVar9 == 0) goto LAB_7ffc3e7eb197;
                    cVar5 = (**(code **)(*param_1 + 0x100))(param_1,lVar9,lVar12);
                    if (cVar5 == '\0') goto LAB_7ffc3e7eb94e;
                    lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x1a);
                    if (lVar12 != 0) {
                      uVar13 = FUN_7ffc3e7d1a50(param_1,lVar9,lVar12,lVar8);
                      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar5 == '\0') {
                        if (bRam00007ffc3ebc08e5 == 1) {
                          iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                        }
                        if (iVar6 < 1) goto LAB_7ffc3e7eb931;
                        lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,0);
                        lVar9 = FUN_7ffc3eb76c30(param_1,0x13);
                        if (lVar9 != 0) {
                          if ((lVar8 != 0) &&
                             (cVar5 = (**(code **)(*param_1 + 0x100))(param_1,lVar8,lVar9),
                             cVar5 == '\0')) {
LAB_7ffc3e7eb94e:
                            lVar8 = *param_1;
                            puVar18 = (undefined *)0x7ffc3eba6033;
                            uVar13 = uRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e7eb1ab;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3e7eb931;
                          lVar12 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,2);
                          lVar16 = FUN_7ffc3eb76c30(param_1,0x15);
                          if (lVar16 != 0) {
                            if ((lVar12 != 0) &&
                               (cVar5 = (**(code **)(*param_1 + 0x100))(param_1,lVar12,lVar16),
                               cVar5 == '\0')) goto LAB_7ffc3e7eb94e;
                            if (lVar8 == 0) goto LAB_7ffc3e7eb197;
                            lVar16 = FUN_7ffc3eb76c90(param_1,lVar9,0x1b);
                            if (lVar16 != 0) {
                              FUN_7ffc3e7e1940(param_1,lVar8,lVar16,2,uVar13,lVar12);
                              cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                              if ((cVar5 == '\0') &&
                                 (lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x1d), lVar9 != 0)) {
                                uVar10 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar11);
                                cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                                if (cVar5 == '\0') {
                                  if (uVar10 != 0) {
                                    if (bRam00007ffc3ebc08e5 == 1) {
                                      iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                    }
                                    if (4 < iVar6) {
                                      if (bRam00007ffc3ebc08e5 == 1) {
                                        pbVar19 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                           *(longlong *)
                                                            (uVar10 & 0xfffffffffffffffc) + 4);
                                      }
                                      else {
                                        pbVar19 = abStack_50;
                                        (**(code **)(*param_1 + 0x640))(param_1,uVar10,4,1,pbVar19);
                                      }
                                      bVar1 = *pbVar19;
                                      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                        iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                      }
                                      else {
                                        iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc)
                                                        + (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      if (5 < iVar6) {
                                        if (bRam00007ffc3ebc08e5 == 1) {
                                          pbVar19 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                             *(longlong *)
                                                              (uVar10 & 0xfffffffffffffffc) + 5);
                                        }
                                        else {
                                          pbVar19 = abStack_50;
                                          (**(code **)(*param_1 + 0x640))
                                                    (param_1,uVar10,5,1,pbVar19);
                                        }
                                        bVar2 = *pbVar19;
                                        if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                        }
                                        else {
                                          iVar6 = *(int *)(*(longlong *)
                                                            (uVar10 & 0xfffffffffffffffc) +
                                                          (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        if (6 < iVar6) {
                                          if (bRam00007ffc3ebc08e5 == 1) {
                                            pbVar19 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                               *(longlong *)
                                                                (uVar10 & 0xfffffffffffffffc) + 6);
                                          }
                                          else {
                                            pbVar19 = abStack_50;
                                            (**(code **)(*param_1 + 0x640))
                                                      (param_1,uVar10,6,1,pbVar19);
                                          }
                                          bVar3 = *pbVar19;
                                          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                            iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                          }
                                          else {
                                            iVar6 = *(int *)(*(longlong *)
                                                              (uVar10 & 0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          if (7 < iVar6) {
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              pbVar19 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                 *(longlong *)
                                                                  (uVar10 & 0xfffffffffffffffc) + 7)
                                              ;
                                            }
                                            else {
                                              pbVar19 = abStack_50;
                                              (**(code **)(*param_1 + 0x640))
                                                        (param_1,uVar10,7,1,pbVar19);
                                            }
                                            bVar4 = *pbVar19;
                                            lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
                                            if (lVar8 == 0) {
                                              return 0;
                                            }
                                            lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x17);
                                            if (lVar9 == 0) {
                                              return 0;
                                            }
                                            uVar10 = (**(code **)(*param_1 + 0x488))
                                                               (param_1,lVar8,lVar9);
                                            cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                                            if (cVar5 != '\0') {
                                              return 0;
                                            }
                                            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7)
                                            ;
                                            if (lVar8 == 0) {
                                              return 0;
                                            }
                                            uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,
                                                                      lVar8,(uint)CONCAT11(bVar3,
                                                  bVar4) | (uint)bVar2 << 0x10 | (uint)bVar1 << 0x18
                                                  );
                                            cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                                            if (cVar5 != '\0') {
                                              return 0;
                                            }
                                            if (uVar10 == 0) goto LAB_7ffc3e7eb912;
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              iVar6 = *(int *)(*(longlong *)
                                                                (uVar10 & 0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar6 = (**(code **)(*param_1 + 0x558))
                                                                (param_1,uVar10);
                                            }
                                            if ((int)uVar17 < iVar6) {
                                              (**(code **)(*param_1 + 0x570))
                                                        (param_1,uVar10,uVar17,uVar13);
                                              goto LAB_7ffc3e7eb7e9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e7eb8f8;
                                  }
                                  goto LAB_7ffc3e7eb912;
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
          goto LAB_7ffc3e7eb1b1;
        }
LAB_7ffc3e7eb1b7:
        uVar13 = (**(code **)(lVar8 + 0x78))(param_1);
      }
LAB_7ffc3e7eb1ba:
      uVar15 = FUN_7ffc3eb76c30(param_1,8);
      cVar5 = (**(code **)(*param_1 + 0x100))(param_1,uVar13,uVar15);
      if (cVar5 == '\0') {
        return 0;
      }
      (**(code **)(*param_1 + 0x88))(param_1);
      lVar8 = FUN_7ffc3eb76c30(param_1,0x16);
      if (lVar8 == 0) {
        return 0;
      }
      lVar9 = (**(code **)(*param_1 + 0xd8))(param_1,lVar8);
      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar5 != '\0') {
        return 0;
      }
      uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
      if (lVar9 != 0) {
        lVar12 = FUN_7ffc3eb76c90(param_1,lVar8,0x18);
        if (lVar12 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(param_1,lVar9,lVar8,lVar12,uVar15,uVar13);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x68))(param_1,lVar9);
        return 0;
      }
    }
  }
LAB_7ffc3e7eb912:
  lVar8 = *param_1;
  puVar18 = &DAT_7ffc3eba6000;
  uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7eb926:
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar18);
  return 0;
}

/* JNI_dev_krypton_0r_b_9 | RVA 0x1b9a0 | dev/krypton/0r.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

undefined4
JNI_dev_krypton_0r_b_9
          (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
          undefined8 param_5,ulonglong param_6)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_6 == 0) goto LAB_7ffc3e7ebebd;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
  }
  if (iVar3 < 1) goto LAB_7ffc3e7ebea0;
  lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,0);
  lVar5 = *param_1;
  if (lVar4 != 0) {
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0a10);
    if (cVar1 == '\0') {
LAB_7ffc3e7ebecf:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6033;
      uVar6 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7ebae7;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
    }
    if (iVar3 < 2) goto LAB_7ffc3e7ebea0;
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,1);
    lVar5 = *param_1;
    if (lVar4 == 0) goto LAB_7ffc3e7ebae0;
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') goto LAB_7ffc3e7ebecf;
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar5 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x6f);
    if (lVar4 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7db1e0(param_1,lVar5,lVar4,uVar2,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
    if (lVar4 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar4,uVar2);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x20);
    if (lVar4 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar6,uVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar8 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
      }
      if (0 < iVar3) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
        lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6);
        if (lVar5 == 0) {
          return 0;
        }
        uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (1 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
          if (lVar5 == 0) {
            return 0;
          }
          uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,
                                   uVar7 & 0xffffffff00000000,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_4 != 0) {
            lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
            if (lVar5 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
            if (lVar5 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar6);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            return uVar2;
          }
          goto LAB_7ffc3e7ebebd;
        }
      }
LAB_7ffc3e7ebea0:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6019;
      uVar6 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7ebae7;
    }
LAB_7ffc3e7ebebd:
    lVar5 = *param_1;
  }
LAB_7ffc3e7ebae0:
  puVar10 = &DAT_7ffc3eba6000;
  uVar6 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7ebae7:
  (**(code **)(lVar5 + 0x70))(param_1,uVar6,puVar10);
  return 0;
}

/* JNI_dev_krypton_0r_b_10 | RVA 0x1bef0 | dev/krypton/0r.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_0r_b_10
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e7ec7bb;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b68 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc0928,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar10 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b68 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b68;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3e7ec423:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7ec451:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3e7ec423;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3e7ec423;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                      if (lVar4 != 0) {
                        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                 uVar19 & 0xffffffff00000000,uVar13);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if ((cVar1 == '\0') &&
                           (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27), lVar4 != 0)
                           ) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,param_5,
                                                   uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                              (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                            FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              return lVar5;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3e7ec457;
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3e7ec451;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7ec457:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7ec7bb:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_0r_c_11 | RVA 0x1c7e0 | dev/krypton/0r.c(IJ)J | success */

undefined8
JNI_dev_krypton_0r_c_11(longlong *param_1,undefined8 param_2,uint param_3,undefined8 param_4)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  char cVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  undefined8 uVar16;
  longlong lVar17;
  uint uVar18;
  undefined *puVar19;
  byte *pbVar20;
  byte abStack_60 [8];
  ulonglong uStack_58;
  uint uStack_4c;
  ulonglong uStack_48;
  
  lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar8 == 0) {
    return 0;
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1a);
  if (lVar9 == 0) {
    return 0;
  }
  uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar6 != '\0') {
    return 0;
  }
  if (uVar10 == 0) goto LAB_7ffc3e7ee2d1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  if (((int)param_3 < 0) ||
     (uVar18 = param_3 ^ (uint)param_4 & 0x7fff ^ 0x2a07, iVar7 <= (int)uVar18)) {
LAB_7ffc3e7ee2b7:
    lVar8 = *param_1;
    puVar19 = (undefined *)0x7ffc3eba6019;
    uVar13 = uRam00007ffc3ebc0a98;
    goto LAB_7ffc3e7ee2e5;
  }
  lVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar18);
  if (lVar9 != 0) {
LAB_7ffc3e7ee1a9:
    lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar8 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1a);
    if (lVar9 == 0) {
      return 0;
    }
    uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
    cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar6 != '\0') {
      return 0;
    }
    if (uVar10 != 0) {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
      }
      if (iVar7 <= (int)uVar18) goto LAB_7ffc3e7ee2b7;
      lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar18);
      if (lVar8 != 0) {
        lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar9 == 0) {
          return 0;
        }
        uVar13 = FUN_7ffc3e7d1a20(param_1,lVar8,lVar9);
        cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar6 != '\0') {
          return 0;
        }
        return uVar13;
      }
    }
    goto LAB_7ffc3e7ee2d1;
  }
  uVar10 = (**(code **)(*param_1 + 0x580))(param_1,8);
  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar6 != '\0') {
    return 0;
  }
  if (uVar10 == 0) goto LAB_7ffc3e7ee2d1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  if (iVar7 < 1) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ec9a2;
LAB_7ffc3e7ec968:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,0,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ec968;
LAB_7ffc3e7ec9a2:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 2) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7eca2e;
LAB_7ffc3e7ec9f1:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,1,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ec9f1;
LAB_7ffc3e7eca2e:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 3) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecaba;
LAB_7ffc3e7eca7d:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,2,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7eca7d;
LAB_7ffc3e7ecaba:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 4) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecb46;
LAB_7ffc3e7ecb09:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,3,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ecb09;
LAB_7ffc3e7ecb46:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 5) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecbd1;
LAB_7ffc3e7ecb94:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,4,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ecb94;
LAB_7ffc3e7ecbd1:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 6) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecc5c;
LAB_7ffc3e7ecc1f:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,5,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ecc1f;
LAB_7ffc3e7ecc5c:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 7) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)param_4 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecce7;
LAB_7ffc3e7eccaa:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,6,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7eccaa;
LAB_7ffc3e7ecce7:
    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 8) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)param_4;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_60[0];
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,7,1,abStack_60);
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1b);
  if (lVar9 == 0) {
    return 0;
  }
  uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar6 != '\0') {
    return 0;
  }
  if (uVar11 == 0) goto LAB_7ffc3e7ee2d1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  if (iVar7 <= (int)uVar18) goto LAB_7ffc3e7ee2b7;
  if (bRam00007ffc3ebc08e5 == 1) {
    pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08ec + (ulonglong)uVar18 * 8 +
                      *(longlong *)(uVar11 & 0xfffffffffffffffc));
  }
  else {
    pbVar20 = abStack_60;
    (**(code **)(*param_1 + 0x660))(param_1,uVar11,uVar18,1,pbVar20);
  }
  uVar13 = *(undefined8 *)pbVar20;
  uVar11 = (**(code **)(*param_1 + 0x580))(param_1,8);
  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar6 != '\0') {
    return 0;
  }
  if (uVar11 == 0) goto LAB_7ffc3e7ee2d1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  if (iVar7 < 1) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecef7;
LAB_7ffc3e7ecebd:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,0,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ecebd;
LAB_7ffc3e7ecef7:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 2) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ecf83;
LAB_7ffc3e7ecf46:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,1,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ecf46;
LAB_7ffc3e7ecf83:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 3) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ed00f;
LAB_7ffc3e7ecfd2:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,2,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ecfd2;
LAB_7ffc3e7ed00f:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 4) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ed09b;
LAB_7ffc3e7ed05e:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,3,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ed05e;
LAB_7ffc3e7ed09b:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 5) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ed126;
LAB_7ffc3e7ed0e9:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,4,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ed0e9;
LAB_7ffc3e7ed126:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 6) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ed1b1;
LAB_7ffc3e7ed174:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,5,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ed174;
LAB_7ffc3e7ed1b1:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 7) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)((ulonglong)uVar13 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e7ed23c;
LAB_7ffc3e7ed1ff:
    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,6,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e7ed1ff;
LAB_7ffc3e7ed23c:
    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 8) goto LAB_7ffc3e7ee2b7;
  abStack_60[0] = (byte)uVar13;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_60[0];
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,7,1,abStack_60);
  }
  lVar9 = FUN_7ffc3eb76c30(param_1,0x10);
  if (lVar9 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x11);
  if (lVar12 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3e7d1a80(param_1,lVar9,lVar12);
  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar6 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x12);
    if (lVar9 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a20(param_1,lVar12,lVar9);
    cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar6 != '\0') {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
    if (lVar9 == 0) {
      return 0;
    }
    uVar14 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar9,uVar13);
    cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar6 != '\0') {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1c);
    if (lVar9 == 0) {
      return 0;
    }
    lVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
    cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar6 != '\0') {
      return 0;
    }
    if (lVar8 != 0) {
      lVar9 = FUN_7ffc3eb76c30(param_1,0x11);
      if (lVar9 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x13);
      if (lVar9 == 0) {
        return 0;
      }
      uVar15 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar14);
      cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar6 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0x12);
      if (lVar8 == 0) {
        return 0;
      }
      if (uVar15 == 0) {
        uVar15 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
        cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar6 != '\0') {
LAB_7ffc3e7ed926:
          lVar8 = *param_1;
          goto LAB_7ffc3e7ed92c;
        }
        uStack_58 = uVar14;
        uVar13 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653e);
        lVar8 = FUN_7ffc3eb76c30(param_1,0x13);
        if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(param_1,lVar8,0x14), lVar9 == 0))
        goto LAB_7ffc3e7ed926;
        uVar13 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar9,uVar13);
        cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar6 != '\0') goto LAB_7ffc3e7ed926;
        if (uVar15 == 0) goto LAB_7ffc3e7ed90c;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar7 = *(int *)(*(longlong *)(uVar15 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar15);
        }
        if (iVar7 < 1) {
LAB_7ffc3e7ee2f0:
          lVar8 = *param_1;
          puVar19 = (undefined *)0x7ffc3eba6019;
          uVar13 = uRam00007ffc3ebc0a98;
          goto LAB_7ffc3e7ed920;
        }
        (**(code **)(*param_1 + 0x570))(param_1,uVar15,0,uVar13);
        uVar13 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652b);
        lVar8 = FUN_7ffc3eb76c30(param_1,0x14);
        if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(param_1,lVar8,0x15), lVar9 == 0))
        goto LAB_7ffc3e7ed926;
        uVar13 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar9,uVar13);
        cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar6 != '\0') goto LAB_7ffc3e7ed926;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar7 = *(int *)(*(longlong *)(uVar15 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar15);
        }
        if (iVar7 < 2) goto LAB_7ffc3e7ee2f0;
        (**(code **)(*param_1 + 0x570))(param_1,uVar15,1,uVar13);
        lVar9 = FUN_7ffc3eb76c30(param_1,0x15);
        lVar8 = *param_1;
        if (lVar9 == 0) goto LAB_7ffc3e7ed92c;
        lVar8 = (**(code **)(lVar8 + 0xd8))(param_1,lVar9);
        cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar6 == '\0') {
          uVar13 = (**(code **)(*param_1 + 0x580))(param_1,8);
          cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar6 == '\0') {
            if (lVar8 == 0) goto LAB_7ffc3e7ed90c;
            lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x16);
            if (lVar12 != 0) {
              FUN_7ffc3e7dbbc0(param_1,lVar8,lVar9,lVar12,uVar13);
              cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar6 == '\0') {
                if (bRam00007ffc3ebc08e5 == 1) {
                  iVar7 = *(int *)(*(longlong *)(uVar15 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar15);
                }
                if (iVar7 < 3) goto LAB_7ffc3e7ee2f0;
                (**(code **)(*param_1 + 0x570))(param_1,uVar15,2,lVar8);
                lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
                if (lVar8 != 0) {
                  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1c);
                  if (lVar9 == 0) {
                    uVar13 = (**(code **)(*param_1 + 0x78))(param_1);
                    goto LAB_7ffc3e7ed92f;
                  }
                  lVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
                  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar6 == '\0') {
                    if (lVar8 == 0) goto LAB_7ffc3e7ed90c;
                    lVar9 = FUN_7ffc3eb76c30(param_1,0x11);
                    if ((lVar9 != 0) && (lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x17), lVar9 != 0))
                    {
                      FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uStack_58,uVar15);
                      cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar6 == '\0') goto LAB_7ffc3e7ed817;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e7ed926;
        }
        uVar13 = (**(code **)(*param_1 + 0x78))(param_1);
      }
      else {
        cVar6 = (**(code **)(*param_1 + 0x100))(param_1,uVar15,lVar8);
        if (cVar6 == '\0') {
          lVar8 = *param_1;
          puVar19 = (undefined *)0x7ffc3eba6033;
          uVar13 = uRam00007ffc3ebc0a58;
          goto LAB_7ffc3e7ee2e5;
        }
LAB_7ffc3e7ed817:
        lVar9 = FUN_7ffc3eb76c30(param_1,0x17);
        lVar8 = *param_1;
        if (lVar9 != 0) {
          lVar8 = (**(code **)(lVar8 + 0xd8))(param_1,lVar9);
          cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar6 == '\0') {
            if (lVar8 == 0) {
LAB_7ffc3e7ed90c:
              lVar8 = *param_1;
              puVar19 = &DAT_7ffc3eba6000;
              uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7ed920:
              (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar19);
            }
            else {
              lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x19);
              if (lVar12 != 0) {
                FUN_7ffc3e7dbbc0(param_1,lVar8,lVar9,lVar12,uVar10);
                cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar6 == '\0') {
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar15 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar15);
                  }
                  if (iVar7 < 2) goto LAB_7ffc3e7ee2f0;
                  lVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar15,1);
                  lVar12 = FUN_7ffc3eb76c30(param_1,0x14);
                  if (lVar12 != 0) {
                    if (lVar9 == 0) goto LAB_7ffc3e7ed90c;
                    cVar6 = (**(code **)(*param_1 + 0x100))(param_1,lVar9,lVar12);
                    if (cVar6 == '\0') goto LAB_7ffc3e7ee30d;
                    lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x1a);
                    if (lVar12 != 0) {
                      uVar13 = FUN_7ffc3e7d1a50(param_1,lVar9,lVar12,lVar8);
                      cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar6 == '\0') {
                        if (bRam00007ffc3ebc08e5 == 1) {
                          iVar7 = *(int *)(*(longlong *)(uVar15 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar15);
                        }
                        if (iVar7 < 1) goto LAB_7ffc3e7ee2f0;
                        lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar15,0);
                        lVar9 = FUN_7ffc3eb76c30(param_1,0x13);
                        if (lVar9 != 0) {
                          if ((lVar8 != 0) &&
                             (cVar6 = (**(code **)(*param_1 + 0x100))(param_1,lVar8,lVar9),
                             cVar6 == '\0')) {
LAB_7ffc3e7ee30d:
                            lVar8 = *param_1;
                            puVar19 = (undefined *)0x7ffc3eba6033;
                            uVar13 = uRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e7ed920;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar7 = *(int *)(*(longlong *)(uVar15 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar15);
                          }
                          if (iVar7 < 3) goto LAB_7ffc3e7ee2f0;
                          lVar12 = (**(code **)(*param_1 + 0x568))(param_1,uVar15,2);
                          lVar17 = FUN_7ffc3eb76c30(param_1,0x15);
                          if (lVar17 != 0) {
                            if ((lVar12 != 0) &&
                               (cVar6 = (**(code **)(*param_1 + 0x100))(param_1,lVar12,lVar17),
                               cVar6 == '\0')) goto LAB_7ffc3e7ee30d;
                            if (lVar8 == 0) goto LAB_7ffc3e7ed90c;
                            lVar17 = FUN_7ffc3eb76c90(param_1,lVar9,0x1b);
                            if (lVar17 != 0) {
                              FUN_7ffc3e7e1940(param_1,lVar8,lVar17,2,uVar13,lVar12);
                              cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                              if ((cVar6 == '\0') &&
                                 (lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x1d), lVar9 != 0)) {
                                uVar10 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar11);
                                cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                                if (cVar6 == '\0') {
                                  if (uVar10 != 0) {
                                    if (bRam00007ffc3ebc08e5 == 1) {
                                      iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                    }
                                    if (0 < iVar7) {
                                      if (bRam00007ffc3ebc08e5 == 1) {
                                        pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                          *(longlong *)(uVar10 & 0xfffffffffffffffc)
                                                          );
                                      }
                                      else {
                                        pbVar20 = abStack_60;
                                        (**(code **)(*param_1 + 0x640))(param_1,uVar10,0,1,pbVar20);
                                      }
                                      bVar1 = *pbVar20;
                                      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                        iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                      }
                                      else {
                                        iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc)
                                                        + (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      if (1 < iVar7) {
                                        if (bRam00007ffc3ebc08e5 == 1) {
                                          pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                             *(longlong *)
                                                              (uVar10 & 0xfffffffffffffffc) + 1);
                                        }
                                        else {
                                          pbVar20 = abStack_60;
                                          (**(code **)(*param_1 + 0x640))
                                                    (param_1,uVar10,1,1,pbVar20);
                                        }
                                        bVar2 = *pbVar20;
                                        if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                          iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                        }
                                        else {
                                          iVar7 = *(int *)(*(longlong *)
                                                            (uVar10 & 0xfffffffffffffffc) +
                                                          (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        if (2 < iVar7) {
                                          if (bRam00007ffc3ebc08e5 == 1) {
                                            pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                               *(longlong *)
                                                                (uVar10 & 0xfffffffffffffffc) + 2);
                                          }
                                          else {
                                            pbVar20 = abStack_60;
                                            (**(code **)(*param_1 + 0x640))
                                                      (param_1,uVar10,2,1,pbVar20);
                                          }
                                          bVar3 = *pbVar20;
                                          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                          }
                                          else {
                                            iVar7 = *(int *)(*(longlong *)
                                                              (uVar10 & 0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          if (3 < iVar7) {
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                 *(longlong *)
                                                                  (uVar10 & 0xfffffffffffffffc) + 3)
                                              ;
                                            }
                                            else {
                                              pbVar20 = abStack_60;
                                              (**(code **)(*param_1 + 0x640))
                                                        (param_1,uVar10,3,1,pbVar20);
                                            }
                                            bVar4 = *pbVar20;
                                            if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                              iVar7 = (**(code **)(*param_1 + 0x558))
                                                                (param_1,uVar10);
                                            }
                                            else {
                                              iVar7 = *(int *)(*(longlong *)
                                                                (uVar10 & 0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            if (4 < iVar7) {
                                              uStack_58 = (ulonglong)bVar4;
                                              if (bRam00007ffc3ebc08e5 == 1) {
                                                pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                   *(longlong *)
                                                                    (uVar10 & 0xfffffffffffffffc) +
                                                                  4);
                                              }
                                              else {
                                                pbVar20 = abStack_60;
                                                (**(code **)(*param_1 + 0x640))
                                                          (param_1,uVar10,4,1,pbVar20);
                                              }
                                              bVar4 = *pbVar20;
                                              if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                                iVar7 = (**(code **)(*param_1 + 0x558))
                                                                  (param_1,uVar10);
                                              }
                                              else {
                                                iVar7 = *(int *)(*(longlong *)
                                                                  (uVar10 & 0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              if (5 < iVar7) {
                                                uStack_48 = (ulonglong)bVar3;
                                                if (bRam00007ffc3ebc08e5 == 1) {
                                                  pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0
                                                                     + *(longlong *)
                                                                        (uVar10 & 0xfffffffffffffffc
                                                                        ) + 5);
                                                }
                                                else {
                                                  pbVar20 = abStack_60;
                                                  (**(code **)(*param_1 + 0x640))
                                                            (param_1,uVar10,5,1,pbVar20);
                                                }
                                                uStack_4c = (uint)*pbVar20;
                                                if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                                  iVar7 = (**(code **)(*param_1 + 0x558))
                                                                    (param_1,uVar10);
                                                }
                                                else {
                                                  iVar7 = *(int *)(*(longlong *)
                                                                    (uVar10 & 0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                if (6 < iVar7) {
                                                  if (bRam00007ffc3ebc08e5 == 1) {
                                                    pbVar20 = (byte *)((ulonglong)
                                                                       uRam00007ffc3ebc08f0 +
                                                                       *(longlong *)
                                                                        (uVar10 & 0xfffffffffffffffc
                                                                        ) + 6);
                                                  }
                                                  else {
                                                    pbVar20 = abStack_60;
                                                    (**(code **)(*param_1 + 0x640))
                                                              (param_1,uVar10,6,1,pbVar20);
                                                  }
                                                  bVar3 = *pbVar20;
                                                  if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                                    iVar7 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar10);
                                                  }
                                                  else {
                                                    iVar7 = *(int *)(*(longlong *)
                                                                      (uVar10 & 0xfffffffffffffffc)
                                                                    + (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                  }
                                                  if (7 < iVar7) {
                                                    if (bRam00007ffc3ebc08e5 == 1) {
                                                      pbVar20 = (byte *)((ulonglong)
                                                                         uRam00007ffc3ebc08f0 +
                                                                         *(longlong *)
                                                                          (uVar10 & 
                                                  0xfffffffffffffffc) + 7);
                                                  }
                                                  else {
                                                    pbVar20 = abStack_60;
                                                    (**(code **)(*param_1 + 0x640))
                                                              (param_1,uVar10,7,1,pbVar20);
                                                  }
                                                  bVar5 = *pbVar20;
                                                  lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
                                                  if (lVar8 == 0) {
                                                    return 0;
                                                  }
                                                  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1a);
                                                  if (lVar9 == 0) {
                                                    return 0;
                                                  }
                                                  uVar10 = (**(code **)(*param_1 + 0x488))
                                                                     (param_1,lVar8,lVar9);
                                                  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                                                  if (cVar6 != '\0') {
                                                    return 0;
                                                  }
                                                  lVar8 = FUN_7ffc3eb76c90(param_1,
                                                  uRam00007ffc3ebc0958,1);
                                                  if (lVar8 == 0) {
                                                    return 0;
                                                  }
                                                  uVar13 = FUN_7ffc3e7d1a80(param_1,
                                                  uRam00007ffc3ebc0958,lVar8,
                                                  ((ulonglong)(uint)((int)(char)bVar4 << 0x18) |
                                                   (ulonglong)(byte)uStack_4c << 0x10 |
                                                   (ulonglong)bVar3 << 8 |
                                                  (uStack_58 & 0xff) << 0x20 |
                                                  (uStack_48 & 0xff) << 0x28 |
                                                  (ulonglong)bVar2 << 0x30 |
                                                  (ulonglong)bVar1 << 0x38) + (ulonglong)bVar5);
                                                  cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
                                                  if (cVar6 != '\0') {
                                                    return 0;
                                                  }
                                                  if (uVar10 == 0) goto LAB_7ffc3e7ee2d1;
                                                  if (bRam00007ffc3ebc08e5 == 1) {
                                                    iVar7 = *(int *)(*(longlong *)
                                                                      (uVar10 & 0xfffffffffffffffc)
                                                                    + (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar7 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar10);
                                                  }
                                                  if ((int)uVar18 < iVar7) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar10,uVar18,uVar13);
                                                    goto LAB_7ffc3e7ee1a9;
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e7ee2b7;
                                  }
                                  goto LAB_7ffc3e7ee2d1;
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
          goto LAB_7ffc3e7ed926;
        }
LAB_7ffc3e7ed92c:
        uVar13 = (**(code **)(lVar8 + 0x78))(param_1);
      }
LAB_7ffc3e7ed92f:
      uVar16 = FUN_7ffc3eb76c30(param_1,8);
      cVar6 = (**(code **)(*param_1 + 0x100))(param_1,uVar13,uVar16);
      if (cVar6 == '\0') {
        return 0;
      }
      (**(code **)(*param_1 + 0x88))(param_1);
      lVar8 = FUN_7ffc3eb76c30(param_1,0x16);
      if (lVar8 == 0) {
        return 0;
      }
      lVar9 = (**(code **)(*param_1 + 0xd8))(param_1,lVar8);
      cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar6 != '\0') {
        return 0;
      }
      uVar16 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
      if (lVar9 != 0) {
        lVar12 = FUN_7ffc3eb76c90(param_1,lVar8,0x18);
        if (lVar12 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(param_1,lVar9,lVar8,lVar12,uVar16,uVar13);
        cVar6 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar6 != '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x68))(param_1,lVar9);
        return 0;
      }
    }
  }
LAB_7ffc3e7ee2d1:
  lVar8 = *param_1;
  puVar19 = &DAT_7ffc3eba6000;
  uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7ee2e5:
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar19);
  return 0;
}

/* JNI_dev_krypton_0r_c_12 | RVA 0x1e360 | dev/krypton/0r.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J | success */

undefined8
JNI_dev_krypton_0r_c_12
          (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
          undefined8 param_5,ulonglong param_6)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  undefined8 uVar10;
  undefined *puVar11;
  
  if (param_6 == 0) goto LAB_7ffc3e7ee874;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
  }
  if (iVar3 < 1) goto LAB_7ffc3e7ee857;
  lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,0);
  lVar5 = *param_1;
  if (lVar4 != 0) {
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0a10);
    if (cVar1 == '\0') {
LAB_7ffc3e7ee886:
      lVar5 = *param_1;
      puVar11 = (undefined *)0x7ffc3eba6033;
      uVar6 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7ee4aa;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
    }
    if (iVar3 < 2) goto LAB_7ffc3e7ee857;
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,1);
    lVar5 = *param_1;
    if (lVar4 == 0) goto LAB_7ffc3e7ee4a3;
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') goto LAB_7ffc3e7ee886;
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar5 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x70);
    if (lVar4 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7deca0(param_1,lVar5,lVar4,uVar2,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6);
    if (lVar5 == 0) {
      return 0;
    }
    uVar7 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
    if (lVar4 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x20);
    if (lVar4 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar7,uVar8);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
    if (lVar4 == 0) {
      return 0;
    }
    uVar10 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar9 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
      }
      if (0 < iVar3) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
        }
        if (1 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
          if (lVar5 == 0) {
            return 0;
          }
          uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar7,
                                   uVar8 & 0xffffffff00000000,uVar9);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_4 != 0) {
            lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
            if (lVar5 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
            if (lVar5 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar7);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            return uVar6;
          }
          goto LAB_7ffc3e7ee874;
        }
      }
LAB_7ffc3e7ee857:
      lVar5 = *param_1;
      puVar11 = (undefined *)0x7ffc3eba6019;
      uVar6 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7ee4aa;
    }
LAB_7ffc3e7ee874:
    lVar5 = *param_1;
  }
LAB_7ffc3e7ee4a3:
  puVar11 = &DAT_7ffc3eba6000;
  uVar6 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7ee4aa:
  (**(code **)(lVar5 + 0x70))(param_1,uVar6,puVar11);
  return 0;
}

/* JNI_dev_krypton_0r_c_13 | RVA 0x1e8b0 | dev/krypton/0r.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_0r_c_13
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e7ef17a;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b70 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc0980,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar10 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba606a);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b70 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b70;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3e7eede2:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7eee10:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3e7eede2;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3e7eede2;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                      if (lVar4 != 0) {
                        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                 uVar19 & 0xffffffff00000000,uVar13);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if ((cVar1 == '\0') &&
                           (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27), lVar4 != 0)
                           ) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,param_5,
                                                   uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                              (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                            FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              return lVar5;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3e7eee16;
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3e7eee10;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7eee16:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7ef17a:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_0r_a_14 | RVA 0x1f1a0 | dev/krypton/0r.a(JJ)I | success */

ulonglong JNI_dev_krypton_0r_a_14
                    (longlong *param_1,undefined8 param_2,ulonglong param_3,ulonglong param_4)

{
  uint uVar1;
  longlong *plVar2;
  char cVar3;
  byte bVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  uint *puVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  undefined *puVar15;
  undefined4 uVar16;
  uint uVar17;
  undefined8 uStack_98;
  int iStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_78;
  undefined4 uStack_74;
  ulonglong uStack_70;
  uint uStack_5c;
  longlong *plStack_58;
  longlong *plStack_50;
  ulonglong uStack_48;
  
  uStack_78 = 0x30;
  uStack_80 = param_4 << 0x30 | param_4;
  param_3 = uStack_80 ^ param_3;
  uStack_88 = CONCAT44(uStack_88._4_4_,0x2e);
  uVar17 = (uint)(param_3 >> 0x20);
  uVar5 = uVar17 >> 0xe;
  uStack_98 = CONCAT44(uStack_98._4_4_,uVar5);
  uStack_70 = param_4;
  lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar8 == 0) {
    return 0;
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1d);
  if (lVar9 == 0) {
    return 0;
  }
  uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar3 != '\0') {
    return 0;
  }
  if (uVar10 == 0) {
LAB_7ffc3e7efaf4:
    lVar8 = *param_1;
    puVar15 = &DAT_7ffc3eba6000;
    uVar13 = uRam00007ffc3ebc0a70;
  }
  else {
    if (bRam00007ffc3ebc08e5 == 1) {
      iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
      ;
    }
    else {
      iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
    }
    if ((int)uVar5 < iVar7) {
      lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar5);
      uVar10 = uStack_98;
      if (lVar8 != 0) {
LAB_7ffc3e7ef2b4:
        return uVar10 & 0xffffffff;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
      if (lVar8 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1e);
      if (lVar9 == 0) {
        return 0;
      }
      uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
      cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar3 != '\0') {
        return 0;
      }
      if (uVar11 == 0) goto LAB_7ffc3e7efaf4;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
      }
      if ((int)uVar5 < iVar7) {
        plStack_58 = (longlong *)(**(code **)(*param_1 + 0x568))(param_1,uVar11,uVar5);
        if ((plStack_58 != (longlong *)0x0) &&
           (cVar3 = (**(code **)(*param_1 + 0x100))(param_1,plStack_58,uRam00007ffc3ebc09e8),
           cVar3 != '\0')) {
          uStack_48 = uStack_98;
          iVar7 = *(int *)(&UNK_7ffc3eb991e8 + (ulonglong)(uVar17 >> 10 & 0x3f) * 4);
          uVar10 = (**(code **)(*param_1 + 0x598))(param_1,6);
          cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar3 != '\0') {
            return 0;
          }
          plStack_50 = (longlong *)(uVar10 & 0xfffffffffffffffc);
          uVar17 = 0;
          lVar8 = 0x23;
          do {
            uVar5 = ((uint)(param_3 >> ((byte)lVar8 & 0x3f)) & 0x7f) - iVar7;
            uStack_80 = 0x7f;
            uVar16 = (undefined4)(uVar10 >> 0x20);
            uStack_88 = CONCAT44(uVar16,(uVar5 >> 0x18 & 0xffffff80) + uVar5);
            if (uVar10 == 0) goto LAB_7ffc3e7efa9e;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar6 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
            }
            if (((int)uVar17 < 0) || (iVar6 <= (int)uVar17)) goto LAB_7ffc3e7efa84;
            if (bRam00007ffc3ebc08e5 == 1) {
              *(undefined4 *)
               (*(longlong *)(uVar10 & 0xfffffffffffffffc) +
               (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 4) = (undefined4)uStack_88;
            }
            else {
              (**(code **)(*param_1 + 0x698))(param_1,uVar10,(ulonglong)uVar17,1,&uStack_88);
            }
            plVar2 = plStack_58;
            uVar17 = uVar17 + 1;
            lVar8 = lVar8 + -7;
          } while (lVar8 != -7);
          cVar3 = (**(code **)(*param_1 + 0x100))(param_1,plStack_58,uRam00007ffc3ebc09e8);
          if (cVar3 == '\0') {
            lVar8 = *param_1;
            puVar15 = (undefined *)0x7ffc3eba6033;
            uVar13 = uRam00007ffc3ebc0a58;
          }
          else {
            if (plVar2 != (longlong *)0x0) {
              lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x2d);
              if (lVar8 == 0) {
                return 0;
              }
              uVar11 = FUN_7ffc3e7d1a50(param_1,plVar2);
              cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar3 != '\0') {
                return 0;
              }
              uStack_98._0_4_ = (undefined4)uVar11;
              uStack_98._4_4_ = (undefined4)(uVar11 >> 0x20);
              if (uVar11 != 0) {
                uVar17 = 0;
                plStack_58 = param_1;
                bVar4 = bRam00007ffc3ebc08e5;
                do {
                  if ((bVar4 & 1) == 0) {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                  }
                  else {
                    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  if (iVar7 <= (int)uVar17) {
LAB_7ffc3e7ef91e:
                    lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
                    if ((lVar8 != 0) &&
                       (lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1d), uVar10 = uStack_48, lVar9 != 0
                       )) {
                      uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
                      cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar3 == '\0') {
                        uStack_88 = (**(code **)(*param_1 + 0xd8))(param_1,uRam00007ffc3ebc09e8);
                        cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar3 == '\0') {
                          uStack_80 = uStack_88;
                          uStack_78 = (undefined4)uStack_98;
                          uStack_74 = uStack_98._4_4_;
                          if (uStack_88 != 0) {
                            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x2e);
                            if (lVar8 == 0) {
                              return 0;
                            }
                            FUN_7ffc3e7dbbc0(param_1,uStack_80,uRam00007ffc3ebc09e8,lVar8,
                                             CONCAT44(uStack_74,uStack_78));
                            cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar3 != '\0') {
                              return 0;
                            }
                            if (uVar11 == 0) goto LAB_7ffc3e7efaf4;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar7 <= iStack_90)) goto LAB_7ffc3e7efabf;
                            (**(code **)(*param_1 + 0x570))
                                      (param_1,uVar11,uVar10 & 0xffffffff,uStack_88);
                            goto LAB_7ffc3e7ef2b4;
                          }
                          break;
                        }
                      }
                    }
                    return 0;
                  }
                  if (bRam00007ffc3ebc08e5 == 0) {
                    uStack_88 = uVar10;
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                    uStack_88 = CONCAT44(uStack_88._4_4_,iVar7);
                    uVar14 = 0;
                    if (iVar7 != -1 || uVar17 != 0x80000000) goto LAB_7ffc3e7ef6cd;
                  }
                  else {
                    iVar7 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = CONCAT44(uVar16,iVar7);
LAB_7ffc3e7ef6cd:
                    uVar14 = (longlong)(int)uVar17 % (longlong)iVar7 & 0xffffffff;
                  }
                  if (uVar10 == 0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                  }
                  if (((int)uVar14 < 0) || (iVar7 <= (int)uVar14)) goto LAB_7ffc3e7efa84;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar12 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + uVar14 * 4 +
                                      *(longlong *)(uVar10 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar12 = &uStack_5c;
                    (**(code **)(*param_1 + 0x658))(param_1,uVar10,uVar14,1,puVar12);
                  }
                  uVar5 = *puVar12;
                  if (uVar5 == 0) goto LAB_7ffc3e7ef91e;
                  uStack_80 = CONCAT44(uStack_98._4_4_,uVar17);
                  uStack_88 = uVar11;
                  if (uVar11 == 0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                    uVar1 = uVar17;
                  }
                  else {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                    uVar1 = (uint)uStack_80;
                  }
                  if (((int)uVar1 < 0) || (iVar7 <= (int)uVar1)) goto LAB_7ffc3e7efa84;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar12 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar1 * 2 +
                                      *(longlong *)(uStack_88 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar12 = &uStack_5c;
                    (**(code **)(*param_1 + 0x648))(param_1,uStack_88,(ulonglong)uVar1,1,puVar12);
                  }
                  param_1 = plStack_58;
                  uStack_80 = CONCAT44(uVar16,uVar5);
                  uStack_88 = CONCAT44(uStack_88._4_4_,uVar5 & 0xffff ^ (uint)(ushort)*puVar12);
                  if (uVar11 == 0) {
                    lVar8 = *plStack_58;
                    puVar15 = &DAT_7ffc3eba6000;
                    uVar13 = uRam00007ffc3ebc0a70;
                    goto LAB_7ffc3e7efab5;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar7 = (**(code **)(*plStack_58 + 0x558))(plStack_58);
                  }
                  bVar4 = bRam00007ffc3ebc08e5;
                  if (((int)uVar17 < 0) || (iVar7 <= (int)uVar17)) goto LAB_7ffc3e7efa84;
                  uStack_5c._0_2_ = (undefined2)uStack_88;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    *(undefined2 *)
                     (*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 2) =
                         (undefined2)uStack_88;
                  }
                  else {
                    (**(code **)(*param_1 + 0x688))(param_1,uVar11,(ulonglong)uVar17,1,&uStack_5c);
                    bVar4 = bRam00007ffc3ebc08e5;
                  }
                  uVar17 = uVar17 + 1;
                } while (uVar11 != 0);
              }
            }
LAB_7ffc3e7efa9e:
            lVar8 = *param_1;
            puVar15 = &DAT_7ffc3eba6000;
            uVar13 = uRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3e7efab5;
        }
        goto LAB_7ffc3e7ef2b4;
      }
    }
LAB_7ffc3e7efabf:
    lVar8 = *param_1;
    puVar15 = (undefined *)0x7ffc3eba6019;
    uVar13 = uRam00007ffc3ebc0a98;
  }
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar15);
  return 0;
LAB_7ffc3e7efa84:
  lVar8 = *param_1;
  puVar15 = (undefined *)0x7ffc3eba6019;
  uVar13 = uRam00007ffc3ebc0a98;
LAB_7ffc3e7efab5:
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar15);
  return 0;
}

/* JNI_dev_krypton_0r_a_15 | RVA 0x1fb40 | dev/krypton/0r.a()V | success */

void JNI_dev_krypton_0r_a_15(longlong *param_1)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  longlong lVar8;
  code *UNRECOVERED_JUMPTABLE;
  undefined *puVar9;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar3 == 0) {
    return;
  }
  lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,0x1e);
  if (lVar4 == 0) {
    return;
  }
  uVar5 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba78b4);
  if (uVar5 == 0) {
LAB_7ffc3e7f1336:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar9 = &DAT_7ffc3eba6000;
    uVar6 = uRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
    }
    if (0 < iVar2) {
      (**(code **)(*param_1 + 0x570))(param_1,uVar5,0,uVar6);
      uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba78c4);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
      }
      if (1 < iVar2) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar5,1,uVar6);
        lVar4 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0960,0xc);
        if (lVar4 == 0) {
          return;
        }
        uVar6 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0960,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
        }
        if (2 < iVar2) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar5,2,uVar6);
          lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,0x1d);
          if (lVar4 == 0) {
            return;
          }
          uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba65aa);
          if (uVar7 == 0) goto LAB_7ffc3e7f1336;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (2 < iVar2) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uVar6);
            uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba78e3);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
            }
            if (3 < iVar2) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar5,3,uVar6);
              uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba78f3);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
              }
              if (4 < iVar2) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar5,4,uVar6);
                uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7909);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                }
                if (5 < iVar2) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar5,5,uVar6);
                  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7921);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                  }
                  if (6 < iVar2) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar5,6,uVar6);
                    uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7932);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                    }
                    if (7 < iVar2) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar5,7,uVar6);
                      lVar8 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
                      if (lVar8 == 0) {
                        return;
                      }
                      uVar6 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar8);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return;
                      }
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                      }
                      if (8 < iVar2) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar5,8,uVar6);
                        uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 != '\0') {
                          return;
                        }
                        uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6575);
                        if (uVar7 == 0) goto LAB_7ffc3e7f1336;
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                        }
                        if (8 < iVar2) {
                          (**(code **)(*param_1 + 0x570))(param_1,uVar7,8,uVar6);
                          uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7944);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                          }
                          if (9 < iVar2) {
                            (**(code **)(*param_1 + 0x570))(param_1,uVar5,9,uVar6);
                            uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7952);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                            }
                            if (10 < iVar2) {
                              (**(code **)(*param_1 + 0x570))(param_1,uVar5,10,uVar6);
                              uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7955);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                              }
                              if (0xb < iVar2) {
                                (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xb,uVar6);
                                uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7978);
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                }
                                if (0xc < iVar2) {
                                  (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xc,uVar6);
                                  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7991);
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                  }
                                  if (0xd < iVar2) {
                                    (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xd,uVar6);
                                    uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba79b0);
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                    }
                                    if (0xe < iVar2) {
                                      (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xe,uVar6);
                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                        (param_1,0x7ffc3eba79c4);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                      }
                                      if (0xf < iVar2) {
                                        (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xf,uVar6);
                                        uVar6 = (**(code **)(*param_1 + 0x538))
                                                          (param_1,0x7ffc3eba79d8);
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                        }
                                        if (0x10 < iVar2) {
                                          (**(code **)(*param_1 + 0x570))(param_1,uVar5,0x10,uVar6);
                                          uVar6 = (**(code **)(*param_1 + 0x538))
                                                            (param_1,0x7ffc3eba79e7);
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar2 = *(int *)(*(longlong *)
                                                              (uVar5 & 0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                          }
                                          if (0x11 < iVar2) {
                                            (**(code **)(*param_1 + 0x570))
                                                      (param_1,uVar5,0x11,uVar6);
                                            uVar6 = (**(code **)(*param_1 + 0x538))
                                                              (param_1,0x7ffc3eba7a15);
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar2 = *(int *)(*(longlong *)
                                                                (uVar5 & 0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5)
                                              ;
                                            }
                                            if (0x12 < iVar2) {
                                              (**(code **)(*param_1 + 0x570))
                                                        (param_1,uVar5,0x12,uVar6);
                                              uVar6 = (**(code **)(*param_1 + 0x538))
                                                                (param_1,0x7ffc3eba7a34);
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  (uVar5 & 0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (**(code **)(*param_1 + 0x558))
                                                                  (param_1,uVar5);
                                              }
                                              if (0x13 < iVar2) {
                                                (**(code **)(*param_1 + 0x570))
                                                          (param_1,uVar5,0x13,uVar6);
                                                uVar6 = (**(code **)(*param_1 + 0x538))
                                                                  (param_1,0x7ffc3eba7a57);
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    (uVar5 & 0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (**(code **)(*param_1 + 0x558))
                                                                    (param_1,uVar5);
                                                }
                                                if (0x14 < iVar2) {
                                                  (**(code **)(*param_1 + 0x570))
                                                            (param_1,uVar5,0x14,uVar6);
                                                  lVar8 = FUN_7ffc3eb76ce0(param_1,
                                                  uRam00007ffc3ebc0958,6);
                                                  if (lVar8 == 0) {
                                                    return;
                                                  }
                                                  uVar6 = (**(code **)(*param_1 + 0x488))
                                                                    (param_1,uRam00007ffc3ebc0958,
                                                                     lVar8);
                                                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                                  if (cVar1 != '\0') {
                                                    return;
                                                  }
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      (uVar5 & 0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x15 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x15,uVar6);
                                                    uVar7 = (**(code **)(*param_1 + 0x488))
                                                                      (param_1,lVar3,lVar4);
                                                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1)
                                                    ;
                                                    if (cVar1 != '\0') {
                                                      return;
                                                    }
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6786);
                                                    if (uVar7 == 0) goto LAB_7ffc3e7f1336;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar7 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar7);
                                                    }
                                                    if (0x15 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar7,0x15,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7a6a);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x16 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x16,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7a8f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x17 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x17,uVar6);
                                                      lVar8 = FUN_7ffc3eb76ce0(param_1,
                                                  uRam00007ffc3ebc0a08,0xd);
                                                  if (lVar8 == 0) {
                                                    return;
                                                  }
                                                  uVar6 = (**(code **)(*param_1 + 0x488))
                                                                    (param_1,uRam00007ffc3ebc0a08,
                                                                     lVar8);
                                                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                                  if (cVar1 != '\0') {
                                                    return;
                                                  }
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      (uVar5 & 0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x18 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x18,uVar6);
                                                    uVar7 = (**(code **)(*param_1 + 0x488))
                                                                      (param_1,lVar3,lVar4);
                                                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1)
                                                    ;
                                                    if (cVar1 != '\0') {
                                                      return;
                                                    }
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba65f0);
                                                    if (uVar7 == 0) goto LAB_7ffc3e7f1336;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar7 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar7);
                                                    }
                                                    if (0x18 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar7,0x18,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7aa0);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x19 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x19,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7ab1);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x1a < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x1a,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7ad9);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1b < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1b,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7aea);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x1c < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x1c,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7b13);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1d < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1d,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7b42);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x1e < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x1e,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7b5a);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1f < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1f,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7b80);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x20 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x20,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7bac);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x21 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x21,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7bcc);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x22 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x22,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7bf3);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x23 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x23,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7c0c);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x24 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x24,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7c25);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x25 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x25,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7c41);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x26 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x26,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7c6d);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x27 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x27,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7c90);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x28 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x28,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7cc6);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x29 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x29,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7ce4);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x2a < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x2a,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7d08);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x2b < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x2b,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7d21);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x2c < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x2c,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7d64);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x2d < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x2d,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7d87);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x2e < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x2e,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7da3);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x2f < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7f12f1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x2f,uVar6);
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
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar9 = (undefined *)0x7ffc3eba6019;
    uVar6 = uRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e7f1322. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar6,puVar9);
  return;
}

/* JNI_dev_krypton_0r_b_16 | RVA 0x21350 | dev/krypton/0r.b(JJ)Ljava/lang/Class; | success */

longlong JNI_dev_krypton_0r_b_16
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  ulonglong uVar6;
  longlong lVar7;
  undefined8 uVar8;
  longlong lVar9;
  undefined *puVar10;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x71);
  if (lVar5 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,lVar4,lVar5,param_3,param_4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76ce0(param_1,lVar4,0x1e);
  if (lVar5 == 0) {
    return 0;
  }
  uVar6 = (**(code **)(*param_1 + 0x488))(param_1,lVar4,lVar5);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar6 != 0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
    }
    if ((iVar2 < 0) || (iVar3 <= iVar2)) {
      lVar4 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6019;
      uVar8 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7f17f6;
    }
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,uVar6,iVar2);
    if (lVar4 == 0) {
      return 0;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uRam00007ffc3ebc09e8);
    if (cVar1 == '\0') {
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uRam00007ffc3ebc09a0);
      if (cVar1 != '\0') {
        return lVar4;
      }
      lVar4 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6033;
      uVar8 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7f17f6;
    }
    lVar4 = FUN_7ffc3eb76c30(param_1,0x26);
    if (lVar4 == 0) {
LAB_7ffc3e7f16ba:
      lVar4 = (**(code **)(*param_1 + 0x78))(param_1);
    }
    else {
      lVar7 = FUN_7ffc3eb76ce0(param_1,lVar4,0x1d);
      lVar5 = *param_1;
      if (lVar7 != 0) {
        uVar6 = (**(code **)(lVar5 + 0x488))(param_1,lVar4,lVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (uVar6 == 0) {
LAB_7ffc3e7f16a0:
            lVar4 = *param_1;
            puVar10 = &DAT_7ffc3eba6000;
            uVar8 = uRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
            }
            if (iVar2 < iVar3) {
              uVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar6,iVar2);
              lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x30);
              if (lVar5 != 0) {
                lVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc09a0,lVar5,uVar8);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar4,0x1e);
                  lVar5 = *param_1;
                  if (lVar9 == 0) goto LAB_7ffc3e7f169a;
                  uVar6 = (**(code **)(lVar5 + 0x488))(param_1,lVar4,lVar9);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (uVar6 == 0) goto LAB_7ffc3e7f16a0;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
                    }
                    if (iVar2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar6,iVar2,lVar7);
                      return lVar7;
                    }
                    goto LAB_7ffc3e7f1680;
                  }
                }
              }
              goto LAB_7ffc3e7f16ba;
            }
LAB_7ffc3e7f1680:
            lVar4 = *param_1;
            puVar10 = (undefined *)0x7ffc3eba6019;
            uVar8 = uRam00007ffc3ebc0a98;
          }
          (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar10);
        }
        goto LAB_7ffc3e7f16ba;
      }
LAB_7ffc3e7f169a:
      lVar4 = (**(code **)(lVar5 + 0x78))(param_1);
    }
    uVar8 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uVar8);
    if (cVar1 == '\0') {
      return 0;
    }
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar5 = FUN_7ffc3eb76c30(param_1,0x16);
    if (lVar5 == 0) {
      return 0;
    }
    lVar7 = (**(code **)(*param_1 + 0xd8))(param_1,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (lVar4 != 0) {
      lVar9 = FUN_7ffc3eb76c30(param_1,8);
      if (lVar9 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x31);
      if (lVar9 == 0) {
        return 0;
      }
      uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar7 != 0) {
        lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x32);
        if (lVar4 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(param_1,lVar7,lVar5,lVar4,uVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x68))(param_1,lVar7);
        return 0;
      }
    }
  }
  lVar4 = *param_1;
  puVar10 = &DAT_7ffc3eba6000;
  uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7f17f6:
  (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar10);
  return 0;
}

/* JNI_dev_krypton_0r_a_17 | RVA 0x21810 | dev/krypton/0r.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

longlong JNI_dev_krypton_0r_a_17
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  undefined8 uVar9;
  int iVar10;
  undefined8 *puVar11;
  undefined *puStack_50;
  
  puStack_50 = &DAT_7ffc3eba6000;
  puVar11 = (undefined8 *)0x7ffc3ebc0a70;
  if (param_3 != 0) {
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x33);
    if (lVar4 == 0) {
      return 0;
    }
    uVar5 = FUN_7ffc3e7d1a50(param_1,param_3,lVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar5 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
      }
      if (iVar2 < 1) {
        return 0;
      }
      puStack_50 = (undefined *)0x7ffc3eba6019;
      iVar10 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
        }
        if (iVar3 <= iVar10) break;
        lVar4 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,iVar10);
        if (lVar4 == 0) {
LAB_7ffc3e7f1a71:
          puStack_50 = &DAT_7ffc3eba6000;
          puVar11 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e7f1a8d;
        }
        lVar6 = FUN_7ffc3eb76c30(param_1,0x1b);
        if (lVar6 == 0) {
          return 0;
        }
        lVar7 = FUN_7ffc3eb76c90(param_1,lVar6,0x34);
        if (lVar7 == 0) {
          return 0;
        }
        lVar7 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar7 == 0) goto LAB_7ffc3e7f1a71;
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
        if (lVar8 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar7,lVar8,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (iVar3 != 0) {
          lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x36);
          if (lVar6 == 0) {
            return 0;
          }
          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          cVar1 = (**(code **)(*param_1 + 0xc0))(param_1,uVar9,param_5);
          if (cVar1 != '\0') {
            return lVar4;
          }
        }
        iVar10 = iVar10 + 1;
        if (iVar2 == iVar10) {
          return 0;
        }
      }
      puVar11 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e7f1a8d:
  (**(code **)(*param_1 + 0x70))(param_1,*puVar11,puStack_50);
  return 0;
}

/* JNI_dev_krypton_0r_b_18 | RVA 0x21ac0 | dev/krypton/0r.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

longlong JNI_dev_krypton_0r_b_18
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  int iVar8;
  undefined *puStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x72), lVar4 != 0)) {
    lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,param_3,param_4,param_5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      if (lVar3 != 0) {
        return lVar3;
      }
      if (param_3 == 0) {
        puStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return 0;
        }
        uVar5 = FUN_7ffc3e7d1a50(param_1,param_3,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (uVar5 == 0) {
          return 0;
        }
        if (cVar1 != '\0') {
          return 0;
        }
        puStack_48 = (undefined *)0x7ffc3eba6019;
        iVar8 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) {
            return 0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) break;
          uVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,iVar8);
          lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
          if (lVar3 == 0) {
            return 0;
          }
          lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x73);
          if (lVar4 == 0) {
            return 0;
          }
          lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,uVar6,param_4,param_5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          iVar8 = iVar8 + 1;
          if (lVar3 != 0) {
            return lVar3;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (**(code **)(*param_1 + 0x70))(param_1,*puVar7,puStack_48);
    }
  }
  return 0;
}

/* JNI_dev_krypton_0r_c_19 | RVA 0x21cf0 | dev/krypton/0r.c(JJ)Ljava/lang/reflect/Field; | success */

longlong JNI_dev_krypton_0r_c_19
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 uVar9;
  longlong lVar10;
  longlong lVar11;
  longlong lVar12;
  longlong lVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined *puVar16;
  undefined4 uVar17;
  
  lVar5 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x71);
  if (lVar6 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,lVar5,lVar6,param_3,param_4);
  uVar17 = (undefined4)((ulonglong)param_4 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,0x1e);
  if (lVar6 == 0) {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar7 == 0) goto LAB_7ffc3e7f2a20;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
  }
  if ((iVar2 < 0) || (iVar3 <= iVar2)) goto LAB_7ffc3e7f2a06;
  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
  if (lVar6 == 0) {
    FUN_7ffc3eb76c30(param_1,0x1b);
    return 0;
  }
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8);
  if (cVar1 == '\0') {
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1b);
    if (lVar5 == 0) {
      return 0;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar5);
    if (cVar1 != '\0') {
      return lVar6;
    }
    lVar5 = *param_1;
    puVar16 = (undefined *)0x7ffc3eba6033;
    uVar9 = uRam00007ffc3ebc0a58;
    goto LAB_7ffc3e7f2a34;
  }
  lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,0x1d);
  if (lVar6 == 0) {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar7 != 0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
    }
    if (iVar3 <= iVar2) {
LAB_7ffc3e7f2a06:
      lVar5 = *param_1;
      puVar16 = (undefined *)0x7ffc3eba6019;
      uVar9 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7f2a34;
    }
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
    if (lVar6 != 0) {
      lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3a);
      if (lVar8 == 0) {
        return 0;
      }
      iVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3b);
      if (lVar8 == 0) {
        return 0;
      }
      uVar15 = CONCAT44(uVar17,iVar3);
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,0,uVar15);
      uVar17 = (undefined4)((ulonglong)uVar15 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0x3c);
      if (lVar10 == 0) {
        return 0;
      }
      uVar9 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar10,uVar9,CONCAT44(uVar17,0x24));
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar11 = FUN_7ffc3eb76c90(param_1,lVar5,0x74);
      if (lVar11 == 0) {
        return 0;
      }
      uVar17 = 0;
      lVar12 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar11,uVar9,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
      if (lVar13 == 0) {
        return 0;
      }
      uVar9 = CONCAT44(uVar17,iVar3 + 1);
      iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar13,8,uVar9);
      uVar17 = (undefined4)((ulonglong)uVar9 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar15 = CONCAT44(uVar17,iVar4);
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar3 + 1,uVar15);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3f);
      if (lVar8 == 0) {
        return 0;
      }
      uVar14 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar4 + 1,uVar15);
      uVar17 = (undefined4)((ulonglong)uVar15 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar15 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar10,uVar14,CONCAT44(uVar17,0x24));
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar5 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar11,uVar15,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
      lVar6 = lVar12;
      if (lVar8 == 0) {
        return 0;
      }
      while( true ) {
        lVar10 = FUN_7ffc3eb76c90(param_1,lVar8,0x72);
        if (lVar10 == 0) {
          return 0;
        }
        lVar10 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar10,lVar6,uVar9,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar10 != 0) break;
        if (lVar6 == 0) goto LAB_7ffc3e7f2a20;
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
        if (lVar8 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (uVar7 != 0) {
          iVar3 = 0;
          while( true ) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (iVar4 <= iVar3) break;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (iVar4 <= iVar3) goto LAB_7ffc3e7f2a06;
            uVar15 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar3);
            lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
            if (lVar8 == 0) {
              return 0;
            }
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar8,0x73);
            if (lVar10 == 0) {
              return 0;
            }
            lVar10 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar10,uVar15,uVar9,lVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            iVar3 = iVar3 + 1;
            if (lVar10 != 0) {
              lVar5 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1e);
              if (lVar5 == 0) {
                return 0;
              }
              uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar5);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (uVar7 == 0) goto LAB_7ffc3e7f2a20;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
              }
              if (iVar3 <= iVar2) goto LAB_7ffc3e7f2a06;
              lVar5 = *param_1;
              goto LAB_7ffc3e7f25e7;
            }
          }
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
        if (lVar8 == 0) {
          return 0;
        }
        lVar8 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7131);
        if (lVar8 == 0) goto LAB_7ffc3e7f2a20;
        lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
        if (lVar10 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar8,lVar10,uVar15);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (iVar3 != 0) {
          lVar6 = FUN_7ffc3eb76c30(param_1,0x1c);
          if (lVar6 == 0) {
            return 0;
          }
          lVar8 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (lVar8 != 0) {
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x42);
            if (lVar10 == 0) {
              return 0;
            }
            FUN_7ffc3e7dbbc0(param_1,lVar8,lVar6,lVar10);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7142);
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x43);
            if (lVar10 == 0) {
              return 0;
            }
            lVar11 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar10,uVar15);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
              if (lVar13 == 0) {
                return 0;
              }
              uVar15 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar13);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar11 != 0) {
                lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar10,uVar15);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar11 != 0) {
                  lVar12 = FUN_7ffc3eb76c90(param_1,lVar6,0x44);
                  if (lVar12 == 0) {
                    return 0;
                  }
                  lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar12,0x20);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  if (lVar5 != 0) {
                    uVar15 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return 0;
                    }
                    if (lVar11 != 0) {
                      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar10,uVar15);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return 0;
                      }
                      if (lVar5 != 0) {
                        lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar12,0x20);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 != '\0') {
                          return 0;
                        }
                        if (lVar5 != 0) {
                          FUN_7ffc3e7d1a50(param_1,lVar5,lVar10,uVar9);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          lVar5 = FUN_7ffc3eb76c30(param_1,0x16);
                          if (lVar5 == 0) {
                            return 0;
                          }
                          lVar10 = (**(code **)(*param_1 + 0xd8))(param_1,lVar5);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x45);
                          if (lVar6 == 0) {
                            return 0;
                          }
                          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar6);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          if (lVar10 != 0) {
                            lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x32);
                            if (lVar6 == 0) {
                              return 0;
                            }
                            FUN_7ffc3e7dbbc0(param_1,lVar10,lVar5,lVar6,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return 0;
                            }
                            (**(code **)(*param_1 + 0x68))(param_1,lVar10);
                            return 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e7f2a20;
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x41);
        if (lVar8 == 0) {
          return 0;
        }
        lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar6 == 0) {
          lVar6 = FUN_7ffc3eb76c30(param_1,0x26);
          if (lVar6 == 0) {
            return 0;
          }
          lVar8 = FUN_7ffc3eb76c90(param_1,lVar6,0x74);
          if (lVar8 == 0) {
            return 0;
          }
          lVar6 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar8,0x6cb7c3cd75aa4,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
        }
        lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
        if (lVar8 == 0) {
          return 0;
        }
      }
      lVar5 = FUN_7ffc3eb76ce0(param_1,lVar8,0x1e);
      if (lVar5 == 0) {
        return 0;
      }
      uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar5);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar7 != 0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
        }
        if (iVar2 < iVar3) {
          lVar5 = *param_1;
LAB_7ffc3e7f25e7:
          (**(code **)(lVar5 + 0x570))(param_1,uVar7,iVar2,lVar10);
          return lVar10;
        }
        goto LAB_7ffc3e7f2a06;
      }
    }
  }
LAB_7ffc3e7f2a20:
  lVar5 = *param_1;
  puVar16 = &DAT_7ffc3eba6000;
  uVar9 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7f2a34:
  (**(code **)(lVar5 + 0x70))(param_1,uVar9,puVar16);
  return 0;
}

/* JNI_dev_krypton_0r_a_20 | RVA 0x22a40 | dev/krypton/0r.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

longlong JNI_dev_krypton_0r_a_20
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5,int param_6,ulonglong param_7)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  longlong lVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined8 uVar12;
  undefined8 *puVar13;
  int iVar14;
  undefined *puStack_68;
  
  puStack_68 = &DAT_7ffc3eba6000;
  puVar13 = (undefined8 *)0x7ffc3ebc0a70;
  if (param_3 != 0) {
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x46);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a50(param_1,param_3,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar6 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
      }
      if (iVar2 < 1) {
        return 0;
      }
      puStack_68 = (undefined *)0x7ffc3eba6019;
      iVar14 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
        }
        if (iVar3 <= iVar14) break;
        lVar5 = (**(code **)(*param_1 + 0x568))(param_1,uVar6,iVar14);
        if (lVar5 == 0) {
LAB_7ffc3e7f2e6a:
          puStack_68 = &DAT_7ffc3eba6000;
          puVar13 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e7f2e78;
        }
        lVar7 = FUN_7ffc3eb76c30(param_1,0x1d);
        if (lVar7 == 0) {
          return 0;
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,lVar7,0x47);
        if (lVar8 == 0) {
          return 0;
        }
        lVar8 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar8 == 0) goto LAB_7ffc3e7f2e6a;
        lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
        if (lVar9 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar8,lVar9,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (iVar3 != 0) {
          lVar8 = FUN_7ffc3eb76c90(param_1,lVar7,0x48);
          if (lVar8 == 0) {
            return 0;
          }
          uVar10 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          cVar1 = (**(code **)(*param_1 + 0xc0))(param_1,uVar10,param_5);
          if (cVar1 != '\0') {
            lVar7 = FUN_7ffc3eb76c90(param_1,lVar7,0x49);
            if (lVar7 == 0) {
              return 0;
            }
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar7);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (uVar11 == 0) goto LAB_7ffc3e7f2e6a;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
            }
            if (iVar3 == param_6) {
              if (param_6 < 1) {
                return lVar5;
              }
              iVar3 = 0;
              while( true ) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e7f2e5c;
                uVar10 = (**(code **)(*param_1 + 0x568))(param_1,uVar11,iVar3);
                if (param_7 == 0) goto LAB_7ffc3e7f2e6a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e7f2e5c;
                uVar12 = (**(code **)(*param_1 + 0x568))(param_1,param_7,iVar3);
                cVar1 = (**(code **)(*param_1 + 0xc0))(param_1,uVar10,uVar12);
                if (cVar1 == '\0') break;
                iVar3 = iVar3 + 1;
                if (param_6 == iVar3) {
                  return lVar5;
                }
              }
            }
          }
        }
        iVar14 = iVar14 + 1;
        if (iVar14 == iVar2) {
          return 0;
        }
      }
LAB_7ffc3e7f2e5c:
      puVar13 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e7f2e78:
  (**(code **)(*param_1 + 0x70))(param_1,*puVar13,puStack_68);
  return 0;
}

/* JNI_dev_krypton_0r_b_21 | RVA 0x22ea0 | dev/krypton/0r.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

longlong JNI_dev_krypton_0r_b_21
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5,undefined4 param_6,undefined8 param_7)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  int iVar8;
  undefined *puStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x75), lVar4 != 0)) {
    lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,param_3,param_4,param_5,param_6,param_7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      if (lVar3 != 0) {
        return lVar3;
      }
      if (param_3 == 0) {
        puStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return 0;
        }
        uVar5 = FUN_7ffc3e7d1a50(param_1,param_3,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (uVar5 == 0) {
          return 0;
        }
        if (cVar1 != '\0') {
          return 0;
        }
        puStack_48 = (undefined *)0x7ffc3eba6019;
        iVar8 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) {
            return 0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) break;
          uVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,iVar8);
          lVar3 = FUN_7ffc3eb76c30(param_1,0x26);
          if (lVar3 == 0) {
            return 0;
          }
          lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x76);
          if (lVar4 == 0) {
            return 0;
          }
          lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,uVar6,param_4,param_5,param_6,param_7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          iVar8 = iVar8 + 1;
          if (lVar3 != 0) {
            return lVar3;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (**(code **)(*param_1 + 0x70))(param_1,*puVar7,puStack_48);
    }
  }
  return 0;
}

/* JNI_dev_krypton_0r_d_22 | RVA 0x23110 | dev/krypton/0r.d(JJ)Ljava/lang/reflect/Method; | success */

longlong JNI_dev_krypton_0r_d_22
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 uVar9;
  longlong lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  longlong lVar13;
  ulonglong uVar14;
  longlong lVar15;
  longlong lVar16;
  uint uVar17;
  uint uVar18;
  int iVar19;
  undefined *puVar20;
  undefined4 uVar21;
  
  lVar5 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x71);
  if (lVar6 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,lVar5,lVar6,param_3,param_4);
  uVar21 = (undefined4)((ulonglong)param_4 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,0x1e);
  if (lVar6 == 0) {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar7 != 0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
    }
    if ((iVar2 < 0) || (iVar3 <= iVar2)) {
LAB_7ffc3e7f4357:
      lVar8 = *param_1;
      puVar20 = (undefined *)0x7ffc3eba6019;
      uVar9 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3e7f436f;
    }
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
    if (lVar6 == 0) {
      FUN_7ffc3eb76c30(param_1,0x1d);
      return 0;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8);
    if (cVar1 == '\0') {
      lVar5 = FUN_7ffc3eb76c30(param_1,0x1d);
      if (lVar5 == 0) {
        return 0;
      }
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar5);
      if (cVar1 != '\0') {
        return lVar6;
      }
      lVar8 = *param_1;
      puVar20 = (undefined *)0x7ffc3eba6033;
      uVar9 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3e7f436f;
    }
    lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,0x1d);
    if (lVar6 == 0) {
      return 0;
    }
    uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar7 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
      }
      if (iVar3 <= iVar2) goto LAB_7ffc3e7f4357;
      lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
      if (lVar6 != 0) {
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3a);
        if (lVar8 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3b);
        if (lVar8 == 0) {
          return 0;
        }
        uVar11 = CONCAT44(uVar21,iVar3);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,0,uVar11);
        uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0x3c);
        if (lVar10 == 0) {
          return 0;
        }
        uVar9 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar10,uVar9,CONCAT44(uVar21,0x24));
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,lVar5,0x74);
        if (lVar10 == 0) {
          return 0;
        }
        uVar21 = 0;
        lVar5 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar10,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
        if (lVar10 == 0) {
          return 0;
        }
        uVar9 = CONCAT44(uVar21,iVar3 + 1);
        iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar10,8,uVar9);
        uVar21 = (undefined4)((ulonglong)uVar9 >> 0x20);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar11 = CONCAT44(uVar21,iVar4);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar3 + 1,uVar11);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar18 = 0;
        iVar3 = iVar4;
        do {
          uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
          lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
          if (lVar8 == 0) {
            return 0;
          }
          uVar11 = CONCAT44(uVar21,iVar3 + 1);
          iVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8,uVar11);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar18 = uVar18 - 1;
        } while (-1 < iVar3);
        iVar3 = -2 - uVar18;
        lVar8 = *param_1;
        if (-1 < iVar3) {
          uVar7 = (**(code **)(lVar8 + 0x560))(param_1,iVar3,uRam00007ffc3ebc09a0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar17 = 0;
          do {
            uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
            if (lVar8 == 0) {
              return 0;
            }
            iVar19 = iVar4 + 1;
            uVar11 = CONCAT44(uVar21,iVar19);
            iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8,uVar11);
            uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3b);
            if (lVar8 == 0) {
              return 0;
            }
            uVar12 = CONCAT44(uVar21,iVar4);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar19,uVar12);
            uVar21 = (undefined4)((ulonglong)uVar12 >> 0x20);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0x3c);
            if (lVar8 == 0) {
              return 0;
            }
            uVar12 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar8,uVar11,
                                      CONCAT44(uVar21,0x24));
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c30(param_1,0x26);
            if (lVar8 == 0) {
              return 0;
            }
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar8,0x74);
            if (lVar10 == 0) {
              return 0;
            }
            uVar11 = 0;
            lVar8 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar10,uVar12,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if ((int)uVar17 < iVar3) {
              if (uVar7 == 0) goto LAB_7ffc3e7f4341;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar19 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
              }
              if (iVar19 <= (int)uVar17) goto LAB_7ffc3e7f4357;
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,uVar17,lVar8);
            }
            uVar17 = uVar17 + 1;
            lVar10 = lVar5;
          } while (~uVar18 != uVar17);
LAB_7ffc3e7f37c0:
          lVar6 = FUN_7ffc3eb76c30(param_1,0x26);
          if (lVar6 == 0) {
            return 0;
          }
          lVar13 = FUN_7ffc3eb76c90(param_1,lVar6,0x75);
          if (lVar13 == 0) {
            return 0;
          }
          lVar13 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar13,lVar10,uVar9,lVar8,iVar3,uVar7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (lVar13 != 0) {
            lVar5 = FUN_7ffc3eb76ce0(param_1,lVar6,0x1e);
            if (lVar5 == 0) {
              return 0;
            }
            lVar8 = *param_1;
LAB_7ffc3e7f3d41:
            uVar7 = (**(code **)(lVar8 + 0x488))(param_1,lVar6,lVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (uVar7 != 0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
              }
              if (iVar2 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar7,iVar2,lVar13);
                return lVar13;
              }
              goto LAB_7ffc3e7f4357;
            }
            goto LAB_7ffc3e7f4341;
          }
          if (lVar10 != 0) {
            lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
            if (lVar6 == 0) {
              return 0;
            }
            lVar6 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar6);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7131);
            if (lVar6 != 0) {
              lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
              if (lVar13 == 0) {
                return 0;
              }
              iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar13,uVar11);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              lVar15 = lVar5;
              if (iVar4 == 0) goto code_r0x7ffc3e7f38fe;
              goto joined_r0x7ffc3e7f39c1;
            }
          }
          goto LAB_7ffc3e7f4341;
        }
        puVar20 = (undefined *)0x7ffc3eba6048;
        uVar9 = uRam00007ffc3ebc0a80;
        goto LAB_7ffc3e7f436f;
      }
    }
  }
  goto LAB_7ffc3e7f4341;
code_r0x7ffc3e7f38fe:
  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x41);
  if (lVar6 == 0) {
    return 0;
  }
  lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar10 == 0) goto code_r0x7ffc3e7f394c;
  goto LAB_7ffc3e7f37c0;
code_r0x7ffc3e7f394c:
  lVar6 = FUN_7ffc3eb76c30(param_1,0x26);
  if (lVar6 == 0) {
    return 0;
  }
  lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x74);
  if (lVar10 == 0) {
    return 0;
  }
  FUN_7ffc3e7d1a80(param_1,lVar6,lVar10,0x6cb7c3cd75aa4,0);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
joined_r0x7ffc3e7f39c1:
  do {
    if (lVar15 == 0) goto LAB_7ffc3e7f4341;
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
    if (lVar6 == 0) {
      return 0;
    }
    uVar14 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar14 != 0) {
      iVar4 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar19 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar19 <= iVar4) break;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar19 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar19 <= iVar4) goto LAB_7ffc3e7f4357;
        uVar11 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,iVar4);
        lVar6 = FUN_7ffc3eb76c30(param_1,0x26);
        if (lVar6 == 0) {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x76);
        if (lVar10 == 0) {
          return 0;
        }
        lVar13 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar10,uVar11,uVar9,lVar8,iVar3,uVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        iVar4 = iVar4 + 1;
        if (lVar13 != 0) {
          lVar5 = FUN_7ffc3eb76ce0(param_1,lVar6,0x1e);
          if (lVar5 == 0) {
            return 0;
          }
          lVar8 = *param_1;
          goto LAB_7ffc3e7f3d41;
        }
      }
    }
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7131);
    if (lVar6 == 0) goto LAB_7ffc3e7f4341;
    lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
    if (lVar10 == 0) {
      return 0;
    }
    iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar10,uVar11);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (iVar4 != 0) {
      lVar6 = FUN_7ffc3eb76c30(param_1,0x1c);
      if (lVar6 == 0) {
        return 0;
      }
      lVar10 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar10 == 0) goto LAB_7ffc3e7f4341;
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar6,0x42);
      if (lVar13 == 0) {
        return 0;
      }
      FUN_7ffc3e7dbbc0(param_1,lVar10,lVar6,lVar13);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba715b);
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar6,0x43);
      if (lVar13 == 0) {
        return 0;
      }
      lVar15 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar13,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar16 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
      if (lVar16 == 0) {
        return 0;
      }
      uVar11 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar16);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar15 == 0) goto LAB_7ffc3e7f4341;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar13,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3e7f4341;
      lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x44);
      if (lVar6 == 0) {
        return 0;
      }
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6,0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar8 == 0) goto LAB_7ffc3e7f4341;
      uVar11 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar16);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3e7f4341;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3e7f4341;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6,0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3e7f4341;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3e7f4341;
      FUN_7ffc3e7d1a50(param_1,lVar5,lVar6,0x28);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar18 == 0xfffffffe) goto LAB_7ffc3e7f4098;
      if (uVar7 == 0) goto LAB_7ffc3e7f4341;
      iVar2 = 1;
      if (1 < iVar3) {
        iVar2 = iVar3;
      }
      iVar4 = 0;
      break;
    }
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x41);
    if (lVar6 == 0) {
      return 0;
    }
    lVar15 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (lVar15 == 0) {
      lVar6 = FUN_7ffc3eb76c30(param_1,0x26);
      if (lVar6 == 0) {
        return 0;
      }
      lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x74);
      if (lVar10 == 0) {
        return 0;
      }
      lVar15 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar10,0x6cb7c3cd75aa4,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
    }
  } while( true );
  while( true ) {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar4);
    if (lVar5 == 0) goto LAB_7ffc3e7f4341;
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return 0;
    }
    uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1c);
    if (lVar5 == 0) {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x43);
    if (lVar5 == 0) {
      return 0;
    }
    FUN_7ffc3e7d1a50(param_1,lVar10,lVar5,uVar9);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    iVar4 = iVar4 + 1;
    if (iVar4 < iVar3) {
      uVar9 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7175);
      FUN_7ffc3e7d1a50(param_1,lVar10,lVar5,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
    }
    if (iVar2 == iVar4) break;
    if (cRam00007ffc3ebc08e5 == '\0') {
      iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
    }
    else {
      iVar19 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
      ;
    }
    if (iVar19 <= iVar4) goto LAB_7ffc3e7f4357;
  }
LAB_7ffc3e7f4098:
  lVar5 = FUN_7ffc3eb76c30(param_1,0x1c);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x44);
  if (lVar6 == 0) {
    return 0;
  }
  FUN_7ffc3e7d1a50(param_1,lVar10,lVar6,0x29);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar6 == 0) {
    return 0;
  }
  lVar8 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x45);
  if (lVar5 == 0) {
    return 0;
  }
  uVar9 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar5);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar8 != 0) {
    lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,0x32);
    if (lVar5 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar8,lVar6,lVar5,uVar9);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    (**(code **)(*param_1 + 0x68))(param_1,lVar8);
    return 0;
  }
LAB_7ffc3e7f4341:
  lVar8 = *param_1;
  puVar20 = &DAT_7ffc3eba6000;
  uVar9 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7f436f:
  (**(code **)(lVar8 + 0x70))(param_1,uVar9,puVar20);
  return 0;
}

/* JNI_dev_krypton_0r_a_23 | RVA 0x243a0 | dev/krypton/0r.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */

undefined8
JNI_dev_krypton_0r_a_23
          (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,longlong param_5
          ,longlong param_6,undefined8 param_7,undefined8 param_8)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  longlong lVar13;
  longlong lVar14;
  undefined *puVar15;
  undefined4 uVar16;
  longlong lStack_50;
  
  if (param_5 == 0) goto LAB_7ffc3e7f5138;
  lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar4,0);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (iVar2 < 0xe7) {
    if ((iVar2 != 0x4a) && (iVar2 != 0xb5)) goto LAB_7ffc3e7f45d0;
LAB_7ffc3e7f444f:
    lVar4 = FUN_7ffc3eb76c30(param_1,0x26);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x77), lVar5 == 0))
    goto LAB_7ffc3e7f4b50;
    lVar4 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar5,param_7,param_8);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3e7f4b50;
    if (lVar4 == 0) goto LAB_7ffc3e7f4baf;
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1b);
    if ((lVar5 != 0) && (lVar11 = FUN_7ffc3eb76c90(param_1,lVar5,0x4e), lVar11 != 0)) {
      uVar6 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 != '\0') || (lVar11 = FUN_7ffc3eb76c90(param_1,lVar5,0x34), lVar11 == 0))
      goto LAB_7ffc3e7f4bc9;
      uVar7 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 != '\0') || (lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x36), lVar5 == 0))
      goto LAB_7ffc3e7f4bc9;
      uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar5);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') goto LAB_7ffc3e7f4bc9;
      if (iVar2 == 0x4a) {
        if (param_3 == 0) goto LAB_7ffc3e7f4baf;
        uVar9 = 0x50;
      }
      else if (iVar2 == 0xb5) {
        if (param_3 == 0) goto LAB_7ffc3e7f4baf;
        uVar9 = 0x51;
      }
      else if (iVar2 == 0xe7) {
        if (param_3 == 0) {
LAB_7ffc3e7f4baf:
          (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          goto LAB_7ffc3e7f4bc9;
        }
        uVar9 = 0x4f;
      }
      else {
        if (param_3 == 0) goto LAB_7ffc3e7f4baf;
        uVar9 = 0x52;
      }
      lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a90,uVar9);
      if (lVar5 == 0) goto LAB_7ffc3e7f4bc9;
      uVar6 = FUN_7ffc3e7d1a50(param_1,param_3,lVar5,uVar6,uVar7,uVar8);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') goto LAB_7ffc3e7f4bc9;
      lStack_50 = 0;
LAB_7ffc3e7f4894:
      if (param_6 == 0) {
LAB_7ffc3e7f4b96:
        lVar5 = *param_1;
        puVar15 = &DAT_7ffc3eba6000;
        uVar6 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7f4c7e:
        (**(code **)(lVar5 + 0x70))(param_1,uVar6,puVar15);
      }
      else {
        lVar5 = FUN_7ffc3eb76c30(param_1,0x19);
        if ((lVar5 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x24), lVar5 != 0)) {
          iVar2 = FUN_7ffc3e7d8be0(param_1,param_6,lVar5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if ((cVar1 == '\0') &&
               (lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6), lVar5 != 0)) {
              uVar7 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar10 == 0) goto LAB_7ffc3e7f4b96;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                }
                if (iVar3 < 1) {
                  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a98,0x7ffc3eba6019);
                }
                else {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar7);
                  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                    }
                    if (iVar3 < 2) {
                      lVar5 = *param_1;
                      puVar15 = (undefined *)0x7ffc3eba6019;
                      uVar6 = uRam00007ffc3ebc0a98;
                      goto LAB_7ffc3e7f4c7e;
                    }
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar7);
                    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
                    if (lVar5 != 0) {
                      uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,
                                               CONCAT44(uVar16,iVar2 + -2),uVar10);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 == '\0') {
                        return uVar6;
                      }
                    }
                    goto LAB_7ffc3e7f4c84;
                  }
                }
                lVar5 = (**(code **)(*param_1 + 0x78))(param_1);
                uVar6 = FUN_7ffc3eb76c30(param_1,8);
                cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uVar6);
                goto joined_r0x7ffc3e7f4c59;
              }
            }
          }
        }
      }
LAB_7ffc3e7f4c84:
      lVar5 = (**(code **)(*param_1 + 0x78))(param_1);
      uVar6 = FUN_7ffc3eb76c30(param_1,8);
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uVar6);
      goto joined_r0x7ffc3e7f4c59;
    }
LAB_7ffc3e7f4bc9:
    lVar5 = (**(code **)(*param_1 + 0x78))(param_1);
    uVar6 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uVar6);
    if (cVar1 == '\0') {
      return 0;
    }
    lStack_50 = 0;
  }
  else {
    if ((iVar2 == 0xf8) || (iVar2 == 0xe7)) goto LAB_7ffc3e7f444f;
LAB_7ffc3e7f45d0:
    lVar4 = FUN_7ffc3eb76c30(param_1,0x26);
    if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x78), lVar5 != 0)) {
      lStack_50 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar5,param_7,param_8);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
        if (lStack_50 == 0) {
          (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
        }
        else {
          lVar4 = FUN_7ffc3eb76c30(param_1,0x1d);
          if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x54), lVar5 != 0)) {
            uVar6 = FUN_7ffc3e7d1a50(param_1,lStack_50,lVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if ((cVar1 == '\0') && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x47), lVar5 != 0)) {
              uVar7 = FUN_7ffc3e7d1a50(param_1,lStack_50,lVar5);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if ((cVar1 == '\0') && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x48), lVar5 != 0)) {
                uVar8 = FUN_7ffc3e7d1a50(param_1,lStack_50,lVar5);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if ((cVar1 == '\0') && (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x49), lVar4 != 0)) {
                  uVar9 = FUN_7ffc3e7d1a50(param_1,lStack_50,lVar4);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (((cVar1 == '\0') && (lVar4 = FUN_7ffc3eb76c30(param_1,0x19), lVar4 != 0)) &&
                     (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x55), lVar5 != 0)) {
                    uVar8 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar5,uVar8,uVar9);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      if (iVar2 == 0xdb) {
                        if (param_3 == 0) goto LAB_7ffc3e7f51a9;
                        uVar9 = 0x57;
LAB_7ffc3e7f4ad9:
                        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a90,uVar9);
joined_r0x7ffc3e7f4b0c:
                        if (lVar4 != 0) {
                          uVar6 = FUN_7ffc3e7d1a50(param_1,param_3,lVar4,uVar6,uVar7,uVar8);
                          uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') {
                            lVar4 = 0;
                            goto LAB_7ffc3e7f4894;
                          }
                        }
                      }
                      else {
                        if (iVar2 == 0xd0) {
                          if (param_3 != 0) {
                            uVar9 = 0x56;
                            goto LAB_7ffc3e7f4ad9;
                          }
                        }
                        else if (param_3 != 0) {
                          lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a90,0x58);
                          goto joined_r0x7ffc3e7f4b0c;
                        }
LAB_7ffc3e7f51a9:
                        (**(code **)(*param_1 + 0x70))
                                  (param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      }
                      lVar5 = (**(code **)(*param_1 + 0x78))(param_1);
                      uVar6 = FUN_7ffc3eb76c30(param_1,8);
                      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uVar6);
                      if (cVar1 == '\0') {
                        return 0;
                      }
                      lVar4 = 0;
                      goto LAB_7ffc3e7f4cb8;
                    }
                  }
                }
              }
            }
          }
        }
        lVar5 = (**(code **)(*param_1 + 0x78))(param_1);
        uVar6 = FUN_7ffc3eb76c30(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uVar6);
        lVar4 = 0;
joined_r0x7ffc3e7f4c59:
        if (cVar1 == '\0') {
          return 0;
        }
        goto LAB_7ffc3e7f4cb8;
      }
    }
LAB_7ffc3e7f4b50:
    lVar5 = (**(code **)(*param_1 + 0x78))(param_1);
    uVar6 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uVar6);
    if (cVar1 == '\0') {
      return 0;
    }
    lStack_50 = 0;
    lVar4 = 0;
  }
LAB_7ffc3e7f4cb8:
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar11 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar11 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar11);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 == 0) goto LAB_7ffc3e7f5138;
  lVar13 = FUN_7ffc3eb76c90(param_1,lVar11,0x28);
  if (lVar13 == 0) {
    return 0;
  }
  FUN_7ffc3e7dbbc0(param_1,lVar12,lVar11,lVar13);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e7f5138;
  lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e0,0x59);
  if (lVar13 == 0) {
    return 0;
  }
  lVar13 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar13 == 0) goto LAB_7ffc3e7f5138;
  lVar14 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
  if (lVar14 == 0) {
    return 0;
  }
  uVar6 = FUN_7ffc3e7d1a50(param_1,lVar13,lVar14);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar11 = FUN_7ffc3eb76c90(param_1,lVar11,0x29);
  if (lVar11 == 0) {
    return 0;
  }
  lVar13 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar11,uVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
  if (lVar13 == 0) goto LAB_7ffc3e7f5138;
  lVar11 = FUN_7ffc3e7d1a50(param_1,lVar13,lVar11,uVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar4 == 0) {
    if (lStack_50 != 0) {
      lVar4 = FUN_7ffc3eb76c30(param_1,0x1d);
      if (lVar4 == 0) {
        return 0;
      }
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar4,0x5b);
      lVar4 = lStack_50;
      goto joined_r0x7ffc3e7f4eea;
    }
    uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7178);
  }
  else {
    lVar13 = FUN_7ffc3eb76c30(param_1,0x1b);
    if (lVar13 == 0) {
      return 0;
    }
    lVar13 = FUN_7ffc3eb76c90(param_1,lVar13,0x5a);
joined_r0x7ffc3e7f4eea:
    if (lVar13 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar13);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
  }
  if (lVar11 != 0) {
    lVar4 = FUN_7ffc3eb76c30(param_1,0x1a);
    if (lVar4 == 0) {
      return 0;
    }
    lVar13 = FUN_7ffc3eb76c90(param_1,lVar4,0x29);
    if (lVar13 == 0) {
      return 0;
    }
    lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar13,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar11 != 0) {
      lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar13,uVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar14 = FUN_7ffc3eb76c30(param_1,8);
      if (lVar14 == 0) {
        return 0;
      }
      lVar14 = FUN_7ffc3eb76c90(param_1,lVar14,0x31);
      if (lVar14 == 0) {
        return 0;
      }
      uVar6 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar11 != 0) {
        FUN_7ffc3e7d1a50(param_1,lVar11,lVar13,uVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76c30(param_1,0x16);
        if (lVar5 == 0) {
          return 0;
        }
        lVar11 = (**(code **)(*param_1 + 0xd8))(param_1,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x2b);
        if (lVar4 == 0) {
          return 0;
        }
        uVar6 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar11 != 0) {
          lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x32);
          if (lVar4 == 0) {
            return 0;
          }
          FUN_7ffc3e7dbbc0(param_1,lVar11,lVar5,lVar4,uVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          (**(code **)(*param_1 + 0x68))(param_1,lVar11);
          return 0;
        }
      }
    }
  }
LAB_7ffc3e7f5138:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_0r_a_24 | RVA 0x25200 | dev/krypton/0r.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

undefined8
JNI_dev_krypton_0r_a_24
          (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
          undefined8 param_5,undefined8 param_6,ulonglong param_7)

{
  char cVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  longlong lVar9;
  undefined *puVar10;
  undefined4 uVar11;
  undefined8 uVar12;
  
  if (param_7 == 0) goto LAB_7ffc3e7f5646;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3e7f5281:
    iVar2 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3e7f5281;
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3e7f5629:
    lVar9 = *param_1;
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar7 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_7);
    lVar9 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar9 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
LAB_7ffc3e7f5658:
        lVar9 = *param_1;
        puVar10 = (undefined *)0x7ffc3eba6033;
        uVar7 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3e7f5395;
      }
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return 0;
      }
      uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar2 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
      }
      if (iVar2 < iVar3) goto LAB_7ffc3e7f5629;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_7,iVar3 + -1);
      lVar9 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar9 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
        if (cVar1 == '\0') goto LAB_7ffc3e7f5658;
        uVar8 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar9 = FUN_7ffc3eb76c30(param_1,0x26);
        if (lVar9 == 0) {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76c90(param_1,lVar9,0x79);
        if (lVar5 == 0) {
          return 0;
        }
        uVar12 = param_6;
        lVar9 = FUN_7ffc3e7d1a80(param_1,lVar9,lVar5,param_3,param_4,param_5,param_6,uVar7,uVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27);
        if (lVar5 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,lVar9,param_6,param_5,uVar12,
                                 uVar7,uVar8);
        uVar11 = (undefined4)((ulonglong)param_6 >> 0x20);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (param_4 != 0) {
          lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
          if (lVar5 == 0) {
            return 0;
          }
          lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
          if (lVar5 == 0) {
            return 0;
          }
          FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          lVar5 = FUN_7ffc3eb76c30(param_1,0x12);
          if (lVar5 == 0) {
            return 0;
          }
          if (bRam00007ffc3ebc08e5 == 1) {
            uVar4 = *(undefined4 *)
                     (*(longlong *)(param_7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
            ;
          }
          else {
            uVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
          }
          if (lVar9 != 0) {
            lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x5d);
            if (lVar6 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3e7d1a50(param_1,lVar9,lVar6,lVar5,CONCAT44(uVar11,uVar4));
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar9 = *param_1;
            if (lVar5 != 0) {
              uVar7 = (**(code **)(lVar9 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,param_7);
              uVar7 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar7);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              return uVar7;
            }
            goto LAB_7ffc3e7f538e;
          }
        }
LAB_7ffc3e7f5646:
        lVar9 = *param_1;
      }
    }
LAB_7ffc3e7f538e:
    puVar10 = &DAT_7ffc3eba6000;
    uVar7 = uRam00007ffc3ebc0a70;
  }
LAB_7ffc3e7f5395:
  (**(code **)(lVar9 + 0x70))(param_1,uVar7,puVar10);
  return 0;
}

/* JNI_dev_krypton_0r_d_25 | RVA 0x25680 | dev/krypton/0r.d(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_0r_d_25
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e7f5fbe;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b78 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,5,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x19);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,4,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc09e0,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar10 = FUN_7ffc3eb76c30(param_1,0x26);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b78 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b78;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3e7f5c40:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3e7f5c54:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3e7f5c40;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3e7f5c40;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                      }
                      if (3 < iVar3) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar13,3,param_5);
                        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                        if (lVar4 != 0) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                   uVar19 & 0xffffffff00000000,uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27),
                             lVar4 != 0)) {
                            uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                     param_5,uVar13);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if ((cVar1 == '\0') &&
                               ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                                (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                              FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar1 == '\0') {
                                return lVar5;
                              }
                            }
                          }
                        }
                        goto LAB_7ffc3e7f5c5a;
                      }
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3e7f5c54;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7f5c5a:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba74df);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e7f5fbe:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

