package java_programs;

public class SubArray {
    public static void main(String[] args) {
        int[] array = {1,4,0,0,3,2,1};
        int targetSum = 7;

        for(int i =0; i<array.length;i++){
            int sum = 0;
            for(int j =i;j<array.length;j++){
                sum+=array[j];
                if(sum==targetSum) {
                    System.out.println("SubArray");
                    for(int k = i;k<=j;k++){
                        System.out.print(array[k]+" ");
                    }
                }
            }
        }
    }
}
