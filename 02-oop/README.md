# Java OOP Revision

This README covers the core Object-Oriented Programming concepts in Java and explains what each concept means, why Java supports it, what happens at compile time and runtime, and how the examples in this folder implement it.

Files covered:

```text
ClassAndObject.java
ConstructorDemo.java
EncapsulationDemo.java
InheritanceDemo.java
PolymorphismDemo.java
MethodOverloading.java
MethodOverriding.java
AbstractClassDemo.java
InterfaceDemo.java
MultipleInterfacesDemo.java
CompositionDemo.java
StaticDemo.java
FinalDemo.java
AccessModifiersDemo.java
EqualsHashCodeDemo.java
NestedClassDemo.java
```

# 1. Classes and Objects

## What is a class?

A class is a blueprint used to create objects.

It can contain:

- fields
- methods
- constructors
- initialization blocks
- nested classes

Example:

```java
class Student {

    String name;
    int age;

    void introduce() {
        System.out.println(name + " is " + age);
    }
}
```

The class describes what a `Student` object should contain.

It does not itself represent one particular student.

## What is an object?

An object is an instance of a class.

```java
Student student1 = new Student();
Student student2 = new Student();
```

Here:

```text
Student
    Class/type

student1
    Reference variable

new Student()
    Creates a Student object
```

Each object gets its own instance state.

```java
student1.name = "Aneesh";
student2.name = "Rahul";
```

Changing one object's instance variables does not automatically change another object's values.

```java
student1.age = 26;
student2.age = 23;
```

These are independent.

## Reference vs object

This line:

```java
Student student = new Student();
```

contains two important things:

```text
Reference:
student

Object:
new Student()
```

The reference stores a way to access the object.

This distinction becomes very important when learning polymorphism.

## In our demo

`ClassAndObject.java` creates multiple objects and shows that each object maintains independent state.

# 2. Constructors

A constructor initializes an object when it is created.

Example:

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

When we write:

```java
Student student = new Student("Aneesh");
```

Java creates the object and runs the constructor.

A constructor:

- has the same name as the class
- does not have a return type
- runs when an object is created
- can be overloaded

## Constructor overloading

A class can have multiple constructors with different parameter lists.

```java
Student() {
}

Student(String name) {
}

Student(String name, int age) {
}
```

This is constructor overloading.

The compiler determines which constructor matches the arguments.

Example:

```java
new Student();
```

selects:

```java
Student()
```

while:

```java
new Student("Aneesh");
```

selects:

```java
Student(String name)
```

This decision happens at compile time.

# `this`

`this` refers to the current object.

Example:

```java
Student(String name) {
    this.name = name;
}
```

Here:

```text
this.name
    Field belonging to the current object

name
    Constructor parameter
```

# `this()`

`this()` calls another constructor in the same class.

```java
Student() {
    this("Unknown");
}
```

It must be the first statement in the constructor.

# `super()`

`super()` calls a constructor from the parent class.

```java
Employee(String name) {
    super(name);
}
```

It must also be the first statement in the constructor.

A constructor cannot directly call both `this()` and `super()` because both are required to be the first statement.

However, constructor chaining may cause both to execute indirectly.

# Constructor execution order

Consider:

```java
class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child");
    }
}
```

Creating:

```java
new Child();
```

prints:

```text
Parent
Child
```

The parent portion of the object is initialized before the child portion.

This is important because the child may depend on state inherited from the parent.

## In our demo

`ConstructorDemo.java` demonstrates:

- constructor overloading
- `this()`
- `super()`
- constructor chaining
- parent-to-child initialization order

# 3. Encapsulation

Encapsulation is often explained in two related ways.

The broader definition is:

> Encapsulation means bundling data and the methods that operate on that data into one unit, usually a class.

It also commonly involves:

> Controlling access to the internal state of that class.

Example:

```java
class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
```

Here the class contains:

```text
Data:
balance

Behavior operating on that data:
deposit()
withdraw()
```

They are tied together inside one class.

That is the basic idea of encapsulation.

## Data hiding

Encapsulation often uses access modifiers to protect internal state.

For example:

```java
private double balance;
```

Outside code cannot directly write:

```java
account.balance = -5000;
```

because `balance` is private.

Instead, the class exposes controlled operations.

```java
public void withdraw(double amount) {

    if (amount > 0 && amount <= balance) {
        balance -= amount;
    }
}
```

Now the object decides whether a requested change is valid.

## Encapsulation vs data hiding

Data hiding is part of encapsulation, but they are not exactly the same thing.

```text
Encapsulation:
Bundle data and related behavior together.

Data hiding:
Restrict direct access to internal implementation/state.
```

A class can use encapsulation even if every member is public, although that would usually be poor design.

Using `private` strengthens encapsulation by controlling access.

## What happens at compile time?

Suppose:

```java
class BankAccount {
    private double balance;
}
```

and another class tries:

```java
account.balance = 1000;
```

The Java compiler rejects the code.

