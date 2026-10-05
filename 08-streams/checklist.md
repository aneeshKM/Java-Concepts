# Streams

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Streams versus collections, sources, pipelines, and single-use streams
- [ ] Intermediate versus terminal operations, lazy evaluation, and short-circuiting
- [ ] filter, map, flatMap, distinct, sorted, limit, skip, and peek
- [ ] reduce versus collect; identity, associativity, and mutable reduction
- [ ] Collectors: toList/toSet/toMap, joining, groupingBy, partitioningBy, and downstream collectors
- [ ] findFirst/findAny, match operations, Optional results, and encounter order
- [ ] Primitive streams, numeric summaries, boxing, and unboxing
- [ ] Parallel streams, ordering, side effects, thread safety, and suitability

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `FilterDemo.java` — Filter records using multiple conditions.
- [ ] `MapDemo.java` — Transform objects and use primitive stream conversions.
- [ ] `FlatMapDemo.java` — Flatten nested collections.
- [ ] `ReduceDemo.java` — Reduce values with and without an identity; handle an empty stream.
- [ ] `CollectDemo.java` — Collect lists, sets, maps with duplicate-key handling, and joined text.
- [ ] `SortingDemo.java` — Sort custom objects, deduplicate, skip, and limit.
- [ ] `GroupingByDemo.java` — Group records and apply downstream counting, summing, and mapping.
- [ ] `PartitioningByDemo.java` — Partition records using a predicate.
- [ ] `MatchingDemo.java` — Use findFirst/findAny and anyMatch/allMatch/noneMatch.
- [ ] `LazyEvaluationDemo.java` — Trace evaluation and short-circuiting without depending on peek for required work.
- [ ] `ParallelStreamDemo.java` — Compare sequential/parallel results with suitable reductions and controlled side effects.
- [ ] `StreamPractice.java` — Solve record grouping, frequency counting, ranking, nested flattening, and summary-statistics exercises.

## Revision checks

- [ ] Compare map versus flatMap and reduce versus collect.
- [ ] Predict which elements a short-circuiting pipeline processes.
- [ ] Explain when a parallel pipeline is appropriate and how you checked its result.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

