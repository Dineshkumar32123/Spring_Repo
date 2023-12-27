package annotation.has_a_relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeacherDriver {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Teacher t = (Teacher) context.getBean("teacher");

        System.out.println(t);


    }
}
