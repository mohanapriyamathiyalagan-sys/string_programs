package java_programs;

public class FibanocciSeries {
    public static void main(String[] args) {
        int n=10;
        int a = 0;
        int b =1;
        System.out.print("Fibanocci Series: ");

        for(int i = 1; i<=n;i++){
            System.out.print(a+ " ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
}
