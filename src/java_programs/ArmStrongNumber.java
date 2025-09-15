package java_programs;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153, original=num, sum = 0;

        while(num>0){
            int digit = num % 10;
            sum+=digit*digit*digit;
            num = num/10;
        }
        if(sum==original){
            System.out.println(sum+ " is an ArmStrong number");
        }
        else{
            System.out.println(sum+ " is not an ArmStrong number");

        }
    }
}
