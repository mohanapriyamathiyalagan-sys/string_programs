package java_programs;

public class NonRepeatingCharacterInString {
    public static void main(String[] args) {
        String str = "swiss";

        for(int i = 0; i<str.length()-1;i++){
            char c = str.charAt(i);
            boolean isUnique = true;
            for(int j = 0; j<str.length()-1;j++){
                if(i!=j && c == str.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(c);
                return;
            }
        }
    }
}
