import Input.CheckInput;
import Operations.ToOperate;

import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
//Инициализируем Scanner и переменные
    double Digit1, Digit2, result;
    Scanner in = new Scanner(System.in);
    String operation;
    System.out.println("Введите первое число, формат дробного числа 0.0000");
//Запускаем главный цикл. Условие выхода - строка "end"
  do {
      //Определяем первый аргумент для арифметических операций
      CheckInput obj1 = new CheckInput(in.nextLine());
      Digit1 = obj1.CheckNum();
      if (obj1.isEndflag()) {
          break;
      }
      //Определяем арифметическую операцию (с проверкой корректности ввода)
      System.out.println("Арифметическая операция (+,-,*,/)");
      CheckInput objOper = new CheckInput(in.nextLine());
      operation = objOper.CheckOperation();
      if (objOper.isEndflag()) {
          break;
      }

      //Определяем второй аргумент для арифметических операций
      System.out.println("Введите второе число");
      CheckInput obj2 = new CheckInput(in.nextLine());
      Digit2 = obj2.CheckNum();
      if (obj2.isEndflag()) {
          break;
      }
      //Определяем результат
      ToOperate res = new ToOperate();
      result = res.ToSelect(Digit1, Digit2, operation);


      System.out.println("Результат равен " + result + "\nПродолжить? Введите новое число");
     } while (true);
  }
}
