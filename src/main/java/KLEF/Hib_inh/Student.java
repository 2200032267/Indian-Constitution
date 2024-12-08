package KLEF.Hib_inh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    // Non-primitive data types
    private String studentId;
    private String name;
    private String gender;
    private Date dateOfBirth;
    // Primitive data type
    private int age;

    // Constructor injection
    public Student(String studentId, String name, String gender, int age, String dateOfBirth) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        
        try {
            // Convert String to Date
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            this.dateOfBirth = formatter.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Setter methods
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}
