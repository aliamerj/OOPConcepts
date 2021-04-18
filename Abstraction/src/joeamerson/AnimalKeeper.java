package joeamerson;

public class AnimalKeeper {
    private String sound= "";


    public AnimalKeeper(String sound) {
        this.sound = sound;
    }
    //Todo :- keeper give every animal what its like
    public void feeding(){
        var dog = new Dog();
        var cat = new Cat();

        if (sound.equals(dog.animalSound())){
            System.out.println("I hear "+ sound);
            System.out.println("dog is hungry, i will feed it");
            System.out.println("i gave it  "+ dog.animalFood());

        } else if (sound.equals(cat.animalSound())){
            System.out.println("I hear "+ sound);
            System.out.println("cat is hungry, i will feed it");
            System.out.println("i gave it  "+ cat.animalFood());
        }

    }
}
