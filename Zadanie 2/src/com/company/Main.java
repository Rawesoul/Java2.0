package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         *  1. Выбираем тип операции
         */
        System.out.println("Введите тип арифметической операции\n(сложение, вычитание, умножение, деление)");
        Scanner in = new Scanner(System.in);
        String Type = in.nextLine();
        /**
         * 2. Вводим аргументы
         */
        System.out.println("Введите первое число");
        double pervoe = in.nextDouble();
        System.out.println("Введите второе число");
        double vtoroe = in.nextDouble();
        /**
         * 2.1. Проверка отсутствия деления на ноль
         */
        if ((Type.equals("деление")) & (vtoroe == 0)) {
            while (vtoroe==0) {
                System.out.println("Деление на ноль. Введите другое число");
                vtoroe = in.nextDouble();
            }
        };
        /**
         * 3. Вычисляем результат и выводим округленное значение
         */
        double result = switch (Type) {
            case "сложение" -> pervoe + vtoroe;
            case "вычитание" -> pervoe - vtoroe;
            case "умножение" -> pervoe * vtoroe;
            case "деление" -> pervoe / vtoroe;
            default -> 0;
        };
        System.out.println("Результат:");
        System.out.printf("%.4f", result);
    }
}
