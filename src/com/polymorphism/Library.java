package com.polymorphism;

public class Library {
    private String name;
    private String address;
    //The Composition is a way to design or implement the "has-a" relationship.
    //Composition and Inheritance both are design techniques.
    //The Inheritance is used to implement the "is-a" relationship.
    //The "has-a" relationship is used to ensure the code reusability in our program.
    //In Composition, we use an instance variable that refers to another object.

    //The composition relationship of two objects is possible when one object contains
    //another object, and that object is fully dependent on it.
    //The contained object should not exist without the existence of its parent object.
    //In a simple way, we can say it is a technique through which we can describe the
    //reference between two or more classes. And for that, we use the instance variable,
    //which should be created before it is used.

    //Library is a building (inheritance) and has books (composition)
    private Book[] books;
    private Libreriant libreriant;
}
