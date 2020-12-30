package HomeWork5_Exceptions;

public class notExistAccountException extends Exception{
    public notExistAccountException() {
    }

    public notExistAccountException(String message) {
        super(message);
    }

    public notExistAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public notExistAccountException(Throwable cause) {
        super(cause);
    }

    public notExistAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
