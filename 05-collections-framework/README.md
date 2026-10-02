# Collections Framework

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Collection hierarchy and List, Set, Map, Queue, and Deque contracts
- [ ] ArrayList versus LinkedList; operation costs and appropriate use cases
- [ ] HashSet, LinkedHashSet, and TreeSet; ordering, uniqueness, and null handling
- [ ] HashMap, LinkedHashMap, TreeMap, Hashtable, and ConcurrentHashMap comparisons
- [ ] HashMap hashing, collisions, buckets, load factor, resizing, and tree bins
- [ ] equals/hashCode contracts, mutable keys, and identity versus value equality
- [ ] Comparable versus Comparator, comparator chaining, and comparison consistency
- [ ] Queue, Deque, ArrayDeque, and PriorityQueue operations
- [ ] Iterator and ListIterator; removal during iteration
- [ ] Fail-fast, snapshot, and weakly consistent iteration; terminology and guarantees
- [ ] Collection views, defensive copies, unmodifiable views, and immutable collection factories

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `ArrayListDemo.java` — Add, update, remove, search, traverse, and use a subList view.
- [ ] `LinkedListDemo.java` — Exercise list and deque operations.
- [ ] `HashSetDemo.java` — Exercise uniqueness with custom objects and equals/hashCode.
- [ ] `LinkedHashSetDemo.java` — Exercise insertion-order iteration and duplicate handling.
- [ ] `TreeSetDemo.java` — Use natural/custom ordering and range queries.
- [ ] `HashMapDemo.java` — Use put/get/remove, getOrDefault, compute, merge, and entry iteration.
- [ ] `LinkedHashMapDemo.java` — Exercise insertion order and access order.
- [ ] `TreeMapDemo.java` — Use sorted keys and navigable/range operations.
- [ ] `PriorityQueueDemo.java` — Add and poll values using natural and custom priorities.
- [ ] `QueueDequeDemo.java` — Use ArrayDeque as a queue and stack; handle empty operations.
- [ ] `ComparableDemo.java` — Define natural ordering for a custom type.
- [ ] `ComparatorDemo.java` — Sort custom objects with multiple criteria and reversed ordering.
- [ ] `HashMapInternals.java` — Exercise colliding keys, equality, updates, and mutable-key lookup; record implementation investigation separately.
- [ ] `IteratorDemo.java` — Use Iterator/ListIterator and iterator removal; compare mutation behavior with snapshot and concurrent iterators.
- [ ] `CollectionViewsDemo.java` — Compare backed views, defensive copies, unmodifiable wrappers, and collection factory methods.

## Revision checks

- [ ] Choose a collection for ordered uniqueness, key lookup, FIFO, and priority processing.
- [ ] Explain how a bad equals/hashCode implementation affects a map or set.
- [ ] Compare iterator behavior without relying on a guaranteed fail-fast exception.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

