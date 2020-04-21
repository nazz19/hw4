package lesson;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop {
    private ArrayList<Automobile> automobiles = new ArrayList<>();
    public void addAutomobile(Automobile automobile)
    {
        automobiles.add(automobile);
        System.out.println(automobile);
    }
    public  void priceOfAutomobiles()
    {
        for (Automobile automobile : automobiles) {
           automobile.priceOfAutomobile();
        }

}
public  void sellAutomobile(String sellingCar)
    {
        switch (sellingCar) {
            case  ("BMW"):
                System.out.println("BMW is sold");
                deleteAutomobile(sellingCar);
               inStockAuto();
                break;
            case  ("Mercedes"):
                System.out.println("Mercedes is sold");
                deleteAutomobile(sellingCar);
                inStockAuto();
                break;
            case  ("Porsche"):
                System.out.println("Porsche is sold");
                deleteAutomobile(sellingCar);
                inStockAuto();
                break;
            default:break;
        }
        //System.out.println(automobile.getName()+" is sold");
        //automobile.
    }
 public void deleteAutomobile(String automobileToDelete)
 {
     Iterator<Automobile> it = automobiles.iterator();
     while (it.hasNext()) {
        Automobile nextCar = it.next();
         if(nextCar.getName().equals(automobileToDelete) ) it.remove();
     }
}
public void inStockAuto()
{
    System.out.println("In Stock Automobiles: ");
    for (Automobile automobile1: automobiles)
    System.out.println(automobile1.getName());
}
}

