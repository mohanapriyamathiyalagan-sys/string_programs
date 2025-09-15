package oopsConcepts.polymorphism;

public class OverLoadingg {
    public int add(int a, int b){
        return a+b;
    }
    public float sub(int a, float b){
        return a-b;
    }

    public static void main(String[] args) {
        OverLoadingg overLoadingg = new OverLoadingg();
        int addition = overLoadingg.add(10,20);
        float subtraction =  overLoadingg.sub(20, 9.5F);
        System.out.println("Addition: "+addition);
        System.out.println("Substraction: "+subtraction);
    }
}



