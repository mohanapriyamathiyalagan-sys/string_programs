package practiceJavaPrograms;


public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,10};
        System.out.print("Original numbers: ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Missing numbers: ");
        int[] output = new int[20];
        int temp =0;
        for(int i =0; i<arr.length-1;i++){
            int current = arr[i];
            int next = arr[i+1];
            if(next!=current+1){
                for(int j = current+1; j<next;j++){
                    output[temp]=j;
                    temp++;
                }
            }
        }
        for(int i =0 ; i<temp;i++){
            System.out.print(output[i]+" ");
        }
    }
}
