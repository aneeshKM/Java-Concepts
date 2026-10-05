# JVM and Memory

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] JDK versus JRE versus JVM; source compilation and bytecode execution
- [ ] Class loading, linking, initialization, and class-loader delegation
- [ ] Runtime memory areas: heap, stacks, metaspace, and per-thread execution state
- [ ] Object reachability, lifecycle, reference types, and eligibility for collection
- [ ] Garbage collection basics, collector tradeoffs, and GC logs
- [ ] String pool and static fields in JVM memory discussions
- [ ] JIT compilation, warmup, and measurement limitations
- [ ] StackOverflowError, OutOfMemoryError, retained objects, and memory leaks
- [ ] Basic diagnosis with javap, jcmd, thread dumps, heap inspection, and JVM flags

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `StackHeapDemo.java` — Trace method calls, local references, and shared object state.
- [ ] `GarbageCollectionDemo.java` — Allocate/release references and inspect GC logs without assuming a guaranteed collection time.
- [ ] `StaticMemoryDemo.java` — Compare instance state with shared static references and retention.
- [ ] `ObjectLifecycleDemo.java` — Trace initialization, construction, references, and weak-reference behavior.
- [ ] `ClassLoaderDemo.java` — Inspect class loaders and class initialization order.
- [ ] `MemoryDiagnosticsDemo.java` — Run a bounded allocation exercise and inspect memory/threads using JDK tools.

## Revision checks

- [ ] Trace a source file through compilation, loading, and execution.
- [ ] Explain object reachability and distinguish retained memory from useful live data.
- [ ] Capture and interpret a small thread dump or GC log.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

