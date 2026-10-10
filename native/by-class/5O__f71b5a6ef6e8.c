/* Native reconstruction for dev/krypton/5O.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_5O_6_0 | RVA 0x175990 | dev/krypton/5O.6()V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void JNI_dev_krypton_5O_6_0(JNINativeInterface_ **env,void *receiver)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  ulonglong uVar4;
  void *pvVar5;
  undefined8 uVar6;
  longlong lVar7;
  longlong lVar8;
  undefined8 uVar9;
  
  pvVar2 = (void *)FUN_7ffc3eb76c30(env,0x81);
  if (pvVar2 != (void *)0x0) {
    pvVar3 = (void *)FUN_7ffc3eb76ce0(env,pvVar2,0xc0);
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
        if (_DAT_7ffc3ebc14f8 == (void *)0x0) {
          uVar6 = FUN_7ffc3eb76c30(env,0x81);
          lVar7 = FUN_7ffc3eb77170(env,uVar6,6,0x7ffc3ebb2932,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3ebaf731,0x7ffc3eba730b,0,0);
          if (lVar7 != 0) {
            pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
            if (pvVar2 != (void *)0x0) {
              _DAT_7ffc3ebc14f8 = (*(*env)->NewGlobalRef)(env,pvVar2);
            }
          }
        }
        pvVar2 = _DAT_7ffc3ebc14f8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar3 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x1c6413aa469a7e97);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,0,pvVar5);
          pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar4 ^ 0x7e5e091332cd);
          (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar5);
          uVar6 = FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            uVar6 = FUN_7ffc3e7d1a20(env,uVar6,uRam00007ffc3ebc0968);
            if (_DAT_7ffc3ebc1500 == (void *)0x0) {
              uVar9 = FUN_7ffc3eb76c30(env,0x81);
              lVar7 = FUN_7ffc3eb77170(env,uVar9,6,0x7ffc3ebb2932,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba72f0,0x7ffc3eba80d2,0,0);
              if (lVar7 != 0) {
                pvVar2 = (void *)FUN_7ffc3e7d1a50(env,lVar7,uRam00007ffc3ebc0a00);
                if (pvVar2 != (void *)0x0) {
                  _DAT_7ffc3ebc1500 = (*(*env)->NewGlobalRef)(env,pvVar2);
                }
              }
            }
            pvVar2 = _DAT_7ffc3ebc1500;
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              pvVar3 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar3,0,receiver);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6)
              ;
              (*(*env)->SetObjectArrayElement)(env,pvVar3,1,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x1c667533c988fdb4);
              (*(*env)->SetObjectArrayElement)(env,pvVar3,2,pvVar5);
              pvVar5 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar4 ^ 0x7e5e091332cd);
              (*(*env)->SetObjectArrayElement)(env,pvVar3,3,pvVar5);
              FUN_7ffc3e7d1a50(env,pvVar2,uRam00007ffc3ebc0a40,pvVar3);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (receiver == (void *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3e945e30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (*(*env)->ThrowNew)(env,pvRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                  return;
                }
                lVar7 = FUN_7ffc3eb76c30(env,2);
                if (lVar7 != 0) {
                  lVar8 = FUN_7ffc3eb76c90(env,lVar7,0x5f);
                  if (lVar8 != 0) {
                    FUN_7ffc3e7dbbc0(env,receiver,lVar7,lVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3e945c99. Too many branches */
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
    }
  }
  return;
}

