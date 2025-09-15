package switch_case;

public class PowetOfTwo {

    public static void main(String[] args) {
        String str = "RiyaRajuuuuuuuuu";
        int len = str.length();
        int tempLen = len;

        boolean powerOfTwo = true;

        while(tempLen>1){
            if(tempLen%2!=0){
                powerOfTwo = false;
                break;
            }
            tempLen = tempLen/2;
        }

        if(powerOfTwo){
            String reversed = "";
            for(int i=len-1;i>=0;i--){
                reversed += str.charAt(i);
            }
            System.out.println("Reversed: "+reversed);
        }else{
            System.out.println("Original: "+str);
        }
    }
}
