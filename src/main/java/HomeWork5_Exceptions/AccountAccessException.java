package HomeWork5_Exceptions;

public class AccountAccessException extends Exception{
    public AccountAccessException() {
    }

    public AccountAccessException(String message) {
        super(message);
    }

    public AccountAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountAccessException(Throwable cause) {
        super(cause);
    }

    public AccountAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
