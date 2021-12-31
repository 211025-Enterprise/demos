## Java Basics
* What is Java? / Why Java?
  * A high-level OOP language with rich API libraries, widely used around the world, supported by Oracle. Write once run anywhere (WORA), static types, compiled language
* What is JRE / JDK / JVM?
  * JVM - Java virtual machine. Runs compiled Java code
  * JRE - Java runtime environment. Contains the JVM.
  * JDK - Java developer kit. Has a compiler, debugger, etc. Contains JRE and JVM.
* What is an object / class?
  * Class is a blueprint for an object
* What is the root class from which every class extends?
  * The `Object` class
* What are the primitive data types in Java?
  * boolean, byte, short, int, long, float, double, char
* Where are Strings stored?
  * In the String pool in the heap
* Explain stack vs heap?
  * Heap is where objects are stored in memory. Stack is where local variable references are kept - a new stack is created for each method invocation
* What are annotations?
  * A type of syntactic metadata added to the code, read by the compiler - use `@` syntax
* What is a POJO? What is a bean?
  * POJO - plain old Java object. Any Java object that you create.
  * Bean - a POJO that has private data members, public getters/setters, and overrides `.hashcode()`, `.equals()`, and `.toString()` methods
* How can you force garbage collection in Java?
  * Garbage collection cannot be forced but only requested using `System.gc()`.
* Why are strings immutable in java?
  * Identical String literals are collected in the "String pool" in an effort to conserve memory. Reference variables will then point to the same String object instance. Changing the object's state in the String pool will make changes to all references to that String object. Instead, when a change to a String is made, the JVM makes a new String object, and the reference variable points to the new String in the String pool.
* What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
  * Strings are immutable.  Both `StringBuilder` and `StringBuffer` are mutable.  Furthermore, `StringBuffer` is sychronized while `StringBuilder` is not.
* What are the access modifiers in Java? Explain them.
  * `public`  - can be accessed from any package.
  * `private` - only members of the same class can access.
  * `protected` - can be accessed by classes inside the package and subclasses anywhere.
  * `default` - no access by classes or subclasses outside the package
* What are the non-access modifiers in Java?
  * `static`, `final`, `abstract`, `default`, `synchronized`, `transient`, 
  * obscure keywords: `volatile`, `native`, `strictfp`
* What is the difference between `static` and `final` variables?
  * `static` variables are shared by all the instances of objects and it has only single copy. A `final` variable is a constant and it cannot be changed. However, if the variable holds a reference to an object, the state of the object may still be changed and manipulated.
* What are the default values for all data types in Java?
  * Objects - `null`
  * int, short, byte, long, float, double - 0
  * boolean - `false`
  * char - 'u0000' (null character)
* What is a wrapper class?
  * Wrapper class is a wrapper around a primitive data type. It represents primitive data types in their corresponding class instances e.g. a boolean data type can be represented as a `Boolean` class instance. All of the primitive wrapper classes in Java are immutable i.e. once assigned a value to a wrapper class instance cannot be changed further.
* What is autoboxing / unboxing?
  * Auto-boxing is the automatic conversion of primitives to their wrapper classes by the compiler. Useful for adding primitives to collections
* Is Java pass-by-value or pass-by-reference?
  * Java is strictly pass by value. Even when object references are passed as arguments, it is the value of the reference that is passed
* What makes a class immutable?
  * Declare the class as `final` so it can't be extended.
  * Make all fields `private` so that direct access is not allowed.
  * Don't provide setter methods for variables.
  * Make all mutable fields final so that it's value can be assigned only once.
  * Initialize all the fields via a constructor performing deep copy.
  * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
* If two objects are equal, do they have the same hashcode? If not equal?
  * If two objects have the same hashcode then they are NOT necessarily equal. But if objects are equal, then they MUST have same hashcode.
* What data types are supported in switch statements?
  * `String`, `int`, `char`, `short`, `byte`, `enums`
* List all non-access modifiers?
  * `static`, `final`, `abstract`, `default`, `synchronized`, `transient`, `volatile`, `native`, `strictfp`
* How to pass multiple values with a single parameter into a method?
  * Use varargs
* Can we access static/non-static variables from static/non-static methods (see example)?
```java
public class A {
  public static int x = 1;
  public int y = 2;

  public static void doStuff() {
    System.out.println(y);
  }

  public void doMoreStuff() {
    System.out.println(x);
  }
}
```
* What is static block?
  * Used for static initialization. Executed only once - upon creation of first object of class or access to static method of class
* What is static imports?
  * Importing a static method or variable from a class - syntax: `import static`
* What methods are available in the Object class?
  * `.clone`, `.hashcode`, `.equals`, `.toString`
* How would you clone an object?
  * First, tag the class with the `Cloneable` marker interface. Next, invoke `clone()`. The clone method is declared in `java.lang.Object` and does a shallow copy.
* What is the difference between `==` and `.equals()`?
  * `==` -  tests to see if two reference variables refer to the exact same instance of an object.
  * `.equals()` - tests to see if the two objects being compared to each other are equivalent, but they need not be the exact same instance of the same object.
* What is an enhanced for loop and what is a `forEach` loop?
  * Enhanced for loop allows easier traversal of Collections (actually any arrays or `Iterable`s) - syntax: `for (Object o : collection) {...}`
* What are 3 usages of `super` keyword?
  * to refer to immediate parent class instance variable.
  * `super()` is used to invoke immediate parent class constructor (also can pass params)
  * to invoke immediate parent class method.
  
## OOP
* What are the 4 pillars of OOP / Explain each?
  * Abstraction - Hiding implementation details
  * Polymorphism - Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class. An object can also be referenced by its supertype "parent" class, for example `ParentClass obj = new SubClass()`;
  * Inheritance - A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).
  * Encapsulation can be described as a protective barrier that prevents the code and data being randomly accessed by other code defined outside the class. Access to the data and code is tightly controlled by an interface.
* Is this allowed? Is this an example of method overloading or overriding?
  * Overriding. This is an example of covariant return types: a method is allowed to return objects that are child classes of the return type. Also, when overriding a method, the return type of the new method can be a child class of the original return type
```java
public abstract class Super {
  public abstract Collection getCollection();
}

public abstract class Sub extends Super {
  public abstract List getCollection();
}
```
* What is the difference between an abstract class and an interface?
  * An abstract class can have both concrete and abstract methods whereas an interface must have only abstract methods if any (unless the default keyword is used). Interface methods are implicitly public and abstract, interface variables are implicitly public, static, and final, but these do not apply in abstract classes. Neither can be instantiated
* What are the implicit modifiers for interface variables?
  * public static final
* What is the difference between method overloading and overriding?
  * Method overriding - In a subclass when one declares an identical method from the superclass, this method overrides the one in the superclass.
  * Method overloading - Within the same class when one declares more than method with the same name but different signature (parameters).
* Can you overload / override a main method? static method? a private method? a default method? a protected method?
  * Main method - overload, cannot override b/c is static method.
  * Static method - overload, cannot override b/c belongs to class (not inherited).
  * Private method - overload, cannot override b/c doesn't get inherited.
  * Default method - both.
  * Protected method - both (override if inherited). 
*  Explain the difference
```java
List<String> mylist = new ArrayList<>();
ArrayList<String> list2 = new ArrayList<>();
```
* Difference between extends and implements?
  * Extends is for classes, implements is for implementing interfaces
