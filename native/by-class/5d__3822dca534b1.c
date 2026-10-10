/* Native reconstruction for dev/krypton/5d.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5d_6_0 | RVA 0x19dde0 | dev/krypton/5d.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_5d_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  void *pvVar10;
  undefined8 uVar11;
  void *pvVar12;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar13;
  char *arg2;
  float fVar14;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x56);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0x65);
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
  lVar8 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xa4);
  if (lVar9 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc18f0 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,0x56);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc18f0 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc18f0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar13 = uVar7 ^ 0x6bee294430f8;
    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x1c7d35d6c117e035);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
    pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9721d2;
    if (iVar3 != 0) {
      if (_DAT_7ffc3ebc18f8 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x56);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae317,0x7ffc3eba7469,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc18f8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc18f8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7e9db6f7fe39b1);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        lVar8 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (lVar8 == 0) {
            return;
          }
          if (_DAT_7ffc3ebc1900 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x56);
            lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
            if ((lVar8 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc1900 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc1900;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1c7d35d6c117e035);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) goto joined_r0x7ffc3e96e1fb;
          }
          goto LAB_7ffc3e972343;
        }
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
      if (bVar1 != 0) goto LAB_7ffc3e972237;
      goto LAB_7ffc3e9722af;
    }
joined_r0x7ffc3e96e1fb:
    if (_DAT_7ffc3ebc1908 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x56);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae317,0x7ffc3eba7203,0,0);
      if ((lVar8 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc1908 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1908;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7a242fac079d6d);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
      lVar8 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e972343;
      if (lVar8 == 0) {
        return;
      }
      if (_DAT_7ffc3ebc1910 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x56);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae31a,0x7ffc3eba6153,0,0);
        if ((lVar8 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1910 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc1910;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                         0x1c7cce602002d4fe);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar10);
      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1918 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x56);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae317,0x7ffc3ebabd95,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1918 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1918;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7a8ce92a4a87a4);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x57);
      if (pvVar6 == (void *)0x0) {
        return;
      }
      pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar10 == (void *)0x0) {
LAB_7ffc3e97245d:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = &DAT_7ffc3eba6000;
        pvVar5 = pvRam00007ffc3ebc0a70;
        goto LAB_7ffc3e972493;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
      }
      if (iVar4 < 2) {
LAB_7ffc3e97243f:
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar5 = pvRam00007ffc3ebc0a98;
LAB_7ffc3e972493:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9724ae. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)(env,pvVar5,arg2);
        return;
      }
      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar6);
      lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar8 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar7 ^ 0x63dfd9d9c391);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (*(*env)->GetArrayLength)(env,pvVar10);
      }
      if (iVar4 < 1) goto LAB_7ffc3e97243f;
      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar6);
      if (_DAT_7ffc3ebc1920 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x56);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae31c,0x7ffc3ebabdbc,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1920 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1920;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar10);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7bc92e4e1b3078);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar12);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x57);
      if (pvVar6 == (void *)0x0) {
        return;
      }
      if (pvVar5 == (void *)0x0) {
        if (iVar3 == 0) goto LAB_7ffc3e970a9c;
        goto LAB_7ffc3e96f0b7;
      }
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
      if (bVar1 == 0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6033;
        pvVar5 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3e972493;
      }
      if (iVar3 == 0) goto LAB_7ffc3e970a9c;
      if (_DAT_7ffc3ebc1928 == (void *)0x0) {
        uVar11 = FUN_7ffc3eb76c30(env,0x56);
        lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae31c,0x7ffc3eba6204,0,0);
        if ((lVar8 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1928 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1928;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c65574c62efc832);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar12);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e972406;
        cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
        if (cVar2 != '\0') {
          pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
          if (lVar8 == 0) {
            return;
          }
          pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar8,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3e97245d;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if (1 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar8 == 0) {
              return;
            }
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar7 ^ 0x4da2a190ee5a
                                              );
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (0 < iVar3) {
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar10);
              if (_DAT_7ffc3ebc1930 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x56);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebae31c,0x7ffc3eba626f,0,0);
                if ((lVar8 != 0) &&
                   (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar10 != (void *)0x0)) {
                  _DAT_7ffc3ebc1930 = (*(*env)->NewGlobalRef)(env,pvVar10);
                }
              }
              pvVar10 = _DAT_7ffc3ebc1930;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar6);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c651b3d9ebc1197);
              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
              FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              goto LAB_7ffc3e96f0b7;
            }
          }
          goto LAB_7ffc3e97243f;
        }
LAB_7ffc3e96f0b7:
        if (_DAT_7ffc3ebc1938 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1938 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1938;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7d35d6c117e035);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1940 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3eba7469,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1940 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1940;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7e9db6f7fe39b1);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1948 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae31c,0x7ffc3ebae31e,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1948 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1948;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7c2bd121fc4698);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1950 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae352,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1950 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1950;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7a7268d019fd25);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
        FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1958 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1958 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1958;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7d35d6c117e035);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1960 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3eba7203,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1960 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1960;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7a242fac079d6d);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1968 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae31c,0x7ffc3ebae384,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1968 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1968;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c612bd2c57a4e76);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        fVar14 = (float)FUN_7ffc3e853ac0(env,uVar11,uRam00007ffc3ebc09c8);
        if (_DAT_7ffc3ebc1970 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae39c,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1970 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1970;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                           (double)fVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c60b6e5defc4b4d);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1978 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1978 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1978;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7d35d6c117e035);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1980 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3eba7203,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1980 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1980;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c7a242fac079d6d);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1988 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae31c,0x7ffc3ebae384,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc1988 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc1988;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x1c6746f66fc3beac);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        fVar14 = (float)FUN_7ffc3e853ac0(env,uVar11,uRam00007ffc3ebc09c8);
        if (_DAT_7ffc3ebc1990 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae39c,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1990 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1990;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                           (double)fVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c797e9c88a250ef);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc1998 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebae384,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1998 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1998;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c60b6e5defc4b4d);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        fVar14 = (float)FUN_7ffc3e853ac0(env,uVar11,uRam00007ffc3ebc09c8);
        if (_DAT_7ffc3ebc19a0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae39c,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19a0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19a0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                           (double)fVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c61705eb879b485);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc19a8 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebae384,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19a8 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19a8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c797e9c88a250ef);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        fVar14 = (float)FUN_7ffc3e853ac0(env,uVar11,uRam00007ffc3ebc09c8);
        if (_DAT_7ffc3ebc19b0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae39c,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19b0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                           (double)fVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7b87c3debcec37);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc19b8 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebae384,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19b8 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19b8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c60b6e5defc4b4d);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        fVar14 = (float)FUN_7ffc3e853ac0(env,uVar11,uRam00007ffc3ebc09c8);
        if (_DAT_7ffc3ebc19c0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae39c,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19c0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19c0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                           (double)fVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7af4c65602cdda);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc19c8 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebae384,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19c8 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19c8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c797e9c88a250ef);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        fVar14 = (float)FUN_7ffc3e853ac0(env,uVar11,uRam00007ffc3ebc09c8);
        if (_DAT_7ffc3ebc19d0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3ebae39c,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19d0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19d0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,
                                           (double)fVar14);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c60634323f0a8b0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar10);
        FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (_DAT_7ffc3ebc19d8 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae317,0x7ffc3ebae31e,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc19d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc19d8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e972406;
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7a7268d019fd25);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
        pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e972406;
        if (_DAT_7ffc3ebc19e0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,0x56);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae31a,0x7ffc3ebae3b5,0,0);
          if ((lVar8 != 0) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc19e0 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
        }
        pvVar6 = _DAT_7ffc3ebc19e0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3e972406;
        pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           0x1c7c7c79aff95447);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
        pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          bVar1 = (*(*env)->IsSameObject)(env,pvVar5,pvVar6);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc19e8 == (void *)0x0) {
            uVar11 = FUN_7ffc3eb76c30(env,0x56);
            lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebae317,0x7ffc3ebabe8b,0,0);
            if ((lVar8 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc19e8 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc19e8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1c7da7bbc9d1ec20);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
            pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc19f0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x56);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebae31c,0x7ffc3ebabeb2,0,0);
                if ((lVar8 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc19f0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc19f0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar7 ^ 0x2387119ce11d);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c640640034468a8);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar5);
                uVar11 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
                  if (cVar2 == '\0') {
                    return;
                  }
LAB_7ffc3e970a9c:
                  if (_DAT_7ffc3ebc19f8 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x56);
                    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc19f8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc19f8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x1c7d35d6c117e035);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar10);
                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar10);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (_DAT_7ffc3ebc1a00 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x56);
                    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae317,0x7ffc3eba7469,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar6 != (void *)0x0)) {
                      _DAT_7ffc3ebc1a00 = (*(*env)->NewGlobalRef)(env,pvVar6);
                    }
                  }
                  pvVar6 = _DAT_7ffc3ebc1a00;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c7e9db6f7fe39b1);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (_DAT_7ffc3ebc1a08 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x56);
                    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae31a,0x7ffc3ebae3b5,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar6 != (void *)0x0)) {
                      _DAT_7ffc3ebc1a08 = (*(*env)->NewGlobalRef)(env,pvVar6);
                    }
                  }
                  pvVar6 = _DAT_7ffc3ebc1a08;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x1c7c7c79aff95447);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar12);
                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar12);
                  pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar10);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (_DAT_7ffc3ebc1a10 == (void *)0x0) {
                    uVar11 = FUN_7ffc3eb76c30(env,0x56);
                    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3eba626f,0,0);
                    if ((lVar8 != 0) &&
                       (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar10 != (void *)0x0)) {
                      _DAT_7ffc3ebc1a10 = (*(*env)->NewGlobalRef)(env,pvVar10);
                    }
                  }
                  pvVar10 = _DAT_7ffc3ebc1a10;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    return;
                  }
                  pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar6);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x1c66a115c9f9e9df);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar13);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar5);
                  FUN_7ffc3e7d1a50(env,pvVar10,uRam00007ffc3ebc0a40,pvVar12);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e970e89. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (*(*env)->ExceptionCheck)(env);
                  return;
                }
              }
            }
          }
          goto LAB_7ffc3e972406;
        }
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
LAB_7ffc3e972406:
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
      }
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
      if (bVar1 == 0) goto LAB_7ffc3e97234f;
      goto LAB_7ffc3e9722d7;
    }
  }
  else {
LAB_7ffc3e9721d2:
    pvVar6 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e972237:
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x56);
    if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xee), lVar9 == 0)) {
LAB_7ffc3e9722a3:
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar5);
        goto LAB_7ffc3e9722a3;
      }
      pvVar6 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e9722af:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e9722d7:
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x56);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xee), lVar9 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar6 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e97234f;
      }
      (*(*env)->Throw)(env,pvVar5);
    }
  }
LAB_7ffc3e972343:
  pvVar6 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e97234f:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar6,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,0x56);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xee), lVar9 != 0)) {
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e972403. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar5);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_5d_1_1 | RVA 0x1a24d0 | dev/krypton/5d.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5d_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  void *pvVar11;
  ulonglong uVar12;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x56);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x65);
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
  lVar7 = FUN_7ffc3eb76c30(env,0x40);
  if (lVar7 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xa4);
  if (lVar8 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7db1e0(env,lVar7,lVar8);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1890 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,0x56);
    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1890 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1890;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar12 = uVar6 ^ 0x718bd968e43b;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8be2fb3313b34f6);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (_DAT_7ffc3ebc1898 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x56);
        lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae317,0x7ffc3eba7469,0,0);
        if ((lVar7 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1898 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc1898;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8bd87d307d2ed72);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12);
        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (iVar3 == 0) {
joined_r0x7ffc3e9729ca:
            if (_DAT_7ffc3ebc18b0 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x56);
              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae31c,0x7ffc3ebae31e,0,0);
              if ((lVar7 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc18b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc18b0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc8bf31b4d1d0925b);
              (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc18b8 == (void *)0x0) {
                  uVar10 = FUN_7ffc3eb76c30(env,0x56);
                  lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c
                                           ,0x7ffc3ebae317,0x7ffc3ebae31e,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc18b8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc18b8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0xc8b9680d203529e6);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar12);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    pvVar4 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3e973ac0;
                  }
                  bVar1 = (*(*env)->IsSameObject)(env,pvVar4,pvVar5);
                  if (bVar1 != 0) {
                    return;
                  }
                  if (iVar3 == 0) {
LAB_7ffc3e9730d5:
                    if (_DAT_7ffc3ebc18d0 == (void *)0x0) {
                      uVar10 = FUN_7ffc3eb76c30(env,0x56);
                      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
                      if ((lVar7 != 0) &&
                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                         pvVar4 != (void *)0x0)) {
                        _DAT_7ffc3ebc18d0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                      }
                    }
                    pvVar4 = _DAT_7ffc3ebc18d0;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8be2fb3313b34f6);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (_DAT_7ffc3ebc18d8 == (void *)0x0) {
                      uVar10 = FUN_7ffc3eb76c30(env,0x56);
                      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebae317,0x7ffc3eba7469,0,0);
                      if ((lVar7 != 0) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc18d8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                    }
                    pvVar5 = _DAT_7ffc3ebc18d8;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8bd87d307d2ed72);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (_DAT_7ffc3ebc18e0 == (void *)0x0) {
                      uVar10 = FUN_7ffc3eb76c30(env,0x56);
                      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebae317,0x7ffc3ebae31e,0,0);
                      if ((lVar7 != 0) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc18e0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                    }
                    pvVar5 = _DAT_7ffc3ebc18e0;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,0xc8b9680d203529e6);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar11);
                    pvVar11 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                       ,uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar11);
                    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    if (_DAT_7ffc3ebc18e8 == (void *)0x0) {
                      uVar10 = FUN_7ffc3eb76c30(env,0x56);
                      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3eba626f,0,0);
                      if ((lVar7 != 0) &&
                         (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                         pvVar9 != (void *)0x0)) {
                        _DAT_7ffc3ebc18e8 = (*(*env)->NewGlobalRef)(env,pvVar9);
                      }
                    }
                    pvVar9 = _DAT_7ffc3ebc18e8;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return;
                    }
                    pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar4);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar5);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8a5bb7039d53d1c);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar4);
                    FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar11);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9734b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (*(*env)->ExceptionCheck)(env);
                    return;
                  }
                  if (_DAT_7ffc3ebc18c0 == (void *)0x0) {
                    uVar10 = FUN_7ffc3eb76c30(env,0x56);
                    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3ebae317,0x7ffc3ebabe8b,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar4 != (void *)0x0)) {
                      _DAT_7ffc3ebc18c0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                  pvVar4 = _DAT_7ffc3ebc18c0;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xc8bebdde39fd38e3);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar12);
                    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc18c8 == (void *)0x0) {
                        uVar10 = FUN_7ffc3eb76c30(env,0x56);
                        lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,
                                                 0x7ffc3eba606c,0x7ffc3ebae31c,0x7ffc3ebabeb2,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar5 != (void *)0x0)) {
                          _DAT_7ffc3ebc18c8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                        }
                      }
                      pvVar5 = _DAT_7ffc3ebc18c8;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,
                                                          uVar6 ^ 0x2387119ce11d);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0xc8a71c25f368bc6b);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar12);
                        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                        uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          cVar2 = FUN_7ffc3e7d53d0(env,uVar10,uRam00007ffc3ebc0a38);
                          if (cVar2 == '\0') {
                            return;
                          }
                          goto LAB_7ffc3e9730d5;
                        }
                      }
                    }
                  }
                  pvVar4 = (*(*env)->ExceptionOccurred)(env);
                  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
                  if (bVar1 == 0) goto LAB_7ffc3e973ac0;
                  (*(*env)->ExceptionClear)(env);
                  lVar7 = FUN_7ffc3eb76c30(env,0x56);
                  if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xee), lVar8 != 0)) {
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      pvVar4 = (*(*env)->ExceptionOccurred)(env);
                      goto LAB_7ffc3e973ac0;
                    }
                    (*(*env)->Throw)(env,pvVar4);
                  }
                }
              }
            }
          }
          else {
            if (pvVar4 == (void *)0x0) {
              return;
            }
            if (_DAT_7ffc3ebc18a0 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x56);
              lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae317,0x7ffc3eba71d3,0,0);
              if ((lVar7 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc18a0 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc18a0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xc8be2fb3313b34f6);
              (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar12
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar9);
              pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (_DAT_7ffc3ebc18a8 == (void *)0x0) {
                  uVar10 = FUN_7ffc3eb76c30(env,0x56);
                  lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebae308,0x7ffc3eba606a,0x7ffc3eba606c
                                           ,0x7ffc3ebae317,0x7ffc3eba7469,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc18a8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc18a8;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar9 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xc8bd87d307d2ed72);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) goto joined_r0x7ffc3e9729ca;
                }
              }
            }
          }
        }
      }
    }
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e973ac0:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar7 = FUN_7ffc3eb76c30(env,0x56);
    if ((lVar7 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar7,0xee), lVar8 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar7,lVar8,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e973b6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

