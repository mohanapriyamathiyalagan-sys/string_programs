package monthlySalaryCalculation;

public class MonthlySalaryCalculation {
    public static void main(String[] args) {
        int salary = 1000000;
        MonthlySalaryCalculation Sal = new MonthlySalaryCalculation();
        int MonSalary = Sal.MonSalary(salary);
        System.out.println( "Monthly Salary is: " +MonSalary);

    }
    public int MonSalary(int Salary)
    {
        MonthlySalaryCalculation tax = new MonthlySalaryCalculation();
        int taxCal = tax.taxCalculation(Salary);
        return Salary = (Salary - taxCal)/12;
    }

    public int taxCalculation(int Salary)
    {
        if(Salary<500000)
        {
            return 0;
        }
        else
        {
            return 100000;
        }
    }
}
