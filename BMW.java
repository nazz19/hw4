package lesson;

public class BMW extends Automobile {
    public BMW(String name, int price, int speed, int year) {
        super(name, price, speed, year);
    }
    public  void priceOfAutomobile(){

        System.out.println("Price of BMW: "+getPrice());
    }
}