The program does not reach runtime.

Access control is therefore largely enforced at compile time.

## Why use encapsulation?

Without encapsulation:

```java
account.balance = -100000;
```

could directly create invalid state.

With encapsulation:

```java
account.withdraw(100);
```

the class can:

- validate input
- protect invariants
- reject invalid operations
- log actions
- change its internal implementation later

## Getters and setters

A getter provides controlled read access.

```java
public double getBalance() {
    return balance;
}
```

A setter provides controlled write access.

```java
public void setAge(int age) {

    if (age >= 0) {
        this.age = age;
    }
}
```

A class does not need getters and setters for every field.

For example:

```java
deposit()
withdraw()
```

may be better than:

```java
setBalance()
```

because they represent meaningful business operations.

## In our demo

`EncapsulationDemo.java`:

- keeps `balance` private
- validates changes
- exposes controlled public methods
- prevents direct outside modification

# 4. Abstraction

Abstraction means exposing the important operations while hiding unnecessary implementation details.

A simple definition is:

> Show the user what they need to use, while hiding how the internal work is performed.

Consider:

```java
CoffeeMachine machine = new CoffeeMachine();

machine.makeCoffee();
```

The user only needs to know:

```text
makeCoffee()
```

The user does not need to manually handle:

```text
heat water
grind beans
control temperature
manage pressure
brew coffee
```

That complexity can remain inside the class.

Example:

```java
class CoffeeMachine {

    public void makeCoffee() {
        heatWater();
        grindBeans();
        brew();
    }

    private void heatWater() {
        System.out.println("Heating water");
    }

    private void grindBeans() {
        System.out.println("Grinding beans");
    }

    private void brew() {
        System.out.println("Brewing");
    }
}
```

The caller interacts with:

```java
makeCoffee();
```

and does not need to understand the details.

That is abstraction.

# Encapsulation vs abstraction

These concepts overlap, which is why they are often confused.

Encapsulation asks:

```text
Who should be allowed to access this state or implementation?
```

Abstraction asks:

```text
What does the caller actually need to know?
```

For example:

```java
class BankAccount {

    private double balance;

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
```

This:

```java
private double balance;
```

is mainly encapsulation because outside code cannot directly access the internal field.

This:

```java
account.withdraw(100);
```

is abstraction because the caller does not need to manually perform the internal withdrawal logic.

The class hides that complexity behind a simple operation.

A useful mental model is:

```text
Encapsulation:
Hide/protect internals.

Abstraction:
Hide unnecessary complexity.
```

Or:

```text
Encapsulation:
"Who can access this?"

Abstraction:
"What does the caller need to know?"
```

## Abstraction does not simply mean private methods

This is important.

Consider:

```java
interface Payment {

    void pay(double amount);
}
```

The `pay()` method is public.

Still, this is abstraction.

The caller knows:

```text
A Payment can pay.
```

The caller does not need to know how payment processing happens internally.

For example:

```java
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Process card payment");
    }
}
```

and:

```java
class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Process PayPal payment");
    }
}
```

The caller can simply use:

```java
Payment payment = new CreditCardPayment();

payment.pay(100);
```

The implementation is hidden behind the abstraction.

# Abstraction vs the `abstract` keyword

The concept of abstraction is broader than Java's `abstract` keyword.

You can create abstraction using:

- normal classes
- methods
- APIs
- abstract classes
- interfaces

An `abstract class` is one Java language feature that helps implement abstraction.

It is not the definition of abstraction itself.

# 5. Inheritance

Inheritance allows one class to inherit accessible fields and methods from another class.

Example:

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
```

Now:

```java
Dog dog = new Dog();

dog.eat();
dog.bark();
```

works.

`Dog` gets access to the inherited `eat()` behavior.

# IS-A relationship

Inheritance normally models an IS-A relationship.

```text
Dog IS-A Animal
Car IS-A Vehicle
Manager IS-A Employee
```

Java uses:

```java
extends
```

Example:

```java
class Dog extends Animal {
}
```

# Parent and child terminology

Given:

```java
class Animal {
}

class Dog extends Animal {
}
```

`Animal` may be called:

```text
Parent class
Superclass
Base class
```

`Dog` may be called:

```text
Child class
Subclass
Derived class
```

# What gets inherited?

A child class can access inherited members depending on access modifiers.

Important modifiers include:

```text
public
protected
package-private
private
```

Private members still exist as part of the parent portion of the object, but the child class cannot directly access them.

# Why use inheritance?

Inheritance is useful when multiple classes genuinely share a common identity and behavior.

Example:

```text
Animal
├── Dog
├── Cat
└── Cow
```

Shared behavior can remain in the parent.

```java
void eat() {
}
```

Special behavior can be added or overridden in subclasses.

# 6. Why Java Does Not Support Multiple Class Inheritance

Java allows:

```java
class Dog extends Animal {
}
```

but not:

```java
class C extends A, B {
}
```

A class can directly extend only one class.

One major reason is ambiguity.

Consider:

```java
class A {

