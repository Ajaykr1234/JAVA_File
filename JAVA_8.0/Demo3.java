import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Demo3 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();

        int num = 10;

        // for (Integer a : l1) {
        // l1.add(num);
        // num++;
        // }

        for (int i = 0; i <= 15; i++) {
            l1.add(num);
            num++;
        }

        List<Integer> l2 = new ArrayList<>();

        for (Integer a2 : l1) {
            if (a2 % 2 == 0) {
                l2.add(a2);
            }
        }
        System.out.println(l2);

        System.out.println("===================================");

        List<Integer> l3 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("===================================");
        l3.forEach(System.out::println);
        System.out.println("===================================");
        l3.forEach(z -> System.out.println(z));
        System.out.println("===================================");
        System.out.println(l3);
    }
}