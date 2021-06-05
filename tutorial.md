# Hello World

## Classes

Let's start with the Java File `HelloWorld.java` .

First, we have the outline of the class:

```java
public class HelloWorld {
    // Some code
    // This is a comment
}
```

*Every* Java file is a class. The class name (here, `HelloWorld`) *must* have the *same* name as the file. If your code's file name is `A.java`, and the content of your file is `public class B {}`, then you code will return an error.

By convention, class names are in UpperCamelCase (e.g. `HelloWorld`, not `helloWorld` or `hello_world`).

In Python, blocks start with a colon (`:`) and each line has an indent to indicate that it is part of the block. But in Java, indents do *not* matter (but you should still include them so your code is easy to read!). Blocks are enclosed in curly braces (`{}`). *(Note: If you block only has one line of code, you don't need to use {}. However, it is good programming practice to include {} even if the block only has one line of code!)*

There are [different coding styles for curly braces](https://en.wikipedia.org/wiki/Indentation_style). Just choose one and stick to it. Don't try to be funny and use 5 different styles in your code. 

## Access Modifiers

See the word `public` at the start of the code? That's an **access modifier/specifier**.

The two main access modifiers as `public` and `private`. (There's also `protected` and `package`, but usually you won't use them much.)

**`public`** means *any* file anywhere can access it. For example, if I create a `public` integer variable in the file `A.java`, I can also access it in `B.java`.

**`private`** means *only* the same class can access it. For example, if I create a `public` integer variable in the file `A.java`, I *cannot* access it in `B.java`. I can only access and modify the integer in `A.java`.

For obvious reasons, almost all classes are `public`. 

## Main Method

When you run a `.java` file, the `main` method gets run. (Not relevant for Android development, but still good to know if you need to debug.)

```java
public class HelloWorld {
    public static void main(String[] args) {  // can also write (String args[])
        // more code
    }
}
```

You do not need to know what the line means for now.

## Output

To output in Java, you use can use any one of the methods below:

```java
// every line must end with a semicolon (;) if you aren't starting a {} block
System.out.print("A");  // prints 'A' without a newline at the end
System.out.println("B");  // adds a newline after 'B'
System.out.println(123);  // you can print numbers and other variable types too!
```

In Android, you do not use `System.out`. Instead, you use the [`Log` class](https://www.androiddesignpatterns.com/2012/05/intro-to-android-debug-logging.html).

## Comments

```java
// This is a comment

/* This is a comment that
   can take up multiple lines */

/*
 * Usually, people put asterisks to the left of each line
 * like this, but it is not compulsory.
*/

/**
 * This is a comment for documentation.
 * Please give your methods (functions) good names
 * so that we know what they do even before we read
 * the documentation.
*/
```

For more on documentation, check out the [Tutorials Point article on Documentation Comments in Java](https://www.tutorialspoint.com/java/java_documentation.htm).

# Variables

## Primitive Data Types

```java
int i;  // declare variable
i = 0;  // assign value to variable

// the above is equivalent to:
int i = 0;
```

You *must* indicate the data type when you create a variable for the first time.

The data type of the variable can **never** be changed. 

```java
int i = 0;
i = "This is not an int";  // will return an error
```

Here are the primitive data types:

```java
// for integers (can hold negative values)
byte myByte = 1;
short myShort = 2;
int myInt = 3; 
long myLong = 100000L;  // L is used to denote that the variable is of type Long

// for floating-point numbers
float myFloat = 123.4f;  // f or F needed for floats
double myDouble = 567.8;  // has double precision of float

// booleans
boolean myBoolean = true;
boolean yourBoolean = false;
// case sensitive, all lowercase unlike Python's True and False

// characters
char myChar = 'A';
// Only one character
// Must enclose in *single* quotes (double quotes is for String)
```

By convention, variable names are typically in lowerCamelCase.

[The range for each of the primitive data types](https://programming.guide/java/primitive-ranges.html)

You can use `final` for constant variables. Then, they can't be reassigned.

```java
final double PI = 3.1416;

// you can initialise them later
final int MY_CONSTANT;
MY_CONSTANT = 123;

PI = 2;  // will return an error
```

## Operations

Like Python, Java has `+`, `-`, `*`, `/`, and `%`.  Unlike Python, Java does **not** have `//` or `**`.

If you need to do exponentiation, either use a `for` loop (slower) or use the method in the `FastExpo.java` file included in the repo.

## Conditionals

Like Python, Java has `if` statements. 

```java
int n = 5;
if (n == 7) {
    System.out.println("n = 7");
} else if (n == 5) { // else if is used instead of elif in Java
    System.out.println("n = 5");
} else {
    System.out.println("n is not 5 or 7");
}
```
Output:
`n = 5`

Alternatively, you can use switch expressions.

```java
int n = 5;
switch (n) {
    case 7:
        System.out.println("n = 7");
        break;
        // if break is not added at the end, the computer will read the next part and print out
        // n = 5 even if n is not equal to 5
    case 5:
        System.out.println("n = 5");
        break;
    default:
        System.out.println("n is not 5 or 7");
        break;
}
```
Output:
`n = 5`

Java, like Python, also has while loops. For example:
```java
// CODE SNIPPET A
int i = 2;
while (i > 0) {
    System.out.println(i);
    i--; // this is a way of writing i -= 1, both versions work in Java
}
```
Output:
`2`
`1`

A slightly different version is a do-while loop. For example:
```java
// CODE SNIPPET B
int i = 2;
do {
    // this will be executed first before (i > 0) is considered, which means that even if (i <= 0),
    // anything in this block will be run at least once.
    System.out.println(i);
    i--;
} while (i > 0);
```
Output:
`2`
`1`

Although both code snippets currently produce the same output, if we replace `int i = 2;` with `int i = 0;`, running code snippet A and B will give different outputs.
For code snippet A, i is not larger than 0, so the loop will not run at all and the output will be nothing.
For code snippet B, the loop will run once before the computer will see the while statement. Since i is not larger than 0, the loop will not repeat. The output will be:
`0`
