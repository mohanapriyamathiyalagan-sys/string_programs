package practiceJavaPrograms;

public class NonSequenceMissingNumberLogic1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 2, 4, 7, 6};
        int n = 8;

        for(int i =0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i =0;i<arr.length;i++){
            if(arr[i] != i+1){
                System.out.println("Missing numbers are: "+(i+1));
                return;
            }
        }
        System.out.println("Missing number are: "+n);

    }
}
