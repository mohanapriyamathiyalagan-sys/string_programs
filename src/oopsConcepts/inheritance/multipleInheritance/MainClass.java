package oopsConcepts.inheritance.multipleInheritance;

public class MainClass {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Cats cat = new Cats();
        dog.name("Puppy");
        dog.age(3);
        dog.bark();

        cat.name("Dinku");
        cat.age(5);
        cat.meow();

    }
}
