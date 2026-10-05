# Java Basics - Theory Notes

This repository covers core Java basics through small practice programs.

Programs covered:

1. `HelloJava.java`
2. `VariablesDemo.java`
3. `DataTypesDemo.java`
4. `TypeCastingDemo.java`
5. `OperatorsDemo.java`
6. `ConditionalDemo.java`
7. `LoopsDemo.java`
8. `MethodsDemo.java`
9. `PassByValueDemo.java`
10. `InputOutputDemo.java`

# 1. HelloJava.java

A basic Java program:

```java
public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

## Program Structure

### `public class HelloJava`

- `class` defines a class.
- `HelloJava` is the class name.
- Java code is generally written inside classes.
- A public class should have the same name as its file.
- Names are case-sensitive: `HelloJava` and `helloJava` are different.
- `package` groups related classes; `import` lets you use a type's short name.

```text
HelloJava.java
```

### `public static void main(String[] args)`

The `main()` method is the entry point of a standard Java application.

- `public` - accessible by the JVM.
- `static` - belongs to the class, so no object is needed to call it.
- `void` - does not return a value.
- `main` - method where execution starts.
- `String[] args` - stores command-line arguments.

Example:

```bash
java HelloJava Aneesh
```

Then:

```java
args[0]
```

contains `"Aneesh"`.

Check `args.length` before accessing an argument; the array can be empty.

## `System.out.println()`

```java
System.out.println("Hello, Java!");
```

- `System` - built-in Java class.
- `out` - standard output stream.
- `println()` - prints output and moves to the next line.

`print()` does not automatically move to a new line.

## Compile and Run

Compile:

```bash
javac HelloJava.java
```

Run:

```bash
java HelloJava
```

Flow:

```text
.java source file
      |
    javac
      |
      v
.class bytecode
      |
     JVM
      |
      v
   Output
```

Important terms:

- JDK - Java Development Kit
- `javac` - Java compiler
- JVM - Java Virtual Machine
- Bytecode - compiled Java instructions

# 2. VariablesDemo.java

Java variables can mainly be divided into:

- Local variables
- Instance variables
- Static variables

## Local Variables

Declared inside a method or block.

```java
int x = 10;
```

Key points:

- Exists only inside its scope.
- Must be initialized before use.
- Does not receive a default value.

## Instance Variables

Declared inside a class but outside methods.

```java
class Person {
    int age;
}
```

They belong to objects.

```java
Person p1 = new Person();
Person p2 = new Person();

p1.age = 20;
p2.age = 30;
```

Each object has its own copy.

## Static Variables

A static variable belongs to the class.

```java
class Person {
    static String species = "Human";
}
```

It is normally accessed as:

```java
Person.species
```

All objects share the same static variable.

- No object is needed because the variable belongs to the class.
- Its initializer runs once when the class is initialized, not for each object.
- Its value can change; every object shares the updated value.
- A static method needs an object to access instance fields or methods.

`final` prevents reassignment; `static final` is commonly used for constants.

## Comparison

| Type | Belongs To | Default Value |
|---|---|---|
| Local | Method/block | No |
| Instance | Object | Yes |
| Static | Class | Yes |

Remember:

```text
Local    -> method/block
Instance -> object
Static   -> class
```

Common default values for instance and static variables:

| Type | Default |
|---|---|
| `int` | `0` |
| `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| Reference | `null` |

# 3. DataTypesDemo.java

Java data types are mainly divided into:

```text
Data Types
|
|-- Primitive Types
|
|-- Reference Types
```

## Primitive Types

Java has eight primitive types:

| Type | Size | Example |
|---|---|---|
| `byte` | 8 bits (1 byte) | `byte x = 100;` |
| `short` | 16 bits (2 bytes) | `short x = 30000;` |
| `int` | 32 bits (4 bytes) | `int x = 100000;` |
| `long` | 64 bits (8 bytes) | `long x = 9000000000L;` |
| `float` | 32 bits (4 bytes) | `float x = 3.14F;` |
| `double` | 64 bits (8 bytes) | `double x = 3.14159;` |
| `char` | 16 bits (2 bytes) | `char x = 'A';` |
| `boolean` | Storage size not specified by Java | `boolean x = true;` |

