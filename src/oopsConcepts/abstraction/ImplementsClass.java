package oopsConcepts.abstraction;

public class ImplementsClass implements InterfaceInFullyAbstraction{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;

    }

    public static void main(String[] args) {
        ImplementsClass implementsClass = new ImplementsClass();
        int addition = implementsClass.add(20,30);
        int subtraction = implementsClass.sub(30, 20);
        int multiple = implementsClass.mul(5,4);

        System.out.println("Addtion: "+addition);
        System.out.println("Substraction: "+subtraction);
        System.out.println("Mupltiplication: "+multiple);

    }
}
