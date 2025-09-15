package practiceJavaPrograms;

public class LeapYearInArray {
    public static void main(String[] args) {
        int[] array = {1996, 1997, 1998, 1999, 2000};
        //boolean isLeapYear = false;
        int len = array.length;
        System.out.println("Leap year: ");
        for(int i =0;i<len;i++){
            if(array[i]%4==0){
                //isLeapYear = true;
                System.out.print(array[i]+" ");
            }
        }
    }
}
