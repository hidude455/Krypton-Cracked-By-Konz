# Native method mapping

[Exact method-to-RVA table](native-method-map.tsv) contains 732 registry methods. The direct registration dispatcher raises the native target total to 733; [coverage](native-coverage.tsv) includes it.

All 624 native declarations in captured Java classes map to DLL relative virtual addresses. Native pseudocode exists for 708 of 733 targets and 600 of the 624 captured declarations. The remaining targets retain their method identity and RVA. Six registration groups still have unknown class associations.

These are reconstructed C-like views. Protected control flow, partial function boundaries, inferred types and unresolved helpers prevent treating them as original, compilable C/C++ source. Some inferred function spans are only one byte, so a successful decompiler result does not establish complete function recovery.

[Combined JNI reconstruction](../native/krypton-native.c) · [Per-class source table](native-class-sources.tsv) · [.text assembly, gzip](../native/text-disassembly.asm.gz)
