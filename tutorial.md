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

