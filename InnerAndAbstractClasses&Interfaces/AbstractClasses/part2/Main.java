package AbstractClasses.part2;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Alex");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }

}

