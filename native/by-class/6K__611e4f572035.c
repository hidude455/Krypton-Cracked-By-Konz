/* Native reconstruction for dev/krypton/6K.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6K_6_0 | RVA 0x1a4260 | dev/krypton/6K.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6K_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  void *pvVar4;
  void *pvVar5;
  ulonglong uVar6;
  void *pvVar7;
  longlong lVar8;
  longlong lVar9;
  void *pvVar10;
  undefined8 uVar11;
  JNINativeInterface_ *pJVar12;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *pcVar13;
  ulonglong uVar14;
  
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,99);
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar5 = (void *)FUN_7ffc3eb76ce0(env,pvVar4,0x72);
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
  if (_DAT_7ffc3ebc1e78 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,99);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebae34f,0x7ffc3ebab4ef,0,0);
    if ((lVar8 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1e78 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1e78;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar14 = uVar6 ^ 0x54c278e70dd2;
  pvVar5 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7d1f9441120f58
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1e80 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,99);
    lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebae2e3,0x7ffc3ebab51c,0,0);
    if ((lVar8 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1e80 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1e80;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,receiver);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c6404e65f81d0bd
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,3,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76c30(env,0x48);
  if (lVar8 == 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,lVar8,0xb6);
  if (lVar9 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3e7d1a80(env,lVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1e88 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,99);
    lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebae2f4,0x7ffc3eba7f9a,0,0);
    if ((lVar9 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1e88 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1e88;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7300e7774f64ee
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
  pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1e90 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,99);
    lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebaac13,0x7ffc3eba743f,0,0);
    if ((lVar9 != 0) &&
       (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0)) {
      _DAT_7ffc3ebc1e90 = (*(*env)->NewGlobalRef)(env,pvVar5);
    }
  }
  pvVar5 = _DAT_7ffc3ebc1e90;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x1c7811961f050c18
                                   );
  (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
  (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
  FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (_DAT_7ffc3ebc1e98 == (void *)0x0) {
    uVar11 = FUN_7ffc3eb76c30(env,99);
    lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3ebae2f4,0x7ffc3eba7f9a,0,0);
    if ((lVar9 != 0) &&
       (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0)) {
      _DAT_7ffc3ebc1e98 = (*(*env)->NewGlobalRef)(env,pvVar4);
    }
  }
  pvVar4 = _DAT_7ffc3ebc1e98;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c70d56a0d807267);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    if (_DAT_7ffc3ebc1ea0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,99);
      lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaac13,0x7ffc3eba743f,0,0);
      if ((lVar9 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ea0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1ea0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7811961f050c18);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    if (_DAT_7ffc3ebc1ea8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,99);
      lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae2f4,0x7ffc3eba7f9a,0,0);
      if ((lVar9 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ea8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1ea8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7904d164b0f36c);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    if (_DAT_7ffc3ebc1eb0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,99);
      lVar9 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaac13,0x7ffc3eba743f,0,0);
      if ((lVar9 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1eb0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1eb0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7811961f050c18);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
    FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976224;
    if (lVar8 != 0) {
LAB_7ffc3e974aea:
      if (receiver != (void *)0x0) {
        lVar8 = FUN_7ffc3eb76c30(env,2);
        if (lVar8 == 0) {
          return;
        }
        lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x5f);
        if (lVar9 == 0) {
          return;
        }
        FUN_7ffc3e7dbbc0(env,receiver,lVar8,lVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e974b55. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->ExceptionCheck)(env);
        return;
      }
LAB_7ffc3e976499:
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      pcVar13 = &DAT_7ffc3eba6000;
      pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9764cf:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9764e5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(env,pvVar4,pcVar13);
      return;
    }
    if (_DAT_7ffc3ebc1eb8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,99);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae2f4,0x7ffc3eba71d3,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1eb8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1eb8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e976388:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
      pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
      if (bVar1 != 0) goto LAB_7ffc3e976258;
      goto LAB_7ffc3e9762d0;
    }
    pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c700e90c31c3ef6);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
    pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976388;
    if (_DAT_7ffc3ebc1ec0 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,99);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae2f4,0x7ffc3eba7203,0,0);
      if ((lVar8 != 0) &&
         (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar5 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ec0 = (*(*env)->NewGlobalRef)(env,pvVar5);
      }
    }
    pvVar5 = _DAT_7ffc3ebc1ec0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976388;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c7af0addb204396);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
    pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
    lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e976388;
    if (lVar8 == 0) goto LAB_7ffc3e974aea;
    if (_DAT_7ffc3ebc1ec8 == (void *)0x0) {
      uVar11 = FUN_7ffc3eb76c30(env,99);
      lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae2f4,0x7ffc3eba71d3,0,0);
      if ((lVar8 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1ec8 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1ec8;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar5 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x1c700e90c31c3ef6);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
      (*(*env)->SetObjectArrayElement)(env,pvVar5,2,pvVar7);
      pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar5);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1ed0 == (void *)0x0) {
          uVar11 = FUN_7ffc3eb76c30(env,99);
          lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebae2f4,0x7ffc3ebab583,0,0);
          if ((lVar8 != 0) &&
             (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
             pvVar5 != (void *)0x0)) {
            _DAT_7ffc3ebc1ed0 = (*(*env)->NewGlobalRef)(env,pvVar5);
          }
        }
        pvVar5 = _DAT_7ffc3ebc1ed0;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c7b4fc54adcab83);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
          pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
          lVar8 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            if (lVar8 == 0) goto LAB_7ffc3e974aea;
            pvVar4 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
            if (lVar8 == 0) {
              return;
            }
            pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,uVar6 ^ 0x61a0efd55544)
            ;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (pvVar4 == (void *)0x0) goto LAB_7ffc3e976499;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar4 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar4);
            }
            if (iVar3 < 1) {
              UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
              pcVar13 = (char *)0x7ffc3eba6019;
              pvVar4 = pvRam00007ffc3ebc0a98;
              goto LAB_7ffc3e9764cf;
            }
            (*(*env)->SetObjectArrayElement)(env,pvVar4,0,pvVar5);
            if (_DAT_7ffc3ebc1ed8 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,99);
              lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebae34f,0x7ffc3eba7f73,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc1ed8 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc1ed8;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c67d7fa3c6ed397);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            if (_DAT_7ffc3ebc1ee0 == (void *)0x0) {
              uVar11 = FUN_7ffc3eb76c30(env,99);
              lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3ebaac13,0x7ffc3eba61d9,0,0);
              if ((lVar8 != 0) &&
                 (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                 pvVar5 != (void *)0x0)) {
                _DAT_7ffc3ebc1ee0 = (*(*env)->NewGlobalRef)(env,pvVar5);
              }
            }
            pvVar5 = _DAT_7ffc3ebc1ee0;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x1c727913ad5fa61a);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14);
            (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar4);
            pvVar4 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 != 0) {
              return;
            }
            do {
              if (_DAT_7ffc3ebc1ee8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,99);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaac13,0x7ffc3eba6204,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc1ee8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc1ee8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c735b9e4b6bac11);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar14);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar10);
              uVar11 = FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              cVar2 = FUN_7ffc3e7d53d0(env,uVar11,uRam00007ffc3ebc0a38);
              if (cVar2 == '\0') goto LAB_7ffc3e974aea;
              if (_DAT_7ffc3ebc1ef0 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,99);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaac13,0x7ffc3eba621c,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc1ef0 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc1ef0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar4);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x1c6761b001bfb805);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar10);
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar14);
              (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar10);
              pvVar5 = (void *)FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40,pvVar7);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) {
                return;
              }
              pvVar7 = (void *)FUN_7ffc3eb76c30(env,0x41);
              if (pvVar7 == (void *)0x0) {
                return;
              }
              if ((pvVar5 != (void *)0x0) &&
                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar5,pvVar7), bVar1 == 0)) {
                UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
                pcVar13 = (char *)0x7ffc3eba6033;
                pvVar4 = pvRam00007ffc3ebc0a58;
                goto LAB_7ffc3e9764cf;
              }
              pvVar7 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if ((bVar1 != 0) || (lVar8 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1), lVar8 == 0)
                 ) break;
              pvVar10 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar8,
                                                 uVar6 ^ 0x55605765faad);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) break;
              if (pvVar7 == (void *)0x0) {
                pJVar12 = *env;
                pcVar13 = &DAT_7ffc3eba6000;
                pvVar4 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e9763d5:
                (*pJVar12->ThrowNew)(env,pvVar4,pcVar13);
                break;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
              }
              if (iVar3 < 2) {
LAB_7ffc3e97636e:
                pJVar12 = *env;
                pcVar13 = (char *)0x7ffc3eba6019;
                pvVar4 = pvRam00007ffc3ebc0a98;
                goto LAB_7ffc3e9763d5;
              }
              (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar10);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (*(*env)->GetArrayLength)(env,pvVar7);
              }
              if (iVar3 < 1) goto LAB_7ffc3e97636e;
              (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar5);
              if (_DAT_7ffc3ebc1ef8 == (void *)0x0) {
                uVar11 = FUN_7ffc3eb76c30(env,99);
                lVar8 = FUN_7ffc3eb77170(env,uVar11,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3ebaac13,0x7ffc3eba626f,0,0);
                if ((lVar8 != 0) &&
                   (pvVar5 = (void *)FUN_7ffc3e7d1a50(env,lVar8,uRam00007ffc3ebc0a00),
                   pvVar5 != (void *)0x0)) {
                  _DAT_7ffc3ebc1ef8 = (*(*env)->NewGlobalRef)(env,pvVar5);
                }
              }
              pvVar5 = _DAT_7ffc3ebc1ef8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 != 0) break;
              pvVar10 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,0,receiver);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,1,pvVar7);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c64bc06b7d5d24f);
              (*(*env)->SetObjectArrayElement)(env,pvVar10,2,pvVar7);
              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar14
                                               );
              (*(*env)->SetObjectArrayElement)(env,pvVar10,3,pvVar7);
              FUN_7ffc3e7d1a50(env,pvVar5,uRam00007ffc3ebc0a40);
              bVar1 = (*(*env)->ExceptionCheck)(env);
            } while (bVar1 == 0);
          }
        }
      }
    }
  }
  else {
LAB_7ffc3e976224:
    pvVar4 = (*(*env)->ExceptionOccurred)(env);
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e976258:
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,99);
    if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x101), lVar9 == 0)) {
LAB_7ffc3e9762c4:
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar4);
        goto LAB_7ffc3e9762c4;
      }
      pvVar4 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e9762d0:
    pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,99);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x101), lVar9 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar4 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e9763e4;
      }
      (*(*env)->Throw)(env,pvVar4);
    }
  }
  pvVar4 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e9763e4:
  pvVar5 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar4,pvVar5);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar8 = FUN_7ffc3eb76c30(env,99);
    if ((lVar8 != 0) && (lVar9 = FUN_7ffc3eb76c90(env,lVar8,0x101), lVar9 != 0)) {
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,lVar8,lVar9,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e976496. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar4);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_6K_1_1 | RVA 0x1a6520 | dev/krypton/6K.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_6K_1_1(JNINativeInterface_ **env,void *receiver)

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
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,99);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x72);
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
  if (lVar5 != 0) goto LAB_7ffc3e977098;
  if (_DAT_7ffc3ebc1e20 == (void *)0x0) {
    uVar8 = FUN_7ffc3eb76c30(env,99);
    lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3ebae2f4
                             ,0x7ffc3ebab616,0,0);
    if ((lVar5 != 0) &&
       (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0)) {
      _DAT_7ffc3ebc1e20 = (*(*env)->NewGlobalRef)(env,pvVar3);
    }
  }
  pvVar3 = _DAT_7ffc3ebc1e20;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    uVar9 = uVar9 ^ 0x4ea788cbd911;
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8a71e83afad047e);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
    lVar5 = FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e9778b7;
    if (lVar5 == 0) goto LAB_7ffc3e976afa;
    if (_DAT_7ffc3ebc1e28 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,99);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae2f4,0x7ffc3ebab616,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1e28 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1e28;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3e97787e:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
      pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
      if (bVar1 == 0) goto LAB_7ffc3e977a9f;
      goto LAB_7ffc3e977a27;
    }
    pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8a71e83afad047e);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
    pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97787e;
    if (_DAT_7ffc3ebc1e30 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,99);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebaac13,0x7ffc3eba6204,0,0);
      if ((lVar5 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1e30 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1e30;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97787e;
    pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xc8bbf99c3c93843f);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
    (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
    uVar8 = FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3e97787e;
    cVar2 = FUN_7ffc3e7d53d0(env,uVar8,uRam00007ffc3ebc0a38);
    if (cVar2 != '\0') {
LAB_7ffc3e976afa:
      if (_DAT_7ffc3ebc1e48 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,99);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae2f4,0x7ffc3eba7f9a,0,0);
        if ((lVar5 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1e48 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1e48;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8b01a828763b02d);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1e50 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,99);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaac13,0x7ffc3eba743f,0,0);
        if ((lVar5 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1e50 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1e50;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8bb0bf3ef29d8db);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1e58 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,99);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae2f4,0x7ffc3eba7f9a,0,0);
        if ((lVar5 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1e58 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1e58;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8b3cf0ffdaca6a4);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1e60 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,99);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaac13,0x7ffc3eba743f,0,0);
        if ((lVar5 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1e60 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1e60;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8bb0bf3ef29d8db);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1e68 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,99);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebae2f4,0x7ffc3eba7f9a,0,0);
        if ((lVar5 != 0) &&
           (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1e68 = (*(*env)->NewGlobalRef)(env,pvVar3);
        }
      }
      pvVar3 = _DAT_7ffc3ebc1e68;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8ba1eb4949c27af);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      if (_DAT_7ffc3ebc1e70 == (void *)0x0) {
        uVar8 = FUN_7ffc3eb76c30(env,99);
        lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3ebaac13,0x7ffc3eba743f,0,0);
        if ((lVar5 != 0) &&
           (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0
           )) {
          _DAT_7ffc3ebc1e70 = (*(*env)->NewGlobalRef)(env,pvVar4);
        }
      }
      pvVar4 = _DAT_7ffc3ebc1e70;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
      pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8bb0bf3ef29d8db);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
      FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        return;
      }
LAB_7ffc3e977098:
      if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97787b. Too many branches */
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e9770fb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
    if (_DAT_7ffc3ebc1e38 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,99);
      lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3ebae2f4,0x7ffc3ebab616,0,0);
      if ((lVar5 != 0) &&
         (pvVar3 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00), pvVar3 != (void *)0x0))
      {
        _DAT_7ffc3ebc1e38 = (*(*env)->NewGlobalRef)(env,pvVar3);
      }
    }
    pvVar3 = _DAT_7ffc3ebc1e38;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar4 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,0,receiver);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xc8a71e83afad047e);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,1,pvVar7);
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
      (*(*env)->SetObjectArrayElement)(env,pvVar4,2,pvVar7);
      pvVar3 = (void *)FUN_7ffc3e7d1a50(env,pvVar3,uRam00007ffc3ebc0a40,pvVar4);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (_DAT_7ffc3ebc1e40 == (void *)0x0) {
          uVar8 = FUN_7ffc3eb76c30(env,99);
          lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec55,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaac13,0x7ffc3eba7f73,0,0);
          if ((lVar5 != 0) &&
             (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00),
             pvVar4 != (void *)0x0)) {
            _DAT_7ffc3ebc1e40 = (*(*env)->NewGlobalRef)(env,pvVar4);
          }
        }
        pvVar4 = _DAT_7ffc3ebc1e40;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar7 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,0,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xc8bd4d5793253f69);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (*(*env)->SetObjectArrayElement)(env,pvVar7,2,pvVar3);
          FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,pvVar7);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) goto LAB_7ffc3e976afa;
        }
      }
    }
  }
  else {
LAB_7ffc3e9778b7:
    pvVar3 = (*(*env)->ExceptionOccurred)(env);
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 != 0) {
      (*(*env)->ExceptionClear)(env);
      lVar5 = FUN_7ffc3eb76c30(env,99);
      if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x101), lVar6 != 0)) {
        pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 != 0) {
          pvVar3 = (*(*env)->ExceptionOccurred)(env);
          goto LAB_7ffc3e97795f;
        }
        (*(*env)->Throw)(env,pvVar3);
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
LAB_7ffc3e97795f:
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,99);
    if ((lVar5 == 0) || (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x101), lVar6 == 0)) {
LAB_7ffc3e9779f3:
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    else {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar3);
        goto LAB_7ffc3e9779f3;
      }
      pvVar3 = (*(*env)->ExceptionOccurred)(env);
    }
    pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
    if (bVar1 == 0) {
      return;
    }
LAB_7ffc3e977a27:
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,99);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x101), lVar6 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar3 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3e977a9f;
      }
      (*(*env)->Throw)(env,pvVar3);
    }
  }
  pvVar3 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3e977a9f:
  pvVar4 = (void *)FUN_7ffc3eb76c30(env,0x24);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar3,pvVar4);
  if (bVar1 != 0) {
    (*(*env)->ExceptionClear)(env);
    lVar5 = FUN_7ffc3eb76c30(env,99);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x101), lVar6 != 0)) {
      pvVar3 = (void *)FUN_7ffc3e7d1a80(env,lVar5,lVar6,pvVar3);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e977b3b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(*env)->Throw)(env,pvVar3);
        return;
      }
    }
  }
  return;
}

