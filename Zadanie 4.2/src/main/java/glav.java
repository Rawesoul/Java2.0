import staff.Candy;
import staff.Jellybean;
import staff.Raffaello;
import staff.Sweets;

/**
 ** Created by Zadvornov Georgii 28.11.2020
 * @see Candy
 * @see Jellybean
 * @see Raffaello
 * @see Sweets
 */

public class glav {

    public static void main(String[] args) {
        System.out.println("Состав подарка:");
//Определяем параметры подарков
        Candy candy = new Candy("Candy",199.9,444.5, true );
        Jellybean jellybean = new Jellybean("Jellybean", 222.2, 1024.0, (byte) 42);
        Raffaello raffaello = new Raffaello("Raffaello", 100.24, 512.0, "Конечно");
        Raffaello raffaello_malina = new Raffaello("Raffaello Малина", 128.24, 667.13, "И от этого тоже");
//Формируем коробку, выводим список подарков, вычисляем общие цену и вес и выводим их на экран
        Sweets[] box = {candy, jellybean, raffaello, raffaello_malina};
        Double GeneralWeight = 0.0,GeneralPrice =0.0;
        for (Sweets AllOfSweets: box) {
            GeneralWeight += AllOfSweets.getWeight();
            GeneralPrice += AllOfSweets.getPrice();
            System.out.println(AllOfSweets.toString());
        }
        System.out.println("Общий вес подарка равен "+GeneralWeight+ " грамм");
        System.out.println("Общая стоимость подарка равна "+GeneralPrice+ " RUB");
    }
}
