package domain;

public class Result {
    private String message;
    private boolean result;

    public Result(String message, boolean result) {
        this.message = message;
        this.result = result;
    }

    public Result() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
