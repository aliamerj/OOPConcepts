package joeamerson;
// Abstract class (superClass)
public abstract class Animal {
    // Abstract method (does not have a body)
    public abstract String animalSound();

    public abstract String animalFood();

    // Regular method
    public void sleep(){
        System.out.println("Zzzzz");
    }

}
