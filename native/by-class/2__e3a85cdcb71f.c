/* Native reconstruction for dev/krypton/2.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_2_7_0 | RVA 0x31ff80 | dev/krypton/2.7([Ljava/lang/Object;)Lnet/minecraft/class_2960; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_7_0(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  JNINativeInterface_ *pJVar5;
  longlong lVar6;
  ulonglong uVar7;
  void *pvVar8;
  ulonglong uVar9;
  void *pvVar10;
  char *arg2;
  
  if (arg0 == (void *)0x0) {
    pJVar5 = *env;
LAB_7ffc3eaf0079:
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3eaf0080;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar2 < 1) {
LAB_7ffc3eaf04ba:
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
  else {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    if ((pvVar3 == (void *)0x0) ||
       (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvRam00007ffc3ebc09e8), bVar1 != 0)) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,arg0);
      }
      if (iVar2 < 2) goto LAB_7ffc3eaf04ba;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
      pJVar5 = *env;
      if (pvVar4 == (void *)0x0) goto LAB_7ffc3eaf0079;
      bVar1 = (*pJVar5->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
      if (bVar1 != 0) {
        lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return (void *)0x0;
        }
        uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xa0);
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
        if (((_DAT_7ffc3ebc8ed0 == (void *)0x0) &&
            (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba6299,0x7ffc3eba606c,
                                      0x7ffc3ebaec12,0x7ffc3eba629d,0,0), lVar6 != 0)) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc8ed0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
        pvVar4 = _DAT_7ffc3ebc8ed0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2281);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
        pvVar10 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           uVar9 ^ uVar7 ^ 0x459c5b4438f7f208);
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
        pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (((_DAT_7ffc3ebc8ed8 == (void *)0x0) &&
            (lVar6 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                      0x7ffc3ebae34f,0x7ffc3ebb08cf,0,0), lVar6 != 0)) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0
           )) {
          _DAT_7ffc3ebc8ed8 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
        pvVar8 = _DAT_7ffc3ebc8ed8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xd7ee0791b25e1449);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar9 ^ uVar7);
        (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        return pvVar3;
      }
    }
    pJVar5 = *env;
    arg2 = (char *)0x7ffc3eba6033;
    pvVar3 = pvRam00007ffc3ebc0a58;
  }
LAB_7ffc3eaf0080:
  (*pJVar5->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_3_1 | RVA 0x320510 | dev/krypton/2.3(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_3_1(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *pvVar7;
  undefined8 uVar8;
  void *pvVar9;
  undefined8 uVar10;
  longlong lVar11;
  void *pvVar12;
  JNINativeInterface_ *pJVar13;
  ulonglong uVar14;
  char *arg2;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  void *pvStack_50;
  void *pvStack_48;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar14 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar14 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar14 = uVar14 ^ arg0;
  if (receiver == (void *)0x0) goto LAB_7ffc3eaf2223;
  lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e0,0x59);
  if (lVar5 == 0) {
LAB_7ffc3eaf2257:
    pJVar13 = *env;
  }
  else {
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,receiver,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    if (_DAT_7ffc3ebc0c88 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6371,0x7ffc3eba77d7,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc0c88 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc0c88;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1a04aa35e987ff8d);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    if (_DAT_7ffc3ebc0c90 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3ebaec12,0x7ffc3eba629d,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc0c90 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc0c90;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2665);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar14 ^ 0x5327a3b8287a3b30);
    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    pvStack_50 = receiver;
    if (_DAT_7ffc3ebc0c98 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6371,0x7ffc3eba7807,0,0);
      if ((lVar5 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc0c98 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc0c98;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1a0f890a2402ac89);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar3);
    uVar8 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eaf2257;
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x2a);
    pJVar13 = *env;
    if (pvVar3 != (void *)0x0) {
      pvVar4 = (*pJVar13->AllocObject)(env,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x2b);
        pJVar13 = *env;
        if (pvVar6 != (void *)0x0) {
          pvVar7 = (*pJVar13->AllocObject)(env,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc0ca0 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x27);
              lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3ebaea34,0x7ffc3eba7845,0,0);
              if ((lVar5 != 0) &&
                 (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar12 != (void *)0x0)) {
                _DAT_7ffc3ebc0ca0 = (*(*env)->NewGlobalRef)(env,pvVar12);
              }
            }
            pvVar12 = _DAT_7ffc3ebc0ca0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvStack_48 = pvVar4;
              pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1a354ea3b76905bc);
              (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar9);
              uVar10 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (pvVar7 == (void *)0x0) {
                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                }
                else {
                  lVar5 = FUN_7ffc3eb76c90(env,pvVar6,0x67);
                  if (lVar5 != 0) {
                    FUN_7ffc3e7dbbc0(env,pvVar7,pvVar6,lVar5,uVar8,uVar10);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    pvVar4 = pvStack_48;
                    if (bVar1 == 0) {
                      if (pvStack_48 == (void *)0x0) goto LAB_7ffc3eaf2223;
                      lVar5 = FUN_7ffc3eb76c90(env,pvVar3,0x68);
                      if (lVar5 != 0) {
                        FUN_7ffc3e7dbbc0(env,pvVar4,pvVar3,lVar5,pvVar7,uVar10);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc0ca8 == (void *)0x0) {
                            uVar8 = FUN_7ffc3eb76c30(env,0x27);
                            lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                     0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba6128,0,
                                                     0);
                            if ((lVar5 != 0) &&
                               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                               pvVar3 != (void *)0x0)) {
                              _DAT_7ffc3ebc0ca8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                            }
                          }
                          pvVar3 = _DAT_7ffc3ebc0ca8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar6 = (*(*env)->NewObjectArray)
                                               (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar4);
                            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1a30b97f766b47b7);
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar4);
                            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar14);
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar4);
                            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar6
                                                             );
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc0cb0 == (void *)0x0) {
                                uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                         0x7ffc3eba606c,0x7ffc3eba6371,
                                                         0x7ffc3eba6128,0,0);
                                if ((lVar5 != 0) &&
                                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00
                                                                     ), pvVar4 != (void *)0x0)) {
                                  _DAT_7ffc3ebc0cb0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                }
                              }
                              pvVar4 = _DAT_7ffc3ebc0cb0;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar6 = (*(*env)->NewObjectArray)
                                                   (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
                                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0x1a0de8cec466d423);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
                                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,uVar14);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
                                uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar3 = (void *)FUN_7ffc3eaf2490(env,uVar8);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    if (_DAT_7ffc3ebc0cb8 == (void *)0x0) {
                                      uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,
                                                               0x7ffc3eba718e,0x7ffc3eba606c,
                                                               0x7ffc3ebaea34,0x7ffc3eba6456,0,0);
                                      if ((lVar5 != 0) &&
                                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,
                                                                            uRam00007ffc3ebc0a00),
                                         pvVar4 != (void *)0x0)) {
                                        _DAT_7ffc3ebc0cb8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                      }
                                    }
                                    pvVar4 = _DAT_7ffc3ebc0cb8;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      pvVar6 = (*(*env)->NewObjectArray)
                                                         (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,
                                                                        0x1a3acaad5e7338ae);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar7);
                                      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                        uRam00007ffc3ebc0918,uVar14)
                                      ;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar7);
                                      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,
                                                                        uRam00007ffc3ebc0a40,pvVar6)
                                      ;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        if (_DAT_7ffc3ebc0cc0 == (void *)0x0) {
                                          uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                          uStack_68 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar8);
                                          uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                          uVar10 = FUN_7ffc3eb76c30(env,0x27);
                                          uStack_60 = FUN_7ffc3eb770c0(env,uVar8,5,uVar10,
                                                                       0x7ffc3ebabc78,0x7ffc3ebb0912
                                                                      );
                                          uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                          uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar8);
                                          uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7587,
                                                                   0x7ffc3eba75aa,0x7ffc3eba75b6,
                                                                   0x7ffc3eba7735,0x7ffc3ebb0929,
                                                                   &uStack_68,3);
                                          if ((lVar5 != 0) &&
                                             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,
                                                                                uRam00007ffc3ebc0a00
                                                                               ),
                                             pvVar6 != (void *)0x0)) {
                                            _DAT_7ffc3ebc0cc0 = (*(*env)->NewGlobalRef)(env,pvVar6);
                                          }
                                        }
                                        pvVar6 = _DAT_7ffc3ebc0cc0;
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          pvVar7 = (*(*env)->NewObjectArray)
                                                             (env,3,pvRam00007ffc3ebc09e0,
                                                              (void *)0x0);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvStack_50);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
                                          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958
                                                                            ,uRam00007ffc3ebc0918,
                                                                            uVar14 ^ 0x71512124995e)
                                          ;
                                          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
                                          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,
                                                                            uRam00007ffc3ebc0a40,
                                                                            pvVar7);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            pvVar6 = (*(*env)->NewObjectArray)
                                                               (env,2,pvRam00007ffc3ebc09e0,
                                                                (void *)0x0);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 == 0) {
                                              if (pvVar6 == (void *)0x0) goto LAB_7ffc3eaf2223;
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar6 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                              }
                                              if (iVar2 < 2) goto LAB_7ffc3eaf2239;
                                              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
                                              lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                                              if (lVar5 != 0) {
                                                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar5,uVar14 ^ 0x46493d2b37e2
                                                  );
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 == 0) {
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar6 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                                  }
                                                  if (iVar2 < 1) goto LAB_7ffc3eaf2239;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar6,0,pvVar3);
                                                  if (_DAT_7ffc3ebc0cc8 == (void *)0x0) {
                                                    uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                    lVar11 = FUN_7ffc3eb77170(env,uVar8,6,
                                                                              0x7ffc3ebb08c1,
                                                                              0x7ffc3eba718e,
                                                                              0x7ffc3eba606c,
                                                                              0x7ffc3eba6371,
                                                                              0x7ffc3eba626f,0,0);
                                                    if ((lVar11 != 0) &&
                                                       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar11
                                                                                          ,
                                                  uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc0cc8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar3);
                                                  }
                                                  }
                                                  pvVar3 = _DAT_7ffc3ebc0cc8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,4,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar4);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,1,pvVar6);
                                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1a0e0bbabf42e6fc);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar4);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,3,pvVar4);
                                                  FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,
                                                                   pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) goto LAB_7ffc3eaf244f;
                                                  if (_DAT_7ffc3ebc0cd0 == (void *)0x0) {
                                                    uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                    lVar11 = FUN_7ffc3eb77170(env,uVar8,6,
                                                                              0x7ffc3ebb08c1,
                                                                              0x7ffc3eba718e,
                                                                              0x7ffc3eba606c,
                                                                              0x7ffc3ebaea34,
                                                                              0x7ffc3eba6456,0,0);
                                                    if ((lVar11 != 0) &&
                                                       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar11
                                                                                          ,
                                                  uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc0cd0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar3);
                                                  }
                                                  }
                                                  pvVar3 = _DAT_7ffc3ebc0cd0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar4 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1a3acaad5e7338ae);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0,pvVar6);
                                                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,1,pvVar6);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar4);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (_DAT_7ffc3ebc0cd8 == (void *)0x0) {
                                                      uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                      uStack_68 = FUN_7ffc3eb76d30(env,
                                                  0x7ffc3ebaadea,uVar8);
                                                  uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                  uVar10 = FUN_7ffc3eb76c30(env,0x27);
                                                  uStack_60 = FUN_7ffc3eb770c0(env,uVar8,6,uVar10,
                                                                               0x7ffc3eba8477,
                                                                               0x7ffc3ebb0962);
                                                  uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                  uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebb097c,
                                                                               uVar8);
                                                  uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                  lVar11 = FUN_7ffc3eb77170(env,uVar8,6,
                                                                            0x7ffc3eba7587,
                                                                            0x7ffc3eba75aa,
                                                                            0x7ffc3eba75b6,
                                                                            0x7ffc3ebaae39,
                                                                            0x7ffc3ebb0995,
                                                                            &uStack_68,3);
                                                  if ((lVar11 != 0) &&
                                                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar11,
                                                                                                                                                                                
                                                  uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc0cd8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc0cd8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar6 = (*(*env)->NewObjectArray)
                                                                       (env,1,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar14 ^ 0xc5dfbb31924);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar6,0,pvVar7);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar6);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar6 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (pvVar6 == (void *)0x0) {
LAB_7ffc3eaf2223:
                                                        pJVar13 = *env;
                                                        arg2 = &DAT_7ffc3eba6000;
                                                        pvVar3 = pvRam00007ffc3ebc0a70;
                                                      }
                                                      else {
                                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                                          iVar2 = *(int *)(*(longlong *)
                                                                            ((ulonglong)pvVar6 &
                                                                            0xfffffffffffffffc) +
                                                                          (ulonglong)
                                                                          uRam00007ffc3ebc08e8);
                                                        }
                                                        else {
                                                          iVar2 = (*(*env)->GetArrayLength)
                                                                            (env,pvVar6);
                                                        }
                                                        if (1 < iVar2) {
                                                          (*(*env)->SetObjectArrayElement)
                                                                    (env,pvVar6,1,pvVar4);
                                                          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar5,uVar14 ^ 0xe71f11368ae)
                                                  ;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
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
                                                    if (iVar2 < 1) goto LAB_7ffc3eaf2239;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar6,0,pvVar4);
                                                    if (_DAT_7ffc3ebc0ce0 == (void *)0x0) {
                                                      uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                      lVar11 = FUN_7ffc3eb77170(env,uVar8,6,
                                                                                0x7ffc3ebb08c1,
                                                                                0x7ffc3eba718e,
                                                                                0x7ffc3eba606c,
                                                                                0x7ffc3eba6371,
                                                                                0x7ffc3eba626f,0,0);
                                                      if ((lVar11 != 0) &&
                                                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar11,uRam00007ffc3ebc0a00),
                                                  pvVar4 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc0ce0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc0ce0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,4,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar3);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,1,pvVar6);
                                                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1a096da944e7c330);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar3);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,3,pvVar3);
                                                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,
                                                                   pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) goto LAB_7ffc3eaf244f;
                                                  if (_DAT_7ffc3ebc0ce8 == (void *)0x0) {
                                                    uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                    lVar11 = FUN_7ffc3eb77170(env,uVar8,6,
                                                                              0x7ffc3ebb08c1,
                                                                              0x7ffc3eba718e,
                                                                              0x7ffc3eba606c,
                                                                              0x7ffc3ebaea34,
                                                                              0x7ffc3eba6456,0,0);
                                                    if ((lVar11 != 0) &&
                                                       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar11
                                                                                          ,
                                                  uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc0ce8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar3);
                                                  }
                                                  }
                                                  pvVar3 = _DAT_7ffc3ebc0ce8;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar4 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1a3acaad5e7338ae);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,0,pvVar6);
                                                  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar4,1,pvVar6);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar4);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar4 = (*(*env)->NewObjectArray)
                                                                       (env,1,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar5,uVar14 ^ 0x249a7a66b43)
                                                  ;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (pvVar4 == (void *)0x0)
                                                    goto LAB_7ffc3eaf2223;
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
                                                    if (iVar2 < 1) goto LAB_7ffc3eaf2239;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0,pvVar6);
                                                    if (_DAT_7ffc3ebc0cf0 == (void *)0x0) {
                                                      uVar8 = FUN_7ffc3eb76c30(env,0x27);
                                                      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,
                                                                               0x7ffc3ebb08c1,
                                                                               0x7ffc3eba718e,
                                                                               0x7ffc3eba606c,
                                                                               0x7ffc3eba6371,
                                                                               0x7ffc3eba626f,0,0);
                                                      if ((lVar5 != 0) &&
                                                         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar5,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc0cf0 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar6);
                                                  }
                                                  }
                                                  pvVar6 = _DAT_7ffc3ebc0cf0;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,4,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar3);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,1,pvVar4);
                                                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1a0e75e2f747293e);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar3);
                                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,3,pvVar3);
                                                  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,
                                                                   pvVar7);
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
                                                  goto LAB_7ffc3eaf2257;
                                                  }
LAB_7ffc3eaf2239:
                                                  pJVar13 = *env;
                                                  arg2 = (char *)0x7ffc3eba6019;
                                                  pvVar3 = pvRam00007ffc3ebc0a98;
                                                  }
                                                  (*pJVar13->ThrowNew)(env,pvVar3,arg2);
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3eaf2257;
                    }
                  }
                }
              }
            }
          }
LAB_7ffc3eaf244f:
          pJVar13 = *env;
        }
        pvVar3 = (*pJVar13->ExceptionOccurred)(env);
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
        goto joined_r0x7ffc3eaf2285;
      }
      goto LAB_7ffc3eaf2257;
    }
  }
  pvVar3 = (*pJVar13->ExceptionOccurred)(env);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,8);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
joined_r0x7ffc3eaf2285:
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    if (_DAT_7ffc3ebc0cf8 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6371,0x7ffc3eba743f,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc0cf8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc0cf8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1a319fb011cc051a);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
      (*(*env)->ExceptionCheck)(env);
    }
  }
  return;
}

/* JNI_dev_krypton_2_8_2 | RVA 0x322690 | dev/krypton/2.8([Ljava/lang/Object;)Ldev/krypton/6; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_8_2(JNINativeInterface_ **env,void *receiver,void *arg0)

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
      goto LAB_7ffc3eaf2718;
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
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
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
        if (_DAT_7ffc3ebc7828 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x27);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba7f15,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7828 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7828;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x623e1c969adf5f04);
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
      goto LAB_7ffc3eaf2718;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaf2718:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_3_3 | RVA 0x322a00 | dev/krypton/2.3([Ljava/lang/Object;)Ldev/krypton/02; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_3_3(JNINativeInterface_ **env,void *receiver,void *arg0)

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
      goto LAB_7ffc3eaf2a88;
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
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
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
        if (_DAT_7ffc3ebc7830 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x27);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3ebabd95,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7830 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7830;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x23e98093a8722904);
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
      goto LAB_7ffc3eaf2a88;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaf2a88:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_8_4 | RVA 0x322d70 | dev/krypton/2.8([Ljava/lang/Object;)Ldev/krypton/4w; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_8_4(JNINativeInterface_ **env,void *receiver,void *arg0)

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
      goto LAB_7ffc3eaf2df8;
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
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
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
        if (_DAT_7ffc3ebc7840 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x27);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3ebb09b6,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7840 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7840;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xdd7ac2c47afdec34);
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
      goto LAB_7ffc3eaf2df8;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaf2df8:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_5_5 | RVA 0x3230e0 | dev/krypton/2.5([Ljava/lang/Object;)Ldev/krypton/9M; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_5_5(JNINativeInterface_ **env,void *receiver,void *arg0)

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
      goto LAB_7ffc3eaf3168;
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
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar3 == (void *)0x0) {
          return (void *)0x0;
        }
        pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
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
        if (_DAT_7ffc3ebc7838 == (void *)0x0) {
          uVar10 = FUN_7ffc3eb76c30(env,0x27);
          lVar5 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba7eee,0,0);
          if ((lVar5 != 0) &&
             (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar3 != (void *)0x0)) {
            _DAT_7ffc3ebc7838 = (*(*env)->NewGlobalRef)(env,pvVar3);
          }
        }
        pvVar3 = _DAT_7ffc3ebc7838;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xedfaacb1497f1d80);
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
      goto LAB_7ffc3eaf3168;
    }
  }
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaf3168:
  (*pJVar4->ThrowNew)(env,pvVar3,arg2);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_3_6 | RVA 0x323450 | dev/krypton/2.3(JLjava/lang/Throwable;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_3_6(JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1)

{
  byte bVar1;
  undefined4 uVar2;
  void *pvVar3;
  void *pvVar4;
  void *pvVar5;
  void *pvVar6;
  undefined8 uVar7;
  longlong lVar8;
  ulonglong uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 != (void *)0x0) {
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
    if (pvVar4 != (void *)0x0) {
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar9 = *(ulonglong *)
                 (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                 (longlong)*(int *)((longlong)pvVar4 + 0x10));
      }
      else {
        uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc5c78 == (void *)0x0) {
          lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3ebae34f,0x7ffc3eba74f4,0,0);
          if (lVar8 != 0) {
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00);
            if (pvVar3 != (void *)0x0) {
              _DAT_7ffc3ebc5c78 = (*(*env)->NewGlobalRef)(env,pvVar3);
            }
          }
        }
        pvVar3 = _DAT_7ffc3ebc5c78;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar9 = uVar9 ^ arg0;
          pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x815a0e35031d49fd);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (_DAT_7ffc3ebc5c80 == (void *)0x0) {
              lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3ebade6f,0x7ffc3eba647c,0,0);
              if (lVar8 != 0) {
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00);
                if (pvVar4 != (void *)0x0) {
                  _DAT_7ffc3ebc5c80 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
            }
            pvVar4 = _DAT_7ffc3ebc5c80;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x47ab
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar9 ^ 0x2e03923250143bc6);
              (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
              uVar7 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                uVar2 = FUN_7ffc3e7d8be0(env,uVar7,uRam00007ffc3ebc09d0);
                if (_DAT_7ffc3ebc5c88 == (void *)0x0) {
                  lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                           0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba7293,0,0);
                  if (lVar8 != 0) {
                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00);
                    if (pvVar4 != (void *)0x0) {
                      _DAT_7ffc3ebc5c88 = (*(*env)->NewGlobalRef)(env,pvVar4);
                    }
                  }
                }
                pvVar4 = _DAT_7ffc3ebc5c88;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                    uVar2);
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x815c115cbaf123d8);
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar3);
                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar9);
                  (*(*env)->SetObjectArrayElement)(env,pvVar5,3,pvVar3);
                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x28);
                    if (pvVar3 != (void *)0x0) {
                      pvVar4 = (*(*env)->AllocObject)(env,pvVar3);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (pvVar4 == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eaf3c99. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                          return;
                        }
                        lVar8 = FUN_7ffc3eb76c90(env,pvVar3,0x66);
                        if (lVar8 != 0) {
                          FUN_7ffc3e7dbbc0(env,pvVar4,pvVar3,lVar8);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x29);
                            pvVar3 = (*(*env)->NewObjectArray)(env,0,pvVar3,(void *)0x0);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              if (_DAT_7ffc3ebc5c90 == (void *)0x0) {
                                lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,
                                                         0x7ffc3eba718e,0x7ffc3eba606c,
                                                         0x7ffc3eba6371,0x7ffc3eba626f,0,0);
                                if (lVar8 != 0) {
                                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00);
                                  if (pvVar5 != (void *)0x0) {
                                    _DAT_7ffc3ebc5c90 = (*(*env)->NewGlobalRef)(env,pvVar5);
                                  }
                                }
                              }
                              pvVar5 = _DAT_7ffc3ebc5c90;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar6 = (*(*env)->NewObjectArray)
                                                   (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar4);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
                                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,
                                                                  0x81692c8f79e4240b);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
                                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                  uRam00007ffc3ebc0918,uVar9);
                                (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar3);
                                FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eaf3bcb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                  (*(*env)->Throw)(env,pvVar4);
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
  return;
}

/* JNI_dev_krypton_2_2_7 | RVA 0x323ca0 | dev/krypton/2.2(Ljava/lang/String;J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_2_7(JNINativeInterface_ **env,void *receiver,void *arg0,longlong arg1)

{
  byte bVar1;
  undefined4 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  longlong lVar8;
  void *pvVar9;
  void *pvVar10;
  undefined8 uVar11;
  void *pvVar12;
  longlong lVar13;
  undefined8 uVar14;
  longlong lVar15;
  JNINativeInterface_ *pJVar16;
  ulonglong uVar17;
  char *arg2;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xa0);
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
  uVar6 = uVar6 ^ arg1;
  pvVar4 = (void *)FUN_7ffc3eaf5930(env);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x51);
    pJVar16 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3eaf5754;
    pvVar7 = (*pJVar16->AllocObject)(env,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      if (pvVar7 == (void *)0x0) {
LAB_7ffc3eaf5734:
        pJVar16 = *env;
        arg2 = &DAT_7ffc3eba6000;
        pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eaf5748:
        (*pJVar16->ThrowNew)(env,pvVar4,arg2);
      }
      else {
        lVar8 = FUN_7ffc3eb76c90(env,pvVar5,0x121);
        if (lVar8 != 0) {
          FUN_7ffc3e7dbbc0(env,pvVar7,pvVar5,lVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar5 = (void *)FUN_7ffc3eaf5f90(env);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc3010 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,0x27);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb08c1,0x7ffc3eba6478,0x7ffc3eba606c,
                                         0x7ffc3ebade6f,0x7ffc3eba647c,0,0);
                if ((lVar8 != 0) &&
                   (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar12 != (void *)0x0)) {
                  _DAT_7ffc3ebc3010 = (*(*env)->NewGlobalRef)(env,pvVar12);
                }
              }
              pvVar12 = _DAT_7ffc3ebc3010;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar9 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   0x305d);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar10);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar6 ^ 0x4c472468f2b4c56);
                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar10);
                uVar11 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar9);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  uVar2 = FUN_7ffc3e7d8be0(env,uVar11,uRam00007ffc3ebc09d0);
                  pvVar12 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if ((bVar1 == 0) &&
                     (lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar8 != 0)) {
                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,
                                                      uVar6 ^ 0x453f3575c422);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (pvVar12 == (void *)0x0) goto LAB_7ffc3eaf5734;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                      }
                      if (iVar3 < 3) goto LAB_7ffc3eaf571a;
                      (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar9);
                      lVar13 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
                      if (lVar13 != 0) {
                        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar13,uVar2);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar12 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                          }
                          if (1 < iVar3) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar9);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar3 = *(int *)(*(longlong *)
                                                ((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                            }
                            if (0 < iVar3) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar5);
                              if (_DAT_7ffc3ebc3018 == (void *)0x0) {
                                uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                lVar15 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb08c1,0x7ffc3eba718e
                                                          ,0x7ffc3eba606c,0x7ffc3eba6371,
                                                          0x7ffc3eba626f,0,0);
                                if ((lVar15 != 0) &&
                                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar15,
                                                                      uRam00007ffc3ebc0a00),
                                   pvVar5 != (void *)0x0)) {
                                  _DAT_7ffc3ebc3018 = (*(*env)->NewGlobalRef)(env,pvVar5);
                                }
                              }
                              pvVar5 = _DAT_7ffc3ebc3018;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
                                pvVar9 = (*(*env)->NewObjectArray)
                                                   (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar7);
                                (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar12);
                                pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,
                                                                   0x112a15715c9a246);
                                (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar12);
                                pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                   uRam00007ffc3ebc0918,uVar6);
                                (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar12);
                                FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (_DAT_7ffc3ebc3020 == (void *)0x0) {
                                    uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                    lVar15 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb08c1,
                                                              0x7ffc3eba718e,0x7ffc3eba606c,
                                                              0x7ffc3ebaea34,0x7ffc3eba6456,0,0);
                                    if ((lVar15 != 0) &&
                                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar15,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar5 != (void *)0x0)) {
                                      _DAT_7ffc3ebc3020 = (*(*env)->NewGlobalRef)(env,pvVar5);
                                    }
                                  }
                                  pvVar5 = _DAT_7ffc3ebc3020;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    pvVar12 = (*(*env)->NewObjectArray)
                                                        (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x12cbdd6ade923b8);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar9);
                                    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar6);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar9);
                                    pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,
                                                                      uRam00007ffc3ebc0a40,pvVar12);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      if (_DAT_7ffc3ebc3028 == (void *)0x0) {
                                        uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                        uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3ebaadea,uVar11);
                                        uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                        uVar14 = FUN_7ffc3eb76c30(env,0x27);
                                        uStack_50 = FUN_7ffc3eb770c0(env,uVar11,5,uVar14,
                                                                     0x7ffc3eba7733,0x7ffc3ebb09dd);
                                        uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                        uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3ebaeeb4,uVar11);
                                        uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                        lVar15 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3eba7587,
                                                                  0x7ffc3eba75aa,0x7ffc3eba75b6,
                                                                  0x7ffc3ebaae39,0x7ffc3ebb0a0e,
                                                                  &uStack_58,3);
                                        if ((lVar15 != 0) &&
                                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar15,
                                                                               uRam00007ffc3ebc0a00)
                                           , pvVar12 != (void *)0x0)) {
                                          _DAT_7ffc3ebc3028 = (*(*env)->NewGlobalRef)(env,pvVar12);
                                        }
                                      }
                                      pvVar12 = _DAT_7ffc3ebc3028;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        uVar17 = uVar6 ^ 0x24110a95a42f;
                                        pvVar9 = (*(*env)->NewObjectArray)
                                                           (env,7,pvRam00007ffc3ebc09e0,(void *)0x0)
                                        ;
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,0,receiver);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar7);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                          uRam00007ffc3ebc0998,
                                                                          uVar17 >> 0x20);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar7);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,3,arg0);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09b0,
                                                                          uRam00007ffc3ebc0930,
                                                                          (int)uVar17 >> 0x10);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,4,pvVar7);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a28,
                                                                          uRam00007ffc3ebc0908,
                                                                          uVar17 & 0xffff);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,5,pvVar7);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar9,6,pvVar4);
                                        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,
                                                                          uRam00007ffc3ebc0a40,
                                                                          pvVar9);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          pvVar12 = (*(*env)->NewObjectArray)
                                                              (env,2,pvRam00007ffc3ebc09e0,
                                                               (void *)0x0);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            if (pvVar12 == (void *)0x0) goto LAB_7ffc3eaf5734;
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar3 = *(int *)(*(longlong *)
                                                                ((ulonglong)pvVar12 &
                                                                0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                            }
                                            if (iVar3 < 2) goto LAB_7ffc3eaf571a;
                                            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar7);
                                            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x15c8f2fd9f68)
                                            ;
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 == 0) {
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar3 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar12 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                              }
                                              if (iVar3 < 1) goto LAB_7ffc3eaf571a;
                                              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7)
                                              ;
                                              if (_DAT_7ffc3ebc3030 == (void *)0x0) {
                                                uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                                lVar15 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                          0x7ffc3ebb08c1,
                                                                          0x7ffc3eba718e,
                                                                          0x7ffc3eba606c,
                                                                          0x7ffc3eba6371,
                                                                          0x7ffc3eba626f,0,0);
                                                if ((lVar15 != 0) &&
                                                   (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar15,
                                                                                                                                                                            
                                                  uRam00007ffc3ebc0a00), pvVar7 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3030 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar7);
                                                }
                                              }
                                              pvVar7 = _DAT_7ffc3ebc3030;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 == 0) {
                                                pvVar9 = (*(*env)->NewObjectArray)
                                                                   (env,4,pvRam00007ffc3ebc09e0,
                                                                    (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar9,0,pvVar5);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar9,1,pvVar12);
                                                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x11f59ce06cdf109);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar9,2,pvVar5);
                                                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar9,3,pvVar5);
                                                FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,
                                                                 pvVar9);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 == 0) {
                                                  if (_DAT_7ffc3ebc3038 == (void *)0x0) {
                                                    uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                                    lVar15 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                              0x7ffc3ebb08c1,
                                                                              0x7ffc3eba6478,
                                                                              0x7ffc3eba606c,
                                                                              0x7ffc3ebade6f,
                                                                              0x7ffc3eba647c,0,0);
                                                    if ((lVar15 != 0) &&
                                                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar15
                                                                                          ,
                                                  uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3038 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar5);
                                                  }
                                                  }
                                                  pvVar5 = _DAT_7ffc3ebc3038;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x49f7);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,0,pvVar12);
                                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar6 ^ 0x5be7f0bd5f2b5fd);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar12);
                                                  uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,
                                                                            uRam00007ffc3ebc0a40,
                                                                            pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    uVar2 = FUN_7ffc3e7d8be0(env,uVar11,
                                                                             uRam00007ffc3ebc09d0);
                                                    pvVar5 = (void *)FUN_7ffc3eb76c30(env,10);
                                                    pvVar5 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvVar5,(void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      pvVar7 = (void *)FUN_7ffc3eaf6060(env,arg0);
                                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                                      if (bVar1 == 0) {
                                                        if (pvVar5 == (void *)0x0)
                                                        goto LAB_7ffc3eaf5734;
                                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                                          iVar3 = *(int *)(*(longlong *)
                                                                            ((ulonglong)pvVar5 &
                                                                            0xfffffffffffffffc) +
                                                                          (ulonglong)
                                                                          uRam00007ffc3ebc08e8);
                                                        }
                                                        else {
                                                          iVar3 = (*(*env)->GetArrayLength)
                                                                            (env,pvVar5);
                                                        }
                                                        if (iVar3 < 1) goto LAB_7ffc3eaf571a;
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar5,0,pvVar7);
                                                        pvVar4 = (void *)FUN_7ffc3eaf6060(env,pvVar4
                                                                                         );
                                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                                        if (bVar1 == 0) {
                                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                                            iVar3 = *(int *)(*(longlong *)
                                                                              ((ulonglong)pvVar5 &
                                                                              0xfffffffffffffffc) +
                                                                            (ulonglong)
                                                                            uRam00007ffc3ebc08e8);
                                                          }
                                                          else {
                                                            iVar3 = (*(*env)->GetArrayLength)
                                                                              (env,pvVar5);
                                                          }
                                                          if (iVar3 < 2) goto LAB_7ffc3eaf571a;
                                                          (*(*env)->SetObjectArrayElement)
                                                                    (env,pvVar5,1,pvVar4);
                                                          if (_DAT_7ffc3ebc3040 == (void *)0x0) {
                                                            uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                                            lVar15 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                                      0x7ffc3ebb08c1
                                                                                      ,
                                                  0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3ebaea34,
                                                  0x7ffc3eba6482,0,0);
                                                  if ((lVar15 != 0) &&
                                                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar15,
                                                                                                                                                                                
                                                  uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3040 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc3040;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x11116b4db8ea836);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,0,pvVar12);
                                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar12);
                                                  uVar11 = FUN_7ffc3e7d1a50(env,pvVar4,
                                                                            uRam00007ffc3ebc0a40,
                                                                            pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar4 = (void *)FUN_7ffc3eaf6060(env,uVar11);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar3 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar5 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar3 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar5);
                                                      }
                                                      if (iVar3 < 3) goto LAB_7ffc3eaf571a;
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar5,2,pvVar4);
                                                      pvVar4 = (*(*env)->NewObjectArray)
                                                                         (env,3,
                                                  pvRam00007ffc3ebc09e0,(void *)0x0);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x2cb087476357)
                                                  ;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (pvVar4 == (void *)0x0)
                                                    goto LAB_7ffc3eaf5734;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar3 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (2 < iVar3) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,2,pvVar7);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar3 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar4 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar3 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar4);
                                                      }
                                                      if (1 < iVar3) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,1,pvVar5);
                                                        pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,lVar13,uVar2);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar3 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar4 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
                                                    }
                                                    if (iVar3 < 1) goto LAB_7ffc3eaf571a;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0,pvVar5);
                                                    if (_DAT_7ffc3ebc3048 == (void *)0x0) {
                                                      uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                                      lVar13 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                                0x7ffc3ebb08c1,
                                                                                0x7ffc3eba718e,
                                                                                0x7ffc3eba606c,
                                                                                0x7ffc3ebae34f,
                                                                                0x7ffc3eba645f,0,0);
                                                      if ((lVar13 != 0) &&
                                                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar13,uRam00007ffc3ebc0a00),
                                                  pvVar5 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3048 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar5);
                                                  }
                                                  }
                                                  pvVar5 = _DAT_7ffc3ebc3048;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,3,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar4);
                                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1164833e9b28b7f);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar4);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,2,pvVar4);
                                                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (_DAT_7ffc3ebc3050 == (void *)0x0) {
                                                      uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                                      lVar13 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                                0x7ffc3ebb08c1,
                                                                                0x7ffc3eba718e,
                                                                                0x7ffc3eba606c,
                                                                                0x7ffc3ebaea34,
                                                                                0x7ffc3eba6456,0,0);
                                                      if ((lVar13 != 0) &&
                                                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar13,uRam00007ffc3ebc0a00),
                                                  pvVar5 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3050 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar5);
                                                  }
                                                  }
                                                  pvVar5 = _DAT_7ffc3ebc3050;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x12cbdd6ade923b8);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,0,pvVar12);
                                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar7,1,pvVar12);
                                                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,
                                                                                                                                                                        
                                                  uRam00007ffc3ebc0a40,pvVar7);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar7 = (*(*env)->NewObjectArray)
                                                                       (env,2,pvRam00007ffc3ebc09e0,
                                                                        (void *)0x0);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 == 0) {
                                                      if (pvVar7 == (void *)0x0)
                                                      goto LAB_7ffc3eaf5734;
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar3 = *(int *)(*(longlong *)
                                                                          ((ulonglong)pvVar7 &
                                                                          0xfffffffffffffffc) +
                                                                        (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                      }
                                                      else {
                                                        iVar3 = (*(*env)->GetArrayLength)
                                                                          (env,pvVar7);
                                                      }
                                                      if (iVar3 < 2) goto LAB_7ffc3eaf571a;
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar7,1,pvVar4);
                                                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x78002428d2fb)
                                                  ;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar3 = *(int *)(*(longlong *)
                                                                        ((ulonglong)pvVar7 &
                                                                        0xfffffffffffffffc) +
                                                                      (ulonglong)
                                                                      uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
                                                    }
                                                    if (iVar3 < 1) goto LAB_7ffc3eaf571a;
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar7,0,pvVar4);
                                                    if (_DAT_7ffc3ebc3058 == (void *)0x0) {
                                                      uVar11 = FUN_7ffc3eb76c30(env,0x27);
                                                      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,
                                                                               0x7ffc3ebb08c1,
                                                                               0x7ffc3eba718e,
                                                                               0x7ffc3eba606c,
                                                                               0x7ffc3eba6371,
                                                                               0x7ffc3eba626f,0,0);
                                                      if ((lVar8 != 0) &&
                                                         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,
                                                  lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
                                                  )) {
                                                    _DAT_7ffc3ebc3058 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar4);
                                                  }
                                                  }
                                                  pvVar4 = _DAT_7ffc3ebc3058;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 == 0) {
                                                    pvVar12 = (*(*env)->NewObjectArray)
                                                                        (env,4,pvRam00007ffc3ebc09e0
                                                                         ,(void *)0x0);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar12,0,pvVar5);
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar12,1,pvVar7);
                                                    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1192dea309d61af);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar12,2,pvVar5);
                                                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar12,3,pvVar5);
                                                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,
                                                                   pvVar12);
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
                                                  goto LAB_7ffc3eaf574e;
                                                  }
                                                  }
                                                  goto LAB_7ffc3eaf571a;
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              goto LAB_7ffc3eaf574e;
                            }
                          }
LAB_7ffc3eaf571a:
                          pJVar16 = *env;
                          arg2 = (char *)0x7ffc3eba6019;
                          pvVar4 = pvRam00007ffc3ebc0a98;
                          goto LAB_7ffc3eaf5748;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eaf574e:
  pJVar16 = *env;
LAB_7ffc3eaf5754:
  pvVar4 = (*pJVar16->ExceptionOccurred)(env);
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x66);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    if (_DAT_7ffc3ebc3060 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x27);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6371,0x7ffc3eba743f,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc3060 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc3060;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x12583a9347650a6);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
      FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
      (*(*env)->ExceptionCheck)(env);
    }
  }
  return;
}

/* JNI_dev_krypton_2_4_8 | RVA 0x326300 | dev/krypton/2.4(L3X;ILjava/lang/String;SCLjava/lang/String;[B)V | unresolved */
/* No successful pseudocode: consult coverage.tsv and the disassembly. */