    void show() {
        System.out.println("A");
    }
}
```

and:

```java
class B {

    void show() {
        System.out.println("B");
    }
}
```

If Java allowed:

```java
class C extends A, B {
}
```

then:

```java
C object = new C();

object.show();
```

would be ambiguous.

Should Java run:

```text
A.show()
```

or:

```text
B.show()
```

There is no universally correct answer.

Java avoids this complexity by allowing only one direct superclass.

# Diamond problem

Consider this inheritance structure:

```text
        A
       / \
      B   C
       \ /
        D
```

Suppose:

```text
B extends A
C extends A
```

and imagine Java allowed:

```text
D extends B, C
```

Now `D` reaches `A` through two inheritance paths.

Questions appear:

```text
Does D contain one A portion or two?

If B overrides a method and C also overrides it,
which implementation should D inherit?

Which constructor chain should be used?
```

Languages such as C++ provide mechanisms for handling multiple inheritance.

Java chose a simpler inheritance model.

```text
One class can extend one class.
```

This avoids a large category of ambiguity.

# 7. Polymorphism

Polymorphism means that one general type can refer to objects of multiple concrete types.

Example:

```java
Animal animal = new Dog();
```

There are two types involved.

```text
Reference type:
Animal

Actual object type:
Dog
```

This distinction is extremely important.

# Reference type vs actual object type

Consider:

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Eating");
    }
}
```

and:

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching");
    }
}
```

Now:

```java
Animal animal = new Dog();
```

This is valid because:

```text
Dog IS-A Animal
```

# What happens at compile time?

The compiler mainly uses the reference type when checking which members are accessible.

The reference type is:

```text
Animal
```

Therefore:

```java
animal.eat();
```

is allowed because `Animal` contains `eat()`.

This:

```java
animal.sound();
```

is also allowed because `Animal` contains `sound()`.

But:

```java
animal.fetch();
```

causes a compile-time error.

Why?

Because the reference type is `Animal`, and `Animal` does not declare `fetch()`.

Even though the actual object is a `Dog`, the compiler checks what operations are available through the declared reference type.

# What happens at runtime?

This call:

```java
animal.sound();
```

passes compile-time checks because `Animal` defines `sound()`.

At runtime, Java checks the actual object.

The actual object is:

```text
Dog
```

so Java executes:

```java
Dog.sound()
```

and prints:

```text
Bark
```

This is dynamic method dispatch.

A useful rule is:

```text
Compile time:
"Is this method call allowed?"

Runtime:
"Which overridden implementation should run?"
```

# Why runtime polymorphism exists

Consider:

```java
Animal animal;

if (someCondition) {
    animal = new Dog();
} else {
    animal = new Cat();
}
```

Later:

```java
animal.sound();
```

The compiler may not know which object will be assigned because the decision depends on runtime conditions.

Therefore the actual overridden implementation is chosen at runtime.

If:

```text
animal -> Dog object
```

Java executes:

```java
Dog.sound()
```

If:

```text
animal -> Cat object
```

Java executes:

```java
Cat.sound()
```

# Why polymorphism is useful

Without polymorphism:

```java
Dog dog = new Dog();
Cat cat = new Cat();

dog.makeSound();
cat.makeSound();
```

With polymorphism:

```java
Animal[] animals = {
    new Dog(),
    new Cat()
};

for (Animal animal : animals) {
    animal.makeSound();
}
```

The same code can work with many implementations.

Each object provides its own behavior.

## In our demo

`PolymorphismDemo.java` uses:

```text
Inheritance
Method overriding
Parent references
Child objects
Runtime method dispatch
```

# 8. Method Overloading

Method overloading means defining multiple methods with the same name but different parameter lists.

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

and:

```java
static double add(double a, double b) {
    return a + b;
}
```

and:

```java
static int add(int a, int b, int c) {
    return a + b + c;
}
```

# What can differ?

Overloaded methods can differ by number of parameters.

```java
add(int a, int b)

add(int a, int b, int c)
```

They can differ by parameter type.

```java
add(int a, int b)

add(double a, double b)
```

They can differ by parameter order.

```java
print(String name, int age)

print(int age, String name)
```

# Return type alone is not enough

This is invalid:

```java
int test(int x)

double test(int x)
```

The parameter lists are identical.

Java cannot determine which method should be selected from the method call alone.

# Why overloading is compile-time polymorphism

Consider:

```java
print(10);
```

If available methods are:

```java
print(int value)

print(double value)
```

the compiler already knows that:

```text
10 is an int literal
```

Therefore it selects:

```java
print(int)
```

before the program runs.

That is why method overloading is called compile-time polymorphism.

## In our demo

`MethodOverloading.java` demonstrates overloaded methods and compile-time method selection.

# 9. Method Overriding

Method overriding occurs when a child class provides its own implementation of an inherited instance method.

Parent:

```java
class Animal {

