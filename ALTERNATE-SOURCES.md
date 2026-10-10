# Alternate decompiler views

Canonical sources preserve one view per exact class identity. These additional Fernflower views expose some bodies missing from CFR. Fewer explicit failure markers do not establish correctness; malformed switches, unresolved invokedynamic calls and illegal identifiers remain.

| Exact original class | Alternate source | Reading note |
|---|---|---|
| `dev.krypton.0B` | [Fernflower view](alternates/0B-fernflower.java) | Additional image-construction body; check it against JVM bytecode. |
| `dev.krypton.8h` | [Fernflower view](alternates/8h-fernflower.java) | Additional direction-enum expressions; reconstructed switch branching remains unreliable. |
| `dev.krypton.4m` | [Fernflower view](alternates/4m-fernflower.java) | Additional font-style toString body; the string-to-enum method remains unresolved. |

Use the [complete javap listing](bytecode/ALL-BYTECODE.javap.txt) to check the original instruction flow. The canonical `dev.krypton.6W` source already uses the verified Fernflower fallback.
