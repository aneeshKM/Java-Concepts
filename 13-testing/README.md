# Testing with JUnit and Mockito

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Unit versus integration tests, isolation, and test scope
- [ ] JUnit assertions, lifecycle, exception tests, and test organization
- [ ] Parameterized tests, boundary cases, and naming
- [ ] Mockito mocks, stubbing, verification, and argument capture
- [ ] Mock versus spy; test doubles and dependency seams
- [ ] Deterministic tests for time, randomness, asynchronous work, and shared state
- [ ] Running tests using a build tool and interpreting failures

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `Calculator.java` — Create a small test target with normal, boundary, and invalid-input behavior.
- [ ] `CalculatorTest.java` — Test expected results, boundaries, and failures.
- [ ] `JUnitDemo.java` — Exercise lifecycle hooks and assertions in a runnable test class.
- [ ] `ParameterizedTestDemo.java` — Test multiple inputs including edge cases.
- [ ] `MockitoDemo.java` — Inject a mocked collaborator, stub behavior, and verify meaningful interactions.
- [ ] `MockSpyDemo.java` — Compare mocks and spies with controlled real-method calls.
- [ ] `ArgumentCaptorDemo.java` — Capture and assert data passed to a collaborator.
- [ ] `ServiceTest.java` — Test service behavior, collaborator failures, and a deterministic time dependency.

## Revision checks

- [ ] Run the test suite with your chosen Maven/Gradle setup.
- [ ] Explain why each test checks useful behavior and choose an appropriate test double.
- [ ] Confirm failed behavior produces a meaningful test failure.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

