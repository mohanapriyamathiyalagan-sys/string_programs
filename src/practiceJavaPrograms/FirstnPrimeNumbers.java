package practiceJavaPrograms;

public class FirstnPrimeNumbers {
    public static void main(String[] args) {
        int num = 1000;
        int[] output = new int[1000];
        boolean isPrime = true;
        int index = 0;
        for(int i = 2; i<num;i++){
            for(int j = 2; j<i;j++){
                if(i%j==0){
                    isPrime = false;

                }
            }
            if(isPrime){
                output[index] = i;
                index++;
            }
            isPrime=true;
        }
        for(int k = 0; k<output.length;k++){
            if(output[k]!=0)
            System.out.print(output[k]+" ");
        }
    }
}
