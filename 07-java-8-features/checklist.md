# Java 8 Features and Functional APIs

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Lambda syntax, target typing, variable capture, and effectively final variables
- [ ] Functional interfaces and the FunctionalInterface annotation
- [ ] Predicate, Function, Consumer, Supplier, BiFunction, and primitive specializations
- [ ] Functional composition and chaining
- [ ] Static, instance, bound/unbound, and constructor method references
- [ ] Default/static interface methods and default-method conflicts
- [ ] Optional creation, transformation, fallback, and appropriate use
- [ ] java.time: LocalDate, LocalDateTime, Instant, ZonedDateTime, Duration, Period, and formatting

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `LambdaDemo.java` — Write lambdas in several forms and capture local variables.
- [ ] `FunctionalInterfaceDemo.java` — Define a custom functional interface and implement it with a lambda.
- [ ] `PredicateDemo.java` — Filter values using composed predicates.
- [ ] `FunctionDemo.java` — Transform values with compose/andThen and a BiFunction.
- [ ] `ConsumerDemo.java` — Chain consumers and observe their side effects.
- [ ] `SupplierDemo.java` — Supply values lazily and use a primitive specialization.
- [ ] `MethodReferenceDemo.java` — Use static, bound/unbound instance, and constructor references.
- [ ] `DefaultMethodDemo.java` — Use default/static interface methods and resolve competing defaults.
- [ ] `OptionalDemo.java` — Use map, flatMap, filter, orElse, orElseGet, and orElseThrow.
- [ ] `DateTimeDemo.java` — Parse and format dates; compare durations, periods, instants, and time zones.

## Revision checks

- [ ] Rewrite a lambda as a method reference where appropriate.
- [ ] Compare eager and lazy Optional fallbacks.
- [ ] Choose a date/time type for a local date and for an event timestamp.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

