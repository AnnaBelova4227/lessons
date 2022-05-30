package dmitriy.exception1;


/*
Есть класс BankClient - это класс, описывающий клиента банка.
Есть интерфейс BankWorker. Объект класса, который реализует этот
интерфейс является работником банка, в задачу которого входит одобрение
или отклонение заявок на кредиты.
У него есть метод checkClientForCredit, который на вход принимает экземпляр BankClient
и возвращает true, если всё впорядке и кредит переданному клиенту можно выдавать,
или false - если клиент не подходит под условия кредита. Также, этот метод может выбросить
исключение BadCreditHistoryException, если у клиента плохая кредитная история.
Или ProblemWithLawException, если у клиента есть проблемы с законом.
Ваша задача:
Реализовать метод getCreditForClient, который принимает работника банка и клиента,
который хочет получить кредит. Метод должен возвращать true - если кредит выдать
можно и все условия соблюдены и false если есть какие-то проблемы.
Если клиенту отказали в выдаче кредита по причине плохой банковской истории - метод должен
выводить в консоль сообщение "Проблемы с банковской историей", если клиенту отказали по
причине проблем с законом то ничего выводить на экран не нужно.

 */

public class Bank {
    public static void main(String[] args) {
        BankWorker worker = new WorkerBank();
        BankClient client = new BankClient(false, false);
        boolean allowed = getCreditForClient(worker, client);
        if (allowed){
            System.out.println("кредит одобрен");
        }else {
            System.out.println("кредит не одобрен");
        }
    }

    public static boolean getCreditForClient(BankWorker worker, BankClient client){
        try {
            worker.checkClientForCredit(client);
        }catch (BadCreditHistoryException e){
            System.out.println(e.getMessage());
            return false;
        }catch (ProblemWithLawException e){
            return false;
        }
        return true;
    }
}
