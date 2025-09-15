package java_programs;

import java.util.Scanner;

public class MajorityNnumbers {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int[] array = {2,2,1,3,2,2};
        int len = array.length/2;
        int count=0;

        for(int i = 0;i<array.length;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i]==array[j]) {
                    count++;
                    break;

                }
            }
        }
        if(count>=len){
            System.out.println("Majority count is: "+count);
        }
        else{
            System.out.println("No Majority count");
        }
    }
}
