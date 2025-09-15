package java_programs;

import java.util.Arrays;

public class FindLargestAndSecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {15, 3, 35, 12, 19, 26};
        if(arr.length<2){
            System.out.println("Required more values");
            return;
        }

        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i]!=largest){
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Largest value: "+largest);
        if(secondLargest!=Integer.MIN_VALUE)
        {
            System.out.println("Second Largest value: "+secondLargest);
        }
        else{
            System.out.println("All the values are same");
        }
    }
}
