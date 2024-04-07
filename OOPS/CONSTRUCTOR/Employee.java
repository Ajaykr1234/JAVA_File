public class Employee {
    int id;
    String name;
    double salary;
    Employee(int arg1,String arg2,double arg3){
        System.out.println("employeee construstor...............");
        id = arg1;
        name = arg2;
        salary= arg3;
}
void upsateSalary(double sal){
         System.out.println("update salary...............");
          salary = sal;

}
    
}