    void sound() {
        System.out.println("Animal");
    }
}
```

Child:

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

`Dog` replaces the inherited behavior for `Dog` objects.

# `@Override`

The annotation:

```java
@Override
```

tells the compiler:

> I intend this method to override a method from the parent type.

This helps catch mistakes.

For example, if the method signature does not actually match the parent method, the compiler reports an error.

# `super.method()`

A child class can still call the parent's implementation.

```java
@Override
void sound() {

    super.sound();

    System.out.println("Bark");
}
```

This allows the child to extend rather than completely replace parent behavior.

# Covariant return type

A child override can return a more specific reference type.

Parent:

```java
Animal reproduce() {
    return new Animal();
}
```

Child:

```java
@Override
Dog reproduce() {
    return new Dog();
}
```

This works because:

```text
Dog IS-A Animal
```

# Why overriding is runtime polymorphism

Consider:

```java
Animal animal = new Dog();

animal.sound();
```

At compile time, Java verifies that:

```java
Animal
```

has a compatible `sound()` method.

At runtime, it sees that the actual object is:

```text
Dog
```

and executes:

```java
Dog.sound()
```

# 10. Overloading vs Overriding

| Feature | Overloading | Overriding |
|---|---|---|
| Same method name | Yes | Yes |
| Same parameter list | No | Yes |
| Requires inheritance | No | Yes |
| Selected | Compile time | Runtime |
| Main purpose | Multiple ways to call a method | Replace inherited behavior |
| Type of polymorphism | Compile-time | Runtime |

# 11. Abstract Classes

An abstract class is a class that is intentionally incomplete as a concrete type.

It is declared using:

```java
abstract class Shape {
}
```

The `abstract` keyword tells Java that the class is intended to act as a base class and cannot be directly instantiated.

Therefore:

```java
new Shape();
```

is not allowed if `Shape` is abstract.

# Why abstract classes exist

Suppose we have:

```text
Shape
├── Circle
├── Rectangle
└── Triangle
```

Every shape may share common information.

```java
String name;
```

They may also share common behavior.

```java
void displayName() {
    System.out.println(name);
}
```

But there may be some behavior that every shape must support without there being one meaningful general implementation.

For example:

```text
area()
```

A circle uses:

```text
π × r²
```

A rectangle uses:

```text
length × width
```

A triangle uses another formula.

A generic `Shape` cannot provide one meaningful implementation.

Still, we want every concrete shape to support:

```java
area()
```

This is where abstract methods are useful.

# 12. Abstract Methods

An abstract method declares that behavior must exist but does not provide an implementation.

Example:

```java
abstract double area();
```

Notice that there is no method body.

It ends with:

```text
;
```

The method is essentially saying:

> Every concrete subclass must define how this operation works.

# Why can an abstract method not have a body?

An abstract method specifically means:

```text
This method does not provide an implementation here.
```

Therefore this is invalid:

```java
abstract double area() {
    return 10;
}
```

This would contradict the meaning of `abstract`.

If you want to provide implementation, remove `abstract`.

```java
double area() {
    return 10;
}
```

# Why must a class containing an abstract method be abstract?

Suppose Java allowed this:

```java
class Animal {

    abstract void sound();
}
```

Then imagine:

```java
Animal animal = new Animal();

animal.sound();
```

What implementation would execute?

There is none.

That would allow creation of an incomplete object.

Java prevents this at compile time.

Therefore a class containing an abstract method must itself be abstract.

```java
abstract class Animal {

    abstract void sound();
}
```

Now:

```java
new Animal();
```

is rejected by the compiler.

# What happens when a subclass extends an abstract class?

Suppose:

```java
abstract class Animal {

    abstract void sound();
}
```

Then:

```java
class Dog extends Animal {
}
```

causes a compile-time error.

Why?

`Dog` is concrete.

A concrete class must be complete enough to instantiate.

But `Dog` inherited:

```java
abstract void sound();
```

without implementing it.

There are two solutions.

Implement the method:

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

or keep the child abstract:

```java
abstract class Dog extends Animal {
}
```

Then a later concrete subclass must implement the missing method.

# Can an abstract class have normal methods?

Yes.

This is one of the main reasons abstract classes are useful.

Example:

```java
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    abstract void sound();
}
```

Here:

```text
name
    Normal field

Animal(...)
    Constructor

eat()
    Concrete method

sound()
    Abstract method
```

All animals may eat in the same way, so the implementation can be shared.

Different animals make different sounds, so subclasses must provide that implementation.

# Can an abstract class have constructors?

Yes.

Example:

```java
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }
}
```

You cannot directly create:

```java
new Animal("Bruno");
```

because the class is abstract.

However, a subclass constructor can call:

```java
super("Bruno");
```

The abstract class constructor initializes the parent portion of the child object.

# Can an abstract class have zero abstract methods?

Yes.

This is legal:

```java
abstract class Employee {

