# Interview Revision

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Basics: pass-by-value, primitive/reference types, wrappers, and casting
- [ ] OOP: overloading/overriding, abstract class/interface, static/final, and composition/inheritance
- [ ] Strings/arrays: immutability, pooling, identity/equality, mutable builders, and copying
- [ ] Exceptions: checked/unchecked, throw/throws, finally, and resource cleanup
- [ ] Collections: collection selection, ordering, HashMap internals, equality/hashing, and iterator behavior
- [ ] Generics: bounds, wildcards, PECS, raw types, and erasure
- [ ] Functional APIs/streams: capture, Optional, lazy evaluation, map/flatMap, reduce/collect, and parallelism
- [ ] Concurrency: thread states, interruption, visibility/atomicity, locks, executors, and futures
- [ ] JVM: loading, memory areas, reachability, GC, JIT, and diagnostics
- [ ] Advanced Java: reflection, annotations, records, immutability, and singleton choices
- [ ] Testing/design: test scope, mocks/spies, SOLID, injection, and pattern tradeoffs

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `HashMapQuestion.java` — Exercise custom keys, collisions, updates, and retrieval, then explain the observations.
- [ ] `EqualsHashCode.java` — Demonstrate collection behavior with correct and deliberately inconsistent equality/hashing.
- [ ] `StringImmutability.java` — Predict and verify string identity, content, and mutation-related results.
- [ ] `ThreadSafety.java` — Compare unsafe and protected shared-state updates with verified final results.
- [ ] `StreamQuestions.java` — Solve grouping, duplicate-key collection, flattening, and empty-input tasks without notes.
- [ ] `OopQuestions.java` — Predict dispatch for overloading, overriding, and static method hiding.
- [ ] `ExceptionQuestions.java` — Predict propagation and resource cleanup, including suppressed exceptions.
- [ ] `GenericsQuestions.java` — Write bounded/wildcard methods and identify rejected operations.
- [ ] `MixedJavaPractice.java` — Combine custom objects, collections, exceptions, streams, and meaningful tests.

## Revision checks

- [ ] Answer the comparison questions above aloud without notes.
- [ ] Recreate the minimum programs from earlier chapters that you cannot yet explain.
- [ ] Record mistakes and weak topics in your own notes, then schedule another revision.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

