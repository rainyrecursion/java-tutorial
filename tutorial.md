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

Note that `String` and arrays/lists are **not** primitive data types.

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

## Basic Operations

Like Python, Java has `+`, `-`, `*`, `/`, and `%`.  Unlike Python, Java does **not** have `//` or `**`.

If you need to do exponentiation, either use a `for` loop (slower) or use the method in the `FastExpo.java` file included in the repo.

Like Python, you can use `+=`, `-=`, etc. (e.g. `var1 *= var2 + var3;` is equivalent to `var1 = var1 * (var2 var3);`).

Note that any operation between two `int` will result in and `int`. For example, `5 / 2` return `2` (an integer) and *not* `2.5`. 

To get a floating-point result, you must cast one number to a `float` or `double`. For example:

```java
int i = 5;
int j = 2;
double k = (double) 5 / 2; 
```

For more on casting, see below.

## Increment and Decrement

Java has some shortcuts if you want to *add* by one (***in*crement**) or *subtract* by one (***de*crement**). 

The increment operator is `++`. The decrement operator is `--`.

The operator can be put before (prefix) or after (postfix) the variable. The differences are illustrated below.

```java
int i = 0;
i++;  // i == 1
++i;  // i == 2
int j = -1;
j--;  // i == -2
--j;  // i == -3

int a = i++;  // assigns i to a, THEN increment i
// i = 3
// a = 2 (value of i BEFORE incrementing)

int b = ++i;  // increment i, THEN assign new value of i to b
// i = 4
// b = 4 (value of i AFTER incrementing)

// work similarly for decrement

int c = j--;  // assigns j to c, THEN decrement j
// j = -4
// c = -3 (value of j BEFORE decrementing)

int d = --j;  // decrement j, THEN assign j to d
// j = -5
// d = -5 (value of j AFTER decrementing)
```

## Boolean Operators

Unlike Python, you can't type out the words `and`, `or`, and `not`.

The equivalents are shown below:

| Python | Java |
| ------ | ---- |
| `and`  | `&&` |
| `or`   | `||` |
| `not`  | `!`  |

## Casting

There are two types of casting in Java:

**Widening casting** which happens automatically (smaller type to larger type).

**Narrowing casting** which must be done manually (larger type to smaller type).

Primitive data types in order from smallest to largest: `byte`, `short`, `char`, `int`, `long`, `float`, `double`.

```java
int myInt = 1234;
long myLong = myInt;  // casting is automatic because long is a larger data type than int

double myDouble = 1.2;
float myFloat = (float) myDouble;  // casting must be manual because float is a smaller data type than int
float yourFloat = myDouble;  // error 
float ourFloat = 1.2;  // error, because without an 'f' or 'F' at the end, Java assumes 1.2 is a double
```

## Strings
In Java, strings are not primitive data types (like int is) and are instead objects. Some common methods used on strings are:
```java
String s = "Hello World!"; // note that String is capitalised unlike int because strings are objects
System.out.println(s.length()); // s.length() returns the number of characters in the string
System.out.println(s.charAt(0)); // s.charAt(i) returns the character in the string at position i
System.out.println(s.contains("Hello")); // s.contains(s2) returns true or false depending if s2 can be found in s
System.out.println(s.substring(6, 11)); // returns the substring that begins at 6 and ends at 10 (11 is not included)
System.out.println(s.index("o")); // returns the index of the first occurrence of "o" in s
```
Output:
```java
12
H
true
World
4
```

To convert strings to primitive data types such as integer, these methods can be used:
```java
String s = "2";
int i = Integer.parseInt(s); // similar methods can be used to convert to other numerical types i.e Double.parseDouble(s);
String s2 = i + ""; // to convert it back, use the + operator
```