    void clockIn() {
        System.out.println("Clocked in");
    }
}
```

There are no abstract methods.

Still:

```java
new Employee();
```

is illegal.

Why would we do this?

Because we may want `Employee` to exist only as a conceptual base type.

Maybe valid objects should only be:

```text
Developer
Manager
Designer
```

The `abstract` keyword prevents generic `Employee` objects from being created.

# Abstract class vs inheritance

An abstract class is not an alternative to inheritance.

It uses inheritance.

For example:

```java
abstract class Animal {
}
```

and:

```java
class Dog extends Animal {
}
```

still uses normal inheritance.

Think of it as:

```text
Inheritance:
The mechanism and relationship.

Abstract class:
A special type of parent class used within inheritance.
```

# 13. Interfaces

An interface defines a contract.

Example:

```java
interface Payment {

    void pay(double amount);
}
```

This says:

> Any concrete class implementing `Payment` must provide the required payment behavior.

Example:

```java
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using card");
    }
}
```

# Why interfaces exist

Suppose these classes exist:

```text
CreditCardPayment
PayPalPayment
BankTransferPayment
```

They may have completely different implementations.

But all support:

```java
pay()
```

We can represent the shared capability with:

```java
interface Payment {
}
```

Then code can work against the interface.

```java
Payment payment = new CreditCardPayment();

payment.pay(100);
```

Later:

```java
payment = new PayPalPayment();
```

The caller can remain largely unchanged.

That is abstraction and polymorphism working together.

# Interface methods

A normal interface method:

```java
void pay(double amount);
```

is implicitly:

```java
public abstract void pay(double amount);
```

So you do not need to explicitly write:

```java
public abstract
```

# Why implementing methods must be public

Suppose:

```java
interface Payment {

    void pay();
}
```

The method is implicitly public.

Therefore:

```java
class Card implements Payment {

    void pay() {
    }
}
```

is invalid.

The implementation cannot reduce visibility.

It must be:

```java
class Card implements Payment {

    @Override
    public void pay() {
    }
}
```

# Default methods

Interfaces can contain implemented instance methods using `default`.

```java
interface Payment {

    default void printReceipt() {
        System.out.println("Receipt generated");
    }
}
```

A class implementing the interface automatically receives this behavior unless it overrides it.

# Static interface methods

Interfaces can contain static methods.

```java
interface Payment {

    static void info() {
        System.out.println("Payment interface");
    }
}
```

Call them using:

```java
Payment.info();
```

because the method belongs to the interface itself.

# Private interface methods

Modern Java also allows private methods inside interfaces.

They are useful for sharing implementation internally between default or static methods.

They cannot be called from implementing classes.

# Can interfaces contain implementation?

Yes.

The statement:

```text
Interfaces cannot contain implementation.
```

is outdated.

Modern Java interfaces can contain:

```text
Abstract methods
Default methods
Static methods
Private methods
Constants
```

However, they still do not work like normal classes with ordinary mutable instance state.

# 14. Abstract Class vs Interface

Abstract classes and interfaces overlap, but they solve different design problems.

# Abstract class

An abstract class is useful when related classes share:

- common identity
- common state
- constructors
- implemented behavior
- incomplete behavior that subclasses must implement

Example:

```java
abstract class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("Eating");
    }

    abstract void sound();
}
```

Then:

```java
class Dog extends Animal {
}
```

The relationship is:

```text
Dog IS-A Animal
```

# Interface

An interface is useful when different classes share a capability.

Example:

```java
interface Flyable {

    void fly();
}
```

Different classes may implement it.

```java
class Bird implements Flyable {
}

class Airplane implements Flyable {
}

class Drone implements Flyable {
}
```

These classes are not necessarily part of the same class hierarchy.

But they all:

```text
CAN fly
```

# Useful mental model

Abstract class:

```text
"What is this object?"
```

Examples:

```text
Dog IS-A Animal
Circle IS-A Shape
Manager IS-A Employee
```

Interface:

```text
"What can this object do?"
```

Examples:

```text
Bird CAN fly
Airplane CAN fly
Duck CAN swim
Employee CAN be comparable
```

This is a useful guideline, though real-world design can be more complex.

# Main differences

| Abstract Class | Interface |
|---|---|
| Declared using `abstract class` | Declared using `interface` |
| Extended using `extends` | Implemented using `implements` |
| Can have instance fields | Does not provide normal per-object mutable state |
| Can have constructors | Cannot have normal constructors |
| Can have concrete methods | Can have default/static/private implemented methods |
| Can have abstract methods | Can have abstract methods |
| Class can extend only one class | Class can implement many interfaces |
| Good for shared base implementation | Good for shared contracts/capabilities |

# 15. Why a Class Can Implement Multiple Interfaces

Java allows:

```java
class Smartphone implements Camera, MusicPlayer, GPS {
}
```

but does not allow:

```java
class Smartphone extends CameraClass, MusicPlayerClass {
}
```

Why?

Traditional interfaces mainly describe contracts.

For example:

```java
interface Camera {

