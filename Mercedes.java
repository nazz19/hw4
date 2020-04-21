package lesson;

public class Mercedes extends Automobile {
    public Mercedes(String name, int price, int speed, int year) {
        super(name, price, speed, year);
    }
    public  void priceOfAutomobile(){
        System.out.println("Price of Mercedes:" + getPrice());
    }
}
