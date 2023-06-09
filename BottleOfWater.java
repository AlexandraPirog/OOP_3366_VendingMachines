package Products;

public class BottleOfWater extends Product{
    private int volume;
    public BottleOfWater(String name, Double price, int volume){
        super(name, price);
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(){
        this.volume = volume;
    }
    // переопределение вывода продукта
    @Override
    public String toString(){
        return "Product{"+
                "name ='"+super.getName()+'\''+
                ", cost = " + super.getPrice() +
                ", volume = " + volume +
                '}';
    }
}
