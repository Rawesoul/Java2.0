package staff;

public class Raffaello extends Sweets{
    private String BulkSleeper;
// Формируем конструктор
    public Raffaello(String brand, Double weight, Double price, String bulkSleeper) {
        super(brand, weight, price);
        BulkSleeper = bulkSleeper;
    }
// Формируем Getter и Setter
    public String getBulkSleeper() {
        return BulkSleeper;
    }

    public void setBulkSleeper(String bulkSleeper) {
        BulkSleeper = bulkSleeper;
    }
//Переопределяем метод toString
    @Override
    public String toString() {
        return "Raffaello{" + super.toString() +  "Сладко? " + BulkSleeper + '}';
    }
}
