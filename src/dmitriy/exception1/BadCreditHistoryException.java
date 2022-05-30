package dmitriy.exception1;

public class BadCreditHistoryException extends RuntimeException{
    public BadCreditHistoryException(String msg) {
        super(msg);
    }
}
