package annotation.inbuildclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InbuildDriver {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(InbuildConfig.class);


        Inbuild i = (Inbuild) context.getBean("inbuild");

        System.out.println(i.l);

    }
}
