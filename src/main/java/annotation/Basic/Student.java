package annotation.Basic;

import org.springframework.stereotype.Component;

@Component
public class Student {

    Student(){
        System.out.println("Constructor is called....");
    }

    public void m1(){
        System.out.println("M1 method is called....");
    }
}
