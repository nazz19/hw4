package lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
       BMW bmw = new BMW("BMW",15000,25600,1999);
       Mercedes mercedes = new Mercedes("Mercedes",205555,120555,2010);
       Porsche porsche = new Porsche("Porsche",1450000,145000,2020);
        System.out.println("In Stock Automobiles: ");
shop.addAutomobile(bmw);
shop.addAutomobile(mercedes);
shop.addAutomobile(porsche);

shop.priceOfAutomobiles();
        System.out.println("Write a car that you want to buy(BMW, Mercedes, Porsche): ");
Scanner sc = new Scanner(System.in);
     shop.sellAutomobile(sc.next());
    }
}
