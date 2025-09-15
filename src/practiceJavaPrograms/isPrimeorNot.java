package practiceJavaPrograms;

public class isPrimeorNot {
    public static void main(String[] args) {
        int num = 18;
        boolean found = true;
        if(num<=1){
            found=false;
        }

        for(int i =2; i<=num/2;i++){
            if(num%i==0){
                found = false;
                break;
            }
        }
        if(found){
            System.out.println(num+" is a Prime number");
        }
        else{
            System.out.println(num+" is not a Prime number");
        }
    }
}
