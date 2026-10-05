# Advanced Java

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Reflection: Class, constructors, fields, methods, access, and limitations
- [ ] Annotations, retention policies, targets, and runtime inspection
- [ ] Enums, fields, constructors, methods, and switch use
- [ ] Records, generated members, customization, and component mutability
- [ ] Immutable class design, defensive copies, and collection exposure
- [ ] Singleton approaches, initialization, concurrency, and serialization concerns
- [ ] Sealed classes/interfaces, permitted subclasses, and pattern matching
- [ ] Modern syntax including text blocks and version requirements

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `ReflectionDemo.java` — Inspect a class, invoke a constructor/method, and handle reflective failures.
- [ ] `AnnotationDemo.java` — Define a runtime annotation and inspect it reflectively.
- [ ] `EnumDemo.java` — Define an enum with state/behavior and use EnumSet/EnumMap.
- [ ] `RecordDemo.java` — Use a record with validation and a mutable component that needs copying.
- [ ] `ImmutableClass.java` — Build an immutable value type with defensive copies.
- [ ] `SingletonDemo.java` — Compare enum and initialization-on-demand holder implementations.
- [ ] `SealedClassDemo.java` — Create a sealed hierarchy and use supported pattern matching.
- [ ] `ModernSyntaxDemo.java` — Exercise text blocks and modern syntax; record the JDK version needed.

## Revision checks

- [ ] Explain what guarantees your immutable class provides.
- [ ] Compare a record with a regular value class.
- [ ] Justify a reflection or singleton use case and identify its tradeoffs.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

