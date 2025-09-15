package java_programs;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "Mohanapriya";
        int[] freq = new int[256];
        for(int i = 0 ; i < input.length(); i++){
            char c = input.charAt(i);
            freq[c]++;
        }

        for(int i = 0 ; i < freq.length; i++){
            if(freq[i]>0 && i!= ' '){
                System.out.println((char)i+" : "+freq[i]);
            }
        }
    }
}
