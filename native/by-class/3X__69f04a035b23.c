/* Native reconstruction for 3X.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_3X_7_0 | RVA 0x2c2510 | 3X.7([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_3X_7_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  JNINativeInterface_ *pJVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  longlong lVar11;
  void *arg1;
  undefined8 uVar12;
  undefined8 uVar13;
  char *arg2;
  ulonglong uVar14;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3ea93be3;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (0 < iVar3) {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,10);
    if (pvVar5 == (void *)0x0) {
      return;
    }
    if ((pvVar4 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5), bVar1 == 0))
    {
LAB_7ffc3ea93bf5:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea926db;
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
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3ea93bf5;
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar6 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
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
        if (iVar3 < 3) goto LAB_7ffc3ea93bc2;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pJVar7 = *env;
        if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea926d0;
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3ea93bf5;
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x51);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x5b);
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
        pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x52);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar9 = (*(*env)->AllocObject)(env,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar9 != (void *)0x0) {
          lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0xde);
          if (lVar6 == 0) {
            return;
          }
          FUN_7ffc3e7dbbc0(env,pvVar9,pvVar5,lVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc24b8 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x51);
            lVar6 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3eba72d4,0x7ffc3ebadcfa,0,0);
            if ((lVar6 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc24b8 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc24b8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          uVar14 = uVar14 ^ uVar8;
          pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x4a99ec2470530ffe);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar9);
          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc24c0 == (void *)0x0) {
            uVar12 = FUN_7ffc3eb76c30(env,0x51);
            lVar6 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3eba7466,0x7ffc3ebadd16,0,0);
            if ((lVar6 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc24c0 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc24c0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x4a99ec2470530ffe);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar6 == 0) {
            return;
          }
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar14 ^ 0xc53921c20aa)
          ;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar9 != (void *)0x0) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
            }
            if (2 < iVar3) {
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
              lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
              if (lVar11 == 0) {
                return;
              }
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar11,uVar2);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
              }
              if (1 < iVar3) {
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
                }
                if (0 < iVar3) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                  if (_DAT_7ffc3ebc24c8 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x51);
                    lVar11 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                              0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3eba626f,0,0);
                    if ((lVar11 != 0) &&
                       (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                       pvVar10 != (void *)0x0)) {
                      _DAT_7ffc3ebc24c8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                    }
                  }
                  pvVar10 = _DAT_7ffc3ebc24c8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar5);
                  (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar9);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x4a968e81411f4d53);
                  (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar14);
                  (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar5);
                  FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,arg1);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar4 = (void *)FUN_7ffc3ea93c20(env,pvVar4);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (_DAT_7ffc3ebc24d0 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x51);
                    lVar11 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                              0x7ffc3eba606c,0x7ffc3eba82ab,0x7ffc3ebadb71,0,0);
                    if ((lVar11 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc24d0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc24d0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x4a97d98d4e595e77);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar14);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (_DAT_7ffc3ebc24d8 == (void *)0x0) {
                    uVar12 = FUN_7ffc3eb76c30(env,0x51);
                    lVar11 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                              0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3eba64fe,0,0);
                    if ((lVar11 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc24d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc24d8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x4a95de11cbcdf108);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar14);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                  uVar12 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  uVar12 = FUN_7ffc3e7d1a20(env,uVar12,uRam00007ffc3ebc0968);
                  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x4d);
                  if (pvVar4 == (void *)0x0) {
                    return;
                  }
                  pvVar5 = (*(*env)->AllocObject)(env,pvVar4);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar5 != (void *)0x0) {
                    lVar11 = FUN_7ffc3eb76c90(env,pvVar4,0xdf);
                    if (lVar11 == 0) {
                      return;
                    }
                    FUN_7ffc3e7dbbc0(env,pvVar5,pvVar4,lVar11,uVar14 ^ 0x4cd5180221a7);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (_DAT_7ffc3ebc24e0 == (void *)0x0) {
                      uVar13 = FUN_7ffc3eb76c30(env,0x51);
                      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                0x7ffc3eba606c,0x7ffc3eba72d4,0x7ffc3ebadd34,0,0);
                      if ((lVar11 != 0) &&
                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                         pvVar4 != (void *)0x0)) {
                        _DAT_7ffc3ebc24e0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                    pvVar4 = _DAT_7ffc3ebc24e0;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar5);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0x4a947d43bbf67bb6);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar14);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
                    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (_DAT_7ffc3ebc24e8 == (void *)0x0) {
                      uVar13 = FUN_7ffc3eb76c30(env,0x51);
                      lVar11 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3ebadd50,0,0);
                      if ((lVar11 != 0) &&
                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                         pvVar4 != (void *)0x0)) {
                        _DAT_7ffc3ebc24e8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                    pvVar4 = _DAT_7ffc3ebc24e8;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0x4a947d43bbf67bb6);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar14);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,
                                                      uVar14 ^ 0x57fafd1b5025);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (pvVar5 != (void *)0x0) {
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
                      }
                      if (1 < iVar3) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar12);
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
                          if (_DAT_7ffc3ebc24f0 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x51);
                            lVar6 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                     0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3eba626f,0,
                                                     0);
                            if ((lVar6 != 0) &&
                               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                               pvVar9 != (void *)0x0)) {
                              _DAT_7ffc3ebc24f0 = (*(*env)->NewGlobalRef)(env,pvVar9);
                            }
                          }
                          pvVar9 = _DAT_7ffc3ebc24f0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar10 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x4a987ff0cf66702b)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar14);
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar4);
                          FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc24f8 == (void *)0x0) {
                            uVar12 = FUN_7ffc3eb76c30(env,0x51);
                            lVar6 = FUN_7ffc3eb77170(env,uVar12,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                     0x7ffc3eba606c,0x7ffc3eba72d4,0x7ffc3eba7293,0,
                                                     0);
                            if ((lVar6 != 0) &&
                               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                               pvVar4 != (void *)0x0)) {
                              _DAT_7ffc3ebc24f8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                            }
                          }
                          pvVar4 = _DAT_7ffc3ebc24f8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar5 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,
                                                            uRam00007ffc3ebc0998,uVar2);
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x4a98db1faef4b864)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar14);
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
                          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea93a61. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                          (*(*env)->ExceptionCheck)(env);
                          return;
                        }
                      }
                      goto LAB_7ffc3ea93bc2;
                    }
                  }
                  goto LAB_7ffc3ea93be3;
                }
              }
            }
            goto LAB_7ffc3ea93bc2;
          }
        }
LAB_7ffc3ea93be3:
        pJVar7 = *env;
      }
LAB_7ffc3ea926d0:
      UNRECOVERED_JUMPTABLE = pJVar7->ThrowNew;
      arg2 = &DAT_7ffc3eba6000;
      pvVar4 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3ea926db;
    }
  }
LAB_7ffc3ea93bc2:
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = (char *)0x7ffc3eba6019;
  pvVar4 = pvRam00007ffc3ebc0a98;
LAB_7ffc3ea926db:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea926ee. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_3X_2_1 | RVA 0x2c41c0 | 3X.2([Ljava/lang/Object;)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_3X_2_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  void *pvVar6;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  longlong lVar7;
  ulonglong uVar8;
  void *arg2;
  ulonglong uVar9;
  byte *pbVar10;
  JNINativeInterface_ *pJVar11;
  char *pcVar12;
  uint arg2_00;
  byte bStack_63;
  byte bStack_62;
  byte bStack_61;
  longlong *plStack_60;
  JNINativeInterface_ **ppJStack_58;
  longlong *plStack_50;
  ulonglong uStack_48;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3ea9470f:
    pJVar11 = *env;
LAB_7ffc3ea942ca:
    UNRECOVERED_JUMPTABLE = pJVar11->ThrowNew;
    pcVar12 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3ea942d5;
  }
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3ea94737:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar12 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,10);
    if (pvVar5 == (void *)0x0) {
      return;
    }
    if ((pvVar4 == (void *)0x0) || (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5), bVar1 != 0))
    {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3ea94737;
      pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar11 = *env;
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea942ca;
      bVar1 = (*pJVar11->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0958);
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
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 3) goto LAB_7ffc3ea94737;
        pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        if ((pvVar6 == (void *)0x0) ||
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5), bVar1 != 0)) {
          pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x51);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          arg2 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x5b);
          if (arg2 == (void *)0x0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar9 = *(ulonglong *)
                     (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                     (longlong)*(int *)((longlong)arg2 + 0x10));
          }
          else {
            uVar9 = (*(*env)->GetStaticLongField)(env,pvVar5,arg2);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0xe0);
          if (lVar7 == 0) {
            return;
          }
          iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar4 != (void *)0x0) {
            plStack_60 = (longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc);
            plStack_50 = (longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc);
            uStack_48 = (ulonglong)
                        ((int)((longlong)(uVar9 ^ uVar8) >> 0x3f) +
                        (uint)(0 < (longlong)(uVar9 ^ uVar8)));
            arg2_00 = 0;
            ppJStack_58 = env;
            while( true ) {
              if (bRam00007ffc3ebc08e5 == 1) {
                iVar3 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if ((int)arg2_00 < iVar3) break;
              do {
                if (-1 < (int)uStack_48) {
                  return;
                }
LAB_7ffc3ea946cf:
              } while (iVar2 == 0);
            }
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar3 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if ((-1 < (int)arg2_00) && ((int)arg2_00 < iVar3)) {
              if (bRam00007ffc3ebc08e5 == 1) {
                pbVar10 = (byte *)((ulonglong)arg2_00 + (ulonglong)uRam00007ffc3ebc08f0 +
                                  *plStack_60);
              }
              else {
                pbVar10 = &bStack_61;
                (*(*env)->GetByteArrayRegion)(env,pvVar4,arg2_00,1,pbVar10);
              }
              if (pvVar6 == (void *)0x0) {
                pJVar11 = *env;
                pcVar12 = &DAT_7ffc3eba6000;
                pvVar4 = pvRam00007ffc3ebc0a70;
                goto LAB_7ffc3ea94707;
              }
              bVar1 = *pbVar10;
              if (bRam00007ffc3ebc08e5 == 1) {
                iVar3 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if ((int)arg2_00 < iVar3) {
                if (bRam00007ffc3ebc08e5 == 1) {
                  pbVar10 = (byte *)((ulonglong)arg2_00 + (ulonglong)uRam00007ffc3ebc08f0 +
                                    *plStack_50);
                }
                else {
                  pbVar10 = &bStack_62;
                  (*(*env)->GetByteArrayRegion)(env,pvVar6,arg2_00,1,pbVar10);
                }
                env = ppJStack_58;
                bVar1 = bVar1 ^ *pbVar10;
                if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                  iVar3 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar4);
                }
                else {
                  iVar3 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
                }
                if ((int)arg2_00 < iVar3) {
                  bStack_63 = bVar1;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    *(byte *)(*plStack_60 + (ulonglong)arg2_00 + (ulonglong)uRam00007ffc3ebc08f0) =
                         bVar1;
                  }
                  else {
                    (*(*env)->SetByteArrayRegion)(env,pvVar4,arg2_00,1,&bStack_63);
                  }
                  arg2_00 = arg2_00 + 1;
                  goto LAB_7ffc3ea946cf;
                }
              }
            }
            pJVar11 = *env;
            pcVar12 = (char *)0x7ffc3eba6019;
            pvVar4 = pvRam00007ffc3ebc0a98;
LAB_7ffc3ea94707:
            (*pJVar11->ThrowNew)(env,pvVar4,pcVar12);
            return;
          }
          goto LAB_7ffc3ea9470f;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar12 = (char *)0x7ffc3eba6033;
    pvVar4 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3ea942d5:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea942e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,pcVar12);
  return;
}

/* JNI_3X_2_2 | RVA 0x2c4780 | 3X.2([Ljava/lang/Object;)[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_2_2(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  void *pvVar6;
  JNINativeInterface_ *pJVar7;
  longlong lVar8;
  ulonglong uVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  void *pvVar13;
  longlong lVar14;
  void *pvVar15;
  longlong lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  void *arg3;
  ulonglong uVar19;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3ea96641;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) goto LAB_7ffc3ea96624;
  pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar7 = *env;
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3ea9480d:
    arg2 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
  }
  else {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0958);
    if (bVar1 != 0) {
      lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar8 == 0) {
        return (void *)0x0;
      }
      uVar9 = FUN_7ffc3e7d1a20(env,pvVar6,lVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3ea96624;
      pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pvVar10 = (void *)FUN_7ffc3eb76c30(env,10);
      if (pvVar10 == (void *)0x0) {
        return (void *)0x0;
      }
      if ((pvVar6 == (void *)0x0) ||
         (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar10), bVar1 != 0)) {
        pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x51);
        if (pvVar10 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvVar10,0x5b);
        if (pvVar11 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar19 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar11 + 0x10));
        }
        else {
          uVar19 = (*(*env)->GetStaticLongField)(env,pvVar10,pvVar11);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc2b48 == (void *)0x0) {
          uVar17 = FUN_7ffc3eb76c30(env,0x51);
          lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3ebadd16,0,0);
          if ((lVar8 != 0) &&
             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar11 != (void *)0x0)) {
            _DAT_7ffc3ebc2b48 = (*(*env)->NewGlobalRef)(env,pvVar11);
          }
        }
        pvVar11 = _DAT_7ffc3ebc2b48;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar19 = uVar19 ^ uVar9;
        pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1aaed16dbdde5fc9);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
        pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar12 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
        if (lVar8 == 0) {
          return (void *)0x0;
        }
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar8,0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar12 == (void *)0x0) goto LAB_7ffc3ea96641;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar12);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
          lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar14 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar12);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar13);
            if (_DAT_7ffc3ebc2b50 == (void *)0x0) {
              uVar17 = FUN_7ffc3eb76c30(env,0x51);
              lVar16 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3ebadd31,0x7ffc3ebadd6b,0,0);
              if ((lVar16 != 0) &&
                 (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar16,uRam00007ffc3ebc0a00),
                 pvVar13 != (void *)0x0)) {
                _DAT_7ffc3ebc2b50 = (*(*env)->NewGlobalRef)(env,pvVar13);
              }
            }
            pvVar13 = _DAT_7ffc3ebc2b50;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar15 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1aa09695e8728da0);
            (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar11);
            pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar11 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar11);
              }
              lVar16 = FUN_7ffc3eb76c90(env,pvVar10,0xe0);
              if (lVar16 == 0) {
                return (void *)0x0;
              }
              iVar3 = FUN_7ffc3e7db1e0(env,pvVar10,lVar16);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar8,iVar2);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar10 != (void *)0x0) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                }
                if (2 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar14,
                                                     uVar19 ^ 0x6e1480151079);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
                    }
                    if (0 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
                      if (_DAT_7ffc3ebc2b58 == (void *)0x0) {
                        uVar17 = FUN_7ffc3eb76c30(env,0x51);
                        lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3ebadd6b,0,0);
                        if ((lVar8 != 0) &&
                           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar6 != (void *)0x0)) {
                          _DAT_7ffc3ebc2b58 = (*(*env)->NewGlobalRef)(env,pvVar6);
                        }
                      }
                      pvVar6 = _DAT_7ffc3ebc2b58;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar10);
                      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x1aae85d9edcd6a46);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar10);
                      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar19);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar10);
                      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (_DAT_7ffc3ebc2b60 == (void *)0x0) {
                        uVar17 = FUN_7ffc3eb76c30(env,0x51);
                        lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3eba64b4,0,0);
                        if ((lVar8 != 0) &&
                           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar10 != (void *)0x0)) {
                          _DAT_7ffc3ebc2b60 = (*(*env)->NewGlobalRef)(env,pvVar10);
                        }
                      }
                      pvVar10 = _DAT_7ffc3ebc2b60;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x1aafe6566379e853);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar19);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                      uVar17 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      iVar4 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
                      if (iVar4 < 0) {
LAB_7ffc3ea9671c:
                        pJVar7 = *env;
                        arg2 = (char *)0x7ffc3eba6048;
                        pvVar6 = pvRam00007ffc3ebc0a80;
                        goto LAB_7ffc3ea94814;
                      }
                      pvVar10 = (void *)FUN_7ffc3eb76c30(env,10);
                      pvVar10 = (*(*env)->NewObjectArray)(env,iVar4,pvVar10,(void *)0x0);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      iVar4 = 0;
                      while( true ) {
                        if (_DAT_7ffc3ebc2b68 == (void *)0x0) {
                          uVar17 = FUN_7ffc3eb76c30(env,0x51);
                          lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                   0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3eba64b4,0,0)
                          ;
                          if ((lVar8 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc2b68 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc2b68;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x1aafe6566379e853);
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar19);
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
                        uVar17 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        iVar5 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
                        if (iVar5 <= iVar4) goto LAB_7ffc3ea95b38;
                        if (_DAT_7ffc3ebc2b70 == (void *)0x0) {
                          uVar17 = FUN_7ffc3eb76c30(env,0x51);
                          lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                   0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3ebadd16,0,0)
                          ;
                          if ((lVar8 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc2b70 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc2b70;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x1aaed16dbdde5fc9);
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar19);
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
                        pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        pvVar12 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                        if (lVar8 == 0) {
                          return (void *)0x0;
                        }
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar8,iVar4);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        if (pvVar12 == (void *)0x0) break;
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
                        }
                        if (iVar5 < 2) goto LAB_7ffc3ea96624;
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
                        lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                        if (lVar8 == 0) {
                          return (void *)0x0;
                        }
                        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,
                                                           uVar19 ^ 0x3268704ab7eb);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar5 = (*(*env)->GetArrayLength)(env,pvVar12);
                        }
                        if (iVar5 < 1) goto LAB_7ffc3ea96624;
                        (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar13);
                        if (_DAT_7ffc3ebc2b78 == (void *)0x0) {
                          uVar17 = FUN_7ffc3eb76c30(env,0x51);
                          lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                   0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3ebadd6b,0,0)
                          ;
                          if ((lVar8 != 0) &&
                             (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                             pvVar13 != (void *)0x0)) {
                            _DAT_7ffc3ebc2b78 = (*(*env)->NewGlobalRef)(env,pvVar13);
                          }
                        }
                        pvVar13 = _DAT_7ffc3ebc2b78;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        pvVar15 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
                        (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,0x1aa09695e8728da0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar11);
                        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                           uRam00007ffc3ebc0918,uVar19);
                        (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar11);
                        pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar15)
                        ;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) {
                          return (void *)0x0;
                        }
                        if (pvVar10 == (void *)0x0) break;
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar5 = (*(*env)->GetArrayLength)(env,pvVar10);
                        }
                        if ((iVar4 < 0) || (iVar5 <= iVar4)) goto LAB_7ffc3ea96624;
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,iVar4,pvVar11);
                        iVar4 = iVar4 + 1;
                        iVar5 = iVar3;
                        while (iVar5 == 0) {
LAB_7ffc3ea95b38:
                          if (pvVar6 == (void *)0x0) goto LAB_7ffc3ea96641;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (0 < (int)((int)((longlong)uVar19 >> 0x3f) +
                                       (uint)(0 < (longlong)uVar19))) {
                            if (-1 < iVar5) {
                              pvVar11 = (*(*env)->NewByteArray)(env,iVar5);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return (void *)0x0;
                              }
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar4 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                              }
                              if ((iVar2 != -1) || (iVar5 = -0x80000000, !SBORROW4(0,iVar4))) {
                                iVar5 = iVar4 / iVar2;
                              }
                              if (_DAT_7ffc3ebc2b80 == (void *)0x0) {
                                uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                         0x7ffc3eba606c,0x7ffc3eba82ab,
                                                         0x7ffc3ebadd96,0,0);
                                if ((lVar8 != 0) &&
                                   (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                       uRam00007ffc3ebc0a00),
                                   pvVar12 != (void *)0x0)) {
                                  _DAT_7ffc3ebc2b80 = (*(*env)->NewGlobalRef)(env,pvVar12);
                                }
                              }
                              pvVar12 = _DAT_7ffc3ebc2b80;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar13 = (*(*env)->NewObjectArray)
                                                    (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                   uRam00007ffc3ebc0998,0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar15);
                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                   uRam00007ffc3ebc0998,iVar5);
                                (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar15);
                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,
                                                                   0x1aa102f190080c5a);
                                (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar15);
                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,uVar19);
                                (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar15);
                                pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40)
                                ;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc2b88 == (void *)0x0) {
                                    uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                    lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,
                                                             0x7ffc3eba6478,0x7ffc3eba606c,
                                                             0x7ffc3ebadd31,0x7ffc3ebaddb9,0,0);
                                    if ((lVar8 != 0) &&
                                       (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar13 != (void *)0x0)) {
                                      _DAT_7ffc3ebc2b88 = (*(*env)->NewGlobalRef)(env,pvVar13);
                                    }
                                  }
                                  pvVar13 = _DAT_7ffc3ebc2b88;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar15 = (*(*env)->NewObjectArray)
                                                        (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar12);
                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                       uRam00007ffc3ebc0918,
                                                                       0x1aa32f91e151a0db);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                       uRam00007ffc3ebc0918,uVar19);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar12);
                                    pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,
                                                                       uRam00007ffc3ebc0a40);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (_DAT_7ffc3ebc2b90 == (void *)0x0) {
                                        uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                        uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaddec,uVar17);
                                        uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                        uVar18 = FUN_7ffc3eb76c30(env,0x51);
                                        uStack_50 = FUN_7ffc3eb770c0(env,uVar17,5,uVar18,
                                                                     0x7ffc3ebaddf1,0x7ffc3ebaddf3);
                                        uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                        uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaddec,uVar17);
                                        uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                        lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3eba7587,
                                                                 0x7ffc3eba75aa,0x7ffc3eba75b6,
                                                                 0x7ffc3ebaae39,0x7ffc3ebade01,
                                                                 &uStack_58,3);
                                        if ((lVar8 != 0) &&
                                           (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                               uRam00007ffc3ebc0a00)
                                           , pvVar13 != (void *)0x0)) {
                                          _DAT_7ffc3ebc2b90 = (*(*env)->NewGlobalRef)(env,pvVar13);
                                        }
                                      }
                                      pvVar13 = _DAT_7ffc3ebc2b90;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar15 = (*(*env)->NewObjectArray)
                                                            (env,6,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,0,receiver);
                                        arg3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                        uRam00007ffc3ebc0998,iVar2);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,1,arg3);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar6);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar10);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,4,pvVar11);
                                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                          uRam00007ffc3ebc0918,
                                                                          uVar19 ^ 0x4bef8ea754c2);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,5,pvVar6);
                                        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,
                                                                          uRam00007ffc3ebc0a40);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          if (_DAT_7ffc3ebc2b98 == (void *)0x0) {
                                            uVar17 = FUN_7ffc3eb76c30(env,0x51);
                                            lVar8 = FUN_7ffc3eb77170(env,uVar17,6,0x7ffc3ebadcf7,
                                                                     0x7ffc3eba6478,0x7ffc3eba606c,
                                                                     0x7ffc3ebadd31,0x7ffc3eba626f,0
                                                                     ,0);
                                            if ((lVar8 != 0) &&
                                               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                                                                                                                      
                                                  uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0)) {
                                              _DAT_7ffc3ebc2b98 =
                                                   (*(*env)->NewGlobalRef)(env,pvVar10);
                                            }
                                          }
                                          pvVar10 = _DAT_7ffc3ebc2b98;
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            pvVar13 = (*(*env)->NewObjectArray)
                                                                (env,4,pvRam00007ffc3ebc09e0,
                                                                 (void *)0x0);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar12);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar6);
                                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1aa2607125c77750);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19)
                                            ;
                                            (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
                                            FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,
                                                             pvVar13);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (((bVar1 == 0) &&
                                                (lVar8 = FUN_7ffc3eb76c30(env,0xb), lVar8 != 0)) &&
                                               (lVar14 = FUN_7ffc3eb76c90(env,lVar8,0xb),
                                               lVar14 != 0)) {
                                              lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar14);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 == 0) {
                                                if (lVar8 != 0) {
                                                  return pvVar11;
                                                }
                                                lVar8 = FUN_7ffc3eb76c30(env,0x51);
                                                if ((lVar8 != 0) &&
                                                   (lVar14 = FUN_7ffc3eb76c90(env,lVar8,0xe1),
                                                   lVar14 != 0)) {
                                                  FUN_7ffc3e7e6a80(env,lVar8,lVar14,iVar3 + 1);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    return pvVar11;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              pvVar6 = (*(*env)->ExceptionOccurred)(env);
                              pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x24);
                              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar10);
                              if (bVar1 == 0) {
                                return (void *)0x0;
                              }
                              (*(*env)->ExceptionClear)(env);
                              lVar8 = FUN_7ffc3eb76c30(env,0x51);
                              if (lVar8 == 0) {
                                return (void *)0x0;
                              }
                              lVar14 = FUN_7ffc3eb76c90(env,lVar8,0xe2);
                              if (lVar14 == 0) {
                                return (void *)0x0;
                              }
                              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar14,pvVar6);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return (void *)0x0;
                              }
                              (*(*env)->Throw)(env,pvVar6);
                              return (void *)0x0;
                            }
                            goto LAB_7ffc3ea9671c;
                          }
                        }
                      }
                      goto LAB_7ffc3ea96641;
                    }
                  }
                }
                goto LAB_7ffc3ea96624;
              }
            }
LAB_7ffc3ea96641:
            pJVar7 = *env;
            goto LAB_7ffc3ea9480d;
          }
        }
LAB_7ffc3ea96624:
        pJVar7 = *env;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar6 = pvRam00007ffc3ebc0a98;
        goto LAB_7ffc3ea94814;
      }
    }
    pJVar7 = *env;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar6 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3ea94814:
  (*pJVar7->ThrowNew)(env,pvVar6,arg2);
  return (void *)0x0;
}

/* JNI_3X_3_3 | RVA 0x2c6740 | 3X.3([Ljava/lang/Object;)[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_3_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  JNINativeInterface_ *pJVar6;
  longlong lVar7;
  ulonglong uVar8;
  void *pvVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  void *pvVar13;
  undefined8 uVar14;
  longlong lVar15;
  undefined8 uVar16;
  void *arg3;
  int iVar17;
  ulonglong uVar18;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3ea98862;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar4 < 1) goto LAB_7ffc3ea98845;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar6 = *env;
  if (pvVar5 == (void *)0x0) {
LAB_7ffc3ea967c9:
    arg2 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
  }
  else {
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 != 0) {
      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar7 == 0) {
        return (void *)0x0;
      }
      uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar4 < 2) goto LAB_7ffc3ea98845;
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pvVar9 = (void *)FUN_7ffc3eb76c30(env,10);
      if (pvVar9 == (void *)0x0) {
        return (void *)0x0;
      }
      if ((pvVar5 == (void *)0x0) ||
         (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar9), bVar1 != 0)) {
        pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x51);
        if (pvVar9 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar9,0x5b);
        if (pvVar10 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar18 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar10 + 0x10));
        }
        else {
          uVar18 = (*(*env)->GetStaticLongField)(env,pvVar9,pvVar10);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (_DAT_7ffc3ebc2ba0 == (void *)0x0) {
          uVar14 = FUN_7ffc3eb76c30(env,0x51);
          lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba7466,0x7ffc3ebadd16,0,0);
          if ((lVar7 != 0) &&
             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar10 != (void *)0x0)) {
            _DAT_7ffc3ebc2ba0 = (*(*env)->NewGlobalRef)(env,pvVar10);
          }
        }
        pvVar10 = _DAT_7ffc3ebc2ba0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar18 = uVar18 ^ uVar8;
        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x4e9eb87c7e210bf9);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
        pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
        if (lVar7 == 0) {
          return (void *)0x0;
        }
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar7,0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea98862;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
        }
        if (1 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
          lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar7 == 0) {
            return (void *)0x0;
          }
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
          }
          if (0 < iVar4) {
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
            if (_DAT_7ffc3ebc2ba8 == (void *)0x0) {
              uVar14 = FUN_7ffc3eb76c30(env,0x51);
              lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3ebadd31,0x7ffc3ebadd6b,0,0);
              if ((lVar7 != 0) &&
                 (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar12 != (void *)0x0)) {
                _DAT_7ffc3ebc2ba8 = (*(*env)->NewGlobalRef)(env,pvVar12);
              }
            }
            pvVar12 = _DAT_7ffc3ebc2ba8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar10);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar11);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x4e90ff842b8dd990);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar18
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar10 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
              }
              lVar7 = FUN_7ffc3eb76c90(env,pvVar9,0xe3);
              if (lVar7 == 0) {
                return (void *)0x0;
              }
              iVar2 = FUN_7ffc3e7db1e0(env,pvVar9,lVar7);
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
                iVar3 = iVar3 + iVar4 + -1;
                if ((iVar4 != -1) || (iVar17 = -0x80000000, !SBORROW4(0,iVar3))) {
                  iVar17 = iVar3 / iVar4;
                }
                if (-1 < iVar17 * iVar4) {
                  pvVar9 = (*(*env)->NewByteArray)(env,iVar17 * iVar4);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (_DAT_7ffc3ebc2bb0 == (void *)0x0) {
                    uVar14 = FUN_7ffc3eb76c30(env,0x51);
                    lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba82ab,0x7ffc3ebad990,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar10 != (void *)0x0)) {
                      _DAT_7ffc3ebc2bb0 = (*(*env)->NewGlobalRef)(env,pvVar10);
                    }
                  }
                  pvVar10 = _DAT_7ffc3ebc2bb0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  pvVar11 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0)
                  ;
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar9);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0)
                  ;
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                    iVar3);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,4,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x4e902a4d0822cb6e);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,5,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar18);
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,6,pvVar5);
                  FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (_DAT_7ffc3ebc2bb8 == (void *)0x0) {
                    uVar14 = FUN_7ffc3eb76c30(env,0x51);
                    lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3eba64b4,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc2bb8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc2bb8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x4e9f8f47a086bc63);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar18);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar11);
                  uVar14 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  iVar3 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                  if (-1 < iVar3) {
                    pvVar5 = (void *)FUN_7ffc3eb76c30(env,10);
                    pvVar5 = (*(*env)->NewObjectArray)(env,iVar3,pvVar5,(void *)0x0);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    iVar3 = 0;
                    do {
                      if (_DAT_7ffc3ebc2bc0 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3eba64b4,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar10 != (void *)0x0)) {
                          _DAT_7ffc3ebc2bc0 = (*(*env)->NewGlobalRef)(env,pvVar10);
                        }
                      }
                      pvVar10 = _DAT_7ffc3ebc2bc0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x4e9f8f47a086bc63);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                      uVar14 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      iVar17 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                      if (iVar17 <= iVar3) goto LAB_7ffc3ea97c8a;
                      if (_DAT_7ffc3ebc2bc8 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3ebadd16,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar10 != (void *)0x0)) {
                          _DAT_7ffc3ebc2bc8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                        }
                      }
                      pvVar10 = _DAT_7ffc3ebc2bc8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x4e9eb87c7e210bf9);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                      pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                      if (lVar7 == 0) {
                        return (void *)0x0;
                      }
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar7,iVar3);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (pvVar11 == (void *)0x0) goto LAB_7ffc3ea98862;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar17 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                         (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar17 = (*(*env)->GetArrayLength)(env,pvVar11);
                      }
                      if (iVar17 < 2) goto LAB_7ffc3ea98845;
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                      if (lVar7 == 0) {
                        return (void *)0x0;
                      }
                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar7,
                                                         uVar18 ^ 0x5b79b3b5e3db);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar17 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                         (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar17 = (*(*env)->GetArrayLength)(env,pvVar11);
                      }
                      if (iVar17 < 1) goto LAB_7ffc3ea98845;
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                      if (_DAT_7ffc3ebc2bd0 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3ebadd6b,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar12 != (void *)0x0)) {
                          _DAT_7ffc3ebc2bd0 = (*(*env)->NewGlobalRef)(env,pvVar12);
                        }
                      }
                      pvVar12 = _DAT_7ffc3ebc2bd0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar10);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar11);
                      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x4e90ff842b8dd990);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar10);
                      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar10);
                      pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea98862;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar17 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                         (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar17 = (*(*env)->GetArrayLength)(env,pvVar5);
                      }
                      if (iVar17 <= iVar3) goto LAB_7ffc3ea98845;
                      (*(*env)->SetObjectArrayElement)(env,pvVar5,iVar3,pvVar10);
                      iVar3 = iVar3 + 1;
                    } while (iVar2 == 0);
                    (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e8,(void *)0x0);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    lVar7 = FUN_7ffc3eb76c30(env,0xb);
                    if (lVar7 == 0) {
                      return (void *)0x0;
                    }
                    lVar15 = FUN_7ffc3eb76c90(env,lVar7,10);
                    if (lVar15 == 0) {
                      return (void *)0x0;
                    }
                    FUN_7ffc3e7e6a80(env,lVar7,lVar15);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
LAB_7ffc3ea97c8a:
                    if (pvVar9 != (void *)0x0) {
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar9);
                      }
                      if (iVar2 < 0) goto LAB_7ffc3ea98891;
                      pvVar10 = (*(*env)->NewByteArray)(env,iVar2);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar9);
                      }
                      if ((iVar4 != -1) || (iVar3 = -0x80000000, !SBORROW4(0,iVar2))) {
                        iVar3 = iVar2 / iVar4;
                      }
                      if (_DAT_7ffc3ebc2bd8 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3eba82ab,0x7ffc3ebadd96,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc2bd8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc2bd8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar13);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,iVar3);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x4e916be053f7586a);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar13);
                      pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (_DAT_7ffc3ebc2be0 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3ebaddb9,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar12 != (void *)0x0)) {
                          _DAT_7ffc3ebc2be0 = (*(*env)->NewGlobalRef)(env,pvVar12);
                        }
                      }
                      pvVar12 = _DAT_7ffc3ebc2be0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar11);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x4e93468022aef4eb);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar11);
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar11);
                      pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (_DAT_7ffc3ebc2be8 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaddec,uVar14);
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        uVar16 = FUN_7ffc3eb76c30(env,0x51);
                        uStack_50 = FUN_7ffc3eb770c0(env,uVar14,5,uVar16,0x7ffc3eba7733,
                                                     0x7ffc3ebade31);
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaddec,uVar14);
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                                 0x7ffc3eba75b6,0x7ffc3ebaae39,0x7ffc3ebade3f,
                                                 &uStack_58,3);
                        if ((lVar7 != 0) &&
                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar12 != (void *)0x0)) {
                          _DAT_7ffc3ebc2be8 = (*(*env)->NewGlobalRef)(env,pvVar12);
                        }
                      }
                      pvVar12 = _DAT_7ffc3ebc2be8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,6,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,receiver);
                      arg3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                      iVar4);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,arg3);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar9);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar5);
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar18 ^ 0xfe07d39faae)
                      ;
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar5);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,5,pvVar10);
                      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (_DAT_7ffc3ebc2bf0 == (void *)0x0) {
                        uVar14 = FUN_7ffc3eb76c30(env,0x51);
                        lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3eba626f,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar9 != (void *)0x0)) {
                          _DAT_7ffc3ebc2bf0 = (*(*env)->NewGlobalRef)(env,pvVar9);
                        }
                      }
                      pvVar9 = _DAT_7ffc3ebc2bf0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar11);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar5);
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x4e920960e6382360);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar5);
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
                      FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                      if (lVar7 == 0) {
                        return (void *)0x0;
                      }
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar7,
                                                        uVar18 ^ 0x23ec8b661b2a);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (pvVar5 != (void *)0x0) {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                        }
                        if (1 < iVar4) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                          }
                          if (0 < iVar4) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar10);
                            if (_DAT_7ffc3ebc2bf8 == (void *)0x0) {
                              uVar14 = FUN_7ffc3eb76c30(env,0x51);
                              lVar7 = FUN_7ffc3eb77170(env,uVar14,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                       0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3ebadd6b,
                                                       0,0);
                              if ((lVar7 != 0) &&
                                 (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar9 != (void *)0x0)) {
                                _DAT_7ffc3ebc2bf8 = (*(*env)->NewGlobalRef)(env,pvVar9);
                              }
                            }
                            pvVar9 = _DAT_7ffc3ebc2bf8;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x4e91b2d263e7ee93);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar18);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,
                                                              pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            return pvVar5;
                          }
                        }
                        goto LAB_7ffc3ea98845;
                      }
                    }
                    goto LAB_7ffc3ea98862;
                  }
                }
LAB_7ffc3ea98891:
                pJVar6 = *env;
                arg2 = (char *)0x7ffc3eba6048;
                pvVar5 = pvRam00007ffc3ebc0a80;
                goto LAB_7ffc3ea967d0;
              }
            }
LAB_7ffc3ea98862:
            pJVar6 = *env;
            goto LAB_7ffc3ea967c9;
          }
        }
LAB_7ffc3ea98845:
        pJVar6 = *env;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar5 = pvRam00007ffc3ebc0a98;
        goto LAB_7ffc3ea967d0;
      }
    }
    pJVar6 = *env;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar5 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3ea967d0:
  (*pJVar6->ThrowNew)(env,pvVar5,arg2);
  return (void *)0x0;
}

/* JNI_3X_7_4 | RVA 0x2c88b0 | 3X.7([Ljava/lang/Object;)[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_7_4(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  uint arg2;
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  ulonglong uVar6;
  JNINativeInterface_ *pJVar7;
  void *pvVar8;
  undefined8 uVar9;
  void *pvVar10;
  longlong lVar11;
  int iVar12;
  int iVar13;
  ulonglong uVar14;
  uint uVar15;
  char *arg2_00;
  longlong *plVar16;
  bool bVar17;
  byte bStack_55;
  uint uStack_54;
  int iStack_50;
  int iStack_4c;
  void *pvStack_48;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3ea99074:
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
LAB_7ffc3ea99143:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea98a82;
    }
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,10);
    if (pvVar4 == (void *)0x0) {
      return (void *)0x0;
    }
    if ((pvVar3 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4), bVar1 == 0))
    {
LAB_7ffc3ea99160:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar3 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea98a82;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar2 < 2) goto LAB_7ffc3ea99143;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
    pJVar7 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) goto LAB_7ffc3ea99160;
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uVar6 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 3) goto LAB_7ffc3ea99143;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
      pJVar7 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3ea98a7b;
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) goto LAB_7ffc3ea99160;
      lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      iVar2 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x51);
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x5b);
      if (pvVar8 == (void *)0x0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar14 = *(ulonglong *)
                  (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                  (longlong)*(int *)((longlong)pvVar8 + 0x10));
      }
      else {
        uVar14 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar8);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar3 == (void *)0x0) goto LAB_7ffc3ea99074;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar13 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
        if (iVar2 != -1) goto LAB_7ffc3ea98bbb;
LAB_7ffc3ea98bb2:
        iVar12 = 0;
        if (!SBORROW4(0,iVar13)) goto LAB_7ffc3ea98bbb;
      }
      else {
        iVar13 = (*(*env)->GetArrayLength)(env,pvVar3);
        if (iVar2 == -1) goto LAB_7ffc3ea98bb2;
LAB_7ffc3ea98bbb:
        iVar12 = iVar13 % iVar2;
      }
      lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0xe3);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      uStack_54 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar13 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar13 = (*(*env)->GetArrayLength)(env,pvVar3);
      }
      iVar13 = iVar13 + (iVar2 - iVar12);
      if (iVar13 < 0) {
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar3 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3ea98a82;
      }
      pvVar4 = (*(*env)->NewByteArray)(env,iVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar13 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar13 = (*(*env)->GetArrayLength)(env,pvVar3);
      }
      if (_DAT_7ffc3ebc2c00 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x51);
        lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba82ab,0x7ffc3ebad990,0,0);
        if ((lVar5 != 0) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0
           )) {
          _DAT_7ffc3ebc2c00 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
      }
      pvStack_48 = _DAT_7ffc3ebc2c00;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      uVar14 = uVar14 ^ uVar6;
      iStack_50 = iVar2 - iVar12;
      pvVar8 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
      iStack_4c = iVar13;
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,iStack_4c);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,4,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x855f125adae800a1);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,5,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,6,pvVar10);
      FUN_7ffc3e7d1a50(env,pvStack_48,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        uVar15 = *(uint *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        uVar15 = (*(*env)->GetArrayLength)(env,pvVar3);
      }
      iVar2 = iStack_50;
      if (pvVar4 != (void *)0x0) {
        plVar16 = (longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc);
        bVar17 = uStack_54 != 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar13 = *(int *)(*plVar16 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar13 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (iVar13 <= (int)uVar15) {
            return pvVar4;
          }
          arg2 = uVar15;
          if ((longlong)uVar14 < 0) {
            arg2 = uStack_54;
          }
          if (bVar17 && -1 < (longlong)uVar14) {
            return pvVar4;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar13 = *(int *)(*plVar16 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar13 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (((int)arg2 < 0) || (iVar13 <= (int)arg2)) break;
          bStack_55 = (byte)iVar2;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(byte *)(*plVar16 + (ulonglong)arg2 + (ulonglong)uRam00007ffc3ebc08f0) = bStack_55;
          }
          else {
            (*(*env)->SetByteArrayRegion)(env,pvVar4,arg2,1,&bStack_55);
          }
          uVar15 = uVar15 + 1;
          if (uStack_54 != 0) {
            return pvVar4;
          }
        }
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a98,(char *)0x7ffc3eba6019);
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        (*(*env)->ExceptionClear)(env);
        lVar5 = FUN_7ffc3eb76c30(env,0x51);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar11 = FUN_7ffc3eb76c90(env,lVar5,0xe2);
        if (lVar11 == 0) {
          return (void *)0x0;
        }
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar11,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        (*(*env)->Throw)(env,pvVar3);
        return (void *)0x0;
      }
      goto LAB_7ffc3ea99074;
    }
  }
LAB_7ffc3ea98a7b:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea98a82:
  (*pJVar7->ThrowNew)(env,pvVar3,arg2_00);
  return (void *)0x0;
}

/* JNI_3X_0_5 | RVA 0x2c91a0 | 3X.0([Ljava/lang/Object;)[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_0_5(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  undefined4 uVar7;
  void *pvVar8;
  void *pvVar9;
  JNINativeInterface_ *pJVar10;
  longlong lVar11;
  ulonglong uVar12;
  void *pvVar13;
  ulonglong uVar14;
  void *pvVar15;
  undefined8 uVar16;
  void *arg1;
  longlong lVar17;
  byte *arg4;
  char *pcVar18;
  byte bStack_51;
  ulonglong uStack_50;
  void *pvStack_48;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3ea9a6c3:
    pJVar10 = *env;
LAB_7ffc3ea992ae:
    pcVar18 = &DAT_7ffc3eba6000;
    pvVar9 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea992b5:
    (*pJVar10->ThrowNew)(env,pvVar9,pcVar18);
    return (void *)0x0;
  }
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) {
LAB_7ffc3ea9a6a6:
    pJVar10 = *env;
    pcVar18 = (char *)0x7ffc3eba6019;
    pvVar9 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3ea992b5;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pvVar9 = (void *)FUN_7ffc3eb76c30(env,10);
  if (pvVar9 == (void *)0x0) {
    return (void *)0x0;
  }
  if ((pvVar8 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9), bVar1 == 0)) {
LAB_7ffc3ea9a6d5:
    pJVar10 = *env;
    pcVar18 = (char *)0x7ffc3eba6033;
    pvVar9 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3ea992b5;
  }
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 2) goto LAB_7ffc3ea9a6a6;
  pvVar9 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pJVar10 = *env;
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea992ae;
  bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar9,pvRam00007ffc3ebc0958);
  if (bVar1 == 0) goto LAB_7ffc3ea9a6d5;
  lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar11 == 0) {
    return (void *)0x0;
  }
  uVar12 = FUN_7ffc3e7d1a20(env,pvVar9,lVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar9 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar9,0x5b);
  if (pvVar13 == (void *)0x0) {
    return (void *)0x0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar14 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar13 + 0x10));
  }
  else {
    uVar14 = (*(*env)->GetStaticLongField)(env,pvVar9,pvVar13);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar11 = FUN_7ffc3eb76c90(env,pvVar9,0xe0);
  if (lVar11 == 0) {
    return (void *)0x0;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,pvVar9,lVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea9a6c3;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3ea99431:
    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar5 = (*(*env)->GetArrayLength)(env,pvVar8);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3ea99431;
    iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((iVar5 < 1) || (iVar4 < iVar5)) goto LAB_7ffc3ea9a6a6;
  pvStack_48 = receiver;
  if (bRam00007ffc3ebc08e5 == 1) {
    arg4 = (byte *)((ulonglong)(iVar5 - 1U) + (ulonglong)uRam00007ffc3ebc08f0 +
                   *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc));
  }
  else {
    arg4 = &bStack_51;
    (*(*env)->GetByteArrayRegion)(env,pvVar8,iVar5 - 1U,1,arg4);
  }
  bVar1 = *arg4;
  if (_DAT_7ffc3ebc2b08 == (void *)0x0) {
    uVar16 = FUN_7ffc3eb76c30(env,0x51);
    lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6299,0x7ffc3eba606c,
                              0x7ffc3ebade6f,0x7ffc3eba647c,0,0);
    if ((lVar11 != 0) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0))
    {
      _DAT_7ffc3ebc2b08 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
  }
  pvVar9 = _DAT_7ffc3ebc2b08;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  uStack_50 = uVar14 ^ uVar12;
  uVar12 = uStack_50 ^ 0x19b59c3550b34f89;
  pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x609f);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar15);
  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar15);
  uVar16 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar13);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return (void *)0x0;
  }
  uVar6 = FUN_7ffc3e7d8be0(env,uVar16,uRam00007ffc3ebc09d0);
  uVar12 = uStack_50;
  if (iVar3 == 0) {
LAB_7ffc3ea99d8c:
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x28);
    if (pvVar8 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->AllocObject)(env,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar9 != (void *)0x0) {
      lVar11 = FUN_7ffc3eb76c90(env,pvVar8,0x66);
      if (lVar11 == 0) {
        return (void *)0x0;
      }
      FUN_7ffc3e7dbbc0(env,pvVar9,pvVar8,lVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x29);
      pvVar8 = (*(*env)->NewObjectArray)(env,0,pvVar8,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (_DAT_7ffc3ebc2b38 == (void *)0x0) {
        uVar16 = FUN_7ffc3eb76c30(env,0x51);
        lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                  0x7ffc3ebadd31,0x7ffc3eba626f,0,0);
        if ((lVar11 != 0) &&
           (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
           pvVar13 != (void *)0x0)) {
          _DAT_7ffc3ebc2b38 = (*(*env)->NewGlobalRef)(env,pvVar13);
        }
      }
      pvVar13 = _DAT_7ffc3ebc2b38;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pvVar15 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xda336490bb374814);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_50);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar8);
      FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      pJVar10 = *env;
      goto LAB_7ffc3ea99f65;
    }
    goto LAB_7ffc3ea9a6c3;
  }
  uVar6 = uVar6 & (int)(char)bVar1;
  if ((int)uVar6 < 1) {
LAB_7ffc3ea99a85:
    if (_DAT_7ffc3ebc2b20 == (void *)0x0) {
      uVar16 = FUN_7ffc3eb76c30(env,0x51);
      lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                0x7ffc3eba82ab,0x7ffc3eba74f4,0,0);
      if ((lVar11 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc2b20 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc2b20;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0xda3d205c2b0224cf);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar13);
      pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvStack_48 = pvVar8;
        if (_DAT_7ffc3ebc2b28 == (void *)0x0) {
          uVar16 = FUN_7ffc3eb76c30(env,0x51);
          lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6299,0x7ffc3eba606c,
                                    0x7ffc3ebade6f,0x7ffc3eba647c,0,0);
          if ((lVar11 != 0) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc2b28 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
        }
        pvVar8 = _DAT_7ffc3ebc2b28;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2a1b);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar13);
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar12 ^ 0x78ee794566f7850c);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar13);
          uVar16 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            uVar7 = FUN_7ffc3e7d8be0(env,uVar16,uRam00007ffc3ebc09d0);
            if (_DAT_7ffc3ebc2b30 == (void *)0x0) {
              uVar16 = FUN_7ffc3eb76c30(env,0x51);
              lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3ebadd31,0x7ffc3eba7293,0,0);
              if ((lVar11 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc2b30 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc2b30;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvStack_48);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar7
                                                );
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xda33c0499c1a9ff4);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar12);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar13);
              FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) goto LAB_7ffc3ea99d8c;
            }
          }
        }
      }
    }
LAB_7ffc3ea9a862:
    pvVar8 = (*(*env)->ExceptionOccurred)(env);
  }
  else {
    iVar5 = (int)((longlong)uStack_50 >> 0x3f);
    iVar3 = iVar5 + (uint)(0 < (longlong)uStack_50);
    if (iVar3 == 0 || SCARRY4(iVar5,(uint)(0 < (longlong)uStack_50)) != iVar3 < 0) {
LAB_7ffc3ea9a1b4:
      pvVar9 = (*(*env)->NewByteArray)(env,uVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (pvVar9 != (void *)0x0) {
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
        }
        if (_DAT_7ffc3ebc2b40 == (void *)0x0) {
          uVar16 = FUN_7ffc3eb76c30(env,0x51);
          lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                    0x7ffc3eba82ab,0x7ffc3ebad990,0,0);
          if ((lVar11 != 0) &&
             (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar13 != (void *)0x0)) {
            _DAT_7ffc3ebc2b40 = (*(*env)->NewGlobalRef)(env,pvVar13);
          }
        }
        pvVar13 = _DAT_7ffc3ebc2b40;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar15 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar8);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar9);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,iVar3);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,4,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xda3c36b312645fc2);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,5,pvVar8);
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_50);
        (*(*env)->SetObjectArrayElement)(env,pvVar15,6,pvVar8);
        FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar15);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar9;
      }
      goto LAB_7ffc3ea9a6c3;
    }
    if (_DAT_7ffc3ebc2b10 == (void *)0x0) {
      uVar16 = FUN_7ffc3eb76c30(env,0x51);
      lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                0x7ffc3eba7466,0x7ffc3ebadd16,0,0);
      if ((lVar11 != 0) &&
         (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc2b10 = (*(*env)->NewGlobalRef)(env,pvVar9);
      }
    }
    pvVar9 = _DAT_7ffc3ebc2b10;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    pvVar13 = pvStack_48;
    if (bVar1 == 0) {
      pvVar15 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0xda32a48264679f55);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar13);
      pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7), lVar11 != 0)) {
          pvVar15 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar11,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (pvVar13 == (void *)0x0) {
LAB_7ffc3ea9a70c:
              pJVar10 = *env;
              pcVar18 = &DAT_7ffc3eba6000;
              pvVar8 = pvRam00007ffc3ebc0a70;
            }
            else {
              if (bRam00007ffc3ebc08e5 == 1) {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar13);
              }
              if (1 < iVar3) {
                (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar15);
                lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                if (lVar11 != 0) {
                  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar11,
                                                     uVar12 ^ 0x4787a9f37777);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (bRam00007ffc3ebc08e5 == 1) {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar13);
                    }
                    if (iVar3 < 1) goto LAB_7ffc3ea9a6f2;
                    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar15);
                    if (_DAT_7ffc3ebc2b18 == (void *)0x0) {
                      uVar16 = FUN_7ffc3eb76c30(env,0x51);
                      lVar11 = FUN_7ffc3eb77170(env,uVar16,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3ebadd6b,0,0);
                      if ((lVar11 != 0) &&
                         (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                         pvVar15 != (void *)0x0)) {
                        _DAT_7ffc3ebc2b18 = (*(*env)->NewGlobalRef)(env,pvVar15);
                      }
                    }
                    pvVar15 = _DAT_7ffc3ebc2b18;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar9);
                      (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar13);
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xda3ce37a31cb4d3c);
                      (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar9);
                      uVar12 = uStack_50;
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uStack_50);
                      (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar9);
                      pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,arg1);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (pvVar9 != (void *)0x0) {
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
                          }
                          if (iVar3 < (int)uVar6) goto LAB_7ffc3ea99a85;
                          if (bRam00007ffc3ebc08e5 == 1) {
                            uVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8) - uVar6;
                            pvVar9 = pvRam00007ffc3ebc0a80;
                          }
                          else {
                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar8);
                            uVar6 = iVar3 - uVar6;
                            pvVar9 = pvRam00007ffc3ebc0a80;
                          }
                          pvRam00007ffc3ebc0a80 = pvVar9;
                          if ((int)uVar6 < 0) {
                            pJVar10 = *env;
                            pcVar18 = (char *)0x7ffc3eba6048;
                            goto LAB_7ffc3ea992b5;
                          }
                          goto LAB_7ffc3ea9a1b4;
                        }
                        goto LAB_7ffc3ea9a70c;
                      }
                    }
                  }
                }
                goto LAB_7ffc3ea9a726;
              }
LAB_7ffc3ea9a6f2:
              pJVar10 = *env;
              pcVar18 = (char *)0x7ffc3eba6019;
              pvVar8 = pvRam00007ffc3ebc0a98;
            }
            (*pJVar10->ThrowNew)(env,pvVar8,pcVar18);
          }
        }
      }
    }
LAB_7ffc3ea9a726:
    pvVar8 = (*(*env)->ExceptionOccurred)(env);
    pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar11 = FUN_7ffc3eb76c30(env,0x51);
      if ((lVar11 != 0) && (lVar17 = FUN_7ffc3eb76c90(env,lVar11,0xe2), lVar17 != 0)) {
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar17,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar8 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3ea9a7ce;
        }
        (*(*env)->Throw)(env,pvVar8);
      }
      pvVar8 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3ea9a7ce:
    pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    (*(*env)->ExceptionClear)(env);
    lVar11 = FUN_7ffc3eb76c30(env,0x51);
    if ((lVar11 == 0) || (lVar17 = FUN_7ffc3eb76c90(env,lVar11,0xe2), lVar17 == 0))
    goto LAB_7ffc3ea9a862;
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar17,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      (*(*env)->Throw)(env,pvVar8);
      goto LAB_7ffc3ea9a862;
    }
    pvVar8 = (*(*env)->ExceptionOccurred)(env);
  }
  pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9);
  if (bVar1 == 0) {
    return (void *)0x0;
  }
  (*(*env)->ExceptionClear)(env);
  lVar11 = FUN_7ffc3eb76c30(env,0x51);
  if (lVar11 == 0) {
    return (void *)0x0;
  }
  lVar17 = FUN_7ffc3eb76c90(env,lVar11,0xe2);
  if (lVar17 == 0) {
    return (void *)0x0;
  }
  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar17,pvVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pJVar10 = *env;
LAB_7ffc3ea99f65:
  (*pJVar10->Throw)(env,pvVar9);
  return (void *)0x0;
}

/* JNI_3X_4_6 | RVA 0x2ca920 | 3X.4(I[B[[BJ[BI)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_3X_4_6(JNINativeInterface_ **env,void *receiver,int arg0,void *arg1,void *arg2,
               longlong arg3,void *arg4,int arg5)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  void *arg1_00;
  longlong lVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar12;
  char *arg2_00;
  ulonglong uVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if ((pvVar5 != (void *)0x0) &&
     (pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x5b), pvVar6 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar13 = *(ulonglong *)
                (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                (longlong)*(int *)((longlong)pvVar6 + 0x10));
    }
    else {
      uVar13 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar6);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,pvVar5,0xe0), lVar7 != 0)) {
      iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (arg0 < 0) {
          UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
          arg2_00 = (char *)0x7ffc3eba6048;
          pvVar5 = pvRam00007ffc3ebc0a80;
LAB_7ffc3ea9bcbb:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea9bcce. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2_00);
          return;
        }
        pvVar5 = (*(*env)->NewByteArray)(env,arg0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc2400 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x51);
            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3eba82ab,0x7ffc3ebad990,0,0);
            if ((lVar7 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc2400 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc2400;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            uVar13 = uVar13 ^ arg3;
            pvVar8 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,arg1);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                              arg5 * arg0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,arg0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,4,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x3bb81abfe43bbe46);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,5,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,6,pvVar9);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc2408 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,0x51);
                lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3eba7466,0x7ffc3eba64b4,0,0);
                if ((lVar7 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2408 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2408;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x3bb7bfb54c9fc94b);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                uVar10 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  iVar3 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                  iVar3 = iVar3 + -1;
LAB_7ffc3ea9adb0:
                  if (iVar3 < 0) goto LAB_7ffc3ea9b62e;
                  iVar4 = iVar3;
                  if ((int)((int)((longlong)uVar13 >> 0x3f) + (uint)(0 < (longlong)uVar13)) < 0)
                  goto joined_r0x7ffc3ea9af44;
                  if (_DAT_7ffc3ebc2410 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x51);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3eba64b4,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar6 != (void *)0x0)) {
                      _DAT_7ffc3ebc2410 = (*(*env)->NewGlobalRef)(env,pvVar6);
                    }
                  }
                  pvVar6 = _DAT_7ffc3ebc2410;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x3bb7bfb54c9fc94b);
                    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar13);
                    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                    uVar10 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) goto LAB_7ffc3ea9bcd1;
                    iVar4 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                    if (iVar3 < iVar4 + -1) {
                      FUN_7ffc3ea9be20(env,pvVar5);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) goto LAB_7ffc3ea9bcd1;
                    }
                    if (arg2 == (void *)0x0) {
LAB_7ffc3ea9bc86:
                      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                      arg2_00 = &DAT_7ffc3eba6000;
                      pvVar5 = pvRam00007ffc3ebc0a70;
                    }
                    else {
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)arg2 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,arg2);
                      }
                      if (iVar3 < iVar4) {
                        pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg2,iVar3);
                        uVar14 = (ulonglong)pvVar6 >> 0x20;
                        uVar15 = (ulonglong)pvVar5 >> 0x20;
                        pvVar8 = pvVar5;
                        do {
                          pvVar9 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea9bc86;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
                          }
                          pJVar12 = *env;
                          if (iVar4 < 3) {
LAB_7ffc3ea9bca3:
                            UNRECOVERED_JUMPTABLE = pJVar12->ThrowNew;
                            goto LAB_7ffc3ea9bcb1;
                          }
                          (*pJVar12->SetObjectArrayElement)
                                    (env,pvVar9,2,
                                     (void *)((ulonglong)pvVar6 & 0xffffffff | uVar14 << 0x20));
                          lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                          if (lVar7 == 0) {
                            return;
                          }
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                            uVar13 ^ 0x46eb2491f1be);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
                          }
                          if (iVar4 < 2) break;
                          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar6);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar9);
                          }
                          pJVar12 = *env;
                          if (iVar4 < 1) goto LAB_7ffc3ea9bca3;
                          (*pJVar12->SetObjectArrayElement)
                                    (env,pvVar9,0,
                                     (void *)((ulonglong)pvVar8 & 0xffffffff | uVar15 << 0x20));
                          if (_DAT_7ffc3ebc2418 == (void *)0x0) {
                            uVar10 = FUN_7ffc3eb76c30(env,0x51);
                            lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                      0x7ffc3eba606c,0x7ffc3eba82ab,0x7ffc3eba743f,0
                                                      ,0);
                            if ((lVar11 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc2418 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc2418;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar8 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x3bba5520903b89fe)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar13);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc2420 == (void *)0x0) {
                            uVar10 = FUN_7ffc3eb76c30(env,0x51);
                            lVar11 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                      0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3ebadd50,0
                                                      ,0);
                            if ((lVar11 != 0) &&
                               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                               pvVar6 != (void *)0x0)) {
                              _DAT_7ffc3ebc2420 = (*(*env)->NewGlobalRef)(env,pvVar6);
                            }
                          }
                          pvVar6 = _DAT_7ffc3ebc2420;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar8 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x3bbb19e9599d0a99)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar13);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                          pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar8 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                            uVar13 ^ 0x53bcb1a694ec);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea9bc86;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
                          }
                          if (iVar4 < 2) break;
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
                          }
                          if (iVar4 < 1) break;
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
                          if (_DAT_7ffc3ebc2428 == (void *)0x0) {
                            uVar10 = FUN_7ffc3eb76c30(env,0x51);
                            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                     0x7ffc3eba606c,0x7ffc3ebadd31,0x7ffc3eba626f,0,
                                                     0);
                            if ((lVar7 != 0) &&
                               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                               pvVar9 != (void *)0x0)) {
                              _DAT_7ffc3ebc2428 = (*(*env)->NewGlobalRef)(env,pvVar9);
                            }
                          }
                          pvVar9 = _DAT_7ffc3ebc2428;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          arg1_00 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar6);
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar8);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x3bbaec3491084cad)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar13);
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar6);
                          FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          iVar3 = iVar3 + -1;
                          iVar4 = iVar2;
joined_r0x7ffc3ea9af44:
                          if (iVar4 != 0) goto LAB_7ffc3ea9adb0;
LAB_7ffc3ea9b62e:
                          pvVar6 = arg4;
                          uVar14 = (ulonglong)arg4 >> 0x20;
                          uVar15 = (ulonglong)arg4 >> 0x20;
                          pvVar8 = arg4;
                          if (-1 < (longlong)uVar13) {
                            (*(*env)->MonitorEnter)(env,arg4);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (_DAT_7ffc3ebc2430 == (void *)0x0) {
                              uVar10 = FUN_7ffc3eb76c30(env,0x51);
                              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                                       0x7ffc3eba606c,0x7ffc3eba82ab,0x7ffc3ebad990,
                                                       0,0);
                              if ((lVar7 != 0) &&
                                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar6 != (void *)0x0)) {
                                _DAT_7ffc3ebc2430 = (*(*env)->NewGlobalRef)(env,pvVar6);
                              }
                            }
                            pvVar6 = _DAT_7ffc3ebc2430;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar8 = (*(*env)->NewObjectArray)
                                                 (env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
                              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                uRam00007ffc3ebc0998,0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,arg4);
                              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                uRam00007ffc3ebc0998,arg5 * arg0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar5);
                              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                uRam00007ffc3ebc0998,arg0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,4,pvVar5);
                              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0x3bb81abfe43bbe46);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,5,pvVar5);
                              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar13);
                              (*(*env)->SetObjectArrayElement)(env,pvVar8,6,pvVar5);
                              FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              pJVar12 = *env;
                              if (bVar1 == 0) {
                                (*pJVar12->MonitorExit)(env,arg4);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  return;
                                }
                                goto LAB_7ffc3ea9bdb0;
                              }
                            }
                            else {
LAB_7ffc3ea9bdb0:
                              pJVar12 = *env;
                            }
                            pvVar5 = (*pJVar12->ExceptionOccurred)(env);
                            (*(*env)->ExceptionClear)(env);
                            pJVar12 = *env;
                            while( true ) {
                              (*pJVar12->MonitorExit)(env,arg4);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) break;
                              pvVar5 = (*(*env)->ExceptionOccurred)(env);
                              (*(*env)->ExceptionClear)(env);
                              pJVar12 = *env;
                            }
                            goto LAB_7ffc3ea9bd6c;
                          }
                        } while( true );
                      }
                      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
LAB_7ffc3ea9bcb1:
                      arg2_00 = (char *)0x7ffc3eba6019;
                      pvVar5 = pvRam00007ffc3ebc0a98;
                    }
                    goto LAB_7ffc3ea9bcbb;
                  }
LAB_7ffc3ea9bcd1:
                  pvVar5 = (*(*env)->ExceptionOccurred)(env);
                  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x24);
                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                  if (bVar1 != 0) {
                    (*(*env)->ExceptionClear)(env);
                    lVar7 = FUN_7ffc3eb76c30(env,0x51);
                    if ((lVar7 != 0) && (lVar11 = FUN_7ffc3eb76c90(env,lVar7,0xe2), lVar11 != 0)) {
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar11,pvVar5);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
LAB_7ffc3ea9bd6c:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea9bd8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                        (*(*env)->Throw)(env,pvVar5);
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

/* JNI_3X_6_7 | RVA 0x2cc740 | 3X.6(I[B[[B[BJI)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_3X_6_7(JNINativeInterface_ **env,void *receiver,int arg0,void *arg1,void *arg2,void *arg3,
               longlong arg4,int arg5)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  void *pvVar7;
  void *pvVar8;
  undefined8 uVar9;
  void *arg1_00;
  JNINativeInterface_ *pJVar10;
  longlong lVar11;
  Throw_prototype *UNRECOVERED_JUMPTABLE;
  int iVar12;
  ulonglong uVar14;
  int arg2_00;
  char *pcVar15;
  ulonglong uVar16;
  ulonglong uVar17;
  ulonglong uStack_a8;
  int iVar13;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x5b);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar16 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar16 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar4,0xe3);
  if (lVar6 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (arg0 < 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea9ded0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a80,(char *)0x7ffc3eba6048);
    return;
  }
  pvVar4 = (*(*env)->NewByteArray)(env,arg0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2438 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x51);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,0x7ffc3eba82ab
                             ,0x7ffc3ebad990,0,0);
    if ((lVar6 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc2438 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc2438;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar16 = uVar16 ^ arg4;
  arg2_00 = 0;
  pvVar7 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,arg1);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,arg5 * arg0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,arg0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,4,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc1e437a1d45a441a
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,5,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,6,pvVar8);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  iVar13 = (int)((longlong)uVar16 >> 0x3f);
  iVar12 = iVar13 + (uint)(0 < (longlong)uVar16);
  uStack_a8 = (ulonglong)arg3 >> 0x20;
LAB_7ffc3ea9cb20:
  if (_DAT_7ffc3ebc2440 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x51);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,0x7ffc3eba7466
                             ,0x7ffc3eba64b4,0,0);
    if ((lVar6 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc2440 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc2440;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xc1eb92ab7cfe3317
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
  uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7d8be0(env,uVar9);
  if (iVar3 <= arg2_00) goto LAB_7ffc3ea9d60c;
  if (_DAT_7ffc3ebc2448 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x51);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,0x7ffc3eba7466
                             ,0x7ffc3ebadd50,0,0);
    if ((lVar6 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc2448 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc2448;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc1e734f769fcf0c5);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)) {
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar16 ^ 0x63230d79ef33);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar7 == (void *)0x0) {
LAB_7ffc3ea9dc14:
            pJVar10 = *env;
            pcVar15 = &DAT_7ffc3eba6000;
            pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea9dc28:
            (*pJVar10->ThrowNew)(env,pvVar4,pcVar15);
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
            }
            if (iVar3 < 2) {
LAB_7ffc3ea9db36:
              pJVar10 = *env;
              pcVar15 = (char *)0x7ffc3eba6019;
              pvVar4 = pvRam00007ffc3ebc0a98;
              goto LAB_7ffc3ea9dc28;
            }
            (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
            }
            if (iVar3 < 1) goto LAB_7ffc3ea9db36;
            (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
            if (_DAT_7ffc3ebc2450 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x51);
              lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3ebadd31,0x7ffc3eba626f,0,0);
              if ((lVar6 != 0) &&
                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar8 != (void *)0x0)) {
                _DAT_7ffc3ebc2450 = (*(*env)->NewGlobalRef)(env,pvVar8);
              }
            }
            pvVar8 = _DAT_7ffc3ebc2450;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar5);
              (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar7);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc1e46117bbcd4c26);
              (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16
                                               );
              (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar5);
              FUN_7ffc3e7d1a50(env,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              uVar14 = (ulonglong)pvVar4 >> 0x20;
              pvVar5 = pvVar4;
              if (bVar1 == 0) {
LAB_7ffc3ea9d190:
                uVar17 = (ulonglong)pvVar5 & 0xffffffff;
                pvVar5 = arg2;
                if (0 < iVar12) {
                  if (arg2 != (void *)0x0) {
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)arg2 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,arg2);
                    }
                    if ((-1 < arg2_00) && (arg2_00 < iVar3)) {
                      pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg2,arg2_00);
                      if (iVar2 == 0) {
                        pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) goto LAB_7ffc3ea9dba5;
                        if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea9db53;
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
                        }
                        if (2 < iVar3) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
                          lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                          if (lVar6 != 0) {
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                              uVar16 ^ 0x6bf514f00be2);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar3 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
                              }
                              if (1 < iVar3) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
                                goto LAB_7ffc3ea9d360;
                              }
                              goto LAB_7ffc3ea9db69;
                            }
                          }
                          goto LAB_7ffc3ea9dba5;
                        }
LAB_7ffc3ea9db69:
                        pJVar10 = *env;
                        pcVar15 = (char *)0x7ffc3eba6019;
                        pvVar4 = pvRam00007ffc3ebc0a98;
                        goto LAB_7ffc3ea9db81;
                      }
                      uStack_a8 = (ulonglong)pvVar7 >> 0x20;
                      goto LAB_7ffc3ea9d86c;
                    }
                    goto LAB_7ffc3ea9db36;
                  }
                  goto LAB_7ffc3ea9dc14;
                }
LAB_7ffc3ea9d360:
                if (pvVar5 == (void *)0x0) {
LAB_7ffc3ea9db53:
                  pJVar10 = *env;
                  pcVar15 = &DAT_7ffc3eba6000;
                  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea9db81:
                  (*pJVar10->ThrowNew)(env,pvVar4,pcVar15);
LAB_7ffc3ea9dba5:
                  pvVar5 = (*(*env)->ExceptionOccurred)(env);
                  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
                  if (bVar1 != 0) goto LAB_7ffc3ea9dd02;
                  goto LAB_7ffc3ea9dc3a;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
                }
                if (iVar3 < 1) {
                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a98,(char *)0x7ffc3eba6019);
                  goto LAB_7ffc3ea9dba5;
                }
                (*(*env)->SetObjectArrayElement)(env,pvVar5,0,(void *)(uVar17 | uVar14 << 0x20));
                if (_DAT_7ffc3ebc2458 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x51);
                  lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,
                                           0x7ffc3eba82ab,0x7ffc3eba743f,0,0);
                  if ((lVar6 != 0) &&
                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar7 != (void *)0x0)) {
                    _DAT_7ffc3ebc2458 = (*(*env)->NewGlobalRef)(env,pvVar7);
                  }
                }
                pvVar7 = _DAT_7ffc3ebc2458;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3ea9dba5;
                pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc1e6783ea05a73a2);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar16);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
                FUN_7ffc3e7d1a50(env,pvVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3ea9dba5;
                if ((iVar12 != 0 && SCARRY4(iVar13,(uint)(0 < (longlong)uVar16)) == iVar12 < 0) &&
                    iVar2 == 0) {
                  if (_DAT_7ffc3ebc2460 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x51);
                    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba7466,0x7ffc3eba64b4,0,0);
                    if ((lVar6 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc2460 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc2460;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc1eb92ab7cfe3317);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar16);
                    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar8);
                    uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      iVar3 = FUN_7ffc3e7d8be0(env,uVar9);
                      if (arg2_00 < iVar3 + -1) {
                        FUN_7ffc3ea9def0(env,pvVar4);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 != 0) goto LAB_7ffc3ea9dd6e;
                      }
                      arg2_00 = arg2_00 + 1;
                      goto LAB_7ffc3ea9d601;
                    }
                  }
                  pvVar5 = (*(*env)->ExceptionOccurred)(env);
                  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
                  if (bVar1 != 0) goto LAB_7ffc3ea9dda2;
                  goto LAB_7ffc3ea9dcda;
                }
LAB_7ffc3ea9d601:
                if (iVar2 != 0) goto LAB_7ffc3ea9d60c;
                goto LAB_7ffc3ea9cb20;
              }
            }
          }
        }
      }
    }
  }
  pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3ea9dc3a:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
  if (bVar1 == 0) {
    return;
  }
  (*(*env)->ExceptionClear)(env);
  lVar6 = FUN_7ffc3eb76c30(env,0x51);
  if ((lVar6 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar6,0xe2), lVar11 == 0)) {
LAB_7ffc3ea9dcce:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
  }
  else {
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar11,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      (*(*env)->Throw)(env,pvVar4);
      goto LAB_7ffc3ea9dcce;
    }
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
  }
LAB_7ffc3ea9dcda:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
  if (bVar1 == 0) {
    return;
  }
LAB_7ffc3ea9dd02:
  (*(*env)->ExceptionClear)(env);
  lVar6 = FUN_7ffc3eb76c30(env,0x51);
  if ((lVar6 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar6,0xe2), lVar11 == 0)) {
LAB_7ffc3ea9dd6e:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
  }
  else {
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar11,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      (*(*env)->Throw)(env,pvVar4);
      goto LAB_7ffc3ea9dd6e;
    }
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
  }
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar4);
  if (bVar1 != 0) {
LAB_7ffc3ea9dda2:
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x51);
    if ((lVar6 != 0) && (lVar11 = FUN_7ffc3eb76c90(env,lVar6,0xe2), lVar11 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar11,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        UNRECOVERED_JUMPTABLE = (*env)->Throw;
LAB_7ffc3ea9de16:
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea9de29. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)(env,pvVar4);
        return;
      }
    }
  }
  return;
LAB_7ffc3ea9d60c:
  uVar14 = uStack_a8;
  pvVar5 = arg3;
  if (iVar12 < 1) goto LAB_7ffc3ea9d190;
  pvVar7 = (void *)((ulonglong)arg3 & 0xffffffff);
  uVar17 = (ulonglong)arg3 & 0xffffffff;
LAB_7ffc3ea9d86c:
  (*(*env)->MonitorEnter)(env,(void *)(uVar17 | uVar14 << 0x20));
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2468 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x51);
    lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebadcf7,0x7ffc3eba6478,0x7ffc3eba606c,0x7ffc3eba82ab
                             ,0x7ffc3ebad990,0,0);
    if ((lVar6 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc2468 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc2468;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar8 = (*(*env)->NewObjectArray)(env,7,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,arg3);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,arg5 * arg0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,arg0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,4,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc1e437a1d45a441a);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,5,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,6,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      (*(*env)->MonitorExit)(env,(void *)(((ulonglong)pvVar7 & 0xffffffff) + (uStack_a8 << 0x20)));
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        return;
      }
    }
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
  (*(*env)->ExceptionClear)(env);
  while( true ) {
    (*(*env)->MonitorExit)(env,(void *)((ulonglong)pvVar7 & 0xffffffff | uStack_a8 << 0x20));
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) break;
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
  }
  UNRECOVERED_JUMPTABLE = (*env)->Throw;
  goto LAB_7ffc3ea9de16;
}

/* JNI_3X_3_8 | RVA 0x2cdfb0 | 3X.3(I)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_3X_3_8(JNINativeInterface_ **env,void *receiver,int arg0)

{
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (arg1 != (void *)0x0) {
    arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0x5c);
    if (arg2 != (void *)0x0) {
      (*(*env)->SetStaticIntField)(env,arg1,arg2,arg0);
                    /* WARNING: Could not recover jumptable at 0x7ffc3ea9e008. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  return;
}

/* JNI_3X_3_9 | RVA 0x2ce020 | 3X.3()I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_3X_3_9(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if ((arg1 != (void *)0x0) && (arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0x5c), arg2 != (void *)0x0)
     ) {
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

/* JNI_3X_4_10 | RVA 0x2ce0a0 | 3X.4()I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_3X_4_10(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  int iVar5;
  
  lVar3 = FUN_7ffc3eb76c30(env,0x51);
  iVar5 = 0;
  if (lVar3 != 0) {
    lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xe3);
    iVar5 = 0;
    if (lVar4 != 0) {
      iVar2 = FUN_7ffc3e7db1e0(env,lVar3,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (iVar5 = 0x7b, iVar2 != 0)) {
        iVar5 = 0;
      }
    }
  }
  return iVar5;
}

/* JNI_3X_a_11 | RVA 0x2ce110 | 3X.a(Ljava/lang/MatchException;)Ljava/lang/MatchException; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_a_11(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_3X_a_12 | RVA 0x2ce120 | 3X.a(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_3X_a_12(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x5d);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea9f9c2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x7522, iVar6 <= (int)arg2)) {
LAB_7ffc3ea9f9a8:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3ea9f9d6;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3ea9f899:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x51);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x5d);
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
      if (iVar6 <= (int)arg2) goto LAB_7ffc3ea9f9a8;
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
    goto LAB_7ffc3ea9f9c2;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea9f9c2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e2e2;
LAB_7ffc3ea9e2a8:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e2a8;
LAB_7ffc3ea9e2e2:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e36e;
LAB_7ffc3ea9e331:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e331;
LAB_7ffc3ea9e36e:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e3fa;
LAB_7ffc3ea9e3bd:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e3bd;
LAB_7ffc3ea9e3fa:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e486;
LAB_7ffc3ea9e449:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e449;
LAB_7ffc3ea9e486:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e511;
LAB_7ffc3ea9e4d4:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e4d4;
LAB_7ffc3ea9e511:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e59c;
LAB_7ffc3ea9e55f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e55f;
LAB_7ffc3ea9e59c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e627;
LAB_7ffc3ea9e5ea:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e5ea;
LAB_7ffc3ea9e627:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x5e);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea9f9c2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3ea9f9a8;
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
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3ea9f9c2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e837;
LAB_7ffc3ea9e7fd:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e7fd;
LAB_7ffc3ea9e837:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e8c3;
LAB_7ffc3ea9e886:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e886;
LAB_7ffc3ea9e8c3:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e94f;
LAB_7ffc3ea9e912:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e912;
LAB_7ffc3ea9e94f:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9e9db;
LAB_7ffc3ea9e99e:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9e99e;
LAB_7ffc3ea9e9db:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9ea66;
LAB_7ffc3ea9ea29:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9ea29;
LAB_7ffc3ea9ea66:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9eaf1;
LAB_7ffc3ea9eab4:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9eab4;
LAB_7ffc3ea9eaf1:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3ea9f9a8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3ea9eb7c;
LAB_7ffc3ea9eb3f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3ea9eb3f;
LAB_7ffc3ea9eb7c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3ea9f9a8;
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
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x5f);
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
LAB_7ffc3ea9f261:
          pJVar16 = *env;
          goto LAB_7ffc3ea9f267;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3ea9f261;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3ea9f261;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3ea9f247;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3ea9f9e1:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3ea9f25b;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3ea9f261;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3ea9f261;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3ea9f9e1;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3ea9f267;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3ea9f247;
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
                if (iVar6 < 3) goto LAB_7ffc3ea9f9e1;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x51);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0x5f);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3ea9f26a;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3ea9f247;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3ea9f152;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3ea9f261;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3ea9f9d6;
        }
LAB_7ffc3ea9f152:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3ea9f247:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea9f25b:
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
                  if (iVar6 < 2) goto LAB_7ffc3ea9f9e1;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea9f247;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3ea9f9fe;
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
                        if (iVar6 < 1) goto LAB_7ffc3ea9f9e1;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3ea9f9fe:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3ea9f25b;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3ea9f9e1;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3ea9f9fe;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3ea9f247;
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
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x51);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x5d);
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
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3ea9f9c2;
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
                                              goto LAB_7ffc3ea9f899;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3ea9f9a8;
                                  }
                                  goto LAB_7ffc3ea9f9c2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3ea9f261;
        }
LAB_7ffc3ea9f267:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3ea9f26a:
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
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadcf7);
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
LAB_7ffc3ea9f9c2:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea9f9d6:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_3X_a_13 | RVA 0x2cfa50 | 3X.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_3X_a_13(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,void *arg3
               )

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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3ea9ff6d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3ea9ff50;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3ea9ff7f:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3ea9fb97;
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
    if (iVar3 < 2) goto LAB_7ffc3ea9ff50;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3ea9fb90;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3ea9ff7f;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x51);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0xe4);
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
          goto LAB_7ffc3ea9ff6d;
        }
      }
LAB_7ffc3ea9ff50:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3ea9fb97;
    }
LAB_7ffc3ea9ff6d:
    pJVar7 = *env;
  }
LAB_7ffc3ea9fb90:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3ea9fb97:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_3X_a_14 | RVA 0x2cffa0 | 3X.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_a_14(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa086b;
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
  if (_DAT_7ffc3ebc0ac8 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x51);
    uVar11 = FUN_7ffc3eb76c30(env,0x51);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0ac8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0ac8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eaa04d3:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaa0501:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaa04d3;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaa04d3;
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
                      goto LAB_7ffc3eaa0507;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eaa0501;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eaa0507:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadcf7);
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
LAB_7ffc3eaa086b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_3X_a_15 | RVA 0x2d0890 | 3X.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_3X_a_15(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x60);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3eaa11e4:
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
LAB_7ffc3eaa09a4:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x51);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x61);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa11e4;
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
          iVar5 = *(int *)(&UNK_7ffc3eb9a5b0 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa118e;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3eaa1174;
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
LAB_7ffc3eaa100e:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x51);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x60), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa11e4;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3eaa11af;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3eaa09a4;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3eaa0dbd;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3eaa0dbd:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3eaa1174;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3eaa100e;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3eaa1174;
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
                    goto LAB_7ffc3eaa11a5;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3eaa1174;
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
LAB_7ffc3eaa118e:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3eaa11a5;
        }
        goto LAB_7ffc3eaa09a4;
      }
    }
LAB_7ffc3eaa11af:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3eaa1174:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eaa11a5:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_3X_a_16 | RVA 0x2d1230 | 3X.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_3X_a_16(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x61);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebade71);
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3eaa2886:
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
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebade74);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
        pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebade88);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
        }
        if (2 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
          pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebade8b);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (3 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar5);
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
            if (4 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar5);
              pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x60);
              if (pvVar5 == (void *)0x0) {
                return;
              }
              pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
              if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa2886;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (4 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,4,pvVar7);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebade8e);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (5 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadea2);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (6 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadea5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (7 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadec0);
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
                        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0960,pvVar6);
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
                          if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa2886;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (9 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,9,pvVar7);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadee0);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (10 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadef0);
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
                                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadf10);
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
                                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadf22);
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
                                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadf33);
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
                                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadf44);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                      }
                                      if (0xf < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0xf,pvVar6);
                                        pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadf58)
                                        ;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                        }
                                        if (0x10 < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0x10,pvVar6);
                                          pvVar6 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3ebadf5b);
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
                                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0x11,pvVar6)
                                            ;
                                            pvVar6 = (*(*env)->NewStringUTF)
                                                               (env,(char *)0x7ffc3ebadf6f);
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
                                                                 (env,(char *)0x7ffc3ebadf72);
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar4 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                              }
                                              if (0x13 < iVar2) {
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar4,0x13,pvVar6);
                                                pvVar6 = (*(*env)->NewStringUTF)
                                                                   (env,(char *)0x7ffc3ebadf86);
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar4 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                }
                                                if (0x14 < iVar2) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0x14,pvVar6);
                                                  pvVar6 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3ebadf9a);
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
                                                  if (0x15 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x15,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebadfae);
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
                                                    if (0x16 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x16,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebadfc3
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
                                                      if (0x17 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x17,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebadfc6);
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
                                                  if (0x19 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x19,pvVar6);
                                                    pvVar3 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar3,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 != 0) {
                                                      return;
                                                    }
                                                    pvVar5 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3eba6786);
                                                    if (pvVar3 == (void *)0x0)
                                                    goto LAB_7ffc3eaa2886;
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
                                                    if (0x19 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar3,0x19,pvVar5);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebadfda
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
                                                      if (0x1a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1a,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebadffd);
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
                                                  if (0x1b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1b,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae014);
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
                                                    if (0x1c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1c,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae044
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
                                                  0x7ffc3ebae068);
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
                                                                       (env,(char *)0x7ffc3ebae08f);
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
                                                                         (env,(char *)0x7ffc3ebae0a6
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
                                                  0x7ffc3ebae0ca);
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
                                                                       (env,(char *)0x7ffc3ebae123);
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
                                                                         (env,(char *)0x7ffc3ebae147
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
                                                  0x7ffc3ebae16e);
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
                                                                       (env,(char *)0x7ffc3ebae1a1);
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
                                                                         (env,(char *)0x7ffc3ebae1c4
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
                                                  0x7ffc3ebae1e9);
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
                                                                       (env,(char *)0x7ffc3ebae20c);
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
                                                                         (env,(char *)0x7ffc3ebae22f
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
                                                  0x7ffc3ebae259);
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
                                                                       (env,(char *)0x7ffc3ebae27d);
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
                                                                         (env,(char *)0x7ffc3ebae29c
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
                                                  0x7ffc3ebae2bd);
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3eaa2841. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2d,pvVar3);
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
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eaa2872. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_3X_b_17 | RVA 0x2d28a0 | 3X.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_b_17(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0xe5);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x61);
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
      goto LAB_7ffc3eaa2d46;
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
      goto LAB_7ffc3eaa2d46;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x51);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3eaa2c0a:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x60);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3eaa2bf0:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x61);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa2bea;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3eaa2bf0;
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
                    goto LAB_7ffc3eaa2bd0;
                  }
                }
              }
              goto LAB_7ffc3eaa2c0a;
            }
LAB_7ffc3eaa2bd0:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3eaa2c0a;
      }
LAB_7ffc3eaa2bea:
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
LAB_7ffc3eaa2d46:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_3X_a_18 | RVA 0x2d2d60 | 3X.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_a_18(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
LAB_7ffc3eaa2fc1:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eaa2fdd;
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
        if (lVar6 == 0) goto LAB_7ffc3eaa2fc1;
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
LAB_7ffc3eaa2fdd:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_3X_b_19 | RVA 0x2d3010 | 3X.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_b_19(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x51);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xe6), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x51);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xe7);
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

/* JNI_3X_c_20 | RVA 0x2d3240 | 3X.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_c_20(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0xe5);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x61);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa3f70;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3eaa3f56;
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
    goto LAB_7ffc3eaa3f84;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x60);
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
LAB_7ffc3eaa3f56:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eaa3f84;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0xe8);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x51);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0xe6);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3eaa3f70;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3eaa3f56;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x51);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0xe7);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x61);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3eaa3f70;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3eaa3f56;
              pJVar14 = *env;
              goto LAB_7ffc3eaa3b37;
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
        if (lVar9 == 0) goto LAB_7ffc3eaa3f70;
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
          goto LAB_7ffc3eaa3f70;
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
          lVar8 = FUN_7ffc3eb76c30(env,0x51);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xe8);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x3b2fc11047809,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x51);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x61);
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
LAB_7ffc3eaa3b37:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3eaa3f56;
      }
    }
  }
LAB_7ffc3eaa3f70:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaa3f84:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_3X_a_21 | RVA 0x2d3f90 | 3X.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_a_21(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  int arg3,void *arg4)

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
LAB_7ffc3eaa43ba:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eaa43c8;
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
        if (lVar7 == 0) goto LAB_7ffc3eaa43ba;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3eaa43ba;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3eaa43ac;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3eaa43ba;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3eaa43ac;
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
LAB_7ffc3eaa43ac:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3eaa43c8:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_3X_b_22 | RVA 0x2d43f0 | 3X.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_b_22(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  int arg3,void *arg4)

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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x51);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xe9), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x51);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xea);
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

/* JNI_3X_d_23 | RVA 0x2d4660 | 3X.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_d_23(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x51);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0xe5);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x61);
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
LAB_7ffc3eaa58a7:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eaa58bf;
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
      goto LAB_7ffc3eaa58bf;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x60);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3eaa58a7;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0xe8);
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
            lVar6 = FUN_7ffc3eb76c30(env,0x51);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xe8);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaa5891;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3eaa58a7;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3eaa4d10:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x51);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0xe9);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x61);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3eaa5291:
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
              goto LAB_7ffc3eaa58a7;
            }
            goto LAB_7ffc3eaa5891;
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
              if (iVar4 == 0) goto code_r0x7ffc3eaa4e4e;
              goto joined_r0x7ffc3eaa4f11;
            }
          }
          goto LAB_7ffc3eaa5891;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3eaa58bf;
      }
    }
  }
  goto LAB_7ffc3eaa5891;
code_r0x7ffc3eaa4e4e:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3eaa4e9c;
  goto LAB_7ffc3eaa4d10;
code_r0x7ffc3eaa4e9c:
  lVar6 = FUN_7ffc3eb76c30(env,0x51);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0xe8);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x3b2fc11047809,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3eaa4f11:
  do {
    if (lVar10 == 0) goto LAB_7ffc3eaa5891;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3eaa58a7;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x51);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0xea);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x61);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3eaa5291;
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
    if (lVar6 == 0) goto LAB_7ffc3eaa5891;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3eaa5891;
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
      if (lVar10 == 0) goto LAB_7ffc3eaa5891;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaa5891;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3eaa5891;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaa5891;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaa5891;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eaa5891;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3eaa5891;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3eaa55e8;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaa5891;
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
      lVar6 = FUN_7ffc3eb76c30(env,0x51);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xe8);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x3b2fc11047809,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3eaa5891;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3eaa58a7;
  }
LAB_7ffc3eaa55e8:
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
LAB_7ffc3eaa5891:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaa58bf:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_3X_a_24 | RVA 0x2d58f0 | 3X.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_a_24(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
                  void *arg3,longlong arg4,longlong arg5)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  JNINativeInterface_ *pJVar13;
  longlong lVar14;
  undefined8 uVar15;
  char *arg2_00;
  undefined4 uVar16;
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3eaa6706;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if ((iVar2 - 0xc2U < 0x3c) &&
     ((0x800000021000001U >> ((ulonglong)(iVar2 - 0xc2U) & 0x3f) & 1) != 0)) {
    lVar4 = FUN_7ffc3eb76c30(env,0x51);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xeb), lVar5 == 0)) {
LAB_7ffc3eaa60a7:
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      lVar4 = 0;
      if (bVar1 == 0) {
        return (void *)0x0;
      }
      goto LAB_7ffc3eaa60dd;
    }
    lVar5 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaa60a7;
    if (lVar5 == 0) goto LAB_7ffc3eaa6101;
    lVar4 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar4 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x4e), lVar6 != 0)) {
      uVar7 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x34), lVar6 != 0)) {
        uVar8 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x36), lVar4 != 0)) {
          uVar9 = FUN_7ffc3e7d1a50(env,lVar5,lVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (iVar2 == 0xc2) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eaa6101;
              uVar15 = 0x51;
            }
            else if (iVar2 == 0xdf) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eaa6101;
              uVar15 = 0x50;
            }
            else if (iVar2 == 0xda) {
              if (arg0 == (void *)0x0) {
LAB_7ffc3eaa6101:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3eaa611b;
              }
              uVar15 = 0x4f;
            }
            else {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eaa6101;
              uVar15 = 0x52;
            }
            lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
            if (lVar4 != 0) {
              uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar7,uVar8,uVar9);
              uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eaa611b;
              lVar4 = 0;
LAB_7ffc3eaa5de6:
              if (arg3 == (void *)0x0) {
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eaa61b0:
                pvVar10 = (*(*env)->ExceptionOccurred)(env);
                pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
              }
              else {
                lVar6 = FUN_7ffc3eb76c30(env,0x19);
                if ((lVar6 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x24), lVar6 == 0))
                goto LAB_7ffc3eaa61b0;
                iVar2 = FUN_7ffc3e7d8be0(env,arg3,lVar6);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if ((bVar1 == 0) &&
                     (pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6),
                     pvVar11 != (void *)0x0)) {
                    pvVar12 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar11);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (pvVar10 == (void *)0x0) {
                        pJVar13 = *env;
                        arg2_00 = &DAT_7ffc3eba6000;
                        pvVar10 = pvRam00007ffc3ebc0a70;
                      }
                      else {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                        }
                        if (0 < iVar3) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
                          pvVar11 = (*(*env)->GetStaticObjectField)
                                              (env,pvRam00007ffc3ebc0958,pvVar11);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar3 = *(int *)(*(longlong *)
                                                ((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                            }
                            if (iVar3 < 2) goto LAB_7ffc3eaa60e4;
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                            lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
                            if (lVar6 != 0) {
                              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,
                                                                 uVar7,CONCAT44(uVar16,iVar2 + -2),
                                                                 pvVar10);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                return pvVar10;
                              }
                            }
                          }
                          goto LAB_7ffc3eaa61fb;
                        }
LAB_7ffc3eaa60e4:
                        pJVar13 = *env;
                        arg2_00 = (char *)0x7ffc3eba6019;
                        pvVar10 = pvRam00007ffc3ebc0a98;
                      }
                      (*pJVar13->ThrowNew)(env,pvVar10,arg2_00);
                    }
                  }
                }
LAB_7ffc3eaa61fb:
                pvVar10 = (*(*env)->ExceptionOccurred)(env);
                pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
              }
              goto joined_r0x7ffc3eaa6186;
            }
          }
        }
      }
    }
LAB_7ffc3eaa611b:
    pvVar10 = (*(*env)->ExceptionOccurred)(env);
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
    lVar4 = 0;
    if (bVar1 == 0) {
      return (void *)0x0;
    }
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(env,0x51);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xec), lVar5 == 0))
    goto LAB_7ffc3eaa60a7;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaa60a7;
    if (lVar4 == 0) {
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eaa6255:
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      lVar5 = 0;
joined_r0x7ffc3eaa6186:
      if (bVar1 == 0) {
        return (void *)0x0;
      }
      goto LAB_7ffc3eaa628b;
    }
    lVar5 = FUN_7ffc3eb76c30(env,0x1d);
    if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x54), lVar6 == 0))
    goto LAB_7ffc3eaa6255;
    uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x47), lVar6 == 0))
    goto LAB_7ffc3eaa6255;
    uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x48), lVar6 == 0))
    goto LAB_7ffc3eaa6255;
    uVar9 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x49), lVar5 == 0)) {
LAB_7ffc3eaa6156:
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      lVar5 = 0;
      goto joined_r0x7ffc3eaa6186;
    }
    uVar15 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) ||
       ((lVar5 = FUN_7ffc3eb76c30(env,0x19), lVar5 == 0 ||
        (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x55), lVar6 == 0)))) goto LAB_7ffc3eaa6156;
    uVar9 = FUN_7ffc3e7d1a80(env,lVar5,lVar6,uVar9,uVar15);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaa6156;
    if (iVar2 == 0x78) {
      if (arg0 == (void *)0x0) goto LAB_7ffc3eaa6722;
      uVar15 = 0x57;
LAB_7ffc3eaa6030:
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
joined_r0x7ffc3eaa6063:
      if (lVar5 != 0) {
        uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar7,uVar8,uVar9);
        uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          lVar5 = 0;
          goto LAB_7ffc3eaa5de6;
        }
      }
    }
    else {
      if (iVar2 == 0xc6) {
        if (arg0 != (void *)0x0) {
          uVar15 = 0x56;
          goto LAB_7ffc3eaa6030;
        }
      }
      else if (arg0 != (void *)0x0) {
        lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
        goto joined_r0x7ffc3eaa6063;
      }
LAB_7ffc3eaa6722:
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
    }
    pvVar10 = (*(*env)->ExceptionOccurred)(env);
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
LAB_7ffc3eaa60dd:
    lVar5 = 0;
  }
LAB_7ffc3eaa628b:
  (*(*env)->ExceptionClear)(env);
  pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x1a);
  if (pvVar11 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar12 = (*(*env)->AllocObject)(env,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3eaa6706;
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x28);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar12,pvVar11,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3eaa6706;
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,pvVar10,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto LAB_7ffc3eaa6706;
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x40);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  uVar7 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x29);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3e7d1a50(env,pvVar12,lVar6,uVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
  if (lVar14 == 0) goto LAB_7ffc3eaa6706;
  lVar6 = FUN_7ffc3e7d1a50(env,lVar14,lVar6,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar5 == 0) {
    if (lVar4 != 0) {
      lVar5 = FUN_7ffc3eb76c30(env,0x1d);
      if (lVar5 == 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,lVar5,0x5b);
      lVar5 = lVar4;
      goto joined_r0x7ffc3eaa64ba;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar4 == 0) {
      return (void *)0x0;
    }
    lVar14 = FUN_7ffc3eb76c90(env,lVar4,0x5a);
joined_r0x7ffc3eaa64ba:
    if (lVar14 == 0) {
      return (void *)0x0;
    }
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar5,lVar14);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
  }
  if (lVar6 != 0) {
    lVar4 = FUN_7ffc3eb76c30(env,0x1a);
    if (lVar4 == 0) {
      return (void *)0x0;
    }
    lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x29);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar5,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653a);
    if (lVar6 != 0) {
      lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar5,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c30(env,8);
      if (lVar14 == 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,lVar14,0x31);
      if (lVar14 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7d1a50(env,pvVar10,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 != 0) {
        FUN_7ffc3e7d1a50(env,lVar6,lVar5,uVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x16);
        if (pvVar10 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar11 = (*(*env)->AllocObject)(env,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x2b);
        if (lVar4 == 0) {
          return (void *)0x0;
        }
        uVar7 = FUN_7ffc3e7d1a50(env,pvVar12,lVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar11 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,pvVar10,0x32);
          if (lVar4 == 0) {
            return (void *)0x0;
          }
          FUN_7ffc3e7dbbc0(env,pvVar11,pvVar10,lVar4,uVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          (*(*env)->Throw)(env,pvVar11);
          return (void *)0x0;
        }
      }
    }
  }
LAB_7ffc3eaa6706:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_3X_a_25 | RVA 0x2d6780 | 3X.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_a_25(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3eaa6bc6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3eaa6801:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3eaa6801;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3eaa6ba9:
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
LAB_7ffc3eaa6bd8:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3eaa6915;
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
      if (iVar2 < iVar3) goto LAB_7ffc3eaa6ba9;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3eaa6bd8;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x51);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xed);
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
            goto LAB_7ffc3eaa690e;
          }
        }
LAB_7ffc3eaa6bc6:
        pJVar7 = *env;
      }
    }
LAB_7ffc3eaa690e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3eaa6915:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_3X_b_26 | RVA 0x2d6c00 | 3X.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_3X_b_26(JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2)

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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaa753e;
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
  if (_DAT_7ffc3ebc0ad0 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x51);
    uVar11 = FUN_7ffc3eb76c30(env,0x51);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0ad0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0ad0;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eaa71c0:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaa71d4:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaa71c0;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaa71c0;
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
                        goto LAB_7ffc3eaa71da;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eaa71d4;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eaa71da:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebadcf7);
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
LAB_7ffc3eaa753e:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

