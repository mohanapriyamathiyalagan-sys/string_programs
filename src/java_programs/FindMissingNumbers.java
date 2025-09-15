package java_programs;

import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] input = {1,3,4,5,7,9,10,13};
        int n = 13;
        System.out.print("Array are: ");
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Missing numbers are: ");


        for(int i =1; i<=n;i++){
            boolean found = false;
            for(int j=0;j<input.length;j++) {

                if (input[j]==i) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(i+" ");
            }
        }



    }
}
