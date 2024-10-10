# OOPS In Java

OOP stands for Object-Oriented Programming, a 
programming paradigm based on the concept of "objects."
Objects are instances of classes, which are blueprints
for creating objects. OOP focuses on using objects to
represent real-world entities, enabling more modular,
reusable, and organized code.


### Reference Documentation
## key concepts of OOP

### Class
Blue Print of an Object(Entity)
### Object
Object/Entity is an Instance of class. It Occupies memory.

## Core Concepts

There are 3 Pillars and 1 Principle of OOPS

### Principle
- Abstraction
  - 
    - Abstraction tells us to envision complex system in terms of 
        Ideas/Entities.
    - Ex: When Designing an Ecommerce Application, Simplify the 
          complexity by envisoning the complex system into entities
          like users , Products, Orders , Payments , Carts , Ratings etc.
    - We dont want to Know the inner details of each entity 
          We hide the complexity behind each Entity , Rather we simply 
        the system in terms of Entities
    - As a Summary Abstraction tells us to Envision the system 
  in terms of entities/ Ideas hiding the complex details.


### Pillars
- Encapsulation
  - 
  - Holding Attributes and Methods of an Entity together (via Class)
  - Protects Attributes and Behaviours from Outside (access Modifiers)
  - ### Access Modifiers
    - [Private]() : The member is only
      accessible within the class No other
      code outside the class can access.
      that member
    - [Default]() : Any class within package can access
      this member . To use this access Modifier don't write anything
      before the member declaration
    - [Protected]() : Protected members can be accessed by any class within the same package.
      also  Protected members can also be accessed by subclasses, even if they are
     in different packages. But Not Accessible from Unrelated Classes Protected
     members cannot be accessed directly from classes that are not in the same package and do not 
      inherit from the class with the protected members.
    - [Public]() : Most lenient access modifier , A public member can be accessed
      from anywhere
- Inheritance
  - 
- ## Polymorphism
  - Compile Time Polymorphism
    - It is Achieived By Method Overloading
    - Method overloading allows us to
      create multiple methods with
      same name different method
      signature in a class
    - Examples of Different Signatures : 
      - Print() Print(int t) Print(string s) Print(string s , String t)
    - Because compiler can detect the
      different parameters and tell which
      method to be called . so this is
      compile time polymorphism
  - Run Time Polymorphism
    - Acheived by Method Overriding



### Thread.start()
- Purpose: The start() method is used to begin the execution of a new thread.
- Behavior: When you call start(), a new thread is created, and the run() method is invoked in that new thread. This means that the start() method does not block the current thread; both the current thread and the new thread will execute concurrently.
- Thread State: When start() is called, the thread transitions from the NEW state to the RUNNABLE state, which allows the thread scheduler to manage it.


### Thread.run()
  - Purpose: The run() method contains the code that defines the thread's task.
  - Behavior: When you call run() directly, it does not create a new thread. Instead, it executes the code within the run() method in the context of the current thread. This means that the current thread will block until the run() method completes.
  - Thread State: When run() is called, the thread does not change its state; it remains in the state of the calling thread.


In the below Example you can see when thread.run() is called it 
runs in the current thread rather creating a new thread that is shown 
there by priniting the thread name.
![img_1.png](img_1.png)
![img.png](img.png)
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.4/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.4/maven-plugin/build-image.html)

### Maven Parent overrides

### Link

[LLD](https://github.com/ashishps1/awesome-low-level-design)

