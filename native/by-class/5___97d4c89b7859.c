/* Native reconstruction for dev/krypton/5_.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5__6_0 | RVA 0x19bc40 | dev/krypton/5_.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5__6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x8c);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb8);
  if (pvVar5 == (void *)0x0) {
    return;
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
    return;
  }
  lVar7 = FUN_7ffc3eb76c30(env,0x23);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x62);
  if (lVar8 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar11 = uVar6 ^ 0x39aae36a58a;
  if (iVar3 != 0) {
LAB_7ffc3e96bd2b:
    pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
    if (lVar7 == 0) {
      return;
    }
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
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
        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
        lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar7 == 0) {
          return;
        }
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x25d626e27b28);
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
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
          if (_DAT_7ffc3ebc1878 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x8c);
            lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebb26fa,0x7ffc3eba626f,0,0);
            if ((lVar7 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc1878 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc1878;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c63cdc31f6e78aa);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
LAB_7ffc3e96c610:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96c626. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e96cdd4;
    }
LAB_7ffc3e96cdbc:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e96cdd4:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96cde7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
    return;
  }
  if (_DAT_7ffc3ebc1858 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,0x8c);
    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebabd8d,0x7ffc3eba71d3,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1858 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1858;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c616dc377eb73a0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96cad6;
    if (_DAT_7ffc3ebc1860 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x8c);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebabd8d,0x7ffc3eba7203,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1860 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1860;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96cad6;
    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c6086d4b0567c55);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
    lVar7 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e96cad6;
    if (lVar7 == 0) goto LAB_7ffc3e96bd2b;
    if (_DAT_7ffc3ebc1868 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x8c);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebabd8d,0x7ffc3eba71d3,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1868 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1868;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c616dc377eb73a0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1870 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x8c);
          lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebabd8d,0x7ffc3ebab583,0,0);
          if ((lVar7 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1870 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1870;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c60d1a8c66108ba);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
          lVar7 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar7 == 0) goto LAB_7ffc3e96bd2b;
            if (_DAT_7ffc3ebc1880 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x8c);
              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba6299,0x7ffc3eba606c,
                                       0x7ffc3ebabe58,0x7ffc3eba647c,0,0);
              if ((lVar7 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc1880 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc1880;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x25e0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar6 ^ 0x50b93bb71280c231);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
            uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar2 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
            if (_DAT_7ffc3ebc1888 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x8c);
              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaed3d,0x7ffc3eba72ac,0,0);
              if ((lVar7 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc1888 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc1888;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c61d75972aef41c);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
            pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar9);
            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (receiver != (void *)0x0) {
              lVar7 = FUN_7ffc3eb76c30(env,2);
              if (lVar7 == 0) {
                return;
              }
              lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
              if (lVar8 == 0) {
                return;
              }
              FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
              goto LAB_7ffc3e96c610;
            }
            goto LAB_7ffc3e96cdbc;
          }
        }
      }
    }
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) goto LAB_7ffc3e96ccef;
  }
  else {
LAB_7ffc3e96cad6:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar7 = FUN_7ffc3eb76c30(env,0x8c);
      if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1cc), lVar8 != 0)) {
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar4 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e96cb7e;
        }
        (*(*env)->Throw)(env,pvVar4);
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e96cb7e:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x8c);
    if ((lVar7 == 0) || (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1cc), lVar8 == 0)) {
LAB_7ffc3e96cc12:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e96cc12;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
  }
  (*(*env)->ExceptionClear)(env);
  lVar7 = FUN_7ffc3eb76c30(env,0x8c);
  if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1cc), lVar8 != 0)) {
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3e96ccef;
    }
    (*(*env)->Throw)(env,pvVar4);
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e96ccef:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x8c);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x1cc), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96cd9b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_5__1_1 | RVA 0x19ce10 | dev/krypton/5_.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5__1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  longlong lVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x8c);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xb8);
  if (pvVar5 == (void *)0x0) {
    return;
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
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar6 ^ 0x6d06feb6fadf);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar4 != (void *)0x0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar3 < 1) {
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e96d55d;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
    if (_DAT_7ffc3ebc1840 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x8c);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebb26fa,0x7ffc3eba626f,0,0);
      if ((lVar7 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1840 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1840;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8a22f910b77050a);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar6 ^ 0x19ff5e1a7149);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1848 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x8c);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb26eb,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3ebabe58,0x7ffc3eba647c,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1848 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1848;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x4490);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar6 ^ 0x49b19ab7672f234a);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    uVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
    if (_DAT_7ffc3ebc1850 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x8c);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb26eb,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaed3d,0x7ffc3eba72ac,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1850 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1850;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,uVar2);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8a2cd3c828220df);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar6 ^ 0x19ff5e1a7149);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar8);
    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (receiver != (void *)0x0) {
      lVar7 = FUN_7ffc3eb76c30(env,2);
      if (lVar7 == 0) {
        return;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar7,0x61);
      if (lVar10 == 0) {
        return;
      }
      FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96d31f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e96d55d:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e96d570. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

