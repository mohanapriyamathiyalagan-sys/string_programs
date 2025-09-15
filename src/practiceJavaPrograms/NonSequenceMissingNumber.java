package practiceJavaPrograms;

import java.util.Arrays;

public class NonSequenceMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 5 , 8, 7};
        int n = 8;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] != i+1){
                System.out.println("Missing number is: "+(i+1));
                return;
            }
        }
        System.out.println("Missing number is: "+n);
    }
}
