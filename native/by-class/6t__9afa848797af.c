/* Native reconstruction for dev/krypton/6t.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6t_6_0 | RVA 0x1c38f0 | dev/krypton/6t.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6t_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  void *pvVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  void *pvVar13;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar14;
  char *arg2;
  void *pvStack_48;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x21);
  if ((pvVar3 == (void *)0x0) ||
     (pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x10), pvVar4 == (void *)0x0)) {
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
  if (receiver != (void *)0x0) {
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if (lVar6 == 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x5f);
    if (lVar7 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc2308 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x21);
      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba72e6,0x7ffc3eba72e8,0,0);
      if ((lVar6 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc2308 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc2308;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x5de7);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar5 ^ 0x5d044ec5c960c2b1);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    uVar9 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
    pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar3 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
      }
      if (2 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar3,2,(void *)0x0);
        lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar6 == 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x121062611713);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
        }
        if (1 < iVar2) {
          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar9);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
          }
          if (0 < iVar2) {
            (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
            if (_DAT_7ffc3ebc2310 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x21);
              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,0x7ffc3eba606c,
                                       0x7ffc3eba72f0,0x7ffc3eba6204,0,0);
              if ((lVar7 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc2310 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc2310;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar14 = uVar5 ^ 0x25b405206e5a;
            pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c621100e8e2541d);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            FUN_7ffc3e7d53d0(env,uVar9,uRam00007ffc3ebc0a38);
            if (_DAT_7ffc3ebc2318 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x21);
              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,0x7ffc3eba606c,
                                       0x7ffc3eba72f3,0x7ffc3eba72f6,0,0);
              if ((lVar7 != 0) &&
                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar3 != (void *)0x0)) {
                _DAT_7ffc3ebc2318 = (*(*env)->NewGlobalRef)(env,pvVar3);
              }
            }
            pvVar3 = _DAT_7ffc3ebc2318;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c63c6183f9bc9e9);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc2320 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x21);
              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,0x7ffc3eba606c,
                                       0x7ffc3eba72f0,0x7ffc3eba730b,0,0);
              if ((lVar7 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc2320 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc2320;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x1c60b5b5ebb6c77b);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar11 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
            if (_DAT_7ffc3ebc2328 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x21);
              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba718e,0x7ffc3eba606c,
                                       0x7ffc3eba72e6,0x7ffc3eba72e8,0,0);
              if ((lVar7 != 0) &&
                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                 pvVar4 != (void *)0x0)) {
                _DAT_7ffc3ebc2328 = (*(*env)->NewGlobalRef)(env,pvVar4);
              }
            }
            pvVar4 = _DAT_7ffc3ebc2328;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x5171)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar5 ^ 0x531551e4c63c4e26);
            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
            uVar9 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            uVar12 = FUN_7ffc3e7d1a20(env,uVar9,uRam00007ffc3ebc0968);
            if ((SBORROW8(0,uVar11)) && (uVar12 == 0xffffffffffffffff)) {
              uVar11 = 0x8000000000000000;
            }
            else if ((uVar11 | uVar12) >> 0x20 == 0) {
              uVar11 = (uVar11 & 0xffffffff) / (uVar12 & 0xffffffff);
            }
            else {
              uVar11 = (longlong)uVar11 / (longlong)uVar12;
            }
            pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x27a07d7a4bb5)
            ;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar4 == (void *)0x0) goto LAB_7ffc3e996b8e;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (1 < iVar2) {
              (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
              pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar11);
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
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                if (_DAT_7ffc3ebc2330 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x21);
                  lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,0x7ffc3eba606c,
                                           0x7ffc3eba7311,0x7ffc3eba626f,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc2330 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                }
                pvVar8 = _DAT_7ffc3ebc2330;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar3);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c67fce167d60219);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
                FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc2338 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x21);
                  lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,0x7ffc3eba606c,
                                           0x7ffc3eba72f3,0x7ffc3eba72f6,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar3 != (void *)0x0)) {
                    _DAT_7ffc3ebc2338 = (*(*env)->NewGlobalRef)(env,pvVar3);
                  }
                }
                pvVar3 = _DAT_7ffc3ebc2338;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c63c6183f9bc9e9);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar14);
                (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc2340 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x21);
                  lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba6299,0x7ffc3eba606c,
                                           0x7ffc3eba6299,0x7ffc3eba629d,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar4 != (void *)0x0)) {
                    _DAT_7ffc3ebc2340 = (*(*env)->NewGlobalRef)(env,pvVar4);
                  }
                }
                pvVar4 = _DAT_7ffc3ebc2340;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   0x4676);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
                pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar5 ^ 0x1badedf5b50b748d);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (_DAT_7ffc3ebc2348 == (void *)0x0) {
                  uVar9 = FUN_7ffc3eb76c30(env,0x21);
                  lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba6299,0x7ffc3eba606c,
                                           0x7ffc3eba6299,0x7ffc3eba629d,0,0);
                  if ((lVar7 != 0) &&
                     (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                     pvVar8 != (void *)0x0)) {
                    _DAT_7ffc3ebc2348 = (*(*env)->NewGlobalRef)(env,pvVar8);
                  }
                }
                pvVar8 = _DAT_7ffc3ebc2348;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,
                                                   0x4d7c);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar5 ^ 0x7ffbc77158ce7f88);
                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                   uVar5 ^ 0x71056931aaee);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 != 0) {
                  return;
                }
                if (pvVar10 == (void *)0x0) goto LAB_7ffc3e996b8e;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                }
                if (2 < iVar2) {
                  (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                  }
                  if (1 < iVar2) {
                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar8);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                    }
                    if (0 < iVar2) {
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                      if (_DAT_7ffc3ebc2350 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x21);
                        lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba7311,0x7ffc3eba626f,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar4 != (void *)0x0)) {
                          _DAT_7ffc3ebc2350 = (*(*env)->NewGlobalRef)(env,pvVar4);
                        }
                      }
                      pvVar4 = _DAT_7ffc3ebc2350;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c6668d80fc0c440);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar14);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc2358 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x21);
                        lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,
                                                 0x7ffc3eba606c,0x7ffc3eba72f3,0x7ffc3eba72f6,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar3 != (void *)0x0)) {
                          _DAT_7ffc3ebc2358 = (*(*env)->NewGlobalRef)(env,pvVar3);
                        }
                      }
                      pvVar3 = _DAT_7ffc3ebc2358;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x1c63c6183f9bc9e9);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar14);
                      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc2360 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x21);
                        lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba629d,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar4 != (void *)0x0)) {
                          _DAT_7ffc3ebc2360 = (*(*env)->NewGlobalRef)(env,pvVar4);
                        }
                      }
                      pvVar4 = _DAT_7ffc3ebc2360;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0x6f3a);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
                      pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,
                                                         uVar5 ^ 0x33d474b4f3c0ddcf);
                      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (_DAT_7ffc3ebc2368 == (void *)0x0) {
                        uVar9 = FUN_7ffc3eb76c30(env,0x21);
                        lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba6299,
                                                 0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba629d,0,0);
                        if ((lVar7 != 0) &&
                           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                           pvVar8 != (void *)0x0)) {
                          _DAT_7ffc3ebc2368 = (*(*env)->NewGlobalRef)(env,pvVar8);
                        }
                      }
                      pvVar8 = _DAT_7ffc3ebc2368;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar10 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                         uRam00007ffc3ebc0998,0x57b2);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,
                                                         uVar5 ^ 0x49fa43cb26406544);
                      (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                      pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar10 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                         uVar5 ^ 0x53ee363251ca);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 != 0) {
                        return;
                      }
                      if (pvVar10 == (void *)0x0) goto LAB_7ffc3e996b8e;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                      }
                      if (2 < iVar2) {
                        (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar13);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                        }
                        if (1 < iVar2) {
                          (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar8);
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar10 & 0xfffffffffffffffc)
                                            + (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                          }
                          if (0 < iVar2) {
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                            if (_DAT_7ffc3ebc2370 == (void *)0x0) {
                              uVar9 = FUN_7ffc3eb76c30(env,0x21);
                              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,
                                                       0x7ffc3eba606c,0x7ffc3eba7311,0x7ffc3eba626f,
                                                       0,0);
                              if ((lVar7 != 0) &&
                                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar4 != (void *)0x0)) {
                                _DAT_7ffc3ebc2370 = (*(*env)->NewGlobalRef)(env,pvVar4);
                              }
                            }
                            pvVar4 = _DAT_7ffc3ebc2370;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar8 = (*(*env)->NewObjectArray)
                                               (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1c66c6e8ed15065c);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                            pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar14);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                            FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (_DAT_7ffc3ebc2378 == (void *)0x0) {
                              uVar9 = FUN_7ffc3eb76c30(env,0x21);
                              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba72ee,
                                                       0x7ffc3eba606c,0x7ffc3eba72f3,0x7ffc3eba72f6,
                                                       0,0);
                              if ((lVar7 != 0) &&
                                 (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar3 != (void *)0x0)) {
                                _DAT_7ffc3ebc2378 = (*(*env)->NewGlobalRef)(env,pvVar3);
                              }
                            }
                            pvVar3 = _DAT_7ffc3ebc2378;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar4 = (*(*env)->NewObjectArray)
                                               (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x1c63c6183f9bc9e9);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar14);
                            (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                            pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4
                                                             );
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (_DAT_7ffc3ebc2380 == (void *)0x0) {
                              uVar9 = FUN_7ffc3eb76c30(env,0x21);
                              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba6299,
                                                       0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba629d,
                                                       0,0);
                              if ((lVar7 != 0) &&
                                 (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar4 != (void *)0x0)) {
                                _DAT_7ffc3ebc2380 = (*(*env)->NewGlobalRef)(env,pvVar4);
                              }
                            }
                            pvVar4 = _DAT_7ffc3ebc2380;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar8 = (*(*env)->NewObjectArray)
                                               (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                               uRam00007ffc3ebc0998,0x6a51);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
                            pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               uVar5 ^ 0x56481f69df9d8af);
                            (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8
                                                             );
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (_DAT_7ffc3ebc2388 == (void *)0x0) {
                              uVar9 = FUN_7ffc3eb76c30(env,0x21);
                              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,0x7ffc3eba6299,
                                                       0x7ffc3eba606c,0x7ffc3eba6299,0x7ffc3eba629d,
                                                       0,0);
                              if ((lVar7 != 0) &&
                                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00),
                                 pvVar8 != (void *)0x0)) {
                                _DAT_7ffc3ebc2388 = (*(*env)->NewGlobalRef)(env,pvVar8);
                              }
                            }
                            pvVar8 = _DAT_7ffc3ebc2388;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                               uRam00007ffc3ebc0998,0x3a4e);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
                            pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                               uRam00007ffc3ebc0918,
                                                               uVar5 ^ 0x69f58635f92c08b2);
                            (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                              pvVar10);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            pvVar10 = (*(*env)->NewObjectArray)
                                                (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 != 0) {
                              return;
                            }
                            if (pvVar10 == (void *)0x0) goto LAB_7ffc3e996b8e;
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)
                                                ((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                            }
                            if (2 < iVar2) {
                              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar8);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)
                                                  ((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                              }
                              if (1 < iVar2) {
                                (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
                                pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                                  uVar5 ^ 0x7f52ffa54288);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 != 0) {
                                  return;
                                }
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar2 = *(int *)(*(longlong *)
                                                    ((ulonglong)pvVar10 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar2 = (*(*env)->GetArrayLength)(env,pvVar10);
                                }
                                if (0 < iVar2) {
                                  (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                                  if (_DAT_7ffc3ebc2390 == (void *)0x0) {
                                    uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                             0x7ffc3eba72ee,0x7ffc3eba606c,
                                                             0x7ffc3eba7311,0x7ffc3eba626f,0,0);
                                    if ((lVar7 != 0) &&
                                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar4 != (void *)0x0)) {
                                      _DAT_7ffc3ebc2390 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                    }
                                  }
                                  pvVar4 = _DAT_7ffc3ebc2390;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar8 = (*(*env)->NewObjectArray)
                                                     (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,
                                                                    0x1c663d0afbfc239e);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                                  pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,uVar14);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                                  FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  if (_DAT_7ffc3ebc2398 == (void *)0x0) {
                                    uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                             0x7ffc3eba72ee,0x7ffc3eba606c,
                                                             0x7ffc3eba72f3,0x7ffc3eba7313,0,0);
                                    if ((lVar7 != 0) &&
                                       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar3 != (void *)0x0)) {
                                      _DAT_7ffc3ebc2398 = (*(*env)->NewGlobalRef)(env,pvVar3);
                                    }
                                  }
                                  pvVar3 = _DAT_7ffc3ebc2398;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar4 = (*(*env)->NewObjectArray)
                                                     (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,
                                                                    0x1c61683f8e3193cd);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
                                  pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,uVar14);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
                                  pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,
                                                                    pvVar4);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  if (_DAT_7ffc3ebc23a0 == (void *)0x0) {
                                    uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                             0x7ffc3eba72ee,0x7ffc3eba606c,
                                                             0x7ffc3eba72f3,0x7ffc3eba72f6,0,0);
                                    if ((lVar7 != 0) &&
                                       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar4 != (void *)0x0)) {
                                      _DAT_7ffc3ebc23a0 = (*(*env)->NewGlobalRef)(env,pvVar4);
                                    }
                                  }
                                  pvVar4 = _DAT_7ffc3ebc23a0;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar8 = (*(*env)->NewObjectArray)
                                                     (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x1c63c6183f9bc9e9);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar14);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar10);
                                  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,
                                                                    pvVar8);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar8 = (*(*env)->NewObjectArray)
                                                     (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,
                                                                     uVar5 ^ 0x2bb1ca568991);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    return;
                                  }
                                  if (pvVar8 == (void *)0x0) goto LAB_7ffc3e996b8e;
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar2 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar2 = (*(*env)->GetArrayLength)(env,pvVar8);
                                  }
                                  if (0 < iVar2) {
                                    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar10);
                                    if (_DAT_7ffc3ebc23a8 == (void *)0x0) {
                                      uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                               0x7ffc3eba72ee,0x7ffc3eba606c,
                                                               0x7ffc3eba7311,0x7ffc3eba60e3,0,0);
                                      if ((lVar6 != 0) &&
                                         (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar10 != (void *)0x0)) {
                                        _DAT_7ffc3ebc23a8 = (*(*env)->NewGlobalRef)(env,pvVar10);
                                      }
                                    }
                                    pvVar10 = _DAT_7ffc3ebc23a8;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    pvVar13 = (*(*env)->NewObjectArray)
                                                        (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar4);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar8);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x1c6073213f9f4c19);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar13,2,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar14);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar13,3,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,
                                                                      uRam00007ffc3ebc0a40,pvVar13);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    if (_DAT_7ffc3ebc23b0 == (void *)0x0) {
                                      uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                               0x7ffc3eba72ee,0x7ffc3eba606c,
                                                               0x7ffc3eba7311,0x7ffc3eba6128,0,0);
                                      if ((lVar6 != 0) &&
                                         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,
                                                                            uRam00007ffc3ebc0a00),
                                         pvVar8 != (void *)0x0)) {
                                        _DAT_7ffc3ebc23b0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                      }
                                    }
                                    pvVar8 = _DAT_7ffc3ebc23b0;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    pvVar10 = (*(*env)->NewObjectArray)
                                                        (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x1c676e961c766f9b);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar14);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,
                                                                      uRam00007ffc3ebc0a40,pvVar10);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    if (_DAT_7ffc3ebc23b8 == (void *)0x0) {
                                      uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                               0x7ffc3eba6299,0x7ffc3eba606c,
                                                               0x7ffc3eba6299,0x7ffc3eba629d,0,0);
                                      if ((lVar6 != 0) &&
                                         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,
                                                                            uRam00007ffc3ebc0a00),
                                         pvVar8 != (void *)0x0)) {
                                        _DAT_7ffc3ebc23b8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                      }
                                    }
                                    pvVar8 = _DAT_7ffc3ebc23b8;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    pvVar10 = (*(*env)->NewObjectArray)
                                                        (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                       uRam00007ffc3ebc0998,0x4eec);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar13);
                                    pvVar13 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                       uRam00007ffc3ebc0918,
                                                                       uVar5 ^ 0x2e9978e05b077c11);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar13);
                                    pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,
                                                                      uRam00007ffc3ebc0a40,pvVar10);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    if (_DAT_7ffc3ebc23c0 == (void *)0x0) {
                                      pvStack_48 = (*(*env)->NewStringUTF)
                                                             (env,(char *)0x7ffc3eba732d);
                                      uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba7330,
                                                               0x7ffc3eba7355,0x7ffc3eba736d,
                                                               0x7ffc3eba7355,0x7ffc3eba7406,
                                                               &pvStack_48,1);
                                      if ((lVar6 != 0) &&
                                         (pvVar10 = (void *)FUN_7ffc3e7d1a50(env,lVar6,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar10 != (void *)0x0)) {
                                        _DAT_7ffc3ebc23c0 = (*(*env)->NewGlobalRef)(env,pvVar10);
                                      }
                                    }
                                    pvVar10 = _DAT_7ffc3ebc23c0;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    pvVar13 = (*(*env)->NewObjectArray)
                                                        (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar13,0,pvVar8);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar13,1,pvVar4);
                                    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar10,
                                                                      uRam00007ffc3ebc0a40,pvVar13);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    if (_DAT_7ffc3ebc23c8 == (void *)0x0) {
                                      uVar9 = FUN_7ffc3eb76c30(env,0x21);
                                      lVar6 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3eba72d7,
                                                               0x7ffc3eba72ee,0x7ffc3eba606c,
                                                               0x7ffc3eba7311,0x7ffc3eba626f,0,0);
                                      if ((lVar6 != 0) &&
                                         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar6,
                                                                            uRam00007ffc3ebc0a00),
                                         pvVar8 != (void *)0x0)) {
                                        _DAT_7ffc3ebc23c8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                      }
                                    }
                                    pvVar8 = _DAT_7ffc3ebc23c8;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 != 0) {
                                      return;
                                    }
                                    pvVar10 = (*(*env)->NewObjectArray)
                                                        (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,0,pvVar3);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar4);
                                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,
                                                                      0x1c61afb6857a293b);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar3);
                                    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,
                                                                      uRam00007ffc3ebc0918,uVar14);
                                    (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar3);
                                    FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar10);
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
      goto LAB_7ffc3e996ba6;
    }
  }
LAB_7ffc3e996b8e:
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e996ba6:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e996bb9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

/* JNI_dev_krypton_6t_1_1 | RVA 0x1c6bc0 | dev/krypton/6t.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6t_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *arg1;
  undefined8 uVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x21);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x10);
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
  if (receiver != (void *)0x0) {
    lVar6 = FUN_7ffc3eb76c30(env,2);
    if (lVar6 == 0) {
      return;
    }
    lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x61);
    if (lVar7 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar6,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
    if (lVar6 == 0) {
      return;
    }
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x6d96d5ee9d9b);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (pvVar3 != (void *)0x0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (*(*env)->GetArrayLength)(env,pvVar3);
      }
      if (0 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
        if (_DAT_7ffc3ebc2300 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x21);
          lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba72d7,0x7ffc3eba72ee,0x7ffc3eba606c,
                                   0x7ffc3eba72f0,0x7ffc3eba743f,0,0);
          if ((lVar6 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc2300 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc2300;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          return;
        }
        arg1 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,arg1,0,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xc8a5acb157475295);
        (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar3);
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar5 ^ 0x3fd1f50cba99);
        (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
        FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,arg1);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e996e78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e996f62;
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e996f62:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e996f72. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

