package Operations;

public class ToDivide {


    public static double ToDivide(double a, double b) {
        double result =0;
        switch ((int)b) {
            case 0:
                System.out.println("Деление на ноль");
                break;
            default: result = a / b;
                     break;
        }
        return result;
    }
}