* What are enumerations (enums)?
  * A special Java type that defines a collection of constants
* What are the implicit modifiers for interface variables / methods?
  * methods - public abstract; variables - public static final
* First line of constructor?
  * The compiler will insert `super()` as the first line - it cannot be used anywhere else in constructor except for the first line
* Can you instantiate this class? Why or why not?
```java
public class Hello {}
```

## Collections / Generics
* What are collections in Java?
  * A general data structure that contains Objects. Also the name of the API
* What are the interfaces in the Collections API?
  * Iterable, Collection, List, Queue, Set, Map, SortedSet, SortedMap
* What is the difference between a `Set` and a `List`?
  * `Set` does not allow duplicates (its members are unique)
* What is the difference between a `Array` and an `ArrayList`?
  * An array is static and its size cannot be changed, but an ArrayList can grow/shrink
* What is the difference between `ArrayList` and `Vector`?
  * `Vector` is synchronized whereas `ArrayList` is not.
* What is the difference between `TreeSet` and `HashSet`?
  * The two general purpose `Set` implementations are `HashSet` and `TreeSet`. `HashSet` is much faster (constant time versus log time for most operations) but offers no ordering guarantees.
* What is the difference between HashTable and HashMap?
  * `Hashtable` is synchronized whereas `Hashmap` is not.
  * `Hashmap` permits `null` values and the `null` key.
* Are Maps in the Collections API?
  * Yes, but they do not implement `Collection` or `Iterable` interfaces
* What happens here?
```java
List<String> mylist = new ArrayList<>();
mylist.add("hello");
mylist.add(new Person()); // what happens?
```
* What are generics? What is the diamond operator (`<>`)?
  * A way of specifying a type within a data structure - they enforce type safety. `<>` operator lets you infer generic types from the LHS of assignment operation


## Exceptions
* What is the difference between `final`, `.finalize()`, and `finally`?
  * `final`: final keyword can be used for class, method and variables. A final class cannot be subclassed and it prevents other programmers from subclassing a secure class to invoke insecure methods. A final method can't be overridden. A final variable can't change from its initialized value.
  * `finalize()`: finalize method is used just before an object is destroyed and called just prior to garbage collection.
  * `finally`: finally, a key word used in exception handling, creates a block of code that will be executed after a `try/catch` block has completed and before the code following the `try/catch` block. The `finally` block will execute whether or not an exception is thrown. For example, if a method opens a file upon exit, then you will not want the code that closes the file to be bypassed by the exception-handling mechanism. This finally keyword is designed to address this contingency.
* `throw` vs `throws` vs `Throwable`?
  * `Throwable` - the root interface of exceptions, allow a class to be "thrown"
  * `throws` - keyword in method signature after params that declare which exception the method might throw
  * `throw` - the keyword that will actually "throw" an exception in code
* What is try-with-resources? What interface must the resource implement to use this feature?
  * Try-with-resources allows for automatically closing resources in a try/catch block using `try(resource) {...}` syntax. Must implement the `AutoCloseable` interface
* Do you need a catch block? Can have more than 1? Order of them?
  * Catch block is not necessary - try/finally will compile. You can have more than one catch block, but the order must be from most narrow exception to most broad/general.
* What is base class of all exceptions? What interface do they all implement?
  * The base class is `Exception`, which implements the `Throwable` interface
* List some checked and unchecked exceptions?
  * Checked - `IOException`, `ClassNotFoundException`, `InterruptedException`
  * Unchecked - `ArithmeticException`, `ClassCastException`, `IndexOutOfBoundsException`, `NullPointerException`
* Multi-catch block - can you catch more than one exception in a single catch block?
  * Yes, use the `|` operator
* Is this an example of a checked or unchecked exception?
```java
public class MyException extends RuntimeException {}
```

## JUnit
* What is JUnit?
  * A Java unit testing framework for testing code - use it for TDD
* What is TDD?
  * Test-driven development - write unit tests before application code, then write code to make tests pass. Repeat this process until functionality is complete.
* What are the annotations in JUnit? Order of execution?
  * BeforeClass, AfterClass, Before, After, Test, Ignore
* Give an example of a test case?
  * Adding two numbers, check that the method returns the sum


## IO / Serialization
* How do you serialize / deserialize an object in Java?
  * Step 1: An object is marked serializable by implementing the `java.io.Serializable` interface, which signifies to the underlying API that the object can be flattened into bytes and subsequently inflated in the future.
  * Step 2: The next step is to actually persist the object. That is done with the `java.io.ObjectOutputStream` class. That class is a filter stream--it is wrapped around a lower-level byte stream (called a node stream) to handle the serialization protocol for us. Node streams can be used to write to file systems or even across sockets. That means we could easily transfer a flattened object across a network wire and have it be rebuilt on the other side!
  * To restore the object back, you use `ObjectInputStream.readObject()` method call. The method call reads in the raw bytes that we previously persisted and creates a live object that is an exact replica of the original. Because `readObject()` can read any serializable object, a cast to the correct type is required. With that in mind, the class file must be accessible from the system in which the restoration occurs. In other words, the object's class file and methods are not saved; only the object's state is saved.

### SQL Questions

