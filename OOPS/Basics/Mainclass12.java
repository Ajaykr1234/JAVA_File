class Movies {
    String title;
    String Actor;
    String Actress;
    double duration;
    String Writter;

}

class Mainclass12 {
    public static void main(String[] args) {
        System.out.println("main method started.........................");
        Movies M1 = new Movies();
        M1.title = "Gather2";
        M1.Actor = "sunny Deol";
        M1.Actress = "Priti";
        M1.duration = 120.00;
        M1.Writter = "kalpa";
        System.out.println("title of the movies = " + M1.title);
        System.out.println("actor of the movies = " + M1.Actor);
        System.out.println("actress of the movies = " + M1.Actress);
        System.out.println("duration of the movies = " + M1.duration);
        System.out.println("title of the movies = " + M1.Writter);
        System.out.println("main method ended............................");

    }
}