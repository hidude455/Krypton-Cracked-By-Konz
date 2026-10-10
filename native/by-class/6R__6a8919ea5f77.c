/* Native reconstruction for dev/krypton/6R.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6R_6_0 | RVA 0x1a7f50 | dev/krypton/6R.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6R_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  JNINativeInterface_ *pJVar12;
  ulonglong uVar13;
  char *pcVar14;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x76);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x9e);
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
  lVar6 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar6 == 0) {
    return;
  }
  lVar7 = FUN_7ffc3eb76c90(env,lVar6,0xb6);
  if (lVar7 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3e7d1a80(env,lVar6,lVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1f28 == (void *)0x0) {
    uVar10 = FUN_7ffc3eb76c30(env,0x76);
    lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                             0x7ffc3eba7e0a,0x7ffc3eba7192,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc1f28 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc1f28;
  uVar13 = uVar5 ^ 0x79ac68228caf;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7bca556226d032);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97a09e;
    pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if ((bVar1 != 0) || (lVar7 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar7 == 0))
    goto LAB_7ffc3e97a09e;
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar5 ^ 0x21cfa660b098);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97a09e;
    if (pvVar4 == (void *)0x0) {
      pJVar12 = *env;
      pcVar14 = &DAT_7ffc3eba6000;
      pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e97a098:
      (*pJVar12->ThrowNew)(env,pvVar3,pcVar14);
      goto LAB_7ffc3e97a09e;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                      (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (*(*env)->GetArrayLength)(env,pvVar4);
    }
    if (iVar2 < 1) {
      pJVar12 = *env;
      pcVar14 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e97a098;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
    if (_DAT_7ffc3ebc1f30 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba72e6,0x7ffc3eba630c,0,0);
      if ((lVar7 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f30 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc1f30;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97a09e;
    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c796c608e0db703);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97a09e;
    if (_DAT_7ffc3ebc1f38 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba7233,0x7ffc3eba64fe,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f38 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1f38;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97a09e;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c64d8d30c106b76);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    uVar10 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97a09e;
    uVar10 = FUN_7ffc3e7d1a20(env,uVar10,uRam00007ffc3ebc0968);
    if (_DAT_7ffc3ebc1f48 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba7233,0x7ffc3ebab4ef,0,0);
      if ((lVar7 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f48 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1f48;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e979d96:
      pJVar12 = *env;
LAB_7ffc3e979d9c:
      pvVar4 = (*pJVar12->ExceptionOccurred)(env);
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
      if (bVar1 == 0) {
        return;
      }
LAB_7ffc3e979dca:
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x76);
      if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x148), lVar7 == 0)) {
LAB_7ffc3e979e36:
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          (*(*env)->Throw)(env,pvVar3);
          goto LAB_7ffc3e979e36;
        }
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
      }
LAB_7ffc3e979e42:
      pvVar3 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
      if (bVar1 == 0) {
        return;
      }
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x76);
      if ((lVar6 == 0) || (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x148), lVar7 == 0)) {
LAB_7ffc3e979ed6:
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
      }
      else {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar4);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          (*(*env)->Throw)(env,pvVar3);
          goto LAB_7ffc3e979ed6;
        }
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
      }
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) {
        return;
      }
LAB_7ffc3e979f0a:
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x76);
      if ((lVar6 != 0) && (lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x148), lVar7 != 0)) {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar3 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e979f82;
        }
        (*(*env)->Throw)(env,pvVar3);
      }
LAB_7ffc3e979f76:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e979f82:
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) {
        return;
      }
      (*(*env)->ExceptionClear)(env);
      lVar6 = FUN_7ffc3eb76c30(env,0x76);
      if (lVar6 == 0) {
        return;
      }
      lVar7 = FUN_7ffc3eb76c90(env,lVar6,0x148);
      if (lVar7 == 0) {
        return;
      }
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar6,lVar7,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97a02e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->Throw)(env,pvVar3);
      return;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c65b5c289492fcd);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar8);
    pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f50 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebb072b,0x7ffc3ebab51c,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f50 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1f50;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7cd65a5db25f3f);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x5f);
    pJVar12 = *env;
    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e979d9c;
    pvVar4 = (*pJVar12->AllocObject)(env,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (pvVar4 == (void *)0x0) {
LAB_7ffc3e979d7c:
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      goto LAB_7ffc3e979d96;
    }
    lVar7 = FUN_7ffc3eb76c90(env,pvVar3,0xff);
    if (lVar7 == 0) goto LAB_7ffc3e979d96;
    FUN_7ffc3e7dbbc0(env,pvVar4,pvVar3,lVar7,uVar10);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f58 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba72e6,0x7ffc3ebaeb32,0,0);
      if ((lVar7 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f58 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1f58;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7eac3270b4d5e5);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f60 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba6299,0x7ffc3eba606c,
                               0x7ffc3eba718e,0x7ffc3eba629d,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f60 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1f60;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x6907);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar9);
    pvVar9 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar5 ^ 0x25077d3910d94ff3);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar9);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f68 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba72e6,0x7ffc3ebaeb63,0,0);
      if ((lVar7 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f68 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc1f68;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar9 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,0,pvVar3);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,1,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7daa83c09f8d4a);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar9,3,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar9);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f70 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba72e6,0x7ffc3ebaeb32,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f70 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1f70;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c67671ab6c56533);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f78 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebb072b,0x7ffc3ebaeba6,0,0);
      if ((lVar7 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f78 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1f78;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c64af2ddc912c98);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x60);
    pJVar12 = *env;
    if (pvVar3 == (void *)0x0) goto LAB_7ffc3e979d9c;
    pvVar4 = (*pJVar12->AllocObject)(env,pvVar3);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (pvVar4 == (void *)0x0) goto LAB_7ffc3e979d7c;
    lVar7 = FUN_7ffc3eb76c90(env,pvVar3,0x100);
    if (lVar7 == 0) goto LAB_7ffc3e979d96;
    FUN_7ffc3e7dbbc0(env,pvVar4,pvVar3,lVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (_DAT_7ffc3ebc1f80 == (void *)0x0) {
      uVar10 = FUN_7ffc3eb76c30(env,0x76);
      lVar7 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3ebb072b,0x7ffc3ebaebd8,0,0);
      if ((lVar7 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f80 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1f80;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c61cb965f3ef41e);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e979d96;
    if (lVar6 == 0) {
      if (_DAT_7ffc3ebc1f88 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x76);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba7e0a,0x7ffc3eba71d3,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1f88 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1f88;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
LAB_7ffc3e97a031:
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        pvVar3 = (void *)FUN_7ffc3eb76c30(env,0xc);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar3);
        if (bVar1 != 0) goto LAB_7ffc3e979dca;
        goto LAB_7ffc3e979e42;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7f867f382125d2);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e97a031;
      if (_DAT_7ffc3ebc1f90 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x76);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba7e0a,0x7ffc3eba7203,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1f90 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1f90;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e97a031;
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c79332bdd87067e);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e97a031;
      if (lVar6 == 0) goto LAB_7ffc3e978cb9;
      if (_DAT_7ffc3ebc1f98 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x76);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba7e0a,0x7ffc3eba71d3,0,0);
        if ((lVar6 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1f98 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1f98;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
LAB_7ffc3e97a42d:
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
        bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
        if (bVar1 == 0) goto LAB_7ffc3e979f82;
        goto LAB_7ffc3e979f0a;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7f867f382125d2);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar8);
      pvVar8 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar8);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e97a42d;
      if (_DAT_7ffc3ebc1fa0 == (void *)0x0) {
        uVar10 = FUN_7ffc3eb76c30(env,0x76);
        lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                 0x7ffc3eba7e0a,0x7ffc3ebab583,0,0);
        if ((lVar6 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1fa0 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1fa0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e97a42d;
      pvVar8 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c79b06cc11d2613);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      lVar6 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) goto LAB_7ffc3e97a42d;
      if (lVar6 == 0) goto LAB_7ffc3e978cb9;
      pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar6 != 0)) {
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x36b026270d58);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar3 == (void *)0x0) {
            pJVar12 = *env;
            pcVar14 = &DAT_7ffc3eba6000;
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
              if (_DAT_7ffc3ebc1fa8 == (void *)0x0) {
                uVar10 = FUN_7ffc3eb76c30(env,0x76);
                lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                         0x7ffc3eba72e6,0x7ffc3eba626f,0,0);
                if ((lVar6 != 0) &&
                   (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
                   pvVar4 != (void *)0x0)) {
                  _DAT_7ffc3ebc1fa8 = (*(*env)->NewGlobalRef)(env,pvVar4);
                }
              }
              pvVar4 = _DAT_7ffc3ebc1fa8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x1c78d3145a12b05b);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
                pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar13);
                (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
                FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) goto LAB_7ffc3e978cb9;
              }
              goto LAB_7ffc3e979f76;
            }
            pJVar12 = *env;
            pcVar14 = (char *)0x7ffc3eba6019;
            pvVar3 = pvRam00007ffc3ebc0a98;
          }
          (*pJVar12->ThrowNew)(env,pvVar3,pcVar14);
        }
      }
      goto LAB_7ffc3e979f76;
    }
LAB_7ffc3e978cb9:
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
      goto LAB_7ffc3e978d0b;
    }
  }
  else {
LAB_7ffc3e97a09e:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a08,2);
    if (lVar6 == 0) {
      return;
    }
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a08,lVar6,0);
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
      if (1 < iVar2) {
        (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar4);
        lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
        if (lVar6 == 0) {
          return;
        }
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x5fe0e0f6520d);
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
          if (_DAT_7ffc3ebc1f40 == (void *)0x0) {
            uVar10 = FUN_7ffc3eb76c30(env,0x76);
            lVar6 = FUN_7ffc3eb77170(env,uVar10,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                     0x7ffc3eba72e6,0x7ffc3eba626f,0,0);
            if ((lVar6 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc1f40 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc1f40;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c7ac1069d6d7f76);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar8);
LAB_7ffc3e978d0b:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e978d21. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ExceptionCheck)(env);
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar14 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e97a36a;
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  pcVar14 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e97a36a:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97a37d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,pcVar14);
  return;
}

/* JNI_dev_krypton_6R_1_1 | RVA 0x1aa4e0 | dev/krypton/6R.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6R_1_1(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  void *pvVar3;
  void *pvVar4;
  longlong lVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  ulonglong uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x76);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x9e);
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
  lVar5 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar5 == 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,lVar5,0xb6);
  if (lVar6 == 0) {
    return;
  }
  lVar5 = FUN_7ffc3e7d1a80(env,lVar5,lVar6);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (lVar5 != 0) {
LAB_7ffc3e97a5ca:
    if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97ae95. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      return;
    }
    lVar5 = FUN_7ffc3eb76c30(env,2);
    if (lVar5 == 0) {
      return;
    }
    lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61);
    if (lVar6 == 0) {
      return;
    }
    FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97a62d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(*env)->ExceptionCheck)(env);
    return;
  }
  if (_DAT_7ffc3ebc1f00 == (void *)0x0) {
    uVar8 = FUN_7ffc3eb76c30(env,0x76);
    lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,0x7ffc3eba7e0a
                             ,0x7ffc3ebab616,0,0);
    if ((lVar5 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc1f00 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc1f00;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ 0x63c9980e586c;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8bfcc3fad9e8bfc);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
    lVar5 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97aed1;
    if (lVar5 == 0) goto LAB_7ffc3e97a5ca;
    if (_DAT_7ffc3ebc1f08 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x76);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba7e0a,0x7ffc3ebab616,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f08 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1f08;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e97ae98:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) goto LAB_7ffc3e97b0b9;
      goto LAB_7ffc3e97b041;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8bfcc3fad9e8bfc);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97ae98;
    if (_DAT_7ffc3ebc1f10 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x76);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba72e6,0x7ffc3eba6204,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f10 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1f10;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97ae98;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8bc6b5e05e882ba);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
    uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97ae98;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar8,uRam00007ffc3ebc0a38);
    if (cVar2 != '\0') goto LAB_7ffc3e97a5ca;
    if (_DAT_7ffc3ebc1f18 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x76);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                               0x7ffc3eba7e0a,0x7ffc3ebab616,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1f18 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1f18;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8bfcc3fad9e8bfc);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1f20 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,0x76);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebb071c,0x7ffc3eba718e,0x7ffc3eba606c,
                                   0x7ffc3eba72e6,0x7ffc3eba7f73,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1f20 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1f20;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8a549cd845eeb23);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) goto LAB_7ffc3e97a5ca;
        }
      }
    }
  }
  else {
LAB_7ffc3e97aed1:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar5 = FUN_7ffc3eb76c30(env,0x76);
      if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x148), lVar6 != 0)) {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar3 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e97af79;
        }
        (*(*env)->Throw)(env,pvVar3);
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e97af79:
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x76);
    if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x148), lVar6 == 0)) {
LAB_7ffc3e97b00d:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar3);
        goto LAB_7ffc3e97b00d;
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e97b041:
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x76);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x148), lVar6 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e97b0b9;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e97b0b9:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0xc);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,0x76);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x148), lVar6 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97b155. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