/* JNI_dev_krypton_2_4_9 | RVA 0x33cdf0 | dev/krypton/2.4(Ljava/lang/String;Ljava/lang/String;J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_4_9
               (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,longlong arg2)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  JNINativeInterface_ *pJVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *pcVar12;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc7af0 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x27);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7f15,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc7af0 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc7af0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar11 ^ arg2;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xcf8374762a95f2b9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar7 == 0))
    goto LAB_7ffc3eb0db07;
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,1);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    if (pvVar4 == (void *)0x0) {
      pJVar10 = *env;
      pcVar12 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb0db01:
      (*pJVar10->ThrowNew)(env,pvVar3,pcVar12);
      goto LAB_7ffc3eb0db07;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 4) goto LAB_7ffc3eb0dad3;
    (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 3) goto LAB_7ffc3eb0dad3;
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar7 == 0) goto LAB_7ffc3eb0db07;
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar11 ^ 0x3a563f7da7c7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 2) {
LAB_7ffc3eb0dad3:
      pJVar10 = *env;
      pcVar12 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb0db01;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 1) goto LAB_7ffc3eb0dad3;
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg0);
    if (_DAT_7ffc3ebc7af8 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x27);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6371,0x7ffc3eba626f,0,0);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc7af8 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc7af8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xcfbc0c67e85cc18a);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
    FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    if (_DAT_7ffc3ebc7b00 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x27);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar7 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc7b00 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc7b00;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xcfb5e6900a3be72e);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0db07;
    if (lVar5 == 0) {
LAB_7ffc3eb0d513:
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar11 ^ 0x5120fbaa7bc5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar12 = &DAT_7ffc3eba6000;
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
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg1);
            if (_DAT_7ffc3ebc7b10 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x27);
              lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba6371,0x7ffc3eba626f,0,0);
              if ((lVar5 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc7b10 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc7b10;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xcfbcef8d18c8e4fc);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0da1f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar12 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0dcab. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,pcVar12);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc7b08 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc7b08 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc7b08;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xcfb5e6900a3be72e);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb0d513;
    }
  }
  else {
LAB_7ffc3eb0db07:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb0dbb0;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb0dbb0:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0dc5f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_0_10 | RVA 0x33dcc0 | dev/krypton/2.0(JLjava/lang/String;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_0_10(JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1_00;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2ff8 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2ff8 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2ff8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg0;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x308be9e6b9071810);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0e40b;
    if (lVar5 == 0) {
LAB_7ffc3eb0e066:
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x294ea712983c);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg1);
            if (_DAT_7ffc3ebc3008 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x27);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba6371,0x7ffc3eba626f,0,0);
              if ((lVar5 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc3008 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc3008;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x308636c55002478f);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1_00);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0e357. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0e5af. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc3000 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc3000 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc3000;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x308be9e6b9071810);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb0e066;
    }
  }
  else {
LAB_7ffc3eb0e40b:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb0e4b4;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb0e4b4:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0e563. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_8_11 | RVA 0x33e5c0 | dev/krypton/2.8(IBILjava/lang/String;Z)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_8_11
               (JNINativeInterface_ **env,void *receiver,int arg0,byte arg1,int arg2,void *arg3,
               byte arg4)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  JNINativeInterface_ *pJVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *pcVar12;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc5c98 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x27);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7f15,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc5c98 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc5c98;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar11 ^ ((ulonglong)(arg2 & 0xffffff) | (ulonglong)CONCAT41(arg0,arg1) << 0x18);
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x12975f57c1782fad);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar7 == 0))
    goto LAB_7ffc3eb0f2a1;
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,1);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    if (pvVar4 == (void *)0x0) {
      pJVar10 = *env;
      pcVar12 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb0f29b:
      (*pJVar10->ThrowNew)(env,pvVar3,pcVar12);
      goto LAB_7ffc3eb0f2a1;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 4) goto LAB_7ffc3eb0f26d;
    (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,arg4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 3) goto LAB_7ffc3eb0f26d;
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar7 == 0) goto LAB_7ffc3eb0f2a1;
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar11 ^ 0x1177d4907ad3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 2) {
LAB_7ffc3eb0f26d:
      pJVar10 = *env;
      pcVar12 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb0f29b;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 1) goto LAB_7ffc3eb0f26d;
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg3);
    if (_DAT_7ffc3ebc5ca0 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x27);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba6371,0x7ffc3eba626f,0,0);
      if ((lVar7 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0))
      {
        _DAT_7ffc3ebc5ca0 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc5ca0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x12a8274603b11c9e);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
    FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    if (_DAT_7ffc3ebc5ca8 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x27);
      lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar7 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc5ca8 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc5ca8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x12a1cdb1e1d63a3a);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0f2a1;
    if (lVar5 == 0) {
LAB_7ffc3eb0ed08:
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar11 ^ 0x94d6fdbc581);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar12 = &DAT_7ffc3eba6000;
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
          if (_DAT_7ffc3ebc5cb8 == (void *)0x0) {
            uVar9 = FUN_7ffc3eb76c30(env,0x27);
            lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba6371,0x7ffc3eba626f,0,0);
            if ((lVar5 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc5cb8 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc5cb8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x12a2804403c7d3ec);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0f1b9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        pcVar12 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0f445. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,pcVar12);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc5cb0 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc5cb0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc5cb0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x12a1cdb1e1d63a3a);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb0ed08;
    }
  }
  else {
LAB_7ffc3eb0f2a1:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb0f34a;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb0f34a:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0f3f9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_0_12 | RVA 0x33f460 | dev/krypton/2.0(IIZCSI)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_0_12
               (JNINativeInterface_ **env,void *receiver,int arg0,int arg1,byte arg2,ushort arg3,
               short arg4,int arg5)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  void *arg1_00;
  undefined8 uVar7;
  JNINativeInterface_ *pJVar8;
  longlong lVar9;
  ulonglong uVar10;
  char *arg2_00;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar10 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar10 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2488 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar6 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar6 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2488 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2488;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar10 = uVar10 ^ ((ulonglong)(uint)arg5 |
                      (ulonglong)(ushort)arg4 << 0x20 | (ulonglong)arg3 << 0x30);
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x641e9da5714f4c85);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
    lVar6 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb0fce4;
    if (arg0 < 0) {
      return;
    }
    if (lVar6 == 0) {
      return;
    }
    if (_DAT_7ffc3ebc2490 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar6 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2490 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2490;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x641e9da5714f4c85);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar10);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar6 != 0)) {
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,arg2);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (pvVar4 == (void *)0x0) {
              pJVar8 = *env;
              arg2_00 = &DAT_7ffc3eba6000;
              pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb0fdb8:
              (*pJVar8->ThrowNew)(env,pvVar3,arg2_00);
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 < 4) goto LAB_7ffc3eb0fd8a;
              (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar5);
              lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
              if (lVar6 != 0) {
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,arg1);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (iVar2 < 3) {
LAB_7ffc3eb0fd8a:
                    pJVar8 = *env;
                    arg2_00 = (char *)0x7ffc3eba6019;
                    pvVar3 = pvRam00007ffc3ebc0a98;
                    goto LAB_7ffc3eb0fdb8;
                  }
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,arg0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (iVar2 < 2) goto LAB_7ffc3eb0fd8a;
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
                    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
                    if (lVar6 != 0) {
                      pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                        uVar10 ^ 0x3edfd5952764);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                        }
                        if (iVar2 < 1) goto LAB_7ffc3eb0fd8a;
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
                        if (_DAT_7ffc3ebc2498 == (void *)0x0) {
                          uVar7 = FUN_7ffc3eb76c30(env,0x27);
                          lVar6 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                   0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba626f,0,0)
                          ;
                          if ((lVar6 != 0) &&
                             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                             pvVar5 != (void *)0x0)) {
                            _DAT_7ffc3ebc2498 = (*(*env)->NewGlobalRef)(env,pvVar5);
                          }
                        }
                        pvVar5 = _DAT_7ffc3ebc2498;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          arg1_00 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
                          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x642ee5fff9afca2f)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
                          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar10);
                          (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
                          FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,arg1_00);
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
        }
      }
    }
  }
  else {
LAB_7ffc3eb0fce4:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar6 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x14a), lVar9 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar9,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb0fdc7;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb0fdc7:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar6 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar6 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x14a), lVar9 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar9,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb0fe76. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_3_13 | RVA 0x33fe90 | dev/krypton/2.3(JLjava/util/List;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_3_13(JNINativeInterface_ **env,void *receiver,longlong arg0,void *arg1)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1_00;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2e48 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2e48 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2e48;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg0;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xb62ff98b01499eb4);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb105db;
    if (lVar5 == 0) {
LAB_7ffc3eb10236:
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x4a8660b0969b);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg1);
            if (_DAT_7ffc3ebc2e58 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x27);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba6371,0x7ffc3eba626f,0,0);
              if ((lVar5 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc2e58 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc2e58;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xb61b6531584de556);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1_00);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb10527. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb1077f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc2e50 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2e50 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2e50;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xb62ff98b01499eb4);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb10236;
    }
  }
  else {
LAB_7ffc3eb105db:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb10684;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb10684:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb10733. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_1_14 | RVA 0x340790 | dev/krypton/2.1(IJLjava/util/List;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_1_14
               (JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1,void *arg2)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1_00;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2_00;
  ulonglong uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2e80 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2e80 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2e80;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg1;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x6654aa5e0ffc4ecf);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb10f86;
    if (lVar5 == 0) {
LAB_7ffc3eb10b43:
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x5f246219d70c);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2_00 = &DAT_7ffc3eba6000;
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
        if (2 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
          }
          if (1 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,arg2);
            lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
            if (lVar5 == 0) {
              return;
            }
            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar5,arg0);
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
              if (_DAT_7ffc3ebc2e90 == (void *)0x0) {
                uVar7 = FUN_7ffc3eb76c30(env,0x27);
                lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba6371,0x7ffc3eba626f,0,0);
                if ((lVar5 != 0) &&
                   (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                   pvVar6 != (void *)0x0)) {
                  _DAT_7ffc3ebc2e90 = (*(*env)->NewGlobalRef)(env,pvVar6);
                }
              }
              pvVar6 = _DAT_7ffc3ebc2e90;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
              (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x665c8b3d5ffc1850);
              (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
              pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9)
              ;
              (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
              FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1_00);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb10ed2. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(*env)->ExceptionCheck)(env);
              return;
            }
          }
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2_00 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb1112a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2_00);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc2e88 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2e88 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2e88;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x6654aa5e0ffc4ecf);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb10b43;
    }
  }
  else {
LAB_7ffc3eb10f86:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb1102f;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb1102f:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb110de. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_7_15 | RVA 0x341140 | dev/krypton/2.7(Ljava/lang/String;J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_7_15(JNINativeInterface_ **env,void *receiver,void *arg0,longlong arg1)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1_00;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc3098 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc3098 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc3098;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg1;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x7dabf65f49b95530);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb11893;
    if (lVar5 == 0) {
LAB_7ffc3eb114e6:
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,arg0);
          lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
          if (lVar5 == 0) {
            return;
          }
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x76258695fa75);
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
            if (_DAT_7ffc3ebc30a8 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x27);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba6371,0x7ffc3eba626f,0,0);
              if ((lVar5 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc30a8 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc30a8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x7d9cc70777f874a4);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1_00);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb117df. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb11a37. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc30a0 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc30a0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc30a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x7dabf65f49b95530);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb114e6;
    }
  }
  else {
LAB_7ffc3eb11893:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb1193c;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb1193c:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb119eb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_8_16 | RVA 0x341a50 | dev/krypton/2.8(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_8_16(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  longlong lVar6;
  void *pvVar7;
  longlong lVar8;
  void *pvVar9;
  undefined8 uVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  JNINativeInterface_ *pJVar12;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xa0);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
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
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
  if (lVar6 == 0) {
    return;
  }
  uVar11 = uVar11 ^ arg0;
  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x357183e8b849);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar4 == (void *)0x0) {
LAB_7ffc3eb128eb:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (0 < iVar3) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
      if (_DAT_7ffc3ebc0d48 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x27);
        lVar8 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba6371,0x7ffc3eba7f3b,0,0);
        if ((lVar8 != 0) &&
           (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0
           )) {
          _DAT_7ffc3ebc0d48 = (*(*env)->NewGlobalRef)(env,pvVar5);
        }
      }
      pvVar5 = _DAT_7ffc3ebc0d48;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x580dcff2ca84f0ec);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba64b1);
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
      if (lVar8 == 0) {
        return;
      }
      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar8,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar7 == (void *)0x0) goto LAB_7ffc3eb128eb;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
      }
      if (2 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
        pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar11 ^ 0x1ae6d9c02091);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (1 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
          }
          if (0 < iVar3) {
            (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar5);
            if (_DAT_7ffc3ebc0d50 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x27);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba6371,0x7ffc3eba626f,0,0);
              if ((lVar6 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc0d50 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc0d50;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar4);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar7);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x5839985199eb9ac7);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
            FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0d58 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x27);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba647a,0x7ffc3eba621c,0,0);
              if ((lVar6 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc0d58 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc0d58;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x583cd5e59d1af4fa);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            (*(*env)->MonitorEnter)(env,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc0d60 == (void *)0x0) {
              uVar10 = FUN_7ffc3eb76c30(env,0x27);
              lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba6478,0x7ffc3eba606c,
                                       0x7ffc3ebade6f,0x7ffc3eba647c,0,0);
              if ((lVar6 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc0d60 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc0d60;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x7f34
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar9);
              pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar11 ^ 0x7d4fd5189eb45a22);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
              uVar10 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                uVar2 = FUN_7ffc3e7d8be0(env,uVar10,uRam00007ffc3ebc09d0);
                if (_DAT_7ffc3ebc0d68 == (void *)0x0) {
                  uVar10 = FUN_7ffc3eb76c30(env,0x27);
                  lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c
                                           ,0x7ffc3ebaec12,0x7ffc3eba72ac,0,0);
                  if ((lVar6 != 0) &&
                     (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                     pvVar5 != (void *)0x0)) {
                    _DAT_7ffc3ebc0d68 = (*(*env)->NewGlobalRef)(env,pvVar5);
                  }
                }
                pvVar5 = _DAT_7ffc3ebc0d68;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                    uVar2);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x583f59d535f60b94);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
                  pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar11);
                  (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar9);
                  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (_DAT_7ffc3ebc0d70 == (void *)0x0) {
                      uVar10 = FUN_7ffc3eb76c30(env,0x27);
                      lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3eba647a,0x7ffc3eba621c,0,0);
                      if ((lVar6 != 0) &&
                         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                         pvVar5 != (void *)0x0)) {
                        _DAT_7ffc3ebc0d70 = (*(*env)->NewGlobalRef)(env,pvVar5);
                      }
                    }
                    pvVar5 = _DAT_7ffc3ebc0d70;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x583cd5e59d1af4fa);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar9);
                      pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar11);
                      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar9);
                      lVar6 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (lVar6 == 0) {
                          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                        }
                        else {
                          lVar8 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e0,0x14b);
                          if (lVar8 != 0) {
                            FUN_7ffc3e7e1940(env,lVar6,lVar8);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            pJVar12 = *env;
                            if (bVar1 != 0) goto LAB_7ffc3eb12936;
                            (*pJVar12->MonitorExit)(env,pvVar4);
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
            pJVar12 = *env;
LAB_7ffc3eb12936:
            pvVar5 = (*pJVar12->ExceptionOccurred)(env);
            while( true ) {
              (*(*env)->ExceptionClear)(env);
              (*(*env)->MonitorExit)(env,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) break;
              pvVar5 = (*(*env)->ExceptionOccurred)(env);
            }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb12993. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->Throw)(env,pvVar5);
            return;
          }
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb12916. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_2_7_17 | RVA 0x3429a0 | dev/krypton/2.7(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_7_17(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc0d30 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc0d30 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc0d30;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg0;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xab5dfc11868383c6);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb1308a;
    if (lVar5 == 0) {
LAB_7ffc3eb12d3e:
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x1b901a142aa8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
          if (_DAT_7ffc3ebc0d40 == (void *)0x0) {
            uVar7 = FUN_7ffc3eb76c30(env,0x27);
            lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba6371,0x7ffc3eba626f,0,0);
            if ((lVar5 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc0d40 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc0d40;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xab51b903c57ae4f1);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb12fd6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb1322e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc0d38 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc0d38 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc0d38;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xab5dfc11868383c6);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb12d3e;
    }
  }
  else {
LAB_7ffc3eb1308a:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb13133;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb13133:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb131e2. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_6_18 | RVA 0x343240 | dev/krypton/2.6(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_6_18(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc0d18 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc0d18 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc0d18;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg0;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x686eae01d1ee40f5);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb1392a;
    if (lVar5 == 0) {
LAB_7ffc3eb135de:
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x7bdf752cb90f);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
          if (_DAT_7ffc3ebc0d28 == (void *)0x0) {
            uVar7 = FUN_7ffc3eb76c30(env,0x27);
            lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba6371,0x7ffc3eba626f,0,0);
            if ((lVar5 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc0d28 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc0d28;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x6860d4f8fed9657a);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb13876. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb13ace. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc0d20 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc0d20 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc0d20;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x686eae01d1ee40f5);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb135de;
    }
  }
  else {
LAB_7ffc3eb1392a:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb139d3;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb139d3:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb13a82. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_1_19 | RVA 0x343ae0 | dev/krypton/2.1(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_1_19(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc0c70 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc0c70 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc0c70;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg0;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xa780cdad516c8f1b);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb141ca;
    if (lVar5 == 0) {
LAB_7ffc3eb13e7e:
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x493eade64da7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
          if (_DAT_7ffc3ebc0c80 == (void *)0x0) {
            uVar7 = FUN_7ffc3eb76c30(env,0x27);
            lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba6371,0x7ffc3eba626f,0,0);
            if ((lVar5 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc0c80 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc0c80;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xa78bdd7943dc9b9c);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb14116. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb1436e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc0c78 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc0c78 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc0c78;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xa780cdad516c8f1b);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb13e7e;
    }
  }
  else {
LAB_7ffc3eb141ca:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb14273;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb14273:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb14322. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_9_20 | RVA 0x344380 | dev/krypton/2.9(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_9_20(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc0d78 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc0d78 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc0d78;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ arg0;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x7d0acf9826995591);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb14a6a;
    if (lVar5 == 0) {
LAB_7ffc3eb1471e:
      pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x427cb307edb0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
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
          if (_DAT_7ffc3ebc0d88 == (void *)0x0) {
            uVar7 = FUN_7ffc3eb76c30(env,0x27);
            lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba6371,0x7ffc3eba626f,0,0);
            if ((lVar5 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc0d88 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc0d88;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar4);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x7d3905c989492030);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb149b6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb14c0e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc0d80 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc0d80 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc0d80;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x7d0acf9826995591);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb1471e;
    }
  }
  else {
LAB_7ffc3eb14a6a:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb14b13;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb14b13:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb14bc2. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_5_21 | RVA 0x344c20 | dev/krypton/2.5(Ljava/lang/String;IJ)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_5_21
               (JNINativeInterface_ **env,void *receiver,void *arg0,int arg1,longlong arg2)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  longlong lVar7;
  void *arg1_00;
  undefined8 uVar8;
  undefined8 uVar9;
  JNINativeInterface_ *pJVar10;
  ulonglong uVar11;
  char *arg2_00;
  ulonglong uVar12;
  void *pvStack_70;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc30b0 == (void *)0x0) {
    uVar8 = FUN_7ffc3eb76c30(env,0x27);
    lVar7 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7f15,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc30b0 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc30b0;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar11 = uVar11 ^ arg2;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x10797ae589e52d43);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2), lVar7 != 0)) {
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar4 == (void *)0x0) {
            pJVar10 = *env;
            arg2_00 = &DAT_7ffc3eba6000;
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
            if (2 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
              lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
              if (lVar7 == 0) goto LAB_7ffc3eb15a1c;
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,
                                                uVar11 ^ 0x4fce9bac68d7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb15a1c;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (1 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (0 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0,arg0);
                  if (_DAT_7ffc3ebc30b8 == (void *)0x0) {
                    uVar8 = FUN_7ffc3eb76c30(env,0x27);
                    lVar7 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba626f,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar6 != (void *)0x0)) {
                      _DAT_7ffc3ebc30b8 = (*(*env)->NewGlobalRef)(env,pvVar6);
                    }
                  }
                  pvVar6 = _DAT_7ffc3ebc30b8;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
                    (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x107fcd79db87d281);
                    (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar11);
                    (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
                    FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1_00);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (_DAT_7ffc3ebc30c0 == (void *)0x0) {
                        uVar8 = FUN_7ffc3eb76c30(env,0x27);
                        lVar7 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3ebaea34,0x7ffc3eba7e1f,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar3 != (void *)0x0)) {
                          _DAT_7ffc3ebc30c0 = (*(*env)->NewGlobalRef)(env,pvVar3);
                        }
                      }
                      pvVar3 = _DAT_7ffc3ebc30c0;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x104b4dd007986c0f);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
                        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar11);
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
                        pvStack_70 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4
                                                             );
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (lVar5 != 0) {
                            if (pvStack_70 == (void *)0x0) {
                              return;
                            }
                            if (_DAT_7ffc3ebc30c8 == (void *)0x0) {
                              uVar8 = FUN_7ffc3eb76c30(env,0x27);
                              lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                       0x7ffc3eba606c,0x7ffc3ebaea34,0x7ffc3eba7e1f,
                                                       0,0);
                              if ((lVar5 != 0) &&
                                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                                 pvVar3 != (void *)0x0)) {
                                _DAT_7ffc3ebc30c8 = (*(*env)->NewGlobalRef)(env,pvVar3);
                              }
                            }
                            pvVar3 = _DAT_7ffc3ebc30c8;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar4 = (*(*env)->NewObjectArray)
                                               (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x104b4dd007986c0f);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
                            pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar11);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
                            pvStack_70 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,
                                                                  pvVar4);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                          }
                          if (_DAT_7ffc3ebc30d0 == (void *)0x0) {
                            uVar8 = FUN_7ffc3eb76c30(env,0x27);
                            uStack_58 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar8);
                            uVar8 = FUN_7ffc3eb76c30(env,0x27);
                            uVar9 = FUN_7ffc3eb76c30(env,0x27);
                            uStack_50 = FUN_7ffc3eb770c0(env,uVar8,5,uVar9,0x7ffc3eba853f,
                                                         0x7ffc3ebb0da9);
                            uVar8 = FUN_7ffc3eb76c30(env,0x27);
                            uStack_48 = FUN_7ffc3eb76d30(env,0x7ffc3eba772f,uVar8);
                            uVar8 = FUN_7ffc3eb76c30(env,0x27);
                            lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba7587,0x7ffc3eba75aa,
                                                     0x7ffc3eba75b6,0x7ffc3eba7735,0x7ffc3ebb0db1,
                                                     &uStack_58,3);
                            if ((lVar5 != 0) &&
                               (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                               pvVar3 != (void *)0x0)) {
                              _DAT_7ffc3ebc30d0 = (*(*env)->NewGlobalRef)(env,pvVar3);
                            }
                          }
                          pvVar3 = _DAT_7ffc3ebc30d0;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          uVar12 = uVar11 ^ 0x789145e8da06;
                          pvVar4 = (*(*env)->NewObjectArray)
                                             (env,5,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                            uRam00007ffc3ebc0998,uVar12 >> 0x20);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a28,
                                                            uRam00007ffc3ebc0908,
                                                            uVar12 >> 0x10 & 0xffff);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a28,
                                                            uRam00007ffc3ebc0908,uVar12 & 0xffff);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
                          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                            uRam00007ffc3ebc0998,arg1);
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
                          pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          if (_DAT_7ffc3ebc30d8 == (void *)0x0) {
                            uVar8 = FUN_7ffc3eb76c30(env,0x27);
                            lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                     0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba626f,0,
                                                     0);
                            if ((lVar5 != 0) &&
                               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                               pvVar4 != (void *)0x0)) {
                              _DAT_7ffc3ebc30d8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                            }
                          }
                          pvVar4 = _DAT_7ffc3ebc30d8;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 != 0) {
                            return;
                          }
                          pvVar6 = (*(*env)->NewObjectArray)
                                             (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvStack_70);
                          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
                          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x107debea60858202)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
                          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar11);
                          (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar3);
                          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
                          (*(*env)->ExceptionCheck)(env);
                          return;
                        }
                      }
                    }
                  }
                  goto LAB_7ffc3eb15a1c;
                }
              }
            }
            pJVar10 = *env;
            arg2_00 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar10->ThrowNew)(env,pvVar3,arg2_00);
        }
      }
    }
  }
LAB_7ffc3eb15a1c:
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar7 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb15ad7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_7_22 | RVA 0x345ae0 | dev/krypton/2.7(ICCI)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_7_22
               (JNINativeInterface_ **env,void *receiver,int arg0,ushort arg1,ushort arg2,int arg3)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  void *arg1_00;
  undefined8 uVar7;
  longlong lVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  char *arg2_00;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar9 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar9 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar3,100);
  if (lVar5 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,pvVar3,lVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc2470 == (void *)0x0) {
    uVar7 = FUN_7ffc3eb76c30(env,0x27);
    lVar8 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7ec7,0,0);
    if ((lVar8 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc2470 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc2470;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ CONCAT62(CONCAT42(arg0,arg1),arg2);
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x480196b83e1d609a);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb16297;
    if (lVar5 == 0) {
LAB_7ffc3eb15ea9:
      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar5 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar9 ^ 0x777730ecd82a);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar4 == (void *)0x0) {
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2_00 = &DAT_7ffc3eba6000;
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
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
          lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
          if (lVar5 == 0) {
            return;
          }
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar5,arg3);
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
            if (_DAT_7ffc3ebc2480 == (void *)0x0) {
              uVar7 = FUN_7ffc3eb76c30(env,0x27);
              lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba6371,0x7ffc3eba626f,0,0);
              if ((lVar5 != 0) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc2480 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
            }
            pvVar6 = _DAT_7ffc3ebc2480;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            arg1_00 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,0,pvVar3);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,1,pvVar4);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x4801d5bd8075467e);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,2,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,arg1_00,3,pvVar3);
            FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,arg1_00);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb161e3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
        }
        UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
        arg2_00 = (char *)0x7ffc3eba6019;
        pvVar3 = pvRam00007ffc3ebc0a98;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb1643b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2_00);
      return;
    }
    if (pvVar3 == (void *)0x0) {
      return;
    }
    if (_DAT_7ffc3ebc2478 == (void *)0x0) {
      uVar7 = FUN_7ffc3eb76c30(env,0x27);
      lVar5 = FUN_7ffc3eb77170(env,uVar7,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba7ec7,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2478 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2478;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x480196b83e1d609a);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) goto LAB_7ffc3eb15ea9;
    }
  }
  else {
LAB_7ffc3eb16297:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb16340;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb16340:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar5 != 0) && (lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x14a), lVar8 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar8,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb163ef. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_3_23 | RVA 0x346450 | dev/krypton/2.3(Ljava/lang/String;J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_3_23(JNINativeInterface_ **env,void *receiver,void *arg0,longlong arg1)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  longlong lVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  JNINativeInterface_ *pJVar12;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xa0);
  if (pvVar5 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar11 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar5 + 0x10));
  }
  else {
    uVar11 = (*(*env)->GetStaticLongField)(env,pvVar4,pvVar5);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc3068 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x27);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba647a
                             ,0x7ffc3eba7f15,0,0);
    if ((lVar7 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc3068 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc3068;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar11 = uVar11 ^ arg1;
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x198c6879d4b624b6
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
  if (lVar7 == 0) {
    return;
  }
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar7,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar5 == (void *)0x0) {
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
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
    if (2 < iVar3) {
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
      lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
      if (lVar7 == 0) {
        return;
      }
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar11 ^ 0x5d52c6ff6122);
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
      if (1 < iVar3) {
        (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (*(*env)->GetArrayLength)(env,pvVar5);
        }
        if (0 < iVar3) {
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,arg0);
          if (_DAT_7ffc3ebc3070 == (void *)0x0) {
            uVar9 = FUN_7ffc3eb76c30(env,0x27);
            lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba6371,0x7ffc3eba626f,0,0);
            if ((lVar7 != 0) &&
               (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar6 != (void *)0x0)) {
              _DAT_7ffc3ebc3070 = (*(*env)->NewGlobalRef)(env,pvVar6);
            }
          }
          pvVar6 = _DAT_7ffc3ebc3070;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x198adfe586d4db74);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
          FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc3078 == (void *)0x0) {
            uVar9 = FUN_7ffc3eb76c30(env,0x27);
            lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba647a,0x7ffc3eba621c,0,0);
            if ((lVar7 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc3078 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc3078;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x198f92518225b549);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
          pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
          (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
          pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          (*(*env)->MonitorEnter)(env,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (_DAT_7ffc3ebc3080 == (void *)0x0) {
            uVar9 = FUN_7ffc3eb76c30(env,0x27);
            lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3ebade6f,0x7ffc3eba647c,0,0);
            if ((lVar7 != 0) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc3080 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
          }
          pvVar5 = _DAT_7ffc3ebc3080;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x55cd);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar11 ^ 0x5362d479645fb166);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              uVar2 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
              if (_DAT_7ffc3ebc3088 == (void *)0x0) {
                uVar9 = FUN_7ffc3eb76c30(env,0x27);
                lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3ebaec12,0x7ffc3eba72ac,0,0);
                if ((lVar7 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc3088 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc3088;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar6 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                  uVar2);
                (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x198c1e612ac94a27);
                (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar11);
                (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar8);
                FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (_DAT_7ffc3ebc3090 == (void *)0x0) {
                    uVar9 = FUN_7ffc3eb76c30(env,0x27);
                    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba647a,0x7ffc3eba621c,0,0);
                    if ((lVar7 != 0) &&
                       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                       pvVar5 != (void *)0x0)) {
                      _DAT_7ffc3ebc3090 = (*(*env)->NewGlobalRef)(env,pvVar5);
                    }
                  }
                  pvVar5 = _DAT_7ffc3ebc3090;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,0,receiver);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0x198f92518225b549);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
                    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar11);
                    (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
                    lVar7 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (lVar7 == 0) {
                        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                      }
                      else {
                        lVar10 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09e0,0x14b);
                        if (lVar10 != 0) {
                          FUN_7ffc3e7e1940(env,lVar7,lVar10);
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          pJVar12 = *env;
                          if (bVar1 != 0) goto LAB_7ffc3eb171e5;
                          (*pJVar12->MonitorExit)(env,pvVar4);
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
          pJVar12 = *env;
LAB_7ffc3eb171e5:
          pvVar5 = (*pJVar12->ExceptionOccurred)(env);
          while( true ) {
            (*(*env)->ExceptionClear)(env);
            (*(*env)->MonitorExit)(env,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) break;
            pvVar5 = (*(*env)->ExceptionOccurred)(env);
          }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb17242. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->Throw)(env,pvVar5);
          return;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar4 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb171c5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar4,arg2);
  return;
}

/* JNI_dev_krypton_2_0_24 | RVA 0x347250 | dev/krypton/2.0(ICILjava/lang/String;Ljava/lang/String;)V | unresolved */
/* No successful pseudocode: consult coverage.tsv and the disassembly. */

