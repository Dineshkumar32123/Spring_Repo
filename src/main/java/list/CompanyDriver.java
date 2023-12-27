package list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CompanyConfig.xml");
        Company c = (Company) context.getBean("cref");
        System.out.println(c);
    }
}
