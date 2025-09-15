package java_programs;

public class FindLargestAndSecondLargestNum1 {
    public static void main(String[] args) {
        int[] arr = {15, 3, 35, 12, 19, 26};
        int firstLargest = 0, secondLargest = 0;

        if(arr[1]>arr[0]){
            firstLargest = arr[1];
            secondLargest = arr[0];
        }
        else{
            secondLargest= arr[1];
            firstLargest = arr[0];
        }

        for(int i =2;i<arr.length;i++){

            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
            }
        System.out.println("First Largest value: "+firstLargest);
        System.out.println("Second Largest Value: "+secondLargest);
    }
}
