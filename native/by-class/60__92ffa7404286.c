/* Native reconstruction for dev/krypton/60.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_60_6_0 | RVA 0x175480 | dev/krypton/60.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_60_6_0(JNINativeInterface_ **env,void *receiver)

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
  ulonglong uVar9;
  
  pvVar3 = (void *)FUN_7ffc3eb76c30(env,0x49);
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar4 = (void *)FUN_7ffc3eb76ce0(env,pvVar3,0x43);
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
  pvVar3 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar6 = FUN_7ffc3eb76c90(env,uRam00007ffc3ebc0a10,7);
  if (lVar6 == 0) {
    return;
  }
  uVar9 = uVar5 ^ 0x6e6a8bbbe8d5;
  pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,uVar9 & 0xffff);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (pvVar3 == (void *)0x0) {
LAB_7ffc3e945953:
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
    if (2 < iVar2) {
      (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar4);
      pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,(int)uVar9 >> 0x10);
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
        pvVar4 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,lVar6,uVar9 >> 0x20);
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
          if (_DAT_7ffc3ebc1c60 == (void *)0x0) {
            uVar8 = FUN_7ffc3eb76c30(env,0x49);
            lVar6 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebabd6f,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3ebab662,0x7ffc3eba626f,0,0);
            if ((lVar6 != 0) &&
               (pvVar4 = (void *)FUN_7ffc3e7d1a50(env,lVar6,uRam00007ffc3ebc0a00),
               pvVar4 != (void *)0x0)) {
              _DAT_7ffc3ebc1c60 = (*(*env)->NewGlobalRef)(env,pvVar4);
            }
          }
          pvVar4 = _DAT_7ffc3ebc1c60;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 != 0) {
            return;
          }
          arg1 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
          (*(*env)->SetObjectArrayElement)(env,arg1,0,receiver);
          (*(*env)->SetObjectArrayElement)(env,arg1,1,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c7f484753959c31);
          (*(*env)->SetObjectArrayElement)(env,arg1,2,pvVar3);
          pvVar3 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar5 ^ 0x3987dd9fad31);
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
                    /* WARNING: Could not recover jumptable at 0x7ffc3e945884. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(*env)->ExceptionCheck)(env);
            return;
          }
          goto LAB_7ffc3e945953;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    arg2 = (char *)0x7ffc3eba6019;
    pvVar3 = pvRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3e94597e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(env,pvVar3,arg2);
  return;
}

