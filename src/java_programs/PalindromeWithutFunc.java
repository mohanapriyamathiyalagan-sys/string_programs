package java_programs;

import java.util.Scanner;

public class PalindromeWithutFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        boolean boo = true;
        int len = input.length();
        for(int i = 0; i < len /2; i++){
            if(input.charAt(i)!= input.charAt(len - 1 -i)){
                boo = false;
                break;
            }
        }

        if(boo){
            System.out.print("It is palindrome: "+input);
        }
        else{
            System.out.print("It is not a palindrome");
        }
        sc.close();
    }
}
