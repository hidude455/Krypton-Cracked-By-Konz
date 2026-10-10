/* Native reconstruction for dev/krypton/5U.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5U_6_0 | RVA 0x196830 | dev/krypton/5U.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5U_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  ulonglong uVar5;
  longlong lVar6;
  void *arg1;
  longlong lVar7;
  undefined8 uVar8;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  char *arg2;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x20);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0xf);
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
  pvVar3 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0958,1);
  if (lVar6 == 0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,lVar6,uVar5 ^ 0x266b9a62bba);
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
    if (iVar2 < 1) {
      UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
      arg2 = (char *)0x7ffc3eba6019;
      pvVar3 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3e966bf3;
    }
    (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar4);
    if (_DAT_7ffc3ebc1718 == (void *)0x0) {
      uVar8 = FUN_7ffc3eb76c30(env,0x20);
      lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3eba72c5,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba72d4,0x7ffc3eba626f,0,0);
      if ((lVar6 != 0) &&
         (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00), pvVar4 != (void *)0x0))
      {
        _DAT_7ffc3ebc1718 = (*(*env)->NewGlobalRef)(env,pvVar4);
      }
    }
    pvVar4 = _DAT_7ffc3ebc1718;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
      return;
    }
    arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,arg1,0,receiver);
    (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x1c6742b2946dba2a);
    (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
    pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar5 ^ 0x54f7d509ea43);
    (*(*env)->SetObjectArrayElement)(env,arg1,3,pvVar3);
    FUN_7ffc3e7d1a50(env,pvVar4,uRam00007ffc3ebc0a40,arg1);
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e966b0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(*env)->ExceptionCheck)(env);
      return;
    }
  }
  UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
  arg2 = &DAT_7ffc3eba6000;
  pvVar3 = pvRam00007ffc3ebc0a70;
LAB_7ffc3e966bf3:
                    /* WARNING: Could not recover jumptable at 0x7ffc3e966c05. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

