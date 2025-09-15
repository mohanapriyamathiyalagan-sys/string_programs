package java_programs;

public class SwapIntegers {
    public static void main(String[] args) {
        int a = 5, b=6;
         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println("After Swap the a value is: "+a);
        System.out.println("After Swap the b value is: "+b);

    }
}