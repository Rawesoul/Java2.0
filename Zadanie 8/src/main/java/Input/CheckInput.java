package Input;

import java.util.Scanner;

public class CheckInput {
    double Digit;
    String str;
    boolean endflag = false;
    Scanner in = new Scanner(System.in);

    public CheckInput(String NumStr) {
        this.str = NumStr;
    }

    public double CheckNum() {
        try {
            if (str.equals("end")) {
                endflag = true;
            }
            else {
                Digit = Double.parseDouble(str);
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректное значение");
            endflag = true;
        }
        return Digit;
    }

    public String CheckOperation() {
        boolean cycle = false;
        while (!cycle) {
            if ((str.equals("+"))|(str.equals("-")) | (str.equals("*")) | (str.equals("/"))) {
                cycle = true;
            } else if (str.equals("end")) {endflag = true; cycle = true;}
                else {
                System.out.println("Некорректное значение. Введите правильный тип арифметической операции" +
                        " (+,-,*,/)");
                str = in.nextLine();
            }
        }
        return str;
    }

    public boolean isEndflag() {
        return endflag;
    }
}
