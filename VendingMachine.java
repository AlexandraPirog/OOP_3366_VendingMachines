package VendingMachines;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;
    //Конструктор
    public VendingMachine(int volume){
        products = new ArrayList<Product>();
        this.volume = volume;
        workLog = new ArrayList<String>();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
    public void addSales(String line){
        workLog.add(line);
    }
    public Product getProdByName(String name){
        for( Product prod: products){
            if(prod.getName().contains(name)){
                return prod;
            }
        }
        return null;
    }
    public List<Product> getProdAll(){
        return products;
    }
}
