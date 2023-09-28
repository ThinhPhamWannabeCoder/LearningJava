# LearningJava
This is my repository to learn OOP, DSA, ...etc in Java
BASIC THINGS ABOUT JAVA
---28.09.23---
Java is an Object Oriented Programming Language
    - You have to working around object in Java (Access attribute, run method all through Object)
    - Java can be read from any type of Operating System (Linux, Window, MacOS,...) by the way it compiles (Through JVM, Java Virtual Machine)
About Java Environment
?    - Java program is taken care by JDK, JRE, JVM (I will get back to it later)
How Java run its program
    - run javac syntax to create bycode.class file and by this bycode.class file Java will run on every OS
Heap and Stack in Java
    - Just like any Memory Management, we have
            + Machine code      (Where program is turns to instruction so that computer can understand)
            + Stack             (Like Stack structure, store method, and local varible, also primitive data type, Value data type,and the pointer to reference data type|Object)
            + Heap              (For reference data type and object, also for strong variable for multi thread programming so that they can access to data and return result to it ...)
Gabage Collector
    - Run by JVM 
    - Unlike C/C++ we need to manually delete unuse data in Heap, or else our program can be crash, Java give us an automatic solution so that we don't need to delete manually anymore
    - But bc it's automatically, it will cost resources
    - Gabage collector has 4 types in JVM
        + Serial Grabage Collector      Run on single thread and freeze all thread to collect "Gabbage"
        + Parallel Grabage Collector    Use on multible thread and freeze all threac to collect "Gabbage"
        + CMS Grabage Collector         Use when it' required low latency, and run on multithread,
        + G1 Grabage Collector          Repace CMS, for better performace
?    I will get back to it later while I'm learning