    void takePhoto();
}
```

and:

```java
interface MusicPlayer {

    void playMusic();
}
```

There is no inherited object state and no competing normal class constructors.

The class itself provides the actual implementations.

```java
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Music");
    }
}
```

This gives Java multiple capabilities without the full complexity of multiple class inheritance.

# What about default methods?

Interfaces now support default methods.

That can create conflicts.

Consider:

```java
interface A {

    default void show() {
        System.out.println("A");
    }
}
```

and:

```java
interface B {

    default void show() {
        System.out.println("B");
    }
}
```

Now:

```java
class C implements A, B {
}
```

would be ambiguous.

Java does not silently choose one.

The compiler rejects the class unless the programmer resolves the conflict.

Example:

```java
class C implements A, B {

    @Override
    public void show() {
        A.super.show();
    }
}
```

or:

```java
@Override
public void show() {
    B.super.show();
}
```

or:

```java
@Override
public void show() {
    System.out.println("C implementation");
}
```

This is one reason multiple interfaces remain manageable.

When ambiguity occurs, Java forces you to explicitly resolve it.

# Why can't a class extend multiple abstract classes?

Because an abstract class is still a class.

It can contain:

- instance fields
- constructors
- concrete methods
- initialization logic
- inherited state

Therefore multiple abstract classes would still introduce multiple-class-inheritance problems.

This is invalid:

```java
class Dog extends Animal, Pet {
}
```

even if both `Animal` and `Pet` are abstract.

But this is valid:

```java
class Duck extends Animal
        implements Flyable, Swimmable {
}
```

A useful interpretation is:

```text
Animal
    What Duck IS

Flyable
Swimmable
    What Duck CAN DO
```

# 16. Composition

Composition means building one object using other objects.

Example:

```java
class Engine {

    void start() {
        System.out.println("Engine started");
    }
}
```

and:

```java
class Car {

    private Engine engine = new Engine();

    void startCar() {
        engine.start();
    }
}
```

The relationship is:

```text
Car HAS-A Engine
```

# Inheritance vs composition

Inheritance represents:

```text
IS-A
```

Example:

```text
Dog IS-A Animal
```

Composition represents:

```text
HAS-A
```

Example:

```text
Car HAS-A Engine
```

# Why use composition?

Composition allows one object to delegate responsibility to another object.

Instead of placing all logic inside `Car`, engine-related behavior stays inside `Engine`.

This usually produces smaller, more focused classes.

Composition can also be more flexible than inheritance because one object can work with different collaborating objects.

## In our demo

`CompositionDemo.java` uses a `Car` containing an `Engine`.

# 17. Static Members

A static member belongs to the class itself instead of one individual object.

# Static field

Example:

```java
static int totalObjects = 0;
```

All objects share the same variable.

Example:

```java
Counter c1 = new Counter();
Counter c2 = new Counter();
```

Both objects interact with the same:

```java
Counter.totalObjects
```

# Instance field

An instance field belongs to each object separately.

```java
int objectNumber;
```

Each object gets its own value.

# Static methods

A static method belongs to the class.

```java
static void showTotal() {
}
```

The preferred call is:

```java
Counter.showTotal();
```

A static method cannot directly use instance members because there may be no object associated with the call.

For example:

```java
static void test() {
    System.out.println(objectNumber);
}
```

would fail if `objectNumber` is an instance field.

Why?

The static method has no `this` object.

Java would not know which object's `objectNumber` you mean.

# Static initialization block

```java
static {
    System.out.println("Static initialization");
}
```

Runs when the class is initialized, generally once per class loading lifecycle.

# Instance initialization block

```java
{
    System.out.println("Instance initialization");
}
```

Runs whenever an object is created, before the constructor body.

# Static methods are hidden, not overridden

Consider:

```java
class Parent {

    static void display() {
        System.out.println("Parent");
    }
}
```

and:

```java
class Child extends Parent {

    static void display() {
        System.out.println("Child");
    }
}
```

Then:

```java
Parent reference = new Child();

reference.display();
```

prints:

```text
Parent
```

Why?

Static methods are selected based on the reference/class type rather than runtime object dispatch.

The compiler sees:

```text
reference type = Parent
```

so it binds the call to:

```java
Parent.display()
```

This is method hiding, not overriding.

# 18. `final`

The meaning of `final` depends on where it is used.

# Final variable

```java
final int number = 10;
```

You cannot reassign:

```java
number = 20;
```

The compiler rejects it.

# Final reference

```java
final StringBuilder text =
        new StringBuilder("Java");
