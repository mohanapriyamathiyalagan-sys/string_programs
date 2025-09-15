package oopsConcepts.polymorphism;

public class AdditionOverRide extends OverRidingg {
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        OverRidingg overRidingg = new AdditionOverRide();
        int addition = overRidingg.add(20,30);
        System.out.println("Addition: "+addition);
    }
}
