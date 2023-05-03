package Products;

public class HotDrink extends Product{
    //Добавляем температуру и объем напитка
    private int temperature;
    private int volume;
//Конструктор
    public HotDrink(String name, Double price,int volume, int temperature){
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
        }
    public int getVolume(){
    return volume;
    }
    public void setVolume(){
    this.volume = volume;
    }
    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(){
        this.temperature = temperature;
    }
// переопределение вывода продукта
    @Override
    public String toString(){
        return "Product{"+
        "name ='"+super.getName()+'\''+
        ", cost = " + super.getPrice() +
        ", temperature = " + temperature +
        ", volume = " + volume +
        '}';
    }

}