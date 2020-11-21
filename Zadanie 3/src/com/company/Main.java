package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите функцию. 1 - калькулятор, 2 - поиск максимального слова в массиве ");
        Scanner in = new Scanner(System.in);
        byte proga = in.nextByte();
        switch (proga) {
            case 1 -> {
                //1. Выбираем тип операции
                System.out.println("Введите тип арифметической операции\n(сложение, вычитание, умножение, деление)");
                Scanner calc = new Scanner(System.in);
                String Type = calc.nextLine();
                //2. Вводим аргументы
                System.out.println("Введите первое число (аргумент операции)");
                double pervoe = in.nextDouble();
                System.out.println("Введите второе число (аргумент операции)");
                double vtoroe = in.nextDouble();
                //2.1. Проверка отсутствия деления на ноль
                if ((Type.equals("деление")) & (vtoroe == 0)) {
                    while (vtoroe == 0) {
                        System.out.println("Деление на ноль. Введите другое число");
                        vtoroe = in.nextDouble();
                    }
                }
                //3. Вычисляем результат и выводим округленное значение
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
            case 2 -> {
               //Определяем длину массива
                Scanner vvod = new Scanner(System.in);
                System.out.println("Введите количество слов");
                int Num = vvod.nextInt();
                //Инициализируем массив
                String[] arr = new String[Num];
                arr[0] = vvod.nextLine();
                // Вводим сравниваем значения
                int max = 0, Nmax = 0;
                for (int i = 1; i<Num+1; i++) {
                    System.out.println("Введите значение элемента массива №=" + i);
                    arr[i - 1] = vvod.nextLine();
                    if (arr[i - 1].length() > max) {
                        max = arr[i - 1].length();
                        Nmax = i - 1;
                    };
                }
                System.out.println("Самое длинное слово №"+Nmax+": "+arr[Nmax]);
            }
        }
    }
}