1 byte = 8 bits. These are primitive value sizes, not total object memory sizes.

### Integer Types

```text
byte
short
int
long
```

They differ mainly in the range of values they can store.

These types are signed: an n-bit integer ranges from -2^(n-1) to 2^(n-1)-1. `byte` ranges from -128 to 127.

Integer literals default to `int`; use `L` for a `long` literal.

### Floating-Point Types

```text
float
double
```

`double` provides more precision.

Both store approximate decimals; `0.1 + 0.2` may not equal `0.3` exactly.

Decimal literals are treated as `double` by default, so `float` usually needs `F`.

```java
float value = 3.14F;
```

### `char`

Stores one UTF-16 code unit (0–65535); some characters, such as many emoji, need two `char` values.

```java
char grade = 'A';
```

Characters use single quotes, while strings use double quotes.

### `boolean`

Stores:

```text
true
false
```

Commonly used in conditions.

## Reference Types

Reference types refer to objects.

Examples:

- `String`
- Arrays
- Objects
- Classes
- Wrapper classes

Example:

```java
String name = "Aneesh";
int[] numbers = {10, 20, 30};
```

Reference variables can contain `null`.

```java
String name = null;
```

Primitive variables cannot contain `null`.

Accessing an instance field or calling an instance method through `null` throws `NullPointerException`.

# Wrapper Classes

Wrapper classes are object versions of primitive types.

| Primitive | Wrapper |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

Example:

```java
int x = 10;
Integer y = 10;
```

`x` is a primitive, while `y` is an object.

Wrappers are useful when Java requires objects, such as collections:

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

## Boxing

Primitive to wrapper:

```java
int x = 10;
Integer y = x;
```

```text
int -> Integer
```

When Java does this automatically, it is called autoboxing.

## Unboxing

Wrapper to primitive:

```java
Integer x = 10;
int y = x;
```

```text
Integer -> int
```

Unboxing `null` throws `NullPointerException`.

## Parsing

Wrapper classes can convert strings into primitive values.

```java
int number = Integer.parseInt("123");
double value = Double.parseDouble("12.5");
```

Invalid or out-of-range text throws `NumberFormatException`.

# 4. TypeCastingDemo.java

Type casting means converting a value from one data type to another.

## Widening Casting

Converts a smaller type into a larger compatible type.

Java performs widening automatically.

```java
int x = 10;
double y = x;
```

```text
int -> double
```

Typical widening order:

```text
byte -> short -> int -> long -> float -> double
```

Widening needs no cast, but conversions such as `int` to `float` or `long` to `double` can lose precision.

## Narrowing Casting

Converts a larger type into a smaller type.

It requires an explicit cast.

```java
double x = 99.99;
int y = (int) x;
```

Result:

```text
99.99 -> 99
```

The decimal portion is lost.

Floating-point to integer casts truncate toward zero: `(int) -3.9` is `-3`.

## Numeric Promotion

Java automatically promotes smaller numeric types during arithmetic.

```java
byte a = 10;
byte b = 20;

int result = a + b;
```

Even though both variables are `byte`, the result is an `int`.

Arithmetic also promotes `short` and `char` to `int`; mixed operands usually use the wider numeric type.

## Overflow

Overflow occurs when a number exceeds the maximum value a type can store.

```java
int max = Integer.MAX_VALUE;

System.out.println(max + 1);
```

Instead of becoming a larger number, the value wraps around to a negative number.

## Precision Loss

Converting from a more precise type to a less precise type can lose information.

```java
double value = 123.987654;
float result = (float) value;
```

The `float` may not preserve all decimal digits.

# 5. OperatorsDemo.java

Operators perform operations on values and variables.

## Arithmetic Operators

