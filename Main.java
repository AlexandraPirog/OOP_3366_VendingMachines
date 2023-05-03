import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.GUIForVendingMachines;
import VendingMachines.VendingMachine;

public class Main {
    public static void main(String[] args) {

        Product item1 = new Product("Cola", 88.00);
        item1.setPrice(98.0);
        System.out.println( item1.toString());
        VendingMachine itemMachine = new VendingMachine(300);
        //itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снэк", 30.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachine.addProduct(new HotDrink("Medium Cappucсino",50.0,350,65));
        itemMachine.addProduct(new HotDrink("Large Cappucсino",60.0,450,65));
        itemMachine.addProduct(new HotDrink("Medium Vanilla Latte",55.0,350,65));
        itemMachine.addProduct(new HotDrink("Large Vanilla Latte", 65.0, 450,65));
        itemMachine.addProduct(new HotDrink("Mega Large Caramel-Vanilla Latte with Whipped cream and small Marshmallows on top", 150.0,600,65));

        for(Product prod: itemMachine.getProdAll()){
            System.out.println(prod.toString());
        }
        GUIForVendingMachines app= new GUIForVendingMachines();
        app.setVisible(true);
    }
}