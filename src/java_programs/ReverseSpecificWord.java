package java_programs;

public class ReverseSpecificWord {
    public static void main(String[] args) {
        String input = "Java online complier";
        String[] split = input.split(" ");
        String target = split[split.length-1];
        String reversed = "";
        for(int i = target.length()-1; i>=0; i--){
            reversed += target.charAt(i);
        }
        String finalStr = input.replace(target, reversed);
        System.out.println("Last word reversed: "+finalStr);

    }
}
