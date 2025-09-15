package string_functions;

public class StringFun {
    public static void main(String[] args) {
        String str = "Mohana priya";
        int length = str.length();
        String s1= str.toLowerCase();
        String s2= str.replace("priya", "Raju");
        System.out.println("length of the String is "+length);
        System.out.println("Lowercase: "+s1);
        System.out.println("Replace the string: "+s2);
    }
}
