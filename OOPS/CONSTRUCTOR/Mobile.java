public class Mobile {
    String Brand;
    String color;
    Double price;

    Mobile(String Brand,String color,Double price){
        this.Brand=Brand;
        this.color=color;
        this.price= price;
    }
    void updateprice(double price){
        this.price=price;
    }
    void Details(){
    System.out.print("Brand of the mobile = "+Brand + '\n'+"   color of the mobile is = "+color+'\n'+"   price of the mobile is = "+price);
    }
    
}
