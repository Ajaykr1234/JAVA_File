class Employee {
    int ID;
    String name;
    double Salary;

    void updateId(int d) {
        System.out.println("updating id of employee.....");
        ID = d;

    }

    void updateName(String n) {
        System.out.println("updating name of employee.............");
        name = n;
    }

    void updatesalary(double s) {
        System.out.println("updating salary.................");
        Salary = s;
    }
}

public class Mainclass15 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.updateId(454757);
        E1.updateName("Ram");
        E1.updatesalary(50000.00);
        System.out.println("employee id is " + E1.ID);
        System.out.println("employee name is " + E1.name);
        System.out.println("employee Salary is " + E1.Salary);
    }

}
