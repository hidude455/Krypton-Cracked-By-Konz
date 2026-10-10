/* Native reconstruction for dev/krypton/57.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_57_6_0 | RVA 0x13ada0 | dev/krypton/57.6([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_6_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  ulonglong uVar7;
  JNINativeInterface_ *pJVar8;
  void *pvVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  void *pvVar13;
  void *pvVar14;
  char *arg2;
  ulonglong in_stack_ffffffffffffff80;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3e90b3ce;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar4 < 1) {
LAB_7ffc3e90b61c:
    pJVar8 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar8 = *env;
    if (pvVar5 != (void *)0x0) {
      bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3e90b639:
        pJVar8 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar5 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e90af99;
      }
      lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      uVar7 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
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
      if (iVar4 < 2) goto LAB_7ffc3e90b61c;
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar8 = *env;
      if (pvVar5 != (void *)0x0) {
        bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e90b639;
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar2 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
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
        if (iVar4 < 3) goto LAB_7ffc3e90b61c;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pJVar8 = *env;
        if (pvVar5 != (void *)0x0) {
          bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
          if (bVar1 == 0) goto LAB_7ffc3e90b639;
          uVar3 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x74);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x8e);
          if (pvVar9 == (void *)0x0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar10 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar9 + 0x10));
          }
          else {
            uVar10 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          lVar6 = FUN_7ffc3eb76c30(env,0x5b);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          lVar11 = FUN_7ffc3eb76c90(env,lVar6,0xef);
          if (lVar11 == 0) {
            return (void *)0x0;
          }
          lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
          if (lVar11 == 0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar11,uVar3);
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
            if (2 < iVar4) {
              (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
              lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
              if (lVar12 == 0) {
                return (void *)0x0;
              }
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar12,
                                                uVar10 ^ uVar7 ^ 0x325e3f4ea823);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (1 < iVar4) {
                (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar11,uVar2);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
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
                  if (_DAT_7ffc3ebc7b98 == (void *)0x0) {
                    in_stack_ffffffffffffff80 = 0x7ffc3eba606c;
                    lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3ebae40a,0,0);
                    if ((lVar11 != 0) &&
                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                       pvVar9 != (void *)0x0)) {
                      _DAT_7ffc3ebc7b98 = (*(*env)->NewGlobalRef)(env,pvVar9);
                    }
                  }
                  pvVar9 = _DAT_7ffc3ebc7b98;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xd4638189c79a7652);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar10 ^ uVar7);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar13);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (lVar6 == 0) {
                    if (pvVar5 == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90b619. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba64b1);
                      return pvVar5;
                    }
                  }
                  else if (pvVar5 == (void *)0x0) goto LAB_7ffc3e90b3ce;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (0 < iVar4) {
                    pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar5,0);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (1 < iVar4) {
                      pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar5,1);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                      }
                      if (2 < iVar4) {
                        pvVar14 = (*(*env)->GetObjectArrayElement)(env,pvVar5,2);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                        }
                        if (4 < iVar4) {
                          pvVar5 = (*(*env)->GetObjectArrayElement)(env,pvVar5,4);
                          pvVar5 = (void *)FUN_7ffc3e90b660(env,pvVar9,pvVar13,pvVar14,pvVar5,
                                                            in_stack_ffffffffffffff80 &
                                                            0xffffffff00000000);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          return pvVar5;
                        }
                      }
                    }
                  }
                }
              }
            }
            goto LAB_7ffc3e90b61c;
          }
LAB_7ffc3e90b3ce:
          pJVar8 = *env;
        }
      }
    }
    arg2 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e90af99:
  (*pJVar8->ThrowNew)(env,pvVar5,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_0_1 | RVA 0x13bce0 | dev/krypton/57.0([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_0_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  JNINativeInterface_ *pJVar7;
  ulonglong uVar8;
  void *pvVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  void *pvVar13;
  void *pvVar14;
  char *arg2;
  undefined8 in_stack_ffffffffffffff70;
  undefined4 uVar15;
  
  uVar15 = (undefined4)((ulonglong)in_stack_ffffffffffffff70 >> 0x20);
  if (arg0 == (void *)0x0) goto LAB_7ffc3e90c307;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar4 < 1) {
LAB_7ffc3e90c555:
    pJVar7 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar7 = *env;
    if (pvVar5 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) {
LAB_7ffc3e90c572:
        pJVar7 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar5 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e90bebb;
      }
      lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      uVar2 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
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
      if (iVar4 < 2) goto LAB_7ffc3e90c555;
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e90c572;
        uVar3 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
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
        if (iVar4 < 3) goto LAB_7ffc3e90c555;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pJVar7 = *env;
        if (pvVar5 != (void *)0x0) {
          bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
          if (bVar1 == 0) goto LAB_7ffc3e90c572;
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x74);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x8e);
          if (pvVar9 == (void *)0x0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar10 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar9 + 0x10));
          }
          else {
            uVar10 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          lVar6 = FUN_7ffc3eb76c30(env,0x5b);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          lVar11 = FUN_7ffc3eb76c90(env,lVar6,0xef);
          if (lVar11 == 0) {
            return (void *)0x0;
          }
          lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar11);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          lVar11 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
          if (lVar11 == 0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar11,uVar3);
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
            if (2 < iVar4) {
              (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
              lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
              if (lVar12 == 0) {
                return (void *)0x0;
              }
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar12,
                                                uVar10 ^ uVar8 ^ 0x4ca3c488aaeb);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (1 < iVar4) {
                (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar11,uVar2);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
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
                  if (_DAT_7ffc3ebc7b88 == (void *)0x0) {
                    uVar15 = 0x7ffc;
                    lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3ebae40a,0,0);
                    if ((lVar11 != 0) &&
                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                       pvVar9 != (void *)0x0)) {
                      _DAT_7ffc3ebc7b88 = (*(*env)->NewGlobalRef)(env,pvVar9);
                    }
                  }
                  pvVar9 = _DAT_7ffc3ebc7b88;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xd6abff743c5c749a);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar10 ^ uVar8);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar13);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (lVar6 == 0) {
                    if (pvVar5 == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90c552. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba64b1);
                      return pvVar5;
                    }
                  }
                  else if (pvVar5 == (void *)0x0) goto LAB_7ffc3e90c307;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                  }
                  if (0 < iVar4) {
                    pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar5,0);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                    }
                    if (1 < iVar4) {
                      pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar5,1);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                      }
                      if (3 < iVar4) {
                        pvVar14 = (*(*env)->GetObjectArrayElement)(env,pvVar5,3);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                        }
                        if (4 < iVar4) {
                          pvVar5 = (*(*env)->GetObjectArrayElement)(env,pvVar5,4);
                          pvVar5 = (void *)FUN_7ffc3e90b660(env,pvVar9,pvVar13,pvVar14,pvVar5,
                                                            CONCAT44(uVar15,1));
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return (void *)0x0;
                          }
                          return pvVar5;
                        }
                      }
                    }
                  }
                }
              }
            }
            goto LAB_7ffc3e90c555;
          }
LAB_7ffc3e90c307:
          pJVar7 = *env;
        }
      }
    }
    arg2 = &DAT_7ffc3eba6000;
    pvVar5 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e90bebb:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_1_2 | RVA 0x13c590 | dev/krypton/57.1([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_1_2(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  int iVar5;
  void *pvVar6;
  longlong lVar7;
  longlong lVar8;
  ulonglong uVar9;
  JNINativeInterface_ *pJVar10;
  void *pvVar11;
  longlong lVar12;
  void *pvVar13;
  void *pvVar14;
  ulonglong uVar15;
  char *arg2;
  undefined8 in_stack_ffffffffffffff70;
  undefined4 uVar16;
  
  uVar16 = (undefined4)((ulonglong)in_stack_ffffffffffffff70 >> 0x20);
  if (arg0 == (void *)0x0) goto LAB_7ffc3e90ccd2;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar5 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar5 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar5 < 1) {
LAB_7ffc3e90cf0a:
    pJVar10 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar10 = *env;
    if (pvVar6 != (void *)0x0) {
      bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) {
LAB_7ffc3e90cf27:
        pJVar10 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar6 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e90c828;
      }
      lVar7 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
      if (lVar7 == 0) {
        return (void *)0x0;
      }
      uVar2 = FUN_7ffc3e7d8be0(env,pvVar6,lVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar5 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar5 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar5 < 2) goto LAB_7ffc3e90cf0a;
      pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar10 = *env;
      if (pvVar6 != (void *)0x0) {
        bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e90cf27;
        uVar3 = FUN_7ffc3e7d8be0(env,pvVar6,lVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar5 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar5 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar5 < 3) goto LAB_7ffc3e90cf0a;
        pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pJVar10 = *env;
        if (pvVar6 != (void *)0x0) {
          bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0958);
          if (bVar1 == 0) goto LAB_7ffc3e90cf27;
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
            iVar5 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,arg0);
          }
          if (iVar5 < 4) goto LAB_7ffc3e90cf0a;
          pvVar6 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
          pJVar10 = *env;
          if (pvVar6 != (void *)0x0) {
            bVar1 = (*pJVar10->IsInstanceOf)(env,pvVar6,pvRam00007ffc3ebc0a10);
            if (bVar1 == 0) goto LAB_7ffc3e90cf27;
            uVar4 = FUN_7ffc3e7d8be0(env,pvVar6,lVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x74);
            if (pvVar6 == (void *)0x0) {
              return (void *)0x0;
            }
            pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x8e);
            if (pvVar11 == (void *)0x0) {
              return (void *)0x0;
            }
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar15 = *(ulonglong *)
                        (*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                        (longlong)*(int *)((longlong)pvVar11 + 0x10));
            }
            else {
              uVar15 = (*(*env)->GetStaticLongField)(env,pvVar6,pvVar11);
            }
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar7 = FUN_7ffc3eb76c30(env,0x5b);
            if (lVar7 == 0) {
              return (void *)0x0;
            }
            lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xef);
            if (lVar8 == 0) {
              return (void *)0x0;
            }
            lVar7 = FUN_7ffc3e7d1a80(env,lVar7,lVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
            if (lVar8 == 0) {
              return (void *)0x0;
            }
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar8,uVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (pvVar6 != (void *)0x0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (3 < iVar5) {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar11);
                lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                if (lVar12 == 0) {
                  return (void *)0x0;
                }
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar12,
                                                   uVar15 ^ uVar9 ^ 0x1d479a910cc0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                }
                if (2 < iVar5) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar8,uVar3);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return (void *)0x0;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                  }
                  if (1 < iVar5) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar8,uVar2);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                    }
                    if (0 < iVar5) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar11);
                      if (_DAT_7ffc3ebc7b90 == (void *)0x0) {
                        uVar16 = 0x7ffc;
                        lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                 0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3ebae40a,0,0);
                        if ((lVar8 != 0) &&
                           (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar11 != (void *)0x0)) {
                          _DAT_7ffc3ebc7b90 = (*(*env)->NewGlobalRef)(env,pvVar11);
                        }
                      }
                      pvVar11 = _DAT_7ffc3ebc7b90;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x3c3aea8e6ec09378);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar15 ^ uVar9);
                      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
                      pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      if (lVar7 == 0) {
                        if (pvVar6 == (void *)0x0) {
                          uVar9 = 0;
                          uVar15 = 0;
                          goto LAB_7ffc3e90cef9;
                        }
                      }
                      else if (pvVar6 == (void *)0x0) goto LAB_7ffc3e90ccd2;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                      }
                      if (0 < iVar5) {
                        pvVar11 = (*(*env)->GetObjectArrayElement)(env,pvVar6,0);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                        }
                        if (1 < iVar5) {
                          pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar6,1);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (2 < iVar5) {
                            pvVar14 = (*(*env)->GetObjectArrayElement)(env,pvVar6,2);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            if (3 < iVar5) {
                              pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar6,3);
                              uVar9 = FUN_7ffc3e90b660(env,pvVar11,pvVar13,pvVar14,pvVar6,
                                                       CONCAT44(uVar16,1));
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) {
                                return (void *)0x0;
                              }
                              uVar15 = uVar9 & 0xffffffff00000000;
LAB_7ffc3e90cef9:
                              return (void *)(uVar9 & 0xffffffff | uVar15);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              goto LAB_7ffc3e90cf0a;
            }
LAB_7ffc3e90ccd2:
            pJVar10 = *env;
          }
        }
      }
    }
    arg2 = &DAT_7ffc3eba6000;
    pvVar6 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e90c828:
  (*pJVar10->ThrowNew)(env,pvVar6,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_7_3 | RVA 0x13cf50 | dev/krypton/57.7([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_57_7_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  void *pvVar7;
  longlong lVar8;
  void *pvVar9;
  void *pvVar10;
  void *pvVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar12;
  void *pvVar13;
  undefined8 uVar14;
  longlong lVar15;
  void *pvVar16;
  undefined8 uVar17;
  JNINativeInterface_ *pJVar18;
  int iVar19;
  ulonglong uVar21;
  char *pcVar22;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  void *pvStack_50;
  void *pvStack_48;
  int iVar20;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e90f3cc:
    pJVar18 = *env;
LAB_7ffc3e90d243:
    UNRECOVERED_JUMPTABLE = pJVar18->ThrowNew;
    pcVar22 = &DAT_7ffc3eba6000;
    pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e90d24e:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90d264. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar7,pcVar22);
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar19 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar19 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar19 < 1) goto LAB_7ffc3e90f38a;
  pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar18 = *env;
  if (pvVar7 == (void *)0x0) goto LAB_7ffc3e90d243;
  bVar1 = (*pJVar18->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0a10);
  if (bVar1 == 0) goto LAB_7ffc3e90f3ab;
  lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
  if (lVar8 == 0) {
    return;
  }
  uVar3 = FUN_7ffc3e7d8be0(env,pvVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar19 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar19 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar19 < 2) goto LAB_7ffc3e90f38a;
  pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pJVar18 = *env;
  if (pvVar7 == (void *)0x0) goto LAB_7ffc3e90d243;
  bVar1 = (*pJVar18->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc0a10);
  if (bVar1 == 0) {
LAB_7ffc3e90f3ab:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar22 = (char *)0x7ffc3eba6033;
    pvVar7 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3e90d24e;
  }
  uVar4 = FUN_7ffc3e7d8be0(env,pvVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar19 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar19 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar19 < 3) {
LAB_7ffc3e90f38a:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar22 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e90d24e;
  }
  pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
  pvVar9 = (void *)FUN_7ffc3eb76c30(env,10);
  if (pvVar9 == (void *)0x0) {
    return;
  }
  if ((pvVar7 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar9), bVar1 == 0))
  goto LAB_7ffc3e90f3ab;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar19 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar19 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar19 < 4) goto LAB_7ffc3e90f38a;
  pvVar10 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
  if ((pvVar10 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar9), bVar1 == 0))
  goto LAB_7ffc3e90f3ab;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar19 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar19 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar19 < 5) goto LAB_7ffc3e90f38a;
  pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,4);
  pJVar18 = *env;
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e90d243;
  pvStack_48 = pvVar10;
  bVar1 = (*pJVar18->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0958);
  if (bVar1 == 0) goto LAB_7ffc3e90f3ab;
  lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar8 == 0) {
    return;
  }
  uVar12 = FUN_7ffc3e7d1a20(env,pvVar11,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar19 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar19 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar19 < 6) goto LAB_7ffc3e90f38a;
  pvVar10 = (*(*env)->GetObjectArrayElement)(env,arg0,5);
  if ((pvVar10 != (void *)0x0) && (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar9), bVar1 == 0))
  goto LAB_7ffc3e90f3ab;
  pvStack_50 = pvVar10;
  pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar10 == (void *)0x0) {
    return;
  }
  pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvVar10,0x8e);
  if (pvVar11 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar21 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar11 + 0x10));
  }
  else {
    uVar21 = (*(*env)->GetStaticLongField)(env,pvVar10,pvVar11);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc45e8 == (void *)0x0) &&
      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar8 != 0)) &&
     (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0)) {
    _DAT_7ffc3ebc45e8 = (*(*env)->NewGlobalRef)(env,pvVar10);
  }
  pvVar10 = _DAT_7ffc3ebc45e8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar21 = uVar21 ^ uVar12;
  uVar12 = uVar21 ^ 0x7db7fcb2890c2e0c;
  pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
  uVar14 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar5 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
  if (((_DAT_7ffc3ebc45f0 == (void *)0x0) &&
      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar8 != 0)) &&
     (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0)) {
    _DAT_7ffc3ebc45f0 = (*(*env)->NewGlobalRef)(env,pvVar10);
  }
  pvVar10 = _DAT_7ffc3ebc45f0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x393f);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     uVar21 ^ 0x99f7ab719cfb866);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
  uVar14 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  bVar1 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
  if (((_DAT_7ffc3ebc45f8 == (void *)0x0) &&
      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar8 != 0)) &&
     (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0)) {
    _DAT_7ffc3ebc45f8 = (*(*env)->NewGlobalRef)(env,pvVar10);
  }
  pvVar10 = _DAT_7ffc3ebc45f8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
  uVar14 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  uVar6 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
  lVar8 = FUN_7ffc3eb76c30(env,0x5b);
  if (lVar8 == 0) {
    return;
  }
  lVar15 = FUN_7ffc3eb76c90(env,lVar8,0xef);
  if (lVar15 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar15);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4600 == (void *)0x0) &&
      (lVar15 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae31c,0x7ffc3ebae424,0,0), lVar15 != 0)) &&
     (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar15,uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0))
  {
    _DAT_7ffc3ebc4600 = (*(*env)->NewGlobalRef)(env,pvVar10);
  }
  pvVar10 = _DAT_7ffc3ebc4600;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x15ada6086bb8b8c3);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar21);
  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
  pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4608 == (void *)0x0) &&
      (lVar15 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0), lVar15 != 0)) &&
     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar15,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0))
  {
    _DAT_7ffc3ebc4608 = (*(*env)->NewGlobalRef)(env,pvVar11);
  }
  pvVar11 = _DAT_7ffc3ebc4608;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  uVar5 = uVar6 & uVar4 | (uVar5 & uVar3) << (bVar1 & 0x1f);
  pvVar13 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar5);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x15ad4f231f0205d5);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar21);
  (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar16);
  pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4610 == (void *)0x0) &&
      (lVar15 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebadb04,0x7ffc3eba8504,0,0), lVar15 != 0)) &&
     (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar15,uRam00007ffc3ebc0a00), pvVar13 != (void *)0x0))
  {
    _DAT_7ffc3ebc4610 = (*(*env)->NewGlobalRef)(env,pvVar13);
  }
  pvVar13 = _DAT_7ffc3ebc4610;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar16 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar10);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar11);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x15ae5963224a5fdb);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar21);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar10);
  pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar16);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar10 == (void *)0x0) {
    if (lVar8 != 0) {
      pvVar9 = (void *)0x0;
      pvVar10 = (void *)0x0;
      goto LAB_7ffc3e90e576;
    }
    if (((_DAT_7ffc3ebc4618 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3eba6482,0,0), lVar8 != 0)) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)) {
      _DAT_7ffc3ebc4618 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
    pvVar9 = _DAT_7ffc3ebc4618;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x15ab1e23db69c859);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar21);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
    pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar9 == (void *)0x0) {
      pvVar9 = (*(*env)->NewByteArray)(env,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
        pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar9);
        if (bVar1 == 0) {
          return;
        }
        (*(*env)->ExceptionClear)(env);
        lVar8 = FUN_7ffc3eb76c30(env,0x74);
        if (lVar8 == 0) {
          return;
        }
        lVar15 = FUN_7ffc3eb76c90(env,lVar8,0x12f);
        if (lVar15 == 0) {
          return;
        }
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar15,pvVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90f59c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar7);
        return;
      }
    }
    else {
      if (((_DAT_7ffc3ebc4620 == (void *)0x0) &&
          (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebae31c,0x7ffc3eba7845,0,0), lVar8 != 0)) &&
         (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar10 != (void *)0x0
         )) {
        _DAT_7ffc3ebc4620 = (*(*env)->NewGlobalRef)(env,pvVar10);
      }
      pvVar10 = _DAT_7ffc3ebc4620;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x15af048f3979826d);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar13);
      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar21);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar13);
      pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (((_DAT_7ffc3ebc4628 == (void *)0x0) &&
          (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebadb04,0x7ffc3ebadd6b,0,0), lVar8 != 0)) &&
         (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0
         )) {
        _DAT_7ffc3ebc4628 = (*(*env)->NewGlobalRef)(env,pvVar11);
      }
      pvVar11 = _DAT_7ffc3ebc4628;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar10);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x15ab6322a8a0f4c7);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar21);
      (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
    }
LAB_7ffc3e90e228:
    pvVar10 = (*(*env)->NewByteArray)(env,2);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (((_DAT_7ffc3ebc4630 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar8 != 0)) &&
       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0))
    {
      _DAT_7ffc3ebc4630 = (*(*env)->NewGlobalRef)(env,pvVar11);
    }
    pvVar11 = _DAT_7ffc3ebc4630;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar16);
    pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar16);
    uVar14 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    bVar1 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
    if (pvVar10 == (void *)0x0) goto LAB_7ffc3e90f3cc;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar19 = (*(*env)->GetArrayLength)(env,pvVar10);
    }
    if (iVar19 < 1) goto LAB_7ffc3e90f38a;
    bVar1 = bVar1 & (byte)uVar3;
    uStack_68 = CONCAT71(uStack_68._1_7_,bVar1);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      *(byte *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
               (ulonglong)uRam00007ffc3ebc08f0) = bVar1;
    }
    else {
      (*(*env)->SetByteArrayRegion)(env,pvVar10,0,1,(byte *)&uStack_68);
    }
    if (((_DAT_7ffc3ebc4638 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar8 != 0)) &&
       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0))
    {
      _DAT_7ffc3ebc4638 = (*(*env)->NewGlobalRef)(env,pvVar11);
    }
    pvVar11 = _DAT_7ffc3ebc4638;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar16);
    pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar16);
    uVar14 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar13);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    bVar1 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar19 = (*(*env)->GetArrayLength)(env,pvVar10);
    }
    if (1 < iVar19) {
      bVar1 = bVar1 & (byte)uVar4;
      uStack_68 = CONCAT71(uStack_68._1_7_,bVar1);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
                 *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = bVar1;
      }
      else {
        (*(*env)->SetByteArrayRegion)(env,pvVar10,1,1,(byte *)&uStack_68);
      }
      goto LAB_7ffc3e90e576;
    }
  }
  else {
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar9);
    if (bVar1 == 0) goto LAB_7ffc3e90f3ab;
    pvVar9 = pvVar10;
    if (lVar8 == 0) goto LAB_7ffc3e90e228;
LAB_7ffc3e90e576:
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,10);
    pvVar11 = (*(*env)->NewObjectArray)(env,5,pvVar11,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar11 == (void *)0x0) {
      pJVar18 = *env;
      pcVar22 = &DAT_7ffc3eba6000;
      pvVar7 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3e90f3f6;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar19 = (*(*env)->GetArrayLength)(env,pvVar11);
    }
    if (0 < iVar19) {
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar9);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar19 = (*(*env)->GetArrayLength)(env,pvVar11);
      }
      if (1 < iVar19) {
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar19 = (*(*env)->GetArrayLength)(env,pvVar11);
        }
        if (2 < iVar19) {
          (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvStack_48);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                             (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar19 = (*(*env)->GetArrayLength)(env,pvVar11);
          }
          if (3 < iVar19) {
            (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvStack_50);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar19 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                               (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar19 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if (4 < iVar19) {
              (*(*env)->SetObjectArrayElement)(env,pvVar11,4,pvVar10);
              if (((_DAT_7ffc3ebc4640 == (void *)0x0) &&
                  (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0),
                  lVar8 != 0)) &&
                 (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar7 != (void *)0x0)) {
                _DAT_7ffc3ebc4640 = (*(*env)->NewGlobalRef)(env,pvVar7);
              }
              pvVar7 = _DAT_7ffc3ebc4640;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x15afe3b8f4d1535a);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar21);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
                pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (((_DAT_7ffc3ebc4648 == (void *)0x0) &&
                      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0),
                      lVar8 != 0)) &&
                     (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar9 != (void *)0x0)) {
                    _DAT_7ffc3ebc4648 = (*(*env)->NewGlobalRef)(env,pvVar9);
                  }
                  pvVar9 = _DAT_7ffc3ebc4648;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,
                                                       uRam00007ffc3ebc0998,uVar5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
                    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x15ad4f231f0205d5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
                    pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc4650 == (void *)0x0) {
                        uStack_68 = FUN_7ffc3eb76d30(env,0x7ffc3eba8450,receiver);
                        uVar14 = FUN_7ffc3eb76c30(env,0x74);
                        uVar17 = FUN_7ffc3eb76c30(env,0x74);
                        uStack_60 = FUN_7ffc3eb770c0(env,uVar14,6,uVar17,0x7ffc3ebabc78,
                                                     0x7ffc3ebae453);
                        uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebae453,receiver);
                        lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                                 0x7ffc3eba75b6,0x7ffc3eba84b3,0x7ffc3eba84b9,
                                                 &uStack_68,3);
                        if ((lVar8 != 0) &&
                           (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar10 != (void *)0x0)) {
                          _DAT_7ffc3ebc4650 = (*(*env)->NewGlobalRef)(env,pvVar10);
                        }
                      }
                      pvVar10 = _DAT_7ffc3ebc4650;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar13 = (*(*env)->NewObjectArray)(env,0,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar13)
                        ;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (((_DAT_7ffc3ebc4658 == (void *)0x0) &&
                              (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a
                                                        ,0x7ffc3eba606c,0x7ffc3ebadb04,
                                                        0x7ffc3ebae491,0,0), lVar8 != 0)) &&
                             (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                             pvVar13 != (void *)0x0)) {
                            _DAT_7ffc3ebc4658 = (*(*env)->NewGlobalRef)(env,pvVar13);
                          }
                          pvVar13 = _DAT_7ffc3ebc4658;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar16 = (*(*env)->NewObjectArray)
                                                (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar7);
                            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar9);
                            (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar10);
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x15a0c1403a15b06a);
                            (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar7);
                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar21);
                            (*(*env)->SetObjectArrayElement)(env,pvVar16,4,pvVar7);
                            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,
                                                              pvVar16);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if ((bVar1 == 0) &&
                               (pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x5c), pvVar9 != (void *)0x0))
                            {
                              if ((pvVar7 == (void *)0x0) ||
                                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar9), bVar1 != 0)) {
                                if (((_DAT_7ffc3ebc4660 == (void *)0x0) &&
                                    (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                              0x7ffc3eba606a,0x7ffc3eba606c,
                                                              0x7ffc3ebadb04,0x7ffc3eba6245,0,0),
                                    lVar8 != 0)) &&
                                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00
                                                                     ), pvVar9 != (void *)0x0)) {
                                  _DAT_7ffc3ebc4660 = (*(*env)->NewGlobalRef)(env,pvVar9);
                                }
                                pvVar9 = _DAT_7ffc3ebc4660;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar10 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar7);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,
                                                                    0x15a034f9dcb1c44c);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
                                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,uVar21);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar7);
                                  uVar14 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10)
                                  ;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    FUN_7ffc3e7d53d0(env,uVar14,uRam00007ffc3ebc0a38);
                                    iVar20 = (int)((longlong)uVar21 >> 0x3f);
                                    iVar19 = iVar20 + (uint)(0 < (longlong)uVar21);
                                    if (iVar19 == 0 ||
                                        SCARRY4(iVar20,(uint)(0 < (longlong)uVar21)) != iVar19 < 0)
                                    {
                                      return;
                                    }
                                    lVar8 = FUN_7ffc3eb76c30(env,0xb);
                                    if ((lVar8 != 0) &&
                                       (lVar15 = FUN_7ffc3eb76c90(env,lVar8,0xb), lVar15 != 0)) {
                                      lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar15);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        if (lVar8 != 0) {
                                          return;
                                        }
                                        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0xb);
                                        pvVar7 = (*(*env)->NewObjectArray)(env,5,pvVar7,(void *)0x0)
                                        ;
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (((bVar1 == 0) &&
                                            (lVar8 = FUN_7ffc3eb76c30(env,0x5b), lVar8 != 0)) &&
                                           (lVar15 = FUN_7ffc3eb76c90(env,lVar8,0x130), lVar15 != 0)
                                           ) {
                                          FUN_7ffc3e7e6a80(env,lVar8,lVar15,pvVar7);
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
                              else {
                                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a58,(char *)0x7ffc3eba6033
                                                   );
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
              pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x24);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar9);
              if (bVar1 == 0) {
                return;
              }
              (*(*env)->ExceptionClear)(env);
              lVar8 = FUN_7ffc3eb76c30(env,0x74);
              if (lVar8 == 0) {
                return;
              }
              lVar15 = FUN_7ffc3eb76c90(env,lVar8,0x12f);
              if (lVar15 == 0) {
                return;
              }
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar15,pvVar7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              (*(*env)->Throw)(env,pvVar7);
              return;
            }
          }
        }
      }
    }
  }
  pJVar18 = *env;
  pcVar22 = (char *)0x7ffc3eba6019;
  pvVar7 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e90f3f6:
  (*pJVar18->ThrowNew)(env,pvVar7,pcVar22);
  return;
}

/* JNI_dev_krypton_57_1_4 | RVA 0x13f5a0 | dev/krypton/57.1([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_57_1_4(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  bool bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  void *pvVar11;
  longlong lVar12;
  ulonglong uVar13;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar14;
  void *pvVar15;
  void *pvVar16;
  undefined8 uVar17;
  longlong lVar18;
  void *pvVar19;
  undefined8 uVar20;
  void *arg1;
  JNINativeInterface_ *pJVar21;
  int iVar22;
  ulonglong uVar24;
  char *pcVar25;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  longlong lStack_58;
  void *pvStack_50;
  void *pvStack_48;
  int iVar23;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e911f32:
    pJVar21 = *env;
LAB_7ffc3e90f839:
    UNRECOVERED_JUMPTABLE = pJVar21->ThrowNew;
    pcVar25 = &DAT_7ffc3eba6000;
    pvVar11 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e90f844:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e90f85a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar11,pcVar25);
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar22 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar22 < 1) goto LAB_7ffc3e911ef0;
  pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  pJVar21 = *env;
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e90f839;
  bVar2 = (*pJVar21->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0958);
  if (bVar2 == 0) goto LAB_7ffc3e911f11;
  lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar12 == 0) {
    return;
  }
  uVar13 = FUN_7ffc3e7d1a20(env,pvVar11,lVar12);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar22 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar22 < 2) goto LAB_7ffc3e911ef0;
  pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pJVar21 = *env;
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e90f839;
  bVar2 = (*pJVar21->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
  if (bVar2 == 0) goto LAB_7ffc3e911f11;
  lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
  if (lVar12 == 0) {
    return;
  }
  uVar5 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar22 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar22 < 3) goto LAB_7ffc3e911ef0;
  pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
  pJVar21 = *env;
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e90f839;
  bVar2 = (*pJVar21->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
  if (bVar2 == 0) goto LAB_7ffc3e911f11;
  uVar6 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar22 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar22 < 4) goto LAB_7ffc3e911ef0;
  pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
  pJVar21 = *env;
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e90f839;
  bVar2 = (*pJVar21->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
  if (bVar2 == 0) {
LAB_7ffc3e911f11:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar25 = (char *)0x7ffc3eba6033;
    pvVar11 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3e90f844;
  }
  uVar7 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar22 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar22 < 5) {
LAB_7ffc3e911ef0:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar25 = (char *)0x7ffc3eba6019;
    pvVar11 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e90f844;
  }
  pvStack_50 = (*(*env)->GetObjectArrayElement)(env,arg0,4);
  pvVar11 = (void *)FUN_7ffc3eb76c30(env,10);
  if (pvVar11 == (void *)0x0) {
    return;
  }
  if ((pvStack_50 != (void *)0x0) &&
     (bVar2 = (*(*env)->IsInstanceOf)(env,pvStack_50,pvVar11), bVar2 == 0)) goto LAB_7ffc3e911f11;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar22 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar22 < 6) goto LAB_7ffc3e911ef0;
  pvVar14 = (*(*env)->GetObjectArrayElement)(env,arg0,5);
  if ((pvVar14 != (void *)0x0) && (bVar2 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar11), bVar2 == 0)
     ) goto LAB_7ffc3e911f11;
  pvStack_48 = pvVar14;
  pvVar14 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar14 == (void *)0x0) {
    return;
  }
  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar14,0x8e);
  if (pvVar15 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar24 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar15 + 0x10));
  }
  else {
    uVar24 = (*(*env)->GetStaticLongField)(env,pvVar14,pvVar15);
  }
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4550 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0))
  {
    _DAT_7ffc3ebc4550 = (*(*env)->NewGlobalRef)(env,pvVar14);
  }
  pvVar14 = _DAT_7ffc3ebc4550;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  uVar24 = uVar24 ^ uVar13;
  uVar13 = uVar24 ^ 0x7db7a94234a164e3;
  pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
  uVar17 = FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  uVar8 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
  if (((_DAT_7ffc3ebc4558 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0))
  {
    _DAT_7ffc3ebc4558 = (*(*env)->NewGlobalRef)(env,pvVar14);
  }
  pvVar14 = _DAT_7ffc3ebc4558;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x5aab);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     uVar24 ^ 0x46fcc5108f19911b);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
  uVar17 = FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  bVar2 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
  if (((_DAT_7ffc3ebc4560 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0))
  {
    _DAT_7ffc3ebc4560 = (*(*env)->NewGlobalRef)(env,pvVar14);
  }
  pvVar14 = _DAT_7ffc3ebc4560;
  bVar3 = (*(*env)->ExceptionCheck)(env);
  if (bVar3 != 0) {
    return;
  }
  pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
  uVar17 = FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
  bVar3 = (*(*env)->ExceptionCheck)(env);
  if (bVar3 != 0) {
    return;
  }
  uVar9 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
  if (((_DAT_7ffc3ebc4568 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0))
  {
    _DAT_7ffc3ebc4568 = (*(*env)->NewGlobalRef)(env,pvVar14);
  }
  pvVar14 = _DAT_7ffc3ebc4568;
  bVar3 = (*(*env)->ExceptionCheck)(env);
  if (bVar3 != 0) {
    return;
  }
  pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x393f);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     uVar24 ^ 0x99f2f47a462f289);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
  uVar17 = FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
  bVar3 = (*(*env)->ExceptionCheck)(env);
  if (bVar3 != 0) {
    return;
  }
  bVar3 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
  if (((_DAT_7ffc3ebc4570 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0))
  {
    _DAT_7ffc3ebc4570 = (*(*env)->NewGlobalRef)(env,pvVar14);
  }
  pvVar14 = _DAT_7ffc3ebc4570;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return;
  }
  pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
  uVar17 = FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return;
  }
  uVar10 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
  lVar12 = FUN_7ffc3eb76c30(env,0x5b);
  if (lVar12 == 0) {
    return;
  }
  lVar18 = FUN_7ffc3eb76c90(env,lVar12,0xef);
  if (lVar18 == 0) {
    return;
  }
  lStack_58 = FUN_7ffc3e7d1a80(env,lVar12,lVar18);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4578 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae31c,0x7ffc3ebae424,0,0), lVar12 != 0)) &&
     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0))
  {
    _DAT_7ffc3ebc4578 = (*(*env)->NewGlobalRef)(env,pvVar14);
  }
  pvVar14 = _DAT_7ffc3ebc4578;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return;
  }
  pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x5f42b10f55d1b9b8);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
  pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4580 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0), lVar12 != 0)) &&
     (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0))
  {
    _DAT_7ffc3ebc4580 = (*(*env)->NewGlobalRef)(env,pvVar15);
  }
  pvVar15 = _DAT_7ffc3ebc4580;
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return;
  }
  uVar8 = uVar10 & uVar7 | (uVar9 & uVar6) << (bVar3 & 0x1f) | (uVar8 & uVar5) << (bVar2 & 0x1f);
  pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar8);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar19);
  pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x5f421ad3a2af4f3a);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar19);
  pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar19);
  pvVar15 = (void *)FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,pvVar16);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (((_DAT_7ffc3ebc4588 == (void *)0x0) &&
      (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebadb04,0x7ffc3eba8504,0,0), lVar12 != 0)) &&
     (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar16 != (void *)0x0))
  {
    _DAT_7ffc3ebc4588 = (*(*env)->NewGlobalRef)(env,pvVar16);
  }
  pvVar16 = _DAT_7ffc3ebc4588;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  pvVar19 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar15);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x5f410c939fe71534);
  (*(*env)->SetObjectArrayElement)(env,pvVar19,2,pvVar14);
  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
  (*(*env)->SetObjectArrayElement)(env,pvVar19,3,pvVar14);
  pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar19);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return;
  }
  if (pvVar14 == (void *)0x0) {
    if (lStack_58 != 0) {
      bVar1 = false;
      pvVar11 = (void *)0x0;
      pvVar14 = (void *)0x0;
      goto LAB_7ffc3e9110fa;
    }
    if (((_DAT_7ffc3ebc4590 == (void *)0x0) &&
        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae31c,0x7ffc3eba6482,0,0), lVar12 != 0)) &&
       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar11 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc4590 = (*(*env)->NewGlobalRef)(env,pvVar11);
    }
    pvVar11 = _DAT_7ffc3ebc4590;
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x5f444bd366c482b6);
    (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar15);
    pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
    (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    if (pvVar11 == (void *)0x0) {
      pvVar11 = (*(*env)->NewByteArray)(env,0);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        pvVar11 = (*(*env)->ExceptionOccurred)(env);
        pvVar14 = (void *)FUN_7ffc3eb76c30(env,0x24);
        bVar2 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar14);
        if (bVar2 == 0) {
          return;
        }
        (*(*env)->ExceptionClear)(env);
        lVar12 = FUN_7ffc3eb76c30(env,0x74);
        if (lVar12 == 0) {
          return;
        }
        lVar18 = FUN_7ffc3eb76c90(env,lVar12,0x12f);
        if (lVar18 == 0) {
          return;
        }
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,lVar12,lVar18,pvVar11);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 != 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e912102. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar11);
        return;
      }
    }
    else {
      if (((_DAT_7ffc3ebc4598 == (void *)0x0) &&
          (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebae31c,0x7ffc3eba7845,0,0), lVar12 != 0)) &&
         (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
         pvVar14 != (void *)0x0)) {
        _DAT_7ffc3ebc4598 = (*(*env)->NewGlobalRef)(env,pvVar14);
      }
      pvVar14 = _DAT_7ffc3ebc4598;
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      pvVar15 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x5f40517f84d4c882);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar16);
      pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
      (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar16);
      pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      if (((_DAT_7ffc3ebc45a0 == (void *)0x0) &&
          (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebadb04,0x7ffc3ebadd6b,0,0), lVar12 != 0)) &&
         (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
         pvVar15 != (void *)0x0)) {
        _DAT_7ffc3ebc45a0 = (*(*env)->NewGlobalRef)(env,pvVar15);
      }
      pvVar15 = _DAT_7ffc3ebc45a0;
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      pvVar16 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar14);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x5f4436d2150dbe28);
      (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
      (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,pvVar16);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
    }
LAB_7ffc3e910c23:
    pvVar14 = (*(*env)->NewByteArray)(env,3);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    if (((_DAT_7ffc3ebc45a8 == (void *)0x0) &&
        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
       (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc45a8 = (*(*env)->NewGlobalRef)(env,pvVar15);
    }
    pvVar15 = _DAT_7ffc3ebc45a8;
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar19);
    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar19);
    uVar17 = FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    bVar2 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
    if (pvVar14 == (void *)0x0) goto LAB_7ffc3e911f32;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar22 = (*(*env)->GetArrayLength)(env,pvVar14);
    }
    if (iVar22 < 1) goto LAB_7ffc3e911ef0;
    bVar2 = bVar2 & (byte)uVar5;
    uStack_78 = CONCAT71(uStack_78._1_7_,bVar2);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      *(byte *)(*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
               (ulonglong)uRam00007ffc3ebc08f0) = bVar2;
    }
    else {
      (*(*env)->SetByteArrayRegion)(env,pvVar14,0,1,(byte *)&uStack_78);
    }
    if (((_DAT_7ffc3ebc45b0 == (void *)0x0) &&
        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                   0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
       (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)
       ) {
      _DAT_7ffc3ebc45b0 = (*(*env)->NewGlobalRef)(env,pvVar15);
    }
    pvVar15 = _DAT_7ffc3ebc45b0;
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar19);
    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar19);
    uVar17 = FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,pvVar16);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    bVar2 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar22 = (*(*env)->GetArrayLength)(env,pvVar14);
    }
    if (1 < iVar22) {
      bVar2 = bVar2 & (byte)uVar6;
      uStack_78 = CONCAT71(uStack_78._1_7_,bVar2);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
                 *(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc)) = bVar2;
      }
      else {
        (*(*env)->SetByteArrayRegion)(env,pvVar14,1,1,(byte *)&uStack_78);
      }
      if (((_DAT_7ffc3ebc45b8 == (void *)0x0) &&
          (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                     0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar12 != 0)) &&
         (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
         pvVar15 != (void *)0x0)) {
        _DAT_7ffc3ebc45b8 = (*(*env)->NewGlobalRef)(env,pvVar15);
      }
      pvVar15 = _DAT_7ffc3ebc45b8;
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
      (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar19);
      pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar19);
      uVar17 = FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40,pvVar16);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return;
      }
      bVar2 = FUN_7ffc3e7d8be0(env,uVar17,uRam00007ffc3ebc09d0);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar22 = (*(*env)->GetArrayLength)(env,pvVar14);
      }
      if (2 < iVar22) {
        bVar2 = bVar2 & (byte)uVar7;
        uStack_78 = CONCAT71(uStack_78._1_7_,bVar2);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
                   *(longlong *)((ulonglong)pvVar14 & 0xfffffffffffffffc)) = bVar2;
        }
        else {
          (*(*env)->SetByteArrayRegion)(env,pvVar14,2,1,(byte *)&uStack_78);
        }
        bVar1 = true;
        goto LAB_7ffc3e9110fa;
      }
    }
  }
  else {
    bVar2 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar11);
    if (bVar2 == 0) goto LAB_7ffc3e911f11;
    pvVar11 = pvVar14;
    if (lStack_58 == 0) goto LAB_7ffc3e910c23;
    bVar1 = false;
LAB_7ffc3e9110fa:
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,10);
    pvVar15 = (*(*env)->NewObjectArray)(env,4,pvVar15,(void *)0x0);
    bVar2 = (*(*env)->ExceptionCheck)(env);
    if (bVar2 != 0) {
      return;
    }
    if (pvVar15 == (void *)0x0) {
      pJVar21 = *env;
      pcVar25 = &DAT_7ffc3eba6000;
      pvVar11 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3e911f5c;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar22 = (*(*env)->GetArrayLength)(env,pvVar15);
    }
    if (0 < iVar22) {
      (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar22 = (*(*env)->GetArrayLength)(env,pvVar15);
      }
      if (1 < iVar22) {
        (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvStack_50);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar22 = (*(*env)->GetArrayLength)(env,pvVar15);
        }
        if (2 < iVar22) {
          (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvStack_48);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar22 = *(int *)(*(longlong *)((ulonglong)pvVar15 & 0xfffffffffffffffc) +
                             (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar22 = (*(*env)->GetArrayLength)(env,pvVar15);
          }
          if (3 < iVar22) {
            (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar14);
            if (((_DAT_7ffc3ebc45c0 == (void *)0x0) &&
                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                           0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0),
                lVar12 != 0)) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc45c0 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
            pvVar11 = _DAT_7ffc3ebc45c0;
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x5f418a7ecc7247d4);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar16);
              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar24);
              (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar16);
              pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar14);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (((_DAT_7ffc3ebc45c8 == (void *)0x0) &&
                    (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0),
                    lVar12 != 0)) &&
                   (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                   pvVar14 != (void *)0x0)) {
                  _DAT_7ffc3ebc45c8 = (*(*env)->NewGlobalRef)(env,pvVar14);
                }
                pvVar14 = _DAT_7ffc3ebc45c8;
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 == 0) {
                  pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                     uVar8);
                  (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar19);
                  pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x5f421ad3a2af4f3a);
                  (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar19);
                  pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar24);
                  (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar19);
                  pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar16);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 == 0) {
                    if (_DAT_7ffc3ebc45d0 == (void *)0x0) {
                      uStack_78 = FUN_7ffc3eb76d30(env,0x7ffc3eba8450,receiver);
                      uVar17 = FUN_7ffc3eb76c30(env,0x74);
                      uVar20 = FUN_7ffc3eb76c30(env,0x74);
                      uStack_70 = FUN_7ffc3eb770c0(env,uVar17,6,uVar20,0x7ffc3ebabc78,0x7ffc3ebae453
                                                  );
                      uStack_68 = FUN_7ffc3eb76d30(env,0x7ffc3ebae453,receiver);
                      lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                                0x7ffc3eba75b6,0x7ffc3eba84b3,0x7ffc3eba84b9,
                                                &uStack_78,3);
                      if ((lVar12 != 0) &&
                         (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                         pvVar16 != (void *)0x0)) {
                        _DAT_7ffc3ebc45d0 = (*(*env)->NewGlobalRef)(env,pvVar16);
                      }
                    }
                    pvVar16 = _DAT_7ffc3ebc45d0;
                    bVar2 = (*(*env)->ExceptionCheck)(env);
                    if (bVar2 == 0) {
                      pvVar19 = (*(*env)->NewObjectArray)(env,0,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar19);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 == 0) {
                        if (((_DAT_7ffc3ebc45d8 == (void *)0x0) &&
                            (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                       0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae491,
                                                       0,0), lVar12 != 0)) &&
                           (pvVar19 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                           pvVar19 != (void *)0x0)) {
                          _DAT_7ffc3ebc45d8 = (*(*env)->NewGlobalRef)(env,pvVar19);
                        }
                        pvVar19 = _DAT_7ffc3ebc45d8;
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if (bVar2 == 0) {
                          arg1 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar11);
                          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar14);
                          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar16);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x5f4f94b087b8fa85
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar24);
                          (*(*env)->SetObjectArrayElement)(env,arg1,4,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar19,uRam00007ffc3ebc0a40,arg1);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             (pvVar14 = (void *)FUN_7ffc3eb76c30(env,0x5c), pvVar14 != (void *)0x0))
                          {
                            if ((pvVar11 == (void *)0x0) ||
                               (bVar2 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar14), bVar2 != 0)) {
                              if (((_DAT_7ffc3ebc45e0 == (void *)0x0) &&
                                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3ebadb04,0x7ffc3eba6245,0,0),
                                  lVar12 != 0)) &&
                                 (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00
                                                                    ), pvVar14 != (void *)0x0)) {
                                _DAT_7ffc3ebc45e0 = (*(*env)->NewGlobalRef)(env,pvVar14);
                              }
                              pvVar14 = _DAT_7ffc3ebc45e0;
                              bVar2 = (*(*env)->ExceptionCheck)(env);
                              if (bVar2 == 0) {
                                pvVar16 = (*(*env)->NewObjectArray)
                                                    (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar11);
                                (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar15);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,
                                                                   0x5f4f6109611c8ea3);
                                (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar11);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,uVar24);
                                (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar11);
                                uVar17 = FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar16);
                                bVar2 = (*(*env)->ExceptionCheck)(env);
                                if (bVar2 == 0) {
                                  FUN_7ffc3e7d53d0(env,uVar17,uRam00007ffc3ebc0a38);
                                  iVar23 = (int)((longlong)uVar24 >> 0x3f);
                                  iVar22 = iVar23 + (uint)(0 < (longlong)uVar24);
                                  if ((iVar22 == 0 ||
                                      SCARRY4(iVar23,(uint)(0 < (longlong)uVar24)) != iVar22 < 0) ||
                                      bVar1) {
                                    return;
                                  }
                                  pvVar11 = (*(*env)->NewObjectArray)
                                                      (env,2,pvRam00007ffc3ebc09e8,(void *)0x0);
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (((bVar2 == 0) &&
                                      (lVar12 = FUN_7ffc3eb76c30(env,0xb), lVar12 != 0)) &&
                                     (lVar18 = FUN_7ffc3eb76c90(env,lVar12,10), lVar18 != 0)) {
                                    FUN_7ffc3e7e6a80(env,lVar12,lVar18,pvVar11);
                                    bVar2 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar2 == 0) {
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a58,(char *)0x7ffc3eba6033);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            pvVar11 = (*(*env)->ExceptionOccurred)(env);
            pvVar14 = (void *)FUN_7ffc3eb76c30(env,0x24);
            bVar2 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar14);
            if (bVar2 == 0) {
              return;
            }
            (*(*env)->ExceptionClear)(env);
            lVar12 = FUN_7ffc3eb76c30(env,0x74);
            if (lVar12 == 0) {
              return;
            }
            lVar18 = FUN_7ffc3eb76c90(env,lVar12,0x12f);
            if (lVar18 == 0) {
              return;
            }
            pvVar11 = (void *)FUN_7ffc3e7d1a80(env,lVar12,lVar18,pvVar11);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return;
            }
            (*(*env)->Throw)(env,pvVar11);
            return;
          }
        }
      }
    }
  }
  pJVar21 = *env;
  pcVar25 = (char *)0x7ffc3eba6019;
  pvVar11 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e911f5c:
  (*pJVar21->ThrowNew)(env,pvVar11,pcVar25);
  return;
}

/* JNI_dev_krypton_57_7_5 | RVA 0x142110 | dev/krypton/57.7([Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_7_5(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  void *pvVar11;
  longlong lVar12;
  longlong lVar13;
  ulonglong uVar14;
  JNINativeInterface_ *pJVar15;
  void *pvVar16;
  void *pvVar17;
  undefined8 uVar18;
  void *pvVar19;
  undefined8 uVar20;
  void *pvVar21;
  char *arg2;
  ulonglong uVar22;
  char cStack_78;
  char cStack_74;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) {
    pJVar15 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar6 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar6 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar6 < 1) {
LAB_7ffc3e9134e9:
      pJVar15 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar11 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9123b0;
    }
    pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar15 = *env;
    if (pvVar11 != (void *)0x0) {
      bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
      if (bVar1 != 0) {
        lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar12 == 0) {
          return (void *)0x0;
        }
        uVar4 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar6 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar6 < 2) goto LAB_7ffc3e9134e9;
        pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar15 = *env;
        if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9123a9;
        bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0958);
        if (bVar1 != 0) {
          lVar13 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
          if (lVar13 == 0) {
            return (void *)0x0;
          }
          uVar14 = FUN_7ffc3e7d1a20(env,pvVar11,lVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar6 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar6 = (*(*env)->GetArrayLength)(env,arg0);
          }
          if (iVar6 < 3) goto LAB_7ffc3e9134e9;
          pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
          pJVar15 = *env;
          if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9123a9;
          bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
          if (bVar1 != 0) {
            uVar5 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar6 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar6 = (*(*env)->GetArrayLength)(env,arg0);
            }
            if (iVar6 < 4) goto LAB_7ffc3e9134e9;
            pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
            pJVar15 = *env;
            if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9123a9;
            bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
            if (bVar1 != 0) {
              uVar7 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x74);
              if (pvVar11 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar16 = (void *)FUN_7ffc3eb76ce0(env,pvVar11,0x8e);
              if (pvVar16 == (void *)0x0) {
                return (void *)0x0;
              }
              if (cRam00007ffc3ebc08f4 == '\x01') {
                uVar22 = *(ulonglong *)
                          (*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                          (longlong)*(int *)((longlong)pvVar16 + 0x10));
              }
              else {
                uVar22 = (*(*env)->GetStaticLongField)(env,pvVar11,pvVar16);
              }
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (((_DAT_7ffc3ebc93b0 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                  lVar12 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc93b0 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc93b0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              uVar22 = uVar22 ^ uVar14;
              pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x725a);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22 ^ 0x7117d616b087701);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
              uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              uVar8 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
              if (((_DAT_7ffc3ebc93b8 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                  lVar12 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc93b8 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc93b8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x6e8d);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22 ^ 0x2f07bd9120616bd0);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
              uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              bVar1 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
              if (((_DAT_7ffc3ebc93c0 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                  lVar12 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc93c0 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc93c0;
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x2f52);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22 ^ 0x7db7a6c1556c2a0d);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
              uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              uVar9 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
              if (((_DAT_7ffc3ebc93c8 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                  lVar12 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc93c8 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc93c8;
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x57ce);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22 ^ 0x4e3cf21bf16d294);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
              uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              bVar2 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
              if (((_DAT_7ffc3ebc93d0 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                  lVar12 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc93d0 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc93d0;
              bVar3 = (*(*env)->ExceptionCheck)(env);
              if (bVar3 != 0) {
                return (void *)0x0;
              }
              pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x2f52);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22 ^ 0x7db7a6c1556c2a0d);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
              uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
              bVar3 = (*(*env)->ExceptionCheck)(env);
              if (bVar3 != 0) {
                return (void *)0x0;
              }
              uVar10 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
              if (((_DAT_7ffc3ebc93d8 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0),
                  lVar12 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc93d8 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc93d8;
              bVar3 = (*(*env)->ExceptionCheck)(env);
              if (bVar3 != 0) {
                return (void *)0x0;
              }
              pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x11af85fdadbf093a);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22);
              (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
              pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
              bVar3 = (*(*env)->ExceptionCheck)(env);
              if (bVar3 != 0) {
                return (void *)0x0;
              }
              if (((_DAT_7ffc3ebc93e0 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0),
                  lVar12 != 0)) &&
                 (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar16 != (void *)0x0)) {
                _DAT_7ffc3ebc93e0 = (*(*env)->NewGlobalRef)(env,pvVar16);
              }
              pvVar16 = _DAT_7ffc3ebc93e0;
              bVar3 = (*(*env)->ExceptionCheck)(env);
              if (bVar3 != 0) {
                return (void *)0x0;
              }
              pvVar17 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 uVar10 & uVar7 |
                                                 (uVar9 & uVar5) << (bVar2 & 0x1f) |
                                                 (uVar8 & uVar4) << (bVar1 & 0x1f));
              (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar19);
              pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x11ac1550c36201d4);
              (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar19);
              pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22);
              (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar19);
              pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (_DAT_7ffc3ebc93e8 == (void *)0x0) {
                uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba8450,receiver);
                uVar18 = FUN_7ffc3eb76c30(env,0x74);
                uVar20 = FUN_7ffc3eb76c30(env,0x74);
                uStack_50 = FUN_7ffc3eb770c0(env,uVar18,6,uVar20,0x7ffc3ebae451,0x7ffc3ebb00a8);
                uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebae453,receiver);
                lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                          0x7ffc3eba75b6,0x7ffc3eba84b3,0x7ffc3ebb00ea,&uStack_58,3)
                ;
                if ((lVar12 != 0) &&
                   (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                   pvVar17 != (void *)0x0)) {
                  _DAT_7ffc3ebc93e8 = (*(*env)->NewGlobalRef)(env,pvVar17);
                }
              }
              pvVar17 = _DAT_7ffc3ebc93e8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar19 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              cStack_74 = (char)uVar4;
              pvVar21 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0950,uRam00007ffc3ebc0900,
                                                 (int)cStack_74);
              (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar21);
              cStack_78 = (char)uVar5;
              pvVar21 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0950,uRam00007ffc3ebc0900,
                                                 (int)cStack_78);
              (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar21);
              pvVar21 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 uVar7);
              (*(*env)->SetObjectArrayElement)(env,pvVar19,2,pvVar21);
              pvVar21 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22 ^ 0x5c0564106aea);
              (*(*env)->SetObjectArrayElement)(env,pvVar19,3,pvVar21);
              pvVar17 = (void *)FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (((_DAT_7ffc3ebc93f0 == (void *)0x0) &&
                  (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae491,0,0),
                  lVar12 != 0)) &&
                 (pvVar19 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                 pvVar19 != (void *)0x0)) {
                _DAT_7ffc3ebc93f0 = (*(*env)->NewGlobalRef)(env,pvVar19);
              }
              pvVar19 = _DAT_7ffc3ebc93f0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar21 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar21,0,pvVar11);
              (*(*env)->SetObjectArrayElement)(env,pvVar21,1,pvVar16);
              (*(*env)->SetObjectArrayElement)(env,pvVar21,2,pvVar17);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x11a19b33e675b46b);
              (*(*env)->SetObjectArrayElement)(env,pvVar21,3,pvVar11);
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar22);
              (*(*env)->SetObjectArrayElement)(env,pvVar21,4,pvVar11);
              pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar19,uRam00007ffc3ebc0a40,pvVar21);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar16 = (void *)FUN_7ffc3eb76c30(env,0x5c);
              if (pvVar16 == (void *)0x0) {
                return (void *)0x0;
              }
              if (pvVar11 == (void *)0x0) {
                return (void *)0x0;
              }
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar16);
              if (bVar1 != 0) {
                return pvVar11;
              }
            }
          }
        }
      }
      pJVar15 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar11 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e9123b0;
    }
  }
LAB_7ffc3e9123a9:
  arg2 = &DAT_7ffc3eba6000;
  pvVar11 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9123b0:
  (*pJVar15->ThrowNew)(env,pvVar11,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_8_6 | RVA 0x143520 | dev/krypton/57.8([Ljava/lang/Object;)[[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_8_6(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  int iVar10;
  void *pvVar11;
  longlong lVar12;
  longlong lVar13;
  ulonglong uVar14;
  JNINativeInterface_ *pJVar15;
  void *pvVar16;
  void *pvVar17;
  undefined8 uVar18;
  void *pvVar19;
  void *pvVar20;
  ulonglong uVar21;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e915130:
    pJVar15 = *env;
LAB_7ffc3e9137b3:
    arg2 = &DAT_7ffc3eba6000;
    pvVar11 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar10 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar10 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (0 < iVar10) {
      pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
      pJVar15 = *env;
      if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9137b3;
      bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) {
LAB_7ffc3e915142:
        pJVar15 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar11 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e9137ba;
      }
      lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
      if (lVar12 == 0) {
        return (void *)0x0;
      }
      uVar4 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar10 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                         (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar10 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (1 < iVar10) {
        pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar15 = *env;
        if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9137b3;
        bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e915142;
        uVar5 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar10 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar10 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (2 < iVar10) {
          pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
          pJVar15 = *env;
          if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9137b3;
          bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0958);
          if (bVar1 == 0) goto LAB_7ffc3e915142;
          lVar13 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
          if (lVar13 == 0) {
            return (void *)0x0;
          }
          uVar14 = FUN_7ffc3e7d1a20(env,pvVar11,lVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar10 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                             (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar10 = (*(*env)->GetArrayLength)(env,arg0);
          }
          if (3 < iVar10) {
            pvVar11 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
            pJVar15 = *env;
            if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9137b3;
            bVar1 = (*pJVar15->IsInstanceOf)(env,pvVar11,pvRam00007ffc3ebc0a10);
            if (bVar1 == 0) goto LAB_7ffc3e915142;
            uVar6 = FUN_7ffc3e7d8be0(env,pvVar11,lVar12);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar11 = (void *)FUN_7ffc3eb76c30(env,0x74);
            if (pvVar11 == (void *)0x0) {
              return (void *)0x0;
            }
            pvVar16 = (void *)FUN_7ffc3eb76ce0(env,pvVar11,0x8e);
            if (pvVar16 == (void *)0x0) {
              return (void *)0x0;
            }
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar21 = *(ulonglong *)
                        (*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                        (longlong)*(int *)((longlong)pvVar16 + 0x10));
            }
            else {
              uVar21 = (*(*env)->GetStaticLongField)(env,pvVar11,pvVar16);
            }
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc7728 == (void *)0x0) &&
                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                           0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar12 != 0)) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc7728 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
            pvVar11 = _DAT_7ffc3ebc7728;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            uVar21 = uVar21 ^ uVar14;
            uVar14 = uVar21 ^ 0x7db7b2206c5e633d;
            pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
            uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            uVar7 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc7730 == (void *)0x0) &&
                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                           0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar12 != 0)) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc7730 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
            pvVar11 = _DAT_7ffc3ebc7730;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x5aab
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar21 ^ 0x46fcde72d7e696c5);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
            uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            bVar1 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc7738 == (void *)0x0) &&
                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                           0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar12 != 0)) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc7738 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
            pvVar11 = _DAT_7ffc3ebc7738;
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
            uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            uVar8 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc7740 == (void *)0x0) &&
                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                           0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar12 != 0)) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc7740 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
            pvVar11 = _DAT_7ffc3ebc7740;
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x393f
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar21 ^ 0x99f3425fc9df557);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
            uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            bVar2 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc7748 == (void *)0x0) &&
                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                           0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar12 != 0)) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc7748 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
            pvVar11 = _DAT_7ffc3ebc7748;
            bVar3 = (*(*env)->ExceptionCheck)(env);
            if (bVar3 != 0) {
              return (void *)0x0;
            }
            pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
            pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
            uVar18 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
            bVar3 = (*(*env)->ExceptionCheck)(env);
            if (bVar3 != 0) {
              return (void *)0x0;
            }
            uVar9 = FUN_7ffc3e7d8be0(env,uVar18,uRam00007ffc3ebc09d0);
            pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar3 = (*(*env)->ExceptionCheck)(env);
            if (bVar3 != 0) {
              return (void *)0x0;
            }
            lVar12 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
            if (lVar12 == 0) {
              return (void *)0x0;
            }
            pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar12,uVar6);
            bVar3 = (*(*env)->ExceptionCheck)(env);
            if (bVar3 != 0) {
              return (void *)0x0;
            }
            if (pvVar11 == (void *)0x0) goto LAB_7ffc3e915130;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar10 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                               (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar10 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if (3 < iVar10) {
              (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar16);
              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar12,uVar5);
              bVar3 = (*(*env)->ExceptionCheck)(env);
              if (bVar3 != 0) {
                return (void *)0x0;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar10 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar10 = (*(*env)->GetArrayLength)(env,pvVar11);
              }
              if (2 < iVar10) {
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar16);
                lVar13 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                if (lVar13 == 0) {
                  return (void *)0x0;
                }
                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar13,
                                                   uVar21 ^ 0xf578b532157);
                bVar3 = (*(*env)->ExceptionCheck)(env);
                if (bVar3 != 0) {
                  return (void *)0x0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar10 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                   (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar10 = (*(*env)->GetArrayLength)(env,pvVar11);
                }
                if (1 < iVar10) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar16);
                  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar12,uVar4);
                  bVar3 = (*(*env)->ExceptionCheck)(env);
                  if (bVar3 != 0) {
                    return (void *)0x0;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar10 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                     (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar10 = (*(*env)->GetArrayLength)(env,pvVar11);
                  }
                  if (0 < iVar10) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar16);
                    if (((_DAT_7ffc3ebc7750 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3ebaacdb,0,0)
                        , lVar12 != 0)) &&
                       (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar16 != (void *)0x0)) {
                      _DAT_7ffc3ebc7750 = (*(*env)->NewGlobalRef)(env,pvVar16);
                    }
                    pvVar16 = _DAT_7ffc3ebc7750;
                    bVar3 = (*(*env)->ExceptionCheck)(env);
                    if (bVar3 != 0) {
                      return (void *)0x0;
                    }
                    pvVar17 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x58910f880e27ee02);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                    bVar3 = (*(*env)->ExceptionCheck)(env);
                    if (bVar3 != 0) {
                      return (void *)0x0;
                    }
                    if (((_DAT_7ffc3ebc7758 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6478,
                                                   0x7ffc3eba606c,0x7ffc3eba74dd,0x7ffc3eba72e8,0,0)
                        , lVar12 != 0)) &&
                       (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar16 != (void *)0x0)) {
                      _DAT_7ffc3ebc7758 = (*(*env)->NewGlobalRef)(env,pvVar16);
                    }
                    pvVar16 = _DAT_7ffc3ebc7758;
                    bVar3 = (*(*env)->ExceptionCheck)(env);
                    if (bVar3 == 0) {
                      pvVar17 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0x3798);
                      (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar19);
                      pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,
                                                         uVar21 ^ 0x58758784abfda036);
                      (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar19);
                      uVar18 = FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                      bVar3 = (*(*env)->ExceptionCheck)(env);
                      if (bVar3 == 0) {
                        uVar18 = FUN_7ffc3e7d1a20(env,uVar18,uRam00007ffc3ebc0968);
                        if (((_DAT_7ffc3ebc7760 == (void *)0x0) &&
                            (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                       0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3eba7750,
                                                       0,0), lVar12 != 0)) &&
                           (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                           pvVar16 != (void *)0x0)) {
                          _DAT_7ffc3ebc7760 = (*(*env)->NewGlobalRef)(env,pvVar16);
                        }
                        pvVar16 = _DAT_7ffc3ebc7760;
                        bVar3 = (*(*env)->ExceptionCheck)(env);
                        if (bVar3 == 0) {
                          pvVar17 = (*(*env)->NewObjectArray)
                                              (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x589d18eb63cdcf5f
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar19);
                          pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar21);
                          (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar19);
                          pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,
                                                             pvVar17);
                          bVar3 = (*(*env)->ExceptionCheck)(env);
                          if (bVar3 == 0) {
                            if (((_DAT_7ffc3ebc7768 == (void *)0x0) &&
                                (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                           0x7ffc3eba606a,0x7ffc3eba606c,
                                                           0x7ffc3ebadb04,0x7ffc3ebae51d,0,0),
                                lVar12 != 0)) &&
                               (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                               pvVar17 != (void *)0x0)) {
                              _DAT_7ffc3ebc7768 = (*(*env)->NewGlobalRef)(env,pvVar17);
                            }
                            pvVar17 = _DAT_7ffc3ebc7768;
                            bVar3 = (*(*env)->ExceptionCheck)(env);
                            if (bVar3 == 0) {
                              pvVar19 = (*(*env)->NewObjectArray)
                                                  (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar11);
                              pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,uVar18);
                              (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar20);
                              (*(*env)->SetObjectArrayElement)(env,pvVar19,2,pvVar16);
                              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 0x589d443c511056d8);
                              (*(*env)->SetObjectArrayElement)(env,pvVar19,3,pvVar16);
                              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,uVar21);
                              (*(*env)->SetObjectArrayElement)(env,pvVar19,4,pvVar16);
                              pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,
                                                                 pvVar19);
                              bVar3 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar3 == 0) &&
                                 (pvVar17 = (void *)FUN_7ffc3eb76c30(env,9), pvVar17 != (void *)0x0)
                                 ) {
                                if (pvVar16 == (void *)0x0) {
                                  return (void *)0x0;
                                }
                                bVar3 = (*(*env)->IsInstanceOf)(env,pvVar16,pvVar17);
                                if (bVar3 != 0) {
                                  return pvVar16;
                                }
                                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a58,(char *)0x7ffc3eba6033
                                                   );
                              }
                            }
                          }
                        }
                      }
                    }
                    (*(*env)->ExceptionOccurred)(env);
                    (*(*env)->ExceptionClear)(env);
                    if (((_DAT_7ffc3ebc7770 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0)
                        , lVar12 != 0)) &&
                       (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar16 != (void *)0x0)) {
                      _DAT_7ffc3ebc7770 = (*(*env)->NewGlobalRef)(env,pvVar16);
                    }
                    pvVar16 = _DAT_7ffc3ebc7770;
                    bVar3 = (*(*env)->ExceptionCheck)(env);
                    if (bVar3 != 0) {
                      return (void *)0x0;
                    }
                    pvVar17 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x589f911c948d400a);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar19);
                    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar19);
                    pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                    bVar3 = (*(*env)->ExceptionCheck)(env);
                    if (bVar3 != 0) {
                      return (void *)0x0;
                    }
                    if (((_DAT_7ffc3ebc7778 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0)
                        , lVar12 != 0)) &&
                       (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar17 != (void *)0x0)) {
                      _DAT_7ffc3ebc7778 = (*(*env)->NewGlobalRef)(env,pvVar17);
                    }
                    pvVar17 = _DAT_7ffc3ebc7778;
                    bVar3 = (*(*env)->ExceptionCheck)(env);
                    if (bVar3 != 0) {
                      return (void *)0x0;
                    }
                    uVar4 = uVar9 & uVar6 |
                            (uVar8 & uVar5) << (bVar2 & 0x1f) | (uVar7 & uVar4) << (bVar1 & 0x1f);
                    pvVar19 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,
                                                       uRam00007ffc3ebc0998,uVar4);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar20);
                    pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x589c01b1fa5048e4);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar20);
                    pvVar20 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,2,pvVar20);
                    pvVar17 = (void *)FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (((_DAT_7ffc3ebc7780 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae559,0,0)
                        , lVar12 != 0)) &&
                       (pvVar19 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar19 != (void *)0x0)) {
                      _DAT_7ffc3ebc7780 = (*(*env)->NewGlobalRef)(env,pvVar19);
                    }
                    pvVar19 = _DAT_7ffc3ebc7780;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    pvVar20 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar20,0,pvVar16);
                    (*(*env)->SetObjectArrayElement)(env,pvVar20,1,pvVar17);
                    (*(*env)->SetObjectArrayElement)(env,pvVar20,2,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x589f61909eb5fadc);
                    (*(*env)->SetObjectArrayElement)(env,pvVar20,3,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar20,4,pvVar11);
                    uVar18 = FUN_7ffc3e7d1a50(env,pvVar19,uRam00007ffc3ebc0a40,pvVar20);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    FUN_7ffc3e7d53d0(env,uVar18,uRam00007ffc3ebc0a38);
                    if (((_DAT_7ffc3ebc7788 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0)
                        , lVar12 != 0)) &&
                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar11 != (void *)0x0)) {
                      _DAT_7ffc3ebc7788 = (*(*env)->NewGlobalRef)(env,pvVar11);
                    }
                    pvVar11 = _DAT_7ffc3ebc7788;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    pvVar16 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x589caa6d0d2ebe66);
                    (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
                    pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
                    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar16);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (((_DAT_7ffc3ebc7790 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0)
                        , lVar12 != 0)) &&
                       (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar16 != (void *)0x0)) {
                      _DAT_7ffc3ebc7790 = (*(*env)->NewGlobalRef)(env,pvVar16);
                    }
                    pvVar16 = _DAT_7ffc3ebc7790;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    pvVar17 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,
                                                       uRam00007ffc3ebc0998,uVar4);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar19);
                    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x589c01b1fa5048e4);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar19);
                    pvVar19 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar19);
                    pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (((_DAT_7ffc3ebc7798 == (void *)0x0) &&
                        (lVar12 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3eba8504,0,0)
                        , lVar12 != 0)) &&
                       (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar12,uRam00007ffc3ebc0a00),
                       pvVar17 != (void *)0x0)) {
                      _DAT_7ffc3ebc7798 = (*(*env)->NewGlobalRef)(env,pvVar17);
                    }
                    pvVar17 = _DAT_7ffc3ebc7798;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    pvVar19 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,0,pvVar11);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,1,pvVar16);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x589f17f1c71812ea);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,2,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar21);
                    (*(*env)->SetObjectArrayElement)(env,pvVar19,3,pvVar11);
                    FUN_7ffc3e7d1a50(env,pvVar17,uRam00007ffc3ebc0a40,pvVar19);
                    (*(*env)->ExceptionCheck)(env);
                    return (void *)0x0;
                  }
                }
              }
            }
          }
        }
      }
    }
    pJVar15 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar11 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3e9137ba:
  (*pJVar15->ThrowNew)(env,pvVar11,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_9_7 | RVA 0x145520 | dev/krypton/57.9([Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_9_7(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  void *pvVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong uVar11;
  JNINativeInterface_ *pJVar12;
  void *pvVar13;
  void *pvVar14;
  undefined8 uVar15;
  void *pvVar16;
  undefined8 uVar17;
  void *pvVar18;
  ulonglong uVar19;
  char *arg2;
  char cStack_80;
  char cStack_7c;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) {
    pJVar12 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar4 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar4 < 1) {
LAB_7ffc3e916549:
      pJVar12 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar8 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e915726;
    }
    pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar12 = *env;
    if (pvVar8 != (void *)0x0) {
      bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0a10);
      if (bVar1 != 0) {
        lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        uVar3 = FUN_7ffc3e7d8be0(env,pvVar8,lVar9);
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
        if (iVar4 < 2) goto LAB_7ffc3e916549;
        pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar12 = *env;
        if (pvVar8 == (void *)0x0) goto LAB_7ffc3e91571f;
        bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0958);
        if (bVar1 != 0) {
          lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          uVar11 = FUN_7ffc3e7d1a20(env,pvVar8,lVar10);
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
          if (iVar4 < 3) goto LAB_7ffc3e916549;
          pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
          pJVar12 = *env;
          if (pvVar8 == (void *)0x0) goto LAB_7ffc3e91571f;
          bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0a10);
          if (bVar1 != 0) {
            uVar5 = FUN_7ffc3e7d8be0(env,pvVar8,lVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x74);
            if (pvVar8 == (void *)0x0) {
              return (void *)0x0;
            }
            pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x8e);
            if (pvVar13 == (void *)0x0) {
              return (void *)0x0;
            }
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar19 = *(ulonglong *)
                        (*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (longlong)*(int *)((longlong)pvVar13 + 0x10));
            }
            else {
              uVar19 = (*(*env)->GetStaticLongField)(env,pvVar8,pvVar13);
            }
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc93f8 == (void *)0x0) &&
                (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                          0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar9 != 0)) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc93f8 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
            pvVar8 = _DAT_7ffc3ebc93f8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            uVar19 = uVar19 ^ uVar11;
            pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar19 ^ 0x7db7cb4fd1fd77f9);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
            uVar15 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            uVar6 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc9400 == (void *)0x0) &&
                (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                          0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar9 != 0)) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc9400 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
            pvVar8 = _DAT_7ffc3ebc9400;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x393f
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar19 ^ 0x99f4d4a413ee193);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
            uVar15 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            bVar1 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc9408 == (void *)0x0) &&
                (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                          0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar9 != 0)) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc9408 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
            pvVar8 = _DAT_7ffc3ebc9408;
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar19 ^ 0x7db7cb4fd1fd77f9);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
            uVar15 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            uVar7 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
            if (((_DAT_7ffc3ebc9410 == (void *)0x0) &&
                (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0),
                lVar9 != 0)) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc9410 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
            pvVar8 = _DAT_7ffc3ebc9410;
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x4c5ad445ac200aaf);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
            pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc9418 == (void *)0x0) &&
                (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0),
                lVar9 != 0)) &&
               (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar13 != (void *)0x0)) {
              _DAT_7ffc3ebc9418 = (*(*env)->NewGlobalRef)(env,pvVar13);
            }
            pvVar13 = _DAT_7ffc3ebc9418;
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            pvVar14 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                               uVar7 & uVar5 | (uVar6 & uVar3) << (bVar1 & 0x1f));
            (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar16);
            pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x4c5878de47f35c20);
            (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar16);
            pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar16);
            pvVar13 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (_DAT_7ffc3ebc9420 == (void *)0x0) {
              uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba8450,receiver);
              uVar15 = FUN_7ffc3eb76c30(env,0x74);
              uVar17 = FUN_7ffc3eb76c30(env,0x74);
              uStack_50 = FUN_7ffc3eb770c0(env,uVar15,6,uVar17,0x7ffc3ebaac15,0x7ffc3ebb010e);
              uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebae453,receiver);
              lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                       0x7ffc3eba84b3,0x7ffc3ebb0151,&uStack_58,3);
              if ((lVar9 != 0) &&
                 (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                 pvVar14 != (void *)0x0)) {
                _DAT_7ffc3ebc9420 = (*(*env)->NewGlobalRef)(env,pvVar14);
              }
            }
            pvVar14 = _DAT_7ffc3ebc9420;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            uVar11 = uVar19 ^ 0x54bdcb7bd498;
            pvVar16 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar18 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                               uVar11 >> 0x20);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar18);
            cStack_7c = (char)uVar3;
            pvVar18 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0950,uRam00007ffc3ebc0900,
                                               (int)cStack_7c);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar18);
            pvVar18 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                               uVar11 >> 8 & 0xffffff);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar18);
            pvVar18 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0950,uRam00007ffc3ebc0900,
                                               (int)(char)uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar18);
            cStack_80 = (char)uVar5;
            pvVar18 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0950,uRam00007ffc3ebc0900,
                                               (int)cStack_80);
            (*(*env)->SetObjectArrayElement)(env,pvVar16,4,pvVar18);
            pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar16);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc9428 == (void *)0x0) &&
                (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae491,0,0),
                lVar9 != 0)) &&
               (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar16 != (void *)0x0)) {
              _DAT_7ffc3ebc9428 = (*(*env)->NewGlobalRef)(env,pvVar16);
            }
            pvVar16 = _DAT_7ffc3ebc9428;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar18 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar18,0,pvVar8);
            (*(*env)->SetObjectArrayElement)(env,pvVar18,1,pvVar13);
            (*(*env)->SetObjectArrayElement)(env,pvVar18,2,pvVar14);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x4c55f6bd62e4e99f);
            (*(*env)->SetObjectArrayElement)(env,pvVar18,3,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar18,4,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar18);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x5c);
            if (pvVar13 == (void *)0x0) {
              return (void *)0x0;
            }
            if (pvVar8 == (void *)0x0) {
              return (void *)0x0;
            }
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
            if (bVar1 != 0) {
              return pvVar8;
            }
          }
        }
      }
      pJVar12 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar8 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e915726;
    }
  }
LAB_7ffc3e91571f:
  arg2 = &DAT_7ffc3eba6000;
  pvVar8 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e915726:
  (*pJVar12->ThrowNew)(env,pvVar8,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_6_8 | RVA 0x146580 | dev/krypton/57.6([Ljava/lang/Object;)[[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_6_8(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  void *pvVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong uVar11;
  JNINativeInterface_ *pJVar12;
  void *pvVar13;
  void *pvVar14;
  undefined8 uVar15;
  void *pvVar16;
  void *pvVar17;
  ulonglong uVar18;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e917d10:
    pJVar12 = *env;
LAB_7ffc3e916771:
    arg2 = &DAT_7ffc3eba6000;
    pvVar8 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar7 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar7 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (0 < iVar7) {
      pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
      pJVar12 = *env;
      if (pvVar8 == (void *)0x0) goto LAB_7ffc3e916771;
      bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) {
LAB_7ffc3e917d22:
        pJVar12 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar8 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e916778;
      }
      lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
      if (lVar9 == 0) {
        return (void *)0x0;
      }
      uVar3 = FUN_7ffc3e7d8be0(env,pvVar8,lVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar7 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar7 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (1 < iVar7) {
        pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar12 = *env;
        if (pvVar8 == (void *)0x0) goto LAB_7ffc3e916771;
        bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3e917d22;
        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        uVar11 = FUN_7ffc3e7d1a20(env,pvVar8,lVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar7 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (2 < iVar7) {
          pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
          pJVar12 = *env;
          if (pvVar8 == (void *)0x0) goto LAB_7ffc3e916771;
          bVar1 = (*pJVar12->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0a10);
          if (bVar1 == 0) goto LAB_7ffc3e917d22;
          uVar4 = FUN_7ffc3e7d8be0(env,pvVar8,lVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x74);
          if (pvVar8 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x8e);
          if (pvVar13 == (void *)0x0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar18 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar13 + 0x10));
          }
          else {
            uVar18 = (*(*env)->GetStaticLongField)(env,pvVar8,pvVar13);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (((_DAT_7ffc3ebc76c0 == (void *)0x0) &&
              (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                        0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar9 != 0)) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc76c0 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
          pvVar8 = _DAT_7ffc3ebc76c0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar18 = uVar18 ^ uVar11;
          pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar18 ^ 0x7db7fca5a1942f85);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
          uVar15 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar5 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
          if (((_DAT_7ffc3ebc76c8 == (void *)0x0) &&
              (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                        0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar9 != 0)) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc76c8 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
          pvVar8 = _DAT_7ffc3ebc76c8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x393f);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar18 ^ 0x99f7aa03157b9ef);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
          uVar15 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          bVar1 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
          if (((_DAT_7ffc3ebc76d0 == (void *)0x0) &&
              (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                        0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar9 != 0)) &&
             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar8 != (void *)0x0)) {
            _DAT_7ffc3ebc76d0 = (*(*env)->NewGlobalRef)(env,pvVar8);
          }
          pvVar8 = _DAT_7ffc3ebc76d0;
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar18 ^ 0x7db7fca5a1942f85);
          (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
          uVar15 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          uVar6 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar9,uVar4);
          bVar2 = (*(*env)->ExceptionCheck)(env);
          if (bVar2 != 0) {
            return (void *)0x0;
          }
          if (pvVar8 == (void *)0x0) goto LAB_7ffc3e917d10;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (2 < iVar7) {
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar13);
            lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar10,
                                               uVar18 ^ 0x2c5cc208301b);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 != 0) {
              return (void *)0x0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
            }
            if (1 < iVar7) {
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar9,uVar3);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 != 0) {
                return (void *)0x0;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
              }
              if (0 < iVar7) {
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar13);
                if (((_DAT_7ffc3ebc76d8 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3ebaacdb,0,0),
                    lVar9 != 0)) &&
                   (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar13 != (void *)0x0)) {
                  _DAT_7ffc3ebc76d8 = (*(*env)->NewGlobalRef)(env,pvVar13);
                }
                pvVar13 = _DAT_7ffc3ebc76d8;
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                pvVar14 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1429b85f2300ada4);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (((_DAT_7ffc3ebc76e0 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6478,
                                              0x7ffc3eba606c,0x7ffc3eba74dd,0x7ffc3eba72e8,0,0),
                    lVar9 != 0)) &&
                   (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar13 != (void *)0x0)) {
                  _DAT_7ffc3ebc76e0 = (*(*env)->NewGlobalRef)(env,pvVar13);
                }
                pvVar13 = _DAT_7ffc3ebc76e0;
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 == 0) {
                  pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                     0x2b94);
                  (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar16);
                  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar18 ^ 0x1b444c55731cf083);
                  (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar16);
                  uVar15 = FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
                  bVar2 = (*(*env)->ExceptionCheck)(env);
                  if (bVar2 == 0) {
                    uVar15 = FUN_7ffc3e7d1a20(env,uVar15,uRam00007ffc3ebc0968);
                    if (((_DAT_7ffc3ebc76e8 == (void *)0x0) &&
                        (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                  0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3eba7750,0,0),
                        lVar9 != 0)) &&
                       (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                       pvVar13 != (void *)0x0)) {
                      _DAT_7ffc3ebc76e8 = (*(*env)->NewGlobalRef)(env,pvVar13);
                    }
                    pvVar13 = _DAT_7ffc3ebc76e8;
                    bVar2 = (*(*env)->ExceptionCheck)(env);
                    if (bVar2 == 0) {
                      pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x1425566eae0783e7);
                      (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar16);
                      pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar18);
                      (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar16);
                      pvVar13 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
                      bVar2 = (*(*env)->ExceptionCheck)(env);
                      if (bVar2 == 0) {
                        if (((_DAT_7ffc3ebc76f0 == (void *)0x0) &&
                            (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae51d,0
                                                      ,0), lVar9 != 0)) &&
                           (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar14 != (void *)0x0)) {
                          _DAT_7ffc3ebc76f0 = (*(*env)->NewGlobalRef)(env,pvVar14);
                        }
                        pvVar14 = _DAT_7ffc3ebc76f0;
                        bVar2 = (*(*env)->ExceptionCheck)(env);
                        if (bVar2 == 0) {
                          pvVar16 = (*(*env)->NewObjectArray)
                                              (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar8);
                          pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar15);
                          (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
                          (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar13);
                          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x14250ab99cda1a60
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar13);
                          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar18);
                          (*(*env)->SetObjectArrayElement)(env,pvVar16,4,pvVar13);
                          pvVar13 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,
                                                             pvVar16);
                          bVar2 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar2 == 0) &&
                             (pvVar14 = (void *)FUN_7ffc3eb76c30(env,9), pvVar14 != (void *)0x0)) {
                            if (pvVar13 == (void *)0x0) {
                              return (void *)0x0;
                            }
                            bVar2 = (*(*env)->IsInstanceOf)(env,pvVar13,pvVar14);
                            if (bVar2 != 0) {
                              return pvVar13;
                            }
                            (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a58,(char *)0x7ffc3eba6033);
                          }
                        }
                      }
                    }
                  }
                }
                (*(*env)->ExceptionOccurred)(env);
                (*(*env)->ExceptionClear)(env);
                if (((_DAT_7ffc3ebc76f8 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0),
                    lVar9 != 0)) &&
                   (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar13 != (void *)0x0)) {
                  _DAT_7ffc3ebc76f8 = (*(*env)->NewGlobalRef)(env,pvVar13);
                }
                pvVar13 = _DAT_7ffc3ebc76f8;
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                pvVar14 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x1426e3afdc4952d3);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar16);
                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar16);
                pvVar13 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                if (((_DAT_7ffc3ebc7700 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0),
                    lVar9 != 0)) &&
                   (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar14 != (void *)0x0)) {
                  _DAT_7ffc3ebc7700 = (*(*env)->NewGlobalRef)(env,pvVar14);
                }
                pvVar14 = _DAT_7ffc3ebc7700;
                bVar2 = (*(*env)->ExceptionCheck)(env);
                if (bVar2 != 0) {
                  return (void *)0x0;
                }
                uVar3 = uVar6 & uVar4 | (uVar5 & uVar3) << (bVar1 & 0x1f);
                pvVar16 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   uVar3);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar17);
                pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x14244f34379a045c);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
                pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
                pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar16);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (((_DAT_7ffc3ebc7708 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae559,0,0),
                    lVar9 != 0)) &&
                   (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar16 != (void *)0x0)) {
                  _DAT_7ffc3ebc7708 = (*(*env)->NewGlobalRef)(env,pvVar16);
                }
                pvVar16 = _DAT_7ffc3ebc7708;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                pvVar17 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x14272f15537fb664);
                (*(*env)->SetObjectArrayElement)(env,pvVar17,3,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar17,4,pvVar8);
                uVar15 = FUN_7ffc3e7d1a50(env,pvVar16,uRam00007ffc3ebc0a40,pvVar17);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                FUN_7ffc3e7d53d0(env,uVar15,uRam00007ffc3ebc0a38);
                if (((_DAT_7ffc3ebc7710 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae424,0,0),
                    lVar9 != 0)) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc7710 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
                pvVar8 = _DAT_7ffc3ebc7710;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                pvVar13 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x1424a61f4320b94a);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar14);
                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar14);
                pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (((_DAT_7ffc3ebc7718 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba7fc3,0,0),
                    lVar9 != 0)) &&
                   (pvVar13 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar13 != (void *)0x0)) {
                  _DAT_7ffc3ebc7718 = (*(*env)->NewGlobalRef)(env,pvVar13);
                }
                pvVar13 = _DAT_7ffc3ebc7718;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                pvVar14 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   uVar3);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar16);
                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x14244f34379a045c);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar16);
                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar16);
                pvVar13 = (void *)FUN_7ffc3e7d1a50(env,pvVar13,uRam00007ffc3ebc0a40,pvVar14);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                if (((_DAT_7ffc3ebc7720 == (void *)0x0) &&
                    (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3eba8504,0,0),
                    lVar9 != 0)) &&
                   (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar14 != (void *)0x0)) {
                  _DAT_7ffc3ebc7720 = (*(*env)->NewGlobalRef)(env,pvVar14);
                }
                pvVar14 = _DAT_7ffc3ebc7720;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return (void *)0x0;
                }
                pvVar16 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar8);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar13);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x142759740ad25e52);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar18);
                (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar8);
                FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar16);
                (*(*env)->ExceptionCheck)(env);
                return (void *)0x0;
              }
            }
          }
        }
      }
    }
    pJVar12 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar8 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3e916778:
  (*pJVar12->ThrowNew)(env,pvVar8,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_9_9 | RVA 0x148100 | dev/krypton/57.9(IBIBBLjava/lang/Integer;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_9_9
                 (JNINativeInterface_ **env,void *receiver,int arg0,byte arg1,int arg2,byte arg3,
                 byte arg4,void *arg5)

{
  byte bVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  void *pvVar10;
  void *pvVar11;
  JNINativeInterface_ *pJVar12;
  undefined8 uVar13;
  char *arg2_00;
  ulonglong uVar14;
  byte *arg4_00;
  byte bStack_79;
  byte bStack_6a;
  byte bStack_69;
  ulonglong uStack_68;
  byte bStack_5a;
  byte bStack_59;
  void *pvStack_58;
  void *pvStack_50;
  void *pvStack_48;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x8e);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar14 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar6 + 0x10));
  }
  else {
    uVar14 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar6);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0x5b);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xef);
  if (lVar8 == 0) {
    return (void *)0x0;
  }
  lVar7 = FUN_7ffc3e7d1a80(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x5c);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
    return (void *)0x0;
  }
  lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0xf1);
  if (lVar8 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  uStack_68 = uVar14 ^ CONCAT44(arg0,arg2 << 8 | (uint)arg3);
  pvStack_58 = pvVar6;
  if (lVar7 != 0) {
LAB_7ffc3e9182bc:
    if (((_DAT_7ffc3ebc95a0 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3eba6482,0,0), lVar8 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc95a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc95a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar14 = uStack_68;
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a166d5fa822d53);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvStack_50 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (((_DAT_7ffc3ebc95a8 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3ebae424,0,0), lVar8 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc95a8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc95a8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a7defe4a535dc9);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (((_DAT_7ffc3ebc95b0 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3eba7845,0,0), lVar8 != 0)) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc95b0 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
    pvVar6 = _DAT_7ffc3ebc95b0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0xf0a57c7918926767);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (((_DAT_7ffc3ebc95b8 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadb04,0x7ffc3ebadd6b,0,0), lVar8 != 0)) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)) {
      _DAT_7ffc3ebc95b8 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
    pvVar9 = _DAT_7ffc3ebc95b8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvStack_50);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a11bd4894b11cd);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (((_DAT_7ffc3ebc95c0 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadb04,0x7ffc3ebae491,0,0), lVar8 != 0)) &&
       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0)) {
      _DAT_7ffc3ebc95c0 = (*(*env)->NewGlobalRef)(env,pvVar9);
    }
    pvVar9 = _DAT_7ffc3ebc95c0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar10 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,arg5);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a6922fed50b32b);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar10,4,pvVar5);
    FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (((_DAT_7ffc3ebc95c8 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3ebae595,0,0), lVar8 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc95c8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc95c8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a76c8606538c50);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (lVar7 != 0) {
      if (pvVar5 != (void *)0x0) goto LAB_7ffc3e918f1d;
      goto LAB_7ffc3e91a1e3;
    }
    bStack_79 = arg1;
    if (pvVar5 != (void *)0x0) {
LAB_7ffc3e918f1d:
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
      }
      if (0 < iVar4) {
        pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,0);
        if (((_DAT_7ffc3ebc95d0 == (void *)0x0) &&
            (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                      0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar7 != 0)) &&
           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0
           )) {
          _DAT_7ffc3ebc95d0 = (*(*env)->NewGlobalRef)(env,pvVar9);
        }
        pvVar9 = _DAT_7ffc3ebc95d0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
        uVar14 = uStack_68 ^ 0x7db78444a8e7cb06;
        pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
        uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
        uVar2 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3e91a1e3;
        uVar2 = uVar2 & (int)(char)arg1;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if ((-1 < (int)uVar2) && ((int)uVar2 < iVar4)) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            arg4_00 = (byte *)((ulonglong)uVar2 + (ulonglong)uRam00007ffc3ebc08f0 +
                              *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
          }
          else {
            arg4_00 = &bStack_59;
            (*(*env)->GetByteArrayRegion)(env,pvVar6,uVar2,1,arg4_00);
          }
          bStack_79 = *arg4_00;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          if (0 < iVar4) {
            pvVar5 = (*(*env)->GetObjectArrayElement)(env,pvVar5,0);
            if (((_DAT_7ffc3ebc95d8 == (void *)0x0) &&
                (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,
                                          0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                lVar7 != 0)) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc95d8 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
            pvVar6 = _DAT_7ffc3ebc95d8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
            pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
            uVar2 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
            if (pvVar5 == (void *)0x0) goto LAB_7ffc3e91a1e3;
            uVar2 = uVar2 & (int)(char)arg4;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
            }
            if ((-1 < (int)uVar2) && ((int)uVar2 < iVar4)) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                arg4 = *(byte *)((ulonglong)uVar2 + (ulonglong)uRam00007ffc3ebc08f0 +
                                *(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc));
                uVar14 = uStack_68;
              }
              else {
                (*(*env)->GetByteArrayRegion)(env,pvVar5,uVar2,1,&bStack_5a);
                uVar14 = uStack_68;
                arg4 = bStack_5a;
              }
              goto LAB_7ffc3e9192f5;
            }
          }
        }
      }
      goto LAB_7ffc3e91a1c9;
    }
LAB_7ffc3e9192f5:
    if (((_DAT_7ffc3ebc95e0 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3eba6456,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc95e0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc95e0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a52960eda3dc4c);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (((_DAT_7ffc3ebc95e8 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba6299,0x7ffc3eba606c,
                                  0x7ffc3eba72ee,0x7ffc3eba647c,0,0), lVar7 != 0)) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc95e8 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
    pvVar6 = _DAT_7ffc3ebc95e8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvStack_48 = pvVar5;
    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x6a5c);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar14 ^ 0x6912a190d7d60e0b);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,10);
    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvVar5,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    pvVar6 = (void *)FUN_7ffc3e91a880(env,pvStack_50);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
    if (pvVar5 == (void *)0x0) {
LAB_7ffc3e91a1e3:
      pJVar12 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
    }
    else {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
      }
      if (0 < iVar4) {
        (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar6);
        pvVar6 = (*(*env)->NewByteArray)(env,2);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
        if (pvVar6 == (void *)0x0) goto LAB_7ffc3e91a1e3;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        if (iVar4 < 1) goto LAB_7ffc3e91a1c9;
        bStack_69 = bStack_79;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          *(byte *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                   (ulonglong)uRam00007ffc3ebc08f0) = bStack_79;
          if (cRam00007ffc3ebc08e5 == '\x01') goto LAB_7ffc3e919662;
LAB_7ffc3e919629:
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
        }
        else {
          (*(*env)->SetByteArrayRegion)(env,pvVar6,0,1,&bStack_69);
          if (cRam00007ffc3ebc08e5 != '\x01') goto LAB_7ffc3e919629;
LAB_7ffc3e919662:
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        if (1 < iVar4) {
          bStack_6a = arg4;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)) = arg4;
            if (cRam00007ffc3ebc08e5 == '\x01') goto LAB_7ffc3e9196e6;
LAB_7ffc3e9196aa:
            iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
          }
          else {
            (*(*env)->SetByteArrayRegion)(env,pvVar6,1,1,&bStack_6a);
            if (cRam00007ffc3ebc08e5 != '\x01') goto LAB_7ffc3e9196aa;
LAB_7ffc3e9196e6:
            iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          if (1 < iVar4) {
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if ((bVar1 != 0) || (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar7 == 0))
            goto LAB_7ffc3e91a1fd;
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                              uStack_68 ^ 0x5322dcc192c1);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e91a1e3;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (2 < iVar4) {
              (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar9);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (1 < iVar4) {
                (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar5);
                lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                if (lVar8 == 0) goto LAB_7ffc3e91a1fd;
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar8,uVar3);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar5);
                  if (((_DAT_7ffc3ebc95f0 == (void *)0x0) &&
                      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                0x7ffc3eba606c,0x7ffc3ebaacd8,0x7ffc3eba645f,0,0),
                      lVar8 != 0)) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc95f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                  pvVar5 = _DAT_7ffc3ebc95f0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  pvVar9 = pvStack_48;
                  if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
                  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xf0a1b39ceba5dacf);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
                  uVar14 = uStack_68;
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uStack_68);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
                  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e91a1e3;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar5);
                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                      uVar14 ^ 0x7927fae236d);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) goto LAB_7ffc3e91a1fd;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                    }
                    if (0 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar5);
                      if (((_DAT_7ffc3ebc95f8 == (void *)0x0) &&
                          (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                    0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3eba626f,0,0
                                                   ), lVar7 != 0)) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc95f8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                      pvVar5 = _DAT_7ffc3ebc95f8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar9);
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0xf0a5c3c5a892f250);
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar14);
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar6);
                        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar10);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          return pvStack_58;
                        }
                      }
                      goto LAB_7ffc3e91a1fd;
                    }
                  }
                }
              }
            }
          }
        }
      }
LAB_7ffc3e91a1c9:
      pJVar12 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
    }
    (*pJVar12->ThrowNew)(env,pvVar5,arg2_00);
LAB_7ffc3e91a1fd:
    (*(*env)->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    if (((_DAT_7ffc3ebc9600 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3ebae424,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc9600 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc9600;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a7defe4a535dc9);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (((_DAT_7ffc3ebc9608 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadb04,0x7ffc3eba8504,0,0), lVar7 != 0)) &&
       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
      _DAT_7ffc3ebc9608 = (*(*env)->NewGlobalRef)(env,pvVar6);
    }
    pvVar6 = _DAT_7ffc3ebc9608;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,arg5);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a4219503a1bad1);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
    FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (((_DAT_7ffc3ebc9610 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadb04,0x7ffc3eba6245,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc9610 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc9610;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvStack_58);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0aa4c0ffd5a2146);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar9);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
      return pvStack_58;
    }
    return (void *)0x0;
  }
  if (((_DAT_7ffc3ebc9588 == (void *)0x0) &&
      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebae31c,0x7ffc3eba6456,0,0), lVar8 != 0)) &&
     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
    _DAT_7ffc3ebc9588 = (*(*env)->NewGlobalRef)(env,pvVar5);
  }
  pvVar5 = _DAT_7ffc3ebc9588;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xf0a52960eda3dc4c);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91a714;
    if (lVar8 != 0) {
      if (((_DAT_7ffc3ebc9590 == (void *)0x0) &&
          (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebae31c,0x7ffc3eba6482,0,0), lVar8 != 0)) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc9590 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
      pvVar5 = _DAT_7ffc3ebc9590;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xf0a166d5fa822d53);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
        lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar8 != 0) goto LAB_7ffc3e9182bc;
          goto LAB_7ffc3e918a36;
        }
      }
      goto LAB_7ffc3e91a788;
    }
LAB_7ffc3e918a36:
    if (((_DAT_7ffc3ebc9598 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadb04,0x7ffc3eba6245,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc9598 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc9598;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    pvVar6 = pvStack_58;
    if (bVar1 == 0) {
      pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,(void *)0x0);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0xf0aa4c0ffd5a2146);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar10);
      uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
        return pvVar6;
      }
    }
  }
  else {
LAB_7ffc3e91a714:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x74);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x12f), lVar8 == 0)) {
LAB_7ffc3e91a788:
      pJVar12 = *env;
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      pJVar12 = *env;
      if (bVar1 == 0) {
        (*pJVar12->Throw)(env,pvVar5);
        goto LAB_7ffc3e91a788;
      }
    }
    pvVar5 = (*pJVar12->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x74);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x12f), lVar8 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      pJVar12 = *env;
      if (bVar1 != 0) goto LAB_7ffc3e91a800;
      (*pJVar12->Throw)(env,pvVar5);
    }
  }
  pJVar12 = *env;
LAB_7ffc3e91a800:
  pvVar5 = (*pJVar12->ExceptionOccurred)(env);
  (*(*env)->ExceptionClear)(env);
  lVar7 = FUN_7ffc3eb76c30(env,0x74);
  if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x12f), lVar8 != 0)) {
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      (*(*env)->Throw)(env,pvVar5);
    }
  }
  return (void *)0x0;
}

/* JNI_dev_krypton_57_5_10 | RVA 0x14ab20 | dev/krypton/57.5(BBIJLjava/lang/Integer;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_5_10
                 (JNINativeInterface_ **env,void *receiver,byte arg0,byte arg1,int arg2,
                 longlong arg3,void *arg4)

{
  byte bVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  void *pvVar10;
  void *pvVar11;
  JNINativeInterface_ *pJVar12;
  undefined8 uVar13;
  char *pcVar14;
  byte *pbVar15;
  ulonglong uVar16;
  ulonglong uVar17;
  byte bStack_6a;
  byte bStack_69;
  byte bStack_5b;
  byte bStack_5a;
  byte bStack_59;
  uint uStack_58;
  byte bStack_53;
  byte bStack_52;
  byte bStack_51;
  void *pvStack_50;
  void *pvStack_48;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x8e);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar16 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar6 + 0x10));
  }
  else {
    uVar16 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar6);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0x5b);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xef);
  if (lVar8 == 0) {
    return (void *)0x0;
  }
  lVar7 = FUN_7ffc3e7d1a80(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x5c);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->AllocObject)(env,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
    return (void *)0x0;
  }
  lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0xf1);
  if (lVar8 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  uVar16 = uVar16 ^ arg3;
  pvStack_48 = pvVar6;
  if (lVar7 != 0) {
LAB_7ffc3e91acc3:
    if (((_DAT_7ffc3ebc9508 == (void *)0x0) &&
        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3eba6482,0,0), lVar8 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc9508 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc9508;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x132703e3d178ced5);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
      pvStack_50 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (((_DAT_7ffc3ebc9510 == (void *)0x0) &&
            (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebae31c,0x7ffc3ebae424,0,0), lVar8 != 0)) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc9510 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
        pvVar5 = _DAT_7ffc3ebc9510;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1321f93fe26df5db);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (((_DAT_7ffc3ebc9518 == (void *)0x0) &&
                (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3eba7845,0,0),
                lVar8 != 0)) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc9518 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
            pvVar6 = _DAT_7ffc3ebc9518;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1323194f336884e1);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar16);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
              pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (((_DAT_7ffc3ebc9520 == (void *)0x0) &&
                    (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebadd6b,0,0),
                    lVar8 != 0)) &&
                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar9 != (void *)0x0)) {
                  _DAT_7ffc3ebc9520 = (*(*env)->NewGlobalRef)(env,pvVar9);
                }
                pvVar9 = _DAT_7ffc3ebc9520;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvStack_50);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x13277ee2a2b1f24b);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar16);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar6);
                  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (((_DAT_7ffc3ebc9528 == (void *)0x0) &&
                        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                  0x7ffc3eba606c,0x7ffc3ebadb04,0x7ffc3ebae491,0,0),
                        lVar8 != 0)) &&
                       (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar9 != (void *)0x0)) {
                      _DAT_7ffc3ebc9528 = (*(*env)->NewGlobalRef)(env,pvVar9);
                    }
                    pvVar9 = _DAT_7ffc3ebc9528;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar10 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,arg4);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar6);
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1320f719c6aa50ad);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar16);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,4,pvVar5);
                      FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (((_DAT_7ffc3ebc9530 == (void *)0x0) &&
                            (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebae595,0
                                                      ,0), lVar8 != 0)) &&
                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                           pvVar5 != (void *)0x0)) {
                          _DAT_7ffc3ebc9530 = (*(*env)->NewGlobalRef)(env,pvVar5);
                        }
                        pvVar5 = _DAT_7ffc3ebc9530;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar6 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x132109b02da96fd6)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar16);
                          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
                          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            uStack_58 = arg2;
                            if (lVar7 != 0) {
                              if (pvVar5 != (void *)0x0) goto LAB_7ffc3e91b921;
                              goto LAB_7ffc3e91cec6;
                            }
                            bStack_6a = arg1;
                            bStack_69 = arg0;
                            if (pvVar5 != (void *)0x0) {
LAB_7ffc3e91b921:
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar4 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                              }
                              if (iVar4 < 1) goto LAB_7ffc3e91ce92;
                              pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,0);
                              if (((_DAT_7ffc3ebc9538 == (void *)0x0) &&
                                  (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                            0x7ffc3eba6299,0x7ffc3eba606c,
                                                            0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                                  lVar7 != 0)) &&
                                 (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar9 != (void *)0x0)) {
                                _DAT_7ffc3ebc9538 = (*(*env)->NewGlobalRef)(env,pvVar9);
                              }
                              pvVar9 = _DAT_7ffc3ebc9538;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                uVar17 = uVar16 ^ 0x7db7e172831d2880;
                                pvVar10 = (*(*env)->NewObjectArray)
                                                    (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                   uRam00007ffc3ebc0998,0x2f52);
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,uVar17);
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                                uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  uVar2 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
                                  if (pvVar6 != (void *)0x0) {
                                    uVar2 = uVar2 & (int)(char)arg0;
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar4 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                    }
                                    if ((-1 < (int)uVar2) && ((int)uVar2 < iVar4)) {
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        pbVar15 = (byte *)((ulonglong)uVar2 +
                                                           (ulonglong)uRam00007ffc3ebc08f0 +
                                                          *(longlong *)
                                                           ((ulonglong)pvVar6 & 0xfffffffffffffffc))
                                        ;
                                      }
                                      else {
                                        pbVar15 = &bStack_51;
                                        (*(*env)->GetByteArrayRegion)(env,pvVar6,uVar2,1,pbVar15);
                                      }
                                      bStack_69 = *pbVar15;
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar4 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                      }
                                      if (0 < iVar4) {
                                        pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar5,0);
                                        if (((_DAT_7ffc3ebc9540 == (void *)0x0) &&
                                            (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                                      0x7ffc3eba6299,0x7ffc3eba606c,
                                                                      0x7ffc3eba72ee,0x7ffc3eba647c,
                                                                      0,0), lVar7 != 0)) &&
                                           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                              uRam00007ffc3ebc0a00),
                                           pvVar9 != (void *)0x0)) {
                                          _DAT_7ffc3ebc9540 = (*(*env)->NewGlobalRef)(env,pvVar9);
                                        }
                                        pvVar9 = _DAT_7ffc3ebc9540;
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          pvVar10 = (*(*env)->NewObjectArray)
                                                              (env,2,pvRam00007ffc3ebc09e0,
                                                               (void *)0x0);
                                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                                          uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,
                                                                    pvVar10);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            uVar2 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0
                                                                    );
                                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e91cef7;
                                            uVar2 = uVar2 & (int)(char)arg1;
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar4 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar6 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                            }
                                            if ((-1 < (int)uVar2) && ((int)uVar2 < iVar4)) {
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                pbVar15 = (byte *)((ulonglong)uVar2 +
                                                                   (ulonglong)uRam00007ffc3ebc08f0 +
                                                                  *(longlong *)
                                                                   ((ulonglong)pvVar6 &
                                                                   0xfffffffffffffffc));
                                              }
                                              else {
                                                pbVar15 = &bStack_52;
                                                (*(*env)->GetByteArrayRegion)
                                                          (env,pvVar6,uVar2,1,pbVar15);
                                              }
                                              bStack_6a = *pbVar15;
                                              if (cRam00007ffc3ebc08e5 == '\0') {
                                                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                              }
                                              else {
                                                iVar4 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar5 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              if (0 < iVar4) {
                                                pvVar5 = (*(*env)->GetObjectArrayElement)
                                                                   (env,pvVar5,0);
                                                if (((_DAT_7ffc3ebc9548 == (void *)0x0) &&
                                                    (lVar7 = FUN_7ffc3eb77170(env,receiver,6,
                                                                              0x7ffc3ebb0099,
                                                                              0x7ffc3eba6299,
                                                                              0x7ffc3eba606c,
                                                                              0x7ffc3eba72ee,
                                                                              0x7ffc3eba647c,0,0),
                                                    lVar7 != 0)) &&
                                                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                                                                                                                            
                                                  uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc9548 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar6);
                                                }
                                                pvVar6 = _DAT_7ffc3ebc9548;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 == 0) {
                                                  pvVar9 = (*(*env)->NewObjectArray)
                                                                     (env,2,pvRam00007ffc3ebc09e0,
                                                                      (void *)0x0);
                                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2f52);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar9,0,pvVar10);
                                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar9,1,pvVar10);
                                                  uVar13 = FUN_7ffc3e7d1a50(env,pvVar6,
                                                                            uRam00007ffc3ebc0a40,
                                                                            pvVar9);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    uVar2 = FUN_7ffc3e7d8be0(env,uVar13,
                                                                             uRam00007ffc3ebc09d0);
                                                    if (pvVar5 == (void *)0x0)
                                                    goto LAB_7ffc3e91cef7;
                                                    uVar2 = uVar2 & arg2;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar4 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar5 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                                    }
                                                    if ((-1 < (int)uVar2) && ((int)uVar2 < iVar4)) {
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        bStack_53 = *(byte *)((ulonglong)uVar2 +
                                                                              (ulonglong)
                                                                              uRam00007ffc3ebc08f0 +
                                                                             *(longlong *)
                                                                              ((ulonglong)pvVar5 &
                                                                              0xfffffffffffffffc));
                                                      }
                                                      else {
                                                        (*(*env)->GetByteArrayRegion)
                                                                  (env,pvVar5,uVar2,1,&bStack_53);
                                                      }
                                                      uStack_58 = (uint)bStack_53;
                                                      goto LAB_7ffc3e91bed4;
                                                    }
                                                    goto LAB_7ffc3e91ce92;
                                                  }
                                                }
                                                goto LAB_7ffc3e91cf11;
                                              }
                                            }
                                            goto LAB_7ffc3e91ce92;
                                          }
                                        }
                                        goto LAB_7ffc3e91cf11;
                                      }
                                    }
                                    goto LAB_7ffc3e91ce92;
                                  }
LAB_7ffc3e91cef7:
                                  pJVar12 = *env;
                                  pcVar14 = &DAT_7ffc3eba6000;
                                  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e91cf0b:
                                  (*pJVar12->ThrowNew)(env,pvVar5,pcVar14);
                                }
                              }
LAB_7ffc3e91cf11:
                              (*(*env)->ExceptionOccurred)(env);
                              (*(*env)->ExceptionClear)(env);
                              goto LAB_7ffc3e91cf2b;
                            }
LAB_7ffc3e91bed4:
                            if (((_DAT_7ffc3ebc9550 == (void *)0x0) &&
                                (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                          0x7ffc3eba606a,0x7ffc3eba606c,
                                                          0x7ffc3ebae31c,0x7ffc3eba6456,0,0),
                                lVar7 != 0)) &&
                               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                               pvVar5 != (void *)0x0)) {
                              _DAT_7ffc3ebc9550 = (*(*env)->NewGlobalRef)(env,pvVar5);
                            }
                            pvVar5 = _DAT_7ffc3ebc9550;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar6 = (*(*env)->NewObjectArray)
                                                 (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0x13234c56c6593fca);
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
                              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar16);
                              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
                              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,
                                                                pvVar6);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                if (((_DAT_7ffc3ebc9558 == (void *)0x0) &&
                                    (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,
                                                              0x7ffc3eba6299,0x7ffc3eba606c,
                                                              0x7ffc3eba72ee,0x7ffc3eba647c,0,0),
                                    lVar7 != 0)) &&
                                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00
                                                                     ), pvVar6 != (void *)0x0)) {
                                  _DAT_7ffc3ebc9558 = (*(*env)->NewGlobalRef)(env,pvVar6);
                                }
                                pvVar6 = _DAT_7ffc3ebc9558;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar9 = (*(*env)->NewObjectArray)
                                                     (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                     uRam00007ffc3ebc0998,0x75);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     uVar16 ^ 0x743a2bb688d707a1);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
                                  uVar13 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
                                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,10);
                                    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvVar6,(void *)0x0);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      pvVar9 = (void *)FUN_7ffc3e91a880(env,pvStack_50);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        if (pvVar6 == (void *)0x0) {
LAB_7ffc3e91cec6:
                                          pJVar12 = *env;
                                          pcVar14 = &DAT_7ffc3eba6000;
                                          pvVar5 = pvRam00007ffc3ebc0a70;
                                        }
                                        else {
                                          pvStack_50 = pvVar5;
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar4 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar6 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                          }
                                          if (0 < iVar4) {
                                            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
                                            pvVar5 = (*(*env)->NewByteArray)(env,3);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) goto LAB_7ffc3e91cee0;
                                            if (pvVar5 == (void *)0x0) goto LAB_7ffc3e91cec6;
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar4 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar5 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                            }
                                            if (iVar4 < 1) goto LAB_7ffc3e91ceac;
                                            bStack_59 = bStack_69;
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              *(byte *)(*(longlong *)
                                                         ((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                                       (ulonglong)uRam00007ffc3ebc08f0) = bStack_69;
                                              if (cRam00007ffc3ebc08e5 == '\x01')
                                              goto LAB_7ffc3e91c22f;
LAB_7ffc3e91c1f6:
                                              iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                            }
                                            else {
                                              (*(*env)->SetByteArrayRegion)
                                                        (env,pvVar5,0,1,&bStack_59);
                                              if (cRam00007ffc3ebc08e5 != '\x01')
                                              goto LAB_7ffc3e91c1f6;
LAB_7ffc3e91c22f:
                                              iVar4 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar5 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            if (1 < iVar4) {
                                              bStack_5a = bStack_6a;
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
                                                         *(longlong *)
                                                          ((ulonglong)pvVar5 & 0xfffffffffffffffc))
                                                     = bStack_6a;
                                                if (cRam00007ffc3ebc08e5 == '\x01')
                                                goto LAB_7ffc3e91c2b6;
LAB_7ffc3e91c27a:
                                                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                              }
                                              else {
                                                (*(*env)->SetByteArrayRegion)
                                                          (env,pvVar5,1,1,&bStack_5a);
                                                if (cRam00007ffc3ebc08e5 != '\x01')
                                                goto LAB_7ffc3e91c27a;
LAB_7ffc3e91c2b6:
                                                iVar4 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar5 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              if (2 < iVar4) {
                                                bStack_5b = (byte)uStack_58;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
                                                           *(longlong *)
                                                            ((ulonglong)pvVar5 & 0xfffffffffffffffc)
                                                           ) = bStack_5b;
                                                  if (cRam00007ffc3ebc08e5 == '\x01')
                                                  goto LAB_7ffc3e91c33c;
LAB_7ffc3e91c300:
                                                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                                }
                                                else {
                                                  (*(*env)->SetByteArrayRegion)
                                                            (env,pvVar5,2,1,&bStack_5b);
                                                  if (cRam00007ffc3ebc08e5 != '\x01')
                                                  goto LAB_7ffc3e91c300;
LAB_7ffc3e91c33c:
                                                  iVar4 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar6 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                if (iVar4 < 2) goto LAB_7ffc3e91ce92;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar6,1,pvVar5);
                                                pvVar5 = (*(*env)->NewObjectArray)
                                                                   (env,3,pvRam00007ffc3ebc09e0,
                                                                    (void *)0x0);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if ((bVar1 == 0) &&
                                                   (lVar7 = FUN_7ffc3eb76c90(env,
                                                  uRam00007ffc3ebc0958,1), lVar7 != 0)) {
                                                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar7,uVar16 ^ 0x3614f73b7147
                                                  );
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (pvVar5 == (void *)0x0)
                                                    goto LAB_7ffc3e91cef7;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar4 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar5 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                                    }
                                                    if (2 < iVar4) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar5,2,pvVar9);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar4 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar5 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar4 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar5);
                                                      }
                                                      if (1 < iVar4) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar5,1,pvVar6);
                                                        lVar8 = FUN_7ffc3eb76c90(env,
                                                  uRam00007ffc3ebc0a10,7);
                                                  if (lVar8 != 0) {
                                                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,lVar8,uVar3);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar4 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar5 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
                                                    }
                                                    if (iVar4 < 1) goto LAB_7ffc3e91ce92;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar5,0,pvVar6);
                                                    if (((_DAT_7ffc3ebc9560 == (void *)0x0) &&
                                                        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,
                                                                                  0x7ffc3ebb0099,
                                                                                  0x7ffc3eba606a,
                                                                                  0x7ffc3eba606c,
                                                                                  0x7ffc3ebaacd8,
                                                                                  0x7ffc3eba645f,0,0
                                                                                 ), lVar8 != 0)) &&
                                                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,
                                                                                                                                                                                    
                                                  uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc9560 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar6);
                                                  }
                                                  pvVar6 = _DAT_7ffc3ebc9560;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar9 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar9,0,pvVar5);
                                                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1327d6aac05f3949);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar9,1,pvVar5);
                                                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar9,2,pvVar5);
                                                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar9);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar6 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (pvVar6 == (void *)0x0)
                                                      goto LAB_7ffc3e91cec6;
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar4 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar6 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar4 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar6);
                                                      }
                                                      if (1 < iVar4) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar6,1,pvVar5);
                                                        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar7,uVar16 ^ 0x62a45454c0eb
                                                  );
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) goto LAB_7ffc3e91cf11;
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar4 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar6 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
                                                  }
                                                  pvVar9 = pvStack_50;
                                                  if (0 < iVar4) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar6,0,pvVar5);
                                                    if (((_DAT_7ffc3ebc9568 == (void *)0x0) &&
                                                        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,
                                                                                  0x7ffc3ebb0099,
                                                                                  0x7ffc3eba606a,
                                                                                  0x7ffc3eba606c,
                                                                                  0x7ffc3ebadb04,
                                                                                  0x7ffc3eba626f,0,0
                                                                                 ), lVar7 != 0)) &&
                                                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                                                                                                                                    
                                                  uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc9568 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar5);
                                                  }
                                                  pvVar5 = _DAT_7ffc3ebc9568;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar10 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,0,pvVar9);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar10,1,pvVar6);
                                                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1323a6f3836811d6);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,2,pvVar6);
                                                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar10,3,pvVar6);
                                                  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,
                                                                   pvVar10);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    return pvStack_48;
                                                  }
                                                  }
                                                  goto LAB_7ffc3e91cee0;
                                                  }
                                                  }
                                                  goto LAB_7ffc3e91ceac;
                                                  }
                                                  }
                                                  goto LAB_7ffc3e91cee0;
                                                  }
                                                  }
                                                  }
                                                  goto LAB_7ffc3e91cf11;
                                                  }
                                                  }
LAB_7ffc3e91ce92:
                                                  pJVar12 = *env;
                                                  pcVar14 = (char *)0x7ffc3eba6019;
                                                  pvVar5 = pvRam00007ffc3ebc0a98;
                                                  goto LAB_7ffc3e91cf0b;
                                                  }
                                                }
                                                goto LAB_7ffc3e91cf11;
                                              }
                                            }
                                          }
LAB_7ffc3e91ceac:
                                          pJVar12 = *env;
                                          pcVar14 = (char *)0x7ffc3eba6019;
                                          pvVar5 = pvRam00007ffc3ebc0a98;
                                        }
                                        (*pJVar12->ThrowNew)(env,pvVar5,pcVar14);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
LAB_7ffc3e91cee0:
    (*(*env)->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
LAB_7ffc3e91cf2b:
    if (((_DAT_7ffc3ebc9570 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebae31c,0x7ffc3ebae424,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc9570 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc9570;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1321f93fe26df5db);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (((_DAT_7ffc3ebc9578 == (void *)0x0) &&
          (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebadb04,0x7ffc3eba8504,0,0), lVar7 != 0)) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc9578 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
      pvVar6 = _DAT_7ffc3ebc9578;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,arg4);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x132244a3285b5957);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
        FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (((_DAT_7ffc3ebc9580 == (void *)0x0) &&
            (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3ebadb04,0x7ffc3eba6245,0,0), lVar7 != 0)) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc9580 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
        pvVar5 = _DAT_7ffc3ebc9580;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvStack_48);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,(void *)0x0);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x132c2939d6a0c2c0);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar9);
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar9);
          uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
            return pvStack_48;
          }
          return (void *)0x0;
        }
      }
    }
    return (void *)0x0;
  }
  if (((_DAT_7ffc3ebc94f0 == (void *)0x0) &&
      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebae31c,0x7ffc3eba6456,0,0), lVar8 != 0)) &&
     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
    _DAT_7ffc3ebc94f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
  }
  pvVar5 = _DAT_7ffc3ebc94f0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x13234c56c6593fca);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
    lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e91d42b;
    if (lVar8 != 0) {
      if (((_DAT_7ffc3ebc94f8 == (void *)0x0) &&
          (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                    0x7ffc3ebae31c,0x7ffc3eba6482,0,0), lVar8 != 0)) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc94f8 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
      pvVar5 = _DAT_7ffc3ebc94f8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x132703e3d178ced5);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar9);
        lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar8 != 0) goto LAB_7ffc3e91acc3;
          goto LAB_7ffc3e91b43a;
        }
      }
      goto LAB_7ffc3e91d49f;
    }
LAB_7ffc3e91b43a:
    if (((_DAT_7ffc3ebc9500 == (void *)0x0) &&
        (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb0099,0x7ffc3eba606a,0x7ffc3eba606c,
                                  0x7ffc3ebadb04,0x7ffc3eba6245,0,0), lVar7 != 0)) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc9500 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
    pvVar5 = _DAT_7ffc3ebc9500;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    pvVar6 = pvStack_48;
    if (bVar1 == 0) {
      pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar6);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,(void *)0x0);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x132c2939d6a0c2c0);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar16);
      (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar10);
      uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
        return pvVar6;
      }
    }
  }
  else {
LAB_7ffc3e91d42b:
    pvVar5 = (*(*env)->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x74);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x12f), lVar8 == 0)) {
LAB_7ffc3e91d49f:
      pJVar12 = *env;
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      pJVar12 = *env;
      if (bVar1 == 0) {
        (*pJVar12->Throw)(env,pvVar5);
        goto LAB_7ffc3e91d49f;
      }
    }
    pvVar5 = (*pJVar12->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x74);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x12f), lVar8 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      pJVar12 = *env;
      if (bVar1 != 0) goto LAB_7ffc3e91d517;
      (*pJVar12->Throw)(env,pvVar5);
    }
  }
  pJVar12 = *env;
LAB_7ffc3e91d517:
  pvVar5 = (*pJVar12->ExceptionOccurred)(env);
  (*(*env)->ExceptionClear)(env);
  lVar7 = FUN_7ffc3eb76c30(env,0x74);
  if (lVar7 == 0) {
    return (void *)0x0;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x12f);
  if (lVar8 == 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  (*(*env)->Throw)(env,pvVar5);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_2_11 | RVA 0x14d590 | dev/krypton/57.2(Ljava/lang/Integer;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_2_11(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  void *arg1;
  void *pvVar2;
  longlong lVar3;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x5c);
  if (arg1 != (void *)0x0) {
    pvVar2 = (*(*env)->AllocObject)(env,arg1);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar2 == (void *)0x0) {
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(env,arg1,0xf1);
        if (lVar3 != 0) {
          FUN_7ffc3e7dbbc0(env,pvVar2,arg1,lVar3);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            return pvVar2;
          }
        }
      }
    }
  }
  return (void *)0x0;
}

/* JNI_dev_krypton_57_a_12 | RVA 0x14d640 | dev/krypton/57.a(Ljava/lang/Throwable;)Ljava/lang/Throwable; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_a_12(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_57_a_13 | RVA 0x14d650 | dev/krypton/57.a(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_57_a_13(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x8f);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e91eef2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x14fd, iVar6 <= (int)arg2)) {
LAB_7ffc3e91eed8:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e91ef06;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3e91edc9:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x74);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x8f);
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
      if (iVar6 <= (int)arg2) goto LAB_7ffc3e91eed8;
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
    goto LAB_7ffc3e91eef2;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e91eef2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91d812;
LAB_7ffc3e91d7d8:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91d7d8;
LAB_7ffc3e91d812:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91d89e;
LAB_7ffc3e91d861:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91d861;
LAB_7ffc3e91d89e:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91d92a;
LAB_7ffc3e91d8ed:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91d8ed;
LAB_7ffc3e91d92a:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91d9b6;
LAB_7ffc3e91d979:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91d979;
LAB_7ffc3e91d9b6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91da41;
LAB_7ffc3e91da04:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91da04;
LAB_7ffc3e91da41:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91dacc;
LAB_7ffc3e91da8f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91da8f;
LAB_7ffc3e91dacc:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91db57;
LAB_7ffc3e91db1a:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91db1a;
LAB_7ffc3e91db57:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x90);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e91eef2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3e91eed8;
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
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e91eef2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91dd67;
LAB_7ffc3e91dd2d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91dd2d;
LAB_7ffc3e91dd67:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91ddf3;
LAB_7ffc3e91ddb6:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91ddb6;
LAB_7ffc3e91ddf3:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91de7f;
LAB_7ffc3e91de42:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91de42;
LAB_7ffc3e91de7f:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91df0b;
LAB_7ffc3e91dece:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91dece;
LAB_7ffc3e91df0b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91df96;
LAB_7ffc3e91df59:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91df59;
LAB_7ffc3e91df96:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91e021;
LAB_7ffc3e91dfe4:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91dfe4;
LAB_7ffc3e91e021:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e91eed8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91e0ac;
LAB_7ffc3e91e06f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91e06f;
LAB_7ffc3e91e0ac:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e91eed8;
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
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x91);
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
LAB_7ffc3e91e791:
          pJVar16 = *env;
          goto LAB_7ffc3e91e797;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3e91e791;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e91e791;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3e91e777;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3e91ef11:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3e91e78b;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3e91e791;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e91e791;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3e91ef11;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3e91e797;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3e91e777;
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
                if (iVar6 < 3) goto LAB_7ffc3e91ef11;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x74);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0x91);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3e91e79a;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3e91e777;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3e91e682;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e91e791;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3e91ef06;
        }
LAB_7ffc3e91e682:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3e91e777:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e91e78b:
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
                  if (iVar6 < 2) goto LAB_7ffc3e91ef11;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3e91e777;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3e91ef2e;
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
                        if (iVar6 < 1) goto LAB_7ffc3e91ef11;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3e91ef2e:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e91e78b;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3e91ef11;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3e91ef2e;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3e91e777;
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
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x74);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x8f);
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
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3e91eef2;
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
                                              goto LAB_7ffc3e91edc9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e91eed8;
                                  }
                                  goto LAB_7ffc3e91eef2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e91e791;
        }
LAB_7ffc3e91e797:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3e91e79a:
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
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0099);
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
LAB_7ffc3e91eef2:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e91ef06:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_dev_krypton_57_a_14 | RVA 0x14ef80 | dev/krypton/57.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_57_a_14
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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3e91f49d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3e91f480;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3e91f4af:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e91f0c7;
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
    if (iVar3 < 2) goto LAB_7ffc3e91f480;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3e91f0c0;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3e91f4af;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x74);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x131);
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
          goto LAB_7ffc3e91f49d;
        }
      }
LAB_7ffc3e91f480:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e91f0c7;
    }
LAB_7ffc3e91f49d:
    pJVar7 = *env;
  }
LAB_7ffc3e91f0c0:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e91f0c7:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_dev_krypton_57_a_15 | RVA 0x14f4d0 | dev/krypton/57.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_a_15
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e91fd9b;
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
  if (_DAT_7ffc3ebc0bb8 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x74);
    uVar11 = FUN_7ffc3eb76c30(env,0x74);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bb8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bb8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e91fa03:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e91fa31:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e91fa03;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e91fa03;
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
                      goto LAB_7ffc3e91fa37;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e91fa31;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e91fa37:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0099);
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
LAB_7ffc3e91fd9b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_b_16 | RVA 0x14fdc0 | dev/krypton/57.b(IJ)J | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong JNI_dev_krypton_57_b_16(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  int iVar7;
  void *pvVar8;
  void *pvVar9;
  void *pvVar10;
  longlong lVar11;
  longlong lVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  void *pvVar15;
  void *pvVar16;
  void *pvVar17;
  JNINativeInterface_ *pJVar18;
  uint arg2;
  char *pcVar19;
  byte *pbVar20;
  byte abStack_60 [8];
  ulonglong uStack_58;
  uint uStack_4c;
  ulonglong uStack_48;
  
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x92);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar8,pvVar9);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9218b1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x4f38, iVar7 <= (int)arg2)) {
LAB_7ffc3e921897:
    pJVar18 = *env;
    pcVar19 = (char *)0x7ffc3eba6019;
    pvVar8 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e9218c5;
  }
  pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar9,arg2);
  if (pvVar9 != (void *)0x0) {
LAB_7ffc3e921789:
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x74);
    if (pvVar8 == (void *)0x0) {
      return 0;
    }
    pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x92);
    if (pvVar9 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar8,pvVar9);
    bVar5 = (*(*env)->ExceptionCheck)(env);
    if (bVar5 != 0) {
      return 0;
    }
    if (pvVar8 != (void *)0x0) {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
      }
      if (iVar7 <= (int)arg2) goto LAB_7ffc3e921897;
      pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
      if (pvVar8 != (void *)0x0) {
        lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,0);
        if (lVar11 == 0) {
          return 0;
        }
        lVar11 = FUN_7ffc3e7d1a20(env,pvVar8,lVar11);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) {
          return 0;
        }
        return lVar11;
      }
    }
    goto LAB_7ffc3e9218b1;
  }
  pvVar9 = (*(*env)->NewByteArray)(env,8);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9218b1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar7 < 1) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e91ff82;
LAB_7ffc3e91ff48:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91ff48;
LAB_7ffc3e91ff82:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 2) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e92000e;
LAB_7ffc3e91ffd1:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e91ffd1;
LAB_7ffc3e92000e:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 3) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e92009a;
LAB_7ffc3e92005d:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e92005d;
LAB_7ffc3e92009a:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 4) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e920126;
LAB_7ffc3e9200e9:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9200e9;
LAB_7ffc3e920126:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 5) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9201b1;
LAB_7ffc3e920174:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e920174;
LAB_7ffc3e9201b1:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 6) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e92023c;
LAB_7ffc3e9201ff:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9201ff;
LAB_7ffc3e92023c:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 7) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9202c7;
LAB_7ffc3e92028a:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e92028a;
LAB_7ffc3e9202c7:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 8) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,7,1,abStack_60);
  }
  pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x93);
  if (pvVar10 == (void *)0x0) {
    return 0;
  }
  pvVar10 = (*(*env)->GetStaticObjectField)(env,pvVar8,pvVar10);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3e9218b1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  if (iVar7 <= (int)arg2) goto LAB_7ffc3e921897;
  if (bRam00007ffc3ebc08e5 == 1) {
    pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08ec + (ulonglong)arg2 * 8 +
                      *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc));
  }
  else {
    pbVar20 = abStack_60;
    (*(*env)->GetLongArrayRegion)(env,pvVar10,arg2,1,(longlong *)pbVar20);
  }
  lVar11 = *(longlong *)pbVar20;
  pvVar10 = (*(*env)->NewByteArray)(env,8);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3e9218b1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  if (iVar7 < 1) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9204d7;
LAB_7ffc3e92049d:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,0,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e92049d;
LAB_7ffc3e9204d7:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 2) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e920563;
LAB_7ffc3e920526:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,1,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e920526;
LAB_7ffc3e920563:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 3) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9205ef;
LAB_7ffc3e9205b2:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,2,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9205b2;
LAB_7ffc3e9205ef:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 4) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e92067b;
LAB_7ffc3e92063e:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,3,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e92063e;
LAB_7ffc3e92067b:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 5) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e920706;
LAB_7ffc3e9206c9:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,4,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9206c9;
LAB_7ffc3e920706:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 6) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e920791;
LAB_7ffc3e920754:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,5,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e920754;
LAB_7ffc3e920791:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 7) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e92081c;
LAB_7ffc3e9207df:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,6,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9207df;
LAB_7ffc3e92081c:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 8) goto LAB_7ffc3e921897;
  abStack_60[0] = (byte)lVar11;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,7,1,abStack_60);
  }
  lVar11 = FUN_7ffc3eb76c30(env,0x10);
  if (lVar11 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3eb76c90(env,lVar11,0x11);
  if (lVar12 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3e7d1a80(env,lVar11,lVar12);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (lVar12 != 0) {
    lVar11 = FUN_7ffc3eb76c90(env,lVar11,0x12);
    if (lVar11 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a20(env,lVar12,lVar11);
    bVar5 = (*(*env)->ExceptionCheck)(env);
    if (bVar5 != 0) {
      return 0;
    }
    lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar11 == 0) {
      return 0;
    }
    uVar14 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,uVar13);
    bVar5 = (*(*env)->ExceptionCheck)(env);
    if (bVar5 != 0) {
      return 0;
    }
    pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0x94);
    if (pvVar15 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar8,pvVar15);
    bVar5 = (*(*env)->ExceptionCheck)(env);
    if (bVar5 != 0) {
      return 0;
    }
    if (pvVar8 != (void *)0x0) {
      lVar11 = FUN_7ffc3eb76c30(env,0x11);
      if (lVar11 == 0) {
        return 0;
      }
      lVar11 = FUN_7ffc3eb76c90(env,lVar11,0x13);
      if (lVar11 == 0) {
        return 0;
      }
      pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,lVar11,uVar14);
      bVar5 = (*(*env)->ExceptionCheck)(env);
      if (bVar5 != 0) {
        return 0;
      }
      pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x12);
      if (pvVar15 == (void *)0x0) {
        return 0;
      }
      if (pvVar8 == (void *)0x0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) {
LAB_7ffc3e920f06:
          pJVar18 = *env;
          goto LAB_7ffc3e920f0c;
        }
        uStack_58 = uVar14;
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar11 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar11 == 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar11,0x14), lVar12 == 0))
        goto LAB_7ffc3e920f06;
        pvVar15 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar12,pvVar15);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) goto LAB_7ffc3e920f06;
        if (pvVar8 == (void *)0x0) goto LAB_7ffc3e920eec;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
        }
        if (iVar7 < 1) {
LAB_7ffc3e9218d0:
          pJVar18 = *env;
          pcVar19 = (char *)0x7ffc3eba6019;
          pvVar8 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3e920f00;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar15);
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar11 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar11 == 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar11,0x15), lVar12 == 0))
        goto LAB_7ffc3e920f06;
        pvVar15 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar12,pvVar15);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) goto LAB_7ffc3e920f06;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
        }
        if (iVar7 < 2) goto LAB_7ffc3e9218d0;
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar15);
        pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar18 = *env;
        if (pvVar15 == (void *)0x0) goto LAB_7ffc3e920f0c;
        pvVar17 = (*pJVar18->AllocObject)(env,pvVar15);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 == 0) {
          pvVar16 = (*(*env)->NewByteArray)(env,8);
          bVar5 = (*(*env)->ExceptionCheck)(env);
          if (bVar5 == 0) {
            if (pvVar17 == (void *)0x0) goto LAB_7ffc3e920eec;
            lVar11 = FUN_7ffc3eb76c90(env,pvVar15,0x16);
            if (lVar11 != 0) {
              FUN_7ffc3e7dbbc0(env,pvVar17,pvVar15,lVar11,pvVar16);
              bVar5 = (*(*env)->ExceptionCheck)(env);
              if (bVar5 == 0) {
                if (bRam00007ffc3ebc08e5 == 1) {
                  iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                }
                if (iVar7 < 3) goto LAB_7ffc3e9218d0;
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar17);
                pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x74);
                if (pvVar15 != (void *)0x0) {
                  pvVar17 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x94);
                  if (pvVar17 == (void *)0x0) {
                    pvVar8 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3e920f0f;
                  }
                  pvVar15 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar17);
                  bVar5 = (*(*env)->ExceptionCheck)(env);
                  if (bVar5 == 0) {
                    if (pvVar15 == (void *)0x0) goto LAB_7ffc3e920eec;
                    lVar11 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar11 != 0) && (lVar11 = FUN_7ffc3eb76c90(env,lVar11,0x17), lVar11 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar15,lVar11,uStack_58,pvVar8);
                      bVar5 = (*(*env)->ExceptionCheck)(env);
                      if (bVar5 == 0) goto LAB_7ffc3e920df7;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e920f06;
        }
        pvVar8 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar5 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar15);
        if (bVar5 == 0) {
          pJVar18 = *env;
          pcVar19 = (char *)0x7ffc3eba6033;
          pvVar8 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3e9218c5;
        }
LAB_7ffc3e920df7:
        pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar18 = *env;
        if (pvVar15 != (void *)0x0) {
          pvVar17 = (*pJVar18->AllocObject)(env,pvVar15);
          bVar5 = (*(*env)->ExceptionCheck)(env);
          if (bVar5 == 0) {
            if (pvVar17 == (void *)0x0) {
LAB_7ffc3e920eec:
              pJVar18 = *env;
              pcVar19 = &DAT_7ffc3eba6000;
              pvVar8 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e920f00:
              (*pJVar18->ThrowNew)(env,pvVar8,pcVar19);
            }
            else {
              lVar11 = FUN_7ffc3eb76c90(env,pvVar15,0x19);
              if (lVar11 != 0) {
                FUN_7ffc3e7dbbc0(env,pvVar17,pvVar15,lVar11,pvVar9);
                bVar5 = (*(*env)->ExceptionCheck)(env);
                if (bVar5 == 0) {
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                  }
                  if (iVar7 < 2) goto LAB_7ffc3e9218d0;
                  pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar8,1);
                  pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar15 != (void *)0x0) {
                    if (pvVar9 == (void *)0x0) goto LAB_7ffc3e920eec;
                    bVar5 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar15);
                    if (bVar5 == 0) goto LAB_7ffc3e9218ed;
                    lVar11 = FUN_7ffc3eb76c90(env,pvVar15,0x1a);
                    if (lVar11 != 0) {
                      uVar13 = FUN_7ffc3e7d1a50(env,pvVar9,lVar11,pvVar17);
                      bVar5 = (*(*env)->ExceptionCheck)(env);
                      if (bVar5 == 0) {
                        if (bRam00007ffc3ebc08e5 == 1) {
                          iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                        }
                        if (iVar7 < 1) goto LAB_7ffc3e9218d0;
                        pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar8,0);
                        pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar15 != (void *)0x0) {
                          if ((pvVar9 != (void *)0x0) &&
                             (bVar5 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar15), bVar5 == 0)) {
LAB_7ffc3e9218ed:
                            pJVar18 = *env;
                            pcVar19 = (char *)0x7ffc3eba6033;
                            pvVar8 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e920f00;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                          }
                          if (iVar7 < 3) goto LAB_7ffc3e9218d0;
                          pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,2);
                          pvVar17 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar17 != (void *)0x0) {
                            if ((pvVar8 != (void *)0x0) &&
                               (bVar5 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar17), bVar5 == 0))
                            goto LAB_7ffc3e9218ed;
                            if (pvVar9 == (void *)0x0) goto LAB_7ffc3e920eec;
                            lVar11 = FUN_7ffc3eb76c90(env,pvVar15,0x1b);
                            if (lVar11 != 0) {
                              FUN_7ffc3e7e1940(env,pvVar9,lVar11,2,uVar13,pvVar8);
                              bVar5 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar5 == 0) &&
                                 (lVar11 = FUN_7ffc3eb76c90(env,pvVar15,0x1d), lVar11 != 0)) {
                                pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,lVar11,pvVar10);
                                bVar5 = (*(*env)->ExceptionCheck)(env);
                                if (bVar5 == 0) {
                                  if (pvVar8 != (void *)0x0) {
                                    if (bRam00007ffc3ebc08e5 == 1) {
                                      iVar7 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                    }
                                    if (0 < iVar7) {
                                      if (bRam00007ffc3ebc08e5 == 1) {
                                        pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                          *(longlong *)
                                                           ((ulonglong)pvVar8 & 0xfffffffffffffffc))
                                        ;
                                      }
                                      else {
                                        pbVar20 = abStack_60;
                                        (*(*env)->GetByteArrayRegion)(env,pvVar8,0,1,pbVar20);
                                      }
                                      bVar5 = *pbVar20;
                                      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                        iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                      }
                                      else {
                                        iVar7 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      if (1 < iVar7) {
                                        if (bRam00007ffc3ebc08e5 == 1) {
                                          pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                             *(longlong *)
                                                              ((ulonglong)pvVar8 &
                                                              0xfffffffffffffffc) + 1);
                                        }
                                        else {
                                          pbVar20 = abStack_60;
                                          (*(*env)->GetByteArrayRegion)(env,pvVar8,1,1,pbVar20);
                                        }
                                        bVar1 = *pbVar20;
                                        if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                          iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                        }
                                        else {
                                          iVar7 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar8 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        if (2 < iVar7) {
                                          if (bRam00007ffc3ebc08e5 == 1) {
                                            pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                               *(longlong *)
                                                                ((ulonglong)pvVar8 &
                                                                0xfffffffffffffffc) + 2);
                                          }
                                          else {
                                            pbVar20 = abStack_60;
                                            (*(*env)->GetByteArrayRegion)(env,pvVar8,2,1,pbVar20);
                                          }
                                          bVar2 = *pbVar20;
                                          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                            iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                          }
                                          else {
                                            iVar7 = *(int *)(*(longlong *)
                                                              ((ulonglong)pvVar8 &
                                                              0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          if (3 < iVar7) {
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                 *(longlong *)
                                                                  ((ulonglong)pvVar8 &
                                                                  0xfffffffffffffffc) + 3);
                                            }
                                            else {
                                              pbVar20 = abStack_60;
                                              (*(*env)->GetByteArrayRegion)(env,pvVar8,3,1,pbVar20);
                                            }
                                            bVar3 = *pbVar20;
                                            if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                              iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                            }
                                            else {
                                              iVar7 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar8 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            if (4 < iVar7) {
                                              uStack_58 = (ulonglong)bVar3;
                                              if (bRam00007ffc3ebc08e5 == 1) {
                                                pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                   *(longlong *)
                                                                    ((ulonglong)pvVar8 &
                                                                    0xfffffffffffffffc) + 4);
                                              }
                                              else {
                                                pbVar20 = abStack_60;
                                                (*(*env)->GetByteArrayRegion)
                                                          (env,pvVar8,4,1,pbVar20);
                                              }
                                              bVar3 = *pbVar20;
                                              if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                                iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                              }
                                              else {
                                                iVar7 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar8 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              if (5 < iVar7) {
                                                uStack_48 = (ulonglong)bVar2;
                                                if (bRam00007ffc3ebc08e5 == 1) {
                                                  pbVar20 = (byte *)((ulonglong)uRam00007ffc3ebc08f0
                                                                     + *(longlong *)
                                                                        ((ulonglong)pvVar8 &
                                                                        0xfffffffffffffffc) + 5);
                                                }
                                                else {
                                                  pbVar20 = abStack_60;
                                                  (*(*env)->GetByteArrayRegion)
                                                            (env,pvVar8,5,1,pbVar20);
                                                }
                                                uStack_4c = (uint)*pbVar20;
                                                if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                                  iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                }
                                                else {
                                                  iVar7 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar8 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                if (6 < iVar7) {
                                                  if (bRam00007ffc3ebc08e5 == 1) {
                                                    pbVar20 = (byte *)((ulonglong)
                                                                       uRam00007ffc3ebc08f0 +
                                                                       *(longlong *)
                                                                        ((ulonglong)pvVar8 &
                                                                        0xfffffffffffffffc) + 6);
                                                  }
                                                  else {
                                                    pbVar20 = abStack_60;
                                                    (*(*env)->GetByteArrayRegion)
                                                              (env,pvVar8,6,1,pbVar20);
                                                  }
                                                  bVar2 = *pbVar20;
                                                  if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                                    iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                  }
                                                  else {
                                                    iVar7 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar8 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  if (7 < iVar7) {
                                                    if (bRam00007ffc3ebc08e5 == 1) {
                                                      pbVar20 = (byte *)((ulonglong)
                                                                         uRam00007ffc3ebc08f0 +
                                                                         *(longlong *)
                                                                          ((ulonglong)pvVar8 &
                                                                          0xfffffffffffffffc) + 7);
                                                    }
                                                    else {
                                                      pbVar20 = abStack_60;
                                                      (*(*env)->GetByteArrayRegion)
                                                                (env,pvVar8,7,1,pbVar20);
                                                    }
                                                    bVar4 = *pbVar20;
                                                    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x74);
                                                    if (pvVar8 == (void *)0x0) {
                                                      return 0;
                                                    }
                                                    pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,
                                                                                      0x92);
                                                    if (pvVar9 == (void *)0x0) {
                                                      return 0;
                                                    }
                                                    pvVar8 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar8,pvVar9);
                                                    bVar6 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar6 != 0) {
                                                      return 0;
                                                    }
                                                    lVar11 = FUN_7ffc3eb76c90(env,
                                                  uRam00007ffc3ebc0958,1);
                                                  if (lVar11 == 0) {
                                                    return 0;
                                                  }
                                                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar11,
                                                  ((ulonglong)(uint)((int)(char)bVar3 << 0x18) |
                                                   (ulonglong)(byte)uStack_4c << 0x10 |
                                                   (ulonglong)bVar2 << 8 |
                                                  (uStack_58 & 0xff) << 0x20 |
                                                  (uStack_48 & 0xff) << 0x28 |
                                                  (ulonglong)bVar1 << 0x30 |
                                                  (ulonglong)bVar5 << 0x38) + (ulonglong)bVar4);
                                                  bVar5 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar5 != 0) {
                                                    return 0;
                                                  }
                                                  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9218b1;
                                                  if (bRam00007ffc3ebc08e5 == 1) {
                                                    iVar7 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar8 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                  }
                                                  if ((int)arg2 < iVar7) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar8,arg2,pvVar9);
                                                    goto LAB_7ffc3e921789;
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e921897;
                                  }
                                  goto LAB_7ffc3e9218b1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e920f06;
        }
LAB_7ffc3e920f0c:
        pvVar8 = (*pJVar18->ExceptionOccurred)(env);
      }
LAB_7ffc3e920f0f:
      pvVar9 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar5 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar9);
      if (bVar5 == 0) {
        return 0;
      }
      (*(*env)->ExceptionClear)(env);
      pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x16);
      if (pvVar9 == (void *)0x0) {
        return 0;
      }
      pvVar10 = (*(*env)->AllocObject)(env,pvVar9);
      bVar5 = (*(*env)->ExceptionCheck)(env);
      if (bVar5 != 0) {
        return 0;
      }
      pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0099);
      if (pvVar10 != (void *)0x0) {
        lVar11 = FUN_7ffc3eb76c90(env,pvVar9,0x18);
        if (lVar11 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(env,pvVar10,pvVar9,lVar11,pvVar15,pvVar8);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) {
          return 0;
        }
        (*(*env)->Throw)(env,pvVar10);
        return 0;
      }
    }
  }
LAB_7ffc3e9218b1:
  pJVar18 = *env;
  pcVar19 = &DAT_7ffc3eba6000;
  pvVar8 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9218c5:
  (*pJVar18->ThrowNew)(env,pvVar8,pcVar19);
  return 0;
}

/* JNI_dev_krypton_57_b_17 | RVA 0x151940 | dev/krypton/57.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong JNI_dev_krypton_57_b_17
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
  void *pvVar9;
  ulonglong uVar10;
  void *pvVar11;
  char *arg2_00;
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3e921e54;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3e921e37;
  pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar6 = *env;
  if (pvVar4 != (void *)0x0) {
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3e921e66:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e921a8a;
    }
    lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
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
    if (iVar3 < 2) goto LAB_7ffc3e921e37;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar6 = *env;
    if (pvVar4 == (void *)0x0) goto LAB_7ffc3e921a83;
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3e921e66;
    lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(env,0x74);
    if (lVar5 == 0) {
      return 0;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x132);
    if (lVar8 == 0) {
      return 0;
    }
    lVar5 = FUN_7ffc3e7deca0(env,lVar5,lVar8,uVar2,uVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6);
    if (pvVar4 == (void *)0x0) {
      return 0;
    }
    pvVar9 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
    if (lVar8 == 0) {
      return 0;
    }
    uVar10 = FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar8,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x20);
    if (lVar8 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar8,pvVar9,uVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09a0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
    if (pvVar11 == (void *)0x0) {
      return 0;
    }
    pvVar11 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    if (pvVar9 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
      }
      if (0 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar11);
        pvVar4 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar9);
        }
        if (1 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
          if (lVar8 == 0) {
            return 0;
          }
          uVar7 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar8,uVar7,uVar10 & 0xffffffff00000000,
                                   pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return 0;
          }
          if (arg1 != (void *)0x0) {
            lVar8 = FUN_7ffc3eb76c30(env,0x18);
            if (lVar8 == 0) {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c90(env,lVar8,0x22);
            if (lVar8 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(env,arg1,lVar8,uVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return 0;
            }
            return lVar5;
          }
          goto LAB_7ffc3e921e54;
        }
      }
LAB_7ffc3e921e37:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e921a8a;
    }
LAB_7ffc3e921e54:
    pJVar6 = *env;
  }
LAB_7ffc3e921a83:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e921a8a:
  (*pJVar6->ThrowNew)(env,pvVar4,arg2_00);
  return 0;
}

/* JNI_dev_krypton_57_b_18 | RVA 0x151e90 | dev/krypton/57.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_b_18
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e92275b;
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
  if (_DAT_7ffc3ebc0bc0 == (void *)0x0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09a0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvRam00007ffc3ebc0a90);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x18);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvRam00007ffc3ebc09e8);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    uVar9 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc0980,
                             pvVar5);
    uVar1 = uRam00007ffc3ebc0a88;
    uVar13 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)pvVar5 >> 0x20);
    uVar10 = FUN_7ffc3eb76c30(env,0x74);
    uVar11 = FUN_7ffc3eb76c30(env,0x74);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bc0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bc0;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e9223c3:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9223f1:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9223c3;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9223c3;
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
                      goto LAB_7ffc3e9223f7;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9223f1;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e9223f7:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0099);
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
LAB_7ffc3e92275b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_a_19 | RVA 0x152780 | dev/krypton/57.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_57_a_19(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x95);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3e9230d4:
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
LAB_7ffc3e922894:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x74);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x96);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9230d4;
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
          iVar5 = *(int *)(&UNK_7ffc3eb9987c + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e92307e;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3e923064;
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
LAB_7ffc3e922efe:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x74);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x95), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9230d4;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3e92309f;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3e922894;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3e922cad;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3e922cad:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3e923064;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3e922efe;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3e923064;
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
                    goto LAB_7ffc3e923095;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3e923064;
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
LAB_7ffc3e92307e:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3e923095;
        }
        goto LAB_7ffc3e922894;
      }
    }
LAB_7ffc3e92309f:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3e923064:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e923095:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_57_a_20 | RVA 0x153120 | dev/krypton/57.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_57_a_20(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x96);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0176);
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3e924a54:
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
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb019d);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a08,0xd);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a08,pvVar5);
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
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x95);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3e924a54;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if (2 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar7);
            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb01ae);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (3 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb01d5);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (4 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb01f1);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (5 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0213);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (6 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb022d);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (7 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb023c);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                      }
                      if (8 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
                        if (pvVar6 == (void *)0x0) {
                          return;
                        }
                        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0a10,pvVar6);
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
                          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
                          if (pvVar6 == (void *)0x0) goto LAB_7ffc3e924a54;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (9 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,9,pvVar7);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb024e);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (10 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb025f);
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
                                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0262);
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
                                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0270);
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
                                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0284);
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
                                      pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6)
                                      ;
                                      if (pvVar6 == (void *)0x0) {
                                        return;
                                      }
                                      pvVar6 = (*(*env)->GetStaticObjectField)
                                                         (env,pvRam00007ffc3ebc0958,pvVar6);
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
                                      if (0xf < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0xf,pvVar6);
                                        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) {
                                          return;
                                        }
                                        pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6786)
                                        ;
                                        if (pvVar6 == (void *)0x0) goto LAB_7ffc3e924a54;
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                        }
                                        if (0xf < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar6,0xf,pvVar7);
                                          pvVar6 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3ebb02a2);
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
                                            pvVar6 = (*(*env)->NewStringUTF)
                                                               (env,(char *)0x7ffc3ebb02b6);
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
                                              pvVar6 = (*(*env)->NewStringUTF)
                                                                 (env,(char *)0x7ffc3ebb02b9);
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
                                                pvVar6 = (void *)FUN_7ffc3eb76ce0(env,
                                                  pvRam00007ffc3ebc0960,0xc);
                                                if (pvVar6 == (void *)0x0) {
                                                  return;
                                                }
                                                pvVar6 = (*(*env)->GetStaticObjectField)
                                                                   (env,pvRam00007ffc3ebc0960,pvVar6
                                                                   );
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
                                                if (0x13 < iVar2) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0x13,pvVar6);
                                                  pvVar3 = (*(*env)->GetStaticObjectField)
                                                                     (env,pvVar3,pvVar5);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) {
                                                    return;
                                                  }
                                                  pvVar5 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3eba65aa);
                                                  if (pvVar3 == (void *)0x0) goto LAB_7ffc3e924a54;
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar3 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
                                                  }
                                                  if (0x13 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar3,0x13,pvVar5);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb02cd);
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
                                                                         (env,(char *)0x7ffc3ebb02dc
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
                                                  0x7ffc3ebb02e0);
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
                                                                       (env,(char *)0x7ffc3ebb02f4);
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
                                                                         (env,(char *)0x7ffc3ebb02f7
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
                                                  0x7ffc3ebb030b);
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
                                                                       (env,(char *)0x7ffc3ebb030f);
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
                                                                         (env,(char *)0x7ffc3ebb0323
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
                                                  0x7ffc3ebb0327);
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
                                                                       (env,(char *)0x7ffc3ebb034a);
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
                                                                         (env,(char *)0x7ffc3ebb0375
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
                                                  0x7ffc3ebb03b2);
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
                                                                       (env,(char *)0x7ffc3ebb03d5);
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
                                                                         (env,(char *)0x7ffc3ebb03ee
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
                                                  0x7ffc3ebb040a);
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
                                                                       (env,(char *)0x7ffc3ebb0422);
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
                                                                         (env,(char *)0x7ffc3ebb0446
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
                                                  0x7ffc3ebb046f);
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
                                                                       (env,(char *)0x7ffc3ebb04a3);
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
                                                                         (env,(char *)0x7ffc3ebb04bb
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
                                                  0x7ffc3ebb04df);
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
                                                                       (env,(char *)0x7ffc3ebb0509);
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
                                                                         (env,(char *)0x7ffc3ebb0522
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
                                                  0x7ffc3ebb053a);
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
                                                                       (env,(char *)0x7ffc3ebb0552);
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
                                                                         (env,(char *)0x7ffc3ebb0570
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
                                                  0x7ffc3ebb05a0);
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
                                                                       (env,(char *)0x7ffc3ebb05d1);
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
                                                                         (env,(char *)0x7ffc3ebb05f5
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
                                                  0x7ffc3ebb0620);
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
                                                                       (env,(char *)0x7ffc3ebb0638);
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e924a0f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x32,pvVar3);
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
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e924a40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_57_b_21 | RVA 0x154a70 | dev/krypton/57.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_b_21(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0x133);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x96);
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
      goto LAB_7ffc3e924f16;
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
      goto LAB_7ffc3e924f16;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x74);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3e924dda:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x95);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3e924dc0:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x96);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e924dba;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e924dc0;
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
                    goto LAB_7ffc3e924da0;
                  }
                }
              }
              goto LAB_7ffc3e924dda;
            }
LAB_7ffc3e924da0:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3e924dda;
      }
LAB_7ffc3e924dba:
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
LAB_7ffc3e924f16:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_a_22 | RVA 0x154f30 | dev/krypton/57.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_a_22
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
LAB_7ffc3e925191:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e9251ad;
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
        if (lVar6 == 0) goto LAB_7ffc3e925191;
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
LAB_7ffc3e9251ad:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_b_23 | RVA 0x1551e0 | dev/krypton/57.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_b_23
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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x74);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x134), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x74);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x135);
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

/* JNI_dev_krypton_57_c_24 | RVA 0x155410 | dev/krypton/57.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_c_24(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x133);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x96);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e926140;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3e926126;
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
    goto LAB_7ffc3e926154;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x95);
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
LAB_7ffc3e926126:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e926154;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x136);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x74);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x134);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3e926140;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3e926126;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x74);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0x135);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x96);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3e926140;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3e926126;
              pJVar14 = *env;
              goto LAB_7ffc3e925d07;
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
        if (lVar9 == 0) goto LAB_7ffc3e926140;
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
          goto LAB_7ffc3e926140;
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
          lVar8 = FUN_7ffc3eb76c30(env,0x74);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x136);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x74b630f40657,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x74);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x96);
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
LAB_7ffc3e925d07:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3e926126;
      }
    }
  }
LAB_7ffc3e926140:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e926154:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_a_25 | RVA 0x156160 | dev/krypton/57.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_a_25
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
LAB_7ffc3e92658a:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e926598;
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
        if (lVar7 == 0) goto LAB_7ffc3e92658a;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3e92658a;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3e92657c;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3e92658a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e92657c;
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
LAB_7ffc3e92657c:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e926598:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_b_26 | RVA 0x1565c0 | dev/krypton/57.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_b_26
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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x74);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x137), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x74);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x138);
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

/* JNI_dev_krypton_57_d_27 | RVA 0x156830 | dev/krypton/57.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_d_27(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x74);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x133);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x96);
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
LAB_7ffc3e927a77:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e927a8f;
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
      goto LAB_7ffc3e927a8f;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x95);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3e927a77;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x136);
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
            lVar6 = FUN_7ffc3eb76c30(env,0x74);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x136);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3e927a61;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3e927a77;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3e926ee0:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x74);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x137);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x96);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3e927461:
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
              goto LAB_7ffc3e927a77;
            }
            goto LAB_7ffc3e927a61;
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
              if (iVar4 == 0) goto code_r0x7ffc3e92701e;
              goto joined_r0x7ffc3e9270e1;
            }
          }
          goto LAB_7ffc3e927a61;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3e927a8f;
      }
    }
  }
  goto LAB_7ffc3e927a61;
code_r0x7ffc3e92701e:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3e92706c;
  goto LAB_7ffc3e926ee0;
code_r0x7ffc3e92706c:
  lVar6 = FUN_7ffc3eb76c30(env,0x74);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0x136);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x74b630f40657,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3e9270e1:
  do {
    if (lVar10 == 0) goto LAB_7ffc3e927a61;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3e927a77;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x74);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x138);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x96);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3e927461;
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
    if (lVar6 == 0) goto LAB_7ffc3e927a61;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3e927a61;
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
      if (lVar10 == 0) goto LAB_7ffc3e927a61;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e927a61;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3e927a61;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e927a61;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e927a61;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e927a61;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3e927a61;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3e9277b8;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e927a61;
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
      lVar6 = FUN_7ffc3eb76c30(env,0x74);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x136);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x74b630f40657,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3e927a61;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3e927a77;
  }
LAB_7ffc3e9277b8:
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
LAB_7ffc3e927a61:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e927a8f:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_a_28 | RVA 0x157ac0 | dev/krypton/57.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_a_28
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
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3e92884f;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (iVar2 < 0xe4) {
    if ((iVar2 != 0x41) && (iVar2 != 0x44)) goto LAB_7ffc3e927cea;
LAB_7ffc3e927b6c:
    lVar4 = FUN_7ffc3eb76c30(env,0x74);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x139), lVar5 == 0))
    goto LAB_7ffc3e928267;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e928267;
    if (lVar4 == 0) goto LAB_7ffc3e9282c6;
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar5 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x4e), lVar12 != 0)) {
      uVar6 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x34), lVar12 == 0))
      goto LAB_7ffc3e9282e0;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x36), lVar5 == 0))
      goto LAB_7ffc3e9282e0;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9282e0;
      if (iVar2 == 0xe4) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9282c6;
        uVar9 = 0x50;
      }
      else if (iVar2 == 0x44) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9282c6;
        uVar9 = 0x51;
      }
      else if (iVar2 == 0x41) {
        if (arg0 == (void *)0x0) {
LAB_7ffc3e9282c6:
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          goto LAB_7ffc3e9282e0;
        }
        uVar9 = 0x4f;
      }
      else {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9282c6;
        uVar9 = 0x52;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
      if (lVar5 == 0) goto LAB_7ffc3e9282e0;
      uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar6,uVar7,uVar8);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9282e0;
      lStack_50 = 0;
LAB_7ffc3e927fab:
      if (arg3 == (void *)0x0) {
LAB_7ffc3e9282ad:
        pJVar10 = *env;
        arg2_00 = &DAT_7ffc3eba6000;
        pvVar14 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e928395:
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
                if (pvVar14 == (void *)0x0) goto LAB_7ffc3e9282ad;
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
                      goto LAB_7ffc3e928395;
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
                    goto LAB_7ffc3e92839b;
                  }
                }
                pvVar14 = (*(*env)->ExceptionOccurred)(env);
                pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                goto joined_r0x7ffc3e928370;
              }
            }
          }
        }
      }
LAB_7ffc3e92839b:
      pvVar14 = (*(*env)->ExceptionOccurred)(env);
      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
      goto joined_r0x7ffc3e928370;
    }
LAB_7ffc3e9282e0:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
  }
  else {
    if ((iVar2 == 0xee) || (iVar2 == 0xe4)) goto LAB_7ffc3e927b6c;
LAB_7ffc3e927cea:
    lVar4 = FUN_7ffc3eb76c30(env,0x74);
    if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x13a), lVar5 != 0)) {
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
                      if (iVar2 == 0xf9) {
                        if (arg0 == (void *)0x0) goto LAB_7ffc3e9288c0;
                        uVar9 = 0x57;
LAB_7ffc3e9281f0:
                        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
joined_r0x7ffc3e928223:
                        if (lVar4 != 0) {
                          uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar6,uVar7,uVar8);
                          uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            lVar4 = 0;
                            goto LAB_7ffc3e927fab;
                          }
                        }
                      }
                      else {
                        if (iVar2 == 0x57) {
                          if (arg0 != (void *)0x0) {
                            uVar9 = 0x56;
                            goto LAB_7ffc3e9281f0;
                          }
                        }
                        else if (arg0 != (void *)0x0) {
                          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
                          goto joined_r0x7ffc3e928223;
                        }
LAB_7ffc3e9288c0:
                        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      }
                      pvVar14 = (*(*env)->ExceptionOccurred)(env);
                      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                      if (bVar1 == 0) {
                        return (void *)0x0;
                      }
                      lVar4 = 0;
                      goto LAB_7ffc3e9283cf;
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
joined_r0x7ffc3e928370:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3e9283cf;
      }
    }
LAB_7ffc3e928267:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
    lVar4 = 0;
  }
LAB_7ffc3e9283cf:
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
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e92884f;
  lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x28);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar11,pvVar15,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar14 == (void *)0x0) goto LAB_7ffc3e92884f;
  lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3e7d1a50(env,pvVar14,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e92884f;
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
  if (lVar12 == 0) goto LAB_7ffc3e92884f;
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
      goto joined_r0x7ffc3e928601;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar12 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar12 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x5a);
joined_r0x7ffc3e928601:
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
LAB_7ffc3e92884f:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_a_29 | RVA 0x158920 | dev/krypton/57.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_a_29
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3e928d66;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3e9289a1:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3e9289a1;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3e928d49:
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
LAB_7ffc3e928d78:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e928ab5;
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
      if (iVar2 < iVar3) goto LAB_7ffc3e928d49;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3e928d78;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x74);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0x13b);
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
            goto LAB_7ffc3e928aae;
          }
        }
LAB_7ffc3e928d66:
        pJVar7 = *env;
      }
    }
LAB_7ffc3e928aae:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e928ab5:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_57_c_30 | RVA 0x158da0 | dev/krypton/57.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_57_c_30
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9296de;
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
  if (_DAT_7ffc3ebc0bc8 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x74);
    uVar11 = FUN_7ffc3eb76c30(env,0x74);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bc8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bc8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e929360:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e929374:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e929360;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e929360;
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
                        goto LAB_7ffc3e92937a;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e929374;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e92937a:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0099);
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
LAB_7ffc3e9296de:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

