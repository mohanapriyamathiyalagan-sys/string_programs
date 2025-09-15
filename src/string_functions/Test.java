package string_functions;

class Test {
    // Method to find factorial
    // of given number

    String str = "Mohana";
    static String str1 = "Priya";
    public static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    // main method
    /*public static void main(String[] args)
    {
        int num = 5;
        int fact = factorial(5);
        System.out.println("Factorial of " + num + " is "
                + fact);
    }*/
}
