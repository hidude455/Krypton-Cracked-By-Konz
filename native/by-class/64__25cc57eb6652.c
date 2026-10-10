/* Native reconstruction for dev/krypton/64.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_64_6_0 | RVA 0x178e30 | dev/krypton/64.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_64_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  void *pvVar6;
  longlong lVar7;
  void *pvVar8;
  undefined8 uVar9;
  longlong lVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  ulonglong uVar11;
  char *arg2;
  float fVar12;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x6b);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x7a);
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
  if (_DAT_7ffc3ebc1ca8 == (void *)0x0) {
    uVar9 = FUN_7ffc3eb76c30(env,0x6b);
    lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf6d1,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebabd8d
                             ,0x7ffc3ebaf6e0,0,0);
    if ((lVar7 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc1ca8 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc1ca8;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar11 = uVar5 ^ 0x57ae110aab76;
  pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c73c6e52351cc3f
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
  (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
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
  pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar5 ^ 0x4e48cbb5ed8b);
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
    if (iVar2 < 1) {
LAB_7ffc3e949bba:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e949bd6;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
    if (_DAT_7ffc3ebc1cb0 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x6b);
      lVar10 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf6d1,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebae306,0x7ffc3ebaf707,0,0);
      if ((lVar10 != 0) &&
         (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc1cb0 = (*(*env)->NewGlobalRef)(env,pvVar6);
      }
    }
    pvVar6 = _DAT_7ffc3ebc1cb0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7b0c6b0f781aee);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
    uVar9 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    fVar12 = (float)FUN_7ffc3e853ac0(env,uVar9,uRam00007ffc3ebc09c8);
    if (_DAT_7ffc3ebc1cb8 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x6b);
      lVar10 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf6d1,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebaf731,0x7ffc3ebae39c,0,0);
      if ((lVar10 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc1cb8 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1cb8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,(double)fVar12);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c65cef9e9b2d9af);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
    FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    if (_DAT_7ffc3ebc1cc0 == (void *)0x0) {
      uVar9 = FUN_7ffc3eb76c30(env,0x6b);
      lVar10 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf6d1,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3ebabd8d,0x7ffc3ebaf6e0,0,0);
      if ((lVar10 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar10,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)
         ) {
        _DAT_7ffc3ebc1cc0 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1cc0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c4b465ce6ef16ed);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
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
    pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar7,uVar5 ^ 0x4e48cbb5ed8b);
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
      if (iVar2 < 1) goto LAB_7ffc3e949bba;
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar6);
      if (_DAT_7ffc3ebc1cc8 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x6b);
        lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf6d1,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae306,0x7ffc3ebaf707,0,0);
        if ((lVar7 != 0) &&
           (pvVar6 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar6 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1cc8 = (*(*env)->NewGlobalRef)(env,pvVar6);
        }
      }
      pvVar6 = _DAT_7ffc3ebc1cc8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar8 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar3);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar4);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c7b0c6b0f781aee);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,2,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar8,3,pvVar3);
      uVar9 = FUN_7ffc3e7d1a50(env,pvVar6,uRam00007ffc3ebc0a40,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      fVar12 = (float)FUN_7ffc3e853ac0(env,uVar9,uRam00007ffc3ebc09c8);
      if (_DAT_7ffc3ebc1cd0 == (void *)0x0) {
        uVar9 = FUN_7ffc3eb76c30(env,0x6b);
        lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebaf6d1,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaf731,0x7ffc3ebae39c,0,0);
        if ((lVar7 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1cd0 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1cd0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc09a8,uRam00007ffc3ebc0920,(double)fVar12
                                       );
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c77b0afc4fe6bec);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar6);
      pvVar6 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar11);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,3,pvVar6);
      FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (receiver != (void *)0x0) {
        lVar7 = FUN_7ffc3eb76c30(env,2);
        if (lVar7 == 0) {
          return;
        }
        lVar10 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
        if (lVar10 == 0) {
          return;
        }
        FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e949a45. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e949bd6:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e949bf1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

