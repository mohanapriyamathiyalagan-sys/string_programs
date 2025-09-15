package string_functions;

public class Parent
{
    public int a = 10;
    public int b = 15;
    protected String ptr= "Raju";
    protected String ptr1= "Riya";

    public String inherit(int c, String str)
    {
        return c+str;
    }
    private boolean herit()
    {
        boolean boo = ptr == ptr1;
        return boo;
    }
    public int add()
    {
        return a+b;
    }
}
