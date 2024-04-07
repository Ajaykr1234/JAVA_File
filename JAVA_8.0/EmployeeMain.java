import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<Employee>();

        Employee e1 = new Employee("raja", 45632450, 426842580, "raja@gm");
        Employee e2 = new Employee("ram", 452450, 30000, "ram@gm");
        Employee e3 = new Employee("ahyam", 456324, 4268420, "ahyam@gm");
        Employee e4 = new Employee("raman", 452450, 4262580, "raaman@gm");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);

        List l1 = emp.stream().filter(x -> x.getSalary() <= 30000).collect(Collectors.toList());
        System.out.println(l1);

        List<EmployeeAnotherWay2Create> empAno = new ArrayList<EmployeeAnotherWay2Create>();
        empAno.add(new EmployeeAnotherWay2Create(1, "raja", 4225.00));

        for (EmployeeAnotherWay2Create e : empAno) {
            System.out.println(e);

        }
    }

}
