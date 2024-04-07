class Program1 {
    public static void main(String[] args) {

        //Variable declaration
        String ename;
        int age;
        double esalary;


        // variable initialization
        ename = "Ramesh";
        age = 24;
        esalary = 400000.00;
        System.out.println(ename);
        System.out.println(age);
        System.out.println(esalary);
        

        // types of printing formate
        System.out.println(ename + " " + age + " " + esalary);
        System.out.println(ename + "," + age + "," + esalary);
        System.out.println(ename + "\t" + age + "\t" + esalary);
        System.out.println(ename + "\n" + age + "\n" + esalary);

    }
}