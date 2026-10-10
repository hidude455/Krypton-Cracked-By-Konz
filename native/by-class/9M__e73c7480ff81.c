/* Native reconstruction for dev/krypton/9M.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_9M_8_0 | RVA 0x285260 | dev/krypton/9M.8([Ljava/lang/Object;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_8_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar5 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar3 < 1) {
      pJVar5 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea552f3;
    }
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar5 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2f);
        if (pvVar4 == (void *)0x0) {
          return 0;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,199);
        if (pvVar8 == (void *)0x0) {
          return 0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar13 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar8 + 0x10));
        }
        else {
          uVar13 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar4,0x7d);
        if (lVar6 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7db1e0(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (_DAT_7ffc3ebc5c40 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x2f);
          lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc5c40 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc5c40;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        uVar13 = uVar13 ^ uVar7;
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x57622512914727e8);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (_DAT_7ffc3ebc5c48 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x2f);
          lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc5c48 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc5c48;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x57657518716f67ed);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        while( true ) {
          if (_DAT_7ffc3ebc5c50 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2f);
            lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc5c50 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc5c50;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x576414241d9b9c6d);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          uVar11 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
          if (cVar2 == '\0') {
            if (_DAT_7ffc3ebc5c68 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
              if ((lVar6 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc5c68 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc5c68;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x5766b850ce5ecb24);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            if (0 < (int)((int)((longlong)uVar13 >> 0x3f) + (uint)(0 < (longlong)uVar13))) {
              if (_DAT_7ffc3ebc5c70 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaea34,0x7ffc3eba6204,0,0);
                if ((lVar6 != 0) &&
                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar4 != (void *)0x0)) {
                  _DAT_7ffc3ebc5c70 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
              pvVar4 = _DAT_7ffc3ebc5c70;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x5765c938e91d7052);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar13);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar8);
              uVar11 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                bVar1 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
                return bVar1;
              }
              return 0;
            }
          }
          else {
            if (_DAT_7ffc3ebc5c58 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
              if ((lVar6 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc5c58 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc5c58;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x5753d5b1505ee12d);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
          }
          pvVar9 = (void *)FUN_7ffc3eb76c30(env,0xaf);
          if (pvVar9 == (void *)0x0) {
            return 0;
          }
          if ((pvVar8 != (void *)0x0) &&
             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9), bVar1 == 0)) break;
          if (_DAT_7ffc3ebc5c60 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2f);
            lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebaea34,0x7ffc3eba6204,0,0);
            if ((lVar6 != 0) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc5c60 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
          }
          pvVar9 = _DAT_7ffc3ebc5c60;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
LAB_7ffc3ea56092:
            pvVar4 = (*(*env)->ExceptionOccurred)(env);
            pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar8);
            if (bVar1 == 0) {
              return 0;
            }
            (*(*env)->ExceptionClear)(env);
            lVar6 = FUN_7ffc3eb76c30(env,0x2f);
            if ((lVar6 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar6,0x1da), lVar12 != 0)) {
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar12,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                pvVar4 = (*(*env)->ExceptionOccurred)(env);
                goto LAB_7ffc3ea5613b;
              }
              (*(*env)->Throw)(env,pvVar4);
            }
            pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3ea5613b:
            pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar8);
            if (bVar1 == 0) {
              return 0;
            }
            (*(*env)->ExceptionClear)(env);
            lVar6 = FUN_7ffc3eb76c30(env,0x2f);
            if (lVar6 == 0) {
              return 0;
            }
            lVar12 = FUN_7ffc3eb76c90(env,lVar6,0x1da);
            if (lVar12 == 0) {
              return 0;
            }
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar12,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            (*(*env)->Throw)(env,pvVar4);
            return 0;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x5765c938e91d7052);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar8);
          uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3ea56092;
          bVar1 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
          if (iVar3 != 0) {
            return bVar1;
          }
          if (bVar1 != 0) {
            return 1;
          }
        }
      }
      pJVar5 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea552f3;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea552f3:
  (*pJVar5->ThrowNew)(env,pvVar4,arg2);
  return 0;
}

/* JNI_dev_krypton_9M_3_1 | RVA 0x286240 | dev/krypton/9M.3([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_3_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  undefined4 uVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  ulonglong uVar8;
  JNINativeInterface_ *pJVar9;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar10;
  undefined8 uVar11;
  char *arg2;
  ulonglong uVar12;
  
  if (arg0 == (void *)0x0) {
    pJVar9 = *env;
    goto LAB_7ffc3ea564aa;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) {
LAB_7ffc3ea56aeb:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    if ((pvVar5 == (void *)0x0) ||
       (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc09e8), bVar1 != 0)) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar3 < 2) goto LAB_7ffc3ea56aeb;
      pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar9 = *env;
      if (pvVar6 == (void *)0x0) {
LAB_7ffc3ea564aa:
        UNRECOVERED_JUMPTABLE = pJVar9->ThrowNew;
        arg2 = &DAT_7ffc3eba6000;
        pvVar5 = pvRam00007ffc3ebc0a70;
        goto LAB_7ffc3ea564b5;
      }
      bVar1 = (*pJVar9->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar7 == 0) {
          return;
        }
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar6,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar3 < 3) goto LAB_7ffc3ea56aeb;
        pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pJVar9 = *env;
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea564aa;
        bVar1 = (*pJVar9->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0a10);
        if (bVar1 != 0) {
          lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
          if (lVar7 == 0) {
            return;
          }
          uVar2 = FUN_7ffc3e7d8be0(env,pvVar6,lVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,arg0);
          }
          if (iVar3 < 4) goto LAB_7ffc3ea56aeb;
          pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
          pJVar9 = *env;
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea564aa;
          bVar1 = (*pJVar9->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0a10);
          if (bVar1 != 0) {
            uVar4 = FUN_7ffc3e7d8be0(env,pvVar6,lVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
            if (pvVar6 == (void *)0x0) {
              return;
            }
            pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,199);
            if (pvVar10 == (void *)0x0) {
              return;
            }
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar12 = *(ulonglong *)
                        (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (longlong)*(int *)((longlong)pvVar10 + 0x10));
            }
            else {
              uVar12 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar10);
            }
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc5930 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebb29fc,0x7ffc3eba8044,0,0);
              if ((lVar7 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc5930 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc5930;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar12 = uVar12 ^ uVar8;
            pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x787ac3085aec6685);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc5938 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebb29fc,0x7ffc3eba7293,0,0);
              if ((lVar7 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc5938 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc5938;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x7877cf4288cd123d);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
            FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc5940 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebb29fc,0x7ffc3eba7293,0,0);
              if ((lVar7 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc5940 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc5940;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar4)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x787f48be0be31569);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
            FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea568e6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar5 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3ea564b5:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea564c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2);
  return;
}

/* JNI_dev_krypton_9M_method_56131_2 | RVA 0x286b50 | dev/krypton/9M.method_56131()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_method_56131_2(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  void *pvVar7;
  longlong lVar8;
  undefined8 uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,199);
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
  lVar6 = FUN_7ffc3eb76c90(env,pvVar3,0x7d);
  if (lVar6 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (iVar2 != 0) {
LAB_7ffc3ea56d37:
    if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea56e76. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      return;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x30);
    if (lVar6 == 0) {
      return;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar6,0x7c);
    if (lVar8 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea56d9a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(*env)->ExceptionCheck)(env);
    return;
  }
  if (_DAT_7ffc3ebc2d08 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x2f);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebaea34
                             ,0x7ffc3eba71d3,0,0);
    if ((lVar6 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2d08 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2d08;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xe5f5ddb9cd3fd819);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar5 ^ 0x26db6883e2eb);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (lVar6 == 0) {
        return;
      }
      goto LAB_7ffc3ea56d37;
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar6 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar6,0x1da), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3ea56f21;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
  }
LAB_7ffc3ea56f21:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar6 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar6,0x1da), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea56fbd. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_9M_method_25420_3 | RVA 0x286fe0 | dev/krypton/9M.method_25420(Lnet/minecraft/class_332;IIF)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_method_25420_3
               (JNINativeInterface_ **env,void *receiver,void *arg0,int arg1,int arg2,float arg3)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  undefined8 uVar8;
  undefined8 in_stack_ffffffffffffff60;
  undefined4 uVar9;
  undefined8 in_stack_ffffffffffffff68;
  undefined4 uVar10;
  
  uVar9 = (undefined4)((ulonglong)in_stack_ffffffffffffff60 >> 0x20);
  uVar10 = (undefined4)((ulonglong)in_stack_ffffffffffffff68 >> 0x20);
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if ((pvVar2 != (void *)0x0) &&
     (pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,199), pvVar3 != (void *)0x0)) {
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
      if (_DAT_7ffc3ebc8d98 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,0x2f);
        uVar10 = 0x7ffc;
        uVar9 = 0x7ffc;
        lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
        if ((lVar6 != 0) &&
           (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0
           )) {
          _DAT_7ffc3ebc8d98 = (*(*env)->NewGlobalRef)(env,pvVar2);
        }
      }
      pvVar2 = _DAT_7ffc3ebc8d98;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xd76d90bee3fa4bd6);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar4 ^ 0x3edc3cd6d04e);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar5);
        pvVar2 = (void *)FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc8da0 == (void *)0x0) {
            uVar8 = FUN_7ffc3eb76c30(env,0x2f);
            uVar10 = 0x7ffc;
            uVar9 = 0x7ffc;
            lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebaea34,0x7ffc3ebab583,0,0);
            if ((lVar6 != 0) &&
               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar3 != (void *)0x0)) {
              _DAT_7ffc3ebc8da0 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
          pvVar3 = _DAT_7ffc3ebc8da0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar2);
            pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xd7507ad57414d635);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar2);
            pvVar2 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar4 ^ 0x3edc3cd6d04e);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar2);
            lVar6 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (lVar6 != 0) {
                return;
              }
              if (receiver == (void *)0x0) {
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
              }
              else {
                lVar6 = FUN_7ffc3eb76c30(env,0x30);
                if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x1db), lVar7 != 0)) {
                  FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7,arg0,CONCAT44(uVar9,arg1),
                                   CONCAT44(uVar10,arg2),(double)arg3);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    return;
                  }
                }
              }
            }
          }
        }
      }
      pvVar2 = (*(*env)->ExceptionOccurred)(env);
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar2,pvVar3);
      if (bVar1 != 0) {
        (*(*env)->ExceptionClear)(env);
        lVar6 = FUN_7ffc3eb76c30(env,0x2f);
        if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x1da), lVar7 != 0)) {
          pvVar2 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar2);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea5753c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->Throw)(env,pvVar2);
            return;
          }
        }
      }
    }
  }
  return;
}

/* JNI_dev_krypton_9M_method_25394_4 | RVA 0x287540 | dev/krypton/9M.method_25394(Lnet/minecraft/class_332;IIF)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_method_25394_4
               (JNINativeInterface_ **env,void *receiver,void *arg0,int arg1,int arg2,float arg3)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  void *pvVar7;
  void *pvVar8;
  ulonglong uVar9;
  longlong lVar10;
  void *pvVar11;
  void *pvVar12;
  void *pvVar13;
  void *arg1_00;
  undefined8 uVar14;
  longlong lVar15;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar16;
  ulonglong uVar17;
  char *pcVar18;
  ulonglong uVar19;
  ulonglong in_stack_ffffffffffffff38;
  ulonglong in_stack_ffffffffffffff40;
  ulonglong in_stack_ffffffffffffff50;
  ulonglong in_stack_ffffffffffffff58;
  undefined4 uVar20;
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar7 == (void *)0x0) {
    return;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,199);
  if (pvVar8 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar8 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar8);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x7d);
  if (lVar10 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar7,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc8c00 == (void *)0x0) {
    uVar14 = FUN_7ffc3eb76c30(env,0x2f);
    in_stack_ffffffffffffff50 = 0x7ffc3eba7e1f;
    in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
    in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
    in_stack_ffffffffffffff58 = 0;
    lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
    if ((lVar10 != 0) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
    {
      _DAT_7ffc3ebc8c00 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
  }
  pvVar7 = _DAT_7ffc3ebc8c00;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar19 = uVar9 ^ 0x12383a64302a;
    pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x3709bc5ae548abb2);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea5a56a;
    if (_DAT_7ffc3ebc8c08 == (void *)0x0) {
      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
      in_stack_ffffffffffffff50 = 0x7ffc3eba7e3d;
      in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
      in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
      in_stack_ffffffffffffff58 = 0;
      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaea34,0x7ffc3eba7e3d,0,0);
      if ((lVar10 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8c08 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8c08;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea5a56a;
    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x370e6b5808072735);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea5a56a;
    uVar17 = uVar9 ^ 0xcd8d86e4558;
    if (iVar2 == 0) {
      bVar1 = (*(*env)->IsSameObject)(env,pvVar7,receiver);
      if (bVar1 == 0) {
        return;
      }
      if (_DAT_7ffc3ebc8c10 == (void *)0x0) {
        uVar14 = FUN_7ffc3eb76c30(env,0x2f);
        in_stack_ffffffffffffff50 = 0x7ffc3eba6153;
        in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
        in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
        in_stack_ffffffffffffff58 = 0;
        lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3eba74db,0x7ffc3eba6153,0,0);
        if ((lVar10 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar7 != (void *)0x0)) {
          _DAT_7ffc3ebc8c10 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc8c10;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x370f9ca179eee792);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc8c18 == (void *)0x0) {
            uVar14 = FUN_7ffc3eb76c30(env,0x2f);
            in_stack_ffffffffffffff50 = 0x7ffc3eba7e3d;
            in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
            in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
            in_stack_ffffffffffffff58 = 0;
            lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebaea34,0x7ffc3eba7e3d,0,0);
            if ((lVar10 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc8c18 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc8c18;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x37399aac2ba192cb);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
            lVar10 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (lVar10 == 0) goto LAB_7ffc3ea57f27;
              if (_DAT_7ffc3ebc8c20 == (void *)0x0) {
                uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                in_stack_ffffffffffffff50 = 0x7ffc3eba6153;
                in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
                in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
                in_stack_ffffffffffffff58 = 0;
                lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3eba74db,0x7ffc3eba6153,0,0);
                if ((lVar10 != 0) &&
                   (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar7 != (void *)0x0)) {
                  _DAT_7ffc3ebc8c20 = (*(*env)->NewGlobalRef)(env,pvVar7);
                }
              }
              pvVar7 = _DAT_7ffc3ebc8c20;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x370f9ca179eee792);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar19);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc8c28 == (void *)0x0) {
                    uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                    in_stack_ffffffffffffff50 = 0x7ffc3eba7e3d;
                    in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
                    in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
                    in_stack_ffffffffffffff58 = 0;
                    lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebaea34,0x7ffc3eba7e3d,0,0);
                    if ((lVar10 != 0) &&
                       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                       pvVar8 != (void *)0x0)) {
                      _DAT_7ffc3ebc8c28 = (*(*env)->NewGlobalRef)(env,pvVar8);
                    }
                  }
                  pvVar8 = _DAT_7ffc3ebc8c28;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x37399aac2ba192cb);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar19);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) goto LAB_7ffc3ea57854;
                  }
                }
              }
            }
          }
        }
      }
      goto LAB_7ffc3ea5a6cf;
    }
LAB_7ffc3ea57854:
    if (_DAT_7ffc3ebc8c30 == (void *)0x0) {
      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
      in_stack_ffffffffffffff50 = 0x7ffc3eba7e6f;
      in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
      in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
      in_stack_ffffffffffffff58 = 0;
      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba7e6f,0,0);
      if ((lVar10 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8c30 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8c30;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar11 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,arg0);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,(double)arg3);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,4,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x373849b747ff720c);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,5,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,6,pvVar7);
    FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar20 = (undefined4)(in_stack_ffffffffffffff58 >> 0x20);
    if (bVar1 != 0) {
      return;
    }
    if (iVar2 == 0) {
LAB_7ffc3ea57f27:
      if (_DAT_7ffc3ebc8c38 == (void *)0x0) {
        uVar14 = FUN_7ffc3eb76c30(env,0x2f);
        in_stack_ffffffffffffff50 = 0x7ffc3ebb29ff;
        in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
        in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
        in_stack_ffffffffffffff58 = 0;
        lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebaea34,0x7ffc3ebb29ff,0,0);
        if ((lVar10 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar7 != (void *)0x0)) {
          _DAT_7ffc3ebc8c38 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc8c38;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
LAB_7ffc3ea5a4ce:
        pvVar8 = (*(*env)->ExceptionOccurred)(env);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
        if (bVar1 != 0) {
          (*(*env)->ExceptionClear)(env);
          lVar10 = FUN_7ffc3eb76c30(env,0x2f);
          if ((lVar10 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar10,0x1da), lVar15 != 0)) {
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar15,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              pvVar8 = (*(*env)->ExceptionOccurred)(env);
              goto LAB_7ffc3ea5a576;
            }
            (*(*env)->Throw)(env,pvVar7);
          }
          goto LAB_7ffc3ea5a56a;
        }
        goto LAB_7ffc3ea5a576;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x370c4e5d89fbfb5a);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
      lVar10 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      uVar20 = (undefined4)(in_stack_ffffffffffffff58 >> 0x20);
      if (bVar1 != 0) goto LAB_7ffc3ea5a4ce;
      if (lVar10 != 0) goto LAB_7ffc3ea5802b;
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x34);
      pJVar16 = *env;
      if (pvVar7 != (void *)0x0) {
        pvVar8 = (*pJVar16->AllocObject)(env,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar8 == (void *)0x0) {
            (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          }
          else {
            lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x84);
            if (lVar10 != 0) {
              in_stack_ffffffffffffff40 = in_stack_ffffffffffffff40 & 0xffffffff00000000;
              FUN_7ffc3e7dbbc0(env,pvVar8,pvVar7,lVar10,
                               in_stack_ffffffffffffff38 & 0xffffffff00000000,
                               in_stack_ffffffffffffff40,uVar17,
                               in_stack_ffffffffffffff50 & 0xffffffff00000000,
                               in_stack_ffffffffffffff58 & 0xffffffff00000000);
              uVar3 = (undefined4)(in_stack_ffffffffffffff40 >> 0x20);
              uVar20 = (undefined4)(uVar17 >> 0x20);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc8c40 == (void *)0x0) {
                  uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                  uVar20 = 0x7ffc;
                  uVar3 = 0x7ffc;
                  lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebb29fc,0x7ffc3ebb2a26,0,0);
                  if ((lVar10 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc8c40 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc8c40;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x370c4e5d89fbfb5a);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar19);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar8);
                  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) goto LAB_7ffc3ea588be;
                }
              }
            }
          }
        }
        goto LAB_7ffc3ea5a633;
      }
LAB_7ffc3ea5a639:
      pvVar8 = (*pJVar16->ExceptionOccurred)(env);
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
      if (bVar1 == 0) goto LAB_7ffc3ea5a6db;
      goto LAB_7ffc3ea5a663;
    }
LAB_7ffc3ea5802b:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x34);
    if (pvVar7 == (void *)0x0) {
      return;
    }
    pvVar8 = (*(*env)->AllocObject)(env,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc8c48 == (void *)0x0) {
      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
      in_stack_ffffffffffffff50 = 0x7ffc3ebb29ff;
      in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
      in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
      uVar20 = 0;
      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaea34,0x7ffc3ebb29ff,0,0);
      if ((lVar10 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
         pvVar11 != (void *)0x0)) {
        _DAT_7ffc3ebc8c48 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc8c48;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x370c4e5d89fbfb5a);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar12 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar10 == 0) {
      return;
    }
    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar10,uVar9 ^ 0x3cb672edf99);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar12 == (void *)0x0) {
LAB_7ffc3ea5a4b1:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar18 = &DAT_7ffc3eba6000;
      pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea5a5bf:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea5a5dd. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar7,pcVar18);
      return;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar4 = (*(*env)->GetArrayLength)(env,pvVar12);
    }
    if (iVar4 < 1) goto LAB_7ffc3ea5a5a3;
    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar13);
    if (_DAT_7ffc3ebc8c50 == (void *)0x0) {
      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
      in_stack_ffffffffffffff50 = 0x7ffc3eba6347;
      in_stack_ffffffffffffff40 = 0x7ffc3eba606c;
      in_stack_ffffffffffffff38 = 0x7ffc3eba606a;
      uVar20 = 0;
      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba6347,0,0);
      if ((lVar10 != 0) &&
         (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
         pvVar13 != (void *)0x0)) {
        _DAT_7ffc3ebc8c50 = (*(*env)->NewGlobalRef)(env,pvVar13);
      }
    }
    pvVar13 = _DAT_7ffc3ebc8c50;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar11);
    (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar12);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x3732b81aac794977);
    (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar11);
    uVar14 = FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,arg1_00);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    uVar3 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
    if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea5a4b1;
    lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x84);
    if (lVar10 == 0) {
      return;
    }
    in_stack_ffffffffffffff40 = in_stack_ffffffffffffff40 & 0xffffffff00000000;
    FUN_7ffc3e7dbbc0(env,pvVar8,pvVar7,lVar10,in_stack_ffffffffffffff38 & 0xffffffff00000000,
                     in_stack_ffffffffffffff40,uVar17,in_stack_ffffffffffffff50 & 0xffffffff00000000
                     ,CONCAT44(uVar20,uVar3));
    uVar3 = (undefined4)(in_stack_ffffffffffffff40 >> 0x20);
    uVar20 = (undefined4)(uVar17 >> 0x20);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc8c58 == (void *)0x0) {
      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
      uVar20 = 0x7ffc;
      uVar3 = 0x7ffc;
      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebb29fc,0x7ffc3ebb2a26,0,0);
      if ((lVar10 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8c58 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc8c58;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x370c4e5d89fbfb5a);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar8);
    FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
LAB_7ffc3ea588be:
    if (_DAT_7ffc3ebc8c60 == (void *)0x0) {
      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
      uVar20 = 0x7ffc;
      uVar3 = 0x7ffc;
      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaea34,0x7ffc3ebb29ff,0,0);
      if ((lVar10 != 0) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8c60 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
    }
    pvVar7 = _DAT_7ffc3ebc8c60;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x370c4e5d89fbfb5a);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar10 != 0)) {
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar10,uVar9 ^ 0x3cb672edf99);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (pvVar8 == (void *)0x0) {
              pJVar16 = *env;
              pcVar18 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
              }
              if (0 < iVar4) {
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                if (_DAT_7ffc3ebc8c68 == (void *)0x0) {
                  uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                  uVar20 = 0x7ffc;
                  uVar3 = 0x7ffc;
                  lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba6347,0,0);
                  if ((lVar10 != 0) &&
                     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                     pvVar11 != (void *)0x0)) {
                    _DAT_7ffc3ebc8c68 = (*(*env)->NewGlobalRef)(env,pvVar11);
                  }
                }
                pvVar11 = _DAT_7ffc3ebc8c68;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x3732b81aac794977);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar19);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                  uVar14 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    uVar5 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                    if (_DAT_7ffc3ebc8c70 == (void *)0x0) {
                      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                      uVar20 = 0x7ffc;
                      uVar3 = 0x7ffc;
                      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                                0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3ebb2a4e,0,0);
                      if ((lVar10 != 0) &&
                         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                         pvVar7 != (void *)0x0)) {
                        _DAT_7ffc3ebc8c70 = (*(*env)->NewGlobalRef)(env,pvVar7);
                      }
                    }
                    pvVar7 = _DAT_7ffc3ebc8c70;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x370f0103ffbea86d);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar19);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (_DAT_7ffc3ebc8c78 == (void *)0x0) {
                          uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                          uVar20 = 0x7ffc;
                          uVar3 = 0x7ffc;
                          lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                                    0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3ebabeb2,0,0
                                                   );
                          if ((lVar10 != 0) &&
                             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                             pvVar8 != (void *)0x0)) {
                            _DAT_7ffc3ebc8c78 = (*(*env)->NewGlobalRef)(env,pvVar8);
                          }
                        }
                        pvVar8 = _DAT_7ffc3ebc8c78;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar11 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,
                                                            uVar9 ^ 0x6c52711aca89);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x3739d2d7271766ee)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar19);
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
                          uVar14 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            bVar1 = FUN_7ffc3e7d53d0(env,uVar14,uRam00007ffc3ebc0a38);
                            if (iVar2 == 0) {
                              if (bVar1 != 0) {
                                if (_DAT_7ffc3ebc8c80 == (void *)0x0) {
                                  uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                  uVar20 = 0x7ffc;
                                  uVar3 = 0x7ffc;
                                  lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,
                                                            0x7ffc3eba6478,0x7ffc3eba606c,
                                                            0x7ffc3eba7805,0x7ffc3eba647c,0,0);
                                  if ((lVar10 != 0) &&
                                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                        uRam00007ffc3ebc0a00),
                                     pvVar7 != (void *)0x0)) {
                                    _DAT_7ffc3ebc8c80 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                  }
                                }
                                pvVar7 = _DAT_7ffc3ebc8c80;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  return;
                                }
                                pvVar8 = (*(*env)->NewObjectArray)
                                                   (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                   uRam00007ffc3ebc0998,0xd50);
                                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,
                                                                   uVar9 ^ 0x1554a74a5d2e74f2);
                                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                                uVar14 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  return;
                                }
                                uVar6 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                                goto joined_r0x7ffc3ea59508;
                              }
                              if (uVar5 != 0) goto LAB_7ffc3ea58ddd;
                            }
                            else {
                              uVar6 = (uint)bVar1;
joined_r0x7ffc3ea59508:
                              if (uVar6 != uVar5) {
LAB_7ffc3ea58ddd:
                                if (_DAT_7ffc3ebc8c88 == (void *)0x0) {
                                  uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                  uVar20 = 0x7ffc;
                                  uVar3 = 0x7ffc;
                                  lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,
                                                            0x7ffc3eba606a,0x7ffc3eba606c,
                                                            0x7ffc3eba74db,0x7ffc3ebb2a4e,0,0);
                                  if ((lVar10 != 0) &&
                                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                        uRam00007ffc3ebc0a00),
                                     pvVar7 != (void *)0x0)) {
                                    _DAT_7ffc3ebc8c88 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                  }
                                }
                                pvVar7 = _DAT_7ffc3ebc8c88;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar8 = (*(*env)->NewObjectArray)
                                                     (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x370f0103ffbea86d);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar19);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                                  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,
                                                                    pvVar8);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    if (_DAT_7ffc3ebc8c90 == (void *)0x0) {
                                      uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                      uVar20 = 0x7ffc;
                                      uVar3 = 0x7ffc;
                                      lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,
                                                                0x7ffc3eba606a,0x7ffc3eba606c,
                                                                0x7ffc3ebadae6,0x7ffc3ebabeb2,0,0);
                                      if ((lVar10 != 0) &&
                                         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                            uRam00007ffc3ebc0a00),
                                         pvVar8 != (void *)0x0)) {
                                        _DAT_7ffc3ebc8c90 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                      }
                                    }
                                    pvVar8 = _DAT_7ffc3ebc8c90;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      pvVar11 = (*(*env)->NewObjectArray)
                                                          (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,
                                                                        uVar9 ^ 0x6c52711aca89);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,
                                                                        0x3739d2d7271766ee);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,uVar19)
                                      ;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
                                      uVar14 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                                pvVar11);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        bVar1 = FUN_7ffc3e7d53d0(env,uVar14,uRam00007ffc3ebc0a38);
                                        uVar5 = (uint)bVar1;
                                        if (iVar2 == 0) {
                                          if (bVar1 == 0) {
                                            uVar5 = 0;
                                          }
                                          else {
                                            if (_DAT_7ffc3ebc8c98 == (void *)0x0) {
                                              uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                              uVar20 = 0x7ffc;
                                              uVar3 = 0x7ffc;
                                              lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,
                                                                        0x7ffc3eba6478,
                                                                        0x7ffc3eba606c,
                                                                        0x7ffc3eba7805,
                                                                        0x7ffc3eba647c,0,0);
                                              if ((lVar10 != 0) &&
                                                 (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
                                                _DAT_7ffc3ebc8c98 =
                                                     (*(*env)->NewGlobalRef)(env,pvVar7);
                                              }
                                            }
                                            pvVar7 = _DAT_7ffc3ebc8c98;
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) {
                                              return;
                                            }
                                            pvVar8 = (*(*env)->NewObjectArray)
                                                               (env,2,pvRam00007ffc3ebc09e0,
                                                                (void *)0x0);
                                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0xd50);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar9 ^ 0x1554a74a5d2e74f2);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                                            uVar14 = FUN_7ffc3e7d1a50(env,pvVar7,
                                                                      uRam00007ffc3ebc0a40,pvVar8);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) {
                                              return;
                                            }
                                            uVar5 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0
                                                                    );
                                          }
                                        }
                                        if (_DAT_7ffc3ebc8ca0 == (void *)0x0) {
                                          uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                          uVar20 = 0x7ffc;
                                          uVar3 = 0x7ffc;
                                          lVar10 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebb29c6,
                                                                    0x7ffc3eba606a,0x7ffc3eba606c,
                                                                    0x7ffc3ebaea34,0x7ffc3ebb29ff,0,
                                                                    0);
                                          if ((lVar10 != 0) &&
                                             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                                uRam00007ffc3ebc0a00
                                                                               ),
                                             pvVar7 != (void *)0x0)) {
                                            _DAT_7ffc3ebc8ca0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                          }
                                        }
                                        pvVar7 = _DAT_7ffc3ebc8ca0;
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) {
                                          return;
                                        }
                                        pvVar8 = (*(*env)->NewObjectArray)
                                                           (env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                                        ;
                                        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                           uRam00007ffc3ebc0918,
                                                                           0x370c4e5d89fbfb5a);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                           uRam00007ffc3ebc0918,
                                                                           uVar19);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,
                                                                          uRam00007ffc3ebc0a40,
                                                                          pvVar8);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) {
                                          return;
                                        }
                                        pvVar8 = (*(*env)->NewObjectArray)
                                                           (env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                                        ;
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) {
                                          return;
                                        }
                                        if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea5a4b1;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar8 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                                        }
                                        if (3 < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar7);
                                          lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                                          if (lVar10 == 0) {
                                            return;
                                          }
                                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10
                                                                            ,lVar10,uVar5);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 != 0) {
                                            return;
                                          }
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar2 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar8 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                                          }
                                          if (2 < iVar2) {
                                            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar7);
                                            lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a8,0x82)
                                            ;
                                            if (lVar10 == 0) {
                                              return;
                                            }
                                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc09a8,lVar10,0x3fa99999a0000000);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) {
                                              return;
                                            }
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar2 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar8 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                                            }
                                            if (1 < iVar2) {
                                              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar7);
                                              lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                                              if (lVar10 == 0) {
                                                return;
                                              }
                                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar10,uVar9 ^ 0x46ec7aa3cc06
                                                  );
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) {
                                                return;
                                              }
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar8 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                                              }
                                              if (0 < iVar2) {
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar8,0,pvVar7);
                                                if (_DAT_7ffc3ebc8ca8 == (void *)0x0) {
                                                  uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                                  uVar20 = 0x7ffc;
                                                  uVar3 = 0x7ffc;
                                                  lVar10 = FUN_7ffc3eb77170(env,uVar14,6,
                                                                            0x7ffc3ebb29c6,
                                                                            0x7ffc3eba606a,
                                                                            0x7ffc3eba606c,
                                                                            0x7ffc3ebb2a63,
                                                                            0x7ffc3ebb29ff,0,0);
                                                  if ((lVar10 != 0) &&
                                                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                                                                                                                                
                                                  uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc8ca8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar7);
                                                  }
                                                }
                                                pvVar7 = _DAT_7ffc3ebc8ca8;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) {
                                                  return;
                                                }
                                                pvVar11 = (*(*env)->NewObjectArray)
                                                                    (env,3,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,0,pvVar8);
                                                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x370d6b30b95871a6);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,1,pvVar8);
                                                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,2,pvVar8);
                                                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,
                                                                                                                                                                    
                                                  uRam00007ffc3ebc0a40,pvVar11);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) {
                                                  return;
                                                }
                                                if (_DAT_7ffc3ebc8cb0 == (void *)0x0) {
                                                  uVar14 = FUN_7ffc3eb76c30(env,0x2f);
                                                  uVar20 = 0x7ffc;
                                                  uVar3 = 0x7ffc;
                                                  lVar10 = FUN_7ffc3eb77170(env,uVar14,6,
                                                                            0x7ffc3ebb29c6,
                                                                            0x7ffc3eba606a,
                                                                            0x7ffc3eba606c,
                                                                            0x7ffc3ebb29fc,
                                                                            0x7ffc3ebb2a26,0,0);
                                                  if ((lVar10 != 0) &&
                                                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,
                                                                                                                                                                                
                                                  uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc8cb0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar8);
                                                  }
                                                }
                                                pvVar8 = _DAT_7ffc3ebc8cb0;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) {
                                                  return;
                                                }
                                                pvVar11 = (*(*env)->NewObjectArray)
                                                                    (env,4,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,0,receiver);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,1,pvVar7);
                                                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x370c4e5d89fbfb5a);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,2,pvVar7);
                                                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar11,3,pvVar7);
                                                FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                                 pvVar11);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) {
                                                  return;
                                                }
                                                goto LAB_7ffc3ea5a0a8;
                                              }
                                            }
                                          }
                                        }
LAB_7ffc3ea5a5a3:
                                        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                                        pcVar18 = (char *)0x7ffc3eba6019;
                                        pvVar7 = pvRam00007ffc3ebc0a98;
                                        goto LAB_7ffc3ea5a5bf;
                                      }
                                    }
                                  }
                                }
LAB_7ffc3ea5a633:
                                pJVar16 = *env;
                                goto LAB_7ffc3ea5a639;
                              }
                            }
LAB_7ffc3ea5a0a8:
                            if (receiver != (void *)0x0) {
                              lVar10 = FUN_7ffc3eb76c30(env,0x30);
                              if (lVar10 == 0) {
                                return;
                              }
                              lVar15 = FUN_7ffc3eb76c90(env,lVar10,0x7e);
                              if (lVar15 == 0) {
                                return;
                              }
                              FUN_7ffc3e7dbbc0(env,receiver,lVar10,lVar15,arg0,CONCAT44(uVar3,arg1),
                                               CONCAT44(uVar20,arg2),(double)arg3);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea5a142. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                              (*(*env)->ExceptionCheck)(env);
                              return;
                            }
                            goto LAB_7ffc3ea5a4b1;
                          }
                        }
                      }
                    }
                  }
                }
                goto LAB_7ffc3ea5a6cf;
              }
              pJVar16 = *env;
              pcVar18 = (char *)0x7ffc3eba6019;
              pvVar7 = pvRam00007ffc3ebc0a98;
            }
            (*pJVar16->ThrowNew)(env,pvVar7,pcVar18);
          }
        }
      }
    }
  }
  else {
LAB_7ffc3ea5a56a:
    pvVar8 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3ea5a576:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3ea5a663:
    (*(*env)->ExceptionClear)(env);
    lVar10 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar10 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar10,0x1da), lVar15 != 0)) {
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar15,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar8 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3ea5a6db;
      }
      (*(*env)->Throw)(env,pvVar7);
    }
  }
LAB_7ffc3ea5a6cf:
  pvVar8 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3ea5a6db:
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar7);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar10 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar10 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar10,0x1da), lVar15 != 0)) {
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar15,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea5a792. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar7);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_9M_4_5 | RVA 0x28a7b0 | dev/krypton/9M.4([Ljava/lang/Object;)V | unresolved */
/* No successful pseudocode: consult coverage.tsv and the disassembly. */

