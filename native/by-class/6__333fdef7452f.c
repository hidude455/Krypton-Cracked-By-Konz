/* Native reconstruction for dev/krypton/6.
 * C-like analysis output; obfuscation, incomplete control flow, and decompiler artifacts remain.
 */

/* JNI_dev_krypton_6_0_0 | RVA 0x37a8b0 | dev/krypton/6.0([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 JNI_dev_krypton_6_0_0(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_3 == 0) {
LAB_7ffc3eb4af1a:
    lVar4 = *param_1;
LAB_7ffc3eb4a936:
    puVar10 = &DAT_7ffc3eba6000;
    uVar8 = uRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (0 < iVar2) {
      lVar3 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
      lVar4 = *param_1;
      if (lVar3 == 0) goto LAB_7ffc3eb4a936;
      cVar1 = (**(code **)(lVar4 + 0x100))(param_1,lVar3,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
        lVar4 = *param_1;
        puVar10 = (undefined *)0x7ffc3eba6033;
        uVar8 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb4a93d;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar4 == 0) {
        return 0;
      }
      uVar5 = FUN_7ffc3e7d1a20(param_1,lVar3,lVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar6 = FUN_7ffc3eb76c30(param_1,0);
      if (uVar6 == 0) {
        return 0;
      }
      lVar4 = FUN_7ffc3eb76ce0(param_1,uVar6,0);
      if (lVar4 == 0) {
        return 0;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar6 = *(ulonglong *)
                 (*(longlong *)(uVar6 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar4 + 0x10));
      }
      else {
        uVar6 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar6,lVar4);
      }
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
      if (lVar4 == 0) {
        return 0;
      }
      uVar6 = uVar6 ^ uVar5;
      uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar6 ^ 0x2e364b7959d0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar7 == 0) goto LAB_7ffc3eb4af1a;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
      }
      if (1 < iVar2) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a08,2);
        if (lVar4 == 0) {
          return 0;
        }
        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,lVar4,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
        }
        if (0 < iVar2) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar8);
          if (_DAT_7ffc3ebc7b18 == 0) {
            uVar8 = FUN_7ffc3eb76c30(param_1,0);
            lVar4 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba60e3,0,0);
            if ((lVar4 != 0) &&
               (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
              _DAT_7ffc3ebc7b18 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
            }
          }
          lVar4 = _DAT_7ffc3ebc7b18;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,param_2);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar7);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0x7114c235bd9f1a7a);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar9);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,3,uVar9);
          uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (_DAT_7ffc3ebc7b20 == 0) {
            uVar9 = FUN_7ffc3eb76c30(param_1,0);
            lVar4 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba6128,0,0);
            if ((lVar4 != 0) &&
               (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
              _DAT_7ffc3ebc7b20 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
            }
          }
          lVar4 = _DAT_7ffc3ebc7b20;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar8);
          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0x7115e919a2ce9bc6);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar8);
          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar8);
          uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar9);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          return uVar8;
        }
      }
    }
    lVar4 = *param_1;
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar8 = uRam00007ffc3ebc0a98;
  }
LAB_7ffc3eb4a93d:
  (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_3_1 | RVA 0x37af50 | dev/krypton/6.3([Ljava/lang/Object;)Ljava/lang/String; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 JNI_dev_krypton_6_3_1(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_3 == 0) {
LAB_7ffc3eb4b5ba:
    lVar4 = *param_1;
LAB_7ffc3eb4afd6:
    puVar10 = &DAT_7ffc3eba6000;
    uVar8 = uRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (0 < iVar2) {
      lVar3 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
      lVar4 = *param_1;
      if (lVar3 == 0) goto LAB_7ffc3eb4afd6;
      cVar1 = (**(code **)(lVar4 + 0x100))(param_1,lVar3,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
        lVar4 = *param_1;
        puVar10 = (undefined *)0x7ffc3eba6033;
        uVar8 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb4afdd;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar4 == 0) {
        return 0;
      }
      uVar5 = FUN_7ffc3e7d1a20(param_1,lVar3,lVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar6 = FUN_7ffc3eb76c30(param_1,0);
      if (uVar6 == 0) {
        return 0;
      }
      lVar4 = FUN_7ffc3eb76ce0(param_1,uVar6,0);
      if (lVar4 == 0) {
        return 0;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar6 = *(ulonglong *)
                 (*(longlong *)(uVar6 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar4 + 0x10));
      }
      else {
        uVar6 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar6,lVar4);
      }
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
      if (lVar4 == 0) {
        return 0;
      }
      uVar6 = uVar6 ^ uVar5;
      uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar6 ^ 0x7e9de62b464f);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar7 == 0) goto LAB_7ffc3eb4b5ba;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
      }
      if (1 < iVar2) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a08,2);
        if (lVar4 == 0) {
          return 0;
        }
        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,lVar4,1);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
        }
        if (0 < iVar2) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar8);
          if (_DAT_7ffc3ebc7b28 == 0) {
            uVar8 = FUN_7ffc3eb76c30(param_1,0);
            lVar4 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba60e3,0,0);
            if ((lVar4 != 0) &&
               (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
              _DAT_7ffc3ebc7b28 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
            }
          }
          lVar4 = _DAT_7ffc3ebc7b28;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,param_2);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar7);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0x6e8b929e10cd05e5);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar9);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,3,uVar9);
          uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (_DAT_7ffc3ebc7b30 == 0) {
            uVar9 = FUN_7ffc3eb76c30(param_1,0);
            lVar4 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba6128,0,0);
            if ((lVar4 != 0) &&
               (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
              _DAT_7ffc3ebc7b30 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
            }
          }
          lVar4 = _DAT_7ffc3ebc7b30;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar8);
          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0x6e8ab9b20f9c8459);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar8);
          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar8);
          uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar9);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          return uVar8;
        }
      }
    }
    lVar4 = *param_1;
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar8 = uRam00007ffc3ebc0a98;
  }
LAB_7ffc3eb4afdd:
  (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_1_2 | RVA 0x37b5f0 | dev/krypton/6.1([Ljava/lang/Object;)Lcom/google/gson/JsonObject; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_6_1_2(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  byte bVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  longlong lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  longlong lVar14;
  longlong lVar15;
  undefined8 uVar16;
  int iVar17;
  undefined *puVar18;
  ulonglong uVar19;
  uint uVar20;
  bool bVar21;
  uint uStack_b4;
  
  if (param_3 == 0) goto LAB_7ffc3eb4e4e6;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) goto LAB_7ffc3eb4e4c9;
  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
  lVar7 = *param_1;
  if (lVar6 != 0) {
    cVar1 = (**(code **)(lVar7 + 0x100))(param_1,lVar6,uRam00007ffc3ebc0a08);
    if (cVar1 == '\0') {
LAB_7ffc3eb4e4f8:
      lVar7 = *param_1;
      puVar18 = (undefined *)0x7ffc3eba6033;
      uVar11 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb4b73b;
    }
    lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a08,3);
    if (lVar7 == 0) {
      return 0;
    }
    uVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (iVar4 < 2) goto LAB_7ffc3eb4e4c9;
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
    lVar7 = *param_1;
    if (lVar6 == 0) goto LAB_7ffc3eb4b734;
    cVar1 = (**(code **)(lVar7 + 0x100))(param_1,lVar6,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') goto LAB_7ffc3eb4e4f8;
    lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar7 == 0) {
      return 0;
    }
    uVar8 = FUN_7ffc3e7d1a20(param_1,lVar6,lVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar9 = FUN_7ffc3eb76c30(param_1,0);
    if (uVar9 == 0) {
      return 0;
    }
    lVar7 = FUN_7ffc3eb76ce0(param_1,uVar9,0);
    if (lVar7 == 0) {
      return 0;
    }
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar19 = *(ulonglong *)
                (*(longlong *)(uVar9 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar7 + 0x10));
    }
    else {
      uVar19 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar9,lVar7);
    }
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar7 = FUN_7ffc3eb76c30(param_1,1);
    if (lVar7 == 0) {
      return 0;
    }
    lVar6 = (**(code **)(*param_1 + 0xd8))(param_1,lVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (lVar6 != 0) {
      lVar10 = FUN_7ffc3eb76c90(param_1,lVar7,4);
      if (lVar10 == 0) {
        return 0;
      }
      FUN_7ffc3e7dbbc0(param_1,lVar6,lVar7,lVar10);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar7 = FUN_7ffc3eb76c90(param_1,uVar9,5);
      if (lVar7 == 0) {
        return 0;
      }
      iVar4 = FUN_7ffc3e7db1e0(param_1,uVar9,lVar7);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (_DAT_7ffc3ebc9310 == 0) {
        uVar11 = FUN_7ffc3eb76c30(param_1,0);
        lVar7 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba6151,0x7ffc3eba6153,0,0);
        if ((lVar7 != 0) &&
           (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
          _DAT_7ffc3ebc9310 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
        }
      }
      lVar7 = _DAT_7ffc3ebc9310;
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar19 = uVar19 ^ uVar8;
      uVar11 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xd87aab4d7cfadc9)
      ;
      (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar12);
      uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
      (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar12);
      uVar11 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
      if (lVar7 == 0) {
        return 0;
      }
      uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar7,uVar19 ^ 0x66215581ac20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar8 != 0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar17 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar17 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (0 < iVar17) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar12);
          if (_DAT_7ffc3ebc9318 == 0) {
            uVar12 = FUN_7ffc3eb76c30(param_1,0);
            lVar10 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3eba60e0,0x7ffc3eba6167,0,0);
            if ((lVar10 != 0) &&
               (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
              _DAT_7ffc3ebc9318 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
            }
          }
          lVar10 = _DAT_7ffc3ebc9318;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar12 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar11);
          (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar8);
          uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                    0xd8dd8acbe055e42);
          (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar11);
          uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
          (**(code **)(*param_1 + 0x570))(param_1,uVar12,3,uVar11);
          uVar11 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar12);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar7,uVar19 ^ 0x6d19db43269f);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (uVar8 == 0) goto LAB_7ffc3eb4e4e6;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar17 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                             (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar17 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (0 < iVar17) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar12);
            if (_DAT_7ffc3ebc9320 == 0) {
              uVar12 = FUN_7ffc3eb76c30(param_1,0);
              lVar7 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba60e0,0x7ffc3eba61a0,0,0);
              if ((lVar7 != 0) &&
                 (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
                _DAT_7ffc3ebc9320 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
              }
            }
            lVar7 = _DAT_7ffc3ebc9320;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar12 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar11);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar8);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xd888d62dde992e9);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar11);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,3,uVar11);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar12);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (_DAT_7ffc3ebc9328 == 0) {
              uVar12 = FUN_7ffc3eb76c30(param_1,0);
              lVar7 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba60e0,0x7ffc3eba61d9,0,0);
              if ((lVar7 != 0) &&
                 (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
                _DAT_7ffc3ebc9328 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
              }
            }
            lVar7 = _DAT_7ffc3ebc9328;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar12 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar11);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xd8875b5b78e8083);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar11);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar11);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar12);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            iVar17 = (int)((longlong)uVar19 >> 0x3f) + (uint)(0 < (longlong)uVar19);
LAB_7ffc3eb4c0ec:
            if (_DAT_7ffc3ebc9330 == 0) {
              uVar12 = FUN_7ffc3eb76c30(param_1,0);
              lVar7 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
              if ((lVar7 != 0) &&
                 (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
                _DAT_7ffc3ebc9330 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
              }
            }
            lVar7 = _DAT_7ffc3ebc9330;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar12 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar11);
            uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xd873a39026c6f11);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar13);
            uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar13);
            uVar12 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar12);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            cVar1 = FUN_7ffc3e7d53d0(param_1,uVar12,uRam00007ffc3ebc0a38);
            if (cVar1 == '\0') goto LAB_7ffc3eb4df6d;
            if (_DAT_7ffc3ebc9338 == 0) {
              uVar12 = FUN_7ffc3eb76c30(param_1,0);
              lVar7 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba60e0,0x7ffc3eba621c,0,0);
              if ((lVar7 != 0) &&
                 (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
                _DAT_7ffc3ebc9338 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
              }
            }
            lVar7 = _DAT_7ffc3ebc9338;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar12 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar11);
            uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xd92fe6e5fec1484);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar13);
            uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
            (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar13);
            lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar12);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            do {
              lVar10 = FUN_7ffc3eb76c30(param_1,2);
              if (lVar10 == 0) {
                return 0;
              }
              if ((lVar7 != 0) &&
                 (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar7,lVar10), cVar1 == '\0'))
              goto LAB_7ffc3eb4e4f8;
              if (_DAT_7ffc3ebc9340 == 0) {
                uVar12 = FUN_7ffc3eb76c30(param_1,0);
                lVar10 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                if ((lVar10 != 0) &&
                   (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                  _DAT_7ffc3ebc9340 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                }
              }
              lVar10 = _DAT_7ffc3ebc9340;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
LAB_7ffc3eb4e6ca:
                uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
                uVar12 = FUN_7ffc3eb76c30(param_1,3);
                cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
                if (cVar1 == '\0') {
                  return 0;
                }
                (**(code **)(*param_1 + 0x88))(param_1);
                lVar7 = FUN_7ffc3eb76c30(param_1,0);
                if (lVar7 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar7,6);
joined_r0x7ffc3eb4e734:
                  if (lVar6 != 0) {
                    uVar11 = FUN_7ffc3e7d1a80(param_1,lVar7,lVar6,uVar11);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
                      goto LAB_7ffc3eb4e62b;
                    }
                    (**(code **)(*param_1 + 0x68))(param_1,uVar11);
                  }
                }
LAB_7ffc3eb4e61f:
                uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb4e62b:
                uVar12 = FUN_7ffc3eb76c30(param_1,3);
                cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
                if (cVar1 == '\0') {
                  return 0;
                }
                (**(code **)(*param_1 + 0x88))(param_1);
                lVar7 = FUN_7ffc3eb76c30(param_1,0);
                if (lVar7 == 0) {
                  return 0;
                }
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar7,6);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar11 = FUN_7ffc3e7d1a80(param_1,lVar7,lVar6,uVar11);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                (**(code **)(*param_1 + 0x68))(param_1,uVar11);
                return 0;
              }
              uVar12 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,lVar7);
              uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd8f41d21b55fb32);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar13);
              uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar13);
              uVar12 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar12);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb4e6ca;
              bVar2 = FUN_7ffc3e7d53d0(param_1,uVar12,uRam00007ffc3ebc0a38);
              if (-1 < iVar17 && iVar4 != 0) {
                if (bVar2 == 0) {
LAB_7ffc3eb4c5e5:
                  uVar20 = 0;
                  goto LAB_7ffc3eb4c5e8;
                }
                lVar10 = FUN_7ffc3eb76c30(param_1,4);
                if (lVar10 != 0) {
                  uVar20 = 1;
                  if (lVar7 != 0) {
                    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar7,lVar10);
                    bVar2 = cVar1 != '\0';
                    goto LAB_7ffc3eb4c5db;
                  }
                  goto LAB_7ffc3eb4c5e8;
                }
                goto LAB_7ffc3eb4e61f;
              }
              uVar20 = (uint)bVar2;
              if (iVar4 != 0) {
LAB_7ffc3eb4c5db:
                uVar20 = 1;
                if (bVar2 != 0) goto LAB_7ffc3eb4c5e5;
              }
LAB_7ffc3eb4c5e8:
              lVar10 = FUN_7ffc3eb76c30(param_1,1);
              if (lVar10 == 0) {
                return 0;
              }
              lVar14 = (**(code **)(*param_1 + 0xd8))(param_1,lVar10);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar14 == 0) goto LAB_7ffc3eb4e4e6;
              lVar15 = FUN_7ffc3eb76c90(param_1,lVar10,4);
              if (lVar15 == 0) {
                return 0;
              }
              FUN_7ffc3e7dbbc0(param_1,lVar14,lVar10,lVar15);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
              if (lVar10 == 0) {
                return 0;
              }
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar10,uVar19 ^ 0x6114632f3ad8)
              ;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (uVar8 == 0) goto LAB_7ffc3eb4e4e6;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
              }
              if (iVar5 < 1) break;
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar12);
              if (_DAT_7ffc3ebc9348 == 0) {
                uVar12 = FUN_7ffc3eb76c30(param_1,0);
                lVar10 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61a0,0,0);
                if ((lVar10 != 0) &&
                   (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                  _DAT_7ffc3ebc9348 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                }
              }
              lVar10 = _DAT_7ffc3ebc9348;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              uVar12 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,lVar7);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar8);
              uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd8c2b5ede5477c2);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar13);
              uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,3,uVar13);
              uVar12 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar12);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (_DAT_7ffc3ebc9350 == 0) {
                uVar13 = FUN_7ffc3eb76c30(param_1,0);
                lVar10 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61d9,0,0);
                if ((lVar10 != 0) &&
                   (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                  _DAT_7ffc3ebc9350 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                }
              }
              lVar10 = _DAT_7ffc3ebc9350;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,uVar12);
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd8875b5b78e8083);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar12);
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar12);
              uVar12 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar13);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
LAB_7ffc3eb4c970:
              if (_DAT_7ffc3ebc9358 == 0) {
                uVar13 = FUN_7ffc3eb76c30(param_1,0);
                lVar10 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                if ((lVar10 != 0) &&
                   (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                  _DAT_7ffc3ebc9358 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                }
              }
              lVar10 = _DAT_7ffc3ebc9358;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,uVar12);
              uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd873a39026c6f11);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar16);
              uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar16);
              uVar13 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar13);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              cVar1 = FUN_7ffc3e7d53d0(param_1,uVar13,uRam00007ffc3ebc0a38);
              uStack_b4 = uVar20;
              if (cVar1 != '\0') {
                if (_DAT_7ffc3ebc9360 == 0) {
                  uVar13 = FUN_7ffc3eb76c30(param_1,0);
                  lVar10 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba621c,0,0);
                  if ((lVar10 != 0) &&
                     (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0))
                  {
                    _DAT_7ffc3ebc9360 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                  }
                }
                lVar10 = _DAT_7ffc3ebc9360;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,uVar12);
                uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0xd92fe6e5fec1484);
                (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar16);
                uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
                (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar16);
                lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar13);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                lVar15 = FUN_7ffc3eb76c30(param_1,5);
                if (lVar15 == 0) {
                  return 0;
                }
                if ((lVar10 != 0) &&
                   (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar10,lVar15), cVar1 == '\0'))
                goto LAB_7ffc3eb4e4f8;
                uStack_b4 = uVar3;
                if (0 < iVar17 && iVar4 != 0) {
                  if (uVar3 == 0) goto LAB_7ffc3eb4cf23;
                  uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if ((cVar1 == '\0') &&
                     (lVar15 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar15 != 0)) {
                    uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar15,
                                              uVar19 ^ 0x357cfed12807);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      if (uVar8 == 0) {
                        lVar7 = *param_1;
                        puVar18 = &DAT_7ffc3eba6000;
                        uVar11 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb4e560:
                        (**(code **)(lVar7 + 0x70))(param_1,uVar11,puVar18);
                      }
                      else {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                        }
                        if (iVar5 < 1) {
                          lVar7 = *param_1;
                          puVar18 = (undefined *)0x7ffc3eba6019;
                          uVar11 = uRam00007ffc3ebc0a98;
                          goto LAB_7ffc3eb4e560;
                        }
                        (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar13);
                        if (_DAT_7ffc3ebc9368 == 0) {
                          uVar13 = FUN_7ffc3eb76c30(param_1,0);
                          lVar15 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                    0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,0,0
                                                   );
                          if ((lVar15 != 0) &&
                             (lVar15 = FUN_7ffc3e7d1a50(param_1,lVar15,uRam00007ffc3ebc0a00),
                             lVar15 != 0)) {
                            _DAT_7ffc3ebc9368 = (**(code **)(*param_1 + 0xa8))(param_1,lVar15);
                          }
                        }
                        lVar15 = _DAT_7ffc3ebc9368;
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 == '\0') {
                          uVar13 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,lVar10);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar8);
                          uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0xd8810e8b80e9b42);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar16);
                          uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar19);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar13,3,uVar16);
                          uVar13 = FUN_7ffc3e7d1a50(param_1,lVar15,uRam00007ffc3ebc0a40);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') goto code_r0x7ffc3eb4cf06;
                        }
                      }
                    }
                  }
                  goto LAB_7ffc3eb4e566;
                }
              }
              if ((iVar4 != 0) && (bVar21 = uStack_b4 == 0, uStack_b4 = uVar20, bVar21)) {
                if (_DAT_7ffc3ebc9380 == 0) {
                  uVar12 = FUN_7ffc3eb76c30(param_1,0);
                  lVar10 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                  if ((lVar10 != 0) &&
                     (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0))
                  {
                    _DAT_7ffc3ebc9380 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                  }
                }
                lVar10 = _DAT_7ffc3ebc9380;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  uVar12 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,lVar14);
                  uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0xd894a540d14c1ac);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar13);
                  uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19
                                           );
                  (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar13);
                  uVar12 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    cVar1 = FUN_7ffc3e7d53d0(param_1,uVar12,uRam00007ffc3ebc0a38);
                    if (iVar17 < 0) {
                      if (cVar1 != '\0') goto LAB_7ffc3eb4d91e;
                      goto LAB_7ffc3eb4dc40;
                    }
                    if (cVar1 == '\0') goto LAB_7ffc3eb4d910;
                    goto LAB_7ffc3eb4df5f;
                  }
                }
LAB_7ffc3eb4e566:
                uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
                uVar12 = FUN_7ffc3eb76c30(param_1,3);
                cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
                if (cVar1 == '\0') goto LAB_7ffc3eb4e62b;
                (**(code **)(*param_1 + 0x88))(param_1);
                lVar7 = FUN_7ffc3eb76c30(param_1,0);
                if (lVar7 == 0) goto LAB_7ffc3eb4e61f;
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar7,6);
                goto joined_r0x7ffc3eb4e734;
              }
LAB_7ffc3eb4d910:
              if (uStack_b4 != 0) {
LAB_7ffc3eb4d91e:
                if (_DAT_7ffc3ebc9388 == 0) {
                  uVar12 = FUN_7ffc3eb76c30(param_1,0);
                  lVar10 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                            0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,0,0);
                  if ((lVar10 != 0) &&
                     (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0))
                  {
                    _DAT_7ffc3ebc9388 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                  }
                }
                lVar10 = _DAT_7ffc3ebc9388;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  uVar12 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
                  uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x5308
                                           );
                  (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar13);
                  uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            uVar19 ^ 0x2472c90ac73d15d7);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar13);
                  uVar12 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar12);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (_DAT_7ffc3ebc9390 == 0) {
                      uVar13 = FUN_7ffc3eb76c30(param_1,0);
                      lVar10 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                0x7ffc3eba606c,0x7ffc3eba62b4,0x7ffc3eba62b7,0,0);
                      if ((lVar10 != 0) &&
                         (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00),
                         lVar10 != 0)) {
                        _DAT_7ffc3ebc9390 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                      }
                    }
                    lVar10 = _DAT_7ffc3ebc9390;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                      uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,uRam00007ffc3ebc0990,1)
                      ;
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,uVar16);
                      uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xd88db3a436b3eff);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar16);
                      uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar19);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar16);
                      uVar13 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar13);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 == '\0') {
                        if (_DAT_7ffc3ebc9398 == 0) {
                          uVar16 = FUN_7ffc3eb76c30(param_1,0);
                          lVar10 = FUN_7ffc3eb77170(param_1,uVar16,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                    0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba62d0,0,0
                                                   );
                          if ((lVar10 != 0) &&
                             (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00),
                             lVar10 != 0)) {
                            _DAT_7ffc3ebc9398 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                          }
                        }
                        lVar10 = _DAT_7ffc3ebc9398;
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 == '\0') {
                          uVar16 = (**(code **)(*param_1 + 0x560))(param_1,5,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar16,0,lVar14);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar16,1,uVar12);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar16,2,uVar13);
                          uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0xd8e21c589a9239d);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar16,3,uVar12);
                          uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar19);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar16,4,uVar12);
                          FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar16);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') goto LAB_7ffc3eb4dc40;
                        }
                      }
                    }
                  }
                }
                goto LAB_7ffc3eb4e61f;
              }
LAB_7ffc3eb4dc40:
              uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
              if (lVar10 == 0) {
                return 0;
              }
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar10,uVar19 ^ 0x5da0afd998e7)
              ;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (uVar8 == 0) goto LAB_7ffc3eb4e4e6;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
              }
              if (iVar5 < 1) break;
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar12);
              if (_DAT_7ffc3ebc93a0 == 0) {
                uVar12 = FUN_7ffc3eb76c30(param_1,0);
                lVar10 = FUN_7ffc3eb77170(param_1,uVar12,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba630c,0,0);
                if ((lVar10 != 0) &&
                   (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                  _DAT_7ffc3ebc93a0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                }
              }
              lVar10 = _DAT_7ffc3ebc93a0;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              uVar12 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,lVar7);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar8);
              uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd8e7095eca1467e);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar13);
              uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar12,3,uVar13);
              uVar12 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar12);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (_DAT_7ffc3ebc93a8 == 0) {
                uVar13 = FUN_7ffc3eb76c30(param_1,0);
                lVar7 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                         0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba62d0,0,0);
                if ((lVar7 != 0) &&
                   (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)) {
                  _DAT_7ffc3ebc93a8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
                }
              }
              lVar7 = _DAT_7ffc3ebc93a8;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,5,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,lVar6);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar12);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,lVar14);
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd93b3a90377650c);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,3,uVar12);
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,4,uVar12);
              FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
LAB_7ffc3eb4df5f:
              if (iVar4 != 0) goto LAB_7ffc3eb4c0ec;
LAB_7ffc3eb4df6d:
              lVar7 = lVar6;
              if (-1 < iVar17) {
                return lVar6;
              }
            } while( true );
          }
        }
LAB_7ffc3eb4e4c9:
        lVar7 = *param_1;
        puVar18 = (undefined *)0x7ffc3eba6019;
        uVar11 = uRam00007ffc3ebc0a98;
        goto LAB_7ffc3eb4b73b;
      }
    }
LAB_7ffc3eb4e4e6:
    lVar7 = *param_1;
  }
LAB_7ffc3eb4b734:
  puVar18 = &DAT_7ffc3eba6000;
  uVar11 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb4b73b:
  (**(code **)(lVar7 + 0x70))(param_1,uVar11,puVar18);
  return 0;
code_r0x7ffc3eb4cf06:
  cVar1 = FUN_7ffc3e7d53d0(param_1,uVar13,uRam00007ffc3ebc0a38);
  if (cVar1 != '\0') {
LAB_7ffc3eb4cf23:
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar15 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
    if (lVar15 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar15,uVar19 ^ 0x5684b155a6e);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar8 == 0) goto LAB_7ffc3eb4e4e6;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
    }
    if (iVar5 < 1) goto LAB_7ffc3eb4e4c9;
    (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar13);
    if (_DAT_7ffc3ebc9370 == 0) {
      uVar13 = FUN_7ffc3eb76c30(param_1,0);
      lVar15 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                0x7ffc3eba60e0,0x7ffc3eba6245,0,0);
      if ((lVar15 != 0) &&
         (lVar15 = FUN_7ffc3e7d1a50(param_1,lVar15,uRam00007ffc3ebc0a00), lVar15 != 0)) {
        _DAT_7ffc3ebc9370 = (**(code **)(*param_1 + 0xa8))(param_1,lVar15);
      }
    }
    lVar15 = _DAT_7ffc3ebc9370;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar13 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,lVar10);
    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar8);
    uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xd860d4ecc24d15a);
    (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar16);
    uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
    (**(code **)(*param_1 + 0x570))(param_1,uVar13,3,uVar16);
    uVar13 = FUN_7ffc3e7d1a50(param_1,lVar15,uRam00007ffc3ebc0a40);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    cVar1 = FUN_7ffc3e7d53d0(param_1,uVar13,uRam00007ffc3ebc0a38);
    if (cVar1 == '\0') {
      uVar8 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') goto LAB_7ffc3eb4e61f;
      if (uVar8 == 0) {
        lVar7 = *param_1;
        puVar18 = &DAT_7ffc3eba6000;
        uVar11 = uRam00007ffc3ebc0a70;
      }
      else {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (2 < iVar5) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,lVar14);
          lVar15 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
          if (lVar15 == 0) goto LAB_7ffc3eb4e61f;
          uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar15,uVar19 ^ 0x461849c72e43);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3eb4e61f;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (1 < iVar5) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar13);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if (0 < iVar5) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,lVar10);
              if (_DAT_7ffc3ebc9378 == 0) {
                uVar13 = FUN_7ffc3eb76c30(param_1,0);
                lVar10 = FUN_7ffc3eb77170(param_1,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                if ((lVar10 != 0) &&
                   (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                  _DAT_7ffc3ebc9378 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
                }
              }
              lVar10 = _DAT_7ffc3ebc9378;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb4e61f;
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_2);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar8);
              uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xd8504f380962994);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar16);
              uVar16 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar19);
              (**(code **)(*param_1 + 0x570))(param_1,uVar13,3,uVar16);
              FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb4e61f;
              goto LAB_7ffc3eb4c970;
            }
          }
        }
        lVar7 = *param_1;
        puVar18 = (undefined *)0x7ffc3eba6019;
        uVar11 = uRam00007ffc3ebc0a98;
      }
      (**(code **)(lVar7 + 0x70))(param_1,uVar11,puVar18);
      goto LAB_7ffc3eb4e61f;
    }
  }
  goto LAB_7ffc3eb4c970;
}

/* JNI_dev_krypton_6_6_3 | RVA 0x37e760 | dev/krypton/6.6([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_6_3(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  longlong lVar5;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  ulonglong uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined *puVar14;
  
  if (param_3 == 0) {
    lVar6 = *param_1;
LAB_7ffc3eb4e7e1:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar14 = &DAT_7ffc3eba6000;
    uVar10 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb4e7ec:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb4e7ff. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(param_1,uVar10,puVar14);
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 1) goto LAB_7ffc3eb4f5c8;
  lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
  lVar6 = *param_1;
  if (lVar5 == 0) goto LAB_7ffc3eb4e7e1;
  cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
  if (cVar1 == '\0') {
LAB_7ffc3eb4f5e9:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar14 = (undefined *)0x7ffc3eba6033;
    uVar10 = uRam00007ffc3ebc0a58;
    goto LAB_7ffc3eb4e7ec;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
  if (lVar6 == 0) {
    return;
  }
  uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 2) {
LAB_7ffc3eb4f5c8:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar14 = (undefined *)0x7ffc3eba6019;
    uVar10 = uRam00007ffc3ebc0a98;
    goto LAB_7ffc3eb4e7ec;
  }
  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
  lVar5 = FUN_7ffc3eb76c30(param_1,5);
  if (lVar5 == 0) {
    return;
  }
  if ((lVar6 != 0) && (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar5), cVar1 == '\0'))
  goto LAB_7ffc3eb4f5e9;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 3) goto LAB_7ffc3eb4f5c8;
  lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
  lVar8 = FUN_7ffc3eb76c30(param_1,2);
  if (lVar8 == 0) {
    return;
  }
  if ((lVar5 != 0) && (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,lVar8), cVar1 == '\0'))
  goto LAB_7ffc3eb4f5e9;
  uVar9 = FUN_7ffc3eb76c30(param_1,0);
  if (uVar9 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76ce0(param_1,uVar9,0);
  if (lVar8 == 0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar13 = *(ulonglong *)
              (*(longlong *)(uVar9 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar8 + 0x10));
  }
  else {
    uVar13 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar9,lVar8);
  }
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(param_1,uVar9,5);
  if (lVar8 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,uVar9,lVar8);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar9 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar8 != 0)) {
    uVar13 = uVar13 ^ uVar7;
    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar8,uVar13 ^ 0x413648f027c9);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb4f66d;
    if (uVar9 == 0) {
      lVar6 = *param_1;
      puVar14 = &DAT_7ffc3eba6000;
      uVar10 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb4f667:
      (**(code **)(lVar6 + 0x70))(param_1,uVar10,puVar14);
      goto LAB_7ffc3eb4f66d;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
    }
    if (iVar3 < 1) {
      lVar6 = *param_1;
      puVar14 = (undefined *)0x7ffc3eba6019;
      uVar10 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb4f667;
    }
    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
    if (_DAT_7ffc3ebc32d8 == 0) {
      uVar10 = FUN_7ffc3eb76c30(param_1,0);
      lVar8 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
      if ((lVar8 != 0) && (lVar8 = FUN_7ffc3e7d1a50(param_1,lVar8,uRam00007ffc3ebc0a00), lVar8 != 0)
         ) {
        _DAT_7ffc3ebc32d8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar8);
      }
    }
    lVar8 = _DAT_7ffc3ebc32d8;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb4f66d;
    uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,lVar6);
    (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar9);
    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x3c1f6b006727180);
    (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
    FUN_7ffc3e7d1a50(param_1,lVar8,uRam00007ffc3ebc0a40,uVar10);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb4f66d;
    lVar8 = FUN_7ffc3eb76c30(param_1,6);
    if (iVar2 != 0) {
      if (lVar8 != 0) {
        if (lVar6 == 0) {
          return;
        }
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar8);
        if (cVar1 == '\0') {
          return;
        }
        lVar8 = FUN_7ffc3eb76c30(param_1,6);
        if (lVar8 == 0) {
          return;
        }
        goto LAB_7ffc3eb4ed2a;
      }
      uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
      uVar10 = FUN_7ffc3eb76c30(param_1,3);
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar10);
      if (cVar1 == '\0') goto LAB_7ffc3eb4f732;
      goto LAB_7ffc3eb4f6a1;
    }
    if (lVar8 == 0) {
      return;
    }
    if (lVar6 != 0) {
LAB_7ffc3eb4ed2a:
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar8);
      if (cVar1 == '\0') goto LAB_7ffc3eb4f5e9;
    }
    iVar3 = (int)((longlong)uVar13 >> 0x3f);
    iVar2 = iVar3 + (uint)(0 < (longlong)uVar13);
    if (iVar2 == 0 || SCARRY4(iVar3,(uint)(0 < (longlong)uVar13)) != iVar2 < 0) {
      return;
    }
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if ((cVar1 == '\0') && (lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar8 != 0)) {
      uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar8,uVar13 ^ 0x17b4adbd1c9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
        if (uVar7 == 0) {
LAB_7ffc3eb4f70c:
          lVar6 = *param_1;
          puVar14 = &DAT_7ffc3eba6000;
          uVar10 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb4f720:
          (**(code **)(lVar6 + 0x70))(param_1,uVar10,puVar14);
        }
        else {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (iVar2 < 1) goto LAB_7ffc3eb4f61c;
          (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar10);
          if (_DAT_7ffc3ebc32e0 == 0) {
            uVar10 = FUN_7ffc3eb76c30(param_1,0);
            lVar12 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                      0x7ffc3eba60e0,0x7ffc3eba6245,0,0);
            if ((lVar12 != 0) &&
               (lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,uRam00007ffc3ebc0a00), lVar12 != 0)) {
              _DAT_7ffc3ebc32e0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar12);
            }
          }
          lVar12 = _DAT_7ffc3ebc32e0;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,lVar6);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar7);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x3ca7b708d61fa5e);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
            uVar10 = FUN_7ffc3e7d1a50(param_1,lVar12,uRam00007ffc3ebc0a40,uVar10);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              cVar1 = FUN_7ffc3e7d53d0(param_1,uVar10,uRam00007ffc3ebc0a38);
              if (cVar1 == '\0') {
                return;
              }
              uVar7 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar8,uVar13 ^ 0x34bbed41e7c2
                                         );
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  if (uVar7 == 0) goto LAB_7ffc3eb4f70c;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                  }
                  if (iVar2 < 1) goto LAB_7ffc3eb4f61c;
                  (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar10);
                  if (_DAT_7ffc3ebc32e8 == 0) {
                    uVar10 = FUN_7ffc3eb76c30(param_1,0);
                    lVar12 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                              0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6347,0,0);
                    if ((lVar12 != 0) &&
                       (lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,uRam00007ffc3ebc0a00), lVar12 != 0)
                       ) {
                      _DAT_7ffc3ebc32e8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar12);
                    }
                  }
                  lVar12 = _DAT_7ffc3ebc32e8;
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,lVar6);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar7);
                    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x3d5c1a97bbef9eb);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
                    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar13);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
                    uVar10 = FUN_7ffc3e7d1a50(param_1,lVar12,uRam00007ffc3ebc0a40,uVar10);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      uVar4 = FUN_7ffc3e7d8be0(param_1,uVar10,uRam00007ffc3ebc09d0);
                      uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if ((cVar1 == '\0') &&
                         (lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7), lVar6 != 0)) {
                        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar4);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 == '\0') {
                          if (uVar7 == 0) goto LAB_7ffc3eb4f70c;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                          }
                          if (iVar2 < 2) {
LAB_7ffc3eb4f61c:
                            lVar6 = *param_1;
                            puVar14 = (undefined *)0x7ffc3eba6019;
                            uVar10 = uRam00007ffc3ebc0a98;
                            goto LAB_7ffc3eb4f720;
                          }
                          (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar10);
                          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar8,
                                                    uVar13 ^ 0x33a2f66d53c8);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') {
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                            }
                            if (iVar2 < 1) goto LAB_7ffc3eb4f61c;
                            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar10);
                            if (_DAT_7ffc3ebc32f0 == 0) {
                              uVar10 = FUN_7ffc3eb76c30(param_1,0);
                              lVar6 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,
                                                       0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3eba60e0,
                                                       0x7ffc3eba626f,0,0);
                              if ((lVar6 != 0) &&
                                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00),
                                 lVar6 != 0)) {
                                _DAT_7ffc3ebc32f0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                              }
                            }
                            lVar6 = _DAT_7ffc3ebc32f0;
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              uVar10 = (**(code **)(*param_1 + 0x560))
                                                 (param_1,4,uRam00007ffc3ebc09e0,0);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,lVar5);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar7);
                              uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x3d66ff176e0b6a8);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
                              uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar13);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
                              FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar10);
                              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar1 == '\0') {
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
  else {
LAB_7ffc3eb4f66d:
    uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
    uVar10 = FUN_7ffc3eb76c30(param_1,3);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar10);
    if (cVar1 == '\0') {
      return;
    }
LAB_7ffc3eb4f6a1:
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar6 = FUN_7ffc3eb76c30(param_1,0);
    if ((lVar6 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,6), lVar5 != 0)) {
      uVar10 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
        goto LAB_7ffc3eb4f732;
      }
      (**(code **)(*param_1 + 0x68))(param_1,uVar10);
    }
  }
  uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb4f732:
  uVar10 = FUN_7ffc3eb76c30(param_1,3);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar10);
  if (cVar1 != '\0') {
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar6 = FUN_7ffc3eb76c30(param_1,0);
    if ((lVar6 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,6), lVar5 != 0)) {
      uVar10 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb4f7db. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (**(code **)(*param_1 + 0x68))(param_1,uVar10);
        return;
      }
    }
  }
  return;
}

/* JNI_dev_krypton_6_2q_4 | RVA 0x37f820 | dev/krypton/6.2q([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_2q_4(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_3 == 0) {
LAB_7ffc3eb4fcda:
    lVar4 = *param_1;
LAB_7ffc3eb4f8a5:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x70);
    puVar10 = &DAT_7ffc3eba6000;
    uVar8 = uRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (0 < iVar2) {
      lVar3 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
      lVar4 = *param_1;
      if (lVar3 == 0) goto LAB_7ffc3eb4f8a5;
      cVar1 = (**(code **)(lVar4 + 0x100))(param_1,lVar3,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar10 = (undefined *)0x7ffc3eba6033;
        uVar8 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb4f8b0;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar4 == 0) {
        return;
      }
      uVar5 = FUN_7ffc3e7d1a20(param_1,lVar3,lVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar6 = FUN_7ffc3eb76c30(param_1,0);
      if (uVar6 == 0) {
        return;
      }
      lVar4 = FUN_7ffc3eb76ce0(param_1,uVar6,0);
      if (lVar4 == 0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar6 = *(ulonglong *)
                 (*(longlong *)(uVar6 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar4 + 0x10));
      }
      else {
        uVar6 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar6,lVar4);
      }
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
      if (lVar4 == 0) {
        return;
      }
      uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar4,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (uVar7 == 0) goto LAB_7ffc3eb4fcda;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
      }
      if (1 < iVar2) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
        if (lVar4 == 0) {
          return;
        }
        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar6 ^ uVar5 ^ 0x1528c753bdfe);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
        }
        if (0 < iVar2) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar8);
          if (_DAT_7ffc3ebc46d0 == 0) {
            uVar8 = FUN_7ffc3eb76c30(param_1,0);
            lVar4 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
            if ((lVar4 != 0) &&
               (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
              _DAT_7ffc3ebc46d0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
            }
          }
          lVar4 = _DAT_7ffc3ebc46d0;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,param_2);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar7);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0x3d388ccd078d8667);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar9);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6 ^ uVar5);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,3,uVar9);
          FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb4fc0e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (**(code **)(*param_1 + 0x720))(param_1);
          return;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar8 = uRam00007ffc3ebc0a98;
  }
LAB_7ffc3eb4f8b0:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb4f8c3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar8,puVar10);
  return;
}

/* JNI_dev_krypton_6_8_5 | RVA 0x37fd10 | dev/krypton/6.8([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_8_5(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  ulonglong uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) {
LAB_7ffc3eb503f8:
    lVar6 = *param_1;
    goto LAB_7ffc3eb4fec3;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (0 < iVar3) {
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    if ((lVar4 != 0) &&
       (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uRam00007ffc3ebc09e8), cVar1 == '\0'))
    {
LAB_7ffc3eb503d7:
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar12 = (undefined *)0x7ffc3eba6033;
      uVar10 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb4fece;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (1 < iVar3) {
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar6 = *param_1;
      if (lVar5 == 0) {
LAB_7ffc3eb4fec3:
        UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
        puVar12 = &DAT_7ffc3eba6000;
        uVar10 = uRam00007ffc3ebc0a70;
        goto LAB_7ffc3eb4fece;
      }
      cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') goto LAB_7ffc3eb503d7;
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return;
      }
      uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (2 < iVar3) {
        lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
        lVar6 = *param_1;
        if (lVar5 == 0) goto LAB_7ffc3eb4fec3;
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a08);
        if (cVar1 == '\0') goto LAB_7ffc3eb503d7;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a08,3);
        if (lVar6 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar8 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a08,2);
        if (lVar6 == 0) {
          return;
        }
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,lVar6,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar9 == 0) goto LAB_7ffc3eb503f8;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
        }
        if (3 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,lVar6,uVar2);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
          }
          if (2 < iVar3) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
            lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
            if (lVar6 == 0) {
              return;
            }
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,
                                      uVar8 ^ uVar7 ^ 0x576b774f35a1);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
            }
            if (1 < iVar3) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
              }
              if (0 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,lVar4);
                if (_DAT_7ffc3ebc3318 == 0) {
                  uVar10 = FUN_7ffc3eb76c30(param_1,0);
                  lVar4 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                           0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                  if ((lVar4 != 0) &&
                     (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
                    _DAT_7ffc3ebc3318 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
                  }
                }
                lVar4 = _DAT_7ffc3ebc3318;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,param_2);
                (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar9);
                uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x5de9c3d758741c34);
                (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
                uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          uVar8 ^ uVar7);
                (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
                FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5030b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                (**(code **)(*param_1 + 0x720))(param_1);
                return;
              }
            }
          }
        }
      }
    }
  }
  UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
  puVar12 = (undefined *)0x7ffc3eba6019;
  uVar10 = uRam00007ffc3ebc0a98;
LAB_7ffc3eb4fece:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb4fee1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar10,puVar12);
  return;
}

/* JNI_dev_krypton_6_3_6 | RVA 0x380410 | dev/krypton/6.3([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_3_6(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  void *pvVar7;
  void *pvVar8;
  longlong lVar9;
  ulonglong uVar10;
  ThrowNew_prototype *UNRECOVERED_JUMPTABLE;
  void *pvVar11;
  void *pvVar12;
  undefined8 uVar13;
  void *pvVar14;
  void *pvVar15;
  void *pvVar16;
  void *pvVar17;
  void *pvVar18;
  JNINativeInterface_ *pJVar19;
  longlong lVar20;
  uint uVar21;
  char *pcVar22;
  ulonglong uVar23;
  
  if (arg0 == (void *)0x0) {
    pJVar19 = *env;
    goto LAB_7ffc3eb50692;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 1) {
LAB_7ffc3eb56649:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar22 = (char *)0x7ffc3eba6019;
    pvVar7 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eb5069d:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb506b3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(env,pvVar7,pcVar22);
    return;
  }
  pvVar7 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
  if ((pvVar7 != (void *)0x0) &&
     (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvRam00007ffc3ebc09e8), bVar1 == 0)) {
LAB_7ffc3eb56689:
    UNRECOVERED_JUMPTABLE = (*env)->ThrowNew;
    pcVar22 = (char *)0x7ffc3eba6033;
    pvVar7 = pvRam00007ffc3ebc0a58;
    goto LAB_7ffc3eb5069d;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 2) goto LAB_7ffc3eb56649;
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
  pJVar19 = *env;
  if (pvVar8 == (void *)0x0) {
LAB_7ffc3eb50692:
    UNRECOVERED_JUMPTABLE = pJVar19->ThrowNew;
    pcVar22 = &DAT_7ffc3eba6000;
    pvVar7 = pvRam00007ffc3ebc0a70;
    goto LAB_7ffc3eb5069d;
  }
  bVar1 = (*pJVar19->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0958);
  if (bVar1 == 0) goto LAB_7ffc3eb56689;
  lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
  if (lVar9 == 0) {
    return;
  }
  uVar10 = FUN_7ffc3e7d1a20(env,pvVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar3 < 3) goto LAB_7ffc3eb56649;
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,2);
  pJVar19 = *env;
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb50692;
  bVar1 = (*pJVar19->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0a08);
  if (bVar1 == 0) goto LAB_7ffc3eb56689;
  lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a08,3);
  if (lVar9 == 0) {
    return;
  }
  iVar3 = FUN_7ffc3e7d8be0(env,pvVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (*(*env)->GetArrayLength)(env,arg0);
  }
  if (iVar4 < 4) goto LAB_7ffc3eb56649;
  pvVar8 = (*(*env)->GetObjectArrayElement)(env,arg0,3);
  pJVar19 = *env;
  if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb50692;
  bVar1 = (*pJVar19->IsInstanceOf)(env,pvVar8,pvRam00007ffc3ebc0a08);
  if (bVar1 == 0) goto LAB_7ffc3eb56689;
  iVar4 = FUN_7ffc3e7d8be0(env,pvVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,0);
  if (pvVar8 == (void *)0x0) {
    return;
  }
  pvVar11 = (void *)FUN_7ffc3eb76ce0(env,pvVar8,0);
  if (pvVar11 == (void *)0x0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar23 = *(ulonglong *)
              (*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
              (longlong)*(int *)((longlong)pvVar11 + 0x10));
  }
  else {
    uVar23 = (*(*env)->GetStaticLongField)(env,pvVar8,pvVar11);
  }
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  lVar9 = FUN_7ffc3eb76c90(env,pvVar8,5);
  if (lVar9 == 0) {
    return;
  }
  uVar5 = FUN_7ffc3e7db1e0(env,pvVar8,lVar9);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) {
    return;
  }
  uVar23 = uVar23 ^ uVar10;
  iVar6 = (int)((longlong)uVar23 >> 0x3f);
  if (iVar3 != 0) {
LAB_7ffc3eb524a4:
    iVar6 = (uint)(0 < (longlong)uVar23) + iVar6;
    if ((pvVar7 == (void *)0x0) && (uVar5 != 0 && -1 < iVar6)) goto LAB_7ffc3eb5280c;
    if (_DAT_7ffc3ebc31a0 == (void *)0x0) {
      uVar13 = FUN_7ffc3eb76c30(env,0);
      lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
      if ((lVar9 != 0) &&
         (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0))
      {
        _DAT_7ffc3ebc31a0 = (*(*env)->NewGlobalRef)(env,pvVar8);
      }
    }
    pvVar8 = _DAT_7ffc3ebc31a0;
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) {
LAB_7ffc3eb568b3:
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb56724:
      pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
      bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
      if (bVar1 == 0) goto LAB_7ffc3eb5685a;
      (*(*env)->ExceptionClear)(env);
      lVar9 = FUN_7ffc3eb76c30(env,0);
      if ((lVar9 == 0) || (lVar20 = FUN_7ffc3eb76c90(env,lVar9,6), lVar20 == 0))
      goto LAB_7ffc3eb567b5;
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar20,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        (*(*env)->Throw)(env,pvVar7);
        goto LAB_7ffc3eb567b5;
      }
      pvVar7 = (*(*env)->ExceptionOccurred)(env);
      goto LAB_7ffc3eb567be;
    }
    pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x4d009d247c80f9a0);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
    uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 != 0) goto LAB_7ffc3eb568b3;
    bVar1 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
    if (uVar5 == 0 || -1 >= iVar6) {
      uVar21 = (uint)bVar1;
      if (iVar6 < 0) {
LAB_7ffc3eb529ad:
        if (uVar21 == 0) goto LAB_7ffc3eb529b5;
LAB_7ffc3eb52c96:
        if (_DAT_7ffc3ebc31d8 == (void *)0x0) {
          uVar13 = FUN_7ffc3eb76c30(env,0);
          lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6153,0,0);
          if ((lVar9 != 0) &&
             (pvVar7 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
             pvVar7 != (void *)0x0)) {
            _DAT_7ffc3ebc31d8 = (*(*env)->NewGlobalRef)(env,pvVar7);
          }
        }
        pvVar7 = _DAT_7ffc3ebc31d8;
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          pvVar8 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                             0x4d09b11fdea0ed47);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
          pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23);
          (*(*env)->SetObjectArrayElement)(env,pvVar8,1,pvVar11);
          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar7,uRam00007ffc3ebc0a40,pvVar8);
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar9 != 0))
            {
              pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,
                                                 uVar23 ^ 0x7d8a5ceeecae);
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                if (pvVar8 == (void *)0x0) {
LAB_7ffc3eb565f6:
                  pJVar19 = *env;
                  pcVar22 = &DAT_7ffc3eba6000;
                  pvVar7 = pvRam00007ffc3ebc0a70;
                  goto LAB_7ffc3eb56624;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar8);
                }
                if (iVar3 < 1) {
LAB_7ffc3eb5648e:
                  pJVar19 = *env;
                  pcVar22 = (char *)0x7ffc3eba6019;
                  pvVar7 = pvRam00007ffc3ebc0a98;
                  goto LAB_7ffc3eb56624;
                }
                (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                if (_DAT_7ffc3ebc31e0 == (void *)0x0) {
                  uVar13 = FUN_7ffc3eb76c30(env,0);
                  lVar20 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6167,0,0);
                  if ((lVar20 != 0) &&
                     (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar20,uRam00007ffc3ebc0a00),
                     pvVar11 != (void *)0x0)) {
                    _DAT_7ffc3ebc31e0 = (*(*env)->NewGlobalRef)(env,pvVar11);
                  }
                }
                pvVar11 = _DAT_7ffc3ebc31e0;
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    0x4d03c307b76a1ecc);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                    uVar23);
                  (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                  pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar8 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,
                                                         uVar23 ^ 0x76b2d22c6611);
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        if (pvVar8 == (void *)0x0) goto LAB_7ffc3eb565f6;
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar8 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar3 = (*(*env)->GetArrayLength)(env,pvVar8);
                        }
                        if (iVar3 < 1) goto LAB_7ffc3eb5648e;
                        (*(*env)->SetObjectArrayElement)(env,pvVar8,0,pvVar11);
                        if (_DAT_7ffc3ebc31e8 == (void *)0x0) {
                          uVar13 = FUN_7ffc3eb76c30(env,0);
                          lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61a0,0,0)
                          ;
                          if ((lVar9 != 0) &&
                             (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                             pvVar11 != (void *)0x0)) {
                            _DAT_7ffc3ebc31e8 = (*(*env)->NewGlobalRef)(env,pvVar11);
                          }
                        }
                        pvVar11 = _DAT_7ffc3ebc31e8;
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          pvVar12 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x4d0696c9d486d267)
                          ;
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar23);
                          (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar7);
                          pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12
                                                           );
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            if (_DAT_7ffc3ebc31f0 == (void *)0x0) {
                              uVar13 = FUN_7ffc3eb76c30(env,0);
                              lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                       0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61d9,
                                                       0,0);
                              if ((lVar9 != 0) &&
                                 (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                                 pvVar8 != (void *)0x0)) {
                                _DAT_7ffc3ebc31f0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                              }
                            }
                            pvVar8 = _DAT_7ffc3ebc31f0;
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
                              pvVar11 = (*(*env)->NewObjectArray)
                                                  (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0x4d066e1ebee1c00d);
                              (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                              pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar23);
                              (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                              pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                                pvVar11);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 == 0) {
LAB_7ffc3eb532d0:
                                do {
                                  if (_DAT_7ffc3ebc31f8 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0);
                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                                    if ((lVar9 != 0) &&
                                       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar8 != (void *)0x0)) {
                                      _DAT_7ffc3ebc31f8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                    }
                                  }
                                  pvVar8 = _DAT_7ffc3ebc31f8;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  pvVar11 = (*(*env)->NewObjectArray)
                                                      (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d0921920b032f9f);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                                  uVar13 = FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11)
                                  ;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
                                  if (cVar2 == '\0') {
                                    return;
                                  }
                                  if (_DAT_7ffc3ebc3200 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0);
                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3eba60e0,0x7ffc3eba621c,0,0);
                                    if ((lVar9 != 0) &&
                                       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                          uRam00007ffc3ebc0a00),
                                       pvVar8 != (void *)0x0)) {
                                      _DAT_7ffc3ebc3200 = (*(*env)->NewGlobalRef)(env,pvVar8);
                                    }
                                  }
                                  pvVar8 = _DAT_7ffc3ebc3200;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  pvVar11 = (*(*env)->NewObjectArray)
                                                      (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d1ce5c55683540a);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar12);
                                  pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,
                                                                    pvVar11);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if ((bVar1 != 0) ||
                                     (pvVar11 = (void *)FUN_7ffc3eb76c30(env,2),
                                     pvVar11 == (void *)0x0)) goto LAB_7ffc3eb5684e;
                                  if ((pvVar8 != (void *)0x0) &&
                                     (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar8,pvVar11),
                                     bVar1 == 0)) goto LAB_7ffc3eb5660c;
                                  if (_DAT_7ffc3ebc3208 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0);
                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3eba640e,0x7ffc3eba63db,0,0);
                                    if ((lVar9 != 0) &&
                                       (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar11 != (void *)0x0)) {
                                      _DAT_7ffc3ebc3208 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                    }
                                  }
                                  pvVar11 = _DAT_7ffc3ebc3208;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  pvVar12 = (*(*env)->NewObjectArray)
                                                      (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                                  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d1e51f570910163);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
                                  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
                                  pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,
                                                                     uRam00007ffc3ebc0a40,pvVar12);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  pvVar12 = (*(*env)->NewObjectArray)
                                                      (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if ((bVar1 != 0) ||
                                     (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1),
                                     lVar9 == 0)) goto LAB_7ffc3eb5684e;
                                  pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9
                                                                     ,uVar23 ^ 0x460ba6b6d869);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  if (pvVar12 == (void *)0x0) goto LAB_7ffc3eb565f6;
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar3 = *(int *)(*(longlong *)
                                                      ((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                  }
                                  if (iVar3 < 1) goto LAB_7ffc3eb5648e;
                                  (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar14);
                                  if (_DAT_7ffc3ebc3210 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0);
                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3eba60e0,0x7ffc3eba630c,0,0);
                                    if ((lVar9 != 0) &&
                                       (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar14 != (void *)0x0)) {
                                      _DAT_7ffc3ebc3210 = (*(*env)->NewGlobalRef)(env,pvVar14);
                                    }
                                  }
                                  pvVar14 = _DAT_7ffc3ebc3210;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  pvVar15 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar8);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d006b3ee5ce06f0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar12);
                                  pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,
                                                                     uRam00007ffc3ebc0a40,pvVar15);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  if (_DAT_7ffc3ebc3218 == (void *)0x0) {
                                    uVar13 = FUN_7ffc3eb76c30(env,0);
                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                             0x7ffc3eba606a,0x7ffc3eba606c,
                                                             0x7ffc3eba60e0,0x7ffc3eba6410,0,0);
                                    if ((lVar9 != 0) &&
                                       (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                           uRam00007ffc3ebc0a00),
                                       pvVar14 != (void *)0x0)) {
                                      _DAT_7ffc3ebc3218 = (*(*env)->NewGlobalRef)(env,pvVar14);
                                    }
                                  }
                                  pvVar14 = _DAT_7ffc3ebc3218;
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  pvVar15 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d036971912711c2);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar11);
                                  pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar11);
                                  pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,
                                                                     uRam00007ffc3ebc0a40);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                  if (uVar5 == 0) {
                                    return;
                                  }
                                } while ((pvVar11 == (void *)0x0) && (-1 < iVar6));
                                if (_DAT_7ffc3ebc3220 == (void *)0x0) {
                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                           0x7ffc3eba606a,0x7ffc3eba606c,
                                                           0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                                  if ((lVar9 != 0) &&
                                     (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                         uRam00007ffc3ebc0a00),
                                     pvVar12 != (void *)0x0)) {
                                    _DAT_7ffc3ebc3220 = (*(*env)->NewGlobalRef)(env,pvVar12);
                                  }
                                }
                                pvVar12 = _DAT_7ffc3ebc3220;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar14 = (*(*env)->NewObjectArray)
                                                      (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar11);
                                  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d08e0f98c969595);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
                                  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar15);
                                  uVar13 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) goto LAB_7ffc3eb566f0;
                                  cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
                                  if (cVar2 != '\0') {
                                    if (_DAT_7ffc3ebc3228 == (void *)0x0) {
                                      uVar13 = FUN_7ffc3eb76c30(env,0);
                                      lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                               0x7ffc3eba606a,0x7ffc3eba606c,
                                                               0x7ffc3eba60e0,0x7ffc3eba63db,0,0);
                                      if ((lVar9 != 0) &&
                                         (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar12 != (void *)0x0)) {
                                        _DAT_7ffc3ebc3228 = (*(*env)->NewGlobalRef)(env,pvVar12);
                                      }
                                    }
                                    pvVar12 = _DAT_7ffc3ebc3228;
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      pvVar14 = (*(*env)->NewObjectArray)
                                                          (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar11);
                                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,
                                                                         0x4d1fbb1ea4156cf1);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
                                      pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,uVar23
                                                                        );
                                      (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar11);
                                      pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,
                                                                         uRam00007ffc3ebc0a40,
                                                                         pvVar14);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        if (_DAT_7ffc3ebc3230 == (void *)0x0) {
                                          uVar13 = FUN_7ffc3eb76c30(env,0);
                                          lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                                   0x7ffc3eba6299,0x7ffc3eba606c,
                                                                   0x7ffc3eba629b,0x7ffc3eba629d,0,0
                                                                  );
                                          if ((lVar9 != 0) &&
                                             (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar12 != (void *)0x0)) {
                                            _DAT_7ffc3ebc3230 = (*(*env)->NewGlobalRef)(env,pvVar12)
                                            ;
                                          }
                                        }
                                        pvVar12 = _DAT_7ffc3ebc3230;
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          pvVar14 = (*(*env)->NewObjectArray)
                                                              (env,2,pvRam00007ffc3ebc09e0,
                                                               (void *)0x0);
                                          pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x35d8);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar15);
                                          pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar23 ^ 0x6a165a9f6c973387);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
                                          pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,
                                                                             uRam00007ffc3ebc0a40,
                                                                             pvVar14);
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            if (_DAT_7ffc3ebc3238 == (void *)0x0) {
                                              uVar13 = FUN_7ffc3eb76c30(env,0);
                                              lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                                       0x7ffc3eba606a,0x7ffc3eba606c
                                                                       ,0x7ffc3eba60e0,
                                                                       0x7ffc3eba6410,0,0);
                                              if ((lVar9 != 0) &&
                                                 (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                          
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                                _DAT_7ffc3ebc3238 =
                                                     (*(*env)->NewGlobalRef)(env,pvVar14);
                                              }
                                            }
                                            pvVar14 = _DAT_7ffc3ebc3238;
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                            pvVar15 = (*(*env)->NewObjectArray)
                                                                (env,4,pvRam00007ffc3ebc09e0,
                                                                 (void *)0x0);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d036971912711c2);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar12);
                                            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                            ;
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar12);
                                            pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,
                                                                               uRam00007ffc3ebc0a40,
                                                                               pvVar15);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                            if ((pvVar12 != (void *)0x0) || (iVar6 < 0)) {
                                              if (_DAT_7ffc3ebc3240 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba6204,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3240 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar14);
                                                }
                                              }
                                              pvVar14 = _DAT_7ffc3ebc3240;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) goto LAB_7ffc3eb568b3;
                                              pvVar15 = (*(*env)->NewObjectArray)
                                                                  (env,3,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,0,pvVar12);
                                              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0b734cd1bb1450);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,1,pvVar16);
                                              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,2,pvVar16);
                                              uVar13 = FUN_7ffc3e7d1a50(env,pvVar14,
                                                                        uRam00007ffc3ebc0a40,pvVar15
                                                                       );
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) goto LAB_7ffc3eb568b3;
                                              cVar2 = FUN_7ffc3e7d53d0(env,uVar13,
                                                                       uRam00007ffc3ebc0a38);
                                              if (iVar6 < 1) goto LAB_7ffc3eb545a3;
                                              if (cVar2 != '\0') goto LAB_7ffc3eb544a0;
                                            }
LAB_7ffc3eb54829:
                                            do {
                                              pvVar14 = (*(*env)->NewObjectArray)
                                                                  (env,1,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if ((bVar1 != 0) ||
                                                 (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958
                                                                           ,1), lVar9 == 0)) break;
                                              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar9,
                                                  uVar23 ^ 0x7abf6a407a56);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              if (pvVar14 == (void *)0x0) goto LAB_7ffc3eb565f6;
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar3 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar14 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar14);
                                              }
                                              if (iVar3 < 1) goto LAB_7ffc3eb5648e;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar14,0,pvVar15);
                                              if (_DAT_7ffc3ebc3258 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba61a0,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3258 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar15);
                                                }
                                              }
                                              pvVar15 = _DAT_7ffc3ebc3258;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              pvVar16 = (*(*env)->NewObjectArray)
                                                                  (env,4,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)(env,pvVar16,0,pvVar8)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,1,pvVar14);
                                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0230f5d73b374c);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,2,pvVar14);
                                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,3,pvVar14);
                                              pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar15,
                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a40,pvVar16);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              if (_DAT_7ffc3ebc3260 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba61d9,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3260 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar15);
                                                }
                                              }
                                              pvVar15 = _DAT_7ffc3ebc3260;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              pvVar16 = (*(*env)->NewObjectArray)
                                                                  (env,3,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,0,pvVar14);
                                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d066e1ebee1c00d);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,1,pvVar14);
                                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,2,pvVar14);
                                              pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar15,
                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a40,pvVar16);
LAB_7ffc3eb54af0:
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
LAB_7ffc3eb54b04:
                                              if (_DAT_7ffc3ebc3268 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba6204,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3268 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar15);
                                                }
                                              }
                                              pvVar15 = _DAT_7ffc3ebc3268;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              pvVar16 = (*(*env)->NewObjectArray)
                                                                  (env,3,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,0,pvVar14);
                                              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0921920b032f9f);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,1,pvVar17);
                                              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,2,pvVar17);
                                              uVar13 = FUN_7ffc3e7d1a50(env,pvVar15,
                                                                        uRam00007ffc3ebc0a40);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              cVar2 = FUN_7ffc3e7d53d0(env,uVar13,
                                                                       uRam00007ffc3ebc0a38);
                                              if (cVar2 == '\0') goto LAB_7ffc3eb532d0;
                                              if (_DAT_7ffc3ebc3270 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba621c,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3270 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar15);
                                                }
                                              }
                                              pvVar15 = _DAT_7ffc3ebc3270;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              pvVar16 = (*(*env)->NewObjectArray)
                                                                  (env,3,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,0,pvVar14);
                                              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d1ce5c55683540a);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,1,pvVar17);
                                              pvVar17 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,2,pvVar17);
                                              pvVar15 = (void *)FUN_7ffc3e7d1a50(env,pvVar15,
                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a40);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if ((bVar1 != 0) ||
                                                 (pvVar16 = (void *)FUN_7ffc3eb76c30(env,5),
                                                 pvVar16 == (void *)0x0)) break;
                                              if ((pvVar15 != (void *)0x0) &&
                                                 (bVar1 = (*(*env)->IsInstanceOf)
                                                                    (env,pvVar15,pvVar16),
                                                 bVar1 == 0)) goto LAB_7ffc3eb5660c;
                                              if (-1 < iVar6) {
                                                if (iVar4 != 0) {
                                                  pvVar16 = (*(*env)->NewObjectArray)
                                                                      (env,1,pvRam00007ffc3ebc09e0,
                                                                       (void *)0x0);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if ((bVar1 != 0) ||
                                                     (lVar9 = FUN_7ffc3eb76c90(env,
                                                  pvRam00007ffc3ebc0958,1), lVar9 == 0))
                                                  goto LAB_7ffc3eb567b5;
                                                  pvVar17 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar9,
                                                  uVar23 ^ 0x2ed7f7be6889);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                                  if (pvVar16 == (void *)0x0) goto LAB_7ffc3eb5666a;
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar3 = *(int *)(*(longlong *)
                                                                      ((ulonglong)pvVar16 &
                                                                      0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                                  }
                                                  if (iVar3 < 1) goto LAB_7ffc3eb5662f;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar16,0,pvVar17);
                                                  if (_DAT_7ffc3ebc3278 == (void *)0x0) {
                                                    uVar13 = FUN_7ffc3eb76c30(env,0);
                                                    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                             0x7ffc3eba605c,
                                                                             0x7ffc3eba606a,
                                                                             0x7ffc3eba606c,
                                                                             0x7ffc3eba60e0,
                                                                             0x7ffc3eba6245,0,0);
                                                    if ((lVar9 != 0) &&
                                                       (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar9
                                                  ,uRam00007ffc3ebc0a00), pvVar17 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3278 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar17);
                                                  }
                                                  }
                                                  pvVar17 = _DAT_7ffc3ebc3278;
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                                  pvVar18 = (*(*env)->NewObjectArray)
                                                                      (env,4,pvRam00007ffc3ebc09e0,
                                                                       (void *)0x0);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar18,0,pvVar15);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar18,1,pvVar16);
                                                  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d060b43b161dbcc);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar18,2,pvVar16);
                                                  pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar18,3,pvVar16);
                                                  uVar13 = FUN_7ffc3e7d1a50(env,pvVar17,
                                                                            uRam00007ffc3ebc0a40);
                                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                                  cVar2 = FUN_7ffc3e7d53d0(env,uVar13,
                                                                           uRam00007ffc3ebc0a38);
                                                  if (cVar2 == '\0') goto LAB_7ffc3eb54b04;
                                                }
                                                pvVar16 = (*(*env)->NewObjectArray)
                                                                    (env,1,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if ((bVar1 != 0) ||
                                                   (lVar9 = FUN_7ffc3eb76c90(env,
                                                  pvRam00007ffc3ebc0958,1), lVar9 == 0)) break;
                                                pvVar17 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar9,
                                                  uVar23 ^ 0x6f692e03d448);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) break;
                                                if (pvVar16 == (void *)0x0) goto LAB_7ffc3eb565f6;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar3 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar16 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar16);
                                                }
                                                if (iVar3 < 1) goto LAB_7ffc3eb5648e;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar16,0,pvVar17);
                                                if (_DAT_7ffc3ebc3280 == (void *)0x0) {
                                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                           0x7ffc3eba605c,
                                                                           0x7ffc3eba606a,
                                                                           0x7ffc3eba606c,
                                                                           0x7ffc3eba60e0,
                                                                           0x7ffc3eba630c,0,0);
                                                  if ((lVar9 != 0) &&
                                                     (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar17 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3280 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar17);
                                                  }
                                                }
                                                pvVar17 = _DAT_7ffc3ebc3280;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) break;
                                                pvVar18 = (*(*env)->NewObjectArray)
                                                                    (env,4,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,0,pvVar15);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,1,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0180b39d812af1);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,2,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                ;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,3,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar17,
                                                                                                                                                                      
                                                  uRam00007ffc3ebc0a40,pvVar18);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) break;
                                                if (_DAT_7ffc3ebc3288 == (void *)0x0) {
                                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                           0x7ffc3eba605c,
                                                                           0x7ffc3eba606a,
                                                                           0x7ffc3eba606c,
                                                                           0x7ffc3eba60e0,
                                                                           0x7ffc3eba6410,0,0);
                                                  if ((lVar9 != 0) &&
                                                     (pvVar17 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar17 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3288 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar17);
                                                  }
                                                }
                                                pvVar17 = _DAT_7ffc3ebc3288;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) break;
                                                pvVar18 = (*(*env)->NewObjectArray)
                                                                    (env,4,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,0,pvVar11);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,1,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d036971912711c2);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,2,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                ;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar18,3,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a50(env,pvVar17,
                                                                                                                                                                      
                                                  uRam00007ffc3ebc0a40);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) break;
                                                if (iVar6 == 0) goto LAB_7ffc3eb532d0;
                                                if (pvVar16 != (void *)0x0) goto LAB_7ffc3eb555e0;
                                                goto LAB_7ffc3eb54b04;
                                              }
                                              if (iVar4 == 0) goto LAB_7ffc3eb54829;
LAB_7ffc3eb544a0:
                                              if (_DAT_7ffc3ebc3248 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba6204,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3248 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar14);
                                                }
                                              }
                                              pvVar14 = _DAT_7ffc3ebc3248;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                              pvVar15 = (*(*env)->NewObjectArray)
                                                                  (env,3,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,0,pvVar12);
                                              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0a52e460fb78fa);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,1,pvVar16);
                                              pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,2,pvVar16);
                                              uVar13 = FUN_7ffc3e7d1a50(env,pvVar14,
                                                                        uRam00007ffc3ebc0a40);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                              cVar2 = FUN_7ffc3e7d53d0(env,uVar13,
                                                                       uRam00007ffc3ebc0a38);
LAB_7ffc3eb545a3:
                                              if (cVar2 != '\0') {
                                                pvVar14 = (*(*env)->NewObjectArray)
                                                                    (env,2,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if ((bVar1 != 0) ||
                                                   (lVar9 = FUN_7ffc3eb76c90(env,
                                                  pvRam00007ffc3ebc0a08,2), lVar9 == 0))
                                                goto LAB_7ffc3eb567b5;
                                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0a08,lVar9,1);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                                if (pvVar14 == (void *)0x0) goto LAB_7ffc3eb5666a;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar3 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar14 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar14);
                                                }
                                                if (iVar3 < 2) goto LAB_7ffc3eb5662f;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar14,1,pvVar15);
                                                lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1
                                                                        );
                                                if (lVar9 == 0) goto LAB_7ffc3eb567b5;
                                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar9,
                                                  uVar23 ^ 0x6492f65b8fd9);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar3 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar14 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar14);
                                                }
                                                if (iVar3 < 1) goto LAB_7ffc3eb5662f;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar14,0,pvVar15);
                                                if (_DAT_7ffc3ebc3250 == (void *)0x0) {
                                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                           0x7ffc3eba605c,
                                                                           0x7ffc3eba606a,
                                                                           0x7ffc3eba606c,
                                                                           0x7ffc3eba60e0,
                                                                           0x7ffc3eba626f,0,0);
                                                  if ((lVar9 != 0) &&
                                                     (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3250 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar15);
                                                  }
                                                }
                                                pvVar15 = _DAT_7ffc3ebc3250;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                                pvVar16 = (*(*env)->NewObjectArray)
                                                                    (env,4,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar16,0,pvVar8);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar16,1,pvVar14);
                                                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d1ea211ed5b15cc);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar16,2,pvVar14);
                                                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                ;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar16,3,pvVar14);
                                                FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                              }
                                            } while( true );
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3eb5684e;
                                  }
                                  goto LAB_7ffc3eb532d0;
                                }
                                goto LAB_7ffc3eb566f0;
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
        goto LAB_7ffc3eb5684e;
      }
LAB_7ffc3eb52804:
      if (uVar21 != 0) goto LAB_7ffc3eb5280c;
LAB_7ffc3eb529b5:
      if (_DAT_7ffc3ebc31c0 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0);
        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba62b4,0x7ffc3eba63a7,0,0);
        if ((lVar9 != 0) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0
           )) {
          _DAT_7ffc3ebc31c0 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
      }
      pvVar8 = _DAT_7ffc3ebc31c0;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x4d1ecfd62cd3723b);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
        pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc31c8 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba63db,0,0);
            if ((lVar9 != 0) &&
               (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar8 != (void *)0x0)) {
              _DAT_7ffc3ebc31c8 = (*(*env)->NewGlobalRef)(env,pvVar8);
            }
          }
          pvVar8 = _DAT_7ffc3ebc31c8;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar11 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x4d1fbb1ea4156cf1);
            (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
            pvVar7 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc31d0 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0);
                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba6371,0x7ffc3eba6373,0,0);
                if ((lVar9 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc31d0 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc31d0;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar11 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d1e51f570910163);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,2,pvVar7);
                pvVar7 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar23);
                (*(*env)->SetObjectArrayElement)(env,pvVar11,3,pvVar7);
                FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) goto LAB_7ffc3eb52c96;
              }
            }
          }
        }
      }
      goto LAB_7ffc3eb567b5;
    }
    if (bVar1 == 0) {
      if (_DAT_7ffc3ebc31a8 == (void *)0x0) {
        uVar13 = FUN_7ffc3eb76c30(env,0);
        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba6299,0x7ffc3eba606c,
                                 0x7ffc3eba629b,0x7ffc3eba629d,0,0);
        if ((lVar9 != 0) &&
           (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0
           )) {
          _DAT_7ffc3ebc31a8 = (*(*env)->NewGlobalRef)(env,pvVar8);
        }
      }
      pvVar8 = _DAT_7ffc3ebc31a8;
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x376);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                           uVar23 ^ 0x76907f08e213852c);
        (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
        pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (_DAT_7ffc3ebc31b0 == (void *)0x0) {
            uVar13 = FUN_7ffc3eb76c30(env,0);
            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba6245,0,0);
            if ((lVar9 != 0) &&
               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
               pvVar11 != (void *)0x0)) {
              _DAT_7ffc3ebc31b0 = (*(*env)->NewGlobalRef)(env,pvVar11);
            }
          }
          pvVar11 = _DAT_7ffc3ebc31b0;
          bVar1 = (*(*env)->ExceptionCheck)(env);
          if (bVar1 == 0) {
            pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar7);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x4d05e51f14b24b67);
            (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
            ;
            (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar8);
            uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              bVar1 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
              uVar21 = (uint)bVar1;
              goto LAB_7ffc3eb52804;
            }
          }
        }
      }
      goto LAB_7ffc3eb567b5;
    }
LAB_7ffc3eb5280c:
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,1);
    pJVar19 = *env;
    if (pvVar8 != (void *)0x0) {
      pvVar11 = (*pJVar19->AllocObject)(env,pvVar8);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 == 0) {
        if (pvVar11 == (void *)0x0) {
LAB_7ffc3eb566bc:
          pJVar19 = *env;
          pcVar22 = &DAT_7ffc3eba6000;
          pvVar7 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb566ea:
          (*pJVar19->ThrowNew)(env,pvVar7,pcVar22);
        }
        else {
          lVar9 = FUN_7ffc3eb76c90(env,pvVar8,4);
          if (lVar9 != 0) {
            FUN_7ffc3e7dbbc0(env,pvVar11,pvVar8,lVar9);
            bVar1 = (*(*env)->ExceptionCheck)(env);
            if (bVar1 == 0) {
              if (_DAT_7ffc3ebc31b8 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0);
                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                         0x7ffc3eba6371,0x7ffc3eba6373,0,0);
                if ((lVar9 != 0) &&
                   (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                   pvVar8 != (void *)0x0)) {
                  _DAT_7ffc3ebc31b8 = (*(*env)->NewGlobalRef)(env,pvVar8);
                }
              }
              pvVar8 = _DAT_7ffc3ebc31b8;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar12 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,0,receiver);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   0x4d1e51f570910163);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar11);
                pvVar11 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                   uVar23);
                (*(*env)->SetObjectArrayElement)(env,pvVar12,3,pvVar11);
                FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar12);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                uVar21 = uVar5;
                if (bVar1 == 0) goto LAB_7ffc3eb529ad;
              }
            }
          }
        }
      }
LAB_7ffc3eb566f0:
      pJVar19 = *env;
    }
    pvVar7 = (*pJVar19->ExceptionOccurred)(env);
    pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
    bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
    if (bVar1 == 0) goto LAB_7ffc3eb56724;
    goto LAB_7ffc3eb567e5;
  }
  if (_DAT_7ffc3ebc3130 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0);
    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba6151,0x7ffc3eba6153,0,0);
    if ((lVar9 != 0) &&
       (pvVar8 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar8 != (void *)0x0)) {
      _DAT_7ffc3ebc3130 = (*(*env)->NewGlobalRef)(env,pvVar8);
    }
  }
  pvVar8 = _DAT_7ffc3ebc3130;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 == 0) {
    pvVar11 = (*(*env)->NewObjectArray)(env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x4d09b11fdea0ed47);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23);
    (*(*env)->SetObjectArrayElement)(env,pvVar11,1,pvVar12);
    pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar8,uRam00007ffc3ebc0a40,pvVar11);
    bVar1 = (*(*env)->ExceptionCheck)(env);
    if (bVar1 == 0) {
      pvVar11 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if ((bVar1 == 0) && (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar9 != 0)) {
        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,uVar23 ^ 0x7d8a5ceeecae);
        bVar1 = (*(*env)->ExceptionCheck)(env);
        if (bVar1 == 0) {
          if (pvVar11 != (void *)0x0) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (*(*env)->GetArrayLength)(env,pvVar11);
            }
            if (0 < iVar3) {
              (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
              if (_DAT_7ffc3ebc3138 == (void *)0x0) {
                uVar13 = FUN_7ffc3eb76c30(env,0);
                lVar20 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                          0x7ffc3eba60e0,0x7ffc3eba6167,0,0);
                if ((lVar20 != 0) &&
                   (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar20,uRam00007ffc3ebc0a00),
                   pvVar12 != (void *)0x0)) {
                  _DAT_7ffc3ebc3138 = (*(*env)->NewGlobalRef)(env,pvVar12);
                }
              }
              pvVar12 = _DAT_7ffc3ebc3138;
              bVar1 = (*(*env)->ExceptionCheck)(env);
              if (bVar1 == 0) {
                pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar8);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d03c307b76a1ecc);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar23);
                (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar8);
                pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar14);
                bVar1 = (*(*env)->ExceptionCheck)(env);
                if (bVar1 == 0) {
                  pvVar11 = (*(*env)->NewObjectArray)(env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                  bVar1 = (*(*env)->ExceptionCheck)(env);
                  if (bVar1 == 0) {
                    pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,
                                                       uVar23 ^ 0x76b2d22c6611);
                    bVar1 = (*(*env)->ExceptionCheck)(env);
                    if (bVar1 == 0) {
                      if (pvVar11 == (void *)0x0) goto LAB_7ffc3eb565f6;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar11 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar11);
                      }
                      if (iVar3 < 1) goto LAB_7ffc3eb5648e;
                      (*(*env)->SetObjectArrayElement)(env,pvVar11,0,pvVar12);
                      if (_DAT_7ffc3ebc3140 == (void *)0x0) {
                        uVar13 = FUN_7ffc3eb76c30(env,0);
                        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                 0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61a0,0,0);
                        if ((lVar9 != 0) &&
                           (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                           pvVar12 != (void *)0x0)) {
                          _DAT_7ffc3ebc3140 = (*(*env)->NewGlobalRef)(env,pvVar12);
                        }
                      }
                      pvVar12 = _DAT_7ffc3ebc3140;
                      bVar1 = (*(*env)->ExceptionCheck)(env);
                      if (bVar1 == 0) {
                        pvVar14 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0)
                        ;
                        (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar8);
                        (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar11);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0x4d0696c9d486d267);
                        (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar23);
                        (*(*env)->SetObjectArrayElement)(env,pvVar14,3,pvVar8);
                        pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar14);
                        bVar1 = (*(*env)->ExceptionCheck)(env);
                        if (bVar1 == 0) {
                          if (_DAT_7ffc3ebc3148 == (void *)0x0) {
                            uVar13 = FUN_7ffc3eb76c30(env,0);
                            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61d9,0,
                                                     0);
                            if ((lVar9 != 0) &&
                               (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00),
                               pvVar11 != (void *)0x0)) {
                              _DAT_7ffc3ebc3148 = (*(*env)->NewGlobalRef)(env,pvVar11);
                            }
                          }
                          pvVar11 = _DAT_7ffc3ebc3148;
                          bVar1 = (*(*env)->ExceptionCheck)(env);
                          if (bVar1 == 0) {
                            pvVar12 = (*(*env)->NewObjectArray)
                                                (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                            (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,
                                                              0x4d066e1ebee1c00d);
                            (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar8);
                            pvVar8 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                              uRam00007ffc3ebc0918,uVar23);
                            (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar8);
                            pvVar8 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,
                                                              pvVar12);
                            bVar1 = (*(*env)->ExceptionCheck)(env);
                            if (bVar1 == 0) {
LAB_7ffc3eb50e46:
                              if (_DAT_7ffc3ebc3150 == (void *)0x0) {
                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                         0x7ffc3eba606c,0x7ffc3eba60e0,
                                                         0x7ffc3eba6204,0,0);
                                if ((lVar9 != 0) &&
                                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                       uRam00007ffc3ebc0a00),
                                   pvVar11 != (void *)0x0)) {
                                  _DAT_7ffc3ebc3150 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                }
                              }
                              pvVar11 = _DAT_7ffc3ebc3150;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                              pvVar12 = (*(*env)->NewObjectArray)
                                                  (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 0x4d0921920b032f9f);
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,uVar23);
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
                              uVar13 = FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,pvVar12);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                              cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
                              if (cVar2 == '\0') goto LAB_7ffc3eb524a4;
                              if (_DAT_7ffc3ebc3158 == (void *)0x0) {
                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                         0x7ffc3eba606c,0x7ffc3eba60e0,
                                                         0x7ffc3eba621c,0,0);
                                if ((lVar9 != 0) &&
                                   (pvVar11 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                       uRam00007ffc3ebc0a00),
                                   pvVar11 != (void *)0x0)) {
                                  _DAT_7ffc3ebc3158 = (*(*env)->NewGlobalRef)(env,pvVar11);
                                }
                              }
                              pvVar11 = _DAT_7ffc3ebc3158;
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                              pvVar12 = (*(*env)->NewObjectArray)
                                                  (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar8);
                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 0x4d1ce5c55683540a);
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,uVar23);
                              (*(*env)->SetObjectArrayElement)(env,pvVar12,2,pvVar14);
                              pvVar11 = (void *)FUN_7ffc3e7d1a50(env,pvVar11,uRam00007ffc3ebc0a40,
                                                                 pvVar12);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar1 != 0) ||
                                 (pvVar12 = (void *)FUN_7ffc3eb76c30(env,2), pvVar12 == (void *)0x0)
                                 ) goto LAB_7ffc3eb5684e;
                              if ((pvVar11 != (void *)0x0) &&
                                 (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar12), bVar1 == 0))
                              goto LAB_7ffc3eb5660c;
                              if (uVar5 != 0) {
                                if (_DAT_7ffc3ebc3160 == (void *)0x0) {
                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                           0x7ffc3eba606a,0x7ffc3eba606c,
                                                           0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                                  if ((lVar9 != 0) &&
                                     (pvVar12 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                         uRam00007ffc3ebc0a00),
                                     pvVar12 != (void *)0x0)) {
                                    _DAT_7ffc3ebc3160 = (*(*env)->NewGlobalRef)(env,pvVar12);
                                  }
                                }
                                pvVar12 = _DAT_7ffc3ebc3160;
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  pvVar14 = (*(*env)->NewObjectArray)
                                                      (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar14,0,pvVar11);
                                  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x4d015a79123abbbc);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar14,1,pvVar15);
                                  pvVar15 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar23);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar14,2,pvVar15);
                                  uVar13 = FUN_7ffc3e7d1a50(env,pvVar12,uRam00007ffc3ebc0a40,pvVar14
                                                           );
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    cVar2 = FUN_7ffc3e7d53d0(env,uVar13,uRam00007ffc3ebc0a38);
                                    if (cVar2 == '\0') goto LAB_7ffc3eb5161a;
                                    pvVar12 = (void *)FUN_7ffc3eb76c30(env,4);
                                    if (pvVar12 == (void *)0x0) goto LAB_7ffc3eb566f0;
                                    if ((pvVar11 == (void *)0x0) ||
                                       (bVar1 = (*(*env)->IsInstanceOf)(env,pvVar11,pvVar12),
                                       bVar1 == 0)) {
                                      pvVar12 = (*(*env)->NewObjectArray)
                                                          (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if ((bVar1 != 0) ||
                                         (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0a08,2),
                                         lVar9 == 0)) goto LAB_7ffc3eb567b5;
                                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0a08,
                                                                         lVar9,0);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                      if (pvVar12 == (void *)0x0) goto LAB_7ffc3eb5666a;
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar3 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar12 & 0xfffffffffffffffc)
                                                        + (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                      }
                                      if (iVar3 < 2) goto LAB_7ffc3eb5662f;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar12,1,pvVar14);
                                      lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                                      if (lVar9 == 0) goto LAB_7ffc3eb567b5;
                                      pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         lVar9,uVar23 ^ 
                                                  0x6492f65b8fd9);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar3 = *(int *)(*(longlong *)
                                                          ((ulonglong)pvVar12 & 0xfffffffffffffffc)
                                                        + (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                      }
                                      if (iVar3 < 1) goto LAB_7ffc3eb5662f;
                                      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar14);
                                      if (_DAT_7ffc3ebc3168 == (void *)0x0) {
                                        uVar13 = FUN_7ffc3eb76c30(env,0);
                                        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                                 0x7ffc3eba606a,0x7ffc3eba606c,
                                                                 0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                                        if ((lVar9 != 0) &&
                                           (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                               uRam00007ffc3ebc0a00)
                                           , pvVar14 != (void *)0x0)) {
                                          _DAT_7ffc3ebc3168 = (*(*env)->NewGlobalRef)(env,pvVar14);
                                        }
                                      }
                                      pvVar14 = _DAT_7ffc3ebc3168;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                      pvVar15 = (*(*env)->NewObjectArray)
                                                          (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,
                                                                         0x4d1ea211ed5b15cc);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar12);
                                      pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,uVar23
                                                                        );
                                      (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar12);
                                      FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40,pvVar15);
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 != 0) goto LAB_7ffc3eb567b5;
                                    }
                                    goto LAB_7ffc3eb5161a;
                                  }
                                }
                                pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
                                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
                                if (bVar1 == 0) {
                                  pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
                                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
                                  if (bVar1 == 0) goto LAB_7ffc3eb5685a;
                                  (*(*env)->ExceptionClear)(env);
                                  lVar9 = FUN_7ffc3eb76c30(env,0);
                                  if ((lVar9 == 0) ||
                                     (lVar20 = FUN_7ffc3eb76c90(env,lVar9,6), lVar20 == 0)) {
LAB_7ffc3eb56a9c:
                                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                  }
                                  else {
                                    pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar20,pvVar7);
                                    bVar1 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar1 == 0) {
                                      (*(*env)->Throw)(env,pvVar7);
                                      goto LAB_7ffc3eb56a9c;
                                    }
                                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                  }
                                  pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
                                  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
                                  if (bVar1 == 0) goto LAB_7ffc3eb5685a;
                                }
                                (*(*env)->ExceptionClear)(env);
                                lVar9 = FUN_7ffc3eb76c30(env,0);
                                if ((lVar9 == 0) ||
                                   (lVar20 = FUN_7ffc3eb76c90(env,lVar9,6), lVar20 == 0)) {
LAB_7ffc3eb56961:
                                  pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                }
                                else {
                                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar20,pvVar7);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 == 0) {
                                    (*(*env)->Throw)(env,pvVar7);
                                    goto LAB_7ffc3eb56961;
                                  }
                                  pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                }
                                pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
                                bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
                                if (bVar1 == 0) goto LAB_7ffc3eb5685a;
                                (*(*env)->ExceptionClear)(env);
                                lVar9 = FUN_7ffc3eb76c30(env,0);
                                if ((lVar9 != 0) &&
                                   (lVar20 = FUN_7ffc3eb76c90(env,lVar9,6), lVar20 != 0)) {
                                  pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar20,pvVar7);
                                  bVar1 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar1 != 0) {
                                    pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                    goto LAB_7ffc3eb56724;
                                  }
                                  (*(*env)->Throw)(env,pvVar7);
                                }
                                pvVar7 = (*(*env)->ExceptionOccurred)(env);
                                goto LAB_7ffc3eb56724;
                              }
LAB_7ffc3eb5161a:
                              pvVar12 = (*(*env)->NewObjectArray)
                                                  (env,1,pvRam00007ffc3ebc09e0,(void *)0x0);
                              bVar1 = (*(*env)->ExceptionCheck)(env);
                              if ((bVar1 == 0) &&
                                 (lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1), lVar9 != 0)
                                 ) {
                                pvVar14 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,
                                                                   uVar23 ^ 0x7abf6a407a56);
                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                if (bVar1 == 0) {
                                  if (pvVar12 != (void *)0x0) {
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar3 = *(int *)(*(longlong *)
                                                        ((ulonglong)pvVar12 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar3 = (*(*env)->GetArrayLength)(env,pvVar12);
                                    }
                                    if (0 < iVar3) {
                                      (*(*env)->SetObjectArrayElement)(env,pvVar12,0,pvVar14);
                                      if (_DAT_7ffc3ebc3170 == (void *)0x0) {
                                        uVar13 = FUN_7ffc3eb76c30(env,0);
                                        lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                                 0x7ffc3eba606a,0x7ffc3eba606c,
                                                                 0x7ffc3eba60e0,0x7ffc3eba61a0,0,0);
                                        if ((lVar9 != 0) &&
                                           (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                               uRam00007ffc3ebc0a00)
                                           , pvVar14 != (void *)0x0)) {
                                          _DAT_7ffc3ebc3170 = (*(*env)->NewGlobalRef)(env,pvVar14);
                                        }
                                      }
                                      pvVar14 = _DAT_7ffc3ebc3170;
                                      bVar1 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar1 == 0) {
                                        pvVar15 = (*(*env)->NewObjectArray)
                                                            (env,4,pvRam00007ffc3ebc09e0,(void *)0x0
                                                            );
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar11);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958
                                                                           ,uRam00007ffc3ebc0918,
                                                                           0x4d0230f5d73b374c);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar12);
                                        pvVar12 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958
                                                                           ,uRam00007ffc3ebc0918,
                                                                           uVar23);
                                        (*(*env)->SetObjectArrayElement)(env,pvVar15,3,pvVar12);
                                        pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,
                                                                           uRam00007ffc3ebc0a40,
                                                                           pvVar15);
                                        bVar1 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar1 == 0) {
                                          if (_DAT_7ffc3ebc3178 == (void *)0x0) {
                                            uVar13 = FUN_7ffc3eb76c30(env,0);
                                            lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,
                                                                     0x7ffc3eba606a,0x7ffc3eba606c,
                                                                     0x7ffc3eba60e0,0x7ffc3eba61d9,0
                                                                     ,0);
                                            if ((lVar9 != 0) &&
                                               (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                      
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                              _DAT_7ffc3ebc3178 =
                                                   (*(*env)->NewGlobalRef)(env,pvVar14);
                                            }
                                          }
                                          pvVar14 = _DAT_7ffc3ebc3178;
                                          bVar1 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar1 == 0) {
                                            pvVar15 = (*(*env)->NewObjectArray)
                                                                (env,3,pvRam00007ffc3ebc09e0,
                                                                 (void *)0x0);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,0,pvVar12);
                                            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d066e1ebee1c00d);
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,1,pvVar12);
                                            pvVar12 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                            ;
                                            (*(*env)->SetObjectArrayElement)(env,pvVar15,2,pvVar12);
                                            pvVar12 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,
                                                                               uRam00007ffc3ebc0a40,
                                                                               pvVar15);
                                            bVar1 = (*(*env)->ExceptionCheck)(env);
                                            while (bVar1 == 0) {
                                              do {
                                                if (_DAT_7ffc3ebc3180 == (void *)0x0) {
                                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                           0x7ffc3eba605c,
                                                                           0x7ffc3eba606a,
                                                                           0x7ffc3eba606c,
                                                                           0x7ffc3eba60e0,
                                                                           0x7ffc3eba6204,0,0);
                                                  if ((lVar9 != 0) &&
                                                     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3180 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar14);
                                                  }
                                                }
                                                pvVar14 = _DAT_7ffc3ebc3180;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                                pvVar15 = (*(*env)->NewObjectArray)
                                                                    (env,3,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,0,pvVar12);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0921920b032f9f);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,1,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                ;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,2,pvVar16);
                                                uVar13 = FUN_7ffc3e7d1a50(env,pvVar14,
                                                                          uRam00007ffc3ebc0a40);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                                cVar2 = FUN_7ffc3e7d53d0(env,uVar13,
                                                                         uRam00007ffc3ebc0a38);
                                                if (cVar2 == '\0') {
LAB_7ffc3eb50e33:
                                                  if (uVar5 == 0) goto LAB_7ffc3eb524a4;
                                                  goto LAB_7ffc3eb50e46;
                                                }
                                                if (_DAT_7ffc3ebc3188 == (void *)0x0) {
                                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                           0x7ffc3eba605c,
                                                                           0x7ffc3eba606a,
                                                                           0x7ffc3eba606c,
                                                                           0x7ffc3eba60e0,
                                                                           0x7ffc3eba621c,0,0);
                                                  if ((lVar9 != 0) &&
                                                     (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3188 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar14);
                                                  }
                                                }
                                                pvVar14 = _DAT_7ffc3ebc3188;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb5684e;
                                                pvVar15 = (*(*env)->NewObjectArray)
                                                                    (env,3,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,0,pvVar12);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d1ce5c55683540a);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,1,pvVar16);
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                ;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,2,pvVar16);
                                                pvVar14 = (void *)FUN_7ffc3e7d1a50(env,pvVar14,
                                                                                                                                                                      
                                                  uRam00007ffc3ebc0a40);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if ((bVar1 != 0) ||
                                                   (pvVar15 = (void *)FUN_7ffc3eb76c30(env,5),
                                                   pvVar15 == (void *)0x0)) goto LAB_7ffc3eb5684e;
                                                if ((pvVar14 != (void *)0x0) &&
                                                   (bVar1 = (*(*env)->IsInstanceOf)
                                                                      (env,pvVar14,pvVar15),
                                                   bVar1 == 0)) goto LAB_7ffc3eb5660c;
                                                if ((int)((uint)(0 < (longlong)uVar23) + iVar6) < 1)
                                                goto LAB_7ffc3eb50e33;
                                                if (uVar5 == 0) goto LAB_7ffc3eb524a4;
                                                if (iVar4 == 0) break;
                                                pvVar15 = (*(*env)->NewObjectArray)
                                                                    (env,1,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if ((bVar1 != 0) ||
                                                   (lVar9 = FUN_7ffc3eb76c90(env,
                                                  pvRam00007ffc3ebc0958,1), lVar9 == 0))
                                                goto LAB_7ffc3eb566f0;
                                                pvVar16 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar9,
                                                  uVar23 ^ 0x2ed7f7be6889);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb566f0;
                                                if (pvVar15 == (void *)0x0) goto LAB_7ffc3eb566bc;
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar3 = *(int *)(*(longlong *)
                                                                    ((ulonglong)pvVar15 &
                                                                    0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar3 = (*(*env)->GetArrayLength)(env,pvVar15);
                                                }
                                                if (iVar3 < 1) {
                                                  pJVar19 = *env;
                                                  pcVar22 = (char *)0x7ffc3eba6019;
                                                  pvVar7 = pvRam00007ffc3ebc0a98;
                                                  goto LAB_7ffc3eb566ea;
                                                }
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar15,0,pvVar16);
                                                if (_DAT_7ffc3ebc3190 == (void *)0x0) {
                                                  uVar13 = FUN_7ffc3eb76c30(env,0);
                                                  lVar9 = FUN_7ffc3eb77170(env,uVar13,6,
                                                                           0x7ffc3eba605c,
                                                                           0x7ffc3eba606a,
                                                                           0x7ffc3eba606c,
                                                                           0x7ffc3eba60e0,
                                                                           0x7ffc3eba6245,0,0);
                                                  if ((lVar9 != 0) &&
                                                     (pvVar16 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar16 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc3190 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar16);
                                                  }
                                                }
                                                pvVar16 = _DAT_7ffc3ebc3190;
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb566f0;
                                                pvVar17 = (*(*env)->NewObjectArray)
                                                                    (env,4,pvRam00007ffc3ebc09e0,
                                                                     (void *)0x0);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar17,0,pvVar14);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar17,1,pvVar15);
                                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d060b43b161dbcc);
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar17,2,pvVar15);
                                                pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                                ;
                                                (*(*env)->SetObjectArrayElement)
                                                          (env,pvVar17,3,pvVar15);
                                                uVar13 = FUN_7ffc3e7d1a50(env,pvVar16,
                                                                          uRam00007ffc3ebc0a40);
                                                bVar1 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar1 != 0) goto LAB_7ffc3eb566f0;
                                                cVar2 = FUN_7ffc3e7d53d0(env,uVar13,
                                                                         uRam00007ffc3ebc0a38);
                                              } while (cVar2 == '\0');
                                              pvVar15 = (*(*env)->NewObjectArray)
                                                                  (env,3,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              if (pvVar15 == (void *)0x0) goto LAB_7ffc3eb565f6;
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar3 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar15 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar15);
                                              }
                                              if (iVar3 < 3) goto LAB_7ffc3eb5648e;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,2,pvVar11);
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar3 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar15 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar15);
                                              }
                                              if (iVar3 < 2) goto LAB_7ffc3eb5648e;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,1,pvVar14);
                                              lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
                                              if (lVar9 == 0) break;
                                              pvVar14 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,lVar9,
                                                  uVar23 ^ 0x6b0743156b82);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar3 = *(int *)(*(longlong *)
                                                                  ((ulonglong)pvVar15 &
                                                                  0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar3 = (*(*env)->GetArrayLength)(env,pvVar15);
                                              }
                                              if (iVar3 < 1) goto LAB_7ffc3eb5648e;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar15,0,pvVar14);
                                              if (_DAT_7ffc3ebc3198 == (void *)0x0) {
                                                uVar13 = FUN_7ffc3eb76c30(env,0);
                                                lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c
                                                                         ,0x7ffc3eba606a,
                                                                         0x7ffc3eba606c,
                                                                         0x7ffc3eba60e0,
                                                                         0x7ffc3eba626f,0,0);
                                                if ((lVar9 != 0) &&
                                                   (pvVar14 = (void *)FUN_7ffc3e7d1a50(env,lVar9,
                                                                                                                                                                              
                                                  uRam00007ffc3ebc0a00), pvVar14 != (void *)0x0)) {
                                                  _DAT_7ffc3ebc3198 =
                                                       (*(*env)->NewGlobalRef)(env,pvVar14);
                                                }
                                              }
                                              pvVar14 = _DAT_7ffc3ebc3198;
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar1 != 0) break;
                                              pvVar16 = (*(*env)->NewObjectArray)
                                                                  (env,4,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,0,receiver);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,1,pvVar15);
                                              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x4d0425e1ab586058);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,2,pvVar15);
                                              pvVar15 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar16,3,pvVar15);
                                              FUN_7ffc3e7d1a50(env,pvVar14,uRam00007ffc3ebc0a40);
                                              bVar1 = (*(*env)->ExceptionCheck)(env);
                                            }
                                          }
                                        }
                                      }
                                      goto LAB_7ffc3eb5684e;
                                    }
                                    goto LAB_7ffc3eb5648e;
                                  }
                                  goto LAB_7ffc3eb565f6;
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
              goto LAB_7ffc3eb5684e;
            }
            goto LAB_7ffc3eb5648e;
          }
          goto LAB_7ffc3eb565f6;
        }
      }
    }
  }
  goto LAB_7ffc3eb5684e;
LAB_7ffc3eb5660c:
  pJVar19 = *env;
  pcVar22 = (char *)0x7ffc3eba6033;
  pvVar7 = pvRam00007ffc3ebc0a58;
LAB_7ffc3eb56624:
  (*pJVar19->ThrowNew)(env,pvVar7,pcVar22);
  goto LAB_7ffc3eb5684e;
LAB_7ffc3eb5666a:
  pJVar19 = *env;
  pcVar22 = &DAT_7ffc3eba6000;
  pvVar7 = pvRam00007ffc3ebc0a70;
  goto LAB_7ffc3eb5667e;
LAB_7ffc3eb555e0:
  pvVar17 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
  if (pvVar17 == (void *)0x0) goto LAB_7ffc3eb565f6;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar17 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,pvVar17);
  }
  if (iVar3 < 4) goto LAB_7ffc3eb5648e;
  (*(*env)->SetObjectArrayElement)(env,pvVar17,3,pvVar8);
  lVar9 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,1);
  if (lVar9 == 0) goto LAB_7ffc3eb5684e;
  pvVar18 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,lVar9,uVar23 ^ 0x40203af3d15e);
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar17 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,pvVar17);
  }
  if (iVar3 < 3) goto LAB_7ffc3eb5648e;
  (*(*env)->SetObjectArrayElement)(env,pvVar17,2,pvVar18);
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar17 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,pvVar17);
  }
  if (iVar3 < 2) goto LAB_7ffc3eb5648e;
  (*(*env)->SetObjectArrayElement)(env,pvVar17,1,pvVar16);
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)((ulonglong)pvVar17 & 0xfffffffffffffffc) +
                    (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (*(*env)->GetArrayLength)(env,pvVar17);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb5648e;
  (*(*env)->SetObjectArrayElement)(env,pvVar17,0,pvVar15);
  if (_DAT_7ffc3ebc3290 == (void *)0x0) {
    uVar13 = FUN_7ffc3eb76c30(env,0);
    lVar9 = FUN_7ffc3eb77170(env,uVar13,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                             0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
    if ((lVar9 != 0) &&
       (pvVar15 = (void *)FUN_7ffc3e7d1a50(env,lVar9,uRam00007ffc3ebc0a00), pvVar15 != (void *)0x0))
    {
      _DAT_7ffc3ebc3290 = (*(*env)->NewGlobalRef)(env,pvVar15);
    }
  }
  pvVar15 = _DAT_7ffc3ebc3290;
  bVar1 = (*(*env)->ExceptionCheck)(env);
  if (bVar1 != 0) goto LAB_7ffc3eb5684e;
  pvVar16 = (*(*env)->NewObjectArray)(env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,0,receiver);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,1,pvVar17);
  pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0x4d025149b8cf6dcc);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,2,pvVar17);
  pvVar17 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar23);
  (*(*env)->SetObjectArrayElement)(env,pvVar16,3,pvVar17);
  FUN_7ffc3e7d1a50(env,pvVar15,uRam00007ffc3ebc0a40);
  goto LAB_7ffc3eb54af0;
LAB_7ffc3eb5662f:
  pJVar19 = *env;
  pcVar22 = (char *)0x7ffc3eba6019;
  pvVar7 = pvRam00007ffc3ebc0a98;
LAB_7ffc3eb5667e:
  (*pJVar19->ThrowNew)(env,pvVar7,pcVar22);
LAB_7ffc3eb567b5:
  pvVar7 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb567be:
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
  if (bVar1 != 0) {
LAB_7ffc3eb567e5:
    (*(*env)->ExceptionClear)(env);
    lVar9 = FUN_7ffc3eb76c30(env,0);
    if ((lVar9 != 0) && (lVar20 = FUN_7ffc3eb76c90(env,lVar9,6), lVar20 != 0)) {
      pvVar7 = (void *)FUN_7ffc3e7d1a80(env,lVar9,lVar20,pvVar7);
      bVar1 = (*(*env)->ExceptionCheck)(env);
      if (bVar1 != 0) {
        pvVar7 = (*(*env)->ExceptionOccurred)(env);
        goto LAB_7ffc3eb5685a;
      }
      (*(*env)->Throw)(env,pvVar7);
    }
LAB_7ffc3eb5684e:
    pvVar7 = (*(*env)->ExceptionOccurred)(env);
  }
LAB_7ffc3eb5685a:
  pvVar8 = (void *)FUN_7ffc3eb76c30(env,3);
  bVar1 = (*(*env)->IsInstanceOf)(env,pvVar7,pvVar8);
  if (bVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb56897. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(*env)->ExceptionClear)(env);
  return;
}

/* JNI_dev_krypton_6_9_7 | RVA 0x386b00 | dev/krypton/6.9([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_9_7(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  ulonglong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulonglong uVar13;
  undefined *puVar14;
  
  if (param_3 == 0) {
    lVar6 = *param_1;
LAB_7ffc3eb56c95:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar14 = &DAT_7ffc3eba6000;
    uVar11 = uRam00007ffc3ebc0a70;
    goto LAB_7ffc3eb56ca0;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 1) {
LAB_7ffc3eb57a3c:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar14 = (undefined *)0x7ffc3eba6019;
    uVar11 = uRam00007ffc3ebc0a98;
LAB_7ffc3eb56ca0:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb56cb3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(param_1,uVar11,puVar14);
    return;
  }
  lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
  lVar6 = FUN_7ffc3eb76c30(param_1,5);
  if (lVar6 == 0) {
    return;
  }
  if ((lVar5 != 0) && (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,lVar6), cVar1 == '\0'))
  {
LAB_7ffc3eb57a5d:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar14 = (undefined *)0x7ffc3eba6033;
    uVar11 = uRam00007ffc3ebc0a58;
    goto LAB_7ffc3eb56ca0;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 2) goto LAB_7ffc3eb57a3c;
  lVar7 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
  lVar6 = FUN_7ffc3eb76c30(param_1,7);
  if (lVar6 == 0) {
    return;
  }
  if ((lVar7 != 0) && (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar7,lVar6), cVar1 == '\0'))
  goto LAB_7ffc3eb57a5d;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 3) goto LAB_7ffc3eb57a3c;
  lVar8 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
  lVar6 = *param_1;
  if (lVar8 == 0) goto LAB_7ffc3eb56c95;
  cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar8,uRam00007ffc3ebc0958);
  if (cVar1 == '\0') goto LAB_7ffc3eb57a5d;
  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
  if (lVar6 == 0) {
    return;
  }
  uVar9 = FUN_7ffc3e7d1a20(param_1,lVar8,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 4) goto LAB_7ffc3eb57a3c;
  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,3);
  lVar8 = FUN_7ffc3eb76c30(param_1,2);
  if (lVar8 == 0) {
    return;
  }
  if ((lVar6 != 0) && (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar8), cVar1 == '\0'))
  goto LAB_7ffc3eb57a5d;
  uVar10 = FUN_7ffc3eb76c30(param_1,0);
  if (uVar10 == 0) {
    return;
  }
  lVar8 = FUN_7ffc3eb76ce0(param_1,uVar10,0);
  if (lVar8 == 0) {
    return;
  }
  if (cRam00007ffc3ebc08f4 == '\x01') {
    uVar13 = *(ulonglong *)
              (*(longlong *)(uVar10 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar8 + 0x10));
  }
  else {
    uVar13 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar10,lVar8);
  }
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  lVar8 = FUN_7ffc3eb76c90(param_1,uVar10,5);
  if (lVar8 == 0) {
    return;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,uVar10,lVar8);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar8 != 0)) {
    uVar13 = uVar13 ^ uVar9;
    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar8,uVar13 ^ 0x1eb794a752a6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb57ae1;
    if (uVar10 == 0) {
      lVar6 = *param_1;
      puVar14 = &DAT_7ffc3eba6000;
      uVar11 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb57adb:
      (**(code **)(lVar6 + 0x70))(param_1,uVar11,puVar14);
      goto LAB_7ffc3eb57ae1;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
      ;
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
    }
    if (iVar3 < 2) {
LAB_7ffc3eb57a90:
      lVar6 = *param_1;
      puVar14 = (undefined *)0x7ffc3eba6019;
      uVar11 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb57adb;
    }
    (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar11);
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
      ;
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
    }
    if (iVar3 < 1) goto LAB_7ffc3eb57a90;
    (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,lVar7);
    if (_DAT_7ffc3ebc3328 == 0) {
      uVar11 = FUN_7ffc3eb76c30(param_1,0);
      lVar7 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
      if ((lVar7 != 0) && (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00), lVar7 != 0)
         ) {
        _DAT_7ffc3ebc3328 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
      }
    }
    lVar7 = _DAT_7ffc3ebc3328;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb57ae1;
    uVar11 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,lVar5);
    (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar10);
    uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0xb912734394a741c8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar12);
    uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
    (**(code **)(*param_1 + 0x570))(param_1,uVar11,3,uVar12);
    FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar11);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb57ae1;
    lVar7 = FUN_7ffc3eb76c30(param_1,6);
    if (iVar2 == 0) {
      if (lVar7 == 0) goto LAB_7ffc3eb57c33;
      if (lVar5 != 0) goto LAB_7ffc3eb571b8;
LAB_7ffc3eb571d3:
      iVar3 = (int)((longlong)uVar13 >> 0x3f);
      iVar2 = iVar3 + (uint)(0 < (longlong)uVar13);
      if (iVar2 == 0 || SCARRY4(iVar3,(uint)(0 < (longlong)uVar13)) != iVar2 < 0) {
        return;
      }
      uVar9 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 == '\0') && (lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar7 != 0))
      {
        uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar7,uVar13 ^ 0x2a5c333d6b15);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (uVar9 == 0) {
LAB_7ffc3eb57b80:
            lVar6 = *param_1;
            puVar14 = &DAT_7ffc3eba6000;
            uVar11 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb57b94:
            (**(code **)(lVar6 + 0x70))(param_1,uVar11,puVar14);
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
            }
            if (iVar2 < 1) goto LAB_7ffc3eb57aaa;
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar11);
            if (_DAT_7ffc3ebc3330 == 0) {
              uVar11 = FUN_7ffc3eb76c30(param_1,0);
              lVar8 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba60e0,0x7ffc3eba6245,0,0);
              if ((lVar8 != 0) &&
                 (lVar8 = FUN_7ffc3e7d1a50(param_1,lVar8,uRam00007ffc3ebc0a00), lVar8 != 0)) {
                _DAT_7ffc3ebc3330 = (**(code **)(*param_1 + 0xa8))(param_1,lVar8);
              }
            }
            lVar8 = _DAT_7ffc3ebc3330;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar11 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,lVar5);
              (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0xb9165057f4874082);
              (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar12);
              uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
              (**(code **)(*param_1 + 0x570))(param_1,uVar11,3,uVar12);
              uVar11 = FUN_7ffc3e7d1a50(param_1,lVar8,uRam00007ffc3ebc0a40,uVar11);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                cVar1 = FUN_7ffc3e7d53d0(param_1,uVar11,uRam00007ffc3ebc0a38);
                if (cVar1 == '\0') {
                  return;
                }
                uVar9 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar7,
                                            uVar13 ^ 0x6bdf08d09df8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (uVar9 == 0) goto LAB_7ffc3eb57b80;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
                    }
                    if (iVar2 < 1) goto LAB_7ffc3eb57aaa;
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar11);
                    if (_DAT_7ffc3ebc3338 == 0) {
                      uVar11 = FUN_7ffc3eb76c30(param_1,0);
                      lVar8 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6347,0,0);
                      if ((lVar8 != 0) &&
                         (lVar8 = FUN_7ffc3e7d1a50(param_1,lVar8,uRam00007ffc3ebc0a00), lVar8 != 0))
                      {
                        _DAT_7ffc3ebc3338 = (**(code **)(*param_1 + 0xa8))(param_1,lVar8);
                      }
                    }
                    lVar8 = _DAT_7ffc3ebc3338;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      uVar11 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,lVar5);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                      uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0xb911040a6c936cfd);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar12);
                      uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar13);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,3,uVar12);
                      uVar11 = FUN_7ffc3e7d1a50(param_1,lVar8,uRam00007ffc3ebc0a40,uVar11);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 == '\0') {
                        uVar4 = FUN_7ffc3e7d8be0(param_1,uVar11,uRam00007ffc3ebc09d0);
                        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if ((cVar1 == '\0') &&
                           (lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7), lVar5 != 0)) {
                          uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar5,uVar4);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') {
                            if (uVar9 == 0) goto LAB_7ffc3eb57b80;
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
                            }
                            if (iVar2 < 2) {
LAB_7ffc3eb57aaa:
                              lVar6 = *param_1;
                              puVar14 = (undefined *)0x7ffc3eba6019;
                              uVar11 = uRam00007ffc3ebc0a98;
                              goto LAB_7ffc3eb57b94;
                            }
                            (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar7,
                                                      uVar13 ^ 0x18858f8be914);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
                              }
                              if (iVar2 < 1) goto LAB_7ffc3eb57aaa;
                              (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar11);
                              if (_DAT_7ffc3ebc3340 == 0) {
                                uVar11 = FUN_7ffc3eb76c30(param_1,0);
                                lVar5 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,
                                                         0x7ffc3eba606a,0x7ffc3eba606c,
                                                         0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                                if ((lVar5 != 0) &&
                                   (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00),
                                   lVar5 != 0)) {
                                  _DAT_7ffc3ebc3340 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
                                }
                              }
                              lVar5 = _DAT_7ffc3ebc3340;
                              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar1 == '\0') {
                                uVar11 = (**(code **)(*param_1 + 0x560))
                                                   (param_1,4,uRam00007ffc3ebc09e0,0);
                                (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,lVar6);
                                (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                                uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,0xb90a44d60f060c74);
                                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar12);
                                uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                          uRam00007ffc3ebc0918,uVar13);
                                (**(code **)(*param_1 + 0x570))(param_1,uVar11,3,uVar12);
                                FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar11);
                                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                if (cVar1 == '\0') {
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
      goto LAB_7ffc3eb57b9a;
    }
    if (lVar7 == 0) {
      uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
      uVar12 = FUN_7ffc3eb76c30(param_1,8);
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
      if (cVar1 == '\0') goto LAB_7ffc3eb57aed;
      goto LAB_7ffc3eb57bca;
    }
    if (lVar5 == 0) {
      return;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,lVar7);
    if (cVar1 == '\0') {
      return;
    }
    lVar7 = FUN_7ffc3eb76c30(param_1,6);
    if (lVar7 != 0) {
LAB_7ffc3eb571b8:
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,lVar7);
      if (cVar1 != '\0') goto LAB_7ffc3eb571d3;
      (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a58,0x7ffc3eba6033);
    }
  }
  else {
LAB_7ffc3eb57ae1:
    uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb57aed:
    uVar12 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
    if (cVar1 == '\0') goto LAB_7ffc3eb57c3f;
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar6 = FUN_7ffc3eb76c30(param_1,0);
    if ((lVar6 == 0) || (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,6), lVar5 == 0)) {
LAB_7ffc3eb57b9a:
      uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
    }
    else {
      uVar11 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 == '\0') {
        (**(code **)(*param_1 + 0x68))(param_1,uVar11);
        goto LAB_7ffc3eb57b9a;
      }
      uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
    }
    uVar12 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
    if (cVar1 == '\0') goto LAB_7ffc3eb57c3f;
LAB_7ffc3eb57bca:
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar6 = FUN_7ffc3eb76c30(param_1,0);
    if ((lVar6 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,6), lVar5 != 0)) {
      uVar11 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
        goto LAB_7ffc3eb57c3f;
      }
      (**(code **)(*param_1 + 0x68))(param_1,uVar11);
    }
  }
LAB_7ffc3eb57c33:
  uVar11 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb57c3f:
  uVar12 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar11,uVar12);
  if (cVar1 == '\0') {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb57c7d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x88))(param_1);
  return;
}

/* JNI_dev_krypton_6_3Y_8 | RVA 0x387d00 | dev/krypton/6.3Y([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_3Y_8(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  undefined *puVar13;
  
  if (param_3 == 0) {
    lVar4 = *param_1;
LAB_7ffc3eb57e06:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x70);
    puVar13 = &DAT_7ffc3eba6000;
    uVar9 = uRam00007ffc3ebc0a70;
    goto LAB_7ffc3eb57e11;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 1) {
LAB_7ffc3eb58670:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar13 = (undefined *)0x7ffc3eba6019;
    uVar9 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar3 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar4 = FUN_7ffc3eb76c30(param_1,5);
    if (lVar4 == 0) {
      return;
    }
    if ((lVar3 == 0) ||
       (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar3,lVar4), cVar1 != '\0')) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar2 < 2) goto LAB_7ffc3eb58670;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar4 = *param_1;
      if (lVar5 == 0) goto LAB_7ffc3eb57e06;
      cVar1 = (**(code **)(lVar4 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 != '\0') {
        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar4 == 0) {
          return;
        }
        uVar6 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
        }
        if (iVar2 < 3) goto LAB_7ffc3eb58670;
        lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
        lVar5 = FUN_7ffc3eb76c30(param_1,1);
        if (lVar5 == 0) {
          return;
        }
        if ((lVar4 == 0) ||
           (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,lVar5), cVar1 != '\0')) {
          uVar7 = FUN_7ffc3eb76c30(param_1,0);
          if (uVar7 == 0) {
            return;
          }
          lVar5 = FUN_7ffc3eb76ce0(param_1,uVar7,0);
          if (lVar5 == 0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar7 = *(ulonglong *)
                     (*(longlong *)(uVar7 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar5 + 0x10));
          }
          else {
            uVar7 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar7,lVar5);
          }
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if ((cVar1 != '\0') ||
             (lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar5 == 0))
          goto LAB_7ffc3eb586f8;
          uVar7 = uVar7 ^ uVar6;
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar5,uVar7 ^ 0x1eba1e459fce);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3eb586f8;
          if (uVar8 == 0) {
LAB_7ffc3eb586c4:
            lVar4 = *param_1;
            puVar13 = &DAT_7ffc3eba6000;
            uVar9 = uRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if (0 < iVar2) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
              if (_DAT_7ffc3ebc46d8 == 0) {
                uVar9 = FUN_7ffc3eb76c30(param_1,0);
                lVar12 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                          0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba630c,0,0);
                if ((lVar12 != 0) &&
                   (lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,uRam00007ffc3ebc0a00), lVar12 != 0)) {
                  _DAT_7ffc3ebc46d8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar12);
                }
              }
              lVar12 = _DAT_7ffc3ebc46d8;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb586f8;
              uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,lVar3);
              (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar8);
              uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x687f160adc76177);
              (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
              uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar7);
              (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
              uVar9 = FUN_7ffc3e7d1a50(param_1,lVar12,uRam00007ffc3ebc0a40,uVar9);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb586f8;
              uVar6 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb586f8;
              uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar5,uVar7 ^ 0xe0060b4c170);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') goto LAB_7ffc3eb586f8;
              if (uVar6 == 0) goto LAB_7ffc3eb586c4;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
              }
              if (0 < iVar2) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar6,0,uVar10);
                if (_DAT_7ffc3ebc46e0 == 0) {
                  uVar10 = FUN_7ffc3eb76c30(param_1,0);
                  lVar5 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                           0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6410,0,0);
                  if ((lVar5 != 0) &&
                     (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
                    _DAT_7ffc3ebc46e0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
                  }
                }
                lVar5 = _DAT_7ffc3ebc46e0;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,lVar3);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar6);
                  uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x68f17c1b47d3e4b);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
                  uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar7)
                  ;
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
                  uVar10 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar10);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (_DAT_7ffc3ebc46e8 == 0) {
                      uVar11 = FUN_7ffc3eb76c30(param_1,0);
                      lVar3 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba62d0,0,0);
                      if ((lVar3 != 0) &&
                         (lVar3 = FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a00), lVar3 != 0))
                      {
                        _DAT_7ffc3ebc46e8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar3);
                      }
                    }
                    lVar3 = _DAT_7ffc3ebc46e8;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      uVar11 = (**(code **)(*param_1 + 0x560))(param_1,5,uRam00007ffc3ebc09e0,0);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,lVar4);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar10);
                      uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               0x69bd9d13a5e6e04);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,3,uVar9);
                      uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                               uVar7);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar11,4,uVar9);
                      FUN_7ffc3e7d1a50(param_1,lVar3,uRam00007ffc3ebc0a40,uVar11);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 == '\0') {
                        return;
                      }
                    }
                  }
                }
                goto LAB_7ffc3eb586f8;
              }
            }
            lVar4 = *param_1;
            puVar13 = (undefined *)0x7ffc3eba6019;
            uVar9 = uRam00007ffc3ebc0a98;
          }
          (**(code **)(lVar4 + 0x70))(param_1,uVar9,puVar13);
LAB_7ffc3eb586f8:
          uVar9 = (**(code **)(*param_1 + 0x78))(param_1);
          uVar10 = FUN_7ffc3eb76c30(param_1,8);
          cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar9,uVar10);
          if (cVar1 == '\0') {
            return;
          }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb58742. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (**(code **)(*param_1 + 0x88))(param_1);
          return;
        }
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar13 = (undefined *)0x7ffc3eba6033;
    uVar9 = uRam00007ffc3ebc0a58;
  }
LAB_7ffc3eb57e11:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb57e24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar13);
  return;
}

/* JNI_dev_krypton_6_4P_9 | RVA 0x388750 | dev/krypton/6.4P([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_4P_9(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  ulonglong uVar6;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined *puVar11;
  
  if (param_3 == 0) {
    lVar5 = *param_1;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (iVar3 < 1) {
LAB_7ffc3eb591c4:
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar11 = (undefined *)0x7ffc3eba6019;
      uVar8 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb58893;
    }
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar5 = *param_1;
    if (lVar4 != 0) {
      cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
      if (cVar1 != '\0') {
        lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return;
        }
        uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
        }
        if (iVar3 < 2) goto LAB_7ffc3eb591c4;
        lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
        lVar5 = *param_1;
        if (lVar4 == 0) goto LAB_7ffc3eb58888;
        cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0a10);
        if (cVar1 != '\0') {
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
          if (lVar5 == 0) {
            return;
          }
          uVar2 = FUN_7ffc3e7d8be0(param_1,lVar4,lVar5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          if (iVar3 < 3) goto LAB_7ffc3eb591c4;
          lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
          lVar4 = FUN_7ffc3eb76c30(param_1,9);
          if (lVar4 == 0) {
            return;
          }
          if ((lVar5 == 0) ||
             (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,lVar4), cVar1 != '\0')) {
            uVar7 = FUN_7ffc3eb76c30(param_1,0);
            if (uVar7 == 0) {
              return;
            }
            lVar4 = FUN_7ffc3eb76ce0(param_1,uVar7,0);
            if (lVar4 == 0) {
              return;
            }
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar7 = *(ulonglong *)
                       (*(longlong *)(uVar7 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar4 + 0x10)
                       );
            }
            else {
              uVar7 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar7,lVar4);
            }
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (_DAT_7ffc3ebc46f0 == 0) {
              uVar8 = FUN_7ffc3eb76c30(param_1,0);
              lVar4 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba6151,0x7ffc3eba6456,0,0);
              if ((lVar4 != 0) &&
                 (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
                _DAT_7ffc3ebc46f0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
              }
            }
            lVar4 = _DAT_7ffc3ebc46f0;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
            uVar7 = uVar7 ^ uVar6;
            uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
            uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xf01c2a747f8cf297);
            (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
            uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar7);
            (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar8);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
            uVar6 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if ((cVar1 != '\0') ||
               (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar4 == 0))
            goto LAB_7ffc3eb5924c;
            uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar7 ^ 0x7befcd11927d);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
            if (uVar6 == 0) {
LAB_7ffc3eb59232:
              lVar5 = *param_1;
              puVar11 = &DAT_7ffc3eba6000;
              uVar8 = uRam00007ffc3ebc0a70;
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
              }
              if (2 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar6,2,uVar9);
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
                }
                if (1 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar6,1,lVar5);
                  lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                  if (lVar5 == 0) goto LAB_7ffc3eb5924c;
                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar5,uVar2);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
                  }
                  if (0 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar6,0,uVar9);
                    if (_DAT_7ffc3ebc46f8 == 0) {
                      uVar9 = FUN_7ffc3eb76c30(param_1,0);
                      lVar5 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba62b4,0x7ffc3eba645f,0,0);
                      if ((lVar5 != 0) &&
                         (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0))
                      {
                        _DAT_7ffc3ebc46f8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
                      }
                    }
                    lVar5 = _DAT_7ffc3ebc46f8;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
                    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar6);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xf00bf830ba797a63);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar7);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                    uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar9);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
                    uVar6 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
                    if (uVar6 == 0) goto LAB_7ffc3eb59232;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
                    }
                    if (1 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar6,1,uVar9);
                      uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,
                                               uVar7 ^ 0x2f5f6e7e23d1);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') goto LAB_7ffc3eb5924c;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
                      }
                      if (0 < iVar3) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar6,0,uVar9);
                        if (_DAT_7ffc3ebc4700 == 0) {
                          uVar9 = FUN_7ffc3eb76c30(param_1,0);
                          lVar5 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                   0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0)
                          ;
                          if ((lVar5 != 0) &&
                             (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00),
                             lVar5 != 0)) {
                            _DAT_7ffc3ebc4700 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
                          }
                        }
                        lVar5 = _DAT_7ffc3ebc4700;
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 == '\0') {
                          uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar8);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar6);
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                   ,0xf002f9317aa4eb06);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar8);
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918
                                                   ,uVar7);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar8);
                          FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar9);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') {
                            return;
                          }
                        }
                        goto LAB_7ffc3eb5924c;
                      }
                    }
                  }
                }
              }
              lVar5 = *param_1;
              puVar11 = (undefined *)0x7ffc3eba6019;
              uVar8 = uRam00007ffc3ebc0a98;
            }
            (**(code **)(lVar5 + 0x70))(param_1,uVar8,puVar11);
LAB_7ffc3eb5924c:
            uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
            uVar9 = FUN_7ffc3eb76c30(param_1,8);
            cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar9);
            if (cVar1 == '\0') {
              return;
            }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb59296. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (**(code **)(*param_1 + 0x88))(param_1);
            return;
          }
        }
      }
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar11 = (undefined *)0x7ffc3eba6033;
      uVar8 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb58893;
    }
  }
LAB_7ffc3eb58888:
  UNRECOVERED_JUMPTABLE = *(code **)(lVar5 + 0x70);
  puVar11 = &DAT_7ffc3eba6000;
  uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb58893:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb588a6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar8,puVar11);
  return;
}

/* JNI_dev_krypton_6_2_10 | RVA 0x3892a0 | dev/krypton/6.2([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_2_10(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) goto LAB_7ffc3eb59e8c;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) {
LAB_7ffc3eb59e6b:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar12 = (undefined *)0x7ffc3eba6019;
    uVar9 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar6 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
LAB_7ffc3eb59e9e:
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar12 = (undefined *)0x7ffc3eba6033;
        uVar9 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb593e4;
      }
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return;
      }
      uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar4 < 2) goto LAB_7ffc3eb59e6b;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar6 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a10);
        if (cVar1 == '\0') goto LAB_7ffc3eb59e9e;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
        if (lVar6 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar8 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc3110 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba647c,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc3110 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc3110;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = uVar8 ^ uVar7;
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x4279);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  uVar8 ^ 0x42f6a62c00afc5bd);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar3 = FUN_7ffc3e7d8be0(param_1,uVar9,uRam00007ffc3ebc09d0);
        uVar9 = FUN_7ffc3eb76c30(param_1,10);
        uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc3118 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6482,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc3118 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc3118;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0xa595a4df8dbc74ef);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar7 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (0 < iVar4) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar9);
            if (_DAT_7ffc3ebc3120 == 0) {
              uVar9 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc3120 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc3120;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xa5974aa085c07e4d);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
            uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (1 < iVar4) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar9);
              uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (uVar11 == 0) goto LAB_7ffc3eb59e8c;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
              }
              if (2 < iVar4) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar7);
                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                if (lVar6 == 0) {
                  return;
                }
                uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (1 < iVar4) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                  if (lVar6 == 0) {
                    return;
                  }
                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,uVar8 ^ 0x177d592770d9
                                          );
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                  }
                  if (0 < iVar4) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar9);
                    if (_DAT_7ffc3ebc3128 == 0) {
                      uVar9 = FUN_7ffc3eb76c30(param_1,0);
                      lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                      if ((lVar6 != 0) &&
                         (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0))
                      {
                        _DAT_7ffc3ebc3128 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                      }
                    }
                    lVar6 = _DAT_7ffc3ebc3128;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xa58c4420fd761283);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar8);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                    FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb59dc0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (**(code **)(*param_1 + 0x720))(param_1);
                    return;
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb59e6b;
        }
LAB_7ffc3eb59e8c:
        lVar6 = *param_1;
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar12 = &DAT_7ffc3eba6000;
    uVar9 = uRam00007ffc3ebc0a70;
  }
LAB_7ffc3eb593e4:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb593f7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_1T_11 | RVA 0x38a160 | dev/krypton/6.1T([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_1T_11(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  undefined4 uVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulonglong uVar13;
  undefined *puVar14;
  
  if (param_3 == 0) {
LAB_7ffc3eb5b22b:
    lVar7 = *param_1;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (iVar3 < 1) goto LAB_7ffc3eb5b20a;
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar7 = *param_1;
    if (lVar6 != 0) {
      cVar1 = (**(code **)(lVar7 + 0x100))(param_1,lVar6,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') goto LAB_7ffc3eb5b23d;
      lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar7 == 0) {
        return;
      }
      uVar8 = FUN_7ffc3e7d1a20(param_1,lVar6,lVar7);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar3 < 2) goto LAB_7ffc3eb5b20a;
      lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar7 = *param_1;
      if (lVar6 == 0) goto LAB_7ffc3eb5a297;
      cVar1 = (**(code **)(lVar7 + 0x100))(param_1,lVar6,uRam00007ffc3ebc0a10);
      if (cVar1 == '\0') {
LAB_7ffc3eb5b23d:
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar14 = (undefined *)0x7ffc3eba6033;
        uVar10 = uRam00007ffc3ebc0a58;
      }
      else {
        lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
        if (lVar7 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
        }
        if (2 < iVar3) {
          lVar7 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
          if ((lVar7 != 0) &&
             (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar7,uRam00007ffc3ebc09e8),
             cVar1 == '\0')) goto LAB_7ffc3eb5b23d;
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          if (uVar9 == 0) {
            return;
          }
          lVar6 = FUN_7ffc3eb76ce0(param_1,uVar9,0);
          if (lVar6 == 0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar13 = *(ulonglong *)
                      (*(longlong *)(uVar9 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10))
            ;
          }
          else {
            uVar13 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar9,lVar6);
          }
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          lVar6 = FUN_7ffc3eb76c90(param_1,uVar9,9);
          if (lVar6 == 0) {
            return;
          }
          iVar3 = FUN_7ffc3e7db1e0(param_1,uVar9,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar9 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
          if (lVar6 == 0) {
            return;
          }
          uVar13 = uVar13 ^ uVar8;
          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,uVar13 ^ 0x761e17e1512e);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (uVar9 == 0) goto LAB_7ffc3eb5b22b;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar5 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
          }
          if (0 < iVar5) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
            if (_DAT_7ffc3ebc4680 == 0) {
              uVar10 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba60e0,0x7ffc3eba630c,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc4680 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc4680;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,param_2);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar9);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x56f0dcc3af8d0d9);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
            uVar10 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar10);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (_DAT_7ffc3ebc4688 == 0) {
              uVar11 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c
                                       ,0x7ffc3eba647a,0x7ffc3eba647c,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc4688 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc4688;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
            uVar11 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x2305);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar12);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar13 ^ 0x130c69f569ee8424);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar12);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar11);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
            uVar4 = FUN_7ffc3e7d8be0(param_1,uVar11,uRam00007ffc3ebc09d0);
            uVar11 = FUN_7ffc3eb76c30(param_1,10);
            uVar8 = (**(code **)(*param_1 + 0x560))(param_1,4,uVar11,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
            if (_DAT_7ffc3ebc4690 == 0) {
              uVar11 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c
                                       ,0x7ffc3eba6151,0x7ffc3eba6482,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc4690 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc4690;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
            uVar11 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x5778c11b40cd40d);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar12);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar12);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar11);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
            uVar11 = FUN_7ffc3eb59ec0(param_1,uVar11);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
            if (uVar8 == 0) {
LAB_7ffc3eb5b278:
              lVar7 = *param_1;
              puVar14 = &DAT_7ffc3eba6000;
              uVar10 = uRam00007ffc3ebc0a70;
            }
            else {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
              }
              if (0 < iVar5) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar11);
                if (_DAT_7ffc3ebc4698 == 0) {
                  uVar11 = FUN_7ffc3eb76c30(param_1,0);
                  lVar6 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                           0x7ffc3eba606c,0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
                  if ((lVar6 != 0) &&
                     (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                    _DAT_7ffc3ebc4698 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                  }
                }
                lVar6 = _DAT_7ffc3ebc4698;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar12);
                uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                          0x575626ebc70deaf);
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar12);
                uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar12);
                uVar11 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar11);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                uVar11 = FUN_7ffc3eb59ec0(param_1,uVar11);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                }
                if (1 < iVar5) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar11);
                  uVar11 = FUN_7ffc3eb59ec0(param_1,lVar7);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                  }
                  if (2 < iVar5) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar11);
                    uVar10 = FUN_7ffc3eb59ec0(param_1,uVar10);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar5 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                    }
                    if (3 < iVar5) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar8,3,uVar10);
                      uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                      if (uVar9 == 0) goto LAB_7ffc3eb5b278;
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar5 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
                      }
                      if (2 < iVar5) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar8);
                        lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                        if (lVar7 == 0) goto LAB_7ffc3eb5b292;
                        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar7,uVar4);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar5 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
                        }
                        if (1 < iVar5) {
                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
                          lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                          if (lVar7 == 0) goto LAB_7ffc3eb5b292;
                          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar7,
                                                    uVar13 ^ 0x3fb36097d03b);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') goto LAB_7ffc3eb5b292;
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar5 = *(int *)(*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar5 = (**(code **)(*param_1 + 0x558))(param_1,uVar9);
                          }
                          if (0 < iVar5) {
                            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
                            if (_DAT_7ffc3ebc46a0 == 0) {
                              uVar10 = FUN_7ffc3eb76c30(param_1,0);
                              lVar7 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,
                                                       0x7ffc3eba606a,0x7ffc3eba606c,0x7ffc3eba60e0,
                                                       0x7ffc3eba626f,0,0);
                              if ((lVar7 != 0) &&
                                 (lVar7 = FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a00),
                                 lVar7 != 0)) {
                                _DAT_7ffc3ebc46a0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar7);
                              }
                            }
                            lVar7 = _DAT_7ffc3ebc46a0;
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              uVar10 = (**(code **)(*param_1 + 0x560))
                                                 (param_1,4,uRam00007ffc3ebc09e0,0);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,param_2);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar9);
                              uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,0x56e6ceec4c6b261);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
                              uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,uVar13);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
                              FUN_7ffc3e7d1a50(param_1,lVar7,uRam00007ffc3ebc0a40,uVar10);
                              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar1 == '\0') {
                                if (iVar3 == 0) {
                                  return;
                                }
                                uVar10 = (**(code **)(*param_1 + 0x560))
                                                   (param_1,1,uRam00007ffc3ebc09e8,0);
                                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                if (((cVar1 == '\0') &&
                                    (lVar7 = FUN_7ffc3eb76c30(param_1,0xb), lVar7 != 0)) &&
                                   (lVar6 = FUN_7ffc3eb76c90(param_1,lVar7,10), lVar6 != 0)) {
                                  FUN_7ffc3e7e6a80(param_1,lVar7,lVar6,uVar10);
                                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                  if (cVar1 == '\0') {
                                    return;
                                  }
                                }
                              }
                            }
                            goto LAB_7ffc3eb5b292;
                          }
                        }
                      }
                    }
                  }
                }
              }
              lVar7 = *param_1;
              puVar14 = (undefined *)0x7ffc3eba6019;
              uVar10 = uRam00007ffc3ebc0a98;
            }
            (**(code **)(lVar7 + 0x70))(param_1,uVar10,puVar14);
LAB_7ffc3eb5b292:
            uVar10 = (**(code **)(*param_1 + 0x78))(param_1);
            uVar11 = FUN_7ffc3eb76c30(param_1,3);
            cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar10,uVar11);
            if (cVar1 != '\0') {
              (**(code **)(*param_1 + 0x88))(param_1);
              lVar7 = FUN_7ffc3eb76c30(param_1,0);
              if ((lVar7 != 0) && (lVar6 = FUN_7ffc3eb76c90(param_1,lVar7,6), lVar6 != 0)) {
                uVar10 = FUN_7ffc3e7d1a80(param_1,lVar7,lVar6,uVar10);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5b347. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (**(code **)(*param_1 + 0x68))(param_1,uVar10);
                  return;
                }
              }
            }
            return;
          }
        }
LAB_7ffc3eb5b20a:
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar14 = (undefined *)0x7ffc3eba6019;
        uVar10 = uRam00007ffc3ebc0a98;
      }
      goto LAB_7ffc3eb5a2a2;
    }
  }
LAB_7ffc3eb5a297:
  UNRECOVERED_JUMPTABLE = *(code **)(lVar7 + 0x70);
  puVar14 = &DAT_7ffc3eba6000;
  uVar10 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb5a2a2:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5a2b5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar10,puVar14);
  return;
}

/* JNI_dev_krypton_6_5_12 | RVA 0x38b350 | dev/krypton/6.5([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_5_12(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) goto LAB_7ffc3eb5bf3c;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) {
LAB_7ffc3eb5bf1b:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar12 = (undefined *)0x7ffc3eba6019;
    uVar9 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar6 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
LAB_7ffc3eb5bf4e:
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar12 = (undefined *)0x7ffc3eba6033;
        uVar9 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb5b494;
      }
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return;
      }
      uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar4 < 2) goto LAB_7ffc3eb5bf1b;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar6 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a10);
        if (cVar1 == '\0') goto LAB_7ffc3eb5bf4e;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
        if (lVar6 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar8 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc32b8 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba647c,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc32b8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc32b8;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = uVar8 ^ uVar7;
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x3860);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  uVar8 ^ 0x7cbfdbcd5c20efea);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar3 = FUN_7ffc3e7d8be0(param_1,uVar9,uRam00007ffc3ebc09d0);
        uVar9 = FUN_7ffc3eb76c30(param_1,10);
        uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc32c0 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6482,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc32c0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc32c0;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0x75dfd9b40960a4a5);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar7 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (0 < iVar4) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar9);
            if (_DAT_7ffc3ebc32c8 == 0) {
              uVar9 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc32c8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc32c8;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x75dd37cb011cae07);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
            uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (1 < iVar4) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar9);
              uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (uVar11 == 0) goto LAB_7ffc3eb5bf3c;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
              }
              if (2 < iVar4) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar7);
                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                if (lVar6 == 0) {
                  return;
                }
                uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (1 < iVar4) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                  if (lVar6 == 0) {
                    return;
                  }
                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,uVar8 ^ 0x6a16ddfba093
                                          );
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                  }
                  if (0 < iVar4) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar9);
                    if (_DAT_7ffc3ebc32d0 == 0) {
                      uVar9 = FUN_7ffc3eb76c30(param_1,0);
                      lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                      if ((lVar6 != 0) &&
                         (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0))
                      {
                        _DAT_7ffc3ebc32d0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                      }
                    }
                    lVar6 = _DAT_7ffc3ebc32d0;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x75c6394b79aac2c9);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar8);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                    FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5be70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (**(code **)(*param_1 + 0x720))(param_1);
                    return;
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb5bf1b;
        }
LAB_7ffc3eb5bf3c:
        lVar6 = *param_1;
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar12 = &DAT_7ffc3eba6000;
    uVar9 = uRam00007ffc3ebc0a70;
  }
LAB_7ffc3eb5b494:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5b4a7. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_7U_13 | RVA 0x38bf70 | dev/krypton/6.7U([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_7U_13(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) goto LAB_7ffc3eb5cb75;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) {
LAB_7ffc3eb5cb54:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar12 = (undefined *)0x7ffc3eba6019;
    uVar9 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar6 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a10);
      if (cVar1 == '\0') {
LAB_7ffc3eb5cb87:
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar12 = (undefined *)0x7ffc3eba6033;
        uVar9 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb5c0b8;
      }
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
      if (lVar6 == 0) {
        return;
      }
      uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar4 < 2) goto LAB_7ffc3eb5cb54;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar6 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
        if (cVar1 == '\0') goto LAB_7ffc3eb5cb87;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar8 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc4728 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba647c,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc4728 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc4728;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = uVar8 ^ uVar7;
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x56b5);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  uVar8 ^ 0x62a95d999c3a0b21);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar3 = FUN_7ffc3e7d8be0(param_1,uVar9,uRam00007ffc3ebc09d0);
        uVar9 = FUN_7ffc3eb76c30(param_1,10);
        uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc4730 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6482,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc4730 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc4730;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0x7fc3ef9f26a3aeb9);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar7 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (0 < iVar4) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar9);
            if (_DAT_7ffc3ebc4738 == 0) {
              uVar9 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc4738 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc4738;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0x7fc101e02edfa41b);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
            uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (1 < iVar4) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar9);
              uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (uVar11 == 0) goto LAB_7ffc3eb5cb75;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
              }
              if (2 < iVar4) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar7);
                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                if (lVar6 == 0) {
                  return;
                }
                uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (1 < iVar4) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                  if (lVar6 == 0) {
                    return;
                  }
                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,uVar8 ^ 0x5c3df238aa8f
                                          );
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                  }
                  if (0 < iVar4) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar9);
                    if (_DAT_7ffc3ebc4740 == 0) {
                      uVar9 = FUN_7ffc3eb76c30(param_1,0);
                      lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                      if ((lVar6 != 0) &&
                         (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0))
                      {
                        _DAT_7ffc3ebc4740 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                      }
                    }
                    lVar6 = _DAT_7ffc3ebc4740;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x7fda0f605669c8d5);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar8);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                    FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5caa9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (**(code **)(*param_1 + 0x720))(param_1);
                    return;
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb5cb54;
        }
LAB_7ffc3eb5cb75:
        lVar6 = *param_1;
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar12 = &DAT_7ffc3eba6000;
    uVar9 = uRam00007ffc3ebc0a70;
  }
LAB_7ffc3eb5c0b8:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5c0cb. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_71_14 | RVA 0x38cbb0 | dev/krypton/6.71([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_71_14(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) goto LAB_7ffc3eb5d7b5;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) {
LAB_7ffc3eb5d794:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar12 = (undefined *)0x7ffc3eba6019;
    uVar9 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar6 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a10);
      if (cVar1 == '\0') {
LAB_7ffc3eb5d7c7:
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar12 = (undefined *)0x7ffc3eba6033;
        uVar9 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb5ccf8;
      }
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
      if (lVar6 == 0) {
        return;
      }
      uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar4 < 2) goto LAB_7ffc3eb5d794;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar6 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
        if (cVar1 == '\0') goto LAB_7ffc3eb5d7c7;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar8 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc4708 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba647c,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc4708 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc4708;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = uVar8 ^ uVar7;
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x28c5);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  uVar8 ^ 0x780566a2b3a0aa28);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar3 = FUN_7ffc3e7d8be0(param_1,uVar9,uRam00007ffc3ebc09d0);
        uVar9 = FUN_7ffc3eb76c30(param_1,10);
        uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc4710 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6482,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc4710 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc4710;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0xa0bff7b7935871c5);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar7 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (0 < iVar4) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar9);
            if (_DAT_7ffc3ebc4718 == 0) {
              uVar9 = FUN_7ffc3eb76c30(param_1,0);
              lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
              if ((lVar6 != 0) &&
                 (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                _DAT_7ffc3ebc4718 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
              }
            }
            lVar6 = _DAT_7ffc3ebc4718;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xa0bd19c89b247b67);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
            uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
            (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
            uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (1 < iVar4) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar9);
              uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (uVar11 == 0) goto LAB_7ffc3eb5d7b5;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
              }
              if (2 < iVar4) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar7);
                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                if (lVar6 == 0) {
                  return;
                }
                uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (1 < iVar4) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                  if (lVar6 == 0) {
                    return;
                  }
                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,uVar8 ^ 0x441547c375f3
                                          );
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                  }
                  if (0 < iVar4) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar9);
                    if (_DAT_7ffc3ebc4720 == 0) {
                      uVar9 = FUN_7ffc3eb76c30(param_1,0);
                      lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                      if ((lVar6 != 0) &&
                         (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0))
                      {
                        _DAT_7ffc3ebc4720 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                      }
                    }
                    lVar6 = _DAT_7ffc3ebc4720;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0xa0a61748e39217a9);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar8);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                    FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5d6e9. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (**(code **)(*param_1 + 0x720))(param_1);
                    return;
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb5d794;
        }
LAB_7ffc3eb5d7b5:
        lVar6 = *param_1;
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar12 = &DAT_7ffc3eba6000;
    uVar9 = uRam00007ffc3ebc0a70;
  }
LAB_7ffc3eb5ccf8:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5cd0b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_1m_15 | RVA 0x38d7f0 | dev/krypton/6.1m([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_1m_15(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined *puVar12;
  ulonglong uVar13;
  
  if (param_3 == 0) {
LAB_7ffc3eb5e5e2:
    lVar6 = *param_1;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (iVar2 < 1) {
LAB_7ffc3eb5e5c1:
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar12 = (undefined *)0x7ffc3eba6019;
      uVar9 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb5d87f;
    }
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar6 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 != '\0') {
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
        }
        if (iVar2 < 2) goto LAB_7ffc3eb5e5c1;
        lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
        if ((lVar6 == 0) ||
           (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8),
           cVar1 != '\0')) {
          uVar8 = FUN_7ffc3eb76c30(param_1,0);
          if (uVar8 == 0) {
            return;
          }
          lVar5 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
          if (lVar5 == 0) {
            return;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar13 = *(ulonglong *)
                      (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar5 + 0x10))
            ;
          }
          else {
            uVar13 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar5);
          }
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          lVar5 = FUN_7ffc3eb76c90(param_1,uVar8,9);
          if (lVar5 == 0) {
            return;
          }
          iVar2 = FUN_7ffc3e7db1e0(param_1,uVar8,lVar5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
          if (lVar5 == 0) {
            return;
          }
          uVar13 = uVar13 ^ uVar7;
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar5,uVar13 ^ 0x47ee4ddf6638);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (uVar8 == 0) goto LAB_7ffc3eb5e5e2;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (iVar4 < 1) goto LAB_7ffc3eb5e5c1;
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
          if (_DAT_7ffc3ebc46a8 == 0) {
            uVar9 = FUN_7ffc3eb76c30(param_1,0);
            lVar5 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba60e0,0x7ffc3eba630c,0,0);
            if ((lVar5 != 0) &&
               (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
              _DAT_7ffc3ebc46a8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
            }
          }
          lVar5 = _DAT_7ffc3ebc46a8;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar8);
          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                    0x2dfd93e7f64ccbed);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13);
          (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar9);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (_DAT_7ffc3ebc46b0 == 0) {
            uVar10 = FUN_7ffc3eb76c30(param_1,0);
            lVar5 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                     0x7ffc3eba647a,0x7ffc3eba647c,0,0);
            if ((lVar5 != 0) &&
               (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
              _DAT_7ffc3ebc46b0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
            }
          }
          lVar5 = _DAT_7ffc3ebc46b0;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x7333);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar11);
            uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar13 ^ 0x6ee24655d6eefc94);
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar11);
            uVar10 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar10);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar3 = FUN_7ffc3e7d8be0(param_1,uVar10,uRam00007ffc3ebc09d0);
              uVar10 = FUN_7ffc3eb76c30(param_1,10);
              uVar7 = (**(code **)(*param_1 + 0x560))(param_1,3,uVar10,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (_DAT_7ffc3ebc46b8 == 0) {
                  uVar10 = FUN_7ffc3eb76c30(param_1,0);
                  lVar5 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                           0x7ffc3eba606c,0x7ffc3eba6151,0x7ffc3eba6482,0,0);
                  if ((lVar5 != 0) &&
                     (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
                    _DAT_7ffc3ebc46b8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
                  }
                }
                lVar5 = _DAT_7ffc3ebc46b8;
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
                  uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x2dfeed4a4360fc84);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar11);
                  uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar13
                                           );
                  (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar11);
                  uVar10 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar10);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    uVar10 = FUN_7ffc3eb59ec0(param_1,uVar10);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 == '\0') {
                      if (uVar7 == 0) {
LAB_7ffc3eb5e62f:
                        lVar6 = *param_1;
                        puVar12 = &DAT_7ffc3eba6000;
                        uVar9 = uRam00007ffc3ebc0a70;
                      }
                      else {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                        }
                        if (0 < iVar4) {
                          (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar10);
                          uVar10 = FUN_7ffc3eb59ec0(param_1,lVar6);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 == '\0') {
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                            }
                            if (iVar4 < 2) goto LAB_7ffc3eb5e5f4;
                            (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar10);
                            uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                              }
                              if (iVar4 < 3) goto LAB_7ffc3eb5e5f4;
                              (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uVar9);
                              uVar8 = (**(code **)(*param_1 + 0x560))
                                                (param_1,3,uRam00007ffc3ebc09e0,0);
                              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar1 == '\0') {
                                if (uVar8 == 0) goto LAB_7ffc3eb5e62f;
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                                }
                                if (iVar4 < 3) goto LAB_7ffc3eb5e5f4;
                                (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar7);
                                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                                if (lVar6 != 0) {
                                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3)
                                  ;
                                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                  if (cVar1 == '\0') {
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                                    }
                                    if (iVar4 < 2) goto LAB_7ffc3eb5e5f4;
                                    (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
                                    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                                    if (lVar6 != 0) {
                                      uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,
                                                               uVar13 ^ 0x5ee897fbf8b2);
                                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                      if (cVar1 == '\0') {
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                                        }
                                        if (iVar4 < 1) goto LAB_7ffc3eb5e5f4;
                                        (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
                                        if (_DAT_7ffc3ebc46c0 == 0) {
                                          uVar9 = FUN_7ffc3eb76c30(param_1,0);
                                          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,
                                                                   0x7ffc3eba606a,0x7ffc3eba606c,
                                                                   0x7ffc3eba60e0,0x7ffc3eba626f,0,0
                                                                  );
                                          if ((lVar6 != 0) &&
                                             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,
                                                                       uRam00007ffc3ebc0a00),
                                             lVar6 != 0)) {
                                            _DAT_7ffc3ebc46c0 =
                                                 (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                                          }
                                        }
                                        lVar6 = _DAT_7ffc3ebc46c0;
                                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                        if (cVar1 == '\0') {
                                          uVar9 = (**(code **)(*param_1 + 0x560))
                                                            (param_1,4,uRam00007ffc3ebc09e0,0);
                                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar8);
                                          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,
                                                                    0x2de70db533aa9ae8);
                                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                                          uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                                    uRam00007ffc3ebc0918,uVar13);
                                          (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                                          FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9)
                                          ;
                                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                          if (((cVar1 == '\0') &&
                                              (lVar6 = FUN_7ffc3eb76c30(param_1,0xb), lVar6 != 0))
                                             && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,0xb),
                                                lVar5 != 0)) {
                                            lVar6 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5);
                                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                            if (cVar1 == '\0') {
                                              if (lVar6 != 0) {
                                                return;
                                              }
                                              lVar6 = FUN_7ffc3eb76c30(param_1,0);
                                              if (lVar6 == 0) {
                                                return;
                                              }
                                              lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,0xc);
                                              if (lVar5 == 0) {
                                                return;
                                              }
                                              FUN_7ffc3e7e6a80(param_1,lVar6,lVar5,iVar2 == 0);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5e5ba. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                              (**(code **)(*param_1 + 0x720))(param_1);
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
                          goto LAB_7ffc3eb5e649;
                        }
LAB_7ffc3eb5e5f4:
                        lVar6 = *param_1;
                        puVar12 = (undefined *)0x7ffc3eba6019;
                        uVar9 = uRam00007ffc3ebc0a98;
                      }
                      (**(code **)(lVar6 + 0x70))(param_1,uVar9,puVar12);
                    }
                  }
                }
              }
            }
          }
LAB_7ffc3eb5e649:
          uVar9 = (**(code **)(*param_1 + 0x78))(param_1);
          uVar10 = FUN_7ffc3eb76c30(param_1,3);
          cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar9,uVar10);
          if (cVar1 == '\0') {
            return;
          }
          (**(code **)(*param_1 + 0x88))(param_1);
          lVar6 = FUN_7ffc3eb76c30(param_1,0);
          if ((lVar6 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,6), lVar5 != 0)) {
            uVar9 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5,uVar9);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              uVar9 = (**(code **)(*param_1 + 0x78))(param_1);
              goto LAB_7ffc3eb5e6ef;
            }
            (**(code **)(*param_1 + 0x68))(param_1,uVar9);
          }
          uVar9 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb5e6ef:
          uVar10 = FUN_7ffc3eb76c30(param_1,3);
          cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar9,uVar10);
          if (cVar1 != '\0') {
            (**(code **)(*param_1 + 0x88))(param_1);
            lVar6 = FUN_7ffc3eb76c30(param_1,0);
            if ((lVar6 != 0) && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,6), lVar5 != 0)) {
              uVar9 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar5,uVar9);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5e79b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                (**(code **)(*param_1 + 0x68))(param_1,uVar9);
                return;
              }
            }
          }
          return;
        }
      }
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar12 = (undefined *)0x7ffc3eba6033;
      uVar9 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb5d87f;
    }
  }
  UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
  puVar12 = &DAT_7ffc3eba6000;
  uVar9 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb5d87f:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5d892. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_1_16 | RVA 0x38e7b0 | dev/krypton/6.1([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_1_16(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) goto LAB_7ffc3eb5f1af;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (0 < iVar3) {
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    if ((lVar4 != 0) &&
       (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uRam00007ffc3ebc09e8), cVar1 == '\0'))
    {
LAB_7ffc3eb5f1c1:
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar12 = (undefined *)0x7ffc3eba6033;
      uVar9 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb5e8b2;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (1 < iVar3) {
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar6 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
        if (cVar1 == '\0') goto LAB_7ffc3eb5f1c1;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar8 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar8 = *(ulonglong *)
                   (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc30f8 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba647c,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc30f8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc30f8;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar8 = uVar8 ^ uVar7;
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x15a0);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  uVar8 ^ 0x8bf0a0104c612bc);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(param_1,uVar9,uRam00007ffc3ebc09d0);
        uVar9 = FUN_7ffc3eb76c30(param_1,10);
        uVar7 = (**(code **)(*param_1 + 0x560))(param_1,2,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc3100 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6482,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc3100 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc3100;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0x254cb431550bf436);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar7 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (0 < iVar3) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar9);
            uVar9 = FUN_7ffc3eb59ec0(param_1,lVar4);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (1 < iVar3) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar9);
              uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (uVar11 == 0) goto LAB_7ffc3eb5f1af;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
              }
              if (2 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar7);
                lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                if (lVar4 == 0) {
                  return;
                }
                uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar4,uVar2);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (1 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                  lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                  if (lVar4 == 0) {
                    return;
                  }
                  uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar8 ^ 0x7938190f000)
                  ;
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                  }
                  if (0 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar9);
                    if (_DAT_7ffc3ebc3108 == 0) {
                      uVar9 = FUN_7ffc3eb76c30(param_1,0);
                      lVar4 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                      if ((lVar4 != 0) &&
                         (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0))
                      {
                        _DAT_7ffc3ebc3108 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
                      }
                    }
                    lVar4 = _DAT_7ffc3ebc3108;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x255554ce25c1925a);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                    uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar8);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                    FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5f0e3. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (**(code **)(*param_1 + 0x720))(param_1);
                    return;
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb5f18e;
        }
LAB_7ffc3eb5f1af:
        lVar6 = *param_1;
      }
      UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
      puVar12 = &DAT_7ffc3eba6000;
      uVar9 = uRam00007ffc3ebc0a70;
      goto LAB_7ffc3eb5e8b2;
    }
  }
LAB_7ffc3eb5f18e:
  UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
  puVar12 = (undefined *)0x7ffc3eba6019;
  uVar9 = uRam00007ffc3ebc0a98;
LAB_7ffc3eb5e8b2:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5e8c5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_2M_17 | RVA 0x38f1f0 | dev/krypton/6.2M([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_2M_17(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_3 == 0) {
LAB_7ffc3eb5f726:
    lVar4 = *param_1;
LAB_7ffc3eb5f275:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x70);
    puVar10 = &DAT_7ffc3eba6000;
    uVar7 = uRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (0 < iVar2) {
      lVar3 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
      lVar4 = *param_1;
      if (lVar3 == 0) goto LAB_7ffc3eb5f275;
      cVar1 = (**(code **)(lVar4 + 0x100))(param_1,lVar3,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
        UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
        puVar10 = (undefined *)0x7ffc3eba6033;
        uVar7 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb5f280;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar4 == 0) {
        return;
      }
      uVar5 = FUN_7ffc3e7d1a20(param_1,lVar3,lVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar6 = FUN_7ffc3eb76c30(param_1,0);
      if (uVar6 == 0) {
        return;
      }
      lVar4 = FUN_7ffc3eb76ce0(param_1,uVar6,0);
      if (lVar4 == 0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar6 = *(ulonglong *)
                 (*(longlong *)(uVar6 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar4 + 0x10));
      }
      else {
        uVar6 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar6,lVar4);
      }
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar7 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba64b1);
      uVar8 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a08,2);
      if (lVar4 == 0) {
        return;
      }
      uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a08,lVar4,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (uVar8 == 0) goto LAB_7ffc3eb5f726;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
      }
      if (2 < iVar2) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar9);
        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
        if (lVar4 == 0) {
          return;
        }
        uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar4,uVar6 ^ uVar5 ^ 0x4a7c8eefc12f);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (1 < iVar2) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (0 < iVar2) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar7);
            if (_DAT_7ffc3ebc46c8 == 0) {
              uVar7 = FUN_7ffc3eb76c30(param_1,0);
              lVar4 = FUN_7ffc3eb77170(param_1,uVar7,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                       0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
              if ((lVar4 != 0) &&
                 (lVar4 = FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a00), lVar4 != 0)) {
                _DAT_7ffc3ebc46c8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
              }
            }
            lVar4 = _DAT_7ffc3ebc46c8;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar7 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,param_2);
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
            uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                     0xb9921b34248dbbe3);
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uVar9);
            uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar6 ^ uVar5
                                    );
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar9);
            FUN_7ffc3e7d1a50(param_1,lVar4,uRam00007ffc3ebc0a40,uVar7);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5f65a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (**(code **)(*param_1 + 0x720))(param_1);
            return;
          }
        }
      }
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar7 = uRam00007ffc3ebc0a98;
  }
LAB_7ffc3eb5f280:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5f293. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar7,puVar10);
  return;
}

/* JNI_dev_krypton_6_7_18 | RVA 0x38f760 | dev/krypton/6.7([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_7_18(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar8;
  ulonglong uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  undefined *puVar13;
  
  if (param_3 == 0) goto LAB_7ffc3eb6045b;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) goto LAB_7ffc3eb6043a;
  lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
  lVar6 = *param_1;
  if (lVar5 == 0) {
LAB_7ffc3eb5f915:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar13 = &DAT_7ffc3eba6000;
    uVar10 = uRam00007ffc3ebc0a70;
    goto LAB_7ffc3eb5f920;
  }
  cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a10);
  if (cVar1 == '\0') {
LAB_7ffc3eb6046d:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar13 = (undefined *)0x7ffc3eba6033;
    uVar10 = uRam00007ffc3ebc0a58;
  }
  else {
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
    if (lVar6 == 0) {
      return;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (1 < iVar4) {
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      if ((lVar5 != 0) &&
         (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar5,uRam00007ffc3ebc09e8), cVar1 == '\0'
         )) goto LAB_7ffc3eb6046d;
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (2 < iVar4) {
        lVar7 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
        lVar6 = *param_1;
        if (lVar7 == 0) goto LAB_7ffc3eb5f915;
        cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar7,uRam00007ffc3ebc0958);
        if (cVar1 == '\0') goto LAB_7ffc3eb6046d;
        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar6 == 0) {
          return;
        }
        uVar8 = FUN_7ffc3e7d1a20(param_1,lVar7,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar9 == 0) {
          return;
        }
        lVar6 = FUN_7ffc3eb76ce0(param_1,uVar9,0);
        if (lVar6 == 0) {
          return;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar9 = *(ulonglong *)
                   (*(longlong *)(uVar9 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar6 + 0x10));
        }
        else {
          uVar9 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar9,lVar6);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc32f8 == 0) {
          uVar10 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                   0x7ffc3eba647a,0x7ffc3eba647c,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc32f8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc32f8;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = uVar9 ^ uVar8;
        uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x7cc2);
        (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar11);
        uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  uVar9 ^ 0xfac4532c262af30);
        (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar11);
        uVar10 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar10);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar3 = FUN_7ffc3e7d8be0(param_1,uVar10,uRam00007ffc3ebc09d0);
        uVar10 = FUN_7ffc3eb76c30(param_1,10);
        uVar8 = (**(code **)(*param_1 + 0x560))(param_1,3,uVar10,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (_DAT_7ffc3ebc3300 == 0) {
          uVar10 = FUN_7ffc3eb76c30(param_1,0);
          lVar6 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba6151,0x7ffc3eba6482,0,0);
          if ((lVar6 != 0) &&
             (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
            _DAT_7ffc3ebc3300 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
          }
        }
        lVar6 = _DAT_7ffc3ebc3300;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
        uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0x71aae17f42c7a0d0);
        (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar11);
        uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
        (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar11);
        uVar10 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar10);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar10 = FUN_7ffc3eb59ec0(param_1,uVar10);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar8 == 0) {
LAB_7ffc3eb6045b:
          lVar6 = *param_1;
          goto LAB_7ffc3eb5f915;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (0 < iVar4) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar10);
          if (_DAT_7ffc3ebc3308 == 0) {
            uVar10 = FUN_7ffc3eb76c30(param_1,0);
            lVar6 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                     0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
            if ((lVar6 != 0) &&
               (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
              _DAT_7ffc3ebc3308 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
            }
          }
          lVar6 = _DAT_7ffc3ebc3308;
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar10 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
          uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
          (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar11);
          uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                    0x71a80f004abbaa72);
          (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar11);
          uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
          (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
          uVar10 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar10);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar10 = FUN_7ffc3eb59ec0(param_1,uVar10);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (1 < iVar4) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar10);
            uVar10 = FUN_7ffc3eb59ec0(param_1,lVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if (2 < iVar4) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar10);
              uVar12 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (uVar12 == 0) goto LAB_7ffc3eb6045b;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)(uVar12 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar12);
              }
              if (2 < iVar4) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar12,2,uVar8);
                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                if (lVar6 == 0) {
                  return;
                }
                uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar12 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar12);
                }
                if (1 < iVar4) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar12,1,uVar10);
                  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                  if (lVar6 == 0) {
                    return;
                  }
                  uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,
                                            uVar9 ^ 0x52dd965ca4e6);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar4 = *(int *)(*(longlong *)(uVar12 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar12);
                  }
                  if (0 < iVar4) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar12,0,uVar10);
                    if (_DAT_7ffc3ebc3310 == 0) {
                      uVar10 = FUN_7ffc3eb76c30(param_1,0);
                      lVar6 = FUN_7ffc3eb77170(param_1,uVar10,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                               0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                      if ((lVar6 != 0) &&
                         (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0))
                      {
                        _DAT_7ffc3ebc3310 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                      }
                    }
                    lVar6 = _DAT_7ffc3ebc3310;
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    uVar10 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,param_2);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar12);
                    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              0x71b30180320dc6bc);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar11);
                    uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                              uVar9);
                    (**(code **)(*param_1 + 0x570))(param_1,uVar10,3,uVar11);
                    FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar10);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb6038f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                    (**(code **)(*param_1 + 0x720))(param_1);
                    return;
                  }
                }
              }
            }
          }
        }
      }
    }
LAB_7ffc3eb6043a:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar13 = (undefined *)0x7ffc3eba6019;
    uVar10 = uRam00007ffc3ebc0a98;
  }
LAB_7ffc3eb5f920:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb5f933. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar10,puVar13);
  return;
}

/* JNI_dev_krypton_6_4_19 | RVA 0x390490 | dev/krypton/6.4([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_4_19(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined *puVar12;
  
  if (param_3 == 0) goto LAB_7ffc3eb61180;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 1) goto LAB_7ffc3eb6115f;
  lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
  lVar6 = *param_1;
  if (lVar5 == 0) {
LAB_7ffc3eb605d2:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar6 + 0x70);
    puVar12 = &DAT_7ffc3eba6000;
    uVar9 = uRam00007ffc3ebc0a70;
    goto LAB_7ffc3eb605dd;
  }
  cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0a10);
  if (cVar1 == '\0') goto LAB_7ffc3eb61192;
  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
  if (lVar6 == 0) {
    return;
  }
  uVar2 = FUN_7ffc3e7d8be0(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar4 < 2) goto LAB_7ffc3eb6115f;
  lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
  lVar6 = *param_1;
  if (lVar5 == 0) goto LAB_7ffc3eb605d2;
  cVar1 = (**(code **)(lVar6 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
  if (cVar1 == '\0') {
LAB_7ffc3eb61192:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar12 = (undefined *)0x7ffc3eba6033;
    uVar9 = uRam00007ffc3ebc0a58;
  }
  else {
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar6 == 0) {
      return;
    }
    uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (2 < iVar4) {
      lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
      if ((lVar6 != 0) &&
         (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8), cVar1 == '\0'
         )) goto LAB_7ffc3eb61192;
      uVar8 = FUN_7ffc3eb76c30(param_1,0);
      if (uVar8 == 0) {
        return;
      }
      lVar5 = FUN_7ffc3eb76ce0(param_1,uVar8,0);
      if (lVar5 == 0) {
        return;
      }
      if (cRam00007ffc3ebc08f4 == '\x01') {
        uVar8 = *(ulonglong *)
                 (*(longlong *)(uVar8 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar5 + 0x10));
      }
      else {
        uVar8 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar8,lVar5);
      }
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (_DAT_7ffc3ebc3298 == 0) {
        uVar9 = FUN_7ffc3eb76c30(param_1,0);
        lVar5 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                                 0x7ffc3eba647a,0x7ffc3eba647c,0,0);
        if ((lVar5 != 0) &&
           (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
          _DAT_7ffc3ebc3298 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
        }
      }
      lVar5 = _DAT_7ffc3ebc3298;
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar8 = uVar8 ^ uVar7;
      uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x7047);
      (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
      uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                uVar8 ^ 0xcab2d41512c4dec);
      (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar3 = FUN_7ffc3e7d8be0(param_1,uVar9,uRam00007ffc3ebc09d0);
      uVar9 = FUN_7ffc3eb76c30(param_1,10);
      uVar7 = (**(code **)(*param_1 + 0x560))(param_1,3,uVar9,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (_DAT_7ffc3ebc32a0 == 0) {
        uVar9 = FUN_7ffc3eb76c30(param_1,0);
        lVar5 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                 0x7ffc3eba6151,0x7ffc3eba6482,0,0);
        if ((lVar5 != 0) &&
           (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
          _DAT_7ffc3ebc32a0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
        }
      }
      lVar5 = _DAT_7ffc3ebc32a0;
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar9 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
      uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x9fff9fc879584e85
                               );
      (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
      uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
      (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return;
      }
      if (uVar7 == 0) {
LAB_7ffc3eb61180:
        lVar6 = *param_1;
        goto LAB_7ffc3eb605d2;
      }
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
      }
      if (0 < iVar4) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uVar9);
        if (_DAT_7ffc3ebc32a8 == 0) {
          uVar9 = FUN_7ffc3eb76c30(param_1,0);
          lVar5 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba62b4,0x7ffc3eba6499,0,0);
          if ((lVar5 != 0) &&
             (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
            _DAT_7ffc3ebc32a8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
          }
        }
        lVar5 = _DAT_7ffc3ebc32a8;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,uVar2);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                  0x9ffd71b771244427);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar10);
        uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8);
        (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        uVar9 = FUN_7ffc3eb59ec0(param_1,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
        }
        if (1 < iVar4) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar9);
          uVar9 = FUN_7ffc3eb59ec0(param_1,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (2 < iVar4) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uVar9);
            uVar11 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (uVar11 == 0) goto LAB_7ffc3eb61180;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
            }
            if (2 < iVar4) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar7);
              lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
              if (lVar6 == 0) {
                return;
              }
              uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar3);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
              }
              if (1 < iVar4) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar9);
                lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                if (lVar6 == 0) {
                  return;
                }
                uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,uVar8 ^ 0x2c6aadc34ab3);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (0 < iVar4) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar9);
                  if (_DAT_7ffc3ebc32b0 == 0) {
                    uVar9 = FUN_7ffc3eb76c30(param_1,0);
                    lVar6 = FUN_7ffc3eb77170(param_1,uVar9,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                             0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                    if ((lVar6 != 0) &&
                       (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00), lVar6 != 0)) {
                      _DAT_7ffc3ebc32b0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                    }
                  }
                  lVar6 = _DAT_7ffc3ebc32b0;
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  uVar9 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar9,0,param_2);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar9,1,uVar11);
                  uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x9fe67f37099228e9);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar9,2,uVar10);
                  uVar10 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar8)
                  ;
                  (**(code **)(*param_1 + 0x570))(param_1,uVar9,3,uVar10);
                  FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar9);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb610b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (**(code **)(*param_1 + 0x720))(param_1);
                  return;
                }
              }
            }
          }
        }
      }
    }
LAB_7ffc3eb6115f:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar12 = (undefined *)0x7ffc3eba6019;
    uVar9 = uRam00007ffc3ebc0a98;
  }
LAB_7ffc3eb605dd:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb605f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar9,puVar12);
  return;
}

/* JNI_dev_krypton_6_0_20 | RVA 0x3911c0 | dev/krypton/6.0([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_0_20(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  undefined *puVar11;
  
  if (param_3 == 0) goto LAB_7ffc3eb61ada;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb61ab9;
  lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
  lVar5 = *param_1;
  if (lVar4 != 0) {
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') {
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar11 = (undefined *)0x7ffc3eba6033;
      uVar8 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb61250;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return;
    }
    uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar7 = FUN_7ffc3eb76c30(param_1,0);
    if (uVar7 == 0) {
      return;
    }
    lVar5 = FUN_7ffc3eb76ce0(param_1,uVar7,0);
    if (lVar5 == 0) {
      return;
    }
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar7 = *(ulonglong *)
               (*(longlong *)(uVar7 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar5 + 0x10));
    }
    else {
      uVar7 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar7,lVar5);
    }
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (_DAT_7ffc3ebc30e0 == 0) {
      uVar8 = FUN_7ffc3eb76c30(param_1,0);
      lVar5 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba6478,0x7ffc3eba606c,
                               0x7ffc3eba647a,0x7ffc3eba647c,0,0);
      if ((lVar5 != 0) && (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)
         ) {
        _DAT_7ffc3ebc30e0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
      }
    }
    lVar5 = _DAT_7ffc3ebc30e0;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar7 = uVar7 ^ uVar6;
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x6b06);
    (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                             uVar7 ^ 0x64880c298ce289c5);
    (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
    uVar8 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar8);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,uVar8,uRam00007ffc3ebc09d0);
    uVar8 = FUN_7ffc3eb76c30(param_1,10);
    uVar6 = (**(code **)(*param_1 + 0x560))(param_1,1,uVar8,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (_DAT_7ffc3ebc30e8 == 0) {
      uVar8 = FUN_7ffc3eb76c30(param_1,0);
      lVar5 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                               0x7ffc3eba6151,0x7ffc3eba6482,0,0);
      if ((lVar5 != 0) && (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)
         ) {
        _DAT_7ffc3ebc30e8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
      }
    }
    lVar5 = _DAT_7ffc3ebc30e8;
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,0x4098daf83b3c91e2);
    (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar7);
    (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
    uVar8 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar8);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    uVar8 = FUN_7ffc3eb59ec0(param_1,uVar8);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return;
    }
    if (uVar6 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
      }
      if (0 < iVar3) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar6,0,uVar8);
        uVar10 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (uVar10 == 0) goto LAB_7ffc3eb61ada;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
        }
        if (2 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar10,2,uVar6);
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
          if (lVar5 == 0) {
            return;
          }
          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar5,uVar2);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
          }
          if (1 < iVar3) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar8);
            lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
            if (lVar5 == 0) {
              return;
            }
            uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar5,uVar7 ^ 0x695aefa795d4);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
            }
            if (0 < iVar3) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar8);
              if (_DAT_7ffc3ebc30f0 == 0) {
                uVar8 = FUN_7ffc3eb76c30(param_1,0);
                lVar5 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                         0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,0);
                if ((lVar5 != 0) &&
                   (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
                  _DAT_7ffc3ebc30f0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
                }
              }
              lVar5 = _DAT_7ffc3ebc30f0;
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return;
              }
              uVar8 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,param_2);
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar10);
              uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                       0x40813a074bf6f78e);
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar9);
              uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar7);
              (**(code **)(*param_1 + 0x570))(param_1,uVar8,3,uVar9);
              FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar8);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb61a0e. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (**(code **)(*param_1 + 0x720))(param_1);
              return;
            }
          }
        }
      }
LAB_7ffc3eb61ab9:
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar11 = (undefined *)0x7ffc3eba6019;
      uVar8 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb61250;
    }
LAB_7ffc3eb61ada:
    lVar5 = *param_1;
  }
  UNRECOVERED_JUMPTABLE = *(code **)(lVar5 + 0x70);
  puVar11 = &DAT_7ffc3eba6000;
  uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb61250:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb61263. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar8,puVar11);
  return;
}

/* JNI_dev_krypton_6_14_21 | RVA 0x391b10 | dev/krypton/6.14([Ljava/lang/Object;)V | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void JNI_dev_krypton_6_14_21(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  code *UNRECOVERED_JUMPTABLE;
  ulonglong uVar9;
  longlong lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  undefined *puVar15;
  
  if (param_3 == 0) goto LAB_7ffc3eb62727;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (0 < iVar3) {
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    if ((lVar6 != 0) &&
       (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8), cVar1 == '\0'))
    {
LAB_7ffc3eb62706:
      UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
      puVar15 = (undefined *)0x7ffc3eba6033;
      uVar11 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb61d74;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (1 < iVar3) {
      lVar7 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar10 = *param_1;
      if (lVar7 != 0) {
        cVar1 = (**(code **)(lVar10 + 0x100))(param_1,lVar7,uRam00007ffc3ebc0a10);
        if (cVar1 == '\0') goto LAB_7ffc3eb62706;
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
        if (lVar8 == 0) {
          return;
        }
        uVar2 = FUN_7ffc3e7d8be0(param_1,lVar7,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
        }
        if (iVar3 < 3) goto LAB_7ffc3eb626e5;
        lVar7 = (**(code **)(*param_1 + 0x568))(param_1,param_3,2);
        lVar10 = *param_1;
        if (lVar7 != 0) {
          cVar1 = (**(code **)(lVar10 + 0x100))(param_1,lVar7,uRam00007ffc3ebc0a10);
          if (cVar1 == '\0') goto LAB_7ffc3eb62706;
          iVar3 = FUN_7ffc3e7d8be0(param_1,lVar7,lVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar4 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          if (iVar4 < 4) goto LAB_7ffc3eb626e5;
          lVar7 = (**(code **)(*param_1 + 0x568))(param_1,param_3,3);
          lVar10 = *param_1;
          if (lVar7 != 0) {
            cVar1 = (**(code **)(lVar10 + 0x100))(param_1,lVar7,uRam00007ffc3ebc0a10);
            if (cVar1 == '\0') goto LAB_7ffc3eb62706;
            uVar5 = FUN_7ffc3e7d8be0(param_1,lVar7,lVar8);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = FUN_7ffc3eb76c30(param_1,0);
            if (uVar9 == 0) {
              return;
            }
            lVar10 = FUN_7ffc3eb76ce0(param_1,uVar9,0);
            if (lVar10 == 0) {
              return;
            }
            if (cRam00007ffc3ebc08f4 == '\x01') {
              uVar9 = *(ulonglong *)
                       (*(longlong *)(uVar9 & 0xfffffffffffffffc) +
                       (longlong)*(int *)(lVar10 + 0x10));
            }
            else {
              uVar9 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar9,lVar10);
            }
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (_DAT_7ffc3ebc4668 == 0) {
              uVar11 = FUN_7ffc3eb76c30(param_1,0);
              lVar10 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba6478,
                                        0x7ffc3eba606c,0x7ffc3eba647a,0x7ffc3eba647c,0,0);
              if ((lVar10 != 0) &&
                 (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                _DAT_7ffc3ebc4668 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
              }
            }
            lVar10 = _DAT_7ffc3ebc4668;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar9 = uVar9 ^ CONCAT44(uVar2,uVar5 & 0xffff | iVar3 << 0x10);
            uVar11 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x323f);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar12);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      uVar9 ^ 0x2e0c86fc3c559dc0);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar12);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar11);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar2 = FUN_7ffc3e7d8be0(param_1,uVar11,uRam00007ffc3ebc09d0);
            uVar11 = FUN_7ffc3eb76c30(param_1,10);
            uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uVar11,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (_DAT_7ffc3ebc4670 == 0) {
              uVar11 = FUN_7ffc3eb76c30(param_1,0);
              lVar10 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                        0x7ffc3eba606c,0x7ffc3eba6151,0x7ffc3eba6482,0,0);
              if ((lVar10 != 0) &&
                 (lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a00), lVar10 != 0)) {
                _DAT_7ffc3ebc4670 = (**(code **)(*param_1 + 0xa8))(param_1,lVar10);
              }
            }
            lVar10 = _DAT_7ffc3ebc4670;
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar11 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                      0xdace4b36626dcd6);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,uVar12);
            uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar9);
            (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar12);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar10,uRam00007ffc3ebc0a40,uVar11);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            uVar11 = FUN_7ffc3eb59ec0(param_1,uVar11);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return;
            }
            if (uVar13 != 0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
              }
              if (0 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,uVar11);
                uVar11 = FUN_7ffc3eb59ec0(param_1,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (1 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,uVar11);
                  uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba64b2);
                  uVar11 = FUN_7ffc3eb59ec0(param_1,uVar11);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (2 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,uVar11);
                    uVar14 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return;
                    }
                    if (uVar14 == 0) goto LAB_7ffc3eb62727;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar14,2,uVar13);
                      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
                      if (lVar6 == 0) {
                        return;
                      }
                      uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar6,uVar2);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return;
                      }
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                      }
                      if (1 < iVar3) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar14,1,uVar11);
                        lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
                        if (lVar6 == 0) {
                          return;
                        }
                        uVar11 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar6,
                                                  uVar9 ^ 0x5711b2bdd8e0);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 != '\0') {
                          return;
                        }
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar3 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                        }
                        if (0 < iVar3) {
                          (**(code **)(*param_1 + 0x570))(param_1,uVar14,0,uVar11);
                          if (_DAT_7ffc3ebc4678 == 0) {
                            uVar11 = FUN_7ffc3eb76c30(param_1,0);
                            lVar6 = FUN_7ffc3eb77170(param_1,uVar11,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                     0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba626f,0,
                                                     0);
                            if ((lVar6 != 0) &&
                               (lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a00),
                               lVar6 != 0)) {
                              _DAT_7ffc3ebc4678 = (**(code **)(*param_1 + 0xa8))(param_1,lVar6);
                            }
                          }
                          lVar6 = _DAT_7ffc3ebc4678;
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return;
                          }
                          uVar11 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar11,0,param_2);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar11,1,uVar14);
                          uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0xdb5044c16ecbaba);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar11,2,uVar12);
                          uVar12 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar9);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar11,3,uVar12);
                          FUN_7ffc3e7d1a50(param_1,lVar6,uRam00007ffc3ebc0a40,uVar11);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb6263a. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                          (**(code **)(*param_1 + 0x720))(param_1);
                          return;
                        }
                      }
                    }
                  }
                }
              }
              goto LAB_7ffc3eb626e5;
            }
LAB_7ffc3eb62727:
            lVar10 = *param_1;
          }
        }
      }
      UNRECOVERED_JUMPTABLE = *(code **)(lVar10 + 0x70);
      puVar15 = &DAT_7ffc3eba6000;
      uVar11 = uRam00007ffc3ebc0a70;
      goto LAB_7ffc3eb61d74;
    }
  }
LAB_7ffc3eb626e5:
  UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
  puVar15 = (undefined *)0x7ffc3eba6019;
  uVar11 = uRam00007ffc3ebc0a98;
LAB_7ffc3eb61d74:
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb61d87. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar11,puVar15);
  return;
}

/* JNI_dev_krypton_6_9_22 | RVA 0x392740 | dev/krypton/6.9([Ljava/lang/Object;)I | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 JNI_dev_krypton_6_9_22(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_3 == 0) {
    lVar5 = *param_1;
LAB_7ffc3eb62835:
    puVar10 = &DAT_7ffc3eba6000;
    uVar8 = uRam00007ffc3ebc0a70;
    goto LAB_7ffc3eb6283c;
  }
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
  }
  if (iVar2 < 1) {
LAB_7ffc3eb62ad6:
    lVar5 = *param_1;
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar8 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar3 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    if ((lVar3 == 0) ||
       (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar3,uRam00007ffc3ebc09e8), cVar1 != '\0'))
    {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if (iVar2 < 2) goto LAB_7ffc3eb62ad6;
      lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
      lVar5 = *param_1;
      if (lVar4 == 0) goto LAB_7ffc3eb62835;
      cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
      if (cVar1 != '\0') {
        lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar5 == 0) {
          return 0;
        }
        uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar7 = FUN_7ffc3eb76c30(param_1,0);
        if (uVar7 == 0) {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76ce0(param_1,uVar7,0);
        if (lVar5 == 0) {
          return 0;
        }
        if (cRam00007ffc3ebc08f4 == '\x01') {
          uVar7 = *(ulonglong *)
                   (*(longlong *)(uVar7 & 0xfffffffffffffffc) + (longlong)*(int *)(lVar5 + 0x10));
        }
        else {
          uVar7 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar7,lVar5);
        }
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (_DAT_7ffc3ebc3320 == 0) {
          uVar8 = FUN_7ffc3eb76c30(param_1,0);
          lVar5 = FUN_7ffc3eb77170(param_1,uVar8,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                   0x7ffc3eba62b4,0x7ffc3eba64b4,0,0);
          if ((lVar5 != 0) &&
             (lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a00), lVar5 != 0)) {
            _DAT_7ffc3ebc3320 = (**(code **)(*param_1 + 0xa8))(param_1,lVar5);
          }
        }
        lVar5 = _DAT_7ffc3ebc3320;
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,lVar3);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                   0x28e8d2d60fc03c86);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
          uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar7 ^ uVar6);
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,uVar9);
          uVar8 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            uVar8 = FUN_7ffc3e7d8be0(param_1,uVar8,uRam00007ffc3ebc09d0);
            return uVar8;
          }
        }
        uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
        uVar9 = FUN_7ffc3eb76c30(param_1,0xc);
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar9);
        if (cVar1 == '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x88))(param_1);
        return 3;
      }
    }
    lVar5 = *param_1;
    puVar10 = (undefined *)0x7ffc3eba6033;
    uVar8 = uRam00007ffc3ebc0a58;
  }
LAB_7ffc3eb6283c:
  (**(code **)(lVar5 + 0x70))(param_1,uVar8,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_3_23 | RVA 0x392b70 | dev/krypton/6.3([Ljava/lang/Object;)Ljava/util/List; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_6_3_23(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  char cVar10;
  int iVar11;
  undefined4 uVar12;
  longlong lVar13;
  longlong lVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  longlong lVar17;
  longlong lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  ulonglong uVar24;
  undefined *puVar25;
  undefined8 in_stack_ffffffffffffff18;
  undefined4 uVar26;
  undefined8 uStack_a0;
  
  if (param_3 == 0) {
LAB_7ffc3eb64fc9:
    lVar14 = *param_1;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar11 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar11 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if (iVar11 < 1) {
LAB_7ffc3eb64fac:
      lVar14 = *param_1;
      puVar25 = (undefined *)0x7ffc3eba6019;
      uVar19 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb62bfc;
    }
    lVar13 = (**(code **)(*param_1 + 0x568))(param_1,param_3,0);
    lVar14 = *param_1;
    if (lVar13 != 0) {
      cVar10 = (**(code **)(lVar14 + 0x100))(param_1,lVar13,uRam00007ffc3ebc0958);
      if (cVar10 != '\0') {
        lVar14 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
        if (lVar14 == 0) {
          return 0;
        }
        uVar15 = FUN_7ffc3e7d1a20(param_1,lVar13,lVar14);
        cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar10 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar11 = *(int *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar11 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
        }
        if (iVar11 < 2) goto LAB_7ffc3eb64fac;
        lVar14 = (**(code **)(*param_1 + 0x568))(param_1,param_3,1);
        if ((lVar14 == 0) ||
           (cVar10 = (**(code **)(*param_1 + 0x100))(param_1,lVar14,uRam00007ffc3ebc09e8),
           cVar10 != '\0')) {
          uVar16 = FUN_7ffc3eb76c30(param_1,0);
          if (uVar16 == 0) {
            return 0;
          }
          lVar13 = FUN_7ffc3eb76ce0(param_1,uVar16,0);
          if (lVar13 == 0) {
            return 0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar24 = *(ulonglong *)
                      (*(longlong *)(uVar16 & 0xfffffffffffffffc) +
                      (longlong)*(int *)(lVar13 + 0x10));
          }
          else {
            uVar24 = (**(code **)(*param_1 + 0x4b8))(param_1,uVar16,lVar13);
          }
          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
          if ((cVar10 != '\0') || (lVar13 = FUN_7ffc3eb76c90(param_1,uVar16,9), lVar13 == 0)) {
            return 0;
          }
          iVar11 = FUN_7ffc3e7db1e0(param_1,uVar16,lVar13);
          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar10 != '\0') {
            return 0;
          }
          lVar13 = FUN_7ffc3eb76c30(param_1,0xd);
          if (lVar13 == 0) {
            return 0;
          }
          lVar17 = (**(code **)(*param_1 + 0xd8))(param_1,lVar13);
          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar10 != '\0') {
            return 0;
          }
          if (lVar17 != 0) {
            lVar18 = FUN_7ffc3eb76c90(param_1,lVar13,0xd);
            if (lVar18 == 0) {
              return 0;
            }
            FUN_7ffc3e7dbbc0(param_1,lVar17,lVar13,lVar18);
            cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar10 != '\0') {
              return 0;
            }
            if (_DAT_7ffc3ebc7958 == 0) {
              uVar19 = FUN_7ffc3eb76c30(param_1,0);
              in_stack_ffffffffffffff18 = 0x7ffc3eba606a;
              lVar13 = FUN_7ffc3eb77170(param_1,uVar19,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                        0x7ffc3eba606c,0x7ffc3eba62b4,0x7ffc3eba63a7,0,0);
              if ((lVar13 != 0) &&
                 (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00), lVar13 != 0)) {
                _DAT_7ffc3ebc7958 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
              }
            }
            lVar13 = _DAT_7ffc3ebc7958;
            cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar10 == '\0') {
              uVar24 = uVar24 ^ uVar15;
              uVar19 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar19,0,lVar14);
              uVar20 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                        0x18a9a3348d2b278c);
              (**(code **)(*param_1 + 0x570))(param_1,uVar19,1,uVar20);
              uVar20 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24);
              (**(code **)(*param_1 + 0x570))(param_1,uVar19,2,uVar20);
              uVar19 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar19);
              cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar10 == '\0') {
                if (_DAT_7ffc3ebc7960 == 0) {
                  uVar20 = FUN_7ffc3eb76c30(param_1,0);
                  in_stack_ffffffffffffff18 = 0x7ffc3eba606a;
                  lVar14 = FUN_7ffc3eb77170(param_1,uVar20,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba64cc,0,0);
                  if ((lVar14 != 0) &&
                     (lVar14 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a00), lVar14 != 0))
                  {
                    _DAT_7ffc3ebc7960 = (**(code **)(*param_1 + 0xa8))(param_1,lVar14);
                  }
                }
                lVar14 = _DAT_7ffc3ebc7960;
                cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar10 == '\0') {
                  uVar20 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar20,0,uVar19);
                  uVar19 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                            0x18bf02168ea1c5e7);
                  (**(code **)(*param_1 + 0x570))(param_1,uVar20,1,uVar19);
                  uVar19 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar24
                                           );
                  (**(code **)(*param_1 + 0x570))(param_1,uVar20,2,uVar19);
                  uVar19 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a40,uVar20);
                  cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar10 == '\0') {
                    if (_DAT_7ffc3ebc7968 == 0) {
                      uVar20 = FUN_7ffc3eb76c30(param_1,0);
                      in_stack_ffffffffffffff18 = 0x7ffc3eba606a;
                      lVar14 = FUN_7ffc3eb77170(param_1,uVar20,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61d9,0,0);
                      if ((lVar14 != 0) &&
                         (lVar14 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a00),
                         lVar14 != 0)) {
                        _DAT_7ffc3ebc7968 = (**(code **)(*param_1 + 0xa8))(param_1,lVar14);
                      }
                    }
                    lVar14 = _DAT_7ffc3ebc7968;
                    cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar10 == '\0') {
                      uVar20 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar20,0,uVar19);
                      uVar19 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                0x18b0e576bc8f103e);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar20,1,uVar19);
                      uVar19 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                uVar24);
                      (**(code **)(*param_1 + 0x570))(param_1,uVar20,2,uVar19);
                      uVar19 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a40,uVar20);
                      cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar10 == '\0') {
                        uStack_a0 = 0x7ffc3eba606a;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar9 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar8 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar7 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar6 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar5 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar4 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar3 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar2 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        uVar1 = uStack_a0._4_4_;
                        uStack_a0._4_4_ = 0x7ffc;
                        do {
                          uVar26 = (undefined4)((ulonglong)in_stack_ffffffffffffff18 >> 0x20);
                          if (_DAT_7ffc3ebc7970 == 0) {
                            uVar20 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar9;
                            lVar14 = FUN_7ffc3eb77170(param_1,uVar20,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6204,
                                                      0,0);
                            if ((lVar14 != 0) &&
                               (lVar14 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a00),
                               lVar14 != 0)) {
                              _DAT_7ffc3ebc7970 = (**(code **)(*param_1 + 0xa8))(param_1,lVar14);
                            }
                          }
                          lVar14 = _DAT_7ffc3ebc7970;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          uVar20 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,0,uVar19);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18be4d70aafb7a28);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,2,uVar21);
                          uVar20 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a40,uVar20);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          cVar10 = FUN_7ffc3e7d53d0(param_1,uVar20,uRam00007ffc3ebc0a38);
                          if (cVar10 == '\0') {
                            return lVar17;
                          }
                          if (_DAT_7ffc3ebc7978 == 0) {
                            uVar20 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar8;
                            lVar14 = FUN_7ffc3eb77170(param_1,uVar20,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba621c,
                                                      0,0);
                            if ((lVar14 != 0) &&
                               (lVar14 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a00),
                               lVar14 != 0)) {
                              _DAT_7ffc3ebc7978 = (**(code **)(*param_1 + 0xa8))(param_1,lVar14);
                            }
                          }
                          lVar14 = _DAT_7ffc3ebc7978;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          uVar20 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,0,uVar19);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18ab8927f77b01bd);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,2,uVar21);
                          lVar14 = FUN_7ffc3e7d1a50(param_1,lVar14,uRam00007ffc3ebc0a40,uVar20);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar10 != '\0') ||
                             (lVar13 = FUN_7ffc3eb76c30(param_1,7), lVar13 == 0)) break;
                          if ((lVar14 != 0) &&
                             (cVar10 = (**(code **)(*param_1 + 0x100))(param_1,lVar14,lVar13),
                             cVar10 == '\0')) {
                            lVar14 = *param_1;
                            puVar25 = (undefined *)0x7ffc3eba6033;
                            uVar19 = uRam00007ffc3ebc0a58;
LAB_7ffc3eb64fa1:
                            (**(code **)(lVar14 + 0x70))(param_1,uVar19,puVar25);
                            break;
                          }
                          if (_DAT_7ffc3ebc7980 == 0) {
                            uVar20 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar7;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar20,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba63db,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc7980 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc7980;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          uVar20 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,0,lVar14);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18a8d7fc05ed3946);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,2,uVar21);
                          uVar20 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar20);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64f1b;
                          if (iVar11 != 0) {
                            return lVar17;
                          }
                          lVar14 = FUN_7ffc3eb76c30(param_1,0xe);
                          if (lVar14 == 0) {
                            uVar19 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb64e44:
                            uVar20 = FUN_7ffc3eb76c30(param_1,8);
                            cVar10 = (**(code **)(*param_1 + 0x100))(param_1,uVar19,uVar20);
                            if (cVar10 == '\0') {
LAB_7ffc3eb64f27:
                              uVar20 = FUN_7ffc3eb76c30(param_1,8);
                              cVar10 = (**(code **)(*param_1 + 0x100))(param_1,uVar19,uVar20);
                              goto joined_r0x7ffc3eb64f4e;
                            }
                            (**(code **)(*param_1 + 0x88))(param_1);
                            lVar14 = FUN_7ffc3eb76c30(param_1,0);
                            if ((lVar14 != 0) &&
                               (lVar13 = FUN_7ffc3eb76c90(param_1,lVar14,6), lVar13 != 0)) {
                              uVar19 = FUN_7ffc3e7d1a80(param_1,lVar14,lVar13,uVar19);
                              cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar10 != '\0') {
                                uVar19 = (**(code **)(*param_1 + 0x78))(param_1);
                                goto LAB_7ffc3eb64ee6;
                              }
                              (**(code **)(*param_1 + 0x68))(param_1,uVar19);
                            }
                            break;
                          }
                          lVar14 = (**(code **)(*param_1 + 0xd8))(param_1,lVar14);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') {
LAB_7ffc3eb64e3b:
                            uVar19 = (**(code **)(*param_1 + 0x78))(param_1);
                            goto LAB_7ffc3eb64e44;
                          }
                          if (_DAT_7ffc3ebc7988 == 0) {
                            uVar21 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = 0x7ffc;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar21,6,0x7ffc3eba605c,0x7ffc3eba6299
                                                      ,0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc7988 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc7988;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar21 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0)
                          ;
                          uVar22 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,
                                                    uRam00007ffc3ebc0998,0xdaf);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar21,0,uVar22);
                          uVar22 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24 ^ 0x4cff399c0573de40
                                                   );
                          (**(code **)(*param_1 + 0x570))(param_1,uVar21,1,uVar22);
                          uVar21 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar21);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          if (_DAT_7ffc3ebc7990 == 0) {
                            uVar22 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar6;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6410,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc7990 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc7990;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar22 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar20);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18b4059330df4475);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,2,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,3,uVar21);
                          uVar21 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar22);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          if (_DAT_7ffc3ebc7998 == 0) {
                            uVar22 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar5;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba64b4,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc7998 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc7998;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar22 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18b3b4de1fd6f881);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,2,uVar21);
                          uVar21 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar22);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar12 = FUN_7ffc3e7d8be0(param_1,uVar21,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc79a0 == 0) {
                            uVar21 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = 0x7ffc;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar21,6,0x7ffc3eba605c,0x7ffc3eba6299
                                                      ,0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc79a0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc79a0;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar21 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0)
                          ;
                          uVar22 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,
                                                    uRam00007ffc3ebc0998,0x77be);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar21,0,uVar22);
                          uVar22 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24 ^ 0x4761d41af2fa455)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar21,1,uVar22);
                          uVar21 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar21);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          if (_DAT_7ffc3ebc79a8 == 0) {
                            uVar22 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar4;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6410,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc79a8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc79a8;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar22 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar20);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18b4059330df4475);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,2,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,3,uVar21);
                          uVar21 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar22);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          if (_DAT_7ffc3ebc79b0 == 0) {
                            uVar22 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar3;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6128,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc79b0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc79b0;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar22 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18be8d5be72ba15c);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,2,uVar21);
                          uVar21 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar22);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          if (_DAT_7ffc3ebc79b8 == 0) {
                            uVar22 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = 0x7ffc;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,0x7ffc3eba6299
                                                      ,0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc79b8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc79b8;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar22 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09e0,0)
                          ;
                          uVar23 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,
                                                    uRam00007ffc3ebc0998,0x70dc);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar23);
                          uVar23 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24 ^ 0x29577cc67673a330
                                                   );
                          (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar23);
                          uVar22 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar22);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          if (_DAT_7ffc3ebc79c0 == 0) {
                            uVar23 = FUN_7ffc3eb76c30(param_1,0);
                            uVar26 = uVar2;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar23,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc79c0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc79c0;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          uVar23 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar23,0,uVar20);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar23,1,uVar22);
                          uVar22 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18b674859b6a10ae);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar23,2,uVar22);
                          uVar22 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar23,3,uVar22);
                          uVar22 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar23);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') goto LAB_7ffc3eb64e3b;
                          cVar10 = FUN_7ffc3e7d53d0(param_1,uVar22,uRam00007ffc3ebc0a38);
                          if (cVar10 != '\0') {
                            if (_DAT_7ffc3ebc79c8 == 0) {
                              uVar22 = FUN_7ffc3eb76c30(param_1,0);
                              uVar26 = 0x7ffc;
                              lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,
                                                        0x7ffc3eba6299,0x7ffc3eba606c,0x7ffc3eba629b
                                                        ,0x7ffc3eba629d,0,0);
                              if ((lVar13 != 0) &&
                                 (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                                 lVar13 != 0)) {
                                _DAT_7ffc3ebc79c8 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                              }
                            }
                            lVar13 = _DAT_7ffc3ebc79c8;
                            cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar10 == '\0') {
                              uVar22 = (**(code **)(*param_1 + 0x560))
                                                 (param_1,2,uRam00007ffc3ebc09e0,0);
                              uVar23 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,
                                                        uRam00007ffc3ebc0998,0x5d6b);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar23);
                              uVar23 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                        uRam00007ffc3ebc0918,
                                                        uVar24 ^ 0x2a16b5ff76648e8f);
                              (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar23);
                              uVar22 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,uVar22);
                              cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar10 == '\0') {
                                if (_DAT_7ffc3ebc79d0 == 0) {
                                  uVar23 = FUN_7ffc3eb76c30(param_1,0);
                                  uVar26 = uVar1;
                                  lVar13 = FUN_7ffc3eb77170(param_1,uVar23,6,0x7ffc3eba605c,
                                                            0x7ffc3eba606a,0x7ffc3eba606c,
                                                            0x7ffc3eba60e0,0x7ffc3eba6410,0,0);
                                  if ((lVar13 != 0) &&
                                     (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00)
                                     , lVar13 != 0)) {
                                    _DAT_7ffc3ebc79d0 =
                                         (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                                  }
                                }
                                lVar13 = _DAT_7ffc3ebc79d0;
                                cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                                if (cVar10 == '\0') {
                                  uVar23 = (**(code **)(*param_1 + 0x560))
                                                     (param_1,4,uRam00007ffc3ebc09e0,0);
                                  (**(code **)(*param_1 + 0x570))(param_1,uVar23,0,uVar20);
                                  (**(code **)(*param_1 + 0x570))(param_1,uVar23,1,uVar22);
                                  uVar20 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,0x18b4059330df4475)
                                  ;
                                  (**(code **)(*param_1 + 0x570))(param_1,uVar23,2,uVar20);
                                  uVar20 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                            uRam00007ffc3ebc0918,uVar24);
                                  (**(code **)(*param_1 + 0x570))(param_1,uVar23,3,uVar20);
                                  uVar20 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,
                                                            uVar23);
                                  cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                                  if (cVar10 == '\0') {
                                    if (_DAT_7ffc3ebc79d8 == 0) {
                                      uVar22 = FUN_7ffc3eb76c30(param_1,0);
                                      uVar26 = uStack_a0._4_4_;
                                      lVar13 = FUN_7ffc3eb77170(param_1,uVar22,6,0x7ffc3eba605c,
                                                                0x7ffc3eba606a,0x7ffc3eba606c,
                                                                0x7ffc3eba60e0,0x7ffc3eba64fe,0,0);
                                      if ((lVar13 != 0) &&
                                         (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,
                                                                    uRam00007ffc3ebc0a00),
                                         lVar13 != 0)) {
                                        _DAT_7ffc3ebc79d8 =
                                             (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                                      }
                                    }
                                    lVar13 = _DAT_7ffc3ebc79d8;
                                    cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                                    if (cVar10 == '\0') {
                                      uVar22 = (**(code **)(*param_1 + 0x560))
                                                         (param_1,3,uRam00007ffc3ebc09e0,0);
                                      (**(code **)(*param_1 + 0x570))(param_1,uVar22,0,uVar20);
                                      uVar20 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,
                                                                0x18b2fb9fd5c4b4ed);
                                      (**(code **)(*param_1 + 0x570))(param_1,uVar22,1,uVar20);
                                      uVar20 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                                uRam00007ffc3ebc0918,uVar24);
                                      (**(code **)(*param_1 + 0x570))(param_1,uVar22,2,uVar20);
                                      uVar20 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40,
                                                                uVar22);
                                      cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                                      if (cVar10 == '\0') {
                                        uVar20 = FUN_7ffc3e7d1a20(param_1,uVar20,
                                                                  uRam00007ffc3ebc0968);
                                        goto LAB_7ffc3eb647cd;
                                      }
                                    }
                                  }
                                }
                              }
                            }
LAB_7ffc3eb64f1b:
                            uVar19 = (**(code **)(*param_1 + 0x78))(param_1);
                            goto LAB_7ffc3eb64f27;
                          }
                          uVar20 = 0;
LAB_7ffc3eb647cd:
                          if (lVar14 == 0) {
                            lVar14 = *param_1;
                            puVar25 = &DAT_7ffc3eba6000;
                            uVar19 = uRam00007ffc3ebc0a70;
                            goto LAB_7ffc3eb64fa1;
                          }
                          lVar13 = FUN_7ffc3eb76c30(param_1,0xe);
                          if ((lVar13 == 0) ||
                             (lVar18 = FUN_7ffc3eb76c90(param_1,lVar13,0xe), lVar18 == 0)) break;
                          in_stack_ffffffffffffff18 = CONCAT44(uVar26,uVar12);
                          FUN_7ffc3e7dbbc0(param_1,lVar14,lVar13,lVar18,in_stack_ffffffffffffff18,
                                           uVar21,uVar20);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          if (_DAT_7ffc3ebc79e0 == 0) {
                            uVar20 = FUN_7ffc3eb76c30(param_1,0);
                            in_stack_ffffffffffffff18 = uStack_a0;
                            lVar13 = FUN_7ffc3eb77170(param_1,uVar20,6,0x7ffc3eba605c,0x7ffc3eba606a
                                                      ,0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,
                                                      0,0);
                            if ((lVar13 != 0) &&
                               (lVar13 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a00),
                               lVar13 != 0)) {
                              _DAT_7ffc3ebc79e0 = (**(code **)(*param_1 + 0xa8))(param_1,lVar13);
                            }
                          }
                          lVar13 = _DAT_7ffc3ebc79e0;
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          uVar20 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0)
                          ;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,0,lVar17);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,1,lVar14);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,0x18b21007502fc3c9);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,2,uVar21);
                          uVar21 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,
                                                    uRam00007ffc3ebc0918,uVar24);
                          (**(code **)(*param_1 + 0x570))(param_1,uVar20,3,uVar21);
                          uVar20 = FUN_7ffc3e7d1a50(param_1,lVar13,uRam00007ffc3ebc0a40);
                          cVar10 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar10 != '\0') break;
                          FUN_7ffc3e7d53d0(param_1,uVar20,uRam00007ffc3ebc0a38);
                        } while( true );
                      }
                    }
                  }
                }
              }
            }
            uVar19 = (**(code **)(*param_1 + 0x78))(param_1);
LAB_7ffc3eb64ee6:
            uVar20 = FUN_7ffc3eb76c30(param_1,8);
            cVar10 = (**(code **)(*param_1 + 0x100))(param_1,uVar19,uVar20);
joined_r0x7ffc3eb64f4e:
            if (cVar10 == '\0') {
              return 0;
            }
            (**(code **)(*param_1 + 0x88))(param_1);
            return lVar17;
          }
          goto LAB_7ffc3eb64fc9;
        }
      }
      lVar14 = *param_1;
      puVar25 = (undefined *)0x7ffc3eba6033;
      uVar19 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb62bfc;
    }
  }
  puVar25 = &DAT_7ffc3eba6000;
  uVar19 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb62bfc:
  (**(code **)(lVar14 + 0x70))(param_1,uVar19,puVar25);
  return 0;
}

/* JNI_dev_krypton_6_1_24 | RVA 0x395010 | dev/krypton/6.1([Ljava/lang/Object;)Ljava/util/List; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void * JNI_dev_krypton_6_1_24(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  byte bVar20;
  char cVar21;
  int iVar22;
  undefined4 uVar23;
  undefined4 uVar24;
  void *pvVar25;
  longlong lVar26;
  ulonglong uVar27;
  void *pvVar28;
  void *pvVar29;
  void *pvVar30;
  undefined8 uVar31;
  void *pvVar32;
  void *pvVar33;
  void *pvVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  longlong lVar37;
  JNINativeInterface_ *pJVar38;
  ulonglong uVar39;
  undefined4 uVar40;
  char *pcVar41;
  undefined8 in_stack_fffffffffffffee8;
  undefined4 uVar42;
  undefined8 in_stack_ffffffffffffff00;
  undefined4 uVar43;
  undefined8 in_stack_ffffffffffffff08;
  undefined4 uVar44;
  undefined8 uStack_c8;
  undefined4 uStack_ac;
  
  if (arg0 == (void *)0x0) {
LAB_7ffc3eb68a2e:
    pJVar38 = *env;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                       (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar22 = (*(*env)->GetArrayLength)(env,arg0);
    }
    if (iVar22 < 1) {
LAB_7ffc3eb68a11:
      pJVar38 = *env;
      pcVar41 = (char *)0x7ffc3eba6019;
      pvVar25 = pvRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb6509c;
    }
    pvVar25 = (*(*env)->GetObjectArrayElement)(env,arg0,0);
    pJVar38 = *env;
    if (pvVar25 != (void *)0x0) {
      bVar20 = (*pJVar38->IsInstanceOf)(env,pvVar25,pvRam00007ffc3ebc0958);
      if (bVar20 != 0) {
        lVar26 = FUN_7ffc3eb76c90(env,pvRam00007ffc3ebc0958,0);
        if (lVar26 == 0) {
          return (void *)0x0;
        }
        uVar27 = FUN_7ffc3e7d1a20(env,pvVar25,lVar26);
        bVar20 = (*(*env)->ExceptionCheck)(env);
        if (bVar20 != 0) {
          return (void *)0x0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar22 = *(int *)(*(longlong *)((ulonglong)arg0 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar22 = (*(*env)->GetArrayLength)(env,arg0);
        }
        if (iVar22 < 2) goto LAB_7ffc3eb68a11;
        pvVar25 = (*(*env)->GetObjectArrayElement)(env,arg0,1);
        if ((pvVar25 == (void *)0x0) ||
           (bVar20 = (*(*env)->IsInstanceOf)(env,pvVar25,pvRam00007ffc3ebc09e8), bVar20 != 0)) {
          pvVar28 = (void *)FUN_7ffc3eb76c30(env,0);
          if (pvVar28 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar29 = (void *)FUN_7ffc3eb76ce0(env,pvVar28,0);
          if (pvVar29 == (void *)0x0) {
            return (void *)0x0;
          }
          if (cRam00007ffc3ebc08f4 == '\x01') {
            uVar39 = *(ulonglong *)
                      (*(longlong *)((ulonglong)pvVar28 & 0xfffffffffffffffc) +
                      (longlong)*(int *)((longlong)pvVar29 + 0x10));
          }
          else {
            uVar39 = (*(*env)->GetStaticLongField)(env,pvVar28,pvVar29);
          }
          bVar20 = (*(*env)->ExceptionCheck)(env);
          if ((bVar20 != 0) || (lVar26 = FUN_7ffc3eb76c90(env,pvVar28,5), lVar26 == 0)) {
            return (void *)0x0;
          }
          iVar22 = FUN_7ffc3e7db1e0(env,pvVar28,lVar26);
          bVar20 = (*(*env)->ExceptionCheck)(env);
          if (bVar20 != 0) {
            return (void *)0x0;
          }
          pvVar28 = (void *)FUN_7ffc3eb76c30(env,0xd);
          if (pvVar28 == (void *)0x0) {
            return (void *)0x0;
          }
          pvVar29 = (*(*env)->AllocObject)(env,pvVar28);
          bVar20 = (*(*env)->ExceptionCheck)(env);
          if (bVar20 != 0) {
            return (void *)0x0;
          }
          if (pvVar29 != (void *)0x0) {
            lVar26 = FUN_7ffc3eb76c90(env,pvVar28,0xd);
            if (lVar26 == 0) {
              return (void *)0x0;
            }
            FUN_7ffc3e7dbbc0(env,pvVar29,pvVar28,lVar26);
            bVar20 = (*(*env)->ExceptionCheck)(env);
            if (bVar20 != 0) {
              return (void *)0x0;
            }
            if (_DAT_7ffc3ebc7860 == (void *)0x0) {
              uVar31 = FUN_7ffc3eb76c30(env,0);
              in_stack_ffffffffffffff00 = 0x7ffc3eba63a7;
              in_stack_fffffffffffffee8 = 0x7ffc3eba606a;
              in_stack_ffffffffffffff08 = 0;
              lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,0x7ffc3eba606c,
                                        0x7ffc3eba62b4,0x7ffc3eba63a7,0,0);
              if ((lVar26 != 0) &&
                 (pvVar28 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                 pvVar28 != (void *)0x0)) {
                _DAT_7ffc3ebc7860 = (*(*env)->NewGlobalRef)(env,pvVar28);
              }
            }
            pvVar28 = _DAT_7ffc3ebc7860;
            bVar20 = (*(*env)->ExceptionCheck)(env);
            if (bVar20 == 0) {
              uVar39 = uVar39 ^ uVar27;
              pvVar30 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
              (*(*env)->SetObjectArrayElement)(env,pvVar30,0,pvVar25);
              pvVar25 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 0x8b12cf8604edb437);
              (*(*env)->SetObjectArrayElement)(env,pvVar30,1,pvVar25);
              pvVar25 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                 uVar39);
              (*(*env)->SetObjectArrayElement)(env,pvVar30,2,pvVar25);
              pvVar25 = (void *)FUN_7ffc3e7d1a50(env,pvVar28,uRam00007ffc3ebc0a40,pvVar30);
              bVar20 = (*(*env)->ExceptionCheck)(env);
              if (bVar20 == 0) {
                if (_DAT_7ffc3ebc7868 == (void *)0x0) {
                  uVar31 = FUN_7ffc3eb76c30(env,0);
                  in_stack_ffffffffffffff00 = 0x7ffc3eba64cc;
                  in_stack_fffffffffffffee8 = 0x7ffc3eba606a;
                  in_stack_ffffffffffffff08 = 0;
                  lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                            0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba64cc,0,0);
                  if ((lVar26 != 0) &&
                     (pvVar28 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                     pvVar28 != (void *)0x0)) {
                    _DAT_7ffc3ebc7868 = (*(*env)->NewGlobalRef)(env,pvVar28);
                  }
                }
                pvVar28 = _DAT_7ffc3ebc7868;
                bVar20 = (*(*env)->ExceptionCheck)(env);
                if (bVar20 == 0) {
                  pvVar30 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                  (*(*env)->SetObjectArrayElement)(env,pvVar30,0,pvVar25);
                  pvVar25 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     0x8b046ea40767565c);
                  (*(*env)->SetObjectArrayElement)(env,pvVar30,1,pvVar25);
                  pvVar25 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                     uVar39);
                  (*(*env)->SetObjectArrayElement)(env,pvVar30,2,pvVar25);
                  pvVar25 = (void *)FUN_7ffc3e7d1a50(env,pvVar28,uRam00007ffc3ebc0a40,pvVar30);
                  bVar20 = (*(*env)->ExceptionCheck)(env);
                  if (bVar20 == 0) {
                    if (_DAT_7ffc3ebc7870 == (void *)0x0) {
                      uVar31 = FUN_7ffc3eb76c30(env,0);
                      in_stack_ffffffffffffff00 = 0x7ffc3eba61d9;
                      in_stack_fffffffffffffee8 = 0x7ffc3eba606a;
                      in_stack_ffffffffffffff08 = 0;
                      lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba61d9,0,0);
                      if ((lVar26 != 0) &&
                         (pvVar28 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                         pvVar28 != (void *)0x0)) {
                        _DAT_7ffc3ebc7870 = (*(*env)->NewGlobalRef)(env,pvVar28);
                      }
                    }
                    pvVar28 = _DAT_7ffc3ebc7870;
                    bVar20 = (*(*env)->ExceptionCheck)(env);
                    if (bVar20 == 0) {
                      pvVar30 = (*(*env)->NewObjectArray)(env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                      (*(*env)->SetObjectArrayElement)(env,pvVar30,0,pvVar25);
                      pvVar25 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,0x8b0b89c435498385);
                      (*(*env)->SetObjectArrayElement)(env,pvVar30,1,pvVar25);
                      pvVar25 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                         uRam00007ffc3ebc0918,uVar39);
                      (*(*env)->SetObjectArrayElement)(env,pvVar30,2,pvVar25);
                      pvVar25 = (void *)FUN_7ffc3e7d1a50(env,pvVar28,uRam00007ffc3ebc0a40,pvVar30);
                      bVar20 = (*(*env)->ExceptionCheck)(env);
                      if (bVar20 == 0) {
                        uStack_ac = 0x7ffc;
                        uVar19 = uStack_ac;
                        uStack_ac = 0x7ffc;
                        uVar18 = uStack_ac;
                        uStack_ac = 0x7ffc;
                        uStack_c8 = 0x7ffc3eba606a;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar17 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar16 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar15 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar14 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar13 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar12 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar11 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar10 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar9 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar8 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar7 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar6 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar5 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar4 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar3 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar2 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        uVar1 = uStack_c8._4_4_;
                        uStack_c8._4_4_ = 0x7ffc;
                        do {
                          uVar42 = (undefined4)((ulonglong)in_stack_fffffffffffffee8 >> 0x20);
                          uVar43 = (undefined4)((ulonglong)in_stack_ffffffffffffff00 >> 0x20);
                          uVar44 = (undefined4)((ulonglong)in_stack_ffffffffffffff08 >> 0x20);
                          if (_DAT_7ffc3ebc7878 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar44 = 0;
                            uVar43 = uVar19;
                            uVar42 = uVar17;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6204,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar28 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar28 != (void *)0x0)) {
                              _DAT_7ffc3ebc7878 = (*(*env)->NewGlobalRef)(env,pvVar28);
                            }
                          }
                          pvVar28 = _DAT_7ffc3ebc7878;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) break;
                          pvVar30 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar30,0,pvVar25);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b0521c2233de993
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar30,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar30,2,pvVar32);
                          uVar31 = FUN_7ffc3e7d1a50(env,pvVar28,uRam00007ffc3ebc0a40,pvVar30);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) break;
                          cVar21 = FUN_7ffc3e7d53d0(env,uVar31,uRam00007ffc3ebc0a38);
                          if (cVar21 == '\0') {
                            return pvVar29;
                          }
                          if (_DAT_7ffc3ebc7880 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar16;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba621c,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar28 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar28 != (void *)0x0)) {
                              _DAT_7ffc3ebc7880 = (*(*env)->NewGlobalRef)(env,pvVar28);
                            }
                          }
                          pvVar28 = _DAT_7ffc3ebc7880;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) break;
                          pvVar30 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar30,0,pvVar25);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b10e5957ebd9206
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar30,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar30,2,pvVar32);
                          pvVar28 = (void *)FUN_7ffc3e7d1a50(env,pvVar28,uRam00007ffc3ebc0a40,
                                                             pvVar30);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if ((bVar20 != 0) ||
                             (pvVar30 = (void *)FUN_7ffc3eb76c30(env,7), pvVar30 == (void *)0x0))
                          break;
                          if ((pvVar28 != (void *)0x0) &&
                             (bVar20 = (*(*env)->IsInstanceOf)(env,pvVar28,pvVar30), bVar20 == 0)) {
                            pJVar38 = *env;
                            pcVar41 = (char *)0x7ffc3eba6033;
                            pvVar25 = pvRam00007ffc3ebc0a58;
LAB_7ffc3eb68a06:
                            (*pJVar38->ThrowNew)(env,pvVar25,pcVar41);
                            break;
                          }
                          if (_DAT_7ffc3ebc7888 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar15;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba63db,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar30 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar30 != (void *)0x0)) {
                              _DAT_7ffc3ebc7888 = (*(*env)->NewGlobalRef)(env,pvVar30);
                            }
                          }
                          pvVar30 = _DAT_7ffc3ebc7888;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) {
LAB_7ffc3eb6889b:
                            pvVar25 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb68983:
                            pvVar28 = (void *)FUN_7ffc3eb76c30(env,8);
                            bVar20 = (*(*env)->IsInstanceOf)(env,pvVar25,pvVar28);
                            goto joined_r0x7ffc3eb689aa;
                          }
                          pvVar32 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,0,pvVar28);
                          pvVar28 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b13bb4e8c2baafd
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,1,pvVar28);
                          pvVar28 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,2,pvVar28);
                          pvVar28 = (void *)FUN_7ffc3e7d1a50(env,pvVar30,uRam00007ffc3ebc0a40,
                                                             pvVar32);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          if (iVar22 == 0) {
                            return pvVar29;
                          }
                          pvVar30 = (void *)FUN_7ffc3eb76c30(env,0xf);
                          if (pvVar30 == (void *)0x0) {
                            pvVar25 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb688b5:
                            pvVar28 = (void *)FUN_7ffc3eb76c30(env,8);
                            bVar20 = (*(*env)->IsInstanceOf)(env,pvVar25,pvVar28);
                            if (bVar20 == 0) goto LAB_7ffc3eb68983;
                            (*(*env)->ExceptionClear)(env);
                            lVar26 = FUN_7ffc3eb76c30(env,0);
                            if ((lVar26 != 0) &&
                               (lVar37 = FUN_7ffc3eb76c90(env,lVar26,6), lVar37 != 0)) {
                              pvVar25 = (void *)FUN_7ffc3e7d1a80(env,lVar26,lVar37,pvVar25);
                              bVar20 = (*(*env)->ExceptionCheck)(env);
                              if (bVar20 != 0) {
                                pvVar25 = (*(*env)->ExceptionOccurred)(env);
                                goto LAB_7ffc3eb68957;
                              }
                              (*(*env)->Throw)(env,pvVar25);
                            }
                            break;
                          }
                          pvVar30 = (*(*env)->AllocObject)(env,pvVar30);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) {
LAB_7ffc3eb688ac:
                            pvVar25 = (*(*env)->ExceptionOccurred)(env);
                            goto LAB_7ffc3eb688b5;
                          }
                          if (_DAT_7ffc3ebc7890 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar42 = 0x7ffc;
                            uVar44 = 0;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                      0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar32 != (void *)0x0)) {
                              _DAT_7ffc3ebc7890 = (*(*env)->NewGlobalRef)(env,pvVar32);
                            }
                          }
                          pvVar32 = _DAT_7ffc3ebc7890;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar33 = (*(*env)->NewObjectArray)
                                              (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x288e);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar39 ^ 0x4e2309c6c8668dc);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                             pvVar33);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          if (_DAT_7ffc3ebc7898 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar14;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6410,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc7898 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc7898;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b0f6921b919d7ce
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,
                                                             pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          if (_DAT_7ffc3ebc78a0 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar13;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba64b4,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc78a0 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc78a0;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b08d86c96106b3a
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          uVar31 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          uVar23 = FUN_7ffc3e7d8be0(env,uVar31,uRam00007ffc3ebc09d0);
                          if (_DAT_7ffc3ebc78a8 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar42 = 0x7ffc;
                            uVar44 = 0;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                      0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar32 != (void *)0x0)) {
                              _DAT_7ffc3ebc78a8 = (*(*env)->NewGlobalRef)(env,pvVar32);
                            }
                          }
                          pvVar32 = _DAT_7ffc3ebc78a8;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar33 = (*(*env)->NewObjectArray)
                                              (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x4598);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar39 ^ 0x453816b9011e85c2);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                             pvVar33);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          if (_DAT_7ffc3ebc78b0 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar12;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6410,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc78b0 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc78b0;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b0f6921b919d7ce
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,
                                                             pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          if (_DAT_7ffc3ebc78b8 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar11;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6128,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc78b8 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc78b8;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b05e1e96eed32e7
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          uVar31 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          if (_DAT_7ffc3ebc78c0 == (void *)0x0) {
                            uVar35 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar42 = 0x7ffc;
                            uVar44 = 0;
                            lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                      0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar32 != (void *)0x0)) {
                              _DAT_7ffc3ebc78c0 = (*(*env)->NewGlobalRef)(env,pvVar32);
                            }
                          }
                          pvVar32 = _DAT_7ffc3ebc78c0;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar33 = (*(*env)->NewObjectArray)
                                              (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x2d3b);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar39 ^ 0x2aa8cdee20c5ed60);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                             pvVar33);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          if (_DAT_7ffc3ebc78c8 == (void *)0x0) {
                            uVar35 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar10;
                            lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc78c8 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc78c8;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b0d183712ac8315
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                          uVar35 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb688ac;
                          cVar21 = FUN_7ffc3e7d53d0(env,uVar35,uRam00007ffc3ebc0a38);
                          if (cVar21 != '\0') {
                            if (_DAT_7ffc3ebc78d0 == (void *)0x0) {
                              uVar35 = FUN_7ffc3eb76c30(env,0);
                              uVar43 = 0x7ffc;
                              uVar42 = 0x7ffc;
                              uVar44 = 0;
                              lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                        0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d
                                                        ,0,0);
                              if ((lVar26 != 0) &&
                                 (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00
                                                                    ), pvVar32 != (void *)0x0)) {
                                _DAT_7ffc3ebc78d0 = (*(*env)->NewGlobalRef)(env,pvVar32);
                              }
                            }
                            pvVar32 = _DAT_7ffc3ebc78d0;
                            bVar20 = (*(*env)->ExceptionCheck)(env);
                            if (bVar20 == 0) {
                              pvVar33 = (*(*env)->NewObjectArray)
                                                  (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                              pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                 uRam00007ffc3ebc0998,0x5266);
                              (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                              pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 uVar39 ^ 0x6d4b6a325ce4123f);
                              (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                              pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                                 pvVar33);
                              bVar20 = (*(*env)->ExceptionCheck)(env);
                              if (bVar20 == 0) {
                                if (_DAT_7ffc3ebc78d8 == (void *)0x0) {
                                  uVar35 = FUN_7ffc3eb76c30(env,0);
                                  uVar43 = 0x7ffc;
                                  uVar44 = 0;
                                  uVar42 = uVar9;
                                  lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,
                                                            0x7ffc3eba606a,0x7ffc3eba606c,
                                                            0x7ffc3eba60e0,0x7ffc3eba6410,0,0);
                                  if ((lVar26 != 0) &&
                                     (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                         uRam00007ffc3ebc0a00),
                                     pvVar33 != (void *)0x0)) {
                                    _DAT_7ffc3ebc78d8 = (*(*env)->NewGlobalRef)(env,pvVar33);
                                  }
                                }
                                pvVar33 = _DAT_7ffc3ebc78d8;
                                bVar20 = (*(*env)->ExceptionCheck)(env);
                                if (bVar20 == 0) {
                                  pvVar34 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                                  pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x8b0f6921b919d7ce);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                                  pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar39);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                                  pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar33,
                                                                     uRam00007ffc3ebc0a40,pvVar34);
                                  bVar20 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar20 == 0) {
                                    if (_DAT_7ffc3ebc78e0 == (void *)0x0) {
                                      uVar35 = FUN_7ffc3eb76c30(env,0);
                                      uVar44 = 0;
                                      uVar43 = uVar18;
                                      uVar42 = uVar8;
                                      lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,
                                                                0x7ffc3eba606a,0x7ffc3eba606c,
                                                                0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                                      if ((lVar26 != 0) &&
                                         (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar33 != (void *)0x0)) {
                                        _DAT_7ffc3ebc78e0 = (*(*env)->NewGlobalRef)(env,pvVar33);
                                      }
                                    }
                                    pvVar33 = _DAT_7ffc3ebc78e0;
                                    bVar20 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar20 == 0) {
                                      pvVar34 = (*(*env)->NewObjectArray)
                                                          (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar32);
                                      pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,
                                                                         0x8b07c764ec16866b);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                                      pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,uVar39
                                                                        );
                                      (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                                      uVar35 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,
                                                                pvVar34);
                                      bVar20 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar20 == 0) {
                                        cVar21 = FUN_7ffc3e7d53d0(env,uVar35,uRam00007ffc3ebc0a38);
                                        if (cVar21 != '\0') goto LAB_7ffc3eb6656a;
                                        if (_DAT_7ffc3ebc78e8 == (void *)0x0) {
                                          uVar35 = FUN_7ffc3eb76c30(env,0);
                                          uVar43 = 0x7ffc;
                                          uVar42 = 0x7ffc;
                                          uVar44 = 0;
                                          lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,
                                                                    0x7ffc3eba6299,0x7ffc3eba606c,
                                                                    0x7ffc3eba629b,0x7ffc3eba629d,0,
                                                                    0);
                                          if ((lVar26 != 0) &&
                                             (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar32 != (void *)0x0)) {
                                            _DAT_7ffc3ebc78e8 = (*(*env)->NewGlobalRef)(env,pvVar32)
                                            ;
                                          }
                                        }
                                        pvVar32 = _DAT_7ffc3ebc78e8;
                                        bVar20 = (*(*env)->ExceptionCheck)(env);
                                        if (bVar20 == 0) {
                                          pvVar33 = (*(*env)->NewObjectArray)
                                                              (env,2,pvRam00007ffc3ebc09e0,
                                                               (void *)0x0);
                                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,
                                                  uRam00007ffc3ebc0a10,uRam00007ffc3ebc0998,0x5266);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  uVar39 ^ 0x6d4b6a325ce4123f);
                                          (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,
                                                                             uRam00007ffc3ebc0a40,
                                                                             pvVar33);
                                          bVar20 = (*(*env)->ExceptionCheck)(env);
                                          if (bVar20 == 0) {
                                            if (_DAT_7ffc3ebc78f0 == (void *)0x0) {
                                              uVar35 = FUN_7ffc3eb76c30(env,0);
                                              uVar43 = 0x7ffc;
                                              uVar44 = 0;
                                              uVar42 = uVar7;
                                              lVar26 = FUN_7ffc3eb77170(env,uVar35,6,0x7ffc3eba605c,
                                                                        0x7ffc3eba606a,
                                                                        0x7ffc3eba606c,
                                                                        0x7ffc3eba60e0,
                                                                        0x7ffc3eba6410,0,0);
                                              if ((lVar26 != 0) &&
                                                 (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                                                                                                                          
                                                  uRam00007ffc3ebc0a00), pvVar33 != (void *)0x0)) {
                                                _DAT_7ffc3ebc78f0 =
                                                     (*(*env)->NewGlobalRef)(env,pvVar33);
                                              }
                                            }
                                            pvVar33 = _DAT_7ffc3ebc78f0;
                                            bVar20 = (*(*env)->ExceptionCheck)(env);
                                            if (bVar20 == 0) {
                                              pvVar34 = (*(*env)->NewObjectArray)
                                                                  (env,4,pvRam00007ffc3ebc09e0,
                                                                   (void *)0x0);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar34,0,pvVar28);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar34,1,pvVar32);
                                              pvVar32 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x8b0f6921b919d7ce);
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar34,2,pvVar32);
                                              pvVar32 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar39)
                                              ;
                                              (*(*env)->SetObjectArrayElement)
                                                        (env,pvVar34,3,pvVar32);
                                              pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar33,
                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a40,pvVar34);
                                              bVar20 = (*(*env)->ExceptionCheck)(env);
                                              if (bVar20 == 0) {
                                                if (_DAT_7ffc3ebc78f8 == (void *)0x0) {
                                                  uVar35 = FUN_7ffc3eb76c30(env,0);
                                                  uVar43 = 0x7ffc;
                                                  uVar44 = 0;
                                                  uVar42 = uVar6;
                                                  lVar26 = FUN_7ffc3eb77170(env,uVar35,6,
                                                                            0x7ffc3eba605c,
                                                                            0x7ffc3eba606a,
                                                                            0x7ffc3eba606c,
                                                                            0x7ffc3eba60e0,
                                                                            0x7ffc3eba6128,0,0);
                                                  if ((lVar26 != 0) &&
                                                     (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                                                                                                                                  
                                                  uRam00007ffc3ebc0a00), pvVar33 != (void *)0x0)) {
                                                    _DAT_7ffc3ebc78f8 =
                                                         (*(*env)->NewGlobalRef)(env,pvVar33);
                                                  }
                                                }
                                                pvVar33 = _DAT_7ffc3ebc78f8;
                                                bVar20 = (*(*env)->ExceptionCheck)(env);
                                                if (bVar20 == 0) {
                                                  pvVar34 = (*(*env)->NewObjectArray)
                                                                      (env,3,pvRam00007ffc3ebc09e0,
                                                                       (void *)0x0);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar34,0,pvVar32);
                                                  pvVar32 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,
                                                  0x8b05e1e96eed32e7);
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar34,1,pvVar32);
                                                  pvVar32 = (void *)FUN_7ffc3e7d1a80(env,
                                                  pvRam00007ffc3ebc0958,uRam00007ffc3ebc0918,uVar39)
                                                  ;
                                                  (*(*env)->SetObjectArrayElement)
                                                            (env,pvVar34,2,pvVar32);
                                                  uVar35 = FUN_7ffc3e7d1a50(env,pvVar33,
                                                                            uRam00007ffc3ebc0a40,
                                                                            pvVar34);
                                                  bVar20 = (*(*env)->ExceptionCheck)(env);
                                                  if (bVar20 == 0) goto LAB_7ffc3eb6712f;
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
                            goto LAB_7ffc3eb6889b;
                          }
LAB_7ffc3eb6656a:
                          uVar35 = 0;
LAB_7ffc3eb6712f:
                          if (_DAT_7ffc3ebc7900 == (void *)0x0) {
                            uVar36 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar42 = 0x7ffc;
                            uVar44 = 0;
                            lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                      0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar32 != (void *)0x0)) {
                              _DAT_7ffc3ebc7900 = (*(*env)->NewGlobalRef)(env,pvVar32);
                            }
                          }
                          pvVar32 = _DAT_7ffc3ebc7900;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          pvVar33 = (*(*env)->NewObjectArray)
                                              (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x2fa5);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar39 ^ 0x711d606b6084eff4);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                             pvVar33);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          if (_DAT_7ffc3ebc7908 == (void *)0x0) {
                            uVar36 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar5;
                            lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc7908 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc7908;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b0d183712ac8315
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                          uVar36 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          cVar21 = FUN_7ffc3e7d53d0(env,uVar36,uRam00007ffc3ebc0a38);
                          if (cVar21 != '\0') {
                            if (_DAT_7ffc3ebc7910 == (void *)0x0) {
                              uVar36 = FUN_7ffc3eb76c30(env,0);
                              uVar43 = 0x7ffc;
                              uVar42 = 0x7ffc;
                              uVar44 = 0;
                              lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                        0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d
                                                        ,0,0);
                              if ((lVar26 != 0) &&
                                 (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00
                                                                    ), pvVar32 != (void *)0x0)) {
                                _DAT_7ffc3ebc7910 = (*(*env)->NewGlobalRef)(env,pvVar32);
                              }
                            }
                            pvVar32 = _DAT_7ffc3ebc7910;
                            bVar20 = (*(*env)->ExceptionCheck)(env);
                            if (bVar20 == 0) {
                              pvVar33 = (*(*env)->NewObjectArray)
                                                  (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                              pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                 uRam00007ffc3ebc0998,0x93);
                              (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                              pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 uVar39 ^ 0x62a555c7de03c0cf);
                              (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                              pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                                 pvVar33);
                              bVar20 = (*(*env)->ExceptionCheck)(env);
                              if (bVar20 == 0) {
                                if (_DAT_7ffc3ebc7918 == (void *)0x0) {
                                  uVar36 = FUN_7ffc3eb76c30(env,0);
                                  uVar43 = 0x7ffc;
                                  uVar44 = 0;
                                  uVar42 = uVar4;
                                  lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,
                                                            0x7ffc3eba606a,0x7ffc3eba606c,
                                                            0x7ffc3eba60e0,0x7ffc3eba6410,0,0);
                                  if ((lVar26 != 0) &&
                                     (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                         uRam00007ffc3ebc0a00),
                                     pvVar33 != (void *)0x0)) {
                                    _DAT_7ffc3ebc7918 = (*(*env)->NewGlobalRef)(env,pvVar33);
                                  }
                                }
                                pvVar33 = _DAT_7ffc3ebc7918;
                                bVar20 = (*(*env)->ExceptionCheck)(env);
                                if (bVar20 == 0) {
                                  pvVar34 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                                  pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x8b0f6921b919d7ce);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                                  pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar39);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                                  pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar33,
                                                                     uRam00007ffc3ebc0a40,pvVar34);
                                  bVar20 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar20 == 0) {
                                    if (_DAT_7ffc3ebc7920 == (void *)0x0) {
                                      uVar36 = FUN_7ffc3eb76c30(env,0);
                                      uVar43 = 0x7ffc;
                                      uVar44 = 0;
                                      uVar42 = uVar3;
                                      lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,
                                                                0x7ffc3eba606a,0x7ffc3eba606c,
                                                                0x7ffc3eba60e0,0x7ffc3eba64b4,0,0);
                                      if ((lVar26 != 0) &&
                                         (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar33 != (void *)0x0)) {
                                        _DAT_7ffc3ebc7920 = (*(*env)->NewGlobalRef)(env,pvVar33);
                                      }
                                    }
                                    pvVar33 = _DAT_7ffc3ebc7920;
                                    bVar20 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar20 == 0) {
                                      pvVar34 = (*(*env)->NewObjectArray)
                                                          (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar32);
                                      pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,
                                                                         0x8b08d86c96106b3a);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                                      pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,uVar39
                                                                        );
                                      (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                                      uVar36 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,
                                                                pvVar34);
                                      bVar20 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar20 == 0) {
                                        uVar24 = FUN_7ffc3e7d8be0(env,uVar36,uRam00007ffc3ebc09d0);
                                        goto joined_r0x7ffc3eb67627;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            goto LAB_7ffc3eb6889b;
                          }
                          uVar24 = 0;
joined_r0x7ffc3eb67627:
                          if (_DAT_7ffc3ebc7928 == (void *)0x0) {
                            uVar36 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar42 = 0x7ffc;
                            uVar44 = 0;
                            lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                      0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar32 != (void *)0x0)) {
                              _DAT_7ffc3ebc7928 = (*(*env)->NewGlobalRef)(env,pvVar32);
                            }
                          }
                          pvVar32 = _DAT_7ffc3ebc7928;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          pvVar33 = (*(*env)->NewObjectArray)
                                              (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                             uRam00007ffc3ebc0998,0x6714);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                          pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,
                                                             uVar39 ^ 0x6227df0b012274c);
                          (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                          pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                             pvVar33);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          if (_DAT_7ffc3ebc7930 == (void *)0x0) {
                            uVar36 = FUN_7ffc3eb76c30(env,0);
                            uVar43 = 0x7ffc;
                            uVar44 = 0;
                            uVar42 = uVar2;
                            lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar33 != (void *)0x0)) {
                              _DAT_7ffc3ebc7930 = (*(*env)->NewGlobalRef)(env,pvVar33);
                            }
                          }
                          pvVar33 = _DAT_7ffc3ebc7930;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          pvVar34 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b0d183712ac8315
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar32);
                          pvVar32 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar32);
                          uVar36 = FUN_7ffc3e7d1a50(env,pvVar33,uRam00007ffc3ebc0a40,pvVar34);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) goto LAB_7ffc3eb6889b;
                          cVar21 = FUN_7ffc3e7d53d0(env,uVar36,uRam00007ffc3ebc0a38);
                          if (cVar21 != '\0') {
                            if (_DAT_7ffc3ebc7938 == (void *)0x0) {
                              uVar36 = FUN_7ffc3eb76c30(env,0);
                              uVar43 = 0x7ffc;
                              uVar42 = 0x7ffc;
                              uVar44 = 0;
                              lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,0x7ffc3eba6299,
                                                        0x7ffc3eba606c,0x7ffc3eba629b,0x7ffc3eba629d
                                                        ,0,0);
                              if ((lVar26 != 0) &&
                                 (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00
                                                                    ), pvVar32 != (void *)0x0)) {
                                _DAT_7ffc3ebc7938 = (*(*env)->NewGlobalRef)(env,pvVar32);
                              }
                            }
                            pvVar32 = _DAT_7ffc3ebc7938;
                            bVar20 = (*(*env)->ExceptionCheck)(env);
                            if (bVar20 == 0) {
                              pvVar33 = (*(*env)->NewObjectArray)
                                                  (env,2,pvRam00007ffc3ebc09e0,(void *)0x0);
                              pvVar34 = (void *)FUN_7ffc3e7d1a80(env,uRam00007ffc3ebc0a10,
                                                                 uRam00007ffc3ebc0998,0x722f);
                              (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar34);
                              pvVar34 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                 uRam00007ffc3ebc0918,
                                                                 uVar39 ^ 0x782def88844b327a);
                              (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar34);
                              pvVar32 = (void *)FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                                 pvVar33);
                              bVar20 = (*(*env)->ExceptionCheck)(env);
                              if (bVar20 == 0) {
                                if (_DAT_7ffc3ebc7940 == (void *)0x0) {
                                  uVar36 = FUN_7ffc3eb76c30(env,0);
                                  uVar43 = 0x7ffc;
                                  uVar44 = 0;
                                  uVar42 = uVar1;
                                  lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,
                                                            0x7ffc3eba606a,0x7ffc3eba606c,
                                                            0x7ffc3eba60e0,0x7ffc3eba6410,0,0);
                                  if ((lVar26 != 0) &&
                                     (pvVar33 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                         uRam00007ffc3ebc0a00),
                                     pvVar33 != (void *)0x0)) {
                                    _DAT_7ffc3ebc7940 = (*(*env)->NewGlobalRef)(env,pvVar33);
                                  }
                                }
                                pvVar33 = _DAT_7ffc3ebc7940;
                                bVar20 = (*(*env)->ExceptionCheck)(env);
                                if (bVar20 == 0) {
                                  pvVar34 = (*(*env)->NewObjectArray)
                                                      (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,0,pvVar28);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,1,pvVar32);
                                  pvVar28 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,
                                                                     0x8b0f6921b919d7ce);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,2,pvVar28);
                                  pvVar28 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                     uRam00007ffc3ebc0918,uVar39);
                                  (*(*env)->SetObjectArrayElement)(env,pvVar34,3,pvVar28);
                                  pvVar28 = (void *)FUN_7ffc3e7d1a50(env,pvVar33,
                                                                     uRam00007ffc3ebc0a40,pvVar34);
                                  bVar20 = (*(*env)->ExceptionCheck)(env);
                                  if (bVar20 == 0) {
                                    if (_DAT_7ffc3ebc7948 == (void *)0x0) {
                                      uVar36 = FUN_7ffc3eb76c30(env,0);
                                      uVar44 = 0;
                                      uVar43 = uStack_ac;
                                      uVar42 = uStack_c8._4_4_;
                                      lVar26 = FUN_7ffc3eb77170(env,uVar36,6,0x7ffc3eba605c,
                                                                0x7ffc3eba606a,0x7ffc3eba606c,
                                                                0x7ffc3eba60e0,0x7ffc3eba6204,0,0);
                                      if ((lVar26 != 0) &&
                                         (pvVar32 = (void *)FUN_7ffc3e7d1a50(env,lVar26,
                                                                             uRam00007ffc3ebc0a00),
                                         pvVar32 != (void *)0x0)) {
                                        _DAT_7ffc3ebc7948 = (*(*env)->NewGlobalRef)(env,pvVar32);
                                      }
                                    }
                                    pvVar32 = _DAT_7ffc3ebc7948;
                                    bVar20 = (*(*env)->ExceptionCheck)(env);
                                    if (bVar20 == 0) {
                                      pvVar33 = (*(*env)->NewObjectArray)
                                                          (env,3,pvRam00007ffc3ebc09e0,(void *)0x0);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar33,0,pvVar28);
                                      pvVar28 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,
                                                                         0x8b0652b448c5bef6);
                                      (*(*env)->SetObjectArrayElement)(env,pvVar33,1,pvVar28);
                                      pvVar28 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                                         uRam00007ffc3ebc0918,uVar39
                                                                        );
                                      (*(*env)->SetObjectArrayElement)(env,pvVar33,2,pvVar28);
                                      uVar36 = FUN_7ffc3e7d1a50(env,pvVar32,uRam00007ffc3ebc0a40,
                                                                pvVar33);
                                      bVar20 = (*(*env)->ExceptionCheck)(env);
                                      if (bVar20 == 0) {
                                        cVar21 = FUN_7ffc3e7d53d0(env,uVar36,uRam00007ffc3ebc0a38);
                                        uVar40 = 1;
                                        if (cVar21 == '\0') goto LAB_7ffc3eb67d5a;
                                        goto LAB_7ffc3eb67d5c;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            goto LAB_7ffc3eb6889b;
                          }
LAB_7ffc3eb67d5a:
                          uVar40 = 0;
LAB_7ffc3eb67d5c:
                          if (pvVar30 == (void *)0x0) {
                            pJVar38 = *env;
                            pcVar41 = &DAT_7ffc3eba6000;
                            pvVar25 = pvRam00007ffc3ebc0a70;
                            goto LAB_7ffc3eb68a06;
                          }
                          lVar26 = FUN_7ffc3eb76c30(env,0xf);
                          if ((lVar26 == 0) ||
                             (lVar37 = FUN_7ffc3eb76c90(env,lVar26,0xf), lVar37 == 0)) break;
                          in_stack_ffffffffffffff08 = CONCAT44(uVar44,uVar40);
                          in_stack_ffffffffffffff00 = CONCAT44(uVar43,uVar24);
                          in_stack_fffffffffffffee8 = CONCAT44(uVar42,uVar23);
                          FUN_7ffc3e7dbbc0(env,pvVar30,lVar26,lVar37,in_stack_fffffffffffffee8,
                                           uVar31,uVar35,in_stack_ffffffffffffff00,
                                           in_stack_ffffffffffffff08);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) break;
                          if (_DAT_7ffc3ebc7950 == (void *)0x0) {
                            uVar31 = FUN_7ffc3eb76c30(env,0);
                            in_stack_ffffffffffffff00 = 0x7ffc3eba6245;
                            in_stack_ffffffffffffff08 = 0;
                            in_stack_fffffffffffffee8 = uStack_c8;
                            lVar26 = FUN_7ffc3eb77170(env,uVar31,6,0x7ffc3eba605c,0x7ffc3eba606a,
                                                      0x7ffc3eba606c,0x7ffc3eba60e0,0x7ffc3eba6245,0
                                                      ,0);
                            if ((lVar26 != 0) &&
                               (pvVar28 = (void *)FUN_7ffc3e7d1a50(env,lVar26,uRam00007ffc3ebc0a00),
                               pvVar28 != (void *)0x0)) {
                              _DAT_7ffc3ebc7950 = (*(*env)->NewGlobalRef)(env,pvVar28);
                            }
                          }
                          pvVar28 = _DAT_7ffc3ebc7950;
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) break;
                          pvVar32 = (*(*env)->NewObjectArray)
                                              (env,4,pvRam00007ffc3ebc09e0,(void *)0x0);
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,0,pvVar29);
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,1,pvVar30);
                          pvVar30 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,0x8b097cb5d9e95072
                                                            );
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,2,pvVar30);
                          pvVar30 = (void *)FUN_7ffc3e7d1a80(env,pvRam00007ffc3ebc0958,
                                                             uRam00007ffc3ebc0918,uVar39);
                          (*(*env)->SetObjectArrayElement)(env,pvVar32,3,pvVar30);
                          uVar31 = FUN_7ffc3e7d1a50(env,pvVar28,uRam00007ffc3ebc0a40);
                          bVar20 = (*(*env)->ExceptionCheck)(env);
                          if (bVar20 != 0) break;
                          FUN_7ffc3e7d53d0(env,uVar31,uRam00007ffc3ebc0a38);
                        } while( true );
                      }
                    }
                  }
                }
              }
            }
            pvVar25 = (*(*env)->ExceptionOccurred)(env);
LAB_7ffc3eb68957:
            pvVar28 = (void *)FUN_7ffc3eb76c30(env,8);
            bVar20 = (*(*env)->IsInstanceOf)(env,pvVar25,pvVar28);
joined_r0x7ffc3eb689aa:
            if (bVar20 == 0) {
              return (void *)0x0;
            }
            (*(*env)->ExceptionClear)(env);
            return pvVar29;
          }
          goto LAB_7ffc3eb68a2e;
        }
      }
      pJVar38 = *env;
      pcVar41 = (char *)0x7ffc3eba6033;
      pvVar25 = pvRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb6509c;
    }
  }
  pcVar41 = &DAT_7ffc3eba6000;
  pvVar25 = pvRam00007ffc3ebc0a70;
LAB_7ffc3eb6509c:
  (*pJVar38->ThrowNew)(env,pvVar25,pcVar41);
  return (void *)0x0;
}

/* JNI_dev_krypton_6_3_25 | RVA 0x398a70 | dev/krypton/6.3(Z)V | success */

void JNI_dev_krypton_6_3_25(longlong *param_1,undefined8 param_2,undefined4 param_3)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar1 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar1 != 0) {
    lVar2 = FUN_7ffc3eb76ce0(param_1,lVar1,1);
    if (lVar2 != 0) {
      (**(code **)(*param_1 + 0x4d8))(param_1,lVar1,lVar2,param_3);
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb68ac5. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*param_1 + 0x720))(param_1);
      return;
    }
  }
  return;
}

/* JNI_dev_krypton_6_2_26 | RVA 0x398ae0 | dev/krypton/6.2()Z | success */

uint JNI_dev_krypton_6_2_26(longlong *param_1)

{
  char cVar1;
  uint uVar2;
  ulonglong uVar3;
  longlong lVar4;
  
  uVar3 = FUN_7ffc3eb76c30(param_1,0);
  if ((uVar3 != 0) && (lVar4 = FUN_7ffc3eb76ce0(param_1,uVar3,1), lVar4 != 0)) {
    if (cRam00007ffc3ebc08f4 == '\x01') {
      uVar2 = (uint)*(byte *)(*(longlong *)(uVar3 & 0xfffffffffffffffc) +
                             (longlong)*(int *)(lVar4 + 0x10));
    }
    else {
      uVar2 = (**(code **)(*param_1 + 0x490))(param_1,uVar3,lVar4);
    }
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      return uVar2;
    }
  }
  return 0;
}

/* JNI_dev_krypton_6_7_27 | RVA 0x398b60 | dev/krypton/6.7()Z | success */

bool JNI_dev_krypton_6_7_27(longlong *param_1)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0);
  if ((lVar3 != 0) && (lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,9), lVar4 != 0)) {
    iVar2 = FUN_7ffc3e7db1e0(param_1,lVar3,lVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      return iVar2 == 0;
    }
  }
  return false;
}

/* JNI_dev_krypton_6_a_28 | RVA 0x398bd0 | dev/krypton/6.a(Ljava/lang/Exception;)Ljava/lang/Exception; | success */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * JNI_dev_krypton_6_a_28(JNINativeInterface_ **env,void *receiver,void *arg0)

{
  return arg0;
}

/* JNI_dev_krypton_6_a_29 | RVA 0x398be0 | dev/krypton/6.a([B)Ljava/lang/String; | success */

longlong JNI_dev_krypton_6_a_29(longlong *param_1,undefined8 param_2,ulonglong param_3)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  char cVar5;
  int iVar6;
  int iVar7;
  ulonglong uVar8;
  byte *pbVar9;
  longlong lVar10;
  longlong lVar11;
  ushort *puVar12;
  undefined8 uVar13;
  ushort uVar14;
  undefined *puVar15;
  ulonglong uVar16;
  undefined4 uVar17;
  ulonglong uVar18;
  uint uVar19;
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
  ulonglong uStack_50;
  ulonglong uStack_48;
  
  if (param_3 != 0) {
    if (bRam00007ffc3ebc08e5 == 1) {
      uVar19 = *(uint *)(*(longlong *)(param_3 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      uVar19 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
    }
    if ((int)uVar19 < 0) {
      lVar10 = *param_1;
      puVar15 = (undefined *)0x7ffc3eba6048;
      uVar13 = uRam00007ffc3ebc0a80;
      goto LAB_7ffc3eb69176;
    }
    uVar8 = (**(code **)(*param_1 + 0x588))(param_1,(ulonglong)uVar19);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (uVar19 != 0) {
      plStack_78 = (longlong *)(param_3 & 0xfffffffffffffffc);
      plStack_60 = (longlong *)(uVar8 & 0xfffffffffffffffc);
      uStack_48 = (ulonglong)uVar19;
      iStack_54 = uVar19 - 2;
      uVar16 = 0;
      uVar19 = 0;
      uStack_50 = param_3;
LAB_7ffc3eb68cce:
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar6 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
      }
      if ((int)uVar19 < iVar6) {
        if (bRam00007ffc3ebc08e5 == 1) {
          pbVar9 = (byte *)((ulonglong)uVar19 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
        }
        else {
          pbVar9 = &bStack_61;
          (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar19,1,pbVar9);
        }
        bVar2 = *pbVar9;
        uVar14 = (ushort)bVar2;
        iVar6 = (int)uVar16;
        if (bVar2 < 0xc0) {
          if (uVar8 == 0) goto LAB_7ffc3eb69180;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar7 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if ((iVar6 < 0) || (iVar7 <= iVar6)) goto LAB_7ffc3eb6915e;
          uVar18 = (ulonglong)(iVar6 + 1);
          uStack_66 = (ushort)bVar2;
          if (bRam00007ffc3ebc08e5 == 1) {
LAB_7ffc3eb68ca0:
            *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar16 * 2) = uVar14;
            uVar16 = uVar18;
          }
          else {
            lVar10 = *param_1;
            puVar12 = &uStack_66;
LAB_7ffc3eb68f11:
            (**(code **)(lVar10 + 0x688))(param_1,uVar8,uVar16,1,puVar12);
            uVar16 = uVar18;
          }
LAB_7ffc3eb68cbc:
          uVar19 = uVar19 + 1;
          uVar17 = (undefined4)uVar16;
          if ((uint)uStack_48 <= uVar19) goto LAB_7ffc3eb690cf;
          goto LAB_7ffc3eb68cce;
        }
        if (bVar2 < 0xe0) {
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar7 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          uVar19 = uVar19 + 1;
          if ((int)uVar19 < iVar7) {
            if (bRam00007ffc3ebc08e5 == 1) {
              pbVar9 = (byte *)((ulonglong)uVar19 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
            }
            else {
              pbVar9 = &bStack_62;
              (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar19,1,pbVar9);
            }
            if (uVar8 == 0) goto LAB_7ffc3eb69180;
            bVar3 = *pbVar9;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar7 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if ((-1 < iVar6) && (iVar6 < iVar7)) {
              uVar14 = bVar3 & 0x3f | (ushort)(((int)(char)bVar2 & 0x1fU) << 6);
              uVar18 = (ulonglong)(iVar6 + 1);
              uStack_68 = uVar14;
              if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb68ca0;
              lVar10 = *param_1;
              puVar12 = &uStack_68;
              goto LAB_7ffc3eb68f11;
            }
          }
        }
        else {
          if (iStack_54 <= (int)uVar19) goto LAB_7ffc3eb68cbc;
          if (bRam00007ffc3ebc08e5 == 1) {
            iVar7 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          uVar1 = uVar19 + 1;
          if (iVar7 <= (int)uVar1) goto LAB_7ffc3eb6915e;
          if (bRam00007ffc3ebc08e5 == 1) {
            pbVar9 = (byte *)((ulonglong)uVar1 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
          }
          else {
            pbVar9 = &bStack_63;
            (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar1,1,pbVar9);
          }
          bVar3 = *pbVar9;
          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
            iVar7 = (**(code **)(*param_1 + 0x558))(param_1,param_3);
          }
          else {
            iVar7 = *(int *)(*plStack_78 + (ulonglong)uRam00007ffc3ebc08e8);
          }
          uVar19 = uVar19 + 2;
          if ((int)uVar19 < iVar7) {
            if (bRam00007ffc3ebc08e5 == 1) {
              pbVar9 = (byte *)((ulonglong)uVar19 + (ulonglong)uRam00007ffc3ebc08f0 + *plStack_78);
            }
            else {
              (**(code **)(*param_1 + 0x640))(param_1,param_3,uVar19,1,&bStack_79);
              pbVar9 = &bStack_79;
            }
            if (uVar8 == 0) goto LAB_7ffc3eb69180;
            bVar4 = *pbVar9;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar7 = *(int *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
            }
            if ((-1 < iVar6) && (iVar6 < iVar7)) {
              uStack_6a = bVar4 & 0x3f | (bVar3 & 0x3f) << 6 | (ushort)((int)(char)bVar2 << 0xc);
              if (bRam00007ffc3ebc08e5 == 1) {
                *(ushort *)(*plStack_60 + (ulonglong)uRam00007ffc3ebc08f0 + uVar16 * 2) = uStack_6a;
                param_3 = uStack_50;
                uVar16 = (ulonglong)(iVar6 + 1);
              }
              else {
                (**(code **)(*param_1 + 0x688))(param_1,uVar8,uVar16,1,&uStack_6a);
                param_3 = uStack_50;
                uVar16 = (ulonglong)(iVar6 + 1);
              }
              goto LAB_7ffc3eb68cbc;
            }
          }
        }
      }
LAB_7ffc3eb6915e:
      lVar10 = *param_1;
      puVar15 = (undefined *)0x7ffc3eba6019;
      uVar13 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb69176;
    }
    uVar17 = 0;
LAB_7ffc3eb690cf:
    lVar10 = (**(code **)(*param_1 + 0xd8))(param_1,uRam00007ffc3ebc09e8);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (lVar10 != 0) {
      lVar11 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x10);
      if (lVar11 == 0) {
        return 0;
      }
      FUN_7ffc3e7dbbc0(param_1,lVar10,uRam00007ffc3ebc09e8,lVar11,uVar8,0,uVar17);
      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar5 != '\0') {
        return 0;
      }
      return lVar10;
    }
  }
LAB_7ffc3eb69180:
  lVar10 = *param_1;
  puVar15 = &DAT_7ffc3eba6000;
  uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb69176:
  (**(code **)(lVar10 + 0x70))(param_1,uVar13,puVar15);
  return 0;
}

/* JNI_dev_krypton_6_a_30 | RVA 0x3991b0 | dev/krypton/6.a(IJ)Ljava/lang/String; | success */

undefined8
JNI_dev_krypton_6_a_30(longlong *param_1,undefined8 param_2,uint param_3,longlong param_4)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  uint uVar11;
  undefined *puVar12;
  byte bVar13;
  undefined1 uStack_5e;
  undefined1 uStack_5d;
  uint uStack_5c;
  ulonglong uStack_58;
  longlong lStack_50;
  longlong lStack_48;
  
  lStack_50 = param_4;
  lVar3 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar3 == 0) {
    return 0;
  }
  lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,2);
  if (lVar4 == 0) {
    return 0;
  }
  uVar5 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar5 == 0) goto LAB_7ffc3eb69ecc;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
  }
  if ((-1 < (int)param_3) &&
     (uVar11 = param_3 ^ (uint)lStack_50 & 0x7fff ^ 0x4b4c, (int)uVar11 < iVar2)) {
    lVar3 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,uVar11);
    if (lVar3 == 0) {
      lVar3 = FUN_7ffc3eb76c30(param_1,0x10);
      if ((lVar3 == 0) || (lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x11), lVar4 == 0)) {
LAB_7ffc3eb6a05e:
        lVar4 = *param_1;
LAB_7ffc3eb6a064:
        uVar9 = (**(code **)(lVar4 + 0x78))(param_1);
LAB_7ffc3eb6a067:
        uVar10 = FUN_7ffc3eb76c30(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar9,uVar10);
        if (cVar1 == '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x88))(param_1);
        lVar3 = FUN_7ffc3eb76c30(param_1,0x16);
        if (lVar3 == 0) {
          return 0;
        }
        lVar4 = (**(code **)(*param_1 + 0xd8))(param_1,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar10 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba605c);
        if (lVar4 != 0) {
          lVar6 = FUN_7ffc3eb76c90(param_1,lVar3,0x18);
          if (lVar6 == 0) {
            return 0;
          }
          FUN_7ffc3e7dbbc0(param_1,lVar4,lVar3,lVar6,uVar10,uVar9);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          (**(code **)(*param_1 + 0x68))(param_1,lVar4);
          return 0;
        }
      }
      else {
        lVar4 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') goto LAB_7ffc3eb6a05e;
        if (lVar4 == 0) goto LAB_7ffc3eb6a00d;
        lVar3 = FUN_7ffc3eb76c90(param_1,lVar3,0x12);
        if (lVar3 == 0) goto LAB_7ffc3eb6a05e;
        uVar9 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 != '\0') ||
           (lVar3 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1), lVar3 == 0))
        goto LAB_7ffc3eb6a05e;
        uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar3,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 != '\0') || (lVar3 = FUN_7ffc3eb76c30(param_1,0), lVar3 == 0))
        goto LAB_7ffc3eb6a05e;
        lVar6 = FUN_7ffc3eb76ce0(param_1,lVar3,3);
        lVar4 = *param_1;
        if (lVar6 == 0) goto LAB_7ffc3eb6a064;
        lVar4 = (**(code **)(lVar4 + 0x488))(param_1,lVar3,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') goto LAB_7ffc3eb6a05e;
        if (lVar4 == 0) goto LAB_7ffc3eb6a00d;
        uVar5 = FUN_7ffc3eb76c30(param_1,0x11);
        if ((uVar5 == 0) || (lVar7 = FUN_7ffc3eb76c90(param_1,uVar5,0x13), lVar7 == 0))
        goto LAB_7ffc3eb6a05e;
        uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar7,uVar9);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 != '\0') || (lVar4 = FUN_7ffc3eb76c30(param_1,0x12), lVar4 == 0))
        goto LAB_7ffc3eb6a05e;
        if (uVar8 == 0) {
          uStack_58 = uVar5;
          lStack_48 = lVar6;
          uVar8 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3eb6a05e;
          uVar10 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6516);
          lVar4 = FUN_7ffc3eb76c30(param_1,0x13);
          if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x14), lVar6 == 0))
          goto LAB_7ffc3eb6a05e;
          uVar10 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar6,uVar10);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3eb6a05e;
          if (uVar8 == 0) goto LAB_7ffc3eb6a00d;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (iVar2 < 1) {
LAB_7ffc3eb6a040:
            lVar3 = *param_1;
            puVar12 = (undefined *)0x7ffc3eba6019;
            uVar9 = uRam00007ffc3ebc0a98;
            goto LAB_7ffc3eb6a058;
          }
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar10);
          uVar10 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652b);
          lVar4 = FUN_7ffc3eb76c30(param_1,0x14);
          if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x15), lVar6 == 0))
          goto LAB_7ffc3eb6a05e;
          uVar10 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar6,uVar10);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') goto LAB_7ffc3eb6a05e;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
          }
          if (iVar2 < 2) goto LAB_7ffc3eb6a040;
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar10);
          lVar6 = FUN_7ffc3eb76c30(param_1,0x15);
          lVar4 = *param_1;
          if (lVar6 == 0) goto LAB_7ffc3eb6a064;
          lVar4 = (**(code **)(lVar4 + 0xd8))(param_1,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            uVar10 = (**(code **)(*param_1 + 0x580))(param_1,8);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              if (lVar4 == 0) {
LAB_7ffc3eb6a00d:
                lVar3 = *param_1;
                puVar12 = &DAT_7ffc3eba6000;
                uVar9 = uRam00007ffc3ebc0a70;
                goto LAB_7ffc3eb6a058;
              }
              lVar7 = FUN_7ffc3eb76c90(param_1,lVar6,0x16);
              if (lVar7 != 0) {
                FUN_7ffc3e7dbbc0(param_1,lVar4,lVar6,lVar7,uVar10);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                uVar5 = uStack_58;
                if (cVar1 == '\0') {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                  }
                  if (iVar2 < 3) goto LAB_7ffc3eb6a040;
                  (**(code **)(*param_1 + 0x570))(param_1,uVar8,2,lVar4);
                  lVar3 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lStack_48);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (lVar3 == 0) goto LAB_7ffc3eb6a00d;
                    lVar4 = FUN_7ffc3eb76c90(param_1,uVar5,0x17);
                    if (lVar4 != 0) {
                      FUN_7ffc3e7d1a50(param_1,lVar3,lVar4,uVar9,uVar8);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 == '\0') goto LAB_7ffc3eb698be;
                    }
                  }
                }
              }
            }
            goto LAB_7ffc3eb6a05e;
          }
          uVar9 = (**(code **)(*param_1 + 0x78))(param_1);
          goto LAB_7ffc3eb6a067;
        }
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,lVar4);
        if (cVar1 == '\0') {
          lVar3 = *param_1;
          puVar12 = (undefined *)0x7ffc3eba6033;
          uVar9 = uRam00007ffc3ebc0a58;
LAB_7ffc3eb6a058:
          (**(code **)(lVar3 + 0x70))(param_1,uVar9,puVar12);
          goto LAB_7ffc3eb6a05e;
        }
LAB_7ffc3eb698be:
        uVar5 = (**(code **)(*param_1 + 0x580))(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (uVar5 != 0) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 < 1) goto LAB_7ffc3eb69ff0;
          uStack_5d = (undefined1)((ulonglong)lStack_50 >> 0x38);
          uStack_5c = uVar11;
          uStack_58 = uVar8;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            *(undefined1 *)
             (*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
                 uStack_5d;
          }
          else {
            (**(code **)(*param_1 + 0x680))(param_1,uVar5,0,1,&uStack_5d);
          }
          uVar8 = 1;
          bVar13 = 8;
          do {
            lVar3 = lStack_50 << (bVar13 & 0x3f);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
            }
            if ((longlong)iVar2 <= (longlong)uVar8) goto LAB_7ffc3eb69ff0;
            uStack_5e = (undefined1)((ulonglong)lVar3 >> 0x38);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              *(undefined1 *)
               (uVar8 + (ulonglong)uRam00007ffc3ebc08f0 + *(longlong *)(uVar5 & 0xfffffffffffffffc))
                   = uStack_5e;
            }
            else {
              (**(code **)(*param_1 + 0x680))(param_1,uVar5,uVar8 & 0xffffffff,1,&uStack_5e);
            }
            uVar8 = uVar8 + 1;
            bVar13 = bVar13 + 8;
          } while (uVar8 != 8);
          lVar3 = FUN_7ffc3eb76c30(param_1,0x17);
          if (lVar3 == 0) {
            return 0;
          }
          lVar4 = (**(code **)(*param_1 + 0xd8))(param_1,lVar3);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (lVar4 != 0) {
            lVar6 = FUN_7ffc3eb76c90(param_1,lVar3,0x19);
            if (lVar6 == 0) {
              return 0;
            }
            FUN_7ffc3e7dbbc0(param_1,lVar4,lVar3,lVar6,uVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            uVar5 = uStack_58;
            if (cVar1 != '\0') {
              return 0;
            }
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uStack_58 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uStack_58);
            }
            uVar11 = uStack_5c;
            if (iVar2 < 2) goto LAB_7ffc3eb69ff0;
            lVar3 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,1);
            lVar6 = FUN_7ffc3eb76c30(param_1,0x14);
            if (lVar6 == 0) {
              return 0;
            }
            if (lVar3 != 0) {
              cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar3,lVar6);
              if (cVar1 != '\0') {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x1a);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar9 = FUN_7ffc3e7d1a50(param_1,lVar3,lVar6,lVar4);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                }
                if (iVar2 < 1) goto LAB_7ffc3eb69ff0;
                lVar3 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,0);
                lVar4 = FUN_7ffc3eb76c30(param_1,0x13);
                if (lVar4 == 0) {
                  return 0;
                }
                if ((lVar3 == 0) ||
                   (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar3,lVar4), cVar1 != '\0')) {
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                  }
                  if (iVar2 < 3) goto LAB_7ffc3eb69ff0;
                  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,2);
                  lVar7 = FUN_7ffc3eb76c30(param_1,0x15);
                  if (lVar7 == 0) {
                    return 0;
                  }
                  if ((lVar6 == 0) ||
                     (cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar7), cVar1 != '\0'))
                  {
                    if (lVar3 != 0) {
                      lVar7 = FUN_7ffc3eb76c90(param_1,lVar4,0x1b);
                      if (lVar7 == 0) {
                        return 0;
                      }
                      FUN_7ffc3e7e1940(param_1,lVar3,lVar7,2,uVar9,lVar6);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return 0;
                      }
                      lVar3 = FUN_7ffc3eb76c30(param_1,0);
                      if (lVar3 == 0) {
                        return 0;
                      }
                      lVar6 = FUN_7ffc3eb76ce0(param_1,lVar3,4);
                      if (lVar6 == 0) {
                        return 0;
                      }
                      uVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar6);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return 0;
                      }
                      if (uVar8 != 0) {
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                        }
                        if (iVar2 <= (int)uVar11) goto LAB_7ffc3eb69ff0;
                        lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar8,uVar11);
                        uVar9 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652f);
                        if (lVar6 != 0) {
                          lVar7 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x1c);
                          if (lVar7 == 0) {
                            return 0;
                          }
                          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar7,uVar9);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          lVar6 = FUN_7ffc3eb76ce0(param_1,lVar3,2);
                          if (lVar6 == 0) {
                            return 0;
                          }
                          uVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar6);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                          }
                          if (iVar2 < 1) goto LAB_7ffc3eb69ff0;
                          lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,0);
                          if (lVar6 != 0) {
                            cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar4);
                            if (cVar1 == '\0') goto LAB_7ffc3eb6a023;
                            lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x1d);
                            if (lVar4 == 0) {
                              return 0;
                            }
                            uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar4,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return 0;
                            }
                            lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x1e);
                            if (lVar4 == 0) {
                              return 0;
                            }
                            uVar9 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return 0;
                            }
                            if (uVar8 != 0) {
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
                              }
                              if ((int)uVar11 < iVar2) {
                                (**(code **)(*param_1 + 0x570))(param_1,uVar8,uVar11,uVar9);
                                goto LAB_7ffc3eb6929f;
                              }
                              goto LAB_7ffc3eb69ff0;
                            }
                          }
                        }
                      }
                    }
                    goto LAB_7ffc3eb69ecc;
                  }
                }
              }
LAB_7ffc3eb6a023:
              lVar3 = *param_1;
              puVar12 = (undefined *)0x7ffc3eba6033;
              uVar9 = uRam00007ffc3ebc0a58;
              goto LAB_7ffc3eb69ee0;
            }
          }
        }
      }
LAB_7ffc3eb69ecc:
      lVar3 = *param_1;
      puVar12 = &DAT_7ffc3eba6000;
      uVar9 = uRam00007ffc3ebc0a70;
      goto LAB_7ffc3eb69ee0;
    }
LAB_7ffc3eb6929f:
    lVar3 = FUN_7ffc3eb76c30(param_1,0);
    if (lVar3 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,2);
    if (lVar4 == 0) {
      return 0;
    }
    uVar5 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar5 == 0) goto LAB_7ffc3eb69ecc;
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
    }
    if ((int)uVar11 < iVar2) {
      uVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,uVar11);
      return uVar9;
    }
  }
LAB_7ffc3eb69ff0:
  lVar3 = *param_1;
  puVar12 = (undefined *)0x7ffc3eba6019;
  uVar9 = uRam00007ffc3ebc0a98;
LAB_7ffc3eb69ee0:
  (**(code **)(lVar3 + 0x70))(param_1,uVar9,puVar12);
  return 0;
}

/* JNI_dev_krypton_6_a_31 | RVA 0x39a170 | dev/krypton/6.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object; | success */

ulonglong JNI_dev_krypton_6_a_31
                    (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
                    undefined8 param_5,ulonglong param_6)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  ulonglong uVar11;
  
  if (param_6 == 0) goto LAB_7ffc3eb6a615;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb6a5f8;
  lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,0);
  lVar5 = *param_1;
  if (lVar4 != 0) {
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0a10);
    if (cVar1 == '\0') {
LAB_7ffc3eb6a627:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6033;
      uVar6 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb6a2b7;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
    }
    if (iVar3 < 2) goto LAB_7ffc3eb6a5f8;
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,1);
    lVar5 = *param_1;
    if (lVar4 == 0) goto LAB_7ffc3eb6a2b0;
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') goto LAB_7ffc3eb6a627;
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0);
    if (lVar5 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x1f);
    if (lVar4 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar4,uVar2,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    uVar6 = uRam00007ffc3ebc09e8;
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x20);
    if (lVar5 == 0) {
      return 0;
    }
    uVar11 = uVar7;
    uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,uVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
    if (lVar5 == 0) {
      return 0;
    }
    uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar8 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
      }
      if (0 < iVar3) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
        lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6);
        if (lVar5 == 0) {
          return 0;
        }
        uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (1 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
          if (lVar5 == 0) {
            return 0;
          }
          uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,
                                   uVar11 & 0xffffffff00000000,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_4 != 0) {
            lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
            if (lVar5 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
            if (lVar5 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar6);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            return uVar7;
          }
          goto LAB_7ffc3eb6a615;
        }
      }
LAB_7ffc3eb6a5f8:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6019;
      uVar6 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb6a2b7;
    }
LAB_7ffc3eb6a615:
    lVar5 = *param_1;
  }
LAB_7ffc3eb6a2b0:
  puVar10 = &DAT_7ffc3eba6000;
  uVar6 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb6a2b7:
  (**(code **)(lVar5 + 0x70))(param_1,uVar6,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_a_32 | RVA 0x39a650 | dev/krypton/6.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_6_a_32
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3eb6af14;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b40 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc09e0,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0);
    uVar10 = FUN_7ffc3eb76c30(param_1,0);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b40 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b40;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3eb6ab7d:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb6abab:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3eb6ab7d;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3eb6ab7d;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                      if (lVar4 != 0) {
                        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                 uVar19 & 0xffffffff00000000,uVar13);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if ((cVar1 == '\0') &&
                           (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27), lVar4 != 0)
                           ) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,param_5,
                                                   uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                              (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                            FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              return lVar5;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3eb6abb1;
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb6abab;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb6abb1:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba605c);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb6af14:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_6_b_33 | RVA 0x39af30 | dev/krypton/6.b(IJ)I | success */

undefined4
JNI_dev_krypton_6_b_33(longlong *param_1,undefined8 param_2,uint param_3,undefined8 param_4)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  char cVar5;
  int iVar6;
  undefined4 uVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  undefined8 uVar15;
  longlong lVar16;
  uint uVar17;
  byte *pbVar18;
  undefined *puVar19;
  byte abStack_50 [8];
  undefined8 uStack_48;
  
  lVar8 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar8 == 0) {
    return 0;
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,7);
  if (lVar9 == 0) {
    return 0;
  }
  uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar10 == 0) goto LAB_7ffc3eb6c7b6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  if (((int)param_3 < 0) ||
     (uVar17 = param_3 ^ (uint)param_4 & 0x7fff ^ 0x2247, iVar6 <= (int)uVar17)) {
LAB_7ffc3eb6c79c:
    lVar8 = *param_1;
    puVar19 = (undefined *)0x7ffc3eba6019;
    uVar13 = uRam00007ffc3ebc0a98;
    goto LAB_7ffc3eb6c7ca;
  }
  lVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar17);
  if (lVar9 != 0) {
LAB_7ffc3eb6c694:
    lVar8 = FUN_7ffc3eb76c30(param_1,0);
    if (lVar8 == 0) {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,7);
    if (lVar9 == 0) {
      return 0;
    }
    uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (uVar10 != 0) {
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
      }
      if (iVar6 <= (int)uVar17) goto LAB_7ffc3eb6c79c;
      lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar17);
      if (lVar8 != 0) {
        lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
        if (lVar9 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d8be0(param_1,lVar8,lVar9);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') {
          return 0;
        }
        return uVar7;
      }
    }
    goto LAB_7ffc3eb6c7b6;
  }
  uVar10 = (**(code **)(*param_1 + 0x580))(param_1,8);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar10 == 0) goto LAB_7ffc3eb6c7b6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  if (iVar6 < 1) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b0e7;
LAB_7ffc3eb6b0af:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b0af;
LAB_7ffc3eb6b0e7:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b16d;
LAB_7ffc3eb6b132:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b132;
LAB_7ffc3eb6b16d:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b1f3;
LAB_7ffc3eb6b1b8:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b1b8;
LAB_7ffc3eb6b1f3:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b279;
LAB_7ffc3eb6b23e:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b23e;
LAB_7ffc3eb6b279:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b2fe;
LAB_7ffc3eb6b2c3:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b2c3;
LAB_7ffc3eb6b2fe:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b383;
LAB_7ffc3eb6b348:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b348;
LAB_7ffc3eb6b383:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)param_4 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b408;
LAB_7ffc3eb6b3cd:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b3cd;
LAB_7ffc3eb6b408:
    iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)param_4;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 + *(longlong *)(uVar10 & 0xfffffffffffffffc)) =
         abStack_50[0];
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar10,7,1,abStack_50);
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,8);
  if (lVar9 == 0) {
    return 0;
  }
  uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar11 == 0) goto LAB_7ffc3eb6c7b6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  if (iVar6 <= (int)uVar17) goto LAB_7ffc3eb6c79c;
  if (bRam00007ffc3ebc08e5 == 1) {
    pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08ec + (ulonglong)uVar17 * 8 +
                      *(longlong *)(uVar11 & 0xfffffffffffffffc));
  }
  else {
    pbVar18 = abStack_50;
    (**(code **)(*param_1 + 0x660))(param_1,uVar11,uVar17,1,pbVar18);
  }
  uVar13 = *(undefined8 *)pbVar18;
  uVar11 = (**(code **)(*param_1 + 0x580))(param_1,8);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (uVar11 == 0) goto LAB_7ffc3eb6c7b6;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  if (iVar6 < 1) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x38);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08f0) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b611;
LAB_7ffc3eb6b5d7:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,0,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b5d7;
LAB_7ffc3eb6b611:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 2) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x30);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 1 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b69d;
LAB_7ffc3eb6b660:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,1,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b660;
LAB_7ffc3eb6b69d:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 3) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x28);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 2 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b729;
LAB_7ffc3eb6b6ec:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,2,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b6ec;
LAB_7ffc3eb6b729:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 4) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x20);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 3 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b7b5;
LAB_7ffc3eb6b778:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,3,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b778;
LAB_7ffc3eb6b7b5:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 5) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x18);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 4 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b83f;
LAB_7ffc3eb6b802:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,4,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b802;
LAB_7ffc3eb6b83f:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 6) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 0x10);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 5 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b8c9;
LAB_7ffc3eb6b88c:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,5,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b88c;
LAB_7ffc3eb6b8c9:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 7) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)((ulonglong)uVar13 >> 8);
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 6 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
    if (bRam00007ffc3ebc08e5 == 1) goto LAB_7ffc3eb6b953;
LAB_7ffc3eb6b916:
    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,6,1,abStack_50);
    if (bRam00007ffc3ebc08e5 != 1) goto LAB_7ffc3eb6b916;
LAB_7ffc3eb6b953:
    iVar6 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  if (iVar6 < 8) goto LAB_7ffc3eb6c79c;
  abStack_50[0] = (byte)uVar13;
  if (bRam00007ffc3ebc08e5 == 1) {
    *(byte *)((ulonglong)uRam00007ffc3ebc08f0 + 7 + *(longlong *)(uVar11 & 0xfffffffffffffffc)) =
         abStack_50[0];
  }
  else {
    (**(code **)(*param_1 + 0x680))(param_1,uVar11,7,1,abStack_50);
  }
  lVar9 = FUN_7ffc3eb76c30(param_1,0x10);
  if (lVar9 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x11);
  if (lVar12 == 0) {
    return 0;
  }
  lVar12 = FUN_7ffc3e7d1a80(param_1,lVar9,lVar12);
  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar5 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x12);
    if (lVar9 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a20(param_1,lVar12,lVar9);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,1);
    if (lVar9 == 0) {
      return 0;
    }
    uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0958,lVar9,uVar13);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,9);
    if (lVar9 == 0) {
      return 0;
    }
    lVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
    cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar5 != '\0') {
      return 0;
    }
    if (lVar8 != 0) {
      lVar9 = FUN_7ffc3eb76c30(param_1,0x11);
      if (lVar9 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x13);
      if (lVar9 == 0) {
        return 0;
      }
      uVar14 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar13);
      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar5 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0x12);
      if (lVar8 == 0) {
        return 0;
      }
      if (uVar14 == 0) {
        uVar14 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') {
LAB_7ffc3eb6c053:
          lVar8 = *param_1;
          goto LAB_7ffc3eb6c059;
        }
        uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653e);
        lVar8 = FUN_7ffc3eb76c30(param_1,0x13);
        if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(param_1,lVar8,0x14), lVar9 == 0))
        goto LAB_7ffc3eb6c053;
        uVar15 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar9,uVar15);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') goto LAB_7ffc3eb6c053;
        if (uVar14 == 0) goto LAB_7ffc3eb6c039;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar6 < 1) {
LAB_7ffc3eb6c7d4:
          lVar8 = *param_1;
          puVar19 = (undefined *)0x7ffc3eba6019;
          uVar13 = uRam00007ffc3ebc0a98;
          goto LAB_7ffc3eb6c04d;
        }
        (**(code **)(*param_1 + 0x570))(param_1,uVar14,0,uVar15);
        uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba652b);
        lVar8 = FUN_7ffc3eb76c30(param_1,0x14);
        if ((lVar8 == 0) || (lVar9 = FUN_7ffc3eb76c90(param_1,lVar8,0x15), lVar9 == 0))
        goto LAB_7ffc3eb6c053;
        uVar15 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar9,uVar15);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') goto LAB_7ffc3eb6c053;
        if (bRam00007ffc3ebc08e5 == 1) {
          iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar6 < 2) goto LAB_7ffc3eb6c7d4;
        uStack_48 = uVar13;
        (**(code **)(*param_1 + 0x570))(param_1,uVar14,1,uVar15);
        lVar9 = FUN_7ffc3eb76c30(param_1,0x15);
        lVar8 = *param_1;
        if (lVar9 == 0) goto LAB_7ffc3eb6c059;
        lVar8 = (**(code **)(lVar8 + 0xd8))(param_1,lVar9);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 == '\0') {
          uVar13 = (**(code **)(*param_1 + 0x580))(param_1,8);
          cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar5 == '\0') {
            if (lVar8 == 0) goto LAB_7ffc3eb6c039;
            lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x16);
            if (lVar12 != 0) {
              FUN_7ffc3e7dbbc0(param_1,lVar8,lVar9,lVar12,uVar13);
              cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar5 == '\0') {
                if (bRam00007ffc3ebc08e5 == 1) {
                  iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                }
                if (iVar6 < 3) goto LAB_7ffc3eb6c7d4;
                (**(code **)(*param_1 + 0x570))(param_1,uVar14,2,lVar8);
                lVar8 = FUN_7ffc3eb76c30(param_1,0);
                if (lVar8 != 0) {
                  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,9);
                  uVar13 = uStack_48;
                  if (lVar9 == 0) {
                    uVar13 = (**(code **)(*param_1 + 0x78))(param_1);
                    goto LAB_7ffc3eb6c05c;
                  }
                  lVar8 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
                  cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar5 == '\0') {
                    if (lVar8 == 0) goto LAB_7ffc3eb6c039;
                    lVar9 = FUN_7ffc3eb76c30(param_1,0x11);
                    if ((lVar9 != 0) && (lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x17), lVar9 != 0))
                    {
                      FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar13,uVar14);
                      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar5 == '\0') goto LAB_7ffc3eb6bf3e;
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb6c053;
        }
        uVar13 = (**(code **)(*param_1 + 0x78))(param_1);
      }
      else {
        cVar5 = (**(code **)(*param_1 + 0x100))(param_1,uVar14,lVar8);
        if (cVar5 == '\0') {
          lVar8 = *param_1;
          puVar19 = (undefined *)0x7ffc3eba6033;
          uVar13 = uRam00007ffc3ebc0a58;
          goto LAB_7ffc3eb6c7ca;
        }
LAB_7ffc3eb6bf3e:
        lVar9 = FUN_7ffc3eb76c30(param_1,0x17);
        lVar8 = *param_1;
        if (lVar9 != 0) {
          lVar8 = (**(code **)(lVar8 + 0xd8))(param_1,lVar9);
          cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar5 == '\0') {
            if (lVar8 == 0) {
LAB_7ffc3eb6c039:
              lVar8 = *param_1;
              puVar19 = &DAT_7ffc3eba6000;
              uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb6c04d:
              (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar19);
            }
            else {
              lVar12 = FUN_7ffc3eb76c90(param_1,lVar9,0x19);
              if (lVar12 != 0) {
                FUN_7ffc3e7dbbc0(param_1,lVar8,lVar9,lVar12,uVar10);
                cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar5 == '\0') {
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                  }
                  if (iVar6 < 2) goto LAB_7ffc3eb6c7d4;
                  lVar9 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,1);
                  lVar12 = FUN_7ffc3eb76c30(param_1,0x14);
                  if (lVar12 != 0) {
                    if (lVar9 == 0) goto LAB_7ffc3eb6c039;
                    cVar5 = (**(code **)(*param_1 + 0x100))(param_1,lVar9,lVar12);
                    if (cVar5 == '\0') goto LAB_7ffc3eb6c7f1;
                    lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x1a);
                    if (lVar12 != 0) {
                      uVar13 = FUN_7ffc3e7d1a50(param_1,lVar9,lVar12,lVar8);
                      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar5 == '\0') {
                        if (bRam00007ffc3ebc08e5 == 1) {
                          iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                        }
                        if (iVar6 < 1) goto LAB_7ffc3eb6c7d4;
                        lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,0);
                        lVar9 = FUN_7ffc3eb76c30(param_1,0x13);
                        if (lVar9 != 0) {
                          if ((lVar8 != 0) &&
                             (cVar5 = (**(code **)(*param_1 + 0x100))(param_1,lVar8,lVar9),
                             cVar5 == '\0')) {
LAB_7ffc3eb6c7f1:
                            lVar8 = *param_1;
                            puVar19 = (undefined *)0x7ffc3eba6033;
                            uVar13 = uRam00007ffc3ebc0a58;
                            goto LAB_7ffc3eb6c04d;
                          }
                          if (bRam00007ffc3ebc08e5 == 1) {
                            iVar6 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
                          }
                          if (iVar6 < 3) goto LAB_7ffc3eb6c7d4;
                          lVar12 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,2);
                          lVar16 = FUN_7ffc3eb76c30(param_1,0x15);
                          if (lVar16 != 0) {
                            if ((lVar12 != 0) &&
                               (cVar5 = (**(code **)(*param_1 + 0x100))(param_1,lVar12,lVar16),
                               cVar5 == '\0')) goto LAB_7ffc3eb6c7f1;
                            if (lVar8 == 0) goto LAB_7ffc3eb6c039;
                            lVar16 = FUN_7ffc3eb76c90(param_1,lVar9,0x1b);
                            if (lVar16 != 0) {
                              FUN_7ffc3e7e1940(param_1,lVar8,lVar16,2,uVar13,lVar12);
                              cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                              if ((cVar5 == '\0') &&
                                 (lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x1d), lVar9 != 0)) {
                                uVar10 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar9,uVar11);
                                cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                                if (cVar5 == '\0') {
                                  if (uVar10 != 0) {
                                    if (bRam00007ffc3ebc08e5 == 1) {
                                      iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                    }
                                    if (4 < iVar6) {
                                      if (bRam00007ffc3ebc08e5 == 1) {
                                        pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                           *(longlong *)
                                                            (uVar10 & 0xfffffffffffffffc) + 4);
                                      }
                                      else {
                                        pbVar18 = abStack_50;
                                        (**(code **)(*param_1 + 0x640))(param_1,uVar10,4,1,pbVar18);
                                      }
                                      bVar1 = *pbVar18;
                                      if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                        iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                      }
                                      else {
                                        iVar6 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc)
                                                        + (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      if (5 < iVar6) {
                                        if (bRam00007ffc3ebc08e5 == 1) {
                                          pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                             *(longlong *)
                                                              (uVar10 & 0xfffffffffffffffc) + 5);
                                        }
                                        else {
                                          pbVar18 = abStack_50;
                                          (**(code **)(*param_1 + 0x640))
                                                    (param_1,uVar10,5,1,pbVar18);
                                        }
                                        bVar2 = *pbVar18;
                                        if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                          iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                        }
                                        else {
                                          iVar6 = *(int *)(*(longlong *)
                                                            (uVar10 & 0xfffffffffffffffc) +
                                                          (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        if (6 < iVar6) {
                                          if (bRam00007ffc3ebc08e5 == 1) {
                                            pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                               *(longlong *)
                                                                (uVar10 & 0xfffffffffffffffc) + 6);
                                          }
                                          else {
                                            pbVar18 = abStack_50;
                                            (**(code **)(*param_1 + 0x640))
                                                      (param_1,uVar10,6,1,pbVar18);
                                          }
                                          bVar3 = *pbVar18;
                                          if ((bRam00007ffc3ebc08e5 & 1) == 0) {
                                            iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                                          }
                                          else {
                                            iVar6 = *(int *)(*(longlong *)
                                                              (uVar10 & 0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          if (7 < iVar6) {
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              pbVar18 = (byte *)((ulonglong)uRam00007ffc3ebc08f0 +
                                                                 *(longlong *)
                                                                  (uVar10 & 0xfffffffffffffffc) + 7)
                                              ;
                                            }
                                            else {
                                              pbVar18 = abStack_50;
                                              (**(code **)(*param_1 + 0x640))
                                                        (param_1,uVar10,7,1,pbVar18);
                                            }
                                            bVar4 = *pbVar18;
                                            lVar8 = FUN_7ffc3eb76c30(param_1,0);
                                            if (lVar8 == 0) {
                                              return 0;
                                            }
                                            lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,7);
                                            if (lVar9 == 0) {
                                              return 0;
                                            }
                                            uVar10 = (**(code **)(*param_1 + 0x488))
                                                               (param_1,lVar8,lVar9);
                                            cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                                            if (cVar5 != '\0') {
                                              return 0;
                                            }
                                            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7)
                                            ;
                                            if (lVar8 == 0) {
                                              return 0;
                                            }
                                            uVar13 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,
                                                                      lVar8,(uint)CONCAT11(bVar3,
                                                  bVar4) | (uint)bVar2 << 0x10 | (uint)bVar1 << 0x18
                                                  );
                                            cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
                                            if (cVar5 != '\0') {
                                              return 0;
                                            }
                                            if (uVar10 == 0) goto LAB_7ffc3eb6c7b6;
                                            if (bRam00007ffc3ebc08e5 == 1) {
                                              iVar6 = *(int *)(*(longlong *)
                                                                (uVar10 & 0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar6 = (**(code **)(*param_1 + 0x558))
                                                                (param_1,uVar10);
                                            }
                                            if ((int)uVar17 < iVar6) {
                                              (**(code **)(*param_1 + 0x570))
                                                        (param_1,uVar10,uVar17,uVar13);
                                              goto LAB_7ffc3eb6c694;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    goto LAB_7ffc3eb6c79c;
                                  }
                                  goto LAB_7ffc3eb6c7b6;
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
          goto LAB_7ffc3eb6c053;
        }
LAB_7ffc3eb6c059:
        uVar13 = (**(code **)(lVar8 + 0x78))(param_1);
      }
LAB_7ffc3eb6c05c:
      uVar15 = FUN_7ffc3eb76c30(param_1,8);
      cVar5 = (**(code **)(*param_1 + 0x100))(param_1,uVar13,uVar15);
      if (cVar5 == '\0') {
        return 0;
      }
      (**(code **)(*param_1 + 0x88))(param_1);
      lVar8 = FUN_7ffc3eb76c30(param_1,0x16);
      if (lVar8 == 0) {
        return 0;
      }
      lVar9 = (**(code **)(*param_1 + 0xd8))(param_1,lVar8);
      cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar5 != '\0') {
        return 0;
      }
      uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba605c);
      if (lVar9 != 0) {
        lVar12 = FUN_7ffc3eb76c90(param_1,lVar8,0x18);
        if (lVar12 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(param_1,lVar9,lVar8,lVar12,uVar15,uVar13);
        cVar5 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar5 != '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x68))(param_1,lVar9);
        return 0;
      }
    }
  }
LAB_7ffc3eb6c7b6:
  lVar8 = *param_1;
  puVar19 = &DAT_7ffc3eba6000;
  uVar13 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb6c7ca:
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar19);
  return 0;
}

/* JNI_dev_krypton_6_b_34 | RVA 0x39c820 | dev/krypton/6.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I | success */

undefined4
JNI_dev_krypton_6_b_34
          (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
          undefined8 param_5,ulonglong param_6)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  undefined *puVar10;
  
  if (param_6 == 0) goto LAB_7ffc3eb6cd3a;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
  }
  if (iVar3 < 1) goto LAB_7ffc3eb6cd1d;
  lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,0);
  lVar5 = *param_1;
  if (lVar4 != 0) {
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0a10);
    if (cVar1 == '\0') {
LAB_7ffc3eb6cd4c:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6033;
      uVar6 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb6c967;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,8);
    if (lVar5 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7d8be0(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(param_6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                      );
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_6);
    }
    if (iVar3 < 2) goto LAB_7ffc3eb6cd1d;
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,param_6,1);
    lVar5 = *param_1;
    if (lVar4 == 0) goto LAB_7ffc3eb6c960;
    cVar1 = (**(code **)(lVar5 + 0x100))(param_1,lVar4,uRam00007ffc3ebc0958);
    if (cVar1 == '\0') goto LAB_7ffc3eb6cd4c;
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a20(param_1,lVar4,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0);
    if (lVar5 == 0) {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x2c);
    if (lVar4 == 0) {
      return 0;
    }
    uVar2 = FUN_7ffc3e7db1e0(param_1,lVar5,lVar4,uVar2,uVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a10,7);
    if (lVar4 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a10,lVar4,uVar2);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x20);
    if (lVar4 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar6,uVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar8 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar8 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
      }
      if (0 < iVar3) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar8,0,uVar9);
        lVar5 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6);
        if (lVar5 == 0) {
          return 0;
        }
        uVar9 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar8 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar8);
        }
        if (1 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar8,1,uVar9);
          lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
          if (lVar5 == 0) {
            return 0;
          }
          uVar6 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,uVar6,
                                   uVar7 & 0xffffffff00000000,uVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_4 != 0) {
            lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
            if (lVar5 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
            if (lVar5 == 0) {
              return 0;
            }
            FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar6);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            return uVar2;
          }
          goto LAB_7ffc3eb6cd3a;
        }
      }
LAB_7ffc3eb6cd1d:
      lVar5 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6019;
      uVar6 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb6c967;
    }
LAB_7ffc3eb6cd3a:
    lVar5 = *param_1;
  }
LAB_7ffc3eb6c960:
  puVar10 = &DAT_7ffc3eba6000;
  uVar6 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb6c967:
  (**(code **)(lVar5 + 0x70))(param_1,uVar6,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_b_35 | RVA 0x39cd70 | dev/krypton/6.b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_6_b_35
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3eb6d634;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b48 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc0928,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0);
    uVar10 = FUN_7ffc3eb76c30(param_1,0);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6478);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b48 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b48;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3eb6d29d:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb6d2cb:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3eb6d29d;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,3,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3eb6d29d;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                      if (lVar4 != 0) {
                        uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                 uVar19 & 0xffffffff00000000,uVar13);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if ((cVar1 == '\0') &&
                           (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27), lVar4 != 0)
                           ) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,param_5,
                                                   uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                              (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                            FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              return lVar5;
                            }
                          }
                        }
                      }
                      goto LAB_7ffc3eb6d2d1;
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb6d2cb;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb6d2d1:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba605c);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb6d634:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_6_a_36 | RVA 0x39d650 | dev/krypton/6.a(JJ)I | success */

ulonglong JNI_dev_krypton_6_a_36
                    (longlong *param_1,undefined8 param_2,ulonglong param_3,ulonglong param_4)

{
  uint uVar1;
  longlong *plVar2;
  char cVar3;
  byte bVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  uint *puVar12;
  undefined8 uVar13;
  ulonglong uVar14;
  undefined *puVar15;
  undefined4 uVar16;
  uint uVar17;
  undefined8 uStack_98;
  int iStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_78;
  undefined4 uStack_74;
  ulonglong uStack_70;
  uint uStack_5c;
  longlong *plStack_58;
  longlong *plStack_50;
  ulonglong uStack_48;
  
  uStack_78 = 0x30;
  uStack_80 = param_4 << 0x30 | param_4;
  param_3 = uStack_80 ^ param_3;
  uStack_88 = CONCAT44(uStack_88._4_4_,0x2e);
  uVar17 = (uint)(param_3 >> 0x20);
  uVar5 = uVar17 >> 0xe;
  uStack_98 = CONCAT44(uStack_98._4_4_,uVar5);
  uStack_70 = param_4;
  lVar8 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar8 == 0) {
    return 0;
  }
  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,10);
  if (lVar9 == 0) {
    return 0;
  }
  uVar10 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
  cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar3 != '\0') {
    return 0;
  }
  if (uVar10 == 0) {
LAB_7ffc3eb6dfa1:
    lVar8 = *param_1;
    puVar15 = &DAT_7ffc3eba6000;
    uVar13 = uRam00007ffc3ebc0a70;
  }
  else {
    if (bRam00007ffc3ebc08e5 == 1) {
      iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
      ;
    }
    else {
      iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
    }
    if ((int)uVar5 < iVar7) {
      lVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar10,uVar5);
      uVar10 = uStack_98;
      if (lVar8 != 0) {
LAB_7ffc3eb6d761:
        return uVar10 & 0xffffffff;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0);
      if (lVar8 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,0xb);
      if (lVar9 == 0) {
        return 0;
      }
      uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
      cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar3 != '\0') {
        return 0;
      }
      if (uVar11 == 0) goto LAB_7ffc3eb6dfa1;
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
      }
      if ((int)uVar5 < iVar7) {
        plStack_58 = (longlong *)(**(code **)(*param_1 + 0x568))(param_1,uVar11,uVar5);
        if ((plStack_58 != (longlong *)0x0) &&
           (cVar3 = (**(code **)(*param_1 + 0x100))(param_1,plStack_58,uRam00007ffc3ebc09e8),
           cVar3 != '\0')) {
          uStack_48 = uStack_98;
          iVar7 = *(int *)(&UNK_7ffc3eb9b0b4 + (ulonglong)(uVar17 >> 10 & 0x3f) * 4);
          uVar10 = (**(code **)(*param_1 + 0x598))(param_1,6);
          cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar3 != '\0') {
            return 0;
          }
          plStack_50 = (longlong *)(uVar10 & 0xfffffffffffffffc);
          uVar17 = 0;
          lVar8 = 0x23;
          do {
            uVar5 = ((uint)(param_3 >> ((byte)lVar8 & 0x3f)) & 0x7f) - iVar7;
            uStack_80 = 0x7f;
            uVar16 = (undefined4)(uVar10 >> 0x20);
            uStack_88 = CONCAT44(uVar16,(uVar5 >> 0x18 & 0xffffff80) + uVar5);
            if (uVar10 == 0) goto LAB_7ffc3eb6df4b;
            if (bRam00007ffc3ebc08e5 == 1) {
              iVar6 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar6 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
            }
            if (((int)uVar17 < 0) || (iVar6 <= (int)uVar17)) goto LAB_7ffc3eb6df31;
            if (bRam00007ffc3ebc08e5 == 1) {
              *(undefined4 *)
               (*(longlong *)(uVar10 & 0xfffffffffffffffc) +
               (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 4) = (undefined4)uStack_88;
            }
            else {
              (**(code **)(*param_1 + 0x698))(param_1,uVar10,(ulonglong)uVar17,1,&uStack_88);
            }
            plVar2 = plStack_58;
            uVar17 = uVar17 + 1;
            lVar8 = lVar8 + -7;
          } while (lVar8 != -7);
          cVar3 = (**(code **)(*param_1 + 0x100))(param_1,plStack_58,uRam00007ffc3ebc09e8);
          if (cVar3 == '\0') {
            lVar8 = *param_1;
            puVar15 = (undefined *)0x7ffc3eba6033;
            uVar13 = uRam00007ffc3ebc0a58;
          }
          else {
            if (plVar2 != (longlong *)0x0) {
              lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x2d);
              if (lVar8 == 0) {
                return 0;
              }
              uVar11 = FUN_7ffc3e7d1a50(param_1,plVar2);
              cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar3 != '\0') {
                return 0;
              }
              uStack_98._0_4_ = (undefined4)uVar11;
              uStack_98._4_4_ = (undefined4)(uVar11 >> 0x20);
              if (uVar11 != 0) {
                uVar17 = 0;
                plStack_58 = param_1;
                bVar4 = bRam00007ffc3ebc08e5;
                do {
                  if ((bVar4 & 1) == 0) {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                  }
                  else {
                    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  if (iVar7 <= (int)uVar17) {
LAB_7ffc3eb6ddce:
                    lVar8 = FUN_7ffc3eb76c30(param_1,0);
                    if ((lVar8 != 0) &&
                       (lVar9 = FUN_7ffc3eb76ce0(param_1,lVar8,10), uVar10 = uStack_48, lVar9 != 0))
                    {
                      uVar11 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar9);
                      cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar3 == '\0') {
                        uStack_88 = (**(code **)(*param_1 + 0xd8))(param_1,uRam00007ffc3ebc09e8);
                        cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar3 == '\0') {
                          uStack_80 = uStack_88;
                          uStack_78 = (undefined4)uStack_98;
                          uStack_74 = uStack_98._4_4_;
                          if (uStack_88 != 0) {
                            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x2e);
                            if (lVar8 == 0) {
                              return 0;
                            }
                            FUN_7ffc3e7dbbc0(param_1,uStack_80,uRam00007ffc3ebc09e8,lVar8,
                                             CONCAT44(uStack_74,uStack_78));
                            cVar3 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar3 != '\0') {
                              return 0;
                            }
                            if (uVar11 == 0) goto LAB_7ffc3eb6dfa1;
                            if (bRam00007ffc3ebc08e5 == 1) {
                              iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                            }
                            iStack_90 = (int)uVar10;
                            if ((iStack_90 < 0) || (iVar7 <= iStack_90)) goto LAB_7ffc3eb6df6c;
                            (**(code **)(*param_1 + 0x570))
                                      (param_1,uVar11,uVar10 & 0xffffffff,uStack_88);
                            goto LAB_7ffc3eb6d761;
                          }
                          break;
                        }
                      }
                    }
                    return 0;
                  }
                  if (bRam00007ffc3ebc08e5 == 0) {
                    uStack_88 = uVar10;
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                    uStack_88 = CONCAT44(uStack_88._4_4_,iVar7);
                    uVar14 = 0;
                    if (iVar7 != -1 || uVar17 != 0x80000000) goto LAB_7ffc3eb6db7d;
                  }
                  else {
                    iVar7 = *(int *)(*plStack_50 + (ulonglong)uRam00007ffc3ebc08e8);
                    uStack_88 = CONCAT44(uVar16,iVar7);
LAB_7ffc3eb6db7d:
                    uVar14 = (longlong)(int)uVar17 % (longlong)iVar7 & 0xffffffff;
                  }
                  if (uVar10 == 0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                  }
                  if (((int)uVar14 < 0) || (iVar7 <= (int)uVar14)) goto LAB_7ffc3eb6df31;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar12 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + uVar14 * 4 +
                                      *(longlong *)(uVar10 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar12 = &uStack_5c;
                    (**(code **)(*param_1 + 0x658))(param_1,uVar10,uVar14,1,puVar12);
                  }
                  uVar5 = *puVar12;
                  if (uVar5 == 0) goto LAB_7ffc3eb6ddce;
                  uStack_80 = CONCAT44(uStack_98._4_4_,uVar17);
                  uStack_88 = uVar11;
                  if (uVar11 == 0) break;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                    uVar1 = uVar17;
                  }
                  else {
                    iVar7 = (**(code **)(*param_1 + 0x558))(param_1);
                    uVar1 = (uint)uStack_80;
                  }
                  if (((int)uVar1 < 0) || (iVar7 <= (int)uVar1)) goto LAB_7ffc3eb6df31;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    puVar12 = (uint *)((ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar1 * 2 +
                                      *(longlong *)(uStack_88 & 0xfffffffffffffffc));
                  }
                  else {
                    puVar12 = &uStack_5c;
                    (**(code **)(*param_1 + 0x648))(param_1,uStack_88,(ulonglong)uVar1,1,puVar12);
                  }
                  param_1 = plStack_58;
                  uStack_80 = CONCAT44(uVar16,uVar5);
                  uStack_88 = CONCAT44(uStack_88._4_4_,uVar5 & 0xffff ^ (uint)(ushort)*puVar12);
                  if (uVar11 == 0) {
                    lVar8 = *plStack_58;
                    puVar15 = &DAT_7ffc3eba6000;
                    uVar13 = uRam00007ffc3ebc0a70;
                    goto LAB_7ffc3eb6df62;
                  }
                  if (bRam00007ffc3ebc08e5 == 1) {
                    iVar7 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar7 = (**(code **)(*plStack_58 + 0x558))(plStack_58);
                  }
                  bVar4 = bRam00007ffc3ebc08e5;
                  if (((int)uVar17 < 0) || (iVar7 <= (int)uVar17)) goto LAB_7ffc3eb6df31;
                  uStack_5c._0_2_ = (undefined2)uStack_88;
                  if (bRam00007ffc3ebc08e5 == 1) {
                    *(undefined2 *)
                     (*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                     (ulonglong)uRam00007ffc3ebc08f0 + (ulonglong)uVar17 * 2) =
                         (undefined2)uStack_88;
                  }
                  else {
                    (**(code **)(*param_1 + 0x688))(param_1,uVar11,(ulonglong)uVar17,1,&uStack_5c);
                    bVar4 = bRam00007ffc3ebc08e5;
                  }
                  uVar17 = uVar17 + 1;
                } while (uVar11 != 0);
              }
            }
LAB_7ffc3eb6df4b:
            lVar8 = *param_1;
            puVar15 = &DAT_7ffc3eba6000;
            uVar13 = uRam00007ffc3ebc0a70;
          }
          goto LAB_7ffc3eb6df62;
        }
        goto LAB_7ffc3eb6d761;
      }
    }
LAB_7ffc3eb6df6c:
    lVar8 = *param_1;
    puVar15 = (undefined *)0x7ffc3eba6019;
    uVar13 = uRam00007ffc3ebc0a98;
  }
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar15);
  return 0;
LAB_7ffc3eb6df31:
  lVar8 = *param_1;
  puVar15 = (undefined *)0x7ffc3eba6019;
  uVar13 = uRam00007ffc3ebc0a98;
LAB_7ffc3eb6df62:
  (**(code **)(lVar8 + 0x70))(param_1,uVar13,puVar15);
  return 0;
}

/* JNI_dev_krypton_6_a_37 | RVA 0x39dff0 | dev/krypton/6.a()V | success */

void JNI_dev_krypton_6_a_37(longlong *param_1)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  longlong lVar8;
  code *UNRECOVERED_JUMPTABLE;
  undefined *puVar9;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar3 == 0) {
    return;
  }
  lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,0xb);
  if (lVar4 == 0) {
    return;
  }
  uVar5 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return;
  }
  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6550);
  if (uVar5 == 0) {
LAB_7ffc3eb71125:
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar9 = &DAT_7ffc3eba6000;
    uVar6 = uRam00007ffc3ebc0a70;
  }
  else {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
    }
    if (0 < iVar2) {
      (**(code **)(*param_1 + 0x570))(param_1,uVar5,0,uVar6);
      uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba655f);
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
      }
      if (1 < iVar2) {
        (**(code **)(*param_1 + 0x570))(param_1,uVar5,1,uVar6);
        lVar4 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a10,5);
        if (lVar4 == 0) {
          return;
        }
        uVar6 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0a10,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return;
        }
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
        }
        if (2 < iVar2) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar5,2,uVar6);
          lVar4 = FUN_7ffc3eb76ce0(param_1,lVar3,10);
          if (lVar4 == 0) {
            return;
          }
          uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return;
          }
          uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6575);
          if (uVar7 == 0) goto LAB_7ffc3eb71125;
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
          }
          if (2 < iVar2) {
            (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uVar6);
            uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6587);
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
            }
            if (3 < iVar2) {
              (**(code **)(*param_1 + 0x570))(param_1,uVar5,3,uVar6);
              uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6596);
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
              }
              if (4 < iVar2) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar5,4,uVar6);
                lVar8 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0960,0xc);
                if (lVar8 == 0) {
                  return;
                }
                uVar6 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0960,lVar8);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return;
                }
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                }
                if (5 < iVar2) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar5,5,uVar6);
                  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return;
                  }
                  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba65aa);
                  if (uVar7 == 0) goto LAB_7ffc3eb71125;
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                  }
                  if (5 < iVar2) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar7,5,uVar6);
                    uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba65b9);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                    }
                    if (6 < iVar2) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar5,6,uVar6);
                      uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba65c8);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                      }
                      if (7 < iVar2) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar5,7,uVar6);
                        uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba65dc);
                        if (cRam00007ffc3ebc08e5 == '\x01') {
                          iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                          (ulonglong)uRam00007ffc3ebc08e8);
                        }
                        else {
                          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                        }
                        if (8 < iVar2) {
                          (**(code **)(*param_1 + 0x570))(param_1,uVar5,8,uVar6);
                          lVar8 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0a08,0xd);
                          if (lVar8 == 0) {
                            return;
                          }
                          uVar6 = (**(code **)(*param_1 + 0x488))
                                            (param_1,uRam00007ffc3ebc0a08,lVar8);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return;
                          }
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                          }
                          if (9 < iVar2) {
                            (**(code **)(*param_1 + 0x570))(param_1,uVar5,9,uVar6);
                            uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar3,lVar4);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return;
                            }
                            uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba65f0);
                            if (uVar7 == 0) goto LAB_7ffc3eb71125;
                            if (cRam00007ffc3ebc08e5 == '\x01') {
                              iVar2 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                              (ulonglong)uRam00007ffc3ebc08e8);
                            }
                            else {
                              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
                            }
                            if (9 < iVar2) {
                              (**(code **)(*param_1 + 0x570))(param_1,uVar7,9,uVar6);
                              uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6602);
                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                (ulonglong)uRam00007ffc3ebc08e8);
                              }
                              else {
                                iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                              }
                              if (10 < iVar2) {
                                (**(code **)(*param_1 + 0x570))(param_1,uVar5,10,uVar6);
                                uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6610);
                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                  iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                }
                                else {
                                  iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                }
                                if (0xb < iVar2) {
                                  (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xb,uVar6);
                                  uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6613);
                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                    iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                    (ulonglong)uRam00007ffc3ebc08e8);
                                  }
                                  else {
                                    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                  }
                                  if (0xc < iVar2) {
                                    (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xc,uVar6);
                                    uVar6 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6627);
                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                      iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                      (ulonglong)uRam00007ffc3ebc08e8);
                                    }
                                    else {
                                      iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                    }
                                    if (0xd < iVar2) {
                                      (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xd,uVar6);
                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                        (param_1,0x7ffc3eba6636);
                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                                                        (ulonglong)uRam00007ffc3ebc08e8);
                                      }
                                      else {
                                        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                      }
                                      if (0xe < iVar2) {
                                        (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xe,uVar6);
                                        uVar6 = (**(code **)(*param_1 + 0x538))
                                                          (param_1,0x7ffc3eba664c);
                                        if (cRam00007ffc3ebc08e5 == '\x01') {
                                          iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc)
                                                          + (ulonglong)uRam00007ffc3ebc08e8);
                                        }
                                        else {
                                          iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                        }
                                        if (0xf < iVar2) {
                                          (**(code **)(*param_1 + 0x570))(param_1,uVar5,0xf,uVar6);
                                          uVar6 = (**(code **)(*param_1 + 0x538))
                                                            (param_1,0x7ffc3eba664f);
                                          if (cRam00007ffc3ebc08e5 == '\x01') {
                                            iVar2 = *(int *)(*(longlong *)
                                                              (uVar5 & 0xfffffffffffffffc) +
                                                            (ulonglong)uRam00007ffc3ebc08e8);
                                          }
                                          else {
                                            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
                                          }
                                          if (0x10 < iVar2) {
                                            (**(code **)(*param_1 + 0x570))
                                                      (param_1,uVar5,0x10,uVar6);
                                            uVar6 = (**(code **)(*param_1 + 0x538))
                                                              (param_1,0x7ffc3eba665d);
                                            if (cRam00007ffc3ebc08e5 == '\x01') {
                                              iVar2 = *(int *)(*(longlong *)
                                                                (uVar5 & 0xfffffffffffffffc) +
                                                              (ulonglong)uRam00007ffc3ebc08e8);
                                            }
                                            else {
                                              iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5)
                                              ;
                                            }
                                            if (0x11 < iVar2) {
                                              (**(code **)(*param_1 + 0x570))
                                                        (param_1,uVar5,0x11,uVar6);
                                              uVar6 = (**(code **)(*param_1 + 0x538))
                                                                (param_1,0x7ffc3eba6671);
                                              if (cRam00007ffc3ebc08e5 == '\x01') {
                                                iVar2 = *(int *)(*(longlong *)
                                                                  (uVar5 & 0xfffffffffffffffc) +
                                                                (ulonglong)uRam00007ffc3ebc08e8);
                                              }
                                              else {
                                                iVar2 = (**(code **)(*param_1 + 0x558))
                                                                  (param_1,uVar5);
                                              }
                                              if (0x12 < iVar2) {
                                                (**(code **)(*param_1 + 0x570))
                                                          (param_1,uVar5,0x12,uVar6);
                                                uVar6 = (**(code **)(*param_1 + 0x538))
                                                                  (param_1,0x7ffc3eba6682);
                                                if (cRam00007ffc3ebc08e5 == '\x01') {
                                                  iVar2 = *(int *)(*(longlong *)
                                                                    (uVar5 & 0xfffffffffffffffc) +
                                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                }
                                                else {
                                                  iVar2 = (**(code **)(*param_1 + 0x558))
                                                                    (param_1,uVar5);
                                                }
                                                if (0x13 < iVar2) {
                                                  (**(code **)(*param_1 + 0x570))
                                                            (param_1,uVar5,0x13,uVar6);
                                                  uVar6 = (**(code **)(*param_1 + 0x538))
                                                                    (param_1,0x7ffc3eba6696);
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      (uVar5 & 0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x14 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x14,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba66b2);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x15 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x15,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba66cc);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x16 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x16,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba66df);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x17 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x17,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba66ee);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x18 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x18,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba66ff);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x19 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x19,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba671b);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1a < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1a,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6736);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x1b < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x1b,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba674a);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1c < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1c,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba675e);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x1d < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x1d,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6772);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1e < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1e,uVar6);
                                                    lVar8 = FUN_7ffc3eb76ce0(param_1,
                                                  uRam00007ffc3ebc0958,6);
                                                  if (lVar8 == 0) {
                                                    return;
                                                  }
                                                  uVar6 = (**(code **)(*param_1 + 0x488))
                                                                    (param_1,uRam00007ffc3ebc0958,
                                                                     lVar8);
                                                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                                                  if (cVar1 != '\0') {
                                                    return;
                                                  }
                                                  if (cRam00007ffc3ebc08e5 == '\x01') {
                                                    iVar2 = *(int *)(*(longlong *)
                                                                      (uVar5 & 0xfffffffffffffffc) +
                                                                    (ulonglong)uRam00007ffc3ebc08e8)
                                                    ;
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x1f < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x1f,uVar6);
                                                    uVar7 = (**(code **)(*param_1 + 0x488))
                                                                      (param_1,lVar3,lVar4);
                                                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1)
                                                    ;
                                                    if (cVar1 != '\0') {
                                                      return;
                                                    }
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6786);
                                                    if (uVar7 == 0) goto LAB_7ffc3eb71125;
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar7 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar7);
                                                    }
                                                    if (0x1f < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar7,0x1f,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6795);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x20 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x20,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba67a9);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x21 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x21,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba67bd);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x22 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x22,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba67cf);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x23 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x23,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba67e3);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x24 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x24,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba67f7);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x25 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x25,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba680b);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x26 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x26,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba681f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x27 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x27,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6833);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x28 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x28,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6842);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x29 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x29,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6856);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x2a < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x2a,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba686a);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x2b < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x2b,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6882);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x2c < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x2c,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6896);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x2d < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x2d,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba68ab);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x2e < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x2e,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba68c0);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x2f < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x2f,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba68d4);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x30 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x30,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba68e6);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x31 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x31,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba68fb);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x32 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x32,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba690f);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x33 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x33,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6940);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x34 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x34,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6959);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x35 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x35,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba697d);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x36 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x36,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6999);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x37 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x37,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba69bc);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x38 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x38,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba69e0);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x39 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x39,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6a04);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x3a < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x3a,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6a28);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x3b < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x3b,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6a4f);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x3c < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x3c,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6a67);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x3d < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x3d,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6a8c);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x3e < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x3e,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6aba);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x3f < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x3f,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6adf);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x40 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x40,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6af8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x41 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x41,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6b1e);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x42 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x42,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6b42);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x43 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x43,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6b67);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x44 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x44,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6b8b);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x45 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x45,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6bc6);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x46 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x46,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6be6);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x47 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x47,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6c05);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x48 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x48,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6c2b);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x49 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x49,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6c4e);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x4a < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x4a,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6c72);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x4b < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x4b,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6c96);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x4c < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x4c,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6cba);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x4d < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x4d,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6cde);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x4e < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x4e,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6d0a);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x4f < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x4f,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6d2e);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x50 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x50,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6d54);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x51 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x51,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6d7e);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x52 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x52,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6daa);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x53 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x53,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6dcb);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x54 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x54,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6dee);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x55 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x55,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6e12);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x56 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x56,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6e32);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x57 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x57,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6e56);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x58 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x58,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6e75);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x59 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x59,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6e99);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x5a < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x5a,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6eb1);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x5b < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x5b,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6ed1);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x5c < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x5c,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6ef1);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x5d < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x5d,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6f17);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x5e < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x5e,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6f42);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x5f < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x5f,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6f66);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x60 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x60,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6f8a);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x61 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x61,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6fa9);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x62 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x62,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba6fcc);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (99 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,99,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba6fe5);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (100 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,100,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba700b);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x65 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x65,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba702f);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x66 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x66,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba7053);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x67 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x67,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba7078);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x68 < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x68,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba70a1);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x69 < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x69,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba70c6);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x6a < iVar2) {
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x6a,uVar6);
                                                    uVar6 = (**(code **)(*param_1 + 0x538))
                                                                      (param_1,0x7ffc3eba70e8);
                                                    if (cRam00007ffc3ebc08e5 == '\x01') {
                                                      iVar2 = *(int *)(*(longlong *)
                                                                        (uVar5 & 0xfffffffffffffffc)
                                                                      + (ulonglong)
                                                                        uRam00007ffc3ebc08e8);
                                                    }
                                                    else {
                                                      iVar2 = (**(code **)(*param_1 + 0x558))
                                                                        (param_1,uVar5);
                                                    }
                                                    if (0x6b < iVar2) {
                                                      (**(code **)(*param_1 + 0x570))
                                                                (param_1,uVar5,0x6b,uVar6);
                                                      uVar6 = (**(code **)(*param_1 + 0x538))
                                                                        (param_1,0x7ffc3eba710c);
                                                      if (cRam00007ffc3ebc08e5 == '\x01') {
                                                        iVar2 = *(int *)(*(longlong *)
                                                                          (uVar5 & 
                                                  0xfffffffffffffffc) +
                                                  (ulonglong)uRam00007ffc3ebc08e8);
                                                  }
                                                  else {
                                                    iVar2 = (**(code **)(*param_1 + 0x558))
                                                                      (param_1,uVar5);
                                                  }
                                                  if (0x6c < iVar2) {
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb710e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                                                    (**(code **)(*param_1 + 0x570))
                                                              (param_1,uVar5,0x6c,uVar6);
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
    UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x70);
    puVar9 = (undefined *)0x7ffc3eba6019;
    uVar6 = uRam00007ffc3ebc0a98;
  }
                    /* WARNING: Could not recover jumptable at 0x7ffc3eb71111. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,uVar6,puVar9);
  return;
}

/* JNI_dev_krypton_6_b_38 | RVA 0x3a1140 | dev/krypton/6.b(JJ)Ljava/lang/Class; | success */

longlong JNI_dev_krypton_6_b_38
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  ulonglong uVar6;
  longlong lVar7;
  undefined8 uVar8;
  longlong lVar9;
  undefined *puVar10;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x2f);
  if (lVar5 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,lVar4,lVar5,param_3,param_4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76ce0(param_1,lVar4,0xb);
  if (lVar5 == 0) {
    return 0;
  }
  uVar6 = (**(code **)(*param_1 + 0x488))(param_1,lVar4,lVar5);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar6 != 0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
    }
    if ((iVar2 < 0) || (iVar3 <= iVar2)) {
      lVar4 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6019;
      uVar8 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb715e2;
    }
    lVar4 = (**(code **)(*param_1 + 0x568))(param_1,uVar6,iVar2);
    if (lVar4 == 0) {
      return 0;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uRam00007ffc3ebc09e8);
    if (cVar1 == '\0') {
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uRam00007ffc3ebc09a0);
      if (cVar1 != '\0') {
        return lVar4;
      }
      lVar4 = *param_1;
      puVar10 = (undefined *)0x7ffc3eba6033;
      uVar8 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb715e2;
    }
    lVar4 = FUN_7ffc3eb76c30(param_1,0);
    if (lVar4 == 0) {
LAB_7ffc3eb714a6:
      lVar4 = (**(code **)(*param_1 + 0x78))(param_1);
    }
    else {
      lVar7 = FUN_7ffc3eb76ce0(param_1,lVar4,10);
      lVar5 = *param_1;
      if (lVar7 != 0) {
        uVar6 = (**(code **)(lVar5 + 0x488))(param_1,lVar4,lVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (uVar6 == 0) {
LAB_7ffc3eb7148c:
            lVar4 = *param_1;
            puVar10 = &DAT_7ffc3eba6000;
            uVar8 = uRam00007ffc3ebc0a70;
          }
          else {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
            }
            if (iVar2 < iVar3) {
              uVar8 = (**(code **)(*param_1 + 0x568))(param_1,uVar6,iVar2);
              lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x30);
              if (lVar5 != 0) {
                lVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc09a0,lVar5,uVar8);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 == '\0') {
                  lVar9 = FUN_7ffc3eb76ce0(param_1,lVar4,0xb);
                  lVar5 = *param_1;
                  if (lVar9 == 0) goto LAB_7ffc3eb71486;
                  uVar6 = (**(code **)(lVar5 + 0x488))(param_1,lVar4,lVar9);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (uVar6 == 0) goto LAB_7ffc3eb7148c;
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
                    }
                    if (iVar2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar6,iVar2,lVar7);
                      return lVar7;
                    }
                    goto LAB_7ffc3eb7146c;
                  }
                }
              }
              goto LAB_7ffc3eb714a6;
            }
LAB_7ffc3eb7146c:
            lVar4 = *param_1;
            puVar10 = (undefined *)0x7ffc3eba6019;
            uVar8 = uRam00007ffc3ebc0a98;
          }
          (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar10);
        }
        goto LAB_7ffc3eb714a6;
      }
LAB_7ffc3eb71486:
      lVar4 = (**(code **)(lVar5 + 0x78))(param_1);
    }
    uVar8 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar4,uVar8);
    if (cVar1 == '\0') {
      return 0;
    }
    (**(code **)(*param_1 + 0x88))(param_1);
    lVar5 = FUN_7ffc3eb76c30(param_1,0x16);
    if (lVar5 == 0) {
      return 0;
    }
    lVar7 = (**(code **)(*param_1 + 0xd8))(param_1,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (lVar4 != 0) {
      lVar9 = FUN_7ffc3eb76c30(param_1,8);
      if (lVar9 == 0) {
        return 0;
      }
      lVar9 = FUN_7ffc3eb76c90(param_1,lVar9,0x31);
      if (lVar9 == 0) {
        return 0;
      }
      uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar7 != 0) {
        lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x32);
        if (lVar4 == 0) {
          return 0;
        }
        FUN_7ffc3e7dbbc0(param_1,lVar7,lVar5,lVar4,uVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        (**(code **)(*param_1 + 0x68))(param_1,lVar7);
        return 0;
      }
    }
  }
  lVar4 = *param_1;
  puVar10 = &DAT_7ffc3eba6000;
  uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb715e2:
  (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_a_39 | RVA 0x3a1600 | dev/krypton/6.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

longlong JNI_dev_krypton_6_a_39
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  undefined8 uVar9;
  int iVar10;
  undefined8 *puVar11;
  undefined *puStack_50;
  
  puStack_50 = &DAT_7ffc3eba6000;
  puVar11 = (undefined8 *)0x7ffc3ebc0a70;
  if (param_3 != 0) {
    lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x33);
    if (lVar4 == 0) {
      return 0;
    }
    uVar5 = FUN_7ffc3e7d1a50(param_1,param_3,lVar4);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar5 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
      }
      if (iVar2 < 1) {
        return 0;
      }
      puStack_50 = (undefined *)0x7ffc3eba6019;
      iVar10 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
        }
        if (iVar3 <= iVar10) break;
        lVar4 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,iVar10);
        if (lVar4 == 0) {
LAB_7ffc3eb71861:
          puStack_50 = &DAT_7ffc3eba6000;
          puVar11 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eb7187d;
        }
        lVar6 = FUN_7ffc3eb76c30(param_1,0x1b);
        if (lVar6 == 0) {
          return 0;
        }
        lVar7 = FUN_7ffc3eb76c90(param_1,lVar6,0x34);
        if (lVar7 == 0) {
          return 0;
        }
        lVar7 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar7 == 0) goto LAB_7ffc3eb71861;
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
        if (lVar8 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar7,lVar8,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (iVar3 != 0) {
          lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x36);
          if (lVar6 == 0) {
            return 0;
          }
          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          cVar1 = (**(code **)(*param_1 + 0xc0))(param_1,uVar9,param_5);
          if (cVar1 != '\0') {
            return lVar4;
          }
        }
        iVar10 = iVar10 + 1;
        if (iVar2 == iVar10) {
          return 0;
        }
      }
      puVar11 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3eb7187d:
  (**(code **)(*param_1 + 0x70))(param_1,*puVar11,puStack_50);
  return 0;
}

/* JNI_dev_krypton_6_b_40 | RVA 0x3a18b0 | dev/krypton/6.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field; | success */

longlong JNI_dev_krypton_6_b_40
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  int iVar8;
  undefined *puStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar3 == 0) {
    return 0;
  }
  lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x37);
  if (lVar4 != 0) {
    lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,param_3,param_4,param_5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      if (lVar3 != 0) {
        return lVar3;
      }
      if (param_3 == 0) {
        puStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return 0;
        }
        uVar5 = FUN_7ffc3e7d1a50(param_1,param_3,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (uVar5 == 0) {
          return 0;
        }
        if (cVar1 != '\0') {
          return 0;
        }
        puStack_48 = (undefined *)0x7ffc3eba6019;
        iVar8 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) {
            return 0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) break;
          uVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,iVar8);
          lVar3 = FUN_7ffc3eb76c30(param_1,0);
          if (lVar3 == 0) {
            return 0;
          }
          lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x39);
          if (lVar4 == 0) {
            return 0;
          }
          lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,uVar6,param_4,param_5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          iVar8 = iVar8 + 1;
          if (lVar3 != 0) {
            return lVar3;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (**(code **)(*param_1 + 0x70))(param_1,*puVar7,puStack_48);
    }
  }
  return 0;
}

/* JNI_dev_krypton_6_c_41 | RVA 0x3a1b00 | dev/krypton/6.c(JJ)Ljava/lang/reflect/Field; | success */

longlong JNI_dev_krypton_6_c_41
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 uVar9;
  longlong lVar10;
  longlong lVar11;
  longlong lVar12;
  longlong lVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined *puVar16;
  undefined4 uVar17;
  
  lVar5 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x2f);
  if (lVar6 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,lVar5,lVar6,param_3,param_4);
  uVar17 = (undefined4)((ulonglong)param_4 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,0xb);
  if (lVar6 == 0) {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar7 == 0) goto LAB_7ffc3eb7283c;
  if (cRam00007ffc3ebc08e5 == '\x01') {
    iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
  }
  if ((iVar2 < 0) || (iVar3 <= iVar2)) goto LAB_7ffc3eb72822;
  lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
  if (lVar6 == 0) {
    FUN_7ffc3eb76c30(param_1,0x1b);
    return 0;
  }
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8);
  if (cVar1 == '\0') {
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1b);
    if (lVar5 == 0) {
      return 0;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar5);
    if (cVar1 != '\0') {
      return lVar6;
    }
    lVar5 = *param_1;
    puVar16 = (undefined *)0x7ffc3eba6033;
    uVar9 = uRam00007ffc3ebc0a58;
    goto LAB_7ffc3eb72850;
  }
  lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,10);
  if (lVar6 == 0) {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar7 != 0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
    }
    if (iVar3 <= iVar2) {
LAB_7ffc3eb72822:
      lVar5 = *param_1;
      puVar16 = (undefined *)0x7ffc3eba6019;
      uVar9 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb72850;
    }
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
    if (lVar6 != 0) {
      lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3a);
      if (lVar8 == 0) {
        return 0;
      }
      iVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3b);
      if (lVar8 == 0) {
        return 0;
      }
      uVar15 = CONCAT44(uVar17,iVar3);
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,0,uVar15);
      uVar17 = (undefined4)((ulonglong)uVar15 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0x3c);
      if (lVar10 == 0) {
        return 0;
      }
      uVar9 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar10,uVar9,CONCAT44(uVar17,0x24));
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar11 = FUN_7ffc3eb76c90(param_1,lVar5,0x3d);
      if (lVar11 == 0) {
        return 0;
      }
      uVar17 = 0;
      lVar12 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar11,uVar9,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
      if (lVar13 == 0) {
        return 0;
      }
      uVar9 = CONCAT44(uVar17,iVar3 + 1);
      iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar13,8,uVar9);
      uVar17 = (undefined4)((ulonglong)uVar9 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar15 = CONCAT44(uVar17,iVar4);
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar3 + 1,uVar15);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3f);
      if (lVar8 == 0) {
        return 0;
      }
      uVar14 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar4 + 1,uVar15);
      uVar17 = (undefined4)((ulonglong)uVar15 >> 0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar15 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar10,uVar14,CONCAT44(uVar17,0x24));
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar5 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar11,uVar15,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar8 = FUN_7ffc3eb76c30(param_1,0);
      lVar6 = lVar12;
      if (lVar8 == 0) {
        return 0;
      }
      while( true ) {
        lVar10 = FUN_7ffc3eb76c90(param_1,lVar8,0x37);
        if (lVar10 == 0) {
          return 0;
        }
        lVar10 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar10,lVar6,uVar9,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar10 != 0) break;
        if (lVar6 == 0) goto LAB_7ffc3eb7283c;
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
        if (lVar8 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (uVar7 != 0) {
          iVar3 = 0;
          while( true ) {
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (iVar4 <= iVar3) break;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar4 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
            }
            if (iVar4 <= iVar3) goto LAB_7ffc3eb72822;
            uVar15 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar3);
            lVar8 = FUN_7ffc3eb76c30(param_1,0);
            if (lVar8 == 0) {
              return 0;
            }
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar8,0x39);
            if (lVar10 == 0) {
              return 0;
            }
            lVar10 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar10,uVar15,uVar9,lVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            iVar3 = iVar3 + 1;
            if (lVar10 != 0) {
              lVar5 = FUN_7ffc3eb76ce0(param_1,lVar8,0xb);
              if (lVar5 == 0) {
                return 0;
              }
              uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar5);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (uVar7 == 0) goto LAB_7ffc3eb7283c;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
              }
              if (iVar2 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar7,iVar2,lVar10);
                return lVar10;
              }
              goto LAB_7ffc3eb72822;
            }
          }
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
        if (lVar8 == 0) {
          return 0;
        }
        lVar8 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7131);
        if (lVar8 == 0) goto LAB_7ffc3eb7283c;
        lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
        if (lVar10 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar8,lVar10,uVar15);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (iVar3 != 0) {
          lVar6 = FUN_7ffc3eb76c30(param_1,0x1c);
          if (lVar6 == 0) {
            return 0;
          }
          lVar8 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (lVar8 != 0) {
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x42);
            if (lVar10 == 0) {
              return 0;
            }
            FUN_7ffc3e7dbbc0(param_1,lVar8,lVar6,lVar10);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar15 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7142);
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x43);
            if (lVar10 == 0) {
              return 0;
            }
            lVar11 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar10,uVar15);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
              if (lVar13 == 0) {
                return 0;
              }
              uVar15 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar13);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar11 != 0) {
                lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar10,uVar15);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar11 != 0) {
                  lVar12 = FUN_7ffc3eb76c90(param_1,lVar6,0x44);
                  if (lVar12 == 0) {
                    return 0;
                  }
                  lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar12,0x20);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  if (lVar5 != 0) {
                    uVar15 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13);
                    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                    if (cVar1 != '\0') {
                      return 0;
                    }
                    if (lVar11 != 0) {
                      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar10,uVar15);
                      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                      if (cVar1 != '\0') {
                        return 0;
                      }
                      if (lVar5 != 0) {
                        lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar12,0x20);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 != '\0') {
                          return 0;
                        }
                        if (lVar5 != 0) {
                          FUN_7ffc3e7d1a50(param_1,lVar5,lVar10,uVar9);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          lVar5 = FUN_7ffc3eb76c30(param_1,0x16);
                          if (lVar5 == 0) {
                            return 0;
                          }
                          lVar10 = (**(code **)(*param_1 + 0xd8))(param_1,lVar5);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x45);
                          if (lVar6 == 0) {
                            return 0;
                          }
                          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar6);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if (cVar1 != '\0') {
                            return 0;
                          }
                          if (lVar10 != 0) {
                            lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x32);
                            if (lVar6 == 0) {
                              return 0;
                            }
                            FUN_7ffc3e7dbbc0(param_1,lVar10,lVar5,lVar6,uVar9);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 != '\0') {
                              return 0;
                            }
                            (**(code **)(*param_1 + 0x68))(param_1,lVar10);
                            return 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          goto LAB_7ffc3eb7283c;
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x41);
        if (lVar8 == 0) {
          return 0;
        }
        lVar6 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar6 == 0) {
          lVar6 = FUN_7ffc3eb76c30(param_1,0);
          if (lVar6 == 0) {
            return 0;
          }
          lVar8 = FUN_7ffc3eb76c90(param_1,lVar6,0x3d);
          if (lVar8 == 0) {
            return 0;
          }
          lVar6 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar8,0x63c9ee13faf3b,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
        }
        lVar8 = FUN_7ffc3eb76c30(param_1,0);
        if (lVar8 == 0) {
          return 0;
        }
      }
      lVar5 = FUN_7ffc3eb76ce0(param_1,lVar8,0xb);
      if (lVar5 == 0) {
        return 0;
      }
      uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar8,lVar5);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar7 != 0) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
        }
        if (iVar2 < iVar3) {
          (**(code **)(*param_1 + 0x570))(param_1,uVar7,iVar2,lVar10);
          return lVar10;
        }
        goto LAB_7ffc3eb72822;
      }
    }
  }
LAB_7ffc3eb7283c:
  lVar5 = *param_1;
  puVar16 = &DAT_7ffc3eba6000;
  uVar9 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb72850:
  (**(code **)(lVar5 + 0x70))(param_1,uVar9,puVar16);
  return 0;
}

/* JNI_dev_krypton_6_a_42 | RVA 0x3a2860 | dev/krypton/6.a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

longlong JNI_dev_krypton_6_a_42
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5,int param_6,ulonglong param_7)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  longlong lVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  undefined8 uVar12;
  undefined8 *puVar13;
  int iVar14;
  undefined *puStack_68;
  
  puStack_68 = &DAT_7ffc3eba6000;
  puVar13 = (undefined8 *)0x7ffc3ebc0a70;
  if (param_3 != 0) {
    lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x46);
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = FUN_7ffc3e7d1a50(param_1,param_3,lVar5);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar6 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar2 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
      }
      if (iVar2 < 1) {
        return 0;
      }
      puStack_68 = (undefined *)0x7ffc3eba6019;
      iVar14 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar3 = *(int *)(*(longlong *)(uVar6 & 0xfffffffffffffffc) +
                          (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar6);
        }
        if (iVar3 <= iVar14) break;
        lVar5 = (**(code **)(*param_1 + 0x568))(param_1,uVar6,iVar14);
        if (lVar5 == 0) {
LAB_7ffc3eb72c8a:
          puStack_68 = &DAT_7ffc3eba6000;
          puVar13 = (undefined8 *)0x7ffc3ebc0a70;
          goto LAB_7ffc3eb72c98;
        }
        lVar7 = FUN_7ffc3eb76c30(param_1,0x1d);
        if (lVar7 == 0) {
          return 0;
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,lVar7,0x47);
        if (lVar8 == 0) {
          return 0;
        }
        lVar8 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar8 == 0) goto LAB_7ffc3eb72c8a;
        lVar9 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
        if (lVar9 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar8,lVar9,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (iVar3 != 0) {
          lVar8 = FUN_7ffc3eb76c90(param_1,lVar7,0x48);
          if (lVar8 == 0) {
            return 0;
          }
          uVar10 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar8);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          cVar1 = (**(code **)(*param_1 + 0xc0))(param_1,uVar10,param_5);
          if (cVar1 != '\0') {
            lVar7 = FUN_7ffc3eb76c90(param_1,lVar7,0x49);
            if (lVar7 == 0) {
              return 0;
            }
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar7);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (uVar11 == 0) goto LAB_7ffc3eb72c8a;
            if (cRam00007ffc3ebc08e5 == '\x01') {
              iVar3 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                              (ulonglong)uRam00007ffc3ebc08e8);
            }
            else {
              iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
            }
            if (iVar3 == param_6) {
              if (param_6 < 1) {
                return lVar5;
              }
              iVar3 = 0;
              while( true ) {
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(uVar11 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,uVar11);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3eb72c7c;
                uVar10 = (**(code **)(*param_1 + 0x568))(param_1,uVar11,iVar3);
                if (param_7 == 0) goto LAB_7ffc3eb72c8a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar4 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
                }
                if (iVar4 <= iVar3) goto LAB_7ffc3eb72c7c;
                uVar12 = (**(code **)(*param_1 + 0x568))(param_1,param_7,iVar3);
                cVar1 = (**(code **)(*param_1 + 0xc0))(param_1,uVar10,uVar12);
                if (cVar1 == '\0') break;
                iVar3 = iVar3 + 1;
                if (param_6 == iVar3) {
                  return lVar5;
                }
              }
            }
          }
        }
        iVar14 = iVar14 + 1;
        if (iVar14 == iVar2) {
          return 0;
        }
      }
LAB_7ffc3eb72c7c:
      puVar13 = (undefined8 *)0x7ffc3ebc0a98;
    }
  }
LAB_7ffc3eb72c98:
  (**(code **)(*param_1 + 0x70))(param_1,*puVar13,puStack_68);
  return 0;
}

/* JNI_dev_krypton_6_b_43 | RVA 0x3a2cc0 | dev/krypton/6.b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/lang/reflect/Method; | success */

longlong JNI_dev_krypton_6_b_43
                   (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,
                   undefined8 param_5,undefined4 param_6,undefined8 param_7)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  int iVar8;
  undefined *puStack_48;
  
  lVar3 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar3 == 0) {
    return 0;
  }
  lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x4a);
  if (lVar4 != 0) {
    lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,param_3,param_4,param_5,param_6,param_7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 == '\0') {
      if (lVar3 != 0) {
        return lVar3;
      }
      if (param_3 == 0) {
        puStack_48 = &DAT_7ffc3eba6000;
        puVar7 = (undefined8 *)0x7ffc3ebc0a70;
      }
      else {
        lVar3 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
        if (lVar3 == 0) {
          return 0;
        }
        uVar5 = FUN_7ffc3e7d1a50(param_1,param_3,lVar3);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (uVar5 == 0) {
          return 0;
        }
        if (cVar1 != '\0') {
          return 0;
        }
        puStack_48 = (undefined *)0x7ffc3eba6019;
        iVar8 = 0;
        while( true ) {
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) {
            return 0;
          }
          if (cRam00007ffc3ebc08e5 == '\x01') {
            iVar2 = *(int *)(*(longlong *)(uVar5 & 0xfffffffffffffffc) +
                            (ulonglong)uRam00007ffc3ebc08e8);
          }
          else {
            iVar2 = (**(code **)(*param_1 + 0x558))(param_1,uVar5);
          }
          if (iVar2 <= iVar8) break;
          uVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar5,iVar8);
          lVar3 = FUN_7ffc3eb76c30(param_1,0);
          if (lVar3 == 0) {
            return 0;
          }
          lVar4 = FUN_7ffc3eb76c90(param_1,lVar3,0x4b);
          if (lVar4 == 0) {
            return 0;
          }
          lVar3 = FUN_7ffc3e7d1a80(param_1,lVar3,lVar4,uVar6,param_4,param_5,param_6,param_7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          iVar8 = iVar8 + 1;
          if (lVar3 != 0) {
            return lVar3;
          }
        }
        puVar7 = (undefined8 *)0x7ffc3ebc0a98;
      }
      (**(code **)(*param_1 + 0x70))(param_1,*puVar7,puStack_48);
    }
  }
  return 0;
}

/* JNI_dev_krypton_6_d_44 | RVA 0x3a2f40 | dev/krypton/6.d(JJ)Ljava/lang/reflect/Method; | success */

longlong JNI_dev_krypton_6_d_44
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 uVar9;
  longlong lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  longlong lVar13;
  ulonglong uVar14;
  longlong lVar15;
  longlong lVar16;
  uint uVar17;
  uint uVar18;
  int iVar19;
  undefined *puVar20;
  undefined4 uVar21;
  
  lVar5 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x2f);
  if (lVar6 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7db1e0(param_1,lVar5,lVar6,param_3,param_4);
  uVar21 = (undefined4)((ulonglong)param_4 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,0xb);
  if (lVar6 == 0) {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (uVar7 != 0) {
    if (cRam00007ffc3ebc08e5 == '\x01') {
      iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
    }
    else {
      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
    }
    if ((iVar2 < 0) || (iVar3 <= iVar2)) {
LAB_7ffc3eb74181:
      lVar8 = *param_1;
      puVar20 = (undefined *)0x7ffc3eba6019;
      uVar9 = uRam00007ffc3ebc0a98;
      goto LAB_7ffc3eb74199;
    }
    lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
    if (lVar6 == 0) {
      FUN_7ffc3eb76c30(param_1,0x1d);
      return 0;
    }
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uRam00007ffc3ebc09e8);
    if (cVar1 == '\0') {
      lVar5 = FUN_7ffc3eb76c30(param_1,0x1d);
      if (lVar5 == 0) {
        return 0;
      }
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,lVar5);
      if (cVar1 != '\0') {
        return lVar6;
      }
      lVar8 = *param_1;
      puVar20 = (undefined *)0x7ffc3eba6033;
      uVar9 = uRam00007ffc3ebc0a58;
      goto LAB_7ffc3eb74199;
    }
    lVar6 = FUN_7ffc3eb76ce0(param_1,lVar5,10);
    if (lVar6 == 0) {
      return 0;
    }
    uVar7 = (**(code **)(*param_1 + 0x488))(param_1,lVar5,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar7 != 0) {
      if (cRam00007ffc3ebc08e5 == '\x01') {
        iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8
                        );
      }
      else {
        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
      }
      if (iVar3 <= iVar2) goto LAB_7ffc3eb74181;
      lVar6 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar2);
      if (lVar6 != 0) {
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3a);
        if (lVar8 == 0) {
          return 0;
        }
        iVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3b);
        if (lVar8 == 0) {
          return 0;
        }
        uVar11 = CONCAT44(uVar21,iVar3);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,0,uVar11);
        uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0x3c);
        if (lVar10 == 0) {
          return 0;
        }
        uVar9 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar10,uVar9,CONCAT44(uVar21,0x24));
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,lVar5,0x3d);
        if (lVar10 == 0) {
          return 0;
        }
        uVar21 = 0;
        lVar5 = FUN_7ffc3e7d1a80(param_1,lVar5,lVar10,uVar9,0);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
        if (lVar10 == 0) {
          return 0;
        }
        uVar9 = CONCAT44(uVar21,iVar3 + 1);
        iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar10,8,uVar9);
        uVar21 = (undefined4)((ulonglong)uVar9 >> 0x20);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar11 = CONCAT44(uVar21,iVar4);
        uVar9 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar3 + 1,uVar11);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar18 = 0;
        iVar3 = iVar4;
        do {
          uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
          lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
          if (lVar8 == 0) {
            return 0;
          }
          uVar11 = CONCAT44(uVar21,iVar3 + 1);
          iVar3 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8,uVar11);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar18 = uVar18 - 1;
        } while (-1 < iVar3);
        iVar3 = -2 - uVar18;
        lVar8 = *param_1;
        if (-1 < iVar3) {
          uVar7 = (**(code **)(lVar8 + 0x560))(param_1,iVar3,uRam00007ffc3ebc09a0,0);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          uVar17 = 0;
          do {
            uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3e);
            if (lVar8 == 0) {
              return 0;
            }
            iVar19 = iVar4 + 1;
            uVar11 = CONCAT44(uVar21,iVar19);
            iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar8,8,uVar11);
            uVar21 = (undefined4)((ulonglong)uVar11 >> 0x20);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x3b);
            if (lVar8 == 0) {
              return 0;
            }
            uVar12 = CONCAT44(uVar21,iVar4);
            uVar11 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar8,iVar19,uVar12);
            uVar21 = (undefined4)((ulonglong)uVar12 >> 0x20);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0x3c);
            if (lVar8 == 0) {
              return 0;
            }
            uVar12 = FUN_7ffc3e7deca0(param_1,uRam00007ffc3ebc0958,lVar8,uVar11,
                                      CONCAT44(uVar21,0x24));
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar8 = FUN_7ffc3eb76c30(param_1,0);
            if (lVar8 == 0) {
              return 0;
            }
            lVar10 = FUN_7ffc3eb76c90(param_1,lVar8,0x3d);
            if (lVar10 == 0) {
              return 0;
            }
            uVar11 = 0;
            lVar8 = FUN_7ffc3e7d1a80(param_1,lVar8,lVar10,uVar12,0);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if ((int)uVar17 < iVar3) {
              if (uVar7 == 0) goto LAB_7ffc3eb7416b;
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar19 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                 (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
              }
              if (iVar19 <= (int)uVar17) goto LAB_7ffc3eb74181;
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,uVar17,lVar8);
            }
            uVar17 = uVar17 + 1;
            lVar10 = lVar5;
          } while (~uVar18 != uVar17);
LAB_7ffc3eb735f0:
          lVar6 = FUN_7ffc3eb76c30(param_1,0);
          if (lVar6 == 0) {
            return 0;
          }
          lVar13 = FUN_7ffc3eb76c90(param_1,lVar6,0x4a);
          if (lVar13 == 0) {
            return 0;
          }
          lVar13 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar13,lVar10,uVar9,lVar8,iVar3,uVar7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (lVar13 != 0) {
            lVar5 = FUN_7ffc3eb76ce0(param_1,lVar6,0xb);
            if (lVar5 == 0) {
              return 0;
            }
            lVar8 = *param_1;
LAB_7ffc3eb73b6b:
            uVar7 = (**(code **)(lVar8 + 0x488))(param_1,lVar6,lVar5);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (uVar7 != 0) {
              if (cRam00007ffc3ebc08e5 == '\x01') {
                iVar3 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) +
                                (ulonglong)uRam00007ffc3ebc08e8);
              }
              else {
                iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
              }
              if (iVar2 < iVar3) {
                (**(code **)(*param_1 + 0x570))(param_1,uVar7,iVar2,lVar13);
                return lVar13;
              }
              goto LAB_7ffc3eb74181;
            }
            goto LAB_7ffc3eb7416b;
          }
          if (lVar10 != 0) {
            lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
            if (lVar6 == 0) {
              return 0;
            }
            lVar6 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar6);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7131);
            if (lVar6 != 0) {
              lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
              if (lVar13 == 0) {
                return 0;
              }
              iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar13,uVar11);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              lVar15 = lVar5;
              if (iVar4 == 0) goto code_r0x7ffc3eb7372b;
              goto joined_r0x7ffc3eb737ed;
            }
          }
          goto LAB_7ffc3eb7416b;
        }
        puVar20 = (undefined *)0x7ffc3eba6048;
        uVar9 = uRam00007ffc3ebc0a80;
        goto LAB_7ffc3eb74199;
      }
    }
  }
  goto LAB_7ffc3eb7416b;
code_r0x7ffc3eb7372b:
  lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x41);
  if (lVar6 == 0) {
    return 0;
  }
  lVar10 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar10 == 0) goto code_r0x7ffc3eb73779;
  goto LAB_7ffc3eb735f0;
code_r0x7ffc3eb73779:
  lVar6 = FUN_7ffc3eb76c30(param_1,0);
  if (lVar6 == 0) {
    return 0;
  }
  lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x3d);
  if (lVar10 == 0) {
    return 0;
  }
  FUN_7ffc3e7d1a80(param_1,lVar6,lVar10,0x63c9ee13faf3b,0);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
joined_r0x7ffc3eb737ed:
  do {
    if (lVar15 == 0) goto LAB_7ffc3eb7416b;
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x38);
    if (lVar6 == 0) {
      return 0;
    }
    uVar14 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (uVar14 != 0) {
      iVar4 = 0;
      while( true ) {
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar19 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar19 <= iVar4) break;
        if (cRam00007ffc3ebc08e5 == '\x01') {
          iVar19 = *(int *)(*(longlong *)(uVar14 & 0xfffffffffffffffc) +
                           (ulonglong)uRam00007ffc3ebc08e8);
        }
        else {
          iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar14);
        }
        if (iVar19 <= iVar4) goto LAB_7ffc3eb74181;
        uVar11 = (**(code **)(*param_1 + 0x568))(param_1,uVar14,iVar4);
        lVar6 = FUN_7ffc3eb76c30(param_1,0);
        if (lVar6 == 0) {
          return 0;
        }
        lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x4b);
        if (lVar10 == 0) {
          return 0;
        }
        lVar13 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar10,uVar11,uVar9,lVar8,iVar3,uVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        iVar4 = iVar4 + 1;
        if (lVar13 != 0) {
          lVar5 = FUN_7ffc3eb76ce0(param_1,lVar6,0xb);
          if (lVar5 == 0) {
            return 0;
          }
          lVar8 = *param_1;
          goto LAB_7ffc3eb73b6b;
        }
      }
    }
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return 0;
    }
    lVar6 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7131);
    if (lVar6 == 0) goto LAB_7ffc3eb7416b;
    lVar10 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x35);
    if (lVar10 == 0) {
      return 0;
    }
    iVar4 = FUN_7ffc3e7d8be0(param_1,lVar6,lVar10,uVar11);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (iVar4 != 0) {
      lVar6 = FUN_7ffc3eb76c30(param_1,0x1c);
      if (lVar6 == 0) {
        return 0;
      }
      lVar10 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar10 == 0) goto LAB_7ffc3eb7416b;
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar6,0x42);
      if (lVar13 == 0) {
        return 0;
      }
      FUN_7ffc3e7dbbc0(param_1,lVar10,lVar6,lVar13);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba715b);
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar6,0x43);
      if (lVar13 == 0) {
        return 0;
      }
      lVar15 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar13,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar16 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
      if (lVar16 == 0) {
        return 0;
      }
      uVar11 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar16);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar15 == 0) goto LAB_7ffc3eb7416b;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar13,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3eb7416b;
      lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x44);
      if (lVar6 == 0) {
        return 0;
      }
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6,0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar8 == 0) goto LAB_7ffc3eb7416b;
      uVar11 = FUN_7ffc3e7d1a50(param_1,lVar8,lVar16);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3eb7416b;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13,uVar11);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3eb7416b;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6,0x20);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3eb7416b;
      lVar5 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar13,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar5 == 0) goto LAB_7ffc3eb7416b;
      FUN_7ffc3e7d1a50(param_1,lVar5,lVar6,0x28);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (uVar18 == 0xfffffffe) goto LAB_7ffc3eb73ec2;
      if (uVar7 == 0) goto LAB_7ffc3eb7416b;
      iVar2 = 1;
      if (1 < iVar3) {
        iVar2 = iVar3;
      }
      iVar4 = 0;
      break;
    }
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x41);
    if (lVar6 == 0) {
      return 0;
    }
    lVar15 = FUN_7ffc3e7d1a50(param_1,lVar15,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    if (lVar15 == 0) {
      lVar6 = FUN_7ffc3eb76c30(param_1,0);
      if (lVar6 == 0) {
        return 0;
      }
      lVar10 = FUN_7ffc3eb76c90(param_1,lVar6,0x3d);
      if (lVar10 == 0) {
        return 0;
      }
      lVar15 = FUN_7ffc3e7d1a80(param_1,lVar6,lVar10,0x63c9ee13faf3b,0);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
    }
  } while( true );
  while( true ) {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,uVar7,iVar4);
    if (lVar5 == 0) goto LAB_7ffc3eb7416b;
    lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
    if (lVar6 == 0) {
      return 0;
    }
    uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1c);
    if (lVar5 == 0) {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x43);
    if (lVar5 == 0) {
      return 0;
    }
    FUN_7ffc3e7d1a50(param_1,lVar10,lVar5,uVar9);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    iVar4 = iVar4 + 1;
    if (iVar4 < iVar3) {
      uVar9 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7175);
      FUN_7ffc3e7d1a50(param_1,lVar10,lVar5,uVar9);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
    }
    if (iVar2 == iVar4) break;
    if (cRam00007ffc3ebc08e5 == '\0') {
      iVar19 = (**(code **)(*param_1 + 0x558))(param_1,uVar7);
    }
    else {
      iVar19 = *(int *)(*(longlong *)(uVar7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
      ;
    }
    if (iVar19 <= iVar4) goto LAB_7ffc3eb74181;
  }
LAB_7ffc3eb73ec2:
  lVar5 = FUN_7ffc3eb76c30(param_1,0x1c);
  if (lVar5 == 0) {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x44);
  if (lVar6 == 0) {
    return 0;
  }
  FUN_7ffc3e7d1a50(param_1,lVar10,lVar6,0x29);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar6 == 0) {
    return 0;
  }
  lVar8 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x45);
  if (lVar5 == 0) {
    return 0;
  }
  uVar9 = FUN_7ffc3e7d1a50(param_1,lVar10,lVar5);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar8 != 0) {
    lVar5 = FUN_7ffc3eb76c90(param_1,lVar6,0x32);
    if (lVar5 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar8,lVar6,lVar5,uVar9);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    (**(code **)(*param_1 + 0x68))(param_1,lVar8);
    return 0;
  }
LAB_7ffc3eb7416b:
  lVar8 = *param_1;
  puVar20 = &DAT_7ffc3eba6000;
  uVar9 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb74199:
  (**(code **)(lVar8 + 0x70))(param_1,uVar9,puVar20);
  return 0;
}

/* JNI_dev_krypton_6_a_45 | RVA 0x3a41c0 | dev/krypton/6.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;JJ)Ljava/lang/invoke/MethodHandle; | success */

/* WARNING: Type propagation algorithm not settling */

undefined8
JNI_dev_krypton_6_a_45
          (longlong *param_1,undefined8 param_2,longlong param_3,undefined8 param_4,longlong param_5
          ,longlong param_6,undefined8 param_7,undefined8 param_8)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  longlong lVar13;
  longlong lVar14;
  undefined8 uVar15;
  undefined *puVar16;
  undefined4 uVar17;
  
  if (param_5 == 0) goto LAB_7ffc3eb74fcc;
  lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e8,0x4c);
  if (lVar4 == 0) {
    return 0;
  }
  iVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar4,0);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (((iVar2 - 0x24U < 0x30) && ((0x900000000001U >> ((ulonglong)(iVar2 - 0x24U) & 0x3f) & 1) != 0)
      ) || (iVar2 == 0xfb)) {
    lVar4 = FUN_7ffc3eb76c30(param_1,0);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x4d), lVar5 == 0))
    goto LAB_7ffc3eb7496d;
    lVar4 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar5,param_7,param_8);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') goto LAB_7ffc3eb7496d;
    if (lVar4 == 0) goto LAB_7ffc3eb749c7;
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1b);
    if ((lVar5 != 0) && (lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x4e), lVar6 != 0)) {
      uVar7 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c90(param_1,lVar5,0x34), lVar6 != 0)) {
        uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if ((cVar1 == '\0') && (lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x36), lVar5 != 0)) {
          uVar9 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar5);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            if (iVar2 == 0x53) {
              if (param_3 == 0) goto LAB_7ffc3eb749c7;
              uVar15 = 0x50;
            }
            else if (iVar2 == 0x50) {
              if (param_3 == 0) goto LAB_7ffc3eb749c7;
              uVar15 = 0x51;
            }
            else if (iVar2 == 0x24) {
              if (param_3 == 0) {
LAB_7ffc3eb749c7:
                (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
                goto LAB_7ffc3eb749e1;
              }
              uVar15 = 0x4f;
            }
            else {
              if (param_3 == 0) goto LAB_7ffc3eb749c7;
              uVar15 = 0x52;
            }
            lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a90,uVar15);
            if (lVar5 == 0) goto LAB_7ffc3eb749e1;
            uVar7 = FUN_7ffc3e7d1a50(param_1,param_3,lVar5,uVar7,uVar8,uVar9);
            uVar17 = (undefined4)((ulonglong)uVar8 >> 0x20);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') goto LAB_7ffc3eb749e1;
            lVar5 = 0;
LAB_7ffc3eb746ac:
            if (param_6 == 0) {
              (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eb74a76:
              lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
              uVar7 = FUN_7ffc3eb76c30(param_1,8);
              cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
            }
            else {
              lVar6 = FUN_7ffc3eb76c30(param_1,0x19);
              if ((lVar6 == 0) || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x24), lVar6 == 0))
              goto LAB_7ffc3eb74a76;
              iVar2 = FUN_7ffc3e7d8be0(param_1,param_6,lVar6);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                uVar10 = (**(code **)(*param_1 + 0x560))(param_1,2,uRam00007ffc3ebc09a0,0);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if ((cVar1 == '\0') &&
                   (lVar6 = FUN_7ffc3eb76ce0(param_1,uRam00007ffc3ebc0958,6), lVar6 != 0)) {
                  uVar8 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar6);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 == '\0') {
                    if (uVar10 == 0) {
                      lVar6 = *param_1;
                      puVar16 = &DAT_7ffc3eba6000;
                      uVar7 = uRam00007ffc3ebc0a70;
                    }
                    else {
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                      }
                      if (0 < iVar3) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar10,0,uVar8);
                        uVar8 = (**(code **)(*param_1 + 0x488))(param_1,uRam00007ffc3ebc0958,lVar6);
                        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                        if (cVar1 == '\0') {
                          if (cRam00007ffc3ebc08e5 == '\x01') {
                            iVar3 = *(int *)(*(longlong *)(uVar10 & 0xfffffffffffffffc) +
                                            (ulonglong)uRam00007ffc3ebc08e8);
                          }
                          else {
                            iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar10);
                          }
                          if (iVar3 < 2) goto LAB_7ffc3eb749aa;
                          (**(code **)(*param_1 + 0x570))(param_1,uVar10,1,uVar8);
                          lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x21);
                          if (lVar6 != 0) {
                            uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar6,uVar7,
                                                     CONCAT44(uVar17,iVar2 + -2),uVar10);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if (cVar1 == '\0') {
                              return uVar7;
                            }
                          }
                        }
                        goto LAB_7ffc3eb74ac1;
                      }
LAB_7ffc3eb749aa:
                      lVar6 = *param_1;
                      puVar16 = (undefined *)0x7ffc3eba6019;
                      uVar7 = uRam00007ffc3ebc0a98;
                    }
                    (**(code **)(lVar6 + 0x70))(param_1,uVar7,puVar16);
                  }
                }
              }
LAB_7ffc3eb74ac1:
              lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
              uVar7 = FUN_7ffc3eb76c30(param_1,8);
              cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
            }
            goto joined_r0x7ffc3eb74a4c;
          }
        }
      }
    }
LAB_7ffc3eb749e1:
    lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
    uVar7 = FUN_7ffc3eb76c30(param_1,8);
    cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
    lVar5 = 0;
    if (cVar1 == '\0') {
      return 0;
    }
  }
  else {
    lVar4 = FUN_7ffc3eb76c30(param_1,0);
    if ((lVar4 == 0) || (lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x53), lVar5 == 0)) {
LAB_7ffc3eb7496d:
      lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
      uVar7 = FUN_7ffc3eb76c30(param_1,8);
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
      lVar5 = 0;
      if (cVar1 == '\0') {
        return 0;
      }
    }
    else {
      lVar5 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar5,param_7,param_8);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') goto LAB_7ffc3eb7496d;
      if (lVar5 == 0) {
        (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
LAB_7ffc3eb74b1b:
        lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
        uVar7 = FUN_7ffc3eb76c30(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
        lVar4 = 0;
joined_r0x7ffc3eb74a4c:
        if (cVar1 == '\0') {
          return 0;
        }
        goto LAB_7ffc3eb74b51;
      }
      lVar4 = FUN_7ffc3eb76c30(param_1,0x1d);
      if ((lVar4 == 0) || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x54), lVar6 == 0))
      goto LAB_7ffc3eb74b1b;
      uVar7 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 != '\0') || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x47), lVar6 == 0))
      goto LAB_7ffc3eb74b1b;
      uVar8 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 != '\0') || (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x48), lVar6 == 0))
      goto LAB_7ffc3eb74b1b;
      uVar9 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 != '\0') || (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x49), lVar4 == 0)) {
LAB_7ffc3eb74a1c:
        lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
        uVar7 = FUN_7ffc3eb76c30(param_1,8);
        cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
        lVar4 = 0;
        goto joined_r0x7ffc3eb74a4c;
      }
      uVar15 = FUN_7ffc3e7d1a50(param_1,lVar5,lVar4);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if ((cVar1 != '\0') ||
         ((lVar4 = FUN_7ffc3eb76c30(param_1,0x19), lVar4 == 0 ||
          (lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x55), lVar6 == 0)))) goto LAB_7ffc3eb74a1c;
      uVar9 = FUN_7ffc3e7d1a80(param_1,lVar4,lVar6,uVar9,uVar15);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') goto LAB_7ffc3eb74a1c;
      if (iVar2 == 0xf3) {
        if (param_3 == 0) goto LAB_7ffc3eb74fe8;
        uVar15 = 0x57;
LAB_7ffc3eb748f6:
        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a90,uVar15);
joined_r0x7ffc3eb74929:
        if (lVar4 != 0) {
          uVar7 = FUN_7ffc3e7d1a50(param_1,param_3,lVar4,uVar7,uVar8,uVar9);
          uVar17 = (undefined4)((ulonglong)uVar8 >> 0x20);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 == '\0') {
            lVar4 = 0;
            goto LAB_7ffc3eb746ac;
          }
        }
      }
      else {
        if (iVar2 == 0xa3) {
          if (param_3 != 0) {
            uVar15 = 0x56;
            goto LAB_7ffc3eb748f6;
          }
        }
        else if (param_3 != 0) {
          lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a90,0x58);
          goto joined_r0x7ffc3eb74929;
        }
LAB_7ffc3eb74fe8:
        (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
      }
      lVar6 = (**(code **)(*param_1 + 0x78))(param_1);
      uVar7 = FUN_7ffc3eb76c30(param_1,8);
      cVar1 = (**(code **)(*param_1 + 0x100))(param_1,lVar6,uVar7);
      if (cVar1 == '\0') {
        return 0;
      }
    }
    lVar4 = 0;
  }
LAB_7ffc3eb74b51:
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar11 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar11 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar11);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 == 0) goto LAB_7ffc3eb74fcc;
  lVar13 = FUN_7ffc3eb76c90(param_1,lVar11,0x28);
  if (lVar13 == 0) {
    return 0;
  }
  FUN_7ffc3e7dbbc0(param_1,lVar12,lVar11,lVar13);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar6 == 0) goto LAB_7ffc3eb74fcc;
  lVar13 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09e0,0x59);
  if (lVar13 == 0) {
    return 0;
  }
  lVar13 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar13);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar13 == 0) goto LAB_7ffc3eb74fcc;
  lVar14 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc09a0,0x40);
  if (lVar14 == 0) {
    return 0;
  }
  uVar7 = FUN_7ffc3e7d1a50(param_1,lVar13,lVar14);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar11 = FUN_7ffc3eb76c90(param_1,lVar11,0x29);
  if (lVar11 == 0) {
    return 0;
  }
  lVar13 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar11,uVar7);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  uVar7 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
  if (lVar13 == 0) goto LAB_7ffc3eb74fcc;
  lVar11 = FUN_7ffc3e7d1a50(param_1,lVar13,lVar11,uVar7);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar4 == 0) {
    if (lVar5 != 0) {
      lVar4 = FUN_7ffc3eb76c30(param_1,0x1d);
      if (lVar4 == 0) {
        return 0;
      }
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar4,0x5b);
      lVar4 = lVar5;
      goto joined_r0x7ffc3eb74d80;
    }
    uVar7 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba7178);
  }
  else {
    lVar5 = FUN_7ffc3eb76c30(param_1,0x1b);
    if (lVar5 == 0) {
      return 0;
    }
    lVar13 = FUN_7ffc3eb76c90(param_1,lVar5,0x5a);
joined_r0x7ffc3eb74d80:
    if (lVar13 == 0) {
      return 0;
    }
    uVar7 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar13);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
  }
  if (lVar11 != 0) {
    lVar4 = FUN_7ffc3eb76c30(param_1,0x1a);
    if (lVar4 == 0) {
      return 0;
    }
    lVar5 = FUN_7ffc3eb76c90(param_1,lVar4,0x29);
    if (lVar5 == 0) {
      return 0;
    }
    lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar5,uVar7);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar7 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar11 != 0) {
      lVar11 = FUN_7ffc3e7d1a50(param_1,lVar11,lVar5,uVar7);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      lVar13 = FUN_7ffc3eb76c30(param_1,8);
      if (lVar13 == 0) {
        return 0;
      }
      lVar13 = FUN_7ffc3eb76c90(param_1,lVar13,0x31);
      if (lVar13 == 0) {
        return 0;
      }
      uVar7 = FUN_7ffc3e7d1a50(param_1,lVar6,lVar13);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar11 != 0) {
        FUN_7ffc3e7d1a50(param_1,lVar11,lVar5,uVar7);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76c30(param_1,0x16);
        if (lVar5 == 0) {
          return 0;
        }
        lVar6 = (**(code **)(*param_1 + 0xd8))(param_1,lVar5);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x2b);
        if (lVar4 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (lVar6 != 0) {
          lVar4 = FUN_7ffc3eb76c90(param_1,lVar5,0x32);
          if (lVar4 == 0) {
            return 0;
          }
          FUN_7ffc3e7dbbc0(param_1,lVar6,lVar5,lVar4,uVar7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          (**(code **)(*param_1 + 0x68))(param_1,lVar6);
          return 0;
        }
      }
    }
  }
LAB_7ffc3eb74fcc:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

/* JNI_dev_krypton_6_a_46 | RVA 0x3a5040 | dev/krypton/6.a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object; | success */

undefined8
JNI_dev_krypton_6_a_46
          (longlong *param_1,undefined8 param_2,undefined8 param_3,longlong param_4,
          undefined8 param_5,undefined8 param_6,ulonglong param_7)

{
  char cVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  longlong lVar9;
  undefined *puVar10;
  undefined4 uVar11;
  undefined8 uVar12;
  
  if (param_7 == 0) goto LAB_7ffc3eb75483;
  if (bRam00007ffc3ebc08e5 == 1) {
    iVar3 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
LAB_7ffc3eb750c1:
    iVar2 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8);
  }
  else {
    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
    if ((bRam00007ffc3ebc08e5 & 1) != 0) goto LAB_7ffc3eb750c1;
    iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
  }
  if ((iVar3 < 2) || (iVar2 <= iVar3 + -2)) {
LAB_7ffc3eb75466:
    lVar9 = *param_1;
    puVar10 = (undefined *)0x7ffc3eba6019;
    uVar7 = uRam00007ffc3ebc0a98;
  }
  else {
    lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_7);
    lVar9 = *param_1;
    if (lVar5 != 0) {
      cVar1 = (**(code **)(lVar9 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
      if (cVar1 == '\0') {
LAB_7ffc3eb75495:
        lVar9 = *param_1;
        puVar10 = (undefined *)0x7ffc3eba6033;
        uVar7 = uRam00007ffc3ebc0a58;
        goto LAB_7ffc3eb751d5;
      }
      lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0958,0);
      if (lVar6 == 0) {
        return 0;
      }
      uVar7 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (bRam00007ffc3ebc08e5 == 1) {
        iVar2 = *(int *)(*(longlong *)(param_7 & 0xfffffffffffffffc) +
                        (ulonglong)uRam00007ffc3ebc08e8);
      }
      else {
        iVar2 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
      }
      if (iVar2 < iVar3) goto LAB_7ffc3eb75466;
      lVar5 = (**(code **)(*param_1 + 0x568))(param_1,param_7,iVar3 + -1);
      lVar9 = *param_1;
      if (lVar5 != 0) {
        cVar1 = (**(code **)(lVar9 + 0x100))(param_1,lVar5,uRam00007ffc3ebc0958);
        if (cVar1 == '\0') goto LAB_7ffc3eb75495;
        uVar8 = FUN_7ffc3e7d1a20(param_1,lVar5,lVar6);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar9 = FUN_7ffc3eb76c30(param_1,0);
        if (lVar9 == 0) {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76c90(param_1,lVar9,0x5c);
        if (lVar5 == 0) {
          return 0;
        }
        uVar12 = param_6;
        lVar9 = FUN_7ffc3e7d1a80(param_1,lVar9,lVar5,param_3,param_4,param_5,param_6,uVar7,uVar8);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        lVar5 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27);
        if (lVar5 == 0) {
          return 0;
        }
        uVar7 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar5,lVar9,param_6,param_5,uVar12,
                                 uVar7,uVar8);
        uVar11 = (undefined4)((ulonglong)param_6 >> 0x20);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        if (param_4 != 0) {
          lVar5 = FUN_7ffc3eb76c30(param_1,0x18);
          if (lVar5 == 0) {
            return 0;
          }
          lVar5 = FUN_7ffc3eb76c90(param_1,lVar5,0x22);
          if (lVar5 == 0) {
            return 0;
          }
          FUN_7ffc3e7e1940(param_1,param_4,lVar5,uVar7);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          lVar5 = FUN_7ffc3eb76c30(param_1,0x12);
          if (lVar5 == 0) {
            return 0;
          }
          if (bRam00007ffc3ebc08e5 == 1) {
            uVar4 = *(undefined4 *)
                     (*(longlong *)(param_7 & 0xfffffffffffffffc) + (ulonglong)uRam00007ffc3ebc08e8)
            ;
          }
          else {
            uVar4 = (**(code **)(*param_1 + 0x558))(param_1,param_7);
          }
          if (lVar9 != 0) {
            lVar6 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x5d);
            if (lVar6 == 0) {
              return 0;
            }
            lVar5 = FUN_7ffc3e7d1a50(param_1,lVar9,lVar6,lVar5,CONCAT44(uVar11,uVar4));
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            lVar9 = *param_1;
            if (lVar5 != 0) {
              uVar7 = (**(code **)(lVar9 + 0x560))(param_1,1,uRam00007ffc3ebc09e0,0);
              (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,param_7);
              uVar7 = FUN_7ffc3e7d1a50(param_1,lVar5,uRam00007ffc3ebc0a40,uVar7);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              return uVar7;
            }
            goto LAB_7ffc3eb751ce;
          }
        }
LAB_7ffc3eb75483:
        lVar9 = *param_1;
      }
    }
LAB_7ffc3eb751ce:
    puVar10 = &DAT_7ffc3eba6000;
    uVar7 = uRam00007ffc3ebc0a70;
  }
LAB_7ffc3eb751d5:
  (**(code **)(lVar9 + 0x70))(param_1,uVar7,puVar10);
  return 0;
}

/* JNI_dev_krypton_6_c_47 | RVA 0x3a54c0 | dev/krypton/6.c(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; | success */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong JNI_dev_krypton_6_c_47
                   (longlong *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   longlong param_5)

{
  char cVar1;
  undefined4 uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined *puVar17;
  undefined4 uVar20;
  undefined8 uVar18;
  ulonglong uVar19;
  
  lVar4 = FUN_7ffc3eb76c30(param_1,0x18);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar5 == 0) goto LAB_7ffc3eb75df7;
  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x23);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = param_5;
  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,param_5);
  uVar20 = (undefined4)((ulonglong)lVar12 >> 0x20);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (_DAT_7ffc3ebc0b50 == 0) {
    uVar7 = (**(code **)(*param_1 + 0x560))(param_1,5,uRam00007ffc3ebc09a0,0);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,0,uRam00007ffc3ebc0a90);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x18);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,1,uVar8);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,2,uRam00007ffc3ebc09e8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x19);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,3,uVar8);
    uVar8 = FUN_7ffc3eb76c30(param_1,0x12);
    (**(code **)(*param_1 + 0x570))(param_1,uVar7,4,uVar8);
    uVar9 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a88,uRam00007ffc3ebc0a48,uRam00007ffc3ebc09e0,
                             uVar7);
    uVar14 = uRam00007ffc3ebc0a88;
    uVar8 = uRam00007ffc3ebc0a60;
    uVar20 = (undefined4)((ulonglong)uVar7 >> 0x20);
    uVar7 = FUN_7ffc3eb76c30(param_1,0);
    uVar10 = FUN_7ffc3eb76c30(param_1,0);
    uVar11 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba6299);
    uVar18 = CONCAT44(uVar20,6);
    lVar4 = FUN_7ffc3e7d1a80(param_1,uVar14,uVar8,uVar7,uVar18,uVar10,uVar11,uVar9);
    uVar20 = (undefined4)((ulonglong)uVar18 >> 0x20);
    if (lVar4 != 0) {
      _DAT_7ffc3ebc0b50 = (**(code **)(*param_1 + 0xa8))(param_1,lVar4);
    }
  }
  lVar4 = _DAT_7ffc3ebc0b50;
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if ((cVar1 == '\0') && (lVar6 = FUN_7ffc3eb76c30(param_1,0x12), lVar6 != 0)) {
    if (param_5 == 0) {
LAB_7ffc3eb75a7a:
      lVar4 = *param_1;
      puVar17 = &DAT_7ffc3eba6000;
      uVar8 = uRam00007ffc3ebc0a70;
LAB_7ffc3eb75a8e:
      (**(code **)(lVar4 + 0x70))(param_1,uVar8,puVar17);
    }
    else {
      lVar12 = FUN_7ffc3eb76c30(param_1,0x19);
      if ((lVar12 != 0) && (lVar12 = FUN_7ffc3eb76c90(param_1,lVar12,0x24), lVar12 != 0)) {
        uVar2 = FUN_7ffc3e7d8be0(param_1,param_5,lVar12);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 == '\0') {
          if (lVar4 == 0) goto LAB_7ffc3eb75a7a;
          lVar12 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a68,0x25);
          if (lVar12 != 0) {
            uVar19 = CONCAT44(uVar20,uVar2);
            uVar8 = FUN_7ffc3e7d1a50(param_1,lVar4,lVar12,lVar6,uVar19);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 == '\0') {
              uVar13 = (**(code **)(*param_1 + 0x560))(param_1,4,uRam00007ffc3ebc09e0,0);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 == '\0') {
                if (uVar13 == 0) goto LAB_7ffc3eb75a7a;
                if (cRam00007ffc3ebc08e5 == '\x01') {
                  iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                  (ulonglong)uRam00007ffc3ebc08e8);
                }
                else {
                  iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                }
                if (0 < iVar3) {
                  (**(code **)(*param_1 + 0x570))(param_1,uVar13,0,param_3);
                  if (cRam00007ffc3ebc08e5 == '\x01') {
                    iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                    (ulonglong)uRam00007ffc3ebc08e8);
                  }
                  else {
                    iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                  }
                  if (1 < iVar3) {
                    (**(code **)(*param_1 + 0x570))(param_1,uVar13,1,lVar5);
                    if (cRam00007ffc3ebc08e5 == '\x01') {
                      iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                      (ulonglong)uRam00007ffc3ebc08e8);
                    }
                    else {
                      iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                    }
                    if (2 < iVar3) {
                      (**(code **)(*param_1 + 0x570))(param_1,uVar13,2,param_4);
                      if (cRam00007ffc3ebc08e5 == '\x01') {
                        iVar3 = *(int *)(*(longlong *)(uVar13 & 0xfffffffffffffffc) +
                                        (ulonglong)uRam00007ffc3ebc08e8);
                      }
                      else {
                        iVar3 = (**(code **)(*param_1 + 0x558))(param_1,uVar13);
                      }
                      if (3 < iVar3) {
                        (**(code **)(*param_1 + 0x570))(param_1,uVar13,3,param_5);
                        lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x26);
                        if (lVar4 != 0) {
                          uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                   uVar19 & 0xffffffff00000000,uVar13);
                          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                          if ((cVar1 == '\0') &&
                             (lVar4 = FUN_7ffc3eb76c90(param_1,uRam00007ffc3ebc0a78,0x27),
                             lVar4 != 0)) {
                            uVar8 = FUN_7ffc3e7d1a80(param_1,uRam00007ffc3ebc0a78,lVar4,uVar8,
                                                     param_5,uVar13);
                            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                            if ((cVar1 == '\0') &&
                               ((lVar4 = FUN_7ffc3eb76c30(param_1,0x18), lVar4 != 0 &&
                                (lVar4 = FUN_7ffc3eb76c90(param_1,lVar4,0x22), lVar4 != 0)))) {
                              FUN_7ffc3e7e1940(param_1,lVar5,lVar4,uVar8);
                              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                              if (cVar1 == '\0') {
                                return lVar5;
                              }
                            }
                          }
                        }
                        goto LAB_7ffc3eb75a94;
                      }
                    }
                  }
                }
                lVar4 = *param_1;
                puVar17 = (undefined *)0x7ffc3eba6019;
                uVar8 = uRam00007ffc3ebc0a98;
                goto LAB_7ffc3eb75a8e;
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb75a94:
  uVar8 = (**(code **)(*param_1 + 0x78))(param_1);
  uVar14 = FUN_7ffc3eb76c30(param_1,8);
  cVar1 = (**(code **)(*param_1 + 0x100))(param_1,uVar8,uVar14);
  if (cVar1 == '\0') {
    return 0;
  }
  (**(code **)(*param_1 + 0x88))(param_1);
  lVar4 = FUN_7ffc3eb76c30(param_1,0x16);
  if (lVar4 == 0) {
    return 0;
  }
  lVar5 = (**(code **)(*param_1 + 0xd8))(param_1,lVar4);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  lVar6 = FUN_7ffc3eb76c30(param_1,0x1a);
  if (lVar6 == 0) {
    return 0;
  }
  lVar12 = (**(code **)(*param_1 + 0xd8))(param_1,lVar6);
  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
  if (cVar1 != '\0') {
    return 0;
  }
  if (lVar12 != 0) {
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x28);
    if (lVar15 == 0) {
      return 0;
    }
    FUN_7ffc3e7dbbc0(param_1,lVar12,lVar6,lVar15);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba605c);
    lVar15 = FUN_7ffc3eb76c90(param_1,lVar6,0x29);
    if (lVar15 == 0) {
      return 0;
    }
    lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
    cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
    if (cVar1 != '\0') {
      return 0;
    }
    uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
    if (lVar12 != 0) {
      lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
      cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
      if (cVar1 != '\0') {
        return 0;
      }
      if (lVar12 != 0) {
        lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,param_4);
        cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
        if (cVar1 != '\0') {
          return 0;
        }
        uVar14 = (**(code **)(*param_1 + 0x538))(param_1,0x7ffc3eba653a);
        if (lVar12 != 0) {
          lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
          cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
          if (cVar1 != '\0') {
            return 0;
          }
          if (param_5 != 0) {
            lVar16 = FUN_7ffc3eb76c30(param_1,0x19);
            if (lVar16 == 0) {
              return 0;
            }
            lVar16 = FUN_7ffc3eb76c90(param_1,lVar16,0x2a);
            if (lVar16 == 0) {
              return 0;
            }
            uVar14 = FUN_7ffc3e7d1a50(param_1,param_5,lVar16);
            cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
            if (cVar1 != '\0') {
              return 0;
            }
            if (lVar12 != 0) {
              lVar12 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar15,uVar14);
              cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
              if (cVar1 != '\0') {
                return 0;
              }
              if (lVar12 != 0) {
                lVar6 = FUN_7ffc3eb76c90(param_1,lVar6,0x2b);
                if (lVar6 == 0) {
                  return 0;
                }
                uVar14 = FUN_7ffc3e7d1a50(param_1,lVar12,lVar6);
                cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                if (cVar1 != '\0') {
                  return 0;
                }
                if (lVar5 != 0) {
                  lVar6 = FUN_7ffc3eb76c90(param_1,lVar4,0x18);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  FUN_7ffc3e7dbbc0(param_1,lVar5,lVar4,lVar6,uVar14,uVar8);
                  cVar1 = (**(code **)(*param_1 + 0x720))(param_1);
                  if (cVar1 != '\0') {
                    return 0;
                  }
                  (**(code **)(*param_1 + 0x68))(param_1,lVar5);
                  return 0;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_7ffc3eb75df7:
  (**(code **)(*param_1 + 0x70))(param_1,uRam00007ffc3ebc0a70,&DAT_7ffc3eba6000);
  return 0;
}

