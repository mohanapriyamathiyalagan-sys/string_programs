package java_programs;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String reversed = "";

        for(int i = input.length()-1; i>=0; i--){
            reversed+=input.charAt(i);
        }

        if(input.equals(reversed)){
            System.out.println("It is palindrome: "+reversed);
        }
        else{
            System.out.println("It is not a palindrome: "+reversed);
        }
        sc.close();
    }
}