```

You cannot assign another object:

```java
text = new StringBuilder("Python");
```

But you can modify the existing object:

```java
text.append(" Programming");
```

So:

```text
final reference
```

does not mean:

```text
immutable object
```

It means the reference cannot be reassigned.

# Final method

```java
final void display() {
}
```

A subclass cannot override it.

# Final class

```java
final class Utility {
}
```

No class can extend it.

A well-known example is:

```java
String
```

which is final.

# 19. Access Modifiers

Java provides four main access levels:

```text
public
protected
package-private
private
```

Package-private means no modifier is written.

| Modifier | Same Class | Same Package | Subclass in Different Package | Other Classes |
|---|---:|---:|---:|---:|
| `public` | Yes | Yes | Yes | Yes |
| `protected` | Yes | Yes | Yes, through inheritance rules | No |
| package-private | Yes | Yes | No | No |
| `private` | Yes | No | No | No |

# `public`

Accessible from everywhere where the class itself is visible.

```java
public int value;
```

# `private`

Accessible only inside the declaring class.

```java
private int value;
```

Commonly used for internal state.

# Package-private

No keyword is used.

```java
int value;
```

Accessible only within the same package.

# `protected`

Accessible:

- inside the same package
- inside subclasses in other packages, subject to Java's protected-access rules

`AccessModifiersDemo.java` uses multiple packages because otherwise these differences cannot be demonstrated properly.

# Compile-time behavior

Access modifiers are checked by the compiler.

If outside code tries to access:

```java
private int value;
```

the program fails compilation.

# 20. `equals()`, `hashCode()`, and `toString()`

All Java classes ultimately inherit methods from:

```java
java.lang.Object
```

Important methods include:

```text
equals()
hashCode()
toString()
```

# `==` vs `equals()`

For reference types:

```java
a == b
```

checks whether the two references point to the same object.

Example:

```java
Employee e1 = new Employee(1, "Aneesh");
Employee e2 = new Employee(1, "Aneesh");
```

Usually:

```java
e1 == e2
```

is:

```text
false
```

because two separate objects were created.

# `equals()`

`equals()` can be overridden to define logical equality.

Example:

```java
e1.equals(e2)
```

can return:

```text
true
```

if both objects contain equivalent values.

# Why override `hashCode()` too?

Hash-based collections such as:

```text
HashMap
HashSet
```

use hash codes.

Java's equality contract requires:

```text
If a.equals(b) is true,
then a.hashCode() must equal b.hashCode().
```

Therefore, when overriding `equals()`, you should normally override `hashCode()` consistently.

# `toString()`

The default object representation may look like:

```text
Employee@2f92e0f4
```

By overriding `toString()`:

```java
@Override
public String toString() {
    return "Employee{id=" + id + ", name='" + name + "'}";
}
```

printing the object becomes much more useful.

```java
System.out.println(employee);
```

can produce:

```text
Employee{id=1, name='Aneesh'}
```

# 21. Nested Classes

Java supports several forms of nested classes.

```text
Static nested class
Member inner class
Local class
Anonymous class
```

# Static nested class

Example:

```java
class Outer {

    static class Nested {
    }
}
```

Create it using:

```java
Outer.Nested nested = new Outer.Nested();
```

It does not require an `Outer` object.

Because it is static, it cannot directly access ordinary instance members of `Outer` without an `Outer` object.

# Member inner class

Example:

```java
class Outer {

    class Inner {
    }
}
```

An inner object belongs to a particular outer object.

Create it using:

```java
Outer outer = new Outer();

Outer.Inner inner = outer.new Inner();
```

An inner class can directly access instance members of its outer object.

# Local class

A local class is defined inside a method or local block.

```java
void test() {

    class Local {
    }
}
```

It can only be used within that scope.

# Anonymous class

An anonymous class creates an object with an implementation without giving the class an explicit name.

Example:

```java
Greeting greeting = new Greeting() {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
};
```

This is useful for small one-time implementations.

For functional interfaces, modern Java often uses lambda expressions instead.

# 22. How the Main OOP Concepts Connect

Consider:

```java
abstract class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    abstract void sound();
}
```

Now an interface:

```java
interface Swimmable {