1.  Explain what SQL is. What are some SQL RDBMS Vendors? _What is an RDBMS_?
2.  Draw a simple ERD for modeling Students and Classes
3.  What are the 5 sublanguages of SQL? Which commands correspond to them?
4.  What is the difference between DELETE, DROP, and TRUNCATE commands?
5.  What are some SQL clauses you can use with SELECT statements?
6.  What is the difference between WHERE and HAVING? _`WHERE` is used to filter rows before grouping and `HAVING` is used to exclude records after grouping. Read more [here](https://www.java67.com/2019/06/difference-between-where-and-having-in-sql.html#ixzz6kwoJQmXd)_.
7.  Explain what the ORDER BY and GROUP BY clauses do.

- Practice [here](https://www.w3schools.com/sql/sql_orderby.asp).

8.  Explain the concept of relational integrity.
9.  List the integrity constraints.
10. Define the word “schema”.

11. What is a candidate key? What about a surrogate key?

12. What conditions lead to orphan records? (_Think about what happens when we delete from a table that a child table is dependent on because it feautres its Primary keys as foreign keys within the table_)

13. What are some SQL data types?

14. What is normalization? What are the levels? (0 - 3NF)

15. What are the properties a transaction must follow? (_A.C.I.D_)

16. Explain the different isolation levels. What read phenomena do each prevent?

17. What is the difference between joins and set operators?

18. What are the types of joins? Explain the differences.

19. What is a cascade delete?

20. How would you setup a primary key that automatically increments with every INSERT statement?

21. What is the difference between scalar and aggregate functions? Give examples of each

22.

### JDBC Questions

1. What is JDBC?

2. What are the core interfaces / classes in JDBC?

3. What is a stored procedure and how would you call it in Java?

4. What is the difference between Statement and PreparedStatement?

5. Steps to executing an SQL query using JDBC?

6. How to execute stored procedures using JDBC?

7. Which interface is responsible for transaction management?
   > `Connection` Interface. See this resource here about [JDBC and Transaction management](https://www.javatpoint.com/transaction-management-in-jdbc#:~:text=In%20JDBC%2C%20Connection%20interface%20provides%20methods%20to%20manage%20transaction)

### AWS & Cloud Computing Questions

1. what are the benefits of cloud services?

2. What are the 3 models of Cloud computing?

3. What is AWS RDS? What type of service is this? Iaas, Paas, Saas?

4. What is the relationship between a Region and an Availability Zone?

5. What are Security Groups?

## Collections / Generics

42. What are collections in Java?

- A general data structure that contains Objects. Also the name of the API

43. What are the interfaces in the Collections API?

- Iterable, Collection, List, Queue, Set, Map, SortedSet, SortedMap

44. What is the difference between a `Set` and a `List`?

- `Set` does not allow duplicates (its members are unique)

45. What is the difference between a `Array` and an `ArrayList`?

- An array is static and its size cannot be changed, but an ArrayList can grow/shrink

46. What is the difference between `ArrayList` and `Vector`?

- `Vector` is synchronized whereas `ArrayList` is not.

47. What is the difference between `TreeSet` and `HashSet`?

- The two general purpose `Set` implementations are `HashSet` and `TreeSet`. `HashSet` is much faster (constant time versus log time for most operations) but offers no ordering guarantees.

48. What is the difference between HashTable and HashMap?

- a. `Hashtable` is synchronized whereas `Hashmap` is not.

- b. `Hashmap` permits `null` values and the `null` key.

49. Are Maps in the Collections API?

- Yes, but they do not implement `Collection` or `Iterable` interfaces

50. What are generics? What is the diamond operator (`<>`)?

- A way of specifying a type within a data structure - they enforce type safety. `<>` operator lets you infer generic types from the LHS of assignment operation

## Threads

51. What is multi-threading?

- Handling multiple threads / paths of execution in your program.

52. In what ways can you create a thread?

- By extending the Thread Class or by implementing the `Runnable` Interface. You must call Thread's `.start()` method to start it as a new thread of execution.

53. Lifecycle of a thread

- When created, in NEW state.
- When `.start()` is called, it goes to RUNNABLE state.
- When `.run()` is called, goes to RUNNING state.
- If `.sleep()` or `.wait()` is called, will go to WAITING.
- If dependent on another thread to release a lock, it will go to BLOCKED state.
- When finished executing, will be in DEAD state and cannot be restarted.

54. What is deadlock?

- When two or more threads are waiting on locks held by the others, such that no thread can execute

55. What is synchronized keyword?

- Only allowing one thread access to the method or variable at a time - enforces thread-safety

## IO / Serialization

56. How do you serialize / deserialize an object in Java?

- a. Step 1: An object is marked serializable by implementing the `java.io.Serializable` interface, which signifies to the underlying API that the object can be flattened into bytes and subsequently inflated in the future.

- b. Step 2: The next step is to actually persist the object. That is done with the `java.io.ObjectOutputStream` class. That class is a filter stream--it is wrapped around a lower-level byte stream (called a node stream) to handle the serialization protocol for us. Node streams can be used to write to file systems or even across sockets. That means we could easily transfer a flattened object across a network wire and have it be rebuilt on the other side!

- c. To restore the object back, you use `ObjectInputStream.readObject()` method call. The method call reads in the raw bytes that we previously persisted and creates a live object that is an exact replica of the original. Because `readObject()` can read any serializable object, a cast to the correct type is required. With that in mind, the class file must be accessible from the system in which the restoration occurs. In other words, the object's class file and methods are not saved; only the object's state is saved.

57. What is a Marker interface?

- A marker interface is an interface which has no methods at all. Example: `Serializable`, `Remote`, `Cloneable`. Generally, they are used to give additional information about the behavior of a class.

58. What are transient variables?

- Transient variables are those variables which cannot be serialized.

59. Difference between FileReader and BufferedReader?

- `FileReader` is just a `Reader` which reads a file, so it reads characters and uses the platform-default encoding.

- `BufferedReader` reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines (e.g. can read one line at a time).

- So you can wrap a `BufferedReader` around a `FileReader`

## Design patterns

67. What are Singleton / Factory design patterns?

- Singleton - allows for creation of only 1 object. Method for retrieving object returns reference to the same object in memory. Implement via private constructor

- Factory - abstracts away instantiation logic, usually used in conjunction with singleton pattern

## JDBC

68. What is JDBC?

- A Java API used to execute queries on various databases. Uses JDBC drivers to connect with the database

69. What are the core interfaces / classes in JDBC?

- `DriverManager`, `Connection`, `Statement`, `PreparedStatement`, `CallableStatement`, `ResultsSet`

70. What is a stored procedure and how would you call it in Java?

- A stored procedure is an executable block of code that is written in PL/SQL and stored in the Oracle database. A stored procedure is called from a Java class using a CallableStatement object. When the procedure is called, its name and any relevant parameters are sent over the JDBC connection to the DBMS, which executes the procedure and returns the results (if applicable) via the connection.

71. What is the difference between Statement and PreparedStatement?

- PreparedStatements are pre-compiled by the JVM. The database doesn't have to compile the SQL each and every time it is executed. PreparedStatement can be parameterized, which can make the SQL more readable. Furthermore, PreparedStatement will properly escape reserved characters to prevent SQL injection attacks.

72. Steps to executing an SQL query using JDBC?

- 1. Register the driver using `.forName()` (or let `DriverManager` detect and load automatically from classpath)
- 2. Create the connection (`DriverManager.getConnection(url,username,password)`)
- 3. Create a statement for executing the SQL query (`Statement st = conn.createStatement()`);
- 4. Execute the SQL query (`ResultSet rs = st.executeQuery(String sql)`)
- 5. Use `ResultSet` to get values returned (`rs.getInt(1)`, etc)
- 6. Close the connection (`conn.close()`)

73. How to execute stored procedures using JDBC?

- Use the `Callable` statement interface

74. Which interface is responsible for transaction management?

- The `Connection` interface - can `commit`, `rollback`, etc

## JUnit

75. What is JUnit?

- A Java unit testing framework for testing code - use it for TDD

76. What is TDD?

- Test-driven development - write unit tests before application code, then write code to make tests pass. Repeat this process until functionality is complete.

77. What are the annotations in JUnit? Order of execution?

- BeforeClass, AfterClass, Before, After, Test, Ignore

78. Give an example of a test case?

- Adding two numbers, check that the method returns the sum

## Log4j

79. What is an advantage to using a logging library?

- Allows you to set logging thresholds

80. What is log4j?

- Logging library for Java

81. What are the logging levels of log4j?

- TRACE, DEBUG, INFO, WARN, ERROR, FATAL

## Maven

82. What is Maven?

- A build automation and dependcy management tool for Java applications

83. What is the default Maven build lifecycle?

- process resources - copy and process the resources into destination directory
- compile - compile the source code
- process-test-resources - same for test directory
- test-compile - compile the test code
- test - run the test code
- package - combine compiled source code into a .jar or .war file
- install - install package to local repo
- deploy - copy package and install in remote repo

84. Where / when does Maven retrieve dependencies from? Where are they stored locally?

- Maven first looks to see if the dependency is in the local repo under `.m2` directory. If not, it will download the necessary .jar file(s) from the remote central Maven repository into the `.m2` directory

85. What is the POM and what is the pom.xml?

- POM stands for project object model and is the model used by Maven to understand project attributes and dependencies. The pom.xml is the xml document which lists those attributes and dependencies


## Advanced Java

1. What are functional interfaces?

   - Functional interfaces only have one method, and can be used in conjuntion with lambdas

2. What are lambdas?

   - Like anonymous functions, they allow implementation of functional interfaces directly without creating a class

3. What is try-with-resources? What interface must the resource implement to use this feature?

   - Try-with-resources allows for automatically closing resources in a try/catch block using `try(resource) {...}` syntax. Must implement the `AutoCloseable` interface

4. How to make numbers in your code more readable?

   - Use the `_` for numeric literals - must be placed between numbers

5. Which collections cannot hold null values?

   - `HashTable`, `TreeSet`, `ArrayDeque`, `PriorityQueue`

6. If 2 interfaces have default methods and you implement both, what happens?

   - The code will NOT compile unless you override the method. However, the code WILL compile if one interface is implemented further up in the class hierarchy than the other - in this case, the closest method implementation in the hierarchy will be called

7. If 2 interfaces have same variable names and you implement both, what happens?

   - The code will compile unless you make a reference to the variable (this is an ambiguous reference). You must explicitly define the variable by using the interface name: `int a = INTERFACENAME.a;`

8. Why does `HashTable` not take `null` key?
   - The hash table hashes the keys given as input, and the `null` value cannot be hashed

<br>

## Threads

1. What is multi-threading?

   - Handling multiple threads / paths of execution in your program.

2. In what ways can you create a thread?

   - By extending the Thread Class or by implementing the `Runnable` Interface. You must call Thread's `.start()` method to start it as a new thread of execution.

3. Lifecycle of a thread

   - When created, in NEW state.
   - When `.start()` is called, it goes to RUNNABLE state.
   - When `.run()` is called, goes to RUNNING state.
   - If `.sleep()` or `.wait()` is called, will go to WAITING.
   - If dependent on another thread to release a lock, it will go to BLOCKED state.
   - When finished executing, will be in DEAD state and cannot be restarted.

4. What is deadlock?

   - When two or more threads are waiting on locks held by the others, such that no thread can execute

5. What is synchronized keyword?
   - Only allowing one thread access to the method or variable at a time - enforces thread-safety

<br>

## HTTP

1. What is HTTP?

2. What is the difference between `GET` and `POST` HTTP verbs?
   .

3. What does it mean for an HTTP verb to be idempotent?

4. What are the contents of an HTTP request?

   - **HTTP request contents**
     - HTTP version
     - URL
     - HTTP verb / method
     - Request Headers
     - Request Body

5. What are the contents of an HTTP response?
   - **HTTP response contents**
     - HTTP version
     - Status code
     - Response Headers
     - Response Body

<br>
<br>

## Reflections API

1. What is Reflection API?

   - The first component of the Reflection API is the mechanism used to fetch information about a class. This mechanism is built into the class named Class. The special class Class is the universal type for the meta information that describes objects within the Java system. Class loaders in the Java system return objects of type Class. Up until now the three most interesting methods in this class were:
   - `.forName()`, which would load a class of a given name, using the current class loader
   - `.getName()`, which would return the name of the class as a String object,which was useful for identifying object references by their class name
   - `.newInstance()`, which would invoke the null constructor on the class (if it exists) and return you an object instance of that class of object
   - To these three useful methods the Reflection API adds some additional methods to class Class. These are as follows:
   - `getConstructor`, `getConstructors`, `getDeclaredConstructor`
   - `getMethod`, `getMethods`, `getDeclaredMethods`
   - `getField`, `getFields`, `getDeclaredFields`
   - `getSuperclass`
   - `getInterfaces`
   - `getDeclaredClasses`

2. What is a Dynamic Proxy?

<br>
 
## Design patterns
1. What are Singleton / Factory design patterns?
     + Singleton - allows for creation of only 1 object. Method for retrieving object returns reference to the same object in memory. Implement via private constructor

    + Factory - abstracts away instantiation logic, usually used in conjunction with singleton pattern

<br>

### Docker

* What is a container? How is it different from a VM?
  * Containers are lightweight, they can share the underlying OS
  * Containers package only the app and the environment needed to run the app
  * Containers keep environments consistent for every deployment and isolate them from the rest of the system
* What is the Docker Daemon?
  * Underlying process that runs and manages the docker containers
* What is a Docker image? Container?
  * An image is like blueprint for a container
  * An image is readonly, like a file; container is the instantiation and contains the running application
* How is a Docker image different from a Docker container? How are the read/write layers different?
  * Docker containers are built in layers; each line in a Dockerfile adds a layer
  * A container adds a write layer
  * When an image needs to be rebuilt, only the layer that changed needs to be built
* List the steps to start Docker, create a Docker image, and spin up a container
  1. Write a Dockerfile
  2. Build the image `docker build <pathToDockerfile>`
  3. Spin up the container `docker run <imageName>`
* What is the relevance of the Dockerfile to this process? List some keywords in the Dockerfile.
  * Dockerfile is the configuration file for an image/container
  * Keywords: FROM, COPY, ADD, WORKDIR, ENV, CMD, RUN
* What is the benefit to an image being built in Layers?
  * Images can be composed from base images and keeps them lightweight / smaller size
* What are some other Docker commands?
  * `docker container ls`
  * `docker attach`
  * `docker kill`
  * `docker help`
  * `docker inspect`
* What is a container registry? How would you retrieve and upload images to DockerHub?
  * Holds images, either public or private
  * Use `docker pull` and `docker push` to upload/download images
* What is Docker compose and why is it useful?
  * Write a yml config file for spinning up multiple containers at once
* If you want to store state for a container, how does Docker recommend doing that?
  * Use a volume or connect to external state management service
  * Volumes are file systems mounted to a container and exist on the host independent of the container

### Servlets 

What is a servlet? What about a servlet container? Which servlet container have you worked with?


Describe the servlet class inheritance hierarchy. What methods are declared in each class or interface?


How would you create your own servlet?


What is the deployment descriptor? What file configures your servlet container?


Explain the lifecycle of a servlet - what methods are called and when are they called?


Is eager or lazy loading of servlets the default? How would you change this?


What are some tags you would find in the web.xml file?


What is the difference between the ServletConfig and ServletContext objects? How do you retrieve these in your servlet?


What is the purpose of the RequestDispatcher?


Explain the difference between RequestDispatcher.forward() and HttpServletResponse.sendRedirect()


What is object mapping? Any Java libraries for this?


How would you send text or objects back in the body of the HTTP response from a servlet?


What is the difference between getParameter() and getAttribute() methods?

# REST

1. What is REST?

2. What is a REST Resource?

3. What are the guiding principles of REST?

4. What does it mean for a REST API to be stateless?

5. What is the preferred data format when exposing REST resources?

6. What is the Richardson Maturity Model and what are the levels?

7. What is HATEOAS?

# Spring

### Spring Core

1.  What are Spring Projects and Spring Modules?
2.  What is IOC and what does the IOC Container do?
3.  What is dependency injection and what are some of the benefits of using dependency injection?
4.  What types of dependency injection does Spring support?
5.  What are some differences between BeanFactory and ApplicationContext? Which one eagerly instantiates your beans?
6.  What is the Spring Bean lifecycle?
7.  What is bean wiring? What about autowiring?
8.  What are the different ways that Spring can wire beans?
9.  What are the scopes of Spring beans? Which is default?
10. What is the concept of component scanning and how would you set it up?

11. What are the benefits and limitations of Java configuration?

12. What does the @Configuration and @Bean annotations do?

13. What is @Value used for?

14. What is Spring Expression Language? What can you reference using SpEL? What is the difference between $ and # in @value expressions?

### Spring MVC

15. Explain the MVC architecture and how HTTP requests are processed in the architecture

16. What is the role of the DispatcherServlet? What about the ViewResolver?

17. List some stereotype annotations. What are the differences between these?

18. How would you declare which HTTP requests you’d like a controller to process?

19. What is the difference between @RequestMapping and @GetMapping?

20. How to declare the data format your controller expects from requests or will create in responses?

21. What annotation would you use to bypass the ViewResolver?

22. How would you extract query and path parameters from a request URL in your controller?

23. What concerns is the controller layer supposed to handle vs the service layer?

24. How would you specify HTTP status codes to return from your controller?

25. How do you handle exceptions thrown in your code from your controller? What happens if you don’t set up any exception handling?

26. How would you consume an external web service using Spring?

27. What are the advantages of using RestTemplate?

### Spring AOP

28. What is “aspect-oriented programming”? Define an aspect.

29. Give an example of a cross-cutting concern you could use AOP to address

30. Define the following:

- Join point
- Pointcut
- Advice

31. What are the different types of advice? What is special about the @Around advice? How is the ProceedingJoinPoint used?

32. Explain the pointcut expression syntax

33. What visibility must Spring bean methods have to be proxied using Spring AOP?

### Spring Data

34. What is Spring ORM and Spring Data?

35. What is the Template design pattern and what is the JDBC template?

36. What does @Transactional do? What is the PlatformTransactionManager?

37. What is a PersistenceContext?

38. Explain how to integrate Spring and Hibernate using ContextualSession

39. What interfaces are available in Spring Data JPA?

40. What is the difference between JPARepository and CrudRepository?

41. What is the naming conventions for methods in Spring Data repositories?

42. How are Spring repositories implemented by Spring at runtime?

43. What is @Query used for?

### Spring Boot

44. How is Spring Boot different from legacy Spring applications? What does it mean that it is “opinionated”?

45. What does “convention over configuration” mean?

46. What annotation would you use for Spring Boot apps? What does it do behind the scenes?

47. How does Boot’s autoconfiguration work?

48. What is the advantage of having an embedded Tomcat server?

49. What is the significance of the Spring Boot starter POM?

50. What is the Spring Boot actuator? What information can it give you?

51. What files would you use to configure Spring Boot applications?

52. What is the benefit of using Spring Boot profiles?

## HTML-CSS QC Questions

1. What is HTML

   - HTML stands for Hypertext Markup Language and consists of various tags to describe the content of a document - utilized as the basis for all web pages, along with CSS and JavaScript

2. What is the structure of an HTML document? List some tags. What is `<head>` used for? `<body>`?

   - Start with the doctype declaration, then `<html>`, then `<head>` and `<body>`. The head contains the metadata for the page, while the body contains the content that is rendered to the screen. Other tags: div, span, p, ul, ol, li, strong, em, table

3. What is a doctype?

   - First tag in the document - defines what type of file it is - whether html 4 or 5, etc

4. What is the tag for an ordered list? Unordered list?
   - ordered list: ol, unordered list: ul. Both use li - list items
5. What are some HTML5 tags? Why were HTML5 tags introduced?

   - HTML5 introduced semantic tags to more accurately reflect the content of the tags. Examples: `<strong>` instead of `<b>`, `<em>` instead of `<i>`, `<nav>`, `<header>`, `<footer>`, `<section>`, `<article>`, and `<aside>` instead of reusing `<div>` tags everywhere

6. Do all tags come in a pair? What are the other things inside tags called? list some.

   - No - tags either have a closing tag or are self-closing (`<tag />`). Attributes are contained within tags - examples: id, class, style, height, width, etc

7. What is the syntax for a comment in HTML?

   - `<!-- comments go in here -->`

8. Give me the HTML markup for a table.

```html
<table>
  <caption>
    optional
  </caption>
  <thead>
    <tr>
      <td>Heading 1</td>
      <td>Heading 2</td>
    </tr>
  </thead>
  <tr>
    <td>Cell 1</td>
    <td>Cell 2</td>
  </tr>
  <tbody></tbody>
</table>
```

9. What are some tags you would use in a form?

   - Form tags: `<form>`, `<input>`, `<label>`, `<textarea>`, `<button>`, `<select>`, `<option>`

10. What is CSS? what are the different ways of styling an HTML file? Which is best? why?

    - CSS stands for Cascading Style Sheets - it is a language for styling HTML documents by specifying certain rules for layout and display in key/value pairs. There are 3 ways of styling an HTML file:
    - (1) inline - in the `style` attribute
    - (2) internal stylesheet - in the `<style>` tag in the `<head>`
    - (3) external stylesheet - using external `.css` file, use `<link>` in the `<head>`
    - External stylesheet is best practice due to separation of concerns, reusability, modularity

11. Describe the CSS box model.

    - The box model consists of margin (outermost box), then border, then padding, then content (innermost). All box sizes / formatting can be styled with CSS

12. Which way has highest priority when styles cascade: inline, internal, and external.

    - Inline has highest priority, then internal/external depending on order. Cascading rules are determined by (1) importance (`!important` flag), (2) specificity of selector (inline has no selector, highest specificity), then (3) source order.

13. Syntax for styling an element? What is a class and how to style them? What is an id? how to style? difference?

```css
div {
  property: value;
}
.class {
  property: value;
}
#id {
  property: value;
}
```

14. What if I want to select child elements, What syntax is that?

    - use direct descendant selector (`>`) or space for any level nested element

15. Can I select multiple elements at once? How?

    - yes, with a comma

16. What is a psuedo-class? What is syntax for selecting that?

    - psuedo-class selects an element in a certain state - for example, when hovered over. Use colon (`:psuedoselector`) syntax

17. What is Bootstrap?

    - Bootstrap is a CSS framework with pre-written CSS rules to easily style your page and incorporate responsive design seamlessly. Contains various utilities and components for making a great UI

18. Describe the Bootstrap grid system + The Bootstrap grid is divided into 12 columns. You wrap the columns in a `.row` which is in a `.container` or `.container-flex`. The columns are responsive - there are classes for different screen sizes which collapse on smaller windows
    <br><br>

# JavaScript

## Language Fundamentals

### Basic

* What is JavaScript? What do we use it for?

* Can we run JavaScript in a web browser, on a server, or both?

* What are the benefits of JS over your core language? Drawbacks?

* What programming paradigm(s) does JS support?

* What are the data types in JS?

  * What is the type of NaN? What is the isNaN function?

  * What is the data type of a function?

  * What about an array?

  * What is the difference between undefined and null?

* What are JS objects? what is the syntax?

* Use the object literal syntax to create an object with some properties

* What are arrays in JS? can you change their size?

* List some array methods and explain how they work.

* What is JSON? Is it different from JS objects?

* What are some ways you can use functions in JS?

* What are the different scopes of variables in JS?

  * What are the different ways to declare global variables?

  * Is it a best practice to use global variables? Why or why not?

* What are some methods on the function prototype?

* If you declare a variable `var` inside a for loop is that block scoped or function scoped?

  * If you declare a variable `let` inside a for loop is that block scoped or function scoped?

* What will happen?

```javascript
const hi;
hi = 3;
console.log(hi);
```

* What are callback functions? What about self-invoking functions?

* What is a truthy or falsy value? List the falsy values.

* What prints?:

```javascript
let x = 5;
while(x) {
  x--;
  console.log(x);
}
```

* What is the difference between == and ===? Which one allows for type coercion?

* What is the difference between `for of` and `for in`?

* What does the following code do?

```javascript
function addOne(value) {
    value + 1;
}

let x = 5;
addOne(x);
console.log(x);
```

What about this?

```javascript
function changeUsername(user) {
    user.username = 'new-username';
}

let user = {
    username: 'first-username'
};

changeUsername(user);
console.log(user.username);
```

Why?

* What is the difference between a do-while and a while loop?

* What does this do?

```javascript
for(;;){
    console.log('a');
}
```

* What is fall-through with regard to switch statements?

* What is the difference between `console.log(++x)` and `console.log(x++)`?

* Explain what “strict mode” does   

* What are the naming conventions for a variable used in JavaScript?

* What are the naming conventions for a function used in JavaScript?

### Intermediate

* What is function and variable hoisting?

* What is closure and when should you use it?

* What does the following code do?

```javascript
let arr = [1, 2, 3, 4];
let x = arr.forEach(function(x){
    return x*x;
});
console.log(x);
```

*prints*: undefined

* What does the following code do?

```javascript
let arr = [1, 2, 3, 4];
let x = arr.map(function(x){
    return x*x;
});
console.log(x);
```

*prints* [1, 4, 9, 16]

* What does the "this" keyword refer to?

* Explain the concept of lexical scope

* Explain how inheritance works in JS

* How would you rewrite this using an anonymous function? Arrow function?
```JavaScript
function hello(){
  console.log('hello');
}
document.getElementById('hi').addEventListener(hello);
```

* What is the difference between `setInterval()` and `setTimeout()`?
  * How would you stop a `setInterval()` once it has been set?
  * Advanced: How do they work with regards to the callback queue?

* How would you handle an error in JS?

* What attributes does an Error object have?

* What is an Immediately Invoked Function Expression?
  * How would you write one?

### Advanced

* What are some characteristics of the functional programming paradigms

* What does it mean for a function to have no side effects? (what is a pure function?)

* What are the advantages to using a functional approach? (as opposed to OOP)

* Explain how the guard and default operators work

* What happens:
```JavaScript
let h = 'hello';
function process(input) {
  return input || 'goodbye';
}
console.log(process(h));
console.log(process());
```

### Bonus

* What will happen when I try to run this code: console.log(0.1+0.2==0.3) ?

* What happens?

```javascript
h = 3;
function hello(){
    h = 6;
}
hello();
console.log(h)
```

* What prints?

```javascript
let x = 5;
let b = 2;
for(let i = 0; i < 5; i++) {
    b = b + 1;
}
if(b = x) {
    console.log(b);
} else {
    console.log('Oh no. :(');
}
```



## ES6+

### Basic

* What standard is JS based off of?

* What is the difference between var, let, and const keywords?
    
* How would we rewrite this code with a template literal?

```JavaScript
let n = 'Dorian';
let message = 'My name is '+n;
console.log(message);
```

* What will print:

```JavaScript
let arr = ['chicken', 'pig', 'cow'];
for(let i in arr) {
  console.log(i);
}
for(let i of arr) {
  console.log(i);
}
```

* What will happen:

```JavaScript
let arr = ['chicken', 'pig', 'cow'];
for(const i in arr) {
  console.log(i);
}
```

### Intermediate
* What’s the difference between a normal function declaration and an arrow function?
    
* Does JS have classes? How does this relate to Prototypal inheritance in JS/What is the difference between a Prototype and a Class?
    
* How would you set default values for parameters to a function?
    
* What’s the benefit of computed property names?
    
* Explain the async/await keywords. Why is it preferred to use this instead of .then() methods?

* How could you make the program print out the statements in order?

```JavaScript
function getData(){
  console.log("2. Getting data from internet, please wait.")
  return setTimeout(function(){
    console.log("3. Returning data from internet after 1000 milliseconds.")
    return [{name: "Avi"}, {name: "Grace"}]
  }, 1000)
}

function main(){
  console.log("1. Starting Script")
  const data = getData()
  console.log(`4. Data is currently ${data}`)
  console.log("5. Script Ended")    
}

main();
```

Solution:

```JavaScript
function getData(){
  console.log("2. Getting data from internet, please wait.")
  return new Promise(function(resolve){
    setTimeout(function(){
      console.log("3. Returning data from internet.")
      resolve([{name: "Avi"}, {name: "Grace"}])
    }, 1000)
  })
}

async function main(){
  console.log("1. Starting Script")
  const data = await getData()
  console.log(`4. Data is currently ${JSON.stringify(data)}`)
  console.log("5. Script Ended")
}

main()
```

* How do you interact with a Promise? When would it be appropriate to use a Promise?

* Write a method that would print to the console the value returned by the promise?
```JavaScript
function helloPromise() {
  let p = new Promise();

  setTimeout(p.resolve(`Hello World`), 500);

  return p;
}
```

Solution:

```JavaScript
helloPromise().then(r -> console.log(r));
```

* Convert this function to use named parameters?

```JavaScript
function add(x, y) {
  return x + y;
}
```

Solution:

```JavaScript
function add(options) {
  return options.x + options.y;
}
```
    
### Advanced

* What is a Symbol?  What is the advantage using Symbol?

* How could you reference this module in your code?

```JavaScript

export const qcScore = `RED`;

```
Solution:

```JavaScript

import {qcScore} from './filenameTheyShouldAskForFromQC.js';

```

* What is object and array destructuring? Give me an example using the rest/spread operator?

* What is a generator function? What’s the point of the yield keyword?
    
* What built-in advanced objects does JavaScript provide?

* What will this print?

```JavaScript

let fname = "Bobbert";
let lname = "Bobbertson";
let role = "manager";
let status = "active";

let user = {
  fname,
  lname,
  [role]: status,
  fullname: () => `${fname} ${lname}`
};

console.log(user);

console.log(user.fullname());

```

## DOM Manipulation

* Explain the following code:

```javascript
document.getElementById("myid").addEventListener('click', (e) => {
  e.stopPropagation();
});
```

* What is the global object in client-side JavaScript? What are some built-in functions on this object?

**example answers**: `window` is the correct answer (document is a field on the window object), but `document` is also acceptable.

* What is the DOM? How is it represented as a data structure? What object in a browser environment allows us to interact with the DOM?

* List some ways of querying the DOM for elements

* How would you insert a new element into the DOM?

* What are event listeners? What are some events we can listen for? What are some different ways of setting event listeners?

* What is bubbling and capturing and what is the difference?

* What are some methods on the event object and what do they do?

* Why is `Hello` not visible on the page after calling this function?

```JavaScript
function addElementToBody() {
  let body = document.getElementsByTagName('body');
  body.innerHTML = '<p>Hello</p>';
}
```

**answer:** You can't append a child to an `htmlCollection`.

### Bonus

* What happens?

```javascript
location = 'www.google.com';
console.log(location);
```

## Asynchronous Web

* What is AJAX? why do we use it? What are the benefits of using AJAX? Are there any downsides of using AJAX?

* Explain why it is important that AJAX is asynchronous

* List the steps to sending an AJAX request

* What are steps to sending an AJAX request?

* List the different ready states of the XmlHttpRequest object

* How would retrieve JSON data from an AJAX request?

* How do you handle a failed request in AJAX?

* What is the Fetch API?

* How do you send a Fetch request?

* What is the difference between Fetch and AJAX?

* How would you retreive JSON data from a Fetch request?

* How do you handle a failed request in Fetch?

### Bonus

* How would you retrieve XML data from an xhr object?

# React

* What is React? Is it a library or framework? What's the difference between those?
  * React is a UI library. It's a library not a framework because you call it in your code; it can be integrated into part of or the entire UI
* Why use React?
  * We use it to make `single page` front end applications
  * Lets us dynamically create and render components without having to refresh pages
* What is the difference between React and ReactDOM?
  * React is a higher level package for both ReactDOM and React Native
  * ReactDOM is strictly the web implementation of React
* How many HTML pages does our React App use?
  * We render in one SINGLE page
  * It is constructed in a way that we only ever need to render one DOM object
* What is SPA?
  * Single Page Application is a website design approach where each new page's content is served not from loading new HTML pages but generated dynamically with JS's ability to manipulate the DOM elements on the existing page itself
* What are some benefits of SPA?
  * Allows users to contineu consuming and interacting with the page while new elements are being updated or fetched, and can result in much faster interactions
* What are some downsides of SPA?
  * Accessibility
  * SEO rankings
  * If your content is purely static, it can worsen initial load times
* What is the package.json?
  * Lists our dependencies
  * Lists our scripts
    * Start, test are aliases for `npm run [script]`
  * Run the build script to show the target folder
* What are node_modules?
  * Houses our dependency files
* What is gitignore?
  * Auto-generated by create-react-app to prevent us from pushing certain things to github repos
* What is the build folder?
  * After running the command `npm run build` a folder called build is created with our self-container app
* What is ReactDOM.render?
  * ReactDOM takes 2 arguements
    * The element to render
    * The location to add the element to in the DOM
* What is react.createElement?
  * react.createElement("h1", { style: { color: "blue" }}, "Hello world from react")
* What is the App.tsx? Why do we structure it in that way?
  * Main entrypoint for our application
  * This is where we render the root node for the DOM object
  * "A lot" of the time this is where we do our app routing
  * It's structured like this because easy to maintain and at the end of the day we only want one root for everything else
* What are the roles of Babel and Webpack?
  * Babel
    * Free open source JS transpiler or transcompiler that will turn things like JSX and tsx into valid JS code
    * Make sure to start all components with capital letter, this is how Babel knows its a component it has to transpile
  * Webpack
    * This is a packaging tool that takes all the different files and modules and build them into a web package to use within the browser
* What does it mean to be component-based? What does a component represent?
  * Components are reusable parts of the UI that maintain a state and get rendered to the page
* Tell me how you would start up a new React project? What does 'create react app' setup for you?
  * You should use `npm` to install `react` and any other dependencies
* How would you create a component?
  * Create either a JS class or function
* Why use components?
  * Increase reuseability and maintainability
  * Also helps loosen code coupling within the application
* What does a component have to render/return?
  * A component must return/render a JSX view of some type
  * This view can only have one single root JSX tag
```jsx
function HelloWorld(){
  return(
    <div>
      <h1>Hello World!</h1>
    </div>
  );
}
```
  * Now when we want to render the component, we can simply say `<Hello World/>` in our App component
  * We can list the component as many times as we would like to as long as it's wrapped in another tag
  * Are valuable for their reusability and their ability to manage their own independent state
* What are "props"? What is state? What data should be put in which?
  * Props are readonly; they are passed into the component
  * State is the immutable object representing the current state of the component
* What is the lifecycle of a component?
  * Constructor - use for initializing state
  * `render()` - returns the JSX to be compiled and rendered onto the browser
  * `componentDidMount()` - runs once, after the component is rendered
  * `componentDidUpdate()` - runs after every update of the component
  * `componentWillUnmount()` - runs before the component is removed from the DOM
* What is the difference between a functional and a class component?
  * Functional - before hooks, could not modify state and only used as 'display' component
  * Class - utilizes lifecycle methods and `render` method
* What are React hooks? How do we use them?
  * React hooks are functions we can call in order to access certain functionalites
  * They all start with `use` such as `useStyle()`, `useState()`, `useEffect()`
  * We call them hooks because they allow us to `hook` into certain aspects of a component whether it be style or lifecycle
* What do these hooks let us do?
  * `useState()`
    * We can add `useState()` to our imports
    * `useState()` is a function that returns an array of the following
      * Index 0, we have the state object
      * Index 1, we have the function to use to update that object state
  * `useEffect()`
    * Allows us to manage side-effects that aren't related to rendering the component
    * Typically actions such as logging or fetching data will utilize `useEffect()`
    * Takes in 2 params
      * A callback function denoting what action you want to perform
      * A dependency array of state values that act as triggers for the action on change
  * `useReducer()`
    * Allows us a better way of updating complex state logic
    * Takes in 2 params
      * The callback function with logic to update the state
      * The intial state of the object
* How do we save info in a component?
  * To save info we can use React component states
  * If we are using class components, we can set this initial state directly in the constructor 
  * If we are using a function component, we can use the `useState()` hook to create and offer a method to change state
* What is the purpose of a container component? 
  * A container component holds the state that it then passes to "display" child components
* What is routing and how would you do routing in React?
  * Need to install `react-router` using `npm`
  * `npm install react-router@next react-router-dom@next
  * Use the `BrowserRouter` component to provide context where routing will work
  * Use `Link` component to link to a particular route
  * Use `Switch` and `Route` components to link routes to particular components that get rendered
* What is JSX? What does it compile into? How to include JS code in JSX? 
  * JSX is an extension syntax to JS - it lets you write HTML and JS code together; compiles into JS
  * Not required but helps with development
  * Write JS code by using curly braces {like this}
* What are some of the differences between JSX HTML and normal HTML?
  * Attribute names
    * Example class => className
    * You can also create your own "attributes" which are called props
  * Tag names
    * HTML tag: `<p>`
    * Component tag: `<SomeComponent>`
    * We can directly add JS into JSX HTML by using { } where as in HTML you cannot do this
* How do you handle events in React?
  * Use event binding: `<button onClick={myClickHandler}></button>`
  * For sending parameters: `<button onClick={(e) => this.deleteRow(id, e)}>Delete Row</button>`
  * Define `myClickHandler` function in your component somewhere
* What is Data Binding?
  * Data binding is when we bind data to a specific value in the state
  * For example, if we had login form and we had a username input, we want to bind whatever the user types in, to the username value in the state
```javascript
const [username, changeUsername] = useState("")
const [password, changePassword] = useState("")

const handleUsernameChange = (e: React.ChangeEvent<HTMLInputElement>) => {
  changeUsername(e.target.value)
}
const handlePasswordChange = (e: React.ChangeEvent<HTMLInputElement>) => {
  changePassword(e.target.value)
}
```
* Does React have 1-way or 2-way data binding and data flow?
  * 1-way data binding
  * Data always flows "down" to components nested within them
* If a parent component has data that a child component needs to access, what should you do?
  * Pass in the data through `props` to the child
* If you have state in two child components that a parent component needs access to, what is a good solution for that?
  * Lift the state up to the parent component and then pass it into each child via `props`
* How do you do conditional rendering?
  * Use an `if` statement in the `render()` function OR
  * Use a boolean value with logical `&&` operator in your JSX like below
```jsx
render() {
    return <div>{myBooleanValue && <SomeComponent />}</div>
}
```
* What should you remember to include as a prop for lists of elements?
  * Pass in a `key` prop that uniquely identifies the list item
  * Helps React know which items have changed, been added, or removed
* How do we use TypeScript in React?
  * `npm install typescript`
* What are some pros/cons of using TypeScript in a React application?
  * Pros: strict type checking; intellisense; features like interfaces, decorators, and access modifiers
  * Cons: adds overhead and extra transpilation; may be unnecessary for small projects
* How would you handle forms and submitting forms with React?
  * Use "controlled components" where the state of the form is based on the state of the React component
  * Not recommended, but you can use uncontrolled component with a Ref to get form values from the DOM
* How do you recommend making an AJAX call in React? Which library have you used? Why not use `fetch` directly?   
  * Can use AJAX itself or `fetch`, but a library like Axios is a good idea b/c can centrally configure all requests
  * Example: need to include JWT token with every request for authorization
* How do you test React components and code that you write?
  * Jest is a unit testing tool you can use to test your code
  * Enzyme is a testing utility to make it easier to test your components' output
* What are some options for styling your React components?
  * Preferred: use the `className` prop
  * Optional: use inline styling, or "CSS-in-JS" where the styling is defined in JS

### Flux/Redux

* What is the Flux design pattern?
  * A pattern for state management with unidirectional data flow: from action -> dispatcher -> store -> view
* What is Redux? How is Redux related to Flux?
  * A global state management library
  * Useful for complex apps where managing state becomes too unwieldy
  * Redux is the popular implementation of Flux
* What are the core principles of Redux?
    * Single source of truth
        * The global state of your app is put away in an object tree inside a single store
    * State is read-only
        * The state can only be changed by emitting an action, an object that explains what has happened
    * Changes are made with pure functions
        * This is to define how the state tree is being transformed by the actions, you have to write pure reducers
* What is the difference between mapStateToProps() and mapDispatchToProps()?
    * | `mapStateToProps()` | `mapDispatchToProps()` |
      | ----------------  | -------------------- |
      | Is a function that is used to provide the stored data to the component | Is a function that is used to provide the action creators with props to the component |
      | All the results of mapStateToProps() should be the plain object that will later be merged into the component's prop | All the action creators are wrapped in the dispatcher call so taht they may be called upon directly and will be merged into the component's prop |
      | Used to connect the redux state to the props of the react component | Used to connect redux actions to the react props |
* Do you need to keep all component states in the Redux store?
    * No because we have to keep our application state as small as possible
    * Should only do so if it makes our lives easier while using Dev Tools
* What is Redux DevTools?
    * Time travel environment that allows live editing for Redux with action replay, hot reloading, and customizable UI
    * Can use in any browser, Chrome or Firefox
* What are some features of the Redux DevTools?
    * Allows us to inspect all the states and action payload
    * Allows us to go back into the time simply by cancelling the actions
    * Each stage action will be re-evaluated in case you change the reducer code
    * With the help of `persistState()` store enhancer, you can continue your debug sessions across page reloads
* What is an Action in Redux?
    * Plain JS objects which contain a type field. 
    * Considered as an event that can describe something that has happened in the application
    * Should always contain a small amount of information that is needed to mention what has happened
```tsx
const addAction = {
    type: 'ADD',
    payload: 'Buy-car'
}
```
* What is 'store' in Redux?
    * Carries all the states, reducers and actions that create the app
        * It holds the state of the current Application from inside
        * store.getState(); allows access to the current state
        * store.dispatch(action); allows the state to be updated
        * store.subscriber(listener); allows to register listener callbacks
* What are some store methods?
    * getState()
    * dispatch(action)
    * subscribe(listener)
    * replaceReducer(nextReducer)
```tsx
import { createStore } from 'redux'
const store = createStore(todos, ['Use Redux'])
function addd(text) {
    return {
        type: 'ADDD',
        text
    }
}
store.dispatch(addd('Read the docs'))
store.dispatch(addd('Read about Redux'))
```
* How to access Redux store outside a react component?
    * You need to export the store from the module where it has been created with createStore
```tsx
store = createStore(myReducer);
export default store;
```
* How to structure Redux top-level directories?
    * Components
        * Used for 'dumb' React components that are unfamiliar with Redux
    * Containers
        * Used for 'smart' React components which are connected to the Redux
    * Actions
        * Used for all the action creators, where the file name should be corresponding to the part of the app
    * Reducers
        * Used for all the reducers where the file name is corresponding to the state key
    * Store
        * Used for store initialization. This directory works best in small and mid-level size apps
* What are reducers in redux?
    * Pure functions that take the previous state and an action, then it returns the next state
    * `(previousState, action) => newState`
    * Is a type of function that would pass to `Array.prototype.reduce(reducer, ?initialValue)`
    * Essential that the reducer stays pure
* What are some things you should never do in a Reducer?
    * Modify its argument
    * Make sure not to perform side effects such as routing transitions and API calls
    * Call non-pure functions such as Date.now() or Math.random()
```tsx
const initialState = { value: 0 }
function counterReducer(state = initialState, action) {
    if (action.type === 'counter/increased'){
        return {
            ...state,
            value: state.value + 1
        }
    }
    return state
}
```
* What is the purpose of constants in Redux?
    * Allows us to find all the usages of specific functionality across the project
    * Also prevents us from making mistakes such as typos. These will gives us a Reference Error immediately

### Advanced React
* What is the virtual DOM?
  * An "ideal" or "virtual" state of the UI that is managed by React and kept in sync with the actual DOM
  * Improves performance by only requiring changing the actual DOM when needed
* How does virtual DOM compare to the DOM?
  * Kept in sync with the real DOM by a library such as ReactDOM. The process is called reconciliation
  * You tell react what state you want the UI to be in, and it makes sure the DOM matches that state. This abstracts out attribute manipulation, event handling and manual DOM updates that you would otherwise have to do
* What about a higher-order component?
  * A higher order components is a component that takes in a component, wraps it, and returns a component
* What is a pure component vs a normal one vs a higher order one?
  * Pure Component
    * State/Props should be immutable
    * State/Props should not have hierarchy
    * You should call forceUpdate() when data changes
    * We do this when we need performance boosts
    * Dumb/Stateless components
  * Normal Component
    * This can be a smart or stateful component which may update or change state
    * It will usually contain some logic that will make things happen
  * Higher Order Component
    * This is a component that takes a component and returns a slightly modified version of this component
* Why is it important to use `setState()` and replace the whole object instead of editing it directly?
  * It follows functional programming paradigm; cleaner and prevents consistency problems
* What is a "thunk"? What is `redux-thunk` used for?
  * Thunk is a function that wraps an expression to delay its evaluation  
  * Used for delaying dispatch of an action or based on a condition
