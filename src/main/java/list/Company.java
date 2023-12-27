package list;

import java.util.List;

public class Company {

    private String name;
    private String loc;
    private String mail_id;
    private List<String> emp_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public List<String> getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(List<String> emp_name) {
        this.emp_name = emp_name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                ", mail_id='" + mail_id + '\'' +
                ", emp_name=" + emp_name +
                '}';
    }
}