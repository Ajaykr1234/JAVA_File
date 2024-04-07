public class Employee {

    private String name;

    private long phone;

    private int salary;

    private String email;

    public Employee(String name, long phone, int salary, String email) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", phone=" + phone + ", salary=" + salary + ", email=" + email + "]";
    }

}
