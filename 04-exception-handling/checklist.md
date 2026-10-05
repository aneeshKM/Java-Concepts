# Exception Handling

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Throwable hierarchy, Error versus Exception, checked and unchecked exceptions
- [ ] try/catch, multi-catch, catch ordering, finally, and propagation
- [ ] throw versus throws and exception declarations in overridden methods
- [ ] Custom exceptions, validation, causes, and exception chaining
- [ ] try-with-resources, AutoCloseable, close order, and suppressed exceptions
- [ ] Exception-handling choices: recovery, propagation, and preserving diagnostic context

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `TryCatchDemo.java` — Catch a failure and demonstrate a recovery path.
- [ ] `MultipleCatchDemo.java` — Use multiple catches, multi-catch, and appropriate catch ordering.
- [ ] `FinallyDemo.java` — Observe finally with normal completion, exceptions, and method returns.
- [ ] `ThrowDemo.java` — Validate input and explicitly throw an exception.
- [ ] `ThrowsDemo.java` — Propagate a checked exception through multiple methods.
- [ ] `CustomException.java` — Define and use a custom exception with a message and cause.
- [ ] `TryWithResources.java` — Close multiple AutoCloseable resources and inspect suppressed exceptions.
- [ ] `ExceptionChainingDemo.java` — Wrap a lower-level exception while preserving its cause.

## Revision checks

- [ ] Compare checked versus unchecked exceptions and throw versus throws.
- [ ] Trace which exception reaches the caller when both work and cleanup fail.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

