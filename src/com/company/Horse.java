package com.company;

//In order to inherit we will use the extends keyword
public class Horse extends Animal {

    public Horse() {
         // super(); //java does it in the background
        //super("",0,0,0);
    }

    //This constructor just initializing all the fields that we are inheriting from animal
    public Horse(String name, int size, int weight, String color) {
        //super means call the constructor of the class we are extending (inheriting)
        //super has to be first statement in the ctor, and because this() also needs to
        //be first we can't use them together
        super(name, size, weight, 50);
        this.color=color;
        System.out.println("Child ctor");
    }

    //We can define some extra features for the horse i.e legs eyes
    //(since not animals have legs or eyes)
    private int eyes;
    private int legs;
    private String color;
    private boolean isMale;

    //Now we can create another constructor or change the previous one and add all the new fields
    public Horse(String name, int size, int weight, String color, boolean isMale) {
        this(name, size, weight,color);
        this.eyes = 2;
        this.legs = 4;
        this.isMale = isMale;
        System.out.println("Child second ctor");
    }

    //We can override base class methods using the @Override annotation
    public void eat() {
        System.out.println("Horse is eating");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Horse is chewing");
    }

    public void walk(){
        System.out.println("Horse walking");
        super.move(10);
    }

    public void run(){
        System.out.println("Horse running");
        super.move(50);
    }
//    @Override
//    public void move(int speed){
//        System.out.println("horse moving");
//    }

    public String makeSound(String sound){
        System.out.println("Horse making "+sound);
        return sound;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
}
