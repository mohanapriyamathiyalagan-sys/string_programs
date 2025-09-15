package switch_case;

public class Switch_case {
    public static void main(String[] args) {
        int size = 3;
        switch(size) // executes one statement from multiple conditions
        {
            case 1:
                System.out.println("Extra Small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Large");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