    void swim();
}
```

And a concrete class:

```java
class Dog extends Animal implements Swimmable {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
```

Usage:

```java
Animal animal = new Dog("Bruno");

animal.eat();
animal.sound();
```

This example demonstrates several concepts.

## Encapsulation

```java
private String name;
```

protects the field.

```java
getName()
```

provides controlled access.

## Abstraction

The caller can write:

```java
animal.sound();
```

without needing to know how the concrete animal produces that sound.

The interface:

```java
Swimmable
```

also exposes capability without exposing implementation.

## Inheritance

```java
class Dog extends Animal
```

creates the relationship:

```text
Dog IS-A Animal
```

## Abstract class

```java
abstract class Animal
```

represents a general base type that should not be instantiated directly.

## Abstract method

```java
abstract void sound();
```

requires concrete subclasses to define the behavior.

## Method overriding

```java
Dog.sound()
```

provides the concrete implementation.

## Interface

```java
Dog implements Swimmable
```

says that a Dog supports the swimming capability.

## Polymorphism

```java
Animal animal = new Dog("Bruno");
```

allows an `Animal` reference to point to a `Dog` object.

## Compile time

The compiler verifies that:

- `Dog` is allowed to extend `Animal`
- `Dog` implements all required abstract methods
- `sound()` exists in `Animal`
- access modifiers are respected
- method signatures are valid

## Runtime

When:

```java
animal.sound();
```

executes, Java sees that the actual object is a `Dog` and runs:

```java
Dog.sound()
```

# 23. Compile Time vs Runtime Summary

This distinction explains much of Java OOP.

# Compile time

During compilation, Java checks things such as:

```text
Variable types
Method existence
Access modifiers
Method signatures
Constructor selection
Overloaded method selection
Abstract method implementation
Assignment compatibility
Override validity
```

Example:

```java
Animal animal = new Dog();

animal.fetch();
```

If `Animal` has no `fetch()` method, this fails compilation even if `Dog` contains it.

# Runtime

At runtime, the JVM deals with the actual objects that exist.

For overridden instance methods:

```java
Animal animal = new Dog();

animal.sound();
```

the JVM selects:

```java
Dog.sound()
```

because the actual object is a `Dog`.

# Simple rule

```text
Reference type usually controls:
What you are allowed to call.

Actual object type controls:
Which overridden instance method executes.
```

# 24. Most Important Distinctions

# Encapsulation vs Abstraction

```text
Encapsulation:
Bundle data and behavior and control access to internals.

Abstraction:
Expose essential operations while hiding unnecessary complexity.
```

Think:

```text
Encapsulation:
"Who can access this?"

Abstraction:
"What does the caller need to know?"
```

# Inheritance vs Polymorphism

Inheritance establishes the type relationship.

```java
class Dog extends Animal {
}
```

Polymorphism uses that relationship.

```java
Animal animal = new Dog();
```

# Abstract Class vs Inheritance

Inheritance is the mechanism.

```java
extends
```

An abstract class is a special type of parent class used within inheritance.

```java
abstract class Animal {
}
```

# Abstract Method vs Normal Method

Normal method:

```java
void eat() {
    System.out.println("Eating");
}
```

contains implementation.

Abstract method:

```java
abstract void sound();
```

declares required behavior without implementation.

# Abstract Class vs Interface

Abstract class:

```text
Shared identity
Shared state
Constructors
Common implementation
Incomplete methods
```

Interface:

```text
Contract
Capability
Multiple interfaces can be implemented
No normal object construction
```

# Overloading vs Overriding

Overloading:

```java
add(int, int)

add(double, double)
```

is selected at compile time.

Overriding:

```java
Animal.sound()

Dog.sound()
```

is selected at runtime for instance methods.

# IS-A vs HAS-A

Inheritance:

```text
Dog IS-A Animal
```

Composition:

```text
Car HAS-A Engine
```

# 25. Quick Revision Notes

```text
Class
    Blueprint used to create objects.

Object
    Instance of a class.

Reference
    Variable used to access an object.

Constructor
    Initializes an object.

this
    Refers to the current object.

this()
    Calls another constructor in the same class.

super()
    Calls a parent constructor.

Encapsulation
    Bundles data and behavior and controls access to internals.

Abstraction
    Exposes essential behavior while hiding unnecessary implementation details.

Inheritance
    Allows a child class to reuse and extend a parent class.

Polymorphism
    Allows a general reference type to represent different concrete objects.

Method Overloading
    Same method name with different parameters.
    Selected at compile time.

Method Overriding
    Child class replaces inherited instance behavior.
    Selected at runtime based on actual object.

Abstract Class
    Class that cannot be directly instantiated and may contain both concrete and abstract methods.

Abstract Method
    Method declaration without an implementation.

Interface
    Contract describing behavior a class agrees to provide.

Composition
    Builds an object using collaborating objects.

static
    Belongs to the class rather than an individual object.

final variable
    Cannot be reassigned.

final method
    Cannot be overridden.

final class
    Cannot be extended.

public
    Accessible broadly.

protected
    Accessible in same package and through subclass rules.

package-private
    Accessible within the same package.

private
    Accessible only inside the declaring class.

equals()
    Defines logical equality.

hashCode()
    Hash representation used by hash-based collections.

toString()
    Human-readable representation of an object.
```

# Final Mental Model

The easiest way to connect everything is:

```text
Class
    Defines an object.

Encapsulation
    Protects and organizes the object's internals.

Abstraction
    Gives the outside world a simpler view of the object.

Inheritance
    Creates IS-A relationships between classes.

Abstract classes
    Create partially implemented base classes.

Interfaces
    Define capabilities or contracts.

Overriding
    Allows subclasses to specialize behavior.

Polymorphism
    Allows different objects to be used through one common type.

Composition
    Creates HAS-A relationships between collaborating objects.
```

And always remember the compile-time/runtime distinction:

```text
Compile time:
Java checks whether the code is legal.

Runtime:
Java works with the actual objects that were created.
```

For polymorphism specifically:

```text
Reference type:
Determines what methods are accessible at compile time.

Actual object type:
Determines which overridden instance method executes at runtime.
```