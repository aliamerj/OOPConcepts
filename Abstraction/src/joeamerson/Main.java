package joeamerson;


public class Main {

    public static void main(String[] args) {
        var dog = new Dog();
        var cat = new Cat();
        var keeper = new AnimalKeeper(dog.animalSound());
        keeper.feeding();

        var keeper2 = new AnimalKeeper(cat.animalSound());
        keeper2.feeding();

    }


}