| Operator | Meaning |
|---|---|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Remainder |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a % b);
```

Integer division removes the decimal part.

Use a floating-point operand for decimal division: `10 / 3.0`. Integer division by zero throws `ArithmeticException`.

```java
10 / 3
```

produces:

```text
3
```

## Relational Operators

Used to compare values.

```text
>
<
>=
<=
==
!=
```

They produce a boolean result.

For references, `==` compares object identity; use `.equals()` to compare string contents.

```java
10 > 5
```

returns:

```text
true
```

## Logical Operators

Used with boolean expressions.

| Operator | Meaning |
|---|---|
| `&&` | AND |
| `||` | OR |
| `!` | NOT |

Example:

```java
age >= 18 && age < 65
```

## Bitwise Operators

Operate directly on binary bits.

Common operators:

```text
&
|
^
~
<<
>>
>>>
```

`>>` preserves the sign bit; `>>>` fills the left side with zeros.

Example:

```java
5 & 3
```

Binary:

```text
5 = 0101
3 = 0011
```

AND:

```text
0101
0011
----
0001
```

Result:

```text
1
```

## Short-Circuit Operators

`&&` and `||` use short-circuit evaluation.

For:

```java
false && someMethod()
```

Java does not execute `someMethod()` because the complete expression is already known to be false.

For:

```java
true || someMethod()
```

Java does not execute the second condition because the expression is already true.

With booleans, `&` and `|` evaluate both sides.

## Precedence and Updates

- `*`, `/`, `%` run before `+`, `-`; use parentheses to make the order clear.
- `=` assigns; `==` compares. `+=` updates a variable in place.
- `++x` increments before giving the value; `x++` gives the old value first.

# 6. ConditionalDemo.java

Conditional statements allow a program to make decisions.

## `if`

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

The block runs only if the condition is true.

## `if / else`

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

## `else if`

Used when multiple conditions need to be checked.

```java
if (age < 18) {
    System.out.println("Minor");
} else if (age < 65) {
    System.out.println("Adult");
} else {
    System.out.println("Senior");
}
```

## Traditional `switch`

Useful when one value is compared with several cases.

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid");
}
```

`break` prevents execution from continuing into the next case.

## Switch Expression

Modern Java supports switch expressions.

```java
String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 6, 7 -> "Weekend";
    default -> "Invalid";
};
```

A switch expression can directly return a value.

It must cover every possible input, often with `default`. Arrow cases do not fall through; use `yield` to return a value from a case block.

## Ternary Operator

A compact form of `if/else`.

```java
String result = number % 2 == 0 ? "Even" : "Odd";
```

Structure:

```text
condition ? valueIfTrue : valueIfFalse
```

# 7. LoopsDemo.java

Loops repeat code.

## `for` Loop

Useful when the number of repetitions is known.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Structure:

```text
initialization
condition
update
```

## `while` Loop

Runs while a condition remains true.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

The condition is checked before every iteration.

## `do-while` Loop

```java
do {
    // code
} while (condition);
```

The body executes at least once because the condition is checked afterward.

## Enhanced `for` Loop

