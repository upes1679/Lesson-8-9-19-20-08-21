package ReferencesVsValue;

import com.company.Horse;

public class Main {
    public static void main(String[] args){
        Horse whiteHorse= new Horse("name",10,10,"white");
        Horse anotherHorse= whiteHorse;

        System.out.println(whiteHorse.getColor());
        System.out.println(anotherHorse.getColor());

        anotherHorse.setColor("Black");

        System.out.println(whiteHorse.getColor());
        System.out.println(anotherHorse.getColor());

        Horse greenHorse=new Horse("greeny",100,100,"green");
        anotherHorse=greenHorse;

        System.out.println(whiteHorse.getColor());
        System.out.println(anotherHorse.getColor());
        System.out.println(greenHorse.getColor());

        //In java objects are always reference types
        //What we did here is called shallow copy or copy reference
        //We learned that there are also primitive types (also called value types)
        //so what is the difference between the two?

        //In order to get it lets first understand what is the heep and the stack.
        //Stack is the place where we save all of our primitive types
        //Reference types are stored on the heap and each of them has a unique address
        //a reference to this unique address is stored on the stack
        //So basically when do a shallow copy (or shallow clone) we are just copying the pointer
        //the object stays the same in the heap
        //I mentioned immutable objects few lessons ago when talking about string.
        //immutable object can't be manipulated or changed on the heap

        //So what is happening when copying primitive types?
        //in this case we copy by value (deep copy or deep clone).
        //Here is an example:

        int a=10;
        int b=a;

        System.out.println(a);
        System.out.println(b);
        a=50;
        System.out.println(a);
        System.out.println(b);

        //As you can see this time changing a didn't caused b to change, this is
        //because when we deep copied,
        //we copied the value and stored another copy of the same value inside the heep
        //instead of copying an address, this happened because if you remember primitive types
        //are always stored on the stack

        //Arrays are also considered as reference type
        //When we are changing a string we are saving it in another location in the heap
        //and change the pointer, this is why String is immutable
    }
}