/* JNI_dev_krypton_9M_7_6 | RVA 0x298dc0 | dev/krypton/9M.7([Ljava/lang/Object;)[I | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_7_6(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  longlong lVar7;
  ulonglong uVar8;
  void *pvVar9;
  JNINativeInterface_ *pJVar10;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  void *pvVar14;
  undefined8 uVar15;
  ulonglong uVar16;
  uint uVar17;
  char *arg2;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uStack_90;
  undefined8 uStack_88;
  ulonglong uStack_78;
  ulonglong uStack_68;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3ea6a432;
  pvVar11 = arg0;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) goto LAB_7ffc3ea6a415;
  pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar10 = *env;
  if (pvVar6 != (void *)0x0) {
    bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) {
      pJVar10 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar11 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea68f19;
    }
    lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar6,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (((bVar1 != 0) || (pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f), pvVar6 == (void *)0x0)) ||
       (pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,199), pvVar9 == (void *)0x0)) {
      return (void *)0x0;
    }
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar16 = *(ulonglong *)
                (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                (longlong)*(int *)((longlong)pvVar9 + 0x10));
    }
    else {
      uVar16 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar9);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar16 = uVar16 ^ uVar8;
    uVar21 = 0x48a6e8cd2337d41d;
    uStack_90 = uVar16;
    if (_DAT_7ffc3ebc7618 == (void *)0x0) {
      uVar22 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar22,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba74db,0x7ffc3eba7e1f,0,0,pvVar11,uVar21);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7618 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7618;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x48a6e8cd2337d41d);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = pvVar11;
    if (_DAT_7ffc3ebc7620 == (void *)0x0) {
      uVar22 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar22,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba8100,0,0,pvVar6);
      if ((lVar7 != 0) &&
         (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
      {
        _DAT_7ffc3ebc7620 = (*(*env)->NewGlobalRef)(env,pvVar9);
      }
    }
    pvVar9 = _DAT_7ffc3ebc7620;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x48a08ce090938580);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar22 = 0x489562ee1842a353;
    uStack_88 = (void *)uVar16;
    uStack_48 = uVar16;
    if (_DAT_7ffc3ebc7628 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba64b4,0,0,pvVar6,uVar21,uVar22);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7628 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7628;
    pvVar9 = _DAT_7ffc3ebc7628;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar18 = (undefined4)((ulonglong)pvVar9 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x489562ee1842a353);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
    uVar8 = uStack_48;
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_48);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
    uVar21 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar2 = FUN_7ffc3e7d8be0(env,uVar21,uRam00007ffc3ebc09d0);
    uVar21 = CONCAT44(uVar18,iVar2);
    uVar22 = 0x48a6e8cd2337d41d;
    uStack_90 = uVar8;
    if (_DAT_7ffc3ebc7630 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba74db,0x7ffc3eba7e1f,0,0,uVar21,uVar22);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7630 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7630;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x48a6e8cd2337d41d);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar21 = 0x48a08ce090938580;
    uStack_88 = (void *)uVar8;
    if (_DAT_7ffc3ebc7638 == (void *)0x0) {
      pvVar6 = pvVar11;
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba8100,0,0,pvVar6,uVar22,uVar21);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7638 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7638;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x48a08ce090938580);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (_DAT_7ffc3ebc7640 == (void *)0x0) {
      uVar21 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar21,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7640 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7640;
    pvVar9 = _DAT_7ffc3ebc7640;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar19 = (undefined4)((ulonglong)pvVar9 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x48959705871ad255);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
    uVar21 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar3 = FUN_7ffc3e7d8be0(env,uVar21,uRam00007ffc3ebc09d0);
    uStack_88 = (void *)uVar8;
    if (_DAT_7ffc3ebc7648 == (void *)0x0) {
      uVar21 = CONCAT44(uVar19,uVar3);
      uVar16 = uVar8 ^ 0x787125286962900e;
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba7805,0x7ffc3eba647c,0,0,uVar21,uVar22,uVar16);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7648 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7648;
    pvVar6 = _DAT_7ffc3ebc7648;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar20 = (undefined4)((ulonglong)pvVar6 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uStack_50 = CONCAT44(uVar19,uVar3);
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2633);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar8 ^ 0x787125286962900e);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    uVar21 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar4 = FUN_7ffc3e7d8be0(env,uVar21,uRam00007ffc3ebc09d0);
    uVar21 = CONCAT44(uVar20,iVar4);
    if (_DAT_7ffc3ebc7650 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba7805,0x7ffc3eba647c,0,0);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7650 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7650;
    pvVar6 = _DAT_7ffc3ebc7650;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar19 = (undefined4)((ulonglong)pvVar6 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x3882);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar8 ^ 0x5df92be4fb978eb7);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
    uStack_88 = (void *)uVar8;
    if (_DAT_7ffc3ebc7658 == (void *)0x0) {
      uVar13 = CONCAT44(uVar19,uVar3);
      uVar16 = uVar8 ^ 0xa722cfc36fb9401;
      uVar15 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba7805,0x7ffc3eba647c,0,0,uVar13,uVar22,uVar16);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7658 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7658;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uStack_58 = CONCAT44(uVar19,uVar3);
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2222);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar8 ^ 0xa722cfc36fb9401);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    uVar22 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar5 = FUN_7ffc3e7d8be0(env,uVar22);
    pvVar6 = (*(*env)->NewIntArray)(env,4);
    pvVar11 = pvVar6;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uStack_88 = (void *)CONCAT44(uVar20,2);
    iVar2 = (iVar2 - (iVar5 + iVar4 * 2)) / 2;
    uStack_90 = CONCAT44(uVar18,iVar2);
    if (pvVar6 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
      }
      if (0 < iVar4) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                  (ulonglong)uRam00007ffc3ebc08f0) = iVar2;
        }
        else {
          (*(*env)->SetIntArrayRegion)(env,pvVar6,0,1,(int *)&uStack_90);
        }
        iVar2 = 1;
        uStack_90 = uStack_50;
        uStack_88 = (void *)CONCAT44(uStack_88._4_4_,0x1e82);
        uStack_68 = uVar8;
        uVar8 = uVar8 ^ 0x714dee5e0eed28ac;
        pvVar6 = pvVar11;
        uStack_78 = uVar8;
        if (_DAT_7ffc3ebc7660 == (void *)0x0) {
          iVar2 = 1;
          uVar22 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar22,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba7805,0x7ffc3eba647c,0,0);
          if ((lVar7 != 0) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc7660 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
        }
        uStack_88 = _DAT_7ffc3ebc7660;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        pvVar9 = uStack_88;
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x1e82);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar14);
        pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
        uVar22 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        iVar4 = FUN_7ffc3e7d8be0(env,uVar22,uRam00007ffc3ebc09d0);
        uStack_88 = (void *)CONCAT44(uStack_88._4_4_,iVar4);
        uStack_90 = CONCAT44(uStack_90._4_4_,(int)uStack_90 - iVar4);
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea6a432;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if ((-1 < (longlong)iVar2) && (iVar2 < iVar4)) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08f0 + (longlong)iVar2 * 4) = (int)uStack_90;
          }
          else {
            (*(*env)->SetIntArrayRegion)(env,pvVar6,iVar2,1,(int *)&uStack_90);
          }
          uVar17 = 2;
          uStack_90 = uVar21;
          if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea6a432;
          pvVar6 = pvVar11;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
            uVar17 = 2;
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
          }
          if ((-1 < (int)uVar17) && ((int)uVar17 < iVar2)) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 4) = (int)uStack_90;
            }
            else {
              (*(*env)->SetIntArrayRegion)(env,pvVar6,uVar17,1,(int *)&uStack_90);
            }
            uVar17 = 3;
            uStack_90 = uStack_58;
            if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea6a432;
            pvVar6 = pvVar11;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
              uVar17 = 3;
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if ((-1 < (int)uVar17) && ((int)uVar17 < iVar2)) {
              if (cRam00007ffc3ebc08e5 != '\x01') {
                (*(*env)->SetIntArrayRegion)(env,pvVar6,uVar17,1,(int *)&uStack_90);
                return pvVar11;
              }
              *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 4) = (int)uStack_90;
              return pvVar11;
            }
          }
        }
      }
LAB_7ffc3ea6a415:
      pJVar10 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar11 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea68f19;
    }
LAB_7ffc3ea6a432:
    pJVar10 = *env;
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar11 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea68f19:
  (*pJVar10->ThrowNew)(env,pvVar11,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_9_7 | RVA 0x29a470 | dev/krypton/9M.9([Ljava/lang/Object;)[I | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_9_7(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  longlong lVar7;
  ulonglong uVar8;
  void *pvVar9;
  JNINativeInterface_ *pJVar10;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  void *pvVar14;
  undefined8 uVar15;
  ulonglong uVar16;
  uint uVar17;
  char *arg2;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uStack_90;
  void *pvStack_88;
  ulonglong uStack_78;
  ulonglong uStack_68;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3ea6bae9;
  pvVar11 = arg0;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) goto LAB_7ffc3ea6bacc;
  pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar10 = *env;
  if (pvVar6 != (void *)0x0) {
    bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) {
      pJVar10 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar11 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea6a5c9;
    }
    lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar6,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (((bVar1 != 0) || (pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f), pvVar6 == (void *)0x0)) ||
       (pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,199), pvVar9 == (void *)0x0)) {
      return (void *)0x0;
    }
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar16 = *(ulonglong *)
                (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                (longlong)*(int *)((longlong)pvVar9 + 0x10));
    }
    else {
      uVar16 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar9);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar16 = uVar16 ^ uVar8;
    uVar21 = 0x81fcb8040ef71d47;
    uStack_90 = uVar16;
    if (_DAT_7ffc3ebc7668 == (void *)0x0) {
      uVar22 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar22,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba74db,0x7ffc3eba7e1f,0,0,pvVar11,uVar21);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7668 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7668;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x81fcb8040ef71d47);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = pvVar11;
    if (_DAT_7ffc3ebc7670 == (void *)0x0) {
      uVar22 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar22,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba8100,0,0,pvVar6);
      if ((lVar7 != 0) &&
         (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
      {
        _DAT_7ffc3ebc7670 = (*(*env)->NewGlobalRef)(env,pvVar9);
      }
    }
    pvVar9 = _DAT_7ffc3ebc7670;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x81fadc29bd534cda);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar22 = 0x81cf322735826a09;
    pvStack_88 = (void *)uVar16;
    uStack_48 = uVar16;
    if (_DAT_7ffc3ebc7678 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba64b4,0,0,pvVar6,uVar21,uVar22);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7678 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7678;
    pvVar9 = _DAT_7ffc3ebc7678;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar18 = (undefined4)((ulonglong)pvVar9 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x81cf322735826a09);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
    uVar8 = uStack_48;
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_48);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
    uVar21 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar2 = FUN_7ffc3e7d8be0(env,uVar21,uRam00007ffc3ebc09d0);
    uVar21 = CONCAT44(uVar18,iVar2);
    uVar22 = 0x81fcb8040ef71d47;
    uStack_90 = uVar8;
    if (_DAT_7ffc3ebc7680 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba74db,0x7ffc3eba7e1f,0,0,uVar21,uVar22);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7680 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7680;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x81fcb8040ef71d47);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar21 = 0x81fadc29bd534cda;
    pvStack_88 = (void *)uVar8;
    if (_DAT_7ffc3ebc7688 == (void *)0x0) {
      pvVar6 = pvVar11;
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba8100,0,0,pvVar6,uVar22,uVar21);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7688 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7688;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x81fadc29bd534cda);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (_DAT_7ffc3ebc7690 == (void *)0x0) {
      uVar21 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar21,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7690 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7690;
    pvVar9 = _DAT_7ffc3ebc7690;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar19 = (undefined4)((ulonglong)pvVar9 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x81cfc7ccaada1b0f);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
    uVar21 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar3 = FUN_7ffc3e7d8be0(env,uVar21,uRam00007ffc3ebc09d0);
    pvStack_88 = (void *)uVar8;
    if (_DAT_7ffc3ebc7698 == (void *)0x0) {
      uVar21 = CONCAT44(uVar19,uVar3);
      uVar16 = uVar8 ^ 0x19324d032df24dfb;
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba7805,0x7ffc3eba647c,0,0,uVar21,uVar22,uVar16);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc7698 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc7698;
    pvVar6 = _DAT_7ffc3ebc7698;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar20 = (undefined4)((ulonglong)pvVar6 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uStack_50 = CONCAT44(uVar19,uVar3);
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x328e);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar8 ^ 0x19324d032df24dfb);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    uVar21 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar4 = FUN_7ffc3e7d8be0(env,uVar21,uRam00007ffc3ebc09d0);
    uVar21 = CONCAT44(uVar20,iVar4);
    if (_DAT_7ffc3ebc76a0 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba7805,0x7ffc3eba647c,0,0);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc76a0 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc76a0;
    pvVar6 = _DAT_7ffc3ebc76a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar19 = (undefined4)((ulonglong)pvVar6 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x3291);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar8 ^ 0x73d8743df4d4cdf0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
    pvStack_88 = (void *)uVar8;
    if (_DAT_7ffc3ebc76a8 == (void *)0x0) {
      uVar13 = CONCAT44(uVar19,uVar3);
      uVar16 = uVar8 ^ 0x5a4b598467ff587a;
      uVar15 = FUN_7ffc3eb76c30(env,0x2f);
      lVar7 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba7805,0x7ffc3eba647c,0,0,uVar13,uVar22,uVar16);
      if ((lVar7 != 0) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc76a8 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
    }
    pvVar11 = _DAT_7ffc3ebc76a8;
    pvVar6 = _DAT_7ffc3ebc76a8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar20 = (undefined4)((ulonglong)pvVar6 >> 0x20);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    uStack_58 = CONCAT44(uVar19,uVar3);
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2705);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar8 ^ 0x5a4b598467ff587a);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    uVar22 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar5 = FUN_7ffc3e7d8be0(env,uVar22);
    uVar22 = CONCAT44(uVar20,iVar5);
    pvVar6 = (*(*env)->NewIntArray)(env,4);
    pvVar11 = pvVar6;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar5 = (iVar2 - (iVar5 + iVar4 * 2)) / 2 + iVar4 + iVar5;
    uStack_90 = CONCAT44(uVar18,iVar5);
    pvStack_88 = (void *)uVar22;
    if (pvVar6 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
      }
      if (0 < iVar2) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                  (ulonglong)uRam00007ffc3ebc08f0) = iVar5;
        }
        else {
          (*(*env)->SetIntArrayRegion)(env,pvVar6,0,1,(int *)&uStack_90);
        }
        iVar2 = 1;
        uStack_90 = uStack_50;
        pvStack_88 = (void *)CONCAT44(pvStack_88._4_4_,0x30b3);
        uStack_68 = uVar8;
        uVar8 = uVar8 ^ 0x696823c8044a4fc9;
        pvVar6 = pvVar11;
        uStack_78 = uVar8;
        if (_DAT_7ffc3ebc76b0 == (void *)0x0) {
          iVar2 = 1;
          uVar22 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar22,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba7805,0x7ffc3eba647c,0,0);
          if ((lVar7 != 0) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc76b0 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
        }
        pvStack_88 = _DAT_7ffc3ebc76b0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        pvVar9 = pvStack_88;
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x30b3);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar14);
        pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
        uVar22 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        iVar4 = FUN_7ffc3e7d8be0(env,uVar22,uRam00007ffc3ebc09d0);
        pvStack_88 = (void *)CONCAT44(pvStack_88._4_4_,iVar4);
        uStack_90 = CONCAT44(uStack_90._4_4_,(int)uStack_90 - iVar4);
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea6bae9;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if ((-1 < (longlong)iVar2) && (iVar2 < iVar4)) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08f0 + (longlong)iVar2 * 4) = (int)uStack_90;
          }
          else {
            (*(*env)->SetIntArrayRegion)(env,pvVar6,iVar2,1,(int *)&uStack_90);
          }
          uVar17 = 2;
          uStack_90 = uVar21;
          if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea6bae9;
          pvVar6 = pvVar11;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
            uVar17 = 2;
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
          }
          if ((-1 < (int)uVar17) && ((int)uVar17 < iVar2)) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 4) = (int)uStack_90;
            }
            else {
              (*(*env)->SetIntArrayRegion)(env,pvVar6,uVar17,1,(int *)&uStack_90);
            }
            uVar17 = 3;
            uStack_90 = uStack_58;
            if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea6bae9;
            pvVar6 = pvVar11;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
              uVar17 = 3;
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if ((-1 < (int)uVar17) && ((int)uVar17 < iVar2)) {
              if (cRam00007ffc3ebc08e5 != '\x01') {
                (*(*env)->SetIntArrayRegion)(env,pvVar6,uVar17,1,(int *)&uStack_90);
                return pvVar11;
              }
              *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 4) = (int)uStack_90;
              return pvVar11;
            }
          }
        }
      }
LAB_7ffc3ea6bacc:
      pJVar10 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar11 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea6a5c9;
    }
LAB_7ffc3ea6bae9:
    pJVar10 = *env;
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar11 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea6a5c9:
  (*pJVar10->ThrowNew)(env,pvVar11,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_method_25404_8 | RVA 0x29bb20 | dev/krypton/9M.method_25404(Lnet/minecraft/class_11908;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25404_8(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  longlong lVar11;
  void *pvVar12;
  undefined8 uVar13;
  longlong lVar14;
  JNINativeInterface_ *pJVar15;
  char *arg2;
  ulonglong uVar16;
  
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,199);
  if (pvVar7 == (void *)0x0) {
    return 0;
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
    return 0;
  }
  if (_DAT_7ffc3ebc8490 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
    if ((lVar11 != 0) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
    {
      _DAT_7ffc3ebc8490 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
  }
  pvVar7 = _DAT_7ffc3ebc8490;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  uVar16 = uVar8 ^ 0x2d22ee78cf44;
  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xc863ff90123b5421);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) {
LAB_7ffc3ea6cbd1:
    pJVar15 = *env;
    arg2 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
    }
    if (1 < iVar4) {
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,arg0);
      lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar11 == 0) {
        return 0;
      }
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
      }
      if (0 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
        if (_DAT_7ffc3ebc8498 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
          if ((lVar11 != 0) &&
             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar10 != (void *)0x0)) {
            _DAT_7ffc3ebc8498 = (*(*env)->NewGlobalRef)(env,pvVar10);
          }
        }
        pvVar10 = _DAT_7ffc3ebc8498;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar9);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc862851eba0f3190);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
        FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        lVar11 = FUN_7ffc3eb76c90(env,pvVar6,0x7d);
        if (lVar11 == 0) {
          return 0;
        }
        iVar4 = FUN_7ffc3e7db1e0(env,pvVar6,lVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (_DAT_7ffc3ebc84a0 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
          if ((lVar11 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc84a0 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc84a0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc86762d24d22b8ed);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (_DAT_7ffc3ebc84a8 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
          if ((lVar11 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc84a8 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc84a8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc86032d8ad0af8e8);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar6);
        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        do {
          if (_DAT_7ffc3ebc84b0 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
            if ((lVar11 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc84b0 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc84b0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xc86153e4c1fe0368);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
          if (cVar2 == '\0') break;
          if (_DAT_7ffc3ebc84b8 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
            if ((lVar11 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc84b8 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc84b8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xc85692718c3b7e28);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (void *)FUN_7ffc3eb76c30(env,0xaf);
          if (pvVar9 == (void *)0x0) {
            return 0;
          }
          if ((pvVar7 != (void *)0x0) &&
             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar9), bVar1 == 0)) {
            pJVar15 = *env;
            arg2 = (char *)0x7ffc3eba6033;
            pvVar6 = pvRam00007ffc3ebc0a58;
            goto LAB_7ffc3ea6cbff;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea6cbd1;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,pvVar9);
          }
          if (iVar5 < 2) goto LAB_7ffc3ea6cbb7;
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,arg0);
          lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
          if (lVar11 == 0) {
            return 0;
          }
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,uVar8 ^ 0x4b1e82de64bd)
          ;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,pvVar9);
          }
          if (iVar5 < 1) goto LAB_7ffc3ea6cbb7;
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
          if (_DAT_7ffc3ebc84c0 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
            if ((lVar11 != 0) &&
               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar10 != (void *)0x0)) {
              _DAT_7ffc3ebc84c0 = (*(*env)->NewGlobalRef)(env,pvVar10);
            }
          }
          pvVar10 = _DAT_7ffc3ebc84c0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar9);
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc866c251212adc09);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
          FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
        } while (iVar4 == 0);
        if (receiver != (void *)0x0) {
          lVar11 = FUN_7ffc3eb76c30(env,0x30);
          if (lVar11 == 0) {
            return 0;
          }
          lVar14 = FUN_7ffc3eb76c90(env,lVar11,0x88);
          if (lVar14 == 0) {
            return 0;
          }
          bVar1 = FUN_7ffc3e8aa0b0(env,receiver,lVar11,lVar14,arg0);
          bVar3 = (*(*env)->ExceptionCheck)(env);
          if (bVar3 != 0) {
            return 0;
          }
          return bVar1;
        }
        goto LAB_7ffc3ea6cbd1;
      }
    }
LAB_7ffc3ea6cbb7:
    pJVar15 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3ea6cbff:
  (*pJVar15->ThrowNew)(env,pvVar6,arg2);
  return 0;
}

/* JNI_dev_krypton_9M_method_25400_9 | RVA 0x29cc10 | dev/krypton/9M.method_25400(Lnet/minecraft/class_11905;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25400_9(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  longlong lVar8;
  void *arg1;
  longlong lVar9;
  undefined8 uVar10;
  JNINativeInterface_ *pJVar11;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar4 == (void *)0x0) {
    return 0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,199);
  if (pvVar5 == (void *)0x0) {
    return 0;
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
    return 0;
  }
  if (_DAT_7ffc3ebc8480 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,0x2f);
    lVar8 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc8480 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc8480;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x58abb8991d4bc4e9
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                    uVar6 ^ 0x6a2be1085f8c);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
  if (lVar8 == 0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x36e3f4f97c1a);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (pvVar5 == (void *)0x0) {
LAB_7ffc3ea6d1ef:
    pJVar11 = *env;
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
    }
    if (1 < iVar3) {
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
      }
      if (0 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
        if (_DAT_7ffc3ebc8488 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x2f);
          lVar8 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
          if ((lVar8 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc8488 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc8488;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar4);
        (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar5);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x589675cfa3b0aa49);
        (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar6 ^ 0x6a2be1085f8c);
        (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar4);
        FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (receiver != (void *)0x0) {
          lVar8 = FUN_7ffc3eb76c30(env,0x30);
          if (lVar8 == 0) {
            return 0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x89);
          if (lVar9 == 0) {
            return 0;
          }
          bVar1 = FUN_7ffc3e8aa0b0(env,receiver,lVar8,lVar9,arg0);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return 0;
          }
          return bVar1;
        }
        goto LAB_7ffc3ea6d1ef;
      }
    }
    pJVar11 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar11->ThrowNew)(env,pvVar4,arg2);
  return 0;
}

/* JNI_dev_krypton_9M_method_25402_10 | RVA 0x29d220 | dev/krypton/9M.method_25402(Lnet/minecraft/class_11909;Z)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25402_10
               (JNINativeInterface_ **env,void *receiver,void *arg0,byte arg1)

{
  byte bVar1;
  char cVar2;
  byte bVar3;
  undefined4 uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  void *pvVar8;
  void *pvVar9;
  ulonglong uVar10;
  longlong lVar11;
  void *pvVar12;
  undefined8 uVar13;
  void *pvVar14;
  void *arg1_00;
  longlong lVar15;
  JNINativeInterface_ *pJVar16;
  int *piVar17;
  char *arg2;
  ulonglong uVar18;
  double dVar19;
  double dVar20;
  int iStack_c4;
  void *pvStack_c0;
  double dStack_b8;
  void *pvStack_b0;
  ulonglong uStack_a8;
  ulonglong uStack_a0;
  void *pvStack_98;
  undefined8 uStack_90;
  uint uStack_88;
  int iStack_84;
  ulonglong uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  
  uStack_a8 = CONCAT71(uStack_a8._1_7_,arg1);
  pvStack_b0 = receiver;
  pvStack_98 = arg0;
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,199);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar10 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar9 + 0x10));
  }
  else {
    uVar10 = (*(*env)->GetStaticLongField)(env,pvVar8,pvVar9);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  lVar11 = FUN_7ffc3eb76c90(env,pvVar8,0x7d);
  if (lVar11 == 0) {
    return 0;
  }
  iStack_84 = FUN_7ffc3e7db1e0(env,pvVar8,lVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8cb8 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
    if ((lVar11 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
    {
      _DAT_7ffc3ebc8cb8 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc8cb8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  uVar18 = uVar10 ^ 0xc68d5db96a0;
  uStack_a0 = uVar10;
  pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x9183a20a0af70d38);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar12);
  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
  pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8cc0 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba8100,0,0);
    if ((lVar11 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8cc0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8cc0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x9185c627b9535ca5
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8cc8 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
    if ((lVar11 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8cc8 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8cc8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x91801b4037f8e4f4
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
  uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  uVar4 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,0xb0);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvStack_c0 = (*(*env)->AllocObject)(env,pvVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8cd0 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
    if ((lVar11 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8cd0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8cd0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dStack_b8 = (double)CONCAT44(dStack_b8._4_4_,uVar4);
  pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_98);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x91bc9e43e8d1315b);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
  uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
  if (_DAT_7ffc3ebc8cd8 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
    if ((lVar11 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8cd8 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8cd8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_98);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x9183ef2dda905e28);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
  uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dVar20 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
  if (_DAT_7ffc3ebc8ce0 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3ebb2a66,0,0);
    if ((lVar11 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8ce0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8ce0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_98);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x91bf2884c6e10343);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
  uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (pvStack_c0 == (void *)0x0) goto LAB_7ffc3ea70c55;
  lVar11 = FUN_7ffc3eb76c90(env,pvVar8,0x1dc);
  if (lVar11 == 0) {
    return 0;
  }
  dVar20 = dVar20 * (double)dStack_b8._0_4_;
  FUN_7ffc3e7dbbc0(env,pvStack_c0,pvVar8,lVar11,dVar19 * (double)dStack_b8._0_4_,dVar20,uVar13);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  uVar10 = uStack_a0;
  if (bVar1 != 0) {
    return 0;
  }
  uStack_80 = uStack_a0 ^ 0x1f3683246144;
  if (iStack_84 != 0) {
LAB_7ffc3ea6da47:
    if (_DAT_7ffc3ebc8d70 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8d70 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8d70;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_b0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x918343987681e109);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
    pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (_DAT_7ffc3ebc8d78 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
      if ((lVar11 != 0) &&
         (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8d78 = (*(*env)->NewGlobalRef)(env,pvVar9);
      }
    }
    pvVar9 = _DAT_7ffc3ebc8d78;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x9184139296a9a10c);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    uStack_88 = (uint)(byte)uStack_a8;
    uStack_70 = 0x7ffc3eba6204;
    uStack_a0 = 0x7ffc3ebadae6;
    dStack_b8 = 6.95255900507473e-310;
    uStack_a8 = 0x7ffc3eba606a;
    uStack_90 = 0x7ffc3ebb29c6;
    uStack_78 = 0x7ffc3eba621c;
    do {
      if (_DAT_7ffc3ebc8d80 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x2f);
        dVar20 = dStack_b8;
        lVar11 = FUN_7ffc3eb77170(env,uVar13,6,uStack_90,uStack_a8,dStack_b8,uStack_a0,uStack_70,0,0
                                 );
        if ((lVar11 != 0) &&
           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
           pvVar9 != (void *)0x0)) {
          _DAT_7ffc3ebc8d80 = (*(*env)->NewGlobalRef)(env,pvVar9);
        }
      }
      pvVar9 = _DAT_7ffc3ebc8d80;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x918572aefa5d5a8c);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
      uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
      uVar4 = (undefined4)((ulonglong)dVar20 >> 0x20);
      if (cVar2 == '\0') break;
      if (_DAT_7ffc3ebc8d88 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x2f);
        dVar20 = dStack_b8;
        lVar11 = FUN_7ffc3eb77170(env,uVar13,6,uStack_90,uStack_a8,dStack_b8,uStack_a0,uStack_78,0,0
                                 );
        if ((lVar11 != 0) &&
           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
           pvVar9 != (void *)0x0)) {
          _DAT_7ffc3ebc8d88 = (*(*env)->NewGlobalRef)(env,pvVar9);
        }
      }
      pvVar9 = _DAT_7ffc3ebc8d88;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x91b2b33bb79827cc);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
      pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      pvVar12 = (void *)FUN_7ffc3eb76c30(env,0xaf);
      if (pvVar12 == (void *)0x0) {
        return 0;
      }
      if ((pvVar9 != (void *)0x0) &&
         (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar12), bVar1 == 0)) {
        pJVar16 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar8 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3ea70dda;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar11 == 0) {
        return 0;
      }
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,uStack_80);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      if (pvVar12 == (void *)0x0) goto LAB_7ffc3ea70c55;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
      }
      if (iVar5 < 3) goto LAB_7ffc3ea7022c;
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
      lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
      if (lVar11 == 0) {
        return 0;
      }
      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar11,uStack_88);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
      }
      if (iVar5 < 2) goto LAB_7ffc3ea7022c;
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
      }
      if (iVar5 < 1) goto LAB_7ffc3ea7022c;
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_c0);
      if (_DAT_7ffc3ebc8d90 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x2f);
        dVar20 = dStack_b8;
        lVar11 = FUN_7ffc3eb77170(env,uVar13,6,uStack_90,uStack_a8,dStack_b8,uStack_a0,
                                  0x7ffc3eba626f,0,0);
        if ((lVar11 != 0) &&
           (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
           pvVar14 != (void *)0x0)) {
          _DAT_7ffc3ebc8d90 = (*(*env)->NewGlobalRef)(env,pvVar14);
        }
      }
      pvVar14 = _DAT_7ffc3ebc8d90;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar9);
      (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar12);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x9184c064e1659db7);
      (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
      (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar9);
      FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      uVar4 = (undefined4)((ulonglong)dVar20 >> 0x20);
      if (bVar1 != 0) {
        return 0;
      }
    } while (iStack_84 == 0);
    if (pvStack_b0 != (void *)0x0) {
      lVar11 = FUN_7ffc3eb76c30(env,0x30);
      if (lVar11 == 0) {
        return 0;
      }
      lVar15 = FUN_7ffc3eb76c90(env,lVar11,0x85);
      if (lVar15 == 0) {
        return 0;
      }
      bVar1 = FUN_7ffc3e8aa0b0(env,pvStack_b0,lVar11,lVar15,pvStack_98,CONCAT44(uVar4,uStack_88));
      bVar3 = (*(*env)->ExceptionCheck)(env);
      if (bVar3 != 0) {
        return 0;
      }
      return bVar1;
    }
    goto LAB_7ffc3ea70c55;
  }
  if (_DAT_7ffc3ebc8ce8 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
    dVar20 = 6.95255900507473e-310;
    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
    if ((lVar11 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
    {
      _DAT_7ffc3ebc8ce8 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc8ce8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_98);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x91baa72b33c65a7d);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    iVar5 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
    if (iVar5 != 0) goto LAB_7ffc3ea6e98e;
    pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar11 == 0) {
      return 0;
    }
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,uVar10 ^ 0x7121f4444883);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar8 == (void *)0x0) {
LAB_7ffc3ea70c55:
      pJVar16 = *env;
      arg2 = &DAT_7ffc3eba6000;
      pvVar8 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3ea70dda;
    }
    if (bRam00007ffc3ebc08e5 == 1) {
      iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar5 = (*(*env)->GetArrayLength)(env,pvVar8);
    }
    if (iVar5 < 1) goto LAB_7ffc3ea7022c;
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
    if (_DAT_7ffc3ebc8cf0 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba8250,0,0);
      if ((lVar11 != 0) &&
         (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8cf0 = (*(*env)->NewGlobalRef)(env,pvVar9);
      }
    }
    pvVar9 = _DAT_7ffc3ebc8cf0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_b0);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x91b9cd82894d4d0b);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea70c55;
    if (bRam00007ffc3ebc08e5 == 1) {
      iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar5 = (*(*env)->GetArrayLength)(env,pvVar8);
    }
    if (iVar5 < 1) {
LAB_7ffc3ea7022c:
      pJVar16 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar8 = pvRam00007ffc3ebc0a98;
LAB_7ffc3ea70dda:
      (*pJVar16->ThrowNew)(env,pvVar8,arg2);
      return 0;
    }
    if (bRam00007ffc3ebc08e5 == 1) {
      piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                       *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc));
    }
    else {
      piVar17 = &iStack_c4;
      (*(*env)->GetIntArrayRegion)(env,pvVar8,0,1,piVar17);
    }
    iVar5 = *piVar17;
    if ((bRam00007ffc3ebc08e5 & 1) == 0) {
      iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
    }
    else {
      iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    if (iVar6 < 2) goto LAB_7ffc3ea7022c;
    if (bRam00007ffc3ebc08e5 == 1) {
      piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                        *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) + 4);
    }
    else {
      piVar17 = &iStack_c4;
      (*(*env)->GetIntArrayRegion)(env,pvVar8,1,1,piVar17);
    }
    dStack_b8 = (double)CONCAT44(dStack_b8._4_4_,*piVar17);
    if ((bRam00007ffc3ebc08e5 & 1) == 0) {
      iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
    }
    else {
      iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    if (iVar6 < 3) goto LAB_7ffc3ea7022c;
    if (bRam00007ffc3ebc08e5 == 1) {
      piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                        *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) + 8);
    }
    else {
      piVar17 = &iStack_c4;
      (*(*env)->GetIntArrayRegion)(env,pvVar8,2,1,piVar17);
    }
    iVar6 = *piVar17;
    if ((bRam00007ffc3ebc08e5 & 1) == 0) {
      iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
    }
    else {
      iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    if (iVar7 < 4) goto LAB_7ffc3ea7022c;
    if (bRam00007ffc3ebc08e5 == 1) {
      piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                        *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) + 0xc);
    }
    else {
      piVar17 = &iStack_c4;
      (*(*env)->GetIntArrayRegion)(env,pvVar8,3,1,piVar17);
    }
    uStack_90 = CONCAT44(uStack_90._4_4_,*piVar17);
    if (_DAT_7ffc3ebc8cf8 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8cf8 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8cf8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3ea71204:
      pvVar9 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3ea7138e:
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar8);
      if (bVar1 == 0) {
        return 0;
      }
      (*(*env)->ExceptionClear)(env);
      lVar11 = FUN_7ffc3eb76c30(env,0x2f);
      if ((lVar11 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar11,0x1da), lVar15 != 0)) {
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar15,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3ea7142b;
        }
        (*(*env)->Throw)(env,pvVar8);
      }
      goto LAB_7ffc3ea71422;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x91bc9e43e8d1315b);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71204;
    dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
    uVar10 = uStack_a0;
    if (dVar19 < (double)iVar5) {
LAB_7ffc3ea6fc46:
      pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar11 == 0) {
        return 0;
      }
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,uVar10 ^ 0x21e8d98481d9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea70c55;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      if (iVar5 < 1) goto LAB_7ffc3ea7022c;
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
      if (_DAT_7ffc3ebc8d28 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x2f);
        dVar20 = 6.95255900507473e-310;
        lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadae6,0x7ffc3eba8250,0,0);
        if ((lVar11 != 0) &&
           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
           pvVar9 != (void *)0x0)) {
          _DAT_7ffc3ebc8d28 = (*(*env)->NewGlobalRef)(env,pvVar9);
        }
      }
      pvVar9 = _DAT_7ffc3ebc8d28;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_b0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x91b5a3c526b3d44d);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return 0;
      }
      if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea70c55;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      if (iVar5 < 1) goto LAB_7ffc3ea7022c;
      if (bRam00007ffc3ebc08e5 == 1) {
        piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                         *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc));
      }
      else {
        piVar17 = &iStack_c4;
        (*(*env)->GetIntArrayRegion)(env,pvVar8,0,1,piVar17);
      }
      iVar5 = *piVar17;
      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
        iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      else {
        iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      if (iVar6 < 2) goto LAB_7ffc3ea7022c;
      if (bRam00007ffc3ebc08e5 == 1) {
        piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                          *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) + 4);
      }
      else {
        piVar17 = &iStack_c4;
        (*(*env)->GetIntArrayRegion)(env,pvVar8,1,1,piVar17);
      }
      dStack_b8 = (double)CONCAT44(dStack_b8._4_4_,*piVar17);
      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
        iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      else {
        iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      if (iVar6 < 3) goto LAB_7ffc3ea7022c;
      if (bRam00007ffc3ebc08e5 == 1) {
        piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                          *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) + 8);
      }
      else {
        piVar17 = &iStack_c4;
        (*(*env)->GetIntArrayRegion)(env,pvVar8,2,1,piVar17);
      }
      iVar6 = *piVar17;
      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
        iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      else {
        iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      if (iVar7 < 4) goto LAB_7ffc3ea7022c;
      if (bRam00007ffc3ebc08e5 == 1) {
        piVar17 = (int *)((ulonglong)uRam00007ffc3ebc08f0 +
                          *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) + 0xc);
      }
      else {
        piVar17 = &iStack_c4;
        (*(*env)->GetIntArrayRegion)(env,pvVar8,3,1,piVar17);
      }
      iVar7 = *piVar17;
      if (_DAT_7ffc3ebc8d30 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0x2f);
        dVar20 = 6.95255900507473e-310;
        lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
        if ((lVar11 != 0) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
           pvVar8 != (void *)0x0)) {
          _DAT_7ffc3ebc8d30 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
      }
      pvVar8 = _DAT_7ffc3ebc8d30;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x91bc9e43e8d1315b);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
        uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3ea71215;
        dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
        if (dVar19 < (double)iVar5) {
LAB_7ffc3ea6e98e:
          if (_DAT_7ffc3ebc8d60 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            dVar20 = 6.95255900507473e-310;
            lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
            if ((lVar11 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc8d60 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc8d60;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_b0);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x9187deda29980dc5);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
          pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
          if (lVar11 == 0) {
            return 0;
          }
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,uStack_80);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea70c55;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,pvVar9);
          }
          if (2 < iVar5) {
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
            lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
            if (lVar11 == 0) {
              return 0;
            }
            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar11,uStack_a8 & 0xff);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar5 = (*(*env)->GetArrayLength)(env,pvVar9);
            }
            if (1 < iVar5) {
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
              if (bRam00007ffc3ebc08e5 == 1) {
                iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (*(*env)->GetArrayLength)(env,pvVar9);
              }
              if (0 < iVar5) {
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
                if (_DAT_7ffc3ebc8d68 == (void *)0x0) {
                  uVar13 = FUN_7ffc3eb76c30(env,0x2f);
                  dVar20 = 6.95255900507473e-310;
                  lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                  if ((lVar11 != 0) &&
                     (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                     pvVar12 != (void *)0x0)) {
                    _DAT_7ffc3ebc8d68 = (*(*env)->NewGlobalRef)(env,pvVar12);
                  }
                }
                pvVar12 = _DAT_7ffc3ebc8d68;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar8);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar9);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x91bf6688fcf89da2);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar8);
                FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar14);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                goto LAB_7ffc3ea6da47;
              }
            }
          }
          goto LAB_7ffc3ea7022c;
        }
        if (_DAT_7ffc3ebc8d38 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          dVar20 = 6.95255900507473e-310;
          lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
          if ((lVar11 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc8d38 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc8d38;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x91bc9e43e8d1315b);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
            uVar10 = uStack_a0;
            if (dVar19 < (double)(iVar6 + iVar5)) {
              if (_DAT_7ffc3ebc8d40 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0x2f);
                dVar20 = 6.95255900507473e-310;
                lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
                if ((lVar11 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc8d40 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc8d40;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
                pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x9183ef2dda905e28);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
                pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
                uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
                  if (dVar19 < (double)dStack_b8._0_4_) goto LAB_7ffc3ea6e98e;
                  if (_DAT_7ffc3ebc8d48 == (void *)0x0) {
                    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
                    dVar20 = 6.95255900507473e-310;
                    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
                    if ((lVar11 != 0) &&
                       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                       pvVar8 != (void *)0x0)) {
                      _DAT_7ffc3ebc8d48 = (*(*env)->NewGlobalRef)(env,pvVar8);
                    }
                  }
                  pvVar8 = _DAT_7ffc3ebc8d48;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,0x9183ef2dda905e28);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,uVar18);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
                    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
                      uVar4 = (undefined4)((ulonglong)dVar20 >> 0x20);
                      if ((double)(iVar7 + dStack_b8._0_4_) <= dVar19) goto LAB_7ffc3ea6e98e;
                      if (_DAT_7ffc3ebc8d50 == (void *)0x0) {
                        uVar13 = FUN_7ffc3eb76c30(env,0x2f);
                        uVar4 = 0x7ffc;
                        lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                                  0x7ffc3eba606c,0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
                        if ((lVar11 != 0) &&
                           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                           pvVar8 != (void *)0x0)) {
                          _DAT_7ffc3ebc8d50 = (*(*env)->NewGlobalRef)(env,pvVar8);
                        }
                      }
                      pvVar8 = _DAT_7ffc3ebc8d50;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x9183a20a0af70d38);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar12);
                        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar18);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
                        pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x4a);
                          pJVar16 = *env;
                          if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea71428;
                          pvVar12 = (*pJVar16->AllocObject)(env,pvVar9);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (pvVar12 == (void *)0x0) {
LAB_7ffc3ea714ce:
                              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                            }
                            else {
                              lVar11 = FUN_7ffc3eb76c90(env,pvVar9,0x1de);
                              if (lVar11 != 0) {
                                FUN_7ffc3e7dbbc0(env,pvVar12,pvVar9,lVar11,uVar10 ^ 0x6ae31c055c37);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc8d58 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0x2f);
                                    uVar4 = 0x7ffc;
                                    lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,
                                                              0x7ffc3eba606a,0x7ffc3eba606c,
                                                              0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                                    if ((lVar11 != 0) &&
                                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar9 != (void *)0x0)) {
                                      _DAT_7ffc3ebc8d58 = (*(*env)->NewGlobalRef)(env,pvVar9);
                                    }
                                  }
                                  pvVar9 = _DAT_7ffc3ebc8d58;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar14 = (*(*env)->NewObjectArray)
                                                        (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar8);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar12);
                                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x91b07f458a32ffea);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar8);
                                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar18);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar8);
                                    FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar14);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (pvStack_b0 != (void *)0x0) goto LAB_7ffc3ea709dd;
                                      goto LAB_7ffc3ea714ce;
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
              goto LAB_7ffc3ea71422;
            }
            goto LAB_7ffc3ea6e98e;
          }
        }
        pvVar9 = (*(*env)->ExceptionOccurred)(env);
        pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar8);
        if (bVar1 != 0) goto LAB_7ffc3ea71316;
      }
      else {
LAB_7ffc3ea71215:
        pvVar9 = (*(*env)->ExceptionOccurred)(env);
        pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar8);
        if (bVar1 != 0) {
          (*(*env)->ExceptionClear)(env);
          lVar11 = FUN_7ffc3eb76c30(env,0x2f);
          if ((lVar11 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar11,0x1da), lVar15 != 0)) {
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar15,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              pvVar9 = (*(*env)->ExceptionOccurred)(env);
              goto LAB_7ffc3ea712bd;
            }
            (*(*env)->Throw)(env,pvVar8);
          }
          pvVar9 = (*(*env)->ExceptionOccurred)(env);
        }
LAB_7ffc3ea712bd:
        pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar8);
        if (bVar1 == 0) {
          return 0;
        }
LAB_7ffc3ea71316:
        (*(*env)->ExceptionClear)(env);
        lVar11 = FUN_7ffc3eb76c30(env,0x2f);
        if ((lVar11 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar11,0x1da), lVar15 != 0)) {
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar15,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            pvVar9 = (*(*env)->ExceptionOccurred)(env);
            goto LAB_7ffc3ea7138e;
          }
          (*(*env)->Throw)(env,pvVar8);
        }
        pvVar9 = (*(*env)->ExceptionOccurred)(env);
      }
      goto LAB_7ffc3ea7138e;
    }
    if (_DAT_7ffc3ebc8d00 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8d00 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8d00;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x91bc9e43e8d1315b);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
    uVar10 = uStack_a0;
    if ((double)(iVar6 + iVar5) <= dVar19) goto LAB_7ffc3ea6fc46;
    if (_DAT_7ffc3ebc8d08 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8d08 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8d08;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x9183ef2dda905e28);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
    if (dVar19 < (double)dStack_b8._0_4_) goto LAB_7ffc3ea6fc46;
    if (_DAT_7ffc3ebc8d10 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      dVar20 = 6.95255900507473e-310;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8d10 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8d10;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_c0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x9183ef2dda905e28);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    dVar19 = (double)FUN_7ffc3e853af0(env,uVar13,uRam00007ffc3ebc0a20);
    uVar4 = (undefined4)((ulonglong)dVar20 >> 0x20);
    if ((double)((int)uStack_90 + dStack_b8._0_4_) <= dVar19) goto LAB_7ffc3ea6fc46;
    if (_DAT_7ffc3ebc8d18 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0x2f);
      uVar4 = 0x7ffc;
      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8d18 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc8d18;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x9183a20a0af70d38);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
    pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea71422;
    pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x2e);
    pJVar16 = *env;
    if (pvVar9 != (void *)0x0) {
      pvVar12 = (*pJVar16->AllocObject)(env,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (pvVar12 == (void *)0x0) goto LAB_7ffc3ea714ce;
        lVar11 = FUN_7ffc3eb76c90(env,pvVar9,0x1dd);
        if (lVar11 != 0) {
          FUN_7ffc3e7dbbc0(env,pvVar12,pvVar9,lVar11,uVar10 ^ 0x2d7600d352e7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc8d20 == (void *)0x0) {
              uVar13 = FUN_7ffc3eb76c30(env,0x2f);
              uVar4 = 0x7ffc;
              lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
              if ((lVar11 != 0) &&
                 (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar9 != (void *)0x0)) {
                _DAT_7ffc3ebc8d20 = (*(*env)->NewGlobalRef)(env,pvVar9);
              }
            }
            pvVar9 = _DAT_7ffc3ebc8d20;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar8);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar12);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x91b07f458a32ffea);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar8);
              FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar14);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (pvStack_b0 == (void *)0x0) goto LAB_7ffc3ea714ce;
LAB_7ffc3ea709dd:
                lVar11 = FUN_7ffc3eb76c30(env,0x30);
                if ((lVar11 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar11,0x85), lVar15 != 0)) {
                  bVar1 = FUN_7ffc3e8aa0b0(env,pvStack_b0,lVar11,lVar15,pvStack_98,
                                           CONCAT44(uVar4,(uint)(byte)uStack_a8));
                  bVar3 = (*(*env)->ExceptionCheck)(env);
                  if (bVar3 == 0) {
                    return bVar1;
                  }
                }
              }
            }
          }
        }
      }
      goto LAB_7ffc3ea71422;
    }
  }
  else {
LAB_7ffc3ea71422:
    pJVar16 = *env;
  }
LAB_7ffc3ea71428:
  pvVar8 = (*pJVar16->ExceptionOccurred)(env);
LAB_7ffc3ea7142b:
  pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar11 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar11 != 0) && (lVar15 = FUN_7ffc3eb76c90(env,lVar11,0x1da), lVar15 != 0)) {
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar15,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar8);
      }
    }
  }
  return 0;
}

/* JNI_dev_krypton_9M_method_25403_11 | RVA 0x2a1510 | dev/krypton/9M.method_25403(Lnet/minecraft/class_11909;DD)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25403_11
               (JNINativeInterface_ **env,void *receiver,void *arg0,double arg1,double arg2)

{
  byte bVar1;
  char cVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  longlong lVar12;
  void *pvVar13;
  void *arg1_00;
  longlong lVar14;
  JNINativeInterface_ *pJVar15;
  char *arg2_00;
  ulonglong uVar16;
  double dVar17;
  double dVar18;
  
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,199);
  if (pvVar7 == (void *)0x0) {
    return 0;
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
    return 0;
  }
  if (_DAT_7ffc3ebc8e68 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
    if ((lVar12 != 0) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
    {
      _DAT_7ffc3ebc8e68 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
  }
  pvVar7 = _DAT_7ffc3ebc8e68;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  uVar16 = uVar8 ^ 0x75e7912ced10;
  pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xea33db854e007688);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8e70 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba8100,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8e70 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8e70;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xea35bfa8fda42715
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8e78 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8e78 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8e78;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xea3062cf730f9f44
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  iVar4 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
  lVar12 = FUN_7ffc3eb76c90(env,pvVar6,0x7d);
  if (lVar12 == 0) {
    return 0;
  }
  iVar5 = FUN_7ffc3e7db1e0(env,pvVar6,lVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xb0);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (*(*env)->AllocObject)(env,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc8e80 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8e80 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8e80;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,arg0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xea0ce7ccac264aeb);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dVar17 = (double)FUN_7ffc3e853af0(env,uVar11,uRam00007ffc3ebc0a20);
  if (_DAT_7ffc3ebc8e88 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8e88 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8e88;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,arg0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xea3396a29e672598);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dVar18 = (double)FUN_7ffc3e853af0(env,uVar11,uRam00007ffc3ebc0a20);
  if (_DAT_7ffc3ebc8e90 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3ebb2a66,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc8e90 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc8e90;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,arg0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xea0f510b821678f3);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (pvVar7 != (void *)0x0) {
    lVar12 = FUN_7ffc3eb76c90(env,pvVar6,0x1dc);
    if (lVar12 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar12,dVar17 * (double)iVar4,dVar18 * (double)iVar4,uVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (_DAT_7ffc3ebc8e98 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x2f);
      lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
      if ((lVar12 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc8e98 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc8e98;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0xea37a7556d6f7675);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09d8,0x83);
    if (lVar12 == 0) {
      return 0;
    }
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar12,arg2);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar9 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
      }
      if (3 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar12,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
        }
        if (2 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
          }
          if (1 < iVar4) {
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar7);
            lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar12 == 0) {
              return 0;
            }
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar12);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
            }
            if (0 < iVar4) {
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
              if (_DAT_7ffc3ebc8ea0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                if ((lVar12 != 0) &&
                   (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                   pvVar10 != (void *)0x0)) {
                  _DAT_7ffc3ebc8ea0 = (*(*env)->NewGlobalRef)(env,pvVar10);
                }
              }
              pvVar10 = _DAT_7ffc3ebc8ea0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar9);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xea32270e2eb6d6ac);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
              FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar13);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              if (_DAT_7ffc3ebc8ea8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
                if ((lVar12 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc8ea8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc8ea8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xea333a1732769ab9);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar16);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              if (_DAT_7ffc3ebc8eb0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
                if ((lVar12 != 0) &&
                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                   pvVar9 != (void *)0x0)) {
                  _DAT_7ffc3ebc8eb0 = (*(*env)->NewGlobalRef)(env,pvVar9);
                }
              }
              pvVar9 = _DAT_7ffc3ebc8eb0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xea346a1dd25edabc);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return 0;
              }
              do {
                if (_DAT_7ffc3ebc8eb8 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                  lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
                  if ((lVar12 != 0) &&
                     (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                     pvVar9 != (void *)0x0)) {
                    _DAT_7ffc3ebc8eb8 = (*(*env)->NewGlobalRef)(env,pvVar9);
                  }
                }
                pvVar9 = _DAT_7ffc3ebc8eb8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0xea350b21beaa213c);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar16);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
                uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
                if (cVar2 == '\0') break;
                if (_DAT_7ffc3ebc8ec0 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                  lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
                  if ((lVar12 != 0) &&
                     (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                     pvVar9 != (void *)0x0)) {
                    _DAT_7ffc3ebc8ec0 = (*(*env)->NewGlobalRef)(env,pvVar9);
                  }
                }
                pvVar9 = _DAT_7ffc3ebc8ec0;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0xea02cab4f36f5c7c);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar16);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
                pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                pvVar10 = (void *)FUN_7ffc3eb76c30(env,0xaf);
                if (pvVar10 == (void *)0x0) {
                  return 0;
                }
                if ((pvVar9 != (void *)0x0) &&
                   (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar10), bVar1 == 0)) {
                  pJVar15 = *env;
                  arg2_00 = (char *)0x7ffc3eba6033;
                  pvVar6 = pvRam00007ffc3ebc0a58;
                  goto LAB_7ffc3ea732de;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09d8,0x83);
                if (lVar12 == 0) {
                  return 0;
                }
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar12,arg2);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                if (pvVar10 == (void *)0x0) goto LAB_7ffc3ea732b0;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                }
                if (iVar4 < 4) goto LAB_7ffc3ea73296;
                (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar13);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar12,arg1);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                }
                if (iVar4 < 3) goto LAB_7ffc3ea73296;
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                }
                if (iVar4 < 2) goto LAB_7ffc3ea73296;
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
                lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                if (lVar12 == 0) {
                  return 0;
                }
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar12,
                                                   uVar8 ^ 0x1762d3aee2c7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                }
                if (iVar4 < 1) goto LAB_7ffc3ea73296;
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
                if (_DAT_7ffc3ebc8ec8 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                  lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                  if ((lVar12 != 0) &&
                     (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                     pvVar13 != (void *)0x0)) {
                    _DAT_7ffc3ebc8ec8 = (*(*env)->NewGlobalRef)(env,pvVar13);
                  }
                }
                pvVar13 = _DAT_7ffc3ebc8ec8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
                arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar9);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar10);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xea32270e2eb6d6ac);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar9);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar16);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar9);
                FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return 0;
                }
              } while (iVar5 == 0);
              if (receiver != (void *)0x0) {
                lVar12 = FUN_7ffc3eb76c30(env,0x30);
                if (lVar12 == 0) {
                  return 0;
                }
                lVar14 = FUN_7ffc3eb76c90(env,lVar12,0x86);
                if (lVar14 == 0) {
                  return 0;
                }
                bVar1 = FUN_7ffc3e8aa0b0(env,receiver,lVar12,lVar14,arg0,arg1,arg2);
                bVar3 = (*(*env)->ExceptionCheck)(env);
                if (bVar3 != 0) {
                  return 0;
                }
                return bVar1;
              }
              goto LAB_7ffc3ea732b0;
            }
          }
        }
      }
LAB_7ffc3ea73296:
      pJVar15 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar6 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea732de;
    }
  }
LAB_7ffc3ea732b0:
  pJVar15 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea732de:
  (*pJVar15->ThrowNew)(env,pvVar6,arg2_00);
  return 0;
}

/* JNI_dev_krypton_9M_method_25401_12 | RVA 0x2a3320 | dev/krypton/9M.method_25401(DDDD)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25401_12
               (JNINativeInterface_ **env,void *receiver,double arg0,double arg1,double arg2,
               double arg3)

{
  double dVar1;
  double dVar2;
  double dVar3;
  byte bVar4;
  char cVar5;
  byte bVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  void *pvVar10;
  void *pvVar11;
  ulonglong uVar12;
  void *pvVar13;
  void *pvVar14;
  undefined8 uVar15;
  longlong lVar16;
  longlong lVar17;
  void *arg1_00;
  JNINativeInterface_ *pJVar18;
  char *arg2_00;
  ulonglong uVar19;
  
  pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar10 == (void *)0x0) {
    return 0;
  }
  pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvVar10,199);
  if (pvVar11 == (void *)0x0) {
    return 0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar12 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar11 + 0x10));
  }
  else {
    uVar12 = (*(*env)->GetStaticLongField)(env,pvVar10,pvVar11);
  }
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc2d48 == (void *)0x0) {
    uVar15 = FUN_7ffc3eb76c30(env,0x2f);
    lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
    if ((lVar16 != 0) &&
       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc2d48 = (*(*env)->NewGlobalRef)(env,pvVar11);
    }
  }
  pvVar11 = _DAT_7ffc3ebc2d48;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  uVar19 = uVar12 ^ 0x59061962a1dc;
  pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xa6fff764c64e3a44);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
  pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc2d50 == (void *)0x0) {
    uVar15 = FUN_7ffc3eb76c30(env,0x2f);
    lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba8100,0,0);
    if ((lVar16 != 0) &&
       (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00), pvVar13 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc2d50 = (*(*env)->NewGlobalRef)(env,pvVar13);
    }
  }
  pvVar13 = _DAT_7ffc3ebc2d50;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  pvVar14 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xa6f9934975ea6bd9);
  (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
  (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc2d58 == (void *)0x0) {
    uVar15 = FUN_7ffc3eb76c30(env,0x2f);
    lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
    if ((lVar16 != 0) &&
       (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00), pvVar13 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc2d58 = (*(*env)->NewGlobalRef)(env,pvVar13);
    }
  }
  pvVar13 = _DAT_7ffc3ebc2d58;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  pvVar14 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xa6fc4e2efb41d388);
  (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
  (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar11);
  uVar15 = FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  iVar7 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
  lVar16 = FUN_7ffc3eb76c90(env,pvVar10,0x7d);
  if (lVar16 == 0) {
    return 0;
  }
  iVar8 = FUN_7ffc3e7db1e0(env,pvVar10,lVar16);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc2d60 == (void *)0x0) {
    uVar15 = FUN_7ffc3eb76c30(env,0x2f);
    lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
    if ((lVar16 != 0) &&
       (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc2d60 = (*(*env)->NewGlobalRef)(env,pvVar10);
    }
  }
  pvVar10 = _DAT_7ffc3ebc2d60;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xa6fb8bb4e5213ab9);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
  pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  lVar16 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09d8,0x83);
  if (lVar16 == 0) {
    return 0;
  }
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,arg3);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar11 == (void *)0x0) {
LAB_7ffc3ea74d0e:
    pJVar18 = *env;
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar10 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar9 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar9 = (*(*env)->GetArrayLength)(env,pvVar11);
    }
    if (4 < iVar9) {
      (*(*env)->SetObjectArrayElement)(env,pvVar11,4,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,arg2);
      bVar4 = (*(*env)->ExceptionCheck)(env);
      if (bVar4 != 0) {
        return 0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar9 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar9 = (*(*env)->GetArrayLength)(env,pvVar11);
      }
      if (3 < iVar9) {
        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar13);
        lVar17 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar17 == 0) {
          return 0;
        }
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar17);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar9 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar9 = (*(*env)->GetArrayLength)(env,pvVar11);
        }
        if (2 < iVar9) {
          dVar3 = (double)iVar7;
          dVar2 = arg1 * dVar3;
          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,dVar2);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 != 0) {
            return 0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (*(*env)->GetArrayLength)(env,pvVar11);
          }
          if (1 < iVar7) {
            dVar1 = arg0 * dVar3;
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,dVar1);
            bVar4 = (*(*env)->ExceptionCheck)(env);
            if (bVar4 != 0) {
              return 0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar7 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if (0 < iVar7) {
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
              if (_DAT_7ffc3ebc2d68 == (void *)0x0) {
                uVar15 = FUN_7ffc3eb76c30(env,0x2f);
                lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                if ((lVar16 != 0) &&
                   (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                   pvVar13 != (void *)0x0)) {
                  _DAT_7ffc3ebc2d68 = (*(*env)->NewGlobalRef)(env,pvVar13);
                }
              }
              pvVar13 = _DAT_7ffc3ebc2d68;
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 != 0) {
                return 0;
              }
              pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar10);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xa6c067dcd5223112);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar19);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar10);
              FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 != 0) {
                return 0;
              }
              if (_DAT_7ffc3ebc2d70 == (void *)0x0) {
                uVar15 = FUN_7ffc3eb76c30(env,0x2f);
                lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
                if ((lVar16 != 0) &&
                   (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                   pvVar10 != (void *)0x0)) {
                  _DAT_7ffc3ebc2d70 = (*(*env)->NewGlobalRef)(env,pvVar10);
                }
              }
              pvVar10 = _DAT_7ffc3ebc2d70;
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 != 0) {
                return 0;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xa6ff16f6ba38d675);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar19);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
              pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 != 0) {
                return 0;
              }
              if (_DAT_7ffc3ebc2d78 == (void *)0x0) {
                uVar15 = FUN_7ffc3eb76c30(env,0x2f);
                lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
                if ((lVar16 != 0) &&
                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                   pvVar11 != (void *)0x0)) {
                  _DAT_7ffc3ebc2d78 = (*(*env)->NewGlobalRef)(env,pvVar11);
                }
              }
              pvVar11 = _DAT_7ffc3ebc2d78;
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 != 0) {
                return 0;
              }
              pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xa6f846fc5a109670);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar19);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 != 0) {
                return 0;
              }
              do {
                if (_DAT_7ffc3ebc2d80 == (void *)0x0) {
                  uVar15 = FUN_7ffc3eb76c30(env,0x2f);
                  lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
                  if ((lVar16 != 0) &&
                     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                     pvVar11 != (void *)0x0)) {
                    _DAT_7ffc3ebc2d80 = (*(*env)->NewGlobalRef)(env,pvVar11);
                  }
                }
                pvVar11 = _DAT_7ffc3ebc2d80;
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar10);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0xa6f927c036e46df0);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar19);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar14);
                uVar15 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                cVar5 = FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
                if (cVar5 == '\0') break;
                if (_DAT_7ffc3ebc2d88 == (void *)0x0) {
                  uVar15 = FUN_7ffc3eb76c30(env,0x2f);
                  lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
                  if ((lVar16 != 0) &&
                     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                     pvVar11 != (void *)0x0)) {
                    _DAT_7ffc3ebc2d88 = (*(*env)->NewGlobalRef)(env,pvVar11);
                  }
                }
                pvVar11 = _DAT_7ffc3ebc2d88;
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar10);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0xa6cee6557b2110b0);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar19);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar14);
                pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0xaf);
                if (pvVar13 == (void *)0x0) {
                  return 0;
                }
                if ((pvVar11 != (void *)0x0) &&
                   (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar13), bVar4 == 0)) {
                  pJVar18 = *env;
                  arg2_00 = (char *)0x7ffc3eba6033;
                  pvVar10 = pvRam00007ffc3ebc0a58;
                  goto LAB_7ffc3ea74d00;
                }
                pvVar13 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                lVar16 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09d8,0x83);
                if (lVar16 == 0) {
                  return 0;
                }
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,arg3);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                if (pvVar13 == (void *)0x0) goto LAB_7ffc3ea74d0e;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar13);
                }
                if (iVar7 < 5) goto LAB_7ffc3ea74ce8;
                (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar14);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,arg2);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar13);
                }
                if (iVar7 < 4) goto LAB_7ffc3ea74ce8;
                (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar14);
                lVar17 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                if (lVar17 == 0) {
                  return 0;
                }
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar17,
                                                   uVar12 ^ 0x4f03b54e4ae);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar13);
                }
                if (iVar7 < 3) goto LAB_7ffc3ea74ce8;
                (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar14);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,dVar2);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar13);
                }
                if (iVar7 < 2) goto LAB_7ffc3ea74ce8;
                (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09d8,lVar16,dVar1);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar13);
                }
                if (iVar7 < 1) goto LAB_7ffc3ea74ce8;
                (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
                if (_DAT_7ffc3ebc2d90 == (void *)0x0) {
                  uVar15 = FUN_7ffc3eb76c30(env,0x2f);
                  lVar16 = FUN_7ffc3eb77170(env,uVar15,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                  if ((lVar16 != 0) &&
                     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                     pvVar14 != (void *)0x0)) {
                    _DAT_7ffc3ebc2d90 = (*(*env)->NewGlobalRef)(env,pvVar14);
                  }
                }
                pvVar14 = _DAT_7ffc3ebc2d90;
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
                arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar11);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar13);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0xa6c067dcd5223112);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar19);
                (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar11);
                FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 != 0) {
                  return 0;
                }
              } while (iVar8 == 0);
              if (receiver != (void *)0x0) {
                lVar16 = FUN_7ffc3eb76c30(env,0x30);
                if (lVar16 == 0) {
                  return 0;
                }
                lVar17 = FUN_7ffc3eb76c90(env,lVar16,0x1df);
                if (lVar17 == 0) {
                  return 0;
                }
                bVar4 = FUN_7ffc3e8aa0b0(env,receiver,lVar16,lVar17,dVar1 / dVar3,dVar2 / dVar3,arg2
                                         ,arg3);
                bVar6 = (*(*env)->ExceptionCheck)(env);
                if (bVar6 != 0) {
                  return 0;
                }
                return bVar4;
              }
              goto LAB_7ffc3ea74d0e;
            }
          }
        }
      }
    }
LAB_7ffc3ea74ce8:
    pJVar18 = *env;
    arg2_00 = (char *)0x7ffc3eba6019;
    pvVar10 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3ea74d00:
  (*pJVar18->ThrowNew)(env,pvVar10,arg2_00);
  return 0;
}

/* JNI_dev_krypton_9M_method_25421_13 | RVA 0x2a4d40 | dev/krypton/9M.method_25421()Z | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25421_13(JNINativeInterface_ **env,void *receiver)

{
  return 0;
}

/* JNI_dev_krypton_9M_method_25419_14 | RVA 0x2a4d50 | dev/krypton/9M.method_25419()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_method_25419_14(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  void *arg1;
  longlong lVar9;
  longlong lVar10;
  undefined8 uVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar12;
  ulonglong uVar13;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,199);
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
  if (_DAT_7ffc3ebc2ce0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba74db,0x7ffc3eba6153,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2ce0 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2ce0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar12 = uVar5 ^ 0x4ca2ee0ac8;
  pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xded8ed5e164dd70)
  ;
  (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
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
  lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
  if (lVar7 == 0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar5 ^ 0x1b6f6ba3a6b9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3ea75c7c:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (0 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
      if (_DAT_7ffc3ebc2ce8 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x2f);
        lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebadae6,0x7ffc3eba6167,0,0);
        if ((lVar9 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2ce8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc2ce8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xdd57cdb76239b31);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,4);
      if (pvVar4 == (void *)0x0) {
        return;
      }
      pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea75c7c;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
      }
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar4);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar5 ^ 0x2c0ab95fe805);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
          if (_DAT_7ffc3ebc2cf0 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2f);
            lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebadae6,0x7ffc3ebabdbc,0,0);
            if ((lVar9 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc2cf0 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc2cf0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar6);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xdd5d9a3352891b7);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,arg1);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if ((pvVar3 != (void *)0x0) &&
             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 == 0)) {
            UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
            arg2 = (char *)0x7ffc3eba6033;
            pvVar3 = pvRam00007ffc3ebc0a58;
            goto LAB_7ffc3ea75c94;
          }
          pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
          if (lVar9 == 0) {
            return;
          }
          uVar13 = uVar5 ^ 0x797d644881d5;
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar9,uVar13 & 0xffff);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar4 == (void *)0x0) goto LAB_7ffc3ea75c7c;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (3 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar9,(int)uVar13 >> 0x10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (2 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
              lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
              if (lVar10 == 0) {
                return;
              }
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar10,0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (1 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
                pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar9,uVar13 >> 0x20);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (0 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
                  if (_DAT_7ffc3ebc2cf8 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                    lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                    if ((lVar9 != 0) &&
                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar6 != (void *)0x0)) {
                      _DAT_7ffc3ebc2cf8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                    }
                  }
                  pvVar6 = _DAT_7ffc3ebc2cf8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xdd2d513fcfd6a0a);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                    uVar5 ^ 0x6fdd97088ace);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar3 == (void *)0x0) goto LAB_7ffc3ea75c7c;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                  }
                  if (0 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
                    if (_DAT_7ffc3ebc2d00 == (void *)0x0) {
                      uVar11 = FUN_7ffc3eb76c30(env,0x2f);
                      lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                      if ((lVar7 != 0) &&
                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                         pvVar4 != (void *)0x0)) {
                        _DAT_7ffc3ebc2d00 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                    pvVar4 = _DAT_7ffc3ebc2d00;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xddd4a6ce4395da3);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar3);
                    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea75bad. Too many branches */
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
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3ea75c94:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea75ca7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_9M_8_15 | RVA 0x2a5cd0 | dev/krypton/9M.8([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_8_15(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  JNINativeInterface_ *pJVar6;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar7;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3ea774fb:
    pJVar6 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar3 < 1) {
LAB_7ffc3ea7750d:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea75d64;
    }
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar6 = *env;
    if (pvVar5 != (void *)0x0) {
      bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar7 == 0) {
          return;
        }
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2f);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,199);
        if (pvVar9 == (void *)0x0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar14 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar9 + 0x10));
        }
        else {
          uVar14 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5be0 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
          if ((lVar7 != 0) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc5be0 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
        }
        pvVar9 = _DAT_7ffc3ebc5be0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        uVar14 = uVar14 ^ uVar8;
        pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x8aebf631407b1650);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
        pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5be8 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba74db,0x7ffc3eba6153,0,0);
          if ((lVar7 != 0) &&
             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar10 != (void *)0x0)) {
            _DAT_7ffc3ebc5be8 = (*(*env)->NewGlobalRef)(env,pvVar10);
          }
        }
        pvVar10 = _DAT_7ffc3ebc5be8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x8aedd6cadcdd5a70);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
        pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5bf0 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaea34,0x7ffc3eba7e3d,0,0);
          if ((lVar7 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc5bf0 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc5bf0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x8adbd0c78e922f29);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5bf8 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
          if ((lVar7 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc5bf8 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc5bf8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar9);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x8ad54f54bae68416);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar9);
        FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5c00 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebb29fc,0x7ffc3ebb2a26,0,0);
          if ((lVar7 != 0) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc5c00 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
        }
        pvVar9 = _DAT_7ffc3ebc5c00;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x8aee04362cc846b8);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar11);
        FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0x7a);
        if (lVar7 == 0) {
          return;
        }
        iVar3 = FUN_7ffc3e7db1e0(env,pvVar5,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5c08 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc5c08 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc5c08;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x8aef8ae1631416ad);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
        if (lVar7 == 0) {
          return;
        }
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea774fb;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
        }
        if (iVar4 < 1) goto LAB_7ffc3ea7750d;
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
        if (_DAT_7ffc3ebc5c10 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
          if ((lVar7 != 0) &&
             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar10 != (void *)0x0)) {
            _DAT_7ffc3ebc5c10 = (*(*env)->NewGlobalRef)(env,pvVar10);
          }
        }
        pvVar10 = _DAT_7ffc3ebc5c10;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar9);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x8ad321de8681bf2b);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar5);
        FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5c18 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc5c18 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc5c18;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x8aeb17a33c0dfa61);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc5c20 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0x2f);
          lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
          if ((lVar7 != 0) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc5c20 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
        }
        pvVar9 = _DAT_7ffc3ebc5c20;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x8aec47a9dc25ba64);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        while( true ) {
          if (_DAT_7ffc3ebc5c28 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
            if ((lVar7 != 0) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc5c28 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
          }
          pvVar9 = _DAT_7ffc3ebc5c28;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x8aed2695b0d141e4);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
          if (cVar2 == '\0') {
            return;
          }
          if (_DAT_7ffc3ebc5c30 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
            if ((lVar7 != 0) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc5c30 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
          }
          pvVar9 = _DAT_7ffc3ebc5c30;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x8adae700fd143ca4);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
          pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar10 = (void *)FUN_7ffc3eb76c30(env,0xaf);
          if (pvVar10 == (void *)0x0) {
            return;
          }
          if ((pvVar9 != (void *)0x0) &&
             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar10), bVar1 == 0)) break;
          pvVar10 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar7 == 0) {
            return;
          }
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar7,uVar14 ^ 0x13cb9b26b05c
                                            );
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar10 == (void *)0x0) goto LAB_7ffc3ea774fb;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
          }
          if (iVar4 < 1) goto LAB_7ffc3ea7750d;
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
          if (_DAT_7ffc3ebc5c38 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0x2f);
            lVar7 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
            if ((lVar7 != 0) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc5c38 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
          }
          pvVar11 = _DAT_7ffc3ebc5c38;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar9);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x8ad66866a777ef4b);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar9);
          FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (iVar3 == 0) {
            return;
          }
          if (bVar1 != 0) {
            return;
          }
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea75d64;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar6->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea75d64:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea75d7a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2);
  return;
}