Used to iterate through arrays or collections.

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
```

Reassigning `number` does not change the array element; use an index to replace it.

## `break`

Stops the loop immediately.

```java
if (i == 5) {
    break;
}
```

## `continue`

Skips the current iteration and continues with the next one.

```java
if (i == 3) {
    continue;
}
```

# 8. MethodsDemo.java

A method is a reusable block of code that performs a task.

## Basic Method

```java
static int add(int a, int b) {
    return a + b;
}
```

Calling it:

```java
int result = add(10, 20);
```

## Parameters

Parameters are values received by a method.

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

`name` is a parameter.

In `greet("Aneesh")`, `"Aneesh"` is the argument supplied by the caller.

Overloading uses the same method name with different parameter lists; a different return type alone is not enough.

## Return Values

A method can return a value.

```java
static int add(int a, int b) {
    return a + b;
}
```

The return type here is `int`.

`return` ends the current method immediately.

A method that returns nothing uses:

```java
void
```

## Varargs

Varargs allow a method to receive a variable number of arguments.

```java
static int sum(int... numbers) {
    int total = 0;

    for (int number : numbers) {
        total += number;
    }

    return total;
}
```

It can be called as:

```java
sum(10, 20);
sum(10, 20, 30, 40);
```

Inside the method, `numbers` behaves like an array.

Only one varargs parameter is allowed, and it must be last. Zero arguments are also allowed.

## Scope

Variables declared inside a method exist only within that method.

```java
static void test() {
    int x = 10;
}
```

`x` cannot be accessed outside `test()`.

## Recursion

Recursion occurs when a method calls itself.

Example factorial:

```java
static int factorial(int n) {

    if (n <= 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

For:

```text
factorial(5)
```

the calls are:

```text
5 * factorial(4)
5 * 4 * factorial(3)
5 * 4 * 3 * factorial(2)
5 * 4 * 3 * 2 * factorial(1)

= 120
```

A recursive method needs a base case to stop recursion.

Too many nested calls can cause `StackOverflowError`.

# 9. PassByValueDemo.java

Java is always pass-by-value.

This means Java passes a copy of a value into a method.

## Primitives

```java
int number = 10;
change(number);
```

If the method changes its parameter:

```java
static void change(int number) {
    number = 100;
}
```

the original variable remains:

```text
10
```

because the method received a copy.

## Objects

For an object variable, Java passes a copy of the reference.

```java
Person person = new Person("Aneesh");
```

Conceptually:

```text
person
  |
  v
Person object
```

When passed to a method:

```text
original reference ----\
                        -> same object
copied reference ------/
```

Both references point to the same object.

Therefore, the method can modify the object:

```java
person.name = "John";
```

The original object will show the changed name.

## Reference Reassignment

If the method does:

```java
person = new Person("Mike");
```

only the copied reference changes.

The original reference still points to the original object.

So:

```text
Object mutation       -> visible outside method

Reference reassignment -> not visible outside method
```

Important rule:

```text
Java is always pass-by-value.
```

For objects, the value being copied is the reference.

# 10. InputOutputDemo.java

Java can read console input using the `Scanner` class.

First import it:

```java
import java.util.Scanner;
```

Create a scanner:

```java
Scanner scanner = new Scanner(System.in);
```

## Reading Strings

```java
String name = scanner.nextLine();
```

## Reading Integers

```java
int age = scanner.nextInt();
```

## Reading Decimal Values

```java
double salary = scanner.nextDouble();
```

## Converting Strings

String to integer:

```java
int number = Integer.parseInt("123");
```

String to double:

```java
double number = Double.parseDouble("12.5");
```

## Invalid Input

If the user enters text when Java expects a number, `Scanner` can throw an `InputMismatchException`.

Example:

```java
import java.util.InputMismatchException;

try {

    int age = scanner.nextInt();

} catch (InputMismatchException e) {

    System.out.println("Invalid input.");
}
```

Use `hasNextInt()` to check first; after invalid input, consume the bad token with `next()` before retrying.

## Closing Scanner

After using it:

```java
scanner.close();
```

Closing this scanner also closes `System.in`; do it only when console input is finished.

## `nextInt()` and `nextLine()`

One common Scanner issue occurs when mixing:

```java
nextInt()
```

and:

```java
nextLine()
```

`nextInt()` reads the number but leaves the newline character behind.

Sometimes you need:

```java
scanner.nextLine();
```

to consume that leftover newline before reading another full line.

# Quick Revision

## Program Structure

```text
Class
|
+-- Methods
    |
    +-- Statements
```

## Variables

```text
Local    -> method/block
Instance -> object
Static   -> class
```

## Data Types

```text
Primitive
    byte
    short
    int
    long
    float
    double
    char
    boolean

Reference
    String
    Arrays
    Objects
    Wrapper Classes
```

## Type Conversion

```text
Widening  -> smaller type to larger type
Narrowing -> larger type to smaller type
```

## Wrappers

```text
Primitive -> Wrapper = Boxing
Wrapper -> Primitive = Unboxing
```

## Conditions

```text
if
if/else
else if
switch
switch expression
ternary operator
```

## Loops

```text
for
while
do-while
enhanced for
break
continue
```

## Methods

```text
Parameters
Return values
Varargs
Scope
Recursion
```

## Java Parameter Passing

```text
Java = pass-by-value

Primitive -> copy of primitive value
Object    -> copy of reference
```

## Console Input

```text
Scanner
nextLine()
nextInt()
nextDouble()
```

## Compile and Run

Compile:

```bash
javac FileName.java
```

Run:

```bash
java ClassName
```