In addition, since strings are objects, the `==` operator cannot be used to compare them. Instead, the method `.equals()` must be used.
```java
String dnaSeq = "TAGCGCTAG";
String dnaStart = dnaSeq.substring(0, 3);  // "TAG"
String dnaEnd   = dnaSeq.substring(6);     // "TAG"
System.out.println(dnaStart == dnaEnd);         // false
System.out.println(dnaStart.equals(dnaEnd));    // true
```
For all String methods, you can refer to [the String reference by W3Schools](https://www.w3schools.com/java/java_ref_string.asp).

More on `.equals()` will be covered later under OOP.

# Conditionals

## `if` Statements

Like Python, Java has `if` statements. 

```java
int n = 5;
if (n == 7) {
    System.out.println("n = 7");
} 
else if (n == 5) { // else if is used instead of elif in Java
    System.out.println("n = 5");
} 
else {
    System.out.println("n is not 5 or 7");
}
```
Output:
```java
n = 5
```

## `switch` `case` Statements

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
```java
n = 5
```

# Loops

## `while` Loops

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
```java
2
1
```

## `do-while` Loops

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
```java
2
1
```

Although both code snippets currently produce the same output, if we replace `int i = 2;` with `int i = 0;`, running code snippet A and B will give different outputs.

For code snippet A, i is not larger than 0, so the loop will not run at all and the output will be nothing.

For code snippet B, the loop will run once before the computer will see the while statement. Since i is not larger than 0, the loop will not repeat. The output will be:
```java
0
```

## `for` Loops

`for` Loops in Java are quite different from Python. 

Here's an example `for` loop in Python:

```python
for i in range(2, 11, 3):
    print(i)
```

The equivalent in Java would be:

```java
for (int i = 2; i < 11; i +=3) {
	System.out.println(i);
}
```

The format of a `for` loop in Java is:

```python
for (<initial>; <end-condition>; <step>) {
	// statements 
}
```

The `<initial>` statement is run once at the very start before any statements in the block are executed.

After the statements in the block are executed once, the `<end-condition>` is checked. If it is `true`, then we exit the loop. 

If it is `false`, then `<step> ` is executed before the statements in the block are run again.

# Methods

A Java method is basically a Python function. One key difference is that you *must* state the return data type of the function.

For now, all methods will be `static`. We will be covering the difference between static and non-static methods later.

Here's an example method:

```java
public static int square(int x) {
    return x * x;
}
```

Here, we indicated the return data type as `int`. We also included the data type of the parameter (input). For Java, you must indicate these.

If there is no value returned, put `void` (e.g. `main` method).

Now, let's look at another example method:

```java
public static int foo(int a, int b) {
    if (a == 0) {
        return b;
    }
    else if (a > 0) {
        return a + b;
    }
    else if (a < 0) {
        return a - b;
    }
}
```

Ohno, this returns an error! 

Now, we all know this method will return an integer, but Java doesn't. What if all `if`/`else if` conditions fail? Then nothing will be returned!

Of course, in the case above, we all know that at least one of the conditions `a==0`, `a > 0`, or `a < 0` will be satisfied. But Java isn't smart enough to be able to figure that out. 

You can fix this by changing the last `else if` to an `else`. Alternatively, since Java doesn't run any more code after the `return` statement, you can just do this:

```java
public static int foo(int a, int b) {
    if (a == 0) {
        return b;
    }
    else if (a > 0) {  // this can also just be 'if'
        return a + b;
    }
    return a - b;
}
```

## Overloading Methods

Sometimes, we may have multiple methods with the same name but different number and/or data types of parameters. For example,

```java
public static boolean isPass(int score) {
    return score >= 50;
}

public static boolean isPass(int score, int passingMark) {
    return score >= passingMark.
}

public static boolean isPass(double percentCorrect) {
    return percentCorrect >= 0.5;
}

public static void isPass() {  // notice that you can change the return type
    System.out.println("Believe in yourself!");
    System.out.println("If you work hard enough, you can pass the test!");
}
```

This is called **overloading**. It can be done by changing one or both of the following:

* data type of parameters
* number of parameters

Java will then use it's magic powers to decide which method it should run when `isPass()` is called.

If there is no method that exactly follows the parameters of any of the methods available (for example, `isPass(12L)`, where the parameter is of type `long`), then Java does Type Promotion. You can read about [type promotion for method overloading here](https://www.javatpoint.com/method-overloading-in-java).

Note that you **cannot** overload by changing the return type only. For example, the below is **not** allowed:

```java
public static int half(int a) {
    return a / 2;
}

public static double half(int a) {  // same parameter, but different return type
    return a / 2.0;
}
```



# Object Oriented Programming

## Introduction

Let's make a Java class for Animals!

```java
public class Animal {
    private String name;
    private int age;
    
    public void printName() {
        System.out.println("Name: " + name);
    }
    
    // we'll add more methods soon!
}
```

Here, the object variables are `name` and `age`. Typically, object variables are `private`. We will discuss how other classes can use the object's variables later.

Also, the object has a `printName`  method, which outputs the name of the animal. It doesn't return anything, so we indicate the return type as `void`.

## Constructors

Now, how do we make an Animal object? In Python, we have the `__init__()` method. In Java, we have **Constructors**, where the method name of the Constructor is the *same as the name of the class*. 

Now, here's the Animal class with some constructors.

```java
public class Animal {
    private String name;
    private int age;
    
    public void printName() {
        System.out.println("Name: " + name);
    }
    
    public Animal() {
        name = "Placeholder";
        age = 1;
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
	}
    
    public Animal(Animal myAnimal) {
        // this is called a copy constructor!
        name = myAnimal.name;
        age = myAnimal.age;
    }
    
    // we'll add even more methods soon!
}
```

Notice that the constructor does **not** have a return type.

Also, you can overload constructors! See above for more information about overloading!

Typically, constructors are `public`. 

Here, the `this` keyword helps us tell Java that we want to use the class's variables, and not the local variable. The keyword can also tell Java to use the class's constructor. For example:

```java
public class Animal {
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal(Animal myAnimal) {
		this(myAnimal.name, myAnimal.age); // this will send myAnimal's name and age to the above constructor Animal(String name, int age)
	}
}
```

Notice that unlike Python, there is no `self` as the first parameter of the function.

If you do not define any constructor, then Java automatically makes a blank constructor, with no parameters and nothing in the `{}` bock. For example, if you didn't define any constructor for the Animal class above, Java automatically creates:

```java
public Animal() {
	// there's nothing here
}
```

Now, let's try using our new Animal class in a new class!

```java
public class PetShop {
    public static void main(String[] args) {
        Animal defaultAnimal = new Animal();
        Animal myGoldfish = new Animal("Timmy the Goldfish", 3);
        Animal yourGoldfish = new Animal(myGoldfish);
    }   
}
```

Notice that we must use the `new` keyword to create a new object, unlike Python. 

So, we've made a bunch of animals. Cool! But... all the attributes of the animals were set to `private` earlier, so we can't do much about them :(. Well, that's why we have getters and setters!

## Getters and Setters

Getters and setters do pretty much what their names suggest.

Getters return the value of an object variable. Setters well... set the value of an object variable.

Here's an example of Getters and Setters for the Animal class. 

```java
public class Animal {
    private String name;
    private int age;
    
    // removed the earlier methods for sake of brevity
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
```

Now, let's see how we can use them in `PetShop`!

```java
public class PetShop {
    public static void main(String[] args) {
        Animal defaultAnimal = new Animal();
        Animal myGoldfish = new Animal("Timmy the Goldfish", 3);
        Animal yourGoldfish = new Animal(myGoldfish);
         
        System.out.println(defaultAnimal.name);  // has error, because name is private
        System.out.println(defaultAnimal.getName());  // outputs "Placeholder"
        defaultAnimal.setName("Timmy the Goldfish");
        System.out.println(defaultAnimal.getName());  // outputs "Timmy the Goldfish"
    }   
}
```

Now, let's try something interesting:

```java
// in main method
Animal dogA = new Animal("Doggy", 5);
Animal dogB = new Animal(dogA);
Animal dogC = dogA;

System.out.println(dogA.getAge());  // 5
System.out.println(dogB.getAge());  // 5
System.out.println(dogC.getAge());  // 5

dogA.setAge(100);
System.out.println(dogA.getAge());  // 100
System.out.println(dogB.getAge());  // 5
System.out.println(dogC.getAge());  // 100
```

Why is there a difference?

Each of the `dog` variables don't store something like `("Doggy", 5)`. Instead, they store the address of an `Animal` Object. 

The line `Animal dogA = new Animal("Doggy", 5);` creates a Animal (let's call this the "First Dog"), sets the Animal's name and age based on the code in the constructor, and now `dogA` stores a *reference* to the First Dog.

The line `Animal dogB = new Animal(dogA);` creates a *new* Animal (let's call this the "Second Dog"), sets the new Animal's name and age to be the same as the one for `dogA`, and now `dogB` stores a *reference* to the Second Dog.

The line `Animal dogC = dogA;` does **not** create any new Object. Instead, both `dogC` and `dogA` now *refence* the **same** Animal Object, the First Dog.

Thus, when we run `dogA.setAge(100);`, we are actually modifying the First Dog, which both `dogA` and `dogC` reference :O The Second Dog remains unaffected, because it is a different Object.

If you are wondering why we use private class variables and public getters & setters, [check out StackOverflow on this topic](https://stackoverflow.com/questions/1568091/why-use-getters-and-setters-accessors).

## Static vs Non-static
```java
public class Animal {
    private String name;
    private int age;
}
```
So far, we have variables to store the name and age of individual animals. But what if we want to store data that relates to all the animals in the pet shop as a whole, like the number of animals?

```java
// WRONG EXAMPLE
public class Animal {
    private String name;
    private int age;
    private int counter; // count the number of animals created
    
    public Animal(String name, int age) {
    	this.name = name;
	this.age = age;
	counter += 1; // every time an animal is created, increase the number of animals by 1
    }
    
    public int getCounter() { // getter method for variable counter
    	return counter;
    }
}
```
If we directly add this data attribute in the same way we added name and age, each animal created will have their own version of `counter` and the value of `counter` will not be the same across all animals.

```java
// in main method
Animal a = new Animal("A", 5);
Animal b = new Animal("B", 3);
System.out.println(a.getCounter() + ""); // Ideally, since 2 animals have been created, we would want counter to be 2
```
Output:
```java
1
```
This is because when Animal B is created, a new copy of counter (initialised to 0) belonging to Animal B is created and 1 is added to that, instead of the version of counter that belongs to Animal A (which is 1).

Instead, we should use the keyword `static` to indicate to the program that this variable should be uniform across all animals. Hence, while a new copy of non-static variables (in this case `name` and `age`) is formed every time an Animal is created, only one copy of the variable `counter` will be created and be used for all Animals. The keyword `static` goes after the access modifier (`private`, `public`, etc.) and before the data type of the variable. 

Besides variables, methods can also be static. Since we are making the variable `counter` static, it makes sense that the getter method for `counter` should also be static because it is accessing a static variable that is the same across all objects created from the class. The keyword `static` goes after the access modifier (`private`, `public`, etc.) and before the return type of the function.

```java
// RIGHT EXAMPLE
public class Animal {
    private String name;
    private int age;
    private static int counter; // count the number of animals created
    
    public Animal(String name, int age) {
    	this.name = name;
	this.age = age;
	counter += 1; // every time an animal is created, increase the number of animals by 1
    }
    
    public static int getCounter() { // getter method for variable counter
    	return counter;
    }
    
    public int getAge() { // used in the next code snippet
    	return age;
    }
}
```

Usually, for non-static variables and functions, we use them in the format `(object name).(variable or method name)`. However, since static variables and functions belong to all objects from that class as a whole instead of an individual object, we use them in the format `(Class name).(variable or method name)`. For example:

```java
// in main method
Animal a = new Animal("A", 5);
Animal b = new Animal("B", 3);
System.out.println("One animal's age is " + a.getAge() + " while another's is " + b.getAge());
System.out.println("Altogther, there are " + Animal.getCounter() + " animals.");
```
Output:
```
One animal's age is 5 while another's is 3.
Altogether, there are 2 animals.
```

Do note that static variables can be used in non-static methods, but non-static variables cannot be used in static methods. An example of the former is the constructor. Although the constructor is non-static and initializes the `name` and the `age` variables of animals with different values for each animal, it can still update the static variable `counter`. However, if we theoretically created a static method that used non-static variables:

```java
public class Animal {
    private String name;
    private int age;
    private static int counter; // count the number of animals created
    
    public Animal(String name, int age) { // this is allowed!
    	this.name = name;
	this.age = age;
	counter += 1; // every time an animal is created, increase the number of animals by 1
    }
    
    public static void printAge_static() { // this is NOT allowed!
    	System.out.println(age + "");
    }
    
    public void printAge_nonstatic() { // this is allowed!
    	System.out.println(age + "");
    }
}
```

This code would not compile because in the function `printAge_static`, the program doesn't know which copy of `age` belonging to which animal it should use. Meanwhile, for the function `printAge_nonstatic`, the version of the method called belongs to a certain Animal so it will use the variable of `age` belonging to that animal.

```java
// in main method
Animal a = new Animal("A", 5);
Animal b = new Animal("B", 3);
Animal.printAge_static(); // this will not work- who's age do we print? A's or B's?
a.printAge_nonstatic(); // the program will know that it should be printing A's age- 5
```

Do note that there is no output for the above two code snippets because the code will not compile in the first place.

## Parent classes
From the above code we are able to create objects of class Animal, but what if we want to specify that the pet shop has mammals and fishes, which have different attributes? We could create two separate classes:

```java
public class Mammal {
    private String name;
    private int age;
    private static int counter;
    private String furColour;
}

public class Fish {
    private String name;
    private int age;
    private static int counter;
    private String finColour; // the only different attribute
}
```

But this is inefficient because there are many repeated attributes (i.e. `name` and `age`). In addition, `counter` will no longer be able to count the number of animals in total. Instead we can use *inheritance*.

```java
public class Animal {
	protected String name;
	protected int age;
	protected static int counter;
	
	public Animal(String name, int age) {
		this.name = name;
        	this.age = age;
		counter += 1;
	}
	
	public void printName() {
		System.out.println(name);
	}
}

// in a separate file
public class Mammal extends Animal {
	private String furColour;
	// Mammal now has all the same attributes as Animal i.e. name, age, counter as well as furColor
	
	public Mammal(String name, int age, String furColour) {
		super.name = name; // the keyword super instead of this points to the name attribute from the root class Animal
		super.age = age;
		super.counter += 1;
		// Alternatively, the first 3 lines can be replaced by super(name, age) to point to the constructor in Animal
		this.furColour = furColour;
	}
}

// in a separate file
public class Fish extends Animal {
	private String finColour;
	
	public Fish(String name, int age, String finColour) {
		super(name, age);
		this.finColour = finColour;
	}
}
```

If you look at the class definition for Animal, the attributes `name`, `age` and `counter` are now `protected` instead of `private`. While `private` means that attributes created in one file cannot be accessed directly in another file, `protected` means that attributes created in one file can be accessed from files in the same package or child classes (`Mammal` and `Fish`) as well. If `private` was used instead, `super.name` would not work.

Do note that a class can only have one parent class.

Now, classes `Mammal` and `Fish` have access to the methods and attributes of class `Animal` (as long as they aren't marked with the `private` modifier. For example, we can do this:
```java
Mammal m = new Mammal("Something", 5, "brown");
m.printName();
```

But what if we want to customize the function `printName()` such that the output changes depending on whether the object is a `Mammal` or a `Fish`. We can then use the keyword `abstract`.

```java
public class Animal {
	protected String name;
	protected int age;
	protected static int counter;
	
	public Animal(String name, int age) {
		this.name = name;
        	this.age = age;
		counter += 1;
	}
	
	abstract public void printName(); // there is no implementation for this method specified
}

// in another file
public class Mammal extends Animal {
	private String furColour;
	
	public Mammal(String name, int age, String furColour) {
		super(name, age);
		this.furColour = furColour;
	}
	
	@Override // this shows that this is the customised implementation of the printName function
	public void printName() {
		System.out.println("The mammal's name is: " + super.name);
	}
}

// in another file
public class Fish extends Animal {
	private String finColour;
	
	public Fish(String name, int age, String finColour) {
		super(name, age);
		this.finColour = finColour;
	}
	
	@Override
	public void printName() {
		System.out.println("The fish's name is: " + super.name);
	}
}
```

Now, mammals and fishes have different implementations of `printName()`:
```java
Mammal m = new Mammal("Doggy", 5, "brown);
Fish f = new Fish("Goldfish", 3, "red");
m.printName();
f.printName();
```
Output:
```
The mammal's name is Doggy
The fish's name is Goldfish
```

As of now, we can still create an object of type `Animal`.
```java
Animal a = new Animal("Doggy", 3);
```

But what if we don't want users to be able to create an object of class Animal because that's too vague? And instead they must specify whether the object is a Mammal or a Fish? We can also add the keyword `abstract` to the class Animal.

```java
public abstract class Animal {
	// insert attributes and methods here...
}
```

## Interfaces

Earlier we mentioned that a class can only have one parent class. But what if a class has similar attributes/functions with 2 classes? For example, what if we have a function `layEgg()` that simulates the animal laying an egg? Fishes would have access to this function, however there is a certain mammal that also should have access to this function- the platypus. The class definition for Platypus is below:

```java
public class Platypus extends Mammal {
	public Platypus(String name, int age, String furColour) {
		super(name, age, furColour);
	}
}
```

Although `Platypus` shares characteristics with both classes `Mammal` (both have attribute `furColour`) and `Fish` (both have function `layEgg()`), it cannot be a child class of both. It also should not be a child class of both, as a platypus is a mammal, not a fish. Instead of making `Fish` a parent class of `Platypus`, we should use an interface.

```java
public Interface canLayEggs {
	public void layEgg();
}
```

Interfaces are like abstract classes, except all methods within the interface are abstract by default. Unlike classes, you can have a child class implement multiple interfaces.

```java
public class Platypus extends Mammal implements canLayEggs {
	// note that now that Mammal has a subclass, all its attributes should be protected instead of private
	public Platypus(String name, int age, String furColour) {
		super(name, age, furColour);
	}
	
	@Override
	public void layEgg() {
		System.out.println("The platypus has laid an egg!");
	}
}

public class Fish extends Animal implements canLayEggs {
	private String finColour;
	
	public Fish(String name, int age, String finColour) {
		super(name, age);
		this.finColour = finColour;
	}
	
	@Override
	public void layEgg() {
		System.out.println("The fish has laid an egg!");
	}
}
```
```java
// in main method
Platypus p = new Platypus("Perry", 4, "blue");
Fish f = new Fish("Betta", 3, "purple");

p.layEgg();
f.layEgg();
```
Output:
```java
The platypus has laid an egg!
The fish has laid an egg!
```

## Tips and Tricks

Most IDEs can help to generate constructors, getters, and setters for you. [Here are the instructions on how to do this on IntelliJ IDEA](https://www.jetbrains.com/help/idea/generating-code.html). It's similar in Android Studio.

One alternative is to use Kotlin classes. A quick (about) 40-second introduction of Kotlin classes can be seen from [this video from Google I/O 2018](https://youtu.be/6P20npkvcb8) (timestamps: 2:20 to 3:00). [Here is the full documentation for Kotlin classes](https://kotlinlang.org/docs/classes.html).

# Importing stuff

Like Python, you can import stuff.

Unlike Python, all import statements in Java must be at the *start* of your code, *before* the `public class SomeClassName {` line.

Stuff like Strings is in `java.lang` (to be specific, `java.lang.String`). Anything in `java.lang` is automatically imported.

Let's say you want to do some random number stuff. You'll need `java.util.Random`.  (We'll cover more on the Random class later.) You can import this in two ways:

```java
import java.util.Random;  // only imports the Random stuff
import java.util.*;  	  // imports everything in java.util.*

// unfortunately, you cannot do 'import *;' lol

public class SomeClass {
    // write cool stuff here!
    // you can't import stuff here though
}
```

Instead of importing, you can directly enter the whole thingy in your code. For example, if you want to make a Random object without any import statements, you can do it in this way:

```java
java.util.Random randomObject = new java.util.Random();
```

This might seem really clunky, but it can be helpful if [you have multiple classes with the same name](https://stackoverflow.com/questions/2079823/importing-two-classes-with-same-name-how-to-handle).

To see all the stuff you can import, check out the [official Java 8 API](https://docs.oracle.com/javase/8/docs/api/). 

# Arrays

Unlike Python's lists, Java Arrays have two important restrictions:

1. All elements in the Array must be of the *same* data type.
2. The size (i.e. no. of elements) in the Array is *fixed* and cannot be changed.

In Java, Arrays are Objects.

Here are a few different ways you can create arrays:

```java
String[] anArrayWithFiveStrings = new int[5];  // no. in [] is the array size
int[] smallEvenNumbers = {0, 2, 4, 6};
```

The length of an the array can be taken using the `length` property. For example:

```java
System.out.println(smallEvenNumbers.length);  // 4 
// note that there's no '()' after 'length'!
```

Like Python, you can access elements in the array using `[index]` (e.g. `int myVar = smallEvenNumbers[2];`).

However, unlike Python, you cannot access subarrays using something like `arr[1:4]`. Use a `for` loop instead.

Speaking of `for` loops, you probably remember that in Python, you can do something like:

```python
my_list = [3, 1, 4, 1, 5, 9]
for i in my_list:
    print(i)
```

Java has an equivalent, called a `for`-each loop! The equivalent of the Python code above in Java would be:

```java
int[] myList = {3, 1, 4, 1, 5, 9};
for (int i: myList) {
    System.out.println(i);
}
```

You can also create multi-dimensional arrays (i.e. an array of arrays). For example:

```java
int[][] grid = { {1, 2, 3}, {-1, -2, -3, -4} };
```

[There is a quick summary of built-in Java Array method at the bottom of this page.](https://www.tutorialspoint.com/java/java_arrays.htm)

# ArrayList

Now, say you wanted to change the sign of a list, like a Python list.

Well, that's where ArrayList comes in!

First, you need to import `java.util.ArrayList`.

Here's how you create an ArrayList:

```java
ArrayList<DataType> myArrayList = new ArrayList<DataType>();
ArrayList<DataType> myArrayList = new ArrayList<>();  // Java is smart, you can omit DataType in the constructor
ArrayList<String> exampleAL = new ArrayList<>();
```

Note that unlike Java Arrays and Python Lists, you do not access elements in the list using `[index]`.

Also, elements in an ArrayList must be an Object and **not** of primitive data types. If you want to make an ArrayList of, say, `int`s, then you need to use the wrapper class `Integer`.

Here are a few basic ArrayList methods:

```java
exampleAL.add("Hello");  // adds to the end, similar to Python's append
exampleAL.get(0);  // parameter is index number, similar to array[index]
exampleAL.set(0, "World");  // similar to array[0] = "World"
exampleAL.remove(0);  // removes element at index number
exampleAL.size();   // similar to Java array.length and Python len(myList)

for (String s: exampleAL) {
    // you can use for-each loops for ArrayLists too!
}
```

[You can see a list of all ArrayList methods here.](https://www.programiz.com/java-programming/library/arraylist)

# Random Class

To use the Random class, you need to import `java.util.Random`.

It helps you generate (pseudo)random numbers.

Refer to `RandomExample.java` for an example of how to use the various methods in the class.

Refer to the [official Java documentation for `java.util.Random`](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html) for full details on all methods.