/* JNI_dev_krypton_9M_method_25406_16 | RVA 0x2a7550 | dev/krypton/9M.method_25406(Lnet/minecraft/class_11909;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_9M_method_25406_16(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  longlong lVar12;
  void *pvVar13;
  void *arg1;
  longlong lVar14;
  JNINativeInterface_ *pJVar15;
  ulonglong uVar16;
  char *arg2;
  double dVar17;
  double dVar18;
  
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,199);
  if (pvVar7 == (void *)0x0) {
    return 0;
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
    return 0;
  }
  if (_DAT_7ffc3ebc84c8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
    if ((lVar12 != 0) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
    {
      _DAT_7ffc3ebc84c8 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
  }
  pvVar7 = _DAT_7ffc3ebc84c8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  uVar16 = uVar8 ^ 0x1983b2f9de8e;
  pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xd9adb7e16dd54516);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc84d0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba8100,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc84d0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc84d0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xd9abd3ccde71148b
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc84d8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc84d8 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc84d8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xd9ae0eab50daacda
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  iVar4 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
  lVar12 = FUN_7ffc3eb76c90(env,pvVar6,0x7a);
  if (lVar12 == 0) {
    return 0;
  }
  iVar5 = FUN_7ffc3e7db1e0(env,pvVar6,lVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xb0);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (*(*env)->AllocObject)(env,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (_DAT_7ffc3ebc84e0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc84e0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc84e0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,arg0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xd9928ba88ff37975);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dVar17 = (double)FUN_7ffc3e853af0(env,uVar11,uRam00007ffc3ebc0a20);
  if (_DAT_7ffc3ebc84e8 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba71bb,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc84e8 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc84e8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,arg0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xd9adfac6bdb21606);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  dVar18 = (double)FUN_7ffc3e853af0(env,uVar11,uRam00007ffc3ebc0a20);
  if (_DAT_7ffc3ebc84f0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3ebb2a66,0,0);
    if ((lVar12 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc84f0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc84f0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,arg0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xd9913d6fa1c34b6d);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
  uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return 0;
  }
  if (pvVar7 != (void *)0x0) {
    lVar12 = FUN_7ffc3eb76c90(env,pvVar6,0x1dc);
    if (lVar12 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar12,dVar17 * (double)iVar4,dVar18 * (double)iVar4,uVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (_DAT_7ffc3ebc84f8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x2f);
      lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaea34,0x7ffc3ebb29d5,0,0);
      if ((lVar12 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc84f8 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc84f8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0xd9a9cb314eba45eb);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar9 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
      }
      if (1 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar7);
        lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar12 == 0) {
          return 0;
        }
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
        }
        if (0 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
          if (_DAT_7ffc3ebc8500 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2f);
            lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
            if ((lVar12 != 0) &&
               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar10 != (void *)0x0)) {
              _DAT_7ffc3ebc8500 = (*(*env)->NewGlobalRef)(env,pvVar10);
            }
          }
          pvVar10 = _DAT_7ffc3ebc8500;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar9);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xd99f4135d8907dfd);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
          FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (_DAT_7ffc3ebc8508 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2f);
            lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebaea34,0x7ffc3eba7f73,0,0);
            if ((lVar12 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc8508 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc8508;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xd9ad567311a3a927);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (_DAT_7ffc3ebc8510 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x2f);
            lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba61d9,0,0);
            if ((lVar12 != 0) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc8510 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
          }
          pvVar9 = _DAT_7ffc3ebc8510;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xd9aa0679f18be922);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          do {
            if (_DAT_7ffc3ebc8518 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3ebadae6,0x7ffc3eba6204,0,0);
              if ((lVar12 != 0) &&
                 (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar9 != (void *)0x0)) {
                _DAT_7ffc3ebc8518 = (*(*env)->NewGlobalRef)(env,pvVar9);
              }
            }
            pvVar9 = _DAT_7ffc3ebc8518;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0xd9ab67459d7f12a2);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
            uVar11 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
            if (cVar2 == '\0') break;
            if (_DAT_7ffc3ebc8520 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3ebadae6,0x7ffc3eba621c,0,0);
              if ((lVar12 != 0) &&
                 (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar9 != (void *)0x0)) {
                _DAT_7ffc3ebc8520 = (*(*env)->NewGlobalRef)(env,pvVar9);
              }
            }
            pvVar9 = _DAT_7ffc3ebc8520;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0xd99ca6d0d0ba6fe2);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
            pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            pvVar10 = (void *)FUN_7ffc3eb76c30(env,0xaf);
            if (pvVar10 == (void *)0x0) {
              return 0;
            }
            if ((pvVar9 != (void *)0x0) &&
               (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar10), bVar1 == 0)) {
              pJVar15 = *env;
              arg2 = (char *)0x7ffc3eba6033;
              pvVar6 = pvRam00007ffc3ebc0a58;
              goto LAB_7ffc3ea79072;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            if (pvVar10 == (void *)0x0) goto LAB_7ffc3ea79044;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
            }
            if (iVar4 < 2) goto LAB_7ffc3ea7902a;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
            lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar12 == 0) {
              return 0;
            }
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar12,
                                               uVar8 ^ 0x16ca02d6d4ba);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
            }
            if (iVar4 < 1) goto LAB_7ffc3ea7902a;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
            if (_DAT_7ffc3ebc8528 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,0x2f);
              lVar12 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
              if ((lVar12 != 0) &&
                 (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar13 != (void *)0x0)) {
                _DAT_7ffc3ebc8528 = (*(*env)->NewGlobalRef)(env,pvVar13);
              }
            }
            pvVar13 = _DAT_7ffc3ebc8528;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar9);
            (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar10);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xd99f4135d8907dfd);
            (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
            (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar9);
            FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
          } while (iVar5 != 0);
          if (receiver != (void *)0x0) {
            lVar12 = FUN_7ffc3eb76c30(env,0x30);
            if (lVar12 == 0) {
              return 0;
            }
            lVar14 = FUN_7ffc3eb76c90(env,lVar12,0x87);
            if (lVar14 == 0) {
              return 0;
            }
            bVar1 = FUN_7ffc3e8aa0b0(env,receiver,lVar12,lVar14,arg0);
            bVar3 = (*(*env)->ExceptionCheck)(env);
            if (bVar3 != 0) {
              return 0;
            }
            return bVar1;
          }
          goto LAB_7ffc3ea79044;
        }
      }
LAB_7ffc3ea7902a:
      pJVar15 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar6 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea79072;
    }
  }
LAB_7ffc3ea79044:
  pJVar15 = *env;
  arg2 = &DAT_7ffc3eba6000;
  pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea79072:
  (*pJVar15->ThrowNew)(env,pvVar6,arg2);
  return 0;
}

/* JNI_dev_krypton_9M_2_17 | RVA 0x2a90b0 | dev/krypton/9M.2([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_2_17(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  bool bVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  longlong lVar13;
  longlong lVar14;
  ulonglong uVar15;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar16;
  void *pvVar17;
  undefined8 uVar18;
  void *pvVar19;
  void *pvVar20;
  undefined8 uVar21;
  longlong lVar22;
  JNINativeInterface_ *pJVar23;
  ulonglong uVar24;
  char *pcVar25;
  int iVar26;
  double dVar27;
  double dVar28;
  double dVar29;
  undefined4 uVar30;
  undefined4 uVar31;
  undefined8 in_stack_ffffffffffffff18;
  undefined4 uVar32;
  undefined8 in_stack_ffffffffffffff20;
  undefined4 uVar33;
  undefined8 in_stack_ffffffffffffff30;
  undefined4 uVar34;
  undefined8 in_stack_ffffffffffffff38;
  undefined4 uVar35;
  
  uVar32 = (undefined4)((ulonglong)in_stack_ffffffffffffff18 >> 0x20);
  uVar33 = (undefined4)((ulonglong)in_stack_ffffffffffffff20 >> 0x20);
  uVar34 = (undefined4)((ulonglong)in_stack_ffffffffffffff30 >> 0x20);
  uVar35 = (undefined4)((ulonglong)in_stack_ffffffffffffff38 >> 0x20);
  if (arg0 == (void *)0x0) goto LAB_7ffc3ea7c049;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) goto LAB_7ffc3ea7bf5d;
  pvVar10 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x35);
  if (pvVar11 == (void *)0x0) {
    return;
  }
  if ((pvVar10 != (void *)0x0) && (bVar2 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11), bVar2 == 0)
     ) {
LAB_7ffc3ea7bf7e:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar25 = (char *)0x7ffc3eba6033;
    pvVar10 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3ea793e8;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 2) goto LAB_7ffc3ea7bf5d;
  pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  if ((pvVar11 != (void *)0x0) &&
     (bVar2 = (*(*env)->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc09e8), bVar2 == 0))
  goto LAB_7ffc3ea7bf7e;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 3) goto LAB_7ffc3ea7bf5d;
  pvVar12 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
  pJVar23 = *env;
  if (pvVar12 == (void *)0x0) {
LAB_7ffc3ea793dd:
    UNRECOVERED_JUMPTABLE = pJVar23->ThrowNew;
    pcVar25 = &DAT_7ffc3eba6000;
    pvVar10 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea793e8:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea79420. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar10,pcVar25);
    return;
  }
  bVar2 = (*pJVar23->IsInstanceOf)(env,pvVar12,pvRam00007ffc3ebc09d8);
  if (bVar2 == 0) goto LAB_7ffc3ea7bf7e;
  lVar13 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09d8,0x8a);
  if (lVar13 == 0) {
    return;
  }
  dVar27 = (double)FUN_7ffc3e853af0(env,pvVar12,lVar13);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 4) goto LAB_7ffc3ea7bf5d;
  pvVar12 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
  pJVar23 = *env;
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3ea793dd;
  bVar2 = (*pJVar23->IsInstanceOf)(env,pvVar12,pvRam00007ffc3ebc0958);
  if (bVar2 == 0) goto LAB_7ffc3ea7bf7e;
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar14 == 0) {
    return;
  }
  uVar15 = FUN_7ffc3e7d1a20(env,pvVar12,lVar14);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 5) goto LAB_7ffc3ea7bf5d;
  pvVar12 = (*(*env)->GetObjectArrayElement)(env,arg0,4);
  pJVar23 = *env;
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3ea793dd;
  bVar2 = (*pJVar23->IsInstanceOf)(env,pvVar12,pvRam00007ffc3ebc09d8);
  if (bVar2 == 0) goto LAB_7ffc3ea7bf7e;
  dVar28 = (double)FUN_7ffc3e853af0(env,pvVar12,lVar13);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  pvVar12 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar12 == (void *)0x0) {
    return;
  }
  pvVar16 = (void *)FUN_7ffc3eb76ce0(env,pvVar12,199);
  if (pvVar16 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar24 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar16 + 0x10));
  }
  else {
    uVar24 = (*(*env)->GetStaticLongField)(env,pvVar12,pvVar16);
  }
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  lVar13 = FUN_7ffc3eb76c90(env,pvVar12,0x7d);
  if (lVar13 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,pvVar12,lVar13);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (pvVar11 == (void *)0x0 && iVar3 == 0) {
    return;
  }
  if (_DAT_7ffc3ebc58a0 == (void *)0x0) {
    uVar18 = FUN_7ffc3eb76c30(env,0x2f);
    uVar34 = 0x7ffc;
    uVar33 = 0x7ffc;
    uVar32 = 0x7ffc;
    uVar35 = 0;
    lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                              0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
    if ((lVar13 != 0) &&
       (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00), pvVar12 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc58a0 = (*(*env)->NewGlobalRef)(env,pvVar12);
    }
  }
  pvVar12 = _DAT_7ffc3ebc58a0;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 == 0) {
    uVar24 = uVar24 ^ uVar15;
    pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar11);
    pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0xb2064e111fcfa826);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
    pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
    uVar18 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 == 0) {
      uVar4 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
      iVar5 = (int)((longlong)uVar24 >> 0x3f);
      iVar26 = iVar5 + (uint)(0 < (longlong)uVar24);
      bVar1 = SCARRY4(iVar5,(uint)(0 < (longlong)uVar24)) != iVar26 < 0;
      if ((iVar26 == 0 || bVar1) || iVar3 != 0) {
        if (iVar3 == 0) goto LAB_7ffc3ea798c7;
LAB_7ffc3ea79a06:
        if (uVar4 != 0) {
LAB_7ffc3ea79a0e:
          if (_DAT_7ffc3ebc58c0 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebaea34,0x7ffc3eba71bb,0,0);
            if ((lVar13 != 0) &&
               (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar12 != (void *)0x0)) {
              _DAT_7ffc3ebc58c0 = (*(*env)->NewGlobalRef)(env,pvVar12);
            }
          }
          pvVar12 = _DAT_7ffc3ebc58c0;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,0,receiver);
          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xb2033be5f4d56d26);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          uVar18 = FUN_7ffc3e853af0(env,uVar18,uRam00007ffc3ebc0a20);
          if (iVar26 < 1) {
            return;
          }
          if (iVar3 != 0) goto LAB_7ffc3ea79b33;
          uVar30 = (undefined4)uVar18;
          uVar31 = (undefined4)((ulonglong)uVar18 >> 0x20);
joined_r0x7ffc3ea7b1fc:
          if (_DAT_7ffc3ebc58e0 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3eba74db,0x7ffc3eba7e1f,0,0);
            if ((lVar13 != 0) &&
               (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar12 != (void *)0x0)) {
              _DAT_7ffc3ebc58e0 = (*(*env)->NewGlobalRef)(env,pvVar12);
            }
          }
          pvVar12 = _DAT_7ffc3ebc58e0;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xb23ccf55312a2e87);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
          pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc58e8 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba8100,0,0);
            if ((lVar13 != 0) &&
               (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar16 != (void *)0x0)) {
              _DAT_7ffc3ebc58e8 = (*(*env)->NewGlobalRef)(env,pvVar16);
            }
          }
          pvVar16 = _DAT_7ffc3ebc58e8;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar17 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xb23aab78828e7f1a);
          (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
          (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc58f0 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadae6,0x7ffc3eba64b4,0,0);
            if ((lVar13 != 0) &&
               (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar16 != (void *)0x0)) {
              _DAT_7ffc3ebc58f0 = (*(*env)->NewGlobalRef)(env,pvVar16);
            }
          }
          pvVar16 = _DAT_7ffc3ebc58f0;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar17 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xb20f45760a5f59c9);
          (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
          (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar12);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          iVar5 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
          if ((iVar26 == 0 || bVar1) || iVar3 != 0) {
            return;
          }
          pvVar12 = (void *)FUN_7ffc3eb76c30(env,0x34);
          if (pvVar12 == (void *)0x0) {
            return;
          }
          pvVar16 = (*(*env)->AllocObject)(env,pvVar12);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc58f8 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                                      0x7ffc3eba7805,0x7ffc3eba647c,0,0);
            if ((lVar13 != 0) &&
               (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar17 != (void *)0x0)) {
              _DAT_7ffc3ebc58f8 = (*(*env)->NewGlobalRef)(env,pvVar17);
            }
          }
          pvVar17 = _DAT_7ffc3ebc58f8;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar19 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x499f);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar20);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar24 ^ 0x5136d470378d0536);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar20);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          uVar6 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc5900 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                                      0x7ffc3eba7805,0x7ffc3eba647c,0,0);
            if ((lVar13 != 0) &&
               (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar17 != (void *)0x0)) {
              _DAT_7ffc3ebc5900 = (*(*env)->NewGlobalRef)(env,pvVar17);
            }
          }
          pvVar17 = _DAT_7ffc3ebc5900;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar19 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x623e);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar20);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar24 ^ 0x6a70ac8450a9ae85);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar20);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          uVar7 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc5908 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                                      0x7ffc3eba7805,0x7ffc3eba647c,0,0);
            if ((lVar13 != 0) &&
               (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar17 != (void *)0x0)) {
              _DAT_7ffc3ebc5908 = (*(*env)->NewGlobalRef)(env,pvVar17);
            }
          }
          pvVar17 = _DAT_7ffc3ebc5908;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar19 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x623e);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar20);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar24 ^ 0x6a70ac8450a9ae85);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar20);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          uVar8 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
          if (_DAT_7ffc3ebc5910 == (void *)0x0) {
            uVar18 = FUN_7ffc3eb76c30(env,0x2f);
            uVar34 = 0x7ffc;
            uVar33 = 0x7ffc;
            uVar32 = 0x7ffc;
            uVar35 = 0;
            lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba6478,0x7ffc3eba606c,
                                      0x7ffc3eba7805,0x7ffc3eba647c,0,0);
            if ((lVar13 != 0) &&
               (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
               pvVar17 != (void *)0x0)) {
              _DAT_7ffc3ebc5910 = (*(*env)->NewGlobalRef)(env,pvVar17);
            }
          }
          pvVar17 = _DAT_7ffc3ebc5910;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar19 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x20cb);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar20);
          pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar24 ^ 0x602d98d142fcec69);
          (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar20);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          uVar9 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
          if (pvVar16 != (void *)0x0) {
            lVar13 = FUN_7ffc3eb76c90(env,pvVar12,0x84);
            if (lVar13 == 0) {
              return;
            }
            FUN_7ffc3e7dbbc0(env,pvVar16,pvVar12,lVar13,CONCAT44(uVar32,uVar6),
                             CONCAT44(uVar33,uVar7),uVar24 ^ 0x6def3668f047,CONCAT44(uVar34,uVar8),
                             CONCAT44(uVar35,uVar9));
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return;
            }
            pvVar12 = (*(*env)->NewObjectArray)(env,10,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return;
            }
            lVar13 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09d8,0x83);
            if (lVar13 == 0) {
              return;
            }
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,0x4018000000000000);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return;
            }
            if (pvVar12 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
              }
              if (9 < iVar3) {
                (*(*env)->SetObjectArrayElement)(env,pvVar12,9,pvVar17);
                pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                   0x4018000000000000);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                }
                if (8 < iVar3) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,8,pvVar17);
                  pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                     0x4018000000000000);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 != 0) {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                  }
                  if (7 < iVar3) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,7,pvVar17);
                    pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                       0x4018000000000000);
                    bVar2 = (*(*env)->ExceptionCheck)(env);
                    if (bVar2 != 0) {
                      return;
                    }
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                    }
                    if (6 < iVar3) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,6,pvVar17);
                      lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                      if (lVar14 == 0) {
                        return;
                      }
                      pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar14,
                                                         uVar24 ^ 0x1f1f31136e51);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 != 0) {
                        return;
                      }
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                      }
                      if (5 < iVar3) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,5,pvVar17);
                        pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                           dVar28 + 15.0);
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if (bVar2 != 0) {
                          return;
                        }
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                        }
                        if (4 < iVar3) {
                          uVar15 = -(ulonglong)
                                    (dVar27 + (double)CONCAT44(uVar31,uVar30) + 10.0 <=
                                    (double)iVar5);
                          dVar27 = (double)(uVar15 & (ulonglong)dVar27 |
                                           ~uVar15 & (ulonglong)
                                                     (((double)iVar5 -
                                                      (double)CONCAT44(uVar31,uVar30)) + -10.0));
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar17);
                          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                             (double)CONCAT44(uVar31,uVar30) +
                                                             dVar27 + 5.0);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if (bVar2 != 0) {
                            return;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                          }
                          if (3 < iVar3) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar17);
                            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                               dVar28 + -5.0);
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if (bVar2 != 0) {
                              return;
                            }
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar3 = *(int *)(*(longlong *)
                                                ((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                            }
                            if (2 < iVar3) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar17);
                              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,lVar13,
                                                                 dVar27 + -5.0);
                              bVar2 = (*(*env)->ExceptionCheck)(env);
                              if (bVar2 != 0) {
                                return;
                              }
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar3 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                              }
                              if (1 < iVar3) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar17);
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar3 = *(int *)(*(longlong *)
                                                    ((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                }
                                if (0 < iVar3) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar16);
                                  if (_DAT_7ffc3ebc5918 == (void *)0x0) {
                                    uVar18 = FUN_7ffc3eb76c30(env,0x2f);
                                    lVar22 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,
                                                              0x7ffc3eba606a,0x7ffc3eba606c,
                                                              0x7ffc3ebadae6,0x7ffc3eba626f,0,0);
                                    if ((lVar22 != 0) &&
                                       (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar22,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar16 != (void *)0x0)) {
                                      _DAT_7ffc3ebc5918 = (*(*env)->NewGlobalRef)(env,pvVar16);
                                    }
                                  }
                                  pvVar16 = _DAT_7ffc3ebc5918;
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar2 != 0) {
                                    return;
                                  }
                                  pvVar17 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar10);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0xb20ff28b3959b8bb);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar24);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar17,3,pvVar12);
                                  FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar2 != 0) {
                                    return;
                                  }
                                  if (_DAT_7ffc3ebc5920 == (void *)0x0) {
                                    uVar18 = FUN_7ffc3eb76c30(env,0x2f);
                                    lVar22 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,
                                                              0x7ffc3eba606a,0x7ffc3eba606c,
                                                              0x7ffc3eba74db,0x7ffc3eba81f4,0,0);
                                    if ((lVar22 != 0) &&
                                       (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar22,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar12 != (void *)0x0)) {
                                      _DAT_7ffc3ebc5920 = (*(*env)->NewGlobalRef)(env,pvVar12);
                                    }
                                  }
                                  pvVar12 = _DAT_7ffc3ebc5920;
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar2 != 0) {
                                    return;
                                  }
                                  pvVar16 = (*(*env)->NewObjectArray)
                                                      (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0xb23fc46f5e8ffcb1);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
                                  pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar24);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,
                                                                     uRam00007ffc3ebc0a40,pvVar16);
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar2 != 0) {
                                    return;
                                  }
                                  pvVar16 = (*(*env)->NewObjectArray)
                                                      (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar2 != 0) {
                                    return;
                                  }
                                  if (pvVar16 == (void *)0x0) goto LAB_7ffc3ea7c049;
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar3 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar16 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                  }
                                  if (4 < iVar3) {
                                    (*(*env)->SetObjectArrayElement)(env,pvVar16,4,pvVar12);
                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,
                                                                       lVar13,dVar28);
                                    bVar2 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar2 != 0) {
                                      return;
                                    }
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar3 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar16 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                    }
                                    if (3 < iVar3) {
                                      (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar12);
                                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,
                                                                         lVar13,dVar27);
                                      bVar2 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar2 != 0) {
                                        return;
                                      }
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar3 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar16 & 0xfffffffffffffffc)
                                                        + (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                      }
                                      if (2 < iVar3) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar12);
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar3 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar16 & 0xfffffffffffffffc
                                                            ) + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                        }
                                        if (1 < iVar3) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar11);
                                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar14,
                                                  uVar24 ^ 0x373ff03ce168);
                                          bVar2 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar2 != 0) {
                                            return;
                                          }
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar3 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar16 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                          }
                                          if (0 < iVar3) {
                                            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar11);
                                            if (_DAT_7ffc3ebc5928 == (void *)0x0) {
                                              uVar18 = FUN_7ffc3eb76c30(env,0x2f);
                                              lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,
                                                                        0x7ffc3eba606a,
                                                                        0x7ffc3eba606c,
                                                                        0x7ffc3ebadae6,
                                                                        0x7ffc3eba8281,0,0);
                                              if ((lVar13 != 0) &&
                                                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar13,
                                                                                                                                                                          
                                                  uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0)) {
                                                _DAT_7ffc3ebc5928 =
                                                     (*(*env)->NewGlobalRef)(env,pvVar11);
                                              }
                                            }
                                            pvVar11 = _DAT_7ffc3ebc5928;
                                            bVar2 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar2 != 0) {
                                              return;
                                            }
                                            pvVar12 = (*(*env)->NewObjectArray)
                                                                (env,4,pvRam00007ffc3ebc09e0,
                                                                 (void *)0x0);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar10);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar16);
                                            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xb200e51db3197159);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar10);
                                            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24)
                                            ;
                                            (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar10);
                                            uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,
                                                                      uRam00007ffc3ebc0a40,pvVar12);
                                            bVar2 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar2 != 0) {
                                              return;
                                            }
                                            FUN_7ffc3e853af0(env,uVar18,uRam00007ffc3ebc0a20);
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
LAB_7ffc3ea7bf5d:
              UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
              pcVar25 = (char *)0x7ffc3eba6019;
              pvVar10 = pvRam00007ffc3ebc0a98;
              goto LAB_7ffc3ea793e8;
            }
          }
LAB_7ffc3ea7c049:
          pJVar23 = *env;
          goto LAB_7ffc3ea793dd;
        }
LAB_7ffc3ea79b33:
        pvVar12 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if ((bVar2 == 0) && (lVar13 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar13 != 0)) {
          pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar13,
                                             uVar24 ^ 0x167ed6df2931);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 == 0) {
            if (pvVar12 == (void *)0x0) {
              pJVar23 = *env;
              pcVar25 = &DAT_7ffc3eba6000;
              pvVar10 = pvRam00007ffc3ebc0a70;
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
              }
              if (1 < iVar5) {
                (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar16);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
                }
                if (0 < iVar5) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar11);
                  if (_DAT_7ffc3ebc58c8 == (void *)0x0) {
                    uVar18 = FUN_7ffc3eb76c30(env,0x2f);
                    uVar34 = 0x7ffc;
                    uVar33 = 0x7ffc;
                    uVar32 = 0x7ffc;
                    uVar35 = 0;
                    lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebadae6,0x7ffc3eba8281,0,0);
                    if ((lVar13 != 0) &&
                       (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
                       pvVar16 != (void *)0x0)) {
                      _DAT_7ffc3ebc58c8 = (*(*env)->NewGlobalRef)(env,pvVar16);
                    }
                  }
                  pvVar16 = _DAT_7ffc3ebc58c8;
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 == 0) {
                    pvVar17 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar10);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar12);
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0xb23f2d3a208abfc3);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar12);
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar24);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,3,pvVar12);
                    uVar18 = FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                    bVar2 = (*(*env)->ExceptionCheck)(env);
                    if (bVar2 == 0) {
                      uVar18 = FUN_7ffc3e853af0(env,uVar18,uRam00007ffc3ebc0a20);
                      uVar30 = (undefined4)uVar18;
                      uVar31 = (undefined4)((ulonglong)uVar18 >> 0x20);
                      if (_DAT_7ffc3ebc58d0 == (void *)0x0) {
                        uVar21 = FUN_7ffc3eb76c30(env,0x2f);
                        uVar34 = 0x7ffc;
                        uVar33 = 0x7ffc;
                        uVar32 = 0x7ffc;
                        uVar35 = 0;
                        lVar13 = FUN_7ffc3eb77170(env,uVar21,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                                  0x7ffc3eba606c,0x7ffc3ebb29fc,0x7ffc3eba8044,0,0);
                        if ((lVar13 != 0) &&
                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
                           pvVar12 != (void *)0x0)) {
                          _DAT_7ffc3ebc58d0 = (*(*env)->NewGlobalRef)(env,pvVar12);
                        }
                      }
                      pvVar12 = _DAT_7ffc3ebc58d0;
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 != 0) {
                        return;
                      }
                      pvVar16 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,0,receiver);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar11);
                      pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0xb238d4e9c0ee3fa4);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
                      pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar24);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar17);
                      FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc58d8 == (void *)0x0) {
                        uVar21 = FUN_7ffc3eb76c30(env,0x2f);
                        uVar34 = 0x7ffc;
                        uVar33 = 0x7ffc;
                        uVar32 = 0x7ffc;
                        uVar35 = 0;
                        lVar13 = FUN_7ffc3eb77170(env,uVar21,6,0x7ffc3ebb29c6,0x7ffc3eba606a,
                                                  0x7ffc3eba606c,0x7ffc3ebb29fc,0x7ffc3ebb07b1,0,0);
                        if ((lVar13 != 0) &&
                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
                           pvVar12 != (void *)0x0)) {
                          _DAT_7ffc3ebc58d8 = (*(*env)->NewGlobalRef)(env,pvVar12);
                        }
                      }
                      pvVar12 = _DAT_7ffc3ebc58d8;
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 != 0) {
                        return;
                      }
                      pvVar16 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,0,receiver);
                      pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09d8,
                                                         uRam00007ffc3ebc0948,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
                      pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0xb2033be5f4d56d26);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
                      pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar24);
                      (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar17);
                      FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 != 0) {
                        return;
                      }
                      goto joined_r0x7ffc3ea7b1fc;
                    }
                  }
                  goto LAB_7ffc3ea7c134;
                }
              }
              pJVar23 = *env;
              pcVar25 = (char *)0x7ffc3eba6019;
              pvVar10 = pvRam00007ffc3ebc0a98;
            }
            (*pJVar23->ThrowNew)(env,pvVar10,pcVar25);
          }
        }
      }
      else {
        if (uVar4 == 0) {
          return;
        }
        if (_DAT_7ffc3ebc58a8 == (void *)0x0) {
          uVar18 = FUN_7ffc3eb76c30(env,0x2f);
          uVar34 = 0x7ffc;
          uVar33 = 0x7ffc;
          uVar32 = 0x7ffc;
          uVar35 = 0;
          lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebaea34,0x7ffc3eba6128,0,0);
          if ((lVar13 != 0) &&
             (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
             pvVar12 != (void *)0x0)) {
            _DAT_7ffc3ebc58a8 = (*(*env)->NewGlobalRef)(env,pvVar12);
          }
        }
        pvVar12 = _DAT_7ffc3ebc58a8;
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return;
        }
        pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar16,0,receiver);
        pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0xb238d4e9c0ee3fa4);
        (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
        pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
        (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
        pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc58b0 == (void *)0x0) {
          uVar18 = FUN_7ffc3eb76c30(env,0x2f);
          uVar34 = 0x7ffc;
          uVar33 = 0x7ffc;
          uVar32 = 0x7ffc;
          uVar35 = 0;
          lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebadae6,0x7ffc3eba6245,0,0);
          if ((lVar13 != 0) &&
             (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
             pvVar16 != (void *)0x0)) {
            _DAT_7ffc3ebc58b0 = (*(*env)->NewGlobalRef)(env,pvVar16);
          }
        }
        pvVar16 = _DAT_7ffc3ebc58b0;
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return;
        }
        pvVar17 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar11);
        (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0xb238403f5a091532);
        (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
        (*(*env)->SetObjectArrayElement)(env,pvVar17,3,pvVar12);
        uVar18 = FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return;
        }
        bVar2 = FUN_7ffc3e7d53d0(env,uVar18,uRam00007ffc3ebc0a38);
        uVar4 = (uint)bVar2;
LAB_7ffc3ea798c7:
        if (uVar4 == 0) goto LAB_7ffc3ea79b33;
        if (_DAT_7ffc3ebc58b8 == (void *)0x0) {
          uVar18 = FUN_7ffc3eb76c30(env,0x2f);
          uVar34 = 0x7ffc;
          uVar33 = 0x7ffc;
          uVar32 = 0x7ffc;
          uVar35 = 0;
          lVar13 = FUN_7ffc3eb77170(env,uVar18,6,0x7ffc3ebb29c6,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebaea34,0x7ffc3eba71bb,0,0);
          if ((lVar13 != 0) &&
             (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar13,uRam00007ffc3ebc0a00),
             pvVar12 != (void *)0x0)) {
            _DAT_7ffc3ebc58b8 = (*(*env)->NewGlobalRef)(env,pvVar12);
          }
        }
        pvVar12 = _DAT_7ffc3ebc58b8;
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,0,receiver);
          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xb2033be5f4d56d26);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
          (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
          uVar18 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar16);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 == 0) {
            dVar29 = (double)FUN_7ffc3e853af0(env,uVar18,uRam00007ffc3ebc0a20);
            if (!NAN(dVar29)) {
              uVar4 = (uint)(-1.0 < dVar29) - (uint)(dVar29 < -1.0);
              goto LAB_7ffc3ea79a06;
            }
            goto LAB_7ffc3ea79a0e;
          }
        }
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar2 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        if (bVar2 == 0) goto LAB_7ffc3ea7c140;
        (*(*env)->ExceptionClear)(env);
        lVar13 = FUN_7ffc3eb76c30(env,0x2f);
        if ((lVar13 != 0) && (lVar14 = FUN_7ffc3eb76c90(env,lVar13,0x1da), lVar14 != 0)) {
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,lVar13,lVar14,pvVar10);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            pvVar10 = (*(*env)->ExceptionOccurred)(env);
            goto LAB_7ffc3ea7c140;
          }
          (*(*env)->Throw)(env,pvVar10);
        }
      }
    }
  }
LAB_7ffc3ea7c134:
  pvVar10 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3ea7c140:
  pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar2 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
  if (bVar2 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar13 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar13 != 0) && (lVar14 = FUN_7ffc3eb76c90(env,lVar13,0x1da), lVar14 != 0)) {
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,lVar13,lVar14,pvVar10);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea7c211. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar10);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_9M_1_18 | RVA 0x2ac220 | dev/krypton/9M.1(I)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_1_18(JNINativeInterface_ **env,void *receiver,int arg0)

{
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (arg1 != (void *)0x0) {
    arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,200);
    if (arg2 != (void *)0x0) {
      (*(*env)->SetStaticIntField)(env,arg1,arg2,arg0);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea7c278. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  return;
}

/* JNI_dev_krypton_9M_2_19 | RVA 0x2ac290 | dev/krypton/9M.2()I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_9M_2_19(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if ((arg1 != (void *)0x0) && (arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,200), arg2 != (void *)0x0))
  {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg1 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)arg2 + 0x10));
    }
    else {
      iVar2 = (*(*env)->GetStaticIntField)(env,arg1,arg2);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      return iVar2;
    }
  }
  return 0;
}

/* JNI_dev_krypton_9M_8_20 | RVA 0x2ac310 | dev/krypton/9M.8()I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_9M_8_20(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  int iVar5;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x2f);
  iVar5 = 0;
  if (lVar3 != 0) {
    lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x7d);
    iVar5 = 0;
    if (lVar4 != 0) {
      iVar2 = FUN_7ffc3e7db1e0(env,lVar3,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (iVar5 = 0x1f, iVar2 != 0)) {
        iVar5 = 0;
      }
    }
  }
  return iVar5;
}

/* JNI_dev_krypton_9M_a_21 | RVA 0x2ac380 | dev/krypton/9M.a(Ljava/lang/MatchException;)Ljava/lang/MatchException; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_21(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_9M_a_22 | RVA 0x2ac390 | dev/krypton/9M.a([B)Ljava/lang/String; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_22(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  uint arg2;
  byte bVar1;
  byte bVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  byte *pbVar7;
  JNINativeInterface_ *pJVar8;
  void *pvVar9;
  longlong lVar10;
  ushort *arg4;
  ushort uVar11;
  char *arg2_00;
  ulonglong uVar12;
  undefined4 uVar13;
  ulonglong uVar14;
  uint uVar15;
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
  void *pvStack_50;
  ulonglong uStack_48;
  
  if (arg0 != (void *)0x0) {
    if (bRam00007ffc3ebc08e5 == 1) {
      uVar15 = *(uint *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      uVar15 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if ((int)uVar15 < 0) {
      pJVar8 = *env;
      arg2_00 = (char *)0x7ffc3eba6048;
      pvVar6 = pvRam00007ffc3ebc0a80;
      goto LAB_7ffc3ea7c926;
    }
    pvVar6 = (*(*env)->NewCharArray)(env,uVar15);
    bVar3 = (*(*env)->ExceptionCheck)(env);
    if (bVar3 != 0) {
      return (void *)0x0;
    }
    if (uVar15 != 0) {
      plStack_78 = (longlong *)((ulonglong)arg0 & 0xfffffffffffffffc);
      plStack_60 = (longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc);
      uStack_48 = (ulonglong)uVar15;
      iStack_54 = uVar15 - 2;
      uVar12 = 0;
      uVar15 = 0;
      pvStack_50 = arg0;
LAB_7ffc3ea7c47e:
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar4 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if ((int)uVar15 < iVar4) {
        if (bRam00007ffc3ebc08e5 == 1) {
          pbVar7 = (byte *)((ulonglong)uVar15 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
        }
        else {
          pbVar7 = &bStack_61;
          (*(*env)->GetByteArrayRegion)(env,arg0,uVar15,1,pbVar7);
        }
        bVar3 = *pbVar7;
        uVar11 = (ushort)bVar3;
        iVar4 = (int)uVar12;
        if (bVar3 < 0xc0) {
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea7c930;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if ((iVar4 < 0) || (iVar5 <= iVar4)) goto LAB_7ffc3ea7c90e;
          uVar14 = (ulonglong)(iVar4 + 1);
          uStack_66 = (ushort)bVar3;
          if (bRam00007ffc3ebc08e5 == 1) {
LAB_7ffc3ea7c450:
            *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar12 * 2) = uVar11;
            uVar12 = uVar14;
          }
          else {
            pJVar8 = *env;
            arg4 = &uStack_66;
LAB_7ffc3ea7c6c1:
            (*pJVar8->SetCharArrayRegion)(env,pvVar6,iVar4,1,arg4);
            uVar12 = uVar14;
          }
LAB_7ffc3ea7c46c:
          uVar15 = uVar15 + 1;
          uVar13 = (undefined4)uVar12;
          if ((uint)uStack_48 <= uVar15) goto LAB_7ffc3ea7c87f;
          goto LAB_7ffc3ea7c47e;
        }
        if (bVar3 < 0xe0) {
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,arg0);
          }
          uVar15 = uVar15 + 1;
          if ((int)uVar15 < iVar5) {
            if (bRam00007ffc3ebc08e5 == 1) {
              pbVar7 = (byte *)((ulonglong)uVar15 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
            }
            else {
              pbVar7 = &bStack_62;
              (*(*env)->GetByteArrayRegion)(env,arg0,uVar15,1,pbVar7);
            }
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea7c930;
            bVar1 = *pbVar7;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar5 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if ((-1 < iVar4) && (iVar4 < iVar5)) {
              uVar11 = bVar1 & 0x3f | (ushort)(((int)(char)bVar3 & 0x1fU) << 6);
              uVar14 = (ulonglong)(iVar4 + 1);
              uStack_68 = uVar11;
              if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7c450;
              pJVar8 = *env;
              arg4 = &uStack_68;
              goto LAB_7ffc3ea7c6c1;
            }
          }
        }
        else {
          if (iStack_54 <= (int)uVar15) goto LAB_7ffc3ea7c46c;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,arg0);
          }
          arg2 = uVar15 + 1;
          if (iVar5 <= (int)arg2) goto LAB_7ffc3ea7c90e;
          if (bRam00007ffc3ebc08e5 == 1) {
            pbVar7 = (byte *)((ulonglong)arg2 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
          }
          else {
            pbVar7 = &bStack_63;
            (*(*env)->GetByteArrayRegion)(env,arg0,arg2,1,pbVar7);
          }
          bVar1 = *pbVar7;
          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
            iVar5 = (*(*env)->GetArrayLength)(env,arg0);
          }
          else {
            iVar5 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          uVar15 = uVar15 + 2;
          if ((int)uVar15 < iVar5) {
            if (bRam00007ffc3ebc08e5 == 1) {
              pbVar7 = (byte *)((ulonglong)uVar15 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
            }
            else {
              (*(*env)->GetByteArrayRegion)(env,arg0,uVar15,1,&bStack_79);
              pbVar7 = &bStack_79;
            }
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea7c930;
            bVar2 = *pbVar7;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar5 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if ((-1 < iVar4) && (iVar4 < iVar5)) {
              uStack_6a = bVar2 & 0x3f | (bVar1 & 0x3f) << 6 | (ushort)((int)(char)bVar3 << 0xc);
              if (bRam00007ffc3ebc08e5 == 1) {
                *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar12 * 2) = uStack_6a;
                arg0 = pvStack_50;
                uVar12 = (ulonglong)(iVar4 + 1);
              }
              else {
                (*(*env)->SetCharArrayRegion)(env,pvVar6,iVar4,1,&uStack_6a);
                arg0 = pvStack_50;
                uVar12 = (ulonglong)(iVar4 + 1);
              }
              goto LAB_7ffc3ea7c46c;
            }
          }
        }
      }
LAB_7ffc3ea7c90e:
      pJVar8 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar6 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea7c926;
    }
    uVar13 = 0;
LAB_7ffc3ea7c87f:
    pvVar9 = (*(*env)->AllocObject)(env,pvRam00007ffc3ebc09e8);
    bVar3 = (*(*env)->ExceptionCheck)(env);
    if (bVar3 != 0) {
      return (void *)0x0;
    }
    if (pvVar9 != (void *)0x0) {
      lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x10);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      FUN_7ffc3e7dbbc0(env,pvVar9,pvRam00007ffc3ebc09e8,lVar10,pvVar6,0,uVar13);
      bVar3 = (*(*env)->ExceptionCheck)(env);
      if (bVar3 != 0) {
        return (void *)0x0;
      }
      return pvVar9;
    }
  }
LAB_7ffc3ea7c930:
  pJVar8 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea7c926:
  (*pJVar8->ThrowNew)(env,pvVar6,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_23 | RVA 0x2ac960 | dev/krypton/9M.a(IJ)Ljava/lang/String; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_23(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  void *pvVar8;
  void *pvVar9;
  void *pvVar10;
  JNINativeInterface_ *pJVar11;
  uint arg2;
  char *pcVar12;
  byte bStack_5e;
  byte bStack_5d;
  uint uStack_5c;
  void *pvStack_58;
  longlong lStack_50;
  void *pvStack_48;
  
  lStack_50 = arg1;
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xc9);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar3 == (void *)0x0) goto LAB_7ffc3ea7d679;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
  }
  if ((-1 < arg0) && (arg2 = arg0 ^ (uint)lStack_50 & 0x7fff ^ 0x1a8c, (int)arg2 < iVar2)) {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,arg2);
    if (pvVar3 == (void *)0x0) {
      lVar5 = FUN_7ffc3eb76c30(env,0x10);
      if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x11), lVar6 == 0)) {
LAB_7ffc3ea7d803:
        pJVar11 = *env;
LAB_7ffc3ea7d809:
        pvVar3 = (*pJVar11->ExceptionOccurred)(env);
LAB_7ffc3ea7d80c:
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        (*(*env)->ExceptionClear)(env);
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x16);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->AllocObject)(env,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb29c6);
        if (pvVar8 != (void *)0x0) {
          lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x18);
          if (lVar5 == 0) {
            return (void *)0x0;
          }
          FUN_7ffc3e7dbbc0(env,pvVar8,pvVar4,lVar5,pvVar9,pvVar3);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          (*(*env)->Throw)(env,pvVar8);
          return (void *)0x0;
        }
      }
      else {
        lVar6 = FUN_7ffc3e7d1a80(env,lVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3ea7d803;
        if (lVar6 == 0) goto LAB_7ffc3ea7d7b2;
        lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x12);
        if (lVar5 == 0) goto LAB_7ffc3ea7d803;
        uVar7 = FUN_7ffc3e7d1a20(env,lVar6,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar5 == 0))
        goto LAB_7ffc3ea7d803;
        uVar7 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f), pvVar3 == (void *)0x0))
        goto LAB_7ffc3ea7d803;
        pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xca);
        pJVar11 = *env;
        if (pvVar4 == (void *)0x0) goto LAB_7ffc3ea7d809;
        pvVar8 = (*pJVar11->GetStaticObjectField)(env,pvVar3,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3ea7d803;
        if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea7d7b2;
        pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x11);
        if ((pvVar9 == (void *)0x0) || (lVar5 = FUN_7ffc3eb76c90(env,pvVar9,0x13), lVar5 == 0))
        goto LAB_7ffc3ea7d803;
        pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,lVar5,uVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x12), pvVar10 == (void *)0x0))
        goto LAB_7ffc3ea7d803;
        if (pvVar8 == (void *)0x0) {
          pvStack_58 = pvVar9;
          pvStack_48 = pvVar4;
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3ea7d803;
          pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6516);
          lVar5 = FUN_7ffc3eb76c30(env,0x13);
          if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x14), lVar6 == 0))
          goto LAB_7ffc3ea7d803;
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3ea7d803;
          if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea7d7b2;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar2 < 1) {
LAB_7ffc3ea7d7e5:
            pJVar11 = *env;
            pcVar12 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
            goto LAB_7ffc3ea7d7fd;
          }
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
          pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
          lVar5 = FUN_7ffc3eb76c30(env,0x14);
          if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x15), lVar6 == 0))
          goto LAB_7ffc3ea7d803;
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3ea7d803;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar2 < 2) goto LAB_7ffc3ea7d7e5;
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x15);
          pJVar11 = *env;
          if (pvVar4 == (void *)0x0) goto LAB_7ffc3ea7d809;
          pvVar9 = (*pJVar11->AllocObject)(env,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar10 = (*(*env)->NewByteArray)(env,8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (pvVar9 == (void *)0x0) {
LAB_7ffc3ea7d7b2:
                pJVar11 = *env;
                pcVar12 = &DAT_7ffc3eba6000;
                pvVar3 = pvRam00007ffc3ebc0a70;
                goto LAB_7ffc3ea7d7fd;
              }
              lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x16);
              if (lVar5 != 0) {
                FUN_7ffc3e7dbbc0(env,pvVar9,pvVar4,lVar5,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                pvVar4 = pvStack_58;
                if (bVar1 == 0) {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                  }
                  if (iVar2 < 3) goto LAB_7ffc3ea7d7e5;
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvStack_48);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3ea7d7b2;
                    lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x17);
                    if (lVar5 != 0) {
                      FUN_7ffc3e7d1a50(env,pvVar3,lVar5,uVar7,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) goto LAB_7ffc3ea7d06e;
                    }
                  }
                }
              }
            }
            goto LAB_7ffc3ea7d803;
          }
          pvVar3 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3ea7d80c;
        }
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar10);
        if (bVar1 == 0) {
          pJVar11 = *env;
          pcVar12 = (char *)0x7ffc3eba6033;
          pvVar3 = pvRam00007ffc3ebc0a58;
LAB_7ffc3ea7d7fd:
          (*pJVar11->ThrowNew)(env,pvVar3,pcVar12);
          goto LAB_7ffc3ea7d803;
        }
LAB_7ffc3ea7d06e:
        pvVar3 = (*(*env)->NewByteArray)(env,8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar3 != (void *)0x0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
          }
          if (iVar2 < 1) goto LAB_7ffc3ea7d795;
          bStack_5d = (byte)((ulonglong)lStack_50 >> 0x38);
          uStack_5c = arg2;
          pvStack_58 = pvVar8;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(byte *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08f0) = bStack_5d;
          }
          else {
            (*(*env)->SetByteArrayRegion)(env,pvVar3,0,1,&bStack_5d);
          }
          lVar5 = 1;
          bVar1 = 8;
          do {
            lVar6 = lStack_50 << (bVar1 & 0x3f);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
            }
            if (iVar2 <= lVar5) goto LAB_7ffc3ea7d795;
            bStack_5e = (byte)((ulonglong)lVar6 >> 0x38);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              *(byte *)(lVar5 + (ulonglong)uRam00007ffc3ebc08f0 +
                                *(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc)) = bStack_5e;
            }
            else {
              (*(*env)->SetByteArrayRegion)(env,pvVar3,(int)lVar5,1,&bStack_5e);
            }
            lVar5 = lVar5 + 1;
            bVar1 = bVar1 + 8;
          } while (lVar5 != 8);
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x17);
          if (pvVar4 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar8 = (*(*env)->AllocObject)(env,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar8 != (void *)0x0) {
            lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x19);
            if (lVar5 == 0) {
              return (void *)0x0;
            }
            FUN_7ffc3e7dbbc0(env,pvVar8,pvVar4,lVar5,pvVar3);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            pvVar3 = pvStack_58;
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvStack_58 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvStack_58);
            }
            arg2 = uStack_5c;
            if (iVar2 < 2) goto LAB_7ffc3ea7d795;
            pvVar4 = (*(*env)->GetObjectArrayElement)(env,pvVar3,1);
            pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x14);
            if (pvVar9 == (void *)0x0) {
              return (void *)0x0;
            }
            if (pvVar4 != (void *)0x0) {
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar9);
              if (bVar1 != 0) {
                lVar5 = FUN_7ffc3eb76c90(env,pvVar9,0x1a);
                if (lVar5 == 0) {
                  return (void *)0x0;
                }
                uVar7 = FUN_7ffc3e7d1a50(env,pvVar4,lVar5,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                }
                if (iVar2 < 1) goto LAB_7ffc3ea7d795;
                pvVar4 = (*(*env)->GetObjectArrayElement)(env,pvVar3,0);
                pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x13);
                if (pvVar8 == (void *)0x0) {
                  return (void *)0x0;
                }
                if ((pvVar4 == (void *)0x0) ||
                   (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar8), bVar1 != 0)) {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                  }
                  if (iVar2 < 3) goto LAB_7ffc3ea7d795;
                  pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar3,2);
                  pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x15);
                  if (pvVar10 == (void *)0x0) {
                    return (void *)0x0;
                  }
                  if ((pvVar9 == (void *)0x0) ||
                     (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar10), bVar1 != 0)) {
                    if (pvVar4 != (void *)0x0) {
                      lVar5 = FUN_7ffc3eb76c90(env,pvVar8,0x1b);
                      if (lVar5 == 0) {
                        return (void *)0x0;
                      }
                      FUN_7ffc3e7e1940(env,pvVar4,lVar5,2,uVar7,pvVar9);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2f);
                      if (pvVar4 == (void *)0x0) {
                        return (void *)0x0;
                      }
                      pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xcb);
                      if (pvVar9 == (void *)0x0) {
                        return (void *)0x0;
                      }
                      pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar9);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (pvVar9 != (void *)0x0) {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar9);
                        }
                        if (iVar2 <= (int)arg2) goto LAB_7ffc3ea7d795;
                        pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar9,arg2);
                        pvVar10 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652f);
                        if (pvVar9 != (void *)0x0) {
                          lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x1c);
                          if (lVar5 == 0) {
                            return (void *)0x0;
                          }
                          uVar7 = FUN_7ffc3e7d1a50(env,pvVar9,lVar5,pvVar10);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xc9);
                          if (pvVar9 == (void *)0x0) {
                            return (void *)0x0;
                          }
                          pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar9);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                          }
                          if (iVar2 < 1) goto LAB_7ffc3ea7d795;
                          pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,0);
                          if (pvVar3 != (void *)0x0) {
                            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar8);
                            if (bVar1 == 0) goto LAB_7ffc3ea7d7c8;
                            lVar5 = FUN_7ffc3eb76c90(env,pvVar8,0x1d);
                            if (lVar5 == 0) {
                              return (void *)0x0;
                            }
                            uVar7 = FUN_7ffc3e7d1a50(env,pvVar3,lVar5,uVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x1e0);
                            if (lVar5 == 0) {
                              return (void *)0x0;
                            }
                            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar5,uVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            if (pvVar9 != (void *)0x0) {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar9);
                              }
                              if ((int)arg2 < iVar2) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar9,arg2,pvVar3);
                                goto LAB_7ffc3ea7ca4f;
                              }
                              goto LAB_7ffc3ea7d795;
                            }
                          }
                        }
                      }
                    }
                    goto LAB_7ffc3ea7d679;
                  }
                }
              }
LAB_7ffc3ea7d7c8:
              pJVar11 = *env;
              pcVar12 = (char *)0x7ffc3eba6033;
              pvVar3 = pvRam00007ffc3ebc0a58;
              goto LAB_7ffc3ea7d68d;
            }
          }
        }
      }
LAB_7ffc3ea7d679:
      pJVar11 = *env;
      pcVar12 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3ea7d68d;
    }
LAB_7ffc3ea7ca4f:
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
    if (pvVar3 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xc9);
    if (pvVar4 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar3 == (void *)0x0) goto LAB_7ffc3ea7d679;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
    }
    if ((int)arg2 < iVar2) {
      pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,arg2);
      return pvVar3;
    }
  }
LAB_7ffc3ea7d795:
  pJVar11 = *env;
  pcVar12 = (char *)0x7ffc3eba6019;
  pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3ea7d68d:
  (*pJVar11->ThrowNew)(env,pvVar3,pcVar12);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_24 | RVA 0x2ad910 | dev/krypton/9M.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_24
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                 void *arg3)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  JNINativeInterface_ *pJVar6;
  undefined8 uVar7;
  longlong lVar8;
  void *arg1_00;
  void *pvVar9;
  char *arg2_00;
  void *pvVar10;
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3ea7ddb8;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3ea7dd9b;
  pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar6 = *env;
  if (pvVar4 != (void *)0x0) {
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3ea7ddca:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea7da57;
    }
    lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    uVar2 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg3);
    }
    if (iVar3 < 2) goto LAB_7ffc3ea7dd9b;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar6 = *env;
    if (pvVar4 == (void *)0x0) goto LAB_7ffc3ea7da50;
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3ea7ddca;
    lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    lVar5 = FUN_7ffc3eb76c30(env,0x2f);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x1e1);
    if (lVar8 == 0) {
      return (void *)0x0;
    }
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,uVar2,uVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar7 = uRam00007ffc3ebc09e8;
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x20);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    pvVar10 = pvVar4;
    uVar7 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar5,uVar7,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    arg1_00 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
    if (pvVar9 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (arg1_00 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,arg1_00);
      }
      if (0 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar9);
        pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6);
        if (pvVar9 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar9 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,arg1_00);
        }
        if (1 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar9);
          lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
          if (lVar5 == 0) {
            return (void *)0x0;
          }
          uVar7 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar5,uVar7,
                                   (ulonglong)pvVar10 & 0xffffffff00000000,arg1_00);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (arg1 != (void *)0x0) {
            lVar5 = FUN_7ffc3eb76c30(env,0x18);
            if (lVar5 == 0) {
              return (void *)0x0;
            }
            lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x22);
            if (lVar5 == 0) {
              return (void *)0x0;
            }
            FUN_7ffc3e7e1940(env,arg1,lVar5,uVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            return pvVar4;
          }
          goto LAB_7ffc3ea7ddb8;
        }
      }
LAB_7ffc3ea7dd9b:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea7da57;
    }
LAB_7ffc3ea7ddb8:
    pJVar6 = *env;
  }
LAB_7ffc3ea7da50:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea7da57:
  (*pJVar6->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_25 | RVA 0x2addf0 | dev/krypton/9M.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_25
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  undefined8 uVar1;
  byte bVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *arg1_00;
  void *pvVar15;
  void *pvVar16;
  longlong lVar17;
  char *arg2_00;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x18);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea7e6bb;
  lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0x23);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  pvVar8 = arg2;
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar7,arg2);
  uVar20 = (undefined4)((ulonglong)pvVar8 >> 0x20);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (_DAT_7ffc3ebc0c20 == (void *)0x0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09a0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvRam00007ffc3ebc0a90);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x18);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvRam00007ffc3ebc09e8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    uVar9 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,pvRam00007ffc3ebc09e0,
                             pvVar5);
    uVar1 = uRam00007ffc3ebc0a88;
    uVar13 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)pvVar5 >> 0x20);
    uVar10 = FUN_7ffc3eb76c30(env,0x2f);
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0c20 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0c20;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3ea7e323:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea7e351:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea7e323;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea7e323;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (2 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,arg1);
                      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x26);
                      if (lVar7 != 0) {
                        uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,
                                                  uVar19 & 0xffffffff00000000,pvVar5);
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if ((bVar2 == 0) &&
                           (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27), lVar7 != 0)) {
                          uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,arg2,
                                                    pvVar5);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             ((lVar7 = FUN_7ffc3eb76c30(env,0x18), lVar7 != 0 &&
                              (lVar7 = FUN_7ffc3eb76c90(env,lVar7,0x22), lVar7 != 0)))) {
                            FUN_7ffc3e7e1940(env,pvVar6,lVar7,uVar13);
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if (bVar2 == 0) {
                              return pvVar6;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3ea7e357;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3ea7e351;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3ea7e357:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar2 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar2 == 0) {
    return (void *)0x0;
  }
  (*(*env)->ExceptionClear)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (*(*env)->AllocObject)(env,pvVar6);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  arg1_00 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (arg1_00 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar15 = (*(*env)->AllocObject)(env,arg1_00);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar15 != (void *)0x0) {
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x28);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar15,arg1_00,lVar7);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb29c6);
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x29);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3e7d1a50(env,pvVar15,lVar7,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return (void *)0x0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,arg1);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          if (arg2 != (void *)0x0) {
            lVar17 = FUN_7ffc3eb76c30(env,0x19);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            lVar17 = FUN_7ffc3eb76c90(env,lVar17,0x2a);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            uVar13 = FUN_7ffc3e7d1a50(env,arg2,lVar17);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (lVar12 != 0) {
              lVar7 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,uVar13);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              if (lVar7 != 0) {
                lVar12 = FUN_7ffc3eb76c90(env,arg1_00,0x2b);
                if (lVar12 == 0) {
                  return (void *)0x0;
                }
                uVar13 = FUN_7ffc3e7d1a50(env,lVar7,lVar12);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (pvVar8 != (void *)0x0) {
                  lVar7 = FUN_7ffc3eb76c90(env,pvVar6,0x18);
                  if (lVar7 == 0) {
                    return (void *)0x0;
                  }
                  FUN_7ffc3e7dbbc0(env,pvVar8,pvVar6,lVar7,uVar13,pvVar5);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 != 0) {
                    return (void *)0x0;
                  }
                  (*(*env)->Throw)(env,pvVar8);
                  return (void *)0x0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3ea7e6bb:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_b_26 | RVA 0x2ae6e0 | dev/krypton/9M.b(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_9M_b_26(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  int iVar6;
  void *pvVar7;
  void *pvVar8;
  void *pvVar9;
  longlong lVar10;
  longlong lVar11;
  undefined8 uVar12;
  void *pvVar13;
  void *pvVar14;
  void *pvVar15;
  JNINativeInterface_ *pJVar16;
  uint arg2;
  char *pcVar17;
  byte *pbVar18;
  byte abStack_50 [8];
  undefined8 uStack_48;
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xcc);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea7ff82;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x7eb4, iVar6 <= (int)arg2)) {
LAB_7ffc3ea7ff68:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3ea7ff96;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3ea7fe59:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2f);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xcc);
    if (pvVar8 == (void *)0x0) {
      return 0;
    }
    pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    if (pvVar7 != (void *)0x0) {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
      }
      if (iVar6 <= (int)arg2) goto LAB_7ffc3ea7ff68;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,arg2);
      if (pvVar7 != (void *)0x0) {
        lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,8);
        if (lVar10 == 0) {
          return 0;
        }
        iVar6 = FUN_7ffc3e7d8be0(env,pvVar7,lVar10);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
          return 0;
        }
        return iVar6;
      }
    }
    goto LAB_7ffc3ea7ff82;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea7ff82;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7e8a2;
LAB_7ffc3ea7e868:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7e868;
LAB_7ffc3ea7e8a2:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7e92e;
LAB_7ffc3ea7e8f1:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7e8f1;
LAB_7ffc3ea7e92e:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7e9ba;
LAB_7ffc3ea7e97d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7e97d;
LAB_7ffc3ea7e9ba:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7ea46;
LAB_7ffc3ea7ea09:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7ea09;
LAB_7ffc3ea7ea46:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7ead1;
LAB_7ffc3ea7ea94:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7ea94;
LAB_7ffc3ea7ead1:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7eb5c;
LAB_7ffc3ea7eb1f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7eb1f;
LAB_7ffc3ea7eb5c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7ebe7;
LAB_7ffc3ea7ebaa:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7ebaa;
LAB_7ffc3ea7ebe7:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xcd);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea7ff82;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3ea7ff68;
  if (bRam00007ffc3ebc08e5 == 1) {
    pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08ec + (ulonglong)arg2 * 8 +
                      *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc));
  }
  else {
    pbVar18 = abStack_50;
    (*(*env)->GetLongArrayRegion)(env,pvVar9,arg2,1,(longlong *)pbVar18);
  }
  lVar10 = *(longlong *)pbVar18;
  pvVar9 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea7ff82;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7edf7;
LAB_7ffc3ea7edbd:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7edbd;
LAB_7ffc3ea7edf7:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7ee83;
LAB_7ffc3ea7ee46:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7ee46;
LAB_7ffc3ea7ee83:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7ef0f;
LAB_7ffc3ea7eed2:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7eed2;
LAB_7ffc3ea7ef0f:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7ef9b;
LAB_7ffc3ea7ef5e:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7ef5e;
LAB_7ffc3ea7ef9b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7f026;
LAB_7ffc3ea7efe9:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7efe9;
LAB_7ffc3ea7f026:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7f0b1;
LAB_7ffc3ea7f074:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7f074;
LAB_7ffc3ea7f0b1:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea7f13c;
LAB_7ffc3ea7f0ff:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea7f0ff;
LAB_7ffc3ea7f13c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3ea7ff68;
  abStack_50[0] = (byte)lVar10;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,7,1,abStack_50);
  }
  lVar10 = FUN_7ffc3eb76c30(env,0x10);
  if (lVar10 == 0) {
    return 0;
  }
  lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x11);
  if (lVar11 == 0) {
    return 0;
  }
  lVar11 = FUN_7ffc3e7d1a80(env,lVar10,lVar11);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (lVar11 != 0) {
    lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x12);
    if (lVar10 == 0) {
      return 0;
    }
    uVar12 = FUN_7ffc3e7d1a20(env,lVar11,lVar10);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar10 == 0) {
      return 0;
    }
    uVar12 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar10,uVar12);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xce);
    if (pvVar13 == (void *)0x0) {
      return 0;
    }
    pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar13);
    bVar4 = (*(*env)->ExceptionCheck)(env);
    if (bVar4 != 0) {
      return 0;
    }
    if (pvVar7 != (void *)0x0) {
      lVar10 = FUN_7ffc3eb76c30(env,0x11);
      if (lVar10 == 0) {
        return 0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x13);
      if (lVar10 == 0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,lVar10,uVar12);
      bVar4 = (*(*env)->ExceptionCheck)(env);
      if (bVar4 != 0) {
        return 0;
      }
      pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x12);
      if (pvVar13 == (void *)0x0) {
        return 0;
      }
      if (pvVar7 == (void *)0x0) {
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
LAB_7ffc3ea7f821:
          pJVar16 = *env;
          goto LAB_7ffc3ea7f827;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3ea7f821;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3ea7f821;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3ea7f807;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3ea7ffa1:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3ea7f81b;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3ea7f821;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3ea7f821;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3ea7ffa1;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3ea7f827;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3ea7f807;
            lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x16);
            if (lVar10 != 0) {
              FUN_7ffc3e7dbbc0(env,pvVar15,pvVar13,lVar10,pvVar14);
              bVar4 = (*(*env)->ExceptionCheck)(env);
              if (bVar4 == 0) {
                if (bRam00007ffc3ebc08e5 == 1) {
                  iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                }
                if (iVar6 < 3) goto LAB_7ffc3ea7ffa1;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x2f);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0xce);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3ea7f82a;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3ea7f807;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3ea7f712;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3ea7f821;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3ea7ff96;
        }
LAB_7ffc3ea7f712:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3ea7f807:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea7f81b:
              (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
            }
            else {
              lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x19);
              if (lVar10 != 0) {
                FUN_7ffc3e7dbbc0(env,pvVar15,pvVar13,lVar10,pvVar8);
                bVar4 = (*(*env)->ExceptionCheck)(env);
                if (bVar4 == 0) {
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                  }
                  if (iVar6 < 2) goto LAB_7ffc3ea7ffa1;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea7f807;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3ea7ffbe;
                    lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x1a);
                    if (lVar10 != 0) {
                      uVar12 = FUN_7ffc3e7d1a50(env,pvVar8,lVar10,pvVar15);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) {
                        if (bRam00007ffc3ebc08e5 == 1) {
                          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                        }
                        if (iVar6 < 1) goto LAB_7ffc3ea7ffa1;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3ea7ffbe:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3ea7f81b;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3ea7ffa1;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3ea7ffbe;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea7f807;
                            lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x1b);
                            if (lVar10 != 0) {
                              FUN_7ffc3e7e1940(env,pvVar8,lVar10,2,uVar12,pvVar7);
                              bVar4 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar4 == 0) &&
                                 (lVar10 = FUN_7ffc3eb76c90(env,pvVar13,0x1d), lVar10 != 0)) {
                                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,lVar10,pvVar9);
                                bVar4 = (*(*env)->ExceptionCheck)(env);
                                if (bVar4 == 0) {
                                  if (pvVar7 != (void *)0x0) {
                                    if (bRam00007ffc3ebc08e5 == 1) {
                                      iVar6 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                    }
                                    if (4 < iVar6) {
                                      if (bRam00007ffc3ebc08e5 == 1) {
                                        pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                           *(longlong *)
                                                            ((ulonglong)pvVar7 & 0xfffffffffffffffc)
                                                          + 4);
                                      }
                                      else {
                                        pbVar18 = abStack_50;
                                        (*(*env)->GetByteArrayRegion)(env,pvVar7,4,1,pbVar18);
                                      }
                                      bVar4 = *pbVar18;
                                      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                        iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                      }
                                      else {
                                        iVar6 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      if (5 < iVar6) {
                                        if (bRam00007ffc3ebc08e5 == 1) {
                                          pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                             *(longlong *)
                                                              ((ulonglong)pvVar7 &
                                                              0xfffffffffffffffc) + 5);
                                        }
                                        else {
                                          pbVar18 = abStack_50;
                                          (*(*env)->GetByteArrayRegion)(env,pvVar7,5,1,pbVar18);
                                        }
                                        bVar1 = *pbVar18;
                                        if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                        }
                                        else {
                                          iVar6 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar7 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        if (6 < iVar6) {
                                          if (bRam00007ffc3ebc08e5 == 1) {
                                            pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                               *(longlong *)
                                                                ((ulonglong)pvVar7 &
                                                                0xfffffffffffffffc) + 6);
                                          }
                                          else {
                                            pbVar18 = abStack_50;
                                            (*(*env)->GetByteArrayRegion)(env,pvVar7,6,1,pbVar18);
                                          }
                                          bVar2 = *pbVar18;
                                          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                          }
                                          else {
                                            iVar6 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar7 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          if (7 < iVar6) {
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                 *(longlong *)
                                                                  ((ulonglong)pvVar7 &
                                                                  0xfffffffffffffffc) + 7);
                                            }
                                            else {
                                              pbVar18 = abStack_50;
                                              (*(*env)->GetByteArrayRegion)(env,pvVar7,7,1,pbVar18);
                                            }
                                            bVar3 = *pbVar18;
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2f);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xcc);
                                            if (pvVar8 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar7 = (*(*env)->GetStaticObjectField)
                                                               (env,pvVar7,pvVar8);
                                            bVar5 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar5 != 0) {
                                              return 0;
                                            }
                                            lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                                            if (lVar10 == 0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,lVar10,
                                                  (uint)CONCAT11(bVar2,bVar3) |
                                                  (uint)bVar1 << 0x10 | (uint)bVar4 << 0x18);
                                            bVar4 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar4 != 0) {
                                              return 0;
                                            }
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3ea7ff82;
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              iVar6 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar7 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                            }
                                            if ((int)arg2 < iVar6) {
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar7,arg2,pvVar8);
                                              goto LAB_7ffc3ea7fe59;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3ea7ff68;
                                  }
                                  goto LAB_7ffc3ea7ff82;
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
          goto LAB_7ffc3ea7f821;
        }
LAB_7ffc3ea7f827:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3ea7f82a:
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
      if (bVar4 == 0) {
        return 0;
      }
      (*(*env)->ExceptionClear)(env);
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x16);
      if (pvVar8 == (void *)0x0) {
        return 0;
      }
      pvVar9 = (*(*env)->AllocObject)(env,pvVar8);
      bVar4 = (*(*env)->ExceptionCheck)(env);
      if (bVar4 != 0) {
        return 0;
      }
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb29c6);
      if (pvVar9 != (void *)0x0) {
        lVar10 = FUN_7ffc3eb76c90(env,pvVar8,0x18);
        if (lVar10 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(env,pvVar9,pvVar8,lVar10,pvVar13,pvVar7);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) {
          return 0;
        }
        (*(*env)->Throw)(env,pvVar9);
        return 0;
      }
    }
  }
LAB_7ffc3ea7ff82:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea7ff96:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_dev_krypton_9M_b_27 | RVA 0x2b0010 | dev/krypton/9M.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_9M_b_27
              (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,void *arg3)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  JNINativeInterface_ *pJVar7;
  undefined8 uVar8;
  longlong lVar9;
  void *pvVar10;
  ulonglong uVar11;
  char *arg2_00;
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3ea8052d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3ea80510;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3ea8053f:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea80157;
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
    if (lVar6 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg3);
    }
    if (iVar3 < 2) goto LAB_7ffc3ea80510;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea80150;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3ea8053f;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x2f);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x1e2);
    if (lVar9 == 0) {
      return 0;
    }
    iVar3 = FUN_7ffc3e7db1e0(env,lVar6,lVar9,uVar2,uVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
    if (pvVar5 == (void *)0x0) {
      return 0;
    }
    pvVar10 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
    if (lVar6 == 0) {
      return 0;
    }
    uVar11 = FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar6,iVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x20);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,pvVar10,uVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar10 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
      }
      if (0 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6);
        if (pvVar5 == (void *)0x0) {
          return 0;
        }
        pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
        }
        if (1 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
          lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
          if (lVar6 == 0) {
            return 0;
          }
          uVar8 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,uVar8,uVar11 & 0xffffffff00000000,
                                   pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (arg1 != (void *)0x0) {
            lVar6 = FUN_7ffc3eb76c30(env,0x18);
            if (lVar6 == 0) {
              return 0;
            }
            lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x22);
            if (lVar6 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(env,arg1,lVar6,uVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            return iVar3;
          }
          goto LAB_7ffc3ea8052d;
        }
      }
LAB_7ffc3ea80510:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea80157;
    }
LAB_7ffc3ea8052d:
    pJVar7 = *env;
  }
LAB_7ffc3ea80150:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea80157:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_dev_krypton_9M_b_28 | RVA 0x2b0560 | dev/krypton/9M.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_b_28
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  undefined8 uVar1;
  byte bVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *arg1_00;
  void *pvVar15;
  void *pvVar16;
  longlong lVar17;
  char *arg2_00;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x18);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea80e2b;
  lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0x23);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  pvVar8 = arg2;
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar7,arg2);
  uVar20 = (undefined4)((ulonglong)pvVar8 >> 0x20);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (_DAT_7ffc3ebc0c28 == (void *)0x0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09a0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvRam00007ffc3ebc0a90);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x18);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvRam00007ffc3ebc09e8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    uVar9 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc0928,
                             pvVar5);
    uVar1 = uRam00007ffc3ebc0a88;
    uVar13 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)pvVar5 >> 0x20);
    uVar10 = FUN_7ffc3eb76c30(env,0x2f);
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0c28 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0c28;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3ea80a93:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea80ac1:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea80a93;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea80a93;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (2 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,arg1);
                      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x26);
                      if (lVar7 != 0) {
                        uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,
                                                  uVar19 & 0xffffffff00000000,pvVar5);
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if ((bVar2 == 0) &&
                           (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27), lVar7 != 0)) {
                          uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,arg2,
                                                    pvVar5);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             ((lVar7 = FUN_7ffc3eb76c30(env,0x18), lVar7 != 0 &&
                              (lVar7 = FUN_7ffc3eb76c90(env,lVar7,0x22), lVar7 != 0)))) {
                            FUN_7ffc3e7e1940(env,pvVar6,lVar7,uVar13);
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if (bVar2 == 0) {
                              return pvVar6;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3ea80ac7;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3ea80ac1;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3ea80ac7:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar2 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar2 == 0) {
    return (void *)0x0;
  }
  (*(*env)->ExceptionClear)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (*(*env)->AllocObject)(env,pvVar6);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  arg1_00 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (arg1_00 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar15 = (*(*env)->AllocObject)(env,arg1_00);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar15 != (void *)0x0) {
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x28);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar15,arg1_00,lVar7);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb29c6);
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x29);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3e7d1a50(env,pvVar15,lVar7,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return (void *)0x0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,arg1);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          if (arg2 != (void *)0x0) {
            lVar17 = FUN_7ffc3eb76c30(env,0x19);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            lVar17 = FUN_7ffc3eb76c90(env,lVar17,0x2a);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            uVar13 = FUN_7ffc3e7d1a50(env,arg2,lVar17);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (lVar12 != 0) {
              lVar7 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,uVar13);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              if (lVar7 != 0) {
                lVar12 = FUN_7ffc3eb76c90(env,arg1_00,0x2b);
                if (lVar12 == 0) {
                  return (void *)0x0;
                }
                uVar13 = FUN_7ffc3e7d1a50(env,lVar7,lVar12);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (pvVar8 != (void *)0x0) {
                  lVar7 = FUN_7ffc3eb76c90(env,pvVar6,0x18);
                  if (lVar7 == 0) {
                    return (void *)0x0;
                  }
                  FUN_7ffc3e7dbbc0(env,pvVar8,pvVar6,lVar7,uVar13,pvVar5);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 != 0) {
                    return (void *)0x0;
                  }
                  (*(*env)->Throw)(env,pvVar8);
                  return (void *)0x0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3ea80e2b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_29 | RVA 0x2b0e50 | dev/krypton/9M.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_9M_a_29(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  JNINativeInterface_ **ppJVar1;
  byte bVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  void *pvVar7;
  uint *puVar8;
  JNINativeInterface_ *pJVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  longlong lVar12;
  uint arg2;
  char *pcVar13;
  undefined4 uVar14;
  uint uVar15;
  undefined8 uStack_98;
  int iStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_78;
  undefined4 uStack_74;
  longlong lStack_70;
  uint uStack_5c;
  JNINativeInterface_ **ppJStack_58;
  longlong *plStack_50;
  undefined8 uStack_48;
  
  uStack_78 = 0x30;
  uStack_80 = (void *)(arg1 << 0x30 | arg1);
  uVar11 = (ulonglong)uStack_80 ^ arg0;
  uStack_88 = (void *)CONCAT44(uStack_88._4_4_,0x2e);
  uVar15 = (uint)(uVar11 >> 0x20);
  uVar3 = uVar15 >> 0xe;
  uStack_98 = CONCAT44(uStack_98._4_4_,uVar3);
  lStack_70 = arg1;
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xcf);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3ea817a4:
    pJVar9 = *env;
    pcVar13 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (bRam00007ffc3ebc08e5 == 1) {
      iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
    }
    if ((int)uVar3 < iVar5) {
      pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,uVar3);
      uVar10 = uStack_98;
      if (pvVar6 != (void *)0x0) {
LAB_7ffc3ea80f64:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xd0);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea817a4;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
      }
      if ((int)uVar3 < iVar5) {
        ppJStack_58 = (*(*env)->GetObjectArrayElement)(env,pvVar6,uVar3);
        if ((ppJStack_58 != (JNINativeInterface_ **)0x0) &&
           (bVar2 = (*(*env)->IsInstanceOf)(env,ppJStack_58,pvRam00007ffc3ebc09e8), bVar2 != 0)) {
          uStack_48 = uStack_98;
          iVar5 = *(int *)(&UNK_7ffc3eb9a0c0 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
          pvVar6 = (*(*env)->NewIntArray)(env,6);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return 0;
          }
          plStack_50 = (longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc);
          uVar15 = 0;
          lVar12 = 0x23;
          do {
            uVar3 = ((uint)(uVar11 >> ((byte)lVar12 & 0x3f)) & 0x7f) - iVar5;
            uStack_80 = (void *)0x7f;
            uVar14 = (undefined4)((ulonglong)pvVar6 >> 0x20);
            uStack_88 = (void *)CONCAT44(uVar14,(uVar3 >> 0x18 & 0xffffff80) + uVar3);
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea8174e;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3ea81734;
            if (bRam00007ffc3ebc08e5 == 1) {
              *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar15 * 4) = (int)uStack_88;
            }
            else {
              (*(*env)->SetIntArrayRegion)(env,pvVar6,uVar15,1,(int *)&uStack_88);
            }
            ppJVar1 = ppJStack_58;
            uVar15 = uVar15 + 1;
            lVar12 = lVar12 + -7;
          } while (lVar12 != -7);
          bVar2 = (*(*env)->IsInstanceOf)(env,ppJStack_58,pvRam00007ffc3ebc09e8);
          if (bVar2 == 0) {
            pJVar9 = *env;
            pcVar13 = (char *)0x7ffc3eba6033;
            pvVar6 = pvRam00007ffc3ebc0a58;
          }
          else {
            if (ppJVar1 != (JNINativeInterface_ **)0x0) {
              lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x2d);
              if (lVar12 == 0) {
                return 0;
              }
              pvVar7 = (void *)FUN_7ffc3e7d1a50(env,ppJVar1);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return 0;
              }
              uStack_98._0_4_ = SUB84(pvVar7,0);
              uStack_98._4_4_ = (undefined4)((ulonglong)pvVar7 >> 0x20);
              if (pvVar7 != (void *)0x0) {
                uVar15 = 0;
                ppJStack_58 = env;
                bVar2 = bRam00007ffc3ebc08e5;
                do {
                  if ((bVar2 & 1) == 0) {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar7);
                  }
                  else {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  if (iVar5 <= (int)uVar15) {
LAB_7ffc3ea815ce:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2f);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xcf), uVar10 = uStack_48,
                       pvVar7 != (void *)0x0)) {
                      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 == 0) {
                        uStack_88 = (*(*env)->AllocObject)(env,pvRam00007ffc3ebc09e8);
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if (bVar2 == 0) {
                          uStack_80 = uStack_88;
                          uStack_78 = (undefined4)uStack_98;
                          uStack_74 = uStack_98._4_4_;
                          if (uStack_88 != (void *)0x0) {
                            lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x2e);
                            if (lVar12 == 0) {
                              return 0;
                            }
                            FUN_7ffc3e7dbbc0(env,uStack_80,pvRam00007ffc3ebc09e8,lVar12,
                                             CONCAT44(uStack_74,uStack_78));
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if (bVar2 != 0) {
                              return 0;
                            }
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea817a4;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3ea8176f;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3ea80f64;
                          }
                          break;
                        }
                      }
                    }
                    return 0;
                  }
                  if (bRam00007ffc3ebc08e5 == 0) {
                    uStack_88 = pvVar6;
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                    uStack_88 = (void *)CONCAT44(uStack_88._4_4_,iVar5);
                    uVar3 = 0;
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3ea8137d;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3ea8137d:
                    uVar3 = (int)uVar15 % iVar5;
                  }
                  if (pvVar6 == (void *)0x0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                  }
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3ea81734;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3ea815ce;
                  uStack_80 = (void *)CONCAT44(uStack_98._4_4_,uVar15);
                  uStack_88 = pvVar7;
                  if (pvVar7 == (void *)0x0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                    arg2 = uVar15;
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar7);
                    arg2 = (uint)uStack_80;
                  }
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3ea81734;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)arg2 * 2 +
                                     *(longlong *)((ulonglong)uStack_88 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetCharArrayRegion)(env,uStack_88,arg2,1,(ushort *)puVar8);
                  }
                  env = ppJStack_58;
                  uStack_80 = (void *)CONCAT44(uVar14,uVar3);
                  uStack_88 = (void *)CONCAT44(uStack_88._4_4_,
                                               uVar3 & 0xffff ^ (uint)(ushort)*puVar8);
                  if (pvVar7 == (void *)0x0) {
                    pJVar9 = *ppJStack_58;
                    pcVar13 = &DAT_7ffc3eba6000;
                    pvVar6 = pvRam00007ffc3ebc0a70;
                    goto LAB_7ffc3ea81765;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3ea81734;
                  uStack_5c._0_2_ = (undefined2)uStack_88;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    *(undefined2 *)
                     (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar15 * 2) =
                         (undefined2)uStack_88;
                  }
                  else {
                    (*(*env)->SetCharArrayRegion)(env,pvVar7,uVar15,1,(ushort *)&uStack_5c);
                    bVar2 = bRam00007ffc3ebc08e5;
                  }
                  uVar15 = uVar15 + 1;
                } while (pvVar7 != (void *)0x0);
              }
            }
LAB_7ffc3ea8174e:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3ea81765;
        }
        goto LAB_7ffc3ea80f64;
      }
    }
LAB_7ffc3ea8176f:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3ea81734:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3ea81765:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_9M_a_30 | RVA 0x2b17f0 | dev/krypton/9M.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_9M_a_30(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  void *pvVar5;
  void *pvVar6;
  void *pvVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xd0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2a98);
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3ea85e02:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (0 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
      if (pvVar5 == (void *)0x0) {
        return;
      }
      pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xcf);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea85e02;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
          pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2ab1);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (2 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2ac9);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (3 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2ad7);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (4 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2ae6);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (5 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2af5);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (6 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b04);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (7 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b17);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                      }
                      if (8 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a08,0xd);
                        if (pvVar6 == (void *)0x0) {
                          return;
                        }
                        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a08,pvVar6);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return;
                        }
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                        }
                        if (9 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,9,pvVar6);
                          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
                          if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea85e02;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (9 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,9,pvVar7);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b28);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (10 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b37);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                              }
                              if (0xb < iVar2) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar4,0xb,pvVar6);
                                pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0960,0xc);
                                if (pvVar6 == (void *)0x0) {
                                  return;
                                }
                                pvVar6 = (*(*env)->GetStaticObjectField)
                                                   (env,pvRam00007ffc3ebc0960,pvVar6);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  return;
                                }
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar2 = *(int *)(*(longlong *)
                                                    ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                }
                                if (0xc < iVar2) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0xc,pvVar6);
                                  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65aa);
                                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea85e02;
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar2 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                  }
                                  if (0xc < iVar2) {
                                    (*(*env)->SetObjectArrayElement)(env,pvVar6,0xc,pvVar7);
                                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b4b);
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar2 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                    }
                                    if (0xd < iVar2) {
                                      (*(*env)->SetObjectArrayElement)(env,pvVar4,0xd,pvVar6);
                                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b5a);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                      }
                                      if (0xe < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0xe,pvVar6);
                                        pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb2b6f)
                                        ;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                        }
                                        if (0xf < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0xf,pvVar6);
                                          pvVar6 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3ebb2b80);
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar2 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar4 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                          }
                                          if (0x10 < iVar2) {
                                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0x10,pvVar6)
                                            ;
                                            pvVar6 = (void *)FUN_7ffc3eb76ce0(env,
                                                  pvRam00007ffc3ebc09d8,0x2c);
                                            if (pvVar6 == (void *)0x0) {
                                              return;
                                            }
                                            pvVar6 = (*(*env)->GetStaticObjectField)
                                                               (env,pvRam00007ffc3ebc09d8,pvVar6);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) {
                                              return;
                                            }
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar2 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar4 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                            }
                                            if (0x11 < iVar2) {
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar4,0x11,pvVar6);
                                              pvVar6 = (*(*env)->GetStaticObjectField)
                                                                 (env,pvVar3,pvVar5);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) {
                                                return;
                                              }
                                              pvVar7 = (*(*env)->NewStringUTF)
                                                                 (env,(char *)0x7ffc3eba8664);
                                              if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea85e02;
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar6 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                              }
                                              if (0x11 < iVar2) {
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar6,0x11,pvVar7);
                                                pvVar6 = (*(*env)->NewStringUTF)
                                                                   (env,(char *)0x7ffc3ebb2b94);
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar4 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                }
                                                if (0x12 < iVar2) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0x12,pvVar6);
                                                  pvVar6 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3ebb2ba8);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x13 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x13,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2bb7);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x14 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x14,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2bc6
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x15 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x15,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2bdc);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x16 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x16,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2bf4);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x17 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x17,pvVar6);
                                                      pvVar6 = (void *)FUN_7ffc3eb76ce0(env,
                                                  pvRam00007ffc3ebc09a8,0x2d);
                                                  if (pvVar6 == (void *)0x0) {
                                                    return;
                                                  }
                                                  pvVar6 = (*(*env)->GetStaticObjectField)
                                                                     (env,pvRam00007ffc3ebc09a8,
                                                                      pvVar6);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) {
                                                    return;
                                                  }
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x18 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x18,pvVar6);
                                                    pvVar6 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar3,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 != 0) {
                                                      return;
                                                    }
                                                    pvVar7 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3eba8db1);
                                                    if (pvVar6 == (void *)0x0)
                                                    goto LAB_7ffc3ea85e02;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar6 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                                    }
                                                    if (0x18 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar6,0x18,pvVar7);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2c0c
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x19 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x19,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2c1b);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x1a < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1a,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2c2a);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x1b < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1b,pvVar6);
                                                      pvVar6 = (void *)FUN_7ffc3eb76ce0(env,
                                                  pvRam00007ffc3ebc0958,6);
                                                  if (pvVar6 == (void *)0x0) {
                                                    return;
                                                  }
                                                  pvVar6 = (*(*env)->GetStaticObjectField)
                                                                     (env,pvRam00007ffc3ebc0958,
                                                                      pvVar6);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) {
                                                    return;
                                                  }
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x1c < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1c,pvVar6);
                                                    pvVar3 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar3,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 != 0) {
                                                      return;
                                                    }
                                                    pvVar5 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3eba6786);
                                                    if (pvVar3 == (void *)0x0)
                                                    goto LAB_7ffc3ea85e02;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar3 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                                                    }
                                                    if (0x1c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar3,0x1c,pvVar5);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2c3e
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x1d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1d,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2c52);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x1e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1e,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2c66);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x1f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1f,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2c7e
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x20 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x20,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2c8d);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x21 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x21,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2ca1);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x22 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x22,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2cb5
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x23 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x23,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2cc9);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x24 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x24,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2cd8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x25 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x25,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2cec
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x26 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x26,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2d00);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x27 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x27,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2d14);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x28 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x28,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2d23
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x29 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x29,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2d35);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x2a < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2a,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2d4f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x2b < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2b,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2d6a
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x2c < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2c,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2d7e);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x2d < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2d,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2d8d);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x2e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2e,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2da1
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x2f < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2f,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2da4);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x30 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x30,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2db8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x31 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x31,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2dcc
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x32 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x32,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2de0);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x33 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x33,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2df4);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x34 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x34,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2e04
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x35 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x35,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2e18);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x36 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x36,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2e2c);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x37 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x37,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2e3b
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x38 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x38,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2e4f);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x39 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x39,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2e7a);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x3a < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x3a,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2e89
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x3b < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x3b,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2e9d);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x3c < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x3c,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2eb1);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x3d < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x3d,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2eb4
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x3e < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x3e,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2ec3);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x3f < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x3f,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2ed8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x40 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x40,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2eec
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x41 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x41,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2f01);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x42 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x42,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2f15);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x43 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x43,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2f29
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x44 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x44,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2f3f);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x45 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x45,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2f53);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x46 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x46,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2f67
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x47 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x47,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2f7b);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x48 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x48,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2f8f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x49 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x49,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2fa3
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x4a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x4a,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2fb7);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x4b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x4b,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2fcc);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x4c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x4c,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2fe2
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x4d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x4d,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3007);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x4e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x4e,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb302d);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x4f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x4f,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3052
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x50 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x50,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3078);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x51 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x51,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb30c7);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x52 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x52,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb30e3
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x53 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x53,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb30fa);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x54 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x54,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3113);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x55 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x55,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb313a
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x56 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x56,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3153);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x57 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x57,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3177);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x58 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x58,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3198
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x59 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x59,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb31c6);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x5a < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x5a,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb31ec);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x5b < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x5b,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb320e
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x5c < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x5c,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3234);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x5d < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x5d,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3259);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x5e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x5e,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb327f
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x5f < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x5f,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb32a5);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x60 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x60,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb32ca);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x61 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x61,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb32eb
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x62 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x62,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3310);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (99 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,99,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3333);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (100 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,100,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3355
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x65 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x65,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb337b);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x66 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x66,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb33a0);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x67 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x67,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb33b8
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x68 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x68,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb33dd);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x69 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x69,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb33f5);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x6a < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x6a,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3416
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x6b < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x6b,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb343d);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x6c < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x6c,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb346c);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x6d < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x6d,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3491
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x6e < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x6e,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb34b6);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x6f < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x6f,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb34db);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x70 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x70,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3501
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x71 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x71,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3519);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x72 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x72,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb353d);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x73 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x73,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3562
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x74 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x74,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb357a);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x75 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x75,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb35a0);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x76 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x76,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb35c5
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x77 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x77,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb35eb);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x78 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x78,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3610);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x79 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x79,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3636
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x7a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x7a,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb365a);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x7b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x7b,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3681);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x7c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x7c,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb369e
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x7d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x7d,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb36bc);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x7e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x7e,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb36e2);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x7f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x7f,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3708
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x80 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x80,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3720);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x81 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x81,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3738);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x82 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x82,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb375d
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x83 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x83,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3784);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x84 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x84,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb37ad);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x85 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x85,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb37d3
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x86 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x86,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb37eb);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x87 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x87,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3804);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x88 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x88,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3824
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x89 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x89,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3845);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x8a < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x8a,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb385e);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x8b < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x8b,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3884
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x8c < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x8c,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb389d);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x8d < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x8d,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb38bc);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x8e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x8e,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb38d5
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x8f < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x8f,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb38f8);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x90 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x90,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb391f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x91 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x91,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3945
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x92 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x92,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb396b);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x93 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x93,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3990);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x94 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x94,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb39b7
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x95 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x95,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb39cf);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x96 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x96,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb39e8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x97 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x97,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb3a09
                                                                         );
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar2 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (0x98 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x98,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb3a2a);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar4 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                  }
                                                  if (0x99 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x99,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb3a4f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (0x9a < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea85dbd. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x9a,pvVar3);
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
            }
          }
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea85dee. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_9M_b_31 | RVA 0x2b5e20 | dev/krypton/9M.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_b_31(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  byte bVar1;
  int arg2;
  int iVar2;
  void *pvVar3;
  longlong lVar4;
  void *pvVar5;
  void *pvVar6;
  JNINativeInterface_ *pJVar7;
  undefined8 uVar8;
  char *pcVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0x1e3);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xd0);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar3 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
    }
    if ((arg2 < 0) || (iVar2 <= arg2)) {
      pJVar7 = *env;
      pcVar9 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea862c6;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,arg2);
    if (pvVar3 == (void *)0x0) {
      return (void *)0x0;
    }
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09e8);
    if (bVar1 == 0) {
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09a0);
      if (bVar1 != 0) {
        return pvVar3;
      }
      pJVar7 = *env;
      pcVar9 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea862c6;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2f);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3ea8618a:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xcf);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3ea86170:
            pJVar7 = *env;
            pcVar9 = &DAT_7ffc3eba6000;
            pvVar3 = pvRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
            }
            if (arg2 < iVar2) {
              pvVar5 = (*(*env)->GetObjectArrayElement)(env,pvVar5,arg2);
              lVar4 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x30);
              if (lVar4 != 0) {
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc09a0,lVar4,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xd0);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea8616a;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3ea86170;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                    }
                    if (arg2 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar3,arg2,pvVar5);
                      return pvVar5;
                    }
                    goto LAB_7ffc3ea86150;
                  }
                }
              }
              goto LAB_7ffc3ea8618a;
            }
LAB_7ffc3ea86150:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3ea8618a;
      }
LAB_7ffc3ea8616a:
      pvVar3 = (*pJVar7->ExceptionOccurred)(env);
    }
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar5);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    (*(*env)->ExceptionClear)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x16);
    if (pvVar5 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar3 != (void *)0x0) {
      lVar4 = FUN_7ffc3eb76c30(env,8);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x31);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      uVar8 = FUN_7ffc3e7d1a50(env,pvVar3,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar6 != (void *)0x0) {
        lVar4 = FUN_7ffc3eb76c90(env,pvVar5,0x32);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar4,uVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        (*(*env)->Throw)(env,pvVar6);
        return (void *)0x0;
      }
    }
  }
  pJVar7 = *env;
  pcVar9 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea862c6:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_32 | RVA 0x2b62e0 | dev/krypton/9M.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_32
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  void *arg1_00;
  void *pvVar5;
  longlong lVar6;
  longlong lVar7;
  void *arg1_01;
  int arg2_00;
  undefined8 *puVar8;
  char *pcStack_50;
  
  pcStack_50 = &DAT_7ffc3eba6000;
  puVar8 = (undefined8 *)0x7ffc3ebc0a70;
  if (arg0 != (void *)0x0) {
    lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x33);
    if (lVar4 == 0) {
      return (void *)0x0;
    }
    arg1_00 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (arg1_00 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg1_00);
      }
      if (iVar2 < 1) {
        return (void *)0x0;
      }
      pcStack_50 = (char *)0x7ffc3eba6019;
      arg2_00 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,arg1_00);
        }
        if (iVar3 <= arg2_00) break;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg1_00,arg2_00);
        if (pvVar5 == (void *)0x0) {
LAB_7ffc3ea86541:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3ea8655d;
        }
        lVar4 = FUN_7ffc3eb76c30(env,0x1b);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x34);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3e7d1a50(env,pvVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (lVar6 == 0) goto LAB_7ffc3ea86541;
        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x35);
        if (lVar7 == 0) {
          return (void *)0x0;
        }
        iVar3 = FUN_7ffc3e7d8be0(env,lVar6,lVar7,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (iVar3 != 0) {
          lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x36);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          arg1_01 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,lVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          bVar1 = (*(*env)->IsSameObject)(env,arg1_01,arg2);
          if (bVar1 != 0) {
            return pvVar5;
          }
        }
        arg2_00 = arg2_00 + 1;
        if (iVar2 == arg2_00) {
          return (void *)0x0;
        }
      }
      puVar8 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3ea8655d:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_b_33 | RVA 0x2b6590 | dev/krypton/9M.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_b_33
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  void *pvVar5;
  void *pvVar6;
  undefined8 *puVar7;
  int arg2_00;
  char *pcStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x2f);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1e4), lVar4 != 0)) {
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,arg0,arg1,arg2);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar5 != (void *)0x0) {
        return pvVar5;
      }
      if (arg0 == (void *)0x0) {
        pcStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return (void *)0x0;
        }
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (pvVar5 == (void *)0x0) {
          return (void *)0x0;
        }
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pcStack_48 = (char *)0x7ffc3eba6019;
        arg2_00 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) break;
          pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,arg2_00);
          lVar3 = FUN_7ffc3eb76c30(env,0x2f);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1e5);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,pvVar6,arg1,arg2);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          arg2_00 = arg2_00 + 1;
          if (pvVar6 != (void *)0x0) {
            return pvVar6;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (*(*env)->ThrowNew)(env,(void *)*puVar7,pcStack_48);
    }
  }
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_c_34 | RVA 0x2b67c0 | dev/krypton/9M.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_c_34(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  byte bVar1;
  int arg2;
  int iVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  undefined8 uVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  longlong lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *pvVar15;
  void *arg1_00;
  char *arg2_00;
  undefined4 uVar16;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x1e3);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xd0);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea874f0;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3ea874d6;
  pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,arg2);
  if (pvVar6 == (void *)0x0) {
    FUN_7ffc3eb76c30(env,0x1b);
    return (void *)0x0;
  }
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc09e8);
  if (bVar1 == 0) {
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x1b);
    if (pvVar4 == (void *)0x0) {
      return (void *)0x0;
    }
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar4);
    if (bVar1 != 0) {
      return pvVar6;
    }
    pJVar14 = *env;
    arg2_00 = (char *)0x7ffc3eba6033;
    pvVar4 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3ea87504;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xcf);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
    }
    if (iVar2 <= arg2) {
LAB_7ffc3ea874d6:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea87504;
    }
    pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,arg2);
    if (pvVar6 != (void *)0x0) {
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3a);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      iVar2 = FUN_7ffc3e7d8be0(env,pvVar6,lVar5,8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3b);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar13 = CONCAT44(uVar16,iVar2);
      uVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5,0,uVar13);
      uVar16 = (undefined4)((ulonglong)uVar13 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0x3c);
      if (lVar8 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar8,uVar7,CONCAT44(uVar16,0x24));
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x1e6);
      if (lVar9 == 0) {
        return (void *)0x0;
      }
      uVar16 = 0;
      lVar10 = FUN_7ffc3e7d1a80(env,pvVar4,lVar9,uVar7,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
      if (lVar11 == 0) {
        return (void *)0x0;
      }
      uVar7 = CONCAT44(uVar16,iVar2 + 1);
      iVar3 = FUN_7ffc3e7d8be0(env,pvVar6,lVar11,8,uVar7);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar13 = CONCAT44(uVar16,iVar3);
      uVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5,iVar2 + 1,uVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3f);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar12 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5,iVar3 + 1,uVar13);
      uVar16 = (undefined4)((ulonglong)uVar13 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar13 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar8,uVar12,CONCAT44(uVar16,0x24));
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar5 = FUN_7ffc3e7d1a80(env,pvVar4,lVar9,uVar13,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2f);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x1e4);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3ea874f0;
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x38);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,lVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar4 != (void *)0x0) {
          iVar2 = 0;
          while( true ) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (iVar3 <= iVar2) break;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (iVar3 <= iVar2) goto LAB_7ffc3ea874d6;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x2f);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0x1e5);
            if (lVar9 == 0) {
              return (void *)0x0;
            }
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar15,lVar9,pvVar6,uVar7,lVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            iVar2 = iVar2 + 1;
            if (pvVar6 != (void *)0x0) {
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0xd0);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3ea874f0;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3ea874d6;
              pJVar14 = *env;
              goto LAB_7ffc3ea870b7;
            }
          }
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x40);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3e7d1a50(env,lVar8,lVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7131);
        if (lVar9 == 0) goto LAB_7ffc3ea874f0;
        lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x35);
        if (lVar11 == 0) {
          return (void *)0x0;
        }
        iVar2 = FUN_7ffc3e7d8be0(env,lVar9,lVar11,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (iVar2 != 0) {
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x1c);
          if (pvVar4 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar6 = (*(*env)->AllocObject)(env,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar6 != (void *)0x0) {
            lVar8 = FUN_7ffc3eb76c90(env,pvVar4,0x42);
            if (lVar8 == 0) {
              return (void *)0x0;
            }
            FUN_7ffc3e7dbbc0(env,pvVar6,pvVar4,lVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7142);
            lVar8 = FUN_7ffc3eb76c90(env,pvVar4,0x43);
            if (lVar8 == 0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3e7d1a50(env,pvVar6,lVar8,pvVar15);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (lVar10 != 0) {
              lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x40);
              if (lVar11 == 0) {
                return (void *)0x0;
              }
              uVar13 = FUN_7ffc3e7d1a50(env,lVar10,lVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (lVar9 != 0) {
                lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar8,uVar13);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (lVar9 != 0) {
                  lVar10 = FUN_7ffc3eb76c90(env,pvVar4,0x44);
                  if (lVar10 == 0) {
                    return (void *)0x0;
                  }
                  lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (lVar5 != 0) {
                    uVar13 = FUN_7ffc3e7d1a50(env,lVar5,lVar11);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (lVar9 != 0) {
                      lVar5 = FUN_7ffc3e7d1a50(env,lVar9,lVar8,uVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (lVar5 != 0) {
                        lVar5 = FUN_7ffc3e7d1a50(env,lVar5,lVar10,0x20);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        if (lVar5 != 0) {
                          FUN_7ffc3e7d1a50(env,lVar5,lVar8,uVar7);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x16);
                          if (pvVar15 == (void *)0x0) {
                            return (void *)0x0;
                          }
                          arg1_00 = (*(*env)->AllocObject)(env,pvVar15);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x45);
                          if (lVar5 == 0) {
                            return (void *)0x0;
                          }
                          uVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar5);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          if (arg1_00 != (void *)0x0) {
                            lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x32);
                            if (lVar5 == 0) {
                              return (void *)0x0;
                            }
                            FUN_7ffc3e7dbbc0(env,arg1_00,pvVar15,lVar5,uVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            (*(*env)->Throw)(env,arg1_00);
                            return (void *)0x0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3ea874f0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x41);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        lVar8 = FUN_7ffc3e7d1a50(env,lVar8,lVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (lVar8 == 0) {
          lVar8 = FUN_7ffc3eb76c30(env,0x2f);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1e6);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x217ca06b2c8e3,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x2f);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xd0);
      if (pvVar15 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar4 != (void *)0x0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (arg2 < iVar2) {
          pJVar14 = *env;
LAB_7ffc3ea870b7:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3ea874d6;
      }
    }
  }
LAB_7ffc3ea874f0:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea87504:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_35 | RVA 0x2b7510 | dev/krypton/9M.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_35
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,int arg3
                 ,void *arg4)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  void *arg1_00;
  void *pvVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  void *arg1_01;
  void *arg2_00;
  undefined8 *puVar10;
  int arg2_01;
  char *pcStack_68;
  
  pcStack_68 = &DAT_7ffc3eba6000;
  puVar10 = (undefined8 *)0x7ffc3ebc0a70;
  if (arg0 != (void *)0x0) {
    lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x46);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    arg1_00 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (arg1_00 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg1_00);
      }
      if (iVar2 < 1) {
        return (void *)0x0;
      }
      pcStack_68 = (char *)0x7ffc3eba6019;
      arg2_01 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)arg1_00 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,arg1_00);
        }
        if (iVar3 <= arg2_01) break;
        pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg1_00,arg2_01);
        if (pvVar6 == (void *)0x0) {
LAB_7ffc3ea8793a:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3ea87948;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x1d);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x47);
        if (lVar7 == 0) {
          return (void *)0x0;
        }
        lVar7 = FUN_7ffc3e7d1a50(env,pvVar6,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (lVar7 == 0) goto LAB_7ffc3ea8793a;
        lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x35);
        if (lVar8 == 0) {
          return (void *)0x0;
        }
        iVar3 = FUN_7ffc3e7d8be0(env,lVar7,lVar8,arg1);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (iVar3 != 0) {
          lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x48);
          if (lVar7 == 0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,lVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          bVar1 = (*(*env)->IsSameObject)(env,pvVar9,arg2);
          if (bVar1 != 0) {
            lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x49);
            if (lVar5 == 0) {
              return (void *)0x0;
            }
            pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,lVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea8793a;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
            }
            if (iVar3 == arg3) {
              if (arg3 < 1) {
                return pvVar6;
              }
              iVar3 = 0;
              while( true ) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3ea8792c;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3ea8793a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3ea8792c;
                arg2_00 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3);
                bVar1 = (*(*env)->IsSameObject)(env,arg1_01,arg2_00);
                if (bVar1 == 0) break;
                iVar3 = iVar3 + 1;
                if (arg3 == iVar3) {
                  return pvVar6;
                }
              }
            }
          }
        }
        arg2_01 = arg2_01 + 1;
        if (arg2_01 == iVar2) {
          return (void *)0x0;
        }
      }
LAB_7ffc3ea8792c:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3ea87948:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_b_36 | RVA 0x2b7970 | dev/krypton/9M.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_b_36
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,int arg3
                 ,void *arg4)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  void *pvVar5;
  void *pvVar6;
  undefined8 *puVar7;
  int arg2_00;
  char *pcStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x2f);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1e7), lVar4 != 0)) {
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,arg0,arg1,arg2,arg3,arg4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar5 != (void *)0x0) {
        return pvVar5;
      }
      if (arg0 == (void *)0x0) {
        pcStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return (void *)0x0;
        }
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,arg0,lVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (pvVar5 == (void *)0x0) {
          return (void *)0x0;
        }
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pcStack_48 = (char *)0x7ffc3eba6019;
        arg2_00 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (iVar2 <= arg2_00) break;
          pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,arg2_00);
          lVar3 = FUN_7ffc3eb76c30(env,0x2f);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1e8);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar3,lVar4,pvVar6,arg1,arg2,arg3,arg4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          arg2_00 = arg2_00 + 1;
          if (pvVar6 != (void *)0x0) {
            return pvVar6;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (*(*env)->ThrowNew)(env,(void *)*puVar7,pcStack_48);
    }
  }
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_d_37 | RVA 0x2b7be0 | dev/krypton/9M.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_d_37(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  void *arg3;
  void *pvVar13;
  longlong lVar14;
  void *pvVar15;
  JNINativeInterface_ *pJVar16;
  uint arg2;
  uint uVar17;
  int iVar18;
  char *arg2_00;
  undefined4 uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x2f);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x1e3);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xd0);
  if (pvVar7 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar5,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar7 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
    }
    if ((iVar2 < 0) || (iVar3 <= iVar2)) {
LAB_7ffc3ea88e27:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea88e3f;
    }
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,iVar2);
    if (pvVar7 == (void *)0x0) {
      FUN_7ffc3eb76c30(env,0x1d);
      return (void *)0x0;
    }
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc09e8);
    if (bVar1 == 0) {
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x1d);
      if (pvVar5 == (void *)0x0) {
        return (void *)0x0;
      }
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar5);
      if (bVar1 != 0) {
        return pvVar7;
      }
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea88e3f;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xcf);
    if (pvVar7 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar7 = (*(*env)->GetStaticObjectField)(env,pvVar5,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar7 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
      }
      if (iVar3 <= iVar2) goto LAB_7ffc3ea88e27;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,iVar2);
      if (pvVar7 != (void *)0x0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3a);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        iVar3 = FUN_7ffc3e7d8be0(env,pvVar7,lVar6,8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3b);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar11 = CONCAT44(uVar19,iVar3);
        uVar8 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6,0,uVar11);
        uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0x3c);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar8 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar9,uVar8,CONCAT44(uVar19,0x24));
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x1e6);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar19 = 0;
        lVar9 = FUN_7ffc3e7d1a80(env,pvVar5,lVar9,uVar8,0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        uVar8 = CONCAT44(uVar19,iVar3 + 1);
        iVar4 = FUN_7ffc3e7d8be0(env,pvVar7,lVar10,8,uVar8);
        uVar19 = (undefined4)((ulonglong)uVar8 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar11 = CONCAT44(uVar19,iVar4);
        uVar8 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6,iVar3 + 1,uVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar17 = 0;
        iVar3 = iVar4;
        do {
          uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          uVar11 = CONCAT44(uVar19,iVar3 + 1);
          iVar3 = FUN_7ffc3e7d8be0(env,pvVar7,lVar6,8,uVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar17 = uVar17 - 1;
        } while (-1 < iVar3);
        iVar3 = -2 - uVar17;
        pJVar16 = *env;
        if (-1 < iVar3) {
          pvVar5 = (*pJVar16->NewObjectArray)(env,iVar3,pvRam00007ffc3ebc09a0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          arg2 = 0;
          do {
            uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
            lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3e);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            iVar18 = iVar4 + 1;
            uVar11 = CONCAT44(uVar19,iVar18);
            iVar4 = FUN_7ffc3e7d8be0(env,pvVar7,lVar6,8,uVar11);
            uVar19 = (undefined4)((ulonglong)uVar11 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x3b);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            uVar12 = CONCAT44(uVar19,iVar4);
            uVar11 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6,iVar18,uVar12);
            uVar19 = (undefined4)((ulonglong)uVar12 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0x3c);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            uVar12 = FUN_7ffc3e7deca0(env,uRam00007ffc3ebc0958,lVar6,uVar11,CONCAT44(uVar19,0x24));
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar6 = FUN_7ffc3eb76c30(env,0x2f);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x1e6);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            uVar11 = 0;
            arg3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar10,uVar12,0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if ((int)arg2 < iVar3) {
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea88e11;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3ea88e27;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3ea88290:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2f);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x1e7);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xd0);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3ea88811:
            pvVar5 = (*pJVar16->GetStaticObjectField)(env,pvVar7,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar5 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar2 < iVar3) {
                (*(*env)->SetObjectArrayElement)(env,pvVar5,iVar2,pvVar13);
                return pvVar13;
              }
              goto LAB_7ffc3ea88e27;
            }
            goto LAB_7ffc3ea88e11;
          }
          if (lVar6 != 0) {
            lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3e7d1a50(env,lVar6,lVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7131);
            if (lVar10 != 0) {
              lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x35);
              if (lVar14 == 0) {
                return (void *)0x0;
              }
              iVar4 = FUN_7ffc3e7d8be0(env,lVar10,lVar14,pvVar7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              lVar10 = lVar9;
              if (iVar4 == 0) goto code_r0x7ffc3ea883ce;
              goto joined_r0x7ffc3ea88491;
            }
          }
          goto LAB_7ffc3ea88e11;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3ea88e3f;
      }
    }
  }
  goto LAB_7ffc3ea88e11;
code_r0x7ffc3ea883ce:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3ea8841c;
  goto LAB_7ffc3ea88290;
code_r0x7ffc3ea8841c:
  lVar6 = FUN_7ffc3eb76c30(env,0x2f);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0x1e6);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x217ca06b2c8e3,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3ea88491:
  do {
    if (lVar10 == 0) goto LAB_7ffc3ea88e11;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x38);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar10,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar15 != (void *)0x0) {
      iVar4 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar18 = (*(*env)->GetArrayLength)(env,pvVar15);
        }
        if (iVar18 <= iVar4) break;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar18 = (*(*env)->GetArrayLength)(env,pvVar15);
        }
        if (iVar18 <= iVar4) goto LAB_7ffc3ea88e27;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x2f);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x1e8);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar6,pvVar13,uVar8,arg3,iVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        iVar4 = iVar4 + 1;
        if (pvVar13 != (void *)0x0) {
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xd0);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3ea88811;
        }
      }
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3e7d1a50(env,lVar10,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7131);
    if (lVar6 == 0) goto LAB_7ffc3ea88e11;
    lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e8,0x35);
    if (lVar14 == 0) {
      return (void *)0x0;
    }
    iVar4 = FUN_7ffc3e7d8be0(env,lVar6,lVar14,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (iVar4 != 0) {
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x1c);
      if (pvVar7 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar13 = (*(*env)->AllocObject)(env,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3ea88e11;
      lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x42);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      FUN_7ffc3e7dbbc0(env,pvVar13,pvVar7,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba715b);
      lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x43);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a50(env,pvVar13,lVar6,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
      if (lVar14 == 0) {
        return (void *)0x0;
      }
      uVar11 = FUN_7ffc3e7d1a50(env,lVar9,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar10 == 0) goto LAB_7ffc3ea88e11;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3ea88e11;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3ea88e11;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3ea88e11;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3ea88e11;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3ea88e11;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3ea88e11;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3ea88b68;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea88e11;
      iVar2 = 1;
      if (1 < iVar3) {
        iVar2 = iVar3;
      }
      iVar4 = 0;
      break;
    }
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    lVar10 = FUN_7ffc3e7d1a50(env,lVar10,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (lVar10 == 0) {
      lVar6 = FUN_7ffc3eb76c30(env,0x2f);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x1e6);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x217ca06b2c8e3,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3ea88e11;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    uVar8 = FUN_7ffc3e7d1a50(env,pvVar7,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x1c);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x43);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7d1a50(env,pvVar13,lVar6,uVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    iVar4 = iVar4 + 1;
    if (iVar4 < iVar3) {
      pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7175);
      FUN_7ffc3e7d1a50(env,pvVar13,lVar6,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
    if (iVar2 == iVar4) break;
    if (cRam00007ffc3ebc08e5 == '\0') {
      iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
    }
    else {
      iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    if (iVar18 <= iVar4) goto LAB_7ffc3ea88e27;
  }
LAB_7ffc3ea88b68:
  lVar6 = FUN_7ffc3eb76c30(env,0x1c);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x44);
  if (lVar9 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a50(env,pvVar13,lVar9,0x29);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar7 = (*(*env)->AllocObject)(env,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x45);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  uVar8 = FUN_7ffc3e7d1a50(env,pvVar13,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar7 != (void *)0x0) {
    lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x32);
    if (lVar6 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar7,pvVar5,lVar6,uVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    (*(*env)->Throw)(env,pvVar7);
    return (void *)0x0;
  }
LAB_7ffc3ea88e11:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea88e3f:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_38 | RVA 0x2b8e70 | dev/krypton/9M.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_38
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                 void *arg3,longlong arg4,longlong arg5)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  JNINativeInterface_ *pJVar10;
  void *pvVar11;
  longlong lVar12;
  longlong lVar13;
  void *pvVar14;
  void *pvVar15;
  char *arg2_00;
  undefined4 uVar16;
  longlong lStack_50;
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3ea89c02;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (iVar2 < 0xaa) {
    if ((iVar2 != 0x56) && (iVar2 != 0x76)) goto LAB_7ffc3ea8909a;
LAB_7ffc3ea88f1c:
    lVar4 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x1e9), lVar5 == 0))
    goto LAB_7ffc3ea8961a;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3ea8961a;
    if (lVar4 == 0) goto LAB_7ffc3ea89679;
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar5 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x4e), lVar12 != 0)) {
      uVar6 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x34), lVar12 == 0))
      goto LAB_7ffc3ea89693;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x36), lVar5 == 0))
      goto LAB_7ffc3ea89693;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3ea89693;
      if (iVar2 == 0xdc) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3ea89679;
        uVar9 = 0x50;
      }
      else if (iVar2 == 0x76) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3ea89679;
        uVar9 = 0x51;
      }
      else if (iVar2 == 0x56) {
        if (arg0 == (void *)0x0) {
LAB_7ffc3ea89679:
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          goto LAB_7ffc3ea89693;
        }
        uVar9 = 0x4f;
      }
      else {
        if (arg0 == (void *)0x0) goto LAB_7ffc3ea89679;
        uVar9 = 0x52;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
      if (lVar5 == 0) goto LAB_7ffc3ea89693;
      uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar6,uVar7,uVar8);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3ea89693;
      lStack_50 = 0;
LAB_7ffc3ea8935e:
      if (arg3 == (void *)0x0) {
LAB_7ffc3ea89660:
        pJVar10 = *env;
        arg2_00 = &DAT_7ffc3eba6000;
        pvVar14 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea89748:
        (*pJVar10->ThrowNew)(env,pvVar14,arg2_00);
      }
      else {
        lVar5 = FUN_7ffc3eb76c30(env,0x19);
        if ((lVar5 != 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x24), lVar5 != 0)) {
          iVar2 = FUN_7ffc3e7d8be0(env,arg3,lVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if ((bVar1 == 0) &&
               (pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6),
               pvVar15 != (void *)0x0)) {
              pvVar11 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar15);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (pvVar14 == (void *)0x0) goto LAB_7ffc3ea89660;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar14);
                }
                if (iVar3 < 1) {
                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a98,(char *)0x7ffc3eba6019);
                }
                else {
                  (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar11);
                  pvVar15 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar15);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar14);
                    }
                    if (iVar3 < 2) {
                      pJVar10 = *env;
                      arg2_00 = (char *)0x7ffc3eba6019;
                      pvVar14 = pvRam00007ffc3ebc0a98;
                      goto LAB_7ffc3ea89748;
                    }
                    (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
                    lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
                    if (lVar5 != 0) {
                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar5,uVar6,
                                                         CONCAT44(uVar16,iVar2 + -2),pvVar14);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        return pvVar14;
                      }
                    }
                    goto LAB_7ffc3ea8974e;
                  }
                }
                pvVar14 = (*(*env)->ExceptionOccurred)(env);
                pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                goto joined_r0x7ffc3ea89723;
              }
            }
          }
        }
      }
LAB_7ffc3ea8974e:
      pvVar14 = (*(*env)->ExceptionOccurred)(env);
      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
      goto joined_r0x7ffc3ea89723;
    }
LAB_7ffc3ea89693:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
  }
  else {
    if ((iVar2 == 0xdc) || (iVar2 == 0xaa)) goto LAB_7ffc3ea88f1c;
LAB_7ffc3ea8909a:
    lVar4 = FUN_7ffc3eb76c30(env,0x2f);
    if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x1ea), lVar5 != 0)) {
      lStack_50 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (lStack_50 == 0) {
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
        }
        else {
          lVar4 = FUN_7ffc3eb76c30(env,0x1d);
          if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x54), lVar5 != 0)) {
            uVar6 = FUN_7ffc3e7d1a50(env,lStack_50,lVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if ((bVar1 == 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x47), lVar5 != 0)) {
              uVar7 = FUN_7ffc3e7d1a50(env,lStack_50,lVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 == 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x48), lVar5 != 0)) {
                uVar8 = FUN_7ffc3e7d1a50(env,lStack_50,lVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if ((bVar1 == 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x49), lVar4 != 0)) {
                  uVar9 = FUN_7ffc3e7d1a50(env,lStack_50,lVar4);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (((bVar1 == 0) && (lVar4 = FUN_7ffc3eb76c30(env,0x19), lVar4 != 0)) &&
                     (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x55), lVar5 != 0)) {
                    uVar8 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,uVar8,uVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (iVar2 == 0xca) {
                        if (arg0 == (void *)0x0) goto LAB_7ffc3ea89c73;
                        uVar9 = 0x57;
LAB_7ffc3ea895a3:
                        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
joined_r0x7ffc3ea895d6:
                        if (lVar4 != 0) {
                          uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar6,uVar7,uVar8);
                          uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            lVar4 = 0;
                            goto LAB_7ffc3ea8935e;
                          }
                        }
                      }
                      else {
                        if (iVar2 == 0xe9) {
                          if (arg0 != (void *)0x0) {
                            uVar9 = 0x56;
                            goto LAB_7ffc3ea895a3;
                          }
                        }
                        else if (arg0 != (void *)0x0) {
                          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
                          goto joined_r0x7ffc3ea895d6;
                        }
LAB_7ffc3ea89c73:
                        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      }
                      pvVar14 = (*(*env)->ExceptionOccurred)(env);
                      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                      if (bVar1 == 0) {
                        return (void *)0x0;
                      }
                      lVar4 = 0;
                      goto LAB_7ffc3ea89782;
                    }
                  }
                }
              }
            }
          }
        }
        pvVar14 = (*(*env)->ExceptionOccurred)(env);
        pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
        lVar4 = 0;
joined_r0x7ffc3ea89723:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3ea89782;
      }
    }
LAB_7ffc3ea8961a:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
    lVar4 = 0;
  }
LAB_7ffc3ea89782:
  (*(*env)->ExceptionClear)(env);
  pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (pvVar15 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar11 = (*(*env)->AllocObject)(env,pvVar15);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea89c02;
  lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x28);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar11,pvVar15,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar14 == (void *)0x0) goto LAB_7ffc3ea89c02;
  lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3e7d1a50(env,pvVar14,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar5 == 0) goto LAB_7ffc3ea89c02;
  lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
  if (lVar12 == 0) {
    return (void *)0x0;
  }
  uVar6 = FUN_7ffc3e7d1a50(env,lVar5,lVar12);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x29);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  lVar12 = FUN_7ffc3e7d1a50(env,pvVar11,lVar5,uVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
  if (lVar12 == 0) goto LAB_7ffc3ea89c02;
  lVar5 = FUN_7ffc3e7d1a50(env,lVar12,lVar5,pvVar15);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar4 == 0) {
    if (lStack_50 != 0) {
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      lVar12 = FUN_7ffc3eb76c90(env,lVar4,0x5b);
      lVar4 = lStack_50;
      goto joined_r0x7ffc3ea899b4;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar12 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar12 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x5a);
joined_r0x7ffc3ea899b4:
    if (lVar12 == 0) {
      return (void *)0x0;
    }
    pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar4,lVar12);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
  }
  if (lVar5 != 0) {
    lVar4 = FUN_7ffc3eb76c30(env,0x1a);
    if (lVar4 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3eb76c90(env,lVar4,0x29);
    if (lVar12 == 0) {
      return (void *)0x0;
    }
    lVar5 = FUN_7ffc3e7d1a50(env,lVar5,lVar12,pvVar15);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar5 != 0) {
      lVar5 = FUN_7ffc3e7d1a50(env,lVar5,lVar12,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar13 = FUN_7ffc3eb76c30(env,8);
      if (lVar13 == 0) {
        return (void *)0x0;
      }
      lVar13 = FUN_7ffc3eb76c90(env,lVar13,0x31);
      if (lVar13 == 0) {
        return (void *)0x0;
      }
      uVar6 = FUN_7ffc3e7d1a50(env,pvVar14,lVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar5 != 0) {
        FUN_7ffc3e7d1a50(env,lVar5,lVar12,uVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar14 = (void *)FUN_7ffc3eb76c30(env,0x16);
        if (pvVar14 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->AllocObject)(env,pvVar14);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x2b);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a50(env,pvVar11,lVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar15 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,pvVar14,0x32);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          FUN_7ffc3e7dbbc0(env,pvVar15,pvVar14,lVar4,uVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          (*(*env)->Throw)(env,pvVar15);
          return (void *)0x0;
        }
      }
    }
  }
LAB_7ffc3ea89c02:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_a_39 | RVA 0x2b9cd0 | dev/krypton/9M.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_a_39
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                 void *arg3,void *arg4)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  undefined8 uVar6;
  JNINativeInterface_ *pJVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  char *arg2_00;
  undefined4 uVar11;
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3ea8a116;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3ea89d51:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3ea89d51;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3ea8a0f9:
    pJVar7 = *env;
    arg2_00 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -2);
    pJVar7 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3ea8a128:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3ea89e65;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar6 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg4);
      }
      if (iVar2 < iVar3) goto LAB_7ffc3ea8a0f9;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3ea8a128;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x2f);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0x1eb);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar4 = arg3;
        lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar9,arg0,arg1,arg2,arg3,uVar6,uVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar9,lVar5,arg3,arg2,pvVar4,uVar6,uVar8);
        uVar11 = (undefined4)((ulonglong)arg3 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (arg1 != (void *)0x0) {
          lVar9 = FUN_7ffc3eb76c30(env,0x18);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar9,0x22);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          FUN_7ffc3e7e1940(env,arg1,lVar9,uVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c30(env,0x12);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,arg4);
          }
          if (lVar5 != 0) {
            lVar10 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x5d);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            lVar5 = FUN_7ffc3e7d1a50(env,lVar5,lVar10,lVar9,CONCAT44(uVar11,iVar3));
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pJVar7 = *env;
            if (lVar5 != 0) {
              pvVar4 = (*pJVar7->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              return pvVar4;
            }
            goto LAB_7ffc3ea89e5e;
          }
        }
LAB_7ffc3ea8a116:
        pJVar7 = *env;
      }
    }
LAB_7ffc3ea89e5e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3ea89e65:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_9M_c_40 | RVA 0x2ba150 | dev/krypton/9M.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_9M_c_40
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

{
  undefined8 uVar1;
  byte bVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  undefined8 uVar13;
  JNINativeInterface_ *pJVar14;
  void *arg1_00;
  void *pvVar15;
  void *pvVar16;
  longlong lVar17;
  char *arg2_00;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x18);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea8aa8e;
  lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0x23);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  pvVar8 = arg2;
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar7,arg2);
  uVar20 = (undefined4)((ulonglong)pvVar8 >> 0x20);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (_DAT_7ffc3ebc0c30 == (void *)0x0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09a0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvRam00007ffc3ebc0a90);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x18);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvRam00007ffc3ebc09e8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x19);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,4,pvVar8);
    uVar9 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,pvRam00007ffc3ebc09e0,
                             pvVar5);
    uVar1 = uRam00007ffc3ebc0a88;
    uVar13 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)pvVar5 >> 0x20);
    uVar10 = FUN_7ffc3eb76c30(env,0x2f);
    uVar11 = FUN_7ffc3eb76c30(env,0x2f);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0c30 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0c30;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3ea8a710:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea8a724:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea8a710;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea8a710;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (2 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,arg1);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                      }
                      if (3 < iVar4) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,3,arg2);
                        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x26);
                        if (lVar7 != 0) {
                          uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,
                                                    uVar19 & 0xffffffff00000000,pvVar5);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x27), lVar7 != 0))
                          {
                            uVar13 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar7,uVar13,arg2,
                                                      pvVar5);
                            bVar2 = (*(*env)->ExceptionCheck)(env);
                            if ((bVar2 == 0) &&
                               ((lVar7 = FUN_7ffc3eb76c30(env,0x18), lVar7 != 0 &&
                                (lVar7 = FUN_7ffc3eb76c90(env,lVar7,0x22), lVar7 != 0)))) {
                              FUN_7ffc3e7e1940(env,pvVar6,lVar7,uVar13);
                              bVar2 = (*(*env)->ExceptionCheck)(env);
                              if (bVar2 == 0) {
                                return pvVar6;
                              }
                            }
                          }
                        }
                        goto LAB_7ffc3ea8a72a;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3ea8a724;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3ea8a72a:
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar2 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
  if (bVar2 == 0) {
    return (void *)0x0;
  }
  (*(*env)->ExceptionClear)(env);
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x16);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (*(*env)->AllocObject)(env,pvVar6);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  arg1_00 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (arg1_00 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar15 = (*(*env)->AllocObject)(env,arg1_00);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  if (pvVar15 != (void *)0x0) {
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x28);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    FUN_7ffc3e7dbbc0(env,pvVar15,arg1_00,lVar7);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb29c6);
    lVar7 = FUN_7ffc3eb76c90(env,arg1_00,0x29);
    if (lVar7 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3e7d1a50(env,pvVar15,lVar7,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return (void *)0x0;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return (void *)0x0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,arg1);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,pvVar15);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          if (arg2 != (void *)0x0) {
            lVar17 = FUN_7ffc3eb76c30(env,0x19);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            lVar17 = FUN_7ffc3eb76c90(env,lVar17,0x2a);
            if (lVar17 == 0) {
              return (void *)0x0;
            }
            uVar13 = FUN_7ffc3e7d1a50(env,arg2,lVar17);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (lVar12 != 0) {
              lVar7 = FUN_7ffc3e7d1a50(env,lVar12,lVar7,uVar13);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              if (lVar7 != 0) {
                lVar12 = FUN_7ffc3eb76c90(env,arg1_00,0x2b);
                if (lVar12 == 0) {
                  return (void *)0x0;
                }
                uVar13 = FUN_7ffc3e7d1a50(env,lVar7,lVar12);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (pvVar8 != (void *)0x0) {
                  lVar7 = FUN_7ffc3eb76c90(env,pvVar6,0x18);
                  if (lVar7 == 0) {
                    return (void *)0x0;
                  }
                  FUN_7ffc3e7dbbc0(env,pvVar8,pvVar6,lVar7,uVar13,pvVar5);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 != 0) {
                    return (void *)0x0;
                  }
                  (*(*env)->Throw)(env,pvVar8);
                  return (void *)0x0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3ea8aa8e:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

