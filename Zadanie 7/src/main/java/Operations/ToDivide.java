package Operations;

import Extentions.DivisionByZero;

public class ToDivide {

    public static double ToDivide(double a, double b) throws DivisionByZero {
        double result =0;
        switch ((int)b) {
            case 0:
                throw new DivisionByZero("Запрещено деление на ноль. Ошибка", 4400);
            default: result = a / b;
                return result;
        }
    }
}
