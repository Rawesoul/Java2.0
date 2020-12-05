package Input;

import java.util.Scanner;

public class CheckInput {
    double number;
    boolean endflag = false;

    public CheckInput(String number) {
        try {
            if (number.equals("end")) {
                endflag = true;
            }
            else {
                this.number = Double.parseDouble(number);
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректное значение");
        }
    }

    public double getNumber() {
        return number;
    }

    public boolean isEndflag() {
        return endflag;
    }
}
