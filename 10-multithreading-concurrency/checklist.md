# Multithreading and Concurrency

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Processes versus threads, thread creation, lifecycle, states, start, join, and sleep
- [ ] Interruption, cooperative cancellation, and safe shutdown
- [ ] Race conditions, critical sections, atomicity, visibility, and ordering
- [ ] Java Memory Model, happens-before, safe publication, and shared mutable state
- [ ] synchronized, intrinsic locks, reentrancy, and wait/notify/notifyAll
- [ ] volatile and its limits; atomic classes and compound operations
- [ ] Deadlock, livelock, starvation, lock ordering, and diagnosis
- [ ] Lock/ReentrantLock, conditions, and try/finally release
- [ ] ExecutorService, thread pools, task submission, and shutdown
- [ ] Callable/Future, timeouts, cancellation, and exceptions
- [ ] CompletableFuture composition, combination, executors, and error handling
- [ ] Concurrent collections, thread-safe iteration, and compound map operations
- [ ] BlockingQueue, producer/consumer patterns, CountDownLatch, and Semaphore
- [ ] Virtual threads, workload suitability, and comparison with platform-thread pools

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `ThreadDemo.java` — Start and join threads and compare start with a direct run call.
- [ ] `RunnableDemo.java` — Execute shared Runnable tasks with controlled completion.
- [ ] `ThreadLifecycle.java` — Coordinate threads and observe selected lifecycle states.
- [ ] `InterruptionDemo.java` — Interrupt a task and stop it cooperatively.
- [ ] `RaceConditionDemo.java` — Exercise a shared-state race and compare against an expected result.
- [ ] `SynchronizationDemo.java` — Protect shared updates with synchronized and verify the final result.
- [ ] `WaitNotifyDemo.java` — Coordinate producer/consumer work with a guarded condition and clean termination.
- [ ] `DeadlockDemo.java` — Compare opposing lock order with consistent lock order; bound runtime and provide a safe termination path.
- [ ] `VolatileDemo.java` — Use a visibility flag and compare a compound-update scenario with an atomic/synchronized solution.
- [ ] `AtomicIntegerDemo.java` — Use atomic updates and compare results with synchronized updates.
- [ ] `LockDemo.java` — Use ReentrantLock, tryLock, and release in finally.
- [ ] `ExecutorServiceDemo.java` — Submit tasks to a bounded-size pool, await completion, and shut down.
- [ ] `CallableFutureDemo.java` — Retrieve task results and handle failure, timeout, and cancellation.
- [ ] `CompletableFutureDemo.java` — Chain/combine asynchronous work and handle failed stages.
- [ ] `ConcurrentHashMapDemo.java` — Perform concurrent compute/merge updates and inspect the final values.
- [ ] `BlockingQueueDemo.java` — Build a producer/consumer flow with a clear shutdown protocol.
- [ ] `CoordinationDemo.java` — Coordinate completion with CountDownLatch and limit access with Semaphore.
- [ ] `VirtualThreadDemo.java` — Run blocking tasks on virtual threads and record the required JDK version.

## Revision checks

- [ ] Compare synchronized, volatile, and atomic updates.
- [ ] Explain how tasks in each demo terminate and how exceptions reach the caller.
- [ ] Diagnose a locking problem and justify an executor or thread choice.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

