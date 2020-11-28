package staff;

public class Candy extends Sweets {
    private boolean ChocolateMilk;

// Формируем конструктор
    public Candy(String brand, Double weight, Double price, boolean chocolateMilk) {
        super(brand, weight, price);
        ChocolateMilk = chocolateMilk;
    }
// Формируем Getter и Setter
    public boolean isChocolateMilk() {
        return ChocolateMilk;
    }

    public void setChocolateMilk(boolean chocolateMilk) {
        ChocolateMilk = chocolateMilk;
    }
//Переопределяем метод toString
    @Override
    public String toString() {
        return "Candy{" + super.toString() + "Шоколад молочный? " + ChocolateMilk +'}';
    }
}
