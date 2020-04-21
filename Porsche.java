package lesson;

public class Porsche extends Automobile {
    public Porsche(String name, int price, int speed, int year) {
        super(name, price, speed, year);
    }
    public  void priceOfAutomobile(){
        System.out.println("Price of Porsche:" + getPrice());
    }
}
