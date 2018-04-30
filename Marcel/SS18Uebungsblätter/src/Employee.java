public class Employee {
    private String firstname, lastname;
    public String workingDescription, departmentName;
    public Date birthday;
    public double salary;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
