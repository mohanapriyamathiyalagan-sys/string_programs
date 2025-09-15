package oopsConcepts.Encapsulation;

public class StudentEncapsule {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name: "+name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("Address: "+address);
    }

    public static void main(String[] args) {
        StudentEncapsule student = new StudentEncapsule();
        student.setName("Mohanapriya");
        student.setAddress("Chennai");
    }
}
