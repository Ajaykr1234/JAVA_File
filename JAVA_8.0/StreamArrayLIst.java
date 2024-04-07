import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamArrayLIst {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();
        l1.add("Ram");
        l1.add("Raja");
        l1.add("shyam");
        l1.add("tiger");

        // List<String> l2 = Arrays.asList("abc","hhj","jhjo","hjk"); secound way
        System.out.println(l1);

        l1.stream().map(s -> s.length()).forEach(System.out::println);

        List l2 = l1.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.println(l2);

    }

}
