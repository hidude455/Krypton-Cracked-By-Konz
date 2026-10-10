# Module name dataflow

Module base `dev.krypton.6x` exposes native String getters `9(Object[])` (RVA `0x1c8890`) and `4(Object[])` (RVA `0x1cb230`). Their observed reflection cache includes `dev.krypton.7u.3(Object[]):String`; their native implementations construct an argument array containing a seed and the module's byte-sized numeric identity before invoking a String-producing target.

The recovered `dev.krypton.7u.3(Object[]):String` function at RVA `0x1da9e0` uses the same class's `9(Object[]):byte[][]` provider at RVA `0x1de7c0`. It takes byte-array slots 0, 1, 2, and 4 and passes them to the String-producing helper at RVA `0x1db170`. The sibling `7u.8(Object[]):String` selects slot 3 in place of slot 2. The provider involves ConcurrentHashMap and cached Future-related dataflow rather than a plaintext immutable Java table.

These facts narrow the name-recovery path. A name/description split between slots 2 and 3 is an inference, not a confirmed decoding. Display names have not been assigned to module classes based on guesses. The three offline DES constructor identities in DECRYPTION.md identify numeric registration values, not names.

The analysis used captured classfiles, reflection-symbol metadata, the saved native module image, and reconstructed pseudocode. It did not invoke these native getters or read arbitrary runtime strings/configuration. The native functions and their exact RVAs remain available in the combined native source and address map for further analysis.
