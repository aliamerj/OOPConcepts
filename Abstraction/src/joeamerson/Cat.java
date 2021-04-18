package joeamerson;
//subClass
public class Cat extends Animal{
    @Override
    public String animalSound() {
        return "meo meo";
    }

    @Override
    public String animalFood() {
        return "fish";
    }
    // the Regular method is not necessary to implement

    @Override
    public void sleep() {
        super.sleep();
    }
}
