package practiceJavaPrograms;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int num = 100;
        int count =0;
        int count1=0;
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 1;i<=num;i++){
            if(i % 2==0){
               count++;
               evenSum+=i;

            }
            else
            {
                count1++;
                oddSum+=i;
            }
        }
        System.out.println("Addition of all even numbers: "+evenSum);
        System.out.println("Even numbers count are: "+count);
        System.out.println("Addition of all even numbers: "+oddSum);
        System.out.println("Odd numbers count are: "+count1);
        int totalSum=0;
        totalSum = count+count1;
        System.out.println("Sum of even and odd numbers: "+totalSum);

    }
}
