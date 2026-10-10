/* Native reconstruction for dev/krypton/5j.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5j_1_0 | RVA 0x1a3f60 | dev/krypton/5j.1()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5j_1_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;
  void *pvVar7;
  undefined8 uVar8;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x62);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0x71);
    if (pvVar3 != (void *)0x0) {
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar4 = *(ulonglong *)
                 (*(longlong *)((ulonglong)pvVar2 & 0xfffffffffffffffc) +
                 (longlong)*(int *)((longlong)pvVar3 + 0x10));
      }
      else {
        uVar4 = (*(*env)->GetStaticLongField)(env,pvVar2,pvVar3);
      }
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e97424f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
          return;
        }
        lVar5 = FUN_7ffc3eb76c30(env,2);
        if (lVar5 != 0) {
          lVar6 = FUN_7ffc3eb76c90(env,lVar5,0x61);
          if (lVar6 != 0) {
            FUN_7ffc3e7dbbc0(env,receiver,lVar5,lVar6);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc1a18 == (void *)0x0) {
                uVar8 = FUN_7ffc3eb76c30(env,0x62);
                lVar5 = FUN_7ffc3eb77170(env,uVar8,6,0x7ffc3ebaec14,0x7ffc3eba72ee,0x7ffc3eba606c,
                                         0x7ffc3ebabc60,0x7ffc3ebaec23,0,0);
                if (lVar5 != 0) {
                  pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar5,uRam00007ffc3ebc0a00);
                  if (pvVar2 != (void *)0x0) {
                    _DAT_7ffc3ebc1a18 = (*(*env)->NewGlobalRef)(env,pvVar2);
                  }
                }
              }
              pvVar2 = _DAT_7ffc3ebc1a18;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar3 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,1,(void *)0x0);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0xc8b467dd451df286);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar4 ^ 0x75fc41067a89);
                (*(*env)->SetObjectArrayElement)(env,pvVar3,3,pvVar7);
                FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e974165. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                (*(*env)->ExceptionCheck)(env);
                return;
              }
            }
          }
        }
      }
    }
  }
  return;
}

