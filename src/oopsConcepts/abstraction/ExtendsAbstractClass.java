package oopsConcepts.abstraction;

public class ExtendsAbstractClass extends AbstractClass{
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new ExtendsAbstractClass();
        int addition = abstractClass.add(4, 5);
        int subtraction = abstractClass.sub(7,2);
        int multiple = abstractClass.mul(6,3);

        System.out.println("Addition: "+addition);
        System.out.println("Substraction: "+subtraction);
        System.out.println("Multiplication: "+multiple);

    }
}
