======30.09.2023======

Java is an Object Oriented Programming Language, which has 4 important aspect we need to know
1. Inheritance
2. Abstract
3. Polymophism
4. Encapsulse

In Inheritance and Polymophism, we need to understand the way we initialize instance in it
By doing Inheritance we have created an "is-a" relationship between Parent and Child    Exmaple: Football (Child) is a Sport (Parent)
There is Upcasting and DownCasting in Java
1. Upcasting        Example: Parent Obj = new Child();
    It's when  we try to represent an instance from Child object to have to same type as the Parent
    By doing this we have generalized to Child Object and help us to manage all the instance easier

    We can do it IMPLICIT or EXLICIT way

2. DownCasting      Example: Child Obj = new Parent() -- Just to imagie, but we can't we it by this implicit way
    It's not safe to do so, (Up till know, I haven't used any DownCasting If I'm about to use it in the future and we specify right here)
    By constrast, we try to represent an instance of Parent object to have the same type as the Child
    
    WE CAN'T DO IT IMPLICIT

    Instead we have to do it like this
    Animal animal = new Dog();
    Dog dog;

    if (animal instanceof Dog) {
        dog = (Dog) animal; // Downcasting

    }
|   In most of my project right now, I only use upClass to manage instances, also to create loose coupled
|