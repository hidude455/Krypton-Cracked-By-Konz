# Krypton-Cracked-By-Konz

Recovered KryptonPlus code export by Konz. This repository contains reconstructed Java source, JVM bytecode and native-code analysis. It does not contain a rebuilt working mod or demonstrate that licensing has been removed.

Start with [the 83 module classes](MODULES.md), [all 354 recovered class sources](SOURCES.md), or [the shared module base](src/dev/krypton/6x__019dcc39561b.java). Obfuscated class names are retained; user-facing module names have not been reliably recovered.

| Contents | Where to browse |
|---|---|
| 354 class source views: 353 CFR and one verified Fernflower fallback | [src](src), [source manifest](reports/class-sources.tsv) |
| Six outer-loader Java files | [outer-loader](outer-loader) |
| Complete captured JVM bytecode listing | [javap text](bytecode/ALL-BYTECODE.javap.txt) |
| 708 reconstructed native targets out of 733 | [combined JNI code](native/krypton-native.c), [per-class sources](native/by-class), [coverage](reports/native-coverage.tsv) |
| Native .text instruction disassembly | [gzip-compressed assembly](native/text-disassembly.asm.gz) |
| 2,786 observed code-symbol bindings across 84 module/base classes | [named bindings](bindings/BINDINGS.md) |
| Additional decompiler views for selected failed methods | [alternate sources](ALTERNATE-SOURCES.md) |
| Portable download of this source export | [KryptonPlus-sanitized-source.zip](KryptonPlus-sanitized-source.zip) |

The captured classes contain 7,813 methods: 7,124 have JVM bytecode, 624 are native and 65 are abstract. All captured native declarations map to DLL RVAs; 600 have native pseudocode. The canonical Java views still contain 90 explicit failed-method placeholders in 51 files. Pseudocode can also be incorrect without an explicit failure marker.

The capture covers 347 `dev.krypton` classes and seven helpers. No referenced `dev.krypton` type is missing from the captured Java constant-pool closure, and the recovered native ASCII class references are present. This does not establish that every possible encrypted or dynamically loaded class has been recovered.

Native output is C-like decompiler pseudocode with inferred types, incomplete protected control flow and unresolved helpers. Twenty-five native targets remain unresolved, and six registration groups have unidentified class associations. The source views remain obfuscated and are not a compilable source project. No working replacement JAR is provided.

This publication contains allowlisted source and code-analysis files. Local profile paths and capture filenames were sanitized; original JARs, license resources, runtime key snapshots, binaries, native memory images, capture logs and local tool configuration are excluded. See [the publication privacy check](reports/publication-privacy.json) and [file hashes](reports/publication-files.tsv).
