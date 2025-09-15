package practiceJavaPrograms;

public class MainClass1 {
    public static void main(String[] args) {
        AnagramProgram1 anagramProgram = new AnagramProgram1();
        boolean resultt1 = anagramProgram.AnagramCheck("listen","silent");
        boolean resultt2 = anagramProgram.AnagramCheck("hello", "world");
        System.out.println(resultt1);
        System.out.println(resultt2);

    }
}
