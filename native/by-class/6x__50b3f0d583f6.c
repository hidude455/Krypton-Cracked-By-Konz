/* Native reconstruction for dev/krypton/6x.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6x_3_0 | RVA 0x1c6f80 | dev/krypton/6x.3([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_3_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  char cVar1;
  byte bVar2;
  char cVar3;
  int iVar4;
  void *pvVar5;
  JNINativeInterface_ *pJVar6;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar7;
  ulonglong uVar8;
  void *pvVar9;
  longlong lVar10;
  void *pvVar11;
  undefined8 uVar12;
  ulonglong uVar13;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e99768e:
    pJVar6 = *env;
LAB_7ffc3e997004:
    UNRECOVERED_JUMPTABLE = pJVar6->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar4 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (0 < iVar4) {
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
      pJVar6 = *env;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e997004;
      bVar2 = (*pJVar6->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar2 == 0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar5 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e99700f;
      }
      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar7 == 0) {
        return;
      }
      uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar5 == (void *)0x0) {
        return;
      }
      pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x39);
      if (pvVar9 == (void *)0x0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar13 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar9 + 0x10));
      }
      else {
        uVar13 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
      }
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      lVar7 = FUN_7ffc3eb76c30(env,0x38);
      if (lVar7 == 0) {
        return;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar7,0x98);
      if (lVar10 == 0) {
        return;
      }
      lVar7 = FUN_7ffc3e7d1a80(env,lVar7,lVar10);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc4790 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,2);
        lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                  0x7ffc3ebab664,0x7ffc3eba6204,0,0);
        if ((lVar10 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar5 != (void *)0x0)) {
          _DAT_7ffc3ebc4790 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc4790;
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
LAB_7ffc3e9976a0:
        pvVar5 = (*(*env)->ExceptionOccurred)(env);
        pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x42);
        bVar2 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar9);
        if (bVar2 != 0) {
          (*(*env)->ExceptionClear)(env);
          lVar7 = FUN_7ffc3eb76c30(env,2);
          if ((lVar7 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar7,0xa7), lVar10 != 0)) {
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar10,pvVar5);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e997758. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(*env)->Throw)(env,pvVar5);
              return;
            }
          }
        }
        return;
      }
      uVar13 = uVar13 ^ uVar8;
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x7cf4b70923078578);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
      uVar12 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) goto LAB_7ffc3e9976a0;
      cVar3 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
      cVar1 = cVar3 == '\0';
      if (lVar7 != 0) {
        cVar1 = cVar3;
      }
      pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
      if (lVar7 == 0) {
        return;
      }
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,cVar1);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e99768e;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
      }
      if (1 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
        lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
        if (lVar7 == 0) {
          return;
        }
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar7,uVar13 ^ 0x32e6b679be31);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
        }
        if (0 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
          if (_DAT_7ffc3ebc4798 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,2);
            lVar7 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab667,0x7ffc3eba626f,0,0);
            if ((lVar7 != 0) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc4798 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
          }
          pvVar9 = _DAT_7ffc3ebc4798;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return;
          }
          pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x7cf0c6ffc06f8736);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar5);
          FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar11);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9975b9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3e99700f:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e997022. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2);
  return;
}

/* JNI_dev_krypton_6x_8_1 | RVA 0x1c7780 | dev/krypton/6x.8([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_8_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  longlong lVar11;
  void *pvVar12;
  void *arg1;
  ulonglong uVar13;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e998827:
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
    if (iVar3 < 1) goto LAB_7ffc3e998806;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar5 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3e998839:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
      }
      else {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar4 == (void *)0x0) {
          return;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
        if (pvVar8 == (void *)0x0) {
          return;
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
          return;
        }
        if (_DAT_7ffc3ebc4830 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,2);
          lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab664,0x7ffc3ebab66a,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc4830 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc4830;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        uVar13 = uVar13 ^ uVar7;
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xdc2908d758563cd4);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
        uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        cVar2 = FUN_7ffc3e998860(env,uVar10,uRam00007ffc3ebc0938);
        pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
        if (lVar6 == 0) {
          return;
        }
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,(int)cVar2);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar4 == (void *)0x0) goto LAB_7ffc3e998827;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (1 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar6 == 0) {
            return;
          }
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar13 ^ 0x90819888137);
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
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
            if (_DAT_7ffc3ebc4838 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,2);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                       0x7ffc3eba7e1c,0x7ffc3ebaacdb,0,0);
              if ((lVar6 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc4838 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc4838;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xdc204a538a13effd);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar6 = FUN_7ffc3eb76c30(env,0x38);
            if (lVar6 == 0) {
              return;
            }
            lVar11 = FUN_7ffc3eb76c90(env,lVar6,0x98);
            if (lVar11 == 0) {
              return;
            }
            lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc4840 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,2);
              lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                        0x7ffc3ebab664,0x7ffc3eba7f73,0,0);
              if ((lVar11 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc4840 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc4840;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xdc27d8d9600e6375);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc4848 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,2);
              lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                        0x7ffc3ebab667,0x7ffc3eba61d9,0,0);
              if ((lVar11 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc4848 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc4848;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xdc24719ed47cb690);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            while( true ) {
              if (_DAT_7ffc3ebc4850 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,2);
                lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3ebab667,0x7ffc3eba6204,0,0);
                if ((lVar11 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc4850 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc4850;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xdc25f0561ce9b97d);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar13);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
              uVar10 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
              if (cVar2 == '\0') {
                return;
              }
              if (_DAT_7ffc3ebc4858 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,2);
                lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3ebab667,0x7ffc3eba621c,0,0);
                if ((lVar11 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc4858 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc4858;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xdc2689b7c069a19b);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar13);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
              pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar9 = (void *)FUN_7ffc3eb76c30(env,5);
              if (pvVar9 == (void *)0x0) {
                return;
              }
              if ((pvVar8 != (void *)0x0) &&
                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9), bVar1 == 0)) break;
              pvVar9 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
              if (lVar11 == 0) {
                return;
              }
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar11,
                                                 uVar13 ^ 0x26725255d13e);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (pvVar9 == (void *)0x0) goto LAB_7ffc3e998827;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
              }
              if (iVar3 < 1) goto LAB_7ffc3e998806;
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar12);
              if (_DAT_7ffc3ebc4860 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,2);
                lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3ebab667,0x7ffc3eba626f,0,0);
                if ((lVar11 != 0) &&
                   (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                   pvVar12 != (void *)0x0)) {
                  _DAT_7ffc3ebc4860 = (*(*env)->NewGlobalRef)(env,pvVar12);
                }
              }
              pvVar12 = _DAT_7ffc3ebc4860;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar8);
              (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar9);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xdc29e9fd20338f5b);
              (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar13);
              (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar8);
              FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (lVar6 != 0) {
                return;
              }
              if (bVar1 != 0) {
                return;
              }
            }
            goto LAB_7ffc3e998839;
          }
        }
LAB_7ffc3e998806:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar4 = pvRam00007ffc3ebc0a98;
      }
      goto LAB_7ffc3e997812;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar5->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e997812:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e997828. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_6x_9_2 | RVA 0x1c8890 | dev/krypton/6x.9([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_9_2(JNINativeInterface_ **env,void *receiver,void *arg0)

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
  undefined8 uVar10;
  ulonglong uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e998efd:
    pJVar5 = *env;
LAB_7ffc3e998914:
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (0 < iVar3) {
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e998914;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
        pJVar5 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e99891b;
      }
      lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
      if (pvVar8 == (void *)0x0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar11 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar8 + 0x10));
      }
      else {
        uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (_DAT_7ffc3ebc7bb0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,2);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                 0x7ffc3ebab664,0x7ffc3ebab66a,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc7bb0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc7bb0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar11 = uVar11 ^ uVar7;
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd1b50fea19713148);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
      uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      cVar2 = FUN_7ffc3e998860(env,uVar10,uRam00007ffc3ebc0938);
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,(int)cVar2);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e998efd;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x656a5373e2e9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (0 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
          if (_DAT_7ffc3ebc7bb8 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,2);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3eba7e1c,0x7ffc3eba6128,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc7bb8 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc7bb8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xd1bed28f45466e82);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          return pvVar4;
        }
      }
    }
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3e99891b:
  (*pJVar5->ThrowNew)(env,pvVar4,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_9_3 | RVA 0x1c8f30 | dev/krypton/6x.9()Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_6x_9_3(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  void *pvVar5;
  undefined8 uVar6;
  longlong lVar7;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,2);
  if ((pvVar2 != (void *)0x0) &&
     (pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0x39), pvVar3 != (void *)0x0)) {
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
      if (_DAT_7ffc3ebc23d0 == (void *)0x0) {
        uVar6 = FUN_7ffc3eb76c30(env,2);
        lVar7 = FUN_7ffc3eb77170(env,uVar6,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                 0x7ffc3ebab664,0x7ffc3eba6204,0,0);
        if ((lVar7 != 0) &&
           (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar2 != (void *)0x0
           )) {
          _DAT_7ffc3ebc23d0 = (*(*env)->NewGlobalRef)(env,pvVar2);
        }
      }
      pvVar2 = _DAT_7ffc3ebc23d0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xec65e608e11515e9);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar4 ^ 0x12338cf1a8a2);
        (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar5);
        uVar6 = FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          bVar1 = FUN_7ffc3e7d53d0(env,uVar6,uRam00007ffc3ebc0a38);
          return bVar1;
        }
      }
    }
  }
  return 0;
}

/* JNI_dev_krypton_6x_5_4 | RVA 0x1c91a0 | dev/krypton/6x.5([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_5_4(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  uint uVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  ulonglong uVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar8;
  ulonglong uVar9;
  longlong lVar10;
  void *pvVar11;
  undefined8 uVar12;
  void *pvVar13;
  longlong lVar14;
  void *pvVar15;
  undefined8 uVar16;
  JNINativeInterface_ *pJVar17;
  uint uVar18;
  char *pcVar19;
  ulonglong uVar20;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3e99af9c;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar4 < 1) {
LAB_7ffc3e99af7b:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar19 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e9992eb;
  }
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar17 = *env;
  if (pvVar5 == (void *)0x0) {
LAB_7ffc3e9992e0:
    UNRECOVERED_JUMPTABLE = pJVar17->ThrowNew;
    pcVar19 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9992eb:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e999301. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar5,pcVar19);
    return;
  }
  bVar1 = (*pJVar17->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
  if (bVar1 == 0) {
LAB_7ffc3e99af5a:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar19 = (char *)0x7ffc3eba6033;
    pvVar5 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3e9992eb;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar6 == 0) {
    return;
  }
  uVar7 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar4 < 2) goto LAB_7ffc3e99af7b;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pJVar17 = *env;
  if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9992e0;
  bVar1 = (*pJVar17->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a08);
  if (bVar1 == 0) goto LAB_7ffc3e99af5a;
  lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a08,3);
  if (lVar6 == 0) {
    return;
  }
  uVar3 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x39);
  if (pvVar8 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar8 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar8);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c30(env,0x38);
  if (lVar6 == 0) {
    return;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x98);
  if (lVar10 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc47b0 == (void *)0x0) {
    uVar12 = FUN_7ffc3eb76c30(env,2);
    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                              0x7ffc3ebab664,0x7ffc3eba6204,0,0);
    if ((lVar10 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
    {
      _DAT_7ffc3ebc47b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc47b0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar20 = uVar9 ^ uVar7;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x860fc1c2a4ad7f83);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
    uVar12 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e99afae;
    bVar1 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
    uVar18 = (uint)bVar1;
    if (lVar6 == 0) {
      if (uVar3 == bVar1) {
        return;
      }
      if (_DAT_7ffc3ebc47b8 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,2);
        lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                  0x7ffc3ebab682,0x7ffc3eba72ac,0,0);
        if ((lVar10 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar5 != (void *)0x0)) {
          _DAT_7ffc3ebc47b8 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc47b8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                           uVar3 & 0xff);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x860fc1c2a4ad7f83);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        uVar18 = uVar3;
        if (bVar1 == 0) goto LAB_7ffc3e999763;
      }
LAB_7ffc3e99b0b7:
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x42);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8);
      if (bVar1 == 0) goto LAB_7ffc3e99b15f;
      goto LAB_7ffc3e99b0e7;
    }
LAB_7ffc3e999763:
    if (uVar18 != 0) {
      if (_DAT_7ffc3ebc47c0 == (void *)0x0) {
        uVar12 = FUN_7ffc3eb76c30(env,2);
        lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                  0x7ffc3ebab684,0x7ffc3eba6153,0,0);
        if ((lVar10 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar5 != (void *)0x0)) {
          _DAT_7ffc3ebc47c0 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc47c0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x860e536fbc77f398);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if ((bVar1 == 0) && (lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar10 != 0))
          {
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar10,
                                               uVar20 ^ 0x52d9f5d7d912);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (pvVar8 == (void *)0x0) {
LAB_7ffc3e99b083:
                pJVar17 = *env;
                pcVar19 = &DAT_7ffc3eba6000;
                pvVar5 = pvRam00007ffc3ebc0a70;
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
                  if (_DAT_7ffc3ebc47c8 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,2);
                    lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,
                                              0x7ffc3eba606c,0x7ffc3ebab667,0x7ffc3ebab687,0,0);
                    if ((lVar10 != 0) &&
                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                       pvVar11 != (void *)0x0)) {
                      _DAT_7ffc3ebc47c8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                    }
                  }
                  pvVar11 = _DAT_7ffc3ebc47c8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar8);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0x860b3175ca3a1c06);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar5);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar20);
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar5);
                    lVar10 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (lVar10 == 0) goto LAB_7ffc3e99b083;
                      lVar14 = FUN_7ffc3eb76c30(env,0xb);
                      if ((lVar14 != 0) && (lVar14 = FUN_7ffc3eb76c90(env,lVar14,0xa8), lVar14 != 0)
                         ) {
                        FUN_7ffc3e7e1940(env,lVar10,lVar14,receiver);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          uVar12 = 0x8605a1b12e0a3dfc;
                          if ((int)((uint)((longlong)uVar20 >> 0x3f) | (uint)(uVar9 != uVar7)) < 1)
                          goto LAB_7ffc3e99a328;
                          if (_DAT_7ffc3ebc47d0 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,2);
                            lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,
                                                      0x7ffc3eba606c,0x7ffc3ebab667,0x7ffc3eba743f,0
                                                      ,0);
                            if ((lVar10 != 0) &&
                               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                               pvVar5 != (void *)0x0)) {
                              _DAT_7ffc3ebc47d0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                            }
                          }
                          pvVar5 = _DAT_7ffc3ebc47d0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar8 = (*(*env)->NewObjectArray)
                                               (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               0x8605a1b12e0a3dfc);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,uVar20);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
                            FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (lVar6 != 0) goto LAB_7ffc3e999bac;
                              goto LAB_7ffc3e99a31e;
                            }
                          }
                        }
                      }
                    }
                  }
                  goto LAB_7ffc3e99b0b7;
                }
                pJVar17 = *env;
                pcVar19 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
              }
              (*pJVar17->ThrowNew)(env,pvVar5,pcVar19);
            }
          }
        }
      }
      goto LAB_7ffc3e99b0b7;
    }
LAB_7ffc3e999bac:
    if (_DAT_7ffc3ebc47d8 == (void *)0x0) {
      uVar12 = FUN_7ffc3eb76c30(env,2);
      lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                0x7ffc3ebab667,0x7ffc3eba743f,0,0);
      if ((lVar10 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc47d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc47d8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x860970d420f8c4fe);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
      FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc47e0 == (void *)0x0) {
          uVar12 = FUN_7ffc3eb76c30(env,2);
          lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                    0x7ffc3ebab684,0x7ffc3eba6153,0,0);
          if ((lVar10 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc47e0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc47e0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x860e536fbc77f398);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
        if (lVar10 == 0) {
          return;
        }
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar10,uVar20 ^ 0x52d9f5d7d912)
        ;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar8 != (void *)0x0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar4 < 1) goto LAB_7ffc3e99af7b;
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          if (_DAT_7ffc3ebc47e8 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,2);
            lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                      0x7ffc3ebab667,0x7ffc3ebab687,0,0);
            if ((lVar10 != 0) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc47e8 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
          }
          pvVar11 = _DAT_7ffc3ebc47e8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar5);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar8);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x860b3175ca3a1c06);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar5);
          lVar10 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (lVar10 != 0) {
            lVar14 = FUN_7ffc3eb76c30(env,0xb);
            if (lVar14 == 0) {
              return;
            }
            lVar14 = FUN_7ffc3eb76c90(env,lVar14,0xa9);
            if (lVar14 == 0) {
              return;
            }
            FUN_7ffc3e7e1940(env,lVar10,lVar14,receiver);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
LAB_7ffc3e99a31e:
            uVar12 = 0x860987058b58bd53;
LAB_7ffc3e99a328:
            if (_DAT_7ffc3ebc47f0 == (void *)0x0) {
              uVar16 = FUN_7ffc3eb76c30(env,2);
              lVar10 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                        0x7ffc3ebab664,0x7ffc3eba7f73,0,0);
              if ((lVar10 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc47f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc47f0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc47f8 == (void *)0x0) {
              uVar12 = FUN_7ffc3eb76c30(env,2);
              lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                        0x7ffc3ebab667,0x7ffc3eba61d9,0,0);
              if ((lVar10 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc47f8 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc47f8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x8608543ac5b6ecbc);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar20)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            while( true ) {
              if (_DAT_7ffc3ebc4800 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,2);
                lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3ebab667,0x7ffc3eba6204,0,0);
                if ((lVar10 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc4800 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc4800;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x8609d5f20d23e351);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar20);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
              uVar12 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              cVar2 = FUN_7ffc3e7d53d0(env,uVar12,uRam00007ffc3ebc0a38);
              if (cVar2 == '\0') {
                return;
              }
              if (_DAT_7ffc3ebc4808 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,2);
                lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3ebab667,0x7ffc3eba621c,0,0);
                if ((lVar10 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc4808 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc4808;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x860aac13d1a3fbb7);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar20);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar13);
              pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x43);
              if (pvVar11 == (void *)0x0) {
                return;
              }
              if ((pvVar8 != (void *)0x0) &&
                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar11), bVar1 == 0)) break;
              if (_DAT_7ffc3ebc4810 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,2);
                lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3eba7e1c,0x7ffc3eba62b7,0,0);
                if ((lVar10 != 0) &&
                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar11 != (void *)0x0)) {
                  _DAT_7ffc3ebc4810 = (*(*env)->NewGlobalRef)(env,pvVar11);
                }
              }
              pvVar11 = _DAT_7ffc3ebc4810;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                 uVar3 & 0xff);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar15);
              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x8608f7e3be98ea6c);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar15);
              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar20);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar15);
              pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (_DAT_7ffc3ebc4818 == (void *)0x0) {
                uVar12 = FUN_7ffc3eb76c30(env,2);
                lVar10 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                          0x7ffc3ebab667,0x7ffc3eba62d0,0,0);
                if ((lVar10 != 0) &&
                   (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar13 != (void *)0x0)) {
                  _DAT_7ffc3ebc4818 = (*(*env)->NewGlobalRef)(env,pvVar13);
                }
              }
              pvVar13 = _DAT_7ffc3ebc4818;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar15 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar8);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,1,receiver);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar11);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x860f73bf88242cd4);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar20);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,4,pvVar8);
              FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (lVar6 != 0) {
                return;
              }
              if (bVar1 != 0) {
                return;
              }
            }
            goto LAB_7ffc3e99af5a;
          }
        }
LAB_7ffc3e99af9c:
        pJVar17 = *env;
        goto LAB_7ffc3e9992e0;
      }
    }
  }
  else {
LAB_7ffc3e99afae:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x42);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if ((lVar6 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xa7), lVar10 == 0)) {
LAB_7ffc3e99b04e:
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar10,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar5);
        goto LAB_7ffc3e99b04e;
      }
      pvVar5 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x42);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e99b0e7:
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if ((lVar6 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xa7), lVar10 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar10,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar5 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e99b15f;
      }
      (*(*env)->Throw)(env,pvVar5);
    }
  }
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e99b15f:
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x42);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if ((lVar6 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xa7), lVar10 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar10,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99b20e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar5);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_6x_4_5 | RVA 0x1cb230 | dev/krypton/6x.4([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_4_5(JNINativeInterface_ **env,void *receiver,void *arg0)

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
  undefined8 uVar10;
  ulonglong uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e99b89d:
    pJVar5 = *env;
LAB_7ffc3e99b2b4:
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (0 < iVar3) {
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e99b2b4;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
        pJVar5 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e99b2bb;
      }
      lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
      if (pvVar8 == (void *)0x0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar11 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar8 + 0x10));
      }
      else {
        uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (_DAT_7ffc3ebc7ba0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,2);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                 0x7ffc3ebab664,0x7ffc3ebab66a,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc7ba0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc7ba0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar11 = uVar11 ^ uVar7;
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x3a9209d0964e354);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
      uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      cVar2 = FUN_7ffc3e998860(env,uVar10,uRam00007ffc3ebc0938);
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,(int)cVar2);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e99b89d;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x36d434e56f3a);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (0 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
          if (_DAT_7ffc3ebc7ba8 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,2);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3eba7e1c,0x7ffc3eba6128,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc7ba8 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc7ba8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x3a41767c10f098f);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          return pvVar4;
        }
      }
    }
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3e99b2bb:
  (*pJVar5->ThrowNew)(env,pvVar4,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_9_6 | RVA 0x1cb8d0 | dev/krypton/6x.9([Ljava/lang/Object;)I | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_6x_9_6(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  undefined8 uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar4 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99b958;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return 0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar3 == (void *)0x0) {
          return 0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x39);
        if (pvVar7 == (void *)0x0) {
          return 0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar7 + 0x10));
        }
        else {
          uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (_DAT_7ffc3ebc4870 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,2);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab664,0x7ffc3eba64b4,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc4870 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc4870;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x348700a30ed63553);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar8 ^ uVar6);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        uVar10 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        iVar2 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
        return iVar2;
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99b958;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99b958:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return 0;
}

/* JNI_dev_krypton_6x_6_7 | RVA 0x1cbc50 | dev/krypton/6x.6([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_6_7(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  void *pvVar4;
  longlong lVar5;
  ulonglong uVar6;
  JNINativeInterface_ *pJVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar8;
  ulonglong uVar9;
  void *pvVar10;
  undefined8 uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar7 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
LAB_7ffc3e99c06f:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99bd96;
    }
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar7 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 2) goto LAB_7ffc3e99c06f;
        pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar7 = *env;
        if (pvVar4 == (void *)0x0) goto LAB_7ffc3e99bd8b;
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
        if (bVar1 != 0) {
          lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
          if (lVar5 == 0) {
            return;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
          if (pvVar4 == (void *)0x0) {
            return;
          }
          pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar9 = *(ulonglong *)
                     (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                     (longlong)*(int *)((longlong)pvVar8 + 0x10));
          }
          else {
            uVar9 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc4820 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,2);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab682,0x7ffc3eba7293,0,0);
            if ((lVar5 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc4820 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc4820;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x14d240cbb1dd1506);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar9 ^ uVar6);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar10);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99bfaa. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99bd96;
    }
  }
LAB_7ffc3e99bd8b:
  UNRECOVERED_JUMPTABLE = pJVar7->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99bd96:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99bda9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_6x_4_8 | RVA 0x1cc0d0 | dev/krypton/6x.4([Ljava/lang/Object;)Ldev/krypton/4r; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_4_8(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  undefined8 uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar4 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99c158;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x39);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar7 + 0x10));
        }
        else {
          uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7ac8 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,2);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab664,0x7ffc3ebab6c0,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7ac8 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7ac8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x2b21ecde4f59648c);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar8 ^ uVar6);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar3;
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99c158;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99c158:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_5_9 | RVA 0x1cc440 | dev/krypton/6x.5([Ljava/lang/Object;)Ljava/util/List; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_5_9(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  undefined8 uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar4 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99c4c8;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x39);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar7 + 0x10));
        }
        else {
          uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc7ad0 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,2);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab664,0x7ffc3eba7f73,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7ad0 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7ad0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x7384e350eddfccd6);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar8 ^ uVar6);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar3;
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99c4c8;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99c4c8:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_6_10 | RVA 0x1cc7b0 | dev/krypton/6x.6()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_6_10(JNINativeInterface_ **env,void *receiver)

{
  return;
}

/* JNI_dev_krypton_6x_1_11 | RVA 0x1cc7c0 | dev/krypton/6x.1()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_1_11(JNINativeInterface_ **env,void *receiver)

{
  return;
}

/* JNI_dev_krypton_6x_0_12 | RVA 0x1cc7d0 | dev/krypton/6x.0([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_0_12(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  char *arg2;
  ulonglong uVar11;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e99d042:
    pJVar5 = *env;
LAB_7ffc3e99c8db:
    UNRECOVERED_JUMPTABLE = pJVar5->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3e99c8e6;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (0 < iVar2) {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,5);
    if (pvVar4 == (void *)0x0) {
      return;
    }
    if ((pvVar3 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 == 0))
    {
LAB_7ffc3e99d054:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99c8e6;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (1 < iVar2) {
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e99c8db;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) goto LAB_7ffc3e99d054;
      lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return;
      }
      uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar4 == (void *)0x0) {
        return;
      }
      pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
      if (pvVar8 == (void *)0x0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar11 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar8 + 0x10));
      }
      else {
        uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
      if (lVar6 == 0) {
        return;
      }
      uVar11 = uVar11 ^ uVar7;
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x25237a3c3ec4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e99d042;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar3);
          if (_DAT_7ffc3ebc4748 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,2);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab667,0x7ffc3eba626f,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc4748 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc4748;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x9ee3d256b3fe759f);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc4750 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,2);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab664,0x7ffc3eba7f73,0,0);
            if ((lVar6 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc4750 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc4750;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x9ee687f3826821b4);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc4758 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,2);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab667,0x7ffc3eba6245,0,0);
            if ((lVar6 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc4758 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc4758;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x9ee75a55086de170);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
          uVar10 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
          return;
        }
      }
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = (char *)0x7ffc3eba6019;
  pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e99c8e6:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99c8f9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_6x_1_13 | RVA 0x1cd080 | dev/krypton/6x.1([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_1_13(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  void *pvVar8;
  longlong lVar9;
  void *pvVar10;
  undefined8 uVar11;
  JNINativeInterface_ *pJVar12;
  int iVar13;
  ulonglong uVar15;
  char *pcVar16;
  int arg2;
  int iVar14;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e99de7d:
    pJVar12 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
LAB_7ffc3e99dd84:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar16 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99d118;
    }
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar12 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 2) goto LAB_7ffc3e99dd84;
        pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x44);
        if (pvVar7 == (void *)0x0) {
          return;
        }
        if ((pvVar4 == (void *)0x0) ||
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar7), bVar1 != 0)) {
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
          if (pvVar7 == (void *)0x0) {
            return;
          }
          pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x39);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar15 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar8 + 0x10));
          }
          else {
            uVar15 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar8);
          }
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
            lVar5 = FUN_7ffc3eb76c30(env,0x38);
            if (lVar5 == 0) {
              return;
            }
            lVar9 = FUN_7ffc3eb76c90(env,lVar5,0x98);
            if (lVar9 == 0) {
              return;
            }
            lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar15 = uVar15 ^ uVar6;
            iVar14 = (int)((longlong)uVar15 >> 0x3f);
            iVar13 = iVar14 + (uint)(0 < (longlong)uVar15);
            arg2 = 0;
            if (iVar2 < 1) {
              iVar2 = 0;
            }
            do {
              if (iVar2 == arg2) {
                if (_DAT_7ffc3ebc4768 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,2);
                  lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c
                                           ,0x7ffc3ebab664,0x7ffc3eba7f73,0,0);
                  if ((lVar5 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc4768 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc4768;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x29ad9ec031abdc8);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar15);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar10);
                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc4770 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,2);
                  lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c
                                           ,0x7ffc3eba7e1c,0x7ffc3eba7f73,0,0);
                  if ((lVar5 != 0) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc4770 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                }
                pvVar8 = _DAT_7ffc3ebc4770;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x29820ed623d4cfe);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar15);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc4778 == (void *)0x0) {
                  uVar11 = FUN_7ffc3eb76c30(env,2);
                  lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c
                                           ,0x7ffc3ebab667,0x7ffc3eba6245,0,0);
                  if ((lVar5 != 0) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc4778 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                }
                pvVar8 = _DAT_7ffc3ebc4778;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x29e13b8dad1b817);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar15);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
                uVar11 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
                break;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar3 <= arg2) goto LAB_7ffc3e99dd84;
              pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar4,arg2);
              pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 != 0) ||
                 (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar9 == 0))
              goto LAB_7ffc3e99ddbf;
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,
                                                 uVar15 ^ 0x7b3cfb4ea2b8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e99ddbf;
              if (pvVar8 == (void *)0x0) {
                pJVar12 = *env;
                pcVar16 = &DAT_7ffc3eba6000;
                pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99ddb9:
                (*pJVar12->ThrowNew)(env,pvVar4,pcVar16);
                goto LAB_7ffc3e99ddbf;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar8);
              }
              if (iVar3 < 2) {
LAB_7ffc3e99dd6a:
                pJVar12 = *env;
                pcVar16 = (char *)0x7ffc3eba6019;
                pvVar4 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e99ddb9;
              }
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar8);
              }
              if (iVar3 < 1) goto LAB_7ffc3e99dd6a;
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar7);
              if (_DAT_7ffc3ebc4760 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,2);
                lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                         0x7ffc3ebab667,0x7ffc3eba626f,0,0);
                if ((lVar9 != 0) &&
                   (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar7 != (void *)0x0)) {
                  _DAT_7ffc3ebc4760 = (*(*env)->NewGlobalRef)(env,pvVar7);
                }
              }
              pvVar7 = _DAT_7ffc3ebc4760;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e99ddbf;
              pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x29f8c49328ce9e3);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar15);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar8);
              FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3e99ddbf;
              arg2 = arg2 + 1;
            } while (lVar5 == 0 &&
                     (iVar13 != 0 && SCARRY4(iVar14,(uint)(0 < (longlong)uVar15)) == iVar13 < 0));
            if (iVar13 < 0) {
              return;
            }
            lVar5 = FUN_7ffc3eb76c30(env,0xb);
            if ((lVar5 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xb), lVar9 != 0)) {
              lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (lVar5 != 0) {
                  return;
                }
                pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xb);
                pvVar4 = (*(*env)->NewObjectArray)(env,2,pvVar4,(void *)0x0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (((bVar1 == 0) && (lVar5 = FUN_7ffc3eb76c30(env,0x38), lVar5 != 0)) &&
                   (lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xaa), lVar9 != 0)) {
                  FUN_7ffc3e7e6a80(env,lVar5,lVar9,pvVar4);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    return;
                  }
                }
              }
            }
LAB_7ffc3e99ddbf:
            pvVar4 = (*(*env)->ExceptionOccurred)(env);
            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x42);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar7);
            if (bVar1 == 0) {
              return;
            }
            (*(*env)->ExceptionClear)(env);
            lVar5 = FUN_7ffc3eb76c30(env,2);
            if (lVar5 == 0) {
              return;
            }
            lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xa7);
            if (lVar9 == 0) {
              return;
            }
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar9,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99de7a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->Throw)(env,pvVar4);
            return;
          }
          goto LAB_7ffc3e99de7d;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar16 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99d118;
    }
  }
  UNRECOVERED_JUMPTABLE = pJVar12->ThrowNew;
  pcVar16 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99d118:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99d12e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,pcVar16);
  return;
}

/* JNI_dev_krypton_6x_4_14 | RVA 0x1cdeb0 | dev/krypton/6x.4([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_4_14(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  JNINativeInterface_ *pJVar6;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar7;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e99e5d9:
    pJVar6 = *env;
LAB_7ffc3e99dfb9:
    UNRECOVERED_JUMPTABLE = pJVar6->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3e99dfc4;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (0 < iVar3) {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,5);
    if (pvVar5 == (void *)0x0) {
      return;
    }
    if ((pvVar4 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5), bVar1 == 0))
    {
LAB_7ffc3e99e5eb:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99dfc4;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (1 < iVar3) {
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar6 = *env;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e99dfb9;
      bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) goto LAB_7ffc3e99e5eb;
      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar7 == 0) {
        return;
      }
      uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar5 == (void *)0x0) {
        return;
      }
      pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x39);
      if (pvVar9 == (void *)0x0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar12 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar9 + 0x10));
      }
      else {
        uVar12 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc47a0 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,2);
        lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                 0x7ffc3ebab664,0x7ffc3ebab66a,0,0);
        if ((lVar7 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc47a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc47a0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      uVar12 = uVar12 ^ uVar8;
      pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0xe4e636f3f1df041b);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
      uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      cVar2 = FUN_7ffc3e998860(env,uVar11,uRam00007ffc3ebc0938);
      pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
      if (lVar7 == 0) {
        return;
      }
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar7,uVar12 ^ 0x33f43005a776);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e99e5d9;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
      }
      if (1 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
        if (lVar7 == 0) {
          return;
        }
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar7,(int)cVar2);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
        }
        if (0 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
          if (_DAT_7ffc3ebc47a8 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,2);
            lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab667,0x7ffc3eba626f,0,0);
            if ((lVar7 != 0) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc47a8 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
          }
          pvVar9 = _DAT_7ffc3ebc47a8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xe4ebabb1adc69e43);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99e504. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = (char *)0x7ffc3eba6019;
  pvVar4 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e99dfc4:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99dfd7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_6x_9_15 | RVA 0x1ce610 | dev/krypton/6x.9([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_9_15(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  void *pvVar7;
  longlong lVar8;
  longlong lVar9;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  longlong lVar13;
  undefined8 uVar14;
  JNINativeInterface_ *pJVar15;
  ulonglong uVar16;
  char *pcVar17;
  undefined1 uStack_64;
  void *pvStack_50;
  
  if (arg0 == (void *)0x0) {
    pJVar15 = *env;
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
LAB_7ffc3e99fa92:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar17 = (char *)0x7ffc3eba6019;
      pvVar7 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99e8b1;
    }
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar15 = *env;
    if (pvVar7 != (void *)0x0) {
      bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) {
LAB_7ffc3e99fac5:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar17 = (char *)0x7ffc3eba6033;
        pvVar7 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e99e8b1;
      }
      lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
      if (lVar8 == 0) {
        return;
      }
      uVar2 = FUN_7ffc3e7d8be0(env,pvVar7,lVar8);
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
      if (iVar3 < 2) goto LAB_7ffc3e99fa92;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar15 = *env;
      if (pvVar7 == (void *)0x0) goto LAB_7ffc3e99e8a6;
      bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0a08);
      if (bVar1 == 0) goto LAB_7ffc3e99fac5;
      lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a08,3);
      if (lVar9 == 0) {
        return;
      }
      iVar3 = FUN_7ffc3e7d8be0(env,pvVar7,lVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar4 < 3) goto LAB_7ffc3e99fa92;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
      pJVar15 = *env;
      if (pvVar7 == (void *)0x0) goto LAB_7ffc3e99e8a6;
      bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) goto LAB_7ffc3e99fac5;
      iVar4 = FUN_7ffc3e7d8be0(env,pvVar7,lVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar6 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar6 < 4) goto LAB_7ffc3e99fa92;
      pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
      pJVar15 = *env;
      if (pvVar7 == (void *)0x0) goto LAB_7ffc3e99e8a6;
      bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) goto LAB_7ffc3e99fac5;
      uVar5 = FUN_7ffc3e7d8be0(env,pvVar7,lVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar7 == (void *)0x0) {
        return;
      }
      pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x39);
      if (pvVar10 == (void *)0x0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar16 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar10 + 0x10));
      }
      else {
        uVar16 = (*(*env)->GetStaticLongField)(env,pvVar7,pvVar10);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar8 = FUN_7ffc3eb76c30(env,0x38);
      if (lVar8 == 0) {
        return;
      }
      lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x98);
      if (lVar9 == 0) {
        return;
      }
      lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc4878 == (void *)0x0) {
        uVar14 = FUN_7ffc3eb76c30(env,2);
        lVar9 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                 0x7ffc3ebab682,0x7ffc3eba72ac,0,0);
        if ((lVar9 != 0) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc4878 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
      }
      pvVar7 = _DAT_7ffc3ebc4878;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        uVar16 = uVar16 ^ CONCAT44(uVar2,uVar5 & 0xffff | iVar4 << 0x10);
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
        uStack_64 = (undefined1)iVar3;
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uStack_64)
        ;
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0xc214bac801f33b98);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar11);
        FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc4880 == (void *)0x0) {
            uVar14 = FUN_7ffc3eb76c30(env,2);
            lVar9 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab684,0x7ffc3eba6153,0,0);
            if ((lVar9 != 0) &&
               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar7 != (void *)0x0)) {
              _DAT_7ffc3ebc4880 = (*(*env)->NewGlobalRef)(env,pvVar7);
            }
          }
          pvVar7 = _DAT_7ffc3ebc4880;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0xc21528651929b783);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
            pvStack_50 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (lVar8 == 0) {
                if (pvStack_50 == (void *)0x0) {
                  return;
                }
                if (_DAT_7ffc3ebc4888 == (void *)0x0) {
                  uVar14 = FUN_7ffc3eb76c30(env,2);
                  lVar9 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c
                                           ,0x7ffc3ebab684,0x7ffc3eba6153,0,0);
                  if ((lVar9 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc4888 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc4888;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0xc21528651929b783);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar16);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                pvStack_50 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
              }
              pvVar7 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 != 0)
                 ) {
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (pvVar7 == (void *)0x0) goto LAB_7ffc3e99fae6;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                  }
                  if (iVar6 < 1) {
LAB_7ffc3e99fafc:
                    pJVar15 = *env;
                    pcVar17 = (char *)0x7ffc3eba6019;
                    pvVar7 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e99fb14:
                    (*pJVar15->ThrowNew)(env,pvVar7,pcVar17);
                  }
                  else {
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar10);
                    if (_DAT_7ffc3ebc4890 == (void *)0x0) {
                      uVar14 = FUN_7ffc3eb76c30(env,2);
                      lVar9 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,0x7ffc3ebab662,
                                               0x7ffc3eba606c,0x7ffc3ebab667,0x7ffc3ebab687,0,0);
                      if ((lVar9 != 0) &&
                         (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                         pvVar10 != (void *)0x0)) {
                        _DAT_7ffc3ebc4890 = (*(*env)->NewGlobalRef)(env,pvVar10);
                      }
                    }
                    pvVar10 = _DAT_7ffc3ebc4890;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvStack_50);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xc2104a7f6f64581d);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
                      lVar9 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (iVar4 < 0) {
                          return;
                        }
                        if (lVar9 == 0) {
                          return;
                        }
                        if (iVar3 == 0) {
LAB_7ffc3e99f421:
                          if (_DAT_7ffc3ebc48a8 == (void *)0x0) {
                            uVar14 = FUN_7ffc3eb76c30(env,2);
                            lVar8 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,0x7ffc3ebab662,
                                                     0x7ffc3eba606c,0x7ffc3ebab684,0x7ffc3eba6153,0,
                                                     0);
                            if ((lVar8 != 0) &&
                               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                               pvVar7 != (void *)0x0)) {
                              _DAT_7ffc3ebc48a8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                            }
                          }
                          pvVar7 = _DAT_7ffc3ebc48a8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               0xc21528651929b783);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,uVar16);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,
                                                              pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar10 = (*(*env)->NewObjectArray)
                                                  (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar1 == 0) &&
                                 (lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar8 != 0))
                              {
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,
                                                                   uVar16 ^ 0x29d350899d09);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (pvVar10 == (void *)0x0) {
LAB_7ffc3e99fae6:
                                    pJVar15 = *env;
                                    pcVar17 = &DAT_7ffc3eba6000;
                                    pvVar7 = pvRam00007ffc3ebc0a70;
                                    goto LAB_7ffc3e99fb14;
                                  }
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar3 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                                  }
                                  if (iVar3 < 1) goto LAB_7ffc3e99fafc;
                                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                                  if (_DAT_7ffc3ebc48b0 == (void *)0x0) {
                                    uVar14 = FUN_7ffc3eb76c30(env,2);
                                    lVar8 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,
                                                             0x7ffc3ebab662,0x7ffc3eba606c,
                                                             0x7ffc3ebab667,0x7ffc3ebab687,0,0);
                                    if ((lVar8 != 0) &&
                                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar11 != (void *)0x0)) {
                                      _DAT_7ffc3ebc48b0 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                    }
                                  }
                                  pvVar11 = _DAT_7ffc3ebc48b0;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar12 = (*(*env)->NewObjectArray)
                                                        (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0xc2104a7f6f64581d);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar16);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                                    lVar8 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,
                                                             pvVar12);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (lVar8 == 0) goto LAB_7ffc3e99fae6;
                                      lVar9 = FUN_7ffc3eb76c30(env,0xb);
                                      if ((lVar9 != 0) &&
                                         (lVar9 = FUN_7ffc3eb76c90(env,lVar9,0xa9), lVar9 != 0)) {
                                        FUN_7ffc3e7e1940(env,lVar8,lVar9,receiver);
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
                          }
                        }
                        else {
                          if (_DAT_7ffc3ebc4898 == (void *)0x0) {
                            uVar14 = FUN_7ffc3eb76c30(env,2);
                            lVar9 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,0x7ffc3ebab662,
                                                     0x7ffc3eba606c,0x7ffc3ebab684,0x7ffc3eba6153,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar7 != (void *)0x0)) {
                              _DAT_7ffc3ebc4898 = (*(*env)->NewGlobalRef)(env,pvVar7);
                            }
                          }
                          pvVar7 = _DAT_7ffc3ebc4898;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               0xc21528651929b783);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,uVar16);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,
                                                              pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar10 = (*(*env)->NewObjectArray)
                                                  (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar1 == 0) &&
                                 (lVar9 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar9 != 0))
                              {
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar9,
                                                                   uVar16 ^ 0x29d350899d09);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (pvVar10 == (void *)0x0) {
LAB_7ffc3e99fb1f:
                                    pJVar15 = *env;
                                    pcVar17 = &DAT_7ffc3eba6000;
                                    pvVar7 = pvRam00007ffc3ebc0a70;
                                  }
                                  else {
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar3 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                                    }
                                    if (0 < iVar3) {
                                      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                                      if (_DAT_7ffc3ebc48a0 == (void *)0x0) {
                                        uVar14 = FUN_7ffc3eb76c30(env,2);
                                        lVar9 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebab653,
                                                                 0x7ffc3ebab662,0x7ffc3eba606c,
                                                                 0x7ffc3ebab667,0x7ffc3ebab687,0,0);
                                        if ((lVar9 != 0) &&
                                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                               uRam00007ffc3ebc0a00)
                                           , pvVar11 != (void *)0x0)) {
                                          _DAT_7ffc3ebc48a0 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                        }
                                      }
                                      pvVar11 = _DAT_7ffc3ebc48a0;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar12 = (*(*env)->NewObjectArray)
                                                            (env,4,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          0xc2104a7f6f64581d);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          uVar16);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                                        lVar9 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,
                                                                 pvVar12);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          if (lVar9 == 0) goto LAB_7ffc3e99fb1f;
                                          lVar13 = FUN_7ffc3eb76c30(env,0xb);
                                          if ((lVar13 != 0) &&
                                             (lVar13 = FUN_7ffc3eb76c90(env,lVar13,0xa8),
                                             lVar13 != 0)) {
                                            FUN_7ffc3e7e1940(env,lVar9,lVar13,receiver);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 == 0) {
                                              if (lVar8 == 0) {
                                                return;
                                              }
                                              goto LAB_7ffc3e99f421;
                                            }
                                          }
                                        }
                                      }
                                      goto LAB_7ffc3e99fb53;
                                    }
                                    pJVar15 = *env;
                                    pcVar17 = (char *)0x7ffc3eba6019;
                                    pvVar7 = pvRam00007ffc3ebc0a98;
                                  }
                                  (*pJVar15->ThrowNew)(env,pvVar7,pcVar17);
                                }
                              }
                            }
                          }
LAB_7ffc3e99fb53:
                          pvVar7 = (*(*env)->ExceptionOccurred)(env);
                          pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x42);
                          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar10);
                          if (bVar1 == 0) goto LAB_7ffc3e99fbfb;
                          (*(*env)->ExceptionClear)(env);
                          lVar8 = FUN_7ffc3eb76c30(env,2);
                          if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa7), lVar9 != 0)
                             ) {
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              pvVar7 = (*(*env)->ExceptionOccurred)(env);
                              goto LAB_7ffc3e99fbfb;
                            }
                            (*(*env)->Throw)(env,pvVar7);
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
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e99fbfb:
      pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x42);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar10);
      if (bVar1 != 0) {
        (*(*env)->ExceptionClear)(env);
        lVar8 = FUN_7ffc3eb76c30(env,2);
        if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa7), lVar9 != 0)) {
          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99fca7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->Throw)(env,pvVar7);
            return;
          }
        }
      }
      return;
    }
  }
LAB_7ffc3e99e8a6:
  UNRECOVERED_JUMPTABLE = pJVar15->ThrowNew;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99e8b1:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e99e8c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar7,pcVar17);
  return;
}

/* JNI_dev_krypton_6x_8_16 | RVA 0x1cfcc0 | dev/krypton/6x.8([Ljava/lang/Object;)Z | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

byte JNI_dev_krypton_6x_8_16(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  JNINativeInterface_ *pJVar4;
  longlong lVar5;
  ulonglong uVar6;
  void *pvVar7;
  ulonglong uVar8;
  void *pvVar9;
  undefined8 uVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar4 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 1) {
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e99fd48;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar4 = *env;
    if (pvVar3 != (void *)0x0) {
      bVar1 = (*pJVar4->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return 0;
        }
        uVar6 = FUN_7ffc3e7d1a20(env,pvVar3,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar3 == (void *)0x0) {
          return 0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x39);
        if (pvVar7 == (void *)0x0) {
          return 0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar7 + 0x10));
        }
        else {
          uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar7);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (_DAT_7ffc3ebc4868 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,2);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab664,0x7ffc3eba6204,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc4868 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc4868;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xcea61f685c832d11);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar8 ^ uVar6);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        uVar10 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        bVar1 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
        return bVar1;
      }
      pJVar4 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e99fd48;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e99fd48:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return 0;
}

/* JNI_dev_krypton_6x_7_17 | RVA 0x1d0040 | dev/krypton/6x.7([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_7_17(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  JNINativeInterface_ *pJVar6;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar7;
  void *pvVar8;
  ulonglong uVar9;
  void *pvVar10;
  undefined8 uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
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
LAB_7ffc3e9a0460:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9a0188;
    }
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar6 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a08);
      if (bVar1 != 0) {
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a08,3);
        if (lVar5 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
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
        if (iVar3 < 2) goto LAB_7ffc3e9a0460;
        pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar6 = *env;
        if (pvVar4 == (void *)0x0) goto LAB_7ffc3e9a017d;
        bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 != 0) {
          lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
          if (lVar5 == 0) {
            return;
          }
          uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
          if (pvVar4 == (void *)0x0) {
            return;
          }
          pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
          if (pvVar8 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar9 = *(ulonglong *)
                     (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                     (longlong)*(int *)((longlong)pvVar8 + 0x10));
          }
          else {
            uVar9 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc4828 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,2);
            lVar5 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                     0x7ffc3ebab682,0x7ffc3eba72ac,0,0);
            if ((lVar5 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc4828 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc4828;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xbdd123beed785e66);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar9 ^ uVar7);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar10);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9a039b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e9a0188;
    }
  }
LAB_7ffc3e9a017d:
  UNRECOVERED_JUMPTABLE = pJVar6->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a0188:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9a019b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_6x_2_18 | RVA 0x1d04c0 | dev/krypton/6x.2([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_2_18(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  ulonglong uVar9;
  void *pvVar10;
  undefined8 uVar11;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar5 = *env;
LAB_7ffc3e9a05c9:
    UNRECOVERED_JUMPTABLE = pJVar5->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3e9a05d4;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3e9a0a39:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x43);
    if (pvVar4 == (void *)0x0) {
      return;
    }
    if ((pvVar3 == (void *)0x0) || (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 != 0))
    {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3e9a0a39;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3e9a05c9;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar4 == (void *)0x0) {
          return;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x39);
        if (pvVar8 == (void *)0x0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar9 = *(ulonglong *)
                   (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                   (longlong)*(int *)((longlong)pvVar8 + 0x10));
        }
        else {
          uVar9 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc4780 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,2);
          lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab664,0x7ffc3eba7f73,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc4780 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc4780;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0xc2cf882d8ab1f995);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           uVar9 ^ uVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar10);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc4788 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,2);
          lVar6 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebab653,0x7ffc3ebab662,0x7ffc3eba606c,
                                   0x7ffc3ebab667,0x7ffc3eba6245,0,0);
          if ((lVar6 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc4788 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc4788;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc2cc2ff3fa28bd5b);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar9 ^ uVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
        return;
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3e9a05d4:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9a05e7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_6x_a_19 | RVA 0x1d0a90 | dev/krypton/6x.a(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_a_19(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_6x_a_20 | RVA 0x1d0aa0 | dev/krypton/6x.a([B)Ljava/lang/String; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_a_20(JNINativeInterface_ **env,void *receiver,void *arg0)

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
      goto LAB_7ffc3e9a1036;
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
LAB_7ffc3e9a0b8e:
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
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a1040;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if ((iVar4 < 0) || (iVar5 <= iVar4)) goto LAB_7ffc3e9a101e;
          uVar14 = (ulonglong)(iVar4 + 1);
          uStack_66 = (ushort)bVar3;
          if (bRam00007ffc3ebc08e5 == 1) {
LAB_7ffc3e9a0b60:
            *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar12 * 2) = uVar11;
            uVar12 = uVar14;
          }
          else {
            pJVar8 = *env;
            arg4 = &uStack_66;
LAB_7ffc3e9a0dd1:
            (*pJVar8->SetCharArrayRegion)(env,pvVar6,iVar4,1,arg4);
            uVar12 = uVar14;
          }
LAB_7ffc3e9a0b7c:
          uVar15 = uVar15 + 1;
          uVar13 = (undefined4)uVar12;
          if ((uint)uStack_48 <= uVar15) goto LAB_7ffc3e9a0f8f;
          goto LAB_7ffc3e9a0b8e;
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a1040;
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
              if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a0b60;
              pJVar8 = *env;
              arg4 = &uStack_68;
              goto LAB_7ffc3e9a0dd1;
            }
          }
        }
        else {
          if (iStack_54 <= (int)uVar15) goto LAB_7ffc3e9a0b7c;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,arg0);
          }
          arg2 = uVar15 + 1;
          if (iVar5 <= (int)arg2) goto LAB_7ffc3e9a101e;
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a1040;
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
              goto LAB_7ffc3e9a0b7c;
            }
          }
        }
      }
LAB_7ffc3e9a101e:
      pJVar8 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar6 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9a1036;
    }
    uVar13 = 0;
LAB_7ffc3e9a0f8f:
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
LAB_7ffc3e9a1040:
  pJVar8 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a1036:
  (*pJVar8->ThrowNew)(env,pvVar6,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_b_21 | RVA 0x1d1070 | dev/krypton/6x.b(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_6x_b_21(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3a);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9a2912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x2fb8, iVar6 <= (int)arg2)) {
LAB_7ffc3e9a28f8:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e9a2926;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3e9a27e9:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3a);
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
      if (iVar6 <= (int)arg2) goto LAB_7ffc3e9a28f8;
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
    goto LAB_7ffc3e9a2912;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9a2912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1232;
LAB_7ffc3e9a11f8:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a11f8;
LAB_7ffc3e9a1232:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a12be;
LAB_7ffc3e9a1281:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1281;
LAB_7ffc3e9a12be:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a134a;
LAB_7ffc3e9a130d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a130d;
LAB_7ffc3e9a134a:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a13d6;
LAB_7ffc3e9a1399:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1399;
LAB_7ffc3e9a13d6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1461;
LAB_7ffc3e9a1424:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1424;
LAB_7ffc3e9a1461:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a14ec;
LAB_7ffc3e9a14af:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a14af;
LAB_7ffc3e9a14ec:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1577;
LAB_7ffc3e9a153a:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a153a;
LAB_7ffc3e9a1577:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3b);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9a2912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3e9a28f8;
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
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9a2912;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1787;
LAB_7ffc3e9a174d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a174d;
LAB_7ffc3e9a1787:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1813;
LAB_7ffc3e9a17d6:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a17d6;
LAB_7ffc3e9a1813:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a189f;
LAB_7ffc3e9a1862:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1862;
LAB_7ffc3e9a189f:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a192b;
LAB_7ffc3e9a18ee:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a18ee;
LAB_7ffc3e9a192b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a19b6;
LAB_7ffc3e9a1979:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1979;
LAB_7ffc3e9a19b6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1a41;
LAB_7ffc3e9a1a04:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1a04;
LAB_7ffc3e9a1a41:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e9a28f8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9a1acc;
LAB_7ffc3e9a1a8f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9a1a8f;
LAB_7ffc3e9a1acc:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e9a28f8;
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
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3c);
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
LAB_7ffc3e9a21b1:
          pJVar16 = *env;
          goto LAB_7ffc3e9a21b7;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3e9a21b1;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e9a21b1;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9a2197;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3e9a2931:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3e9a21ab;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3e9a21b1;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e9a21b1;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3e9a2931;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3e9a21b7;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3e9a2197;
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
                if (iVar6 < 3) goto LAB_7ffc3e9a2931;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,2);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0x3c);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3e9a21ba;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3e9a2197;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3e9a20a2;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e9a21b1;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3e9a2926;
        }
LAB_7ffc3e9a20a2:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3e9a2197:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a21ab:
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
                  if (iVar6 < 2) goto LAB_7ffc3e9a2931;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9a2197;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3e9a294e;
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
                        if (iVar6 < 1) goto LAB_7ffc3e9a2931;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3e9a294e:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e9a21ab;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3e9a2931;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3e9a294e;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9a2197;
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
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3a);
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
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9a2912;
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
                                              goto LAB_7ffc3e9a27e9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e9a28f8;
                                  }
                                  goto LAB_7ffc3e9a2912;
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
          goto LAB_7ffc3e9a21b1;
        }
LAB_7ffc3e9a21b7:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3e9a21ba:
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
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab653);
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
LAB_7ffc3e9a2912:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a2926:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_dev_krypton_6x_b_22 | RVA 0x1d29a0 | dev/krypton/6x.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_6x_b_22
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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3e9a2ebd;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3e9a2ea0;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3e9a2ecf:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e9a2ae7;
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
    if (iVar3 < 2) goto LAB_7ffc3e9a2ea0;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9a2ae0;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3e9a2ecf;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0xab);
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
          goto LAB_7ffc3e9a2ebd;
        }
      }
LAB_7ffc3e9a2ea0:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9a2ae7;
    }
LAB_7ffc3e9a2ebd:
    pJVar7 = *env;
  }
LAB_7ffc3e9a2ae0:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a2ae7:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_dev_krypton_6x_b_23 | RVA 0x1d2ef0 | dev/krypton/6x.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_b_23
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a37bb;
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
  if (_DAT_7ffc3ebc0be0 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,2);
    uVar11 = FUN_7ffc3eb76c30(env,2);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0be0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0be0;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e9a3423:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a3451:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9a3423;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9a3423;
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
                      goto LAB_7ffc3e9a3457;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9a3451;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e9a3457:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab653);
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
LAB_7ffc3e9a37bb:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_a_24 | RVA 0x1d37e0 | dev/krypton/6x.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_6x_a_24(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x3d);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3e9a4134:
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
LAB_7ffc3e9a38f4:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,2);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x3e);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a4134;
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
          iVar5 = *(int *)(&UNK_7ffc3eb99bc0 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a40de;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3e9a40c4;
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
LAB_7ffc3e9a3f5e:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,2);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x3d), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a4134;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3e9a40ff;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3e9a38f4;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3e9a3d0d;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3e9a3d0d:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3e9a40c4;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3e9a3f5e;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3e9a40c4;
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
                    goto LAB_7ffc3e9a40f5;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3e9a40c4;
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
LAB_7ffc3e9a40de:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3e9a40f5;
        }
        goto LAB_7ffc3e9a38f4;
      }
    }
LAB_7ffc3e9a40ff:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3e9a40c4:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e9a40f5:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_6x_a_25 | RVA 0x1d4180 | dev/krypton/6x.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6x_a_25(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x3e);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab6e7);
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3e9a5d30:
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
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x3d);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a5d30;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
          pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab6f7);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (2 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
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
            if (3 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
              pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
              if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a5d30;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (3 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar7);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab70f);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (4 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab71d);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (5 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab72e);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (6 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab742);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                      }
                      if (7 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                        pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab751);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                        }
                        if (8 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0960,0xc);
                          if (pvVar6 == (void *)0x0) {
                            return;
                          }
                          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0960,pvVar6)
                          ;
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
                            pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65aa);
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a5d30;
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            if (9 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,9,pvVar7);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab765);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                              }
                              if (10 < iVar2) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab77a);
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
                                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab789);
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
                                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab79a);
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
                                      pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0950,
                                                                        0x3f);
                                      if (pvVar6 == (void *)0x0) {
                                        return;
                                      }
                                      pvVar6 = (*(*env)->GetStaticObjectField)
                                                         (env,pvRam00007ffc3ebc0950,pvVar6);
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
                                      if (0xe < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0xe,pvVar6);
                                        pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) {
                                          return;
                                        }
                                        pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab7ae)
                                        ;
                                        if (pvVar3 == (void *)0x0) goto LAB_7ffc3e9a5d30;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar3 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                                        }
                                        if (0xe < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar3,0xe,pvVar5);
                                          pvVar3 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3ebab7bd);
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar2 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar4 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                          }
                                          if (0xf < iVar2) {
                                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0xf,pvVar3);
                                            pvVar3 = (*(*env)->NewStringUTF)
                                                               (env,(char *)0x7ffc3ebab7cd);
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
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar4,0x10,pvVar3);
                                              pvVar3 = (*(*env)->NewStringUTF)
                                                                 (env,(char *)0x7ffc3ebab7e2);
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
                                                          (env,pvVar4,0x11,pvVar3);
                                                pvVar3 = (*(*env)->NewStringUTF)
                                                                   (env,(char *)0x7ffc3ebab7f3);
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
                                                            (env,pvVar4,0x12,pvVar3);
                                                  pvVar3 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3ebab807);
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
                                                              (env,pvVar4,0x13,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab817);
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
                                                                (env,pvVar4,0x14,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab82b
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
                                                                  (env,pvVar4,0x15,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab83e);
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
                                                              (env,pvVar4,0x16,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab852);
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
                                                                (env,pvVar4,0x17,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab879
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
                                                      if (0x18 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x18,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab88d);
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
                                                  if (0x19 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x19,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab8a1);
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
                                                    if (0x1a < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1a,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab8b0
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
                                                      if (0x1b < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1b,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab8c3);
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
                                                              (env,pvVar4,0x1c,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab8e1);
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
                                                    if (0x1d < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1d,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab8f8
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
                                                      if (0x1e < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1e,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab91c);
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
                                                  if (0x1f < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1f,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab935);
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
                                                    if (0x20 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x20,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab94e
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
                                                      if (0x21 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x21,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab974);
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
                                                  if (0x22 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x22,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab98b);
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
                                                    if (0x23 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x23,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab9a7
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
                                                      if (0x24 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x24,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebab9be);
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
                                                  if (0x25 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x25,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab9e2);
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
                                                    if (0x26 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x26,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebab9f9
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
                                                      if (0x27 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x27,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaba1d);
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
                                                  if (0x28 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x28,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebaba3d);
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
                                                    if (0x29 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x29,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaba61
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
                                                      if (0x2a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2a,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebaba8b);
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
                                                  if (0x2b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2b,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebabaaf);
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
                                                    if (0x2c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2c,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebabac7
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
                                                      if (0x2d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2d,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebabaf0);
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
                                                  if (0x2e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2e,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebabb0f);
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
                                                    if (0x2f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2f,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebabb26
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
                                                      if (0x30 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x30,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebabb40);
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
                                                  if (0x31 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x31,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebabb58);
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
                                                    if (0x32 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x32,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebabb7c
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
                                                      if (0x33 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x33,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebabb9f);
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
                                                  if (0x34 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x34,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebabbd3);
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
                                                    if (0x35 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x35,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebabbfc
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
                                                      if (0x36 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x36,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebabc13);
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
                                                  if (0x37 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x37,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebabc2d);
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
                                                    if (0x38 < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9a5ceb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x38,pvVar3);
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
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9a5d1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_6x_b_26 | RVA 0x1d5d50 | dev/krypton/6x.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_b_26(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0xac);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x3e);
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
      goto LAB_7ffc3e9a61f6;
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
      goto LAB_7ffc3e9a61f6;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,2);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3e9a60ba:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x3d);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3e9a60a0:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x3e);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a609a;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e9a60a0;
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
                    goto LAB_7ffc3e9a6080;
                  }
                }
              }
              goto LAB_7ffc3e9a60ba;
            }
LAB_7ffc3e9a6080:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3e9a60ba;
      }
LAB_7ffc3e9a609a:
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
LAB_7ffc3e9a61f6:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_a_27 | RVA 0x1d6210 | dev/krypton/6x.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_a_27
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
LAB_7ffc3e9a6471:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e9a648d;
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
        if (lVar6 == 0) goto LAB_7ffc3e9a6471;
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
LAB_7ffc3e9a648d:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_b_28 | RVA 0x1d64c0 | dev/krypton/6x.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_b_28
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
  
  lVar3 = FUN_7ffc3eb76c30(env,2);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xad), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,2);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xae);
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

/* JNI_dev_krypton_6x_c_29 | RVA 0x1d66f0 | dev/krypton/6x.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_c_29(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0xac);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x3e);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9a7420;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3e9a7406;
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
    goto LAB_7ffc3e9a7434;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x3d);
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
LAB_7ffc3e9a7406:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9a7434;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0xaf);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0xad);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3e9a7420;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3e9a7406;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,2);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0xae);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x3e);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3e9a7420;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3e9a7406;
              pJVar14 = *env;
              goto LAB_7ffc3e9a6fe7;
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
        if (lVar9 == 0) goto LAB_7ffc3e9a7420;
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
          goto LAB_7ffc3e9a7420;
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
          lVar8 = FUN_7ffc3eb76c30(env,2);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xaf);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x33f50799c9c9a,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x3e);
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
LAB_7ffc3e9a6fe7:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3e9a7406;
      }
    }
  }
LAB_7ffc3e9a7420:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a7434:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_a_30 | RVA 0x1d7440 | dev/krypton/6x.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_a_30
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
LAB_7ffc3e9a786a:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e9a7878;
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
        if (lVar7 == 0) goto LAB_7ffc3e9a786a;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9a786a;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3e9a785c;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3e9a786a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e9a785c;
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
LAB_7ffc3e9a785c:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e9a7878:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_b_31 | RVA 0x1d78a0 | dev/krypton/6x.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_b_31
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
  
  lVar3 = FUN_7ffc3eb76c30(env,2);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xb0), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,2);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xb1);
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

/* JNI_dev_krypton_6x_d_32 | RVA 0x1d7b10 | dev/krypton/6x.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_d_32(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,2);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0xac);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x3e);
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
LAB_7ffc3e9a8d57:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9a8d6f;
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
      goto LAB_7ffc3e9a8d6f;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x3d);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3e9a8d57;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0xaf);
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
            lVar6 = FUN_7ffc3eb76c30(env,2);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xaf);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9a8d41;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3e9a8d57;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3e9a81c0:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0xb0);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3e);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3e9a8741:
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
              goto LAB_7ffc3e9a8d57;
            }
            goto LAB_7ffc3e9a8d41;
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
              if (iVar4 == 0) goto code_r0x7ffc3e9a82fe;
              goto joined_r0x7ffc3e9a83c1;
            }
          }
          goto LAB_7ffc3e9a8d41;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3e9a8d6f;
      }
    }
  }
  goto LAB_7ffc3e9a8d41;
code_r0x7ffc3e9a82fe:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3e9a834c;
  goto LAB_7ffc3e9a81c0;
code_r0x7ffc3e9a834c:
  lVar6 = FUN_7ffc3eb76c30(env,2);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0xaf);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x33f50799c9c9a,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3e9a83c1:
  do {
    if (lVar10 == 0) goto LAB_7ffc3e9a8d41;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3e9a8d57;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,2);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0xb1);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x3e);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3e9a8741;
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
    if (lVar6 == 0) goto LAB_7ffc3e9a8d41;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3e9a8d41;
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
      if (lVar10 == 0) goto LAB_7ffc3e9a8d41;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9a8d41;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3e9a8d41;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9a8d41;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9a8d41;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9a8d41;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3e9a8d41;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3e9a8a98;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9a8d41;
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
      lVar6 = FUN_7ffc3eb76c30(env,2);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xaf);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x33f50799c9c9a,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9a8d41;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3e9a8d57;
  }
LAB_7ffc3e9a8a98:
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
LAB_7ffc3e9a8d41:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a8d6f:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_a_33 | RVA 0x1d8da0 | dev/krypton/6x.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_a_33
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
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3e9a9b38;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (iVar2 < 0xc3) {
    if ((iVar2 != 0x47) && (iVar2 != 0xa5)) goto LAB_7ffc3e9a8fd0;
LAB_7ffc3e9a8e4f:
    lVar4 = FUN_7ffc3eb76c30(env,2);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xb2), lVar5 == 0))
    goto LAB_7ffc3e9a9550;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9a9550;
    if (lVar4 == 0) goto LAB_7ffc3e9a95af;
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar5 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x4e), lVar12 != 0)) {
      uVar6 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x34), lVar12 == 0))
      goto LAB_7ffc3e9a95c9;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x36), lVar5 == 0))
      goto LAB_7ffc3e9a95c9;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9a95c9;
      if (iVar2 == 0x47) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9a95af;
        uVar9 = 0x50;
      }
      else if (iVar2 == 0xc3) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9a95af;
        uVar9 = 0x51;
      }
      else if (iVar2 == 0xff) {
        if (arg0 == (void *)0x0) {
LAB_7ffc3e9a95af:
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          goto LAB_7ffc3e9a95c9;
        }
        uVar9 = 0x4f;
      }
      else {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9a95af;
        uVar9 = 0x52;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
      if (lVar5 == 0) goto LAB_7ffc3e9a95c9;
      uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar6,uVar7,uVar8);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9a95c9;
      lStack_50 = 0;
LAB_7ffc3e9a9294:
      if (arg3 == (void *)0x0) {
LAB_7ffc3e9a9596:
        pJVar10 = *env;
        arg2_00 = &DAT_7ffc3eba6000;
        pvVar14 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9a967e:
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
                if (pvVar14 == (void *)0x0) goto LAB_7ffc3e9a9596;
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
                      goto LAB_7ffc3e9a967e;
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
                    goto LAB_7ffc3e9a9684;
                  }
                }
                pvVar14 = (*(*env)->ExceptionOccurred)(env);
                pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                goto joined_r0x7ffc3e9a9659;
              }
            }
          }
        }
      }
LAB_7ffc3e9a9684:
      pvVar14 = (*(*env)->ExceptionOccurred)(env);
      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
      goto joined_r0x7ffc3e9a9659;
    }
LAB_7ffc3e9a95c9:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
  }
  else {
    if ((iVar2 == 0xff) || (iVar2 == 0xc3)) goto LAB_7ffc3e9a8e4f;
LAB_7ffc3e9a8fd0:
    lVar4 = FUN_7ffc3eb76c30(env,2);
    if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xb3), lVar5 != 0)) {
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
                      if (iVar2 == 0xf4) {
                        if (arg0 == (void *)0x0) goto LAB_7ffc3e9a9ba9;
                        uVar9 = 0x57;
LAB_7ffc3e9a94d9:
                        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
joined_r0x7ffc3e9a950c:
                        if (lVar4 != 0) {
                          uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar6,uVar7,uVar8);
                          uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            lVar4 = 0;
                            goto LAB_7ffc3e9a9294;
                          }
                        }
                      }
                      else {
                        if (iVar2 == 0xe5) {
                          if (arg0 != (void *)0x0) {
                            uVar9 = 0x56;
                            goto LAB_7ffc3e9a94d9;
                          }
                        }
                        else if (arg0 != (void *)0x0) {
                          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
                          goto joined_r0x7ffc3e9a950c;
                        }
LAB_7ffc3e9a9ba9:
                        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      }
                      pvVar14 = (*(*env)->ExceptionOccurred)(env);
                      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                      if (bVar1 == 0) {
                        return (void *)0x0;
                      }
                      lVar4 = 0;
                      goto LAB_7ffc3e9a96b8;
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
joined_r0x7ffc3e9a9659:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3e9a96b8;
      }
    }
LAB_7ffc3e9a9550:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
    lVar4 = 0;
  }
LAB_7ffc3e9a96b8:
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
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9a9b38;
  lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x28);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar11,pvVar15,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar14 == (void *)0x0) goto LAB_7ffc3e9a9b38;
  lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3e7d1a50(env,pvVar14,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e9a9b38;
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
  if (lVar12 == 0) goto LAB_7ffc3e9a9b38;
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
      goto joined_r0x7ffc3e9a98ea;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar12 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar12 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x5a);
joined_r0x7ffc3e9a98ea:
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
LAB_7ffc3e9a9b38:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_a_34 | RVA 0x1d9c00 | dev/krypton/6x.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_a_34
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3e9aa046;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3e9a9c81:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3e9a9c81;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3e9aa029:
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
LAB_7ffc3e9aa058:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e9a9d95;
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
      if (iVar2 < iVar3) goto LAB_7ffc3e9aa029;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3e9aa058;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,2);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xb4);
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
            goto LAB_7ffc3e9a9d8e;
          }
        }
LAB_7ffc3e9aa046:
        pJVar7 = *env;
      }
    }
LAB_7ffc3e9a9d8e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e9a9d95:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_6x_e_35 | RVA 0x1da080 | dev/krypton/6x.e(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6x_e_35
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9aa9be;
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
  if (_DAT_7ffc3ebc0be8 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,2);
    uVar11 = FUN_7ffc3eb76c30(env,2);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0be8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0be8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e9aa640:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9aa654:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9aa640;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9aa640;
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
                        goto LAB_7ffc3e9aa65a;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9aa654;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e9aa65a:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebab653);
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
LAB_7ffc3e9aa9be:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

