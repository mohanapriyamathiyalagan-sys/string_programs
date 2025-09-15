package practiceJavaPrograms;

public class MainClass {
    public static void main(String[] args) {
        AnagramsChecker checker = new AnagramsChecker();
        boolean result = checker.anagramChecker("silent", "listen");
        boolean result1 = checker.anagramChecker("hello", "world");
        System.out.println(result);
        System.out.println(result1);



    }
}
