package annotation.Basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDriver {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        System.out.println(context.getBean("student"));

        Student s = (Student) context.getBean("student");

        s.m1();

    }
}
