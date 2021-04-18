package joeamerson;
//subClass

public class Dog extends Animal{

    @Override
    public String animalSound() {
        return "ao ao ao ";
    }

    @Override
    public String animalFood() {

        return "Meat";
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
