package dmitriy.exception1;

public class WorkerBank implements BankWorker {
    
    public boolean checkClientForCredit(BankClient client){
        if (client.isBadHistory()){
            throw new BadCreditHistoryException("плохая кредитная история");
        }
        if (client.isTrable()){
            throw new ProblemWithLawException();
        }
        return true;
    }
    
}
