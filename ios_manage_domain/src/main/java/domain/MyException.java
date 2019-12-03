package domain;

public class MyException extends Exception{
    private String message;
    private String code;

    public MyException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
