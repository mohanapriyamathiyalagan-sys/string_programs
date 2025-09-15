package java_programs;

public class StudentEncapsulationProgram {
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        StudentEncapsulationProgram s = new StudentEncapsulationProgram();
        s.setName("Priya");
        System.out.println(s.getName());
    }
}
