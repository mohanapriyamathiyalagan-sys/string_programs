package practiceJavaPrograms;

public class PrimeInArray {
    public static void main(String[] args) {
        int[] arr = {3, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int len = arr.length;
        boolean isPrime = true;
        System.out.println("Prime numbers are : ");
        for (int i = 0; i < len; i++) {
            for (int j = 2; j < arr[i]/2; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(arr[i]+" ");
            }
           isPrime = true;

        }
    }
}
