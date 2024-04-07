import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Studentmain {

    public static void main(String[] args) {

        Student s1 = new Student(01, "Rahul", "rahul@mail.com", 1225.02);

        // System.out.println(s1.email());

        List<Student> stu = new ArrayList<Student>(Arrays.asList(s1));

        List s2 = stu.stream().filter(x -> x.id() >= 1).collect(Collectors.toList());

        s2.forEach(System.out::println);

    }

}
