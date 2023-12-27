package annotation.has_a_relation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("DINESH")
    private String sName;
    @Value("01")
    private int sId;
    @Value("99")
    private String mark;

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sId=" + sId +
                ", mark='" + mark + '\'' +
                '}';
    }
}
