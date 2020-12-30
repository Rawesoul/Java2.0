package Operations;

import Extentions.DivisionByZero;

public class ToOperate  {
    private Double result;

    public Double ToSelect(double a, double b, String str)  {
        switch (str) {
            case "+" -> { ToSum(a, b);  }
            case "-" -> { ToSubtract(a, b); }
            case "*" -> { ToMultiply(a, b); }
            case "/" -> {
                try {
                    ToDivide(a, b);
                } catch (DivisionByZero divisionByZero) {
                    divisionByZero.printStackTrace();
                }
            }
        }
        return result;
    }

    public void ToSum(Double a, Double b) {
        result = a + b;
    }

    public void ToSubtract(Double a, Double b) {
        result = a - b;
    }

    public void ToMultiply(Double a, Double b) {
        result = a * b;
    }

    public void ToDivide(double a, double b) throws DivisionByZero {
        if ((int) b == 0) {
            throw new DivisionByZero("Запрещено деление на ноль. Ошибка", 4400);
        }
        else {
            result = a / b;}
    }


}
