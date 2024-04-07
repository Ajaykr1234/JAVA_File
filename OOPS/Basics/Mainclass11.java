class TextBook {
    String Title;
    String Author;
    double price;

}

public class Mainclass11 {
    public static void main(String[] args) {
        System.out.println("main method Started.......................");
        TextBook T1 = new TextBook();
        T1.Title = "java";
        T1.Author = "james josling";
        T1.price = 50000.0;
        System.out.println("title of the book is = " + T1.Title);
        System.out.println("Author of the book is = " + T1.Author);
        System.out.println("price of the book is = " + T1.price);
        System.out.println("......................................................");
        TextBook t2 = new TextBook();
        t2.Title = "python";
        t2.Author = "ramanya";
        t2.price = 8000.014;
        System.out.println("title of the book is = " + t2.Title);
        System.out.println("Author of the book is = " + t2.Author);
        System.out.println("price of the book is = " + t2.price);
        System.out.println("main method ended...........................");
    }

}
