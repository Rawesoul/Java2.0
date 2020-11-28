package staff;

public class Sweets {
    private String Brand;
    private Double Weight;
    private Double Price;

    public Sweets(){};

    public Sweets(String brand, Double weight, Double price){
        Brand = brand;
        Weight = weight;
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Наименование " + Brand + ", Вес " + Weight + "г, Цена " + Price + " RUB ";
    }

}
