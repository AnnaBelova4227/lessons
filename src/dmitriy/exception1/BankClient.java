package dmitriy.exception1;

public class BankClient{
    private boolean isBadHistory;
    private boolean isTrable;

    public BankClient(boolean isBadHistory, boolean isTrable) {
        this.isBadHistory = isBadHistory;
        this.isTrable = isTrable;
    }
    
    

    public boolean isBadHistory() {
        return isBadHistory;
    }

    public void setBadHistory(boolean badHistory) {
        isBadHistory = badHistory;
    }

    public boolean isTrable() {
        return isTrable;
    }

    public void setTrable(boolean trable) {
        isTrable = trable;
    }
}