/* JNI_dev_krypton_2_9_25 | RVA 0x364be0 | dev/krypton/2.9(SLjava/lang/String;CILjava/lang/String;)V | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_9_25
               (JNINativeInterface_ **env,void *receiver,short arg0,void *arg1,ushort arg2,int arg3,
               void *arg4)

{
  byte bVar1;
  char cVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  longlong lVar11;
  ulonglong uVar12;
  void *pvVar13;
  longlong lVar14;
  undefined8 uVar15;
  JNINativeInterface_ *pJVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  char *arg2_00;
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if ((pvVar5 != (void *)0x0) &&
     (pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xa0), pvVar6 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar17 = *(ulonglong *)
                (*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                (longlong)*(int *)((longlong)pvVar6 + 0x10));
    }
    else {
      uVar17 = (*(*env)->GetStaticLongField)(env,pvVar5,pvVar6);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 == 0) && (lVar7 = FUN_7ffc3eb76c90(env,pvVar5,100), lVar7 != 0)) {
      lVar7 = FUN_7ffc3e7d1a80(env,pvVar5,lVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        uVar17 = uVar17 ^ ((ulonglong)(uint)arg3 |
                          (ulonglong)arg2 << 0x20 | (ulonglong)(ushort)arg0 << 0x30);
LAB_7ffc3eb34e30:
        do {
          if (((_DAT_7ffc3ebc8228 == (void *)0x0) &&
              (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c
                                         ,0x7ffc3ebae34f,0x7ffc3ebb0efb,0,0), lVar11 != 0)) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc8228 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
          pvVar5 = _DAT_7ffc3ebc8228;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xbfe1eda8c8e673e);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
          pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
          pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (((_DAT_7ffc3ebc8230 == (void *)0x0) &&
              (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c
                                         ,0x7ffc3eba6371,0x7ffc3eba6204,0,0), lVar11 != 0)) &&
             (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar6 != (void *)0x0)) {
            _DAT_7ffc3ebc8230 = (*(*env)->NewGlobalRef)(env,pvVar6);
          }
          pvVar6 = _DAT_7ffc3ebc8230;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xbcf69577f8ad2de);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
          uVar9 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          cVar2 = FUN_7ffc3e7d53d0(env,uVar9,uRam00007ffc3ebc0a38);
          if (cVar2 != '\0') {
            return;
          }
          if (((_DAT_7ffc3ebc8238 == (void *)0x0) &&
              (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba606a,0x7ffc3eba606c
                                         ,0x7ffc3eba72ee,0x7ffc3eba72e8,0,0), lVar11 != 0)) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc8238 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
          pvVar5 = _DAT_7ffc3ebc8238;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2848);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar17 ^ 0x33180af46219476e);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb36f9c;
            uVar9 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
            if (((_DAT_7ffc3ebc8240 == (void *)0x0) &&
                (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                           0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3ebb0cd7,0,0),
                lVar11 != 0)) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc8240 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
            pvVar5 = _DAT_7ffc3ebc8240;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb36f9c;
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xbffa0ab7191cc63);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
            FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb3701d;
            if (((_DAT_7ffc3ebc8248 == (void *)0x0) &&
                (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                           0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3eba730b,0,0),
                lVar11 != 0)) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc8248 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
            pvVar5 = _DAT_7ffc3ebc8248;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb36f9c;
            pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xbcea9a83c8cd1bc);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb36f9c;
            uVar10 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
            if (((_DAT_7ffc3ebc8250 == (void *)0x0) &&
                (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                           0x7ffc3eba606c,0x7ffc3ebaea34,0x7ffc3eba730b,0,0),
                lVar11 != 0)) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc8250 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
            pvVar5 = _DAT_7ffc3ebc8250;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
LAB_7ffc3eb3701d:
              pvVar5 = (*(*env)->ExceptionOccurred)(env);
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
              if (bVar1 == 0) {
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                goto joined_r0x7ffc3eb36ff2;
              }
              goto LAB_7ffc3eb37262;
            }
            pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xbcf049c3950e1f7);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb3701d;
            lVar11 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
            if (-1 < arg0) {
              uVar10 = uVar10 - lVar11;
              uVar18 = uVar10 >> 0x20;
              if (lVar7 == 0) {
LAB_7ffc3eb35f9d:
                lVar11 = 0xbf038fa6f464bd2;
                goto joined_r0x7ffc3eb35faf;
              }
              if (((_DAT_7ffc3ebc8258 == (void *)0x0) &&
                  (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3eba72ee,0x7ffc3eba72e8,0,0),
                  lVar11 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc8258 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc8258;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
LAB_7ffc3eb37222:
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                if (bVar1 == 0) {
                  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                  if (bVar1 != 0) goto LAB_7ffc3eb37476;
                  pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
                  pJVar16 = *env;
                  goto LAB_7ffc3eb359fb;
                }
                goto LAB_7ffc3eb37262;
              }
              pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0xb58)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar17 ^ 0x7e063336e9ea647c);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
              uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb37222;
              uVar12 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
              if (arg2 == 0) {
LAB_7ffc3eb35eaa:
                if (((_DAT_7ffc3ebc8280 == (void *)0x0) &&
                    (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3eba730b,0,0),
                    lVar11 != 0)) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc8280 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
                pvVar5 = _DAT_7ffc3ebc8280;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar10 & 0xffffffff | uVar18 << 0x20);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar12);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
                  uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    uVar10 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
                    uVar18 = uVar10 >> 0x20;
                    goto LAB_7ffc3eb35f9d;
                  }
                }
LAB_7ffc3eb359a5:
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb359ae:
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
              }
              else {
                if ((longlong)uVar10 <= (longlong)uVar12) {
                  uVar18 = 0xbf60c5b;
                  uVar10 = 0x368351bd;
                  uVar12 = uVar17;
                  goto LAB_7ffc3eb35eaa;
                }
                if (((_DAT_7ffc3ebc8260 == (void *)0x0) &&
                    (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                               0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3eba74f4,0,0),
                    lVar11 != 0)) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc8260 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
                pvVar5 = _DAT_7ffc3ebc8260;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xbf267ee798ac355);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar17);
                  (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
                  pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb3742e;
                  if (((_DAT_7ffc3ebc8268 == (void *)0x0) &&
                      (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba6478,
                                                 0x7ffc3eba606c,0x7ffc3ebade6f,0x7ffc3eba647c,0,0),
                      lVar11 != 0)) &&
                     (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                     pvVar6 != (void *)0x0)) {
                    _DAT_7ffc3ebc8268 = (*(*env)->NewGlobalRef)(env,pvVar6);
                  }
                  pvVar6 = _DAT_7ffc3ebc8268;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb3742e;
                  pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                     0x1e98);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar13);
                  pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar17 ^ 0x1ff3ac307f58e845);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar13);
                  uVar9 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb3742e;
                  uVar3 = FUN_7ffc3e7d8be0(env,uVar9,uRam00007ffc3ebc09d0);
                  if (((_DAT_7ffc3ebc8270 == (void *)0x0) &&
                      (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba7293,0,0),
                      lVar11 != 0)) &&
                     (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                     pvVar6 != (void *)0x0)) {
                    _DAT_7ffc3ebc8270 = (*(*env)->NewGlobalRef)(env,pvVar6);
                  }
                  pvVar6 = _DAT_7ffc3ebc8270;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
                    pvVar5 = (*(*env)->ExceptionOccurred)(env);
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                    goto joined_r0x7ffc3eb3740c;
                  }
                  pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                    uVar3);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xbf47887c066a970);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar17);
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar5);
                  FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) {
LAB_7ffc3eb37399:
                    pvVar5 = (*(*env)->ExceptionOccurred)(env);
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                    goto joined_r0x7ffc3eb3740c;
                  }
                  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x28);
                  pJVar16 = *env;
                  if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb37434;
                  pvVar6 = (*pJVar16->AllocObject)(env,pvVar5);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb3742e;
                  if (pvVar6 == (void *)0x0) {
                    (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                    goto LAB_7ffc3eb3742e;
                  }
                  lVar11 = FUN_7ffc3eb76c90(env,pvVar5,0x66);
                  if (lVar11 == 0) goto LAB_7ffc3eb3742e;
                  FUN_7ffc3e7dbbc0(env,pvVar6,pvVar5,lVar11);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb3742e;
                  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x29);
                  pvVar5 = (*(*env)->NewObjectArray)(env,0,pvVar5,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb3742e;
                  if (((_DAT_7ffc3ebc8278 == (void *)0x0) &&
                      (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                 0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba626f,0,0),
                      lVar11 != 0)) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc8278 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                  pvVar8 = _DAT_7ffc3ebc8278;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 != 0) goto LAB_7ffc3eb37399;
                  pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0xbc145540373aea3);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar5);
                  pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar17);
                  (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar5);
                  FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar13);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    (*(*env)->Throw)(env,pvVar6);
                    goto LAB_7ffc3eb359a5;
                  }
                  pvVar5 = (*(*env)->ExceptionOccurred)(env);
                  goto LAB_7ffc3eb359ae;
                }
LAB_7ffc3eb3742e:
                pJVar16 = *env;
LAB_7ffc3eb37434:
                pvVar5 = (*pJVar16->ExceptionOccurred)(env);
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
              }
joined_r0x7ffc3eb3740c:
              if (bVar1 != 0) goto LAB_7ffc3eb37476;
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
              pJVar16 = *env;
LAB_7ffc3eb359fb:
              bVar1 = (*pJVar16->IsInstanceOf)(env,pvVar5,pvVar6);
              if (bVar1 == 0) {
                return;
              }
              (*(*env)->ExceptionClear)(env);
              goto LAB_7ffc3eb34e30;
            }
            uVar18 = uVar10 >> 0x20;
joined_r0x7ffc3eb35faf:
            if (((_DAT_7ffc3ebc8288 == (void *)0x0) &&
                (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                           0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3ebb0f12,0,0),
                lVar14 != 0)) &&
               (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
               pvVar5 != (void *)0x0)) {
              _DAT_7ffc3ebc8288 = (*(*env)->NewGlobalRef)(env,pvVar5);
            }
            pvVar5 = _DAT_7ffc3ebc8288;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb370b5;
            pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar10 & 0xffffffff | uVar18 << 0x20);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,lVar11);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17);
            (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (((_DAT_7ffc3ebc8290 == (void *)0x0) &&
                  (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba6478,
                                             0x7ffc3eba606c,0x7ffc3ebade6f,0x7ffc3eba647c,0,0),
                  lVar11 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc8290 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc8290;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb37167;
              pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0xda7)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar17 ^ 0x3a11fdf288d77b74);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
              uVar15 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb37167;
              uVar3 = FUN_7ffc3e7d8be0(env,uVar15,uRam00007ffc3ebc09d0);
              pvVar5 = (void *)FUN_7ffc3eb76c30(env,10);
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvVar5,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
LAB_7ffc3eb370b5:
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                goto joined_r0x7ffc3eb372fc;
              }
              pvVar6 = (void *)FUN_7ffc3eaf6060(env,arg1);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb370b5;
              if (pvVar5 == (void *)0x0) {
LAB_7ffc3eb3709b:
                pJVar16 = *env;
                arg2_00 = &DAT_7ffc3eba6000;
                pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb370b2:
                (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
                goto LAB_7ffc3eb370b5;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar4 < 1) goto LAB_7ffc3eb36ffd;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar6);
              pvVar6 = (void *)FUN_7ffc3eaf6060(env,arg4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb370b5;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar4 < 2) goto LAB_7ffc3eb36ffd;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar6);
              pvVar6 = (void *)FUN_7ffc3eaf6060(env,uVar9);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb370b5;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar4 < 3) {
LAB_7ffc3eb370ed:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a98,(char *)0x7ffc3eba6019);
LAB_7ffc3eb3710b:
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                goto joined_r0x7ffc3eb372fc;
              }
              (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar6);
              pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb3710b;
              lVar11 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
              if (lVar11 == 0) goto LAB_7ffc3eb370b5;
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,
                                                uVar17 ^ 0x386727476985);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb370b5;
              if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb3709b;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (iVar4 < 3) {
LAB_7ffc3eb36ffd:
                pJVar16 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb370b2;
              }
              (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar8);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (iVar4 < 2) goto LAB_7ffc3eb36ffd;
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar5);
              lVar14 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
              if (lVar14 == 0) goto LAB_7ffc3eb370b5;
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar14,uVar3);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb370b5;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
              }
              if (iVar4 < 1) {
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a98,(char *)0x7ffc3eba6019);
                goto LAB_7ffc3eb37167;
              }
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar5);
              if (((_DAT_7ffc3ebc8298 == (void *)0x0) &&
                  (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3eba645f,0,0),
                  lVar14 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc8298 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc8298;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb37167;
              pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xbc45ce449b281ad);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar6);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb37167;
              if (((_DAT_7ffc3ebc82a0 == (void *)0x0) &&
                  (lVar14 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3ebaea34,0x7ffc3eba6456,0,0),
                  lVar14 != 0)) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar14,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc82a0 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
              pvVar6 = _DAT_7ffc3ebc82a0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb37167;
              pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0xbfea9010de9296a);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar13);
              pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar17);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar13);
              pvVar6 = (void *)FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                goto joined_r0x7ffc3eb372fc;
              }
              pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
                pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
                goto joined_r0x7ffc3eb372fc;
              }
              if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3709b;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
              }
              if (iVar4 < 2) goto LAB_7ffc3eb36ffd;
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar11,
                                                uVar17 ^ 0x6cd78428d829);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb370b5;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (*(*env)->GetArrayLength)(env,pvVar8);
              }
              if (iVar4 < 1) goto LAB_7ffc3eb370ed;
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
              if (((_DAT_7ffc3ebc82a8 == (void *)0x0) &&
                  (lVar11 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                             0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba626f,0,0),
                  lVar11 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar11,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc82a8 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc82a8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb3710b;
              pvVar13 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar6);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar8);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xbcb393d909d6b7d);
              (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar6);
              pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar6);
              FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) goto LAB_7ffc3eb372ce;
              goto LAB_7ffc3eb34e30;
            }
LAB_7ffc3eb37167:
            pvVar5 = (*(*env)->ExceptionOccurred)(env);
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
joined_r0x7ffc3eb372fc:
            if (bVar1 != 0) {
LAB_7ffc3eb37476:
              (*(*env)->ExceptionClear)(env);
              if (((_DAT_7ffc3ebc82b0 == (void *)0x0) &&
                  (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                            0x7ffc3eba606c,0x7ffc3ebae34f,0x7ffc3ebb0efb,0,0),
                  lVar7 != 0)) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc82b0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
              pvVar5 = _DAT_7ffc3ebc82b0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar6 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xbfe1eda8c8e673e);
              (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar8);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar6);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              if (((_DAT_7ffc3ebc82b8 == (void *)0x0) &&
                  (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                            0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba743f,0,0),
                  lVar7 != 0)) &&
                 (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar6 != (void *)0x0)) {
                _DAT_7ffc3ebc82b8 = (*(*env)->NewGlobalRef)(env,pvVar6);
              }
              pvVar6 = _DAT_7ffc3ebc82b8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xbf0b5fe98907b6d);
              (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar17
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar5);
              FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb37632. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(*env)->ExceptionCheck)(env);
              return;
            }
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
            pJVar16 = *env;
          }
          else {
LAB_7ffc3eb36f9c:
            pvVar5 = (*(*env)->ExceptionOccurred)(env);
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
            if (bVar1 != 0) {
LAB_7ffc3eb37262:
              (*(*env)->ExceptionClear)(env);
              lVar11 = FUN_7ffc3eb76c30(env,0x27);
              if ((lVar11 == 0) || (lVar14 = FUN_7ffc3eb76c90(env,lVar11,0x14a), lVar14 == 0)) {
LAB_7ffc3eb372ce:
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
              }
              else {
                pvVar5 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar14,pvVar5);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  (*(*env)->Throw)(env,pvVar5);
                  goto LAB_7ffc3eb372ce;
                }
                pvVar5 = (*(*env)->ExceptionOccurred)(env);
              }
              pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
              goto joined_r0x7ffc3eb372fc;
            }
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,0xa9);
            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar6);
joined_r0x7ffc3eb36ff2:
            if (bVar1 != 0) goto LAB_7ffc3eb37476;
            pvVar6 = (void *)FUN_7ffc3eb76c30(env,8);
            pJVar16 = *env;
          }
          bVar1 = (*pJVar16->IsInstanceOf)(env,pvVar5,pvVar6);
          if (bVar1 == 0) {
            return;
          }
          (*(*env)->ExceptionClear)(env);
          if (lVar7 == 0) {
            return;
          }
        } while( true );
      }
    }
  }
  return;
}

/* JNI_dev_krypton_2_5_26 | RVA 0x367790 | dev/krypton/2.5(J)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_5_26(JNINativeInterface_ **env,void *receiver,longlong arg0)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  void *pvVar6;
  longlong lVar7;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa0);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar8 = *(ulonglong *)
             (*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
             (longlong)*(int *)((longlong)pvVar4 + 0x10));
  }
  else {
    uVar8 = (*(*env)->GetStaticLongField)(env,pvVar3,pvVar4);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
  if (lVar5 == 0) {
    return;
  }
  uVar8 = uVar8 ^ arg0;
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar8 ^ 0xde9e4f5f585);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar3 == (void *)0x0) {
LAB_7ffc3eb37f6b:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = &DAT_7ffc3eba6000;
    pvVar3 = pvRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
    }
    if (0 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
      if (((_DAT_7ffc3ebc0d00 == (void *)0x0) &&
          (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                    0x7ffc3ebae34f,0x7ffc3eba743f,0,0), lVar7 != 0)) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc0d00 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
      pvVar4 = _DAT_7ffc3ebc0d00;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x2a4ddc3cdf90d606);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
      (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar8 ^ 0x4ec1a1212ee2);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (pvVar3 == (void *)0x0) goto LAB_7ffc3eb37f6b;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
      }
      if (0 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
        if (((_DAT_7ffc3ebc0d08 == (void *)0x0) &&
            (lVar7 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                      0x7ffc3ebae34f,0x7ffc3eba743f,0,0), lVar7 != 0)) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc0d08 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
        pvVar4 = _DAT_7ffc3ebc0d08;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x2a7ff4376dee6245);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar8 ^ 0x377aa58e59b3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (pvVar3 == (void *)0x0) goto LAB_7ffc3eb37f6b;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
        }
        if (0 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
          if (((_DAT_7ffc3ebc0d10 == (void *)0x0) &&
              (lVar5 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,0x7ffc3eba606c,
                                        0x7ffc3ebae34f,0x7ffc3eba743f,0,0), lVar5 != 0)) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc0d10 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
          pvVar4 = _DAT_7ffc3ebc0d10;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar6 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x2a494e119461d508);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
          (*(*env)->SetObjectArrayElement)(env,pvVar6,2,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb37ec4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb37fb4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_2_5_27 | RVA 0x367fc0 | dev/krypton/2.5(JBLjava/lang/Runnable;)Ljava/lang/Thread; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_5_27
                 (JNINativeInterface_ **env,void *receiver,longlong arg0,byte arg1,void *arg2)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  void *pvVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  longlong lVar8;
  void *pvVar9;
  ulonglong uVar10;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if ((pvVar2 != (void *)0x0) &&
     (pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0xa0), pvVar3 != (void *)0x0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar10 = *(ulonglong *)
                (*(longlong *)((ulonglong)pvVar2 & 0xfffffffffffffffc) +
                (longlong)*(int *)((longlong)pvVar3 + 0x10));
    }
    else {
      uVar10 = (*(*env)->GetStaticLongField)(env,pvVar2,pvVar3);
    }
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 == 0) && (pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x10), pvVar2 != (void *)0x0)) {
      pvVar3 = (*(*env)->AllocObject)(env,pvVar2);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (((_DAT_7ffc3ebc8208 == (void *)0x0) &&
            (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba6299,0x7ffc3eba606c,
                                      0x7ffc3ebaec12,0x7ffc3eba629d,0,0), lVar8 != 0)) &&
           (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar9 != (void *)0x0
           )) {
          _DAT_7ffc3ebc8208 = (*(*env)->NewGlobalRef)(env,pvVar9);
        }
        pvVar9 = _DAT_7ffc3ebc8208;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          uVar10 = uVar10 ^ ((ulonglong)arg1 | arg0 << 8);
          pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x33fb);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar10 ^ 0x5a3bab4d4c495fbd);
          (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
          uVar6 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (((_DAT_7ffc3ebc8210 == (void *)0x0) &&
              (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3eba72ee,0x7ffc3eba72e8,0,0), lVar8 != 0)) &&
             (pvVar9 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar9 != (void *)0x0)) {
            _DAT_7ffc3ebc8210 = (*(*env)->NewGlobalRef)(env,pvVar9);
          }
          pvVar9 = _DAT_7ffc3ebc8210;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x1ec8);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar10 ^ 0x52439aa8db4c913b);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
            uVar7 = FUN_7ffc3e7d1a50(env,pvVar9,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return (void *)0x0;
            }
            uVar7 = FUN_7ffc3e7d1a20(env,uVar7,uRam00007ffc3ebc0968);
            if (pvVar3 == (void *)0x0) {
              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
            }
            else {
              lVar8 = FUN_7ffc3eb76c90(env,pvVar2,0x1a5);
              if (lVar8 != 0) {
                FUN_7ffc3e7dbbc0(env,pvVar3,pvVar2,lVar8,0,arg2,uVar6,uVar7);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  if (((_DAT_7ffc3ebc8218 == (void *)0x0) &&
                      (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba72ac,0,0),
                      lVar8 != 0)) &&
                     (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                     pvVar2 != (void *)0x0)) {
                    _DAT_7ffc3ebc8218 = (*(*env)->NewGlobalRef)(env,pvVar2);
                  }
                  pvVar2 = _DAT_7ffc3ebc8218;
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,
                                                      1);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      0xeb167797660062d5);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                      uVar10);
                    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                    FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar9);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 != 0) {
                      return (void *)0x0;
                    }
                    if (((_DAT_7ffc3ebc8220 == (void *)0x0) &&
                        (lVar8 = FUN_7ffc3eb77170(env,receiver,6,0x7ffc3ebb08c1,0x7ffc3eba718e,
                                                  0x7ffc3eba606c,0x7ffc3eba6371,0x7ffc3eba7293,0,0),
                        lVar8 != 0)) &&
                       (pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                       pvVar2 != (void *)0x0)) {
                      _DAT_7ffc3ebc8220 = (*(*env)->NewGlobalRef)(env,pvVar2);
                    }
                    pvVar2 = _DAT_7ffc3ebc8220;
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                        uRam00007ffc3ebc0998,5);
                      (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0xeb20fb921e622970);
                      (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar4);
                      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar10);
                      (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar4);
                      FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar9);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        return pvVar3;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  return (void *)0x0;
}

/* JNI_dev_krypton_2_9_28 | RVA 0x368850 | dev/krypton/2.9([Ljava/lang/String;)V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_9_28(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  void *arg1;
  void *arg2;
  
  arg1 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (arg1 != (void *)0x0) {
    arg2 = (void *)FUN_7ffc3eb76ce0(env,arg1,0xa1);
    if (arg2 != (void *)0x0) {
      (*(*env)->SetStaticObjectField)(env,arg1,arg2,arg0);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb388a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  return;
}

/* JNI_dev_krypton_2_7_29 | RVA 0x3688c0 | dev/krypton/2.7()[Ljava/lang/String; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_7_29(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *arg2;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if ((pvVar2 != (void *)0x0) &&
     (arg2 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0xa1), arg2 != (void *)0x0)) {
    pvVar2 = (*(*env)->GetStaticObjectField)(env,pvVar2,arg2);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      return pvVar2;
    }
  }
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_30 | RVA 0x368930 | dev/krypton/2.a(Ljava/lang/Exception;)Ljava/lang/Exception; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_30(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_2_a_31 | RVA 0x368940 | dev/krypton/2.a([B)Ljava/lang/String; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_31(JNINativeInterface_ **env,void *receiver,void *arg0)

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
      goto LAB_7ffc3eb38ed6;
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
LAB_7ffc3eb38a2e:
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
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb38ee0;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if ((iVar4 < 0) || (iVar5 <= iVar4)) goto LAB_7ffc3eb38ebe;
          uVar14 = (ulonglong)(iVar4 + 1);
          uStack_66 = (ushort)bVar3;
          if (bRam00007ffc3ebc08e5 == 1) {
LAB_7ffc3eb38a00:
            *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar12 * 2) = uVar11;
            uVar12 = uVar14;
          }
          else {
            pJVar8 = *env;
            arg4 = &uStack_66;
LAB_7ffc3eb38c71:
            (*pJVar8->SetCharArrayRegion)(env,pvVar6,iVar4,1,arg4);
            uVar12 = uVar14;
          }
LAB_7ffc3eb38a1c:
          uVar15 = uVar15 + 1;
          uVar13 = (undefined4)uVar12;
          if ((uint)uStack_48 <= uVar15) goto LAB_7ffc3eb38e2f;
          goto LAB_7ffc3eb38a2e;
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb38ee0;
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
              if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb38a00;
              pJVar8 = *env;
              arg4 = &uStack_68;
              goto LAB_7ffc3eb38c71;
            }
          }
        }
        else {
          if (iStack_54 <= (int)uVar15) goto LAB_7ffc3eb38a1c;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar5 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (*(*env)->GetArrayLength)(env,arg0);
          }
          arg2 = uVar15 + 1;
          if (iVar5 <= (int)arg2) goto LAB_7ffc3eb38ebe;
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb38ee0;
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
              goto LAB_7ffc3eb38a1c;
            }
          }
        }
      }
LAB_7ffc3eb38ebe:
      pJVar8 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar6 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb38ed6;
    }
    uVar13 = 0;
LAB_7ffc3eb38e2f:
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
LAB_7ffc3eb38ee0:
  pJVar8 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar6 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb38ed6:
  (*pJVar8->ThrowNew)(env,pvVar6,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_32 | RVA 0x368f10 | dev/krypton/2.a(IJ)Ljava/lang/String; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_32(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa2);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar3 == (void *)0x0) goto LAB_7ffc3eb39c29;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
  }
  if ((-1 < arg0) && (arg2 = arg0 ^ (uint)lStack_50 & 0x7fff ^ 0x779, (int)arg2 < iVar2)) {
    pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,arg2);
    if (pvVar3 == (void *)0x0) {
      lVar5 = FUN_7ffc3eb76c30(env,0x10);
      if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x11), lVar6 == 0)) {
LAB_7ffc3eb39db3:
        pJVar11 = *env;
LAB_7ffc3eb39db9:
        pvVar3 = (*pJVar11->ExceptionOccurred)(env);
LAB_7ffc3eb39dbc:
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
        pvVar9 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
        if (bVar1 != 0) goto LAB_7ffc3eb39db3;
        if (lVar6 == 0) goto LAB_7ffc3eb39d62;
        lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x12);
        if (lVar5 == 0) goto LAB_7ffc3eb39db3;
        uVar7 = FUN_7ffc3e7d1a20(env,lVar6,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar5 == 0))
        goto LAB_7ffc3eb39db3;
        uVar7 = FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar5,uVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27), pvVar3 == (void *)0x0))
        goto LAB_7ffc3eb39db3;
        pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa3);
        pJVar11 = *env;
        if (pvVar4 == (void *)0x0) goto LAB_7ffc3eb39db9;
        pvVar8 = (*pJVar11->GetStaticObjectField)(env,pvVar3,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) goto LAB_7ffc3eb39db3;
        if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb39d62;
        pvVar9 = (void *)FUN_7ffc3eb76c30(env,0x11);
        if ((pvVar9 == (void *)0x0) || (lVar5 = FUN_7ffc3eb76c90(env,pvVar9,0x13), lVar5 == 0))
        goto LAB_7ffc3eb39db3;
        pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,lVar5,uVar7);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 != 0) || (pvVar10 = (void *)FUN_7ffc3eb76c30(env,0x12), pvVar10 == (void *)0x0))
        goto LAB_7ffc3eb39db3;
        if (pvVar8 == (void *)0x0) {
          pvStack_58 = pvVar9;
          pvStack_48 = pvVar4;
          pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3eb39db3;
          pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6516);
          lVar5 = FUN_7ffc3eb76c30(env,0x13);
          if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x14), lVar6 == 0))
          goto LAB_7ffc3eb39db3;
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3eb39db3;
          if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb39d62;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar2 < 1) {
LAB_7ffc3eb39d95:
            pJVar11 = *env;
            pcVar12 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
            goto LAB_7ffc3eb39dad;
          }
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
          pvVar4 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
          lVar5 = FUN_7ffc3eb76c30(env,0x14);
          if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x15), lVar6 == 0))
          goto LAB_7ffc3eb39db3;
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) goto LAB_7ffc3eb39db3;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
          }
          if (iVar2 < 2) goto LAB_7ffc3eb39d95;
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x15);
          pJVar11 = *env;
          if (pvVar4 == (void *)0x0) goto LAB_7ffc3eb39db9;
          pvVar9 = (*pJVar11->AllocObject)(env,pvVar4);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar10 = (*(*env)->NewByteArray)(env,8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (pvVar9 == (void *)0x0) {
LAB_7ffc3eb39d62:
                pJVar11 = *env;
                pcVar12 = &DAT_7ffc3eba6000;
                pvVar3 = pvRam00007ffc3ebc0a70;
                goto LAB_7ffc3eb39dad;
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
                  if (iVar2 < 3) goto LAB_7ffc3eb39d95;
                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar9);
                  pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvStack_48);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3eb39d62;
                    lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x17);
                    if (lVar5 != 0) {
                      FUN_7ffc3e7d1a50(env,pvVar3,lVar5,uVar7,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) goto LAB_7ffc3eb3961e;
                    }
                  }
                }
              }
            }
            goto LAB_7ffc3eb39db3;
          }
          pvVar3 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3eb39dbc;
        }
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar10);
        if (bVar1 == 0) {
          pJVar11 = *env;
          pcVar12 = (char *)0x7ffc3eba6033;
          pvVar3 = pvRam00007ffc3ebc0a58;
LAB_7ffc3eb39dad:
          (*pJVar11->ThrowNew)(env,pvVar3,pcVar12);
          goto LAB_7ffc3eb39db3;
        }
LAB_7ffc3eb3961e:
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
          if (iVar2 < 1) goto LAB_7ffc3eb39d45;
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
            if (iVar2 <= lVar5) goto LAB_7ffc3eb39d45;
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
            if (iVar2 < 2) goto LAB_7ffc3eb39d45;
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
                if (iVar2 < 1) goto LAB_7ffc3eb39d45;
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
                  if (iVar2 < 3) goto LAB_7ffc3eb39d45;
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
                      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
                      if (pvVar4 == (void *)0x0) {
                        return (void *)0x0;
                      }
                      pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xa4);
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
                        if (iVar2 <= (int)arg2) goto LAB_7ffc3eb39d45;
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
                          pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xa2);
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
                          if (iVar2 < 1) goto LAB_7ffc3eb39d45;
                          pvVar3 = (*(*env)->GetObjectArrayElement)(env,pvVar3,0);
                          if (pvVar3 != (void *)0x0) {
                            bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar8);
                            if (bVar1 == 0) goto LAB_7ffc3eb39d78;
                            lVar5 = FUN_7ffc3eb76c90(env,pvVar8,0x1d);
                            if (lVar5 == 0) {
                              return (void *)0x0;
                            }
                            uVar7 = FUN_7ffc3e7d1a50(env,pvVar3,lVar5,uVar7);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return (void *)0x0;
                            }
                            lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x1a6);
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
                                goto LAB_7ffc3eb38fff;
                              }
                              goto LAB_7ffc3eb39d45;
                            }
                          }
                        }
                      }
                    }
                    goto LAB_7ffc3eb39c29;
                  }
                }
              }
LAB_7ffc3eb39d78:
              pJVar11 = *env;
              pcVar12 = (char *)0x7ffc3eba6033;
              pvVar3 = pvRam00007ffc3ebc0a58;
              goto LAB_7ffc3eb39c3d;
            }
          }
        }
      }
LAB_7ffc3eb39c29:
      pJVar11 = *env;
      pcVar12 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
      goto LAB_7ffc3eb39c3d;
    }
LAB_7ffc3eb38fff:
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
    if (pvVar3 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xa2);
    if (pvVar4 == (void *)0x0) {
      return (void *)0x0;
    }
    pvVar3 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    if (pvVar3 == (void *)0x0) goto LAB_7ffc3eb39c29;
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
LAB_7ffc3eb39d45:
  pJVar11 = *env;
  pcVar12 = (char *)0x7ffc3eba6019;
  pvVar3 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eb39c3d:
  (*pJVar11->ThrowNew)(env,pvVar3,pcVar12);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_33 | RVA 0x369ec0 | dev/krypton/2.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_33
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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3eb3a368;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb3a34b;
  pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar6 = *env;
  if (pvVar4 != (void *)0x0) {
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3eb3a37a:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb3a007;
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
    if (iVar3 < 2) goto LAB_7ffc3eb3a34b;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar6 = *env;
    if (pvVar4 == (void *)0x0) goto LAB_7ffc3eb3a000;
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3eb3a37a;
    lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return (void *)0x0;
    }
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x1a7);
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
          goto LAB_7ffc3eb3a368;
        }
      }
LAB_7ffc3eb3a34b:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb3a007;
    }
LAB_7ffc3eb3a368:
    pJVar6 = *env;
  }
LAB_7ffc3eb3a000:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3a007:
  (*pJVar6->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_34 | RVA 0x36a3a0 | dev/krypton/2.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_34
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb3ac6b;
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
  if (_DAT_7ffc3ebc0b20 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x27);
    uVar11 = FUN_7ffc3eb76c30(env,0x27);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b20 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b20;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eb3a8d3:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3a901:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3a8d3;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3a8d3;
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
                      goto LAB_7ffc3eb3a907;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb3a901;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb3a907:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
LAB_7ffc3eb3ac6b:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_b_35 | RVA 0x36ac90 | dev/krypton/2.b(IJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_2_b_35(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xa5);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar8 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3c532;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x7d29, iVar6 <= (int)arg2)) {
LAB_7ffc3eb3c518:
    pJVar16 = *env;
    pcVar17 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3eb3c546;
  }
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,arg2);
  if (pvVar8 != (void *)0x0) {
LAB_7ffc3eb3c409:
    pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x27);
    if (pvVar7 == (void *)0x0) {
      return 0;
    }
    pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xa5);
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
      if (iVar6 <= (int)arg2) goto LAB_7ffc3eb3c518;
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
    goto LAB_7ffc3eb3c532;
  }
  pvVar8 = (*(*env)->NewByteArray)(env,8);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3c532;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  if (iVar6 < 1) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3ae52;
LAB_7ffc3eb3ae18:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3ae18;
LAB_7ffc3eb3ae52:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3aede;
LAB_7ffc3eb3aea1:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3aea1;
LAB_7ffc3eb3aede:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3af6a;
LAB_7ffc3eb3af2d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3af2d;
LAB_7ffc3eb3af6a:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3aff6;
LAB_7ffc3eb3afb9:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3afb9;
LAB_7ffc3eb3aff6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b081;
LAB_7ffc3eb3b044:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b044;
LAB_7ffc3eb3b081:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b10c;
LAB_7ffc3eb3b0cf:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b0cf;
LAB_7ffc3eb3b10c:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b197;
LAB_7ffc3eb3b15a:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar8);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b15a;
LAB_7ffc3eb3b197:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc)) = abStack_50[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar8,7,1,abStack_50);
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xa6);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar7,pvVar9);
  bVar4 = (*(*env)->ExceptionCheck)(env);
  if (bVar4 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb3c532;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 <= (int)arg2) goto LAB_7ffc3eb3c518;
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
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb3c532;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar6 < 1) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b3a7;
LAB_7ffc3eb3b36d:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b36d;
LAB_7ffc3eb3b3a7:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b433;
LAB_7ffc3eb3b3f6:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b3f6;
LAB_7ffc3eb3b433:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b4bf;
LAB_7ffc3eb3b482:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b482;
LAB_7ffc3eb3b4bf:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b54b;
LAB_7ffc3eb3b50e:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b50e;
LAB_7ffc3eb3b54b:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b5d6;
LAB_7ffc3eb3b599:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b599;
LAB_7ffc3eb3b5d6:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b661;
LAB_7ffc3eb3b624:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b624;
LAB_7ffc3eb3b661:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3eb3c518;
  abStack_50[0] = (byte)((ulonglong)lVar10 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3b6ec;
LAB_7ffc3eb3b6af:
    iVar6 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3b6af;
LAB_7ffc3eb3b6ec:
    iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3eb3c518;
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
    pvVar13 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xa7);
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
LAB_7ffc3eb3bdd1:
          pJVar16 = *env;
          goto LAB_7ffc3eb3bdd7;
        }
        uStack_48 = uVar12;
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar10 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x14), lVar11 == 0))
        goto LAB_7ffc3eb3bdd1;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3eb3bdd1;
        if (pvVar7 == (void *)0x0) goto LAB_7ffc3eb3bdb7;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 1) {
LAB_7ffc3eb3c551:
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6019;
          pvVar7 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3eb3bdcb;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar13);
        pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar10 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar10 == 0) || (lVar11 = FUN_7ffc3eb76c90(env,lVar10,0x15), lVar11 == 0))
        goto LAB_7ffc3eb3bdd1;
        pvVar13 = (void *)FUN_7ffc3e7d1a80(env,lVar10,lVar11,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 != 0) goto LAB_7ffc3eb3bdd1;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
        }
        if (iVar6 < 2) goto LAB_7ffc3eb3c551;
        (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar13);
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar16 = *env;
        if (pvVar13 == (void *)0x0) goto LAB_7ffc3eb3bdd7;
        pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
        bVar4 = (*(*env)->ExceptionCheck)(env);
        if (bVar4 == 0) {
          pvVar14 = (*(*env)->NewByteArray)(env,8);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) goto LAB_7ffc3eb3bdb7;
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
                if (iVar6 < 3) goto LAB_7ffc3eb3c551;
                (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar15);
                pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x27);
                if (pvVar13 != (void *)0x0) {
                  pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar13,0xa7);
                  if (pvVar15 == (void *)0x0) {
                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3eb3bdda;
                  }
                  pvVar13 = (*(*env)->GetStaticObjectField)(env,pvVar13,pvVar15);
                  bVar4 = (*(*env)->ExceptionCheck)(env);
                  if (bVar4 == 0) {
                    if (pvVar13 == (void *)0x0) goto LAB_7ffc3eb3bdb7;
                    lVar10 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar10 != 0) && (lVar10 = FUN_7ffc3eb76c90(env,lVar10,0x17), lVar10 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar13,lVar10,uStack_48,pvVar7);
                      bVar4 = (*(*env)->ExceptionCheck)(env);
                      if (bVar4 == 0) goto LAB_7ffc3eb3bcc2;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb3bdd1;
        }
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar13);
        if (bVar4 == 0) {
          pJVar16 = *env;
          pcVar17 = (char *)0x7ffc3eba6033;
          pvVar7 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3eb3c546;
        }
LAB_7ffc3eb3bcc2:
        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar16 = *env;
        if (pvVar13 != (void *)0x0) {
          pvVar15 = (*pJVar16->AllocObject)(env,pvVar13);
          bVar4 = (*(*env)->ExceptionCheck)(env);
          if (bVar4 == 0) {
            if (pvVar15 == (void *)0x0) {
LAB_7ffc3eb3bdb7:
              pJVar16 = *env;
              pcVar17 = &DAT_7ffc3eba6000;
              pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3bdcb:
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
                  if (iVar6 < 2) goto LAB_7ffc3eb3c551;
                  pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,1);
                  pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar13 != (void *)0x0) {
                    if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3bdb7;
                    bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13);
                    if (bVar4 == 0) goto LAB_7ffc3eb3c56e;
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
                        if (iVar6 < 1) goto LAB_7ffc3eb3c551;
                        pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar7,0);
                        pvVar13 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar13 != (void *)0x0) {
                          if ((pvVar8 != (void *)0x0) &&
                             (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar13), bVar4 == 0)) {
LAB_7ffc3eb3c56e:
                            pJVar16 = *env;
                            pcVar17 = (char *)0x7ffc3eba6033;
                            pvVar7 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3eb3bdcb;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (*(*env)->GetArrayLength)(env,pvVar7);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3eb3c551;
                          pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar7,2);
                          pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar15 != (void *)0x0) {
                            if ((pvVar7 != (void *)0x0) &&
                               (bVar4 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar15), bVar4 == 0))
                            goto LAB_7ffc3eb3c56e;
                            if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3bdb7;
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
                                            pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x27);
                                            if (pvVar7 == (void *)0x0) {
                                              return 0;
                                            }
                                            pvVar8 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xa5);
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
                                            if (pvVar7 == (void *)0x0) goto LAB_7ffc3eb3c532;
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
                                              goto LAB_7ffc3eb3c409;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3eb3c518;
                                  }
                                  goto LAB_7ffc3eb3c532;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb3bdd1;
        }
LAB_7ffc3eb3bdd7:
        pvVar7 = (*pJVar16->ExceptionOccurred)(env);
      }
LAB_7ffc3eb3bdda:
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
      pvVar13 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
LAB_7ffc3eb3c532:
  pJVar16 = *env;
  pcVar17 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3c546:
  (*pJVar16->ThrowNew)(env,pvVar7,pcVar17);
  return 0;
}

/* JNI_dev_krypton_2_b_36 | RVA 0x36c5c0 | dev/krypton/2.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_2_b_36
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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3eb3cadd;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb3cac0;
  pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar7 = *env;
  if (pvVar5 != (void *)0x0) {
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3eb3caef:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar5 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb3c707;
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
    if (iVar3 < 2) goto LAB_7ffc3eb3cac0;
    pvVar5 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar7 = *env;
    if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3c700;
    bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar5,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3eb3caef;
    lVar6 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(env,pvVar5,lVar6);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3eb76c30(env,0x27);
    if (lVar6 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(env,lVar6,0x1a8);
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
          goto LAB_7ffc3eb3cadd;
        }
      }
LAB_7ffc3eb3cac0:
      pJVar7 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb3c707;
    }
LAB_7ffc3eb3cadd:
    pJVar7 = *env;
  }
LAB_7ffc3eb3c700:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3c707:
  (*pJVar7->ThrowNew)(env,pvVar5,arg2_00);
  return 0;
}

/* JNI_dev_krypton_2_b_37 | RVA 0x36cb10 | dev/krypton/2.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_b_37
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb3d3db;
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
  if (_DAT_7ffc3ebc0b28 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x27);
    uVar11 = FUN_7ffc3eb76c30(env,0x27);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b28 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b28;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eb3d043:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3d071:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3d043;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3d043;
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
                      goto LAB_7ffc3eb3d077;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb3d071;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb3d077:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
LAB_7ffc3eb3d3db:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_c_38 | RVA 0x36d400 | dev/krypton/2.c(IJ)J | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong JNI_dev_krypton_2_c_38(JNINativeInterface_ **env,void *receiver,int arg0,longlong arg1)

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
  
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar8 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0xa8);
  if (pvVar9 == (void *)0x0) {
    return 0;
  }
  pvVar9 = (*(*env)->GetStaticObjectField)(env,pvVar8,pvVar9);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb3eef1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if ((arg0 < 0) || (arg2 = arg0 ^ (uint)arg1 & 0x7fff ^ 0x64cc, iVar7 <= (int)arg2)) {
LAB_7ffc3eb3eed7:
    pJVar18 = *env;
    pcVar19 = (char *)0x7ffc3eba6019;
    pvVar8 = pvRam00007ffc3ebc0a98;
    goto LAB_7ffc3eb3ef05;
  }
  pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar9,arg2);
  if (pvVar9 != (void *)0x0) {
LAB_7ffc3eb3edc9:
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x27);
    if (pvVar8 == (void *)0x0) {
      return 0;
    }
    pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0xa8);
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
      if (iVar7 <= (int)arg2) goto LAB_7ffc3eb3eed7;
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
    goto LAB_7ffc3eb3eef1;
  }
  pvVar9 = (*(*env)->NewByteArray)(env,8);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb3eef1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  if (iVar7 < 1) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d5c2;
LAB_7ffc3eb3d588:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,0,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d588;
LAB_7ffc3eb3d5c2:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 2) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d64e;
LAB_7ffc3eb3d611:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,1,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d611;
LAB_7ffc3eb3d64e:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 3) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d6da;
LAB_7ffc3eb3d69d:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,2,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d69d;
LAB_7ffc3eb3d6da:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 4) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d766;
LAB_7ffc3eb3d729:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,3,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d729;
LAB_7ffc3eb3d766:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 5) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d7f1;
LAB_7ffc3eb3d7b4:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,4,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d7b4;
LAB_7ffc3eb3d7f1:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 6) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d87c;
LAB_7ffc3eb3d83f:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,5,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d83f;
LAB_7ffc3eb3d87c:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 7) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)arg1 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3d907;
LAB_7ffc3eb3d8ca:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar9);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,6,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3d8ca;
LAB_7ffc3eb3d907:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 8) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)arg1;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 +
             *(longlong *)((ulonglong)pvVar9 & 0xfffffffffffffffc)) = abStack_60[0];
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar9,7,1,abStack_60);
  }
  pvVar10 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0xa9);
  if (pvVar10 == (void *)0x0) {
    return 0;
  }
  pvVar10 = (*(*env)->GetStaticObjectField)(env,pvVar8,pvVar10);
  bVar5 = (*(*env)->ExceptionCheck)(env);
  if (bVar5 != 0) {
    return 0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3eb3eef1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  if (iVar7 <= (int)arg2) goto LAB_7ffc3eb3eed7;
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
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3eb3eef1;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  if (iVar7 < 1) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
             (ulonglong)uRam00007ffc3ebc08f0) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3db17;
LAB_7ffc3eb3dadd:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,0,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3dadd;
LAB_7ffc3eb3db17:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 2) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3dba3;
LAB_7ffc3eb3db66:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,1,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3db66;
LAB_7ffc3eb3dba3:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 3) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3dc2f;
LAB_7ffc3eb3dbf2:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,2,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3dbf2;
LAB_7ffc3eb3dc2f:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 4) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3dcbb;
LAB_7ffc3eb3dc7e:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,3,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3dc7e;
LAB_7ffc3eb3dcbb:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 5) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3dd46;
LAB_7ffc3eb3dd09:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,4,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3dd09;
LAB_7ffc3eb3dd46:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 6) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3ddd1;
LAB_7ffc3eb3dd94:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,5,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3dd94;
LAB_7ffc3eb3ddd1:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 7) goto LAB_7ffc3eb3eed7;
  abStack_60[0] = (byte)((ulonglong)lVar11 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 +
             *(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)) = abStack_60[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb3de5c;
LAB_7ffc3eb3de1f:
    iVar7 = (*(*env)->GetArrayLength)(env,pvVar10);
  }
  else {
    (*(*env)->SetByteArrayRegion)(env,pvVar10,6,1,abStack_60);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb3de1f;
LAB_7ffc3eb3de5c:
    iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar7 < 8) goto LAB_7ffc3eb3eed7;
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
    pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0xaa);
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
LAB_7ffc3eb3e546:
          pJVar18 = *env;
          goto LAB_7ffc3eb3e54c;
        }
        uStack_58 = uVar14;
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba653e);
        lVar11 = FUN_7ffc3eb76c30(env,0x13);
        if ((lVar11 == 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar11,0x14), lVar12 == 0))
        goto LAB_7ffc3eb3e546;
        pvVar15 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar12,pvVar15);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) goto LAB_7ffc3eb3e546;
        if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3e52c;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
        }
        if (iVar7 < 1) {
LAB_7ffc3eb3ef10:
          pJVar18 = *env;
          pcVar19 = (char *)0x7ffc3eba6019;
          pvVar8 = pvRam00007ffc3ebc0a98;
          goto LAB_7ffc3eb3e540;
        }
        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar15);
        pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba652b);
        lVar11 = FUN_7ffc3eb76c30(env,0x14);
        if ((lVar11 == 0) || (lVar12 = FUN_7ffc3eb76c90(env,lVar11,0x15), lVar12 == 0))
        goto LAB_7ffc3eb3e546;
        pvVar15 = (void *)FUN_7ffc3e7d1a80(env,lVar11,lVar12,pvVar15);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 != 0) goto LAB_7ffc3eb3e546;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
        }
        if (iVar7 < 2) goto LAB_7ffc3eb3ef10;
        (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar15);
        pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x15);
        pJVar18 = *env;
        if (pvVar15 == (void *)0x0) goto LAB_7ffc3eb3e54c;
        pvVar17 = (*pJVar18->AllocObject)(env,pvVar15);
        bVar5 = (*(*env)->ExceptionCheck)(env);
        if (bVar5 == 0) {
          pvVar16 = (*(*env)->NewByteArray)(env,8);
          bVar5 = (*(*env)->ExceptionCheck)(env);
          if (bVar5 == 0) {
            if (pvVar17 == (void *)0x0) goto LAB_7ffc3eb3e52c;
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
                if (iVar7 < 3) goto LAB_7ffc3eb3ef10;
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar17);
                pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x27);
                if (pvVar15 != (void *)0x0) {
                  pvVar17 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0xaa);
                  if (pvVar17 == (void *)0x0) {
                    pvVar8 = (*(*env)->ExceptionOccurred)(env);
                    goto LAB_7ffc3eb3e54f;
                  }
                  pvVar15 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar17);
                  bVar5 = (*(*env)->ExceptionCheck)(env);
                  if (bVar5 == 0) {
                    if (pvVar15 == (void *)0x0) goto LAB_7ffc3eb3e52c;
                    lVar11 = FUN_7ffc3eb76c30(env,0x11);
                    if ((lVar11 != 0) && (lVar11 = FUN_7ffc3eb76c90(env,lVar11,0x17), lVar11 != 0))
                    {
                      FUN_7ffc3e7d1a50(env,pvVar15,lVar11,uStack_58,pvVar8);
                      bVar5 = (*(*env)->ExceptionCheck)(env);
                      if (bVar5 == 0) goto LAB_7ffc3eb3e437;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb3e546;
        }
        pvVar8 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        bVar5 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar15);
        if (bVar5 == 0) {
          pJVar18 = *env;
          pcVar19 = (char *)0x7ffc3eba6033;
          pvVar8 = pvRam00007ffc3ebc0a58;
          goto LAB_7ffc3eb3ef05;
        }
LAB_7ffc3eb3e437:
        pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x17);
        pJVar18 = *env;
        if (pvVar15 != (void *)0x0) {
          pvVar17 = (*pJVar18->AllocObject)(env,pvVar15);
          bVar5 = (*(*env)->ExceptionCheck)(env);
          if (bVar5 == 0) {
            if (pvVar17 == (void *)0x0) {
LAB_7ffc3eb3e52c:
              pJVar18 = *env;
              pcVar19 = &DAT_7ffc3eba6000;
              pvVar8 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3e540:
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
                  if (iVar7 < 2) goto LAB_7ffc3eb3ef10;
                  pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar8,1);
                  pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x14);
                  if (pvVar15 != (void *)0x0) {
                    if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb3e52c;
                    bVar5 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar15);
                    if (bVar5 == 0) goto LAB_7ffc3eb3ef2d;
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
                        if (iVar7 < 1) goto LAB_7ffc3eb3ef10;
                        pvVar9 = (*(*env)->GetObjectArrayElement)(env,pvVar8,0);
                        pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x13);
                        if (pvVar15 != (void *)0x0) {
                          if ((pvVar9 != (void *)0x0) &&
                             (bVar5 = (*(*env)->IsInstanceOf)(env,pvVar9,pvVar15), bVar5 == 0)) {
LAB_7ffc3eb3ef2d:
                            pJVar18 = *env;
                            pcVar19 = (char *)0x7ffc3eba6033;
                            pvVar8 = pvRam00007ffc3ebc0a58;
                            goto LAB_7ffc3eb3e540;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar7 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar7 = (*(*env)->GetArrayLength)(env,pvVar8);
                          }
                          if (iVar7 < 3) goto LAB_7ffc3eb3ef10;
                          pvVar8 = (*(*env)->GetObjectArrayElement)(env,pvVar8,2);
                          pvVar17 = (void *)FUN_7ffc3eb76c30(env,0x15);
                          if (pvVar17 != (void *)0x0) {
                            if ((pvVar8 != (void *)0x0) &&
                               (bVar5 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar17), bVar5 == 0))
                            goto LAB_7ffc3eb3ef2d;
                            if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb3e52c;
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
                                                    pvVar8 = (void *)FUN_7ffc3eb76c30(env,0x27);
                                                    if (pvVar8 == (void *)0x0) {
                                                      return 0;
                                                    }
                                                    pvVar9 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,
                                                                                      0xa8);
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
                                                  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb3eef1;
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
                                                    goto LAB_7ffc3eb3edc9;
                                                  }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3eb3eed7;
                                  }
                                  goto LAB_7ffc3eb3eef1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb3e546;
        }
LAB_7ffc3eb3e54c:
        pvVar8 = (*pJVar18->ExceptionOccurred)(env);
      }
LAB_7ffc3eb3e54f:
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
      pvVar15 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
LAB_7ffc3eb3eef1:
  pJVar18 = *env;
  pcVar19 = &DAT_7ffc3eba6000;
  pvVar8 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3ef05:
  (*pJVar18->ThrowNew)(env,pvVar8,pcVar19);
  return 0;
}

/* JNI_dev_krypton_2_c_39 | RVA 0x36ef80 | dev/krypton/2.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong JNI_dev_krypton_2_c_39
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
  
  if (arg3 == (void *)0x0) goto LAB_7ffc3eb3f494;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg3 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg3);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb3f477;
  pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,0);
  pJVar6 = *env;
  if (pvVar4 != (void *)0x0) {
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0a10);
    if (bVar1 == 0) {
LAB_7ffc3eb3f4a6:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6033;
      pvVar4 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb3f0ca;
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
    if (iVar3 < 2) goto LAB_7ffc3eb3f477;
    pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg3,1);
    pJVar6 = *env;
    if (pvVar4 == (void *)0x0) goto LAB_7ffc3eb3f0c3;
    bVar1 = (*pJVar6->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
    if (bVar1 == 0) goto LAB_7ffc3eb3f4a6;
    lVar5 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(env,0x27);
    if (lVar5 == 0) {
      return 0;
    }
    lVar8 = FUN_7ffc3eb76c90(env,lVar5,0x1a9);
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
          goto LAB_7ffc3eb3f494;
        }
      }
LAB_7ffc3eb3f477:
      pJVar6 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb3f0ca;
    }
LAB_7ffc3eb3f494:
    pJVar6 = *env;
  }
LAB_7ffc3eb3f0c3:
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3f0ca:
  (*pJVar6->ThrowNew)(env,pvVar4,arg2_00);
  return 0;
}

/* JNI_dev_krypton_2_c_40 | RVA 0x36f4d0 | dev/krypton/2.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_c_40
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb3fd9a;
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
  if (_DAT_7ffc3ebc0b30 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x27);
    uVar11 = FUN_7ffc3eb76c30(env,0x27);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba606a);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b30 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b30;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eb3fa02:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb3fa30:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3fa02;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb3fa02;
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
                      goto LAB_7ffc3eb3fa36;
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb3fa30;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb3fa36:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
LAB_7ffc3eb3fd9a:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_41 | RVA 0x36fdc0 | dev/krypton/2.a(JJ)I | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int JNI_dev_krypton_2_a_41(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar6 == (void *)0x0) {
    return 0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xab);
  if (pvVar7 == (void *)0x0) {
    return 0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if (bVar2 != 0) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
LAB_7ffc3eb40714:
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
LAB_7ffc3eb3fed4:
        return (int)uVar10;
      }
      pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x27);
      if (pvVar6 == (void *)0x0) {
        return 0;
      }
      pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xac);
      if (pvVar7 == (void *)0x0) {
        return 0;
      }
      pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar6,pvVar7);
      bVar2 = (*(*env)->ExceptionCheck)(env);
      if (bVar2 != 0) {
        return 0;
      }
      if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb40714;
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
          iVar5 = *(int *)(&UNK_7ffc3eb9afb4 + (ulonglong)(uVar15 >> 10 & 0x3f) * 4);
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
            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb406be;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar4 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (*(*env)->GetArrayLength)(env,pvVar6);
            }
            if (((int)uVar15 < 0) || (iVar4 <= (int)uVar15)) goto LAB_7ffc3eb406a4;
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
LAB_7ffc3eb4053e:
                    pvVar6 = (void *)FUN_7ffc3eb76c30(env,0x27);
                    if ((pvVar6 != (void *)0x0) &&
                       (pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar6,0xab), uVar10 = uStack_48,
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
                            if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb40714;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar5 = (*(*env)->GetArrayLength)(env,pvVar6);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar5 <= iStack_90)) goto LAB_7ffc3eb406df;
                            (*(*env)->SetObjectArrayElement)(env,pvVar6,iStack_90,uStack_88);
                            goto LAB_7ffc3eb3fed4;
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
                    if (iVar5 != -1 || uVar15 != 0x80000000) goto LAB_7ffc3eb402ed;
                  }
                  else {
                    iVar5 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = (void *)CONCAT44(uVar14,iVar5);
LAB_7ffc3eb402ed:
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
                  if (((int)uVar3 < 0) || (iVar5 <= (int)uVar3)) goto LAB_7ffc3eb406a4;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar8 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar3 * 4 +
                                     *(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar8 = &uStack_5c;
                    (*(*env)->GetIntArrayRegion)(env,pvVar6,uVar3,1,(int *)puVar8);
                  }
                  uVar3 = *puVar8;
                  if (uVar3 == 0) goto LAB_7ffc3eb4053e;
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
                  if (((int)arg2 < 0) || (iVar5 <= (int)arg2)) goto LAB_7ffc3eb406a4;
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
                    goto LAB_7ffc3eb406d5;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar5 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (*(*ppJStack_58)->GetArrayLength)(ppJStack_58,pvVar7);
                  }
                  bVar2 = bRam00007ffc3ebc08e5;
                  if (((int)uVar15 < 0) || (iVar5 <= (int)uVar15)) goto LAB_7ffc3eb406a4;
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
LAB_7ffc3eb406be:
            pJVar9 = *env;
            pcVar13 = &DAT_7ffc3eba6000;
            pvVar6 = pvRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3eb406d5;
        }
        goto LAB_7ffc3eb3fed4;
      }
    }
LAB_7ffc3eb406df:
    pJVar9 = *env;
    pcVar13 = (char *)0x7ffc3eba6019;
    pvVar6 = pvRam00007ffc3ebc0a98;
  }
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
LAB_7ffc3eb406a4:
  pJVar9 = *env;
  pcVar13 = (char *)0x7ffc3eba6019;
  pvVar6 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eb406d5:
  (*pJVar9->ThrowNew)(env,pvVar6,pcVar13);
  return 0;
}

/* JNI_dev_krypton_2_a_42 | RVA 0x370760 | dev/krypton/2.a()V | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_2_a_42(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xac);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar4);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f2a);
  if (pvVar4 == (void *)0x0) goto LAB_7ffc3eb4579e;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
  }
  if (0 < iVar2) {
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f38);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (1 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar5);
      pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f48);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
      }
      if (2 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar5);
        pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0960,0xc);
        if (pvVar5 == (void *)0x0) {
          return;
        }
        pvVar5 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0960,pvVar5);
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
          (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar5);
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xab);
          if (pvVar5 == (void *)0x0) {
            return;
          }
          pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba65aa);
          if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb4579e;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
          }
          if (3 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar6,3,pvVar7);
            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f5c);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (4 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,4,pvVar6);
              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f70);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (5 < iVar2) {
                (*(*env)->SetObjectArrayElement)(env,pvVar4,5,pvVar6);
                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f7f);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                }
                if (6 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar4,6,pvVar6);
                  pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0f8e);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                  }
                  if (7 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar4,7,pvVar6);
                    pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0fa1);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                    }
                    if (8 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,8,pvVar6);
                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0fb0);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                      }
                      if (9 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar4,9,pvVar6);
                        pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0fc4);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                        }
                        if (10 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar4,10,pvVar6);
                          pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0fe9);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                          }
                          if (0xb < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0xb,pvVar6);
                            pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb0ffc);
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                              + (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                            }
                            if (0xc < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar4,0xc,pvVar6);
                              pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb1018);
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
                                pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb1027);
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
                                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a10,5);
                                  if (pvVar6 == (void *)0x0) {
                                    return;
                                  }
                                  pvVar6 = (*(*env)->GetStaticObjectField)
                                                     (env,pvRam00007ffc3ebc0a10,pvVar6);
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
                                    pvVar7 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6575);
                                    if (pvVar6 == (void *)0x0) {
LAB_7ffc3eb4579e:
                                      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                                      arg2 = &DAT_7ffc3eba6000;
                                      pvVar3 = pvRam00007ffc3ebc0a70;
                                      goto LAB_7ffc3eb45778;
                                    }
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar2 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
                                    }
                                    if (0xf < iVar2) {
                                      (*(*env)->SetObjectArrayElement)(env,pvVar6,0xf,pvVar7);
                                      pvVar6 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb103b);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                      }
                                      if (0x10 < iVar2) {
                                        (*(*env)->SetObjectArrayElement)(env,pvVar4,0x10,pvVar6);
                                        pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvRam00007ffc3ebc0a08,
                                                                          0xd);
                                        if (pvVar6 == (void *)0x0) {
                                          return;
                                        }
                                        pvVar6 = (*(*env)->GetStaticObjectField)
                                                           (env,pvRam00007ffc3ebc0a08,pvVar6);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 != 0) {
                                          return;
                                        }
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)
                                                            ((ulonglong)pvVar4 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
                                        }
                                        if (0x11 < iVar2) {
                                          (*(*env)->SetObjectArrayElement)(env,pvVar4,0x11,pvVar6);
                                          pvVar6 = (*(*env)->GetStaticObjectField)
                                                             (env,pvVar3,pvVar5);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 != 0) {
                                            return;
                                          }
                                          pvVar7 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3eba65f0);
                                          if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb4579e;
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
                                            (*(*env)->SetObjectArrayElement)(env,pvVar6,0x11,pvVar7)
                                            ;
                                            pvVar6 = (*(*env)->NewStringUTF)
                                                               (env,(char *)0x7ffc3ebb104c);
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
                                                                 (env,(char *)0x7ffc3ebb105b);
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
                                                                   (env,(char *)0x7ffc3ebb106a);
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
                                                                     (env,(char *)0x7ffc3ebb107e);
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
                                                                       (env,(char *)0x7ffc3ebb1092);
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
                                                                         (env,(char *)0x7ffc3ebb10aa
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
                                                  0x7ffc3ebb10be);
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
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb10d2);
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
                                                    if (0x19 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x19,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb10e2
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
                                                                  (env,pvVar4,0x1a,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1101);
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
                                                              (env,pvVar4,0x1b,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1113);
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
                                                                (env,pvVar4,0x1c,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1127
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
                                                                  (env,pvVar4,0x1d,pvVar6);
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
                                                  if (0x1e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x1e,pvVar6);
                                                    pvVar6 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar3,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 != 0) {
                                                      return;
                                                    }
                                                    pvVar7 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3eba6786);
                                                    if (pvVar6 == (void *)0x0)
                                                    goto LAB_7ffc3eb4579e;
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
                                                    if (0x1e < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar6,0x1e,pvVar7);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1138
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
                                                                  (env,pvVar4,0x1f,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1147);
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
                                                              (env,pvVar4,0x20,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb115b);
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
                                                                (env,pvVar4,0x21,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb116a
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
                                                                  (env,pvVar4,0x22,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1180);
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
                                                              (env,pvVar4,0x23,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb118f);
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
                                                                (env,pvVar4,0x24,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb11a3
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
                                                                  (env,pvVar4,0x25,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb11b7);
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
                                                              (env,pvVar4,0x26,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb11cb);
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
                                                                (env,pvVar4,0x27,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb11df
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
                                                                  (env,pvVar4,0x28,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb11f3);
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
                                                              (env,pvVar4,0x29,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1207);
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
                                                                (env,pvVar4,0x2a,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb121b
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
                                                                  (env,pvVar4,0x2b,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb121e);
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
                                                              (env,pvVar4,0x2c,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1232);
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
                                                                (env,pvVar4,0x2d,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1243
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
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x2e,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1246);
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
                                                  if (0x2f < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x2f,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb125a);
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
                                                    if (0x30 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x30,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb126f
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
                                                      if (0x31 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x31,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1283);
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
                                                  if (0x32 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x32,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1292);
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
                                                    if (0x33 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x33,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb12a7
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
                                                      if (0x34 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x34,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb12aa);
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
                                                  if (0x35 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x35,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb12bb);
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
                                                    if (0x36 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x36,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb12ce
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
                                                      if (0x37 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x37,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb12f1);
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
                                                  if (0x38 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x38,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb130a);
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
                                                    if (0x39 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x39,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb131e
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
                                                      if (0x3a < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x3a,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb132e);
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
                                                  if (0x3b < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x3b,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1343);
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
                                                    if (0x3c < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x3c,pvVar6);
                                                      pvVar6 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1357
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
                                                      if (0x3d < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x3d,pvVar6);
                                                        pvVar6 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb136b);
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
                                                  if (0x3e < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x3e,pvVar6);
                                                    pvVar6 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb136e);
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
                                                    if (0x3f < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x3f,pvVar6);
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
                                                  if (0x40 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x40,pvVar6);
                                                    pvVar3 = (*(*env)->GetStaticObjectField)
                                                                       (env,pvVar3,pvVar5);
                                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                                    if (bVar1 != 0) {
                                                      return;
                                                    }
                                                    pvVar5 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebab7ae);
                                                    if (pvVar3 == (void *)0x0)
                                                    goto LAB_7ffc3eb4579e;
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
                                                    if (0x40 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar3,0x40,pvVar5);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb137d
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
                                                  0x7ffc3ebb1391);
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
                                                                       (env,(char *)0x7ffc3ebb13a0);
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
                                                                         (env,(char *)0x7ffc3ebb13b4
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
                                                  0x7ffc3ebb13c8);
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
                                                                       (env,(char *)0x7ffc3ebb13cc);
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
                                                                         (env,(char *)0x7ffc3ebb13e0
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
                                                  0x7ffc3ebb13f4);
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
                                                                       (env,(char *)0x7ffc3ebb13f7);
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
                                                                         (env,(char *)0x7ffc3ebb140b
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
                                                  0x7ffc3ebb141a);
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
                                                                       (env,(char *)0x7ffc3ebb142e);
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
                                                                         (env,(char *)0x7ffc3ebb1443
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
                                                  0x7ffc3ebb1457);
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
                                                                       (env,(char *)0x7ffc3ebb1470);
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
                                                                         (env,(char *)0x7ffc3ebb1484
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
                                                  0x7ffc3ebb1494);
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
                                                                       (env,(char *)0x7ffc3ebb14ab);
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
                                                                         (env,(char *)0x7ffc3ebb14c2
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
                                                  0x7ffc3ebb14d6);
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
                                                                       (env,(char *)0x7ffc3ebb14eb);
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
                                                                         (env,(char *)0x7ffc3ebb14ff
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
                                                  0x7ffc3ebb1513);
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
                                                                       (env,(char *)0x7ffc3ebb1527);
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
                                                                         (env,(char *)0x7ffc3ebb153f
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
                                                  0x7ffc3ebb155d);
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
                                                                       (env,(char *)0x7ffc3ebb1574);
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
                                                                         (env,(char *)0x7ffc3ebb159d
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
                                                  0x7ffc3ebb15b5);
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
                                                                       (env,(char *)0x7ffc3ebb15dc);
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
                                                                         (env,(char *)0x7ffc3ebb1604
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
                                                  0x7ffc3ebb161c);
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
                                                                       (env,(char *)0x7ffc3ebb1641);
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
                                                                         (env,(char *)0x7ffc3ebb165f
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
                                                  0x7ffc3ebb1684);
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
                                                                       (env,(char *)0x7ffc3ebb16a9);
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
                                                                         (env,(char *)0x7ffc3ebb16c6
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
                                                  0x7ffc3ebb16f5);
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
                                                                       (env,(char *)0x7ffc3ebb171a);
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
                                                                         (env,(char *)0x7ffc3ebb173c
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
                                                  0x7ffc3ebb1754);
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
                                                                       (env,(char *)0x7ffc3ebb176d);
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
                                                                         (env,(char *)0x7ffc3ebb1797
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
                                                  0x7ffc3ebb17bc);
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
                                                                       (env,(char *)0x7ffc3ebb17de);
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
                                                                         (env,(char *)0x7ffc3ebb1804
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
                                                  0x7ffc3ebb1824);
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
                                                                       (env,(char *)0x7ffc3ebb183b);
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
                                                                         (env,(char *)0x7ffc3ebb1860
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
                                                  0x7ffc3ebb189d);
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
                                                                       (env,(char *)0x7ffc3ebb18c5);
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
                                                                         (env,(char *)0x7ffc3ebb18e1
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
                                                  0x7ffc3ebb1908);
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
                                                                       (env,(char *)0x7ffc3ebb192d);
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
                                                                         (env,(char *)0x7ffc3ebb194e
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
                                                  0x7ffc3ebb1965);
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
                                                                       (env,(char *)0x7ffc3ebb197d);
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
                                                                         (env,(char *)0x7ffc3ebb1994
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
                                                  0x7ffc3ebb19ac);
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
                                                                       (env,(char *)0x7ffc3ebb19d4);
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
                                                                         (env,(char *)0x7ffc3ebb19fa
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
                                                  0x7ffc3ebb1a1a);
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
                                                                       (env,(char *)0x7ffc3ebb1a3f);
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
                                                                         (env,(char *)0x7ffc3ebb1a6e
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
                                                  0x7ffc3ebb1a8d);
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
                                                                       (env,(char *)0x7ffc3ebb1aa7);
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
                                                                         (env,(char *)0x7ffc3ebb1acd
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
                                                  0x7ffc3ebb1ae9);
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
                                                                       (env,(char *)0x7ffc3ebb1b0e);
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
                                                                         (env,(char *)0x7ffc3ebb1b33
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
                                                  0x7ffc3ebb1b59);
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
                                                                       (env,(char *)0x7ffc3ebb1b82);
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
                                                                         (env,(char *)0x7ffc3ebb1baf
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
                                                  0x7ffc3ebb1bd4);
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
                                                                       (env,(char *)0x7ffc3ebb1c0c);
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
                                                                         (env,(char *)0x7ffc3ebb1c23
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
                                                  0x7ffc3ebb1c48);
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
                                                                       (env,(char *)0x7ffc3ebb1c6d);
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
                                                                         (env,(char *)0x7ffc3ebb1c91
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
                                                  0x7ffc3ebb1cb8);
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
                                                                       (env,(char *)0x7ffc3ebb1cdd);
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
                                                                         (env,(char *)0x7ffc3ebb1d02
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
                                                  0x7ffc3ebb1d27);
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
                                                                       (env,(char *)0x7ffc3ebb1d4c);
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
                                                                         (env,(char *)0x7ffc3ebb1d71
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
                                                  0x7ffc3ebb1d96);
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
                                                                       (env,(char *)0x7ffc3ebb1dbb);
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
                                                                         (env,(char *)0x7ffc3ebb1dde
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
                                                  0x7ffc3ebb1e04);
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
                                                                       (env,(char *)0x7ffc3ebb1e1b);
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
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x9a,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1e48
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
                                                      if (0x9b < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x9b,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1e6e);
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
                                                  if (0x9c < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x9c,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1e94);
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
                                                    if (0x9d < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0x9d,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1ebd
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
                                                      if (0x9e < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0x9e,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1ed5);
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
                                                  if (0x9f < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0x9f,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1efe);
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
                                                    if (0xa0 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xa0,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1f2e
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
                                                      if (0xa1 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xa1,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1f60);
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
                                                  if (0xa2 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xa2,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1f77);
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
                                                    if (0xa3 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xa3,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb1f9d
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
                                                      if (0xa4 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xa4,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb1fbe);
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
                                                  if (0xa5 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xa5,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb1feb);
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
                                                    if (0xa6 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xa6,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2013
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
                                                      if (0xa7 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xa7,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2038);
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
                                                  if (0xa8 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xa8,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb205d);
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
                                                    if (0xa9 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xa9,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2075
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
                                                      if (0xaa < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xaa,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb2094);
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
                                                  if (0xab < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xab,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb20ac);
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
                                                    if (0xac < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xac,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb20d2
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
                                                      if (0xad < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xad,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb20f7);
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
                                                  if (0xae < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xae,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb211d);
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
                                                    if (0xaf < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xaf,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2143
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
                                                      if (0xb0 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xb0,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb215b);
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
                                                  if (0xb1 < iVar2) {
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xb1,pvVar3);
                                                    pvVar3 = (*(*env)->NewStringUTF)
                                                                       (env,(char *)0x7ffc3ebb2172);
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
                                                    if (0xb2 < iVar2) {
                                                      (*(*env)->SetObjectArrayElement)
                                                                (env,pvVar4,0xb2,pvVar3);
                                                      pvVar3 = (*(*env)->NewStringUTF)
                                                                         (env,(char *)0x7ffc3ebb2198
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
                                                      if (0xb3 < iVar2) {
                                                        (*(*env)->SetObjectArrayElement)
                                                                  (env,pvVar4,0xb3,pvVar3);
                                                        pvVar3 = (*(*env)->NewStringUTF)
                                                                           (env,(char *)
                                                  0x7ffc3ebb21bc);
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
                                                  if (0xb4 < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb45759. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                    (*(*env)->SetObjectArrayElement)
                                                              (env,pvVar4,0xb4,pvVar3);
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
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
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
LAB_7ffc3eb45778:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb4578a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_2_b_43 | RVA 0x3757c0 | dev/krypton/2.b(JJ)Ljava/lang/Class; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_b_43(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar3 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar4 = FUN_7ffc3eb76c90(env,pvVar3,0x1aa);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar3,lVar4,arg0,arg1);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xac);
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
      goto LAB_7ffc3eb45c66;
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
      goto LAB_7ffc3eb45c66;
    }
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x27);
    if (pvVar3 == (void *)0x0) {
LAB_7ffc3eb45b2a:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xab);
      pJVar7 = *env;
      if (pvVar5 != (void *)0x0) {
        pvVar5 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar5 == (void *)0x0) {
LAB_7ffc3eb45b10:
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
                  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xac);
                  pJVar7 = *env;
                  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb45b0a;
                  pvVar3 = (*pJVar7->GetStaticObjectField)(env,pvVar3,pvVar6);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    if (pvVar3 == (void *)0x0) goto LAB_7ffc3eb45b10;
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
                    goto LAB_7ffc3eb45af0;
                  }
                }
              }
              goto LAB_7ffc3eb45b2a;
            }
LAB_7ffc3eb45af0:
            pJVar7 = *env;
            pcVar9 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
        }
        goto LAB_7ffc3eb45b2a;
      }
LAB_7ffc3eb45b0a:
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
LAB_7ffc3eb45c66:
  (*pJVar7->ThrowNew)(env,pvVar3,pcVar9);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_44 | RVA 0x375c80 | dev/krypton/2.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_44
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
LAB_7ffc3eb45ee1:
          pcStack_50 = &DAT_7ffc3eba6000;
          puVar8 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eb45efd;
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
        if (lVar6 == 0) goto LAB_7ffc3eb45ee1;
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
LAB_7ffc3eb45efd:
  (*(*env)->ThrowNew)(env,(void *)*puVar8,pcStack_50);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_b_45 | RVA 0x375f30 | dev/krypton/2.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_b_45
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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x27);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1ab), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x27);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1ac);
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

/* JNI_dev_krypton_2_c_46 | RVA 0x376160 | dev/krypton/2.c(JJ)Ljava/lang/reflect/Field; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_c_46(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar4 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar5 = FUN_7ffc3eb76c90(env,pvVar4,0x1aa);
  if (lVar5 == 0) {
    return (void *)0x0;
  }
  arg2 = FUN_7ffc3e7db1e0(env,pvVar4,lVar5,arg0,arg1);
  uVar16 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xac);
  if (pvVar6 == (void *)0x0) {
    return (void *)0x0;
  }
  pvVar6 = (*(*env)->GetStaticObjectField)(env,pvVar4,pvVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb46e90;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar6 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (*(*env)->GetArrayLength)(env,pvVar6);
  }
  if ((arg2 < 0) || (iVar2 <= arg2)) goto LAB_7ffc3eb46e76;
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
    goto LAB_7ffc3eb46ea4;
  }
  pvVar6 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xab);
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
LAB_7ffc3eb46e76:
      pJVar14 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar4 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb46ea4;
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
      lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x1ad);
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
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
      lVar8 = lVar10;
      if (pvVar4 == (void *)0x0) {
        return (void *)0x0;
      }
      while( true ) {
        lVar9 = FUN_7ffc3eb76c90(env,pvVar4,0x1ab);
        if (lVar9 == 0) {
          return (void *)0x0;
        }
        pvVar6 = (void *)FUN_7ffc3e7d1a80(env,pvVar4,lVar9,lVar8,uVar7,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        if (pvVar6 != (void *)0x0) break;
        if (lVar8 == 0) goto LAB_7ffc3eb46e90;
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
            if (iVar3 <= iVar2) goto LAB_7ffc3eb46e76;
            pvVar6 = (*(*env)->GetObjectArrayElement)(env,pvVar4,iVar2);
            pvVar15 = (void *)FUN_7ffc3eb76c30(env,0x27);
            if (pvVar15 == (void *)0x0) {
              return (void *)0x0;
            }
            lVar9 = FUN_7ffc3eb76c90(env,pvVar15,0x1ac);
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
              pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar15,0xac);
              if (pvVar4 == (void *)0x0) {
                return (void *)0x0;
              }
              pvVar4 = (*(*env)->GetStaticObjectField)(env,pvVar15,pvVar4);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return (void *)0x0;
              }
              if (pvVar4 == (void *)0x0) goto LAB_7ffc3eb46e90;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
              }
              if (iVar2 <= arg2) goto LAB_7ffc3eb46e76;
              pJVar14 = *env;
              goto LAB_7ffc3eb46a57;
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
        if (lVar9 == 0) goto LAB_7ffc3eb46e90;
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
          goto LAB_7ffc3eb46e90;
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
          lVar8 = FUN_7ffc3eb76c30(env,0x27);
          if (lVar8 == 0) {
            return (void *)0x0;
          }
          lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x1ad);
          if (lVar9 == 0) {
            return (void *)0x0;
          }
          lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9,0x41e5a91f50cc6,0);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
        }
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar4 == (void *)0x0) {
          return (void *)0x0;
        }
      }
      pvVar15 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0xac);
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
LAB_7ffc3eb46a57:
          (*pJVar14->SetObjectArrayElement)(env,pvVar4,arg2,pvVar6);
          return pvVar6;
        }
        goto LAB_7ffc3eb46e76;
      }
    }
  }
LAB_7ffc3eb46e90:
  pJVar14 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb46ea4:
  (*pJVar14->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_47 | RVA 0x376eb0 | dev/krypton/2.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_47
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
LAB_7ffc3eb472da:
          pcStack_68 = &DAT_7ffc3eba6000;
          puVar10 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eb472e8;
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
        if (lVar7 == 0) goto LAB_7ffc3eb472da;
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
            if (pvVar9 == (void *)0x0) goto LAB_7ffc3eb472da;
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
                if (iVar4 <= iVar3) goto LAB_7ffc3eb472cc;
                arg1_01 = (*(*env)->GetObjectArrayElement)(env,pvVar9,iVar3);
                if (arg4 == (void *)0x0) goto LAB_7ffc3eb472da;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (*(*env)->GetArrayLength)(env,arg4);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3eb472cc;
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
LAB_7ffc3eb472cc:
      puVar10 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3eb472e8:
  (*(*env)->ThrowNew)(env,(void *)*puVar10,pcStack_68);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_b_48 | RVA 0x377310 | dev/krypton/2.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_b_48
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
  
  lVar3 = FUN_7ffc3eb76c30(env,0x27);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1ae), lVar4 != 0)) {
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
          lVar3 = FUN_7ffc3eb76c30(env,0x27);
          if (lVar3 == 0) {
            return (void *)0x0;
          }
          lVar4 = FUN_7ffc3eb76c90(env,lVar3,0x1af);
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

/* JNI_dev_krypton_2_d_49 | RVA 0x377580 | dev/krypton/2.d(JJ)Ljava/lang/reflect/Method; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_d_49(JNINativeInterface_ **env,void *receiver,longlong arg0,longlong arg1)

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
  
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x27);
  if (pvVar5 == (void *)0x0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3eb76c90(env,pvVar5,0x1aa);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7db1e0(env,pvVar5,lVar6,arg0,arg1);
  uVar19 = (undefined4)((ulonglong)arg1 >> 0x20);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xac);
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
LAB_7ffc3eb487c7:
      pJVar16 = *env;
      arg2_00 = (char *)0x7ffc3eba6019;
      pvVar5 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb487df;
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
      goto LAB_7ffc3eb487df;
    }
    pvVar7 = (void *)FUN_7ffc3eb76ce0(env,pvVar5,0xab);
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
      if (iVar3 <= iVar2) goto LAB_7ffc3eb487c7;
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
        lVar9 = FUN_7ffc3eb76c90(env,pvVar5,0x1ad);
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
            lVar6 = FUN_7ffc3eb76c30(env,0x27);
            if (lVar6 == 0) {
              return (void *)0x0;
            }
            lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x1ad);
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
              if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb487b1;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar18 = *(int *)(*(longlong *)((ulonglong)pvVar5 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar18 = (*(*env)->GetArrayLength)(env,pvVar5);
              }
              if (iVar18 <= (int)arg2) goto LAB_7ffc3eb487c7;
              (*(*env)->SetObjectArrayElement)(env,pvVar5,arg2,arg3);
            }
            arg2 = arg2 + 1;
            lVar6 = lVar9;
          } while (~uVar17 != arg2);
LAB_7ffc3eb47c30:
          pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x27);
          if (pvVar7 == (void *)0x0) {
            return (void *)0x0;
          }
          lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x1ae);
          if (lVar10 == 0) {
            return (void *)0x0;
          }
          pvVar13 = (void *)FUN_7ffc3e7d1a80(env,pvVar7,lVar10,lVar6,uVar8,arg3,iVar3,pvVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return (void *)0x0;
          }
          if (pvVar13 != (void *)0x0) {
            pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xac);
            if (pvVar5 == (void *)0x0) {
              return (void *)0x0;
            }
            pJVar16 = *env;
LAB_7ffc3eb481b1:
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
              goto LAB_7ffc3eb487c7;
            }
            goto LAB_7ffc3eb487b1;
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
              if (iVar4 == 0) goto code_r0x7ffc3eb47d6e;
              goto joined_r0x7ffc3eb47e31;
            }
          }
          goto LAB_7ffc3eb487b1;
        }
        arg2_00 = (char *)0x7ffc3eba6048;
        pvVar5 = pvRam00007ffc3ebc0a80;
        goto LAB_7ffc3eb487df;
      }
    }
  }
  goto LAB_7ffc3eb487b1;
code_r0x7ffc3eb47d6e:
  lVar14 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc09a0,0x41);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,lVar6,lVar14);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto code_r0x7ffc3eb47dbc;
  goto LAB_7ffc3eb47c30;
code_r0x7ffc3eb47dbc:
  lVar6 = FUN_7ffc3eb76c30(env,0x27);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar14 = FUN_7ffc3eb76c90(env,lVar6,0x1ad);
  if (lVar14 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7d1a80(env,lVar6,lVar14,0x41e5a91f50cc6,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
joined_r0x7ffc3eb47e31:
  do {
    if (lVar10 == 0) goto LAB_7ffc3eb487b1;
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
        if (iVar18 <= iVar4) goto LAB_7ffc3eb487c7;
        pvVar13 = (*(*env)->GetObjectArrayElement)(env,pvVar15,iVar4);
        pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x27);
        if (pvVar7 == (void *)0x0) {
          return (void *)0x0;
        }
        lVar6 = FUN_7ffc3eb76c90(env,pvVar7,0x1af);
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
          pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar7,0xac);
          if (pvVar5 == (void *)0x0) {
            return (void *)0x0;
          }
          pJVar16 = *env;
          goto LAB_7ffc3eb481b1;
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
    if (lVar6 == 0) goto LAB_7ffc3eb487b1;
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
      if (pvVar13 == (void *)0x0) goto LAB_7ffc3eb487b1;
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
      if (lVar10 == 0) goto LAB_7ffc3eb487b1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar10,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eb487b1;
      lVar10 = FUN_7ffc3eb76c90(env,pvVar7,0x44);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (arg3 == (void *)0x0) goto LAB_7ffc3eb487b1;
      uVar11 = FUN_7ffc3e7d1a50(env,arg3,lVar14);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eb487b1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar11);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eb487b1;
      lVar9 = FUN_7ffc3e7d1a50(env,lVar9,lVar10,0x20);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar9 == 0) goto LAB_7ffc3eb487b1;
      lVar6 = FUN_7ffc3e7d1a50(env,lVar9,lVar6,uVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (lVar6 == 0) goto LAB_7ffc3eb487b1;
      FUN_7ffc3e7d1a50(env,lVar6,lVar10,0x28);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
      if (uVar17 == 0xfffffffe) goto LAB_7ffc3eb48508;
      if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb487b1;
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
      lVar6 = FUN_7ffc3eb76c30(env,0x27);
      if (lVar6 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3eb76c90(env,lVar6,0x1ad);
      if (lVar10 == 0) {
        return (void *)0x0;
      }
      lVar10 = FUN_7ffc3e7d1a80(env,lVar6,lVar10,0x41e5a91f50cc6,0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return (void *)0x0;
      }
    }
  } while( true );
  while( true ) {
    pvVar7 = (*(*env)->GetObjectArrayElement)(env,pvVar5,iVar4);
    if (pvVar7 == (void *)0x0) goto LAB_7ffc3eb487b1;
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
    if (iVar18 <= iVar4) goto LAB_7ffc3eb487c7;
  }
LAB_7ffc3eb48508:
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
LAB_7ffc3eb487b1:
  pJVar16 = *env;
  arg2_00 = &DAT_7ffc3eba6000;
  pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb487df:
  (*pJVar16->ThrowNew)(env,pvVar5,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_50 | RVA 0x378810 | dev/krypton/2.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_50
                 (JNINativeInterface_ **env,void *receiver,void *arg0,void *arg1,void *arg2,
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
  
  if (arg2 == (void *)0x0) goto LAB_7ffc3eb49619;
  lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return (void *)0x0;
  }
  iVar2 = FUN_7ffc3e7d8be0(env,arg2,lVar4,0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (((iVar2 - 0x56U < 0x1b) && ((0x6000001U >> (iVar2 - 0x56U & 0x1f) & 1) != 0)) ||
     (iVar2 == 0xd3)) {
    lVar4 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x1b0), lVar5 == 0))
    goto LAB_7ffc3eb48fba;
    lVar4 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb48fba;
    if (lVar4 == 0) goto LAB_7ffc3eb49014;
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x4e), lVar6 != 0)) {
      uVar7 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x34), lVar6 != 0)) {
        uVar8 = FUN_7ffc3e7d1a50(env,lVar4,lVar6);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if ((bVar1 == 0) && (lVar5 = FUN_7ffc3eb76c90(env,lVar5,0x36), lVar5 != 0)) {
          uVar9 = FUN_7ffc3e7d1a50(env,lVar4,lVar5);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (iVar2 == 0x56) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eb49014;
              uVar15 = 0x51;
            }
            else if (iVar2 == 0x6f) {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eb49014;
              uVar15 = 0x50;
            }
            else if (iVar2 == 0x70) {
              if (arg0 == (void *)0x0) {
LAB_7ffc3eb49014:
                (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3eb4902e;
              }
              uVar15 = 0x4f;
            }
            else {
              if (arg0 == (void *)0x0) goto LAB_7ffc3eb49014;
              uVar15 = 0x52;
            }
            lVar5 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
            if (lVar5 == 0) goto LAB_7ffc3eb4902e;
            uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar5,uVar7,uVar8,uVar9);
            uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) goto LAB_7ffc3eb4902e;
            lVar5 = 0;
LAB_7ffc3eb48cf9:
            if (arg3 == (void *)0x0) {
              (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eb490c3:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            else {
              lVar6 = FUN_7ffc3eb76c30(env,0x19);
              if ((lVar6 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar6,0x24), lVar6 == 0))
              goto LAB_7ffc3eb490c3;
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
                        pvVar11 = (*(*env)->GetStaticObjectField)(env,pvRam00007ffc3ebc0958,pvVar11)
                        ;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar3 = (*(*env)->GetArrayLength)(env,pvVar10);
                          }
                          if (iVar3 < 2) goto LAB_7ffc3eb48ff7;
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar11);
                          lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a78,0x21);
                          if (lVar6 != 0) {
                            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a78,lVar6,uVar7,
                                                               CONCAT44(uVar16,iVar2 + -2),pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              return pvVar10;
                            }
                          }
                        }
                        goto LAB_7ffc3eb4910e;
                      }
LAB_7ffc3eb48ff7:
                      pJVar13 = *env;
                      arg2_00 = (char *)0x7ffc3eba6019;
                      pvVar10 = pvRam00007ffc3ebc0a98;
                    }
                    (*pJVar13->ThrowNew)(env,pvVar10,arg2_00);
                  }
                }
              }
LAB_7ffc3eb4910e:
              pvVar10 = (*(*env)->ExceptionOccurred)(env);
              pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
              bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
            }
            goto joined_r0x7ffc3eb49099;
          }
        }
      }
    }
LAB_7ffc3eb4902e:
    pvVar10 = (*(*env)->ExceptionOccurred)(env);
    pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
    lVar5 = 0;
    if (bVar1 == 0) {
      return (void *)0x0;
    }
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(env,0x27);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(env,lVar4,0x1b1), lVar5 == 0)) {
LAB_7ffc3eb48fba:
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      lVar5 = 0;
      if (bVar1 == 0) {
        return (void *)0x0;
      }
    }
    else {
      lVar5 = FUN_7ffc3e7d1a80(env,lVar4,lVar5,arg4,arg5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3eb48fba;
      if (lVar5 == 0) {
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eb49168:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
joined_r0x7ffc3eb49099:
        if (bVar1 == 0) {
          return (void *)0x0;
        }
        goto LAB_7ffc3eb4919e;
      }
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x54), lVar6 == 0))
      goto LAB_7ffc3eb49168;
      uVar7 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x47), lVar6 == 0))
      goto LAB_7ffc3eb49168;
      uVar8 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x48), lVar6 == 0))
      goto LAB_7ffc3eb49168;
      uVar9 = FUN_7ffc3e7d1a50(env,lVar5,lVar6);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) || (lVar4 = FUN_7ffc3eb76c90(env,lVar4,0x49), lVar4 == 0)) {
LAB_7ffc3eb49069:
        pvVar10 = (*(*env)->ExceptionOccurred)(env);
        pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
        lVar4 = 0;
        goto joined_r0x7ffc3eb49099;
      }
      uVar15 = FUN_7ffc3e7d1a50(env,lVar5,lVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 != 0) ||
         ((lVar4 = FUN_7ffc3eb76c30(env,0x19), lVar4 == 0 ||
          (lVar6 = FUN_7ffc3eb76c90(env,lVar4,0x55), lVar6 == 0)))) goto LAB_7ffc3eb49069;
      uVar9 = FUN_7ffc3e7d1a80(env,lVar4,lVar6,uVar9,uVar15);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3eb49069;
      if (iVar2 == 0xd4) {
        if (arg0 == (void *)0x0) goto LAB_7ffc3eb49635;
        uVar15 = 0x57;
LAB_7ffc3eb48f43:
        lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,uVar15);
joined_r0x7ffc3eb48f76:
        if (lVar4 != 0) {
          uVar7 = FUN_7ffc3e7d1a50(env,arg0,lVar4,uVar7,uVar8,uVar9);
          uVar16 = (undefined4)((ulonglong)uVar8 >> 0x20);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            lVar4 = 0;
            goto LAB_7ffc3eb48cf9;
          }
        }
      }
      else {
        if (iVar2 == 0x53) {
          if (arg0 != (void *)0x0) {
            uVar15 = 0x56;
            goto LAB_7ffc3eb48f43;
          }
        }
        else if (arg0 != (void *)0x0) {
          lVar4 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a90,0x58);
          goto joined_r0x7ffc3eb48f76;
        }
LAB_7ffc3eb49635:
        (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      }
      pvVar10 = (*(*env)->ExceptionOccurred)(env);
      pvVar11 = (void *)FUN_7ffc3eb76c30(env,8);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar10,pvVar11);
      if (bVar1 == 0) {
        return (void *)0x0;
      }
    }
    lVar4 = 0;
  }
LAB_7ffc3eb4919e:
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
  if (pvVar12 == (void *)0x0) goto LAB_7ffc3eb49619;
  lVar6 = FUN_7ffc3eb76c90(env,pvVar11,0x28);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  FUN_7ffc3e7dbbc0(env,pvVar12,pvVar11,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (pvVar10 == (void *)0x0) goto LAB_7ffc3eb49619;
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc09e0,0x59);
  if (lVar6 == 0) {
    return (void *)0x0;
  }
  lVar6 = FUN_7ffc3e7d1a50(env,pvVar10,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar6 == 0) goto LAB_7ffc3eb49619;
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
  if (lVar14 == 0) goto LAB_7ffc3eb49619;
  lVar6 = FUN_7ffc3e7d1a50(env,lVar14,lVar6,pvVar11);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return (void *)0x0;
  }
  if (lVar4 == 0) {
    if (lVar5 != 0) {
      lVar4 = FUN_7ffc3eb76c30(env,0x1d);
      if (lVar4 == 0) {
        return (void *)0x0;
      }
      lVar14 = FUN_7ffc3eb76c90(env,lVar4,0x5b);
      lVar4 = lVar5;
      goto joined_r0x7ffc3eb493cd;
    }
    pvVar11 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba7178);
  }
  else {
    lVar5 = FUN_7ffc3eb76c30(env,0x1b);
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    lVar14 = FUN_7ffc3eb76c90(env,lVar5,0x5a);
joined_r0x7ffc3eb493cd:
    if (lVar14 == 0) {
      return (void *)0x0;
    }
    pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar4,lVar14);
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
LAB_7ffc3eb49619:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_a_51 | RVA 0x379690 | dev/krypton/2.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_a_51
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
  
  if (arg4 == (void *)0x0) goto LAB_7ffc3eb49ad6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3eb49711:
    iVar2 = *(int *)(*(longlong *)((ulonglong)arg4 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg4);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3eb49711;
    iVar2 = (*(*env)->GetArrayLength)(env,arg4);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3eb49ab9:
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
LAB_7ffc3eb49ae8:
        pJVar7 = *env;
        arg2_00 = (char *)0x7ffc3eba6033;
        pvVar4 = pvRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb49825;
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
      if (iVar2 < iVar3) goto LAB_7ffc3eb49ab9;
      pvVar4 = (*(*env)->GetObjectArrayElement)(env,arg4,iVar3 + -1);
      pJVar7 = *env;
      if (pvVar4 != (void *)0x0) {
        bVar1 = (*pJVar7->IsInstanceOf)(env,pvVar4,pvRam00007ffc3ebc0958);
        if (bVar1 == 0) goto LAB_7ffc3eb49ae8;
        uVar8 = FUN_7ffc3e7d1a20(env,pvVar4,lVar5);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return (void *)0x0;
        }
        lVar5 = FUN_7ffc3eb76c30(env,0x27);
        if (lVar5 == 0) {
          return (void *)0x0;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar5,0x1b2);
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
            goto LAB_7ffc3eb4981e;
          }
        }
LAB_7ffc3eb49ad6:
        pJVar7 = *env;
      }
    }
LAB_7ffc3eb4981e:
    arg2_00 = &DAT_7ffc3eba6000;
    pvVar4 = pvRam00007ffc3ebc0a70;
  }
LAB_7ffc3eb49825:
  (*pJVar7->ThrowNew)(env,pvVar4,arg2_00);
  return (void *)0x0;
}

/* JNI_dev_krypton_2_d_52 | RVA 0x379b10 | dev/krypton/2.d(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_2_d_52
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
  if (pvVar6 == (void *)0x0) goto LAB_7ffc3eb4a44e;
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
  if (_DAT_7ffc3ebc0b38 == (void *)0x0) {
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
    uVar10 = FUN_7ffc3eb76c30(env,0x27);
    uVar11 = FUN_7ffc3eb76c30(env,0x27);
    pvVar5 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uVar1,uVar13,uVar10,uVar18,uVar11,pvVar5,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (pvVar5 != (void *)0x0) {
      _DAT_7ffc3ebc0b38 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc0b38;
  bVar2 = (*(*env)->ExceptionCheck)(env);
  if ((bVar2 == 0) && (lVar7 = FUN_7ffc3eb76c30(env,0x12), lVar7 != 0)) {
    if (arg2 == (void *)0x0) {
LAB_7ffc3eb4a0d0:
      pJVar14 = *env;
      arg2_00 = &DAT_7ffc3eba6000;
      pvVar5 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb4a0e4:
      (*pJVar14->ThrowNew)(env,pvVar5,arg2_00);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(env,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(env,lVar12,0x24), lVar12 != 0)) {
        uVar3 = FUN_7ffc3e7d8be0(env,arg2,lVar12);
        bVar2 = (*(*env)->ExceptionCheck)(env);
        if (bVar2 == 0) {
          if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb4a0d0;
          lVar12 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar3);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar5,lVar12,lVar7,uVar19);
            bVar2 = (*(*env)->ExceptionCheck)(env);
            if (bVar2 == 0) {
              pvVar5 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar2 = (*(*env)->ExceptionCheck)(env);
              if (bVar2 == 0) {
                if (pvVar5 == (void *)0x0) goto LAB_7ffc3eb4a0d0;
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
                        goto LAB_7ffc3eb4a0ea;
                      }
                    }
                  }
                }
                pJVar14 = *env;
                arg2_00 = (char *)0x7ffc3eba6019;
                pvVar5 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb4a0e4;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb4a0ea:
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
    pvVar16 = (*(*env)->NewStringUTF)(env,(char *)0x7ffc3ebb08c1);
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
LAB_7ffc3eb4a44e:
  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return (void *)0x0;
}

