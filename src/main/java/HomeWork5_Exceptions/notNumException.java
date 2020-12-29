package HomeWork5_Exceptions;

public class notNumException extends Exception{
    public notNumException() {
    }

    public notNumException(String message) {
        super(message);
    }

    public notNumException(String message, Throwable cause) {
        super(message, cause);
    }

    public notNumException(Throwable cause) {
        super(cause);
    }

    public notNumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
