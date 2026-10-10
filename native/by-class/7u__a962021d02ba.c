/* Native reconstruction for dev/krypton/7u.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_7u_3_0 | RVA 0x1da9e0 | dev/krypton/7u.3([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_3_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  ulonglong uVar6;
  JNINativeInterface_ *pJVar7;
  void *pvVar8;
  ulonglong uVar9;
  longlong lVar10;
  void *pvVar11;
  void *pvVar12;
  char *arg2;
  ulonglong in_stack_ffffffffffffff80;
  
  if (arg0 == (void *)0x0) goto LAB_7ffc3e9aaeda;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) {
LAB_7ffc3e9ab12b:
    pJVar7 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar7 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3e9ab148:
        pJVar7 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e9aab1e;
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
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar3 < 2) goto LAB_7ffc3e9ab12b;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e9ab148;
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar2 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x5a);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x68);
        if (pvVar8 == (void *)0x0) {
          return (void *)0x0;
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
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x5b);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar10 = FUN_7ffc3eb76c90(env,lVar5,0xef);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar10,uVar2);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar4 != (void *)0x0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (1 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar10,
                                              uVar9 ^ uVar6 ^ 0xbe09fe872e3);
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
              if (_DAT_7ffc3ebc7bc0 == (void *)0x0) {
                in_stack_ffffffffffffff80 = 0x7ffc3eba606c;
                lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3ebae40a,0,0);
                if ((lVar10 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc7bc0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc7bc0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xcd0066bfa2b6358c);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar9 ^ uVar6);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (lVar5 == 0) {
                if (pvVar4 == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9ab128. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba64b1);
                  return pvVar4;
                }
              }
              else if (pvVar4 == (void *)0x0) goto LAB_7ffc3e9aaeda;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (0 < iVar3) {
                pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar4,0);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (1 < iVar3) {
                  pvVar11 = (*(*env)->GetObjectArrayElement)(env,pvVar4,1);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (2 < iVar3) {
                    pvVar12 = (*(*env)->GetObjectArrayElement)(env,pvVar4,2);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (4 < iVar3) {
                      pvVar4 = (*(*env)->GetObjectArrayElement)(env,pvVar4,4);
                      pvVar4 = (void *)FUN_7ffc3e9ab170(env,pvVar8,pvVar11,pvVar12,pvVar4,
                                                        in_stack_ffffffffffffff80 &
                                                        0xffffffff00000000);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      return pvVar4;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e9ab12b;
        }
LAB_7ffc3e9aaeda:
        pJVar7 = *env;
      }
    }
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e9aab1e:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_8_1 | RVA 0x1db7f0 | dev/krypton/7u.8([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_8_1(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  void *pvVar4;
  longlong lVar5;
  ulonglong uVar6;
  JNINativeInterface_ *pJVar7;
  void *pvVar8;
  ulonglong uVar9;
  longlong lVar10;
  void *pvVar11;
  void *pvVar12;
  char *arg2;
  undefined8 in_stack_ffffffffffffff80;
  undefined4 uVar13;
  
  uVar13 = (undefined4)((ulonglong)in_stack_ffffffffffffff80 >> 0x20);
  if (arg0 == (void *)0x0) goto LAB_7ffc3e9abcea;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) {
LAB_7ffc3e9abf3b:
    pJVar7 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar7 = *env;
    if (pvVar4 != (void *)0x0) {
      bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3e9abf58:
        pJVar7 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e9ab92e;
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
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar3 < 2) goto LAB_7ffc3e9abf3b;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e9abf58;
        lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        uVar2 = FUN_7ffc3e7d8be0(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x5a);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x68);
        if (pvVar8 == (void *)0x0) {
          return (void *)0x0;
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
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x5b);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar10 = FUN_7ffc3eb76c90(env,lVar5,0xef);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
        if (lVar10 == 0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar10,uVar2);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar4 != (void *)0x0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (1 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
            if (lVar10 == 0) {
              return (void *)0x0;
            }
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar10,
                                              uVar9 ^ uVar6 ^ 0x7729e86b2d2c);
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
              if (_DAT_7ffc3ebc7bc8 == (void *)0x0) {
                uVar13 = 0x7ffc;
                lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3ebae40a,0,0);
                if ((lVar10 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc7bc8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc7bc8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x92cf1a76d5356a43);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar9 ^ uVar6);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (lVar5 == 0) {
                if (pvVar4 == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9abf38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba64b1);
                  return pvVar4;
                }
              }
              else if (pvVar4 == (void *)0x0) goto LAB_7ffc3e9abcea;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (0 < iVar3) {
                pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar4,0);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (1 < iVar3) {
                  pvVar11 = (*(*env)->GetObjectArrayElement)(env,pvVar4,1);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (3 < iVar3) {
                    pvVar12 = (*(*env)->GetObjectArrayElement)(env,pvVar4,3);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (4 < iVar3) {
                      pvVar4 = (*(*env)->GetObjectArrayElement)(env,pvVar4,4);
                      pvVar4 = (void *)FUN_7ffc3e9ab170(env,pvVar8,pvVar11,pvVar12,pvVar4,
                                                        CONCAT44(uVar13,1));
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return (void *)0x0;
                      }
                      return pvVar4;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e9abf3b;
        }
LAB_7ffc3e9abcea:
        pJVar7 = *env;
      }
    }
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e9ab92e:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_3_2 | RVA 0x1dbf80 | dev/krypton/7u.3([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_7u_3_2(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar7;
  void *pvVar8;
  void *pvVar9;
  void *pvVar10;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  longlong lVar14;
  void *pvVar15;
  undefined8 uVar16;
  JNINativeInterface_ *pJVar17;
  ulonglong uVar18;
  char *pcVar19;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  void *pvStack_48;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e9adb18:
    pJVar17 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar4 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar4 < 1) goto LAB_7ffc3e9adad6;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar17 = *env;
    if (pvVar5 != (void *)0x0) {
      bVar1 = (*pJVar17->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
      if (bVar1 == 0) goto LAB_7ffc3e9adaf7;
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
        iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar4 < 2) goto LAB_7ffc3e9adad6;
      pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar17 = *env;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9ac0c8;
      bVar1 = (*pJVar17->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
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
        if (iVar4 < 3) {
LAB_7ffc3e9adad6:
          UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
          pcVar19 = (char *)0x7ffc3eba6019;
          pvVar5 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3e9ac0d3;
        }
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
        pvVar8 = (void *)FUN_7ffc3eb76c30(env,10);
        if (pvVar8 == (void *)0x0) {
          return;
        }
        if ((pvVar5 == (void *)0x0) ||
           (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8), bVar1 != 0)) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (*(*env)->GetArrayLength)(env,arg0);
          }
          if (iVar4 < 4) goto LAB_7ffc3e9adad6;
          pvVar9 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
          if ((pvVar9 == (void *)0x0) ||
             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar8), bVar1 != 0)) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,arg0);
            }
            if (iVar4 < 5) goto LAB_7ffc3e9adad6;
            pvVar10 = (*(*env)->GetObjectArrayElement)(env,arg0,4);
            if ((pvVar10 == (void *)0x0) ||
               (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar8), bVar1 != 0)) {
              pvStack_48 = pvVar10;
              pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x5a);
              if (pvVar10 == (void *)0x0) {
                return;
              }
              pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvVar10,0x68);
              if (pvVar11 == (void *)0x0) {
                return;
              }
              if (cRam00007ffc3ebc08f4 == '\x01') {
                uVar18 = *(ulonglong *)
                          (*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                          (longlong)*(int *)((longlong)pvVar11 + 0x10));
              }
              else {
                uVar18 = (*(*env)->GetStaticLongField)(env,pvVar10,pvVar11);
              }
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (((_DAT_7ffc3ebc48b8 == (void *)0x0) &&
                  (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6299,
                                            0x7ffc3eba606c,0x7ffc3ebabd8d,0x7ffc3eba647c,0,0),
                  lVar6 != 0)) &&
                 (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar10 != (void *)0x0)) {
                _DAT_7ffc3ebc48b8 = (*(*env)->NewGlobalRef)(env,pvVar10);
              }
              pvVar10 = _DAT_7ffc3ebc48b8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              uVar18 = uVar18 ^ uVar7;
              pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 0x33b2);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar18 ^ 0x3fc6970b262a6e6c);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
              uVar13 = FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              uVar3 = FUN_7ffc3e7d8be0(env,uVar13,uRam00007ffc3ebc09d0);
              lVar6 = FUN_7ffc3eb76c30(env,0x5b);
              if (lVar6 == 0) {
                return;
              }
              lVar14 = FUN_7ffc3eb76c90(env,lVar6,0xef);
              if (lVar14 == 0) {
                return;
              }
              lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar14);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (((_DAT_7ffc3ebc48c0 == (void *)0x0) &&
                  (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3ebae424,0,0),
                  lVar14 != 0)) &&
                 (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                 pvVar10 != (void *)0x0)) {
                _DAT_7ffc3ebc48c0 = (*(*env)->NewGlobalRef)(env,pvVar10);
              }
              pvVar10 = _DAT_7ffc3ebc48c0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x344b92c5e5d30210);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar18);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
              pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (((_DAT_7ffc3ebc48c8 == (void *)0x0) &&
                  (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3eba7fc3,0,0),
                  lVar14 != 0)) &&
                 (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                 pvVar11 != (void *)0x0)) {
                _DAT_7ffc3ebc48c8 = (*(*env)->NewGlobalRef)(env,pvVar11);
              }
              pvVar11 = _DAT_7ffc3ebc48c8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              uVar3 = uVar3 & uVar2;
              pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                 uVar3);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar15);
              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x3448e8e199e43c34);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar15);
              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar18);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar15);
              pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (((_DAT_7ffc3ebc48d0 == (void *)0x0) &&
                  (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3eba8504,0,0),
                  lVar14 != 0)) &&
                 (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                 pvVar12 != (void *)0x0)) {
                _DAT_7ffc3ebc48d0 = (*(*env)->NewGlobalRef)(env,pvVar12);
              }
              pvVar12 = _DAT_7ffc3ebc48d0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar15 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar10);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar11);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x34482a1fd2dde41f);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar18);
              (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar15);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (pvVar10 == (void *)0x0) {
                if (lVar6 == 0) {
                  if (((_DAT_7ffc3ebc48d8 == (void *)0x0) &&
                      (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                                0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3eba6482,0,0),
                      lVar6 != 0)) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc48d8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                  pvVar8 = _DAT_7ffc3ebc48d8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x344b0d150e429970);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar18);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                  pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar8 == (void *)0x0) {
                    pvVar10 = (*(*env)->NewByteArray)(env,0);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      pvVar5 = (*(*env)->ExceptionOccurred)(env);
                      pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x24);
                      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8);
                      if (bVar1 == 0) {
                        return;
                      }
                      (*(*env)->ExceptionClear)(env);
                      lVar6 = FUN_7ffc3eb76c30(env,0x5a);
                      if (lVar6 == 0) {
                        return;
                      }
                      lVar14 = FUN_7ffc3eb76c90(env,lVar6,0xf0);
                      if (lVar14 == 0) {
                        return;
                      }
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar14,pvVar5);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9adc38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                      (*(*env)->Throw)(env,pvVar5);
                      return;
                    }
                  }
                  else {
                    if (((_DAT_7ffc3ebc48e0 == (void *)0x0) &&
                        (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                                  0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3eba7845,0,0),
                        lVar6 != 0)) &&
                       (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                       pvVar10 != (void *)0x0)) {
                      _DAT_7ffc3ebc48e0 = (*(*env)->NewGlobalRef)(env,pvVar10);
                    }
                    pvVar10 = _DAT_7ffc3ebc48e0;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,0x3447adcf8cb4f174);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                       uRam00007ffc3ebc0918,uVar18);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                    pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar11);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (((_DAT_7ffc3ebc48e8 == (void *)0x0) &&
                        (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                                  0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3ebadd6b,0,0),
                        lVar6 != 0)) &&
                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                       pvVar11 != (void *)0x0)) {
                      _DAT_7ffc3ebc48e8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                    }
                    pvVar11 = _DAT_7ffc3ebc48e8;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,0x344abd7e5bc75dd0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                      ,uVar18);
                    (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar8);
                    pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                  }
LAB_7ffc3e9ace44:
                  pvVar8 = (*(*env)->NewByteArray)(env,1);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9adb18;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
                  }
                  if (iVar4 < 1) goto LAB_7ffc3e9adad6;
                  uStack_68 = CONCAT71(uStack_68._1_7_,(char)uVar3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    *(char *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                             (ulonglong)uRam00007ffc3ebc08f0) = (char)uVar3;
                  }
                  else {
                    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,(byte *)&uStack_68);
                  }
                }
                else {
                  pvVar10 = (void *)0x0;
                  pvVar8 = (void *)0x0;
                }
              }
              else {
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar8);
                if (bVar1 == 0) goto LAB_7ffc3e9adaf7;
                pvVar8 = pvVar10;
                if (lVar6 == 0) goto LAB_7ffc3e9ace44;
              }
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,10);
              pvVar11 = (*(*env)->NewObjectArray)(env,5,pvVar11,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (pvVar11 == (void *)0x0) {
                pJVar17 = *env;
                pcVar19 = &DAT_7ffc3eba6000;
                pvVar5 = pvRam00007ffc3ebc0a70;
              }
              else {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                }
                if (0 < iVar4) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar10);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                  }
                  if (1 < iVar4) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                    }
                    if (2 < iVar4) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar9);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                      }
                      if (3 < iVar4) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvStack_48);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar4 = (*(*env)->GetArrayLength)(env,pvVar11);
                        }
                        if (4 < iVar4) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar11,4,pvVar8);
                          if (((_DAT_7ffc3ebc48f0 == (void *)0x0) &&
                              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478
                                                        ,0x7ffc3eba606c,0x7ffc3ebabe58,
                                                        0x7ffc3ebae424,0,0), lVar6 != 0)) &&
                             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                             pvVar5 != (void *)0x0)) {
                            _DAT_7ffc3ebc48f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                          }
                          pvVar5 = _DAT_7ffc3ebc48f0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar8 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x3448a622f39a988f)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
                          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar18);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
                          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (((_DAT_7ffc3ebc48f8 == (void *)0x0) &&
                              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478
                                                        ,0x7ffc3eba606c,0x7ffc3ebae407,
                                                        0x7ffc3eba7fc3,0,0), lVar6 != 0)) &&
                             (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                             pvVar8 != (void *)0x0)) {
                            _DAT_7ffc3ebc48f8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                          }
                          pvVar8 = _DAT_7ffc3ebc48f8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar9 = (*(*env)->NewObjectArray)
                                             (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,uVar3);
                          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
                          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x3448e8e199e43c34
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
                          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar18);
                          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar10);
                          pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc4900 == (void *)0x0) {
                            uStack_68 = FUN_7ffc3eb76d30(env,0x7ffc3eba8450,receiver);
                            uVar13 = FUN_7ffc3eb76c30(env,0x5a);
                            uVar16 = FUN_7ffc3eb76c30(env,0x5a);
                            uStack_60 = FUN_7ffc3eb770c0(env,uVar13,6,uVar16,0x7ffc3ebae451,
                                                         0x7ffc3ebae453);
                            uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebae453,receiver);
                            lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                                     0x7ffc3eba75b6,0x7ffc3eba84b3,0x7ffc3eba84b9,
                                                     &uStack_68,3);
                            if ((lVar6 != 0) &&
                               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                               pvVar9 != (void *)0x0)) {
                              _DAT_7ffc3ebc4900 = (*(*env)->NewGlobalRef)(env,pvVar9);
                            }
                          }
                          pvVar9 = _DAT_7ffc3ebc4900;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar10 = (*(*env)->NewObjectArray)
                                              (env,0,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10)
                          ;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (((_DAT_7ffc3ebc4908 == (void *)0x0) &&
                              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478
                                                        ,0x7ffc3eba606c,0x7ffc3eba640e,
                                                        0x7ffc3ebae491,0,0), lVar6 != 0)) &&
                             (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                             pvVar10 != (void *)0x0)) {
                            _DAT_7ffc3ebc4908 = (*(*env)->NewGlobalRef)(env,pvVar10);
                          }
                          pvVar10 = _DAT_7ffc3ebc4908;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar12 = (*(*env)->NewObjectArray)
                                              (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar9);
                          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x34470bb4b85eaaa5)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
                          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar18);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar5);
                          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12
                                                           );
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x5c);
                          if (pvVar8 == (void *)0x0) {
                            return;
                          }
                          if ((pvVar5 == (void *)0x0) ||
                             (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar8), bVar1 != 0)) {
                            if ((_DAT_7ffc3ebc4910 == (void *)0x0) &&
                               ((lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,
                                                          0x7ffc3eba6478,0x7ffc3eba606c,
                                                          0x7ffc3eba640e,0x7ffc3eba6245,0,0),
                                lVar6 != 0 &&
                                (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                                pvVar8 != (void *)0x0)))) {
                              _DAT_7ffc3ebc4910 = (*(*env)->NewGlobalRef)(env,pvVar8);
                            }
                            pvVar8 = _DAT_7ffc3ebc4910;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar9 = (*(*env)->NewObjectArray)
                                               (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar5);
                            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
                            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x3446d23e0cae04fb);
                            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar5);
                            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar18);
                            (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar5);
                            uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
                            return;
                          }
                          pJVar17 = *env;
                          pcVar19 = (char *)0x7ffc3eba6033;
                          pvVar5 = pvRam00007ffc3ebc0a58;
                          goto LAB_7ffc3e9adb42;
                        }
                      }
                    }
                  }
                }
                pJVar17 = *env;
                pcVar19 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
              }
LAB_7ffc3e9adb42:
              (*pJVar17->ThrowNew)(env,pvVar5,pcVar19);
              return;
            }
          }
        }
      }
LAB_7ffc3e9adaf7:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar19 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e9ac0d3;
    }
  }
LAB_7ffc3e9ac0c8:
  UNRECOVERED_JUMPTABLE = pJVar17->ThrowNew;
  pcVar19 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9ac0d3:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9ac0e9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar5,pcVar19);
  return;
}

/* JNI_dev_krypton_7u_4_3 | RVA 0x1ddc40 | dev/krypton/7u.4([Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_4_3(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  void *pvVar5;
  longlong lVar6;
  ulonglong uVar7;
  JNINativeInterface_ *pJVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  void *pvVar12;
  undefined8 uVar13;
  void *pvVar14;
  ulonglong uVar15;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (arg0 == (void *)0x0) {
    pJVar8 = *env;
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
LAB_7ffc3e9ae788:
      pJVar8 = *env;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9add86;
    }
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar8 = *env;
    if (pvVar5 != (void *)0x0) {
      bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
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
          iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar2 < 2) goto LAB_7ffc3e9ae788;
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar8 = *env;
        if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9add7f;
        bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
        if (bVar1 != 0) {
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          uVar3 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x5a);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x68);
          if (pvVar9 == (void *)0x0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar15 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar9 + 0x10));
          }
          else {
            uVar15 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
          }
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (((_DAT_7ffc3ebc9430 == (void *)0x0) &&
              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6299,0x7ffc3eba606c,
                                        0x7ffc3ebabd8d,0x7ffc3eba647c,0,0), lVar6 != 0)) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc9430 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
          pvVar5 = _DAT_7ffc3ebc9430;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar15 = uVar15 ^ uVar7;
          pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x33b2);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar15 ^ 0x3fc6d06b4239f964);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          uVar4 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
          if (((_DAT_7ffc3ebc9438 == (void *)0x0) &&
              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3ebabe58,0x7ffc3ebae424,0,0), lVar6 != 0)) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc9438 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
          pvVar5 = _DAT_7ffc3ebc9438;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xa340e14297890f87);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (((_DAT_7ffc3ebc9440 == (void *)0x0) &&
              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3ebae407,0x7ffc3eba7fc3,0,0), lVar6 != 0)) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc9440 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
          pvVar9 = _DAT_7ffc3ebc9440;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                             uVar4 & uVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0xa340af81fdf7ab3c);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
          pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar12);
          pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (_DAT_7ffc3ebc9448 == (void *)0x0) {
            uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba8450,receiver);
            uVar11 = FUN_7ffc3eb76c30(env,0x5a);
            uVar13 = FUN_7ffc3eb76c30(env,0x5a);
            uStack_50 = FUN_7ffc3eb770c0(env,uVar11,6,uVar13,0x7ffc3ebaddf1,0x7ffc3ebae4de);
            uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebae453,receiver);
            lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3eba7587,0x7ffc3eba75aa,0x7ffc3eba75b6,
                                     0x7ffc3eba84b3,0x7ffc3eba8567,&uStack_58,3);
            if ((lVar6 != 0) &&
               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar10 != (void *)0x0)) {
              _DAT_7ffc3ebc9448 = (*(*env)->NewGlobalRef)(env,pvVar10);
            }
          }
          pvVar10 = _DAT_7ffc3ebc9448;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar12 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             uVar15 ^ 0x399860ba6992);
          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar14);
          pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (((_DAT_7ffc3ebc9450 == (void *)0x0) &&
              (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                        0x7ffc3eba640e,0x7ffc3ebae491,0,0), lVar6 != 0)) &&
             (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar12 != (void *)0x0)) {
            _DAT_7ffc3ebc9450 = (*(*env)->NewGlobalRef)(env,pvVar12);
          }
          pvVar12 = _DAT_7ffc3ebc9450;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar14 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar5);
          (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar9);
          (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar10);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xa34f4cd4dc4d3dad);
          (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar14,4,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar14);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x5c);
          if (pvVar9 == (void *)0x0) {
            return (void *)0x0;
          }
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar9);
          if (bVar1 != 0) {
            return pvVar5;
          }
        }
      }
      pJVar8 = *env;
      arg2 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e9add86;
    }
  }
LAB_7ffc3e9add7f:
  arg2 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9add86:
  (*pJVar8->ThrowNew)(env,pvVar5,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_9_4 | RVA 0x1de7c0 | dev/krypton/7u.9([Ljava/lang/Object;)[[B | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_9_4(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  void *pvVar5;
  longlong lVar6;
  ulonglong uVar7;
  JNINativeInterface_ *pJVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  void *pvVar12;
  void *pvVar13;
  longlong lVar14;
  ulonglong uVar15;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3e9af99b:
    pJVar8 = *env;
LAB_7ffc3e9ae8f8:
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
      pJVar8 = *env;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9ae8f8;
      bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
      if (bVar1 == 0) {
LAB_7ffc3e9af9ad:
        pJVar8 = *env;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar5 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e9ae8ff;
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
      if (1 < iVar4) {
        pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        pJVar8 = *env;
        if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9ae8f8;
        bVar1 = (*pJVar8->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
        if (bVar1 == 0) goto LAB_7ffc3e9af9ad;
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,8);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar2 = FUN_7ffc3e7d8be0(env,pvVar5,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x5a);
        if (pvVar5 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x68);
        if (pvVar9 == (void *)0x0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar15 = *(ulonglong *)
                    (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                    (longlong)*(int *)((longlong)pvVar9 + 0x10));
        }
        else {
          uVar15 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar9);
        }
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (((_DAT_7ffc3ebc77a0 == (void *)0x0) &&
            (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6299,0x7ffc3eba606c,
                                      0x7ffc3ebabd8d,0x7ffc3eba647c,0,0), lVar6 != 0)) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc77a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
        pvVar5 = _DAT_7ffc3ebc77a0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar15 = uVar15 ^ uVar7;
        pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x33b2);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           uVar15 ^ 0x3fc69dd040aa1b94);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        uVar3 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
        pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a10,7);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,lVar6,uVar2);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9af99b;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
        }
        if (1 < iVar4) {
          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
          lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
          if (lVar6 == 0) {
            return (void *)0x0;
          }
          pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar6,uVar15 ^ 0x60bf94341ca1)
          ;
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
            if (((_DAT_7ffc3ebc77a8 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3ebaacdb,0,0),
                lVar6 != 0)) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc77a8 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
            pvVar9 = _DAT_7ffc3ebc77a8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x41b2eab99daa5216);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x5a);
            if ((pvVar9 != (void *)0x0) &&
               (pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar9,0x69), pvVar10 != (void *)0x0)) {
              if (cRam00007ffc3ebc08f4 == '\x01') {
                lVar6 = *(longlong *)
                         (*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                         (longlong)*(int *)((longlong)pvVar10 + 0x10));
              }
              else {
                lVar6 = (*(*env)->GetStaticLongField)(env,pvVar9,pvVar10);
              }
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (((_DAT_7ffc3ebc77b0 == (void *)0x0) &&
                    (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                               0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3eba7750,0,0),
                    lVar14 != 0)) &&
                   (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                   pvVar9 != (void *)0x0)) {
                  _DAT_7ffc3ebc77b0 = (*(*env)->NewGlobalRef)(env,pvVar9);
                }
                pvVar9 = _DAT_7ffc3ebc77b0;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x41b162b4e43708ea);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar15);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
                  pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (((_DAT_7ffc3ebc77b8 == (void *)0x0) &&
                        (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                                   0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3ebae51d,0,0)
                        , lVar14 != 0)) &&
                       (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                       pvVar10 != (void *)0x0)) {
                      _DAT_7ffc3ebc77b8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                    }
                    pvVar10 = _DAT_7ffc3ebc77b8;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar12 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,lVar6);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar9);
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x41b184013e1f0e08);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar9);
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar15);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar9);
                      pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if ((bVar1 == 0) &&
                         (pvVar10 = (void *)FUN_7ffc3eb76c30(env,9), pvVar10 != (void *)0x0)) {
                        if (pvVar9 == (void *)0x0) {
                          return (void *)0x0;
                        }
                        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar10);
                        if (bVar1 != 0) {
                          return pvVar9;
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
            if (((_DAT_7ffc3ebc77c0 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3ebae424,0,0),
                lVar6 != 0)) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc77c0 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
            pvVar9 = _DAT_7ffc3ebc77c0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x41b0acf9951aed77);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
            pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc77c8 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3eba7fc3,0,0),
                lVar6 != 0)) &&
               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar10 != (void *)0x0)) {
              _DAT_7ffc3ebc77c8 = (*(*env)->NewGlobalRef)(env,pvVar10);
            }
            pvVar10 = _DAT_7ffc3ebc77c8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                               uVar3 & uVar2);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar13);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x41b0e23aff6449cc);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar13);
            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar13);
            pvVar10 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc77d0 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3ebae559,0,0),
                lVar6 != 0)) &&
               (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar12 != (void *)0x0)) {
              _DAT_7ffc3ebc77d0 = (*(*env)->NewGlobalRef)(env,pvVar12);
            }
            pvVar12 = _DAT_7ffc3ebc77d0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar13 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar10);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x41b074de73f6078a);
            (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar13,4,pvVar5);
            uVar11 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar13);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
            if (((_DAT_7ffc3ebc77d8 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3ebae424,0,0),
                lVar6 != 0)) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc77d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
            pvVar5 = _DAT_7ffc3ebc77d8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x41b3981e835377e8);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc77e0 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3ebae407,0x7ffc3eba7fc3,0,0),
                lVar6 != 0)) &&
               (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar9 != (void *)0x0)) {
              _DAT_7ffc3ebc77e0 = (*(*env)->NewGlobalRef)(env,pvVar9);
            }
            pvVar9 = _DAT_7ffc3ebc77e0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                               uVar3 & uVar2);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x41b0e23aff6449cc);
            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15
                                              );
            (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar12);
            pvVar9 = (void *)FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar10);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            if (((_DAT_7ffc3ebc77e8 == (void *)0x0) &&
                (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                          0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3eba8504,0,0),
                lVar6 != 0)) &&
               (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar10 != (void *)0x0)) {
              _DAT_7ffc3ebc77e8 = (*(*env)->NewGlobalRef)(env,pvVar10);
            }
            pvVar10 = _DAT_7ffc3ebc77e8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar9);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x41b020c4b45d91e7);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
            FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
            (*(*env)->ExceptionCheck)(env);
            return (void *)0x0;
          }
        }
      }
    }
    pJVar8 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar5 = pvRam00007ffc3ebc0a98;
  }
LAB_7ffc3e9ae8ff:
  (*pJVar8->ThrowNew)(env,pvVar5,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_6_5 | RVA 0x1dfda0 | dev/krypton/7u.6(JLjava/lang/Integer;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_6_5(JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  int iVar6;
  void *pvVar7;
  void *pvVar8;
  longlong lVar9;
  longlong lVar10;
  void *pvVar11;
  void *pvVar12;
  JNINativeInterface_ *pJVar13;
  undefined8 uVar14;
  char *arg2;
  ulonglong uVar15;
  byte bStack_69;
  ulonglong uStack_68;
  byte bStack_59;
  void *pvStack_58;
  void *pvStack_50;
  void *pvStack_48;
  
  pvStack_48 = arg1;
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar7 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x68);
  if (pvVar8 == (void *)0x0) {
    return (void *)0x0;
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
    return (void *)0x0;
  }
  lVar9 = FUN_7ffc3eb76c30(env,0x5b);
  if (lVar9 == 0) {
    return (void *)0x0;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xef);
  if (lVar10 == 0) {
    return (void *)0x0;
  }
  lVar9 = FUN_7ffc3e7d1a80(env,lVar9,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5c);
  if (pvVar7 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar8 = (*(*env)->AllocObject)(env,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar8 == (void *)0x0) {
    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
    return (void *)0x0;
  }
  lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0xf1);
  if (lVar10 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar8,pvVar7,lVar10);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  uStack_68 = uVar15 ^ arg0;
  pvStack_58 = pvVar8;
  if (lVar9 != 0) {
LAB_7ffc3e9aff3c:
    if (((_DAT_7ffc3ebc9470 == (void *)0x0) &&
        (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3ebabe58,0x7ffc3eba6482,0,0), lVar10 != 0)) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0))
    {
      _DAT_7ffc3ebc9470 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
    pvVar7 = _DAT_7ffc3ebc9470;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    uVar15 = uStack_68;
    if (bVar1 == 0) {
      pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x34805ee99c4c99bb);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
      pvStack_50 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (((_DAT_7ffc3ebc9478 == (void *)0x0) &&
            (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3ebabe58,0x7ffc3ebae424,0,0), lVar10 != 0)) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
           pvVar7 != (void *)0x0)) {
          _DAT_7ffc3ebc9478 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
        pvVar7 = _DAT_7ffc3ebc9478;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x3480c13977dd02db);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (((_DAT_7ffc3ebc9480 == (void *)0x0) &&
                (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                           0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3eba7845,0,0),
                lVar10 != 0)) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc9480 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
            pvVar8 = _DAT_7ffc3ebc9480;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x348cfe331ebaf1bf);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
              pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar15);
              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
              pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (((_DAT_7ffc3ebc9488 == (void *)0x0) &&
                    (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                               0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3ebadd6b,0,0),
                    lVar10 != 0)) &&
                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                   pvVar11 != (void *)0x0)) {
                  _DAT_7ffc3ebc9488 = (*(*env)->NewGlobalRef)(env,pvVar11);
                }
                pvVar11 = _DAT_7ffc3ebc9488;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvStack_50);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x3481ee82c9c95d1b);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar15);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (((_DAT_7ffc3ebc9490 == (void *)0x0) &&
                        (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                                   0x7ffc3eba606c,0x7ffc3eba640e,0x7ffc3ebae491,0,0)
                        , lVar10 != 0)) &&
                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                       pvVar11 != (void *)0x0)) {
                      _DAT_7ffc3ebc9490 = (*(*env)->NewGlobalRef)(env,pvVar11);
                    }
                    pvVar11 = _DAT_7ffc3ebc9490;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar12 = (*(*env)->NewObjectArray)(env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvStack_48);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x3482aedde448ec45);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar15);
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,4,pvVar7);
                      FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (((_DAT_7ffc3ebc9498 == (void *)0x0) &&
                            (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,
                                                       0x7ffc3eba606c,0x7ffc3ebabe58,0x7ffc3ebae595,
                                                       0,0), lVar10 != 0)) &&
                           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00),
                           pvVar7 != (void *)0x0)) {
                          _DAT_7ffc3ebc9498 = (*(*env)->NewGlobalRef)(env,pvVar7);
                        }
                        pvVar7 = _DAT_7ffc3ebc9498;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar8 = (*(*env)->NewObjectArray)
                                             (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x3482756d4e99a359
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar15);
                          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (lVar9 != 0) {
                              if (pvVar7 != (void *)0x0) goto LAB_7ffc3e9b0caf;
                              goto LAB_7ffc3e9b1ec4;
                            }
                            if (pvVar7 == (void *)0x0) {
                              if (((_DAT_7ffc3ebc94a0 == (void *)0x0) &&
                                  (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,
                                                            0x7ffc3eba6478,0x7ffc3eba606c,
                                                            0x7ffc3eba640e,0x7ffc3ebab66a,0,0),
                                  lVar9 != 0)) &&
                                 (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                                 pvVar7 != (void *)0x0)) {
                                _DAT_7ffc3ebc94a0 = (*(*env)->NewGlobalRef)(env,pvVar7);
                              }
                              pvVar7 = _DAT_7ffc3ebc94a0;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar8 = (*(*env)->NewObjectArray)
                                                   (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvStack_48);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,
                                                                   0x348150811981bc56);
                                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,uVar15);
                                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
                                uVar14 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  bVar1 = FUN_7ffc3e998860(env,uVar14,uRam00007ffc3ebc0938);
joined_r0x7ffc3e9b0f83:
                                  if (((_DAT_7ffc3ebc94b8 == (void *)0x0) &&
                                      (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,
                                                                0x7ffc3eba6478,0x7ffc3eba606c,
                                                                0x7ffc3ebabe58,0x7ffc3eba6456,0,0),
                                      lVar9 != 0)) &&
                                     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                        uRam00007ffc3ebc0a00),
                                     pvVar7 != (void *)0x0)) {
                                    _DAT_7ffc3ebc94b8 = (*(*env)->NewGlobalRef)(env,pvVar7);
                                  }
                                  pvVar7 = _DAT_7ffc3ebc94b8;
                                  bVar2 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar2 == 0) {
                                    pvVar8 = (*(*env)->NewObjectArray)
                                                       (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                       uRam00007ffc3ebc0918,
                                                                       0x348c297c0782ca13);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                       uRam00007ffc3ebc0918,uVar15);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
                                    pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,
                                                                      uRam00007ffc3ebc0a40,pvVar8);
                                    bVar2 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar2 == 0) {
                                      if (((_DAT_7ffc3ebc94c0 == (void *)0x0) &&
                                          (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,
                                                                    0x7ffc3eba6299,0x7ffc3eba606c,
                                                                    0x7ffc3ebabd8d,0x7ffc3eba647c,0,
                                                                    0), lVar9 != 0)) &&
                                         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                            uRam00007ffc3ebc0a00),
                                         pvVar8 != (void *)0x0)) {
                                        _DAT_7ffc3ebc94c0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                      }
                                      pvVar8 = _DAT_7ffc3ebc94c0;
                                      bVar2 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar2 == 0) {
                                        pvVar11 = (*(*env)->NewObjectArray)
                                                            (env,2,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                           uRam00007ffc3ebc0998,
                                                                           0x7716);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                                        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                           uRam00007ffc3ebc0918,
                                                                           uVar15 ^ 
                                                  0x21140d5ee392aa02);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                                        uVar14 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                                  pvVar11);
                                        bVar2 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar2 == 0) {
                                          uVar5 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                                          pvVar8 = (void *)FUN_7ffc3eb76c30(env,10);
                                          pvVar8 = (*(*env)->NewObjectArray)
                                                             (env,2,pvVar8,(void *)0x0);
                                          bVar2 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar2 == 0) {
                                            pvVar11 = (void *)FUN_7ffc3e9b25f0(env,pvStack_50);
                                            bVar2 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar2 == 0) {
                                              if (pvVar8 == (void *)0x0) {
LAB_7ffc3e9b1ec4:
                                                pJVar13 = *env;
                                                arg2 = &DAT_7ffc3eba6000;
                                                pvVar7 = pvRam00007ffc3ebc0a70;
                                              }
                                              else {
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar6 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar8 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                }
                                                if (iVar6 < 1) goto LAB_7ffc3e9b1eaa;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar8,0,pvVar11);
                                                pvVar11 = (*(*env)->NewByteArray)(env,1);
                                                bVar2 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar2 != 0) goto LAB_7ffc3e9b1ede;
                                                if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9b1ec4;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar6 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar11 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar6 = (*(*env)->GetArrayLength)(env,pvVar11);
                                                }
                                                if (0 < iVar6) {
                                                  bStack_69 = bVar1;
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    *(byte *)(*(longlong *)
                                                               ((ulonglong)pvVar11 &
                                                               0xfffffffffffffffc) +
                                                             (ulonglong)uRam00007ffc3ebc08f0) =
                                                         bVar1;
                                                  }
                                                  else {
                                                    (*(*env)->SetByteArrayRegion)
                                                              (env,pvVar11,0,1,&bStack_69);
                                                  }
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar6 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar8 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                  }
                                                  if (1 < iVar6) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar8,1,pvVar11);
                                                    pvVar11 = (*(*env)->NewObjectArray)
                                                                        (env,3,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if ((bVar1 == 0) &&
                                                       (lVar9 = FUN_7ffc3eb76c90(env,
                                                  uRam00007ffc3ebc0958,1), lVar9 != 0)) {
                                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar9,
                                                  uStack_68 ^ 0x1e3427ef56e7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (pvVar11 == (void *)0x0)
                                                    goto LAB_7ffc3e9b1ec4;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar6 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar11 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar6 = (*(*env)->GetArrayLength)(env,pvVar11)
                                                      ;
                                                    }
                                                    if (2 < iVar6) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar11,2,pvVar12);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar6 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar11 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar6 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar11);
                                                      }
                                                      if (1 < iVar6) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar11,1,pvVar8);
                                                        lVar10 = FUN_7ffc3eb76c90(env,
                                                  uRam00007ffc3ebc0a10,7);
                                                  if (lVar10 != 0) {
                                                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,lVar10,uVar5);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar6 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar11 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar6 = (*(*env)->GetArrayLength)(env,pvVar11)
                                                      ;
                                                    }
                                                    if (iVar6 < 1) goto LAB_7ffc3e9b1eaa;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar11,0,pvVar8);
                                                    if (((_DAT_7ffc3ebc94c8 == (void *)0x0) &&
                                                        (lVar10 = FUN_7ffc3eb77170(env,receiver,6,
                                                                                   0x7ffc3ebae3f8,
                                                                                   0x7ffc3eba6478,
                                                                                   0x7ffc3eba606c,
                                                                                   0x7ffc3ebae407,
                                                                                   0x7ffc3eba645f,0,
                                                                                   0), lVar10 != 0))
                                                       && (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar10,uRam00007ffc3ebc0a00),
                                                  pvVar8 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc94c8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar8);
                                                  }
                                                  pvVar8 = _DAT_7ffc3ebc94c8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvStack_50 = pvVar7;
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar11);
                                                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x348004992ae68404);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar11);
                                                  uVar15 = uStack_68;
                                                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uStack_68);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar11);
                                                  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar8 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (pvVar8 == (void *)0x0)
                                                      goto LAB_7ffc3e9b1ec4;
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar6 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar8 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar6 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar8);
                                                      }
                                                      if (iVar6 < 2) goto LAB_7ffc3e9b1eaa;
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar8,1,pvVar7);
                                                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar9,uVar15 ^ 0x4a848480e74b
                                                  );
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar6 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar8 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
                                                    }
                                                    if (iVar6 < 1) goto LAB_7ffc3e9b1eaa;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar8,0,pvVar7);
                                                    if (((_DAT_7ffc3ebc94d0 == (void *)0x0) &&
                                                        (lVar9 = FUN_7ffc3eb77170(env,receiver,6,
                                                                                  0x7ffc3ebae3f8,
                                                                                  0x7ffc3eba6478,
                                                                                  0x7ffc3eba606c,
                                                                                  0x7ffc3eba640e,
                                                                                  0x7ffc3eba626f,0,0
                                                                                 ), lVar9 != 0)) &&
                                                       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                    
                                                  uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc94d0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar7);
                                                  }
                                                  pvVar7 = _DAT_7ffc3ebc94d0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar11 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar11,0,pvStack_50);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar11,1,pvVar8);
                                                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x348cb708ce5f8f94);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar11,2,pvVar8);
                                                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar15);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar11,3,pvVar8);
                                                  FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,
                                                                   pvVar11);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    return pvStack_58;
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  goto LAB_7ffc3e9b1ede;
                                                  }
                                                  }
                                                  goto LAB_7ffc3e9b1eaa;
                                                  }
                                                  }
                                                  goto LAB_7ffc3e9b1ede;
                                                  }
                                                }
LAB_7ffc3e9b1eaa:
                                                pJVar13 = *env;
                                                arg2 = (char *)0x7ffc3eba6019;
                                                pvVar7 = pvRam00007ffc3ebc0a98;
                                              }
                                              (*pJVar13->ThrowNew)(env,pvVar7,arg2);
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  goto LAB_7ffc3e9b1ede;
                                }
                              }
                              pvVar7 = (*(*env)->ExceptionOccurred)(env);
                              (*(*env)->ExceptionClear)(env);
                              lVar9 = FUN_7ffc3eb76c30(env,0x5a);
                              if ((lVar9 != 0) &&
                                 (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xf0), lVar10 != 0)) {
                                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar7);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  (*(*env)->ExceptionOccurred)(env);
                                  goto LAB_7ffc3e9b1ee7;
                                }
                                (*(*env)->Throw)(env,pvVar7);
                              }
                            }
                            else {
LAB_7ffc3e9b0caf:
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar6 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                              }
                              if (iVar6 < 1) goto LAB_7ffc3e9b1eaa;
                              pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                              if (((_DAT_7ffc3ebc94a8 == (void *)0x0) &&
                                  (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,
                                                            0x7ffc3eba6478,0x7ffc3eba606c,
                                                            0x7ffc3eba640e,0x7ffc3eba64b4,0,0),
                                  lVar9 != 0)) &&
                                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                                 pvVar8 != (void *)0x0)) {
                                _DAT_7ffc3ebc94a8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                              }
                              pvVar8 = _DAT_7ffc3ebc94a8;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar11 = (*(*env)->NewObjectArray)
                                                    (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvStack_48);
                                pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,
                                                                   0x348dc32a4fb769e4);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                                pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,uVar15);
                                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                                uVar14 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  uVar3 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                                  if (((_DAT_7ffc3ebc94b0 == (void *)0x0) &&
                                      (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,
                                                                0x7ffc3eba6299,0x7ffc3eba606c,
                                                                0x7ffc3ebabd8d,0x7ffc3eba647c,0,0),
                                      lVar9 != 0)) &&
                                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                        uRam00007ffc3ebc0a00),
                                     pvVar8 != (void *)0x0)) {
                                    _DAT_7ffc3ebc94b0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                  }
                                  pvVar8 = _DAT_7ffc3ebc94b0;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    uVar15 = uStack_68 ^ 0x33a30993a237068c;
                                    pvVar11 = (*(*env)->NewObjectArray)
                                                        (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                       uRam00007ffc3ebc0998,0x5b9b);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                       uRam00007ffc3ebc0918,uVar15);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                                    uVar14 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                              pvVar11);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      uVar4 = FUN_7ffc3e7d8be0(env,uVar14,uRam00007ffc3ebc09d0);
                                      uVar15 = uStack_68;
                                      if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9b1ec4;
                                      uVar4 = uVar4 & uVar3;
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar6 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                                      }
                                      if ((-1 < (int)uVar4) && ((int)uVar4 < iVar6)) {
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          bVar1 = *(byte *)((ulonglong)uVar4 +
                                                            (ulonglong)uRam00007ffc3ebc08f0 +
                                                           *(longlong *)
                                                            ((ulonglong)pvVar7 & 0xfffffffffffffffc)
                                                           );
                                        }
                                        else {
                                          (*(*env)->GetByteArrayRegion)
                                                    (env,pvVar7,uVar4,1,&bStack_59);
                                          bVar1 = bStack_59;
                                        }
                                        goto joined_r0x7ffc3e9b0f83;
                                      }
                                      goto LAB_7ffc3e9b1eaa;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
LAB_7ffc3e9b1ede:
    (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e9b1ee7:
    (*(*env)->ExceptionClear)(env);
    if (((_DAT_7ffc3ebc94d8 == (void *)0x0) &&
        (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                  0x7ffc3ebabe58,0x7ffc3ebae424,0,0), lVar9 != 0)) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
      _DAT_7ffc3ebc94d8 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
    pvVar7 = _DAT_7ffc3ebc94d8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x3480c13977dd02db);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
      pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (((_DAT_7ffc3ebc94e0 == (void *)0x0) &&
          (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                    0x7ffc3eba640e,0x7ffc3eba8504,0,0), lVar9 != 0)) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
      {
        _DAT_7ffc3ebc94e0 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
      pvVar8 = _DAT_7ffc3ebc94e0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvStack_48);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x348379e340d3e4d4);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
        FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (((_DAT_7ffc3ebc94e8 == (void *)0x0) &&
            (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                      0x7ffc3eba640e,0x7ffc3eba6245,0,0), lVar9 != 0)) &&
           (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0
           )) {
          _DAT_7ffc3ebc94e8 = (*(*env)->NewGlobalRef)(env,pvVar7);
        }
        pvVar7 = _DAT_7ffc3ebc94e8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvStack_58);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x348d81c29ea00430);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68
                                            );
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar11);
          uVar14 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            FUN_7ffc3e7d53d0(env,uVar14,uRam00007ffc3ebc0a38);
            return pvStack_58;
          }
          return (void *)0x0;
        }
      }
    }
    return (void *)0x0;
  }
  if (((_DAT_7ffc3ebc9458 == (void *)0x0) &&
      (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3ebabe58,0x7ffc3eba6456,0,0), lVar10 != 0)) &&
     (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
    _DAT_7ffc3ebc9458 = (*(*env)->NewGlobalRef)(env,pvVar7);
  }
  pvVar7 = _DAT_7ffc3ebc9458;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x348c297c0782ca13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
    lVar10 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9b23fb;
    if (lVar10 != 0) {
      if (((_DAT_7ffc3ebc9460 == (void *)0x0) &&
          (lVar10 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebabe58,0x7ffc3eba6482,0,0), lVar10 != 0)) &&
         (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc9460 = (*(*env)->NewGlobalRef)(env,pvVar7);
      }
      pvVar7 = _DAT_7ffc3ebc9460;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x34805ee99c4c99bb);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
        pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
        lVar10 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar10 != 0) goto LAB_7ffc3e9aff3c;
          goto LAB_7ffc3e9b06a1;
        }
      }
      goto LAB_7ffc3e9b246f;
    }
LAB_7ffc3e9b06a1:
    if (((_DAT_7ffc3ebc9468 == (void *)0x0) &&
        (lVar9 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebae3f8,0x7ffc3eba6478,0x7ffc3eba606c,
                                  0x7ffc3eba640e,0x7ffc3eba6245,0,0), lVar9 != 0)) &&
       (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
      _DAT_7ffc3ebc9468 = (*(*env)->NewGlobalRef)(env,pvVar7);
    }
    pvVar7 = _DAT_7ffc3ebc9468;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    pvVar8 = pvStack_58;
    if (bVar1 == 0) {
      pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar8);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,1,(void *)0x0);
      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x348d81c29ea00430);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uStack_68);
      (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar12);
      uVar14 = FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        FUN_7ffc3e7d53d0(env,uVar14,uRam00007ffc3ebc0a38);
        return pvVar8;
      }
    }
  }
  else {
LAB_7ffc3e9b23fb:
    pvVar7 = (*(*env)->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x5a);
    if ((lVar9 == 0) || (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xf0), lVar10 == 0)) {
LAB_7ffc3e9b246f:
      pJVar13 = *env;
    }
    else {
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      pJVar13 = *env;
      if (bVar1 == 0) {
        (*pJVar13->Throw)(env,pvVar7);
        goto LAB_7ffc3e9b246f;
      }
    }
    pvVar7 = (*pJVar13->ExceptionOccurred)(env);
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0x5a);
    if ((lVar9 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xf0), lVar10 != 0)) {
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      pJVar13 = *env;
      if (bVar1 != 0) goto LAB_7ffc3e9b24e7;
      (*pJVar13->Throw)(env,pvVar7);
    }
  }
  pJVar13 = *env;
LAB_7ffc3e9b24e7:
  pvVar7 = (*pJVar13->ExceptionOccurred)(env);
  (*(*env)->ExceptionClear)(env);
  lVar9 = FUN_7ffc3eb76c30(env,0x5a);
  if (lVar9 == 0) {
    return (void *)0x0;
  }
  lVar10 = FUN_7ffc3eb76c90(env,lVar9,0xf0);
  if (lVar10 == 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar10,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  (*(*env)->Throw)(env,pvVar7);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_5_6 | RVA 0x1e2890 | dev/krypton/7u.5(Ljava/lang/Integer;)Ljava/util/concurrent/CompletableFuture; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_5_6(JNINativeInterface_ **env,void *receiver,void *arg0)

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

/* JNI_dev_krypton_7u_a_7 | RVA 0x1e2940 | dev/krypton/7u.a(Ljava/lang/Throwable;)Ljava/lang/Throwable; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_a_7(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_7u_a_8 | RVA 0x1e2950 | dev/krypton/7u.a(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_7u_a_8(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6a);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9b41f2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x699e, iVar6 <= (int)arg2)) {
LAB_7ffc3e9b41d8:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3e9b4206;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3e9b40c9:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5a);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6a);
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
      if (iVar6 <= (int)arg2) goto LAB_7ffc3e9b41d8;
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
    goto LAB_7ffc3e9b41f2;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9b41f2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2b12;
LAB_7ffc3e9b2ad8:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2ad8;
LAB_7ffc3e9b2b12:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2b9e;
LAB_7ffc3e9b2b61:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2b61;
LAB_7ffc3e9b2b9e:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2c2a;
LAB_7ffc3e9b2bed:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2bed;
LAB_7ffc3e9b2c2a:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2cb6;
LAB_7ffc3e9b2c79:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2c79;
LAB_7ffc3e9b2cb6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2d41;
LAB_7ffc3e9b2d04:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2d04;
LAB_7ffc3e9b2d41:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2dcc;
LAB_7ffc3e9b2d8f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2d8f;
LAB_7ffc3e9b2dcc:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b2e57;
LAB_7ffc3e9b2e1a:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b2e1a;
LAB_7ffc3e9b2e57:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6b);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9b41f2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3e9b41d8;
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
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9b41f2;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b3067;
LAB_7ffc3e9b302d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b302d;
LAB_7ffc3e9b3067:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b30f3;
LAB_7ffc3e9b30b6:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b30b6;
LAB_7ffc3e9b30f3:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b317f;
LAB_7ffc3e9b3142:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b3142;
LAB_7ffc3e9b317f:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b320b;
LAB_7ffc3e9b31ce:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b31ce;
LAB_7ffc3e9b320b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b3296;
LAB_7ffc3e9b3259:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b3259;
LAB_7ffc3e9b3296:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b3321;
LAB_7ffc3e9b32e4:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b32e4;
LAB_7ffc3e9b3321:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3e9b41d8;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3e9b33ac;
LAB_7ffc3e9b336f:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3e9b336f;
LAB_7ffc3e9b33ac:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3e9b41d8;
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
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6c);
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
LAB_7ffc3e9b3a91:
          pJVar16 = *env;
          goto LAB_7ffc3e9b3a97;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3e9b3a91;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e9b3a91;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9b3a77;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3e9b4211:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3e9b3a8b;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3e9b3a91;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3e9b3a91;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3e9b4211;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3e9b3a97;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3e9b3a77;
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
                if (iVar6 < 3) goto LAB_7ffc3e9b4211;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x5a);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0x6c);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3e9b3a9a;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3e9b3a77;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3e9b3982;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e9b3a91;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3e9b4206;
        }
LAB_7ffc3e9b3982:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3e9b3a77:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9b3a8b:
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
                  if (iVar6 < 2) goto LAB_7ffc3e9b4211;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9b3a77;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3e9b422e;
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
                        if (iVar6 < 1) goto LAB_7ffc3e9b4211;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3e9b422e:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3e9b3a8b;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3e9b4211;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3e9b422e;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3e9b3a77;
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
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5a);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6a);
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
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9b41f2;
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
                                              goto LAB_7ffc3e9b40c9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3e9b41d8;
                                  }
                                  goto LAB_7ffc3e9b41f2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3e9b3a91;
        }
LAB_7ffc3e9b3a97:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3e9b3a9a:
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
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae3f8);
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
LAB_7ffc3e9b41f2:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9b4206:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_dev_krypton_7u_a_9 | RVA 0x1e4280 | dev/krypton/7u.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_7u_a_9
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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3e9b479d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3e9b4780;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3e9b47af:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3e9b43c7;
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
    if (iVar3 < 2) goto LAB_7ffc3e9b4780;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9b43c0;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3e9b47af;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x5a);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0xf2);
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
          goto LAB_7ffc3e9b479d;
        }
      }
LAB_7ffc3e9b4780:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9b43c7;
    }
LAB_7ffc3e9b479d:
    pJVar7 = *env;
  }
LAB_7ffc3e9b43c0:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9b43c7:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_dev_krypton_7u_a_10 | RVA 0x1e47d0 | dev/krypton/7u.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_a_10
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b509b;
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
  if (_DAT_7ffc3ebc0bf0 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x5a);
    uVar11 = FUN_7ffc3eb76c30(env,0x5a);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bf0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bf0;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e9b4d03:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9b4d31:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9b4d03;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9b4d03;
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
                      goto LAB_7ffc3e9b4d37;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9b4d31;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e9b4d37:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae3f8);
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
LAB_7ffc3e9b509b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_a_11 | RVA 0x1e50c0 | dev/krypton/7u.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_7u_a_11(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x6d);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3e9b5a14:
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
LAB_7ffc3e9b51d4:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x5a);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x6e);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b5a14;
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
          iVar5 = *(int *)(&UNK_7ffc3eb99ccc + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b59be;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3e9b59a4;
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
LAB_7ffc3e9b583e:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x5a);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0x6d), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b5a14;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3e9b59df;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3e9b51d4;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3e9b55ed;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3e9b55ed:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3e9b59a4;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3e9b583e;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3e9b59a4;
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
                    goto LAB_7ffc3e9b59d5;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3e9b59a4;
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
LAB_7ffc3e9b59be:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3e9b59d5;
        }
        goto LAB_7ffc3e9b51d4;
      }
    }
LAB_7ffc3e9b59df:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3e9b59a4:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e9b59d5:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_7u_a_12 | RVA 0x1e5a60 | dev/krypton/7u.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_7u_a_12(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x6e);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae59d);
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3e9b72b8:
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
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae5c4);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x6d);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65f0);
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b72b8;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if (2 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar7);
            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae5d5);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (3 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae5e4);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (4 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
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
                if (5 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b72b8;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                  }
                  if (5 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,5,pvVar7);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae5f6);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (6 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae614);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                      }
                      if (7 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0958,6);
                        if (pvVar6 == (void *)0x0) {
                          return;
                        }
                        pvVar6 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar6);
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
                        if (8 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6786);
                          if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b72b8;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                          }
                          if (8 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,8,pvVar7);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae63b);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (9 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,9,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae650);
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
                                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae66c);
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
                                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae68e);
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
                                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae6a7);
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
                                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae6b8);
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
                                        pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae6bb)
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
                                                             (env,(char *)0x7ffc3ebae6c9);
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
                                                               (env,(char *)0x7ffc3ebae6cc);
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
                                              pvVar6 = (void *)FUN_7ffc3eb76ce0(env,
                                                  pvRam00007ffc3ebc0960,0xc);
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
                                                pvVar6 = (*(*env)->GetStaticObjectField)
                                                                   (env,pvVar3,pvVar5);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) {
                                                  return;
                                                }
                                                pvVar7 = (*(*env)->NewStringUTF)
                                                                   (env,(char *)0x7ffc3eba65aa);
                                                if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b72b8;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar6 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                                }
                                                if (0x12 < iVar2) {
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar6,0x12,pvVar7);
                                                  pvVar6 = (*(*env)->NewStringUTF)
                                                                     (env,(char *)0x7ffc3ebae6e0);
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
                                                                       (env,(char *)0x7ffc3ebae6ef);
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
                                                      pvVar6 = (void *)FUN_7ffc3eb76ce0(env,
                                                  pvRam00007ffc3ebc0950,0x3f);
                                                  if (pvVar6 == (void *)0x0) {
                                                    return;
                                                  }
                                                  pvVar6 = (*(*env)->GetStaticObjectField)
                                                                     (env,pvRam00007ffc3ebc0950,
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
                                                  if (0x15 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x15,pvVar6);
                                                    pvVar3 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar3,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 != 0) {
                                                      return;
                                                    }
                                                    pvVar5 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab7ae);
                                                    if (pvVar3 == (void *)0x0)
                                                    goto LAB_7ffc3e9b72b8;
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
                                                    if (0x15 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar3,0x15,pvVar5);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae6f3
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
                                                      if (0x16 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x16,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae707);
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
                                                  if (0x17 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x17,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae70a);
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
                                                    if (0x18 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x18,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae71f
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
                                                                  (env,pvVar4,0x19,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae723);
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
                                                              (env,pvVar4,0x1a,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae743);
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
                                                                (env,pvVar4,0x1b,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae76e
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
                                                      if (0x1c < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1c,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae7ab);
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
                                                  if (0x1d < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1d,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae7c4);
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
                                                    if (0x1e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x1e,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae7e1
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
                                                      if (0x1f < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x1f,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae805);
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
                                                  if (0x20 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x20,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae82d);
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
                                                    if (0x21 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x21,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae861
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
                                                      if (0x22 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x22,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae878);
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
                                                  if (0x23 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x23,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae8a2);
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
                                                    if (0x24 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x24,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae8bb
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
                                                      if (0x25 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x25,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae8d9);
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
                                                  if (0x26 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x26,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae90a);
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
                                                    if (0x27 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x27,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae93a
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
                                                      if (0x28 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x28,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae95b);
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
                                                  if (0x29 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x29,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae980);
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
                                                    if (0x2a < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2a,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebae9ac
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
                                                      if (0x2b < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2b,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebae9d0);
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
                                                  if (0x2c < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2c,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebae9e8);
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
                                                    if (0x2d < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x2d,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebaea0c
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
                                                      if (0x2e < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9b7273. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2e,pvVar3);
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
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9b72a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_7u_b_13 | RVA 0x1e72e0 | dev/krypton/7u.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_b_13(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0xf3);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x6e);
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
      goto LAB_7ffc3e9b7786;
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
      goto LAB_7ffc3e9b7786;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x5a);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3e9b764a:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x6d);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3e9b7630:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x6e);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b762a;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e9b7630;
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
                    goto LAB_7ffc3e9b7610;
                  }
                }
              }
              goto LAB_7ffc3e9b764a;
            }
LAB_7ffc3e9b7610:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3e9b764a;
      }
LAB_7ffc3e9b762a:
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
LAB_7ffc3e9b7786:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_a_14 | RVA 0x1e77a0 | dev/krypton/7u.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_a_14
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
LAB_7ffc3e9b7a01:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e9b7a1d;
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
        if (lVar6 == 0) goto LAB_7ffc3e9b7a01;
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
LAB_7ffc3e9b7a1d:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_b_15 | RVA 0x1e7a50 | dev/krypton/7u.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_b_15
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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x5a);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xf4), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x5a);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xf5);
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

/* JNI_dev_krypton_7u_c_16 | RVA 0x1e7c80 | dev/krypton/7u.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_c_16(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0xf3);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x6e);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9b89b0;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3e9b8996;
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
    goto LAB_7ffc3e9b89c4;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x6d);
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
LAB_7ffc3e9b8996:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9b89c4;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0xf6);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x5a);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0xf4);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3e9b89b0;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3e9b8996;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x5a);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0xf5);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0x6e);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3e9b89b0;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3e9b8996;
              pJVar14 = *env;
              goto LAB_7ffc3e9b8577;
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
        if (lVar9 == 0) goto LAB_7ffc3e9b89b0;
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
          goto LAB_7ffc3e9b89b0;
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
          lVar8 = FUN_7ffc3eb76c30(env,0x5a);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xf6);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x67cd0da7c549,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x5a);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x6e);
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
LAB_7ffc3e9b8577:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3e9b8996;
      }
    }
  }
LAB_7ffc3e9b89b0:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9b89c4:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_a_17 | RVA 0x1e89d0 | dev/krypton/7u.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_a_17
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
LAB_7ffc3e9b8dfa:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3e9b8e08;
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
        if (lVar7 == 0) goto LAB_7ffc3e9b8dfa;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3e9b8dfa;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3e9b8dec;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3e9b8dfa;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3e9b8dec;
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
LAB_7ffc3e9b8dec:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3e9b8e08:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_b_18 | RVA 0x1e8e30 | dev/krypton/7u.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_b_18
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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x5a);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xf7), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x5a);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0xf8);
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

/* JNI_dev_krypton_7u_d_19 | RVA 0x1e90a0 | dev/krypton/7u.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_d_19(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x5a);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0xf3);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x6e);
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
LAB_7ffc3e9ba2e7:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e9ba2ff;
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
      goto LAB_7ffc3e9ba2ff;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x6d);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3e9ba2e7;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0xf6);
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
            lVar6 = FUN_7ffc3eb76c30(env,0x5a);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xf6);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9ba2d1;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3e9ba2e7;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3e9b9750:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5a);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0xf7);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6e);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3e9b9cd1:
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
              goto LAB_7ffc3e9ba2e7;
            }
            goto LAB_7ffc3e9ba2d1;
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
              if (iVar4 == 0) goto code_r0x7ffc3e9b988e;
              goto joined_r0x7ffc3e9b9951;
            }
          }
          goto LAB_7ffc3e9ba2d1;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3e9ba2ff;
      }
    }
  }
  goto LAB_7ffc3e9ba2d1;
code_r0x7ffc3e9b988e:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3e9b98dc;
  goto LAB_7ffc3e9b9750;
code_r0x7ffc3e9b98dc:
  lVar6 = FUN_7ffc3eb76c30(env,0x5a);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0xf6);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x67cd0da7c549,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3e9b9951:
  do {
    if (lVar10 == 0) goto LAB_7ffc3e9ba2d1;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3e9ba2e7;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x5a);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0xf8);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0x6e);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3e9b9cd1;
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
    if (lVar6 == 0) goto LAB_7ffc3e9ba2d1;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3e9ba2d1;
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
      if (lVar10 == 0) goto LAB_7ffc3e9ba2d1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9ba2d1;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3e9ba2d1;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9ba2d1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9ba2d1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3e9ba2d1;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3e9ba2d1;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3e9ba028;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9ba2d1;
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
      lVar6 = FUN_7ffc3eb76c30(env,0x5a);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0xf6);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x67cd0da7c549,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3e9ba2d1;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3e9ba2e7;
  }
LAB_7ffc3e9ba028:
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
LAB_7ffc3e9ba2d1:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9ba2ff:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_a_20 | RVA 0x1ea330 | dev/krypton/7u.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_a_20
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
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3e9bb0c5;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (iVar2 < 0xe2) {
    if ((iVar2 != 0x67) && (iVar2 != 0xaa)) goto LAB_7ffc3e9ba560;
LAB_7ffc3e9ba3df:
    lVar4 = FUN_7ffc3eb76c30(env,0x5a);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xf9), lVar5 == 0))
    goto LAB_7ffc3e9baadd;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9baadd;
    if (lVar4 == 0) goto LAB_7ffc3e9bab3c;
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar5 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x4e), lVar12 != 0)) {
      uVar6 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar5,0x34), lVar12 == 0))
      goto LAB_7ffc3e9bab56;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x36), lVar5 == 0))
      goto LAB_7ffc3e9bab56;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9bab56;
      if (iVar2 == 0x67) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9bab3c;
        uVar9 = 0x51;
      }
      else if (iVar2 == 0xe2) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9bab3c;
        uVar9 = 0x50;
      }
      else if (iVar2 == 0xf1) {
        if (arg0 == (void *)0x0) {
LAB_7ffc3e9bab3c:
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          goto LAB_7ffc3e9bab56;
        }
        uVar9 = 0x4f;
      }
      else {
        if (arg0 == (void *)0x0) goto LAB_7ffc3e9bab3c;
        uVar9 = 0x52;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
      if (lVar5 == 0) goto LAB_7ffc3e9bab56;
      uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar6,uVar7,uVar8);
      uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e9bab56;
      lStack_50 = 0;
LAB_7ffc3e9ba821:
      if (arg3 == (void *)0x0) {
LAB_7ffc3e9bab23:
        pJVar10 = *env;
        arg2_00 = &DAT_7ffc3eba6000;
        pvVar14 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9bac0b:
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
                if (pvVar14 == (void *)0x0) goto LAB_7ffc3e9bab23;
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
                      goto LAB_7ffc3e9bac0b;
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
                    goto LAB_7ffc3e9bac11;
                  }
                }
                pvVar14 = (*(*env)->ExceptionOccurred)(env);
                pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                goto joined_r0x7ffc3e9babe6;
              }
            }
          }
        }
      }
LAB_7ffc3e9bac11:
      pvVar14 = (*(*env)->ExceptionOccurred)(env);
      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
      goto joined_r0x7ffc3e9babe6;
    }
LAB_7ffc3e9bab56:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
  }
  else {
    if ((iVar2 == 0xf1) || (iVar2 == 0xe2)) goto LAB_7ffc3e9ba3df;
LAB_7ffc3e9ba560:
    lVar4 = FUN_7ffc3eb76c30(env,0x5a);
    if ((lVar4 != 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0xfa), lVar5 != 0)) {
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
                      if (iVar2 == 0xdd) {
                        if (arg0 == (void *)0x0) goto LAB_7ffc3e9bb136;
                        uVar9 = 0x57;
LAB_7ffc3e9baa66:
                        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar9);
joined_r0x7ffc3e9baa99:
                        if (lVar4 != 0) {
                          uVar6 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar6,uVar7,uVar8);
                          uVar16 = (undefined4)((ulonglong)uVar7 >> 0x20);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            lVar4 = 0;
                            goto LAB_7ffc3e9ba821;
                          }
                        }
                      }
                      else {
                        if (iVar2 == 0x24) {
                          if (arg0 != (void *)0x0) {
                            uVar9 = 0x56;
                            goto LAB_7ffc3e9baa66;
                          }
                        }
                        else if (arg0 != (void *)0x0) {
                          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
                          goto joined_r0x7ffc3e9baa99;
                        }
LAB_7ffc3e9bb136:
                        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      }
                      pvVar14 = (*(*env)->ExceptionOccurred)(env);
                      pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
                      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
                      if (bVar1 == 0) {
                        return (void *)0x0;
                      }
                      lVar4 = 0;
                      goto LAB_7ffc3e9bac45;
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
joined_r0x7ffc3e9babe6:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3e9bac45;
      }
    }
LAB_7ffc3e9baadd:
    pvVar14 = (*(*env)->ExceptionOccurred)(env);
    pvVar15 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar14,pvVar15);
    if (bVar1 == 0) {
      return (void *)0x0;
    }
    lStack_50 = 0;
    lVar4 = 0;
  }
LAB_7ffc3e9bac45:
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
  if (pvVar11 == (void *)0x0) goto LAB_7ffc3e9bb0c5;
  lVar5 = FUN_7ffc3eb76c90(env,pvVar15,0x28);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar11,pvVar15,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar14 == (void *)0x0) goto LAB_7ffc3e9bb0c5;
  lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3e7d1a50(env,pvVar14,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar5 == 0) goto LAB_7ffc3e9bb0c5;
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
  if (lVar12 == 0) goto LAB_7ffc3e9bb0c5;
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
      goto joined_r0x7ffc3e9bae77;
    }
    pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar12 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar12 == 0) {
      return (void *)0x0;
    }
    lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x5a);
joined_r0x7ffc3e9bae77:
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
LAB_7ffc3e9bb0c5:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_a_21 | RVA 0x1eb190 | dev/krypton/7u.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_a_21
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3e9bb5d6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3e9bb211:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3e9bb211;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3e9bb5b9:
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
LAB_7ffc3e9bb5e8:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e9bb325;
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
      if (iVar2 < iVar3) goto LAB_7ffc3e9bb5b9;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3e9bb5e8;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x5a);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0xfb);
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
            goto LAB_7ffc3e9bb31e;
          }
        }
LAB_7ffc3e9bb5d6:
        pJVar7 = *env;
      }
    }
LAB_7ffc3e9bb31e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3e9bb325:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_7u_b_22 | RVA 0x1eb610 | dev/krypton/7u.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_7u_b_22
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3e9bbf4e;
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
  if (_DAT_7ffc3ebc0bf8 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x5a);
    uVar11 = FUN_7ffc3eb76c30(env,0x5a);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0bf8 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0bf8;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3e9bbbd0:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9bbbe4:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9bbbd0;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3e9bbbd0;
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
                        goto LAB_7ffc3e9bbbea;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9bbbe4;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3e9bbbea:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebae3f8);
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
LAB_7ffc3e9bbf4e:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

