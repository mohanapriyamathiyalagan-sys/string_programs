package string_functions;

public class Calculator {
    public static void main(String[] args) {
        int choice = 4, ans, a=2, b=3;
        Inherit herit = new Inherit();
        switch(choice){
            case 1:
                ans = herit.add(a,b);
                break;
            case 2:
                ans = herit.sub(a,b);
                break;
            case 3:
                ans = herit.multiple(a,b);
                break;
            case 4:
                ans = herit.divide(a,b);
                break;
        }
    }
}
