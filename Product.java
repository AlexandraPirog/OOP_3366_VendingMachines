package Products;
//Базовый класс продукта
public class Product {
    //Наименование продукта
    private String name;
    //Цена продукта
    private Double price;
    /*Конструктор продукта 2 параметра
    * @param name - наименование продукта
    * @param price - цена продукта
    * */
    public Product (String name, double price) {
        if (name == "") {
            throw new IllegalStateException(String.format("У продукта отсутствует наивенование!"));
        } else {
            this.name = name;
            this.price = price;
        }
    }
    //Устанавливаем цену продукта
    public void setPrice(Double value) {
        if (value <= 0) {
            throw new IllegalStateException((String.format("Цена указана неверно!")));
        } else {
            this.price = value;
        }
    }
// Устанавливаем имя продукта
//    public void setName(String name) {
//        if (name == "") {
//            throw new IllegalStateException(String.format("У продукта отсутствует наивенование!"));
//        } else {
//            this.name = name;
//        }
//    }
    //Получаем Имя продукта
    public String getName(){
        return name;
    }
    // Получаем Цену продукта
    public Double getPrice(){
        return price;
    }
    // переопределение вывода продукта
    @Override
    public String toString(){
    return "Product{"+
            "name ='"+name+'\''+
            ", cost = " + price +
            '}';
    }

}