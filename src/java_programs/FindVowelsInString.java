package java_programs;

public class FindVowelsInString {
    public static void main(String[] args) {
        String str = "Mohanapriya";
        String str1 = str.toLowerCase();
        for(int i =0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(" "+ch);
            }
        }
    }
}
