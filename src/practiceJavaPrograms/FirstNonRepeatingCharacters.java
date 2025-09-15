package practiceJavaPrograms;

public class FirstNonRepeatingCharacters {
    public static void main(String[] args) {
        String input = "MohanapriyaM";
        for(int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(input.indexOf(ch)==input.lastIndexOf(ch)){
                System.out.println("First Non repeating character: "+ch);
                return;
            }
        }
    }
}
