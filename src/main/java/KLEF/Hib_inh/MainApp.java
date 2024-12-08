package KLEF.Hib_inh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring context from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        // Retrieve the student bean
        Student student = (Student) context.getBean("student");
        
        // Display student details
        student.displayStudentDetails();
    }
}
