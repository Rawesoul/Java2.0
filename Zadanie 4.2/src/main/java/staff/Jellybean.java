package staff;

public class Jellybean extends Sweets {
    private byte JellyPercent;
// Формируем конструктор
    public Jellybean(String brand, Double weight, Double price, byte jellyPercent) {
        super(brand, weight, price);
        JellyPercent = jellyPercent;
    }
// Формируем Getter и Setter
    public byte getJellyPercent() {
        return JellyPercent;
    }

    public void setJellyPercent(byte jellyPercent) {
        JellyPercent = jellyPercent;
    }
//Переопределяем метод toString
    @Override
    public String toString() {
        return "Jellybean{" + super.toString() + "Процент желе = "+ JellyPercent+"%}";
    }
}
