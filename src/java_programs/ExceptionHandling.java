package java_programs;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        eh.ageCalculate(15);
       try{
            int result = 10/0;
        }
        catch(ArithmeticException e){
           System.out.println("You can't divide the number by zero");
       }
        finally{
            System.out.println("This will always run");
        }
    }
    public void ageCalculate(int num){
       // int age = 15;
        if(num<18){
            throw new ArithmeticException("Too young");
        }
    }
}
