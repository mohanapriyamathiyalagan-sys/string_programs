package oopsConcepts.inheritance.singleInheritance;

public class Animal{
    int age;
    String name;

    protected void name(String name) {
        System.out.println("Dog's name is: "+name);
    }

    protected void age(int age) {
        System.out.println("Dog's age is: "+age);
    }
}

