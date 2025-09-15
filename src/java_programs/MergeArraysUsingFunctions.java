package java_programs;

public class MergeArraysUsingFunctions {

    public void mergeArrays(int[] arr, int[] arr1){
        int[] arr2 = new int[arr.length+arr1.length];

        for(int i =0; i<arr.length;i++){
            arr2[i] = arr[i];
        }

        for(int i=0;i<arr1.length;i++){
            arr2[arr.length+i]=arr1[i];
        }

        System.out.println("Unique elements: ");

        for(int i =0;i<arr2.length;i++){
            boolean isBoolean = false;
            for(int j =0;j<arr2.length;j++){
                if(i!=j && arr2[i]==arr2[j])
                {
                    isBoolean = true;
                    break;
                }
            }
            if(!isBoolean){
                System.out.print(arr2[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = {1,6,5,3};
        MergeArraysUsingFunctions merge = new MergeArraysUsingFunctions();
        merge.mergeArrays(arr, arr1);

    }
}
