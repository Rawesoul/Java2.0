import Input.CheckInput;
import Operations.ToDivide;
import Operations.ToMultiply;
import Operations.ToSubtract;
import Operations.ToSum;

import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
//Инициализируем Scanner и переменные
        double result = 0;
        boolean cycle, EndFlag;
        double Chislo1, Chislo2;
        String Num, Num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число, формат дробного числа 0.0000");

//Запускаем главный цикл. Условие выхода - строка "end"
        do {
            //Определяем первый аргумент для арифметических операций
            Num = in.nextLine();
            CheckInput obj = new CheckInput(Num);
            Chislo1 = obj.getNumber();
            EndFlag = obj.isEndflag();
            if (EndFlag) {
                break;
            }

            //Определяем арифметическую операцию (с проверкой корректности ввода)
            System.out.println("Арифметическая операция (+,-,*,/)");
            String operation = in.nextLine();
            cycle = false;
            while (!cycle) {
                if ((operation.equals("+"))|(operation.equals("-")) | (operation.equals("*")) | (operation.equals("/"))) {
                    cycle = true;
                } else {
                    System.out.println("Некорректное значение. Введите правильный тип арифметической операции (+,-,*,/)");
                    operation = in.nextLine();
                }
            }

            //Определяем второй аргумент для арифметических операций
            System.out.println("Введите второе число");
            Num2 = in.nextLine();
            CheckInput obj2 = new CheckInput(Num2);
            Chislo2 = obj2.getNumber();
            EndFlag = obj2.isEndflag();
            if (EndFlag) {
                break;
            }
            //Определяем результат
            if (operation.equals("+")) {
                result = ToSum.ToSum(Chislo1, Chislo2);
            }
            if (operation.equals("-")) {
                result = ToSubtract.ToSubtract(Chislo1, Chislo2);
            }
            if (operation.equals("*")){
                result = ToMultiply.ToMultiply(Chislo1, Chislo2);
            }
            if ((operation.equals("/"))) {
                result = ToDivide.ToDivide(Chislo1, Chislo2);
            }
            System.out.println("Результат равен "+result+"\nПродолжить? Введите новое число");
        } while (!EndFlag);
    }
}
