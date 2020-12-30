package Extentions;

public class DivisionByZero extends Exception {
    private int ErrorCode;
    private String ErrorMsg;

    public int getErrorCode() {
        return ErrorCode;
    }

    public String getErrorMsg() {
        this.ErrorMsg=getMessage();
        return ErrorMsg;
    }

    public DivisionByZero(String message, int ErrorCode) {
        super(message);
        this.ErrorCode = ErrorCode;
    }
}
