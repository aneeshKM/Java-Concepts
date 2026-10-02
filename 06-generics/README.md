# Generics

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Type safety, generic classes/interfaces, generic methods, and raw types
- [ ] Type bounds, multiple bounds, inference, and the diamond operator
- [ ] Generic invariance and wildcard use
- [ ] Unbounded wildcards, upper bounds, lower bounds, and PECS
- [ ] Type erasure, bridge methods, and runtime type limitations
- [ ] Generic arrays, unchecked casts, heap pollution, and generic varargs

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `GenericClass.java` — Create and use a generic container and a generic interface.
- [ ] `GenericMethod.java` — Write a generic method and exercise type inference.
- [ ] `BoundedGenerics.java` — Use bounded parameters and multiple bounds.
- [ ] `Wildcards.java` — Use unbounded, extends, and super wildcards in reader/writer methods.
- [ ] `TypeErasureDemo.java` — Inspect runtime types and compare typed access with raw-type misuse.
- [ ] `GenericVarargsDemo.java` — Exercise generic varargs and identify unchecked warnings and heap-pollution risks.

## Revision checks

- [ ] Explain which wildcard permits each operation in your examples.
- [ ] Compare generic invariance, array covariance, and erasure restrictions.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

