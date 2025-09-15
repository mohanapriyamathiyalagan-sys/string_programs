package java_programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7,  count = 0;
        for(int i =2; i<=num/2;i++){
            if(num%2==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(num+" is a Prime number");
        }
        else{
            System.out.println(num+" is not a Prime number");
        }
    }
}
