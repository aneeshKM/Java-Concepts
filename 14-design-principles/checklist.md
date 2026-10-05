# Design Principles and Patterns

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] SOLID: single responsibility, open/closed, Liskov substitution, interface segregation, and dependency inversion
- [ ] Dependency injection, constructor injection, and dependencies on abstractions
- [ ] Composition over inheritance, cohesion, coupling, and separation of concerns
- [ ] Factory, Builder, Strategy, Observer, and Singleton
- [ ] Pattern selection, tradeoffs, and avoiding unnecessary abstractions

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `SingleResponsibility.java` — Separate validation, persistence, and presentation responsibilities.
- [ ] `OpenClosed.java` — Add a new behavior through an abstraction with minimal changes to existing consumers.
- [ ] `LiskovSubstitution.java` — Exercise a substitutable hierarchy and contrast a broken behavioral contract.
- [ ] `InterfaceSegregation.java` — Split a broad interface into focused client interfaces.
- [ ] `DependencyInversion.java` — Depend on an abstraction and inject an implementation through a constructor.
- [ ] `BuilderPattern.java` — Build an object with optional inputs and validation.
- [ ] `FactoryPattern.java` — Centralize creation of related implementations.
- [ ] `StrategyPattern.java` — Select or replace a behavior through composition.
- [ ] `ObserverPattern.java` — Register, notify, and remove observers.
- [ ] `SingletonPattern.java` — Use a singleton and compare its dependency/testing implications with injection.

## Revision checks

- [ ] Identify the concrete design problem addressed by each example.
- [ ] Extend the strategy/factory example without rewriting its consumer.
- [ ] Explain when a pattern adds enough value to justify its complexity.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

