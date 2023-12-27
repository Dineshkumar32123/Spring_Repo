package annotation.has_a_relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    @Value("PRABU")
    private String tName;
    @Value("10")

    private int tId;
    @Value("34000")
    private double sal;

    @Autowired
    private Student s;

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                ", tId=" + tId +
                ", sal=" + sal +
                ", s=" + s +
                '}';
    }
}
