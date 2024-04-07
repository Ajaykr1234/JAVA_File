public class Program10 {
    public static void main(String[] args) {

        /*
         * type one post inreament
         * 
         * int x = 0;
         * int y = 0;
         * y = x++;
         * 
         */

        /**
         * this is pre increamrnt
         * 
         * int x = 0;
         * int y = 0;
         * y = ++x;
         **/

        int x = 0;
        int y = 0;
        y = x + x++;

        System.out.println(x);
        System.out.println(y);
    }

}
