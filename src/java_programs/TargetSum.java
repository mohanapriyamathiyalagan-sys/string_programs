package java_programs;

public class TargetSum {
    public static void main(String[] args) {
        int[] array = {2,4,3,5,6,-1,8,7};
        int target = 7;
        System.out.println("Output is: ");
        for(int i =0;i<array.length;i++){
            for(int j = i+1;j<array.length;j++){
                int sum = array[i]+array[j];
                if(target == sum){
                    System.out.println(array[i]+" , "+array[j]);
                }
            }
        }

    }
}
