package string_functions;

import java.sql.SQLOutput;

public class Student{
    private String name;
    private String gender;
    private String address;

    public Student(String a, String b, String c) {
     name=a;
     gender=b;
     address=c;
    }
    public void display(){
        System.out.println("Student's name is " +name);
        System.out.println("Student's Gender: "+gender);
        System.out.println("Student's address: "+address);
    }
}

